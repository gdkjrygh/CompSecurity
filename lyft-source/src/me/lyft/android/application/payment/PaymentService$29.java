// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.concurAnalytics
    implements Action1
{

    final PaymentService this$0;
    final AsyncActionAnalytics val$concurAnalytics;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        val$concurAnalytics.trackResponseSuccess();
    }

    ()
    {
        this$0 = final_paymentservice;
        val$concurAnalytics = AsyncActionAnalytics.this;
        super();
    }
}
