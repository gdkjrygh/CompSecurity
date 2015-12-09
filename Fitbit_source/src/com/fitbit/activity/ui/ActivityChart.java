// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.p;

public class ActivityChart extends Enum
    implements com.fitbit.ui.MeasurementsWithChartsFragment.a
{

    public static final ActivityChart a;
    public static final ActivityChart b;
    public static final ActivityChart c;
    public static final ActivityChart d;
    public static final ActivityChart e;
    private static final ActivityChart f[];
    final int titleResId;

    private ActivityChart(String s, int i, int j)
    {
        super(s, i);
        titleResId = j;
    }


    public static ActivityChart valueOf(String s)
    {
        return (ActivityChart)Enum.valueOf(com/fitbit/activity/ui/ActivityChart, s);
    }

    public static ActivityChart[] values()
    {
        return (ActivityChart[])f.clone();
    }

    public boolean a()
    {
        return true;
    }

    public int b()
    {
        return ordinal();
    }

    static 
    {
        a = new ActivityChart("CHART_STEPS", 0, 0x7f080355);
        b = new ActivityChart("CHART_CALORIES", 1, 0x7f0802be);
        c = new ActivityChart("CHART_DISTANCE", 2, 0x7f0802e0);
        d = new ActivityChart("CHART_ACTIVE_MINUTES", 3, 0x7f0802a3) {

            public boolean a()
            {
                return p.a(DeviceFeature.ACTIVE_MINUTES);
            }

        };
        e = new ActivityChart("CHART_FLOORS", 4, 0x7f0802f3) {

            public boolean a()
            {
                return p.a(DeviceFeature.FLOORS);
            }

        };
        f = (new ActivityChart[] {
            a, b, c, d, e
        });
    }
}
