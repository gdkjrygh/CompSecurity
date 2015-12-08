// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.enums;


public final class ForecastModelType extends Enum
{

    private static final ForecastModelType $VALUES[];
    public static final ForecastModelType FORECAST_MODEL;
    public static final ForecastModelType HALFDAY_FORECAST_MODEL;
    public static final ForecastModelType HOURLY_MODEL;

    private ForecastModelType(String s, int i)
    {
        super(s, i);
    }

    public static ForecastModelType valueOf(String s)
    {
        return (ForecastModelType)Enum.valueOf(com/accuweather/android/enums/ForecastModelType, s);
    }

    public static ForecastModelType[] values()
    {
        return (ForecastModelType[])$VALUES.clone();
    }

    static 
    {
        HOURLY_MODEL = new ForecastModelType("HOURLY_MODEL", 0);
        HALFDAY_FORECAST_MODEL = new ForecastModelType("HALFDAY_FORECAST_MODEL", 1);
        FORECAST_MODEL = new ForecastModelType("FORECAST_MODEL", 2);
        $VALUES = (new ForecastModelType[] {
            HOURLY_MODEL, HALFDAY_FORECAST_MODEL, FORECAST_MODEL
        });
    }
}
