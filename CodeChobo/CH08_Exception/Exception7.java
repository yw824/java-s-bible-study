package CodeChobo.CH08_Exception;

class Exception7 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try {

            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);

        } catch ( ArithmeticException ae ) { // Arithmetic 예외를 처리

            if( ae instanceof ArithmeticException )
                System.out.println("true");
            System.out.println("ArithmeticException");

        } catch ( Exception e ) { // Arithmetic 예외가 아닌 다른 모든 예외를 처리

            System.out.println("Exception") ; 

        } // try-catch의 끝

        System.out.println(6);
    }
}