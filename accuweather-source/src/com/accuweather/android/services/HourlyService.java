// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.parsers.HourlyParser;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IHourlyService

public class HourlyService extends BaseDataRetrievalService
    implements IHourlyService
{

    private static final String HOURLY_72_HOUR_URL = "http://api.accuweather.com/forecasts/v1/hourly/72hour/";
    private static final String METRIC_URL_PARAMETER_NAME = "metric";
    private HourlyParser hourlyParser;

    public HourlyService()
    {
        hourlyParser = new HourlyParser();
    }

    public HourlyResults retrieveHourly(String s, String s1, boolean flag)
        throws Exception
    {
        s = Uri.parse((new StringBuilder()).append("http://api.accuweather.com/forecasts/v1/hourly/72hour/").append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).appendQueryParameter("metric", String.valueOf(flag)).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveHourly, url ").append(s).toString());
        }
        return (HourlyResults)parse(s, hourlyParser);
    }
}
