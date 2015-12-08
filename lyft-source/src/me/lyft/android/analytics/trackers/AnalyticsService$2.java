// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import me.lyft.android.common.Unit;
import rx.Subscription;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsService

class this._cls0
    implements Action1
{

    final AnalyticsService this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        AnalyticsService.access$200(AnalyticsService.this);
        AnalyticsService.access$300(AnalyticsService.this).unsubscribe();
    }

    ()
    {
        this$0 = AnalyticsService.this;
        super();
    }
}
