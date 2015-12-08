// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.TrackingEvent;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsEngine, AnalyticsProvider

private final class <init> extends <init>
{

    final AnalyticsEngine this$0;

    protected final void handleEvent(AnalyticsProvider analyticsprovider, TrackingEvent trackingevent)
    {
        analyticsprovider.handleTrackingEvent(trackingevent);
    }

    protected final volatile void handleEvent(AnalyticsProvider analyticsprovider, Object obj)
    {
        handleEvent(analyticsprovider, (TrackingEvent)obj);
    }

    private ()
    {
        this$0 = AnalyticsEngine.this;
        super(AnalyticsEngine.this, null);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
