// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.admarvel.android.util.Logging;
import com.admarvel.speechkit.speech.AudioPlayer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelView, GestureListener, Version, 
//            WebSettingInitializer, WebSettingInitializerPreAPI16, WebSettingInitializerPreAPI11, WebSettingInitializerPreAPI8, 
//            WebSettingInitializerPreAPI7, AdMarvelInternalWebViewPrivateListener, FullScreenControls, AdMarvelWebView, 
//            AdMarvelAd, Utils, AdMarvelWebViewListener, AdMarvelInterstitialAds, 
//            AdMarvelInterstitialAdListenerImpl, AdMarvelVideoActivity, CheckIfDownloadFromMarketURLPostAPI4

public class AdMarvelInternalWebView extends WebView
    implements android.view.View.OnTouchListener
{
    public static final class Action extends Enum
    {

        private static final Action ENUM$VALUES[];
        public static final Action PLAY_AUDIO;
        public static final Action PLAY_VIDEO;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/admarvel/android/ads/AdMarvelInternalWebView$Action, s);
        }

        public static Action[] values()
        {
            Action aaction[] = ENUM$VALUES;
            int i = aaction.length;
            Action aaction1[] = new Action[i];
            System.arraycopy(aaction, 0, aaction1, 0, i);
            return aaction1;
        }

        static 
        {
            PLAY_AUDIO = new Action("PLAY_AUDIO", 0);
            PLAY_VIDEO = new Action("PLAY_VIDEO", 1);
            ENUM$VALUES = (new Action[] {
                PLAY_AUDIO, PLAY_VIDEO
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

    private static class AdMarvelWebChromeClient extends WebChromeClient
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference contextReference;
        private View mCustomView;
        private FrameLayout mCustomViewContainer;
        private android.webkit.WebChromeClient.CustomViewCallback mcallback;

        public View getVideoLoadingProgressView()
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj == null)
            {
                return super.getVideoLoadingProgressView();
            }
            if (((AdMarvelInternalWebView) (obj)).signalShutdown)
            {
                return super.getVideoLoadingProgressView();
            }
            obj = (Context)contextReference.get();
            if (obj != null && (obj instanceof Activity))
            {
                obj = (Activity)obj;
                if (obj != null)
                {
                    obj = new ProgressBar(((Context) (obj)), null, 0x1010077);
                    ((ProgressBar) (obj)).setIndeterminate(true);
                    return ((View) (obj));
                }
            }
            return super.getVideoLoadingProgressView();
        }

        void handlebackkey()
        {
            onHideCustomView();
        }

        public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
        {
            for (AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || admarvelinternalwebview.signalShutdown;)
            {
                return;
            }

            callback.invoke(s, true, false);
        }

        public void onHideCustomView()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            super.onHideCustomView();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_15;
            while (mcallback == null) 
            {
                do
                {
                    return;
                } while (admarvelinternalwebview == null || admarvelinternalwebview.signalShutdown);
                if (mCustomViewContainer != null)
                {
                    Object obj = (Context)contextReference.get();
                    if (obj != null && (obj instanceof Activity))
                    {
                        obj = (Activity)obj;
                        if (obj != null)
                        {
                            obj = ((Activity) (obj)).getWindow();
                            ViewGroup viewgroup = (ViewGroup)((Window) (obj)).findViewById(0x1020002);
                            mCustomViewContainer.removeView(mCustomView);
                            mCustomView = null;
                            viewgroup.removeView(mCustomViewContainer);
                            mCustomViewContainer = null;
                            if (((Window) (obj)).getCurrentFocus() instanceof AdMarvelInternalWebView)
                            {
                                ((AdMarvelInternalWebView)((Window) (obj)).getCurrentFocus()).setOnKeyListener(null);
                            }
                        }
                    }
                }
            }
            mcallback.onCustomViewHidden();
            return;
            Exception exception;
            exception;
            exception.printStackTrace();
            return;
        }

        public void onProgressChanged(WebView webview, int i)
        {
            Object obj1 = null;
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
              goto _L3
_L17:
            if (((AdMarvelInternalWebView) (webview)).signalShutdown)
            {
                break; /* Loop/switch isn't completed */
            }
            if (webview.getParent() == null || !(webview.getParent() instanceof RelativeLayout)) goto _L5; else goto _L4
_L4:
            Object obj = (FullScreenControls)((RelativeLayout)webview.getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (webview)).GUID))).append("CONTROLS").toString());
_L15:
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            if (((AdMarvelInternalWebView) (webview)).init.get())
            {
                ((ProgressBar)((FullScreenControls) (obj)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (webview)).GUID))).append("PROGRESS_BAR").toString())).setProgress(i);
            }
            obj = (Context)contextReference.get();
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Activity activity;
            if (!(obj instanceof Activity))
            {
                break; /* Loop/switch isn't completed */
            }
            activity = (Activity)obj;
            if (activity == null)
            {
                break; /* Loop/switch isn't completed */
            }
            AdMarvelActivity admarvelactivity;
            if (!(activity instanceof AdMarvelActivity))
            {
                break; /* Loop/switch isn't completed */
            }
            admarvelactivity = (AdMarvelActivity)activity;
            if (admarvelactivity == null) goto _L7; else goto _L6
_L6:
            obj = obj1;
            try
            {
                if (admarvelactivity.progressDialogReference != null)
                {
                    obj = (AdMarvelActivity.AdMarvelProgressDialog)admarvelactivity.progressDialogReference.get();
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                Logging.log((new StringBuilder("Exception in onProgressChanged ")).append(webview.getMessage()).toString());
                return;
            }
            if (obj == null) goto _L7; else goto _L8
_L8:
            if (!((AdMarvelActivity.AdMarvelProgressDialog) (obj)).isShowing() || !((AdMarvelInternalWebView) (webview)).isInAppBrowser.get()) goto _L10; else goto _L9
_L9:
            if (i < 10) goto _L12; else goto _L11
_L11:
            if (((AdMarvelInternalWebView) (webview)).redirectionCheckCount > 2) goto _L13; else goto _L12
_L13:
            ((AdMarvelInternalWebView) (webview)).handler.post(new PageFinishedRunnable(webview, activity));
_L7:
            if (Version.getAndroidSDKVersion() < 14 || i != 100)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!((AdMarvelInternalWebView) (webview)).brightrollVideoStarted && admarvelactivity.isBrightRollVideoLoaded && !admarvelactivity.isAdMarvelVideo)
            {
                webview.brightrollVideoStarted = true;
                webview.loadUrl("javascript:AdApp.adView().play()");
                return;
            }
            break; /* Loop/switch isn't completed */
_L10:
            ((AdMarvelActivity.AdMarvelProgressDialog) (obj)).setProgress(i);
            if (true) goto _L7; else goto _L14
_L14:
            break; /* Loop/switch isn't completed */
_L5:
            obj = null;
              goto _L15
_L3:
            if (webview != null) goto _L17; else goto _L16
_L16:
            return;
_L2:
            webview = null;
              goto _L3
              goto _L17
_L12:
            if (i < 30) goto _L10; else goto _L13
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            super.onShowCustomView(view, customviewcallback);
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_17;
            if (admarvelinternalwebview != null && !admarvelinternalwebview.signalShutdown)
            {
                mcallback = customviewcallback;
                Object obj = (Context)contextReference.get();
                if (obj != null && (obj instanceof Activity))
                {
                    obj = (Activity)obj;
                    if (obj != null)
                    {
                        if (mCustomView != null)
                        {
                            customviewcallback.onCustomViewHidden();
                            return;
                        }
                        mCustomView = view;
                        customviewcallback = ((Activity) (obj)).getWindow();
                        ViewGroup viewgroup = (ViewGroup)customviewcallback.findViewById(0x1020002);
                        mCustomViewContainer = new FrameLayout(admarvelinternalwebview.getContext());
                        mCustomViewContainer.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                        LinearLayout linearlayout = new LinearLayout(admarvelinternalwebview.getContext());
                        linearlayout.setBackgroundColor(0xaa000000);
                        linearlayout.setGravity(53);
                        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                        layoutparams.weight = 40F;
                        linearlayout.setLayoutParams(layoutparams);
                        linearlayout.addView(new HTML5VideoControls(admarvelinternalwebview.getContext(), admarvelinternalwebview, this, ((Activity) (obj))));
                        mCustomViewContainer.addView(view);
                        mCustomViewContainer.addView(linearlayout);
                        mCustomViewContainer.setBackgroundColor(0xff000000);
                        if (view instanceof FrameLayout)
                        {
                            view = ((FrameLayout)view).getFocusedChild();
                            if (view instanceof VideoView)
                            {
                                ((VideoView)view).setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

                                    final AdMarvelWebChromeClient this$1;

                                    public boolean onError(MediaPlayer mediaplayer, int i, int j)
                                    {
                                        handlebackkey();
                                        return true;
                                    }

            
            {
                this$1 = AdMarvelWebChromeClient.this;
                super();
            }
                                });
                                if (customviewcallback.getCurrentFocus() instanceof AdMarvelInternalWebView)
                                {
                                    ((AdMarvelInternalWebView)customviewcallback.getCurrentFocus()).setOnKeyListener(new android.view.View.OnKeyListener() {

                                        final AdMarvelWebChromeClient this$1;

                                        public boolean onKey(View view, int i, KeyEvent keyevent)
                                        {
                                            if (keyevent.getAction() == 0 && i == 4)
                                            {
                                                if (mCustomView == null)
                                                {
                                                    return view.onKeyDown(i, keyevent);
                                                } else
                                                {
                                                    handlebackkey();
                                                    return true;
                                                }
                                            } else
                                            {
                                                return false;
                                            }
                                        }

            
            {
                this$1 = AdMarvelWebChromeClient.this;
                super();
            }
                                    });
                                }
                                view.setOnKeyListener(new android.view.View.OnKeyListener() {

                                    final AdMarvelWebChromeClient this$1;

                                    public boolean onKey(View view, int i, KeyEvent keyevent)
                                    {
                                        if (keyevent.getAction() == 0 && i == 4)
                                        {
                                            if (mCustomView == null)
                                            {
                                                return view.onKeyDown(i, keyevent);
                                            } else
                                            {
                                                handlebackkey();
                                                return true;
                                            }
                                        } else
                                        {
                                            return false;
                                        }
                                    }

            
            {
                this$1 = AdMarvelWebChromeClient.this;
                super();
            }
                                });
                            }
                        }
                        viewgroup.addView(mCustomViewContainer);
                        return;
                    }
                }
            }
            return;
        }


        public AdMarvelWebChromeClient(AdMarvelInternalWebView admarvelinternalwebview, Context context)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            contextReference = new WeakReference(context);
        }
    }

    private static class AdMarvelWebViewClient extends WebViewClient
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference contextReference;

        public void onLoadResource(WebView webview, String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || admarvelinternalwebview.signalShutdown;)
            {
                return;
            }

            if (s != null && admarvelinternalwebview.isTwoPartAdLoadingWithoutMraidInjection && s.contains("mraid.js"))
            {
                webview.loadUrl("javascript: (function() { var script=document.createElement('script');script.type='text/javascript';script.src='http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js';document.getElementsByTagName('head').item(0).appendChild(script);})()");
                admarvelinternalwebview.isTwoPartAdLoadingWithoutMraidInjection = false;
            }
            super.onLoadResource(webview, s);
        }

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_17;
            if (webview != null && !((AdMarvelInternalWebView) (webview)).signalShutdown)
            {
                s = (Context)contextReference.get();
                if (s != null && !((AdMarvelInternalWebView) (webview)).signalShutdown)
                {
                    ((AdMarvelInternalWebView) (webview)).handler.post(new PageFinishedRunnable(webview, s));
                    return;
                }
            }
            return;
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            bitmap = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_11;
            if (bitmap != null && !((AdMarvelInternalWebView) (bitmap)).signalShutdown && ((AdMarvelInternalWebView) (bitmap)).enableFullScreenControls.get())
            {
                s = null;
                webview = s;
                if (bitmap.getParent() != null)
                {
                    webview = s;
                    if (bitmap.getParent() instanceof RelativeLayout)
                    {
                        webview = (FullScreenControls)((RelativeLayout)bitmap.getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("CONTROLS").toString());
                    }
                }
                if (webview != null && ((AdMarvelInternalWebView) (bitmap)).init.get())
                {
                    webview.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("PROGRESS_BAR").toString()).setVisibility(0);
                    return;
                }
            }
            return;
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            webview = (Context)contextReference.get();
            if (webview != null && (webview instanceof Activity))
            {
                webview = (Activity)webview;
                if (webview != null && (webview instanceof AdMarvelActivity))
                {
                    webview = (AdMarvelActivity)webview;
                    if (webview != null)
                    {
                        webview.closeActivity();
                    }
                }
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
        {
            boolean flag;
            flag = false;
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return null;
            }
            if (admarvelinternalwebview.signalShutdown)
            {
                return null;
            }
            if (s == null)
            {
                return null;
            }
            if (!s.equals("http://baseurl.admarvel.com/mraid.js")) goto _L2; else goto _L1
_L1:
            Object obj;
            byte abyte0[];
            byte abyte1[];
            Buffer buffer1;
            int i;
            int k;
            int l;
            try
            {
                obj = (HttpURLConnection)(new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js")).openConnection();
                ((HttpURLConnection) (obj)).setRequestMethod("GET");
                ((HttpURLConnection) (obj)).setDoOutput(false);
                ((HttpURLConnection) (obj)).setDoInput(true);
                ((HttpURLConnection) (obj)).setUseCaches(false);
                ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                ((HttpURLConnection) (obj)).setRequestProperty("Content-Length", "0");
                ((HttpURLConnection) (obj)).setConnectTimeout(2000);
                ((HttpURLConnection) (obj)).setReadTimeout(10000);
                i = ((HttpURLConnection) (obj)).getResponseCode();
                int j = ((HttpURLConnection) (obj)).getContentLength();
                Logging.log((new StringBuilder("Error Code: ")).append(i).toString());
                Logging.log((new StringBuilder("Content Length: ")).append(j).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return super.shouldInterceptRequest(webview, s);
            }
            if (i != 200) goto _L4; else goto _L3
_L3:
            abyte0 = (InputStream)((HttpURLConnection) (obj)).getContent();
            obj = new ArrayList();
            k = 0;
            i = 8192;
_L10:
            if (i != '\uFFFF') goto _L6; else goto _L5
_L5:
            abyte0.close();
            if (k <= 0)
            {
                break MISSING_BLOCK_LABEL_428;
            }
            abyte0 = new byte[k];
            i = 0;
            k = ((flag) ? 1 : 0);
_L11:
            if (i < ((List) (obj)).size()) goto _L8; else goto _L7
_L7:
            obj = new String(abyte0);
            webview = ((WebView) (obj));
_L12:
            return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(webview.getBytes()));
_L6:
            abyte1 = new byte[8192];
            l = abyte0.read(abyte1, 0, 8192);
            i = l;
            if (l <= 0) goto _L10; else goto _L9
_L9:
            buffer1 = new Buffer(null);
            buffer1.buffer = abyte1;
            buffer1.bytes = l;
            k += l;
            ((List) (obj)).add(buffer1);
            i = l;
              goto _L10
_L8:
            Buffer buffer = (Buffer)((List) (obj)).get(i);
            System.arraycopy(buffer.buffer, 0, abyte0, k, buffer.bytes);
            k += buffer.bytes;
            i++;
              goto _L11
_L4:
            obj = super.shouldInterceptRequest(webview, s);
            return ((WebResourceResponse) (obj));
_L2:
            return super.shouldInterceptRequest(webview, s);
            webview = "";
              goto _L12
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return false;
            }
            if (admarvelinternalwebview.signalShutdown)
            {
                return false;
            }
            admarvelinternalwebview.redirectionCheckCount = admarvelinternalwebview.redirectionCheckCount + 1;
            webview = (Context)contextReference.get();
            if (webview == null || !(webview instanceof Activity)) goto _L2; else goto _L1
_L1:
            Activity activity = (Activity)webview;
            if (activity == null || !(activity instanceof AdMarvelActivity)) goto _L2; else goto _L3
_L3:
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)activity;
            if (admarvelactivity == null) goto _L2; else goto _L4
_L4:
            if (admarvelactivity.progressDialogReference != null)
            {
                webview = (AdMarvelActivity.AdMarvelProgressDialog)admarvelactivity.progressDialogReference.get();
            } else
            {
                webview = null;
            }
            if (webview != null && webview.isShowing() && webview.getProgress() >= 10 && admarvelinternalwebview.redirectionCheckCount > 2 && admarvelinternalwebview.isInAppBrowser.get())
            {
                admarvelinternalwebview.handler.post(new PageFinishedRunnable(admarvelinternalwebview, activity));
            }
            if (Utils.handledBySpecialIntents(admarvelinternalwebview.getContext(), s))
            {
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                if (!admarvelactivity.isInterstitial())
                {
                    admarvelactivity.closeActivity();
                }
                if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
                {
                    AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
                }
                return true;
            }
            if (admarvelactivity.isInterstitial()) goto _L6; else goto _L5
_L5:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelsdk") == Utils.PROTOCOL_TYPE.NONE) goto _L8; else goto _L7
_L7:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L10; else goto _L9
_L9:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L11:
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L10:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()));
            }
            if (true) goto _L11; else goto _L8
_L8:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelinternal") == Utils.PROTOCOL_TYPE.NONE) goto _L13; else goto _L12
_L12:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L15; else goto _L14
_L14:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L16:
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L15:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()));
            }
            if (true) goto _L16; else goto _L13
_L13:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L18; else goto _L17
_L17:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L20; else goto _L19
_L19:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L21:
            webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
            s = new Intent("android.intent.action.VIEW");
            s.addFlags(0x10000000);
            s.setDataAndType(Uri.parse(webview), "video/*");
            admarvelinternalwebview.getContext().startActivity(s);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L20:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            if (true) goto _L21; else goto _L18
_L18:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L23; else goto _L22
_L22:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L25; else goto _L24
_L24:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L38:
            webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isCustomUrl", true);
            webview.putExtra("xml", admarvelinternalwebview.xml);
            webview.putExtra("GUID", admarvelinternalwebview.GUID);
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
_L2:
            return Version.getAndroidSDKVersion() >= 4 && CheckIfDownloadFromMarketURLPostAPI4.handleUrl(s, admarvelinternalwebview.getContext());
_L25:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            continue; /* Loop/switch isn't completed */
_L23:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
                webview.addFlags(0x10000000);
                if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
                {
                    admarvelinternalwebview.getContext().startActivity(webview);
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                admarvelactivity.closeActivity();
            }
              goto _L2
_L6:
            if (!admarvelactivity.isInterstitial()) goto _L2; else goto _L26
_L26:
            if (!AdMarvelInterstitialAds.getEnableClickRedirect()) goto _L28; else goto _L27
_L27:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelsdk") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (adMarvelAd != null)
                {
                    AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelinternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (adMarvelAd != null)
                {
                    AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                return true;
            }
            if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L30; else goto _L29
_L29:
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setDataAndType(Uri.parse(webview), "video/*");
            if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), intent))
            {
                admarvelinternalwebview.getContext().startActivity(intent);
            }
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
_L28:
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            return true;
_L30:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L32; else goto _L31
_L31:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L34; else goto _L33
_L33:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L35:
            webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isCustomUrl", true);
            webview.putExtra("isInterstitial", false);
            webview.putExtra("isInterstitialClick", true);
            webview.putExtra("xml", admarvelinternalwebview.xml);
            webview.putExtra("GUID", admarvelinternalwebview.GUID);
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            continue; /* Loop/switch isn't completed */
_L34:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            if (true) goto _L35; else goto _L32
_L32:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
                webview.addFlags(0x10000000);
                if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
                {
                    admarvelinternalwebview.getContext().startActivity(webview);
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            } else
            if (admarvelinternalwebview.enableAutoDetect.get() && s != null && s.length() > 0)
            {
                webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelActivity);
                webview.addFlags(0x10000000);
                webview.putExtra("url", s);
                webview.putExtra("isInterstitial", false);
                webview.putExtra("isInterstitialClick", true);
                webview.putExtra("xml", admarvelinternalwebview.xml);
                webview.putExtra("GUID", admarvelinternalwebview.GUID);
                adMarvelAd.removeNonStringEntriesTargetParam();
                try
                {
                    if (adMarvelAd != null)
                    {
                        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
                        objectoutputstream.writeObject(adMarvelAd);
                        objectoutputstream.close();
                        webview.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
                    }
                }
                catch (IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
                if (admarvelactivity.getSource() != null)
                {
                    webview.putExtra("source", admarvelactivity.getSource());
                }
                admarvelinternalwebview.getContext().startActivity(webview);
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            }
            if (true) goto _L28; else goto _L36
_L36:
            if (true) goto _L38; else goto _L37
_L37:
        }

        public AdMarvelWebViewClient(AdMarvelInternalWebView admarvelinternalwebview, Context context, AdMarvelAd admarvelad)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            contextReference = new WeakReference(context);
            adMarvelAd = admarvelad;
        }
    }

    private static class AdMarvelWebViewClientPreApi11 extends WebViewClient
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference contextReference;

        public void onLoadResource(WebView webview, String s)
        {
            super.onLoadResource(webview, s);
            AdMarvelInternalWebView admarvelinternalwebview;
            for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || admarvelinternalwebview.signalShutdown || !admarvelinternalwebview.isTwoPartAdLoadingWithoutMraidInjection || !s.contains("mraid.js");)
            {
                return;
            }

            webview.loadUrl("javascript: (function() { var script=document.createElement('script');script.type='text/javascript';script.src='http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js';document.getElementsByTagName('head').item(0).appendChild(script);})()");
            admarvelinternalwebview.isTwoPartAdLoadingWithoutMraidInjection = false;
        }

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_17;
            if (webview != null && !((AdMarvelInternalWebView) (webview)).signalShutdown)
            {
                s = (Context)contextReference.get();
                if (s != null && !((AdMarvelInternalWebView) (webview)).signalShutdown)
                {
                    ((AdMarvelInternalWebView) (webview)).handler.post(new PageFinishedRunnable(webview, s));
                    return;
                }
            }
            return;
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            bitmap = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_11;
            if (bitmap != null && !((AdMarvelInternalWebView) (bitmap)).signalShutdown && ((AdMarvelInternalWebView) (bitmap)).enableFullScreenControls.get())
            {
                s = null;
                webview = s;
                if (bitmap.getParent() != null)
                {
                    webview = s;
                    if (bitmap.getParent() instanceof RelativeLayout)
                    {
                        webview = (FullScreenControls)((RelativeLayout)bitmap.getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("CONTROLS").toString());
                    }
                }
                if (webview != null && ((AdMarvelInternalWebView) (bitmap)).init.get())
                {
                    webview.findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (bitmap)).GUID))).append("PROGRESS_BAR").toString()).setVisibility(0);
                    return;
                }
            }
            return;
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            webview = (Context)contextReference.get();
            if (webview != null && (webview instanceof Activity))
            {
                webview = (Activity)webview;
                if (webview != null && (webview instanceof AdMarvelActivity))
                {
                    webview = (AdMarvelActivity)webview;
                    if (webview != null)
                    {
                        webview.closeActivity();
                    }
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return false;
            }
            if (admarvelinternalwebview.signalShutdown)
            {
                return false;
            }
            admarvelinternalwebview.redirectionCheckCount = admarvelinternalwebview.redirectionCheckCount + 1;
            webview = (Context)contextReference.get();
            if (webview == null || !(webview instanceof Activity)) goto _L2; else goto _L1
_L1:
            Activity activity = (Activity)webview;
            if (activity == null || !(activity instanceof AdMarvelActivity)) goto _L2; else goto _L3
_L3:
            AdMarvelActivity admarvelactivity = (AdMarvelActivity)activity;
            if (admarvelactivity == null) goto _L2; else goto _L4
_L4:
            if (admarvelactivity.progressDialogReference != null)
            {
                webview = (AdMarvelActivity.AdMarvelProgressDialog)admarvelactivity.progressDialogReference.get();
            } else
            {
                webview = null;
            }
            if (webview != null && webview.isShowing() && webview.getProgress() >= 10 && admarvelinternalwebview.redirectionCheckCount > 2 && admarvelinternalwebview.isInAppBrowser.get())
            {
                admarvelinternalwebview.handler.post(new PageFinishedRunnable(admarvelinternalwebview, activity));
            }
            if (Utils.handledBySpecialIntents(admarvelinternalwebview.getContext(), s))
            {
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                if (!admarvelactivity.isInterstitial())
                {
                    admarvelactivity.closeActivity();
                }
                return true;
            }
            if (admarvelactivity.isInterstitial()) goto _L6; else goto _L5
_L5:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelsdk") == Utils.PROTOCOL_TYPE.NONE) goto _L8; else goto _L7
_L7:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L10; else goto _L9
_L9:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L11:
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L10:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()));
            }
            if (true) goto _L11; else goto _L8
_L8:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelinternal") == Utils.PROTOCOL_TYPE.NONE) goto _L13; else goto _L12
_L12:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L15; else goto _L14
_L14:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L16:
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L15:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()));
            }
            if (true) goto _L16; else goto _L13
_L13:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L18; else goto _L17
_L17:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L20; else goto _L19
_L19:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L21:
            webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
            s = new Intent("android.intent.action.VIEW");
            s.addFlags(0x10000000);
            s.setDataAndType(Uri.parse(webview), "video/*");
            admarvelinternalwebview.getContext().startActivity(s);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
            return true;
_L20:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            if (true) goto _L21; else goto _L18
_L18:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L23; else goto _L22
_L22:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L25; else goto _L24
_L24:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L38:
            webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isCustomUrl", true);
            webview.putExtra("xml", admarvelinternalwebview.xml);
            webview.putExtra("GUID", admarvelinternalwebview.GUID);
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            admarvelactivity.closeActivity();
_L2:
            return Version.getAndroidSDKVersion() >= 4 && CheckIfDownloadFromMarketURLPostAPI4.handleUrl(s, admarvelinternalwebview.getContext());
_L25:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            continue; /* Loop/switch isn't completed */
_L23:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
                webview.addFlags(0x10000000);
                if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
                {
                    admarvelinternalwebview.getContext().startActivity(webview);
                }
                admarvelinternalwebview.getContext().startActivity(webview);
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                admarvelactivity.closeActivity();
            }
              goto _L2
_L6:
            if (!admarvelactivity.isInterstitial()) goto _L2; else goto _L26
_L26:
            if (!AdMarvelInterstitialAds.getEnableClickRedirect()) goto _L28; else goto _L27
_L27:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelsdk") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (adMarvelAd != null)
                {
                    AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                return true;
            }
            if (s != null && Utils.isPrivateProtocol(s, "admarvelinternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (adMarvelAd != null)
                {
                    AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), admarvelinternalwebview.getContext()), adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
                return true;
            }
            if (s == null || Utils.isPrivateProtocol(s, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L30; else goto _L29
_L29:
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), admarvelinternalwebview.getContext());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setDataAndType(Uri.parse(webview), "video/*");
            if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), intent))
            {
                admarvelinternalwebview.getContext().startActivity(intent);
            }
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
_L28:
            if (adMarvelAd != null)
            {
                AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
            }
            return true;
_L30:
            if (s == null || Utils.isPrivateProtocol(s, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L32; else goto _L31
_L31:
            if (!admarvelactivity.isInterstitialClick() || adMarvelAd == null) goto _L34; else goto _L33
_L33:
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelactivity, s, adMarvelAd.getSiteId(), adMarvelAd.getId(), adMarvelAd.getTargetParams(), adMarvelAd.getIpAddress());
_L35:
            webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isCustomUrl", true);
            webview.putExtra("isInterstitial", false);
            webview.putExtra("isInterstitialClick", true);
            webview.putExtra("xml", admarvelinternalwebview.xml);
            webview.putExtra("GUID", admarvelinternalwebview.GUID);
            admarvelinternalwebview.getContext().startActivity(webview);
            (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            continue; /* Loop/switch isn't completed */
_L34:
            if (AdMarvelWebView.getListener(admarvelinternalwebview.GUID) != null && adMarvelAd != null)
            {
                AdMarvelWebView.getListener(admarvelinternalwebview.GUID).onClickAd(adMarvelAd, s);
            }
            if (true) goto _L35; else goto _L32
_L32:
            if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), admarvelinternalwebview.getContext())));
                webview.addFlags(0x10000000);
                if (Utils.isIntentAvailable(admarvelinternalwebview.getContext(), webview))
                {
                    admarvelinternalwebview.getContext().startActivity(webview);
                }
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            } else
            if (admarvelinternalwebview.enableAutoDetect.get() && s != null && s.length() > 0)
            {
                webview = new Intent(admarvelinternalwebview.getContext(), com/admarvel/android/ads/AdMarvelActivity);
                webview.addFlags(0x10000000);
                webview.putExtra("url", s);
                webview.putExtra("isInterstitial", false);
                webview.putExtra("isInterstitialClick", true);
                webview.putExtra("xml", admarvelinternalwebview.xml);
                webview.putExtra("GUID", admarvelinternalwebview.GUID);
                adMarvelAd.removeNonStringEntriesTargetParam();
                try
                {
                    if (adMarvelAd != null)
                    {
                        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
                        objectoutputstream.writeObject(adMarvelAd);
                        objectoutputstream.close();
                        webview.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
                    }
                }
                catch (IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
                if (admarvelactivity.getSource() != null)
                {
                    webview.putExtra("source", admarvelactivity.getSource());
                }
                admarvelinternalwebview.getContext().startActivity(webview);
                (new Utils(admarvelinternalwebview.getContext(), admarvelinternalwebview.handler)).registerTrackingEvent(admarvelinternalwebview.xml);
            }
            if (true) goto _L28; else goto _L36
_L36:
            if (true) goto _L38; else goto _L37
_L37:
        }

        public AdMarvelWebViewClientPreApi11(AdMarvelInternalWebView admarvelinternalwebview, Context context, AdMarvelAd admarvelad)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            contextReference = new WeakReference(context);
            adMarvelAd = admarvelad;
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

        Buffer(Buffer buffer1)
        {
            this();
        }
    }

    private static class DisableCloseRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference contextReference;
        private boolean isDisabling;

        public void run()
        {
            Object obj;
            obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_11;
            while (true) 
            {
                Object obj1;
                do
                {
                    do
                    {
                        return;
                    } while (obj == null || ((AdMarvelInternalWebView) (obj)).signalShutdown);
                    obj1 = (Activity)(Context)contextReference.get();
                    if (obj1 == null)
                    {
                        continue;
                    }
                    obj1 = (ViewGroup)((Activity) (obj1)).getWindow().findViewById(0x1020002);
                    if (!isDisabling)
                    {
                        break;
                    }
                    if (!((AdMarvelInternalWebView) (obj)).enableCloseAreaOnly)
                    {
                        obj1 = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
                        if (obj1 != null && ((AdMarvelInternalWebView) (obj)).disableCloseButton)
                        {
                            ((LinearLayout) (obj1)).setVisibility(8);
                            return;
                        }
                    } else
                    {
                        obj = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
                        if (obj != null)
                        {
                            ((Button) (obj)).setVisibility(4);
                            return;
                        }
                    }
                } while (true);
                LinearLayout linearlayout = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
                if (linearlayout != null)
                {
                    if (linearlayout.getVisibility() != 0)
                    {
                        linearlayout.setVisibility(0);
                    }
                    obj = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
                    if (obj != null && ((Button) (obj)).getVisibility() != 0)
                    {
                        ((Button) (obj)).setVisibility(0);
                        return;
                    }
                }
            }
        }

        public DisableCloseRunnable(AdMarvelInternalWebView admarvelinternalwebview, Context context, Boolean boolean1)
        {
            isDisabling = true;
            contextReference = new WeakReference(context);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            isDisabling = boolean1.booleanValue();
        }
    }

    private static class HTML5VideoControls extends LinearLayout
    {

        private final WeakReference adMarvelActivityReference;
        private final WeakReference adMarvelInternalWebViewReference;
        private final AdMarvelWebChromeClient madMarvelWebChromeClient;

        private void addCloseButton(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || admarvelinternalwebview.signalShutdown;)
            {
                return;
            }

            Button button = new Button(context);
            RelativeLayout relativelayout = new RelativeLayout(context);
            relativelayout.setLayoutParams(layoutparams1);
            context = new LinearLayout(context);
            context.setLayoutParams(layoutparams);
            Paint paint;
            Paint paint1;
            if (madMarvelWebChromeClient != null)
            {
                context.setOnClickListener(new android.view.View.OnClickListener() {

                    final HTML5VideoControls this$1;

                    public void onClick(View view)
                    {
                        madMarvelWebChromeClient.handlebackkey();
                    }

            
            {
                this$1 = HTML5VideoControls.this;
                super();
            }
                });
            } else
            {
                context.setOnClickListener(admarvelinternalwebview. new android.view.View.OnClickListener() {

                    final HTML5VideoControls this$1;
                    private final AdMarvelInternalWebView val$adMarvelInternalWebView;

                    public void onClick(View view)
                    {
                        view = (Activity)adMarvelActivityReference.get();
                        if (view != null && (view instanceof AdMarvelActivity))
                        {
                            AdMarvelActivity admarvelactivity = (AdMarvelActivity)view;
                            if (admarvelactivity.isTwoPartExpandable())
                            {
                                if (AdMarvelInternalWebView.getListener(adMarvelInternalWebView.GUID) != null)
                                {
                                    AdMarvelInternalWebView.getListener(adMarvelInternalWebView.GUID).onCloseTwoPartExpand();
                                }
                                view.finish();
                            } else
                            {
                                boolean flag = AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
                                admarvelactivity.updateCloseInterstialAdCounter();
                                if (admarvelactivity.interstitialCloseCallback != null && admarvelactivity.interstitialCloseCallback.length() > 0)
                                {
                                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(admarvelactivity.interstitialCloseCallback).append("()").toString());
                                }
                                if (!flag)
                                {
                                    view.finish();
                                }
                                if (admarvelactivity.getAdCloseCount() > 2)
                                {
                                    admarvelactivity.finish();
                                    return;
                                }
                            }
                        }
                    }

            
            {
                this$1 = final_html5videocontrols;
                adMarvelInternalWebView = AdMarvelInternalWebView.this;
                super();
            }
                });
            }
            button.setLayoutParams(layoutparams);
            button.setDuplicateParentStateEnabled(true);
            button.setClickable(false);
            layoutparams = Bitmap.createBitmap(50, 50, android.graphics.Bitmap.Config.ARGB_8888);
            layoutparams1 = new Canvas(layoutparams);
            paint = new Paint();
            paint.setColor(-1);
            paint.setStrokeWidth(4F);
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint1 = new Paint();
            paint1.setColor(0xff000000);
            paint1.setAntiAlias(true);
            paint1.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            layoutparams1.drawCircle(25F, 25F, 18F, paint);
            layoutparams1.drawCircle(25F, 25F, 14F, paint1);
            layoutparams1.drawLine(18F, 18F, 32F, 32F, paint);
            layoutparams1.drawLine(18F, 32F, 32F, 18F, paint);
            button.setBackgroundDrawable(new BitmapDrawable(layoutparams));
            button.setTag((new StringBuilder(String.valueOf(admarvelinternalwebview.GUID))).append("BTN_CLOSE_IMAGE").toString());
            context.addView(button);
            relativelayout.addView(context);
            addView(relativelayout);
        }

        private void configureButton(Context context)
        {
            setBackgroundColor(0);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.weight = 1.0F;
            layoutparams.width = 0;
            layoutparams.gravity = 5;
            setLayoutParams(layoutparams);
            layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.weight = 25F;
            layoutparams.gravity = 5;
            float f = TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams((int)f, (int)f);
            layoutparams1.addRule(11);
            addCloseButton(context, layoutparams1, layoutparams);
        }



        public HTML5VideoControls(Context context, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebChromeClient admarvelwebchromeclient, Activity activity)
        {
            super(context);
            madMarvelWebChromeClient = admarvelwebchromeclient;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelActivityReference = new WeakReference(activity);
            configureButton(context);
        }
    }

    private class InjectJSRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private String injection;
        final AdMarvelInternalWebView this$0;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            if (adMarvelInternalWebViewReference != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(injection).toString());
                    return;
                }
            }
        }

        public InjectJSRunnable(AdMarvelInternalWebView admarvelinternalwebview1, String s)
        {
            this$0 = AdMarvelInternalWebView.this;
            super();
            injection = null;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview1);
            injection = s;
        }
    }

    private static class PageFinishedRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference contextReference;

        public void run()
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
              goto _L3
_L26:
            if (((AdMarvelInternalWebView) (obj)).signalShutdown)
            {
                break; /* Loop/switch isn't completed */
            }
            if (contextReference == null) goto _L5; else goto _L4
_L4:
            Object obj1 = (Context)contextReference.get();
_L21:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2;
            if (!(obj1 instanceof Activity))
            {
                break; /* Loop/switch isn't completed */
            }
            obj2 = (Activity)obj1;
            LinearLayout linearlayout;
            if (obj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                obj1 = (ViewGroup)((Activity) (obj2)).getWindow().findViewById(0x1020002);
                linearlayout = (LinearLayout)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log((new StringBuilder("Exception")).append(((Exception) (obj)).getMessage()).toString());
                return;
            }
            if (linearlayout == null) goto _L7; else goto _L6
_L6:
            if (!((AdMarvelInternalWebView) (obj)).disableCloseButton) goto _L9; else goto _L8
_L8:
            if (((AdMarvelInternalWebView) (obj)).enableCloseAreaOnly) goto _L11; else goto _L10
_L10:
            linearlayout.setVisibility(8);
_L7:
            if (!((AdMarvelInternalWebView) (obj)).enableFullScreenControls.get())
            {
                break; /* Loop/switch isn't completed */
            }
            if (((AdMarvelInternalWebView) (obj)).getParent() == null || !(((AdMarvelInternalWebView) (obj)).getParent() instanceof RelativeLayout))
            {
                break MISSING_BLOCK_LABEL_416;
            }
            obj1 = (FullScreenControls)((RelativeLayout)((AdMarvelInternalWebView) (obj)).getParent()).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("CONTROLS").toString());
_L24:
            if (!((AdMarvelInternalWebView) (obj)).init.compareAndSet(false, true)) goto _L13; else goto _L12
_L12:
            if (obj2 == null) goto _L15; else goto _L14
_L14:
            if (!(obj2 instanceof AdMarvelActivity)) goto _L15; else goto _L16
_L16:
            obj2 = (AdMarvelActivity)obj2;
            if (obj2 == null) goto _L15; else goto _L17
_L17:
            if (((AdMarvelActivity) (obj2)).progressDialogReference == null) goto _L19; else goto _L18
_L18:
            obj2 = (AdMarvelActivity.AdMarvelProgressDialog)((AdMarvelActivity) (obj2)).progressDialogReference.get();
_L23:
            if (obj2 == null) goto _L15; else goto _L20
_L20:
            ((AdMarvelActivity.AdMarvelProgressDialog) (obj2)).dismiss();
_L15:
            ((AdMarvelInternalWebView) (obj)).clearHistory();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_270;
            }
            ((FullScreenControls) (obj1)).setVisibility(0);
            ((AdMarvelInternalWebView) (obj)).setVisibility(0);
_L13:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((AdMarvelInternalWebView) (obj)).init.get())
            {
                ((FullScreenControls) (obj1)).updateButtonStates();
                ((FullScreenControls) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("PROGRESS_BAR").toString()).setVisibility(8);
                return;
            }
            break; /* Loop/switch isn't completed */
_L5:
            obj1 = null;
              goto _L21
_L11:
            linearlayout.setVisibility(0);
            obj1 = (Button)((ViewGroup) (obj1)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelInternalWebView) (obj)).GUID))).append("BTN_CLOSE_IMAGE").toString());
            if (obj1 == null) goto _L7; else goto _L22
_L22:
            ((Button) (obj1)).setVisibility(4);
              goto _L7
_L9:
            linearlayout.setVisibility(0);
              goto _L7
_L19:
            obj2 = null;
              goto _L23
            obj1 = null;
              goto _L24
_L3:
            if (obj != null) goto _L26; else goto _L25
_L25:
            return;
_L2:
            obj = null;
              goto _L3
            if (true) goto _L26; else goto _L27
_L27:
        }

        public PageFinishedRunnable(AdMarvelInternalWebView admarvelinternalwebview, Context context)
        {
            contextReference = new WeakReference(context);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }

    private class PlayAudioRunnable
        implements Runnable
    {

        Bundle data;
        final AdMarvelInternalWebView this$0;

        public void run()
        {
            if (data != null)
            {
                String s = data.getString("expand_url");
                if (s != null)
                {
                    s.indexOf("http");
                }
                Logging.log("playAudioImpl(), getting audioPlayer");
                if (audioPlayer == null)
                {
                    audioPlayer = new AudioPlayer(getContext(), AdMarvelInternalWebView.this);
                }
                audioPlayer.loadContent(data);
                audioPlayer.playAudio();
            }
        }

        public PlayAudioRunnable(Bundle bundle)
        {
            this$0 = AdMarvelInternalWebView.this;
            super();
            data = null;
            data = bundle;
        }
    }

    private class ViewViewableRunnable
        implements Runnable
    {

        private long CALLBACK_TIME_INTERVAL;
        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        private Rect adViewRect;
        private boolean isVisible;
        private boolean lastVisibleSatatus;
        final AdMarvelInternalWebView this$0;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            Object obj;
            obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            for (admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(); admarvelinternalwebview == null || obj == null || admarvelinternalwebview.signalShutdown;)
            {
                return;
            }

            if (((AdMarvelWebView) (obj)).getHeight() == 0 && lastVisibleSatatus != isVisible && !isViewDisplayed)
            {
                isViewDisplayed = true;
                String s1 = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(true).append(")").toString();
                Logging.log(s1);
                loadUrl(s1);
                lastVisibleSatatus = isVisible;
            }
            if (obj == null || !((AdMarvelWebView) (obj)).getLocalVisibleRect(adViewRect) || isVisible || isViewDisplayed) goto _L2; else goto _L1
_L1:
            isVisible = true;
            isViewDisplayed = true;
            if (visibilityCallback != null)
            {
                obj = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(true).append(")").toString();
                Logging.log(((String) (obj)));
                loadUrl(((String) (obj)));
            }
_L4:
            admarvelinternalwebview.handler.removeCallbacks(this);
            admarvelinternalwebview.handler.postAtTime(this, SystemClock.uptimeMillis() + CALLBACK_TIME_INTERVAL);
            return;
_L2:
            if (obj != null && !((AdMarvelWebView) (obj)).getLocalVisibleRect(adViewRect) && isVisible && isViewDisplayed)
            {
                isViewDisplayed = false;
                isVisible = false;
                String s = (new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(false).append(")").toString();
                Logging.log(s);
                loadUrl(s);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public ViewViewableRunnable(AdMarvelInternalWebView admarvelinternalwebview1, Context context, AdMarvelWebView admarvelwebview)
        {
            this$0 = AdMarvelInternalWebView.this;
            super();
            CALLBACK_TIME_INTERVAL = 500L;
            isVisible = false;
            lastVisibleSatatus = true;
            adViewRect = new Rect();
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview1);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }


    public static final String ACTION_KEY = "action";
    static String BUNDLE_ID;
    public static final String DIMENSIONS = "expand_dimensions";
    public static final String EXPAND_URL = "expand_url";
    private static final int MESSAGE_PLAY_AUDIO = 1008;
    public static final String PLAYER_PROPERTIES = "player_properties";
    static int VIEW_ID;
    private static final Map internalWebViewPrivateListener = new HashMap();
    final String GUID;
    private final AdMarvelAd adMarvelAd;
    final WeakReference adMarvelTwoPartLayoutReference;
    final WeakReference adMarvelViewReference;
    public String audioCachedCallback;
    public String audioCompletedCallback;
    private AudioPlayer audioPlayer;
    public String audioPositionChangeCallback;
    public String audioStartedCallback;
    private boolean brightrollVideoStarted;
    private final WeakReference contextReference;
    private boolean disableCloseButton;
    private final AtomicBoolean enableAutoDetect = new AtomicBoolean(true);
    private boolean enableCloseAreaOnly;
    private final AtomicBoolean enableFullScreenControls = new AtomicBoolean(false);
    public GestureDetector gestureDetector;
    private final Handler handler;
    private final AtomicBoolean init = new AtomicBoolean(false);
    public boolean isAdClosing;
    public boolean isAdExpanding;
    private final AtomicBoolean isInAppBrowser = new AtomicBoolean(false);
    public boolean isInterstitialAdDisplayed;
    private boolean isTwoPartAdLoadingWithoutMraidInjection;
    public boolean isViewDisplayed;
    private boolean isfirst;
    private int mHeight;
    public String mInAppBrowserCloseCallback;
    public int mInitLayoutX;
    public int mInitLayoutY;
    private int mLastLayoutHeight;
    private int mLastLayoutWidth;
    private int mWidth;
    private int redirectionCheckCount;
    public boolean setSoftwareLayer;
    private boolean signalShutdown;
    public String sizeChangeCallback;
    private ViewViewableRunnable viewableRunnable;
    public String visibilityCallback;
    private final String xml;

    AdMarvelInternalWebView(Context context, boolean flag, String s, String s1, Handler handler1, AdMarvelView admarvelview, RelativeLayout relativelayout, 
            AdMarvelAd admarvelad)
    {
        super(context);
        setSoftwareLayer = false;
        isAdExpanding = false;
        isAdClosing = false;
        viewableRunnable = null;
        isfirst = true;
        disableCloseButton = false;
        enableCloseAreaOnly = false;
        isTwoPartAdLoadingWithoutMraidInjection = false;
        mInitLayoutX = 0;
        mInitLayoutY = 0;
        visibilityCallback = null;
        isInterstitialAdDisplayed = false;
        sizeChangeCallback = null;
        audioStartedCallback = null;
        audioCachedCallback = null;
        audioCompletedCallback = null;
        audioPositionChangeCallback = null;
        mHeight = -1;
        mWidth = -1;
        isViewDisplayed = false;
        brightrollVideoStarted = false;
        gestureDetector = null;
        audioPlayer = null;
        mInAppBrowserCloseCallback = null;
        xml = s;
        signalShutdown = false;
        GUID = s1;
        handler = handler1;
        contextReference = new WeakReference(context);
        redirectionCheckCount = 0;
        adMarvelAd = admarvelad;
        if (context != null && (context instanceof Activity))
        {
            s = (Activity)context;
            if (s != null && (s instanceof AdMarvelActivity))
            {
                s = (AdMarvelActivity)s;
                if (s != null && !s.isInterstitial() && !s.isTwoPartExpandable())
                {
                    isInAppBrowser.set(true);
                }
            }
        }
        adMarvelViewReference = new WeakReference(admarvelview);
        adMarvelTwoPartLayoutReference = new WeakReference(relativelayout);
        if (adMarvelViewReference != null)
        {
            s = (AdMarvelView)adMarvelViewReference.get();
            if (s != null)
            {
                setSoftwareLayer = s.isSoftwareLayer();
            }
        }
        setOnTouchListener(this);
        gestureDetector = new GestureDetector(context, new GestureListener());
        boolean flag1;
        if (Version.getAndroidSDKVersion() >= 16)
        {
            WebSettingInitializer.init(this, context, isInAppBrowser, setSoftwareLayer);
        } else
        if (Version.getAndroidSDKVersion() >= 11)
        {
            WebSettingInitializerPreAPI16.init(this, context, isInAppBrowser, setSoftwareLayer);
        } else
        if (Version.getAndroidSDKVersion() >= 8)
        {
            WebSettingInitializerPreAPI11.init(this, context, isInAppBrowser);
        } else
        if (Version.getAndroidSDKVersion() >= 7)
        {
            WebSettingInitializerPreAPI8.init(this, context, isInAppBrowser);
        } else
        {
            WebSettingInitializerPreAPI7.init(this, context, isInAppBrowser);
        }
        if (flag)
        {
            setScrollBarStyle(0);
        }
        if (context != null && (context instanceof Activity))
        {
            s = (Activity)context;
            if (s != null && (s instanceof AdMarvelActivity))
            {
                s1 = (AdMarvelActivity)s;
                if (s1 != null && (s1.isInterstitial() || s1.isTwoPartExpandable()))
                {
                    if (s1.isTwoPartExpandable())
                    {
                        isTwoPartAdLoadingWithoutMraidInjection = true;
                    }
                    s1 = (ViewGroup)s.getWindow().findViewById(0x1020002);
                    handler1 = new LinearLayout(getContext());
                    handler1.setBackgroundColor(0);
                    handler1.setTag((new StringBuilder(String.valueOf(GUID))).append("BTN_CLOSE").toString());
                    handler1.setVisibility(4);
                    handler1.setGravity(53);
                    handler1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    handler1.addView(new HTML5VideoControls(context, this, null, s));
                    s1.addView(handler1);
                }
            }
        }
        if (Version.getAndroidSDKVersion() >= 7)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            setWebChromeClient(new WebChromeClient() {

                final AdMarvelInternalWebView this$0;

                public void onProgressChanged(WebView webview, int i)
                {
                    webview = null;
                    if (getParent() instanceof RelativeLayout)
                    {
                        webview = (FullScreenControls)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("CONTROLS").toString());
                    }
                    if (webview != null && init.get())
                    {
                        ((ProgressBar)webview.findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("PROGRESS_BAR").toString())).setProgress(i);
                    }
                }

            
            {
                this$0 = AdMarvelInternalWebView.this;
                super();
            }
            });
            return;
        } else
        {
            setWebChromeClient(new AdMarvelWebChromeClient(this, context));
            return;
        }
    }

    public static AdMarvelInternalWebViewPrivateListener getListener(String s)
    {
        return (AdMarvelInternalWebViewPrivateListener)internalWebViewPrivateListener.get(s);
    }

    public static void setListener(String s, AdMarvelInternalWebViewPrivateListener admarvelinternalwebviewprivatelistener)
    {
        internalWebViewPrivateListener.put(s, admarvelinternalwebviewprivatelistener);
    }

    public void cacheAudio(String s)
    {
        if (audioPlayer == null)
        {
            audioPlayer = new AudioPlayer(getContext(), this);
        }
        try
        {
            audioPlayer.cacheAudio(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void clearUnUsedObjects()
    {
        signalShutdown();
        WebSettings websettings = getSettings();
        if (websettings != null)
        {
            websettings.setJavaScriptEnabled(false);
        }
        contextReference.clear();
        adMarvelViewReference.clear();
        adMarvelTwoPartLayoutReference.clear();
        if (viewableRunnable != null)
        {
            handler.removeCallbacks(viewableRunnable);
            viewableRunnable = null;
        }
        gestureDetector = null;
        internalWebViewPrivateListener.clear();
        gestureDetector = null;
        Logging.log("AdMarveInternalWebView:cleanup");
    }

    public void destroy()
    {
        signalShutdown();
        super.destroy();
        Logging.log("AdMarveInternalWebView:destroy()");
    }

    public void disableCloseButton(boolean flag)
    {
        if (!signalShutdown)
        {
            disableCloseButton = true;
            enableCloseAreaOnly = flag;
            Context context = (Context)contextReference.get();
            if (context != null)
            {
                handler.post(new DisableCloseRunnable(this, context, Boolean.valueOf(true)));
                return;
            }
        }
    }

    public void enableCloseButton()
    {
        if (disableCloseButton)
        {
            Context context = (Context)contextReference.get();
            if (context != null)
            {
                handler.post(new DisableCloseRunnable(this, context, Boolean.valueOf(false)));
            }
            disableCloseButton = false;
        }
    }

    void expandTo(int i, int j, int k, int l)
    {
        if (signalShutdown)
        {
            return;
        } else
        {
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, l));
            return;
        }
    }

    void expandToFullScreenWithControls()
    {
        if (!signalShutdown)
        {
            enableFullScreenControls.set(true);
            Object obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(2, FullScreenControls.VIEW_ID);
            setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            obj = (Context)contextReference.get();
            if (obj != null && (adMarvelAd != null || isInAppBrowser.get()))
            {
                if (Version.getAndroidSDKVersion() < 11)
                {
                    setWebViewClient(new AdMarvelWebViewClientPreApi11(this, ((Context) (obj)), adMarvelAd));
                    return;
                } else
                {
                    setWebViewClient(new AdMarvelWebViewClient(this, ((Context) (obj)), adMarvelAd));
                    return;
                }
            }
        }
    }

    public int getAudioPosition()
    {
        if (audioPlayer != null)
        {
            return audioPlayer.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public String getBaseUrl()
    {
        return null;
    }

    public AtomicBoolean getEnableAutoDetect()
    {
        return enableAutoDetect;
    }

    public void injectJavaScript(String s)
    {
        handler.post(new InjectJSRunnable(this, s));
    }

    public boolean isSignalShutdown()
    {
        return signalShutdown;
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        android.view.ViewParent viewparent;
        super.onLayout(flag, i, j, k, l);
        if (signalShutdown)
        {
            return;
        }
        viewparent = getParent();
        i = getWidth();
        j = getHeight();
        if (!(viewparent instanceof AdMarvelWebView) || ((AdMarvelWebView)viewparent).fullScreenMode.get()) goto _L2; else goto _L1
_L1:
        mLastLayoutHeight = getHeight();
        mLastLayoutWidth = getWidth();
        if (mLastLayoutHeight > 0 && mLastLayoutWidth > 0)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            layoutparams.height = mLastLayoutHeight;
            layoutparams.width = mLastLayoutWidth;
        }
        if (visibilityCallback != null && isfirst)
        {
            isfirst = false;
            registerForViewChange((AdMarvelWebView)viewparent);
        }
_L4:
        if (mHeight != -1 && mWidth != -1 && (i != mWidth || j != mHeight) && i > 0 && j > 0 && mWidth >= 0 && mHeight >= 0 && sizeChangeCallback != null)
        {
            loadUrl((new StringBuilder("javascript:")).append(sizeChangeCallback).append("(").append(i).append(",").append(j).append(")").toString());
        }
        mWidth = i;
        mHeight = j;
        return;
_L2:
        if (getContext() != null && (getContext() instanceof Activity))
        {
            Object obj = (Activity)getContext();
            if (obj != null && (obj instanceof AdMarvelActivity))
            {
                obj = (AdMarvelActivity)obj;
                if (obj != null && ((AdMarvelActivity) (obj)).isInterstitial())
                {
                    if (j == 0)
                    {
                        if (isViewDisplayed)
                        {
                            if (visibilityCallback != null)
                            {
                                loadUrl((new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(false).append(")").toString());
                                isViewDisplayed = false;
                            }
                            isInterstitialAdDisplayed = false;
                        }
                    } else
                    if (!isViewDisplayed)
                    {
                        if (visibilityCallback != null)
                        {
                            loadUrl((new StringBuilder("javascript:")).append(visibilityCallback).append("(").append(true).append(")").toString());
                            isViewDisplayed = true;
                        }
                        isInterstitialAdDisplayed = true;
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 48
    //                   1 48;
           goto _L1 _L2 _L2
_L2:
        if (view.hasFocus()) goto _L1; else goto _L3
_L3:
        view.requestFocus();
_L1:
        if (isInAppBrowser.get() || Version.getAndroidSDKVersion() <= 10 || gestureDetector == null)
        {
            return false;
        } else
        {
            return gestureDetector.onTouchEvent(motionevent);
        }
    }

    protected void onWindowVisibilityChanged(int i)
    {
        if (isAdExpanding || isAdClosing) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        if (visibilityCallback != null && visibilityCallback.length() > 0 && !isViewDisplayed)
        {
            injectJavaScript((new StringBuilder(String.valueOf(visibilityCallback))).append("(").append(true).append(")").toString());
            isViewDisplayed = true;
        }
_L2:
        super.onWindowVisibilityChanged(i);
        return;
_L4:
        if (visibilityCallback != null && visibilityCallback.length() > 0 && isViewDisplayed)
        {
            injectJavaScript((new StringBuilder(String.valueOf(visibilityCallback))).append("(").append(false).append(")").toString());
            isViewDisplayed = false;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void playAudio(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, String s1, String s2, 
            int i)
    {
        com.admarvel.speechkit.speech.Abstract.PlayerProperties playerproperties = new com.admarvel.speechkit.speech.Abstract.PlayerProperties();
        playerproperties.setProperties(false, flag, flag1, flag3, flag2, s1, s2, i);
        s1 = new Bundle();
        s1.putString("action", Action.PLAY_AUDIO.toString());
        s1.putString("expand_url", s);
        s1.putParcelable("player_properties", playerproperties);
        while (playerproperties.isFullScreen() || handler == null) 
        {
            return;
        }
        handler.obtainMessage(1008);
        handler.post(new PlayAudioRunnable(s1));
    }

    public void raiseError(String s, String s1)
    {
    }

    public void registerForViewChange(AdMarvelWebView admarvelwebview)
    {
        if (!signalShutdown)
        {
            unregisterForViewChange();
            Context context;
            if (contextReference != null)
            {
                context = (Context)contextReference.get();
            } else
            {
                context = null;
            }
            if (context != null)
            {
                viewableRunnable = new ViewViewableRunnable(this, context, admarvelwebview);
                handler.post(viewableRunnable);
                return;
            }
        }
    }

    void resetLayout()
    {
        if (signalShutdown)
        {
            return;
        }
        Object obj = getLayoutParams();
        obj.width = mLastLayoutWidth;
        obj.height = mLastLayoutHeight;
        setVisibility(0);
        obj = getParent();
        if (obj instanceof AdMarvelWebView)
        {
            ((AdMarvelWebView)obj).resetLayout(mLastLayoutWidth, mLastLayoutHeight);
        }
        requestLayout();
    }

    void setLayoutParams()
    {
        if (signalShutdown)
        {
            return;
        } else
        {
            setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -1))));
            return;
        }
    }

    public void setSignalShutdown(boolean flag)
    {
        signalShutdown = flag;
    }

    public void signalShutdown()
    {
        signalShutdown = true;
    }

    public void stopAudio()
    {
        if (audioPlayer != null)
        {
            audioPlayer.releasePlayer();
            audioPlayer = null;
        }
    }

    public void stopSpeechAndAudio()
    {
        try
        {
            Class.forName("com.admarvel.android.admarvelspeechkitadapter.ReleaseAdMarvelSpeechKit").newInstance();
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
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logging.log(illegalargumentexception.getMessage());
        }
        stopAudio();
    }

    public void unregisterForViewChange()
    {
        if (viewableRunnable != null)
        {
            handler.removeCallbacks(viewableRunnable);
        }
    }

    static 
    {
        VIEW_ID = 0x186a2;
        BUNDLE_ID = (new StringBuilder("admarvel_internal_webview_")).append(VIEW_ID).toString();
    }

















}
