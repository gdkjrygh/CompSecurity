// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.ui.charts.Timeframe;

// Referenced classes of package com.fitbit.util:
//            a

static class dError
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[Timeframe.values().length];
        try
        {
            b[Timeframe.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[Timeframe.d.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        a = new int[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.values().length];
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.SeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
