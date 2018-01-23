package razerdp.basepopup;

/**
 * Created by 大灯泡 on 2017/12/28.
 */
abstract class InnerPopupWindowStateListener {
    abstract void onDismissWithAnimaStart();

    abstract void onDismissWithAnima();

    public void onTryToShow(boolean hasAnima) {
    }

    public void onShowPopupWithAnimaStart(){

    }

}
