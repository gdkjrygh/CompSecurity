// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;

import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.Manager;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.analytics:
//            AnalyticsEvent, AnalyticsProcessor

public class AnalyticsService extends Manager
{

    ApplicationEventBus eventBus;

    public AnalyticsService()
    {
    }

    public String getName()
    {
        return "analytics_manager";
    }

    protected void initialize()
    {
        eventBus.register(this);
    }

    protected void onSessionSet()
    {
    }

    public void publishEvent(AnalyticsConstants.EVENT_TYPE event_type, Map map)
    {
        eventBus.post(new AnalyticsEvent(event_type, map));
    }

    public void register(final AnalyticsProcessor analyticsImpl)
    {
        eventBus.register(new _cls1());
    }

    private class _cls1
    {

        final AnalyticsService this$0;
        final AnalyticsProcessor val$analyticsImpl;

        public void eventBusHack(AnalyticsEvent analyticsevent)
        {
            analyticsImpl.processEvent(analyticsevent);
        }

        _cls1()
        {
            this$0 = AnalyticsService.this;
            analyticsImpl = analyticsprocessor;
            super();
        }
    }

}
