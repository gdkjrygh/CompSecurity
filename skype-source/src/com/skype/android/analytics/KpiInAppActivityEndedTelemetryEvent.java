// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.analytics:
//            SkypeTelemetryEvent, KpiEvent, KpiAttributeName

public class KpiInAppActivityEndedTelemetryEvent extends SkypeTelemetryEvent
{

    public KpiInAppActivityEndedTelemetryEvent(AnalyticsInAppObserver.AppLifecycleTrigger applifecycletrigger, long l, long l1)
    {
        super(KpiEvent.a);
        put(KpiAttributeName.f, Long.valueOf(l1));
        put(KpiAttributeName.d, "Signed-in");
        put(KpiAttributeName.g, TimeUtil.d(l));
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[AnalyticsInAppObserver.AppLifecycleTrigger.values().length];
                try
                {
                    a[AnalyticsInAppObserver.AppLifecycleTrigger.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AnalyticsInAppObserver.AppLifecycleTrigger.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[applifecycletrigger.ordinal()])
        {
        default:
            put(KpiAttributeName.e, "Backgrounded");
            return;

        case 1: // '\001'
            put(KpiAttributeName.e, "Signed-Out");
            return;

        case 2: // '\002'
            put(KpiAttributeName.e, "Crashed");
            break;
        }
    }
}
