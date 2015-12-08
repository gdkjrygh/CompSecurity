// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;


public final class MinuteCastThresholdType extends Enum
{

    private static final MinuteCastThresholdType $VALUES[];
    public static final MinuteCastThresholdType HEAVY;
    public static final MinuteCastThresholdType LIGHT;
    public static final MinuteCastThresholdType LIGHT_MODERATE;
    public static final MinuteCastThresholdType MODERATE;
    public static final MinuteCastThresholdType NONE;

    private MinuteCastThresholdType(String s, int i)
    {
        super(s, i);
    }

    public static MinuteCastThresholdType valueOf(String s)
    {
        return (MinuteCastThresholdType)Enum.valueOf(com/accuweather/android/models/minutecast/MinuteCastThresholdType, s);
    }

    public static MinuteCastThresholdType[] values()
    {
        return (MinuteCastThresholdType[])$VALUES.clone();
    }

    static 
    {
        NONE = new MinuteCastThresholdType("NONE", 0);
        LIGHT = new MinuteCastThresholdType("LIGHT", 1);
        LIGHT_MODERATE = new MinuteCastThresholdType("LIGHT_MODERATE", 2);
        MODERATE = new MinuteCastThresholdType("MODERATE", 3);
        HEAVY = new MinuteCastThresholdType("HEAVY", 4);
        $VALUES = (new MinuteCastThresholdType[] {
            NONE, LIGHT, LIGHT_MODERATE, MODERATE, HEAVY
        });
    }
}
