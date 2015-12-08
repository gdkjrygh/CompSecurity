// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.accuweather.android.adapters.DetailsFragmentAdapter;
import com.accuweather.android.adapters.HeaderGroupItem;
import com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader;
import com.accuweather.android.dma.DmaView;
import com.accuweather.android.ias.PurchaseActivity;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.preferences.SettingsActivity;
import com.accuweather.android.utilities.AdTrackingController;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.AccuViewPager;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.viewpagerindicator.PageIndicator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class AbsDetailsActivity extends PurchaseActivity
    implements com.actionbarsherlock.app.ActionBar.OnNavigationListener, com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader.ITitleSpinnerListener, android.support.v4.view.ViewPager.OnPageChangeListener
{

    private static final int NUM_ITEMS = 3;
    protected TitleSpinnerAdapterWithHeader mActionBarAdapter;
    private DetailsFragmentAdapter mAdapter;
    private int mBeginningIndex;
    private PageIndicator mIndicator;
    private boolean mIsLocationSwitchPending;
    private int mPendingLocationIndex;
    private RelativeLayout mProgressBarLayout;
    private AccuViewPager mViewPager;

    public AbsDetailsActivity()
    {
        mBeginningIndex = 0;
    }

    private List buildActionBarSpinnerLocationNames()
    {
        return getData().getPrettyNames();
    }

    private boolean doAdvancedSettingsNeedRefreshed()
    {
        return PreferenceUtils.get(this, "changed_advanced_settings_for_primary_activity", false);
    }

    private void executePendingNavigation()
    {
        if (NeedALocationList())
        {
            updateActionBarSelectedIndex(mPendingLocationIndex);
        }
        mIsLocationSwitchPending = false;
    }

    private int getActionBarSpinnerIndexFromModel(LocationModel locationmodel)
    {
        for (int i = 0; i < getData().getLocations().size(); i++)
        {
            if (locationmodel.equals((LocationModel)getData().getLocations().get(i)))
            {
                return i;
            }
        }

        return mActionBarAdapter.getAbsolutePositionOfHeaderItem(getString(R.string.CurrentLocation_Abbr25), 0);
    }

    private LocationModel getCurrentlySelectedLocation(int i)
    {
        ArrayList arraylist = getData().getLocations();
        if (arraylist.size() > i)
        {
            return (LocationModel)arraylist.get(i);
        } else
        {
            return getData().getLocationFromAliasedName(mActionBarAdapter.getItem(i));
        }
    }

    private LocationModel getLastViewedLocationModel()
    {
        LocationModel locationmodel1 = getData().getLastViewedLocation();
        LocationModel locationmodel = locationmodel1;
        if (locationmodel1 == null)
        {
            locationmodel = getData().getHomeLocation();
        }
        return locationmodel;
    }

    private void handleWeatherCallCompletedForPrimaryLocation(WeatherDataModel weatherdatamodel)
    {
        updateFragmentAdapterItems(weatherdatamodel);
        updateDma(weatherdatamodel);
    }

    private boolean haveUnitsBeenChanged()
    {
        return getData().getCurrentlyViewedWeatherDataModel().isMetric() != UserPreferences.isMetric(this);
    }

    private void initActionBarNavigationItem()
    {
        if (NeedALocationList())
        {
            setPendingNavigationIndex(getActionBarSpinnerIndexFromModel(getLastViewedLocationModel()));
        }
    }

    private void initAdapterContent(WeatherDataModel weatherdatamodel)
    {
        List list = buildTitles(weatherdatamodel, getResources().getConfiguration().locale);
        weatherdatamodel = buildContentList(weatherdatamodel);
        mAdapter.setDisplayContent(list, weatherdatamodel);
    }

    private boolean isCustomViewShowing()
    {
        return (getSupportActionBar().getDisplayOptions() & 0x10) == 16;
    }

    private boolean isFollowMeLocation(int i)
    {
        return getData().getLocations().size() <= i;
    }

    private boolean needsRefreshed()
    {
        boolean flag1 = true;
        WeatherDataModel weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
        LocationModel locationmodel = getData().getLocationFromKey(weatherdatamodel.getLocationKey());
        boolean flag2 = false | haveUnitsBeenChanged();
        boolean flag = flag2;
        if (locationmodel != null)
        {
            boolean flag3;
            if (getActionBarSpinnerIndexFromModel(locationmodel) != getSupportActionBar().getSelectedNavigationIndex())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag = flag2 | flag;
        }
        if (getData().hasCachedValue(weatherdatamodel.getLocationKey(), weatherdatamodel.isMetric(), getData().getLangId()))
        {
            flag1 = false;
        }
        flag3 = doAdvancedSettingsNeedRefreshed();
        if (doAdvancedSettingsNeedRefreshed())
        {
            resetAdvancedSettingsRefreshState();
        }
        return flag | flag1 | flag3;
    }

    private void resetAdvancedSettingsRefreshState()
    {
        PreferenceUtils.save(this, "changed_advanced_settings_for_primary_activity", false);
    }

    private void setActionBarToMyLocation()
    {
        if (NeedALocationList())
        {
            updateActionBarSelectedIndex(mActionBarAdapter.getAbsolutePositionOfHeaderItem(getString(R.string.CurrentLocation_Abbr25), 0));
        }
    }

    private void setMetricSettingsRefreshedFromDetailsPage(boolean flag)
    {
        PreferenceUtils.save(this, "metric_refreshed_from_details", flag);
    }

    private void setPendingNavigationIndex(int i)
    {
        if (!isCustomViewShowing() && NeedALocationList())
        {
            updateActionBarSelectedIndex(i);
            return;
        } else
        {
            mIsLocationSwitchPending = true;
            mPendingLocationIndex = i;
            return;
        }
    }

    private void updateAds()
    {
        AdTrackingController adtrackingcontroller = new AdTrackingController();
        if (getData().getCurrentFollowMeLocation() != null)
        {
            adtrackingcontroller.setWeatherDataModel(getData().getWeatherDataModelFromCode(getData().getCurrentFollowMeLocation().getLocKey()));
            adtrackingcontroller.setGpsWeather(true);
        } else
        {
            adtrackingcontroller.setWeatherDataModel(getData().getCurrentlyViewedWeatherDataModel());
            adtrackingcontroller.setGpsWeather(false);
        }
        adtrackingcontroller.setSelectedPage(getPageTypeForAdTracking());
        adtrackingcontroller.setDetailsSection(true);
        updateAdParameters(adtrackingcontroller);
        requestNewAd();
    }

    private void updateFragmentAdapterItems(WeatherDataModel weatherdatamodel)
    {
        getData().setCurrentlyViewedWeatherDataModel(weatherdatamodel);
        if (mAdapter.getContent().size() == 0)
        {
            initAdapterContent(weatherdatamodel);
            if (mIndicator != null)
            {
                mIndicator.notifyDataSetChanged();
            }
            mViewPager.setCurrentItem(mBeginningIndex);
        } else
        {
            initAdapterContent(weatherdatamodel);
            if (mIndicator != null)
            {
                mIndicator.notifyDataSetChanged();
                return;
            }
        }
    }

    protected boolean NeedALocationList()
    {
        return true;
    }

    protected TitleSpinnerAdapterWithHeader buildActionBarSpinner()
    {
        TitleSpinnerAdapterWithHeader titlespinneradapterwithheader = new TitleSpinnerAdapterWithHeader(this, R.layout.details_action_bar_spinner_item, buildActionBarSpinnerLocationNames(), getString(getActionBarHeaderId()));
        ArrayList arraylist = new ArrayList();
        LocationModel locationmodel = getData().getCurrentFollowMeLocation();
        if (locationmodel != null)
        {
            ArrayList arraylist1 = new ArrayList();
            HeaderGroupItem headergroupitem = new HeaderGroupItem(getString(R.string.CurrentLocation_Abbr25));
            arraylist1.add(locationmodel.getAliasedName());
            headergroupitem.setItems(arraylist1);
            arraylist.add(headergroupitem);
        }
        titlespinneradapterwithheader.setDropDownViewResource(R.layout.spinner_dropdown_item);
        titlespinneradapterwithheader.setHeaderGroupItems(arraylist);
        titlespinneradapterwithheader.setTitleSpinnerListener(this);
        titlespinneradapterwithheader.setOverrideDefaultActions(false);
        titlespinneradapterwithheader.setAdditionalPadding(true);
        titlespinneradapterwithheader.showHeaderBackground(true);
        return titlespinneradapterwithheader;
    }

    protected abstract List buildContentList(WeatherDataModel weatherdatamodel);

    protected abstract List buildTitles(WeatherDataModel weatherdatamodel, Locale locale);

    protected abstract int getActionBarHeaderId();

    protected abstract int getActionBarIcon();

    protected abstract DetailsFragmentAdapter getAdapter();

    protected abstract int getContentViewId();

    protected abstract float getFragmentPagerWidth();

    protected abstract MainContentPage getPageTypeForAdTracking();

    protected void hideContent()
    {
        if (mProgressBarLayout.getVisibility() == 8)
        {
            mProgressBarLayout.setVisibility(0);
            ObjectAnimator.ofFloat(mProgressBarLayout, "alpha", new float[] {
                0.0F, 1.0F
            }).setDuration(200L).start();
        }
    }

    protected void hideContentForRefreshManually()
    {
        if (mProgressBarLayout != null)
        {
            mProgressBarLayout.setVisibility(0);
            if (mProgressBarLayout.getVisibility() == 8)
            {
                mProgressBarLayout.setVisibility(0);
                ObjectAnimator.ofFloat(mProgressBarLayout, "alpha", new float[] {
                    0.0F, 1.0F
                }).setDuration(200L).start();
            }
        }
    }

    protected void init(int i)
    {
        setContentView(getContentViewId());
        mIndicator = (PageIndicator)findViewById(R.id.indicator);
        mViewPager = (AccuViewPager)findViewById(R.id.pager);
        mViewPager.setOffscreenPageLimit(2);
        mAdapter = getAdapter();
        mViewPager.setAdapter(mAdapter);
        mAdapter.setPageWidth(getFragmentPagerWidth());
        DmaView dmaview;
        if (mIndicator != null)
        {
            Utilities.setTypeFace(mIndicator, Data.getRobotoNormal());
            mIndicator.setViewPager(mViewPager);
            mIndicator.setOnPageChangeListener(this);
        } else
        {
            mViewPager.setOnPageChangeListener(this);
        }
        mProgressBarLayout = (RelativeLayout)findViewById(R.id.progress_layout);
        dmaview = (DmaView)findViewById(R.id.dma);
        if (dmaview != null)
        {
            dmaview.setBackgroundColor(0xff000000);
        }
        mBeginningIndex = i;
    }

    protected void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_gradient));
        actionbar.setNavigationMode(1);
        actionbar.setTitle("");
        TitleSpinnerAdapterWithHeader titlespinneradapterwithheader = buildActionBarSpinner();
        mActionBarAdapter = titlespinneradapterwithheader;
        actionbar.setListNavigationCallbacks(titlespinneradapterwithheader, this);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayUseLogoEnabled(false);
        actionbar.setIcon(getActionBarIcon());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        init(getIntent().getIntExtra("start_index", 0));
        initActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getSupportMenuInflater().inflate(R.menu.hourly_daily_news_details_overflow_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
        mActionBarAdapter = buildActionBarSpinner();
        getSupportActionBar().setListNavigationCallbacks(mActionBarAdapter, this);
        list = getData().getCurrentFollowMeLocation();
        if (locationsearch != null && !locationsearch.isEmpty())
        {
            locationsearch = (LocationSearchResult)locationsearch.get(0);
            list.setCoordinates(locationsearch.getGeoPosition().getLatitude(), locationsearch.getGeoPosition().getLongitude());
        }
        refresh(list.getKey());
        setActionBarToMyLocation();
        sendBroadcast(new Intent("com.accuweather.android.action.CURRENT_LOCATION_CHANGED"));
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() != R.id.refresh) goto _L2; else goto _L1
_L1:
        refreshManually(getData().getCurrentlyViewedWeatherDataModel().getLocationKey());
_L4:
        return super.onMenuItemSelected(i, menuitem);
_L2:
        if (menuitem.getItemId() == R.id.settings)
        {
            startActivity(new Intent(this, com/accuweather/android/preferences/SettingsActivity));
        } else
        if (menuitem.getItemId() == 0x102002c)
        {
            getData().clearTaskQueue();
            finish();
        } else
        if (menuitem.getItemId() == R.id.share)
        {
            handleShareSelectedFromOptionMenu();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        if (!isFollowMeLocation(i)) goto _L2; else goto _L1
_L1:
        getData().setFollowMeIsCurrentlyViewed(true);
        refreshFollowMeWeather();
_L4:
        if (mActionBarAdapter != null && mActionBarAdapter.getParent() != null)
        {
            mActionBarAdapter.getParent().requestLayout();
        }
        return false;
_L2:
        LocationModel locationmodel = getCurrentlySelectedLocation(i);
        if (locationmodel != null)
        {
            getData().setFollowMeIsCurrentlyViewed(false);
            refresh(locationmodel.getKey());
        } else
        if (getData().getCurrentFollowMeLocation() != null)
        {
            getData().setFollowMeIsCurrentlyViewed(true);
            refreshFollowMeWeather();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        Logger.d(this, "onPageSelected()");
        if (mIsLocationSwitchPending)
        {
            executePendingNavigation();
        }
        if (shouldShowBannerAds())
        {
            updateAds();
        }
    }

    public void onPause()
    {
        super.onPause();
        if (isFinishing())
        {
            getData().unregisterWeatherDataListener(this);
        }
        rememberLastViewedPageIndex();
    }

    public void onResume()
    {
        super.onResume();
        Logger.d(this, "onResume");
        if (!needsRefreshed()) goto _L2; else goto _L1
_L1:
        setMetricSettingsRefreshedFromDetailsPage(true);
        if (TextUtils.isEmpty(getData().getLastViewedLocation().getKey())) goto _L4; else goto _L3
_L3:
        refresh(getData().getLastViewedLocation().getKey());
_L6:
        return;
_L4:
        if (getData().getCurrentFollowMeLocation() != null)
        {
            refresh(getData().getCurrentFollowMeLocation().getKey());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
        getIntent().getExtras();
        if (shouldShowBannerAds())
        {
            updateAds();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onSpinnerHeaderGroupItemSelected(String s, int i)
    {
        getGpsLocation();
        getSupportActionBar().setNavigationMode(0);
        getSupportActionBar().setNavigationMode(1);
    }

    public void onSpinnerItemSelected(int i)
    {
    }

    public void onStart()
    {
        super.onStart();
        initActionBarNavigationItem();
    }

    public void onStop()
    {
        super.onStop();
        getData().unregisterWeatherDataListener(this);
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        resetProgressBar();
        for (int i = 0; i < list.size(); i++)
        {
            WeatherDataModel weatherdatamodel = (WeatherDataModel)list.get(i);
            if (weatherdatamodel.isPrimaryLocation())
            {
                handleWeatherCallCompletedForPrimaryLocation(weatherdatamodel);
                if (shouldShowBannerAds())
                {
                    updateAds();
                }
            }
            mViewPager.setVisibility(0);
        }

        super.onWeatherCallCompleted(list, list1);
    }

    protected void rememberLastViewedPageIndex()
    {
        int i = 0;
        if (mViewPager != null)
        {
            i = mViewPager.getCurrentItem();
        }
        getIntent().putExtra("start_index", i);
    }

    protected void showContent()
    {
        if (mProgressBarLayout.getVisibility() == 0)
        {
            mProgressBarLayout.setVisibility(8);
            ObjectAnimator.ofFloat(mProgressBarLayout, "alpha", new float[] {
                1.0F, 0.0F
            }).setDuration(200L).start();
        }
    }

    protected void updateActionBarSelectedIndex(int i)
    {
        getSupportActionBar().setSelectedNavigationItem(i);
    }
}
