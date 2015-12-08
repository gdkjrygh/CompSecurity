// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.news.NewsResults;
import com.accuweather.android.models.photos.PhotoResults;
import com.accuweather.android.models.quarter.QuarterResults;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.IClock;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.SystemClock;
import com.accuweather.android.utilities.Utilities;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.services:
//            IWeatherParser, ForecastService, HourlyService, AlertService, 
//            CurrentConditionService, NewsService, VideoService, MinuteCastService, 
//            QuartersService, PhotoService, ICurrentConditionService, IForecastService, 
//            IHourlyService, IMinuteCastService, IPhotoService, IQuartersService, 
//            INewsService, IVideoService, IAlertService

public class WeatherParser
    implements IWeatherParser
{

    private IAlertService alertService;
    private ICurrentConditionService currentConditionService;
    private IForecastService forecastService;
    private IHourlyService hourlyService;
    private IClock mClock;
    private IMinuteCastService minuteCastService;
    private INewsService newsService;
    private IPhotoService photoService;
    private IQuartersService quarterService;
    private IVideoService videoService;

    public WeatherParser(Context context)
    {
        forecastService = new ForecastService();
        hourlyService = new HourlyService();
        alertService = new AlertService();
        currentConditionService = new CurrentConditionService();
        newsService = new NewsService();
        videoService = new VideoService();
        minuteCastService = new MinuteCastService();
        quarterService = new QuartersService();
        mClock = new SystemClock();
        photoService = new PhotoService(context);
    }

    private WeatherDataModel buildWeatherDataModel(WeatherUpdateRequest weatherupdaterequest, AlertResults alertresults, ForecastResult forecastresult, HourlyResults hourlyresults, CurrentConditionsResults currentconditionsresults, MinuteCastResult minutecastresult, PhotoResults photoresults, 
            QuarterResults quarterresults)
    {
        String s = weatherupdaterequest.getLocationKey();
        String s1 = weatherupdaterequest.getLangId();
        boolean flag;
        if (weatherupdaterequest.getMetric() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new WeatherDataModel(s, s1, flag, forecastresult, hourlyresults, currentconditionsresults, alertresults, minutecastresult, photoresults, quarterresults);
    }

    private CurrentConditionsResults retrieveCurrentConditions(WeatherUpdateRequest weatherupdaterequest, boolean flag)
        throws Exception
    {
        return currentConditionService.retrieveCurrentConditions(weatherupdaterequest.getLocationKey(), weatherupdaterequest.getLangId(), flag);
    }

    private ForecastResult retrieveForecast(WeatherUpdateRequest weatherupdaterequest)
        throws Exception
    {
        boolean flag = true;
        IForecastService iforecastservice = forecastService;
        String s = weatherupdaterequest.getLocationKey();
        String s1 = weatherupdaterequest.getLangId();
        if (weatherupdaterequest.getMetric() != 1)
        {
            flag = false;
        }
        return iforecastservice.retrieveForecast(s, s1, flag);
    }

    private WeatherDataModel retrieveFullFreshData(WeatherUpdateRequest weatherupdaterequest, Data data)
        throws Exception, IOException
    {
        String s = weatherupdaterequest.getLocationKey();
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In parseOnlineWeatherData(), expired or current conditions need updating block, about to download fresh data for ").append(s).toString());
        }
        CurrentConditionsResults currentconditionsresults = retrieveCurrentConditions(weatherupdaterequest, true);
        Object obj = null;
        if (weatherupdaterequest.getLocationKey() != null)
        {
            obj = parseAlerts(weatherupdaterequest);
        }
        HourlyResults hourlyresults = retrieveHourly(weatherupdaterequest);
        ForecastResult forecastresult = retrieveForecast(weatherupdaterequest);
        Object obj1 = new PhotoResults();
        if (weatherupdaterequest.getWeatherContentUpdateParams().isPhotosUpdate())
        {
            obj1 = retrievePhotos(weatherupdaterequest, currentconditionsresults);
        }
        obj = buildWeatherDataModel(weatherupdaterequest, ((AlertResults) (obj)), forecastresult, hourlyresults, currentconditionsresults, retrieveMinuteCasts(weatherupdaterequest, data), ((PhotoResults) (obj1)), retrieveQuarters(weatherupdaterequest));
        obj1 = data.getLocationFromKey(s);
        if (obj1 != null)
        {
            updateWeatherModelFromLocation(((WeatherDataModel) (obj)), ((LocationModel) (obj1)));
        }
        if (!Utilities.isAndroidLite() || !PartnerCoding.getPartnerCodeFromSharedPreferences(data.getContext()).equals("androidamazonphone"))
        {
            updateNewsIfExpired(weatherupdaterequest, data, ((WeatherDataModel) (obj)));
            updateVideosIfExpired(weatherupdaterequest, data, ((WeatherDataModel) (obj)));
        }
        updateModelTimestampsForFreshData(weatherupdaterequest, data, ((WeatherDataModel) (obj)));
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("NEW MODEL: Downloaded fresh data for ").append(s).toString(), new Object[] {
                data.getContext()
            });
        }
        return ((WeatherDataModel) (obj));
    }

    private HourlyResults retrieveHourly(WeatherUpdateRequest weatherupdaterequest)
        throws Exception
    {
        boolean flag = true;
        IHourlyService ihourlyservice = hourlyService;
        String s = weatherupdaterequest.getLocationKey();
        String s1 = weatherupdaterequest.getLangId();
        if (weatherupdaterequest.getMetric() != 1)
        {
            flag = false;
        }
        return ihourlyservice.retrieveHourly(s, s1, flag);
    }

    private MinuteCastResult retrieveMinuteCasts(WeatherUpdateRequest weatherupdaterequest, Data data)
        throws IOException
    {
        boolean flag = true;
        Double double1;
        Double double2;
        String s;
        if (!shouldUpdateMinuteCast(weatherupdaterequest, data))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        data = minuteCastService;
        double1 = weatherupdaterequest.getLat();
        double2 = weatherupdaterequest.getLon();
        s = weatherupdaterequest.getLangId();
        if (weatherupdaterequest.getMetric() != 1)
        {
            flag = false;
        }
        weatherupdaterequest = data.retrieveMinuteCastResult(double1, double2, s, flag, true);
        return weatherupdaterequest;
        weatherupdaterequest;
        Logger.e(getClass().getName(), "Error in retrieveMinuteCasts", weatherupdaterequest);
        return new MinuteCastResult();
    }

    private PhotoResults retrievePhotos(WeatherUpdateRequest weatherupdaterequest, CurrentConditionsResults currentconditionsresults)
        throws Exception
    {
        return photoService.retrievePhotos(weatherupdaterequest.getLocationKey(), currentconditionsresults);
    }

    private QuarterResults retrieveQuarters(WeatherUpdateRequest weatherupdaterequest)
        throws Exception
    {
        boolean flag = true;
        IQuartersService iquartersservice = quarterService;
        String s = weatherupdaterequest.getLocationKey();
        if (weatherupdaterequest.getMetric() != 1)
        {
            flag = false;
        }
        return iquartersservice.retrieveQuarters(s, flag);
    }

    private boolean shouldUpdateMinuteCast(WeatherUpdateRequest weatherupdaterequest, Data data)
    {
        if (weatherupdaterequest.getLat() != null && weatherupdaterequest.getLon() != null)
        {
            if ((weatherupdaterequest = data.getLocationFromKey(weatherupdaterequest.getLocationKey())) != null && MinuteCastUtilities.isMinuteCastLocation(weatherupdaterequest.getCountryId(), weatherupdaterequest.getAdminAreaId()))
            {
                return true;
            }
        }
        return false;
    }

    private void updateAlerts(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws IOException
    {
        if (weatherdatamodel.areAnyAlertsExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateAlerts(), about to download fresh alert data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            if (weatherupdaterequest.getLocationKey() != null)
            {
                AlertResults alertresults = parseAlerts(weatherupdaterequest);
                if (alertresults != null)
                {
                    weatherdatamodel.setAlerts(alertresults);
                    weatherdatamodel.setAlertsUpdateTime(mClock.getCurrentTimeInMillis());
                }
            }
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded Alerts for ").append(weatherupdaterequest).toString(), new Object[] {
                    data.getContext()
                });
            }
        }
    }

    private void updateCurrentConditions(WeatherUpdateRequest weatherupdaterequest, Data data, String s, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.areCurrentConditionsExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateCurrentConditions(), about to download fresh current conditions data for ").append(s).toString());
            }
            weatherupdaterequest = retrieveCurrentConditions(weatherupdaterequest, true);
            if (weatherupdaterequest.isEmpty())
            {
                throw new IllegalStateException((new StringBuilder()).append("Current conditions results are empty for location ").append(s).toString());
            }
            weatherdatamodel.setCurrentConditionsModel((CurrentConditionsResult)weatherupdaterequest.get(0));
            weatherdatamodel.setCurrentConditionUpdateTime(mClock.getCurrentTimeInMillis());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded Current Conditions for ").append(s).toString(), new Object[] {
                    data.getContext()
                });
            }
        }
    }

    private WeatherDataModel updateExistingModel(WeatherUpdateRequest weatherupdaterequest, Data data)
        throws Exception, IOException
    {
        String s = weatherupdaterequest.getLocationKey();
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In parseOnlineWeatherData(), existing model block, about to reuse existing model for ").append(s).toString());
        }
        WeatherDataModel weatherdatamodel = data.getWeatherDataModelFromCode(s);
        WeatherContentUpdateParams weathercontentupdateparams = weatherupdaterequest.getWeatherContentUpdateParams();
        if (weathercontentupdateparams.isCurrentConditionsUpdate())
        {
            updateCurrentConditions(weatherupdaterequest, data, s, weatherdatamodel);
        }
        if (weathercontentupdateparams.isAlertsUpdate())
        {
            updateAlerts(weatherupdaterequest, data, weatherdatamodel);
        }
        if (weathercontentupdateparams.isHourlyUpdate())
        {
            updateHourly(weatherupdaterequest, data, weatherdatamodel);
        }
        if (weathercontentupdateparams.isDailyUpdate())
        {
            updateForecasts(weatherupdaterequest, data, weatherdatamodel);
        }
        if (weathercontentupdateparams.isMinuteCastUpdate())
        {
            updateMinuteCasts(weatherupdaterequest, data, weatherdatamodel);
        }
        if (weathercontentupdateparams.isPhotosUpdate())
        {
            updatePhotoResults(weatherupdaterequest, data, weatherdatamodel);
        }
        if (weathercontentupdateparams.isHourlyUpdate())
        {
            updateQuarter(weatherupdaterequest, data, weatherdatamodel);
        }
        if (!Utilities.isAndroidLite())
        {
            if (weathercontentupdateparams.isNewsUpdate())
            {
                updateNewsIfExpired(weatherupdaterequest, data, weatherdatamodel);
            }
            if (weathercontentupdateparams.isVideoUpdate())
            {
                updateVideosIfExpired(weatherupdaterequest, data, weatherdatamodel);
            }
        }
        return weatherdatamodel;
    }

    private void updateForecasts(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.isForecastExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateForecasts(), isForecastExpired block. About to download fresh forecast data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            weatherdatamodel.setForecast(retrieveForecast(weatherupdaterequest));
            weatherdatamodel.setForecastUpdateTime(mClock.getCurrentTimeInMillis());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded Forecasts for ").append(weatherupdaterequest.getLocationKey()).toString(), new Object[] {
                    data.getContext()
                });
            }
        }
    }

    private void updateHourly(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.isHourlyExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateHourly(), isHourlyExpired block. About to download fresh hourly data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            weatherdatamodel.setHourly(retrieveHourly(weatherupdaterequest));
            weatherdatamodel.setHourlyUpdateTime(mClock.getCurrentTimeInMillis());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded hourly for ").append(weatherupdaterequest.getLocationKey()).toString(), new Object[] {
                    data.getContext()
                });
            }
        }
    }

    private void updateMinuteCasts(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.areMinuteCastsExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateMinuteCasts(), areMinuteCastsExpired block. About to download fresh minuteCast data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            weatherdatamodel.setMinuteCastResult(retrieveMinuteCasts(weatherupdaterequest, data));
            weatherdatamodel.setMinuteCastUpdateTime(mClock.getCurrentTimeInMillis());
        }
    }

    private void updateModelTimestampsForFreshData(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
    {
        long l = mClock.getCurrentTimeInMillis();
        weatherdatamodel.setCurrentConditionUpdateTime(l);
        weatherdatamodel.setAlertsUpdateTime(l);
        weatherdatamodel.setForecastUpdateTime(l);
        weatherdatamodel.setHourlyUpdateTime(l);
        if (shouldUpdateMinuteCast(weatherupdaterequest, data))
        {
            weatherdatamodel.setMinuteCastUpdateTime(l);
        }
        if (!Utilities.isAndroidLite())
        {
            weatherdatamodel.setVideoUpdateTime(l);
        }
    }

    private void updateNews(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        boolean flag = true;
        INewsService inewsservice;
        String s;
        String s1;
        inewsservice = newsService;
        s = weatherupdaterequest.getLocationKey();
        s1 = weatherupdaterequest.getLangId();
        if (weatherupdaterequest.getMetric() != 1)
        {
            flag = false;
        }
        weatherdatamodel.setNews(inewsservice.retrieveNews(s, s1, flag, weatherupdaterequest.getPartnerCode()).buildNewsModels());
        weatherdatamodel.setNewsUpdateTime(mClock.getCurrentTimeInMillis());
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded News for ").append(weatherupdaterequest.getLocationKey()).toString(), new Object[] {
                data.getContext()
            });
        }
        return;
        weatherupdaterequest;
    }

    private void updateNewsIfExpired(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.areNewsExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateNews(), about to download fresh news data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            updateNews(weatherupdaterequest, data, weatherdatamodel);
        }
    }

    private void updatePhotoResults(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.arePhotoResultsExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updatePhotoResults(), arePhotoResultsexpired block. About to download fresh photo data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            weatherdatamodel.setPhotoResults(retrievePhotos(weatherupdaterequest, retrieveCurrentConditions(weatherupdaterequest, false)));
            weatherdatamodel.setPhotoResultsUpdateTime(mClock.getCurrentTimeInMillis());
        }
    }

    private void updateQuarter(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.isHourlyExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateQuarter(), isQuarterExpired block. About to download fresh hourly data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            weatherdatamodel.setQuartersResults(retrieveQuarters(weatherupdaterequest));
            weatherdatamodel.setQuarterUpdateTime(mClock.getCurrentTimeInMillis());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded hourly for ").append(weatherupdaterequest.getLocationKey()).toString(), new Object[] {
                    data.getContext()
                });
            }
        }
    }

    private void updateVideos(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        try
        {
            weatherdatamodel.setVideos(videoService.retrieveVideos(weatherupdaterequest.getPartnerCode(), weatherdatamodel.getCountry(), weatherdatamodel.getVideoClipCode()));
            weatherdatamodel.setVideoUpdateTime(mClock.getCurrentTimeInMillis());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("EXISTING MODEL: Downloaded Videos for ").append(weatherupdaterequest.getLocationKey()).toString(), new Object[] {
                    data.getContext()
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WeatherUpdateRequest weatherupdaterequest)
        {
            return;
        }
    }

    private void updateVideosIfExpired(WeatherUpdateRequest weatherupdaterequest, Data data, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        if (weatherdatamodel.areVideosExpired(mClock))
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In updateVideos(), about to download fresh videos data for ").append(weatherupdaterequest.getLocationKey()).toString());
            }
            updateVideos(weatherupdaterequest, data, weatherdatamodel);
        }
    }

    private void updateWeatherModelFromLocation(WeatherDataModel weatherdatamodel, LocationModel locationmodel)
    {
        weatherdatamodel.setCityName(locationmodel.getAliasedName());
        weatherdatamodel.setStateAbrev(locationmodel.getAdminAreaId());
        weatherdatamodel.setPostalCode(locationmodel.getPostalCode());
        weatherdatamodel.setLatitude(locationmodel.getLatitude());
        weatherdatamodel.setLongitude(locationmodel.getLongitude());
        weatherdatamodel.setCountry(locationmodel.getCountryId());
        weatherdatamodel.setTimeZoneAbbrev(locationmodel.getTimezoneCode());
        weatherdatamodel.setVideoClipCode(locationmodel.getVideoCode());
    }

    public WeatherDataModel parse(WeatherUpdateRequest weatherupdaterequest, Data data)
        throws IOException
    {
        try
        {
            if (data.isFullWeatherUpdateRequired(weatherupdaterequest))
            {
                return retrieveFullFreshData(weatherupdaterequest, data);
            }
            weatherupdaterequest = updateExistingModel(weatherupdaterequest, data);
        }
        // Misplaced declaration of an exception variable
        catch (WeatherUpdateRequest weatherupdaterequest)
        {
            Logger.e(getClass().getName(), "Error in parseOnlineWeatherData():", weatherupdaterequest);
            throw new IOException(weatherupdaterequest.getMessage());
        }
        return weatherupdaterequest;
    }

    public AlertResults parseAlerts(WeatherUpdateRequest weatherupdaterequest)
        throws IOException
    {
        try
        {
            weatherupdaterequest = alertService.retrieveAlert(weatherupdaterequest.getLocationKey(), weatherupdaterequest.getLangId());
        }
        // Misplaced declaration of an exception variable
        catch (WeatherUpdateRequest weatherupdaterequest)
        {
            Logger.e(getClass().getName(), "Error in parseAlerts", weatherupdaterequest);
            return new AlertResults();
        }
        return weatherupdaterequest;
    }

    public void setAlertService(IAlertService ialertservice)
    {
        alertService = ialertservice;
    }

    public void setCurrentConditionService(ICurrentConditionService icurrentconditionservice)
    {
        currentConditionService = icurrentconditionservice;
    }

    public void setForecastService(IForecastService iforecastservice)
    {
        forecastService = iforecastservice;
    }

    public void setHourlyService(IHourlyService ihourlyservice)
    {
        hourlyService = ihourlyservice;
    }

    public void setMinuteCastService(IMinuteCastService iminutecastservice)
    {
        minuteCastService = iminutecastservice;
    }

    public void setNewsService(INewsService inewsservice)
    {
        newsService = inewsservice;
    }

    public void setVideoService(IVideoService ivideoservice)
    {
        videoService = ivideoservice;
    }
}
