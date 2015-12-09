// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.charts;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;

public final class SleepParam extends Enum
{

    public static final SleepParam a;
    public static final SleepParam b;
    public static final SleepParam c;
    private static final SleepParam d[];
    private final boolean isPlurals;
    private final int landingScreenTitleResId;
    private final int summaryTitleFormat;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeSeriesResourceType;

    private SleepParam(String s, int i, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, int j, int k, boolean flag)
    {
        super(s, i);
        timeSeriesResourceType = timeseriesresourcetype;
        landingScreenTitleResId = j;
        summaryTitleFormat = k;
        isPlurals = flag;
    }

    public static SleepParam valueOf(String s)
    {
        return (SleepParam)Enum.valueOf(com/fitbit/sleep/ui/charts/SleepParam, s);
    }

    public static SleepParam[] values()
    {
        return (SleepParam[])d.clone();
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a()
    {
        return timeSeriesResourceType;
    }

    public String a(int i)
    {
        if (isPlurals)
        {
            return FitBitApplication.a().getResources().getQuantityString(summaryTitleFormat, i);
        } else
        {
            return FitBitApplication.a().getString(summaryTitleFormat);
        }
    }

    public int b()
    {
        return landingScreenTitleResId;
    }

    static 
    {
        a = new SleepParam("HOURS_ASLEEP", 0, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP, 0x7f0804d3, 0x7f0804c2, false);
        b = new SleepParam("TIMES_AWAKENED", 1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT, 0x7f08052a, 0x7f0b0015, true);
        c = new SleepParam("TIMES_RESTLESS", 2, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.UKNOWN, 0, 0x7f0b0016, true);
        d = (new SleepParam[] {
            a, b, c
        });
    }
}
