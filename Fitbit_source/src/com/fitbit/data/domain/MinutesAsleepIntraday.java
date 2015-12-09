// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            MinutesAsleep

public class MinutesAsleepIntraday extends MinutesAsleep
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static final long serialVersionUID = 0x7ce206c7e6f51bc3L;

    public MinutesAsleepIntraday()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP_INTRADAY;
    }
}
