// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.current.CurrentConditionsWind;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.news.NewsModel;
import com.accuweather.android.models.photos.PhotoResults;
import com.accuweather.android.models.quarter.QuarterResults;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.IClock;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.accuweather.android.models:
//            VideoModel, MetricImperial, Measurement, Direction

public class WeatherDataModel
    implements Serializable
{

    private static final int ALERT_EXPIRATION_TIME_MINUTES = 3;
    public static final int LATEST_MODEL_VERSION = 2;
    private static transient List NEWS = new ArrayList();
    private static final long serialVersionUID = 0xc00bd04afa9420d3L;
    private String alertIsActive;
    private List alerts;
    private String canonicalLocationKey;
    private String canonicalPostalCode;
    private String cityName;
    private String country;
    private CurrentConditionsResult currentConditionsResult;
    private String dmaId;
    private ForecastResult forecastResult;
    private HourlyResults hourlyResults;
    private boolean isMetric;
    private boolean isPrimaryLocation;
    private boolean isResultOfGpsSearch;
    private String language;
    private long lastAlertUpdateTime;
    private Double latitude;
    private String locationKey;
    private Double longitude;
    private MinuteCastResult minuteCastResult;
    private int modelVersion;
    private PhotoResults photoResults;
    private String postalCode;
    private QuarterResults quartersResults;
    private String stateAbrev;
    private String timeZoneAbbrev;
    private String videoClipCode;
    private List videos;

    public WeatherDataModel()
    {
        cityName = "";
        stateAbrev = "";
        alertIsActive = "false";
        language = "0";
        videoClipCode = "";
        country = "";
        postalCode = "";
        timeZoneAbbrev = "";
        locationKey = "";
        currentConditionsResult = new CurrentConditionsResult();
        forecastResult = new ForecastResult();
        hourlyResults = new HourlyResults();
        videos = new ArrayList();
        alerts = new ArrayList();
        minuteCastResult = new MinuteCastResult();
        photoResults = new PhotoResults();
        quartersResults = new QuarterResults();
        lastAlertUpdateTime = 0L;
        isResultOfGpsSearch = false;
        modelVersion = 0;
    }

    public WeatherDataModel(String s, String s1, boolean flag, ForecastResult forecastresult, HourlyResults hourlyresults, CurrentConditionsResults currentconditionsresults, AlertResults alertresults, 
            MinuteCastResult minutecastresult, PhotoResults photoresults, QuarterResults quarterresults)
    {
        cityName = "";
        stateAbrev = "";
        alertIsActive = "false";
        language = "0";
        videoClipCode = "";
        country = "";
        postalCode = "";
        timeZoneAbbrev = "";
        locationKey = "";
        currentConditionsResult = new CurrentConditionsResult();
        forecastResult = new ForecastResult();
        hourlyResults = new HourlyResults();
        videos = new ArrayList();
        alerts = new ArrayList();
        minuteCastResult = new MinuteCastResult();
        photoResults = new PhotoResults();
        quartersResults = new QuarterResults();
        lastAlertUpdateTime = 0L;
        isResultOfGpsSearch = false;
        modelVersion = 0;
        setLocationKey(s);
        setLanguage(s1);
        setMetric(flag);
        if (currentconditionsresults.isEmpty())
        {
            throw new IllegalStateException("Current conditions results are empty!");
        }
        if (alertresults != null && !alertresults.isEmpty())
        {
            setAlerts(alertresults);
        }
        setHourly(hourlyresults);
        setForecast(forecastresult);
        setMinuteCastResult(minutecastresult);
        setPhotoResults(photoresults);
        setQuartersResults(quarterresults);
        setCurrentConditionsModel((CurrentConditionsResult)currentconditionsresults.get(0));
        setModelVersion(2);
    }

    private int calculateNumberOfHourlyItemsToUse()
    {
        if (getHourly().size() > 24)
        {
            return 24;
        } else
        {
            return getHourly().size();
        }
    }

    private boolean isCurrentConditionsValid()
    {
        return getTemperature() != null;
    }

    private boolean isForecastValid()
    {
        return getForecast() != null && getForecast().getDailyForecasts() != null && !getForecast().getDailyForecasts().isEmpty();
    }

    private boolean isHourlyValid()
    {
        return getHourly() != null && !getHourly().isEmpty();
    }

    private boolean isMinuteCastResultValid()
    {
        return getMinuteCastResult() != null;
    }

    private boolean isNewsValid()
    {
        return getNews() != null && !getNews().isEmpty();
    }

    private boolean isPhotoResultValid()
    {
        return getPhotoResults() != null;
    }

    private boolean isVideoValid()
    {
        return getVideos() != null && !getVideos().isEmpty();
    }

    public boolean areAnyAlertsExpired(IClock iclock)
    {
        return DateUtils.isExpired(iclock, lastAlertUpdateTime, 3);
    }

    public boolean areAnySubModelsExpired(IClock iclock)
    {
        boolean flag = areCurrentConditionsExpired(iclock);
        boolean flag1 = areAnyAlertsExpired(iclock);
        boolean flag2 = isHourlyExpired(iclock);
        boolean flag3 = isForecastExpired(iclock);
        boolean flag4 = areNewsExpired(iclock);
        boolean flag5 = areVideosExpired(iclock);
        boolean flag6 = areMinuteCastsExpired(iclock);
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In areAnySubModelsExpired(), currentExpired = ").append(flag).append(", alertExpired = ").append(flag1).append(", hourlyExpired = ").append(flag2).append(", forecastExpired = ").append(flag3).append(", newsExpired = ").append(flag4).append(", videosExpired = ").append(flag5).append(", minuteCastExpired = ").append(flag6).toString());
        }
        return flag || flag1 || flag2 || flag3 || flag4 || flag5 || flag6;
    }

    public boolean areCurrentConditionsExpired(IClock iclock)
    {
        boolean flag;
        if (!isCurrentConditionsValid())
        {
            flag = false;
        } else
        {
            boolean flag1 = getCurrentConditionsModel().isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In areCurrentConditionsExpired(), expired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean areMinuteCastsExpired(IClock iclock)
    {
        boolean flag;
        if (!isMinuteCastResultValid())
        {
            flag = true;
        } else
        {
            boolean flag1 = getMinuteCastResult().isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In areMinuteCastsExpired(), expired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean areNewsExpired(IClock iclock)
    {
        boolean flag;
        if (!isNewsValid())
        {
            flag = true;
        } else
        {
            boolean flag1 = ((NewsModel)getNews().get(0)).isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In areNewsExpired(), expired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean arePhotoResultsExpired(IClock iclock)
    {
        boolean flag;
        if (!isPhotoResultValid())
        {
            flag = true;
        } else
        {
            boolean flag1 = getPhotoResults().isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In arePhotoResults(), expired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean areVideosExpired(IClock iclock)
    {
        boolean flag;
        if (!isVideoValid())
        {
            flag = true;
        } else
        {
            boolean flag1 = ((VideoModel)getVideos().get(0)).isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In areVideosExpired(), expired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public String buildPrettyDebugString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = new SystemClock();
        StringBuilder stringbuilder1;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (isHourlyValid())
        {
            l = getHourly().getUpdateTime();
        } else
        {
            l = 0L;
        }
        if (isForecastValid())
        {
            l1 = getForecast().getUpdateTime();
        } else
        {
            l1 = 0L;
        }
        if (isNewsValid())
        {
            l2 = ((NewsModel)getNews().get(0)).getUpdateTime();
        } else
        {
            l2 = 0L;
        }
        if (isVideoValid())
        {
            l3 = ((VideoModel)getVideos().get(0)).getUpdateTime();
        } else
        {
            l3 = 0L;
        }
        if (isMinuteCastResultValid())
        {
            l4 = getMinuteCastResult().getUpdateTime();
        } else
        {
            l4 = 0L;
        }
        flag = areCurrentConditionsExpired(((IClock) (obj)));
        flag1 = isHourlyExpired(((IClock) (obj)));
        flag2 = isForecastExpired(((IClock) (obj)));
        flag3 = areNewsExpired(((IClock) (obj)));
        flag4 = areVideosExpired(((IClock) (obj)));
        flag5 = areMinuteCastsExpired(((IClock) (obj)));
        stringbuilder.append("City: ").append(getCityName()).append("\n");
        stringbuilder.append("State: ").append(getStateAbrev()).append("\n");
        stringbuilder.append("Postal Code: ").append(getPostalCode()).append("\n");
        stringbuilder.append("Canonical Postal Code: ").append(getCanonicalPostalCode()).append("\n");
        stringbuilder.append("Country: ").append(getCountry()).append("\n");
        stringbuilder.append("Location Key: ").append(getLocationKey()).append("\n");
        stringbuilder.append("Canonical Location Key: ").append(getCanonicalLocationKey()).append("\n");
        stringbuilder.append("Model Version: ").append(modelVersion).append("\n");
        stringbuilder.append("Lat: ").append(getLatitude()).append("\n");
        stringbuilder.append("Lon: ").append(getLongitude()).append("\n");
        stringbuilder.append("Observation Time: ").append(getLocalObservationDateTime()).append("\n");
        stringbuilder.append("Current Conditions Update Time: ").append(new Date(getCurrentConditionsUpdateTime())).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("Alerts Update Time: ").append(new Date(lastAlertUpdateTime)).append("\n");
        stringbuilder.append("Hourly Update Time: ").append(new Date(l)).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag1)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("Daily Update Time: ").append(new Date(l1)).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag2)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("News Update Time: ").append(new Date(l2)).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag3)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("Video Update Time: ").append(new Date(l3)).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag4)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        stringbuilder.append("MinuteCast Update Time: ").append(new Date(l4)).append("\n");
        stringbuilder1 = stringbuilder.append("  - expired? ");
        if (flag5)
        {
            obj = "TRUE";
        } else
        {
            obj = "";
        }
        stringbuilder1.append(((String) (obj))).append("\n");
        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof WeatherDataModel))
            {
                return false;
            }
            obj = (WeatherDataModel)obj;
            if (isMetric != ((WeatherDataModel) (obj)).isMetric)
            {
                return false;
            }
            if (isPrimaryLocation != ((WeatherDataModel) (obj)).isPrimaryLocation)
            {
                return false;
            }
            if (isResultOfGpsSearch != ((WeatherDataModel) (obj)).isResultOfGpsSearch)
            {
                return false;
            }
            if (lastAlertUpdateTime != ((WeatherDataModel) (obj)).lastAlertUpdateTime)
            {
                return false;
            }
            if (modelVersion != ((WeatherDataModel) (obj)).modelVersion)
            {
                return false;
            }
            if (alertIsActive == null ? ((WeatherDataModel) (obj)).alertIsActive != null : !alertIsActive.equals(((WeatherDataModel) (obj)).alertIsActive))
            {
                return false;
            }
            if (alerts == null ? ((WeatherDataModel) (obj)).alerts != null : !alerts.equals(((WeatherDataModel) (obj)).alerts))
            {
                return false;
            }
            if (canonicalLocationKey == null ? ((WeatherDataModel) (obj)).canonicalLocationKey != null : !canonicalLocationKey.equals(((WeatherDataModel) (obj)).canonicalLocationKey))
            {
                return false;
            }
            if (canonicalPostalCode == null ? ((WeatherDataModel) (obj)).canonicalPostalCode != null : !canonicalPostalCode.equals(((WeatherDataModel) (obj)).canonicalPostalCode))
            {
                return false;
            }
            if (cityName == null ? ((WeatherDataModel) (obj)).cityName != null : !cityName.equals(((WeatherDataModel) (obj)).cityName))
            {
                return false;
            }
            if (country == null ? ((WeatherDataModel) (obj)).country != null : !country.equals(((WeatherDataModel) (obj)).country))
            {
                return false;
            }
            if (currentConditionsResult == null ? ((WeatherDataModel) (obj)).currentConditionsResult != null : !currentConditionsResult.equals(((WeatherDataModel) (obj)).currentConditionsResult))
            {
                return false;
            }
            if (dmaId == null ? ((WeatherDataModel) (obj)).dmaId != null : !dmaId.equals(((WeatherDataModel) (obj)).dmaId))
            {
                return false;
            }
            if (forecastResult == null ? ((WeatherDataModel) (obj)).forecastResult != null : !forecastResult.equals(((WeatherDataModel) (obj)).forecastResult))
            {
                return false;
            }
            if (hourlyResults == null ? ((WeatherDataModel) (obj)).hourlyResults != null : !hourlyResults.equals(((WeatherDataModel) (obj)).hourlyResults))
            {
                return false;
            }
            if (language == null ? ((WeatherDataModel) (obj)).language != null : !language.equals(((WeatherDataModel) (obj)).language))
            {
                return false;
            }
            if (latitude == null ? ((WeatherDataModel) (obj)).latitude != null : !latitude.equals(((WeatherDataModel) (obj)).latitude))
            {
                return false;
            }
            if (locationKey == null ? ((WeatherDataModel) (obj)).locationKey != null : !locationKey.equals(((WeatherDataModel) (obj)).locationKey))
            {
                return false;
            }
            if (longitude == null ? ((WeatherDataModel) (obj)).longitude != null : !longitude.equals(((WeatherDataModel) (obj)).longitude))
            {
                return false;
            }
            if (minuteCastResult == null ? ((WeatherDataModel) (obj)).minuteCastResult != null : !minuteCastResult.equals(((WeatherDataModel) (obj)).minuteCastResult))
            {
                return false;
            }
            if (photoResults == null ? ((WeatherDataModel) (obj)).photoResults != null : !photoResults.equals(((WeatherDataModel) (obj)).photoResults))
            {
                return false;
            }
            if (postalCode == null ? ((WeatherDataModel) (obj)).postalCode != null : !postalCode.equals(((WeatherDataModel) (obj)).postalCode))
            {
                return false;
            }
            if (quartersResults == null ? ((WeatherDataModel) (obj)).quartersResults != null : !quartersResults.equals(((WeatherDataModel) (obj)).quartersResults))
            {
                return false;
            }
            if (stateAbrev == null ? ((WeatherDataModel) (obj)).stateAbrev != null : !stateAbrev.equals(((WeatherDataModel) (obj)).stateAbrev))
            {
                return false;
            }
            if (timeZoneAbbrev == null ? ((WeatherDataModel) (obj)).timeZoneAbbrev != null : !timeZoneAbbrev.equals(((WeatherDataModel) (obj)).timeZoneAbbrev))
            {
                return false;
            }
            if (videoClipCode == null ? ((WeatherDataModel) (obj)).videoClipCode != null : !videoClipCode.equals(((WeatherDataModel) (obj)).videoClipCode))
            {
                return false;
            }
            if (videos == null ? ((WeatherDataModel) (obj)).videos != null : !videos.equals(((WeatherDataModel) (obj)).videos))
            {
                return false;
            }
        }
        return true;
    }

    public boolean getAlertIsActive()
    {
        return Boolean.parseBoolean(alertIsActive);
    }

    public List getAlerts()
    {
        return alerts;
    }

    public String getCanonicalLocationKey()
    {
        return canonicalLocationKey;
    }

    public String getCanonicalPostalCode()
    {
        return canonicalPostalCode;
    }

    public HourlyResults getCappedHourlyModels()
    {
        HourlyResults hourlyresults = new HourlyResults();
        int j = calculateNumberOfHourlyItemsToUse();
        for (int i = 0; i < j; i++)
        {
            hourlyresults.add(getHourly().get(i));
        }

        return hourlyresults;
    }

    public String getCityName()
    {
        return cityName;
    }

    public String getCloudCover()
    {
        return currentConditionsResult.getCloudCover();
    }

    public String getCountry()
    {
        return country;
    }

    public CurrentConditionsResult getCurrentConditionsModel()
    {
        return currentConditionsResult;
    }

    public long getCurrentConditionsUpdateTime()
    {
        return currentConditionsResult.getUpdateTime();
    }

    public ArrayList getDayForecasts()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < getForecast().getDailyForecasts().size(); i++)
        {
            arraylist.add(((DailyForecast)getForecast().getDailyForecasts().get(i)).getDay());
        }

        return arraylist;
    }

    public Integer getDewPoint()
    {
        if (currentConditionsResult.getDewPoint() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getDewPoint().getMetric() != null && currentConditionsResult.getDewPoint().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getDewPoint().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getDewPoint().getImperial() != null && currentConditionsResult.getDewPoint().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getDewPoint().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public String getDmaId()
    {
        return dmaId;
    }

    public ForecastResult getForecast()
    {
        return forecastResult;
    }

    public String getGmtOffset()
    {
        if (getLocalObservationDateTime() != null)
        {
            return getLocalObservationDateTime().substring(19);
        } else
        {
            return null;
        }
    }

    public Integer getGustSpeed()
    {
        if (currentConditionsResult.getWindGust() != null && currentConditionsResult.getWindGust().getSpeed() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getWind().getSpeed().getMetric() != null && currentConditionsResult.getWindGust().getSpeed().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getWindGust().getSpeed().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getWind().getSpeed().getImperial() != null && currentConditionsResult.getWindGust().getSpeed().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getWindGust().getSpeed().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public HourlyResults getHourly()
    {
        return hourlyResults;
    }

    public Double getHumidity()
    {
        return currentConditionsResult.getRelativeHumidity();
    }

    public String getIconCode()
    {
        return StringUtils.padLeft((new StringBuilder()).append(currentConditionsResult.getWeatherIcon()).append("").toString(), '0', 2);
    }

    public boolean getIsDaylight()
    {
        return currentConditionsResult.isDayTime().booleanValue();
    }

    public String getLanguage()
    {
        return language;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public String getLocalObservationDateTime()
    {
        return currentConditionsResult.getLocalObservationDateTime();
    }

    public String getLocationKey()
    {
        return locationKey;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public MinuteCastResult getMinuteCastResult()
    {
        return minuteCastResult;
    }

    public String getMobileSiteUrl()
    {
        return currentConditionsResult.getMobileLink();
    }

    public int getModelVersion()
    {
        return modelVersion;
    }

    public List getNews()
    {
        return NEWS;
    }

    public ArrayList getNightForecasts()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < getForecast().getDailyForecasts().size(); i++)
        {
            arraylist.add(((DailyForecast)getForecast().getDailyForecasts().get(i)).getNight());
        }

        return arraylist;
    }

    public long getObservationEpochTime()
    {
        return currentConditionsResult.getEpochTime().longValue();
    }

    public PhotoResults getPhotoResults()
    {
        return photoResults;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public Double getPressure()
    {
        if (currentConditionsResult.getPressure() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getPressure().getMetric() != null)
                {
                    return currentConditionsResult.getPressure().getMetric().getValue();
                }
            } else
            if (currentConditionsResult.getPressure().getImperial() != null)
            {
                return currentConditionsResult.getPressure().getImperial().getValue();
            }
        }
        return null;
    }

    public QuarterResults getQuartersResults()
    {
        return quartersResults;
    }

    public Integer getRealfeel()
    {
        if (currentConditionsResult.getRealFeelTemperature() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getRealFeelTemperature().getMetric() != null && currentConditionsResult.getRealFeelTemperature().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getRealFeelTemperature().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getRealFeelTemperature().getImperial() != null && currentConditionsResult.getRealFeelTemperature().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getRealFeelTemperature().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public String getStateAbrev()
    {
        return stateAbrev;
    }

    public String getTempUnit()
    {
        if (currentConditionsResult.getTemperature() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getTemperature().getMetric() != null)
                {
                    return currentConditionsResult.getTemperature().getMetric().getUnit();
                }
            } else
            if (currentConditionsResult.getTemperature().getImperial() != null)
            {
                return currentConditionsResult.getTemperature().getImperial().getUnit();
            }
        }
        return null;
    }

    public Integer getTemperature()
    {
        if (currentConditionsResult.getTemperature() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getTemperature().getMetric() != null && currentConditionsResult.getTemperature().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getTemperature().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getTemperature().getImperial() != null && currentConditionsResult.getTemperature().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getTemperature().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public String getText()
    {
        return currentConditionsResult.getWeatherText();
    }

    public String getTimeZoneAbbrev()
    {
        return timeZoneAbbrev;
    }

    public String getTraditionalSiteUrl()
    {
        return currentConditionsResult.getLink();
    }

    public Integer getUv()
    {
        return currentConditionsResult.getUVIndex();
    }

    public String getVideoClipCode()
    {
        return videoClipCode;
    }

    public List getVideos()
    {
        return videos;
    }

    public Integer getVisibility()
    {
        if (currentConditionsResult.getVisibility() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getVisibility().getMetric() != null && currentConditionsResult.getVisibility().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getVisibility().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getVisibility().getImperial() != null && currentConditionsResult.getVisibility().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getVisibility().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public String getWindDirection()
    {
        if (currentConditionsResult.getWind() != null && currentConditionsResult.getWind().getDirection() != null)
        {
            return currentConditionsResult.getWind().getDirection().getLocalized();
        } else
        {
            return null;
        }
    }

    public Integer getWindSpeed()
    {
        if (currentConditionsResult.getWind() != null && currentConditionsResult.getWind().getSpeed() != null)
        {
            if (isMetric())
            {
                if (currentConditionsResult.getWind().getSpeed().getMetric() != null && currentConditionsResult.getWind().getSpeed().getMetric().getValue() != null)
                {
                    return Integer.valueOf(currentConditionsResult.getWind().getSpeed().getMetric().getValue().intValue());
                }
            } else
            if (currentConditionsResult.getWind().getSpeed().getImperial() != null && currentConditionsResult.getWind().getSpeed().getImperial().getValue() != null)
            {
                return Integer.valueOf(currentConditionsResult.getWind().getSpeed().getImperial().getValue().intValue());
            }
        }
        return null;
    }

    public boolean hasNewsStories()
    {
        while (NEWS == null || NEWS.size() <= 0) 
        {
            return false;
        }
        return true;
    }

    public boolean hasVideos()
    {
        while (videos == null || videos.size() <= 0) 
        {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        int i6 = 1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int j6;
        if (cityName != null)
        {
            i = cityName.hashCode();
        } else
        {
            i = 0;
        }
        if (stateAbrev != null)
        {
            j = stateAbrev.hashCode();
        } else
        {
            j = 0;
        }
        if (alertIsActive != null)
        {
            k = alertIsActive.hashCode();
        } else
        {
            k = 0;
        }
        if (latitude != null)
        {
            l = latitude.hashCode();
        } else
        {
            l = 0;
        }
        if (longitude != null)
        {
            i1 = longitude.hashCode();
        } else
        {
            i1 = 0;
        }
        if (isMetric)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (language != null)
        {
            k1 = language.hashCode();
        } else
        {
            k1 = 0;
        }
        if (videoClipCode != null)
        {
            l1 = videoClipCode.hashCode();
        } else
        {
            l1 = 0;
        }
        if (country != null)
        {
            i2 = country.hashCode();
        } else
        {
            i2 = 0;
        }
        if (postalCode != null)
        {
            j2 = postalCode.hashCode();
        } else
        {
            j2 = 0;
        }
        if (timeZoneAbbrev != null)
        {
            k2 = timeZoneAbbrev.hashCode();
        } else
        {
            k2 = 0;
        }
        if (locationKey != null)
        {
            l2 = locationKey.hashCode();
        } else
        {
            l2 = 0;
        }
        if (canonicalLocationKey != null)
        {
            i3 = canonicalLocationKey.hashCode();
        } else
        {
            i3 = 0;
        }
        if (canonicalPostalCode != null)
        {
            j3 = canonicalPostalCode.hashCode();
        } else
        {
            j3 = 0;
        }
        if (currentConditionsResult != null)
        {
            k3 = currentConditionsResult.hashCode();
        } else
        {
            k3 = 0;
        }
        if (forecastResult != null)
        {
            l3 = forecastResult.hashCode();
        } else
        {
            l3 = 0;
        }
        if (hourlyResults != null)
        {
            i4 = hourlyResults.hashCode();
        } else
        {
            i4 = 0;
        }
        if (videos != null)
        {
            j4 = videos.hashCode();
        } else
        {
            j4 = 0;
        }
        if (alerts != null)
        {
            k4 = alerts.hashCode();
        } else
        {
            k4 = 0;
        }
        if (minuteCastResult != null)
        {
            l4 = minuteCastResult.hashCode();
        } else
        {
            l4 = 0;
        }
        if (photoResults != null)
        {
            i5 = photoResults.hashCode();
        } else
        {
            i5 = 0;
        }
        if (quartersResults != null)
        {
            j5 = quartersResults.hashCode();
        } else
        {
            j5 = 0;
        }
        j6 = (int)(lastAlertUpdateTime ^ lastAlertUpdateTime >>> 32);
        if (isPrimaryLocation)
        {
            k5 = 1;
        } else
        {
            k5 = 0;
        }
        if (dmaId != null)
        {
            l5 = dmaId.hashCode();
        } else
        {
            l5 = 0;
        }
        if (!isResultOfGpsSearch)
        {
            i6 = 0;
        }
        return (((((((((((((((((((((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + j6) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + modelVersion;
    }

    public boolean isDataValid()
    {
        return isForecastValid() && isHourlyValid() && isCurrentConditionsValid();
    }

    public boolean isForecastExpired(IClock iclock)
    {
        boolean flag;
        if (!isForecastValid())
        {
            flag = false;
        } else
        {
            boolean flag1 = getForecast().isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In isForecastExpired(), forecastExpired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean isHourlyExpired(IClock iclock)
    {
        boolean flag;
        if (!isHourlyValid())
        {
            flag = false;
        } else
        {
            boolean flag1 = getHourly().isExpired(iclock);
            flag = flag1;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In isHourlyExpired(), hourlyExpired = ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }

    public boolean isLatestModelVersion()
    {
        return modelVersion == 2;
    }

    public boolean isMetric()
    {
        return isMetric;
    }

    public boolean isPrimaryLocation()
    {
        return isPrimaryLocation;
    }

    public boolean isResultOfGpsSearch()
    {
        return isResultOfGpsSearch;
    }

    public void setAlertIsActive(boolean flag)
    {
        alertIsActive = String.valueOf(flag);
    }

    public void setAlerts(AlertResults alertresults)
    {
        alerts = alertresults.toAlertModels();
        boolean flag;
        if (!alerts.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setAlertIsActive(flag);
    }

    public void setAlertsUpdateTime(long l)
    {
        lastAlertUpdateTime = l;
    }

    public void setCanonicalLocationKey(String s)
    {
        canonicalLocationKey = s;
    }

    public void setCanonicalPostalCode(String s)
    {
        canonicalPostalCode = s;
    }

    public void setCityName(String s)
    {
        cityName = s;
    }

    public void setCloudCover(String s)
    {
        currentConditionsResult.setCloudCover(s);
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCurrentConditionUpdateTime(long l)
    {
        currentConditionsResult.setUpdateTime(l);
    }

    public void setCurrentConditionsModel(CurrentConditionsResult currentconditionsresult)
    {
        currentConditionsResult = currentconditionsresult;
    }

    public void setDmaId(String s)
    {
        dmaId = s;
    }

    public void setForecast(ForecastResult forecastresult)
    {
        forecastResult = forecastresult;
    }

    public void setForecastUpdateTime(long l)
    {
        forecastResult.setUpdateTime(l);
    }

    public void setHourly(HourlyResults hourlyresults)
    {
        hourlyResults = hourlyresults;
    }

    public void setHourlyUpdateTime(long l)
    {
        hourlyResults.setUpdateTime(l);
    }

    public void setLanguage(String s)
    {
        language = s;
    }

    public void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public void setLocationKey(String s)
    {
        locationKey = s;
    }

    public void setLongitude(Double double1)
    {
        longitude = double1;
    }

    public void setMetric(boolean flag)
    {
        isMetric = flag;
    }

    public void setMinuteCastResult(MinuteCastResult minutecastresult)
    {
        minuteCastResult = minutecastresult;
    }

    public void setMinuteCastUpdateTime(long l)
    {
        minuteCastResult.setUpdateTime(l);
    }

    public void setModelVersion(int i)
    {
        modelVersion = i;
    }

    public void setNews(List list)
    {
        NEWS = list;
    }

    public void setNewsUpdateTime(long l)
    {
        for (int i = 0; i < getNews().size(); i++)
        {
            ((NewsModel)getNews().get(i)).setUpdateTime(l);
        }

    }

    public void setPhotoResults(PhotoResults photoresults)
    {
        photoResults = photoresults;
    }

    public void setPhotoResultsUpdateTime(long l)
    {
        photoResults.setUpdateTime(l);
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setPrimaryLocation(boolean flag)
    {
        isPrimaryLocation = flag;
    }

    public void setQuarterUpdateTime(long l)
    {
        quartersResults.setUpdateTime(l);
    }

    public void setQuartersResults(QuarterResults quarterresults)
    {
        quartersResults = quarterresults;
    }

    public void setResultOfGpsSearch(boolean flag)
    {
        isResultOfGpsSearch = flag;
    }

    public void setStateAbrev(String s)
    {
        stateAbrev = s;
    }

    public void setTimeZoneAbbrev(String s)
    {
        timeZoneAbbrev = s;
    }

    public void setTraditionalSiteUrl(String s)
    {
        currentConditionsResult.setLink(s);
    }

    public void setVideoClipCode(String s)
    {
        videoClipCode = s;
    }

    public void setVideoUpdateTime(long l)
    {
        for (int i = 0; i < getVideos().size(); i++)
        {
            ((VideoModel)getVideos().get(i)).setUpdateTime(l);
        }

    }

    public void setVideos(List list)
    {
        videos.clear();
        videos = list;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WeatherDataModel{cityName='").append(cityName).append('\'').append(", stateAbrev='").append(stateAbrev).append('\'').append(", alertIsActive='").append(alertIsActive).append('\'').append(", latitude=").append(latitude).append(", longitude=").append(longitude).append(", isMetric=").append(isMetric).append(", language='").append(language).append('\'').append(", videoClipCode='").append(videoClipCode).append('\'').append(", country='").append(country).append('\'').append(", postalCode='").append(postalCode).append('\'').append(", timeZoneAbbrev='").append(timeZoneAbbrev).append('\'').append(", locationKey='").append(locationKey).append('\'').append(", canonicalLocationKey='").append(canonicalLocationKey).append('\'').append(", canonicalPostalCode='").append(canonicalPostalCode).append('\'').append(", currentConditionsResult=").append(currentConditionsResult).append(", forecastResult=").append(forecastResult).append(", hourlyResults=").append(hourlyResults).append(", videos=").append(videos).append(", alerts=").append(alerts).append(", minuteCastResult=").append(minuteCastResult).append(", photoResults=").append(photoResults).append(", quartersResults=").append(quartersResults).append(", lastAlertUpdateTime=").append(lastAlertUpdateTime).append(", isPrimaryLocation=").append(isPrimaryLocation).append(", dmaId='").append(dmaId).append('\'').append(", isResultOfGpsSearch=").append(isResultOfGpsSearch).append(", modelVersion=").append(modelVersion).append('}').toString();
    }

}
