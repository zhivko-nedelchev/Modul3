public class Lottery {
    public static void main(String[] args) {
        checkText("lottery");
    }

    public static void checkText(String text) {
        if (text.equals("lottery")) {
            System.out.println("You win the big prize");
        } else {
            System.out.println("Try again");
        }
    }
}
