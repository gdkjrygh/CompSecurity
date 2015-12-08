// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.parsers.MinuteCastParser;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IMinuteCastService

public class MinuteCastService extends BaseDataRetrievalService
    implements IMinuteCastService
{

    private static final String MINUTE_CAST_URL = "http://api.accuweather.com/forecasts/v1/minute/1minute?";
    private MinuteCastParser minuteCastParser;

    public MinuteCastService()
    {
        minuteCastParser = new MinuteCastParser();
    }

    public MinuteCastResult retrieveMinuteCastResult(Double double1, Double double2, String s, boolean flag, boolean flag1)
        throws Exception
    {
        double1 = Uri.parse("http://api.accuweather.com/forecasts/v1/minute/1minute?").buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("language", s).appendQueryParameter("q", (new StringBuilder()).append(double1).append(",").append(double2).toString()).appendQueryParameter("details", String.valueOf(flag1)).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveMinuteCast, url ").append(double1).toString());
        }
        return (MinuteCastResult)parse(double1, minuteCastParser);
    }
}
