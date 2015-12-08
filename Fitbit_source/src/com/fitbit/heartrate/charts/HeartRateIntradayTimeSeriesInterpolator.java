// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.e.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HeartRateIntradayTimeSeriesInterpolator
{
    private static final class PointState extends Enum
    {

        public static final PointState a;
        public static final PointState b;
        public static final PointState c;
        private static final PointState d[];

        public static PointState valueOf(String s)
        {
            return (PointState)Enum.valueOf(com/fitbit/heartrate/charts/HeartRateIntradayTimeSeriesInterpolator$PointState, s);
        }

        public static PointState[] values()
        {
            return (PointState[])d.clone();
        }

        static 
        {
            a = new PointState("COMMON", 0);
            b = new PointState("BREAK", 1);
            c = new PointState("LONE", 2);
            d = (new PointState[] {
                a, b, c
            });
        }

        private PointState(String s, int i)
        {
            super(s, i);
        }
    }

    private static class a
        implements Comparator
    {

        public int a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
        {
            return timeseriesobject.a().compareTo(timeseriesobject1.a());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TimeSeriesObject)obj, (TimeSeriesObject)obj1);
        }

        private a()
        {
        }

    }


    private static final String a = "HeartRateIntradayTimeSeriesInterpolator";
    private static final long b = 0x927c0L;

    public HeartRateIntradayTimeSeriesInterpolator()
    {
    }

    private static long a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
    {
        return Math.abs(timeseriesobject.a().getTime() - timeseriesobject1.a().getTime());
    }

    public static final void a(List list, l l1)
    {
        int i;
        com.fitbit.e.a.a("HeartRateIntradayTimeSeriesInterpolator", "populateChartPointCollection", new Object[0]);
        Collections.sort(list, new a());
        i = 0;
_L9:
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        double d;
        TimeSeriesObject timeseriesobject2;
        timeseriesobject2 = (TimeSeriesObject)list.get(i);
        d = timeseriesobject2.b();
        PointState pointstate1 = com.fitbit.heartrate.charts.PointState.a;
        int k = i - 1;
        int i1 = i + 1;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[PointState.values().length];
                try
                {
                    a[com.fitbit.heartrate.charts.PointState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PointState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PointState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        PointState pointstate;
        TimeSeriesObject timeseriesobject;
        TimeSeriesObject timeseriesobject1;
        if (k < 0)
        {
            timeseriesobject = null;
        } else
        {
            timeseriesobject = (TimeSeriesObject)list.get(k);
        }
        if (i1 < list.size())
        {
            timeseriesobject1 = (TimeSeriesObject)list.get(i1);
        } else
        {
            timeseriesobject1 = null;
        }
        if (timeseriesobject == null && timeseriesobject1 == null)
        {
            pointstate1 = PointState.c;
        }
        pointstate = pointstate1;
        if (timeseriesobject == null)
        {
            pointstate = pointstate1;
            if (timeseriesobject1 != null)
            {
                pointstate = pointstate1;
                if (a(timeseriesobject2, timeseriesobject1) > 0x927c0L)
                {
                    pointstate = PointState.c;
                }
            }
        }
        pointstate1 = pointstate;
        if (timeseriesobject != null)
        {
            pointstate1 = pointstate;
            if (timeseriesobject1 == null)
            {
                pointstate1 = pointstate;
                if (a(timeseriesobject, timeseriesobject2) > 0x927c0L)
                {
                    pointstate1 = PointState.c;
                }
            }
        }
        pointstate = pointstate1;
        if (timeseriesobject != null)
        {
            pointstate = pointstate1;
            if (timeseriesobject1 != null)
            {
                pointstate = pointstate1;
                if (a(timeseriesobject2, timeseriesobject1) > 0x927c0L)
                {
                    pointstate = PointState.b;
                    if (a(timeseriesobject, timeseriesobject2) > 0x927c0L)
                    {
                        pointstate = PointState.c;
                    }
                }
            }
        }
        com.fitbit.heartrate.charts._cls1.a[pointstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 296
    //                   1 326
    //                   2 355
    //                   3 346;
           goto _L3 _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        throw new IllegalArgumentException();
_L4:
        l1.a(timeseriesobject2.a().getTime(), new double[] {
            d
        });
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        l1.a(timeseriesobject2.a().getTime(), new double[] {
            d
        }).a(ChartLineType.j, Boolean.valueOf(true));
        if (true) goto _L7; else goto _L2
_L2:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
