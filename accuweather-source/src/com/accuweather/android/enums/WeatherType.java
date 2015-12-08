// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.enums;


public final class WeatherType extends Enum
{

    private static final WeatherType $VALUES[];
    public static final WeatherType ICE;
    public static final WeatherType RAIN;
    public static final WeatherType SNOW;
    public static final WeatherType TSTORMS;
    public static final WeatherType WIND;
    private Integer alarm;
    private Integer nonAlarm;

    private WeatherType(String s, int i, Integer integer, Integer integer1)
    {
        super(s, i);
        alarm = integer;
        nonAlarm = integer1;
    }

    public static WeatherType valueOf(String s)
    {
        return (WeatherType)Enum.valueOf(com/accuweather/android/enums/WeatherType, s);
    }

    public static WeatherType[] values()
    {
        return (WeatherType[])$VALUES.clone();
    }

    public Integer getAlarmImageResource()
    {
        return alarm;
    }

    public Integer getImageResource()
    {
        return nonAlarm;
    }

    static 
    {
        ICE = new WeatherType("ICE", 0, Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_ice_alarm), Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_ice));
        SNOW = new WeatherType("SNOW", 1, Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_snow_alarm), Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_snow));
        RAIN = new WeatherType("RAIN", 2, Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_rain_alarm), Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_rain));
        WIND = new WeatherType("WIND", 3, Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_wind_alarm), Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_wind));
        TSTORMS = new WeatherType("TSTORMS", 4, Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_thunderstorms_alarm), Integer.valueOf(com.accuweather.android.R.drawable.ic_weatherdetails_thunderstorms));
        $VALUES = (new WeatherType[] {
            ICE, SNOW, RAIN, WIND, TSTORMS
        });
    }
}
