// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            ValueGoal

public class BodyFatGoal extends ValueGoal
{

    public BodyFatGoal()
    {
    }

    public TimeSeriesObject.TimeSeriesResourceType a()
    {
        return TimeSeriesObject.TimeSeriesResourceType.BODY_FAT;
    }

    public Goal.GoalType b()
    {
        return Goal.GoalType.BODY_FAT_GOAL;
    }
}
