// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.analytics.AsyncActionAnalytics;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.paypalAnalytics
    implements Func1
{

    final PaymentService this$0;
    final AsyncActionAnalytics val$paypalAnalytics;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        val$paypalAnalytics.trackResponseFailure(throwable);
        return PaymentService.access$000(PaymentService.this, throwable);
    }

    ()
    {
        this$0 = final_paymentservice;
        val$paypalAnalytics = AsyncActionAnalytics.this;
        super();
    }
}
