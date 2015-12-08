// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.analytics.ActionAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            PassengerRideService

class val.analytics
    implements Action1
{

    final PassengerRideService this$0;
    final ActionAnalytics val$analytics;

    public volatile void call(Object obj)
    {
        call((Throwable)obj);
    }

    public void call(Throwable throwable)
    {
        val$analytics.trackFailure(throwable);
    }

    ()
    {
        this$0 = final_passengerrideservice;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
