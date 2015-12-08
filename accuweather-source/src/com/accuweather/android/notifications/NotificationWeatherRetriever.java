// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.notifications;

import android.content.Context;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.request.Request;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.UserPreferences;

public class NotificationWeatherRetriever
{

    public NotificationWeatherRetriever()
    {
    }

    private WeatherContentUpdateParams buildWeatherContentUpdateParams()
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(true);
        weathercontentupdateparams.setCurrentConditionsUpdate(true);
        weathercontentupdateparams.setDailyUpdate(false);
        weathercontentupdateparams.setHourlyUpdate(false);
        weathercontentupdateparams.setNewsUpdate(false);
        weathercontentupdateparams.setVideoUpdate(false);
        weathercontentupdateparams.setMinuteCastUpdate(false);
        return weathercontentupdateparams;
    }

    private WeatherUpdateRequest buildWeatherUpdateRequest(Context context, String s)
    {
        WeatherUpdateRequest weatherupdaterequest = new WeatherUpdateRequest();
        weatherupdaterequest.setLocationKey(s);
        weatherupdaterequest.setMetric(UserPreferences.getMetricIntPreference(context));
        weatherupdaterequest.setLangId(Data.getInstance(context).getLangId());
        weatherupdaterequest.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(context));
        weatherupdaterequest.setPrimaryLocation(true);
        weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParams());
        weatherupdaterequest.setNotification(true);
        return weatherupdaterequest;
    }

    public void findFollowMeLocation(Context context)
    {
        Data.getInstance(context).getGpsLocation(true);
    }

    public void retrieveWeather(Context context, String s)
    {
        WeatherUpdateRequest weatherupdaterequest = buildWeatherUpdateRequest(context, s);
        s = Data.getInstance(context).getLocationFromKey(s);
        if (s != null)
        {
            weatherupdaterequest.setCoordinates(s.getLatitude(), s.getLongitude());
        }
        Data.getInstance(context).queueRequest(new Request[] {
            weatherupdaterequest
        });
    }

    public void retrieveWeatherForFollowMe(Context context, String s)
    {
        s = buildWeatherUpdateRequest(context, s);
        s.setResultOfGpsSearch(true);
        LocationModel locationmodel = Data.getInstance(context).getCurrentFollowMeLocation();
        if (locationmodel != null)
        {
            s.setCoordinates(locationmodel.getLatitude(), locationmodel.getLongitude());
        }
        Data.getInstance(context).queueRequest(new Request[] {
            s
        });
    }
}
