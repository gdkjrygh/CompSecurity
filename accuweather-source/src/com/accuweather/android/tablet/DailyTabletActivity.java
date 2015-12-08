// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.tablet;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.accuweather.android.AnalyticsDetailsActivity;
import com.accuweather.android.adapters.DailyTabletFragmentAdapter;
import com.accuweather.android.adapters.DetailsFragmentAdapter;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.MainContentPage;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DailyTabletActivity extends AnalyticsDetailsActivity
{

    public DailyTabletActivity()
    {
    }

    protected List buildContentList(WeatherDataModel weatherdatamodel)
    {
        ArrayList arraylist = new ArrayList();
        int j = weatherdatamodel.getForecast().getDailyForecasts().size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(weatherdatamodel.getForecast().getDailyForecasts().get(i));
        }

        return arraylist;
    }

    protected List buildTitles(WeatherDataModel weatherdatamodel, Locale locale)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < weatherdatamodel.getForecast().getDailyForecasts().size(); i++)
        {
            DailyForecast dailyforecast = (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(i);
            arraylist.add((new StringBuilder()).append(DateUtils.getAbbreviatedDay(dailyforecast.getDate(), locale)).append(" ").append(DateUtils.toUserPreferredDate(dailyforecast.getDate(), this)).toString());
        }

        return arraylist;
    }

    protected int getActionBarHeaderId()
    {
        return com.accuweather.android.R.string.DailyDetails;
    }

    protected int getActionBarIcon()
    {
        return com.accuweather.android.R.drawable.ic_actionbar_forecastdetails_15day;
    }

    protected DetailsFragmentAdapter getAdapter()
    {
        return new DailyTabletFragmentAdapter(getSupportFragmentManager());
    }

    protected int getContentViewId()
    {
        return com.accuweather.android.R.layout.main_tablet_details;
    }

    protected float getFragmentPagerWidth()
    {
        return (348F * getResources().getDisplayMetrics().density) / (float)getResources().getDisplayMetrics().widthPixels;
    }

    protected MainContentPage getPageTypeForAdTracking()
    {
        return MainContentPage.Forecast;
    }
}
