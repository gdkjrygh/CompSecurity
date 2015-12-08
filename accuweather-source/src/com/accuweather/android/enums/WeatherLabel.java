// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.enums;


public final class WeatherLabel extends Enum
{

    private static final WeatherLabel $VALUES[];
    public static final WeatherLabel DEW;
    public static final WeatherLabel HUMIDITY;
    public static final WeatherLabel ICE;
    public static final WeatherLabel PROBABILITY;
    public static final WeatherLabel RAIN;
    public static final WeatherLabel SNOW;
    public static final WeatherLabel TSTORMS;
    public static final WeatherLabel WIND_DIRECTION;
    public static final WeatherLabel WIND_GUST;
    public static final WeatherLabel WIND_SPEED;
    private int label;

    private WeatherLabel(String s, int i, int j)
    {
        super(s, i);
        label = j;
    }

    public static WeatherLabel valueOf(String s)
    {
        return (WeatherLabel)Enum.valueOf(com/accuweather/android/enums/WeatherLabel, s);
    }

    public static WeatherLabel[] values()
    {
        return (WeatherLabel[])$VALUES.clone();
    }

    public int getLabel()
    {
        return label;
    }

    static 
    {
        WIND_DIRECTION = new WeatherLabel("WIND_DIRECTION", 0, com.accuweather.android.R.string.Direction);
        WIND_SPEED = new WeatherLabel("WIND_SPEED", 1, com.accuweather.android.R.string.Speed);
        WIND_GUST = new WeatherLabel("WIND_GUST", 2, com.accuweather.android.R.string.Gusts);
        PROBABILITY = new WeatherLabel("PROBABILITY", 3, com.accuweather.android.R.string.Probability_Abbr16);
        RAIN = new WeatherLabel("RAIN", 4, com.accuweather.android.R.string.Rain);
        SNOW = new WeatherLabel("SNOW", 5, com.accuweather.android.R.string.Snow);
        ICE = new WeatherLabel("ICE", 6, com.accuweather.android.R.string.Ice);
        TSTORMS = new WeatherLabel("TSTORMS", 7, com.accuweather.android.R.string.tstorms);
        DEW = new WeatherLabel("DEW", 8, com.accuweather.android.R.string.DewPoint);
        HUMIDITY = new WeatherLabel("HUMIDITY", 9, com.accuweather.android.R.string.Humidity);
        $VALUES = (new WeatherLabel[] {
            WIND_DIRECTION, WIND_SPEED, WIND_GUST, PROBABILITY, RAIN, SNOW, ICE, TSTORMS, DEW, HUMIDITY
        });
    }
}
