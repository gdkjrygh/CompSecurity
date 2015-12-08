// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.news.NewsResults;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.services.request.WeatherUpdateTask;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.SystemClock;
import java.util.Arrays;
import java.util.List;
import org.xml.sax.InputSource;

// Referenced classes of package com.accuweather.android.services:
//            IWeatherParser, FileWeatherRetriever

public class MockWeatherParser
    implements IWeatherParser
{

    private FileWeatherRetriever fileWeatherRetriever;

    public MockWeatherParser()
    {
        fileWeatherRetriever = new FileWeatherRetriever();
    }

    private InputSource getInputSource(String s)
    {
        return new InputSource(getClass().getClassLoader().getResourceAsStream(s));
    }

    private void initWeatherRetrieverDataSources(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "qa_fthree";
        } else
        {
            s = "qa_cthree";
        }
        fileWeatherRetriever.setCurrentConditionsInputSource(getInputSource("res/raw/qa_mock_current_conditions.json"));
        fileWeatherRetriever.setHourlyInputSource(getInputSource((new StringBuilder()).append("res/raw/").append(s).append("_hourly.json").toString()));
        fileWeatherRetriever.setDailyInputSource(getInputSource((new StringBuilder()).append("res/raw/").append(s).append("_daily.json").toString()));
        fileWeatherRetriever.setAlertsInputSource(getInputSource("res/raw/qa_mock_alerts.json"));
        fileWeatherRetriever.setNewsInputSource(getInputSource("res/raw/qa_mock_news.json"));
        fileWeatherRetriever.setVideoInputSource(getInputSource("res/raw/qa_mock_videos.xml"));
    }

    public void addMockLocation(String s, Data data)
    {
        String s1;
        LocationModel locationmodel;
        if (s.equals("2233o81"))
        {
            s1 = "F and Alert";
        } else
        {
            s1 = "C and Alert";
        }
        locationmodel = new LocationModel();
        locationmodel.setLocation(s, s1);
        locationmodel.setHome(false);
        locationmodel.setCountryId("US");
        locationmodel.setModelVersion(4);
        locationmodel.setPrettyName(s1);
        locationmodel.setAdminAreaId("PA");
        locationmodel.setCountryId("US");
        locationmodel.setCoordinates(Double.valueOf(40D), Double.valueOf(-81D));
        locationmodel.setTimezoneCode("EST");
        data.addLocation(locationmodel);
    }

    public void loadMockWeatherDataAsync(String s, Data data)
    {
        data = new WeatherUpdateTask(data);
        data.setWeatherParser(this);
        WeatherUpdateRequest weatherupdaterequest;
        int i;
        if (s.equals("2233o81"))
        {
            i = 0;
        } else
        {
            i = 1;
        }
        weatherupdaterequest = new WeatherUpdateRequest();
        weatherupdaterequest.setLocationKey(s);
        weatherupdaterequest.setMetric(i);
        weatherupdaterequest.setLangId("en");
        weatherupdaterequest.setPartnerCode("testpartnercode");
        data.execute(new List[] {
            Arrays.asList(new WeatherUpdateRequest[] {
                weatherupdaterequest
            })
        });
    }

    public WeatherDataModel parse(WeatherUpdateRequest weatherupdaterequest, Data data)
    {
        data = new WeatherDataModel();
        data.setLocationKey(weatherupdaterequest.getLocationKey());
        try
        {
            initWeatherRetrieverDataSources(weatherupdaterequest.isMetric());
            weatherupdaterequest = fileWeatherRetriever.retrieveCurrentConditions("", "", true);
            AlertResults alertresults = fileWeatherRetriever.retrieveAlerts("", "");
            com.accuweather.android.models.daily.ForecastResult forecastresult = fileWeatherRetriever.retrieveForecast("", "", true);
            com.accuweather.android.models.hourly.HourlyResults hourlyresults = fileWeatherRetriever.retrieveHourly("", "", true);
            NewsResults newsresults = fileWeatherRetriever.retrieveNews("", "", true, "");
            List list = fileWeatherRetriever.retrieveVideos("", "", "");
            data.setCurrentConditionsModel((CurrentConditionsResult)weatherupdaterequest.get(0));
            data.setAlerts(alertresults);
            data.setForecast(forecastresult);
            data.setHourly(hourlyresults);
            data.setNews(newsresults.buildNewsModels());
            data.setVideos(list);
            weatherupdaterequest = new SystemClock();
            data.setCurrentConditionUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
            data.setAlertsUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
            data.setHourlyUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
            data.setForecastUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
            data.setNewsUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
            data.setVideoUpdateTime(weatherupdaterequest.getCurrentTimeInMillis());
        }
        // Misplaced declaration of an exception variable
        catch (WeatherUpdateRequest weatherupdaterequest)
        {
            Logger.e(getClass().getName(), "Error parsing mock data", weatherupdaterequest);
            return data;
        }
        return data;
    }

    public AlertResults parseAlerts(WeatherUpdateRequest weatherupdaterequest)
        throws Exception
    {
        return fileWeatherRetriever.retrieveAlerts("", "");
    }
}
