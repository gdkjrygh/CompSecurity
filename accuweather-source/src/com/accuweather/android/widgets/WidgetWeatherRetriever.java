// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Context;
import android.os.SystemClock;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WidgetWeatherRetriever
{

    private long startTime;

    public WidgetWeatherRetriever()
    {
    }

    private WeatherContentUpdateParams buildWeatherContentUpdateParams(Data data, String s, boolean flag)
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(flag);
        weathercontentupdateparams.setCurrentConditionsUpdate(flag);
        weathercontentupdateparams.setDailyUpdate(flag);
        weathercontentupdateparams.setHourlyUpdate(false);
        weathercontentupdateparams.setNewsUpdate(false);
        weathercontentupdateparams.setVideoUpdate(false);
        data = data.getLocationFromKey(s);
        if (data != null && MinuteCastUtilities.isMinuteCastLocation(data.getCountryId(), data.getAdminAreaId()))
        {
            weathercontentupdateparams.setMinuteCastUpdate(true);
            return weathercontentupdateparams;
        } else
        {
            weathercontentupdateparams.setMinuteCastUpdate(false);
            return weathercontentupdateparams;
        }
    }

    private List getRequests(Data data, List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        String s;
        String s1;
        int i;
        int j;
        boolean flag1;
        if (flag)
        {
            s = PartnerCoding.getPartnerCodeFromSharedPreferences(data.getContext());
        } else
        {
            s = getStaticLocationPartnerCode(data.getContext());
        }
        s1 = data.getLangId();
        j = UserPreferences.getMetricIntPreference(data.getContext());
        if (SystemClock.elapsedRealtime() - startTime <= 0x1b7740L)
        {
            flag1 = false;
        } else
        {
            startTime = SystemClock.elapsedRealtime();
            flag1 = true;
        }
        i = 0;
        while (i < list.size()) 
        {
            WeatherUpdateRequest weatherupdaterequest = new WeatherUpdateRequest();
            weatherupdaterequest.setLocationKey((String)list.get(i));
            weatherupdaterequest.setMetric(j);
            weatherupdaterequest.setLangId(s1);
            weatherupdaterequest.setPartnerCode(s);
            weatherupdaterequest.setPrimaryLocation(false);
            weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParams(data, (String)list.get(i), flag1));
            weatherupdaterequest.setResultOfGpsSearch(flag);
            weatherupdaterequest.setWidget(true);
            if (flag)
            {
                LocationModel locationmodel = data.getCurrentFollowMeLocation();
                if (locationmodel != null)
                {
                    weatherupdaterequest.setCoordinates(locationmodel.getLatitude(), locationmodel.getLongitude());
                }
            } else
            {
                LocationModel locationmodel1 = data.getLocationFromKey((String)list.get(i));
                if (locationmodel1 != null)
                {
                    weatherupdaterequest.setCoordinates(locationmodel1.getLatitude(), locationmodel1.getLongitude());
                }
            }
            arraylist.add(weatherupdaterequest);
            i++;
        }
        return arraylist;
    }

    private String getStaticLocationPartnerCode(Context context)
    {
        return PartnerCoding.getPartnerCodeFromSharedPreferences(context);
    }

    public void findFollowMeLocation(Data data)
    {
        data.getGpsLocation(false, true);
    }

    public void performPreloadLocationKeySearch(Data data)
    {
        data.performLocationKeySearchForWidget("");
    }

    public void retrieveWeather(Data data, List list)
    {
        data.queueRequest(getRequests(data, list, false));
    }

    public void retrieveWeatherForFollowMe(Data data, String s)
    {
        data.queueRequest(getRequests(data, Arrays.asList(new String[] {
            s
        }), true));
    }

    public void setStartTime(long l)
    {
        startTime = l;
    }
}
