// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView, IPaymentErrorHandler

class <init> extends AsyncCall
{

    final BaseCreditCardView this$0;

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
        appFlow.goBack();
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    private ()
    {
        this$0 = BaseCreditCardView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
