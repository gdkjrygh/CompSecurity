// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.couponAnalytics
    implements Action1
{

    final PaymentService this$0;
    final AsyncActionAnalytics val$couponAnalytics;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        val$couponAnalytics.trackResponseSuccess();
    }

    ()
    {
        this$0 = final_paymentservice;
        val$couponAnalytics = AsyncActionAnalytics.this;
        super();
    }
}
