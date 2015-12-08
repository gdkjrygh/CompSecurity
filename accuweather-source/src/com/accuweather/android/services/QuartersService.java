// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.quarter.QuarterResults;
import com.accuweather.android.parsers.QuartersParser;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IQuartersService

public class QuartersService extends BaseDataRetrievalService
    implements IQuartersService
{

    private static final String METRIC_URL_PARAMETER_NAME = "metric";
    private static final String QUARTER_URL = "http://api.accuweather.com/forecasts/v1/daily/1day/quarters/";
    private QuartersParser quarterParser;

    public QuartersService()
    {
        quarterParser = new QuartersParser();
    }

    public QuarterResults retrieveQuarters(String s, boolean flag)
        throws Exception
    {
        s = Uri.parse((new StringBuilder()).append("http://api.accuweather.com/forecasts/v1/daily/1day/quarters/").append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("metric", String.valueOf(flag)).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveQuarter, url ").append(s).toString());
        }
        return (QuarterResults)parse(s, quarterParser);
    }
}
