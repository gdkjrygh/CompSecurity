// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.res.Resources;
import com.accuweather.android.adapters.DetailsFragmentAdapter;
import com.accuweather.android.adapters.NewsFragmentAdapter;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.news.NewsModel;
import com.accuweather.android.utilities.MainContentPage;
import com.actionbarsherlock.app.ActionBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android:
//            AnalyticsDetailsActivity

public class NewsDetailsActivity extends AnalyticsDetailsActivity
{

    public NewsDetailsActivity()
    {
    }

    protected boolean NeedALocationList()
    {
        return false;
    }

    protected List buildContentList(WeatherDataModel weatherdatamodel)
    {
        ArrayList arraylist = new ArrayList();
        int j = weatherdatamodel.getNews().size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(weatherdatamodel.getNews().get(i));
        }

        return arraylist;
    }

    protected List buildTitles(WeatherDataModel weatherdatamodel, Locale locale)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < weatherdatamodel.getNews().size(); i++)
        {
            String s = ((NewsModel)weatherdatamodel.getNews().get(i)).getTitle();
            locale = s;
            if (s.length() > 12)
            {
                locale = (new StringBuilder()).append(s.substring(0, 12)).append("...").toString();
            }
            arraylist.add(locale);
        }

        return arraylist;
    }

    protected int getActionBarHeaderId()
    {
        return R.string.News;
    }

    protected int getActionBarIcon()
    {
        return R.drawable.ic_actionbar_news;
    }

    protected DetailsFragmentAdapter getAdapter()
    {
        return new NewsFragmentAdapter(getSupportFragmentManager());
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
        return MainContentPage.News;
    }

    protected void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_gradient));
        actionbar.setNavigationMode(0);
        actionbar.setTitle(R.string.News);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
        actionbar.setIcon(getActionBarIcon());
        com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader titlespinneradapterwithheader = buildActionBarSpinner();
        mActionBarAdapter = titlespinneradapterwithheader;
        actionbar.setListNavigationCallbacks(titlespinneradapterwithheader, this);
    }
}
