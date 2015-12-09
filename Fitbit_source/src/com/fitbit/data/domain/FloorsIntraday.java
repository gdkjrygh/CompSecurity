// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Floors

public class FloorsIntraday extends Floors
{

    private static final long serialVersionUID = 0x1b68a83ff591d31dL;

    public FloorsIntraday()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType d()
    {
        return TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY;
    }
}
