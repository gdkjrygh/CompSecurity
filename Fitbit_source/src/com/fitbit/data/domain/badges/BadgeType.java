// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.badges;


// Referenced classes of package com.fitbit.data.domain.badges:
//            BadgeTimeframe, BadgeMetric

public final class BadgeType extends Enum
{

    private static final BadgeType $VALUES[];
    public static final BadgeType DAILY_FLOORS;
    public static final BadgeType DAILY_STEPS;
    public static final BadgeType GOAL_BASED_WEIGHT_GAIN;
    public static final BadgeType GOAL_BASED_WEIGHT_GAIN_ACHIEVEMENT;
    public static final BadgeType GOAL_BASED_WEIGHT_LOSS;
    public static final BadgeType GOAL_BASED_WEIGHT_LOSS_ACHIEVEMENT;
    public static final BadgeType LIFETIME_DISTANCE;
    public static final BadgeType LIFETIME_FLOORS;
    public static final BadgeType LIFETIME_GAIN;
    public static final BadgeType LIFETIME_LOSS;
    public static final BadgeType LIFETIME_WEIGHT_GOAL_SETUP;
    public static final BadgeType UNKNOWN;
    private final BadgeMetric defaultUnit;
    private final int label;
    private final int priority;
    private final BadgeTimeframe timeframe;

    private BadgeType(String s, int i, BadgeTimeframe badgetimeframe, int j, BadgeMetric badgemetric, int k)
    {
        super(s, i);
        timeframe = badgetimeframe;
        label = j;
        defaultUnit = badgemetric;
        priority = k;
    }

    public static BadgeType valueOf(String s)
    {
        return (BadgeType)Enum.valueOf(com/fitbit/data/domain/badges/BadgeType, s);
    }

    public static BadgeType[] values()
    {
        return (BadgeType[])$VALUES.clone();
    }

    public BadgeMetric getDefaultUnit()
    {
        return defaultUnit;
    }

    public int getLabel()
    {
        return label;
    }

    public int getPriority()
    {
        return priority;
    }

    public BadgeTimeframe getTimeframe()
    {
        return timeframe;
    }

    static 
    {
        DAILY_STEPS = new BadgeType("DAILY_STEPS", 0, BadgeTimeframe.DAILY, 0x7f08006c, BadgeMetric.STEPS, 0);
        DAILY_FLOORS = new BadgeType("DAILY_FLOORS", 1, BadgeTimeframe.DAILY, 0x7f080069, BadgeMetric.FLOORS, 1);
        LIFETIME_DISTANCE = new BadgeType("LIFETIME_DISTANCE", 2, BadgeTimeframe.LIFETIME, 0x7f08006b, BadgeMetric.KILOMETERS, 2);
        LIFETIME_FLOORS = new BadgeType("LIFETIME_FLOORS", 3, BadgeTimeframe.LIFETIME, 0x7f08006a, BadgeMetric.FLOORS, 3);
        LIFETIME_GAIN = new BadgeType("LIFETIME_GAIN", 4, BadgeTimeframe.LIFETIME, 0, BadgeMetric.KILOGRAMS, -1);
        LIFETIME_LOSS = new BadgeType("LIFETIME_LOSS", 5, BadgeTimeframe.LIFETIME, 0, BadgeMetric.KILOGRAMS, 5);
        GOAL_BASED_WEIGHT_GAIN = new BadgeType("GOAL_BASED_WEIGHT_GAIN", 6, BadgeTimeframe.GOAL_BASED, 0, BadgeMetric.KILOGRAMS, -1);
        GOAL_BASED_WEIGHT_LOSS = new BadgeType("GOAL_BASED_WEIGHT_LOSS", 7, BadgeTimeframe.GOAL_BASED, 0x7f08006d, BadgeMetric.KILOGRAMS, 4);
        LIFETIME_WEIGHT_GOAL_SETUP = new BadgeType("LIFETIME_WEIGHT_GOAL_SETUP", 8, BadgeTimeframe.LIFETIME, 0, BadgeMetric.KILOGRAMS, 4);
        GOAL_BASED_WEIGHT_GAIN_ACHIEVEMENT = new BadgeType("GOAL_BASED_WEIGHT_GAIN_ACHIEVEMENT", 9, BadgeTimeframe.GOAL_BASED, 0, BadgeMetric.KILOGRAMS, -1);
        GOAL_BASED_WEIGHT_LOSS_ACHIEVEMENT = new BadgeType("GOAL_BASED_WEIGHT_LOSS_ACHIEVEMENT", 10, BadgeTimeframe.GOAL_BASED, 0, BadgeMetric.KILOGRAMS, 4);
        UNKNOWN = new BadgeType("UNKNOWN", 11, BadgeTimeframe.DAILY, 0, BadgeMetric.BOOLEAN, -1);
        $VALUES = (new BadgeType[] {
            DAILY_STEPS, DAILY_FLOORS, LIFETIME_DISTANCE, LIFETIME_FLOORS, LIFETIME_GAIN, LIFETIME_LOSS, GOAL_BASED_WEIGHT_GAIN, GOAL_BASED_WEIGHT_LOSS, LIFETIME_WEIGHT_GOAL_SETUP, GOAL_BASED_WEIGHT_GAIN_ACHIEVEMENT, 
            GOAL_BASED_WEIGHT_LOSS_ACHIEVEMENT, UNKNOWN
        });
    }
}
