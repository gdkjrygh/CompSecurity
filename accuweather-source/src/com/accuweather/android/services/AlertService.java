// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IAlertService

public class AlertService extends BaseDataRetrievalService
    implements IAlertService
{

    private static final String ALERT_URL = "http://api.accuweather.com/alerts/v1/";

    public AlertService()
    {
    }

    public AlertResults retrieveAlert(String s, String s1)
        throws Exception
    {
        s = Uri.parse((new StringBuilder()).append("http://api.accuweather.com/alerts/v1/").append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrieveAlert, url ").append(s).toString());
        }
        return (AlertResults)parse(s, com/accuweather/android/models/alert/AlertResults);
    }
}
