// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, TimeSeriesObject

public static final class intraday extends Enum
    implements a
{

    private static final WATER_INTRADAY $VALUES[];
    public static final WATER_INTRADAY AWAKENINGS_COUNT;
    public static final WATER_INTRADAY BODY_FAT;
    public static final WATER_INTRADAY BODY_WEIGHT;
    public static final WATER_INTRADAY CALORIES;
    public static final WATER_INTRADAY CALORIES_IN;
    public static final WATER_INTRADAY CALORIES_INTRADAY;
    public static final WATER_INTRADAY DISTANCE;
    public static final WATER_INTRADAY DISTANCE_INTRADAY;
    public static final WATER_INTRADAY FLOORS;
    public static final WATER_INTRADAY FLOORS_INTRADAY;
    public static final WATER_INTRADAY HEART_RATE_INTRADAY;
    public static final WATER_INTRADAY MINUTES_ASLEEP;
    public static final WATER_INTRADAY MINUTES_ASLEEP_INTRADAY;
    public static final WATER_INTRADAY MINUTES_FAIRLY_ACTIVE;
    public static final WATER_INTRADAY MINUTES_FAIRLY_ACTIVE_INTRADAY;
    public static final WATER_INTRADAY MINUTES_VERY_ACTIVE;
    public static final WATER_INTRADAY MINUTES_VERY_ACTIVE_INTRADAY;
    public static final WATER_INTRADAY RESTING_HEART_RATE;
    public static final WATER_INTRADAY STEPS;
    public static final WATER_INTRADAY STEPS_INTRADAY;
    public static final WATER_INTRADAY UKNOWN;
    public static final WATER_INTRADAY WATER;
    public static final WATER_INTRADAY WATER_INTRADAY;
    private final int code;
    private boolean intraday;

    public static intraday valueOf(String s)
    {
        return (intraday)Enum.valueOf(com/fitbit/data/domain/TimeSeriesObject$TimeSeriesResourceType, s);
    }

    public static intraday[] values()
    {
        return (intraday[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    public boolean isIntraday()
    {
        return intraday;
    }

    static 
    {
        UKNOWN = new <init>("UKNOWN", 0, 0);
        BODY_WEIGHT = new <init>("BODY_WEIGHT", 1, 1);
        WATER = new <init>("WATER", 2, 2);
        BODY_FAT = new <init>("BODY_FAT", 3, 3);
        STEPS = new <init>("STEPS", 4, 4);
        CALORIES = new <init>("CALORIES", 5, 5);
        FLOORS = new <init>("FLOORS", 6, 6);
        CALORIES_IN = new <init>("CALORIES_IN", 7, 7);
        DISTANCE = new <init>("DISTANCE", 8, 8);
        MINUTES_ASLEEP = new <init>("MINUTES_ASLEEP", 9, 9);
        AWAKENINGS_COUNT = new <init>("AWAKENINGS_COUNT", 10, 10);
        STEPS_INTRADAY = new <init>("STEPS_INTRADAY", 11, 11, true);
        CALORIES_INTRADAY = new <init>("CALORIES_INTRADAY", 12, 12, true);
        FLOORS_INTRADAY = new <init>("FLOORS_INTRADAY", 13, 13, true);
        MINUTES_ASLEEP_INTRADAY = new <init>("MINUTES_ASLEEP_INTRADAY", 14, 14, true);
        DISTANCE_INTRADAY = new <init>("DISTANCE_INTRADAY", 15, 15, true);
        MINUTES_VERY_ACTIVE = new <init>("MINUTES_VERY_ACTIVE", 16, 16);
        MINUTES_VERY_ACTIVE_INTRADAY = new <init>("MINUTES_VERY_ACTIVE_INTRADAY", 17, 17, true);
        HEART_RATE_INTRADAY = new <init>("HEART_RATE_INTRADAY", 18, 18, true);
        RESTING_HEART_RATE = new <init>("RESTING_HEART_RATE", 19, 19);
        MINUTES_FAIRLY_ACTIVE = new <init>("MINUTES_FAIRLY_ACTIVE", 20, 20);
        MINUTES_FAIRLY_ACTIVE_INTRADAY = new <init>("MINUTES_FAIRLY_ACTIVE_INTRADAY", 21, 21, true);
        WATER_INTRADAY = new <init>("WATER_INTRADAY", 22, 22, true);
        $VALUES = (new .VALUES[] {
            UKNOWN, BODY_WEIGHT, WATER, BODY_FAT, STEPS, CALORIES, FLOORS, CALORIES_IN, DISTANCE, MINUTES_ASLEEP, 
            AWAKENINGS_COUNT, STEPS_INTRADAY, CALORIES_INTRADAY, FLOORS_INTRADAY, MINUTES_ASLEEP_INTRADAY, DISTANCE_INTRADAY, MINUTES_VERY_ACTIVE, MINUTES_VERY_ACTIVE_INTRADAY, HEART_RATE_INTRADAY, RESTING_HEART_RATE, 
            MINUTES_FAIRLY_ACTIVE, MINUTES_FAIRLY_ACTIVE_INTRADAY, WATER_INTRADAY
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        intraday = false;
        code = j;
    }

    private code(String s, int i, int j, boolean flag)
    {
        super(s, i);
        intraday = false;
        code = j;
        intraday = flag;
    }
}
