// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.analytics.ActionAnalytics;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.analytics
    implements Func1
{

    final PaymentService this$0;
    final ActionAnalytics val$analytics;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        val$analytics.trackFailure(throwable);
        return PaymentService.access$000(PaymentService.this, throwable);
    }

    ()
    {
        this$0 = final_paymentservice;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
