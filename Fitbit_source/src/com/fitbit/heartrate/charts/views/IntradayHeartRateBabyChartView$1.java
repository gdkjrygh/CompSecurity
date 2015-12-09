// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts.views;

import com.fitbit.data.domain.TimeSeriesObject;
import java.util.Comparator;

// Referenced classes of package com.fitbit.heartrate.charts.views:
//            IntradayHeartRateBabyChartView

class a
    implements Comparator
{

    final IntradayHeartRateBabyChartView a;

    public int a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
    {
        if (timeseriesobject.b() < timeseriesobject1.b())
        {
            return -1;
        }
        return timeseriesobject.b() <= timeseriesobject1.b() ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((TimeSeriesObject)obj, (TimeSeriesObject)obj1);
    }

    (IntradayHeartRateBabyChartView intradayheartratebabychartview)
    {
        a = intradayheartratebabychartview;
        super();
    }
}
