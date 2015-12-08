// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            ValueGoal

public class CaloriesEatenGoal extends ValueGoal
{

    public CaloriesEatenGoal()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType a()
    {
        return TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN;
    }

    public Goal.GoalType b()
    {
        return Goal.GoalType.CALORIES_CONSUMED_GOAL;
    }

    public Double e()
    {
        return c();
    }

    public Double f()
    {
        return p();
    }

    public Double g()
    {
        return Double.valueOf(f().doubleValue() - 50D);
    }

    public Double h()
    {
        return Double.valueOf(f().doubleValue() + 50D);
    }
}
