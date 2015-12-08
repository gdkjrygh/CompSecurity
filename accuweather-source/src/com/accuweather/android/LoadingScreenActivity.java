// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.accuweather.android.activity.DownloadBroadcastReceiver;
import com.accuweather.android.activity.IDownloadReceiver;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.dialogs.GpsTimeoutAlertDialog;
import com.accuweather.android.dialogs.LocationProviderDisabledAlertDialog;
import com.accuweather.android.dialogs.WeatherTimeoutAlertDialog;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.services.request.LocationRequester;
import com.accuweather.android.tablet.TabletActivity;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android:
//            SetupActivity, MainActivity, LocationActivity

public class LoadingScreenActivity extends SetupActivity
    implements com.accuweather.android.utilities.Data.IWeatherDataListener, com.accuweather.android.dialogs.GenericAlertDialogFragment.AlertDialogFragmentListener, IDownloadReceiver
{
    private static final class TextAnimationPhase extends Enum
    {

        private static final TextAnimationPhase $VALUES[];
        public static final TextAnimationPhase GIVE_US_A_MOMENT;
        public static final TextAnimationPhase LOADING;
        public static final TextAnimationPhase OPTIMIZING;

        public static TextAnimationPhase valueOf(String s)
        {
            return (TextAnimationPhase)Enum.valueOf(com/accuweather/android/LoadingScreenActivity$TextAnimationPhase, s);
        }

        public static TextAnimationPhase[] values()
        {
            return (TextAnimationPhase[])$VALUES.clone();
        }

        static 
        {
            GIVE_US_A_MOMENT = new TextAnimationPhase("GIVE_US_A_MOMENT", 0);
            OPTIMIZING = new TextAnimationPhase("OPTIMIZING", 1);
            LOADING = new TextAnimationPhase("LOADING", 2);
            $VALUES = (new TextAnimationPhase[] {
                GIVE_US_A_MOMENT, OPTIMIZING, LOADING
            });
        }

        private TextAnimationPhase(String s, int i)
        {
            super(s, i);
        }
    }


    boolean hasShownLoadingMessage;
    boolean hasShownOptimizingMessage;
    private boolean isStartFromNowCard;
    private DownloadBroadcastReceiver mDownloadReceiver;
    private boolean mIsGps;
    private String mLocCodeFromBundle;
    private com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener mLocationConverterListener;
    private LocationRequester mLocationRequester;
    private boolean mMainActivityAlreadyLaunched;
    private MainContentPage mMainContentPageToLaunch;
    private LocationModel mPendingLocationModel;
    private Runnable mProgressTextAnimationRunnable;
    private TextAnimationPhase mTextAnimationPhase;
    private boolean mWasGpsLocationFound;
    private boolean mWeatherCallCompleteOccurred;

    public LoadingScreenActivity()
    {
        hasShownOptimizingMessage = false;
        hasShownLoadingMessage = false;
        mLocCodeFromBundle = "";
        mIsGps = false;
        isStartFromNowCard = false;
        mDownloadReceiver = new DownloadBroadcastReceiver();
        mLocationConverterListener = new com.accuweather.android.services.LocationUpgraderService.ILocationConverterListener() {

            final LoadingScreenActivity this$0;

            public void onConversionCompleted(List list)
            {
                getData().registerWeatherDataListener(LoadingScreenActivity.this);
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    LocationModel locationmodel = (LocationModel)iterator.next();
                    if (locationmodel.isHome())
                    {
                        getData().setHomeLocation(locationmodel.getLocKey());
                    }
                } while (true);
                getData().setLocations((ArrayList)list);
                setDmasAsUpdated(true);
                updateWeatherContent();
            }

            public void onConversionError(Exception exception)
            {
                getData().registerWeatherDataListener(LoadingScreenActivity.this);
                Logger.i(this, (new StringBuilder()).append("Conversion exception ").append(exception.getLocalizedMessage()).toString());
            }

            
            {
                this$0 = LoadingScreenActivity.this;
                super();
            }
        };
        mTextAnimationPhase = TextAnimationPhase.GIVE_US_A_MOMENT;
        mProgressTextAnimationRunnable = new Runnable() {

            final LoadingScreenActivity this$0;

            public void run()
            {
                TextView textview = (TextView)findViewById(R.id.give_us_a_moment_tv);
                if (textview != null)
                {
                    updateProgressTextAndAnimation(textview);
                }
            }

            
            {
                this$0 = LoadingScreenActivity.this;
                super();
            }
        };
    }

    private void addMainActivityIntentExtras(Intent intent)
    {
        if (!TextUtils.isEmpty(mLocCodeFromBundle))
        {
            intent.putExtra("location_code", mLocCodeFromBundle).putExtra("page_index_from_widget", mMainContentPageToLaunch);
        }
        if (isStartFromNowCard)
        {
            intent.putExtra("page_index_from_now_card", mMainContentPageToLaunch);
            isStartFromNowCard = false;
        }
    }

    private boolean areBackgroundImagesLoaded()
    {
        return BackgroundImages.getInstance(this).isLoaded();
    }

    private void convertLocationModels()
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), "In convertModels() %b doDmasNeedUpdated %b", new Object[] {
                Boolean.valueOf(getData().doV2LocationsNeedConverted()), Boolean.valueOf(doDmasNeedUpdating())
            });
        }
        Data.getInstance(this).upgradeLocationModels(mLocationConverterListener);
        getData().unregisterWeatherDataListener(this);
    }

    private AlphaAnimation createFadeInAnimation()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(500L);
        alphaanimation.setFillAfter(true);
        return alphaanimation;
    }

    private boolean doDmasNeedUpdating()
    {
        return !haveDmasBeenUpdated();
    }

    private boolean doLocationsNeedConversion()
    {
        return getData().doV2LocationsNeedConverted() || doDmasNeedUpdating() || !getData().areLocationsTheNewestVersion();
    }

    private Class getMainActivityClass()
    {
        if (Utilities.isScreenSizeLargeOrGreater(this))
        {
            return com/accuweather/android/tablet/TabletActivity;
        } else
        {
            return com/accuweather/android/MainActivity;
        }
    }

    private void handleSearchItemSelected(LocationSearchResult locationsearchresult)
    {
        locationsearchresult = locationsearchresult.toLocationModel();
        mPendingLocationModel = locationsearchresult;
        PreferenceUtils.save(this, "pref_open_at_launch", "1");
        if (mIsGps)
        {
            getGpsLocation();
            return;
        } else
        {
            getData().addLocation(mPendingLocationModel);
            getData().setLocationExplicitlyAdded(true);
            mPendingLocationModel = null;
            refresh(locationsearchresult.getKey());
            return;
        }
    }

    private boolean haveDmasBeenUpdated()
    {
        return PreferenceUtils.get(this, "have_dmas_been_updated", false);
    }

    private void launchMainActivity()
    {
        Logger.i(getClass().getName(), "In launchMainActivity().");
        Intent intent = new Intent(this, getMainActivityClass());
        addMainActivityIntentExtras(intent);
        getData().unregisterWeatherDataListener(this);
        startActivity(intent);
        finish();
    }

    private void launchMainActivityIfNotAlreadyDisplayed()
    {
        if (!mMainActivityAlreadyLaunched)
        {
            mMainActivityAlreadyLaunched = true;
            launchMainActivity();
        }
    }

    private void loadDefaultLocation()
    {
        mLocationRequester.performLocationKeySearch("");
    }

    private void onAllImagesLoaded()
    {
        if (!BackgroundImages.getInstance(this).backgroundImagesAreLocal())
        {
            stopDownloadService();
        }
        launchMainActivityIfNotAlreadyDisplayed();
    }

    private void onStartForBackgroundImagesAlreadyLoaded()
    {
        Logger.i(getClass().getName(), "onStartForBackgroundImagesAlreadyLoaded");
        setContentView(R.layout.loading_screen);
        updateTypefacesForLoading();
    }

    private void onStartForNoBackgroundImagesLoaded()
    {
        Logger.i(getClass().getName(), "onStartForNoBackgroundImagesLoaded");
        setContentView(R.layout.initial_loading_screen);
        updateTypefacesForInitialLoading();
        mHandler.postDelayed(mProgressTextAnimationRunnable, 500L);
        startDownloadService();
    }

    private void postProgressPhaseChange()
    {
        mHandler.removeCallbacks(mProgressTextAnimationRunnable);
        mHandler.post(mProgressTextAnimationRunnable);
    }

    private void setDmasAsUpdated(boolean flag)
    {
        PreferenceUtils.save(this, "have_dmas_been_updated", flag);
    }

    private boolean shouldAddADefaultLocation()
    {
        boolean flag1 = PartnerCoding.isDefaultLocationPreload(this);
        boolean flag;
        if (!getData().hasDefaultLocationBeenAdded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag;
    }

    private void updateProgressBar(int i)
    {
        ((ProgressBar)findViewById(R.id.progress)).setProgress(i);
    }

    private void updateProgressTextAndAnimation(TextView textview)
    {
        textview.setGravity(1);
        textview.setVisibility(0);
        textview.setAnimation(createFadeInAnimation());
        if (mTextAnimationPhase == TextAnimationPhase.GIVE_US_A_MOMENT)
        {
            updateUiForGiveUsAMomentPhase(textview);
        } else
        {
            if (mTextAnimationPhase == TextAnimationPhase.OPTIMIZING)
            {
                updateUiForOptimizingPhase(textview);
                return;
            }
            if (mTextAnimationPhase == TextAnimationPhase.LOADING)
            {
                updateUiForLoadingPhase(textview);
                return;
            }
        }
    }

    private void updateTypefacesForInitialLoading()
    {
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.initial_setup_tv), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.give_us_a_moment_tv), Data.getRobotoCondensed());
    }

    private void updateTypefacesForLoading()
    {
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.loading_your_weather), Data.getRobotoCondensed());
    }

    private void updateUiForGiveUsAMomentPhase(TextView textview)
    {
        textview.startAnimation(textview.getAnimation());
    }

    private void updateUiForLoadingPhase(TextView textview)
    {
        int i = R.string.LoadingYourWeather_ellipsis;
        if (mIsGps)
        {
            if (mWasGpsLocationFound)
            {
                i = R.string.LoadingYourWeather_ellipsis;
            } else
            {
                i = R.string.AttemptingToFindYourLocation;
            }
        }
        textview.setText(getResources().getString(i));
        textview.startAnimation(textview.getAnimation());
    }

    private void updateUiForOptimizingPhase(TextView textview)
    {
        textview.setText(getResources().getString(R.string.OptimizingForYourDevice_OnlyNeedToDoOnce));
        textview.startAnimation(textview.getAnimation());
    }

    private void updateWeatherContent()
    {
        if (!TextUtils.isEmpty(mLocCodeFromBundle))
        {
            if (mLocCodeFromBundle.equals("-1"))
            {
                getGpsLocation();
                return;
            } else
            {
                Logger.i(getClass().getName(), (new StringBuilder()).append("In init(), mLocCodeFromBundle = ").append(mLocCodeFromBundle).toString());
                refresh(mLocCodeFromBundle);
                return;
            }
        }
        if (mIsGps)
        {
            getGpsLocation();
            return;
        } else
        {
            refresh(Data.getInstance(this).getHomeLocation().getLocKey());
            return;
        }
    }

    protected GpsTimeoutAlertDialog buildGpsTimeoutDialog()
    {
        GpsTimeoutAlertDialog gpstimeoutalertdialog = super.buildGpsTimeoutDialog();
        gpstimeoutalertdialog.setNegativeButtonResourceId(R.string.Exit);
        gpstimeoutalertdialog.setPositiveButtonResourceId(R.string.Back);
        return gpstimeoutalertdialog;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mLocationRequester = new LocationRequester(this);
        mDownloadReceiver.setDownloadReceiver(this);
        mWeatherCallCompleteOccurred = false;
        mMainActivityAlreadyLaunched = false;
        mMainContentPageToLaunch = MainContentPage.Now;
        bundle = getIntent();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle = bundle.getData();
        if (bundle == null) goto _L2; else goto _L3
_L3:
        bundle = (new StringBuilder()).append(bundle.getHost()).append(bundle.getPath()).toString();
        if (!bundle.equals("accuweather.com/dailyforecastscreen")) goto _L5; else goto _L4
_L4:
        mMainContentPageToLaunch = MainContentPage.Forecast;
_L7:
        isStartFromNowCard = true;
_L2:
        return;
_L5:
        if (bundle.equals("accuweather.com/hourlyforecastscreen"))
        {
            mMainContentPageToLaunch = MainContentPage.Hourly;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onDownloadFailed()
    {
        onError(new IOException("An error occurred downloading the background images."));
    }

    public void onGiveUsAMoment(int i)
    {
        updateProgressBar(i);
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
        Logger.i(getClass().getName(), "In onGpsSearchCompleted().");
        if (getData().getLocations().size() == 0)
        {
            list = (LocationSearchResult)locationsearch.get(0);
            getData().addLocation(list.toLocationModel());
        }
        if (mPendingLocationModel != null)
        {
            getData().addLocation(mPendingLocationModel);
            mPendingLocationModel = null;
        }
        getData().setLocationExplicitlyAdded(true);
        mWasGpsLocationFound = true;
        refresh(((LocationSearchResult)locationsearch.get(0)).getKey());
    }

    protected void onGpsTimeoutPositiveClick()
    {
        Intent intent = (new Intent(this, com/accuweather/android/LocationActivity)).addFlags(0x4000000);
        addMainActivityIntentExtras(intent);
        startActivity(intent);
        finish();
    }

    public void onLoadingWeatherData(int i)
    {
        mTextAnimationPhase = TextAnimationPhase.LOADING;
        if (!hasShownLoadingMessage)
        {
            hasShownLoadingMessage = true;
            postProgressPhaseChange();
        }
        if (!mIsGps || mWasGpsLocationFound)
        {
            updateProgressBar(i);
        }
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
        if (locationsearch == null || locationsearch.isEmpty())
        {
            return;
        } else
        {
            handleSearchItemSelected((LocationSearchResult)locationsearch.get(0));
            return;
        }
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
        if (genericalertdialogfragment instanceof GpsTimeoutAlertDialog)
        {
            finish();
        } else
        {
            if (genericalertdialogfragment instanceof WeatherTimeoutAlertDialog)
            {
                finish();
                return;
            }
            if (genericalertdialogfragment instanceof LocationProviderDisabledAlertDialog)
            {
                mInAnimation = R.anim.slide_in_left;
                mOutAnimation = R.anim.slide_out_right;
                onGpsTimeoutPositiveClick();
                return;
            }
        }
    }

    protected void onNoConnectionPositiveClick()
    {
        if (!areBackgroundImagesLoaded())
        {
            startDownloadService();
        }
        super.onNoConnectionPositiveClick();
    }

    public void onOptimizingForDevice(int i)
    {
        if (!hasShownOptimizingMessage)
        {
            hasShownOptimizingMessage = true;
            mTextAnimationPhase = TextAnimationPhase.OPTIMIZING;
            postProgressPhaseChange();
        }
        updateProgressBar(i);
    }

    public void onPause()
    {
        super.onPause();
        mHandler.removeCallbacks(mProgressTextAnimationRunnable);
    }

    public void onProgressComplete()
    {
        if (mWeatherCallCompleteOccurred)
        {
            onAllImagesLoaded();
        }
    }

    public void onStart()
    {
        super.onStart();
        registerReceiver(mDownloadReceiver, new IntentFilter("com.accuweather.android.download_progress"));
        Intent intent = getIntent();
        if (intent != null)
        {
            if (intent.hasExtra("page_index_from_widget"))
            {
                mMainContentPageToLaunch = (MainContentPage)intent.getSerializableExtra("page_index_from_widget");
            }
            Logger.i(this, "Set locCode from bundle in onStart");
            mLocCodeFromBundle = intent.getStringExtra("location_code");
            mIsGps = intent.getBooleanExtra("is_gps", false);
        }
        if (areBackgroundImagesLoaded())
        {
            onStartForBackgroundImagesAlreadyLoaded();
        } else
        {
            onStartForNoBackgroundImagesLoaded();
        }
        hideActionBar();
        if (shouldAddADefaultLocation())
        {
            loadDefaultLocation();
            return;
        }
        if (doLocationsNeedConversion())
        {
            convertLocationModels();
            return;
        } else
        {
            updateWeatherContent();
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        unregisterReceiver(mDownloadReceiver);
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        mWeatherCallCompleteOccurred = true;
        resetProgressBar();
        if (!list.isEmpty() && areBackgroundImagesLoaded())
        {
            onAllImagesLoaded();
        }
    }



}
