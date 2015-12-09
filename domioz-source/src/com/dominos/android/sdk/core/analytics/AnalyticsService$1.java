// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


// Referenced classes of package com.dominos.android.sdk.core.analytics:
//            AnalyticsProcessor, AnalyticsService, AnalyticsEvent

class val.analyticsImpl
{

    final AnalyticsService this$0;
    final AnalyticsProcessor val$analyticsImpl;

    public void eventBusHack(AnalyticsEvent analyticsevent)
    {
        val$analyticsImpl.processEvent(analyticsevent);
    }

    ()
    {
        this$0 = final_analyticsservice;
        val$analyticsImpl = AnalyticsProcessor.this;
        super();
    }
}
