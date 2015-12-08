// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import android.content.Context;

public interface ForecastValues
{

    public abstract String getConvertedIce(Integer integer, Context context);

    public abstract String getConvertedRain(Integer integer, Context context);

    public abstract String getConvertedSnow(Integer integer, Context context);

    public abstract String getConvertedWindDirection(Integer integer, Context context);

    public abstract String getConvertedWindGust(Integer integer, Context context);

    public abstract String getConvertedWindSpeed(Integer integer, Context context);

    public abstract String getIceForAlarm();

    public abstract String getPrecipProbability_string();

    public abstract String getRainForAlarm();

    public abstract String getSnowForAlarm();

    public abstract String getTstorm_string();

    public abstract String getWindDirection();

    public abstract String getWindGust_string();

    public abstract String getWindSpeed_string();
}
