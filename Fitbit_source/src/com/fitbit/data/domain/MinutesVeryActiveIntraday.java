// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            MinutesVeryActive

public class MinutesVeryActiveIntraday extends MinutesVeryActive
{

    private static final long serialVersionUID = 0xb72c0b47748c0d4bL;

    public MinutesVeryActiveIntraday()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY;
    }
}
