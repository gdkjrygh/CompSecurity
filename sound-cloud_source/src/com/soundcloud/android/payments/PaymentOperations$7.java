// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.payments.googleplay.BillingService;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentOperations

class val.id
    implements b
{

    final PaymentOperations this$0;
    final String val$id;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        PaymentOperations.access$200(PaymentOperations.this).startPurchase(val$id, s);
    }

    rvice()
    {
        this$0 = final_paymentoperations;
        val$id = String.this;
        super();
    }
}
