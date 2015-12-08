// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.accuweather.android.actions.LocationMode;
import com.accuweather.android.actions.SaveLocationMode;
import com.accuweather.android.adapters.HeaderGroupItem;
import com.accuweather.android.adapters.MainFragmentAdapter;
import com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.fragments.AlertDialogFragment;
import com.accuweather.android.ias.PurchaseActivity;
import com.accuweather.android.maps.NativeMapActivity;
import com.accuweather.android.maps.WebViewMapActivity;
import com.accuweather.android.market.MarketUtils;
import com.accuweather.android.market.RatingPrompter;
import com.accuweather.android.minutecast.MinuteCastFlipperFragment;
import com.accuweather.android.models.BitmapCache;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.notifications.NotificationServiceBootstrapper;
import com.accuweather.android.preferences.SettingsActivity;
import com.accuweather.android.services.MockWeatherParser;
import com.accuweather.android.services.WearablesServiceExtended;
import com.accuweather.android.services.request.LocationAutoCompleteRequest;
import com.accuweather.android.services.request.LocationGeoRequest;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.services.request.MCSummaryRefreshTime;
import com.accuweather.android.services.request.WeatherRefreshTimer;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.AccuAdManager;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.AdTrackingController;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.ILocationNameAliaser;
import com.accuweather.android.utilities.LocationNameAliaser;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.PushUtils;
import com.accuweather.android.utilities.SystemClock;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.NavigationDrawer;
import com.accuweather.android.views.NavigationDrawerItemBuilder;
import com.accuweather.android.views.SlidingMenuLayout;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.ShareActionProvider;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.util.UAStringUtil;
import com.viewpagerindicator.PageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            VideoDetailsActivity, WebViewActivity

public abstract class AbsPrimaryActivity extends PurchaseActivity
    implements com.actionbarsherlock.app.ActionBar.OnNavigationListener, com.accuweather.android.fragments.HourlyFragment.IHourlyFragmentListener, com.accuweather.android.fragments.DailyFragment.IForecastFragmentListener, com.accuweather.android.actions.LocationMode.ILocationModeListener, com.accuweather.android.views.NavigationBar.INavigationBarListener, com.accuweather.android.views.NavigationDrawer.INavigationDrawerFragmentListener, com.accuweather.android.fragments.MapsImageFragment.IMapsListFragmentListener, com.accuweather.android.fragments.NewsListFragment.INewsListFragmentListener, com.accuweather.android.fragments.VideoListFragment.IVideoListFragmentListener, com.accuweather.android.fragments.LocationFragment.ILocationFragmentListener, com.accuweather.android.adapters.TitleSpinnerAdapterWithHeader.ITitleSpinnerListener, com.accuweather.android.dialogs.GenericAlertDialogFragment.AlertDialogFragmentListener, android.support.v4.view.ViewPager.OnPageChangeListener, ILocationNameAliaser, com.accuweather.android.fragments.NowFragment.INowFragmentListener, com.accuweather.android.minutecast.MinuteCastFlipperFragment.IMinuteCastFlipperListener
{

    private static final String NUMERIC_QUERY_REGEX = ".*\\d.*";
    private static MainFragmentAdapter mAdapter;
    protected static ViewPager mViewPager;
    private static long oneMinute = 0L;
    private static final long serialVersionUID = 1L;
    private BroadcastReceiver channelIdUpdateReceiver;
    private boolean isRestartActivity;
    private boolean isStartingFresh;
    private TitleSpinnerAdapterWithHeader mActionBarAdapter;
    private AdTrackingController mAdTrackingController;
    private int mCurrentPrimaryItem;
    private boolean mDisplayBlocked;
    private boolean mHasLaunchedAnotherActivity;
    private PageIndicator mIndicator;
    private boolean mIsChangingConfigurations;
    private LocationSearch mLastLocationSearch;
    private ActionMode mLocationMode;
    private LocationNameAliaser mLocationNameAliaser;
    private LocationRequester mLocationRequester;
    private MCSummaryRefreshTime mMCSummaryRefreshTime;
    private View mMainContentView;
    protected Menu mMenu;
    private boolean mMovedToPageForLocationJustAdded;
    private NavigationDrawer mNavigationDrawer;
    private boolean mPagedToLocations;
    private boolean mPagedToNow;
    private RelativeLayout mProgressBarLayout;
    private RatingPrompter mRatingPrompter;
    private SlidingMenuLayout mSlidingMenuLayout;
    private boolean mWasMapsAddLocationTilePressed;
    private WeatherRefreshTimer mWeatherRefreshTimer;
    private TextView summaryTextView;

    public AbsPrimaryActivity()
    {
        mCurrentPrimaryItem = 0;
        mLocationNameAliaser = new LocationNameAliaser(this);
        mHasLaunchedAnotherActivity = false;
        mDisplayBlocked = false;
        mWasMapsAddLocationTilePressed = false;
        mAdTrackingController = new AdTrackingController();
        isRestartActivity = true;
        isStartingFresh = false;
        channelIdUpdateReceiver = new BroadcastReceiver() {

            final AbsPrimaryActivity this$0;

            public void onReceive(Context context, Intent intent)
            {
                updateChannelIdField();
            }

            
            {
                this$0 = AbsPrimaryActivity.this;
                super();
            }
        };
    }

    private boolean areAnyWeatherModelsExpired()
    {
        List list = getData().getWeatherDataModels();
        SystemClock systemclock = new SystemClock();
        for (int i = 0; i < list.size(); i++)
        {
            if (((WeatherDataModel)list.get(i)).areAnySubModelsExpired(systemclock))
            {
                return true;
            }
        }

        return false;
    }

    private List buildActionBarSpinnerLocationNames()
    {
        return getData().getPrettyNames();
    }

    private Intent buildLocationSearchIntent(LocationSearch locationsearch, boolean flag)
    {
        Intent intent = new Intent("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE");
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        intent.putExtra("autocomplete_payload", Utilities.buildHtmlifiedLocationFullNames(this, locationsearch, flag1));
        intent.putExtra("is_autocomplete", flag);
        return intent;
    }

    private void clearData()
    {
        getData().clearAll();
        finish();
    }

    private boolean containsAutoCompleteRequest(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) instanceof LocationAutoCompleteRequest)
            {
                return true;
            }
        }

        return false;
    }

    private void deleteLocation(LocationModel locationmodel)
    {
        mLocationMode.finish();
        boolean flag = getData().deleteLocation(locationmodel.getKey());
        mActionBarAdapter.updateItems(buildActionBarSpinnerLocationNames());
        if (flag)
        {
            updateActionBarSelectedIndex(0);
            handleNewLocationSelected(0);
            return;
        } else
        {
            locationmodel = getData().getCurrentlyViewedWeatherDataModel().getLocationKey();
            updateActionBarSelectedIndex(getIndexOfActionBarLocation(getData().getLocationFromKey(locationmodel)));
            mNavigationDrawer.setSpinnerItems(getData().getLocNames());
            refresh(locationmodel);
            return;
        }
    }

    private boolean doAdvancedSettingsNeedRefreshed()
    {
        return PreferenceUtils.get(this, "changed_advanced_settings_for_primary_activity", false);
    }

    private boolean doesActionBarSelectionRequireUpdate(LocationModel locationmodel)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (locationmodel != null)
        {
            flag = flag1;
            if (getActionBarSpinnerIndexFromModel(locationmodel) != getSupportActionBar().getSelectedNavigationIndex())
            {
                flag = true;
            }
        }
        return flag;
    }

    private void forceAdapterUpdate()
    {
        if (mViewPager != null)
        {
            mViewPager.post(new Runnable() {

                final AbsPrimaryActivity this$0;

                public void run()
                {
                    if (AbsPrimaryActivity.mAdapter != null)
                    {
                        WeatherDataModel weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
                        if (weatherdatamodel != null)
                        {
                            AbsPrimaryActivity.mAdapter.refreshContent(weatherdatamodel);
                            AbsPrimaryActivity.mAdapter.notifyDataSetChanged();
                            if (mIndicator != null)
                            {
                                mIndicator.notifyDataSetChanged();
                            }
                        }
                    }
                }

            
            {
                this$0 = AbsPrimaryActivity.this;
                super();
            }
            });
        }
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
        }
        if (getData().getCurrentFollowMeLocation() != null)
        {
            return getData().getCurrentFollowMeLocation();
        } else
        {
            return getData().getLocationFromAliasedName(mActionBarAdapter.getItem(i));
        }
    }

    private MainContentPage getCurrentlySelectedPage()
    {
        if (mAdapter != null && mViewPager != null)
        {
            return mAdapter.getPage(mViewPager.getCurrentItem());
        } else
        {
            return null;
        }
    }

    private String getGraphTogglePreferenceKey(int i)
    {
        MainContentPage maincontentpage = mAdapter.getPage(i);
        if (MainContentPage.Hourly.equals(maincontentpage))
        {
            return "hourly_graph_showing";
        }
        if (MainContentPage.Forecast.equals(maincontentpage))
        {
            return "forecast_graph_showing";
        } else
        {
            return null;
        }
    }

    private int getIndexOfActionBarLocation(LocationModel locationmodel)
    {
        boolean flag = false;
        int i = 0;
        do
        {
label0:
            {
                int j = ((flag) ? 1 : 0);
                if (i < mActionBarAdapter.getItemCount())
                {
                    if (!mActionBarAdapter.getItem(i).equals(locationmodel.getAliasedName()))
                    {
                        break label0;
                    }
                    j = i;
                }
                return j;
            }
            i++;
        } while (true);
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

    private String getLocationKeyFromPushTag(String s)
    {
        String as[] = s.split(":");
        s = as[0];
        if (as.length > 1)
        {
            s = as[1];
        }
        return s;
    }

    private int getMainLayoutResourceId()
    {
        if (Utilities.shouldTabletBeTreatedAsPhone())
        {
            return R.layout.main_tablet_treated_as_phone;
        } else
        {
            return R.layout.main;
        }
    }

    private Class getMapActivityClass()
    {
        Logger.d(this, (new StringBuilder()).append("checkGL20Support is ").append(Utilities.checkGL20Support(this)).toString());
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) == 0 && Utilities.checkGL20Support(this))
        {
            return com/accuweather/android/maps/NativeMapActivity;
        } else
        {
            return com/accuweather/android/maps/WebViewMapActivity;
        }
    }

    private WeatherUpdateRequest getRequestForLocationKey(String s, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            WeatherUpdateRequest weatherupdaterequest = (WeatherUpdateRequest)list.next();
            if (weatherupdaterequest.getLocationKey().equals(s))
            {
                return weatherupdaterequest;
            }
        }

        return null;
    }

    private int getStartingPageIndex()
    {
        MainContentPage maincontentpage1 = MainContentPage.Now;
        MainContentPage maincontentpage = maincontentpage1;
        if (getIntent() != null)
        {
            maincontentpage = maincontentpage1;
            if (getIntent().hasExtra("page_index_from_widget"))
            {
                maincontentpage = (MainContentPage)getIntent().getSerializableExtra("page_index_from_widget");
            }
        }
        maincontentpage1 = maincontentpage;
        if (getIntent() != null)
        {
            maincontentpage1 = maincontentpage;
            if (getIntent().hasExtra("page_index_from_now_card"))
            {
                maincontentpage1 = (MainContentPage)getIntent().getSerializableExtra("page_index_from_now_card");
            }
        }
        return mAdapter.getCorrespondingPageIndex(maincontentpage1);
    }

    private void goHome()
    {
        if (mSlidingMenuLayout.isOpen())
        {
            hideNavigationDrawer();
            onHomePressedWhileNavigationDrawerOpen();
            return;
        } else
        {
            showNavigationDrawer();
            onHomePressedWhileNavigationDrawerClosed();
            return;
        }
    }

    private void graphsOff()
    {
        updateGraphs(false);
    }

    private void graphsOn()
    {
        updateGraphs(true);
    }

    private void handleAlertsDialogNegativeClick()
    {
        if (PushUtils.isStartingFromPush(this))
        {
            PreferenceUtils.save(this, "from_push_alert", false);
        }
    }

    private void handleAlertsDialogPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        if (PushUtils.isStartingFromPush(this))
        {
            PreferenceUtils.save(this, "from_push_alert", false);
            showAlertWebview(PushUtils.createAlertUrl(getData().getCurrentlyViewedWeatherDataModel()));
        } else
        {
            List list = getData().getCurrentlyViewedWeatherDataModel().getAlerts();
            if (!list.isEmpty())
            {
                showAlertWebview(PushUtils.getAlertLink(list, this));
            } else
            {
                showAlertWebview(PushUtils.createAlertUrl(getData().getCurrentlyViewedWeatherDataModel()));
            }
        }
        genericalertdialogfragment.dismiss();
    }

    private void handleCTestQuery()
    {
        loadMockCelsiusData();
        updateUiForMockLocation();
    }

    private void handleFTestQuery()
    {
        loadFahrenheitMockData();
        updateUiForMockLocation();
    }

    private void handleNewLocationSelected(int i)
    {
        LocationModel locationmodel;
        mNavigationDrawer.setSelectedItem(i);
        locationmodel = getCurrentlySelectedLocation(i);
        if (!isFollowMeLocation(i)) goto _L2; else goto _L1
_L1:
        getData().setFollowMeIsCurrentlyViewed(true);
        refreshFollowMeWeather();
_L4:
        if (mActionBarAdapter != null && mActionBarAdapter.getParent() != null)
        {
            mActionBarAdapter.getParent().requestLayout();
        }
        return;
_L2:
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

    private void handlePrepareOptionsMenu(Menu menu)
    {
        mMenu = menu;
        if (!Utilities.shouldShowGpsButton(this))
        {
            mMenu.removeItem(R.id.gps);
        }
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            mMenu.removeItem(R.id.share);
        }
        if (mViewPager != null)
        {
            updateGraphToggleMenuOptions(mViewPager.getCurrentItem());
        }
    }

    private void handleStartFromPush()
    {
        Object obj = PreferenceUtils.get(this, "push_city_tag", "");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = getLocationKeyFromPushTag(((String) (obj)));
            obj = getData().getWeatherDataModelFromCode(((String) (obj)));
            if (obj != null && ((WeatherDataModel) (obj)).getAlertIsActive() && ((WeatherDataModel) (obj)).getAlerts().size() > 0)
            {
                obj = AlertDialogFragment.newInstance(((WeatherDataModel) (obj)));
                ((AlertDialogFragment) (obj)).setTitleIconResourceId(R.drawable.alert_img_small);
                ((AlertDialogFragment) (obj)).show(getSupportFragmentManager(), null);
            }
        }
    }

    private void handleV2SimulationQuery()
    {
        PreferenceUtils.save(this, "simulate_v2", true);
        finish();
    }

    private boolean haveMetricSettingsBeenRefreshedFromDetailsPage()
    {
        return PreferenceUtils.get(this, "metric_refreshed_from_details", false);
    }

    private boolean haveUnitsBeenChanged()
    {
        return getData().getCurrentlyViewedWeatherDataModel().isMetric() != UserPreferences.isMetric(this);
    }

    private void hideVirtualKeyboardIfRotationInProgress()
    {
        if (Utilities.isHoneycombOrGreater())
        {
            if (isChangingConfigurations())
            {
                hideVirtualKeyboard();
            }
        } else
        if (mIsChangingConfigurations)
        {
            hideVirtualKeyboard();
            return;
        }
    }

    private void init()
    {
        mSlidingMenuLayout = (SlidingMenuLayout)findViewById(R.id.sliding_menu_layout);
        mMainContentView = findViewById(R.id.content);
        mNavigationDrawer = (NavigationDrawer)findViewById(R.id.navigation_drawer);
        mNavigationDrawer.setNavigationDrawerFragmentListener(this);
        mNavigationDrawer.setSpinnerVisibility(8);
        mProgressBarLayout = (RelativeLayout)findViewById(R.id.progress_layout);
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setOffscreenPageLimit(1);
        mIndicator = (PageIndicator)findViewById(R.id.indicator);
        mAdapter = new MainFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        mViewPager.setAdapter(mAdapter);
        mAdapter.setPageWidth(getFragmentPagerWidth());
        WeatherDataModel weatherdatamodel;
        if (mIndicator != null)
        {
            Utilities.setTypeFace(mIndicator, Data.getRobotoNormal());
            mIndicator.setViewPager(mViewPager);
            mIndicator.setOnPageChangeListener(this);
        } else
        {
            mViewPager.setOnPageChangeListener(this);
        }
        weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
        if (weatherdatamodel != null)
        {
            updateFragmentAdapterItems(weatherdatamodel);
        }
        mViewPager.setCurrentItem(getStartingPageIndex());
        getData().registerWeatherDataListener(this);
    }

    private void initActionBarNavigationItem(LocationModel locationmodel)
    {
        updateActionBarSelectedIndex(getActionBarSpinnerIndexFromModel(locationmodel));
    }

    private void initImageLoader()
    {
        Object obj = (new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder()).cacheOnDisc(true).cacheInMemory(true).build();
        obj = (new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(getApplicationContext())).defaultDisplayImageOptions(((com.nostra13.universalimageloader.core.DisplayImageOptions) (obj))).memoryCache(new WeakMemoryCache()).build();
        ImageLoader.getInstance().init(((com.nostra13.universalimageloader.core.ImageLoaderConfiguration) (obj)));
    }

    private boolean isFollowMeLocation(int i)
    {
        return getData().getLocations().size() <= i;
    }

    private boolean isMapPageVisible(MainContentPage maincontentpage)
    {
        if (Utilities.isScreenSizeLargeOrGreater(this))
        {
            return MainContentPage.Forecast.equals(maincontentpage) || MainContentPage.Maps.equals(maincontentpage) || MainContentPage.Video.equals(maincontentpage);
        } else
        {
            return MainContentPage.Maps.equals(maincontentpage);
        }
    }

    private boolean isTrackMinuteCastSummary(WeatherDataModel weatherdatamodel)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (weatherdatamodel != null)
        {
            flag = flag1;
            if (weatherdatamodel.getMinuteCastResult() != null)
            {
                flag = flag1;
                if (weatherdatamodel.getMinuteCastResult().getSummary() != null)
                {
                    flag = flag1;
                    if (!TextUtils.isEmpty(weatherdatamodel.getMinuteCastResult().getSummary().getPhrase()))
                    {
                        flag = flag1;
                        if (!MinuteCastUtilities.isAllDry(weatherdatamodel.getMinuteCastResult()))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    private void loadFahrenheitMockData()
    {
        MockWeatherParser mockweatherparser = new MockWeatherParser();
        mockweatherparser.addMockLocation("2233o81", getData());
        mockweatherparser.loadMockWeatherDataAsync("2233o81", getData());
    }

    private void loadMockCelsiusData()
    {
        MockWeatherParser mockweatherparser = new MockWeatherParser();
        mockweatherparser.addMockLocation("35o127", getData());
        mockweatherparser.loadMockWeatherDataAsync("35o127", getData());
    }

    private void logDeviceInfo()
    {
        android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        int i = android.os.Build.VERSION.SDK_INT;
        Logger.i(this, (new StringBuilder()).append("DISPLAY IS ").append(displaymetrics).append(" AND API LEVEL IS ").append(i).toString());
    }

    private void manualRefresh()
    {
        int i = getSupportActionBar().getSelectedNavigationIndex();
        LocationModel locationmodel = getData().getLocationFromAliasedName(mActionBarAdapter.getItem(i));
        if (locationmodel != null)
        {
            refreshForAllLocationsManually(locationmodel.getKey());
        } else
        if (getData().getCurrentFollowMeLocation() != null)
        {
            getGpsLocation();
            return;
        }
    }

    private void moveToPageForLocationJustAdded()
    {
        if (mViewPager != null && mAdapter != null)
        {
            mMovedToPageForLocationJustAdded = true;
            int i = mAdapter.getCorrespondingPageIndex(MainContentPage.Now);
            if (mWasMapsAddLocationTilePressed)
            {
                i = mAdapter.getCorrespondingPageIndex(MainContentPage.Maps);
            }
            mViewPager.setCurrentItem(i, true);
        }
    }

    private boolean needsRefresh()
    {
        WeatherDataModel weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
        if (weatherdatamodel != null)
        {
            LocationModel locationmodel = getData().getLocationFromKey(weatherdatamodel.getLocationKey());
            if (doAdvancedSettingsNeedRefreshed())
            {
                resetAdvancedSettingsRefreshState();
            }
            if (!haveUnitsBeenChanged() && !doesActionBarSelectionRequireUpdate(locationmodel) && getData().hasCachedValue(weatherdatamodel.getLocationKey(), weatherdatamodel.isMetric(), getData().getLangId()) && !doAdvancedSettingsNeedRefreshed() && !haveMetricSettingsBeenRefreshedFromDetailsPage() && !areAnyWeatherModelsExpired())
            {
                return false;
            }
        }
        return true;
    }

    private void pageToLocationsFragment()
    {
        mPagedToLocations = true;
        int i = mAdapter.getCorrespondingPageIndex(MainContentPage.Location);
        if (i != -1)
        {
            mViewPager.setCurrentItem(i, true);
        }
        Intent intent = new Intent("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE");
        intent.putExtra("request_focus", true);
        sendBroadcast(intent);
    }

    private void refreshForOnStart(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            refreshForAllLocationsBatch(s);
        } else
        if (getData().getCurrentFollowMeLocation() != null)
        {
            refreshForAllLocationsBatch(getData().getCurrentFollowMeLocation().getKey());
            return;
        }
    }

    private void resetAdvancedSettingsRefreshState()
    {
        PreferenceUtils.save(this, "changed_advanced_settings_for_primary_activity", false);
    }

    private void setActionBarToMyLocation()
    {
        updateActionBarSelectedIndex(mActionBarAdapter.getAbsolutePositionOfHeaderItem(getString(R.string.CurrentLocation_Abbr25), 0));
    }

    private void setMetricSettingsRefreshedFromDetailsPage(boolean flag)
    {
        PreferenceUtils.save(this, "metric_refreshed_from_details", flag);
    }

    private void settingsSelected()
    {
        mHasLaunchedAnotherActivity = true;
        startActivity(new Intent(this, com/accuweather/android/preferences/SettingsActivity));
    }

    private boolean shouldShowLocationSearchDropDown(LocationSearch locationsearch, List list)
    {
        while (containsAutoCompleteRequest(list) || locationsearch.isEmpty() || locationsearch.size() > 1) 
        {
            return true;
        }
        return false;
    }

    private boolean shouldShowNavigationDrawerArrow()
    {
        return !Utilities.isLandscape(this) || !Utilities.isScreenSizeLargeOrGreater(this);
    }

    private void showViewPagerContent()
    {
        mViewPager.setVisibility(0);
    }

    private void showWeatherDebugDialog()
    {
        StringBuilder stringbuilder = new StringBuilder();
        List list = getData().getWeatherDataModels();
        ArrayList arraylist = getData().getLocations();
        LocationModel locationmodel = getData().getCurrentFollowMeLocation();
        stringbuilder.append("Weather Models:").append("\n\n");
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(((WeatherDataModel)list.get(i)).buildPrettyDebugString()).append("\n\n");
        }

        stringbuilder.append("--------------").append("\n");
        stringbuilder.append("Locations:").append("\n\n");
        for (int j = 0; j < arraylist.size(); j++)
        {
            stringbuilder.append(arraylist.get(j)).append("\n\n");
        }

        if (locationmodel != null)
        {
            stringbuilder.append("--------------").append("\n");
            stringbuilder.append("GPS Location:").append("\n");
            stringbuilder.append(locationmodel).append("\n");
        }
        showMessageDialog(stringbuilder.toString());
    }

    private void startNewActivity(Class class1, int i)
    {
        mHasLaunchedAnotherActivity = true;
        startActivity((new Intent(this, class1)).addFlags(0x20000).putExtra("start_index", i));
    }

    private void startNowRefeshTimer(List list)
    {
        mMCSummaryRefreshTime = MCSummaryRefreshTime.getInstance();
        if (!mMCSummaryRefreshTime.isEqualWithCurrentData(list))
        {
            mMCSummaryRefreshTime.stop();
            mMCSummaryRefreshTime.setListSummaries(list);
            mMCSummaryRefreshTime.setTextView(summaryTextView);
            mMCSummaryRefreshTime.start();
        }
    }

    private void startTrackGAForMinuteCast(int i)
    {
        MainContentPage maincontentpage = mAdapter.getPage(i);
        if (maincontentpage == null) goto _L2; else goto _L1
_L1:
        static class _cls3
        {

            static final int $SwitchMap$com$accuweather$android$utilities$MainContentPage[];

            static 
            {
                $SwitchMap$com$accuweather$android$utilities$MainContentPage = new int[MainContentPage.values().length];
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Now.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.MinuteCast.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.accuweather.android.utilities.MainContentPage[maincontentpage.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 45
    //                   2 84;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        WeatherDataModel weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
        if (isTrackMinuteCastSummary(weatherdatamodel))
        {
            AccuAnalytics.logStateEvent(this, "Views of MinuteCast summary");
            return;
        }
        if (MinuteCastUtilities.isMinuteCastLocation(weatherdatamodel))
        {
            AccuAnalytics.logStateEvent(this, "Views of Teaser content");
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (!Utilities.isLandscape(this))
        {
            if (Utilities.isScreenSizeLargeOrGreater(this))
            {
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast Circle view");
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast List view");
                return;
            }
            String s = PreferenceUtils.get(this, "last_selected_minutecast_page", MinuteCastFlipperFragment.getLastSelectedView().viewName);
            if (com.accuweather.android.minutecast.MinuteCastFlipperFragment.MinuteCastViewType.Circle.viewName.equals(s))
            {
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast Circle view");
                return;
            } else
            {
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast List view");
                return;
            }
        }
        if (Utilities.isScreenSizeLargeOrGreater(this))
        {
            String s1 = PreferenceUtils.get(this, "last_selected_minutecast_page", MinuteCastFlipperFragment.getLastSelectedView().viewName);
            if (com.accuweather.android.minutecast.MinuteCastFlipperFragment.MinuteCastViewType.Circle.viewName.equals(s1))
            {
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast Circle view");
                return;
            } else
            {
                AccuAnalytics.logStateEvent(this, "Views on MinuteCast List view");
                return;
            }
        } else
        {
            AccuAnalytics.logStateEvent(this, "Views on MinuteCast List view");
            return;
        }
    }

    private void updateActionBarForMockLocation()
    {
        mNavigationDrawer.setSpinnerItems(getData().getPrettyNames());
        updateActionBarSpinner();
        updateActionBarSelectedIndex(mActionBarAdapter.getItemCount() - 1);
    }

    private void updateActionBarForNewLocation(String s)
    {
        s = getData().getLocationFromKey(s);
        mNavigationDrawer.setSpinnerItems(getData().getPrettyNames());
        updateActionBarSpinner();
        updateActionBarSelectedIndex(getActionBarSpinnerIndexFromModel(s));
    }

    private void updateActionBarHomeUpArrow()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(shouldShowNavigationDrawerArrow());
            actionbar.setHomeButtonEnabled(shouldShowNavigationDrawerArrow());
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
        adtrackingcontroller.setSelectedPage(getCurrentlySelectedPage());
        updateAdParameters(adtrackingcontroller);
        requestNewAd();
    }

    private void updateChannelIdField()
    {
        String s1 = UAirship.shared().getPushManager().getChannelId();
        String s = s1;
        if (UAStringUtil.isEmpty(s1))
        {
            s = "";
        }
        Logger.d(this, (new StringBuilder()).append("updateChannelIdField is ").append(s).toString());
    }

    private void updateFragmentAdapterItems(WeatherDataModel weatherdatamodel)
    {
        updateFragmentAdapterItems(weatherdatamodel, null);
    }

    private void updateFragmentAdapterItems(WeatherDataModel weatherdatamodel, WeatherUpdateRequest weatherupdaterequest)
    {
        MainContentPage maincontentpage = getCurrentlySelectedPage();
        int i = mAdapter.getContent().size();
        weatherdatamodel = mAdapter.refreshContent(weatherdatamodel);
        if (i != mAdapter.getContent().size())
        {
            mAdapter.notifyDataSetChanged();
            if (mIndicator != null)
            {
                mIndicator.notifyDataSetChanged();
            }
            int j = mAdapter.getCorrespondingPageIndex(maincontentpage);
            if (j > -1)
            {
                mViewPager.setCurrentItem(j);
            }
        }
        weatherdatamodel = (new Intent("accuwx.intent.action.UPDATE_FRAGMENT")).putExtra("fragment_payload", weatherdatamodel);
        if (weatherupdaterequest != null && weatherupdaterequest.isResultOfTimerRefresh())
        {
            weatherdatamodel.putExtra("weather_update_timer_based", true);
        }
        sendBroadcast(weatherdatamodel);
    }

    private void updateGraphToggleMenuOptions(int i)
    {
        if (mMenu != null)
        {
            boolean flag2 = false;
            boolean flag3 = false;
            String s = getGraphTogglePreferenceKey(i);
            boolean flag1 = flag2;
            boolean flag = flag3;
            if (s != null)
            {
                flag1 = flag2;
                flag = flag3;
                if (!Utilities.isLandscape(this))
                {
                    flag1 = PreferenceUtils.get(this, s, true);
                    if (!flag1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            mMenu.setGroupVisible(R.id.graph_on_group, flag);
            mMenu.setGroupVisible(R.id.graph_off_group, flag1);
        }
    }

    private void updateGraphs(boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("hourly_graph_showing", flag).putBoolean("forecast_graph_showing", flag).commit();
        Menu menu = mMenu;
        int i = R.id.graph_on_group;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        menu.setGroupVisible(i, flag1);
        mMenu.setGroupVisible(R.id.graph_off_group, flag);
        updateFragmentAdapterItems(getData().getCurrentlyViewedWeatherDataModel());
    }

    private void updateMapsAddLocationTilePressed()
    {
        if (mViewPager != null && mAdapter != null)
        {
            MainContentPage maincontentpage = getCurrentlySelectedPage();
            if (maincontentpage != null && !MainContentPage.Location.equals(maincontentpage))
            {
                mWasMapsAddLocationTilePressed = false;
            }
        }
    }

    private void updateNavigationDrawerForPrimaryLocation(WeatherDataModel weatherdatamodel)
    {
        mNavigationDrawer.setItems(NavigationDrawerItemBuilder.buildNavigationDrawerItems(weatherdatamodel, this));
    }

    private void updateUiForMockLocation()
    {
        mViewPager.setCurrentItem(1, true);
        updateActionBarForMockLocation();
        Intent intent = new Intent("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE");
        intent.putExtra("clear_input", true);
        sendBroadcast(intent);
    }

    private boolean wasAppStartedFromFollowMeWidget()
    {
        if (getIntent() != null && getIntent().hasExtra("page_index_from_widget") && getIntent().hasExtra("location_code"))
        {
            return "-1".equals(getIntent().getStringExtra("location_code"));
        } else
        {
            return false;
        }
    }

    private boolean weatherCallContainsNonPrimaryLocation(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!((WeatherDataModel)list.next()).isPrimaryLocation())
            {
                return true;
            }
        }

        return false;
    }

    protected TitleSpinnerAdapterWithHeader buildActionBarSpinner()
    {
        TitleSpinnerAdapterWithHeader titlespinneradapterwithheader = new TitleSpinnerAdapterWithHeader(this, R.layout.spinner_item, buildActionBarSpinnerLocationNames());
        ArrayList arraylist = new ArrayList();
        Object obj = getData().getCurrentFollowMeLocation();
        if (obj != null)
        {
            ArrayList arraylist1 = new ArrayList();
            HeaderGroupItem headergroupitem1 = new HeaderGroupItem(getString(R.string.CurrentLocation_Abbr25));
            arraylist1.add(((LocationModel) (obj)).getAliasedName());
            headergroupitem1.setItems(arraylist1);
            arraylist.add(headergroupitem1);
        }
        obj = new ArrayList();
        HeaderGroupItem headergroupitem = new HeaderGroupItem(getResources().getString(R.string.ManageMyLocations));
        ((ArrayList) (obj)).add(getResources().getString(R.string.AddLocation));
        headergroupitem.setItems(((ArrayList) (obj)));
        arraylist.add(headergroupitem);
        titlespinneradapterwithheader.setHeaderGroupItems(arraylist);
        titlespinneradapterwithheader.setTitleSpinnerListener(this);
        titlespinneradapterwithheader.setOverrideDefaultActions(false);
        titlespinneradapterwithheader.setAdditionalPadding(true);
        titlespinneradapterwithheader.showHeaderBackground(true);
        return titlespinneradapterwithheader;
    }

    protected String buildNavigationDrawerLocationItem(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        WeatherDataModel weatherdatamodel;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); stringbuilder.append(list.getAliasedName()).append(": ").append(weatherdatamodel.getTemperature()).append("\260 "))
        {
            weatherdatamodel = (WeatherDataModel)iterator.next();
            LocationModel locationmodel = getData().getLocationFromKey(weatherdatamodel.getLocationKey());
            list = locationmodel;
            if (locationmodel == null)
            {
                list = getData().getCurrentFollowMeLocation();
            }
        }

        return stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (motionevent != null)
        {
            if (!mDisplayBlocked)
            {
                boolean flag;
                try
                {
                    flag = super.dispatchTouchEvent(motionevent);
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    return true;
                }
                return flag;
            }
            int i = mMainContentView.getLeft();
            int j = getSupportActionBar().getHeight();
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            if (f >= (float)i && f1 >= (float)(j + 10))
            {
                hideNavigationDrawer();
                return true;
            }
            boolean flag1;
            try
            {
                flag1 = super.dispatchTouchEvent(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return true;
            }
            return flag1;
        } else
        {
            return false;
        }
    }

    protected abstract Class getDailyActivity();

    protected abstract float getFragmentPagerWidth();

    protected abstract Class getHourlyActivity();

    protected abstract Class getNewsActivity();

    public String getSummaryFromNowTimerService()
    {
        return mMCSummaryRefreshTime.getSummaryFromNowTimer();
    }

    protected void handleMapsLoaded(HashMap hashmap, boolean flag)
    {
        BitmapCache.setMapHashMap(hashmap);
        int i = mAdapter.getCorrespondingPageIndex(MainContentPage.Maps);
        if (i != -1)
        {
            mAdapter.getContent().set(i, Boolean.valueOf(flag));
            sendBroadcast((new Intent("accuwx.intent.action.UPDATE_FRAGMENT")).putExtra("fragment_payload", flag));
        }
    }

    protected void handleMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == R.id.gps)
        {
            getGpsLocation();
        } else
        {
            if (menuitem.getItemId() == R.id.refresh)
            {
                manualRefresh();
                return;
            }
            if (menuitem.getItemId() == R.id.settings)
            {
                settingsSelected();
                return;
            }
            if (menuitem.getItemId() == 0x102002c)
            {
                goHome();
                return;
            }
            if (menuitem.getItemId() == R.id.graphs_on)
            {
                graphsOn();
                return;
            }
            if (menuitem.getItemId() == R.id.graphs_off)
            {
                graphsOff();
                return;
            }
            if (menuitem.getItemId() == R.id.share)
            {
                handleShareSelectedFromOptionMenu();
                return;
            }
        }
    }

    protected void handleNavigationBarItemClicked(int i)
    {
        getData().setLastViewedPage(i + 1);
        mViewPager.setCurrentItem(getData().getLastViewedPage());
    }

    protected void handleNavigationDrawerListItemSelected(int i)
    {
        int j = i;
        if (mAdapter != null)
        {
            i++;
            j = i;
            if (i == mAdapter.getCount())
            {
                j = 0;
            }
        }
        mViewPager.setCurrentItem(j);
    }

    protected void handleWeatherCallCompletedForPrimaryLocation(WeatherDataModel weatherdatamodel, WeatherUpdateRequest weatherupdaterequest)
    {
        updateFragmentAdapterItems(weatherdatamodel, weatherupdaterequest);
        updateNavigationDrawerForPrimaryLocation(weatherdatamodel);
        updateDma(weatherdatamodel);
        NotificationServiceBootstrapper.bootstrap(this);
        startNowRefeshTimer(weatherdatamodel.getMinuteCastResult().getSummaries());
        if (!isRestartActivity)
        {
            startTrackGAForMinuteCast(mViewPager.getCurrentItem());
            return;
        } else
        {
            isRestartActivity = false;
            return;
        }
    }

    protected void handleWeatherCallCompletedForSecondaryLocations(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            setWeatherDataModelDma((WeatherDataModel)list.get(i));
        }

        list = new FragmentPayload();
        sendBroadcast((new Intent("accuwx.intent.action.UPDATE_FRAGMENT")).putExtra("fragment_payload", list));
    }

    protected void hideContent()
    {
        if (mProgressBarLayout != null && mProgressBarLayout.getVisibility() == 8)
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

    protected void hideNavigationDrawer()
    {
        mDisplayBlocked = false;
        mSlidingMenuLayout.closeMenu();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    protected final void hideVirtualKeyboard()
    {
        GuiUtils.hideVirtualKeyboard(getCurrentFocus(), this);
    }

    protected void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_gradient));
        actionbar.setNavigationMode(1);
        actionbar.setTitle("");
        actionbar.setDisplayUseLogoEnabled(true);
        TitleSpinnerAdapterWithHeader titlespinneradapterwithheader = buildActionBarSpinner();
        mActionBarAdapter = titlespinneradapterwithheader;
        actionbar.setListNavigationCallbacks(titlespinneradapterwithheader, this);
        setSupportProgressBarVisibility(false);
    }

    protected void mapAddLocationTilePressed()
    {
        mWasMapsAddLocationTilePressed = true;
        pageToLocationsFragment();
    }

    protected void mapExistingLocationTilePressed(String s)
    {
        mHasLaunchedAnotherActivity = true;
        getData().setCurrentlyViewedWeatherDataModel(getData().getWeatherDataModelFromCode(s));
        s = new Intent(this, getMapActivityClass());
        s.addFlags(0x20000);
        startActivity(s);
    }

    public void onActionItemClicked(LocationModel locationmodel, ActionMode actionmode, MenuItem menuitem)
    {
        if (!menuitem.getTitle().equals(getString(R.string.HomeLocation))) goto _L2; else goto _L1
_L1:
        mLocationMode.finish();
        getData().setHomeLocation(locationmodel.getKey());
_L4:
        locationmodel = new FragmentPayload();
        sendBroadcast((new Intent("accuwx.intent.action.UPDATE_FRAGMENT")).putExtra("fragment_payload", locationmodel));
        return;
_L2:
        if (menuitem.getTitle().equals(getString(R.string.Delete)))
        {
            deleteLocation(locationmodel);
        } else
        if (menuitem.getTitle().equals(getString(R.string.Nickname)))
        {
            mLocationMode.finish();
            mLocationNameAliaser.showAliasDialog(locationmodel, this);
        } else
        if (menuitem.getTitle().equals(getString(R.string.SaveLocation)))
        {
            mLocationMode.finish();
            getData().addLocation(locationmodel);
            updateActionBarForNewLocation(locationmodel.getLocKey());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAddressSearchFieldTapped()
    {
        if (mAdapter != null && mViewPager != null)
        {
            int i = mAdapter.getCorrespondingPageIndex(MainContentPage.MinuteCast);
            if (i != -1)
            {
                mViewPager.setCurrentItem(i, true);
            }
        }
    }

    public void onAliasChanged(LocationModel locationmodel)
    {
        getData().markAsDirty();
        getData().saveLocations();
        getData().saveWeather();
        mAdapter.notifyDataSetChanged();
        updateActionBarSpinner();
    }

    public void onBackPressed()
    {
        if (mSlidingMenuLayout.isOpen())
        {
            hideNavigationDrawer();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mLocationRequester = new LocationRequester(this);
        mIsChangingConfigurations = false;
        mRatingPrompter = new RatingPrompter(this);
        logDeviceInfo();
        MarketUtils.captureAppUpgradeIfApplicable(this);
        (new PartnerCoding()).fixInvalidPartnerCodeIfRequired(this);
        GoogleAnalytics.getInstance(this).setDebug(false);
        setContentView(getMainLayoutResourceId());
        mRatingPrompter.setInstallDate();
        if (com.accuweather.android.utilities.Constants.PackageProperties.IS_FORCE_STOPPED)
        {
            isStartingFresh = true;
            com.accuweather.android.utilities.Constants.PackageProperties.IS_FORCE_STOPPED = false;
        }
        init();
        initActionBar();
        initImageLoader();
        mWeatherRefreshTimer = new WeatherRefreshTimer(getData());
        mWeatherRefreshTimer.setInitialExecutionDelay(oneMinute);
        mWeatherRefreshTimer.setRefreshIntervalMillis(oneMinute);
        startNowRefeshTimer(getData().getCurrentlyViewedWeatherDataModel().getMinuteCastResult().getSummaries());
        bundle = new Intent(this, com/accuweather/android/services/WearablesServiceExtended);
        bundle.putExtra("update_wearables_service", false);
        startService(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        mMenu = menu;
        getSupportMenuInflater().inflate(R.menu.main_hourly_forecast_overflow_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDmaClicked(String s)
    {
        mHasLaunchedAnotherActivity = true;
        super.onDmaClicked(s);
    }

    public void onForecastSelected(int i)
    {
        startNewActivity(getDailyActivity(), i);
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
label0:
        {
            if (locationsearch != null && !locationsearch.isEmpty())
            {
                locationsearch = (LocationSearchResult)locationsearch.get(0);
                if (list.isEmpty() || !((LocationGeoRequest)list.get(0)).isAddressRequest())
                {
                    break label0;
                }
                list = getData().getLocationFromKeyIgnoringFollowMe(locationsearch.getKey());
                if (list != null)
                {
                    if (locationsearch.getGeocodedAddress() != null)
                    {
                        list.setAddress(locationsearch.getGeocodedAddress());
                        getData().saveLocations();
                    }
                } else
                {
                    getData().addLocation(locationsearch.toLocationModel());
                }
                updateActionBarForNewLocation(locationsearch.getKey());
                refresh(locationsearch.getKey());
            }
            return;
        }
        getData().setCurrentFollowMeLocation(locationsearch.toLocationModel());
        refreshFollowMeWeather();
        mActionBarAdapter = buildActionBarSpinner();
        getSupportActionBar().setListNavigationCallbacks(mActionBarAdapter, this);
        setActionBarToMyLocation();
        sendBroadcast(new Intent("com.accuweather.android.action.CURRENT_LOCATION_CHANGED"));
    }

    protected void onHomePressedWhileNavigationDrawerClosed()
    {
    }

    protected void onHomePressedWhileNavigationDrawerOpen()
    {
    }

    public void onHourlySelected(int i)
    {
        startNewActivity(getHourlyActivity(), i);
    }

    public void onItemClicked(int i)
    {
        handleNewLocationSelected(i);
    }

    protected void onLocationAdded(LocationSearchResult locationsearchresult)
    {
        moveToPageForLocationJustAdded();
        getData().addLocation(locationsearchresult.toLocationModel());
        updateActionBarForNewLocation(locationsearchresult.getKey());
        locationsearchresult = new Intent("accuwx.intent.action.UPDATE_LOCATION_AUTOCOMPLETE");
        locationsearchresult.putExtra("clear_input", true);
        sendBroadcast(locationsearchresult);
    }

    public void onLocationAdded(String s, String s1, String s2, String s3, String s4)
    {
        s2 = new LocationModel();
        s2.setLocKey(s);
        s2.setLocationName(s1);
        getData().addLocation(s2);
        mActionBarAdapter.add(s1);
        updateActionBarSelectedIndex(mActionBarAdapter.getItemCount() - 1);
    }

    public void onLocationLongPressed(LocationModel locationmodel)
    {
        boolean flag = true;
        locationmodel = new LocationMode(locationmodel);
        if (getData().getKeys().size() <= 1)
        {
            flag = false;
        }
        locationmodel.setDeleteVisible(flag);
        locationmodel.setLocationModeListener(this);
        mLocationMode = startActionMode(locationmodel);
    }

    public void onLocationSearch(String s)
    {
        getData().clearTaskQueue();
        mLocationRequester.performLocationKeySearch(s);
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
label0:
        {
            if (locationsearch != null)
            {
                mLastLocationSearch = locationsearch;
                if (!shouldShowLocationSearchDropDown(locationsearch, list))
                {
                    break label0;
                }
                sendBroadcast(buildLocationSearchIntent(locationsearch, containsAutoCompleteRequest(list)));
            }
            return;
        }
        onLocationAdded((LocationSearchResult)locationsearch.get(0));
    }

    public void onLocationSelected(int i)
    {
        if (i != getSupportActionBar().getSelectedNavigationIndex())
        {
            hideNavigationDrawer();
            Logger.i(this);
            refresh(getData().getLocationFromAliasedName(mActionBarAdapter.getItem(i)).getKey());
            updateActionBarSelectedIndex(i);
        }
    }

    public void onLocationSelected(LocationModel locationmodel, int i)
    {
        int j = i;
        Logger.i(this);
        refresh(locationmodel.getKey());
        i = 0;
        do
        {
label0:
            {
                int k = j;
                if (i < mActionBarAdapter.getItemCount())
                {
                    if (!mActionBarAdapter.getItem(i).equals(locationmodel.getAliasedName()))
                    {
                        break label0;
                    }
                    k = i;
                }
                updateActionBarSelectedIndex(k);
                mPagedToNow = true;
                if (mAdapter != null && mViewPager != null)
                {
                    mViewPager.setCurrentItem(mAdapter.getCorrespondingPageIndex(MainContentPage.Now), true);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void onMapsItemSelected(String s)
    {
        if (getData().getWeatherDataModelFromCode(s) != null)
        {
            mapExistingLocationTilePressed(s);
            return;
        } else
        {
            mapAddLocationTilePressed();
            return;
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        handleMenuItemSelected(i, menuitem);
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onMyLocationLongPressed()
    {
        SaveLocationMode savelocationmode = new SaveLocationMode(getData().getCurrentFollowMeLocation());
        savelocationmode.setLocationModeListener(this);
        mLocationMode = startActionMode(savelocationmode);
    }

    public void onMyLocationSelected()
    {
        getGpsLocation();
    }

    public void onNavigateToDailyView()
    {
        if (mAdapter != null && mViewPager != null)
        {
            int i = mAdapter.getCorrespondingPageIndex(MainContentPage.Forecast);
            if (i != -1)
            {
                mViewPager.setCurrentItem(i, true);
            }
        }
    }

    public void onNavigateToMinuteCastView()
    {
        if (mAdapter != null && mViewPager != null)
        {
            int i = mAdapter.getCorrespondingPageIndex(MainContentPage.MinuteCast);
            if (i != -1)
            {
                mViewPager.setCurrentItem(i, true);
            }
        }
    }

    public void onNavigationDrawerListItemSelected(int i)
    {
        handleNavigationDrawerListItemSelected(i);
        hideNavigationDrawer();
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        Logger.i(this);
        handleNewLocationSelected(i);
        return false;
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        if (genericalertdialogfragment instanceof AlertDialogFragment)
        {
            handleAlertsDialogNegativeClick();
        }
        super.onNegativeClick(genericalertdialogfragment);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        getData().registerWeatherDataListener(this);
    }

    public void onNewsItemSelected(int i)
    {
        startNewActivity(getNewsActivity(), i);
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (i != mCurrentPrimaryItem)
        {
            mCurrentPrimaryItem = i;
            if (!MinuteCastUtilities.isMinuteCastLocation(getData().getCurrentlyViewedWeatherDataModel()))
            {
                onUniquePageSelected(i + 1);
            }
            onUniquePageSelected(i);
        }
        hideVirtualKeyboard();
        updateMapsAddLocationTilePressed();
        if (!mPagedToLocations && !mPagedToNow && !mMovedToPageForLocationJustAdded && shouldShowBannerAds())
        {
            Logger.d(this, "updating ads after shouldshowads clause in onPageSelected()");
            if (!isStartingFresh)
            {
                updateAds();
            }
        }
        if (mWeatherRefreshTimer != null)
        {
            if (MainContentPage.MinuteCast.equals(getCurrentlySelectedPage()))
            {
                mWeatherRefreshTimer.setMinuteCastFocused(true);
            } else
            {
                mWeatherRefreshTimer.setMinuteCastFocused(false);
            }
        }
        mMovedToPageForLocationJustAdded = false;
        mPagedToLocations = false;
        mPagedToNow = false;
        startTrackGAForMinuteCast(i);
    }

    public void onPause()
    {
        super.onPause();
        if (mHasLaunchedAnotherActivity)
        {
            getData().unregisterWeatherDataListener(this);
        }
        hideNavigationDrawer();
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        if (genericalertdialogfragment instanceof AlertDialogFragment)
        {
            handleAlertsDialogPositiveClick(genericalertdialogfragment);
            return;
        } else
        {
            super.onPositiveClick(genericalertdialogfragment);
            return;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        handlePrepareOptionsMenu(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onQueryChanged(String s)
    {
        if (s.length() > 0)
        {
            if (s.equalsIgnoreCase("CThree"))
            {
                handleCTestQuery();
            } else
            {
                if (s.equalsIgnoreCase("FThree"))
                {
                    handleFTestQuery();
                    return;
                }
                if (s.equalsIgnoreCase("Clear Data"))
                {
                    clearData();
                    return;
                }
                if (s.equalsIgnoreCase("SimulateV2"))
                {
                    handleV2SimulationQuery();
                    return;
                }
                if (s.equalsIgnoreCase("adopstest"))
                {
                    showMessageDialog(mAccuAdManager.buildAdDebugParameters());
                    return;
                }
                if (s.equalsIgnoreCase("wdmdebug"))
                {
                    showWeatherDebugDialog();
                    return;
                }
                if (s.equalsIgnoreCase("pcode"))
                {
                    showMessageDialog((new StringBuilder()).append("Pcode = ").append(PartnerCoding.getPartnerCodeFromSharedPreferences(this)).append("\n").append("AdSpace = ").append(PartnerCoding.getAdSpace(this)).toString());
                    return;
                }
                if (!s.matches(".*\\d.*"))
                {
                    getData().clearTaskQueue();
                    mLocationRequester.performAutoCompleteLocationSearch(s);
                    return;
                }
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (getIntent() != null && getIntent().hasExtra("page_index_from_now_card"))
        {
            mViewPager.setCurrentItem(getStartingPageIndex());
            getIntent().removeExtra("page_index_from_now_card");
        }
        getData().registerWeatherDataListener(this);
        updateActionBarHomeUpArrow();
        mHasLaunchedAnotherActivity = false;
        updateActionBarSpinner();
        showViewPagerContent();
        if (PushUtils.isStartingFromPush(this))
        {
            handleStartFromPush();
        }
        if (needsRefresh())
        {
            LocationModel locationmodel = getLastViewedLocationModel();
            String s = locationmodel.getKey();
            initActionBarNavigationItem(locationmodel);
            refreshForOnStart(s);
            if (haveUnitsBeenChanged())
            {
                sendBroadcast(new Intent("accuwx.intent.action.UPDATE_METRIC"));
            }
            setMetricSettingsRefreshedFromDetailsPage(false);
        }
        forceAdapterUpdate();
        if (wasAppStartedFromFollowMeWidget())
        {
            setActionBarToMyLocation();
            getIntent().removeExtra("location_code");
            getIntent().removeExtra("page_index_from_widget");
        }
        if (shouldShowBannerAds())
        {
            Logger.d(this, "updating ads after shouldshowads clause in onResume()");
            if (!isStartingFresh)
            {
                updateAds();
            }
        }
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.accuweather.android.ACTION_UPDATE_CHANNEL");
        localbroadcastmanager.registerReceiver(channelIdUpdateReceiver, intentfilter);
        updateChannelIdField();
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        mIsChangingConfigurations = true;
        return super.onRetainCustomNonConfigurationInstance();
    }

    public void onSearch(String s)
    {
        getData().clearTaskQueue();
        mLocationRequester.performCitySearch(s);
    }

    public void onSearchItemSelected(int i, Object obj)
    {
        Logger.i(this, (new StringBuilder()).append("onSearchItemSelected position is ").append(i).toString());
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(mNavigationDrawer.getWindowToken(), 0);
        if (mLastLocationSearch == null || mLastLocationSearch.size() <= i)
        {
            return;
        } else
        {
            getData().clearTaskQueue();
            mLocationRequester.performLocationKeySearch(((LocationSearchResult)mLastLocationSearch.get(i)).getKey());
            return;
        }
    }

    public boolean onShareTargetSelected(ShareActionProvider shareactionprovider, Intent intent)
    {
        mHasLaunchedAnotherActivity = true;
        return super.onShareTargetSelected(shareactionprovider, intent);
    }

    public void onSpinnerHeaderGroupItemSelected(String s, int i)
    {
        Logger.i(this);
        if (s.equals(getString(R.string.ManageMyLocations)))
        {
            pageToLocationsFragment();
        } else
        {
            getGpsLocation();
        }
        getSupportActionBar().setNavigationMode(0);
        getSupportActionBar().setNavigationMode(1);
    }

    public void onSpinnerItemChanged(Object obj)
    {
        requestNewAd();
    }

    public void onSpinnerItemSelected(int i)
    {
        handleNewLocationSelected(i);
        updateActionBarSelectedIndex(i);
    }

    public void onStart()
    {
        super.onStart();
        sendBroadcast(new Intent("accuwx.intent.action.UPDATE_NOW_FRAGMENT"));
        mRatingPrompter.handleRatingsPrompt();
        mWeatherRefreshTimer.start();
    }

    public void onStop()
    {
        super.onStop();
        mWeatherRefreshTimer.stop();
        mMCSummaryRefreshTime.stop();
        if (isFinishing())
        {
            getData().clearTaskQueue();
            getData().saveLocations();
            getData().saveWeather();
        }
        hideVirtualKeyboardIfRotationInProgress();
        getData().setLastViewedPage(mViewPager.getCurrentItem());
        ImageLoader.getInstance().clearMemoryCache();
        BitmapCache.cleanupMapImages();
    }

    protected void onUniquePageSelected(int i)
    {
        Logger.d(getClass().getName(), (new StringBuilder()).append("pageIndex is ").append(i).toString());
        if (mLocationMode != null)
        {
            mLocationMode.finish();
        }
        if (Utilities.isHoneycombOrGreater())
        {
            invalidateOptionsMenu();
        }
    }

    public void onVideoItemSelected(int i)
    {
        startNewActivity(com/accuweather/android/VideoDetailsActivity, i);
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        resetProgressBar();
        int i = 0;
        do
        {
label0:
            {
                if (i < list.size())
                {
                    WeatherDataModel weatherdatamodel = (WeatherDataModel)list.get(i);
                    if (!weatherdatamodel.isPrimaryLocation())
                    {
                        break label0;
                    }
                    handleWeatherCallCompletedForPrimaryLocation(weatherdatamodel, getRequestForLocationKey(weatherdatamodel.getLocationKey(), list1));
                    if (shouldShowBannerAds())
                    {
                        Logger.d(this, "updating ads after shouldshowads clause in onWeatherCalCompleted()");
                        if (isStartingFresh)
                        {
                            isStartingFresh = false;
                        }
                        updateAds();
                    }
                }
                if (weatherCallContainsNonPrimaryLocation(list) || getData().getLocations().size() == 1)
                {
                    handleWeatherCallCompletedForSecondaryLocations(list);
                }
                super.onWeatherCallCompleted(list, list1);
                return;
            }
            i++;
        } while (true);
    }

    protected void refresh(WeatherUpdateRequest weatherupdaterequest, List list)
    {
        if (!"2233o81".equals(weatherupdaterequest.getLocationKey())) goto _L2; else goto _L1
_L1:
        handleFTestQuery();
_L4:
        super.refresh(weatherupdaterequest, list);
        return;
_L2:
        if ("35o127".equals(weatherupdaterequest.getLocationKey()))
        {
            handleCTestQuery();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSummaryTextView(TextView textview)
    {
        summaryTextView = textview;
    }

    protected void showAlertWebview(String s)
    {
        String s1 = getString(R.string.WeatherAlert).toUpperCase(getResources().getConfiguration().locale);
        Intent intent = new Intent(this, com/accuweather/android/WebViewActivity);
        intent.putExtra("title", s1);
        intent.putExtra("url", s);
        mHasLaunchedAnotherActivity = true;
        startActivity(intent);
    }

    protected void showContent()
    {
        if (mProgressBarLayout != null)
        {
            mProgressBarLayout.setVisibility(8);
            if (mProgressBarLayout.getVisibility() == 0)
            {
                mProgressBarLayout.setVisibility(8);
                ObjectAnimator.ofFloat(mProgressBarLayout, "alpha", new float[] {
                    1.0F, 0.0F
                }).setDuration(200L).start();
            }
        }
        showViewPagerContent();
    }

    protected void showNavigationDrawer()
    {
        mDisplayBlocked = true;
        mSlidingMenuLayout.openMenu();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    protected void updateActionBarSelectedIndex(int i)
    {
        getSupportActionBar().setSelectedNavigationItem(i);
    }

    protected void updateActionBarSpinner()
    {
        mActionBarAdapter.updateItems(getData().getPrettyNames());
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

    static 
    {
        oneMinute = 60000L;
    }



}
