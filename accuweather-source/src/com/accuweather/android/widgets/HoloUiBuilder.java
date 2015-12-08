// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.RemoteViews;
import com.accuweather.android.DailyProxyActivity;
import com.accuweather.android.ProxyActivity;
import com.accuweather.android.TermsAndConditionsActivity;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Alarms;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            Dimension, WidgetProviderHoloLight

public class HoloUiBuilder
{

    private static final int ESTIMATED_CELL_HEIGHT = 74;
    private static final int ESTIMATED_CELL_WIDTH = 100;
    private static final int ESTIMATED_SINGLE_CELL_HEIGHT = 58;
    private static final int MAX_SIDE_BAR_LOCATIONS = 3;
    private static final String ZTE_787_MODEL = "z787";
    private static final String ZTE_MANUFACTURER = "zte";

    public HoloUiBuilder()
    {
    }

    private PendingIntent buildAdvanceToNextLocationPendingIntent(Context context, int i)
    {
        Intent intent = new Intent(getIntentForLocationAdvancing());
        intent.putExtra("widget_id", i);
        return PendingIntent.getBroadcast(context, i, intent, 0);
    }

    private Intent buildIntent(Context context, Class class1, WeatherDataModel weatherdatamodel, MainContentPage maincontentpage)
    {
        context = new Intent(context, class1);
        context.addFlags(0x10000000);
        context.addFlags(32768);
        context.putExtra("location_code", weatherdatamodel.getLocationKey());
        context.putExtra("page_index_from_widget", maincontentpage);
        return context;
    }

    private PendingIntent buildOpenDailyPendingIntent(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        return PendingIntent.getActivity(context, i, buildIntent(context, com/accuweather/android/DailyProxyActivity, weatherdatamodel, MainContentPage.Forecast), 0x10000000);
    }

    private PendingIntent buildOpenHourlyPendingIntent(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        return PendingIntent.getActivity(context, i, buildIntent(context, com/accuweather/android/ProxyActivity, weatherdatamodel, MainContentPage.Hourly), 0x10000000);
    }

    private PendingIntent buildOpenNowPendingIntent(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        return PendingIntent.getActivity(context, i, buildIntent(context, com/accuweather/android/TermsAndConditionsActivity, weatherdatamodel, MainContentPage.Now), 0x10000000);
    }

    private PendingIntent buildOpenSidebarPendingIntent(int i, WeatherDataModel weatherdatamodel, int j, Context context)
    {
        weatherdatamodel = buildIntent(context, com/accuweather/android/ProxyActivity, weatherdatamodel, MainContentPage.Now);
        weatherdatamodel.addCategory(Integer.toString(i));
        return PendingIntent.getActivity(context, j, weatherdatamodel, 0x10000000);
    }

    private Spanned buildPrimaryShortText(String s, Context context)
    {
        context = context.getResources();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<b>").append(context.getString(com.accuweather.android.R.string.Today)).append(": </b>").append("<font>").append(s).append("</font>");
        return Html.fromHtml(stringbuilder.toString());
    }

    private String buildRealfeel(DailyForecast dailyforecast, Context context)
    {
        context = context.getResources();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context.getString(com.accuweather.android.R.string.RealFeel)).append(": ").append(dailyforecast.getRealFeelHighTemperature().intValue()).append("\260").append("/").append(dailyforecast.getRealFeelLowTemperature().intValue()).append("\260");
        return stringbuilder.toString();
    }

    private String buildTemperature(DailyForecast dailyforecast)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(dailyforecast.getHighTemperature().intValue()).append("\260").append("/").append(dailyforecast.getLowTemperature().intValue()).append("\260");
        return stringbuilder.toString();
    }

    private int getAlarmIconVisibility(DailyForecast dailyforecast, Context context, int i)
    {
        return !(new Alarms()).hasAlarm(dailyforecast, Integer.valueOf(UserPreferences.getMetricIntPreference(context)), i) ? 4 : 0;
    }

    private int getAlertIconVisibility(WeatherDataModel weatherdatamodel)
    {
        return !weatherdatamodel.getAlertIsActive() ? 4 : 0;
    }

    private static int getApproximateColumnCount(int i)
    {
        return i / 100 + 1;
    }

    private static int getApproximateRowCount(Context context, int i)
    {
        i -= 58;
        if (i <= 0)
        {
            i = 0;
        }
        return i / 74 + 1;
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private String getFormattedDrawableNumber(String s)
    {
        String s1 = s;
        if (s.length() == 1)
        {
            s1 = (new StringBuilder()).append("0").append(s).toString();
        }
        return s1;
    }

    private void hideDaily(RemoteViews remoteviews)
    {
        setDailyVisibility(remoteviews, 8);
    }

    private void hideHourly(RemoteViews remoteviews)
    {
        setHourlyVisibility(remoteviews, 8);
    }

    private void hideLocationsColumn(RemoteViews remoteviews)
    {
        setLocationsVisibility(remoteviews, 8);
    }

    private void populate(RemoteViews remoteviews, WeatherDataModel weatherdatamodel, int i, Context context, List list, int j)
    {
label0:
        {
            populatePrimary(remoteviews, weatherdatamodel, context);
            if (!Utilities.isLdpi(context))
            {
                populateNow(remoteviews, weatherdatamodel, context);
                for (int k = 0; k < 4; k++)
                {
                    populateHourly(remoteviews, k, (HourlyResult)weatherdatamodel.getHourly().get(k), context);
                    populateDaily(remoteviews, k, (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(k), weatherdatamodel.getGmtOffset(), context);
                }

                populateLocations(remoteviews, weatherdatamodel, i, context, list, j);
                if (Utilities.isJellybeanOrGreater())
                {
                    if (getData(context).getResizableDimensionsMap().get(Integer.valueOf(i)) == null || Build.MANUFACTURER.toLowerCase().contains("zte"))
                    {
                        char c;
                        if (Utilities.isScreenSizeLargeOrGreater(context))
                        {
                            j = 180;
                        } else
                        {
                            j = 70;
                        }
                        c = '\u017C';
                        saveWidgetDimensions(context, i, 380, j);
                        i = c;
                    } else
                    {
                        weatherdatamodel = (Dimension)getData(context).getResizableDimensionsMap().get(Integer.valueOf(i));
                        i = weatherdatamodel.getWidth();
                        j = weatherdatamodel.getHeight();
                    }
                    if (getApproximateColumnCount(i) > 4)
                    {
                        showLocationsColumn(remoteviews);
                    } else
                    {
                        hideLocationsColumn(remoteviews);
                    }
                    i = getApproximateRowCount(context, j);
                    if (i < 3)
                    {
                        break label0;
                    }
                    showDaily(remoteviews);
                }
            }
            return;
        }
        if (i == 2)
        {
            showHourly(remoteviews);
            hideDaily(remoteviews);
            return;
        } else
        {
            hideDaily(remoteviews);
            hideHourly(remoteviews);
            return;
        }
    }

    private void populateDaily(RemoteViews remoteviews, int i, DailyForecast dailyforecast, String s, Context context)
    {
        s = context.getResources().getConfiguration().locale;
        i++;
        remoteviews.setTextViewText(Utilities.getResourceId(String.format("daily%d_title", new Object[] {
            Integer.valueOf(i)
        })), DateUtils.getAbbreviatedDay(dailyforecast.getDate(), s).toUpperCase(s));
        remoteviews.setTextViewText(Utilities.getResourceId(String.format("daily%d_description", new Object[] {
            Integer.valueOf(i)
        })), buildTemperature(dailyforecast));
        s = StringUtils.padLeft((new StringBuilder()).append(dailyforecast.getDay().getIcon()).append("").toString(), '0', 2);
        remoteviews.setImageViewResource(Utilities.getResourceId(String.format("daily%d_icon", new Object[] {
            Integer.valueOf(i)
        })), Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(s)).toString()));
        remoteviews.setViewVisibility(Utilities.getResourceId(String.format("alarm_icon_day%d", new Object[] {
            Integer.valueOf(i)
        })), getAlarmIconVisibility(dailyforecast, context, i));
    }

    private void populateHourly(RemoteViews remoteviews, int i, HourlyResult hourlyresult, Context context)
    {
        context = context.getResources().getConfiguration().locale;
        String s = DateUtils.to12HourTimeNoMinutesWithAmPm(hourlyresult.getDateTime(), context);
        remoteviews.setTextViewText(Utilities.getResourceId(String.format("hour%d_title", new Object[] {
            Integer.valueOf(i + 1)
        })), s.toLowerCase(context));
        remoteviews.setTextViewText(Utilities.getResourceId(String.format("hour%d_description", new Object[] {
            Integer.valueOf(i + 1)
        })), (new StringBuilder()).append(hourlyresult.getTemperature().getValue().intValue()).append("\260").toString());
        hourlyresult = StringUtils.padLeft(hourlyresult.getWeatherIcon(), '0', 2);
        remoteviews.setImageViewResource(Utilities.getResourceId(String.format("hour%d_icon", new Object[] {
            Integer.valueOf(i + 1)
        })), Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(hourlyresult)).toString()));
    }

    private void populateLocation(RemoteViews remoteviews, int i, WeatherDataModel weatherdatamodel, int j, Context context)
    {
        if (weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getDailyForecasts() != null && !weatherdatamodel.getForecast().getDailyForecasts().isEmpty())
        {
            Logger.i(this, (new StringBuilder()).append("populateLocation cityname is ").append(weatherdatamodel.getCityName()).toString());
            LocationModel locationmodel1 = getData(context).getLocationFromKey(weatherdatamodel.getLocationKey());
            LocationModel locationmodel = locationmodel1;
            if (locationmodel1 == null)
            {
                locationmodel = new LocationModel();
                locationmodel.setLocKey(weatherdatamodel.getLocationKey());
                locationmodel.setLocationName(weatherdatamodel.getCityName());
            }
            remoteviews.setTextViewText(Utilities.getResourceId(String.format("location%d_title", new Object[] {
                Integer.valueOf(i)
            })), locationmodel.getAliasedName().toUpperCase(context.getResources().getConfiguration().locale));
            remoteviews.setTextViewText(Utilities.getResourceId(String.format("location%d_description", new Object[] {
                Integer.valueOf(i)
            })), buildTemperature((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)));
            remoteviews.setImageViewResource(Utilities.getResourceId(String.format("location%d_icon", new Object[] {
                Integer.valueOf(i)
            })), Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(weatherdatamodel.getIconCode())).toString()));
            remoteviews.setOnClickPendingIntent(Utilities.getResourceId(String.format("location%d_layout", new Object[] {
                Integer.valueOf(i)
            })), buildOpenSidebarPendingIntent(i, weatherdatamodel, j, context));
        }
    }

    private void populateNow(RemoteViews remoteviews, WeatherDataModel weatherdatamodel, Context context)
    {
        Resources resources = context.getResources();
        remoteviews.setTextViewText(com.accuweather.android.R.id.now_title, resources.getString(com.accuweather.android.R.string.Now));
        remoteviews.setTextViewText(com.accuweather.android.R.id.now_description, (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString());
        remoteviews.setImageViewResource(com.accuweather.android.R.id.now_icon, Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(weatherdatamodel.getIconCode())).toString()));
        setAlertIconVisibility(remoteviews, weatherdatamodel);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.alarm_icon, getAlarmIconVisibility((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0), context, 0));
    }

    private void populatePrimary(RemoteViews remoteviews, WeatherDataModel weatherdatamodel, Context context)
    {
        LocationModel locationmodel1 = getData(context).getLocationFromKey(weatherdatamodel.getLocationKey());
        LocationModel locationmodel = locationmodel1;
        if (locationmodel1 == null)
        {
            locationmodel = new LocationModel();
            locationmodel.setLocKey(weatherdatamodel.getLocationKey());
            locationmodel.setLocationName(weatherdatamodel.getCityName());
        }
        remoteviews.setTextViewText(com.accuweather.android.R.id.city_name, locationmodel.getAliasedName());
        remoteviews.setImageViewResource(com.accuweather.android.R.id.primary_icon, Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(weatherdatamodel.getIconCode())).toString()));
        if (Utilities.isLdpi(context))
        {
            setAlertIconVisibility(remoteviews, weatherdatamodel);
        }
        if (!Utilities.isLdpi(context))
        {
            remoteviews.setTextViewText(com.accuweather.android.R.id.short_text, buildPrimaryShortText(weatherdatamodel.getText(), context));
            remoteviews.setTextViewText(com.accuweather.android.R.id.primary_realfeel, buildRealfeel((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0), context));
            remoteviews.setImageViewResource(com.accuweather.android.R.id.now_icon, Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(getFormattedDrawableNumber(weatherdatamodel.getIconCode())).toString()));
            remoteviews.setTextViewText(com.accuweather.android.R.id.primary_temperature, buildTemperature((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)));
            if (Build.MANUFACTURER.toLowerCase().contains("zte"))
            {
                Logger.i(this, "this is a ZTE model");
                remoteviews.setTextViewTextSize(com.accuweather.android.R.id.primary_temperature, 1, 16F);
                remoteviews.setViewPadding(com.accuweather.android.R.id.primary_realfeel, 0, 2, 0, -6);
            }
            return;
        } else
        {
            remoteviews.setTextViewText(com.accuweather.android.R.id.primary_temperature, (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString());
            return;
        }
    }

    private void resetSideBarLocations(RemoteViews remoteviews)
    {
        for (int i = 1; i <= 3; i++)
        {
            remoteviews.setTextViewText(Utilities.getResourceId(String.format("location%d_title", new Object[] {
                Integer.valueOf(i)
            })), "");
            remoteviews.setTextViewText(Utilities.getResourceId(String.format("location%d_description", new Object[] {
                Integer.valueOf(i)
            })), "");
            remoteviews.setImageViewResource(Utilities.getResourceId(String.format("location%d_icon", new Object[] {
                Integer.valueOf(i)
            })), 0);
        }

    }

    protected static void saveWidgetDimensions(Context context, int i, int j, int k)
    {
        getData(context).getResizableDimensionsMap().put(Integer.valueOf(i), new Dimension(j, k));
        getData(context).saveResizableWidgetDimensionsMap();
    }

    private void setAlertIconVisibility(RemoteViews remoteviews, WeatherDataModel weatherdatamodel)
    {
        remoteviews.setViewVisibility(com.accuweather.android.R.id.alert_icon, getAlertIconVisibility(weatherdatamodel));
    }

    private void setDailyVisibility(RemoteViews remoteviews, int i)
    {
        remoteviews.setViewVisibility(com.accuweather.android.R.id.daily_ll, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.hourly_spacer, i);
    }

    private void setHourlyVisibility(RemoteViews remoteviews, int i)
    {
        remoteviews.setViewVisibility(com.accuweather.android.R.id.hourly_ll, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.now_spacer, i);
    }

    private void setLocationsVisibility(RemoteViews remoteviews, int i)
    {
        remoteviews.setViewVisibility(com.accuweather.android.R.id.location1_layout, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.location2_layout, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.location3_layout, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.now_spacer_layout_0, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.hourly_spacer_layout_0, i);
        remoteviews.setViewVisibility(com.accuweather.android.R.id.daily_spacer_layout_0, i);
    }

    private void showDaily(RemoteViews remoteviews)
    {
        setDailyVisibility(remoteviews, 0);
    }

    private void showHourly(RemoteViews remoteviews)
    {
        setHourlyVisibility(remoteviews, 0);
    }

    private void showLocationsColumn(RemoteViews remoteviews)
    {
        setLocationsVisibility(remoteviews, 0);
    }

    protected int[] getAppWidgetIds(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getWidgetProviderClass()));
    }

    protected String getIconPrefix()
    {
        return "icon_";
    }

    protected String getIntentForLocationAdvancing()
    {
        return "com.accuweather.android.action.ADVANCE_LOCATION_LIGHT";
    }

    protected int getWidgetLayoutId()
    {
        return com.accuweather.android.R.layout.widget_item_holo_light;
    }

    protected Class getWidgetProviderClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloLight;
    }

    protected Class getWidgetServiceClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloLight$UpdateService;
    }

    public void populateLocations(RemoteViews remoteviews, WeatherDataModel weatherdatamodel, int i, Context context, List list, int j)
    {
        int k;
        int j1;
        if (j == 0)
        {
            k = list.size() - 1;
        } else
        {
            k = j - 1;
        }
        j1 = 0;
        for (int i1 = 0; i1 < list.size() - 1 && i1 < 3;)
        {
            int l = k;
            if (k == j)
            {
                l = k - 1;
            }
            k = l;
            if (l == -1)
            {
                k = list.size() - 1;
            }
            l = j1;
            if (k != j)
            {
                l = j1 + 1;
                populateLocation(remoteviews, l, (WeatherDataModel)list.get(k), i, context);
            }
            k--;
            i1++;
            j1 = l;
        }

    }

    public void updateWidgetDisplay(Context context, WeatherDataModel weatherdatamodel, int i, List list, int j)
    {
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), getWidgetLayoutId());
        if (!Utilities.isLdpi(context))
        {
            resetSideBarLocations(remoteviews);
        }
        populate(remoteviews, weatherdatamodel, i, context, list, j);
        remoteviews.setOnClickPendingIntent(com.accuweather.android.R.id.now_row_ll, buildOpenNowPendingIntent(context, weatherdatamodel, i));
        if (!Utilities.isLdpi(context))
        {
            remoteviews.setOnClickPendingIntent(com.accuweather.android.R.id.hourly_ll, buildOpenHourlyPendingIntent(context, weatherdatamodel, i));
            remoteviews.setOnClickPendingIntent(com.accuweather.android.R.id.daily_ll, buildOpenDailyPendingIntent(context, weatherdatamodel, i));
        }
        remoteviews.setOnClickPendingIntent(com.accuweather.android.R.id.next_location, buildAdvanceToNextLocationPendingIntent(context, i));
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteviews);
    }
}
