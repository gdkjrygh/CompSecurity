// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.DailyFragment;
import com.accuweather.android.fragments.HourlyFragment;
import com.accuweather.android.fragments.LocationFragment;
import com.accuweather.android.fragments.MapsImageFragment;
import com.accuweather.android.fragments.NewsListFragment;
import com.accuweather.android.fragments.NowFragment;
import com.accuweather.android.fragments.VideoListFragment;
import com.accuweather.android.minutecast.MinuteCastFlipperFragment;
import com.accuweather.android.models.ForecastFragmentModel;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.HourlyFragmentModel;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.PreferenceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class MainFragmentAdapter extends FixedFragmentStatePagerAdapter
{

    private List mContent;
    private Context mContext;
    private float mPageWidth;
    private boolean mShouldReuseFragments;
    private LinkedHashMap pageMap;

    public MainFragmentAdapter(FragmentManager fragmentmanager, Context context)
    {
        super(fragmentmanager);
        mPageWidth = 1.0F;
        mContent = new ArrayList();
        mShouldReuseFragments = false;
        pageMap = new LinkedHashMap();
        mContent.addAll(buildDefaultContents());
        mContext = context;
        for (int i = 0; i < MainContentPage.values().length; i++)
        {
            pageMap.put(MainContentPage.values()[i], Boolean.valueOf(true));
        }

    }

    private List buildDefaultContents()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 8; i++)
        {
            arraylist.add(null);
        }

        return arraylist;
    }

    private List buildPagesToDisplay()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = pageMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MainContentPage maincontentpage = (MainContentPage)iterator.next();
            if (((Boolean)pageMap.get(maincontentpage)).booleanValue())
            {
                arraylist.add(maincontentpage);
            }
        } while (true);
        return arraylist;
    }

    private Boolean getMapsFragmentArgument(int i)
    {
        if (mContent.get(i) instanceof Boolean)
        {
            return (Boolean)mContent.get(i);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public void excludePageIndex(int i)
    {
        pageMap.put(MainContentPage.values()[i], Boolean.valueOf(false));
    }

    public List getContent()
    {
        return mContent;
    }

    public int getCorrespondingPageIndex(MainContentPage maincontentpage)
    {
        return buildPagesToDisplay().indexOf(maincontentpage);
    }

    public int getCount()
    {
        return buildPagesToDisplay().size();
    }

    public Fragment getItem(int i)
    {
        List list = buildPagesToDisplay();
        static class _cls1
        {

            static final int $SwitchMap$com$accuweather$android$utilities$MainContentPage[];

            static 
            {
                $SwitchMap$com$accuweather$android$utilities$MainContentPage = new int[MainContentPage.values().length];
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Location.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Now.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.MinuteCast.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Hourly.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Forecast.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Maps.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Video.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.News.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.accuweather.android.utilities.MainContentPage[((MainContentPage)list.get(i)).ordinal()])
        {
        default:
            return NowFragment.newInstance();

        case 1: // '\001'
            return LocationFragment.newInstance();

        case 2: // '\002'
            return NowFragment.newInstance();

        case 3: // '\003'
            return new MinuteCastFlipperFragment();

        case 4: // '\004'
            return HourlyFragment.newInstance((HourlyFragmentModel)mContent.get(i));

        case 5: // '\005'
            return DailyFragment.newInstance((ForecastFragmentModel)mContent.get(i));

        case 6: // '\006'
            return MapsImageFragment.newInstance(getMapsFragmentArgument(i).booleanValue());

        case 7: // '\007'
            return VideoListFragment.newInstance((WeatherDataModel)mContent.get(i));

        case 8: // '\b'
            return NewsListFragment.newInstance((WeatherDataModel)mContent.get(i));
        }
    }

    public int getItemPosition(Object obj)
    {
        if (mShouldReuseFragments)
        {
            if (obj instanceof LocationFragment)
            {
                return MainContentPage.Location.ordinal();
            }
            if (obj instanceof NowFragment)
            {
                return MainContentPage.Now.ordinal();
            }
            if (obj instanceof MinuteCastFlipperFragment)
            {
                return MainContentPage.MinuteCast.ordinal();
            }
            if (obj instanceof HourlyFragment)
            {
                return MainContentPage.Hourly.ordinal();
            }
            if (obj instanceof DailyFragment)
            {
                return MainContentPage.Forecast.ordinal();
            }
            if (obj instanceof VideoListFragment)
            {
                return MainContentPage.Video.ordinal();
            }
            if (obj instanceof NewsListFragment)
            {
                return MainContentPage.News.ordinal();
            }
        }
        return -2;
    }

    public MainContentPage getPage(int i)
    {
        List list = buildPagesToDisplay();
        if (i < list.size())
        {
            return (MainContentPage)list.get(i);
        } else
        {
            return null;
        }
    }

    public volatile CharSequence getPageTitle(int i)
    {
        return getPageTitle(i);
    }

    public String getPageTitle(int i)
    {
        if (mContext == null)
        {
            return "";
        }
        List list = buildPagesToDisplay();
        switch (_cls1..SwitchMap.com.accuweather.android.utilities.MainContentPage[((MainContentPage)list.get(i)).ordinal()])
        {
        default:
            return mContext.getString(com.accuweather.android.R.string.Now).toUpperCase();

        case 1: // '\001'
            return mContext.getString(com.accuweather.android.R.string.Locations).toUpperCase();

        case 2: // '\002'
            return mContext.getString(com.accuweather.android.R.string.Now).toUpperCase();

        case 3: // '\003'
            return mContext.getString(com.accuweather.android.R.string.MinuteCast).toUpperCase();

        case 4: // '\004'
            return mContext.getString(com.accuweather.android.R.string.Hourly).toUpperCase();

        case 5: // '\005'
            return mContext.getString(com.accuweather.android.R.string.Daily).toUpperCase();

        case 6: // '\006'
            return mContext.getString(com.accuweather.android.R.string.Maps).toUpperCase();

        case 7: // '\007'
            return mContext.getString(com.accuweather.android.R.string.Videos).toUpperCase();

        case 8: // '\b'
            return mContext.getString(com.accuweather.android.R.string.News).toUpperCase();
        }
    }

    public float getPageWidth(int i)
    {
        return mPageWidth;
    }

    public void includePageIndex(int i)
    {
        pageMap.put(MainContentPage.values()[i], Boolean.valueOf(true));
    }

    public void notifyDataSetChanged(boolean flag)
    {
        mShouldReuseFragments = flag;
        super.notifyDataSetChanged();
        mShouldReuseFragments = false;
    }

    public FragmentPayload refreshContent(WeatherDataModel weatherdatamodel)
    {
        HourlyFragmentModel hourlyfragmentmodel = null;
        ForecastFragmentModel forecastfragmentmodel = null;
        getContent().clear();
        int i = 0;
        while (i < MainContentPage.values().length) 
        {
            MainContentPage maincontentpage = MainContentPage.values()[i];
            ForecastFragmentModel forecastfragmentmodel1;
            HourlyFragmentModel hourlyfragmentmodel1;
            if (maincontentpage.equals(MainContentPage.Location))
            {
                getContent().add(new Object());
                hourlyfragmentmodel1 = hourlyfragmentmodel;
                forecastfragmentmodel1 = forecastfragmentmodel;
            } else
            if (maincontentpage.equals(MainContentPage.Now))
            {
                getContent().add(weatherdatamodel);
                forecastfragmentmodel1 = forecastfragmentmodel;
                hourlyfragmentmodel1 = hourlyfragmentmodel;
            } else
            if (maincontentpage.equals(MainContentPage.MinuteCast))
            {
                if (!MinuteCastUtilities.isMinuteCastLocation(weatherdatamodel) || !MinuteCastUtilities.hasMinuteCastResult(weatherdatamodel))
                {
                    excludePageIndex(i);
                    forecastfragmentmodel1 = forecastfragmentmodel;
                    hourlyfragmentmodel1 = hourlyfragmentmodel;
                } else
                {
                    includePageIndex(i);
                    getContent().add(weatherdatamodel);
                    forecastfragmentmodel1 = forecastfragmentmodel;
                    hourlyfragmentmodel1 = hourlyfragmentmodel;
                }
            } else
            if (maincontentpage.equals(MainContentPage.Hourly))
            {
                hourlyfragmentmodel1 = new HourlyFragmentModel(weatherdatamodel.getLocationKey(), PreferenceUtils.get(mContext, "hourly_graph_showing", true));
                getContent().add(hourlyfragmentmodel1);
                forecastfragmentmodel1 = forecastfragmentmodel;
            } else
            if (maincontentpage.equals(MainContentPage.Forecast))
            {
                forecastfragmentmodel1 = new ForecastFragmentModel(weatherdatamodel.getLocationKey(), PreferenceUtils.get(mContext, "forecast_graph_showing", true));
                getContent().add(forecastfragmentmodel1);
                hourlyfragmentmodel1 = hourlyfragmentmodel;
            } else
            if (maincontentpage.equals(MainContentPage.Maps))
            {
                getContent().add(weatherdatamodel);
                forecastfragmentmodel1 = forecastfragmentmodel;
                hourlyfragmentmodel1 = hourlyfragmentmodel;
            } else
            if (maincontentpage.equals(MainContentPage.Video))
            {
                getContent().add(weatherdatamodel);
                forecastfragmentmodel1 = forecastfragmentmodel;
                hourlyfragmentmodel1 = hourlyfragmentmodel;
            } else
            {
                forecastfragmentmodel1 = forecastfragmentmodel;
                hourlyfragmentmodel1 = hourlyfragmentmodel;
                if (maincontentpage.equals(MainContentPage.News))
                {
                    getContent().add(weatherdatamodel);
                    forecastfragmentmodel1 = forecastfragmentmodel;
                    hourlyfragmentmodel1 = hourlyfragmentmodel;
                }
            }
            i++;
            forecastfragmentmodel = forecastfragmentmodel1;
            hourlyfragmentmodel = hourlyfragmentmodel1;
        }
        FragmentPayload fragmentpayload = new FragmentPayload();
        fragmentpayload.setLocationKey(weatherdatamodel.getLocationKey());
        fragmentpayload.setHourlyFragmentModel(hourlyfragmentmodel);
        fragmentpayload.setForecastFragmentModel(forecastfragmentmodel);
        return fragmentpayload;
    }

    public void setPageWidth(float f)
    {
        mPageWidth = f;
    }
}
