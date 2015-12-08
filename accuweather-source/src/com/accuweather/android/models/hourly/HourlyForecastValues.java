// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.hourly;

import com.accuweather.android.models.daily.ForecastValues;

public interface HourlyForecastValues
    extends ForecastValues
{

    public abstract String getDewPointForecast();

    public abstract String getHumidityForecast();
}
