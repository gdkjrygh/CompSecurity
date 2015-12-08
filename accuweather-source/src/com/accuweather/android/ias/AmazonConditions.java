// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;


public final class AmazonConditions extends Enum
{

    private static final AmazonConditions $VALUES[];
    public static final AmazonConditions COLD;
    public static final AmazonConditions FOG;
    public static final AmazonConditions RAIN;
    public static final AmazonConditions SNOW;
    public static final AmazonConditions SUN;
    public static final AmazonConditions WIND;
    private Integer icon;

    private AmazonConditions(String s, int i, Integer integer)
    {
        super(s, i);
        setIcon(integer);
    }

    public static AmazonConditions valueOf(String s)
    {
        return (AmazonConditions)Enum.valueOf(com/accuweather/android/ias/AmazonConditions, s);
    }

    public static AmazonConditions[] values()
    {
        return (AmazonConditions[])$VALUES.clone();
    }

    public Integer getIcon()
    {
        return icon;
    }

    public void setIcon(Integer integer)
    {
        icon = integer;
    }

    static 
    {
        RAIN = new AmazonConditions("RAIN", 0, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_rain));
        SUN = new AmazonConditions("SUN", 1, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_sun));
        COLD = new AmazonConditions("COLD", 2, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_cold));
        SNOW = new AmazonConditions("SNOW", 3, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_snow));
        WIND = new AmazonConditions("WIND", 4, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_wind));
        FOG = new AmazonConditions("FOG", 5, Integer.valueOf(com.accuweather.android.R.drawable.amazon_condition_fog));
        $VALUES = (new AmazonConditions[] {
            RAIN, SUN, COLD, SNOW, WIND, FOG
        });
    }
}
