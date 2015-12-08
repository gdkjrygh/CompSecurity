// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.sharp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
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
import com.accuweather.android.widgets.AccuRemoteViews;
import com.accuweather.android.widgets.IWidgetUiBuilder;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets.sharp:
//            SharpPendingIntentCreator

public class SharpWidgetUiBuilder
    implements IWidgetUiBuilder
{

    private static final String AL_WIDGET_ICON = "icon_widget_sharp_";
    private RelativeLayout inflatedViewForTesting;
    private boolean isTesting;
    private Context mContext;
    private HashMap mWidgetIdPrimaryKeys;
    private SharpPendingIntentCreator sharpPendingIntentCreator;

    public SharpWidgetUiBuilder(Context context, HashMap hashmap)
    {
        isTesting = false;
        sharpPendingIntentCreator = new SharpPendingIntentCreator();
        mContext = context;
        mWidgetIdPrimaryKeys = hashmap;
    }

    private AccuRemoteViews buildRemoteViewForError(int i, String s, String s1)
    {
        AccuRemoteViews accuremoteviews = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.sharp_widget_gps_timeout_layout, isTesting, mContext);
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.mainMessage, s1);
        updateTimeTextView(s, accuremoteviews);
        updateGetFullAppVisibility(accuremoteviews);
        sharpPendingIntentCreator.setWidgetLocationKey((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i)));
        sharpPendingIntentCreator.setContext(mContext);
        sharpPendingIntentCreator.addPendingIntentsForErrorLayout(i, accuremoteviews);
        return accuremoteviews;
    }

    private int getAlertIconVisibility(WeatherDataModel weatherdatamodel)
    {
        return !weatherdatamodel.getAlertIsActive() ? 8 : 0;
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
        remoteviews.setViewVisibility(com.accuweather.android.R.id.alertImageView, getAlertIconVisibility(weatherdatamodel));
    }

    private void updateCityNameTextView(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        weatherdatamodel = getLocationModel(weatherdatamodel).getAlias().toUpperCase();
        remoteviews.setTextViewText(com.accuweather.android.R.id.locationNameTextView, weatherdatamodel);
    }

    private void updateCurrentConditionsImage(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getCurrentConditionsModel() != null && weatherdatamodel.getCurrentConditionsModel().getWeatherIcon() != null)
        {
            weatherdatamodel = weatherdatamodel.getCurrentConditionsModel().getWeatherIcon();
            int i = Utilities.getDrawableId((new StringBuilder()).append("icon_widget_sharp_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString());
            remoteviews.setImageViewResource(com.accuweather.android.R.id.currentConditionsIcon, i);
        }
    }

    private void updateCurrentLocationTextView(int i, RemoteViews remoteviews)
    {
        if (((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i))).equals("-1"))
        {
            remoteviews.setViewVisibility(com.accuweather.android.R.id.currentLocationTextView, 0);
            return;
        } else
        {
            remoteviews.setViewVisibility(com.accuweather.android.R.id.currentLocationTextView, 4);
            return;
        }
    }

    private void updateCurrentTempTextView(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.currentTemperatureTextView, (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString());
    }

    private void updateDateTextView(AccuRemoteViews accuremoteviews)
    {
        String s = DateUtils.getStringCurrentDateWithFormat("EEEE, MMMM d");
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.dateTextView, s);
    }

    private void updateDayOneDayTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = DateUtils.getAbbreviatedDay(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDate(), mContext.getResources().getConfiguration().locale);
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayOneNameTextView, weatherdatamodel.toUpperCase());
    }

    private void updateDayOneHiLoTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayOneHiTextView, getHighTemperatureText(weatherdatamodel, 1));
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayOneLoTextView, getLowTemperatureText(weatherdatamodel, 1));
    }

    private void updateDayOneImage(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > 0 && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDay() != null)
        {
            weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(1)).getDay().getIcon();
            if (weatherdatamodel != null)
            {
                int i = Utilities.getDrawableId((new StringBuilder()).append("icon_widget_sharp_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString());
                remoteviews.setImageViewResource(com.accuweather.android.R.id.dayOneConditionsIcon, i);
            }
        }
    }

    private void updateDayTwoDayTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = DateUtils.getAbbreviatedDay(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(2)).getDate(), mContext.getResources().getConfiguration().locale);
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayTwoNameTextView, weatherdatamodel.toUpperCase());
    }

    private void updateDayTwoHiLoTextView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayTwoHiTextView, getHighTemperatureText(weatherdatamodel, 2));
        remoteviews.setTextViewText(com.accuweather.android.R.id.dayTwoLoTextView, getLowTemperatureText(weatherdatamodel, 2));
    }

    private void updateDayTwoImage(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && weatherdatamodel.getForecast().getDailyForecasts().size() > 1 && ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(2)).getDay() != null)
        {
            weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(2)).getDay().getIcon();
            if (weatherdatamodel != null)
            {
                int i = Utilities.getDrawableId((new StringBuilder()).append("icon_widget_sharp_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString());
                remoteviews.setImageViewResource(com.accuweather.android.R.id.dayTwoConditionsIcon, i);
            }
        }
    }

    private void updateGetFullAppVisibility(RemoteViews remoteviews)
    {
        int j = com.accuweather.android.R.id.getFullApp;
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
        String as[] = s.split(" ");
        String s1 = as[0];
        s = "";
        if (as.length >= 2)
        {
            s = as[1].toUpperCase();
        }
        remoteviews.setTextViewText(com.accuweather.android.R.id.clockTextView, s1);
        remoteviews.setTextViewText(com.accuweather.android.R.id.clockAmPmTextView, s);
    }

    private void updateTimezoneTextView(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        if (weatherdatamodel.getTimeZoneAbbrev() != null)
        {
            remoteviews.setTextViewText(com.accuweather.android.R.id.updatedAtTimezoneTextView, (new StringBuilder()).append(" ").append(weatherdatamodel.getTimeZoneAbbrev().toUpperCase()).toString());
        }
    }

    private void updateWidgetContentUpdateTimeView(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = weatherdatamodel.getLocalObservationDateTime();
        java.util.Locale locale = mContext.getResources().getConfiguration().locale;
        if (DateUtils.is24HourFormat(mContext.getApplicationContext()))
        {
            weatherdatamodel = DateUtils.to24HourTime(weatherdatamodel);
            remoteviews.setTextViewText(com.accuweather.android.R.id.updatedAtTimeTextView, weatherdatamodel);
            return;
        } else
        {
            weatherdatamodel = DateUtils.to12HourTimeWithAmPm(weatherdatamodel, locale);
            remoteviews.setTextViewText(com.accuweather.android.R.id.updatedAtTimeTextView, weatherdatamodel);
            return;
        }
    }

    public AccuRemoteViews buildRemoteView(int i, WeatherDataModel weatherdatamodel, String s)
    {
        AccuRemoteViews accuremoteviews = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.sharp_widget, isTesting, mContext);
        updateCurrentLocationTextView(i, accuremoteviews);
        updateTimeTextView(s, accuremoteviews);
        updateAlertIcon(weatherdatamodel, accuremoteviews);
        updateCityNameTextView(weatherdatamodel, accuremoteviews);
        updateWidgetContentUpdateTimeView(accuremoteviews, weatherdatamodel);
        updateTimezoneTextView(weatherdatamodel, accuremoteviews);
        updateCurrentTempTextView(weatherdatamodel, accuremoteviews);
        updateCurrentConditionsImage(weatherdatamodel, accuremoteviews);
        updateDayOneImage(weatherdatamodel, accuremoteviews);
        updateDayOneDayTextView(accuremoteviews, weatherdatamodel);
        updateDayOneHiLoTextView(accuremoteviews, weatherdatamodel);
        updateDayTwoImage(weatherdatamodel, accuremoteviews);
        updateDayTwoDayTextView(accuremoteviews, weatherdatamodel);
        updateDayTwoHiLoTextView(accuremoteviews, weatherdatamodel);
        updateGetFullAppVisibility(accuremoteviews);
        updateDateTextView(accuremoteviews);
        sharpPendingIntentCreator.setWidgetLocationKey((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i)));
        sharpPendingIntentCreator.setContext(mContext);
        sharpPendingIntentCreator.addPendingIntentsForSuccessLayout(i, weatherdatamodel, accuremoteviews);
        return accuremoteviews;
    }

    public AccuRemoteViews buildRemoteViewForGpsTimeout(int i, String s)
    {
        return buildRemoteViewForError(i, s, mContext.getString(com.accuweather.android.R.string.SearchingForYourLocation));
    }

    public AccuRemoteViews buildRemoteViewForLocationDeleted(int i, String s)
    {
        return buildRemoteViewForError(i, s, mContext.getString(com.accuweather.android.R.string.ThisLocationHasBeenDeletedFromYourPreferences_PleaseRemoveWidget));
    }

    public View getInflatedViewForTesting()
    {
        return inflatedViewForTesting;
    }

    public int getMetricValue()
    {
        return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(mContext).getString("pref_temp_units", mContext.getApplicationContext().getResources().getString(com.accuweather.android.R.string.default_metric)));
    }

    public void setContext(Context context)
    {
        mContext = context;
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
