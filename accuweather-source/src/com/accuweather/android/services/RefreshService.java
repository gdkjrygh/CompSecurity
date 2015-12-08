// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.request.Request;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PreferenceUtils;
import java.util.ArrayList;
import java.util.List;

public class RefreshService
{

    private Data data;
    private String partnerCode;

    public RefreshService()
    {
    }

    private List buildAllLocationWeatherUpdateParams(String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        List list = data.getKeys();
        if (!list.contains(s))
        {
            arraylist.add(buildWeatherRequest(s, i, false));
        }
        int j = 0;
        while (j < list.size()) 
        {
            boolean flag = ((String)list.get(j)).equals(s);
            WeatherUpdateRequest weatherupdaterequest = buildWeatherRequest((String)list.get(j), i, false);
            weatherupdaterequest.setPrimaryLocation(flag);
            if (flag)
            {
                weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParamsForPrimaryLocation());
            } else
            {
                weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParamsForSecondaryLocation());
            }
            arraylist.add(weatherupdaterequest);
            j++;
        }
        return arraylist;
    }

    private WeatherUpdateRequest buildWeatherRequest(String s, int i, boolean flag)
    {
        WeatherUpdateRequest weatherupdaterequest = new WeatherUpdateRequest();
        weatherupdaterequest.setLocationKey(s);
        weatherupdaterequest.setPrimaryLocation(true);
        weatherupdaterequest.setMetric(i);
        weatherupdaterequest.setLangId(data.getLangId());
        weatherupdaterequest.setPartnerCode(partnerCode);
        if (flag)
        {
            weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParamsOnlyForMinutesCastInOneMinute());
        } else
        {
            weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParamsForPrimaryLocation());
        }
        s = data.getLocationFromKey(s);
        if (s != null)
        {
            weatherupdaterequest.setCoordinates(s.getLatitude(), s.getLongitude());
        }
        return weatherupdaterequest;
    }

    private int shouldRequestMetricData()
    {
        return Integer.parseInt(PreferenceUtils.get(data.getContext(), "pref_temp_units", data.getContext().getString(com.accuweather.android.R.string.default_metric)));
    }

    protected WeatherContentUpdateParams buildWeatherContentUpdateParamsForPrimaryLocation()
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(true);
        weathercontentupdateparams.setCurrentConditionsUpdate(true);
        weathercontentupdateparams.setDailyUpdate(true);
        weathercontentupdateparams.setHourlyUpdate(true);
        weathercontentupdateparams.setNewsUpdate(true);
        weathercontentupdateparams.setVideoUpdate(true);
        weathercontentupdateparams.setMinuteCastUpdate(true);
        return weathercontentupdateparams;
    }

    protected WeatherContentUpdateParams buildWeatherContentUpdateParamsForSecondaryLocation()
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

    protected WeatherContentUpdateParams buildWeatherContentUpdateParamsOnlyForMinutesCastInOneMinute()
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(false);
        weathercontentupdateparams.setCurrentConditionsUpdate(false);
        weathercontentupdateparams.setDailyUpdate(false);
        weathercontentupdateparams.setHourlyUpdate(false);
        weathercontentupdateparams.setNewsUpdate(false);
        weathercontentupdateparams.setVideoUpdate(false);
        weathercontentupdateparams.setMinuteCastUpdate(true);
        return weathercontentupdateparams;
    }

    public void refresh(WeatherUpdateRequest weatherupdaterequest, List list)
    {
        if (weatherupdaterequest != null)
        {
            data.queueRequest(new Request[] {
                weatherupdaterequest
            });
        }
        if (weatherupdaterequest == null || list.size() > 1)
        {
            data.queueRequest(list);
        }
    }

    public void refresh(String s)
    {
        refresh(buildWeatherRequest(s, shouldRequestMetricData(), false), ((List) (new ArrayList())));
    }

    public void refreshFollowMeForTimer(boolean flag)
    {
        LocationModel locationmodel = data.getCurrentFollowMeLocation();
        if (locationmodel != null)
        {
            WeatherUpdateRequest weatherupdaterequest = buildWeatherRequest(locationmodel.getLocKey(), shouldRequestMetricData(), flag);
            weatherupdaterequest.setResultOfGpsSearch(true);
            weatherupdaterequest.setResultOfTimerRefresh(true);
            weatherupdaterequest.setCoordinates(locationmodel.getLatitude(), locationmodel.getLongitude());
            Logger.d(getClass().getName(), (new StringBuilder()).append("*** in refreshFollowMeForTimer(), about to refresh for coordinates ").append(weatherupdaterequest.getLat()).append(", ").append(weatherupdaterequest.getLon()).toString());
            refresh(weatherupdaterequest, new ArrayList());
            return;
        } else
        {
            Logger.d(getClass().getName(), "*** in refreshFollowMeWeather(), follow me location is null!");
            return;
        }
    }

    public void refreshFollowMeWeather()
    {
        LocationModel locationmodel = data.getCurrentFollowMeLocation();
        if (locationmodel != null)
        {
            WeatherUpdateRequest weatherupdaterequest = buildWeatherRequest(locationmodel.getLocKey(), shouldRequestMetricData(), false);
            weatherupdaterequest.setResultOfGpsSearch(true);
            weatherupdaterequest.setCoordinates(locationmodel.getLatitude(), locationmodel.getLongitude());
            Logger.d(getClass().getName(), (new StringBuilder()).append("*** in refreshFollowMeWeather(), about to refresh for coordinates ").append(weatherupdaterequest.getLat()).append(", ").append(weatherupdaterequest.getLon()).toString());
            refresh(weatherupdaterequest, new ArrayList());
            return;
        } else
        {
            Logger.d(getClass().getName(), "*** in refreshFollowMeWeather(), follow me location is null!");
            return;
        }
    }

    public void refreshForAllLocations(String s)
    {
        int i = shouldRequestMetricData();
        refresh(buildWeatherRequest(s, i, false), buildAllLocationWeatherUpdateParams(s, i));
    }

    public void refreshForAllLocationsBatch(String s)
    {
        refresh(null, buildAllLocationWeatherUpdateParams(s, shouldRequestMetricData()));
    }

    public void refreshForTimer(String s, boolean flag)
    {
        s = buildWeatherRequest(s, shouldRequestMetricData(), flag);
        s.setResultOfTimerRefresh(true);
        refresh(s, new ArrayList());
    }

    public void refreshForWearable(String s)
    {
        s = buildWeatherRequest(s, shouldRequestMetricData(), false);
        s.setWearable(true);
        s.setPrimaryLocation(false);
        s.setResultOfGpsSearch(true);
        refresh(s, new ArrayList());
    }

    public void refreshPhotos(WeatherUpdateRequest weatherupdaterequest)
    {
        if (weatherupdaterequest != null)
        {
            data.queueRequest(new Request[] {
                weatherupdaterequest
            });
        }
    }

    public void setData(Data data1)
    {
        data = data1;
    }

    public void setPartnerCode(String s)
    {
        partnerCode = s;
    }
}
