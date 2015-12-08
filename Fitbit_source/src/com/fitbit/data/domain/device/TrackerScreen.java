// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            TrackerOption, TrackerGoalType

public final class TrackerScreen extends Enum
{

    private static final TrackerScreen $VALUES[];
    public static final TrackerScreen ACTIVE_MINUTES;
    public static final TrackerScreen CALORIES;
    public static final TrackerScreen DISTANCE;
    public static final TrackerScreen FLOORS;
    public static final TrackerScreen HEART_RATE;
    public static final TrackerScreen STEPS;
    public static final TrackerScreen TIME;
    public static final TrackerScreen UNKNOWN;
    private final TrackerGoalType goalType;
    private final TrackerOption option;

    private TrackerScreen(String s, int i, TrackerOption trackeroption, TrackerGoalType trackergoaltype)
    {
        super(s, i);
        option = trackeroption;
        goalType = trackergoaltype;
    }

    public static TrackerScreen valueOf(String s)
    {
        return (TrackerScreen)Enum.valueOf(com/fitbit/data/domain/device/TrackerScreen, s);
    }

    public static TrackerScreen[] values()
    {
        return (TrackerScreen[])$VALUES.clone();
    }

    public TrackerGoalType getGoalType()
    {
        return goalType;
    }

    public TrackerOption getOption()
    {
        return option;
    }

    static 
    {
        STEPS = new TrackerScreen("STEPS", 0, TrackerOption.DISPLAY_STEPS, TrackerGoalType.STEPS);
        ACTIVE_MINUTES = new TrackerScreen("ACTIVE_MINUTES", 1, TrackerOption.DISPLAY_ACTIVE_MINUTES, TrackerGoalType.ACTIVE_MINUTES);
        TIME = new TrackerScreen("TIME", 2, TrackerOption.DISPLAY_CLOCK, null);
        FLOORS = new TrackerScreen("FLOORS", 3, TrackerOption.DISPLAY_ELEVATION, TrackerGoalType.FLOORS);
        CALORIES = new TrackerScreen("CALORIES", 4, TrackerOption.DISPLAY_CALORIES, TrackerGoalType.CALORIES);
        DISTANCE = new TrackerScreen("DISTANCE", 5, TrackerOption.DISPLAY_DISTANCE, TrackerGoalType.DISTANCE);
        HEART_RATE = new TrackerScreen("HEART_RATE", 6, TrackerOption.DISPLAY_HEART_RATE, null);
        UNKNOWN = new TrackerScreen("UNKNOWN", 7, null, null);
        $VALUES = (new TrackerScreen[] {
            STEPS, ACTIVE_MINUTES, TIME, FLOORS, CALORIES, DISTANCE, HEART_RATE, UNKNOWN
        });
    }
}
