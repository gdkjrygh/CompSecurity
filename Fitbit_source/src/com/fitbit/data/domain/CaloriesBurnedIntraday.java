// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            CaloriesBurned

public class CaloriesBurnedIntraday extends CaloriesBurned
{

    private static final long serialVersionUID = 0x4accc66f893afe00L;

    public CaloriesBurnedIntraday()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY;
    }
}
