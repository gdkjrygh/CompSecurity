// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.payment.PaymentService;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentListItemView, IPaymentErrorHandler

public class AddPayPalPaymentItemView extends PaymentListItemView
{

    private Binder binder;
    MessageBus messageBus;
    IPaymentErrorHandler paymentErrorHandler;
    PaymentService paymentService;
    IProgressController progressController;

    public AddPayPalPaymentItemView(Context context)
    {
        super(context);
        Scoop.a(this).b(this);
    }

    protected int getIcon()
    {
        return 0x7f02007a;
    }

    protected int getMode()
    {
        return 0;
    }

    protected String getSubTitle()
    {
        return "";
    }

    protected String getTitle()
    {
        return getResources().getString(0x7f070247);
    }

    protected boolean isFailed()
    {
        return false;
    }

    protected boolean isSelectedPayment()
    {
        return false;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        binder.detach();
    }

    public boolean performClick()
    {
        progressController.showProgress();
        binder.bind(paymentService.savePayPal(), new AsyncCall() {

            final AddPayPalPaymentItemView this$0;

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
                messageBus.post(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent, null);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddPayPalPaymentItemView.this;
                super();
            }
        });
        return true;
    }
}
