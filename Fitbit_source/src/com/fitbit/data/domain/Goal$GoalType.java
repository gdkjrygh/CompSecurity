// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, Goal

public static final class publicApiKey extends Enum
    implements a
{

    private static final SLEEP_GOAL $VALUES[];
    public static final SLEEP_GOAL BODY_FAT_GOAL;
    public static final SLEEP_GOAL CALORIES_BURNED_GOAL;
    public static final SLEEP_GOAL CALORIES_CONSUMED_GOAL;
    public static final SLEEP_GOAL DISTANCE_GOAL;
    public static final SLEEP_GOAL FLOORS_GOAL;
    public static final SLEEP_GOAL MINUTES_VERY_ACTIVE_GOAL;
    public static final SLEEP_GOAL SLEEP_GOAL;
    public static final SLEEP_GOAL STEPS_GOAL;
    public static final SLEEP_GOAL WATER_GOAL;
    public static final SLEEP_GOAL WEIGHT_GOAL;
    private final int code;
    private final String publicApiKey;

    public static publicApiKey valueOf(String s)
    {
        return (publicApiKey)Enum.valueOf(com/fitbit/data/domain/Goal$GoalType, s);
    }

    public static publicApiKey[] values()
    {
        return (publicApiKey[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    public String getPublicApiKey()
    {
        return publicApiKey;
    }

    static 
    {
        WEIGHT_GOAL = new <init>("WEIGHT_GOAL", 0, 0, null);
        CALORIES_BURNED_GOAL = new <init>("CALORIES_BURNED_GOAL", 1, 10, "caloriesOut");
        CALORIES_CONSUMED_GOAL = new <init>("CALORIES_CONSUMED_GOAL", 2, 20, null);
        STEPS_GOAL = new <init>("STEPS_GOAL", 3, 30, "steps");
        DISTANCE_GOAL = new <init>("DISTANCE_GOAL", 4, 40, "distance");
        FLOORS_GOAL = new <init>("FLOORS_GOAL", 5, 180, "floors");
        MINUTES_VERY_ACTIVE_GOAL = new <init>("MINUTES_VERY_ACTIVE_GOAL", 6, 190, "activeMinutes");
        WATER_GOAL = new <init>("WATER_GOAL", 7, 200, null);
        BODY_FAT_GOAL = new <init>("BODY_FAT_GOAL", 8, 210, "fat");
        SLEEP_GOAL = new <init>("SLEEP_GOAL", 9, 220, "sleep");
        $VALUES = (new .VALUES[] {
            WEIGHT_GOAL, CALORIES_BURNED_GOAL, CALORIES_CONSUMED_GOAL, STEPS_GOAL, DISTANCE_GOAL, FLOORS_GOAL, MINUTES_VERY_ACTIVE_GOAL, WATER_GOAL, BODY_FAT_GOAL, SLEEP_GOAL
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        code = j;
        publicApiKey = s1;
    }
}
