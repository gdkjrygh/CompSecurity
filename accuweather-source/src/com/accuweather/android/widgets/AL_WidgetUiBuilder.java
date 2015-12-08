// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.Utilities;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            IWidgetUiBuilder, AL_WidgetPendingIntentCreator, AccuRemoteViews

public class AL_WidgetUiBuilder
    implements IWidgetUiBuilder
{

    private static final String AL_WIDGET_ICON = "al_widget_icon_";
    private static final String LENOVO_MANUFACTURER = "lenovo";
    private static final String ZTE_MANUFACTURER = "zte";
    private RelativeLayout inflatedViewForTesting;
    private boolean isTesting;
    private Context mContext;
    private AL_WidgetPendingIntentCreator mPendingIntentCreator;
    private HashMap mWidgetIdPrimaryKeys;

    public AL_WidgetUiBuilder(Context context, HashMap hashmap)
    {
        isTesting = false;
        mPendingIntentCreator = new AL_WidgetPendingIntentCreator();
        mContext = context;
        mWidgetIdPrimaryKeys = hashmap;
    }

    private String buildTimeForRemoteView(String s)
    {
        s = s.split(" ");
        if (s.length < 2)
        {
            return s[0];
        } else
        {
            return (new StringBuilder()).append(s[0]).append(" ").append(s[1].toUpperCase()).toString();
        }
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private String getHighTemperatureText(WeatherDataModel weatherdatamodel, int i)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > i && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getHighTemperature() != null)
        {
            return (new StringBuilder()).append(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return mContext.getString(com.accuweather.android.R.string.NA);
        }
    }

    private LocationModel getLocationModel(WeatherDataModel weatherdatamodel)
    {
        LocationModel locationmodel1 = getData(mContext).getLocationFromKey(weatherdatamodel.getLocationKey());
        LocationModel locationmodel = locationmodel1;
        if (locationmodel1 == null)
        {
            locationmodel = new LocationModel();
            locationmodel.setLocKey(weatherdatamodel.getLocationKey());
            locationmodel.setLocationName(weatherdatamodel.getCityName());
            locationmodel.setPrettyName(weatherdatamodel.getCityName());
        }
        return locationmodel;
    }

    private String getLowTemperatureText(WeatherDataModel weatherdatamodel, int i)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > i && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getLowTemperature() != null)
        {
            return (new StringBuilder()).append(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return mContext.getString(com.accuweather.android.R.string.NA);
        }
    }

    private void updateAlertIcon(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        int i;
        if (weatherdatamodel.getAlertIsActive())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        remoteviews.setViewVisibility(com.accuweather.android.R.id.alert_icon, i);
    }

    private void updateCityNameTextView(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        weatherdatamodel = getLocationModel(weatherdatamodel).getAliasedName().toUpperCase();
        remoteviews.setTextViewText(com.accuweather.android.R.id.city, weatherdatamodel);
    }

    private void updateCurrentLocationTextView(int i, RemoteViews remoteviews)
    {
        if (((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i))).equals("-1"))
        {
            remoteviews.setViewVisibility(com.accuweather.android.R.id.current_location_tv, 0);
            remoteviews.setTextViewText(com.accuweather.android.R.id.current_location_tv, (new StringBuilder()).append("[").append(mContext.getString(com.accuweather.android.R.string.CurrentLocation_Abbr25)).append("]").toString());
            return;
        } else
        {
            remoteviews.setViewVisibility(com.accuweather.android.R.id.current_location_tv, 8);
            return;
        }
    }

    private void updateCurrentTempUnitsTextView(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.isMetric())
        {
            weatherdatamodel = mContext.getString(com.accuweather.android.R.string.C);
        } else
        {
            weatherdatamodel = mContext.getString(com.accuweather.android.R.string.F);
        }
        remoteviews.setTextViewText(com.accuweather.android.R.id.current_temp_units_tv, weatherdatamodel);
    }

    private void updateDayOneDayTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getDate();
        remoteviews.setTextViewText(com.accuweather.android.R.id.day_one_daytv, DateUtils.getAbbreviatedDay(weatherdatamodel, mContext.getResources().getConfiguration().locale));
    }

    private void updateDayOneHiLoTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.day_one_hilo, (new StringBuilder()).append(getHighTemperatureText(weatherdatamodel, 0)).append("/").append(getLowTemperatureText(weatherdatamodel, 0)).toString());
    }

    private void updateDayOneImage(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > 0 && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getDay() != null)
        {
            weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getDay().getIcon();
            if (weatherdatamodel != null)
            {
                int i = Utilities.getDrawableId((new StringBuilder()).append("al_widget_icon_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString());
                remoteviews.setImageViewResource(com.accuweather.android.R.id.day_one_image, i);
            }
        }
    }

    private void updateDayTwoDayTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDate();
        remoteviews.setTextViewText(com.accuweather.android.R.id.day_two_daytv, DateUtils.getAbbreviatedDay(weatherdatamodel, mContext.getResources().getConfiguration().locale));
    }

    private void updateDayTwoHiLoTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.day_two_hilo, (new StringBuilder()).append(getHighTemperatureText(weatherdatamodel, 1)).append("/").append(getLowTemperatureText(weatherdatamodel, 1)).toString());
    }

    private void updateDayTwoImage(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > 1 && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDay() != null)
        {
            weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDay().getIcon();
            if (weatherdatamodel != null)
            {
                int i = Utilities.getDrawableId((new StringBuilder()).append("al_widget_icon_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString());
                remoteviews.setImageViewResource(com.accuweather.android.R.id.day_two_image, i);
            }
        }
    }

    private void updateGetFullAppVisibility(RemoteViews remoteviews)
    {
        int j = com.accuweather.android.R.id.getfullapp_ll;
        int i;
        if (Utilities.isAndroidLite())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        remoteviews.setViewVisibility(j, i);
    }

    private void updateTimeTextView(String s, RemoteViews remoteviews)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.time, Html.fromHtml(buildTimeForRemoteView(s)));
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (Build.MANUFACTURER.toLowerCase().contains("lenovo"))
            {
                remoteviews.setTextViewTextSize(com.accuweather.android.R.id.time, 1, 34F);
            }
            if (Build.MANUFACTURER.toLowerCase().contains("zte"))
            {
                remoteviews.setTextViewTextSize(com.accuweather.android.R.id.time, 1, 32F);
            }
        }
    }

    private void updateWidgetBackground(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getCurrentConditionsModel() != null)
        {
            Integer integer = weatherdatamodel.getCurrentConditionsModel().getWeatherIcon();
            if (integer != null)
            {
                if (weatherdatamodel.getIsDaylight())
                {
                    weatherdatamodel = com.accuweather.android.utilities.AL_Widget_Constants.Icons.WIDGETBG_ICON_MAP[integer.intValue()];
                } else
                {
                    weatherdatamodel = com.accuweather.android.utilities.AL_Widget_Constants.Icons.WIDGETBG_NIGHT_ICON_MAP[integer.intValue()];
                }
                remoteviews.setImageViewResource(com.accuweather.android.R.id.widget_bg, Utilities.getDrawableId(weatherdatamodel));
            }
        }
    }

    private void updateWidgetUpdateTimeView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = weatherdatamodel.getLocalObservationDateTime();
        java.util.Locale locale = mContext.getResources().getConfiguration().locale;
        if (DateUtils.is24HourFormat(mContext.getApplicationContext()))
        {
            weatherdatamodel = DateUtils.to24HourTime(weatherdatamodel);
            remoteviews.setTextViewText(com.accuweather.android.R.id.update_time_tv, (new StringBuilder()).append(mContext.getString(com.accuweather.android.R.string.at)).append(" ").append(weatherdatamodel).toString());
            return;
        } else
        {
            weatherdatamodel = DateUtils.to12HourTimeWithAmPm(weatherdatamodel, locale);
            remoteviews.setTextViewText(com.accuweather.android.R.id.update_time_tv, (new StringBuilder()).append(mContext.getString(com.accuweather.android.R.string.at)).append(" ").append(weatherdatamodel).toString());
            return;
        }
    }

    public AccuRemoteViews buildRemoteView(int i, WeatherDataModel weatherdatamodel, String s)
    {
        AccuRemoteViews accuremoteviews = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.al_widget_current_layout, isTesting, mContext);
        updateCurrentLocationTextView(i, accuremoteviews);
        updateWidgetBackground(accuremoteviews, weatherdatamodel);
        updateTimeTextView(s, accuremoteviews);
        updateAlertIcon(weatherdatamodel, accuremoteviews);
        updateCityNameTextView(weatherdatamodel, accuremoteviews);
        updateWidgetUpdateTimeView(accuremoteviews, weatherdatamodel);
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.timezone_tv, (new StringBuilder()).append(" ").append(weatherdatamodel.getTimeZoneAbbrev().toUpperCase()).toString());
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.current_temp_tv, (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString());
        updateCurrentTempUnitsTextView(weatherdatamodel, accuremoteviews);
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.current_short_text_tv, weatherdatamodel.getText());
        updateDayOneImage(weatherdatamodel, accuremoteviews);
        updateDayOneDayTextView(accuremoteviews, weatherdatamodel);
        updateDayOneHiLoTextView(accuremoteviews, weatherdatamodel);
        updateDayTwoImage(weatherdatamodel, accuremoteviews);
        updateDayTwoDayTextView(accuremoteviews, weatherdatamodel);
        updateDayTwoHiLoTextView(accuremoteviews, weatherdatamodel);
        updateGetFullAppVisibility(accuremoteviews);
        mPendingIntentCreator.setContext(mContext);
        mPendingIntentCreator.setWidgetLocationKey((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i)));
        mPendingIntentCreator.addPendingIntentsForSuccessLayout(i, weatherdatamodel, accuremoteviews);
        return accuremoteviews;
    }

    public AccuRemoteViews buildRemoteViewForGpsTimeout(int i, String s)
    {
        AccuRemoteViews accuremoteviews = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.al_widget_gps_timeout_layout, isTesting, mContext);
        updateTimeTextView(s, accuremoteviews);
        updateGetFullAppVisibility(accuremoteviews);
        mPendingIntentCreator.setContext(mContext);
        mPendingIntentCreator.setWidgetLocationKey((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i)));
        mPendingIntentCreator.addPendingIntentsForErrorLayout(i, accuremoteviews);
        return accuremoteviews;
    }

    public View getInflatedViewForTesting()
    {
        return inflatedViewForTesting;
    }

    public int getMetricValue()
    {
        return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(mContext).getString("pref_temp_units", mContext.getApplicationContext().getString(com.accuweather.android.R.string.default_metric)));
    }

    public void setTesting(boolean flag)
    {
        isTesting = flag;
    }

    public void setWidgetIdPrimaryKeys(HashMap hashmap)
    {
        mWidgetIdPrimaryKeys = hashmap;
    }
}
