// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.badges;


public final class BadgeTimeframe extends Enum
{

    private static final BadgeTimeframe $VALUES[];
    public static final BadgeTimeframe DAILY;
    public static final BadgeTimeframe GOAL_BASED;
    public static final BadgeTimeframe LIFETIME;
    public static final BadgeTimeframe MONTHLY;
    public static final BadgeTimeframe WEEKLY;

    private BadgeTimeframe(String s, int i)
    {
        super(s, i);
    }

    public static BadgeTimeframe valueOf(String s)
    {
        return (BadgeTimeframe)Enum.valueOf(com/fitbit/data/domain/badges/BadgeTimeframe, s);
    }

    public static BadgeTimeframe[] values()
    {
        return (BadgeTimeframe[])$VALUES.clone();
    }

    static 
    {
        DAILY = new BadgeTimeframe("DAILY", 0);
        WEEKLY = new BadgeTimeframe("WEEKLY", 1);
        MONTHLY = new BadgeTimeframe("MONTHLY", 2);
        LIFETIME = new BadgeTimeframe("LIFETIME", 3);
        GOAL_BASED = new BadgeTimeframe("GOAL_BASED", 4);
        $VALUES = (new BadgeTimeframe[] {
            DAILY, WEEKLY, MONTHLY, LIFETIME, GOAL_BASED
        });
    }
}
