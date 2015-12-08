// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.dialogs.GpsTimeoutAlertDialog;
import com.accuweather.android.dialogs.LocationNotFoundAlertDialog;
import com.accuweather.android.dialogs.LocationProviderDisabledAlertDialog;
import com.accuweather.android.dialogs.NoConnectionAlertDialog;
import com.accuweather.android.dialogs.ShareErrorDialog;
import com.accuweather.android.dialogs.WeatherTimeoutAlertDialog;
import com.accuweather.android.dma.CustomDmaView;
import com.accuweather.android.dma.DmaView;
import com.accuweather.android.exceptions.GpsResultsOutOfBounds;
import com.accuweather.android.models.DmaModel;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.services.RefreshService;
import com.accuweather.android.services.gps.GpsTimeoutException;
import com.accuweather.android.services.gps.LocationProviderException;
import com.accuweather.android.services.request.LocationNotFoundException;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.AccuAdManager;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.AdTrackingController;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.ImageUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.ShareActionProvider;
import com.amobee.adsdk.AmobeeAdPlaceholder;
import com.comscore.analytics.Census;
import com.facebook.AppEventsLogger;
import com.google.analytics.tracking.android.EasyTracker;
import com.quantcast.measurement.service.QuantcastClient;
import com.urbanairship.analytics.Analytics;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

public abstract class WeatherActivity extends SherlockFragmentActivity
    implements com.actionbarsherlock.widget.ShareActionProvider.OnShareTargetSelectedListener, com.accuweather.android.utilities.Data.IWeatherDataListener, com.accuweather.android.dialogs.GenericAlertDialogFragment.AlertDialogFragmentListener, com.accuweather.android.dma.DmaView.IDmaListener
{
    private class ProgressRunnable
        implements Runnable
    {

        private static final int TIMEOUT_IN_MILLIS = 30000;
        private static final int UPDATE_INTERVAL_IN_MILLIS = 250;
        private boolean _isGpsSearch;
        private boolean _isRunning;
        int _progress;
        final WeatherActivity this$0;

        public void run()
        {
            _isRunning = true;
            _progress = _progress + 83;
            mHandler.removeCallbacks(this);
            if (_progress < 10000)
            {
                mHandler.postDelayed(this, 250L);
            } else
            if (_isRunning)
            {
                if (_isGpsSearch)
                {
                    onGpsTimeout();
                    return;
                } else
                {
                    onWeatherTimeout();
                    return;
                }
            }
        }

        public void setRunning(boolean flag)
        {
            _isRunning = flag;
        }


/*
        static boolean access$102(ProgressRunnable progressrunnable, boolean flag)
        {
            progressrunnable._isGpsSearch = flag;
            return flag;
        }

*/

        private ProgressRunnable()
        {
            this$0 = WeatherActivity.this;
            super();
            _isGpsSearch = false;
            _progress = 0;
            _isRunning = false;
        }

    }

    private class ShareException extends Exception
    {

        final WeatherActivity this$0;

        private ShareException()
        {
            this$0 = WeatherActivity.this;
            super();
        }

    }


    private static final String DIALOG_TAG = "dialog";
    protected static final String TEST_KEY_C = "35o127";
    protected static final String TEST_KEY_F = "2233o81";
    protected final AccuAdManager mAccuAdManager = new AccuAdManager();
    private GenericAlertDialogFragment mAlertDialog;
    protected Handler mHandler;
    private ProgressRunnable mProgressRunnable;
    private RefreshService refreshService;

    public WeatherActivity()
    {
        mProgressRunnable = new ProgressRunnable();
        mHandler = new Handler();
        refreshService = new RefreshService();
    }

    private GenericAlertDialogFragment buildDialog(Exception exception)
    {
        if (exception instanceof LocationProviderException)
        {
            return new LocationProviderDisabledAlertDialog();
        }
        if (exception instanceof LocationNotFoundException)
        {
            return new LocationNotFoundAlertDialog();
        }
        if (exception instanceof IOException)
        {
            Logger.i(this, "exception instanceof IOException");
            return new NoConnectionAlertDialog();
        }
        if (exception instanceof GpsTimeoutException)
        {
            return buildGpsTimeoutDialog();
        }
        if (exception instanceof ShareException)
        {
            return new ShareErrorDialog();
        }
        if (exception instanceof GpsResultsOutOfBounds)
        {
            return buildGpsTimeoutDialog();
        } else
        {
            return null;
        }
    }

    private LocationModel getLocationForDma(WeatherDataModel weatherdatamodel)
    {
        LocationModel locationmodel = getData().getLocationFromKey(weatherdatamodel.getLocationKey());
        weatherdatamodel = locationmodel;
        if (locationmodel == null)
        {
            weatherdatamodel = getData().getCurrentFollowMeLocation();
        }
        return weatherdatamodel;
    }

    private void handleShareTargetSelected(Intent intent)
    {
        logShareTargetSelectedAnalytic(intent);
        ImageUtils.deleteLastCapturedGalleryImage(this);
        try
        {
            ImageUtils.updateIntentForScreenshotShare(this, intent);
            startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            onError(new ShareException());
        }
    }

    private void hideAds()
    {
        View view = findViewById(R.id.amobeeAdContainer);
        if (view != null)
        {
            view.setVisibility(8);
        }
        view = findViewById(R.id.adView_AMOBEE);
        if (view != null)
        {
            view.setVisibility(8);
        }
    }

    private void initAmobee(Context context)
    {
        Logger.i(getClass().getSimpleName(), "initAmobee");
        mAccuAdManager.initAmobee(this, (AmobeeAdPlaceholder)findViewById(R.id.adView_AMOBEE));
    }

    private void logShareTargetSelectedAnalytic(Intent intent)
    {
        String s1 = "";
        String s = s1;
        if (intent != null)
        {
            s = s1;
            if (intent.getComponent() != null)
            {
                s = intent.getComponent().flattenToString();
            }
        }
        AccuAnalytics.logUiEvent(this, "Share target selected", s);
    }

    private void showAds()
    {
        View view = findViewById(R.id.adView_AMOBEE);
        if (view != null)
        {
            view.setVisibility(0);
            if (Utilities.isHoneycombOrGreater())
            {
                view.setLayerType(1, null);
            }
            initAmobee(this);
        }
    }

    private void showDialog()
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("dialog");
        if (fragment != null && mAlertDialog != null && !fragment.getClass().equals(mAlertDialog.getClass()))
        {
            fragmenttransaction.remove(fragment);
        }
        fragmenttransaction.addToBackStack(null);
        if (fragment == null)
        {
            mAlertDialog.show(fragmenttransaction, "dialog");
        } else
        if (mAlertDialog != null && !fragment.getClass().equals(mAlertDialog.getClass()))
        {
            mAlertDialog.show(fragmenttransaction, "dialog");
            return;
        }
    }

    private void showHuafengDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        View view = ((LayoutInflater)getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.custom_dma_dialog, null);
        builder.setPositiveButton(getResources().getString(R.string.OK), new android.content.DialogInterface.OnClickListener() {

            final WeatherActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = WeatherActivity.this;
                super();
            }
        });
        builder.setView(view);
        builder.show();
    }

    private void updateUiForRefresh()
    {
        hideContent();
        startProgressBar();
    }

    private void updateUiForRefreshManually()
    {
        hideContentForRefreshManually();
        startProgressBar();
    }

    protected GpsTimeoutAlertDialog buildGpsTimeoutDialog()
    {
        return new GpsTimeoutAlertDialog();
    }

    protected final Data getData()
    {
        return Data.getInstance(this);
    }

    public void getGpsLocation()
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "getGpsLocation");
        }
        mProgressRunnable._isGpsSearch = true;
        startProgressBar();
        getData().getGpsLocation(false);
        hideContent();
    }

    protected final void handleShareSelectedFromOptionMenu()
    {
        final Intent chooserIntent;
        String s;
        try
        {
            if (!Utilities.isGingerbreadOrEarlier())
            {
                break MISSING_BLOCK_LABEL_60;
            }
            ImageUtils.deleteLastCapturedGalleryImage(this);
            s = ImageUtils.captureScreenshotToStorageUri(this);
            chooserIntent = ImageUtils.createOptionsMenuShareIntent(this, s);
        }
        catch (Exception exception)
        {
            onError(new ShareException());
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        logShareTargetSelectedAnalytic(chooserIntent);
        s = ImageUtils.getRealPathFromURI(this, s);
        chooserIntent = new android.media.MediaScannerConnection.OnScanCompletedListener() {

            final WeatherActivity this$0;
            final Intent val$chooserIntent;

            public void onScanCompleted(String s1, Uri uri)
            {
                startActivity(chooserIntent);
            }

            
            {
                this$0 = WeatherActivity.this;
                chooserIntent = intent;
                super();
            }
        };
        MediaScannerConnection.scanFile(this, new String[] {
            s
        }, null, chooserIntent);
    }

    protected void hideContent()
    {
    }

    protected void hideContentForRefreshManually()
    {
    }

    protected boolean isDmaDarkThemed()
    {
        return true;
    }

    protected boolean isLockedInPortraitMode()
    {
        return Utilities.shouldTabletBeTreatedAsPhone();
    }

    protected boolean isTestLocationC(String s)
    {
        return s.equals("35o127");
    }

    protected boolean isTestLocationF(String s)
    {
        return s.equals("2233o81");
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        refreshService.setData(getData());
        refreshService.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(this));
        if (isLockedInPortraitMode())
        {
            setRequestedOrientation(1);
        }
        Signature signature;
        MessageDigest messagedigest;
        int i;
        int j;
        try
        {
            bundle = getPackageManager().getPackageInfo("com.accuweather.android", 64).signatures;
            j = bundle.length;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        signature = bundle[i];
        messagedigest = MessageDigest.getInstance("SHA");
        messagedigest.update(signature.toByteArray());
        Log.d("KeyHash:", Base64.encodeToString(messagedigest.digest(), 0));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_62;
_L1:
    }

    public void onDmaClicked(String s)
    {
        AccuAnalytics.logUiEvent(this, "DMA clicked", s);
        if (!TextUtils.isEmpty(s))
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(s));
            startActivity(intent);
            return;
        } else
        {
            showHuafengDialog();
            return;
        }
    }

    public void onError(Exception exception)
    {
        exception = buildDialog(exception);
        if (exception != null)
        {
            showDialog(exception);
        }
        resetProgressBar();
    }

    public void onGpsSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onGpsTimeout()
    {
        mAlertDialog = buildGpsTimeoutDialog();
        mAlertDialog.show(getSupportFragmentManager(), null);
    }

    protected void onGpsTimeoutPositiveClick()
    {
        resetProgressBar();
        getGpsLocation();
    }

    public void onHomeLocationChanged()
    {
    }

    protected void onLocationProviderDisabledPositiveClick()
    {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public void onLocationSearchCompleted(LocationSearch locationsearch, List list)
    {
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
        showContent();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (mProgressRunnable == null)
        {
            mProgressRunnable = new ProgressRunnable();
        }
    }

    protected void onNoConnectionPositiveClick()
    {
    }

    protected void onPause()
    {
        super.onPause();
        if (mProgressRunnable != null)
        {
            mProgressRunnable.setRunning(false);
            mHandler.removeCallbacks(mProgressRunnable);
            mProgressRunnable = null;
        }
        mAccuAdManager.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        if (!(genericalertdialogfragment instanceof WeatherTimeoutAlertDialog)) goto _L2; else goto _L1
_L1:
        onWeatherTimeoutPositiveClick();
_L4:
        genericalertdialogfragment.dismiss();
        return;
_L2:
        if (genericalertdialogfragment instanceof GpsTimeoutAlertDialog)
        {
            onGpsTimeoutPositiveClick();
        } else
        if (genericalertdialogfragment instanceof NoConnectionAlertDialog)
        {
            onNoConnectionPositiveClick();
        } else
        if (genericalertdialogfragment instanceof LocationNotFoundAlertDialog)
        {
            onGpsTimeoutPositiveClick();
        } else
        if (genericalertdialogfragment instanceof LocationProviderDisabledAlertDialog)
        {
            onLocationProviderDisabledPositiveClick();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "onPrepareOptionsMenu");
        }
        Object obj = menu.findItem(R.id.share);
        if (obj != null)
        {
            obj = (ShareActionProvider)((MenuItem) (obj)).getActionProvider();
            ((ShareActionProvider) (obj)).setShareIntent(ImageUtils.createActionBarShareIntent(this));
            ((ShareActionProvider) (obj)).setShareHistoryFileName("share_history.xml");
            ((ShareActionProvider) (obj)).setOnShareTargetSelectedListener(this);
        }
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            menu.removeItem(R.id.share);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (mProgressRunnable == null)
        {
            mProgressRunnable = new ProgressRunnable();
        }
        if (shouldShowBannerAds())
        {
            resumeAdDisplay();
        }
        AppEventsLogger.activateApp(this, "757481634289798");
    }

    public boolean onShareTargetSelected(ShareActionProvider shareactionprovider, Intent intent)
    {
        handleShareTargetSelected(intent);
        return true;
    }

    protected void onStart()
    {
        super.onStart();
        if (!Utilities.isConnected(this))
        {
            onError(new IOException());
        }
        getData().registerWeatherDataListener(this);
        if (mProgressRunnable == null)
        {
            mProgressRunnable = new ProgressRunnable();
        }
        EasyTracker.getInstance().activityStart(this);
        Census.getInstance().notifyStart(getApplicationContext(), "6005068", "c7d1f7f9920e55503ee3470a942d6341");
        if (Logger.isDebugEnabled())
        {
            QuantcastClient.enableLogging(true);
        }
        QuantcastClient.activityStart(this, "17ecxg1ih1ce4q6s-mtaq4cy6y01e1r1p", null, null);
        if (shouldShowBannerAds())
        {
            showAds();
        } else
        {
            hideAds();
        }
        Analytics.activityStarted(this);
    }

    protected void onStop()
    {
        super.onStop();
        getData().unregisterWeatherDataListener(this);
        EasyTracker.getInstance().activityStop(this);
        QuantcastClient.activityStop();
        Analytics.activityStopped(this);
    }

    public void onWeatherCallCompleted(List list, List list1)
    {
        showContent();
    }

    public void onWeatherTimeout()
    {
        mAlertDialog = new WeatherTimeoutAlertDialog();
        mAlertDialog.show(getSupportFragmentManager(), null);
    }

    protected void onWeatherTimeoutPositiveClick()
    {
        if (getData().getCurrentlyViewedWeatherDataModel() != null)
        {
            refresh(getData().getCurrentlyViewedWeatherDataModel().getLocationKey());
        }
    }

    protected void refresh(WeatherUpdateRequest weatherupdaterequest, List list)
    {
        refreshService.refresh(weatherupdaterequest, list);
        updateUiForRefresh();
    }

    protected void refresh(String s)
    {
        refreshService.refresh(s);
        updateUiForRefresh();
    }

    protected void refreshFollowMeWeather()
    {
        refreshService.refreshFollowMeWeather();
        updateUiForRefresh();
    }

    protected void refreshForAllLocations(String s)
    {
        refreshService.refreshForAllLocations(s);
        updateUiForRefresh();
    }

    protected void refreshForAllLocationsBatch(String s)
    {
        refreshService.refreshForAllLocationsBatch(s);
        updateUiForRefresh();
    }

    protected void refreshForAllLocationsManually(String s)
    {
        refreshService.refreshForAllLocationsBatch(s);
        updateUiForRefreshManually();
    }

    protected void refreshManually(String s)
    {
        refreshService.refresh(s);
        updateUiForRefreshManually();
    }

    protected void requestNewAd()
    {
        mAccuAdManager.requestNewAd();
    }

    protected void resetProgressBar()
    {
        mHandler.removeCallbacks(mProgressRunnable);
        if (mProgressRunnable != null)
        {
            mProgressRunnable._progress = 0;
        }
        if (mProgressRunnable != null)
        {
            setSupportProgress(mProgressRunnable._progress);
        }
    }

    protected void resumeAdDisplay()
    {
        mAccuAdManager.onResume();
    }

    protected void setWeatherDataModelDma(WeatherDataModel weatherdatamodel)
    {
        LocationModel locationmodel = getData().getLocationFromKey(weatherdatamodel.getLocationKey());
        DmaModel dmamodel = null;
        Object obj = locationmodel;
        if (locationmodel == null)
        {
            obj = getData().getCurrentFollowMeLocation();
        }
        if (obj != null)
        {
            obj = ((LocationModel) (obj)).getDmaId();
            dmamodel = (DmaModel)getData().getDmaModels().get(obj);
        }
        if (dmamodel != null)
        {
            weatherdatamodel.setDmaId(dmamodel.getMarketId());
        }
    }

    protected boolean shouldShowBannerAds()
    {
        return true;
    }

    protected void showContent()
    {
    }

    protected final void showDialog(GenericAlertDialogFragment genericalertdialogfragment)
    {
        if (mAlertDialog == null)
        {
            if (genericalertdialogfragment != null)
            {
                mAlertDialog = genericalertdialogfragment;
                showDialog();
            }
        } else
        if (genericalertdialogfragment != null)
        {
            mAlertDialog = genericalertdialogfragment;
            showDialog();
            return;
        }
    }

    protected final void showMessageDialog(String s)
    {
        GenericAlertDialogFragment genericalertdialogfragment = new GenericAlertDialogFragment();
        genericalertdialogfragment.setMessage(s);
        showDialog(genericalertdialogfragment);
    }

    protected void startProgressBar()
    {
        resetProgressBar();
        mHandler.post(mProgressRunnable);
    }

    protected final void updateAdParameters(AdTrackingController adtrackingcontroller)
    {
        mAccuAdManager.updateAdParameters(adtrackingcontroller, this);
    }

    protected void updateCustomPartnerBranding(WeatherDataModel weatherdatamodel, DmaView dmaview)
    {
        CustomDmaView customdmaview = (CustomDmaView)findViewById(R.id.custom_dma);
        if (customdmaview == null)
        {
            return;
        }
        boolean flag1 = false;
        boolean flag = flag1;
        if (weatherdatamodel.getForecast() != null)
        {
            flag = flag1;
            if (weatherdatamodel.getForecast().getDailyForecasts() != null)
            {
                flag = flag1;
                if (!weatherdatamodel.getForecast().getDailyForecasts().isEmpty())
                {
                    flag = ((DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(0)).getSources().contains("Huafeng");
                }
            }
        }
        if (flag)
        {
            dmaview.setVisibility(8);
        }
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        customdmaview.setVisibility(i);
        customdmaview.setDmaListener(this);
        if (isDmaDarkThemed())
        {
            customdmaview.setTextColor(getResources().getColor(0x106000b));
            customdmaview.setBackgroundColor(getResources().getColor(0x106000c));
            customdmaview.setUsingDarkLogo(false);
            customdmaview.setUsingDarkHuafengLogo(false);
            return;
        } else
        {
            customdmaview.setUsingDarkLogo(true);
            customdmaview.setUsingDarkHuafengLogo(true);
            customdmaview.setTextColor(getResources().getColor(R.color.primary_text));
            customdmaview.setBackgroundColor(0xffffff);
            return;
        }
    }

    protected void updateDma(WeatherDataModel weatherdatamodel)
    {
        DmaView dmaview = (DmaView)findViewById(R.id.dma);
        LocationModel locationmodel;
        if (dmaview != null)
        {
            if ((locationmodel = getLocationForDma(weatherdatamodel)) != null)
            {
                dmaview.setVisibility(0);
                dmaview.updateDma(weatherdatamodel, getData(), isDmaDarkThemed(), locationmodel);
                dmaview.setDmaListener(this);
                setWeatherDataModelDma(weatherdatamodel);
                updateCustomPartnerBranding(weatherdatamodel, dmaview);
                return;
            }
        }
    }
}
