// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.adjust;

import android.content.Context;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.soundcloud.android.events.AttributionEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.rx.eventbus.EventBus;

public class AdjustWrapper
{

    private final ApplicationProperties applicationProperties;
    private final EventBus eventBus;

    public AdjustWrapper(EventBus eventbus, ApplicationProperties applicationproperties)
    {
        eventBus = eventbus;
        applicationProperties = applicationproperties;
    }

    private AdjustConfig buildAdjustConfig(Context context)
    {
        context = new AdjustConfig(context, context.getString(0x7f07023a), context.getString(0x7f07023b));
        setEventBuffering(context);
        setLogLevel(context);
        setAttributionListener(context);
        return context;
    }

    private void publishAttribution(AdjustAttribution adjustattribution)
    {
        eventBus.publish(EventQueue.TRACKING, new AttributionEvent(adjustattribution.network, adjustattribution.campaign, adjustattribution.adgroup, adjustattribution.creative));
    }

    private void setAttributionListener(AdjustConfig adjustconfig)
    {
        adjustconfig.setOnAttributionChangedListener(new _cls1());
    }

    private void setEventBuffering(AdjustConfig adjustconfig)
    {
        adjustconfig.setEventBufferingEnabled(Boolean.valueOf(true));
    }

    private void setLogLevel(AdjustConfig adjustconfig)
    {
        LogLevel loglevel;
        if (applicationProperties.isDebugBuild())
        {
            loglevel = LogLevel.INFO;
        } else
        {
            loglevel = LogLevel.ERROR;
        }
        adjustconfig.setLogLevel(loglevel);
    }

    public void onCreate(Context context)
    {
        Adjust.onCreate(buildAdjustConfig(context));
    }

    void onPause()
    {
        Adjust.onPause();
    }

    void onResume()
    {
        Adjust.onResume();
    }


    private class _cls1
        implements OnAttributionChangedListener
    {

        final AdjustWrapper this$0;

        public void onAttributionChanged(AdjustAttribution adjustattribution)
        {
            publishAttribution(adjustattribution);
        }

        _cls1()
        {
            this$0 = AdjustWrapper.this;
            super();
        }
    }

}
