// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.badges;

import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;

public final class BadgeMetric extends Enum
{

    private static final BadgeMetric $VALUES[];
    public static final BadgeMetric BOOLEAN;
    public static final BadgeMetric COUNT;
    public static final BadgeMetric FLOORS;
    public static final BadgeMetric GRAMS;
    public static final BadgeMetric KILOGRAMS;
    public static final BadgeMetric KILOMETERS;
    public static final BadgeMetric MILES;
    public static final BadgeMetric POUNDS;
    public static final BadgeMetric STEPS;
    private final int displayName;
    private final int displayPluralName;

    private BadgeMetric(String s, int i, int j, int k)
    {
        super(s, i);
        displayName = j;
        displayPluralName = k;
    }

    public static BadgeMetric valueOf(String s)
    {
        return (BadgeMetric)Enum.valueOf(com/fitbit/data/domain/badges/BadgeMetric, s);
    }

    public static BadgeMetric[] values()
    {
        return (BadgeMetric[])$VALUES.clone();
    }

    public String getDisplayName(String s)
    {
        String s1 = al.a(displayPluralName, s);
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = s1;
            if (displayName > 0)
            {
                s = FitBitApplication.a().getString(displayName);
            }
        }
        return s;
    }

    static 
    {
        STEPS = new BadgeMetric("STEPS", 0, 0x7f08056c, 0x7f0b001d);
        MILES = new BadgeMetric("MILES", 1, 0x7f0803d3, 0x7f0b000d);
        KILOMETERS = new BadgeMetric("KILOMETERS", 2, 0x7f0802a1, 0);
        FLOORS = new BadgeMetric("FLOORS", 3, 0x7f0801c7, 0x7f0b000b);
        GRAMS = new BadgeMetric("GRAMS", 4, 0x7f08023f, 0);
        KILOGRAMS = new BadgeMetric("KILOGRAMS", 5, 0x7f08029f, 0);
        POUNDS = new BadgeMetric("POUNDS", 6, 0x7f08038b, 0);
        BOOLEAN = new BadgeMetric("BOOLEAN", 7, 0, 0);
        COUNT = new BadgeMetric("COUNT", 8, 0, 0);
        $VALUES = (new BadgeMetric[] {
            STEPS, MILES, KILOMETERS, FLOORS, GRAMS, KILOGRAMS, POUNDS, BOOLEAN, COUNT
        });
    }
}
