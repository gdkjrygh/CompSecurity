// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics;

import com.dominos.android.sdk.core.analytics.AnalyticsEvent;
import java.util.Map;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.analytics:
//            TealiumHelper_

class val.tealiumEvent extends c
{

    final TealiumHelper_ this$0;
    final Map val$dataMap;
    final AnalyticsEvent val$event;
    final String val$tealiumEvent;

    public void execute()
    {
        try
        {
            TealiumHelper_.access$201(TealiumHelper_.this, val$event, val$dataMap, val$tealiumEvent);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    AnalyticsEvent(AnalyticsEvent analyticsevent, Map map, String s2)
    {
        this$0 = final_tealiumhelper_;
        val$event = analyticsevent;
        val$dataMap = map;
        val$tealiumEvent = s2;
        super(final_s, final_i, String.this);
    }
}
