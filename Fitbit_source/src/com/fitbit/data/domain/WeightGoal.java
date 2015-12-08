// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.data.domain:
//            MeasurableGoal, Measurable

public class WeightGoal extends MeasurableGoal
{

    public WeightGoal()
    {
    }

    public Measurable a(double d)
    {
        return b(d);
    }

    public Goal.GoalType b()
    {
        return Goal.GoalType.WEIGHT_GOAL;
    }

    public Weight b(double d)
    {
        return new Weight(d, WeightLogEntry.WeightUnits.GRAMS);
    }
}
