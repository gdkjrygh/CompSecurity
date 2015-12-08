// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.minutecast;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.StringUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.utilities.WeatherDataUtility;
import com.accuweather.android.widgets.AccuRemoteViews;
import com.accuweather.android.widgets.IWidgetUiBuilder;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets.minutecast:
//            MCWidgetPendingIntentCreator

public class MCWidgetUiBuilder
    implements IWidgetUiBuilder
{

    private static final int DAY_1 = 0;
    private static final int DAY_2 = 1;
    private static final int DAY_3 = 2;
    private static final String PREFIX_MC_WIDGET_ICON = "icon_mc_widget_";
    private static final String PREFIX_MC_WIDGET_ICON_DAILY = "icon_mc_widget_daily_";
    private Context mContext;
    final MCWidgetPendingIntentCreator mPendingCreator = new MCWidgetPendingIntentCreator();
    private HashMap mWidgetIdPrimaryKeys;

    public MCWidgetUiBuilder(Context context, HashMap hashmap)
    {
        mContext = context;
        mWidgetIdPrimaryKeys = hashmap;
    }

    private AccuRemoteViews buildRemoteViewForError(int i, String s, String s1)
    {
        s = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.mc_widget_error_layout, false, mContext);
        s.setTextViewText(com.accuweather.android.R.id.error_msg, s1);
        return s;
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

    private String getMinuteCastAddress(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = Data.getInstance(mContext).getLocationFromKey(weatherdatamodel.getLocationKey());
        if (weatherdatamodel != null)
        {
            weatherdatamodel = weatherdatamodel.getAddress();
        } else
        {
            weatherdatamodel = null;
        }
        if (weatherdatamodel != null)
        {
            return weatherdatamodel.toString();
        } else
        {
            return "";
        }
    }

    private CharSequence getMinuteCastSummary(WeatherDataModel weatherdatamodel)
    {
        String s = "";
        MinuteCastResult minutecastresult = weatherdatamodel.getMinuteCastResult();
        weatherdatamodel = s;
        if (minutecastresult != null)
        {
            weatherdatamodel = s;
            if (minutecastresult.getSummary() != null)
            {
                String s1 = minutecastresult.getSummary().getPhrase();
                weatherdatamodel = s1;
                if (s1.isEmpty())
                {
                    weatherdatamodel = minutecastresult.getSummary().getPhrase_60();
                }
            }
        }
        return weatherdatamodel;
    }

    private void setAlertIconVisibility(WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        int i = com.accuweather.android.R.id.alertImageView;
        if (weatherdatamodel.getAlertIsActive())
        {
            accuremoteviews.setViewVisibility(i, 0);
            return;
        } else
        {
            accuremoteviews.setViewVisibility(i, 4);
            return;
        }
    }

    private void setCityName(WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.tv_location, weatherdatamodel.getCityName());
    }

    private void setCommonPendingIntent(int i, AccuRemoteViews accuremoteviews)
    {
        mPendingCreator.setContext(mContext);
        mPendingCreator.setWidgetLocationKey((String)mWidgetIdPrimaryKeys.get(Integer.valueOf(i)));
        mPendingCreator.addPendingIntentsForMinuteCastWidget(i, accuremoteviews);
    }

    private void setCurrentTemp(WeatherDataModel weatherdatamodel, RemoteViews remoteviews)
    {
        remoteviews.setTextViewText(com.accuweather.android.R.id.tv_temperature, (new StringBuilder()).append(weatherdatamodel.getTemperature()).append("\260").toString());
    }

    private void setCurrentWeatherDesc(WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.tv_weather_desc, weatherdatamodel.getText());
    }

    private void setDataForEachDay(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        setTextViewDay(i, weatherdatamodel, accuremoteviews);
        setTextViewHi(i, weatherdatamodel, accuremoteviews);
        setTextViewLo(i, weatherdatamodel, accuremoteviews);
        setImageViewDay(i, weatherdatamodel, accuremoteviews);
        setAlertIconVisibility(weatherdatamodel, accuremoteviews);
    }

    private void setImageViewDay(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        if (weatherdatamodel.getForecast() == null || weatherdatamodel.getForecast().getDailyForecasts() == null || weatherdatamodel.getForecast().getDailyForecasts().size() <= 0 || i >= weatherdatamodel.getForecast().getDailyForecasts().size() || ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getDay() == null) goto _L2; else goto _L1
_L1:
        int j = com.accuweather.android.R.id.img_day1;
        if (i != 1) goto _L4; else goto _L3
_L3:
        j = com.accuweather.android.R.id.img_day2;
_L6:
        weatherdatamodel = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getDay().getIcon();
        if (weatherdatamodel != null)
        {
            accuremoteviews.setImageViewResource(j, Utilities.getDrawableId((new StringBuilder()).append("icon_mc_widget_daily_").append(StringUtils.padLeft((new StringBuilder()).append(weatherdatamodel).append("").toString(), '0', 2)).toString()));
        }
_L2:
        return;
_L4:
        if (i == 2)
        {
            j = com.accuweather.android.R.id.img_day3;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void setMinuteCastData(WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        if (MinuteCastUtilities.isMinuteCastLocation(weatherdatamodel) && MinuteCastUtilities.shouldShowMinuteCastSummaryText(weatherdatamodel))
        {
            String s = WeatherDataUtility.getPrecipitationImageResourceNameForWidget("icon_mc_widget_", weatherdatamodel);
            if (s != null)
            {
                accuremoteviews.setImageViewResource(com.accuweather.android.R.id.img_minute_cast, Utilities.getDrawableId(s));
            }
            accuremoteviews.setViewVisibility(com.accuweather.android.R.id.mc_widget_bottom_box, 0);
            accuremoteviews.setTextViewText(com.accuweather.android.R.id.tv_minute_cast_summary, getMinuteCastSummary(weatherdatamodel));
            accuremoteviews.setTextViewText(com.accuweather.android.R.id.tv_address, getMinuteCastAddress(weatherdatamodel));
            return;
        } else
        {
            accuremoteviews.setViewVisibility(com.accuweather.android.R.id.mc_widget_bottom_box, 8);
            return;
        }
    }

    private void setTextViewDay(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        int j = com.accuweather.android.R.id.tv_day1;
        java.util.Locale locale;
        if (i == 0)
        {
            j = com.accuweather.android.R.id.tv_day1;
        } else
        if (i == 1)
        {
            j = com.accuweather.android.R.id.tv_day2;
        } else
        if (i == 2)
        {
            j = com.accuweather.android.R.id.tv_day3;
        }
        locale = mContext.getResources().getConfiguration().locale;
        weatherdatamodel = DateUtils.getAbbreviatedDay(((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i)).getDate(), locale);
        if (weatherdatamodel != null)
        {
            weatherdatamodel = weatherdatamodel.toUpperCase(locale);
        } else
        {
            weatherdatamodel = "";
        }
        accuremoteviews.setTextViewText(j, weatherdatamodel);
    }

    private void setTextViewHi(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        int j = com.accuweather.android.R.id.tv_day1_hi;
        if (i != 1) goto _L2; else goto _L1
_L1:
        j = com.accuweather.android.R.id.tv_day2_hi;
_L4:
        accuremoteviews.setTextViewText(j, getHighTemperatureText(weatherdatamodel, i));
        return;
_L2:
        if (i == 2)
        {
            j = com.accuweather.android.R.id.tv_day3_hi;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setTextViewLo(int i, WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        int j = com.accuweather.android.R.id.tv_day1_low;
        if (i != 1) goto _L2; else goto _L1
_L1:
        j = com.accuweather.android.R.id.tv_day2_low;
_L4:
        accuremoteviews.setTextViewText(j, getLowTemperatureText(weatherdatamodel, i));
        return;
_L2:
        if (i == 2)
        {
            j = com.accuweather.android.R.id.tv_day3_low;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setTime(String s, RemoteViews remoteviews)
    {
        String as[] = s.split(" ");
        String s1 = as[0];
        s = "";
        if (as.length >= 2)
        {
            s = as[1].toUpperCase();
        }
        remoteviews.setTextViewText(com.accuweather.android.R.id.tv_clock, (new StringBuilder()).append(s1).append(" ").append(s).toString());
    }

    private void setUpdatedAtTime(WeatherDataModel weatherdatamodel, AccuRemoteViews accuremoteviews)
    {
        String s = weatherdatamodel.getLocalObservationDateTime();
        Object obj = mContext.getResources().getConfiguration().locale;
        if (DateUtils.is24HourFormat(mContext.getApplicationContext()))
        {
            s = DateUtils.to24HourTime(s);
        } else
        {
            s = DateUtils.to12HourTimeWithAmPm(s, ((java.util.Locale) (obj)));
        }
        obj = s;
        if (weatherdatamodel.getTimeZoneAbbrev() != null)
        {
            obj = (new StringBuilder()).append(s).append(" ").append(weatherdatamodel.getTimeZoneAbbrev().toUpperCase()).toString();
        }
        accuremoteviews.setTextViewText(com.accuweather.android.R.id.tv_updated_at_time, ((CharSequence) (obj)));
    }

    public AccuRemoteViews buildRemoteView(int i, WeatherDataModel weatherdatamodel, String s)
    {
        AccuRemoteViews accuremoteviews = new AccuRemoteViews(mContext.getPackageName(), com.accuweather.android.R.layout.mc_widget, false, mContext);
        setTime(s, accuremoteviews);
        setCityName(weatherdatamodel, accuremoteviews);
        setUpdatedAtTime(weatherdatamodel, accuremoteviews);
        setCurrentTemp(weatherdatamodel, accuremoteviews);
        setCurrentWeatherDesc(weatherdatamodel, accuremoteviews);
        setDataForEachDay(0, weatherdatamodel, accuremoteviews);
        setDataForEachDay(1, weatherdatamodel, accuremoteviews);
        setDataForEachDay(2, weatherdatamodel, accuremoteviews);
        setMinuteCastData(weatherdatamodel, accuremoteviews);
        setCommonPendingIntent(i, accuremoteviews);
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
}
