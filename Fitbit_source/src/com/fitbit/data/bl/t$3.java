// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.device.TrackerGoalType;

// Referenced classes of package com.fitbit.data.bl:
//            t

static class ror
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[TrackerGoalType.values().length];
        try
        {
            b[TrackerGoalType.ACTIVE_MINUTES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            b[TrackerGoalType.CALORIES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            b[TrackerGoalType.DISTANCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            b[TrackerGoalType.FLOORS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            b[TrackerGoalType.STEPS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        a = new int[com.fitbit.data.domain..GoalType.values().length];
        try
        {
            a[com.fitbit.data.domain..GoalType.CALORIES_BURNED_GOAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.CALORIES_CONSUMED_GOAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.DISTANCE_GOAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.SLEEP_GOAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.FLOORS_GOAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.MINUTES_VERY_ACTIVE_GOAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.STEPS_GOAL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.WATER_GOAL.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.BODY_FAT_GOAL.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain..GoalType.WEIGHT_GOAL.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
