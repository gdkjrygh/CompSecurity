// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.config.ecs.EcsKey;
import com.skype.android.config.ecs.EcsKeyLocation;

// Referenced classes of package com.skype.android.analytics:
//            EcsControllableEvent

public final class KpiEvent extends Enum
    implements EcsControllableEvent
{

    public static final KpiEvent a;
    public static final KpiEvent b;
    public static final KpiEvent c;
    public static final KpiEvent d;
    private static final KpiEvent f[];
    private EcsKey e;

    private KpiEvent(String s, int i)
    {
        this(s, i, EcsKeyLocation.SKYPE_ANDROID_TELEMETRY);
    }

    private KpiEvent(String s, int i, EcsKeyLocation ecskeylocation)
    {
        super(s, i);
        e = new EcsKey(name(), name(), ecskeylocation, Integer.valueOf(1), false);
    }

    public static KpiEvent valueOf(String s)
    {
        return (KpiEvent)Enum.valueOf(com/skype/android/analytics/KpiEvent, s);
    }

    public static KpiEvent[] values()
    {
        return (KpiEvent[])f.clone();
    }

    public final EcsKey getEcsKey()
    {
        return e;
    }

    static 
    {
        a = new KpiEvent("kpi_inapp_activity_ended", 0);
        b = new KpiEvent("kpi_message_sent", 1);
        c = new KpiEvent("kpi_message_viewed", 2);
        d = new KpiEvent("kpi_notification_status", 3);
        f = (new KpiEvent[] {
            a, b, c, d
        });
    }
}
