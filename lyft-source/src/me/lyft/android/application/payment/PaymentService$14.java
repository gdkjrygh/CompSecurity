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

class val.labelType
    implements Func1
{

    final PaymentService this$0;
    final String val$chargeAccountId;
    final String val$label;
    final String val$labelType;

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }

    public Observable call(String s)
    {
        return PaymentService.access$200(PaymentService.this).updateCreditCardChargeAccount(PaymentService.access$100(PaymentService.this).getUser().getId(), val$chargeAccountId, s, val$label, val$labelType);
    }

    ()
    {
        this$0 = final_paymentservice;
        val$chargeAccountId = s;
        val$label = s1;
        val$labelType = String.this;
        super();
    }
}
