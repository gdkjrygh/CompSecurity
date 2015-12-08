// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;


public final class MinuteCastPrecipitationType extends Enum
{

    private static final MinuteCastPrecipitationType $VALUES[];
    public static final MinuteCastPrecipitationType DRY;
    public static final MinuteCastPrecipitationType ICE;
    public static final MinuteCastPrecipitationType MIX;
    public static final MinuteCastPrecipitationType RAIN;
    public static final MinuteCastPrecipitationType SNOW;

    private MinuteCastPrecipitationType(String s, int i)
    {
        super(s, i);
    }

    public static MinuteCastPrecipitationType valueOf(String s)
    {
        return (MinuteCastPrecipitationType)Enum.valueOf(com/accuweather/android/models/minutecast/MinuteCastPrecipitationType, s);
    }

    public static MinuteCastPrecipitationType[] values()
    {
        return (MinuteCastPrecipitationType[])$VALUES.clone();
    }

    static 
    {
        DRY = new MinuteCastPrecipitationType("DRY", 0);
        RAIN = new MinuteCastPrecipitationType("RAIN", 1);
        SNOW = new MinuteCastPrecipitationType("SNOW", 2);
        ICE = new MinuteCastPrecipitationType("ICE", 3);
        MIX = new MinuteCastPrecipitationType("MIX", 4);
        $VALUES = (new MinuteCastPrecipitationType[] {
            DRY, RAIN, SNOW, ICE, MIX
        });
    }
}
