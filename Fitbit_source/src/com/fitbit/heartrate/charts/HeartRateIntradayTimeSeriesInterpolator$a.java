// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import com.fitbit.data.domain.TimeSeriesObject;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.fitbit.heartrate.charts:
//            HeartRateIntradayTimeSeriesInterpolator

private static class <init>
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

    private ()
    {
    }

    ( )
    {
        this();
    }
}
