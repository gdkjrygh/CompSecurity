// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics;

import android.content.Context;
import com.dominos.App_;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.core.analytics.AnalyticsEvent;
import java.util.Map;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.analytics:
//            TealiumHelper

public final class TealiumHelper_ extends TealiumHelper
{

    private static TealiumHelper_ instance_;
    private Context context_;

    private TealiumHelper_(Context context)
    {
        context_ = context;
    }

    public static TealiumHelper_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new TealiumHelper_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mApp = App_.getInstance();
        mMobileSession = MobileSession_.getInstance_(context_);
        initialize();
    }

    public final void onPause(com.dominos.bus.events.ActivityLifecycleEvents.PauseEvent pauseevent)
    {
        onPause(pauseevent);
    }

    public final void onResume(com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
    {
        onResume(resumeevent);
    }

    public final void retryAdIdAndSendEvent(AnalyticsEvent analyticsevent, Map map, String s)
    {
        a.a(new _cls1(analyticsevent, map, s));
    }




    private class _cls1 extends org.androidannotations.api.c
    {

        final TealiumHelper_ this$0;
        final Map val$dataMap;
        final AnalyticsEvent val$event;
        final String val$tealiumEvent;

        public void execute()
        {
            try
            {
                retryAdIdAndSendEvent(event, dataMap, tealiumEvent);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(AnalyticsEvent analyticsevent, Map map, String s2)
        {
            this$0 = TealiumHelper_.this;
            event = analyticsevent;
            dataMap = map;
            tealiumEvent = s2;
            super(final_s, final_i, final_s1);
        }
    }

}
