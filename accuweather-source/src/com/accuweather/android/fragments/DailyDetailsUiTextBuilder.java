// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.Sun;
import com.accuweather.android.utilities.DateUtils;

public class DailyDetailsUiTextBuilder
{

    private Context context;
    private DailyForecast dailyForecast;
    private WeatherDataModel weatherDataModel;

    public DailyDetailsUiTextBuilder()
    {
    }

    private String getConvertedSunTime(String s)
    {
        return DateUtils.getAdjustedTimeForCurrentPreferences(s, context);
    }

    private String getHighTemperatureText()
    {
        if (dailyForecast.getHighTemperature() != null)
        {
            return (new StringBuilder()).append(dailyForecast.getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return null;
        }
    }

    private String getLowTemperatureText()
    {
        if (dailyForecast.getLowTemperature() != null)
        {
            return (new StringBuilder()).append(dailyForecast.getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return null;
        }
    }

    public String getDayHeaderTemperatureText()
    {
        String s = getHighTemperatureText();
        String s1 = weatherDataModel.getTempUnit();
        if (s != null && s1 != null)
        {
            return (new StringBuilder()).append(getHighTemperatureText()).append("<small><small>").append(weatherDataModel.getTempUnit()).append("</small> </small>").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public String getDayShortText()
    {
        return dailyForecast.getDay().getShortPhrase();
    }

    public String getNightHeaderTemperatureText()
    {
        String s = getLowTemperatureText();
        String s1 = weatherDataModel.getTempUnit();
        if (s != null && s1 != null)
        {
            return (new StringBuilder()).append(getLowTemperatureText()).append("<small><small>").append(weatherDataModel.getTempUnit()).append("</small> </small>").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public String getNightShortText()
    {
        return dailyForecast.getNight().getShortPhrase();
    }

    public String getRealFeelHighTemperatureText()
    {
        Double double1 = dailyForecast.getRealFeelHighTemperature();
        if (double1 != null)
        {
            return (new StringBuilder()).append("<b>").append(context.getString(com.accuweather.android.R.string.Day)).append(": ").append("</b>").append(context.getString(com.accuweather.android.R.string.RealFeel)).append(" ").append(context.getString(com.accuweather.android.R.string.High).toLowerCase(context.getResources().getConfiguration().locale)).append(" ").append(double1.intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public String getRealFeelLowTemperatureText()
    {
        Double double1 = dailyForecast.getRealFeelLowTemperature();
        if (double1 != null)
        {
            return (new StringBuilder()).append("<b>").append(context.getString(com.accuweather.android.R.string.Night)).append(": ").append("</b>").append(context.getString(com.accuweather.android.R.string.RealFeel)).append(" ").append(context.getString(com.accuweather.android.R.string.Low).toLowerCase(context.getResources().getConfiguration().locale)).append(" ").append(double1.intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public String getSunriseText()
    {
        Object obj = dailyForecast.getSun();
        if (obj != null)
        {
            obj = ((Sun) (obj)).getRise();
            if (obj != null)
            {
                obj = DateUtils.to12HourTimeWithAmPm(((String) (obj)), context.getResources().getConfiguration().locale);
                return (new StringBuilder()).append(context.getString(com.accuweather.android.R.string.Sunrise)).append(": ").append(getConvertedSunTime(((String) (obj)))).toString();
            }
        }
        return "";
    }

    public String getSunsetText()
    {
        if (dailyForecast.getSun() != null && dailyForecast.getSun().getSet() != null)
        {
            String s = DateUtils.to12HourTimeWithAmPm(dailyForecast.getSun().getSet(), context.getResources().getConfiguration().locale);
            return (new StringBuilder()).append(context.getString(com.accuweather.android.R.string.Sunset)).append(": ").append(getConvertedSunTime(s)).toString();
        } else
        {
            return "";
        }
    }

    public void setContext(Context context1)
    {
        context = context1;
    }

    public void setDailyForecast(DailyForecast dailyforecast)
    {
        dailyForecast = dailyforecast;
    }

    public void setWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        weatherDataModel = weatherdatamodel;
    }
}
