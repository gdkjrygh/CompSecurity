// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.parsers.CurrentConditionsParser;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, ICurrentConditionService

public class CurrentConditionService extends BaseDataRetrievalService
    implements ICurrentConditionService
{

    private static final String CURRENT_CONDITIONS_URL = "http://api.accuweather.com/currentconditions/v1/";
    private CurrentConditionsParser currentConditionsParser;

    public CurrentConditionService()
    {
        currentConditionsParser = new CurrentConditionsParser();
    }

    public CurrentConditionsResults retrieveCurrentConditions(String s, String s1, boolean flag)
        throws Exception
    {
        s = Uri.parse((new StringBuilder()).append("http://api.accuweather.com/currentconditions/v1/").append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveCurrentConditions, url ").append(s).toString());
        }
        return (CurrentConditionsResults)parse(s, currentConditionsParser);
    }
}
