// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.IPaymentErrorHandler;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            PaymentDialogView

class this._cls0 extends AsyncCall
{

    final PaymentDialogView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        paymentErrorHandler.handleCardError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        Keyboard.hideKeyboard(creditCardInput);
        dialogFlow.dismiss();
        messageBus.post(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
        progressController.hideProgress();
    }

    questRideEvent()
    {
        this$0 = PaymentDialogView.this;
        super();
    }
}
