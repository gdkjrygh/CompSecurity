// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.accuweather.android.models.MetricImperial;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger, PartnerCoding, MainContentPage, MinuteCastUtilities

public class AdTrackingController
{

    public static final String ADTESTKEY_AD_KEY = "adtestkey";
    public static final String APPVERSION_AD_KEY = "appversion";
    public static final String CITY_AD_KEY = "city";
    public static final String CITY_NAME_AD_KEY = "cityName";
    public static final String COUNTRY_AD_KEY = "country";
    public static final String CUHI_AD_KEY = "cuhi";
    public static final String CUWX_AD_KEY = "cuwx";
    public static final String FC1WX_AD_KEY = "fc1wx";
    private static final String FC1WX_DEFAULT = "fc1wxDefault";
    public static final String LANGUAGE_AD_KEY = "lang";
    public static final String LATITUDE_AD_KEY = "lat";
    public static final String LAT_LON_TYPE_AD_KEY = "latlontype";
    public static final String LONGITUDE_AD_KEY = "long";
    public static final String MYAWX_AD_KEY = "myawx";
    public static final String MYAWX_DEFAULT_VALUE = "myawxDefault";
    public static final String NONE_VALUE = "none";
    public static final String PARTNER_AD_KEY = "partner";
    public static final String SECTION_AD_KEY = "section";
    public static final String SECTION_DEFAULT_VALUE = "sectionDefault";
    public static final String SKYMOTION_AD_KEY = "skymotion";
    public static final String STATE_AD_KEY = "state";
    private boolean isDetailsPage;
    private boolean isGpsWeather;
    private MainContentPage selectedPage;
    private WeatherDataModel weatherDataModel;

    public AdTrackingController()
    {
    }

    private String getForecastDayOneIconCode(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && !weatherdatamodel.getForecast().getDailyForecasts().isEmpty() && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getDay() != null)
        {
            return (new StringBuilder()).append(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getDay().getIcon()).append("").toString();
        } else
        {
            return "fc1wxDefault";
        }
    }

    private String getLocationKey(WeatherDataModel weatherdatamodel)
    {
        String s = weatherdatamodel.getCanonicalLocationKey();
        if (s != null)
        {
            return s;
        } else
        {
            return weatherdatamodel.getLocationKey();
        }
    }

    public String buildDebugText(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("appversion: ").append(getAppVersion(context)).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("city: ").append(getCity()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("cityName: ").append(getCity()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("country: ").append(getCountry()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("cuhi: ").append(getCUHI()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("cuwx: ").append(getCUWX()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("fc1wx: ").append(getFC1WX()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("lang: ").append(getLanguage()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("lat: ").append(getLatitude()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("long: ").append(getLongitude()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("partner: ").append(getPartner(context)).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("skymotion: ").append(getSkyMotionValue()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("state: ").append(getState()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("section: ").append(getSection()).toString()).append(", ");
        stringbuilder.append((new StringBuilder()).append("latlontype: ").append(getLatLonType()).toString()).append(", ");
        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AdTrackingController)obj;
        if (isDetailsPage != ((AdTrackingController) (obj)).isDetailsPage)
        {
            return false;
        }
        if (selectedPage != ((AdTrackingController) (obj)).selectedPage)
        {
            return false;
        }
        if (weatherDataModel != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AdTrackingController) (obj)).weatherDataModel == null) goto _L1; else goto _L3
_L3:
        return false;
        if (weatherDataModel.equals(((AdTrackingController) (obj)).weatherDataModel)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getAppVersion(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.e(getClass().getName(), (new StringBuilder()).append("Error getting application version: ").append(context).toString());
            return "";
        }
        return context;
    }

    public String getCUHI()
    {
        if (weatherDataModel.getCurrentConditionsModel() != null && weatherDataModel.getCurrentConditionsModel().getTemperature() != null)
        {
            return (new StringBuilder()).append(weatherDataModel.getCurrentConditionsModel().getTemperature().getValue(false)).append("").toString();
        } else
        {
            return "";
        }
    }

    public String getCUWX()
    {
        return weatherDataModel.getIconCode();
    }

    public String getCity()
    {
        return getLocationKey(weatherDataModel);
    }

    public String getCityName()
    {
        return weatherDataModel.getCityName();
    }

    public String getCountry()
    {
        return weatherDataModel.getCountry();
    }

    public String getFC1WX()
    {
        return getForecastDayOneIconCode(weatherDataModel);
    }

    public String getLanguage()
    {
        return weatherDataModel.getLanguage();
    }

    public String getLatLonType()
    {
        if (isGpsWeather)
        {
            return "physical";
        } else
        {
            return "weather";
        }
    }

    public Double getLatitude()
    {
        return Double.valueOf((double)Math.round(weatherDataModel.getLatitude().doubleValue() * 100D) / 100D);
    }

    public Double getLongitude()
    {
        return Double.valueOf((double)Math.round(weatherDataModel.getLongitude().doubleValue() * 100D) / 100D);
    }

    public String getPartner(Context context)
    {
        return PartnerCoding.getPartnerCodeFromSharedPreferences(context);
    }

    public String getPostalCode()
    {
        String s = weatherDataModel.getCanonicalPostalCode();
        if (s != null)
        {
            return s;
        } else
        {
            return weatherDataModel.getPostalCode();
        }
    }

    public String getSection()
    {
        if (selectedPage == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$accuweather$android$utilities$MainContentPage[];

            static 
            {
                $SwitchMap$com$accuweather$android$utilities$MainContentPage = new int[MainContentPage.values().length];
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Hourly.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Forecast.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.News.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Maps.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Location.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Now.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.MinuteCast.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Video.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (isDetailsPage)
        {
            switch (_cls1..SwitchMap.com.accuweather.android.utilities.MainContentPage[selectedPage.ordinal()])
            {
            case 1: // '\001'
                return "hourlydetails";

            case 2: // '\002'
                return "dailydetails";

            case 3: // '\003'
                return "newsdetails";

            case 4: // '\004'
                return "mapdetails";
            }
        } else
        {
            switch (_cls1..SwitchMap.com.accuweather.android.utilities.MainContentPage[selectedPage.ordinal()])
            {
            case 1: // '\001'
                return "hourly";

            case 5: // '\005'
                return "location";

            case 6: // '\006'
                return "current";

            case 7: // '\007'
                return "minutecast";

            case 2: // '\002'
                return "daily";

            case 4: // '\004'
                return "maps";

            case 3: // '\003'
                return "news";

            case 8: // '\b'
                return "video";
            }
        }
          goto _L3
_L2:
        return "sectionDefault";
_L3:
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected int getSkyMotionValue()
    {
        if (MinuteCastUtilities.isMinuteCastLocation(weatherDataModel))
        {
            Object obj = selectedPage;
            if (MainContentPage.Now.equals(obj))
            {
                obj = weatherDataModel.getMinuteCastResult();
                if (obj != null)
                {
                    return !MinuteCastUtilities.isAllDry(((com.accuweather.android.models.minutecast.MinuteCastResult) (obj))) ? 3 : 2;
                }
            } else
            if (MainContentPage.MinuteCast.equals(obj))
            {
                return 6;
            }
        }
        return 1;
    }

    public String getState()
    {
        return weatherDataModel.getStateAbrev();
    }

    public WeatherDataModel getWeatherDataModel()
    {
        return weatherDataModel;
    }

    public int hashCode()
    {
        int j = 0;
        char c;
        int i;
        if (isDetailsPage)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (selectedPage == null)
        {
            i = 0;
        } else
        {
            i = selectedPage.hashCode();
        }
        if (weatherDataModel != null)
        {
            j = weatherDataModel.hashCode();
        }
        return ((c + 31) * 31 + i) * 31 + j;
    }

    public void setDetailsSection(boolean flag)
    {
        isDetailsPage = flag;
    }

    public void setGpsWeather(boolean flag)
    {
        isGpsWeather = flag;
    }

    public void setSelectedPage(MainContentPage maincontentpage)
    {
        selectedPage = maincontentpage;
    }

    public void setWeatherDataModel(WeatherDataModel weatherdatamodel)
    {
        weatherDataModel = weatherdatamodel;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdTrackingController [selectedPage=").append(selectedPage).append(", isDetailsPage=").append(isDetailsPage).append(", weatherDataModel=").append(weatherDataModel).append("]").toString();
    }
}
