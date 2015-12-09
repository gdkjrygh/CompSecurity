// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            ValueGoal

public class WaterGoal extends ValueGoal
{

    public WaterGoal()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType a()
    {
        return TimeSeriesObject.TimeSeriesResourceType.WATER;
    }

    public Goal.GoalType b()
    {
        return Goal.GoalType.WATER_GOAL;
    }
}
