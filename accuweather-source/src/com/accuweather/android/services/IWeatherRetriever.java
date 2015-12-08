// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.news.NewsResults;
import java.util.List;
import org.xml.sax.InputSource;

public interface IWeatherRetriever
{

    public abstract boolean isPaid();

    public abstract AlertResults retrieveAlerts(String s, String s1)
        throws Exception;

    public abstract CurrentConditionsResults retrieveCurrentConditions(String s, String s1, boolean flag)
        throws Exception;

    public abstract List retrieveDMAs(InputSource inputsource)
        throws Exception;

    public abstract ForecastResult retrieveForecast(String s, String s1, boolean flag)
        throws Exception;

    public abstract HourlyResults retrieveHourly(String s, String s1, boolean flag)
        throws Exception;

    public abstract MinuteCastResult retrieveMinuteCast(Double double1, Double double2, String s, boolean flag, boolean flag1)
        throws Exception;

    public abstract NewsResults retrieveNews(String s, String s1, boolean flag, String s2)
        throws Exception;

    public abstract List retrieveVideos(String s, String s1, String s2)
        throws Exception;

    public abstract void setPaid(boolean flag);
}
