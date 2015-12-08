// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.adapters.DetailsFragmentAdapter;
import com.accuweather.android.adapters.HourlyFragmentAdapter;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android:
//            AnalyticsDetailsActivity

public class HourlyActivity extends AnalyticsDetailsActivity
{

    public HourlyActivity()
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
        return R.string.HourlyDetails;
    }

    protected int getActionBarIcon()
    {
        return R.drawable.ic_actionbar_hourlydetails;
    }

    protected DetailsFragmentAdapter getAdapter()
    {
        return new HourlyFragmentAdapter(getSupportFragmentManager());
    }

    protected int getContentViewId()
    {
        return R.layout.details_activity;
    }

    protected float getFragmentPagerWidth()
    {
        return 1.0F;
    }

    protected MainContentPage getPageTypeForAdTracking()
    {
        return MainContentPage.Hourly;
    }
}
