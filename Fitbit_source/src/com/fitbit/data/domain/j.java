// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.weight.Weight;
import java.io.Serializable;

// Referenced classes of package com.fitbit.data.domain:
//            WeightGoal, CaloriesBurnedGoal, CaloriesEatenGoal, DistanceGoal, 
//            FloorsGoal, StepsGoal, VeryActiveMinutesGoal, WaterGoal, 
//            BodyFatGoal, SleepGoal, Goal

public class j
{

    public j()
    {
    }

    public static double a(Goal.GoalType goaltype, Object obj)
    {
        if (obj == null)
        {
            return 0.0D;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Goal.GoalType.values().length];
                try
                {
                    a[Goal.GoalType.WEIGHT_GOAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Goal.GoalType.CALORIES_BURNED_GOAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Goal.GoalType.CALORIES_CONSUMED_GOAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Goal.GoalType.DISTANCE_GOAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Goal.GoalType.FLOORS_GOAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Goal.GoalType.STEPS_GOAL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Goal.GoalType.MINUTES_VERY_ACTIVE_GOAL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Goal.GoalType.WATER_GOAL.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Goal.GoalType.BODY_FAT_GOAL.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Goal.GoalType.SLEEP_GOAL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[goaltype.ordinal()])
        {
        default:
            return -1D;

        case 1: // '\001'
            return ((Weight)obj).b();

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return ((Double)obj).doubleValue();
        }
    }

    public static Goal a(Goal.GoalType goaltype)
    {
        switch (_cls1.a[goaltype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new WeightGoal();

        case 2: // '\002'
            return new CaloriesBurnedGoal();

        case 3: // '\003'
            return new CaloriesEatenGoal();

        case 4: // '\004'
            return new DistanceGoal();

        case 5: // '\005'
            return new FloorsGoal();

        case 6: // '\006'
            return new StepsGoal();

        case 7: // '\007'
            return new VeryActiveMinutesGoal();

        case 8: // '\b'
            return new WaterGoal();

        case 9: // '\t'
            return new BodyFatGoal();

        case 10: // '\n'
            return new SleepGoal();
        }
    }

    public static Serializable a(Goal.GoalType goaltype, String s, double d)
    {
        _cls1.a[goaltype.ordinal()];
        JVM INSTR tableswitch 1 10: default 64
    //                   1 66
    //                   2 83
    //                   3 83
    //                   4 83
    //                   5 83
    //                   6 83
    //                   7 83
    //                   8 83
    //                   9 83
    //                   10 83;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
        return null;
_L2:
        if (s != null)
        {
            return new Weight(d, WeightLogEntry.WeightUnits.valueOf(s));
        }
          goto _L1
_L3:
        return Double.valueOf(d);
    }

    public static String b(Goal.GoalType goaltype, Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        switch (_cls1.a[goaltype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return ((WeightLogEntry.WeightUnits)((Weight)obj).a()).name();
        }
    }
}
