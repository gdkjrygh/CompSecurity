// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.installtracker.AdMarvelInstallTracker;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.offline.CheckForUpdatedPackage;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInterstitialAdListenerImpl, Version, Utils, AdMarvelUtils, 
//            AdMarvelAd, AdMarvelAdapterInstances, AdMarvelAdapter, AdMarvelVideoActivity, 
//            AdMarvelActivity, AdMarvelInterstitialAsyncTask, AdMarvelInterstitialAdapterListener

public class AdMarvelInterstitialAds
{
    public static interface AdMarvelInterstitialAdListener
    {

        public abstract void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity admarvelvideoactivity);

        public abstract void onAdmarvelActivityLaunched(AdMarvelActivity admarvelactivity);

        public abstract void onClickInterstitialAd(String s);

        public abstract void onCloseInterstitialAd();

        public abstract void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, int i, AdMarvelUtils.ErrorReason errorreason);

        public abstract void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, AdMarvelAd admarvelad);

        public abstract void onRequestInterstitialAd();
    }

    private static class AdMarvelInterstitialAsyncTaskRunnable
        implements Runnable
    {

        private final WeakReference m_adMarvelInterstitialAdsReference;
        private final String m_androidId;
        private final WeakReference m_contextReference;
        private final String m_deviceConnectivity;
        private final String m_excludedBanners;
        private final Handler m_handler;
        private final int m_orientation;
        private final String m_partnerId;
        private final int m_retryNum;
        private final String m_siteId;
        private final Map m_targetParams;

        public void run()
        {
            AdMarvelInterstitialAds admarvelinterstitialads = (AdMarvelInterstitialAds)m_adMarvelInterstitialAdsReference.get();
            Context context = (Context)m_contextReference.get();
            if (admarvelinterstitialads != null && context != null)
            {
                (new AdMarvelInterstitialAsyncTask(context)).execute(new Object[] {
                    m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, admarvelinterstitialads, Integer.valueOf(m_retryNum), m_excludedBanners, m_handler
                });
            }
        }

        public AdMarvelInterstitialAsyncTaskRunnable(Map map, String s, String s1, String s2, int i, String s3, AdMarvelInterstitialAds admarvelinterstitialads, 
                int j, String s4, Context context, Handler handler1)
        {
            m_targetParams = map;
            m_partnerId = s;
            m_siteId = s1;
            m_androidId = s2;
            m_orientation = i;
            m_deviceConnectivity = s3;
            m_adMarvelInterstitialAdsReference = new WeakReference(admarvelinterstitialads);
            m_retryNum = j;
            m_excludedBanners = s4;
            m_contextReference = new WeakReference(context);
            m_handler = handler1;
        }
    }

    private static class AdMarvelInterstitialAsyncTaskRunnablePostAPI11
        implements Runnable
    {

        private final WeakReference m_adMarvelInterstitialAdsReference;
        private final String m_androidId;
        private final WeakReference m_contextReference;
        private final String m_deviceConnectivity;
        private final String m_excludedBanners;
        private final Handler m_handler;
        private final int m_orientation;
        private final String m_partnerId;
        private final int m_retryNum;
        private final String m_siteId;
        private final Map m_targetParams;

        public void run()
        {
            AdMarvelInterstitialAds admarvelinterstitialads = (AdMarvelInterstitialAds)m_adMarvelInterstitialAdsReference.get();
            Context context = (Context)m_contextReference.get();
            if (admarvelinterstitialads != null && context != null)
            {
                (new AdMarvelInterstitialAsyncTask(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                    m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, admarvelinterstitialads, Integer.valueOf(m_retryNum), m_excludedBanners, m_handler
                });
            }
        }

        public AdMarvelInterstitialAsyncTaskRunnablePostAPI11(Map map, String s, String s1, String s2, int i, String s3, AdMarvelInterstitialAds admarvelinterstitialads, 
                int j, String s4, Context context, Handler handler1)
        {
            m_targetParams = map;
            m_partnerId = s;
            m_siteId = s1;
            m_androidId = s2;
            m_orientation = i;
            m_deviceConnectivity = s3;
            m_adMarvelInterstitialAdsReference = new WeakReference(admarvelinterstitialads);
            m_retryNum = j;
            m_excludedBanners = s4;
            m_contextReference = new WeakReference(context);
            m_handler = handler1;
        }
    }

    private static class ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11
        implements Runnable
    {

        private WeakReference activityReference;
        private String partnerId;

        public void run()
        {
            if (AdMarvelInterstitialAds.checkForUpdatedPackage != null)
            {
                AdMarvelInterstitialAds.checkForUpdatedPackage.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else
            if (activityReference.get() != null && partnerId != null)
            {
                AdMarvelInterstitialAds.checkForUpdatedPackage = new CheckForUpdatedPackage(partnerId, (Activity)activityReference.get());
                AdMarvelInterstitialAds.checkForUpdatedPackage.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            }
        }

        public ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(Activity activity, String s)
        {
            activityReference = new WeakReference(activity);
            partnerId = s;
        }
    }

    private static class InternalAdMarvelInterstitialAdapterListener
        implements AdMarvelInterstitialAdapterListener
    {

        private final WeakReference adMarvelInterstitialsAdReference;

        public void onCloseInterstitialAd()
        {
            if (AdMarvelInterstitialAds.listener != null)
            {
                AdMarvelInterstitialAds.listener.onCloseInterstitialAd();
            }
        }

        public void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, int i, AdMarvelUtils.ErrorReason errorreason, AdMarvelAd admarvelad)
        {
            AdMarvelInterstitialAds admarvelinterstitialads = (AdMarvelInterstitialAds)adMarvelInterstitialsAdReference.get();
            if (admarvelinterstitialads != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj;
            int j;
            boolean flag = false;
            j = ((flag) ? 1 : 0);
            if (admarvelad.getRetry().equals(Boolean.valueOf(true)))
            {
                j = ((flag) ? 1 : 0);
                if (admarvelad.getRetrynum() <= admarvelad.getMaxretries())
                {
                    j = admarvelad.getRetrynum() + 1;
                    obj = admarvelad.getExcluded();
                    if (admarvelad.getExcluded() == null)
                    {
                        obj = admarvelad.getBannerid();
                    } else
                    if (admarvelad.getExcluded().length() > 0)
                    {
                        obj = (new StringBuilder(String.valueOf(obj))).append(",").append(admarvelad.getBannerid()).toString();
                    } else
                    {
                        obj = admarvelad.getBannerid();
                    }
                    if (admarvelinterstitialads.contextReference == null || (Context)admarvelinterstitialads.contextReference.get() == null)
                    {
                        break MISSING_BLOCK_LABEL_382;
                    }
                    if (Version.getAndroidSDKVersion() < 11)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    admarvelinterstitialads.handler.post(new AdMarvelInterstitialAsyncTaskRunnablePostAPI11(admarvelad.getTargetParams(), admarvelad.getPartnerId(), admarvelad.getSiteId(), admarvelad.getAndroidId(), admarvelad.getOrientation(), admarvelad.getDeviceConnectivity(), admarvelinterstitialads, j, ((String) (obj)), (Context)admarvelinterstitialads.contextReference.get(), admarvelinterstitialads.handler));
                    j = 1;
                }
            }
_L4:
            if (j == 0 && admarvelinterstitialads.contextReference != null)
            {
                obj = (Context)admarvelinterstitialads.contextReference.get();
                if (obj != null && AdMarvelInterstitialAds.listener != null)
                {
                    AdMarvelInterstitialAds.listener.onFailedToReceiveInterstitialAd(((Context) (obj)), sdkadnetwork, s, i, errorreason, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
                    return;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
            admarvelinterstitialads.handler.post(new AdMarvelInterstitialAsyncTaskRunnable(admarvelad.getTargetParams(), admarvelad.getPartnerId(), admarvelad.getSiteId(), admarvelad.getAndroidId(), admarvelad.getOrientation(), admarvelad.getDeviceConnectivity(), admarvelinterstitialads, j, ((String) (obj)), (Context)admarvelinterstitialads.contextReference.get(), admarvelinterstitialads.handler));
            j = 1;
              goto _L4
        }

        public void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, AdMarvelAd admarvelad)
        {
            Object obj = (AdMarvelInterstitialAds)adMarvelInterstitialsAdReference.get();
            if (obj != null && ((AdMarvelInterstitialAds) (obj)).contextReference != null && ((AdMarvelInterstitialAds) (obj)).contextReference.get() != null)
            {
                obj = (Context)((AdMarvelInterstitialAds) (obj)).contextReference.get();
                if (obj != null && AdMarvelInterstitialAds.listener != null)
                {
                    AdMarvelInterstitialAds.listener.onReceiveInterstitialAd(((Context) (obj)), sdkadnetwork, s, admarvelad, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
                }
            }
        }

        public void onRequestInterstitialAd()
        {
            if (AdMarvelInterstitialAds.listener != null)
            {
                AdMarvelInterstitialAds.listener.onRequestInterstitialAd();
            }
        }

        public InternalAdMarvelInterstitialAdapterListener(AdMarvelInterstitialAds admarvelinterstitialads)
        {
            adMarvelInterstitialsAdReference = new WeakReference(admarvelinterstitialads);
        }
    }


    private static String DEFAULT_WEB_VIEW_CSS = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style>";
    private static String DEFAULT_WEB_VIEW_HTML_FORMAT = "<html><head>%s</head><body><div align=\"center\">%s</div></body></html>";
    private static String DEFAULT_WEB_VIEW_VIEWPORT = "<meta name=\"viewport\" content=\"initial-scale=1.0,maximum-scale=1.0,target-densitydpi=device-dpi, width=device-width\" />";
    private static String IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_LANDSCAPE = "<meta name=\"viewport\" content=\"width=device-height, initial-scale=1.0, maximum-scale=1.0\" />";
    private static String IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_PORTRAIT = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />";
    private static CheckForUpdatedPackage checkForUpdatedPackage = null;
    private static boolean enableClickRedirect = true;
    private static boolean enableNetworkActivity = true;
    public static boolean enableOfflineSDK;
    private static final AdMarvelInterstitialAdListenerImpl listener = new AdMarvelInterstitialAdListenerImpl();
    private final String GUID = UUID.randomUUID().toString();
    private final HashMap admarvelInterstitialAds = new HashMap();
    private final int backgroundColor;
    WeakReference contextReference;
    private boolean enableAutoScaling;
    private final Handler handler = new Handler();
    private final InternalAdMarvelInterstitialAdapterListener internalAdMarvelInterstitialAdapterListener = new InternalAdMarvelInterstitialAdapterListener(this);
    private final AtomicLong lockTimestamp = new AtomicLong(0L);
    private Map optionalFlags;
    private final int textBackgroundColor;
    private final int textBorderColor;
    private final int textFontColor;

    public AdMarvelInterstitialAds(Context context, int i, int j, int k, int l)
    {
        enableAutoScaling = true;
        contextReference = new WeakReference(context);
        if (i == 0)
        {
            backgroundColor = 0;
        } else
        {
            backgroundColor = 0xff000000 | i;
        }
        if (j == 0)
        {
            textBackgroundColor = 0;
        } else
        {
            textBackgroundColor = 0xff000000 | j;
        }
        textFontColor = k;
        textBorderColor = l;
    }

    public static void disableNetworkActivity()
    {
        com/admarvel/android/ads/AdMarvelInterstitialAds;
        JVM INSTR monitorenter ;
        enableNetworkActivity = false;
        if (checkForUpdatedPackage != null && !checkForUpdatedPackage.isCancelled())
        {
            checkForUpdatedPackage.cancel(true);
            checkForUpdatedPackage = null;
        }
        com/admarvel/android/ads/AdMarvelInterstitialAds;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void enableNetworkActivity(Activity activity, String s)
    {
        com/admarvel/android/ads/AdMarvelInterstitialAds;
        JVM INSTR monitorenter ;
        enableNetworkActivity = true;
        if (checkForUpdatedPackage == null || !checkForUpdatedPackage.isCancelled()) goto _L2; else goto _L1
_L1:
        checkForUpdatedPackage = null;
        checkForUpdatedPackage = new CheckForUpdatedPackage(s, activity);
        if (Version.getAndroidSDKVersion() < 11) goto _L4; else goto _L3
_L3:
        (new ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(activity, s)).run();
_L5:
        com/admarvel/android/ads/AdMarvelInterstitialAds;
        JVM INSTR monitorexit ;
        return;
_L4:
        checkForUpdatedPackage.execute(new Void[0]);
          goto _L5
        activity;
        throw activity;
_L2:
label0:
        {
            checkForUpdatedPackage = new CheckForUpdatedPackage(s, activity);
            if (Version.getAndroidSDKVersion() < 11)
            {
                break label0;
            }
            (new ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(activity, s)).run();
        }
          goto _L5
        checkForUpdatedPackage.execute(new Void[0]);
          goto _L5
    }

    public static boolean getEnableClickRedirect()
    {
        return enableClickRedirect;
    }

    public static AdMarvelInterstitialAdListenerImpl getListener()
    {
        return listener;
    }

    public static void initializeOfflineSDK(Activity activity, String s)
    {
label0:
        {
            Activity activity1 = (Activity)(new WeakReference(activity)).get();
            enableOfflineSDK = true;
            if (enableNetworkActivity && Utils.isNetworkAvailable(activity1))
            {
                checkForUpdatedPackage = new CheckForUpdatedPackage(s, activity1);
                if (Version.getAndroidSDKVersion() < 11)
                {
                    break label0;
                }
                (new ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(activity, s)).run();
            }
            return;
        }
        checkForUpdatedPackage.execute(new Void[0]);
    }

    public static void setEnableClickRedirect(boolean flag)
    {
        enableClickRedirect = flag;
    }

    public static void setListener(AdMarvelInterstitialAdListener admarvelinterstitialadlistener)
    {
        listener.setListener(admarvelinterstitialadlistener);
    }

    void disableAdRequest(String s, AdMarvelAd admarvelad, Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        Object obj;
        int i;
        obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        android.content.SharedPreferences.Editor editor;
        try
        {
            obj = (new StringBuilder("duration")).append(((String) (obj))).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logging.log(Log.getStackTraceString(namenotfoundexception));
            namenotfoundexception = null;
        }
        if (obj != null)
        {
            editor = context.getSharedPreferences(Utils.encodeString("admarvel"), 0).edit();
            s = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + (long)(Integer.parseInt(s) * 1000)));
            editor.putString(Utils.encodeString(((String) (obj))), s);
            editor.commit();
            Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
            listener.onFailedToReceiveInterstitialAd(context, null, null, 304, Utils.getErrorReason(304), admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
        }
        return;
        obj = (new StringBuilder("duration")).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
        break MISSING_BLOCK_LABEL_73;
    }

    public void displayInterstitial(Activity activity, AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s, AdMarvelAd admarvelad)
    {
        Object obj1 = null;
        if (sdkadnetwork != AdMarvelUtils.SDKAdNetwork.ADMOB) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter");
        }
        catch (Exception exception)
        {
            exception = obj1;
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((AdMarvelAdapter) (obj)).displayInterstitial(activity, s);
        (new Utils(activity, handler)).firePixel(admarvelad);
_L6:
        return;
_L2:
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.RHYTHM)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.GREYSTRIPE)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.MEDIALETS)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.MILLENNIAL)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.AMAZON)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.ADCOLONY)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.PINSIGHT)
        {
            try
            {
                obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        } else
        {
            obj = obj1;
            if (sdkadnetwork == AdMarvelUtils.SDKAdNetwork.PULSE3D)
            {
                try
                {
                    obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = obj1;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (sdkadnetwork != AdMarvelUtils.SDKAdNetwork.ADMARVEL) goto _L6; else goto _L5
_L5:
        displayPendingAdMarvelAd(s, admarvelad);
        return;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_18;
_L7:
    }

    void displayPendingAdMarvelAd(String s, AdMarvelAd admarvelad)
    {
        String s1 = (String)admarvelInterstitialAds.get(s);
        if (s1 == null || s1.length() <= 0) goto _L2; else goto _L1
_L1:
        Context context;
        context = (Context)contextReference.get();
        s = (new StringBuilder(String.valueOf(s))).append("|").append("custom").toString();
        if (context == null) goto _L2; else goto _L3
_L3:
        if (!enableOfflineSDK) goto _L5; else goto _L4
_L4:
        (new AdmarvelOfflineUtils()).firePixel(admarvelad, context, handler);
_L7:
        String s2 = (String)admarvelInterstitialAds.get(s);
        if (s2 == null || !s2.equals("custom"))
        {
            break; /* Loop/switch isn't completed */
        }
        admarvelInterstitialAds.remove(s);
        s = new Intent(context, com/admarvel/android/ads/AdMarvelVideoActivity);
        s.addFlags(0x10000000);
        s.putExtra("html", s1);
        s.putExtra("GUID", GUID);
        context.startActivity(s);
_L2:
        return;
_L5:
        if (!enableOfflineSDK)
        {
            (new Utils(context, handler)).firePixel(admarvelad);
        }
        if (true) goto _L7; else goto _L6
_L6:
        s = new Intent(context, com/admarvel/android/ads/AdMarvelActivity);
        s.addFlags(0x10000000);
        s.putExtra("source", "campaign");
        s.putExtra("html", s1);
        s.putExtra("xml", admarvelad.getXml());
        s.putExtra("backgroundcolor", backgroundColor);
        s.putExtra("isInterstitial", true);
        s.putExtra("isInterstitialClick", false);
        s.putExtra("GUID", GUID);
        admarvelad.removeNonStringEntriesTargetParam();
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(admarvelad);
            objectoutputstream.close();
            s.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelAd admarvelad)
        {
            admarvelad.printStackTrace();
        }
        context.startActivity(s);
        return;
    }

    public int getAdMarvelBackgroundColor()
    {
        return backgroundColor;
    }

    public int getTextBackgroundColor()
    {
        return textBackgroundColor;
    }

    public int getTextBorderColor()
    {
        return textBorderColor;
    }

    public int getTextFontColor()
    {
        return textFontColor;
    }

    public boolean isAutoScalingEnabled()
    {
        return enableAutoScaling;
    }

    public void requestNewInterstitialAd(Context context, Map map, String s, String s1)
    {
        Object obj;
        Object obj1;
        int i;
        try
        {
            contextReference = new WeakReference(context);
            obj1 = context.getSharedPreferences(Utils.encodeString("admarvel"), 0);
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.log(Log.getStackTraceString(context));
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        obj = (new StringBuilder("duration")).append(((String) (obj))).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = ((SharedPreferences) (obj1)).getString(Utils.encodeString(((String) (obj))), null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (((String) (obj)).length() > 0)
        {
            obj = DateFormat.getDateTimeInstance().parse(((String) (obj)));
            obj1 = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis()));
            if (DateFormat.getDateTimeInstance().parse(((String) (obj1))).before(((Date) (obj))))
            {
                Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
                listener.onFailedToReceiveInterstitialAd(context, null, null, 304, Utils.getErrorReason(304), s1, 0, map, "");
                return;
            }
        }
        break MISSING_BLOCK_LABEL_231;
        obj = (new StringBuilder("duration")).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
          goto _L1
        (new AdMarvelInstallTracker(context)).registerTrackingEvent();
        obj = s.trim();
        s1 = s1.trim();
        if (System.currentTimeMillis() - lockTimestamp.getAndSet(System.currentTimeMillis()) <= 2000L) goto _L3; else goto _L2
_L2:
        listener.onRequestInterstitialAd();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        s = (String)map.get("UNIQUE_ID");
_L4:
        if (Version.getAndroidSDKVersion() >= 11)
        {
            handler.post(new AdMarvelInterstitialAsyncTaskRunnablePostAPI11(map, ((String) (obj)), s1, Utils.getUniqueId(context, optionalFlags, s), Utils.getScreenOrientation(context), Utils.getDeviceConnectivitiy(context), this, 0, "", context, handler));
            return;
        }
        handler.post(new AdMarvelInterstitialAsyncTaskRunnable(map, ((String) (obj)), s1, Utils.getUniqueId(context, optionalFlags, s), Utils.getScreenOrientation(context), Utils.getDeviceConnectivitiy(context), this, 0, "", context, handler));
        return;
_L3:
        Logging.log("requestNewAd: AD REQUEST PENDING, IGNORING REQUEST");
        listener.onFailedToReceiveInterstitialAd(context, null, null, 304, Utils.getErrorReason(304), s1, 0, map, "");
        return;
        s = null;
          goto _L4
    }

    public void requestNewInterstitialAd(Context context, Map map, String s, String s1, Activity activity)
    {
        requestNewInterstitialAd(context, map, s, s1);
    }

    void requestPendingAdMarvelAd(AdMarvelAd admarvelad, Context context)
    {
        String s;
        String s1;
        if (admarvelad.getAdType() == AdMarvelAd.AdType.CUSTOM)
        {
            s = admarvelad.getXhtml();
        } else
        if (admarvelad.getAdType().equals(AdMarvelAd.AdType.IMAGE) && admarvelad.hasImage() && admarvelad.getImageWidth() > 0 && admarvelad.getImageHeight() > 0)
        {
            if (Version.getAndroidSDKVersion() >= 7)
            {
                if (enableAutoScaling)
                {
                    if (Utils.getScreenOrientation(context) == 2)
                    {
                        float f = 320F / (float)admarvelad.getImageWidth();
                        float f2 = admarvelad.getImageHeight();
                        s = (new StringBuilder("<a href=\"")).append(admarvelad.getClickURL()).append("\"><img src=\"").append(admarvelad.getImageURL()).append("\" width=\"320\" height=\"").append(f * f2).append("\" /></a>").toString();
                        s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_LANDSCAPE).toString(), s
                        });
                    } else
                    {
                        s = (new StringBuilder("<a href=\"")).append(admarvelad.getClickURL()).append("\"><img src=\"").append(admarvelad.getImageURL()).append("\" width=\"100%\" /></a>").toString();
                        s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_PORTRAIT).toString(), s
                        });
                    }
                } else
                {
                    s = (new StringBuilder("<a href=\"")).append(admarvelad.getClickURL()).append("\"><img src=\"").append(admarvelad.getImageURL()).append("\" width=\"").append(admarvelad.getWidth()).append("\" height=\"").append(admarvelad.getHeight()).append("\" /></a>").toString();
                    s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                        (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), s
                    });
                }
            } else
            if (context != null)
            {
                int i;
                int j;
                int k;
                if (Utils.getScreenOrientation(context) == 2)
                {
                    j = Utils.getDeviceHeight(context);
                } else
                {
                    j = Utils.getDeviceWidth(context);
                }
                if (Utils.getScreenOrientation(context) == 1)
                {
                    i = Utils.getDeviceHeight(context);
                } else
                {
                    i = Utils.getDeviceWidth(context);
                }
                if (enableAutoScaling)
                {
                    k = (int)((float)admarvelad.getImageWidth() * Utils.getScalingFactor(context, j, admarvelad.getImageWidth()));
                    float f1 = admarvelad.getImageHeight();
                    int l = (int)(Utils.getScalingFactor(context, j, admarvelad.getImageWidth()) * f1);
                    j = k;
                    k = l;
                } else
                {
                    j = admarvelad.getImageWidth();
                    k = admarvelad.getImageHeight();
                }
                i = Math.min(k, i);
                s = (new StringBuilder("<a href=\"")).append(admarvelad.getClickURL()).append("\"><img src=\"").append(admarvelad.getImageURL()).append("\" width=\"").append(j).append("\" height=\"").append(i).append("\" /></a>").toString();
                s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                    (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), s
                });
            } else
            {
                s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                    (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), admarvelad.getXHTML()
                });
            }
        } else
        {
            s = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                DEFAULT_WEB_VIEW_CSS, admarvelad.getXHTML()
            });
        }
        s1 = (new StringBuilder(String.valueOf(admarvelad.getPartnerId()))).append("|").append(admarvelad.getSiteId()).toString();
        admarvelInterstitialAds.put(s1, s);
        if (admarvelad.getAdType() == AdMarvelAd.AdType.CUSTOM)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("|").append("custom").toString();
            admarvelInterstitialAds.put(s, "custom");
        }
        listener.onReceiveInterstitialAd(context, AdMarvelUtils.SDKAdNetwork.ADMARVEL, s1, admarvelad, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
    }

    void requestPendingAdapterAd(Map map, AdMarvelAd admarvelad, String s, Context context)
    {
        try
        {
            AdMarvelAdapterInstances.getInstance(s).requestIntersitialNewAd(internalAdMarvelInterstitialAdapterListener, context, admarvelad, map, backgroundColor, textFontColor);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Logging.log(Log.getStackTraceString(map));
        }
        listener.onFailedToReceiveInterstitialAd(context, admarvelad.getSdkAdNetwork(), admarvelad.getPubId(), 304, Utils.getErrorReason(304), admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
    }

    public void setAdMarvelBackgroundColor(int i)
    {
    }

    public void setEnableAutoScaling(boolean flag)
    {
        enableAutoScaling = flag;
    }

    public void setOptionalFlags(Map map)
    {
        optionalFlags = map;
    }

    public void setTextBackgroundColor(int i)
    {
    }





}
