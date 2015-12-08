// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import java.util.Date;

// Referenced classes of package com.fitbit.activity.ui:
//            StepsIntradayActivityChartFragment_, IntradayActivityChartFragment, CaloriesIntradayActivityChartFragment_, DistanceIntradayActivityChartFragment_, 
//            MinutesVeryActiveIntradayActivityChartFragment_, FloorsIntradayActivityChartFragment_

public class h
{

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a;
    private Date b;

    public h()
    {
    }

    public IntradayActivityChartFragment a()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 74
    //                   2 112
    //                   3 123
    //                   4 134
    //                   5 145;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_145;
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown resource type ").append(a).toString());
_L2:
        Object obj = new StepsIntradayActivityChartFragment_();
_L7:
        ((IntradayActivityChartFragment) (obj)).a(a);
        Date date;
        if (b == null)
        {
            date = new Date();
        } else
        {
            date = b;
        }
        ((IntradayActivityChartFragment) (obj)).a(date);
        return ((IntradayActivityChartFragment) (obj));
_L3:
        obj = new CaloriesIntradayActivityChartFragment_();
          goto _L7
_L4:
        obj = new DistanceIntradayActivityChartFragment_();
          goto _L7
_L5:
        obj = new MinutesVeryActiveIntradayActivityChartFragment_();
          goto _L7
        obj = new FloorsIntradayActivityChartFragment_();
          goto _L7
    }

    public h a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        a = timeseriesresourcetype;
        return this;
    }

    public h a(Date date)
    {
        b = date;
        return this;
    }
}
