// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView, IPaymentErrorHandler

class this._cls0 extends AsyncCall
{

    final AddCouponView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        applyCouponButton.setEnabled(false);
        Keyboard.hideKeyboard(couponEditText);
        paymentErrorHandler.handleCouponError(throwable, couponEditText);
        inlineCouponError.setVisibility(0);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        AddCouponView.access$000(AddCouponView.this);
        dialogFlow.show(new Toast(getContext().getString(0x7f07024e)));
        messageBus.post(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent, null);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
        progressController.hideProgress();
    }

    adCardListEvent()
    {
        this$0 = AddCouponView.this;
        super();
    }
}
