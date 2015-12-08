// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.parsers.ForecastParser;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IForecastService

public class ForecastService extends BaseDataRetrievalService
    implements IForecastService
{

    private static final String FORECAST_15_DAY_URL = "http://api.accuweather.com/forecasts/v1/daily/15day/";
    private static final String FORECAST_25_DAY_URL = "http://api.accuweather.com/forecasts/v1/daily/25day/";
    private static final String METRIC_URL_PARAMETER_NAME = "metric";
    private ForecastParser forecastParser;
    private boolean isPaid;

    public ForecastService()
    {
        isPaid = false;
        forecastParser = new ForecastParser();
    }

    public boolean isPaid()
    {
        return isPaid;
    }

    public ForecastResult retrieveForecast(String s, String s1, boolean flag)
        throws Exception
    {
        String s2;
        if (isPaid())
        {
            s2 = "http://api.accuweather.com/forecasts/v1/daily/25day/";
        } else
        {
            s2 = "http://api.accuweather.com/forecasts/v1/daily/15day/";
        }
        s = Uri.parse((new StringBuilder()).append(s2).append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).appendQueryParameter("metric", String.valueOf(flag)).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveForecast, url ").append(s).toString());
        }
        return (ForecastResult)parse(s, forecastParser);
    }

    public void setPaid(boolean flag)
    {
        isPaid = flag;
    }
}
