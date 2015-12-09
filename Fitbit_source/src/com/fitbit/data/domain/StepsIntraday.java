// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Steps

public class StepsIntraday extends Steps
{

    private static final long serialVersionUID = 0xab1490feaf5a0a3cL;

    public StepsIntraday()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;
    }
}
