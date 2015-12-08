// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.chargeAccountId
    implements Func1
{

    final PaymentService this$0;
    final String val$chargeAccountId;

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    public Observable call(String s)
    {
        s = PaymentService.access$200(PaymentService.this).payDebtWithPayPal(PaymentService.access$100(PaymentService.this).getUser().getId(), val$chargeAccountId, s);
        return PaymentService.access$300(PaymentService.this, s, val$chargeAccountId, "debt_paypal_failed");
    }

    ()
    {
        this$0 = final_paymentservice;
        val$chargeAccountId = String.this;
        super();
    }
}
