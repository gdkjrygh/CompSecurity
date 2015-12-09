// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.admarvel.android.installtracker.AdMarvelInstallTracker;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.offline.CheckForUpdatedPackage;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelViewListenerImpl, Version, Rotate3dAnimation, AdMarvelAdapterInstances, 
//            AdMarvelAdapter, AdMarvelWebView, AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, 
//            Utils, AdMarvelSensorManager, AdMarvelLocationManager, AdMarvelUtils, 
//            AdMarvelAd, AdMarvelCachedCleanupAdAsyncTask, AdMarvelViewAsyncTask, AdMarvelAdapterListener, 
//            AdMarvelWebViewListener

public class AdMarvelView extends LinearLayout
{
    private static class AdMarvelCachedCleanupAdAsyncTaskRunnable
        implements Runnable
    {

        private final File m_cachedDirectory;
        private final WeakReference m_contextReference;

        public void run()
        {
            Context context;
label0:
            {
                context = (Context)m_contextReference.get();
                if (context != null)
                {
                    if (Version.getAndroidSDKVersion() < 11)
                    {
                        break label0;
                    }
                    (new AdMarvelCachedCleanupAdAsyncTask(context, m_cachedDirectory)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                }
                return;
            }
            (new AdMarvelCachedCleanupAdAsyncTask(context, m_cachedDirectory)).execute(new Object[0]);
        }

        public AdMarvelCachedCleanupAdAsyncTaskRunnable(Context context, File file)
        {
            m_contextReference = new WeakReference(context);
            m_cachedDirectory = file;
        }
    }

    private static class AdMarvelViewAsyncTaskRunnable
        implements Runnable
    {

        private final WeakReference m_adMarvelViewReference;
        private final String m_androidId;
        private final WeakReference m_contextReference;
        private final String m_deviceConnectivity;
        private final String m_excludedBanners;
        private final Handler m_handler;
        private final int m_orientation;
        private final String m_partnerId;
        private final int m_retryNum;
        private final String m_siteId;
        private final File m_storage;
        private final Map m_targetParams;

        public void run()
        {
            Context context;
            AdMarvelView admarvelview;
label0:
            {
                context = (Context)m_contextReference.get();
                admarvelview = (AdMarvelView)m_adMarvelViewReference.get();
                if (context != null && admarvelview != null)
                {
                    if (Version.getAndroidSDKVersion() < 11)
                    {
                        break label0;
                    }
                    m_handler.post(new AdMarvelViewAsyncTaskRunnablePostAPI11(m_storage, context, m_targetParams, m_partnerId, m_siteId, m_androidId, m_orientation, m_deviceConnectivity, admarvelview, m_retryNum, m_excludedBanners, m_handler));
                }
                return;
            }
            (new AdMarvelViewAsyncTask(m_storage, context)).execute(new Object[] {
                m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, admarvelview, Integer.valueOf(m_retryNum), m_excludedBanners, m_handler, 
                Boolean.valueOf(admarvelview.isSoftwareLayer()), Boolean.valueOf(admarvelview.enableAutoScaling)
            });
        }

        public AdMarvelViewAsyncTaskRunnable(File file, Context context, Map map, String s, String s1, String s2, int i, 
                String s3, AdMarvelView admarvelview, int j, String s4, Handler handler1)
        {
            m_contextReference = new WeakReference(context);
            m_storage = file;
            m_targetParams = map;
            m_partnerId = s;
            m_siteId = s1;
            m_androidId = s2;
            m_orientation = i;
            m_deviceConnectivity = s3;
            m_adMarvelViewReference = new WeakReference(admarvelview);
            m_retryNum = j;
            m_excludedBanners = s4;
            m_handler = handler1;
        }
    }

    private static class AdMarvelViewAsyncTaskRunnablePostAPI11
        implements Runnable
    {

        private final WeakReference m_adMarvelViewReference;
        private final String m_androidId;
        private final WeakReference m_contextReference;
        private final String m_deviceConnectivity;
        private final String m_excludedBanners;
        private final Handler m_handler;
        private final int m_orientation;
        private final String m_partnerId;
        private final int m_retryNum;
        private final String m_siteId;
        private final File m_storage;
        private final Map m_targetParams;

        public void run()
        {
            if (m_contextReference.get() != null && m_adMarvelViewReference.get() != null)
            {
                (new AdMarvelViewAsyncTask(m_storage, (Context)m_contextReference.get())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                    m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, m_adMarvelViewReference.get(), Integer.valueOf(m_retryNum), m_excludedBanners, m_handler, 
                    Boolean.valueOf(((AdMarvelView)m_adMarvelViewReference.get()).isSoftwareLayer()), Boolean.valueOf(((AdMarvelView)m_adMarvelViewReference.get()).enableAutoScaling)
                });
            }
        }

        public AdMarvelViewAsyncTaskRunnablePostAPI11(File file, Context context, Map map, String s, String s1, String s2, int i, 
                String s3, AdMarvelView admarvelview, int j, String s4, Handler handler1)
        {
            m_contextReference = new WeakReference(context);
            m_storage = file;
            m_targetParams = map;
            m_partnerId = s;
            m_siteId = s1;
            m_androidId = s2;
            m_orientation = i;
            m_deviceConnectivity = s3;
            m_adMarvelViewReference = new WeakReference(admarvelview);
            m_retryNum = j;
            m_excludedBanners = s4;
            m_handler = handler1;
        }
    }

    public static interface AdMarvelViewListener
    {

        public abstract void onClickAd(AdMarvelView admarvelview, String s);

        public abstract void onClose();

        public abstract void onExpand();

        public abstract void onFailedToReceiveAd(AdMarvelView admarvelview, int i, AdMarvelUtils.ErrorReason errorreason);

        public abstract void onReceiveAd(AdMarvelView admarvelview);

        public abstract void onRequestAd(AdMarvelView admarvelview);
    }

    private static class DestroyRunnable
        implements Runnable
    {

        private final WeakReference adMarvelViewReference;

        public void run()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            }
            View view = admarvelview.findViewWithTag("CURRENT");
            admarvelview.cleanupWebView(view);
            if (!admarvelview.isAdNetworkAdExpanded)
            {
                admarvelview.cleanupAdapterView(view);
            }
            admarvelview.removeAllViews();
        }

        public DestroyRunnable(AdMarvelView admarvelview)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
        }
    }

    private static class DisplayPendingView
        implements Runnable
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelViewReference;

        public void run()
        {
            Object obj;
            Object obj1;
            View view;
            Context context;
            try
            {
                obj = (AdMarvelView)adMarvelViewReference.get();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            if (obj == null)
            {
                return;
            }
            context = ((AdMarvelView) (obj)).getContext();
            if (context == null) goto _L2; else goto _L1
_L1:
            obj1 = ((AdMarvelView) (obj)).findViewWithTag("PENDING");
            if (obj1 == null) goto _L2; else goto _L3
_L3:
            view = ((AdMarvelView) (obj)).findViewWithTag("CURRENT");
            if (view == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            Logging.log((new StringBuilder("crv: ")).append(view.getVisibility()).toString());
            if (view == null) goto _L5; else goto _L4
_L4:
            if (!((AdMarvelView) (obj)).disableAnimation && view.getVisibility() == 0 && !view.isShown()) goto _L6; else goto _L5
_L5:
            if (!adMarvelAd.isMustBeVisible() || adMarvelAd.getSdkAdNetwork() != AdMarvelUtils.SDKAdNetwork.PULSE3D) goto _L8; else goto _L7
_L7:
            ((View) (obj1)).setTag("CURRENT");
            ((AdMarvelView) (obj)).cleanupWebView(view);
_L12:
            if (!((AdMarvelView) (obj)).isAdNetworkAdExpanded)
            {
                ((AdMarvelView) (obj)).cleanupAdapterView(view);
            }
            ((AdMarvelView) (obj)).listenerImpl.onReceiveAd(context, ((AdMarvelView) (obj)), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L10:
            obj1 = new Utils(context, ((AdMarvelView) (obj)).handler);
            if (AdMarvelView.enableOfflineSDK && !((AdMarvelView) (obj)).disableSDKImpressionTracking)
            {
                (new AdmarvelOfflineUtils()).firePixel(adMarvelAd, context, ((AdMarvelView) (obj)).handler);
                return;
            }
              goto _L9
_L8:
            ((AdMarvelView) (obj)).applyFadeIn();
            ((View) (obj1)).setTag("CURRENT");
            ((View) (obj1)).setVisibility(0);
            ((AdMarvelView) (obj)).removeAllViews();
            ((AdMarvelView) (obj)).addView(((View) (obj1)));
            ((AdMarvelView) (obj)).cleanupWebView(view);
            continue; /* Loop/switch isn't completed */
_L6:
            ((AdMarvelView) (obj)).applyRotation(((View) (obj1)), adMarvelAd);
              goto _L10
_L9:
            if (!AdMarvelView.enableOfflineSDK)
            {
                ((Utils) (obj1)).firePixel(adMarvelAd);
            }
_L2:
            return;
            if (true) goto _L12; else goto _L11
_L11:
        }

        public DisplayPendingView(AdMarvelView admarvelview, AdMarvelAd admarvelad)
        {
            adMarvelAd = admarvelad;
            adMarvelViewReference = new WeakReference(admarvelview);
        }
    }

    private static class ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11
        implements Runnable
    {

        private WeakReference activityReference;
        private String partnerId;

        public void run()
        {
            if (AdMarvelView.checkForUpdatedPackage != null)
            {
                AdMarvelView.checkForUpdatedPackage.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else
            if (activityReference.get() != null && partnerId != null)
            {
                AdMarvelView.checkForUpdatedPackage = new CheckForUpdatedPackage(partnerId, (Activity)activityReference.get());
                AdMarvelView.checkForUpdatedPackage.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            }
        }

        public ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(Activity activity, String s)
        {
            activityReference = new WeakReference(activity);
            partnerId = s;
        }
    }

    private static class FireImpressionPixelRunnable
        implements Runnable
    {

        private final WeakReference adMarvelViewReference;
        private final WeakReference handlerReference;

        public void run()
        {
            Object obj = (AdMarvelView)adMarvelViewReference.get();
            if (obj != null)
            {
                Handler handler1 = (Handler)handlerReference.get();
                Context context = ((AdMarvelView) (obj)).getContext();
                obj = ((AdMarvelView) (obj)).findViewWithTag("CURRENT");
                if (obj != null && (obj instanceof AdMarvelWebView))
                {
                    obj = ((AdMarvelWebView)obj).getAdMarvelAd();
                    if (obj != null)
                    {
                        (new AdmarvelOfflineUtils()).firePixel(((AdMarvelAd) (obj)), context, handler1);
                        return;
                    }
                }
            }
        }

        public FireImpressionPixelRunnable(AdMarvelView admarvelview, Handler handler1)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
            handlerReference = new WeakReference(handler1);
        }
    }

    private static class FocusRunnable
        implements Runnable
    {

        private final WeakReference adMarvelViewReference;

        public void run()
        {
            Object obj = (AdMarvelView)adMarvelViewReference.get();
            if (obj != null)
            {
                if ((obj = ((AdMarvelView) (obj)).findViewWithTag("CURRENT")) != null && (obj instanceof AdMarvelWebView))
                {
                    ((AdMarvelWebView)obj).focus();
                    return;
                }
            }
        }

        public FocusRunnable(AdMarvelView admarvelview)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
        }
    }

    private static class HardwareAccelerationManager
    {

        static void enable(Activity activity)
        {
            activity.getWindow().setFlags(0x1000000, 0x1000000);
        }

        private HardwareAccelerationManager()
        {
        }
    }

    private static class InternalAdMarvelAdapterListener
        implements AdMarvelAdapterListener
    {

        private AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelViewReference;

        public void onClickAd(String s)
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.listenerImpl.onClickAd(admarvelview.getContext(), admarvelview, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                return;
            }
        }

        public void onClose()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.isAdNetworkAdExpanded = false;
                admarvelview.listenerImpl.onClose();
                return;
            }
        }

        public void onExpand()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.isAdNetworkAdExpanded = true;
                admarvelview.listenerImpl.onExpand();
                return;
            }
        }

        public void onFailedToReceiveAd(int i, AdMarvelUtils.ErrorReason errorreason)
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            AdMarvelAd admarvelad = admarvelview.admarvelAd;
            admarvelview.handler.post(new RemovePendingView(admarvelview));
            boolean flag = false;
            int j = ((flag) ? 1 : 0);
            if (!admarvelad.getRetry().equals(Boolean.valueOf(true)))
            {
                continue; /* Loop/switch isn't completed */
            }
            j = ((flag) ? 1 : 0);
            if (admarvelad.getRetrynum() > admarvelad.getMaxretries())
            {
                continue; /* Loop/switch isn't completed */
            }
            j = admarvelad.getRetrynum();
            String s = admarvelad.getExcluded();
            File file;
            if (admarvelad.getExcluded() == null)
            {
                s = admarvelad.getBannerid();
            } else
            if (admarvelad.getExcluded().length() > 0)
            {
                s = (new StringBuilder(String.valueOf(s))).append(",").append(admarvelad.getBannerid()).toString();
            } else
            {
                s = admarvelad.getBannerid();
            }
            file = null;
            if (AdMarvelView.cachedDirectory != null)
            {
                file = new File(AdMarvelView.cachedDirectory);
            }
            if (admarvelview.getContext() != null)
            {
                admarvelview.handler.post(new AdMarvelViewAsyncTaskRunnable(file, admarvelview.getContext(), admarvelad.getTargetParams(), admarvelad.getPartnerId(), admarvelad.getSiteId(), admarvelad.getAndroidId(), admarvelad.getOrientation(), admarvelad.getDeviceConnectivity(), admarvelview, j + 1, s, admarvelview.handler));
            }
            j = 1;
            if (j != 0) goto _L1; else goto _L3
_L3:
            admarvelview.listenerImpl.onFailedToReceiveAd(admarvelview.getContext(), admarvelview, i, errorreason, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }

        public void onReceiveAd()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.handler.post(new DisplayPendingView(admarvelview, admarvelview.admarvelAd));
                return;
            }
        }

        public InternalAdMarvelAdapterListener(AdMarvelView admarvelview)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
            adMarvelAd = ((AdMarvelView)adMarvelViewReference.get()).admarvelAd;
        }
    }

    private static class InternalAdmarvelListener
        implements AdMarvelWebViewListener
    {

        private final WeakReference adMarvelViewReference;

        public void onClickAd(AdMarvelAd admarvelad, String s)
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.listenerImpl.onClickAd(admarvelview.getContext(), admarvelview, s, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
                return;
            }
        }

        public void onClose()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.listenerImpl.onClose();
                return;
            }
        }

        public void onExpand()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelview == null)
            {
                return;
            } else
            {
                admarvelview.listenerImpl.onExpand();
                return;
            }
        }

        public void onFailedToReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad, int i, AdMarvelUtils.ErrorReason errorreason)
        {
            admarvelwebview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelwebview != null)
            {
                View view = admarvelwebview.findViewWithTag("PENDING");
                if (view != null)
                {
                    admarvelwebview.removeView(view);
                }
                if (admarvelad != null)
                {
                    ((AdMarvelView) (admarvelwebview)).listenerImpl.onFailedToReceiveAd(admarvelwebview.getContext(), admarvelwebview, i, errorreason, admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
                    return;
                }
            }
        }

        public void onReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad)
        {
            admarvelwebview = (AdMarvelView)adMarvelViewReference.get();
            if (admarvelwebview == null)
            {
                return;
            } else
            {
                ((AdMarvelView) (admarvelwebview)).handler.post(new DisplayPendingView(admarvelwebview, admarvelad));
                return;
            }
        }

        public InternalAdmarvelListener(AdMarvelView admarvelview)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
        }
    }

    private static class RemovePendingView
        implements Runnable
    {

        final WeakReference adMarvelViewReference;

        public void run()
        {
            AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
            View view;
            if (admarvelview != null)
            {
                if ((view = admarvelview.findViewWithTag("PENDING")) != null)
                {
                    admarvelview.removeView(view);
                    return;
                }
            }
        }

        public RemovePendingView(AdMarvelView admarvelview)
        {
            adMarvelViewReference = new WeakReference(admarvelview);
        }
    }

    private static class SwapViews
        implements Runnable
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelViewReference;
        private final WeakReference viewReference;

        public void run()
        {
            if (viewReference != null && adMarvelViewReference != null)
            {
                Object obj = (View)viewReference.get();
                AdMarvelView admarvelview = (AdMarvelView)adMarvelViewReference.get();
                if (admarvelview != null && admarvelview != null)
                {
                    View view = admarvelview.findViewWithTag("CURRENT");
                    if (view != null)
                    {
                        admarvelview.applyFadeIn();
                        ((View) (obj)).setVisibility(0);
                        ((View) (obj)).setTag("CURRENT");
                        admarvelview.removeAllViews();
                        admarvelview.addView(((View) (obj)));
                        admarvelview.cleanupWebView(view);
                        if (!admarvelview.isAdNetworkAdExpanded)
                        {
                            admarvelview.cleanupAdapterView(view);
                        }
                        obj = new Rotate3dAnimation(90F, 0.0F, (float)admarvelview.getWidth() / 2.0F, (float)admarvelview.getHeight() / 2.0F, -0.3F * (float)admarvelview.getWidth(), false);
                        ((Rotate3dAnimation) (obj)).setDuration(700L);
                        ((Rotate3dAnimation) (obj)).setFillAfter(true);
                        ((Rotate3dAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
                        admarvelview.startAnimation(((Animation) (obj)));
                        if (adMarvelAd != null)
                        {
                            admarvelview.listenerImpl.onReceiveAd(admarvelview.getContext(), admarvelview, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                            return;
                        }
                    }
                }
            }
        }

        public SwapViews(View view, AdMarvelView admarvelview, AdMarvelAd admarvelad)
        {
            viewReference = new WeakReference(view);
            adMarvelViewReference = new WeakReference(admarvelview);
            adMarvelAd = admarvelad;
        }
    }


    static String cachedDirectory;
    private static CheckForUpdatedPackage checkForUpdatedPackage = null;
    private static boolean enableHardwareAcceleration = true;
    private static boolean enableNetworkActivity = true;
    public static boolean enableOfflineSDK;
    private static boolean rancleanup = false;
    private WeakReference activityReference;
    private AdMarvelAd admarvelAd;
    private int backgroundColor;
    private boolean disableAnimation;
    private boolean disableSDKImpressionTracking;
    private boolean enableAutoScaling;
    private boolean enableClickRedirect;
    private final Handler handler;
    private final InternalAdMarvelAdapterListener internalAdMarvelAdapterListener;
    private final InternalAdmarvelListener internalAdmarvelListener;
    private boolean isAdNetworkAdExpanded;
    private final AdMarvelViewListenerImpl listenerImpl;
    private final AtomicLong lockTimestamp;
    private Map optionalFlags;
    private boolean setSoftwareLayer;
    private int textBackgroundColor;
    private int textBorderColor;
    private int textFontColor;

    public AdMarvelView(Context context)
        throws Exception
    {
        this(context, null);
    }

    public AdMarvelView(Context context, AttributeSet attributeset)
        throws Exception
    {
        super(context, attributeset);
        isAdNetworkAdExpanded = false;
        enableClickRedirect = true;
        setSoftwareLayer = false;
        enableAutoScaling = true;
        disableSDKImpressionTracking = false;
        listenerImpl = new AdMarvelViewListenerImpl();
        enableAutoScaling = true;
        handler = new Handler();
        Logging.log(Version.getVersionDump());
        setFocusable(true);
        setDescendantFocusability(0x40000);
        setClickable(true);
        context = (new StringBuilder("http://schemas.android.com/apk/res/")).append(context.getPackageName()).toString();
        if (attributeset != null)
        {
            if (attributeset.getAttributeValue(context, "backgroundColor") != null)
            {
                if ("0".equals(attributeset.getAttributeValue(context, "backgroundColor")))
                {
                    backgroundColor = 0;
                } else
                {
                    backgroundColor = Integer.parseInt(attributeset.getAttributeValue(context, "backgroundColor").replace("#", ""), 16);
                }
            }
            if (attributeset.getAttributeValue(context, "textBackgroundColor") != null)
            {
                textBackgroundColor = Integer.parseInt(attributeset.getAttributeValue(context, "textBackgroundColor").replace("#", ""), 16);
            }
            if (attributeset.getAttributeValue(context, "textFontColor") != null)
            {
                textFontColor = Integer.parseInt(attributeset.getAttributeValue(context, "textFontColor").replace("#", ""), 16);
            }
            if (attributeset.getAttributeValue(context, "textBorderColor") != null)
            {
                textBorderColor = Integer.parseInt(attributeset.getAttributeValue(context, "textBorderColor").replace("#", ""), 16);
            }
            if (attributeset.getAttributeValue(context, "disableAnimation") != null)
            {
                disableAnimation = Boolean.parseBoolean(attributeset.getAttributeValue(context, "disableAnimation"));
            }
            if (attributeset.getAttributeValue(context, "enableClickRedirect") != null)
            {
                enableClickRedirect = Boolean.parseBoolean(attributeset.getAttributeValue(context, "enableClickRedirect"));
            }
            setAdMarvelBackgroundColor(backgroundColor);
        }
        lockTimestamp = new AtomicLong(0L);
        internalAdMarvelAdapterListener = new InternalAdMarvelAdapterListener(this);
        internalAdmarvelListener = new InternalAdmarvelListener(this);
    }

    private void applyFadeIn()
    {
        if (disableAnimation)
        {
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(233L);
            alphaanimation.startNow();
            alphaanimation.setFillAfter(true);
            alphaanimation.setInterpolator(new AccelerateInterpolator());
            startAnimation(alphaanimation);
            return;
        }
    }

    private void applyRotation(final View view, final AdMarvelAd adMarvelAd)
    {
        if (disableAnimation)
        {
            return;
        } else
        {
            setVisibility(8);
            setVisibility(0);
            Rotate3dAnimation rotate3danimation = new Rotate3dAnimation(0.0F, -90F, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F, -0.3F * (float)getWidth(), true);
            rotate3danimation.setDuration(700L);
            rotate3danimation.setFillAfter(true);
            rotate3danimation.setInterpolator(new AccelerateInterpolator());
            rotate3danimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final AdMarvelView this$0;
                private final AdMarvelAd val$adMarvelAd;
                private final View val$view;

                public void onAnimationEnd(Animation animation)
                {
                    post(new SwapViews(view, AdMarvelView.this, adMarvelAd));
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = AdMarvelView.this;
                view = view1;
                adMarvelAd = admarvelad;
                super();
            }
            });
            startAnimation(rotate3danimation);
            return;
        }
    }

    private void cleanupAdapterView(View view)
    {
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter: cleanupView");
        }
        catch (Exception exception7) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: cleanupView");
        }
        catch (Exception exception6) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: cleanupView");
        }
        catch (Exception exception5) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter: cleanupView");
        }
        catch (Exception exception4) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: cleanupView");
        }
        catch (Exception exception3) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: cleanupView");
        }
        catch (Exception exception2) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: cleanupView");
        }
        catch (Exception exception1) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter: cleanupView");
        }
        catch (Exception exception) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").cleanupView(view);
            Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: cleanupView");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    private void cleanupWebView(View view)
    {
        if (view != null && (view instanceof AdMarvelWebView))
        {
            view = (AdMarvelWebView)view;
            view.close();
            view.destroyWebView();
        }
    }

    public static void disableNetworkActivity()
    {
        com/admarvel/android/ads/AdMarvelView;
        JVM INSTR monitorenter ;
        enableNetworkActivity = false;
        if (checkForUpdatedPackage != null && !checkForUpdatedPackage.isCancelled())
        {
            checkForUpdatedPackage.cancel(true);
            checkForUpdatedPackage = null;
        }
        com/admarvel/android/ads/AdMarvelView;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void enableNetworkActivity(Activity activity, String s)
    {
        com/admarvel/android/ads/AdMarvelView;
        JVM INSTR monitorenter ;
        enableNetworkActivity = true;
        if (checkForUpdatedPackage == null || !checkForUpdatedPackage.isCancelled()) goto _L2; else goto _L1
_L1:
        checkForUpdatedPackage = null;
        if (Version.getAndroidSDKVersion() < 11) goto _L4; else goto _L3
_L3:
        (new ExecuteCheckForUpdatedPackageAsyncTaskPostAPI11(activity, s)).run();
_L5:
        com/admarvel/android/ads/AdMarvelView;
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

    public static void initialize(Activity activity, Map map)
    {
        if (Version.getAndroidSDKVersion() >= 11 && enableHardwareAcceleration)
        {
            HardwareAccelerationManager.enable(activity);
        }
        (new AdMarvelInstallTracker(activity)).registerTrackingEvent();
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter: startActivity");
        }
        catch (Exception exception8) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: startActivity");
        }
        catch (Exception exception7) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: startActivity");
        }
        catch (Exception exception6) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter: startActivity");
        }
        catch (Exception exception5) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: startActivity");
        }
        catch (Exception exception4) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: startActivity");
        }
        catch (Exception exception3) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: startActivity");
        }
        catch (Exception exception2) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter: startActivity");
        }
        catch (Exception exception1) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", activity).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
        }
        catch (Exception exception) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").initialize(activity, map);
            Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: startActivity");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void initializeOfflineSDK(Activity activity, String s)
    {
label0:
        {
            enableOfflineSDK = true;
            Logging.log("Offline SDK:initializeOfflineSDK ");
            if (enableNetworkActivity && Utils.isNetworkAvailable(activity))
            {
                checkForUpdatedPackage = new CheckForUpdatedPackage(s, activity);
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

    public static void pause(Activity activity, Map map, AdMarvelView admarvelview)
    {
        if (admarvelview != null)
        {
            admarvelview = admarvelview.findViewWithTag("CURRENT");
            if (admarvelview instanceof AdMarvelWebView)
            {
                ((AdMarvelWebView)admarvelview).pauseTimers();
            }
        }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", activity).pause();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: pause");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").pause(activity, map);
            Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: pause");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void resume(Activity activity, Map map, AdMarvelView admarvelview)
    {
        if (admarvelview != null)
        {
            admarvelview = admarvelview.findViewWithTag("CURRENT");
            if (admarvelview instanceof AdMarvelWebView)
            {
                ((AdMarvelWebView)admarvelview).resumeTimers();
            }
        }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelView admarvelview) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter").resume(activity, map);
            Logging.log("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", activity).resume();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: resume");
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter", activity).resume();
            Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: resume");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public static void setEnableHardwareAcceleration(boolean flag)
    {
        enableHardwareAcceleration = flag;
    }

    public static void uninitialize(Activity activity, Map map)
    {
        Object obj = AdMarvelSensorManager.getInstance();
        if (obj != null && ((AdMarvelSensorManager) (obj)).isListening())
        {
            ((AdMarvelSensorManager) (obj)).stopListening();
        }
        obj = AdMarvelLocationManager.getInstance();
        if (obj != null)
        {
            ((AdMarvelLocationManager) (obj)).stopLocationService(activity);
        }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter: endActivity");
        }
        catch (Exception exception6) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: endActivity");
        }
        catch (Exception exception5) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: endActivity");
        }
        catch (Exception exception4) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter: endActivity");
        }
        catch (Exception exception3) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: endActivity");
        }
        catch (Exception exception2) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: endActivity");
        }
        catch (Exception exception1) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: endActivity");
        }
        catch (Exception exception) { }
        try
        {
            AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter").uninitialize(activity, map);
            Logging.log("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter: endActivity");
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", activity).stop();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: stop");
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter", activity).stop();
            Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: stop");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public void adMarvelViewDisplayed()
    {
        handler.post(new FireImpressionPixelRunnable(this, handler));
    }

    public void destroy()
    {
        handler.post(new DestroyRunnable(this));
    }

    void disableAdRequest(String s, AdMarvelAd admarvelad, Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        Object obj;
        int i;
        obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
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
            context = context.getSharedPreferences(Utils.encodeString("admarvel"), 0).edit();
            s = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + (long)(Integer.parseInt(s) * 1000)));
            context.putString(Utils.encodeString(((String) (obj))), s);
            context.commit();
            Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
            listenerImpl.onFailedToReceiveAd(getContext(), this, 304, Utils.getErrorReason(304), admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
        }
        return;
        obj = (new StringBuilder("duration")).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
        break MISSING_BLOCK_LABEL_74;
    }

    public void focus()
    {
        handler.post(new FocusRunnable(this));
    }

    public int getAdMarvelBackgroundColor()
    {
        return backgroundColor;
    }

    AdMarvelViewListenerImpl getListenerImpl()
    {
        return listenerImpl;
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

    public boolean isDisableAnimation()
    {
        return disableAnimation;
    }

    public boolean isEnableClickRedirect()
    {
        return enableClickRedirect;
    }

    public boolean isSoftwareLayer()
    {
        return setSoftwareLayer;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        l = getChildCount();
        i = 0;
        do
        {
            if (i >= l)
            {
                return;
            }
            View view = getChildAt(i);
            if (getVisibility() == 0 && view.getVisibility() == 0)
            {
                k = Math.min(getMeasuredWidth(), getWidth());
                j = Math.min(getMeasuredHeight(), getHeight());
            } else
            {
                j = 0;
                k = 0;
            }
            view.layout(0, 0, k, j);
            i++;
        } while (true);
    }

    void requestInternalPendingAd(AdMarvelAd admarvelad)
    {
        Object obj = findViewWithTag("CURRENT");
        if (obj instanceof AdMarvelWebView)
        {
            ((AdMarvelWebView)obj).close();
        }
        obj = null;
        if (cachedDirectory != null)
        {
            obj = new File(cachedDirectory);
        }
        admarvelad = new AdMarvelWebView(getContext(), enableAutoScaling, ((File) (obj)), admarvelad.getXml(), admarvelad, handler);
        admarvelad.setBackgroundColor(backgroundColor);
        admarvelad.setEnableClickRedirect(enableClickRedirect);
        AdMarvelWebView.setListener(((AdMarvelWebView) (admarvelad)).GUID, internalAdmarvelListener);
        admarvelad.setTag("PENDING");
        admarvelad.setVisibility(8);
        admarvelad.loadAd(getTextFontColor(), getTextBorderColor(), getTextBackgroundColor(), getAdMarvelBackgroundColor(), this);
        do
        {
            View view = findViewWithTag("PENDING");
            if (view == null)
            {
                addView(admarvelad);
                return;
            }
            removeView(view);
        } while (true);
    }

    public void requestNewAd(Map map, String s, String s1)
    {
        Object obj1;
        Object obj;
        int i;
        try
        {
            obj1 = getContext().getSharedPreferences(Utils.encodeString("admarvel"), 0);
            obj = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
            i = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Logging.log(Log.getStackTraceString(map));
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        obj = (new StringBuilder("duration")).append(((String) (obj))).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        obj = ((SharedPreferences) (obj1)).getString(Utils.encodeString(((String) (obj))), null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (((String) (obj)).length() > 0)
        {
            obj = DateFormat.getDateTimeInstance().parse(((String) (obj)));
            obj1 = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis()));
            if (DateFormat.getDateTimeInstance().parse(((String) (obj1))).before(((Date) (obj))))
            {
                Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
                listenerImpl.onFailedToReceiveAd(getContext(), this, 304, Utils.getErrorReason(304), s1, 0, map, "");
                return;
            }
        }
        break MISSING_BLOCK_LABEL_237;
        obj = (new StringBuilder("duration")).append(i).append(AdMarvelUtils.getSDKVersion()).toString();
          goto _L1
        (new AdMarvelInstallTracker(getContext())).registerTrackingEvent();
        obj = s.trim();
        obj1 = s1.trim();
        s = AdMarvelSensorManager.getInstance();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (s.isListening())
        {
            s.stopListening();
        }
        s = AdMarvelLocationManager.getInstance();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        s.stopLocationService(getContext());
        if (System.currentTimeMillis() - lockTimestamp.getAndSet(System.currentTimeMillis()) <= 2000L) goto _L3; else goto _L2
_L2:
        listenerImpl.onRequestAd(this);
        s = null;
        if (cachedDirectory != null)
        {
            s = new File(cachedDirectory);
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        s1 = (String)map.get("UNIQUE_ID");
_L4:
        handler.post(new AdMarvelViewAsyncTaskRunnable(s, getContext(), map, ((String) (obj)), ((String) (obj1)), Utils.getUniqueId(getContext(), optionalFlags, s1), Utils.getScreenOrientation(getContext()), Utils.getDeviceConnectivitiy(getContext()), this, 0, "", handler));
        return;
_L3:
        Logging.log("requestNewAd: AD REQUEST PENDING, IGNORING REQUEST");
        listenerImpl.onFailedToReceiveAd(getContext(), this, 304, Utils.getErrorReason(304), ((String) (obj1)), 0, map, "");
        return;
        s1 = null;
          goto _L4
    }

    public void requestNewAd(Map map, String s, String s1, Activity activity)
    {
        if (activity != null)
        {
            activityReference = new WeakReference(activity);
        }
        requestNewAd(map, s, s1);
    }

    void requestPendingAd(Map map, AdMarvelAd admarvelad, String s, Context context)
    {
        if (admarvelad == null)
        {
            break MISSING_BLOCK_LABEL_9;
        }
        admarvelAd = admarvelad;
        s = AdMarvelAdapterInstances.getInstance(s);
        if (activityReference == null || activityReference.get() == null) goto _L2; else goto _L1
_L1:
        map = s.requestNewAd(internalAdMarvelAdapterListener, (Context)activityReference.get(), admarvelad, map, backgroundColor, textFontColor);
          goto _L3
_L8:
        try
        {
            s = findViewWithTag("PENDING");
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Logging.log(Log.getStackTraceString(map));
            listenerImpl.onFailedToReceiveAd(getContext(), this, 304, Utils.getErrorReason(304), admarvelad.getSiteId(), admarvelad.getId(), admarvelad.getTargetParams(), admarvelad.getIpAddress());
            return;
        }
        if (s != null) goto _L5; else goto _L4
_L4:
        map.setTag("PENDING");
        if (!admarvelad.isMustBeVisible()) goto _L7; else goto _L6
_L6:
        map.setVisibility(0);
_L9:
        removeAllViews();
        addView(map);
        return;
_L2:
        map = s.requestNewAd(internalAdMarvelAdapterListener, context, admarvelad, map, backgroundColor, textFontColor);
        continue; /* Loop/switch isn't completed */
_L5:
        removeView(s);
          goto _L8
_L7:
        map.setVisibility(8);
          goto _L9
_L3:
        if (map == null) goto _L10; else goto _L8
_L10:
    }

    public void setAdMarvelBackgroundColor(int i)
    {
        if (i == 0)
        {
            backgroundColor = 0;
        } else
        {
            backgroundColor = 0xff000000 | i;
        }
        setBackgroundColor(backgroundColor);
    }

    public void setAdmarvelWebViewAsSoftwareLayer(boolean flag)
    {
        setSoftwareLayer = flag;
    }

    public void setDisableAnimation(boolean flag)
    {
        disableAnimation = flag;
    }

    public void setDisableSDKImpressionTracking(boolean flag)
    {
        disableSDKImpressionTracking = flag;
    }

    public void setEnableAutoScaling(boolean flag)
    {
        enableAutoScaling = flag;
    }

    public void setEnableClickRedirect(boolean flag)
    {
        enableClickRedirect = flag;
    }

    public void setListener(AdMarvelViewListener admarvelviewlistener)
    {
        listenerImpl.setListener(admarvelviewlistener);
    }

    public void setOptionalFlags(Map map)
    {
        optionalFlags = map;
        String s = cachedDirectory;
        s;
        JVM INSTR monitorenter ;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        map = (String)map.get("cached_directory");
_L1:
        cachedDirectory = map;
        if (cachedDirectory != null && !rancleanup)
        {
            handler.post(new AdMarvelCachedCleanupAdAsyncTaskRunnable(getContext(), new File(cachedDirectory)));
            rancleanup = true;
        }
        s;
        JVM INSTR monitorexit ;
        return;
        map;
        s;
        JVM INSTR monitorexit ;
        throw map;
        map = null;
          goto _L1
    }

    public void setTextBackgroundColor(int i)
    {
        textBackgroundColor = 0xff000000 | i;
    }

    public void setTextBorderColor(int i)
    {
        textBorderColor = i;
    }

    public void setTextFontColor(int i)
    {
        textFontColor = 0xff000000 | i;
    }

    public void setVisibility(int i)
    {
        int j = i;
        if (i == 8)
        {
            j = 4;
        }
        super.setVisibility(j);
        requestLayout();
    }

    public void updateCurrentActivity(Activity activity)
    {
        if (activity != null)
        {
            activityReference = new WeakReference(activity);
        }
    }















}
