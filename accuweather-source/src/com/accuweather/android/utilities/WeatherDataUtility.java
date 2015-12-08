// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastPrecipitationType;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.MinuteCastThresholdType;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.accuweather.android.utilities:
//            Data

public class WeatherDataUtility
{

    private static final Map precipTypeToIconName;
    public static final Map thresholdToIconName;

    public WeatherDataUtility()
    {
    }

    public static String getAddressFromWeatherDataModel(Context context, WeatherDataModel weatherdatamodel)
    {
        Object obj = null;
        weatherdatamodel = Data.getInstance(context).getLocationFromKey(weatherdatamodel.getLocationKey());
        context = obj;
        if (weatherdatamodel != null)
        {
            context = obj;
            if (weatherdatamodel.getAddress() != null)
            {
                weatherdatamodel = weatherdatamodel.getAddress();
                context = obj;
                if (weatherdatamodel != null)
                {
                    context = weatherdatamodel.getAddressForWearable();
                }
            }
        }
        return context;
    }

    public static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    public static String getHighTemperatureText(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > i && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getHighTemperature() != null)
        {
            return (new StringBuilder()).append(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public static LocationModel getLocationModel(WeatherDataModel weatherdatamodel, Context context)
    {
        LocationModel locationmodel = getData(context).getLocationFromKey(weatherdatamodel.getLocationKey());
        context = locationmodel;
        if (locationmodel == null)
        {
            context = new LocationModel();
            context.setLocKey(weatherdatamodel.getLocationKey());
            context.setLocationName(weatherdatamodel.getCityName());
            context.setPrettyName(weatherdatamodel.getCityName());
        }
        return context;
    }

    public static String getLowTemperatureText(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > i && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getLowTemperature() != null)
        {
            return (new StringBuilder()).append(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public static String getPrecipitationImageResourceName(String s, int i, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null)
        {
            weatherdatamodel = weatherdatamodel.getMinuteCastResult().getIntervals();
            if (weatherdatamodel != null && i <= weatherdatamodel.size() - 1)
            {
                weatherdatamodel = (Intervals)weatherdatamodel.get(i);
                if (weatherdatamodel.getPrecipitationType() == MinuteCastPrecipitationType.DRY || weatherdatamodel.getThreshold() == MinuteCastThresholdType.NONE)
                {
                    return (new StringBuilder()).append(s).append("no_precip").toString();
                }
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(s);
                stringbuilder.append((String)precipTypeToIconName.get(weatherdatamodel.getPrecipitationType())).append("_");
                if (weatherdatamodel.getThreshold() != MinuteCastThresholdType.NONE)
                {
                    stringbuilder.append((String)thresholdToIconName.get(weatherdatamodel.getThreshold()));
                }
                return stringbuilder.toString();
            }
        }
        return (new StringBuilder()).append(s).append("no_precip").toString();
    }

    public static String getPrecipitationImageResourceNameForWidget(String s, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null)
        {
            List list = weatherdatamodel.getMinuteCastResult().getIntervals();
            if (list != null)
            {
                for (int i = 0; i < list.size(); i++)
                {
                    weatherdatamodel = (Intervals)list.get(i);
                    if (weatherdatamodel.getPrecipitationType() != MinuteCastPrecipitationType.DRY || weatherdatamodel.getThreshold() != MinuteCastThresholdType.NONE)
                    {
                        StringBuilder stringbuilder = new StringBuilder();
                        stringbuilder.append(s);
                        stringbuilder.append((String)precipTypeToIconName.get(weatherdatamodel.getPrecipitationType())).append("_");
                        stringbuilder.append((String)thresholdToIconName.get(weatherdatamodel.getThreshold()));
                        return stringbuilder.toString();
                    }
                }

            }
        }
        return null;
    }

    public static boolean isWeatherModelValid(WeatherDataModel weatherdatamodel)
    {
        boolean flag = true;
        if (!weatherdatamodel.isDataValid())
        {
            flag = false;
        }
        if (weatherdatamodel.getCityName() == null || weatherdatamodel.getCityName().isEmpty())
        {
            flag = false;
        }
        return flag;
    }

    static 
    {
        precipTypeToIconName = new EnumMap(com/accuweather/android/models/minutecast/MinuteCastPrecipitationType);
        precipTypeToIconName.put(MinuteCastPrecipitationType.SNOW, "snow");
        precipTypeToIconName.put(MinuteCastPrecipitationType.RAIN, "rain");
        precipTypeToIconName.put(MinuteCastPrecipitationType.MIX, "mix");
        precipTypeToIconName.put(MinuteCastPrecipitationType.ICE, "ice");
        thresholdToIconName = new EnumMap(com/accuweather/android/models/minutecast/MinuteCastThresholdType);
        thresholdToIconName.put(MinuteCastThresholdType.LIGHT, "default");
        thresholdToIconName.put(MinuteCastThresholdType.LIGHT_MODERATE, "light");
        thresholdToIconName.put(MinuteCastThresholdType.MODERATE, "medium");
        thresholdToIconName.put(MinuteCastThresholdType.HEAVY, "heavy");
    }
}
