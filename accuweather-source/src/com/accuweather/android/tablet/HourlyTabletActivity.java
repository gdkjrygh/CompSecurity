// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.tablet;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.accuweather.android.AnalyticsDetailsActivity;
import com.accuweather.android.adapters.DetailsFragmentAdapter;
import com.accuweather.android.adapters.HourlyTabletFragmentAdapter;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HourlyTabletActivity extends AnalyticsDetailsActivity
{

    public HourlyTabletActivity()
    {
    }

    protected List buildContentList(WeatherDataModel weatherdatamodel)
    {
        ArrayList arraylist = new ArrayList();
        int j = weatherdatamodel.getCappedHourlyModels().size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(weatherdatamodel.getCappedHourlyModels().get(i));
        }

        return arraylist;
    }

    protected List buildTitles(WeatherDataModel weatherdatamodel, Locale locale)
    {
        return GuiUtils.buildHourlyTitlesAbbrev(UserPreferences.isTwelveHourFormat(this), this, weatherdatamodel);
    }

    protected int getActionBarHeaderId()
    {
        return com.accuweather.android.R.string.HourlyDetails;
    }

    protected int getActionBarIcon()
    {
        return com.accuweather.android.R.drawable.ic_actionbar_hourlydetails;
    }

    protected DetailsFragmentAdapter getAdapter()
    {
        return new HourlyTabletFragmentAdapter(getSupportFragmentManager());
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
        return MainContentPage.Hourly;
    }
}
