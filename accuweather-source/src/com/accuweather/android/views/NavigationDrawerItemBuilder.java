// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MultilineItem;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.utilities.MinuteCastUtilities;
import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerItemBuilder
{

    public NavigationDrawerItemBuilder()
    {
    }

    private static MultilineItem buildDailyItem(WeatherDataModel weatherdatamodel, Context context)
    {
        MultilineItem multilineitem = new MultilineItem(context.getString(com.accuweather.android.R.string.Daily));
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && !weatherdatamodel.getForecast().getDailyForecasts().isEmpty())
        {
            weatherdatamodel = (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0);
            if (weatherdatamodel.getDay() != null)
            {
                multilineitem.setSubTitle((new StringBuilder()).append(context.getString(com.accuweather.android.R.string.Today)).append(": ").append(getHighTemperatureText(weatherdatamodel, context)).append("/").append(getLowTemperatureText(weatherdatamodel, context)).append(weatherdatamodel.getDay().getIconPhrase()).toString());
            }
        }
        return multilineitem;
    }

    private static MultilineItem buildHourlyItem(WeatherDataModel weatherdatamodel, Context context)
    {
        MultilineItem multilineitem = new MultilineItem(context.getString(com.accuweather.android.R.string.Hourly));
        if (weatherdatamodel.getHourly() != null && !weatherdatamodel.getHourly().isEmpty())
        {
            weatherdatamodel = (HourlyResult)weatherdatamodel.getHourly().get(0);
            Measurement measurement = weatherdatamodel.getTemperature();
            multilineitem.setSubTitle((new StringBuilder()).append(context.getString(com.accuweather.android.R.string.NextHour_colon)).append(" ").append(measurement.getValue().intValue()).append("\260").append(" ").append(weatherdatamodel.getIconPhrase()).toString());
        }
        return multilineitem;
    }

    private static MultilineItem buildMinuteCastItem(WeatherDataModel weatherdatamodel, Context context)
    {
        context = new MultilineItem(context.getString(com.accuweather.android.R.string.MinuteCast));
        if (weatherdatamodel.getMinuteCastResult() != null && weatherdatamodel.getMinuteCastResult().getSummary() != null)
        {
            weatherdatamodel = weatherdatamodel.getMinuteCastResult();
            if (MinuteCastUtilities.isAllDry(weatherdatamodel))
            {
                context.setSubTitle("");
            } else
            if (weatherdatamodel.getSummary().getPhrase() != null)
            {
                context.setSubTitle(weatherdatamodel.getSummary().getPhrase());
                return context;
            }
        }
        return context;
    }

    public static List buildNavigationDrawerItems(WeatherDataModel weatherdatamodel, Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(buildNowItem(weatherdatamodel, context));
        if (shouldIncludeMinuteCastItem(weatherdatamodel))
        {
            arraylist.add(buildMinuteCastItem(weatherdatamodel, context));
        }
        arraylist.add(buildHourlyItem(weatherdatamodel, context));
        arraylist.add(buildDailyItem(weatherdatamodel, context));
        arraylist.add(new MultilineItem(context.getString(com.accuweather.android.R.string.Maps)));
        arraylist.add(new MultilineItem(context.getString(com.accuweather.android.R.string.Videos)));
        arraylist.add(new MultilineItem(context.getString(com.accuweather.android.R.string.News)));
        arraylist.add(new MultilineItem(context.getString(com.accuweather.android.R.string.Locations)));
        return arraylist;
    }

    private static MultilineItem buildNowItem(WeatherDataModel weatherdatamodel, Context context)
    {
        return new MultilineItem(context.getString(com.accuweather.android.R.string.Now), (new StringBuilder()).append(context.getString(com.accuweather.android.R.string.Currently_colon)).append(" ").append(weatherdatamodel.getTemperature()).append("\260").append(" ").append(weatherdatamodel.getText()).toString());
    }

    private static String getHighTemperatureText(DailyForecast dailyforecast, Context context)
    {
        if (dailyforecast.getHighTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    private static String getLowTemperatureText(DailyForecast dailyforecast, Context context)
    {
        if (dailyforecast.getLowTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    private static boolean shouldIncludeMinuteCastItem(WeatherDataModel weatherdatamodel)
    {
        return MinuteCastUtilities.isMinuteCastLocation(weatherdatamodel);
    }
}
