// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddChargeAccountView, IPaymentErrorHandler

class this._cls0 extends AsyncCall
{

    final AddChargeAccountView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        paymentErrorHandler.handlePayPalError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        AddChargeAccountView.access$300(AddChargeAccountView.this).onNext(null);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = AddChargeAccountView.this;
        super();
    }
}
