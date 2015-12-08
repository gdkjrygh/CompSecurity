// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.location.Location;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.admarvel.android.installtracker.AdMarvelInstallTracker;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            Version, AdMarvelAd, AdMarvelInterstitialAds, AdMarvelInterstitialAdListenerImpl, 
//            AdMarvelSensorManager, AdMarvelInternalWebView, AdMarvelInternalWebViewPrivateListener, WebViewResumePause, 
//            AdMarvelAnalyticsAdapterInstances, AdMarvelAnalyticsAdapter, WebViewResumePausePreAPI11, Utils, 
//            AdMarvelWebView, AdMarvelWebViewListener, AdMarvelVideoActivity, FullScreenControls, 
//            AdMarvelVideoView, AdMarvelLocationManager, AdMarvelConnectivityChangeReceiver

public class AdMarvelActivity extends Activity
{
    private static class AdMarvelActivityAsyncTask extends AsyncTask
    {

        private final WeakReference adMarvelActivityReference;
        private final AdMarvelAd adMarvelAd;

        protected transient Object doInBackground(Object aobj[])
        {
            if (adMarvelActivityReference != null)
            {
                aobj = (AdMarvelActivity)adMarvelActivityReference.get();
            } else
            {
                aobj = null;
            }
            if (aobj != null) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            if (((AdMarvelActivity) (aobj)).url == null || Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelsdk") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (!((AdMarvelActivity) (aobj)).interstitialClick || AdMarvelInterstitialAds.getListener() == null) goto _L4; else goto _L3
_L3:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((Context) (aobj)), Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelsdk", "", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelsdk"), ((Context) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L6:
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            Exception exception;
            return null;
_L4:
            if (AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID) == null) goto _L6; else goto _L5
_L5:
            AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelsdk", "", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelsdk"), ((Context) (aobj))));
              goto _L6
            if (((AdMarvelActivity) (aobj)).url == null || Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelinternal") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_341;
            }
            if (!((AdMarvelActivity) (aobj)).interstitialClick) goto _L8; else goto _L7
_L7:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((Context) (aobj)), Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelinternal", "", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelinternal"), ((Context) (aobj))), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L10:
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            return null;
_L8:
            if (AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID) == null) goto _L10; else goto _L9
_L9:
            AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelinternal", "", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelinternal"), ((Context) (aobj))));
              goto _L10
            if (((AdMarvelActivity) (aobj)).url == null || Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_519;
            }
            if (!((AdMarvelActivity) (aobj)).interstitialClick) goto _L12; else goto _L11
_L11:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((Context) (aobj)), ((AdMarvelActivity) (aobj)).url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L14:
            String s = Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelvideo", "http://", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelvideo"), ((Context) (aobj)));
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(0x10000000);
            intent2.setDataAndType(Uri.parse(s), "video/*");
            if (Utils.isIntentAvailable(((AdMarvelActivity) (aobj)).getBaseContext(), intent2))
            {
                ((AdMarvelActivity) (aobj)).startActivity(intent2);
            }
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            return null;
_L12:
            if (AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID) == null) goto _L14; else goto _L13
_L13:
            AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID).onClickAd(adMarvelAd, ((AdMarvelActivity) (aobj)).url);
              goto _L14
            if (((AdMarvelActivity) (aobj)).url == null || Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_725;
            }
            if (!((AdMarvelActivity) (aobj)).interstitialClick) goto _L16; else goto _L15
_L15:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(((Context) (aobj)), ((AdMarvelActivity) (aobj)).url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L18:
            Intent intent = new Intent(((Context) (aobj)), com/admarvel/android/ads/AdMarvelVideoActivity);
            intent.addFlags(0x10000000);
            intent.putExtra("url", ((AdMarvelActivity) (aobj)).url);
            intent.putExtra("isCustomUrl", true);
            intent.putExtra("xml", ((AdMarvelActivity) (aobj)).xml);
            intent.putExtra("source", ((AdMarvelActivity) (aobj)).source);
            intent.putExtra("GUID", ((AdMarvelActivity) (aobj)).GUID);
            ((AdMarvelActivity) (aobj)).startActivity(intent);
            (new Utils(((Context) (aobj)), ((AdMarvelActivity) (aobj)).handler)).registerTrackingEvent(((AdMarvelActivity) (aobj)).xml);
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            return null;
_L16:
            if (AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID) == null) goto _L18; else goto _L17
_L17:
            AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID).onClickAd(adMarvelAd, ((AdMarvelActivity) (aobj)).url);
              goto _L18
            if (((AdMarvelActivity) (aobj)).url == null || Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelexternal") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_841;
            }
            Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelexternal", "", Utils.isPrivateProtocol(((AdMarvelActivity) (aobj)).url, "admarvelexternal"), ((Context) (aobj)))));
            intent1.addFlags(0x10000000);
            if (Utils.isIntentAvailable(((AdMarvelActivity) (aobj)).getBaseContext(), intent1))
            {
                ((AdMarvelActivity) (aobj)).startActivity(intent1);
            }
            if (((AdMarvelActivity) (aobj)).xml != null)
            {
                (new Utils(((Context) (aobj)), ((AdMarvelActivity) (aobj)).handler)).registerTrackingEvent(((AdMarvelActivity) (aobj)).xml);
            }
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            return null;
            if (!Utils.handledBySpecialIntents(((Context) (aobj)), ((AdMarvelActivity) (aobj)).url))
            {
                break MISSING_BLOCK_LABEL_912;
            }
            (new Utils(((Context) (aobj)), ((AdMarvelActivity) (aobj)).handler)).registerTrackingEvent(((AdMarvelActivity) (aobj)).xml);
            ((AdMarvelActivity) (aobj)).closehandler.sendEmptyMessage(0);
            if (AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID) == null) goto _L1; else goto _L19
_L19:
            AdMarvelWebView.getListener(((AdMarvelActivity) (aobj)).GUID).onClickAd(adMarvelAd, ((AdMarvelActivity) (aobj)).url);
            return null;
            try
            {
                ((AdMarvelActivity) (aobj)).inappbrowserhandler.sendEmptyMessage(0);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
                ((AdMarvelActivity) (aobj)).finish();
                return null;
            }
            return null;
        }

        public AdMarvelActivityAsyncTask(AdMarvelActivity admarvelactivity, AdMarvelAd admarvelad)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelAd = admarvelad;
        }
    }

    private static class AdMarvelActivityInternalListener
        implements AdMarvelInternalWebViewPrivateListener
    {

        private final WeakReference adMarvelActivityReference;

        public void onCloseInAppBrowser(String s)
        {
            Object obj = (AdMarvelActivity)adMarvelActivityReference.get();
            if (obj != null)
            {
                if ((obj = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)) != null && ((s = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(s))).append("WEBVIEW").toString())) != null && !s.isSignalShutdown() && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback.length() > 0))
                {
                    s.loadUrl((new StringBuilder("javascript:")).append(((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback).append("()").toString());
                    return;
                }
            }
        }

        public void onCloseTwoPartExpand()
        {
            Logging.log("AdMarvelActivity: Closing two part expand");
        }

        public AdMarvelActivityInternalListener(AdMarvelActivity admarvelactivity)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
        }
    }

    static class AdMarvelProgressDialog extends ProgressDialog
    {

        private static AdMarvelProgressDialog dialog = null;
        private WeakReference adMarvelActivityReference;
        private boolean signalShutdown;

        public static void destroyInstance()
        {
            if (dialog != null && dialog.isShowing())
            {
                dialog.dismiss();
            }
            dialog = null;
        }

        static AdMarvelProgressDialog getInstance()
        {
            return dialog;
        }

        static AdMarvelProgressDialog newInstance(AdMarvelActivity admarvelactivity)
        {
            com/admarvel/android/ads/AdMarvelActivity$AdMarvelProgressDialog;
            JVM INSTR monitorenter ;
            if (dialog != null) goto _L2; else goto _L1
_L1:
            dialog = new AdMarvelProgressDialog(admarvelactivity);
            dialog.signalShutdown = false;
            dialog.adMarvelActivityReference = new WeakReference(admarvelactivity);
            admarvelactivity = dialog;
_L4:
            com/admarvel/android/ads/AdMarvelActivity$AdMarvelProgressDialog;
            JVM INSTR monitorexit ;
            return admarvelactivity;
_L2:
            admarvelactivity = dialog;
            if (true) goto _L4; else goto _L3
_L3:
            admarvelactivity;
            throw admarvelactivity;
        }

        protected void onStop()
        {
            super.onStop();
            Object obj;
            if (adMarvelActivityReference != null)
            {
                obj = (AdMarvelActivity)adMarvelActivityReference.get();
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                obj.isBackPressDisabled = false;
                RelativeLayout relativelayout = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
                if (relativelayout != null)
                {
                    FullScreenControls fullscreencontrols = (FullScreenControls)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("CONTROLS").toString());
                    obj = (AdMarvelInternalWebView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("WEBVIEW").toString());
                    if (!signalShutdown)
                    {
                        if (fullscreencontrols != null && obj != null)
                        {
                            ((AdMarvelInternalWebView) (obj)).clearHistory();
                            ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                            fullscreencontrols.setVisibility(0);
                            relativelayout.requestLayout();
                            return;
                        }
                    } else
                    {
                        if (obj != null)
                        {
                            ((AdMarvelInternalWebView) (obj)).stopLoading();
                            ((AdMarvelInternalWebView) (obj)).signalShutdown();
                            ((AdMarvelInternalWebView) (obj)).setVisibility(8);
                        }
                        if (fullscreencontrols != null)
                        {
                            fullscreencontrols.setVisibility(8);
                        }
                        relativelayout.requestLayout();
                        return;
                    }
                }
            }
        }

        public void signalShutdown()
        {
            signalShutdown = true;
        }


        private AdMarvelProgressDialog(Context context)
        {
            super(context);
        }
    }

    public static class AdMarvelProgressDialogFragment extends DialogFragment
    {

        boolean signalShutdown;

        static AdMarvelProgressDialogFragment newInstance(AdMarvelActivity admarvelactivity)
        {
            admarvelactivity = new AdMarvelProgressDialogFragment();
            admarvelactivity.signalShutdown = false;
            return admarvelactivity;
        }

        public void onCreate(Bundle bundle)
        {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = (AdMarvelActivity)getActivity();
            AdMarvelProgressDialog admarvelprogressdialog = AdMarvelProgressDialog.newInstance((AdMarvelActivity)getActivity());
            admarvelprogressdialog.setIcon(0);
            admarvelprogressdialog.setTitle("Loading...");
            admarvelprogressdialog.setProgressStyle(1);
            admarvelprogressdialog.setMax(100);
            ShapeDrawable shapedrawable = new ShapeDrawable();
            shapedrawable.getPaint().setColor(Color.parseColor("#33B5E5"));
            admarvelprogressdialog.setProgressDrawable(new ClipDrawable(shapedrawable, 3, 1));
            bundle.progressDialogReference = new WeakReference(admarvelprogressdialog);
            if (((AdMarvelActivity) (bundle)).interstitial)
            {
                admarvelprogressdialog.setCancelable(false);
                bundle.isBackPressDisabled = true;
                ((AdMarvelActivity) (bundle)).handler.postDelayed(((AdMarvelActivity) (bundle)).disableBackPressRunnable, 5000L);
            }
            return admarvelprogressdialog;
        }

        public void onStop()
        {
            RelativeLayout relativelayout;
            FullScreenControls fullscreencontrols;
            Object obj;
label0:
            {
                super.onStop();
                obj = (AdMarvelActivity)getActivity();
                obj.isBackPressDisabled = false;
                relativelayout = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
                if (relativelayout != null)
                {
                    fullscreencontrols = (FullScreenControls)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("CONTROLS").toString());
                    obj = (AdMarvelInternalWebView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("WEBVIEW").toString());
                    if (signalShutdown)
                    {
                        break label0;
                    }
                    if (fullscreencontrols != null && obj != null)
                    {
                        ((AdMarvelInternalWebView) (obj)).clearHistory();
                        ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                        fullscreencontrols.setVisibility(0);
                        relativelayout.requestLayout();
                    }
                }
                return;
            }
            if (obj != null)
            {
                ((AdMarvelInternalWebView) (obj)).stopLoading();
                ((AdMarvelInternalWebView) (obj)).signalShutdown();
                ((AdMarvelInternalWebView) (obj)).setVisibility(8);
            }
            if (fullscreencontrols != null)
            {
                fullscreencontrols.setVisibility(8);
            }
            relativelayout.requestLayout();
        }

        public void signalShutdown()
        {
            signalShutdown = true;
        }

        public AdMarvelProgressDialogFragment()
        {
        }
    }

    static class BrightRollInnerInterstitialJS
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private String videoUrl;

        public void browseTo(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(s));
                    if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent))
                    {
                        admarvelactivity.startActivity(intent);
                    }
                    finish();
                    return;
                }
            }
        }

        public void cleanup()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    CleanUpBrightRollVideo cleanupbrightrollvideo = new CleanUpBrightRollVideo(admarvelactivity);
                    admarvelactivity.handler.post(cleanupbrightrollvideo);
                    return;
                }
            }
        }

        public void didPixel(String s)
        {
        }

        public void finish()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.closehandler.sendEmptyMessage(0);
                    return;
                }
            }
        }

        public void hide()
        {
            didPixel("Hide");
            finish();
        }

        public void load()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
                {
                    ((AdMarvelInternalWebView) (obj)).disableCloseButton(true);
                    if (videoUrl != null && videoUrl.length() > 0)
                    {
                        obj = new LoadBrightRollVideo(videoUrl, admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                        admarvelactivity.handler.post(((Runnable) (obj)));
                        admarvelactivity.isAdMarvelVideo = false;
                        return;
                    }
                }
            }
        }

        public void onBackPressed()
        {
            finish();
        }

        public void play()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new PlayBrightRollVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void positionVideo(float f, float f1, float f2, float f3)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new PositionBrightRollVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)), f, f1, f2, f3);
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void seekTo(float f)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !((AdMarvelInternalWebView) (obj)).isSignalShutdown() && videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new SeekToBrightRollVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)), f);
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void setVideoUrl(String s)
        {
            videoUrl = s;
        }

        boolean videoIsLoaded()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            if (admarvelactivity == null)
            {
                return false;
            }
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown())
            {
                return false;
            }
            return admarvelactivity.brightRollVideoTimer != null;
        }

        public BrightRollInnerInterstitialJS(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelActivityReference = new WeakReference(admarvelactivity);
        }
    }

    private static class Buffer
    {

        public byte buffer[];
        public int bytes;

        private Buffer()
        {
            buffer = null;
            bytes = 0;
        }
    }

    private static class CheckNetworkAvailableRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final String mCallback;

        public void run()
        {
            Object obj;
            try
            {
                obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
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
            if (Utils.isNetworkAvailable(((AdMarvelInternalWebView) (obj)).getContext()))
            {
                ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
                return;
            }
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            return;
        }

        public CheckNetworkAvailableRunnable(AdMarvelInternalWebView admarvelinternalwebview, String s)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            mCallback = s;
        }
    }

    private static class CleanUpBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;

        public void run()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            if (admarvelactivity == null)
            {
                return;
            }
            RelativeLayout relativelayout;
            AdMarvelVideoView admarvelvideoview;
            admarvelactivity.isBrightRollVideoLoaded = false;
            relativelayout = (RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            admarvelvideoview = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(admarvelactivity.GUID))).append("BR_VIDEO").toString());
            if (admarvelvideoview == null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            admarvelvideoview.stopPlayback();
            relativelayout.removeView(admarvelvideoview);
            if (admarvelactivity.brightRollVideoTimer != null)
            {
                admarvelactivity.handler.removeCallbacks(admarvelactivity.brightRollVideoTimer);
                admarvelactivity.brightRollVideoTimer = null;
                return;
            }
            break MISSING_BLOCK_LABEL_107;
            Exception exception;
            exception;
            Logging.log(Log.getStackTraceString(exception));
        }

        public CleanUpBrightRollVideo(AdMarvelActivity admarvelactivity)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
        }
    }

    private static class CreateEventRunnable
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        Long endDate;
        SimpleDateFormat format;
        String mAllDay;
        String mCallback;
        String mDescription;
        String mLocation;
        int mReminder;
        String mTiltle;
        String mTimeZone;
        Long startDate;

        String getCalendarBaseURI()
        {
            if (Version.getAndroidSDKVersion() >= 8)
            {
                return "content://com.android.calendar/";
            } else
            {
                return "content://calendar/";
            }
        }

        public void run()
        {
            Object obj;
            Cursor cursor;
            AdMarvelInternalWebView admarvelinternalwebview;
            Cursor cursor1;
            cursor = null;
            cursor1 = null;
            if (adMarvelActivityReference != null)
            {
                obj = (AdMarvelActivity)adMarvelActivityReference.get();
            } else
            {
                obj = null;
            }
            if (adMarvelInternalWebViewReference != null)
            {
                admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            } else
            {
                admarvelinternalwebview = null;
            }
            if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            ContentResolver contentresolver;
            contentresolver = ((AdMarvelActivity) (obj)).getContentResolver();
            obj = cursor1;
            cursor1 = contentresolver.query(Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("calendars").toString()), new String[] {
                "_id", "displayname"
            }, null, null, null);
            if (cursor1 == null) goto _L4; else goto _L3
_L3:
            obj = cursor1;
            cursor = cursor1;
            if (!cursor1.moveToFirst()) goto _L4; else goto _L5
_L5:
            obj = cursor1;
            cursor = cursor1;
            Object obj2 = new String[cursor1.getCount()];
            obj = cursor1;
            cursor = cursor1;
            Object obj1 = new int[cursor1.getCount()];
            int i = 0;
_L12:
            obj = cursor1;
            cursor = cursor1;
            if (i < obj2.length) goto _L7; else goto _L6
_L6:
            obj = cursor1;
            cursor = cursor1;
            obj2 = new ContentValues();
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("calendar_id", Integer.valueOf(obj1[0]));
            obj = cursor1;
            cursor = cursor1;
            if (mTiltle == null)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("title", mTiltle);
            obj = cursor1;
            cursor = cursor1;
            if (mDescription == null)
            {
                break MISSING_BLOCK_LABEL_286;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("description", mDescription);
            obj = cursor1;
            cursor = cursor1;
            if (mLocation == null)
            {
                break MISSING_BLOCK_LABEL_316;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("eventLocation", mLocation);
            obj = cursor1;
            cursor = cursor1;
            if (startDate == null)
            {
                break MISSING_BLOCK_LABEL_346;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("dtstart", startDate);
            obj = cursor1;
            cursor = cursor1;
            if (endDate == null)
            {
                break MISSING_BLOCK_LABEL_376;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("dtend", endDate);
            obj = cursor1;
            cursor = cursor1;
            if (mAllDay == null)
            {
                break MISSING_BLOCK_LABEL_448;
            }
            obj = cursor1;
            cursor = cursor1;
            if (mAllDay.toLowerCase().equals("true"))
            {
                break MISSING_BLOCK_LABEL_431;
            }
            obj = cursor1;
            cursor = cursor1;
            if (!mAllDay.toLowerCase().equals("yes"))
            {
                break MISSING_BLOCK_LABEL_448;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("allDay", Integer.valueOf(1));
            obj = cursor1;
            cursor = cursor1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_478;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("hasAlarm", Integer.valueOf(1));
            obj = cursor1;
            cursor = cursor1;
            if (mTimeZone == null)
            {
                break MISSING_BLOCK_LABEL_524;
            }
            obj = cursor1;
            cursor = cursor1;
            if (mTimeZone.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_524;
            }
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj2)).put("eventTimezone", mTimeZone);
            obj = cursor1;
            cursor = cursor1;
            Object obj3 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("events").toString());
            obj = cursor1;
            cursor = cursor1;
            obj1 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("reminders").toString());
            obj = cursor1;
            cursor = cursor1;
            obj2 = contentresolver.insert(((Uri) (obj3)), ((ContentValues) (obj2)));
            if (obj2 == null) goto _L9; else goto _L8
_L8:
            obj = cursor1;
            cursor = cursor1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_720;
            }
            obj = cursor1;
            cursor = cursor1;
            obj3 = new ContentValues();
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj3)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj2)).getLastPathSegment())));
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj3)).put("method", Integer.valueOf(1));
            obj = cursor1;
            cursor = cursor1;
            ((ContentValues) (obj3)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
            obj = cursor1;
            cursor = cursor1;
            contentresolver.insert(((Uri) (obj1)), ((ContentValues) (obj3)));
            obj = cursor1;
            cursor = cursor1;
            if (mCallback == null) goto _L4; else goto _L10
_L10:
            obj = cursor1;
            cursor = cursor1;
            if (mCallback.length() <= 0) goto _L4; else goto _L11
_L11:
            obj = cursor1;
            cursor = cursor1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L4:
            if (cursor1 != null)
            {
                cursor1.close();
                return;
            }
              goto _L1
_L7:
            obj = cursor1;
            cursor = cursor1;
            obj1[i] = cursor1.getInt(0);
            obj = cursor1;
            cursor = cursor1;
            obj2[i] = cursor1.getString(1);
            obj = cursor1;
            cursor = cursor1;
            cursor1.moveToNext();
            i++;
              goto _L12
_L9:
            obj = cursor1;
            cursor = cursor1;
            if (mCallback == null) goto _L4; else goto _L13
_L13:
            obj = cursor1;
            cursor = cursor1;
            if (mCallback.length() <= 0) goto _L4; else goto _L14
_L14:
            obj = cursor1;
            cursor = cursor1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L4
            Exception exception1;
            exception1;
            cursor = ((Cursor) (obj));
            if (mCallback == null)
            {
                break MISSING_BLOCK_LABEL_978;
            }
            cursor = ((Cursor) (obj));
            if (mCallback.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_978;
            }
            cursor = ((Cursor) (obj));
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            cursor = ((Cursor) (obj));
            exception1.printStackTrace();
            if (obj == null) goto _L1; else goto _L15
_L15:
            ((Cursor) (obj)).close();
            return;
            Exception exception;
            exception;
            if (cursor != null)
            {
                cursor.close();
            }
            throw exception;
        }

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            startDate = Long.valueOf(format.parse(s).getTime());
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
            mTiltle = s1;
            mDescription = s2;
            return;
            admarvelinternalwebview;
            admarvelinternalwebview.printStackTrace();
            return;
        }

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
                String s5, int i)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            startDate = Long.valueOf(format.parse(s).getTime());
            if (s5 == null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            endDate = Long.valueOf(format.parse(s5).getTime());
_L1:
            mTiltle = s1;
            mDescription = s2;
            mLocation = s3;
            mAllDay = s4;
            if (i <= 0)
            {
                try
                {
                    mReminder = i / 60;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdMarvelInternalWebView admarvelinternalwebview)
                {
                    admarvelinternalwebview.printStackTrace();
                }
            }
            break MISSING_BLOCK_LABEL_171;
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
              goto _L1
        }

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
                String s5, int i, String s6, String s7, String s8, String s9, int j, 
                int k, String s10)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s != null)
            {
                try
                {
                    startDate = Long.valueOf(format.parse(s).getTime());
                }
                // Misplaced declaration of an exception variable
                catch (AdMarvelInternalWebView admarvelinternalwebview)
                {
                    admarvelinternalwebview.printStackTrace();
                    return;
                }
            }
            if (s5 == null)
            {
                break MISSING_BLOCK_LABEL_166;
            }
            endDate = Long.valueOf(format.parse(s5).getTime());
_L1:
            mTiltle = s1;
            mDescription = s2;
            mLocation = s3;
            mAllDay = s4;
            if (i > 0)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            mReminder = i / 60;
            if (s6 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            if (s6.length() > 0)
            {
                mTimeZone = s6;
            }
            mCallback = s10;
            return;
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
              goto _L1
        }
    }

    private static class CreateEventRunnablePostAPI14
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        Long endDate;
        SimpleDateFormat format;
        String mAllDay;
        int mAvailability;
        String mCallback;
        String mDescription;
        String mExceptionDates;
        String mLocation;
        String mRecurrenceRule;
        int mReminder;
        int mStatus;
        String mTiltle;
        String mTimeZone;
        Long startDate;

        public void run()
        {
            Object obj;
            Object obj1;
            AdMarvelInternalWebView admarvelinternalwebview;
            Object obj2;
            obj1 = null;
            obj2 = null;
            if (adMarvelActivityReference != null)
            {
                obj = (AdMarvelActivity)adMarvelActivityReference.get();
            } else
            {
                obj = null;
            }
            if (adMarvelInternalWebViewReference != null)
            {
                admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            } else
            {
                admarvelinternalwebview = null;
            }
            if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            ContentResolver contentresolver;
            contentresolver = ((AdMarvelActivity) (obj)).getContentResolver();
            obj = obj2;
            obj2 = contentresolver.query(android.provider.CalendarContract.Calendars.CONTENT_URI, new String[] {
                "_id", "calendar_displayName"
            }, null, null, null);
            if (obj2 == null) goto _L4; else goto _L3
_L3:
            obj = obj2;
            obj1 = obj2;
            if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L5
_L5:
            obj = obj2;
            obj1 = obj2;
            Object obj4 = new String[((Cursor) (obj2)).getCount()];
            obj = obj2;
            obj1 = obj2;
            Object obj3 = new int[((Cursor) (obj2)).getCount()];
            int i = 0;
_L13:
            obj = obj2;
            obj1 = obj2;
            if (i < obj4.length) goto _L7; else goto _L6
_L6:
            obj = obj2;
            obj1 = obj2;
            obj4 = new ContentValues();
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("calendar_id", Integer.valueOf(obj3[0]));
            obj = obj2;
            obj1 = obj2;
            if (mTiltle == null)
            {
                break MISSING_BLOCK_LABEL_234;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("title", mTiltle);
            obj = obj2;
            obj1 = obj2;
            if (mDescription == null)
            {
                break MISSING_BLOCK_LABEL_264;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("description", mDescription);
            obj = obj2;
            obj1 = obj2;
            if (mLocation == null)
            {
                break MISSING_BLOCK_LABEL_294;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("eventLocation", mLocation);
            obj = obj2;
            obj1 = obj2;
            if (startDate == null)
            {
                break MISSING_BLOCK_LABEL_324;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("dtstart", startDate);
            obj = obj2;
            obj1 = obj2;
            if (endDate == null)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("dtend", endDate);
            obj = obj2;
            obj1 = obj2;
            if (mAllDay == null)
            {
                break MISSING_BLOCK_LABEL_426;
            }
            obj = obj2;
            obj1 = obj2;
            if (mAllDay.toLowerCase().equals("true"))
            {
                break MISSING_BLOCK_LABEL_409;
            }
            obj = obj2;
            obj1 = obj2;
            if (!mAllDay.toLowerCase().equals("yes"))
            {
                break MISSING_BLOCK_LABEL_426;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("allDay", Integer.valueOf(1));
            obj = obj2;
            obj1 = obj2;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_456;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("hasAlarm", Integer.valueOf(1));
            obj = obj2;
            obj1 = obj2;
            if (mTimeZone == null) goto _L9; else goto _L8
_L8:
            obj = obj2;
            obj1 = obj2;
            if (mTimeZone.length() <= 0) goto _L9; else goto _L10
_L10:
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("eventTimezone", mTimeZone);
_L14:
            obj = obj2;
            obj1 = obj2;
            if (mRecurrenceRule == null)
            {
                break MISSING_BLOCK_LABEL_548;
            }
            obj = obj2;
            obj1 = obj2;
            if (mRecurrenceRule.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_548;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("rrule", mRecurrenceRule);
            obj = obj2;
            obj1 = obj2;
            if (mExceptionDates == null)
            {
                break MISSING_BLOCK_LABEL_594;
            }
            obj = obj2;
            obj1 = obj2;
            if (mExceptionDates.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_594;
            }
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("exdate", mExceptionDates);
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("eventStatus", Integer.valueOf(mStatus));
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("availability", Integer.valueOf(mAvailability));
            obj = obj2;
            obj1 = obj2;
            obj3 = contentresolver.insert(android.provider.CalendarContract.Events.CONTENT_URI, ((ContentValues) (obj4)));
            if (obj3 == null) goto _L12; else goto _L11
_L11:
            obj = obj2;
            obj1 = obj2;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_766;
            }
            obj = obj2;
            obj1 = obj2;
            obj4 = new ContentValues();
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj3)).getLastPathSegment())));
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("method", Integer.valueOf(1));
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
            obj = obj2;
            obj1 = obj2;
            contentresolver.insert(android.provider.CalendarContract.Reminders.CONTENT_URI, ((ContentValues) (obj4)));
            obj = obj2;
            obj1 = obj2;
            if (mCallback == null)
            {
                break MISSING_BLOCK_LABEL_831;
            }
            obj = obj2;
            obj1 = obj2;
            if (mCallback.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_831;
            }
            obj = obj2;
            obj1 = obj2;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L17:
            if (obj2 != null)
            {
                ((Cursor) (obj2)).close();
                return;
            }
              goto _L1
_L7:
            obj = obj2;
            obj1 = obj2;
            obj3[i] = ((Cursor) (obj2)).getInt(0);
            obj = obj2;
            obj1 = obj2;
            obj4[i] = ((Cursor) (obj2)).getString(1);
            obj = obj2;
            obj1 = obj2;
            ((Cursor) (obj2)).moveToNext();
            i++;
              goto _L13
_L9:
            obj = obj2;
            obj1 = obj2;
            ((ContentValues) (obj4)).put("eventTimezone", TimeZone.getDefault().getID());
              goto _L14
            obj2;
            obj1 = obj;
            ((Exception) (obj2)).printStackTrace();
            obj1 = obj;
            if (mCallback == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = obj;
            if (mCallback.length() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = obj;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            if (obj == null) goto _L1; else goto _L15
_L15:
            ((Cursor) (obj)).close();
            return;
_L12:
            obj = obj2;
            obj1 = obj2;
            if (mCallback == null) goto _L17; else goto _L16
_L16:
            obj = obj2;
            obj1 = obj2;
            if (mCallback.length() <= 0) goto _L17; else goto _L18
_L18:
            obj = obj2;
            obj1 = obj2;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L17
            obj;
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
            }
            throw obj;
_L4:
            obj = obj2;
            obj1 = obj2;
            if (mCallback == null) goto _L17; else goto _L19
_L19:
            obj = obj2;
            obj1 = obj2;
            if (mCallback.length() <= 0) goto _L17; else goto _L20
_L20:
            obj = obj2;
            obj1 = obj2;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L17
        }

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            startDate = Long.valueOf(format.parse(s).getTime());
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
            mTiltle = s1;
            mDescription = s2;
            return;
            admarvelinternalwebview;
            admarvelinternalwebview.printStackTrace();
            return;
        }

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
                String s5, int i)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            startDate = Long.valueOf(format.parse(s).getTime());
            if (s5 == null)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            endDate = Long.valueOf(format.parse(s5).getTime());
_L1:
            mTiltle = s1;
            mDescription = s2;
            mLocation = s3;
            mAllDay = s4;
            if (i <= 0)
            {
                try
                {
                    mReminder = i / 60;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdMarvelInternalWebView admarvelinternalwebview)
                {
                    admarvelinternalwebview.printStackTrace();
                }
            }
            break MISSING_BLOCK_LABEL_181;
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
              goto _L1
        }

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
                String s5, int i, String s6, String s7, String s8, String s9, int j, 
                int k, String s10)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            startDate = Long.valueOf(format.parse(s).getTime());
            if (s5 == null) goto _L2; else goto _L1
_L1:
            endDate = Long.valueOf(format.parse(s5).getTime());
_L11:
            mTiltle = s1;
            mDescription = s2;
            mLocation = s3;
            mAllDay = s4;
            if (i > 0)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            mReminder = i / 60;
            if (s6 == null) goto _L4; else goto _L3
_L3:
            i = s6.length();
            if (i <= 0) goto _L4; else goto _L5
_L5:
            boolean flag = false;
            admarvelinternalwebview = s6.split(":");
            if (admarvelinternalwebview.length != 2) goto _L7; else goto _L6
_L6:
            if (!admarvelinternalwebview[0].startsWith("+")) goto _L9; else goto _L8
_L8:
            i = Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60 + Integer.parseInt(admarvelinternalwebview[1]);
_L13:
            admarvelinternalwebview = TimeZone.getAvailableIDs(i * 60 * 1000);
            if (admarvelinternalwebview == null) goto _L4; else goto _L10
_L10:
            if (admarvelinternalwebview.length > 0)
            {
                mTimeZone = admarvelinternalwebview[0];
            }
              goto _L4
_L2:
            endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
              goto _L11
_L4:
            try
            {
                mRecurrenceRule = s8;
                mExceptionDates = s9;
                mCallback = s10;
                mStatus = j;
                mAvailability = k;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AdMarvelInternalWebView admarvelinternalwebview)
            {
                admarvelinternalwebview.printStackTrace();
            }
            return;
_L9:
            i = ((flag) ? 1 : 0);
            if (!admarvelinternalwebview[0].startsWith("-")) goto _L13; else goto _L12
_L12:
            i = (Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60 + Integer.parseInt(admarvelinternalwebview[1])) * -1;
              goto _L13
_L7:
            i = ((flag) ? 1 : 0);
            if (admarvelinternalwebview.length != 1) goto _L13; else goto _L14
_L14:
            if (!admarvelinternalwebview[0].startsWith("+"))
            {
                break MISSING_BLOCK_LABEL_389;
            }
            i = Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60;
              goto _L13
            i = ((flag) ? 1 : 0);
            if (!admarvelinternalwebview[0].startsWith("-")) goto _L13; else goto _L15
_L15:
            i = Integer.parseInt(admarvelinternalwebview[0].substring(1));
            i = i * 60 * -1;
              goto _L13
            admarvelinternalwebview;
            admarvelinternalwebview.printStackTrace();
              goto _L4
        }
    }

    private class ExecuteAdMarvelActivityAsyncTaskPostAPI11
        implements Runnable
    {

        private final AdMarvelAd adMarvelAd;
        final AdMarvelActivity this$0;

        public void run()
        {
            try
            {
                (new AdMarvelActivityAsyncTask(AdMarvelActivity.this, adMarvelAd)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                return;
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
            closehandler.sendEmptyMessage(0);
        }

        public ExecuteAdMarvelActivityAsyncTaskPostAPI11(AdMarvelAd admarvelad)
        {
            this$0 = AdMarvelActivity.this;
            super();
            adMarvelAd = admarvelad;
        }
    }

    private class ExecuteOnStopRunnablePostAPI7
        implements Runnable
    {

        final AdMarvelActivity this$0;

        public void run()
        {
            Object obj = (PowerManager)getSystemService("power");
            if (isFinishing() || obj == null)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (!((PowerManager) (obj)).isScreenOn())
            {
                break MISSING_BLOCK_LABEL_329;
            }
            obj = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            AdMarvelInternalWebView admarvelinternalwebview;
            try
            {
                admarvelinternalwebview = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
                closehandler.sendEmptyMessage(0);
                return;
            }
            if (admarvelinternalwebview == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            if (!admarvelinternalwebview.isSignalShutdown() && admarvelinternalwebview.visibilityCallback != null && admarvelinternalwebview.visibilityCallback.length() > 0 && admarvelinternalwebview.isViewDisplayed)
            {
                admarvelinternalwebview.injectJavaScript((new StringBuilder(String.valueOf(admarvelinternalwebview.visibilityCallback))).append("(").append(false).append(")").toString());
                admarvelinternalwebview.isViewDisplayed = false;
            }
            if (!isAdMarvelVideo || (AdMarvelVideoView)((RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BR_VIDEO").toString()) == null || !quitVideoWhenBackgrounded)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (interstitialCloseCallback == null || interstitialCloseCallback.length() <= 0 || obj == null)
            {
                break MISSING_BLOCK_LABEL_322;
            }
            obj = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_322;
            }
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(interstitialCloseCallback).append("()").toString());
            closeActivity();
        }

        private ExecuteOnStopRunnablePostAPI7()
        {
            this$0 = AdMarvelActivity.this;
            super();
        }

        ExecuteOnStopRunnablePostAPI7(ExecuteOnStopRunnablePostAPI7 executeonstoprunnablepostapi7)
        {
            this();
        }
    }

    private static class FirePixelRunnable
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private final String pixelUrl;

        public void run()
        {
            Object obj;
            try
            {
                if ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get() == null)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            obj = (AdMarvelActivity)adMarvelActivityReference.get();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            if (pixelUrl == null || pixelUrl.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            if (AdMarvelInterstitialAds.enableOfflineSDK)
            {
                (new AdmarvelOfflineUtils()).firePixel(pixelUrl, ((Context) (obj)), ((AdMarvelActivity) (obj)).handler);
                return;
            }
            (new Utils(((Context) (obj)), ((AdMarvelActivity) (obj)).handler)).firePixel(pixelUrl);
        }

        public FirePixelRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            pixelUrl = s;
        }
    }

    private static class GetLocationRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private String mLocationResult;
        private final String mcallback;

        public void run()
        {
            Object obj;
            try
            {
                obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
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
            if (!Utils.isPermissionGranted(((AdMarvelInternalWebView) (obj)).getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(((AdMarvelInternalWebView) (obj)).getContext(), "android.permission.ACCESS_FINE_LOCATION"))
            {
                ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
                return;
            }
            Location location;
            if (!Utils.isFeatureSupported(((AdMarvelInternalWebView) (obj)).getContext(), "location"))
            {
                break MISSING_BLOCK_LABEL_199;
            }
            location = AdMarvelLocationManager.getInstance().getLocation(((AdMarvelInternalWebView) (obj)));
            if (location == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            mLocationResult = (new StringBuilder(String.valueOf(location.getLatitude()))).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).toString();
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
        }

        public GetLocationRunnable(AdMarvelInternalWebView admarvelinternalwebview, String s)
        {
            mLocationResult = "null";
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            mcallback = s;
        }
    }

    private static class GetOrientation
        implements Runnable
    {

        private static int currentOrientaion = 0x80000000;
        private final WeakReference activityReference;

        private int getCurrentOriention()
        {
            return currentOrientaion;
        }

        public void run()
        {
            try
            {
                if (activityReference.get() != null)
                {
                    currentOrientaion = ((WindowManager)((Activity)activityReference.get()).getSystemService("window")).getDefaultDisplay().getRotation();
                }
                return;
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
        }



        public GetOrientation(Activity activity)
        {
            activityReference = new WeakReference(activity);
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

    private static class InitAdMarvel
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private final String callback;

        public void run()
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
_L11:
            if (adMarvelActivityReference == null) goto _L4; else goto _L3
_L3:
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
              goto _L5
_L10:
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            String s2;
            int i;
            s2 = Utils.getDeviceConnectivitiy(admarvelactivity.getBaseContext());
            i = Utils.getScreenOrientation(admarvelactivity.getBaseContext());
            String s;
            Object obj1;
            String s1;
            Object obj2;
            ViewGroup viewgroup;
            String s3;
            boolean flag;
            if (i == 1)
            {
                i = 0;
            } else
            if (i == 2)
            {
                i = 90;
            } else
            {
                i = -1;
            }
            if (!s2.equals("wifi") && !s2.equals("mobile"))
            {
                s = "NO";
            } else
            {
                s = "YES";
            }
            if (!Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "location")) goto _L7; else goto _L6
_L6:
            obj1 = AdMarvelLocationManager.getInstance().getLocation(((AdMarvelInternalWebView) (obj)));
_L8:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_803;
            }
            obj1 = (new StringBuilder("{lat:")).append(((Location) (obj1)).getLatitude()).append(", lon:").append(((Location) (obj1)).getLongitude()).append(", acc:").append(((Location) (obj1)).getAccuracy()).append("}").toString();
_L12:
            if (admarvelactivity.isTwoPartExpandState)
            {
                s1 = "Expanded";
            } else
            {
                s1 = "Interstitial";
            }
            obj2 = (new StringBuilder("{screen: true, orientation: true, heading: ")).append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "compass")).append(", location : ");
            if (!Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.ACCESS_FINE_LOCATION"))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            obj2 = ((StringBuilder) (obj2)).append(flag).append(",shake: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "accelerometer")).append(",tilt: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "accelerometer")).append(", network: true, sms:").append(Utils.isTelephonySupported(admarvelactivity.getBaseContext())).append(", phone:").append(Utils.isTelephonySupported(admarvelactivity.getBaseContext())).append(", email:true,calendar:");
            if (Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.WRITE_CALENDAR"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj2 = ((StringBuilder) (obj2)).append(flag).append(", camera: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "camera")).append(",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}").toString();
            viewgroup = (ViewGroup)admarvelactivity.getWindow().findViewById(0x1020002);
            viewgroup.getWidth();
            s3 = Utils.getSupportedInterfaceOrientations(admarvelactivity);
            try
            {
                ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(callback).append("({x:").append(((AdMarvelInternalWebView) (obj)).getLeft()).append(",y:").append(((AdMarvelInternalWebView) (obj)).getTop()).append(",width:").append(((AdMarvelInternalWebView) (obj)).getWidth()).append(",height:").append(((AdMarvelInternalWebView) (obj)).getHeight()).append(",appX:").append(viewgroup.getLeft()).append(",appY:").append(viewgroup.getTop()).append(",appWidth:").append(viewgroup.getWidth()).append(",appHeight:").append(viewgroup.getHeight()).append(",orientation:").append(i).append(",networkType:").append("'").append(s2).append("'").append(",network:").append("'").append(s).append("'").append(",screenWidth:").append(Utils.getDeviceWidth(admarvelactivity.getBaseContext())).append(",screenHeight:").append(Utils.getDeviceHeight(admarvelactivity.getBaseContext())).append(",adType:").append("'").append(s1).append("'").append(",supportedFeatures:").append(((String) (obj2))).append(",sdkVersion:").append("'").append("2.4.2.1").append("'").append(",location:").append(((String) (obj1))).append(",applicationSupportedOrientations:").append("'").append(s3).append("'").append("})").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log((new StringBuilder(String.valueOf(((Exception) (obj)).getMessage()))).append(" Exception in InitAdMarvel ").toString());
            }
            return;
_L7:
            obj1 = null;
              goto _L8
_L5:
            if (admarvelactivity != null) goto _L10; else goto _L9
_L9:
            return;
_L2:
            obj = null;
              goto _L11
_L4:
            admarvelactivity = null;
              goto _L5
            obj1 = "null";
              goto _L12
        }

        public InitAdMarvel(String s, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity)
        {
            callback = s;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelActivityReference = new WeakReference(admarvelactivity);
        }
    }

    static class InnerInterstitialJS
    {

        private final WeakReference adMarvelActivityReference;
        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelInternalWebViewReference;
        private int lastOrientation;
        private String videoUrl;

        public void admarvelCheckFrameValues(String s)
        {
        }

        public void checkForApplicationSupportedOrientations(final String mCallback)
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            final AdMarvelInternalWebView adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (adMarvelInternalWebView == null || !adMarvelInternalWebView.isSignalShutdown()) goto _L3; else goto _L2
_L2:
            AdMarvelActivity admarvelactivity;
            return;
_L3:
            Object obj;
            HashMap hashmap;
            int i;
            int j;
            if ((admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get()) == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = Utils.getSupportedInterfaceOrientations(admarvelactivity).split(",");
            hashmap = new HashMap();
            hashmap.put("portrait", "NO");
            hashmap.put("landscapeLeft", "NO");
            hashmap.put("landscapeRight", "NO");
            hashmap.put("portraitUpsideDown", "NO");
            j = obj.length;
            i = 0;
_L5:
label0:
            {
                if (i < j)
                {
                    break label0;
                }
                obj = (new StringBuilder("\"{portrait:")).append((String)hashmap.get("portrait")).append(",").append("landscapeLeft:").append((String)hashmap.get("landscapeLeft")).append(",").append("landscapeRight:").append((String)hashmap.get("landscapeRight")).append(",").append("portraitUpsideDown:").append((String)hashmap.get("portraitUpsideDown")).append("}\"").toString();
                if (adMarvelInternalWebView != null && mCallback != null)
                {
                    admarvelactivity.handler.post(((_cls1) (obj)). new Runnable() {

                        final InnerInterstitialJS this$1;
                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                        private final String val$mCallback;
                        private final String val$supportedScreenOrientationParam;

                        public void run()
                        {
                            adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(").append(supportedScreenOrientationParam).append(")").toString());
                        }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                mCallback = s;
                supportedScreenOrientationParam = String.this;
                super();
            }
                    });
                    return;
                }
            }
            if (true) goto _L2; else goto _L4
_L4:
            String s = obj[i];
            if (s.equals("0"))
            {
                hashmap.put("portrait", "YES");
            } else
            if (s.equals("90"))
            {
                hashmap.put("landscapeLeft", "YES");
            } else
            if (s.equals("-90"))
            {
                hashmap.put("landscapeRight", "YES");
            } else
            if (s.equals("180"))
            {
                hashmap.put("portraitUpsideDown", "YES");
            }
            i++;
              goto _L5
            if (true) goto _L2; else goto _L6
_L6:
        }

        public void checkNetworkAvailable(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.handler.post(new CheckNetworkAvailableRunnable(admarvelinternalwebview, s));
                    return;
                }
            }
        }

        public void cleanup()
        {
            Logging.log("window.ADMARVEL.cleanup()");
            AdMarvelActivity admarvelactivity;
            for (admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get(); admarvelactivity == null || (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get() == null;)
            {
                return;
            }

            CleanUpBrightRollVideo cleanupbrightrollvideo = new CleanUpBrightRollVideo(admarvelactivity);
            admarvelactivity.handler.post(cleanupbrightrollvideo);
        }

        public void closeinterstitialad()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if (((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown()) && !admarvelactivity.isTwoPartExpandState)
                {
                    admarvelactivity.closehandler.sendEmptyMessage(0);
                    return;
                }
            }
        }

        public void createcalendarevent(final String date, final String title, String s)
        {
            final AdMarvelActivity adMarvelActivity = (AdMarvelActivity)adMarvelActivityReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelActivity != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown() && Utils.isPermissionGranted(adMarvelActivity, "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(adMarvelActivity, "android.permission.WRITE_CALENDAR"))
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelActivity);
                    builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", s. new android.content.DialogInterface.OnClickListener() {

                        final InnerInterstitialJS this$1;
                        private final AdMarvelActivity val$adMarvelActivity;
                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                        private final String val$date;
                        private final String val$description;
                        private final String val$title;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (Version.getAndroidSDKVersion() >= 14)
                            {
                                adMarvelActivity.handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelActivity, date, title, description));
                                return;
                            } else
                            {
                                adMarvelActivity.handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelActivity, date, title, description));
                                return;
                            }
                        }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = admarvelinternalwebview;
                date = s;
                title = s1;
                description = String.this;
                super();
            }
                    }).setNegativeButton("No", new android.content.DialogInterface.OnClickListener() {

                        final InnerInterstitialJS this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.cancel();
                        }

            
            {
                this$1 = InnerInterstitialJS.this;
                super();
            }
                    });
                    builder.create().show();
                    return;
                }
            }
        }

        public void createcalendarevent(final String date, final String title, final String description, final String location, final String allday, final String endDate, int i)
        {
            final AdMarvelActivity adMarvelActivity = (AdMarvelActivity)adMarvelActivityReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelActivity != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown() && Utils.isPermissionGranted(adMarvelActivity, "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(adMarvelActivity, "android.permission.WRITE_CALENDAR"))
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelActivity);
                    builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", i. new android.content.DialogInterface.OnClickListener() {

                        final InnerInterstitialJS this$1;
                        private final AdMarvelActivity val$adMarvelActivity;
                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                        private final String val$allday;
                        private final String val$date;
                        private final String val$description;
                        private final String val$endDate;
                        private final String val$location;
                        private final int val$reminderoffset;
                        private final String val$title;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (Version.getAndroidSDKVersion() >= 14)
                            {
                                adMarvelActivity.handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelActivity, date, title, description, location, allday, endDate, reminderoffset));
                                return;
                            } else
                            {
                                adMarvelActivity.handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelActivity, date, title, description, location, allday, endDate, reminderoffset));
                                return;
                            }
                        }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = admarvelinternalwebview;
                date = s;
                title = s1;
                description = s2;
                location = s3;
                allday = s4;
                endDate = s5;
                reminderoffset = I.this;
                super();
            }
                    }).setNegativeButton("No", new android.content.DialogInterface.OnClickListener() {

                        final InnerInterstitialJS this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.cancel();
                        }

            
            {
                this$1 = InnerInterstitialJS.this;
                super();
            }
                    });
                    builder.create().show();
                    return;
                }
            }
        }

        public void createcalendarevent(final String date, final String title, final String description, final String location, final String allday, final String endDate, final int reminderoffset, 
                final String timezone, final String url, final String recurrenceRules, final String exceptionDateString, final int status, final int availability, final String callback)
        {
            final AdMarvelActivity adMarvelActivity = (AdMarvelActivity)adMarvelActivityReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelActivity != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown())
                {
                    if (!Utils.isPermissionGranted(adMarvelActivity, "android.permission.READ_CALENDAR") || !Utils.isPermissionGranted(adMarvelActivity, "android.permission.WRITE_CALENDAR"))
                    {
                        if (callback != null)
                        {
                            adMarvelActivity.handler.post(callback. new Runnable() {

                                final InnerInterstitialJS this$1;
                                private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                private final String val$callback;

                                public void run()
                                {
                                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(NO)").toString());
                                }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelActivity);
                        builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", callback. new android.content.DialogInterface.OnClickListener() {

                            final InnerInterstitialJS this$1;
                            private final AdMarvelActivity val$adMarvelActivity;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$allday;
                            private final int val$availability;
                            private final String val$callback;
                            private final String val$date;
                            private final String val$description;
                            private final String val$endDate;
                            private final String val$exceptionDateString;
                            private final String val$location;
                            private final String val$recurrenceRules;
                            private final int val$reminderoffset;
                            private final int val$status;
                            private final String val$timezone;
                            private final String val$title;
                            private final String val$url;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (Version.getAndroidSDKVersion() >= 14)
                                {
                                    adMarvelActivity.handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelActivity, date, title, description, location, allday, endDate, reminderoffset, timezone, url, recurrenceRules, exceptionDateString, status, availability, callback));
                                    return;
                                } else
                                {
                                    adMarvelActivity.handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelActivity, date, title, description, location, allday, endDate, reminderoffset, timezone, url, recurrenceRules, exceptionDateString, status, availability, callback));
                                    return;
                                }
                            }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = admarvelinternalwebview;
                date = s;
                title = s1;
                description = s2;
                location = s3;
                allday = s4;
                endDate = s5;
                reminderoffset = i;
                timezone = s6;
                url = s7;
                recurrenceRules = s8;
                exceptionDateString = s9;
                status = j;
                availability = k;
                callback = String.this;
                super();
            }
                        }).setNegativeButton("No", adMarvelInternalWebView. new android.content.DialogInterface.OnClickListener() {

                            final InnerInterstitialJS this$1;
                            private final AdMarvelActivity val$adMarvelActivity;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$callback;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (callback != null)
                                {
                                    adMarvelActivity.handler.post(callback. new Runnable() {

                                        final InnerInterstitialJS._cls8 this$2;
                                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                        private final String val$callback;

                                        public void run()
                                        {
                                            adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(\"NO\")").toString());
                                        }

            
            {
                this$2 = final__pcls8;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                                    });
                                }
                                dialoginterface.cancel();
                            }

            
            {
                this$1 = final_innerinterstitialjs;
                callback = s;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = AdMarvelInternalWebView.this;
                super();
            }
                        });
                        builder.create().show();
                        return;
                    }
                }
            }
        }

        public void detectlocation(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                AdMarvelLocationManager admarvellocationmanager = AdMarvelLocationManager.getInstance();
                if (admarvellocationmanager != null)
                {
                    admarvellocationmanager.init(admarvelinternalwebview, s);
                }
            }
        }

        public void detectsizechange(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.sizeChangeCallback = s;
            }
        }

        public void detectvisibility(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown() && !admarvelinternalwebview.isViewDisplayed)
            {
                admarvelinternalwebview.visibilityCallback = s;
                if (admarvelinternalwebview.isInterstitialAdDisplayed)
                {
                    admarvelinternalwebview.injectJavaScript((new StringBuilder(String.valueOf(s))).append("(").append(true).append(")").toString());
                    admarvelinternalwebview.isViewDisplayed = true;
                }
            }
        }

        public void disableautodetect()
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.getEnableAutoDetect().set(false);
            }
        }

        public void disablebackbutton()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    if (admarvelactivity.disableBackPressFromAdRunnable != null)
                    {
                        admarvelactivity.handler.removeCallbacks(admarvelactivity.disableBackPressFromAdRunnable);
                    }
                    admarvelactivity.isBackPressDisabledFromAd = true;
                    return;
                }
            }
        }

        public void disablebackbutton(int i)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && i > 0)
                {
                    admarvelactivity.isBackPressDisabledFromAd = true;
                    if (admarvelactivity.disableBackPressFromAdRunnable != null)
                    {
                        admarvelactivity.handler.removeCallbacks(admarvelactivity.disableBackPressFromAdRunnable);
                    }
                    admarvelactivity.handler.postDelayed(admarvelactivity.disableBackPressFromAdRunnable, i);
                    return;
                }
            }
        }

        public void disableclosebutton(String s)
        {
            for (AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown() || s == null || !s.equals("true");)
            {
                return;
            }

            sdkclosebutton("false", "false");
        }

        public void disablerotations()
        {
            while (adMarvelInternalWebViewReference.get() != null && ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()).isSignalShutdown() || (AdMarvelActivity)adMarvelActivityReference.get() == null) 
            {
                return;
            }
            disablerotations(null);
        }

        public void disablerotations(String s)
        {
            AdMarvelActivity admarvelactivity;
            admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            break MISSING_BLOCK_LABEL_11;
_L6:
            do
            {
                return;
            } while (admarvelactivity == null || adMarvelInternalWebViewReference.get() != null && ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()).isSignalShutdown());
            lastOrientation = admarvelactivity.getRequestedOrientation();
            if (Version.getAndroidSDKVersion() >= 9) goto _L2; else goto _L1
_L1:
            int j = admarvelactivity.getResources().getConfiguration().orientation;
_L4:
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_208;
            }
            if (Version.getAndroidSDKVersion() < 9)
            {
                if (s.equalsIgnoreCase("Portrait"))
                {
                    admarvelactivity.setRequestedOrientation(1);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_158;
_L2:
            GetOrientation getorientation = new GetOrientation(admarvelactivity);
            admarvelactivity.handler.post(getorientation);
            int i = 0x80000000;
            do
            {
                j = i;
                if (i != 0x80000000)
                {
                    break;
                }
                i = getorientation.getCurrentOriention();
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            if (!s.equalsIgnoreCase("LandscapeLeft")) goto _L6; else goto _L5
_L5:
            admarvelactivity.setRequestedOrientation(0);
            return;
            if (s.equalsIgnoreCase("Portrait"))
            {
                admarvelactivity.setRequestedOrientation(1);
                return;
            }
            if (s.equalsIgnoreCase("LandscapeLeft"))
            {
                admarvelactivity.setRequestedOrientation(0);
                return;
            } else
            {
                admarvelactivity.handler.post(new SetOrientationRunnable(admarvelactivity, s));
                return;
            }
            if (Version.getAndroidSDKVersion() < 9)
            {
                if (j == 1)
                {
                    admarvelactivity.setRequestedOrientation(1);
                    return;
                }
                if (j == 2)
                {
                    admarvelactivity.setRequestedOrientation(0);
                    return;
                }
            } else
            {
                if (j == 0)
                {
                    admarvelactivity.handler.post(new SetOrientationRunnable(admarvelactivity, "Portrait"));
                    return;
                }
                if (j == 1)
                {
                    admarvelactivity.handler.post(new SetOrientationRunnable(admarvelactivity, "LandscapeLeft"));
                    return;
                } else
                {
                    admarvelactivity.handler.post(new SetOrientationRunnable(admarvelactivity, "none"));
                    return;
                }
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public void enableVideoCloseInBackground()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            if (admarvelactivity == null)
            {
                return;
            } else
            {
                admarvelactivity.quitVideoWhenBackgrounded = true;
                return;
            }
        }

        public void enableautodetect()
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.getEnableAutoDetect().set(true);
            }
        }

        public void enablebackbutton()
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.isBackPressDisabledFromAd = false;
                    return;
                }
            }
        }

        public void enablerotations()
        {
            AdMarvelActivity admarvelactivity;
            if (adMarvelInternalWebViewReference.get() == null || !((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()).isSignalShutdown())
            {
                if ((admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get()) != null)
                {
                    admarvelactivity.setRequestedOrientation(lastOrientation);
                    return;
                }
            }
        }

        public void firePixel(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.handler.post(new FirePixelRunnable(admarvelinternalwebview, admarvelactivity, s));
                    return;
                }
            }
        }

        public void getLocation(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.handler.post(new GetLocationRunnable(admarvelinternalwebview, s));
                    return;
                }
            }
        }

        public void initAdMarvel(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelactivity.handler.post(new InitAdMarvel(s, admarvelinternalwebview, admarvelactivity));
                    return;
                }
            }
        }

        public int isinstalled(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            if (admarvelactivity == null)
            {
                return 0;
            }
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown())
            {
                return 0;
            }
            return !Utils.isAppInstalled(admarvelactivity, s) ? 0 : 1;
        }

        public void loadVideo()
        {
            Logging.log("window.ADMARVEL.loadVideo()");
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null)
                {
                    admarvelactivity.isAdMarvelVideo = true;
                    if (videoUrl != null && videoUrl.length() > 0)
                    {
                        obj = new LoadBrightRollVideo(videoUrl, admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                        admarvelactivity.handler.post(((Runnable) (obj)));
                        return;
                    }
                }
            }
        }

        public void notifyInAppBrowserCloseAction(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.mInAppBrowserCloseCallback = s;
            }
        }

        public void notifyInterstitialBackgroundState(String s)
        {
            AdMarvelActivity admarvelactivity;
            if (s != null && s.length() > 0)
            {
                if ((admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get()) != null)
                {
                    admarvelactivity.interstitialBackgroundStateCallback = s;
                    return;
                }
            }
        }

        public void pauseVideo()
        {
            Logging.log("window.ADMARVEL.pauseVideo()");
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null)
                {
                    obj = new PauseVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void playVideo()
        {
            Logging.log("window.ADMARVEL.playVideo()");
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new PlayBrightRollVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void redirect(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && s != null && s.length() > 0)
                {
                    s = new RedirectRunnable(s, admarvelactivity, adMarvelAd);
                    admarvelactivity.handler.post(s);
                    return;
                }
            }
        }

        public void registerEventsForAdMarvelVideo(String s, String s1)
        {
            AdMarvelActivity admarvelactivity;
            if (s != null && s.length() != 0 && s1 != null && s1.length() != 0)
            {
                if ((admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get()) != null)
                {
                    if (s.equals("loadeddata"))
                    {
                        admarvelactivity.videoCallbackLoadedData = s1;
                        return;
                    }
                    if (s.equals("play"))
                    {
                        admarvelactivity.videoCallbackPlay = s1;
                        return;
                    }
                    if (s.equals("canplay"))
                    {
                        admarvelactivity.videoCallbackCanPlay = s1;
                        return;
                    }
                    if (s.equals("timeupdate"))
                    {
                        admarvelactivity.videoCallbackTimeUpdate = s1;
                        return;
                    }
                    if (s.equals("ended"))
                    {
                        admarvelactivity.videoCallbackEnded = s1;
                        return;
                    }
                    if (s.equals("pause"))
                    {
                        admarvelactivity.videoCallbackPause = s1;
                        return;
                    }
                    if (s.equals("error"))
                    {
                        admarvelactivity.videoCallbackError = s1;
                        return;
                    }
                }
            }
        }

        public void registerInterstitialCloseCallback(String s)
        {
            AdMarvelActivity admarvelactivity;
            if (s != null && s.length() > 0)
            {
                if ((admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get()) != null)
                {
                    admarvelactivity.interstitialCloseCallback = s;
                    return;
                }
            }
        }

        public void registeraccelerationevent(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && (admarvelsensormanager = AdMarvelSensorManager.getInstance()).isSupported(admarvelactivity.getBaseContext()))
                {
                    admarvelsensormanager.setTiltCallback(s);
                    admarvelsensormanager.init(admarvelactivity.getBaseContext(), admarvelinternalwebview);
                    return;
                }
            }
        }

        public void registerheadingevent(String s)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && ((admarvelsensormanager = AdMarvelSensorManager.getInstance()) != null && admarvelsensormanager.isSupported(admarvelactivity.getBaseContext())))
                {
                    admarvelsensormanager.setHeadingCallback(s);
                    admarvelsensormanager.init(admarvelactivity.getBaseContext(), admarvelinternalwebview);
                    return;
                }
            }
        }

        public void registernetworkchangeevent(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                AdMarvelConnectivityChangeReceiver.registerCallback(admarvelinternalwebview, s);
            }
        }

        public void registershakeevent(String s, String s1, String s2)
        {
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelactivity != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && (admarvelsensormanager = AdMarvelSensorManager.getInstance()).isSupported(admarvelactivity.getBaseContext()))
                {
                    admarvelsensormanager.setShakeCallback(s);
                    admarvelsensormanager.setShakeProperties(s1, s2);
                    admarvelsensormanager.init(admarvelactivity.getBaseContext(), admarvelinternalwebview);
                    return;
                }
            }
        }

        public void sdkclosebutton(String s, String s1)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_11;
label0:
            while (s == null || !s.equals("true")) 
            {
label1:
                do
                {
                    do
                    {
                        do
                        {
                            return;
                        } while (admarvelinternalwebview == null || admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown());
                        if (s == null || !s.equals("false"))
                        {
                            continue label0;
                        }
                        if (s1 == null || !s1.equals("true"))
                        {
                            continue label1;
                        }
                    } while (admarvelinternalwebview == null);
                    admarvelinternalwebview.disableCloseButton(true);
                    return;
                } while (admarvelinternalwebview == null);
                admarvelinternalwebview.disableCloseButton(false);
                return;
            }
            admarvelinternalwebview.enableCloseButton();
            return;
        }

        public void seekVideoTo(float f)
        {
            Logging.log("window.ADMARVEL.seekToVideo()");
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && videoUrl != null && videoUrl.length() > 0)
                {
                    obj = new SeekToBrightRollVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)), f);
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void setVideoUrl(String s)
        {
            Logging.log((new StringBuilder("window.ADMARVEL.setVideoUrl(\"")).append(s).append("\")").toString());
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            if (admarvelactivity == null)
            {
                return;
            } else
            {
                videoUrl = s;
                admarvelactivity.isAdMarvelVideo = true;
                return;
            }
        }

        public void setbackgroundcolor(String s)
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null || admarvelinternalwebview.isSignalShutdown()) goto _L2; else goto _L3
_L3:
            if (!"0".equals(s)) goto _L5; else goto _L4
_L4:
            int i = 0;
_L7:
            admarvelinternalwebview.setBackgroundColor(i);
_L2:
            return;
_L5:
            long l;
label0:
            {
                long l1 = Long.parseLong(s.replace("#", ""), 16);
                if (s.length() != 7)
                {
                    l = l1;
                    if (s.length() != 6)
                    {
                        break label0;
                    }
                }
                l = l1 | 0xffffffffff000000L;
            }
            i = (int)l;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void stopVideo()
        {
            Logging.log("window.ADMARVEL.stopVideo()");
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            Object obj;
            if (admarvelactivity != null)
            {
                if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null)
                {
                    obj = new StopVideo(admarvelactivity, ((AdMarvelInternalWebView) (obj)));
                    admarvelactivity.handler.post(((Runnable) (obj)));
                    return;
                }
            }
        }

        public void storepicture(final String url, final String callback)
        {
            final AdMarvelActivity adMarvelActivity = (AdMarvelActivity)adMarvelActivityReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelActivity != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown())
                {
                    if (!Utils.isPermissionGranted(adMarvelInternalWebView.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") || !"mounted".equals(Environment.getExternalStorageState()))
                    {
                        if (callback != null)
                        {
                            adMarvelActivity.handler.post(callback. new Runnable() {

                                final InnerInterstitialJS this$1;
                                private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                private final String val$callback;

                                public void run()
                                {
                                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(NO)").toString());
                                }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelInternalWebView.getContext());
                        builder.setMessage("Allow storing image in your Gallery?").setCancelable(false).setPositiveButton("Yes", callback. new android.content.DialogInterface.OnClickListener() {

                            final InnerInterstitialJS this$1;
                            private final AdMarvelActivity val$adMarvelActivity;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$callback;
                            private final String val$url;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (Version.getAndroidSDKVersion() < 8)
                                {
                                    adMarvelActivity.handler.post(new StorePictureRunnablePreAPI8(adMarvelInternalWebView, url, callback));
                                    return;
                                } else
                                {
                                    adMarvelActivity.handler.post(new StorePictureRunnable(adMarvelInternalWebView, url, callback));
                                    return;
                                }
                            }

            
            {
                this$1 = final_innerinterstitialjs;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = admarvelinternalwebview;
                url = s;
                callback = String.this;
                super();
            }
                        }).setNegativeButton("No", adMarvelInternalWebView. new android.content.DialogInterface.OnClickListener() {

                            final InnerInterstitialJS this$1;
                            private final AdMarvelActivity val$adMarvelActivity;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$callback;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (callback != null)
                                {
                                    adMarvelActivity.handler.post(callback. new Runnable() {

                                        final InnerInterstitialJS._cls11 this$2;
                                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                        private final String val$callback;

                                        public void run()
                                        {
                                            adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(\"NO\")").toString());
                                        }

            
            {
                this$2 = final__pcls11;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                                    });
                                }
                                dialoginterface.cancel();
                            }

            
            {
                this$1 = final_innerinterstitialjs;
                callback = s;
                adMarvelActivity = admarvelactivity;
                adMarvelInternalWebView = AdMarvelInternalWebView.this;
                super();
            }
                        });
                        builder.create().show();
                        return;
                    }
                }
            }
        }

        public InnerInterstitialJS(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, AdMarvelAd admarvelad)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelAd = admarvelad;
            lastOrientation = admarvelactivity.getRequestedOrientation();
        }
    }

    private static class LoadBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private String videoUrl;

        public void run()
        {
            final AdMarvelActivity activity;
            AdMarvelInternalWebView admarvelinternalwebview;
            RelativeLayout relativelayout;
            AdMarvelVideoView admarvelvideoview;
            int i;
            int j;
            try
            {
                activity = (AdMarvelActivity)adMarvelActivityReference.get();
                admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
                return;
            }
            if (activity == null || admarvelinternalwebview == null) goto _L2; else goto _L1
_L1:
            if (videoUrl == null) goto _L2; else goto _L3
_L3:
            if (videoUrl.length() <= 0)
            {
                return;
            }
            activity.isBrightRollVideoLoaded = true;
            relativelayout = (RelativeLayout)activity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            admarvelvideoview = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(activity.GUID))).append("BR_VIDEO").toString());
            if (admarvelvideoview != null) goto _L5; else goto _L4
_L4:
            admarvelvideoview = new AdMarvelVideoView(activity);
            admarvelvideoview.setTag((new StringBuilder(String.valueOf(activity.GUID))).append("BR_VIDEO").toString());
            if (!activity.isAdMarvelVideo) goto _L7; else goto _L6
_L6:
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.addRule(13);
            admarvelvideoview.setLayoutParams(layoutparams);
            j = relativelayout.getChildCount();
            i = 0;
              goto _L8
_L10:
            relativelayout.addView(admarvelvideoview, i);
            relativelayout.removeView(admarvelinternalwebview);
            admarvelinternalwebview.setBackgroundColor(0);
            admarvelinternalwebview.setBackgroundDrawable(null);
            i = Version.getAndroidSDKVersion();
            if (i >= 11)
            {
                try
                {
                    android/view/View.getMethod("setLayerType", new Class[] {
                        Integer.TYPE, android/graphics/Paint
                    }).invoke(admarvelinternalwebview, new Object[] {
                        Integer.valueOf(1), null
                    });
                }
                catch (Exception exception1) { }
            }
            relativelayout.addView(admarvelinternalwebview);
_L9:
            admarvelvideoview.setVideoURI(Uri.parse(videoUrl));
            admarvelvideoview.setOnPreparedListener(admarvelinternalwebview. new android.media.MediaPlayer.OnPreparedListener() {

                final LoadBrightRollVideo this$1;
                private final AdMarvelActivity val$activity;
                private final AdMarvelInternalWebView val$webview;

                public void onPrepared(MediaPlayer mediaplayer)
                {
                    if (activity.isAdMarvelVideo)
                    {
                        if (activity.videoCallbackLoadedData != null && activity.videoCallbackLoadedData.length() > 0)
                        {
                            webview.loadUrl((new StringBuilder("javascript:")).append(activity.videoCallbackLoadedData).append("()").toString());
                        }
                        if (activity.videoCallbackCanPlay != null && activity.videoCallbackCanPlay.length() > 0)
                        {
                            webview.loadUrl((new StringBuilder("javascript:")).append(activity.videoCallbackCanPlay).append("()").toString());
                        }
                        return;
                    } else
                    {
                        webview.loadUrl((new StringBuilder("javascript:AdApp.videoView().setDuration(")).append(mediaplayer.getDuration() / 1000).append(")").toString());
                        webview.loadUrl("javascript:AdApp.videoView().setCanPlay(true)");
                        webview.loadUrl("javascript:AdApp.adView().play()");
                        return;
                    }
                }

            
            {
                this$1 = final_loadbrightrollvideo;
                activity = admarvelactivity;
                webview = AdMarvelInternalWebView.this;
                super();
            }
            });
            admarvelvideoview.setOnCompletionListener(admarvelinternalwebview. new android.media.MediaPlayer.OnCompletionListener() {

                final LoadBrightRollVideo this$1;
                private final AdMarvelActivity val$activity;
                private final AdMarvelInternalWebView val$webview;

                public void onCompletion(MediaPlayer mediaplayer)
                {
                    if (activity.isAdMarvelVideo)
                    {
                        if (activity.videoCallbackEnded != null && activity.videoCallbackEnded.length() > 0)
                        {
                            webview.loadUrl((new StringBuilder("javascript:")).append(activity.videoCallbackEnded).append("()").toString());
                        }
                    } else
                    {
                        webview.loadUrl("javascript:AdApp.videoView().end();");
                    }
                    mediaplayer = new CleanUpBrightRollVideo(activity);
                    activity.handler.post(mediaplayer);
                }

            
            {
                this$1 = final_loadbrightrollvideo;
                activity = admarvelactivity;
                webview = AdMarvelInternalWebView.this;
                super();
            }
            });
            admarvelvideoview.setOnErrorListener(admarvelinternalwebview. new android.media.MediaPlayer.OnErrorListener() {

                final LoadBrightRollVideo this$1;
                private final AdMarvelActivity val$activity;
                private final AdMarvelInternalWebView val$webview;

                public boolean onError(MediaPlayer mediaplayer, int i, int j)
                {
                    mediaplayer = new CleanUpBrightRollVideo(activity);
                    activity.handler.post(mediaplayer);
                    if (activity.isAdMarvelVideo && activity.videoCallbackError != null && activity.videoCallbackError.length() > 0)
                    {
                        webview.loadUrl((new StringBuilder("javascript:")).append(activity.videoCallbackError).append("()").toString());
                    }
                    return false;
                }

            
            {
                this$1 = final_loadbrightrollvideo;
                activity = admarvelactivity;
                webview = AdMarvelInternalWebView.this;
                super();
            }
            });
            return;
_L5:
            if (videoUrl != null)
            {
                admarvelvideoview.setVideoURI(Uri.parse(videoUrl));
                return;
            }
              goto _L2
_L11:
            if (relativelayout.getChildAt(i) == admarvelinternalwebview)
            {
                break; /* Loop/switch isn't completed */
            }
            i++;
            continue; /* Loop/switch isn't completed */
_L7:
            admarvelvideoview.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(1, 1));
            relativelayout.addView(admarvelvideoview);
              goto _L9
_L2:
            return;
_L8:
            if (i < j) goto _L11; else goto _L10
        }

        public LoadBrightRollVideo(String s, AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
        {
            videoUrl = s;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }

    private static class PauseVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;

        public void run()
        {
            AdMarvelActivity admarvelactivity;
            AdMarvelInternalWebView admarvelinternalwebview;
            admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelactivity == null)
            {
                break MISSING_BLOCK_LABEL_146;
            }
            if (admarvelinternalwebview == null)
            {
                return;
            }
            AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)((RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(admarvelactivity.GUID))).append("BR_VIDEO").toString());
            if (admarvelvideoview != null)
            {
                try
                {
                    if (admarvelvideoview.isPlaying())
                    {
                        admarvelvideoview.pause();
                        if (admarvelactivity.isAdMarvelVideo && admarvelactivity.videoCallbackPause != null && admarvelactivity.videoCallbackPause.length() > 0)
                        {
                            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(admarvelactivity.videoCallbackPause).append("()").toString());
                            return;
                        }
                    }
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                }
            }
        }

        public PauseVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }

    private static class PlayBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;

        public void run()
        {
            final AdMarvelVideoView videoView;
            AdMarvelActivity admarvelactivity;
            final AdMarvelInternalWebView webview;
            try
            {
                admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
                webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
                return;
            }
            if (admarvelactivity == null)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (webview == null)
            {
                return;
            }
            videoView = (AdMarvelVideoView)((RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(admarvelactivity.GUID))).append("BR_VIDEO").toString());
            if (videoView == null)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            if (videoView.getHeight() != 0)
            {
                break MISSING_BLOCK_LABEL_200;
            }
            admarvelactivity.handler.postDelayed(admarvelactivity. new Runnable() {

                final PlayBrightRollVideo this$1;
                private final AdMarvelActivity val$activity;
                private final AdMarvelVideoView val$videoView;
                private final AdMarvelInternalWebView val$webview;

                public void run()
                {
                    if (videoView.getHeight() == 0)
                    {
                        webview.loadUrl((new StringBuilder("javascript:")).append(activity.videoCallbackError).append("()").toString());
                        return;
                    } else
                    {
                        videoView.start();
                        return;
                    }
                }

            
            {
                this$1 = final_playbrightrollvideo;
                videoView = admarvelvideoview;
                webview = admarvelinternalwebview;
                activity = AdMarvelActivity.this;
                super();
            }
            }, 500L);
_L1:
            if (admarvelactivity.brightRollVideoTimer == null)
            {
                admarvelactivity.brightRollVideoTimer = new TimerBrightRollVideo(admarvelactivity, webview);
                admarvelactivity.handler.postDelayed(admarvelactivity.brightRollVideoTimer, 1000L);
            }
            if (admarvelactivity.isAdMarvelVideo && admarvelactivity.videoCallbackPlay != null && admarvelactivity.videoCallbackPlay.length() > 0)
            {
                webview.loadUrl((new StringBuilder("javascript:")).append(admarvelactivity.videoCallbackPlay).append("()").toString());
                return;
            }
            break MISSING_BLOCK_LABEL_207;
            videoView.start();
              goto _L1
        }

        public PlayBrightRollVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }

    private static class PositionBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private float hRatio;
        private float wRatio;
        private float xRatio;
        private float yRatio;

        public void run()
        {
            Object obj;
            AdMarvelActivity admarvelactivity;
            admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelactivity == null)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            if (obj == null)
            {
                return;
            }
            RelativeLayout relativelayout;
            ((AdMarvelInternalWebView) (obj)).loadUrl("javascript:console.log(\"Window Innerwidth \"+window.innerWidth);");
            relativelayout = (RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            obj = null;
            if (relativelayout == null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            obj = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(admarvelactivity.GUID))).append("BR_VIDEO").toString());
            if (obj != null)
            {
                try
                {
                    if (admarvelactivity.brightRollVideoTimer != null)
                    {
                        int i = relativelayout.getWidth();
                        int j = relativelayout.getHeight();
                        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((AdMarvelVideoView) (obj)).getLayoutParams();
                        layoutparams.width = (int)((float)i * wRatio);
                        layoutparams.height = (int)((float)j * hRatio);
                        layoutparams.leftMargin = (int)((float)i * xRatio);
                        layoutparams.topMargin = (int)((float)j * yRatio);
                        ((AdMarvelVideoView) (obj)).setLayoutParams(layoutparams);
                        ((AdMarvelVideoView) (obj)).forceLayout();
                        return;
                    }
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                }
            }
        }

        public PositionBrightRollVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview, float f, float f1, float f2, float f3)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            xRatio = f;
            yRatio = f1;
            wRatio = f2;
            hRatio = f3;
        }
    }

    private static class RedirectRunnable
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final AdMarvelAd adMarvelAd;
        private String url;

        public void run()
        {
            AdMarvelActivity admarvelactivity;
            if (adMarvelActivityReference != null)
            {
                admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            } else
            {
                admarvelactivity = null;
            }
            if (admarvelactivity == null)
            {
                return;
            }
            if (!AdMarvelInterstitialAds.getEnableClickRedirect()) goto _L2; else goto _L1
_L1:
            if (url == null || !AdMarvelInterstitialAds.enableOfflineSDK || Utils.checkIfPrivateProtocol(url)) goto _L4; else goto _L3
_L3:
            Exception exception;
            if (URLUtil.isNetworkUrl(url) && Utils.handledBySpecialIntents(admarvelactivity, url))
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                return;
            }
              goto _L5
_L2:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            return;
_L5:
            String s = adMarvelAd.getOfflinekeyUrl();
            if (Utils.handledBySpecialIntents(admarvelactivity, (new StringBuilder(String.valueOf(s.substring(0, s.lastIndexOf("/"))))).append("/").append(url).toString()))
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                return;
            }
              goto _L6
_L4:
            if (url != null && !Utils.checkIfPrivateProtocol(url) && Utils.handledBySpecialIntents(admarvelactivity, url))
            {
                (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, url, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                return;
            }
_L6:
            if (url != null && Utils.isPrivateProtocol(url, "admarvelsdk") != Utils.PROTOCOL_TYPE.NONE)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(url, "admarvelsdk", "", Utils.isPrivateProtocol(url, "admarvelsdk"), admarvelactivity), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
                return;
            }
            if (url != null && Utils.isPrivateProtocol(url, "admarvelinternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(url, "admarvelinternal", "", Utils.isPrivateProtocol(url, "admarvelinternal"), admarvelactivity), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
                return;
            }
            try
            {
label0:
                {
                    if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || Utils.isPrivateProtocol(url, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE)
                    {
                        break label0;
                    }
                    String s1 = Utils.parsePrivateProtocol(url, "admarvelvideo", "http://", Utils.isPrivateProtocol(url, "admarvelvideo"), admarvelactivity);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addFlags(0x10000000);
                    intent2.setDataAndType(Uri.parse(s1), "video/*");
                    if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent2))
                    {
                        admarvelactivity.startActivity(intent2);
                    }
                    (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                Logging.log((new StringBuilder(String.valueOf(exception.getMessage()))).append("Exception in RedirectRunnable ").toString());
            }
              goto _L2
            if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || Utils.isPrivateProtocol(url, "admarvelexternal") == Utils.PROTOCOL_TYPE.NONE) goto _L8; else goto _L7
_L7:
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(url, "admarvelexternal", "", Utils.isPrivateProtocol(url, "admarvelexternal"), admarvelactivity)));
            intent.addFlags(0x10000000);
            if (Utils.isIntentAvailable(admarvelactivity.getBaseContext(), intent))
            {
                admarvelactivity.startActivity(intent);
            }
            (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
              goto _L2
_L8:
            if (!Utils.isNetworkAvailable(admarvelactivity) || url == null || url.length() <= 0) goto _L2; else goto _L9
_L9:
            Intent intent1;
            intent1 = new Intent(admarvelactivity.getBaseContext(), com/admarvel/android/ads/AdMarvelActivity);
            intent1.addFlags(0x10000000);
            intent1.putExtra("url", url);
            intent1.putExtra("isInterstitial", false);
            intent1.putExtra("isInterstitialClick", true);
            intent1.putExtra("xml", admarvelactivity.xml);
            intent1.putExtra("GUID", admarvelactivity.GUID);
            adMarvelAd.removeNonStringEntriesTargetParam();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(adMarvelAd);
            objectoutputstream.close();
            intent1.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
_L10:
            if (admarvelactivity.getSource() != null)
            {
                intent1.putExtra("source", admarvelactivity.source);
            }
            admarvelactivity.startActivity(intent1);
            (new Utils(admarvelactivity, admarvelactivity.handler)).registerTrackingEvent(admarvelactivity.xml);
              goto _L2
            IOException ioexception;
            ioexception;
            ioexception.printStackTrace();
              goto _L10
        }

        public RedirectRunnable(String s, AdMarvelActivity admarvelactivity, AdMarvelAd admarvelad)
        {
            url = s;
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelAd = admarvelad;
        }
    }

    private static class SeekToBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private float currentTime;

        public void run()
        {
            Object obj;
            Object obj1;
            obj = (AdMarvelActivity)adMarvelActivityReference.get();
            obj1 = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            if (obj1 == null)
            {
                return;
            }
            obj1 = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            obj = (AdMarvelVideoView)((RelativeLayout) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("BR_VIDEO").toString());
            if (obj != null)
            {
                try
                {
                    ((AdMarvelVideoView) (obj)).seekTo((int)(currentTime * 1000F));
                    return;
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                }
            }
        }

        public SeekToBrightRollVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview, float f)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            currentTime = f;
        }
    }

    private static class SetOrientationRunnable
        implements Runnable
    {

        private final WeakReference activityReference;
        private String lockedOrientation;
        private Activity mActivity;

        public void run()
        {
            Object obj;
            try
            {
                mActivity = (Activity)activityReference.get();
                if (mActivity == null)
                {
                    break MISSING_BLOCK_LABEL_286;
                }
                if (lockedOrientation == null)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            obj = ((WindowManager)mActivity.getSystemService("window")).getDefaultDisplay();
            if (lockedOrientation.equalsIgnoreCase("Portrait"))
            {
                mActivity.setRequestedOrientation(1);
                if (((Display) (obj)).getRotation() != 0)
                {
                    mActivity.setRequestedOrientation(9);
                    return;
                }
                break MISSING_BLOCK_LABEL_286;
            }
            if (lockedOrientation.equalsIgnoreCase("LandscapeLeft"))
            {
                mActivity.setRequestedOrientation(0);
                if (((Display) (obj)).getRotation() != 1)
                {
                    mActivity.setRequestedOrientation(8);
                    return;
                }
                break MISSING_BLOCK_LABEL_286;
            }
            if (lockedOrientation.equalsIgnoreCase("PortraitUpSideDown"))
            {
                mActivity.setRequestedOrientation(9);
                if (((Display) (obj)).getRotation() != 2)
                {
                    mActivity.setRequestedOrientation(1);
                    return;
                }
                break MISSING_BLOCK_LABEL_286;
            }
            if (lockedOrientation.equalsIgnoreCase("LandscapeRight"))
            {
                mActivity.setRequestedOrientation(8);
                if (((Display) (obj)).getRotation() != 3)
                {
                    mActivity.setRequestedOrientation(0);
                    return;
                }
                break MISSING_BLOCK_LABEL_286;
            }
            if (!lockedOrientation.equalsIgnoreCase("none"))
            {
                break MISSING_BLOCK_LABEL_286;
            }
            if (((Display) (obj)).getRotation() == 2)
            {
                mActivity.setRequestedOrientation(9);
                if (((Display) (obj)).getRotation() != 2)
                {
                    mActivity.setRequestedOrientation(1);
                    return;
                }
                break MISSING_BLOCK_LABEL_286;
            }
            if (((Display) (obj)).getRotation() == 3)
            {
                mActivity.setRequestedOrientation(8);
                if (((Display) (obj)).getRotation() != 3)
                {
                    mActivity.setRequestedOrientation(0);
                }
            }
        }

        public SetOrientationRunnable(Activity activity, String s)
        {
            lockedOrientation = null;
            mActivity = null;
            activityReference = new WeakReference(activity);
            lockedOrientation = s;
        }
    }

    private class ShowDialogRunnable
        implements Runnable
    {

        final AdMarvelActivity this$0;

        public void run()
        {
            AdMarvelProgressDialogFragment admarvelprogressdialogfragment;
            try
            {
                admarvelprogressdialogfragment = AdMarvelProgressDialogFragment.newInstance(AdMarvelActivity.this);
            }
            catch (Exception exception)
            {
                Logging.log(exception.getMessage());
                closehandler.sendEmptyMessage(0);
                return;
            }
            if (admarvelprogressdialogfragment == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            admarvelprogressdialogfragment.show(getFragmentManager(), "dialog");
        }

        private ShowDialogRunnable()
        {
            this$0 = AdMarvelActivity.this;
            super();
        }

        ShowDialogRunnable(ShowDialogRunnable showdialogrunnable)
        {
            this();
        }
    }

    private static class StopVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            Object obj;
            obj = (AdMarvelActivity)adMarvelActivityReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            if (admarvelinternalwebview == null)
            {
                return;
            }
            obj = (AdMarvelVideoView)((RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelActivity) (obj)).GUID))).append("BR_VIDEO").toString());
            if (obj != null)
            {
                try
                {
                    if (((AdMarvelVideoView) (obj)).isPlaying())
                    {
                        ((AdMarvelVideoView) (obj)).stopPlayback();
                        admarvelinternalwebview.loadUrl("javascript:stop()");
                        return;
                    }
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                }
            }
        }

        public StopVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }

    private static class StorePictureRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        String imageUrl;
        String mCallback;

        public void run()
        {
            Object obj1;
            AdMarvelInternalWebView admarvelinternalwebview;
            String s;
            obj1 = null;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return;
            }
            s = (new StringBuilder(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()))).append("/").toString();
            if (imageUrl == null) goto _L2; else goto _L1
_L1:
            if (!imageUrl.startsWith("/mnt/sdcard")) goto _L4; else goto _L3
_L3:
            if (!(new File(imageUrl)).exists()) goto _L6; else goto _L5
_L5:
            obj1 = BitmapFactory.decodeFile(imageUrl);
            Object obj = null;
_L8:
            Bitmap bitmap;
            bitmap = ((Bitmap) (obj1));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            bitmap = ((Bitmap) (obj1));
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            bitmap = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
            obj = new File(s);
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = (new StringBuilder(String.valueOf(s))).append(System.currentTimeMillis()).append(".jpg").toString();
            obj1 = new FileOutputStream(((String) (obj)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_193;
            }
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj1)));
            ((FileOutputStream) (obj1)).flush();
            ((FileOutputStream) (obj1)).close();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(((String) (obj)))));
            admarvelinternalwebview.getContext().sendBroadcast(intent);
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
_L6:
            try
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            obj = null;
            continue; /* Loop/switch isn't completed */
_L4:
            if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
            {
                imageUrl = Utils.redirectURLCheck(imageUrl, admarvelinternalwebview.getContext());
                obj = (new URL(imageUrl)).openStream();
                continue; /* Loop/switch isn't completed */
            }
            if (imageUrl.startsWith("file:///android_asset/"))
            {
                int i = "file:///android_asset/".length();
                obj = imageUrl.substring(i);
                obj = admarvelinternalwebview.getContext().getAssets().open(((String) (obj)));
                continue; /* Loop/switch isn't completed */
            }
_L2:
            obj = null;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public StorePictureRunnable(AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            imageUrl = s;
            mCallback = s1;
        }
    }

    private static class StorePictureRunnablePreAPI8
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        String imageUrl;
        String mCallback;

        public void run()
        {
            Object obj1;
            AdMarvelInternalWebView admarvelinternalwebview;
            String s;
            obj1 = null;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return;
            }
            s = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().toString()))).append("/Pictures/").toString();
            if (imageUrl == null) goto _L2; else goto _L1
_L1:
            if (!imageUrl.startsWith("/mnt/sdcard")) goto _L4; else goto _L3
_L3:
            if (!(new File(imageUrl)).exists()) goto _L6; else goto _L5
_L5:
            obj1 = BitmapFactory.decodeFile(imageUrl);
            Object obj = null;
_L8:
            Bitmap bitmap;
            bitmap = ((Bitmap) (obj1));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            bitmap = ((Bitmap) (obj1));
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            bitmap = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
            obj = new File(s);
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = (new StringBuilder(String.valueOf(s))).append(System.currentTimeMillis()).append(".jpg").toString();
            obj1 = new FileOutputStream(((String) (obj)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_190;
            }
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj1)));
            ((FileOutputStream) (obj1)).flush();
            ((FileOutputStream) (obj1)).close();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(((String) (obj)))));
            admarvelinternalwebview.getContext().sendBroadcast(intent);
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
_L6:
            try
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            obj = null;
            continue; /* Loop/switch isn't completed */
_L4:
            if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
            {
                imageUrl = Utils.redirectURLCheck(imageUrl, admarvelinternalwebview.getContext());
                obj = (new URL(imageUrl)).openStream();
                continue; /* Loop/switch isn't completed */
            }
            if (imageUrl.startsWith("file:///android_asset/"))
            {
                int i = "file:///android_asset/".length();
                obj = imageUrl.substring(i);
                obj = admarvelinternalwebview.getContext().getAssets().open(((String) (obj)));
                continue; /* Loop/switch isn't completed */
            }
_L2:
            obj = null;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public StorePictureRunnablePreAPI8(AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            imageUrl = s;
            mCallback = s1;
        }
    }

    private static class TimerBrightRollVideo
        implements Runnable
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;

        public void run()
        {
            AdMarvelActivity admarvelactivity;
            AdMarvelInternalWebView admarvelinternalwebview;
            admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelactivity == null) goto _L2; else goto _L1
_L1:
            if (admarvelinternalwebview == null)
            {
                return;
            }
            AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)((RelativeLayout)admarvelactivity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(admarvelactivity.GUID))).append("BR_VIDEO").toString());
            if (admarvelinternalwebview == null || admarvelvideoview == null) goto _L4; else goto _L3
_L3:
            if (!admarvelactivity.isAdMarvelVideo) goto _L6; else goto _L5
_L5:
            if (admarvelactivity.videoCallbackTimeUpdate != null && admarvelactivity.videoCallbackTimeUpdate.length() > 0)
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(admarvelactivity.videoCallbackTimeUpdate).append("(").append((float)admarvelvideoview.getCurrentPosition() / 1000F).append(")").toString());
            }
_L4:
            try
            {
                admarvelactivity.handler.postDelayed(admarvelactivity.brightRollVideoTimer, 1000L);
                return;
            }
            catch (Exception exception)
            {
                Logging.log(Log.getStackTraceString(exception));
            }
            return;
_L6:
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:AdApp.videoView().setCurrentTime(")).append(admarvelvideoview.getCurrentPosition() / 1000).append(")").toString());
            continue; /* Loop/switch isn't completed */
            Exception exception1;
            exception1;
            exception1.printStackTrace();
            if (true) goto _L4; else goto _L2
_L2:
        }

        public TimerBrightRollVideo(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
        {
            adMarvelActivityReference = new WeakReference(admarvelactivity);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }


    private static final String DEVICE_KINDLE = "Kindle";
    static int LAYOUT_VIEW_ID = 0x193fe;
    private String GUID;
    private int adCloseCount;
    private AdMarvelAd adMarvelAd;
    private AdMarvelActivityInternalListener admarvelActivityInternalListener;
    private int backgroundColor;
    private TimerBrightRollVideo brightRollVideoTimer;
    private Handler closehandler;
    private Runnable disableBackPressFromAdRunnable;
    private Runnable disableBackPressRunnable;
    private final Handler handler = new Handler();
    private String html;
    private Handler inappbrowserhandler;
    private boolean interstitial;
    public String interstitialBackgroundStateCallback;
    private boolean interstitialClick;
    public String interstitialCloseCallback;
    public boolean isAdMarvelVideo;
    private boolean isBackPressDisabled;
    private boolean isBackPressDisabledFromAd;
    public boolean isBrightRollVideoLoaded;
    private boolean isCloseAreaEnabledForTwoPart;
    private boolean isCloseBtnEnabledForTwoPart;
    private boolean isTwoPartExpandState;
    WeakReference progressDialogReference;
    private boolean quitVideoWhenBackgrounded;
    private String source;
    private String twoPartExpandUrl;
    private String twoPartOrientationState;
    private String url;
    private String videoCallbackCanPlay;
    private String videoCallbackEnded;
    private String videoCallbackError;
    private String videoCallbackLoadedData;
    private String videoCallbackPause;
    private String videoCallbackPlay;
    private String videoCallbackTimeUpdate;
    private String xml;

    public AdMarvelActivity()
    {
        isBackPressDisabled = false;
        isBackPressDisabledFromAd = false;
        adCloseCount = 0;
        disableBackPressRunnable = new Runnable() {

            final AdMarvelActivity this$0;

            public void run()
            {
                isBackPressDisabled = false;
                if (progressDialogReference == null) goto _L2; else goto _L1
_L1:
                AdMarvelProgressDialog admarvelprogressdialog = (AdMarvelProgressDialog)progressDialogReference.get();
_L4:
                if (admarvelprogressdialog == null)
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                admarvelprogressdialog.setCancelable(true);
                return;
_L2:
                admarvelprogressdialog = null;
                if (true) goto _L4; else goto _L3
_L3:
                Exception exception;
                exception;
                Logging.log((new StringBuilder("Exception in disable Back press button ")).append(exception.getMessage()).toString());
                return;
            }

            
            {
                this$0 = AdMarvelActivity.this;
                super();
            }
        };
        disableBackPressFromAdRunnable = new Runnable() {

            final AdMarvelActivity this$0;

            public void run()
            {
                isBackPressDisabledFromAd = false;
            }

            
            {
                this$0 = AdMarvelActivity.this;
                super();
            }
        };
        interstitial = false;
        interstitialClick = false;
        isBrightRollVideoLoaded = false;
        isAdMarvelVideo = false;
        quitVideoWhenBackgrounded = false;
        isTwoPartExpandState = false;
        isCloseBtnEnabledForTwoPart = false;
        isCloseAreaEnabledForTwoPart = false;
        closehandler = new Handler() {

            final AdMarvelActivity this$0;

            public void handleMessage(Message message)
            {
                if (progressDialogReference == null) goto _L2; else goto _L1
_L1:
                message = (AdMarvelProgressDialog)progressDialogReference.get();
_L4:
                if (message == null)
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                message.signalShutdown();
                message.dismiss();
                if (!interstitial)
                {
                    break MISSING_BLOCK_LABEL_205;
                }
                message = AdMarvelActivity.this;
                message.adCloseCount = ((AdMarvelActivity) (message)).adCloseCount + 1;
                if (!AdMarvelInterstitialAds.getListener().onCloseInterstitialAd())
                {
                    finish();
                }
                if (interstitialCloseCallback == null || interstitialCloseCallback.length() <= 0)
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                message = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
                if (message == null)
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                message = (AdMarvelInternalWebView)message.findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
                if (message == null)
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                message.loadUrl((new StringBuilder("javascript:")).append(interstitialCloseCallback).append("()").toString());
                if (adCloseCount > 2)
                {
                    finish();
                    return;
                }
                break MISSING_BLOCK_LABEL_236;
                try
                {
                    finish();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    Logging.log((new StringBuilder("Nullpointer exception occured in close")).append(message.getMessage()).toString());
                }
                return;
_L2:
                message = null;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = AdMarvelActivity.this;
                super();
            }
        };
        inappbrowserhandler = new Handler() {

            final AdMarvelActivity this$0;

            public void handleMessage(Message message)
            {
                RelativeLayout relativelayout = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
                message = AdMarvelActivity.this;
                FullScreenControls fullscreencontrols;
                boolean flag;
                if (interstitial)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                message = new AdMarvelInternalWebView(message, flag, xml, GUID, handler, null, null, adMarvelAd);
                message.setVisibility(4);
                message.setTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
                message.expandToFullScreenWithControls();
                if (Version.getAndroidSDKVersion() >= 11)
                {
                    WebViewResumePause.onResume(message);
                } else
                {
                    WebViewResumePausePreAPI11.onResume(message);
                }
                message.addJavascriptInterface(new InnerInterstitialJS(message, AdMarvelActivity.this, adMarvelAd), "ADMARVEL");
                message.addJavascriptInterface(new BrightRollInnerInterstitialJS(message, AdMarvelActivity.this), "AndroidBridge");
                if (Utils.isPermissionGranted(getApplicationContext(), "android.permission.RECORD_AUDIO"))
                {
                    try
                    {
                        if (adMarvelAd != null)
                        {
                            Class class1 = Class.forName("com.admarvel.android.admarvelspeechkitadapter.Speech");
                            Object obj1 = class1.newInstance();
                            class1.getDeclaredMethod("initSpeechMembers", new Class[] {
                                com/admarvel/android/ads/AdMarvelInternalWebView, java/lang/String, java/lang/String
                            }).invoke(obj1, new Object[] {
                                message, adMarvelAd.getBannerid(), adMarvelAd.getSiteId()
                            });
                            message.addJavascriptInterface(obj1, "ADMARVEL_SPEECH");
                        }
                    }
                    catch (ClassNotFoundException classnotfoundexception)
                    {
                        Logging.log(classnotfoundexception.getMessage());
                    }
                    catch (InstantiationException instantiationexception)
                    {
                        Logging.log(instantiationexception.getMessage());
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        Logging.log(illegalaccessexception.getMessage());
                    }
                    catch (NoSuchMethodException nosuchmethodexception)
                    {
                        Logging.log(nosuchmethodexception.getMessage());
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        Logging.log(illegalargumentexception.getMessage());
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        Logging.log(invocationtargetexception.getMessage());
                    }
                    catch (NullPointerException nullpointerexception)
                    {
                        Logging.log(nullpointerexception.getMessage());
                    }
                }
                relativelayout.addView(message);
                if (interstitial || isTwoPartExpandState) goto _L2; else goto _L1
_L1:
                fullscreencontrols = new FullScreenControls(AdMarvelActivity.this, getApplicationContext(), GUID);
                fullscreencontrols.setVisibility(4);
                fullscreencontrols.setTag((new StringBuilder(String.valueOf(GUID))).append("CONTROLS").toString());
                relativelayout.addView(fullscreencontrols);
_L8:
                if (url == null || url.length() <= 0) goto _L4; else goto _L3
_L3:
                message.loadUrl(url);
_L6:
                return;
_L2:
                if (!isTwoPartExpandState)
                {
                    AdMarvelInternalWebView.setListener(GUID, admarvelActivityInternalListener);
                }
                continue; /* Loop/switch isn't completed */
_L4:
                if (!isTwoPartExpandable() || twoPartExpandUrl == null || twoPartExpandUrl.length() <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (AdMarvelInterstitialAds.enableOfflineSDK)
                {
                    if (URLUtil.isNetworkUrl(twoPartExpandUrl) && Utils.isNetworkAvailable(AdMarvelActivity.this))
                    {
                        message.loadUrl(twoPartExpandUrl);
                    }
                    if (!URLUtil.isNetworkUrl(twoPartExpandUrl))
                    {
                        Object obj = getSharedPreferences("admarvel_preferences", 0);
                        obj = (new StringBuilder(String.valueOf(((SharedPreferences) (obj)).getString("childDirectory", "NULL")))).append("/").append(((SharedPreferences) (obj)).getString("banner_folder", "NULL")).toString();
                        if (obj != null)
                        {
                            html = AdmarvelOfflineUtils.readData(((String) (obj)), twoPartExpandUrl);
                            Logging.log((new StringBuilder("Offline SDK:Admarvel XML Response:")).append(xml).toString());
                        }
                        message.loadDataWithBaseURL((new StringBuilder(String.valueOf(adMarvelAd.getOfflineBaseUrl()))).append("/").toString(), html, "text/html", "utf-8", null);
                    }
                } else
                {
                    message.loadUrl(twoPartExpandUrl);
                }
                if (!isCloseBtnEnabledForTwoPart)
                {
                    message.disableCloseButton(isCloseAreaEnabledForTwoPart);
                }
                if (twoPartOrientationState != null && twoPartOrientationState.length() > 0)
                {
                    disableActivityOrientation(twoPartOrientationState);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
                message.setBackgroundColor(backgroundColor);
                String s = (new StringBuilder("content://")).append(getPackageName()).append(".AdMarvelLocalFileContentProvider").toString();
                if (AdMarvelInterstitialAds.enableOfflineSDK)
                {
                    message.loadDataWithBaseURL((new StringBuilder(String.valueOf(adMarvelAd.getOfflineBaseUrl()))).append("/").toString(), html, "text/html", "utf-8", null);
                    return;
                }
                if (Version.getAndroidSDKVersion() < 11)
                {
                    message.loadDataWithBaseURL(s, html, "text/html", "utf-8", null);
                    return;
                }
                message.loadDataWithBaseURL("http://baseurl.admarvel.com", html, "text/html", "utf-8", null);
                return;
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                this$0 = AdMarvelActivity.this;
                super();
            }
        };
    }

    void closeActivity()
    {
        closehandler.sendEmptyMessage(0);
    }

    void disableActivityOrientation(String s)
    {
        Logging.log("disableActivityOrientation");
        if (Version.getAndroidSDKVersion() >= 9) goto _L2; else goto _L1
_L1:
        int j = getResources().getConfiguration().orientation;
_L8:
        if (s == null) goto _L4; else goto _L3
_L3:
        if (Version.getAndroidSDKVersion() >= 9)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (!s.equalsIgnoreCase("Portrait")) goto _L6; else goto _L5
_L5:
        setRequestedOrientation(1);
_L4:
        return;
_L2:
        GetOrientation getorientation;
        int i;
        getorientation = new GetOrientation(this);
        getorientation.run();
        i = 0x80000000;
_L9:
        j = i;
        if (i != 0x80000000) goto _L8; else goto _L7
_L7:
        i = getorientation.getCurrentOriention();
          goto _L9
          goto _L8
_L6:
        if (s.equalsIgnoreCase("LandscapeLeft"))
        {
            setRequestedOrientation(0);
            return;
        }
        if (!s.equalsIgnoreCase("Current")) goto _L4; else goto _L10
_L10:
        if (j == 1)
        {
            setRequestedOrientation(1);
            return;
        }
        if (j != 2) goto _L4; else goto _L11
_L11:
        setRequestedOrientation(0);
        return;
        if (s.equalsIgnoreCase("Portrait"))
        {
            setRequestedOrientation(1);
            return;
        }
        if (s.equalsIgnoreCase("LandscapeLeft"))
        {
            setRequestedOrientation(0);
            return;
        }
        if (s.equalsIgnoreCase("Current"))
        {
            if (j == 0)
            {
                handler.post(new SetOrientationRunnable(this, "Portrait"));
                return;
            }
            if (j == 1)
            {
                handler.post(new SetOrientationRunnable(this, "LandscapeLeft"));
                return;
            } else
            {
                handler.post(new SetOrientationRunnable(this, "none"));
                return;
            }
        } else
        {
            handler.post(new SetOrientationRunnable(this, s));
            return;
        }
    }

    public int getAdCloseCount()
    {
        return adCloseCount;
    }

    String getSource()
    {
        return source;
    }

    boolean isInterstitial()
    {
        return interstitial;
    }

    boolean isInterstitialClick()
    {
        return interstitialClick;
    }

    boolean isTwoPartExpandable()
    {
        return isTwoPartExpandState;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (Version.getAndroidSDKVersion() >= 11)
        {
            HardwareAccelerationManager.enable(this);
            handler.post(new ShowDialogRunnable(null));
        } else
        {
            showDialog(0);
        }
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            url = bundle.getString("url");
            source = bundle.getString("source");
            html = bundle.getString("html");
            xml = bundle.getString("xml");
            interstitial = bundle.getBoolean("isInterstitial", false);
            interstitialClick = bundle.getBoolean("isInterstitialClick", false);
            GUID = bundle.getString("GUID");
            byte abyte0[] = bundle.getByteArray("serialized_admarvelad");
            if (abyte0 != null)
            {
                try
                {
                    adMarvelAd = (AdMarvelAd)(new ObjectInputStream(new ByteArrayInputStream(abyte0))).readObject();
                }
                catch (Exception exception)
                {
                    Logging.log(Log.getStackTraceString(exception));
                }
            }
            backgroundColor = bundle.getInt("backgroundcolor");
            twoPartExpandUrl = bundle.getString("expand_url");
            if (twoPartExpandUrl != null && twoPartExpandUrl.length() > 0)
            {
                isTwoPartExpandState = true;
                isCloseBtnEnabledForTwoPart = bundle.getBoolean("closeBtnEnabled");
                isCloseAreaEnabledForTwoPart = bundle.getBoolean("closeAreaEnabled");
                twoPartOrientationState = bundle.getString("orientationState");
            }
        }
        if (!interstitial && (Build.MODEL.contains("Kindle") || Build.PRODUCT.contains("Kindle")))
        {
            getWindow().addFlags(256);
            getWindow().clearFlags(1024);
        } else
        {
            getWindow().setFlags(512, 512);
        }
        admarvelActivityInternalListener = new AdMarvelActivityInternalListener(this);
        bundle = new RelativeLayout(this);
        bundle.setId(LAYOUT_VIEW_ID);
        bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        bundle.setBackgroundColor(0xff000000);
        setContentView(bundle);
        (new AdMarvelInstallTracker(this)).registerTrackingEvent();
        if (interstitial)
        {
            AdMarvelInterstitialAds.getListener().onAdmarvelActivityLaunched(this);
        }
        if (Version.getAndroidSDKVersion() >= 11)
        {
            handler.post(new ExecuteAdMarvelActivityAsyncTaskPostAPI11(adMarvelAd));
            return;
        } else
        {
            (new AdMarvelActivityAsyncTask(this, adMarvelAd)).execute(new Object[0]);
            return;
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        super.onCreateDialog(i);
        AdMarvelProgressDialog admarvelprogressdialog = AdMarvelProgressDialog.newInstance(this);
        admarvelprogressdialog.setIcon(0);
        if (Version.getAndroidSDKVersion() >= 7)
        {
            admarvelprogressdialog.setTitle("Loading...");
            admarvelprogressdialog.setProgressStyle(1);
            admarvelprogressdialog.setMax(100);
            ShapeDrawable shapedrawable = new ShapeDrawable();
            shapedrawable.getPaint().setColor(Color.parseColor("#33B5E5"));
            admarvelprogressdialog.setProgressDrawable(new ClipDrawable(shapedrawable, 3, 1));
        } else
        {
            admarvelprogressdialog.setMessage("Loading...");
        }
        progressDialogReference = new WeakReference(admarvelprogressdialog);
        if (interstitial)
        {
            admarvelprogressdialog.setCancelable(false);
            isBackPressDisabled = true;
            handler.postDelayed(disableBackPressRunnable, 5000L);
        }
        return admarvelprogressdialog;
    }

    protected void onDestroy()
    {
        Object obj;
        if (progressDialogReference != null)
        {
            obj = (AdMarvelProgressDialog)progressDialogReference.get();
        } else
        {
            obj = null;
        }
        if (obj != null && ((AdMarvelProgressDialog) (obj)).isShowing())
        {
            ((AdMarvelProgressDialog) (obj)).signalShutdown();
            ((AdMarvelProgressDialog) (obj)).dismiss();
        }
        obj = AdMarvelSensorManager.getInstance();
        if (((AdMarvelSensorManager) (obj)).isListening())
        {
            ((AdMarvelSensorManager) (obj)).stopListening();
        }
        obj = new CleanUpBrightRollVideo(this);
        handler.post(((Runnable) (obj)));
        obj = (RelativeLayout)findViewById(LAYOUT_VIEW_ID);
        if (isTwoPartExpandable() && AdMarvelInternalWebView.getListener(GUID) != null)
        {
            AdMarvelInternalWebView.getListener(GUID).onCloseTwoPartExpand();
        }
        if (obj != null)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            if (admarvelinternalwebview != null && admarvelinternalwebview.visibilityCallback != null && admarvelinternalwebview.visibilityCallback.length() > 0 && admarvelinternalwebview.isViewDisplayed)
            {
                admarvelinternalwebview.injectJavaScript((new StringBuilder(String.valueOf(admarvelinternalwebview.visibilityCallback))).append("(").append(false).append(")").toString());
                admarvelinternalwebview.isViewDisplayed = false;
            }
        }
        if (obj != null)
        {
            AdMarvelInternalWebView admarvelinternalwebview1 = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            if (admarvelinternalwebview1 != null)
            {
                ((RelativeLayout) (obj)).removeView(admarvelinternalwebview1);
                admarvelinternalwebview1.loadUrl("");
                admarvelinternalwebview1.clearUnUsedObjects();
            }
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 4 4: default 28
    //                   4 35;
           goto _L2 _L3
_L2:
        return super.onKeyDown(i, keyevent);
_L3:
        if (isBackPressDisabled || isBackPressDisabledFromAd)
        {
            return false;
        }
        closeActivity();
        if (!isInterstitial() && AdMarvelInternalWebView.getListener(GUID) != null)
        {
            AdMarvelInternalWebView.getListener(GUID).onCloseInAppBrowser(GUID);
        }
        return true;
    }

    protected void onPause()
    {
        RelativeLayout relativelayout = (RelativeLayout)findViewById(LAYOUT_VIEW_ID);
        Object obj;
        if (progressDialogReference != null)
        {
            obj = (AdMarvelProgressDialog)progressDialogReference.get();
        } else
        {
            obj = null;
        }
        if (obj != null && ((AdMarvelProgressDialog) (obj)).isShowing())
        {
            ((AdMarvelProgressDialog) (obj)).signalShutdown();
            ((AdMarvelProgressDialog) (obj)).dismiss();
        }
        if (AdMarvelProgressDialog.getInstance() != null)
        {
            AdMarvelProgressDialog.destroyInstance();
        }
        if (relativelayout != null)
        {
            obj = (AdMarvelInternalWebView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            if (obj != null)
            {
                if (Version.getAndroidSDKVersion() >= 11)
                {
                    WebViewResumePause.onPause(((android.webkit.WebView) (obj)));
                } else
                {
                    WebViewResumePausePreAPI11.onPause(((android.webkit.WebView) (obj)));
                }
            }
        }
        if (!isFinishing() && interstitialBackgroundStateCallback != null && interstitialBackgroundStateCallback.length() > 0)
        {
            obj = (RelativeLayout)findViewById(LAYOUT_VIEW_ID);
            if (obj != null)
            {
                obj = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
                if (obj != null)
                {
                    ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(interstitialBackgroundStateCallback).append("()").toString());
                }
            }
        }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: pause");
        }
        catch (Exception exception) { }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        Object obj = (RelativeLayout)findViewById(LAYOUT_VIEW_ID);
        if (obj != null)
        {
            obj = (AdMarvelInternalWebView)((RelativeLayout) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
            if (obj != null)
            {
                if (Version.getAndroidSDKVersion() >= 11)
                {
                    WebViewResumePause.onResume(((android.webkit.WebView) (obj)));
                } else
                {
                    WebViewResumePausePreAPI11.onResume(((android.webkit.WebView) (obj)));
                }
                if (((AdMarvelInternalWebView) (obj)).visibilityCallback != null && ((AdMarvelInternalWebView) (obj)).visibilityCallback.length() > 0 && !((AdMarvelInternalWebView) (obj)).isViewDisplayed)
                {
                    ((AdMarvelInternalWebView) (obj)).injectJavaScript((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).visibilityCallback))).append("(").append(true).append(")").toString());
                    obj.isViewDisplayed = true;
                }
            }
        }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: resume");
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected void onStart()
    {
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: start");
        }
        catch (Exception exception) { }
        super.onStart();
    }

    protected void onStop()
    {
        if (Version.getAndroidSDKVersion() >= 7)
        {
            handler.post(new ExecuteOnStopRunnablePostAPI7(null));
        }
        try
        {
            AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).stop();
            Logging.log("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter: stop");
        }
        catch (Exception exception) { }
        super.onStop();
    }

    public void updateCloseInterstialAdCounter()
    {
        adCloseCount = adCloseCount + 1;
    }












































}
