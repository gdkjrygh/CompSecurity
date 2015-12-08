// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebViewListener, AdMarvelInternalWebView, Utils, AdMarvelAd, 
//            Version, AdMarvelInternalWebViewPrivateListener, WebViewResumePause, AdMarvelView, 
//            WebViewResumePausePreAPI11, AdMarvelJavascriptCachedAdAsyncTask, AdMarvelVideoActivity, AdMarvelLocationManager, 
//            AdMarvelActivity, AdMarvelSensorManager, AdMarvelConnectivityChangeReceiver

public class AdMarvelWebView extends RelativeLayout
{
    private static class AdMarvelJavascriptCachedAdAsyncTaskPostAPI11
        implements Runnable
    {

        private final String callback;
        private final WeakReference contextReference;
        private final File storage;
        private final int timeout;
        private final String url;
        private final WeakReference view;

        public void run()
        {
            if (contextReference.get() != null && view.get() != null)
            {
                (new AdMarvelJavascriptCachedAdAsyncTask((Context)contextReference.get(), (AdMarvelInternalWebView)view.get(), storage)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                    url, callback, Integer.valueOf(timeout)
                });
            }
        }

        public AdMarvelJavascriptCachedAdAsyncTaskPostAPI11(Context context, AdMarvelInternalWebView admarvelinternalwebview, String s, String s1, int i, File file)
        {
            contextReference = new WeakReference(context);
            view = new WeakReference(admarvelinternalwebview);
            url = s;
            callback = s1;
            timeout = i;
            storage = file;
        }
    }

    class AdMarvelWebViewClient extends WebViewClient
    {

        final AdMarvelWebView this$0;

        public void onLoadResource(WebView webview, String s)
        {
            super.onLoadResource(webview, s);
        }

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (!delayDisplay.get() && pendingLoad.compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onReceiveAd(AdMarvelWebView.this, adMarvelAd);
            }
            pageLoaded.set(true);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            pageLoaded.set(false);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            if (pendingLoad.compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onFailedToReceiveAd(AdMarvelWebView.this, adMarvelAd, 305, Utils.getErrorReason(305));
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
        {
            boolean flag = false;
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
                Logging.log((new StringBuilder("mraid Error Code: ")).append(i).toString());
                Logging.log((new StringBuilder("mraid Content Length: ")).append(j).toString());
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
                break MISSING_BLOCK_LABEL_396;
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
            webview = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
            if (webview != null && webview.isSignalShutdown())
            {
                return false;
            }
            if (Utils.isNoLink(s))
            {
                return true;
            }
            if (enableClickRedirect)
            {
                if (Utils.handledBySpecialIntents(getContext(), s))
                {
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
                if (s != null && Utils.isPrivateProtocol(s, "admarvelsdk") != Utils.PROTOCOL_TYPE.NONE)
                {
                    if (AdMarvelWebView.getListener(GUID) != null)
                    {
                        AdMarvelWebView.getListener(GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), getContext()));
                    }
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
                if (s != null && Utils.isPrivateProtocol(s, "admarvelinternal") != Utils.PROTOCOL_TYPE.NONE)
                {
                    if (AdMarvelWebView.getListener(GUID) != null)
                    {
                        AdMarvelWebView.getListener(GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), getContext()));
                    }
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
                if (s != null && Utils.isPrivateProtocol(s, "admarvelvideo") != Utils.PROTOCOL_TYPE.NONE)
                {
                    webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), getContext());
                    s = new Intent("android.intent.action.VIEW");
                    s.addFlags(0x10000000);
                    s.setDataAndType(Uri.parse(webview), "video/*");
                    if (Utils.isIntentAvailable(getContext(), s))
                    {
                        getContext().startActivity(s);
                    }
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
                if (s != null && Utils.isPrivateProtocol(s, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), getContext())));
                    webview.addFlags(0x10000000);
                    if (Utils.isIntentAvailable(getContext(), webview))
                    {
                        getContext().startActivity(webview);
                    }
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
                if (s != null && Utils.isPrivateProtocol(s, "admarvelcustomvideo") != Utils.PROTOCOL_TYPE.NONE)
                {
                    webview = new Intent(getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
                    webview.addFlags(0x10000000);
                    webview.putExtra("url", s);
                    webview.putExtra("isCustomUrl", true);
                    webview.putExtra("xml", xml);
                    webview.putExtra("source", source);
                    webview.putExtra("GUID", GUID);
                    getContext().startActivity(webview);
                    (new Utils(getContext(), handler)).registerTrackingEvent(xml);
                    return true;
                }
            }
            if (enableAutoDetect.get())
            {
                redirectUrl(s);
            }
            return true;
        }

        AdMarvelWebViewClient()
        {
            this$0 = AdMarvelWebView.this;
            super();
        }
    }

    class AdMarvelWebViewClientPreApi11 extends WebViewClient
    {

        final AdMarvelWebView this$0;

        public void onLoadResource(WebView webview, String s)
        {
            super.onLoadResource(webview, s);
        }

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (!delayDisplay.get() && pendingLoad.compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onReceiveAd(AdMarvelWebView.this, adMarvelAd);
            }
            pageLoaded.set(true);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            pageLoaded.set(false);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            if (pendingLoad.compareAndSet(true, false) && AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onFailedToReceiveAd(AdMarvelWebView.this, adMarvelAd, 305, Utils.getErrorReason(305));
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s == null)
            {
                return false;
            }
            webview = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
            if (webview == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            if (webview.isSignalShutdown())
            {
                return false;
            }
            if (Utils.isNoLink(s))
            {
                return true;
            }
            if (!enableClickRedirect)
            {
                break MISSING_BLOCK_LABEL_712;
            }
            if (!Utils.handledBySpecialIntents(getContext(), s))
            {
                break MISSING_BLOCK_LABEL_121;
            }
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            if (Utils.isPrivateProtocol(s, "admarvelsdk") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            if (AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelsdk", "", Utils.isPrivateProtocol(s, "admarvelsdk"), getContext()));
            }
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_331;
            }
            if (Utils.isPrivateProtocol(s, "admarvelinternal") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_331;
            }
            if (AdMarvelWebView.getListener(GUID) != null)
            {
                AdMarvelWebView.getListener(GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(s, "admarvelinternal", "", Utils.isPrivateProtocol(s, "admarvelinternal"), getContext()));
            }
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_455;
            }
            if (Utils.isPrivateProtocol(s, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_455;
            }
            webview = Utils.parsePrivateProtocol(s, "admarvelvideo", "http://", Utils.isPrivateProtocol(s, "admarvelvideo"), getContext());
            s = new Intent("android.intent.action.VIEW");
            s.addFlags(0x10000000);
            s.setDataAndType(Uri.parse(webview), "video/*");
            if (Utils.isIntentAvailable(getContext(), s))
            {
                getContext().startActivity(s);
            }
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_570;
            }
            if (Utils.isPrivateProtocol(s, "admarvelexternal") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_570;
            }
            webview = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(s, "admarvelexternal", "", Utils.isPrivateProtocol(s, "admarvelexternal"), getContext())));
            webview.addFlags(0x10000000);
            if (Utils.isIntentAvailable(getContext(), webview))
            {
                getContext().startActivity(webview);
            }
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_712;
            }
            if (Utils.isPrivateProtocol(s, "admarvelcustomvideo") == Utils.PROTOCOL_TYPE.NONE)
            {
                break MISSING_BLOCK_LABEL_712;
            }
            webview = new Intent(getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
            webview.addFlags(0x10000000);
            webview.putExtra("url", s);
            webview.putExtra("isCustomUrl", true);
            webview.putExtra("xml", xml);
            webview.putExtra("source", source);
            webview.putExtra("GUID", GUID);
            getContext().startActivity(webview);
            (new Utils(getContext(), handler)).registerTrackingEvent(xml);
            return true;
            try
            {
                if (enableAutoDetect.get())
                {
                    redirectUrl(s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                Logging.log((new StringBuilder(String.valueOf(webview.getMessage()))).append("exception in shouldOverrideUrlLoading").toString());
            }
            return true;
        }

        AdMarvelWebViewClientPreApi11()
        {
            this$0 = AdMarvelWebView.this;
            super();
        }
    }

    private static class AdMarvelWebViewInternalListener
        implements AdMarvelInternalWebViewPrivateListener
    {

        private final WeakReference adMarvelWebViewReference;

        public void onCloseInAppBrowser(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview != null)
            {
                if ((s = (AdMarvelInternalWebView)admarvelwebview.findViewWithTag((new StringBuilder(String.valueOf(s))).append("INTERNAL").toString())) != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback != null && ((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback.length() > 0)
                {
                    s.loadUrl((new StringBuilder("javascript:")).append(((AdMarvelInternalWebView) (s)).mInAppBrowserCloseCallback).append("()").toString());
                    return;
                }
            }
        }

        public void onCloseTwoPartExpand()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)admarvelwebview.findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("INTERNAL").toString())) != null)
                {
                    admarvelwebview.isFullScreenExpansionIntended = false;
                    admarvelwebview.isTwoPartExpandable = false;
                    if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
                    {
                        AdMarvelWebView.getListener(admarvelwebview.GUID).onClose();
                    }
                    if (admarvelwebview.mCloseCallback != null)
                    {
                        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(admarvelwebview.mCloseCallback).append("()").toString());
                        return;
                    }
                }
            }
        }

        public AdMarvelWebViewInternalListener(AdMarvelWebView admarvelwebview)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

    private static class CheckFrameValues
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        private final String callback;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelWebView admarvelwebview;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview == null)
            {
                return;
            }
            if (admarvelinternalwebview == null) goto _L2; else goto _L1
_L1:
            Object obj1 = null;
            if (Version.getAndroidSDKVersion() >= 9) goto _L4; else goto _L3
_L3:
            int i = admarvelwebview.getResources().getConfiguration().orientation;
            if (i != 1) goto _L6; else goto _L5
_L5:
            i = 0;
_L19:
            String s = Utils.getDeviceConnectivitiy(admarvelwebview.getContext());
            Object obj;
            Object obj2;
            String s1;
            Object obj3;
            Object obj4;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            boolean flag;
            if (s.equals("wifi") || s.equals("mobile"))
            {
                obj = "YES";
            } else
            {
                obj = "NO";
            }
            if (Utils.isFeatureSupported(admarvelwebview.getContext(), "location"))
            {
                obj1 = AdMarvelLocationManager.getInstance().getLocation(admarvelinternalwebview);
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_1256;
            }
            obj1 = (new StringBuilder("{lat:")).append(((Location) (obj1)).getLatitude()).append(", lon:").append(((Location) (obj1)).getLongitude()).append(", acc:").append(((Location) (obj1)).getAccuracy()).append("}").toString();
_L26:
            obj2 = (new StringBuilder("{screen: true, orientation: true, heading: ")).append(Utils.isFeatureSupported(admarvelwebview.getContext(), "compass")).append(", location : ");
            if (!Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            obj2 = ((StringBuilder) (obj2)).append(flag).append(",shake: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(",tilt: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(", network: true, sms:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", phone:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", email:true,calendar:");
            if (Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.WRITE_CALENDAR"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = ((StringBuilder) (obj2)).append(flag).append(", camera: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "camera")).append(",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}").toString();
            obj2 = (AdMarvelView)admarvelinternalwebview.adMarvelViewReference.get();
            if (obj2 == null) goto _L8; else goto _L7
_L7:
            obj3 = new int[2];
            try
            {
                admarvelinternalwebview.getLocationOnScreen(((int []) (obj3)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj4)
            {
                obj3[0] = 0;
                obj3[1] = 0;
            }
            if (!(admarvelwebview.getContext() instanceof Activity)) goto _L10; else goto _L9
_L9:
            obj4 = (Activity)admarvelwebview.getContext();
            if (obj4 == null) goto _L10; else goto _L11
_L11:
            if (admarvelwebview.activityTopOffset == 0x80000000 || admarvelwebview.activityTopOffset < 0) goto _L13; else goto _L12
_L12:
            j = admarvelwebview.activityTopOffset;
_L21:
            i2 = obj3[0];
            j2 = obj3[1];
            k1 = admarvelinternalwebview.getWidth();
            j1 = admarvelinternalwebview.getHeight();
            obj3 = new int[2];
            ((AdMarvelView) (obj2)).getLocationOnScreen(((int []) (obj3)));
            i1 = obj3[0];
            l = obj3[1];
            k = ((AdMarvelView) (obj2)).getWidth();
            l1 = ((AdMarvelView) (obj2)).getHeight();
            l -= j;
            j2 -= j;
            j = l1;
            l1 = j2;
_L24:
            i3 = admarvelwebview.getRootView().getLeft();
            l2 = admarvelwebview.getRootView().getTop();
            k2 = admarvelwebview.getRootView().getWidth();
            j2 = admarvelwebview.getRootView().getHeight();
            if (!(admarvelwebview.getContext() instanceof Activity)) goto _L15; else goto _L14
_L14:
            obj3 = (Activity)admarvelwebview.getContext();
            if (obj3 == null) goto _L15; else goto _L16
_L16:
            obj2 = Utils.getSupportedInterfaceOrientations(((Activity) (obj3)));
            obj3 = (ViewGroup)((Activity) (obj3)).getWindow().findViewById(0x1020002);
            i3 = ((ViewGroup) (obj3)).getLeft();
            l2 = ((ViewGroup) (obj3)).getTop();
            k2 = ((ViewGroup) (obj3)).getWidth();
            j2 = ((ViewGroup) (obj3)).getHeight();
            break MISSING_BLOCK_LABEL_652;
_L6:
            if (i != 2) goto _L18; else goto _L17
_L17:
            i = 90;
              goto _L19
_L4:
            i = admarvelwebview.activityCurrentOrientationPostAPI9;
            if (i == 0)
            {
                i = 0;
            } else
            if (i == 1)
            {
                i = 90;
            } else
            {
                if (i != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = 180;
            }
              goto _L19
_L23:
            try
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(callback).append("({x:").append(i2).append(",y:").append(l1).append(",width:").append(k1).append(",height:").append(j1).append(",appX:").append(i3).append(",appY:").append(l2).append(",appWidth:").append(k2).append(",appHeight:").append(j2).append(",orientation:").append(i).append(",defaultX:").append(i1).append(",defaultY:").append(l).append(",defaultWidth:").append(k).append(",defaultHeight:").append(j).append(",networkType:").append("'").append(s).append("'").append(",network:").append("'").append(((String) (obj))).append("'").append(",screenWidth:").append(Utils.getDeviceWidth(admarvelwebview.getContext())).append(",screenHeight:").append(Utils.getDeviceHeight(admarvelwebview.getContext())).append(",adType:").append("'").append("Banner").append("'").append(",supportedFeatures:").append(s1).append(",sdkVersion:").append("'").append("2.4.2.1").append("'").append(",location:").append(((String) (obj1))).append(",applicationSupportedOrientations:").append("'").append(((String) (obj2))).append("'").append("})").toString());
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
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            }
            return;
_L13:
            ViewGroup viewgroup = (ViewGroup)((Activity) (obj4)).getWindow().findViewById(0x1020002);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((Activity) (obj4)).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            k = displaymetrics.heightPixels - viewgroup.getMeasuredHeight();
            j = k;
            if (k < 0) goto _L21; else goto _L20
_L20:
            j = k;
            if (admarvelwebview.activityTopOffset != 0x80000000) goto _L21; else goto _L22
_L22:
            admarvelwebview.activityTopOffset = k;
            j = k;
              goto _L21
_L15:
            obj2 = "0,90";
              goto _L23
_L10:
            j = 0;
              goto _L21
_L8:
            i1 = 0;
            j1 = 0;
            k1 = 0;
            l1 = 0;
            i2 = 0;
            l = 0;
            j = 0;
            k = 0;
              goto _L24
_L18:
            i = -1;
              goto _L19
_L2:
            return;
            if (i != 3) goto _L18; else goto _L25
_L25:
            i = -90;
              goto _L19
            obj1 = "null";
              goto _L26
        }

        public CheckFrameValues(String s, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview)
        {
            callback = s;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }

    private static class CheckNetworkAvailableRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final String mCallback;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return;
            }
            if (Utils.isNetworkAvailable(admarvelinternalwebview.getContext()))
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
                return;
            } else
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
                return;
            }
        }

        public CheckNetworkAvailableRunnable(AdMarvelInternalWebView admarvelinternalwebview, String s)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            mCallback = s;
        }
    }

    private static class CloseButton extends LinearLayout
    {

        private final WeakReference adMarvelWebViewReference;

        private void addCloseButton(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview == null)
            {
                return;
            }
            Button button = new Button(context);
            button.setLayoutParams(layoutparams);
            button.setOnClickListener(admarvelwebview. new android.view.View.OnClickListener() {

                final CloseButton this$1;
                private final AdMarvelWebView val$adMarvelWebView;

                public void onClick(View view)
                {
                    adMarvelWebView.handler.post(new CloseRunnable(adMarvelWebView));
                }

            
            {
                this$1 = final_closebutton;
                adMarvelWebView = AdMarvelWebView.this;
                super();
            }
            });
            layoutparams = Bitmap.createBitmap(50, 50, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(layoutparams);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setStrokeWidth(4F);
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            Paint paint1 = new Paint();
            paint1.setColor(0xff000000);
            paint1.setAntiAlias(true);
            paint1.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(25F, 25F, 18F, paint);
            canvas.drawCircle(25F, 25F, 14F, paint1);
            canvas.drawLine(18F, 18F, 32F, 32F, paint);
            canvas.drawLine(18F, 32F, 32F, 18F, paint);
            if (!admarvelwebview.showOnlyCloseArea)
            {
                button.setBackgroundDrawable(new BitmapDrawable(layoutparams));
            } else
            {
                button.setBackgroundColor(0);
            }
            context = new RelativeLayout(context);
            context.setLayoutParams(layoutparams1);
            context.addView(button);
            addView(context);
        }

        private void configureButton(Context context)
        {
            setBackgroundColor(0);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.weight = 1.0F;
            layoutparams.width = 0;
            layoutparams.gravity = 17;
            setLayoutParams(layoutparams);
            layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.weight = 25F;
            layoutparams.gravity = 17;
            float f = TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams((int)f, (int)f);
            layoutparams1.addRule(13);
            addCloseButton(context, layoutparams1, layoutparams);
        }

        public CloseButton(Context context, AdMarvelWebView admarvelwebview)
        {
            super(context);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            configureButton(context);
        }
    }

    private static class CloseRunnable
        implements Runnable
    {

        private final WeakReference adMarvelWebViewReference;

        public void run()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview != null)
            {
                admarvelwebview.close();
            }
        }

        public CloseRunnable(AdMarvelWebView admarvelwebview)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }

    private static class CreateEventRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
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
            AdMarvelInternalWebView admarvelinternalwebview;
            obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            ContentResolver contentresolver = ((AdMarvelWebView) (obj)).getContext().getContentResolver();
            Object obj1 = contentresolver.query(Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("calendars").toString()), new String[] {
                "_id", "displayname"
            }, null, null, null);
            if (obj1 == null) goto _L4; else goto _L3
_L3:
            obj = obj1;
            if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L5
_L5:
            obj = obj1;
            Object obj3 = new String[((Cursor) (obj1)).getCount()];
            obj = obj1;
            Object obj2 = new int[((Cursor) (obj1)).getCount()];
            int i = 0;
_L12:
            obj = obj1;
            if (i < obj3.length) goto _L7; else goto _L6
_L6:
            obj = obj1;
            obj3 = new ContentValues();
            obj = obj1;
            ((ContentValues) (obj3)).put("calendar_id", Integer.valueOf(obj2[0]));
            obj = obj1;
            if (mTiltle == null)
            {
                break MISSING_BLOCK_LABEL_190;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("title", mTiltle);
            obj = obj1;
            if (mDescription == null)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("description", mDescription);
            obj = obj1;
            if (mLocation == null)
            {
                break MISSING_BLOCK_LABEL_234;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("eventLocation", mLocation);
            obj = obj1;
            if (startDate == null)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("dtstart", startDate);
            obj = obj1;
            if (endDate == null)
            {
                break MISSING_BLOCK_LABEL_278;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("dtend", endDate);
            obj = obj1;
            if (mAllDay == null)
            {
                break MISSING_BLOCK_LABEL_334;
            }
            obj = obj1;
            if (mAllDay.toLowerCase().equals("true"))
            {
                break MISSING_BLOCK_LABEL_321;
            }
            obj = obj1;
            if (!mAllDay.toLowerCase().equals("yes"))
            {
                break MISSING_BLOCK_LABEL_334;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("allDay", Integer.valueOf(1));
            obj = obj1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_356;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("hasAlarm", Integer.valueOf(1));
            obj = obj1;
            if (mTimeZone == null)
            {
                break MISSING_BLOCK_LABEL_390;
            }
            obj = obj1;
            if (mTimeZone.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_390;
            }
            obj = obj1;
            ((ContentValues) (obj3)).put("eventTimezone", mTimeZone);
            obj = obj1;
            Object obj4 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("events").toString());
            obj = obj1;
            obj2 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("reminders").toString());
            obj = obj1;
            obj3 = contentresolver.insert(((Uri) (obj4)), ((ContentValues) (obj3)));
            if (obj3 == null) goto _L9; else goto _L8
_L8:
            obj = obj1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_548;
            }
            obj = obj1;
            obj4 = new ContentValues();
            obj = obj1;
            ((ContentValues) (obj4)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj3)).getLastPathSegment())));
            obj = obj1;
            ((ContentValues) (obj4)).put("method", Integer.valueOf(1));
            obj = obj1;
            ((ContentValues) (obj4)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
            obj = obj1;
            contentresolver.insert(((Uri) (obj2)), ((ContentValues) (obj4)));
            obj = obj1;
            if (mCallback == null) goto _L4; else goto _L10
_L10:
            obj = obj1;
            if (mCallback.length() <= 0) goto _L4; else goto _L11
_L11:
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L4:
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
                return;
            }
              goto _L1
_L7:
            obj = obj1;
            obj2[i] = ((Cursor) (obj1)).getInt(0);
            obj = obj1;
            obj3[i] = ((Cursor) (obj1)).getString(1);
            obj = obj1;
            ((Cursor) (obj1)).moveToNext();
            i++;
              goto _L12
_L9:
            obj = obj1;
            if (mCallback == null) goto _L4; else goto _L13
_L13:
            obj = obj1;
            if (mCallback.length() <= 0) goto _L4; else goto _L14
_L14:
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L4
            Exception exception;
            exception;
_L18:
            obj = obj1;
            if (mCallback == null)
            {
                break MISSING_BLOCK_LABEL_771;
            }
            obj = obj1;
            if (mCallback.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_771;
            }
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            obj = obj1;
            exception.printStackTrace();
            if (obj1 == null) goto _L1; else goto _L15
_L15:
            ((Cursor) (obj1)).close();
            return;
            obj1;
            obj = null;
_L17:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            throw obj1;
            obj1;
            if (true) goto _L17; else goto _L16
_L16:
            exception;
            obj1 = null;
              goto _L18
        }

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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
            Logging.log(Log.getStackTraceString(admarvelinternalwebview));
            return;
        }

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
                String s5, int i)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

        public CreateEventRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
                String s5, int i, String s6, String s7, String s8, String s9, int j, 
                int k, String s10)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
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
            AdMarvelInternalWebView admarvelinternalwebview;
            obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            ContentResolver contentresolver = ((AdMarvelWebView) (obj)).getContext().getContentResolver();
            Object obj1 = contentresolver.query(android.provider.CalendarContract.Calendars.CONTENT_URI, new String[] {
                "_id", "calendar_displayName"
            }, null, null, null);
            if (obj1 == null) goto _L4; else goto _L3
_L3:
            obj = obj1;
            if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L5
_L5:
            obj = obj1;
            Object obj4 = new String[((Cursor) (obj1)).getCount()];
            obj = obj1;
            Object obj3 = new int[((Cursor) (obj1)).getCount()];
            int i = 0;
_L13:
            obj = obj1;
            if (i < obj4.length) goto _L7; else goto _L6
_L6:
            obj = obj1;
            obj4 = new ContentValues();
            obj = obj1;
            ((ContentValues) (obj4)).put("calendar_id", Integer.valueOf(obj3[0]));
            obj = obj1;
            if (mTiltle == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("title", mTiltle);
            obj = obj1;
            if (mDescription == null)
            {
                break MISSING_BLOCK_LABEL_190;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("description", mDescription);
            obj = obj1;
            if (mLocation == null)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("eventLocation", mLocation);
            obj = obj1;
            if (startDate == null)
            {
                break MISSING_BLOCK_LABEL_234;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("dtstart", startDate);
            obj = obj1;
            if (endDate == null)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("dtend", endDate);
            obj = obj1;
            if (mAllDay == null)
            {
                break MISSING_BLOCK_LABEL_312;
            }
            obj = obj1;
            if (mAllDay.toLowerCase().equals("true"))
            {
                break MISSING_BLOCK_LABEL_299;
            }
            obj = obj1;
            if (!mAllDay.toLowerCase().equals("yes"))
            {
                break MISSING_BLOCK_LABEL_312;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("allDay", Integer.valueOf(1));
            obj = obj1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_334;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("hasAlarm", Integer.valueOf(1));
            obj = obj1;
            if (mTimeZone == null) goto _L9; else goto _L8
_L8:
            obj = obj1;
            if (mTimeZone.length() <= 0) goto _L9; else goto _L10
_L10:
            obj = obj1;
            ((ContentValues) (obj4)).put("eventTimezone", mTimeZone);
_L14:
            obj = obj1;
            if (mRecurrenceRule == null)
            {
                break MISSING_BLOCK_LABEL_402;
            }
            obj = obj1;
            if (mRecurrenceRule.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_402;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("rrule", mRecurrenceRule);
            obj = obj1;
            if (mExceptionDates == null)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            obj = obj1;
            if (mExceptionDates.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            obj = obj1;
            ((ContentValues) (obj4)).put("exdate", mExceptionDates);
            obj = obj1;
            ((ContentValues) (obj4)).put("eventStatus", Integer.valueOf(mStatus));
            obj = obj1;
            ((ContentValues) (obj4)).put("availability", Integer.valueOf(mAvailability));
            obj = obj1;
            obj3 = contentresolver.insert(android.provider.CalendarContract.Events.CONTENT_URI, ((ContentValues) (obj4)));
            if (obj3 == null) goto _L12; else goto _L11
_L11:
            obj = obj1;
            if (mReminder > 0)
            {
                break MISSING_BLOCK_LABEL_572;
            }
            obj = obj1;
            obj4 = new ContentValues();
            obj = obj1;
            ((ContentValues) (obj4)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj3)).getLastPathSegment())));
            obj = obj1;
            ((ContentValues) (obj4)).put("method", Integer.valueOf(1));
            obj = obj1;
            ((ContentValues) (obj4)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
            obj = obj1;
            contentresolver.insert(android.provider.CalendarContract.Reminders.CONTENT_URI, ((ContentValues) (obj4)));
            obj = obj1;
            if (mCallback == null)
            {
                break MISSING_BLOCK_LABEL_626;
            }
            obj = obj1;
            if (mCallback.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_626;
            }
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L17:
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
                return;
            }
              goto _L1
_L7:
            obj = obj1;
            obj3[i] = ((Cursor) (obj1)).getInt(0);
            obj = obj1;
            obj4[i] = ((Cursor) (obj1)).getString(1);
            obj = obj1;
            ((Cursor) (obj1)).moveToNext();
            i++;
              goto _L13
_L9:
            obj = obj1;
            ((ContentValues) (obj4)).put("eventTimezone", TimeZone.getDefault().getID());
              goto _L14
            Object obj2;
            obj2;
_L22:
            obj = obj1;
            ((Exception) (obj2)).printStackTrace();
            obj = obj1;
            if (mCallback == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
            if (mCallback.length() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            if (obj1 == null) goto _L1; else goto _L15
_L15:
            ((Cursor) (obj1)).close();
            return;
_L12:
            obj = obj1;
            if (mCallback == null) goto _L17; else goto _L16
_L16:
            obj = obj1;
            if (mCallback.length() <= 0) goto _L17; else goto _L18
_L18:
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L17
            obj2;
            obj1 = obj;
            obj = obj2;
_L21:
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
            }
            throw obj;
_L4:
            obj = obj1;
            if (mCallback == null) goto _L17; else goto _L19
_L19:
            obj = obj1;
            if (mCallback.length() <= 0) goto _L17; else goto _L20
_L20:
            obj = obj1;
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
              goto _L17
            obj;
            obj1 = null;
              goto _L21
            obj2;
            obj1 = null;
              goto _L22
        }

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
                String s5, int i)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

        public CreateEventRunnablePostAPI14(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
                String s5, int i, String s6, String s7, String s8, String s9, int j, 
                int k, String s10)
        {
            format = new SimpleDateFormat("yyyyMMddhhmm");
            startDate = null;
            endDate = null;
            mReminder = 1;
            mStatus = 0;
            mAvailability = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

    private static class ExpandResizeRunnable
        implements Runnable
    {

        private final WeakReference activityReference;
        private final WeakReference adMarvelWebViewReference;
        private int height;
        private int width;
        private int x;
        private int y;

        public void run()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview != null) goto _L2; else goto _L1
_L1:
            Object obj;
            return;
_L2:
            if ((obj = (Activity)activityReference.get()) == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (ViewGroup)((Activity) (obj)).getWindow().findViewById(0x1020002);
            Object obj1 = (AdMarvelInternalWebView)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("INTERNAL").toString());
            if (obj1 == null || ((AdMarvelInternalWebView) (obj1)).isSignalShutdown() || !admarvelwebview.isExpandedState)
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj2 = (RelativeLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("EXPAND_LAYOUT").toString());
            if (obj2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj2 = (android.widget.FrameLayout.LayoutParams)((RelativeLayout) (obj2)).getLayoutParams();
            if (obj2 != null)
            {
                obj2.width = width;
                obj2.height = height;
                obj2.leftMargin = x;
                obj2.topMargin = y;
                if (x != 0)
                {
                    obj2.gravity = 0;
                }
            }
            ((AdMarvelInternalWebView) (obj1)).expandTo(x, y, width, height);
            if (!admarvelwebview.isCloseButtonEnable)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (LinearLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(admarvelwebview.GUID))).append("BTN_CLOSE").toString());
            if (obj1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            int i = ((ViewGroup) (obj)).getMeasuredHeight();
            int j = ((ViewGroup) (obj)).getMeasuredWidth();
            float f = TypedValue.applyDimension(1, 30F, admarvelwebview.getContext().getResources().getDisplayMetrics());
            AdMarvelWebView.updateCloseButtonPosition(((LinearLayout) (obj1)), ((android.widget.RelativeLayout.LayoutParams) (obj2)), admarvelwebview.closeButtonPosition, x, y, width, height, j, i, (int)f);
            ((LinearLayout) (obj1)).removeAllViews();
            ((LinearLayout) (obj1)).addView(new CloseButton(admarvelwebview.getContext(), admarvelwebview));
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            admarvelwebview.isMultiLayerExpandedState = true;
            ((ViewGroup) (obj)).invalidate();
            ((ViewGroup) (obj)).requestLayout();
            admarvelwebview.fullScreenMode.set(true);
            admarvelwebview.invalidate();
            admarvelwebview.requestLayout();
            if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
            {
                AdMarvelWebView.getListener(admarvelwebview.GUID).onExpand();
            }
            admarvelwebview.invalidate();
            admarvelwebview.requestLayout();
            return;
        }

        public ExpandResizeRunnable(AdMarvelWebView admarvelwebview, Activity activity, int i, int j)
        {
            width = 0;
            height = 0;
            x = 0;
            y = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            activityReference = new WeakReference(activity);
            width = i;
            height = j;
        }

        public ExpandResizeRunnable(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, int k, int l)
        {
            width = 0;
            height = 0;
            x = 0;
            y = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            activityReference = new WeakReference(activity);
            width = k;
            height = l;
            x = i;
            y = j;
        }
    }

    private static class ExpandTo
        implements Runnable
    {

        private final WeakReference activityReference;
        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelWebViewReference;
        private int height;
        private int width;
        private int x;
        private int y;

        public void run()
        {
            Object obj;
            AdMarvelInternalWebView admarvelinternalwebview;
            android.widget.FrameLayout.LayoutParams layoutparams;
            int i;
            int j;
            float f;
            Activity activity;
            ViewGroup viewgroup;
            RelativeLayout relativelayout;
            Object obj1;
            Object obj2;
            FrameLayout framelayout;
            try
            {
                obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                return;
            }
            if (obj == null)
            {
                return;
            }
            activity = (Activity)activityReference.get();
            if (activity == null) goto _L2; else goto _L1
_L1:
            viewgroup = (ViewGroup)activity.getWindow().findViewById(0x1020002);
            admarvelinternalwebview = (AdMarvelInternalWebView)((AdMarvelWebView) (obj)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("INTERNAL").toString());
            if (admarvelinternalwebview == null) goto _L2; else goto _L3
_L3:
            if (admarvelinternalwebview.isSignalShutdown()) goto _L2; else goto _L4
_L4:
            admarvelinternalwebview.isAdExpanding = true;
            obj1 = new FrameLayout(((AdMarvelWebView) (obj)).getContext());
            ((FrameLayout) (obj1)).setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_BG").toString());
            ((FrameLayout) (obj1)).setOnTouchListener(new android.view.View.OnTouchListener() {

                final ExpandTo this$1;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return true;
                }

            
            {
                this$1 = ExpandTo.this;
                super();
            }
            });
            obj2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            relativelayout = new RelativeLayout(((AdMarvelWebView) (obj)).getContext());
            relativelayout.setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_LAYOUT").toString());
            layoutparams = new android.widget.FrameLayout.LayoutParams(width, height);
            if (x != 0) goto _L6; else goto _L5
_L5:
            layoutparams.gravity = 1;
_L9:
            relativelayout.setGravity(1);
            layoutparams.leftMargin = x;
            layoutparams.topMargin = y;
            j = ((AdMarvelWebView) (obj)).getChildCount();
            i = 0;
              goto _L7
_L10:
            framelayout = new FrameLayout(((AdMarvelWebView) (obj)).getContext());
            framelayout.setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("EXPAND_PLACE_HOLDER").toString());
            ((AdMarvelWebView) (obj)).addView(framelayout, i, new android.widget.RelativeLayout.LayoutParams(admarvelinternalwebview.getWidth(), admarvelinternalwebview.getHeight()));
            ((AdMarvelWebView) (obj)).removeView(admarvelinternalwebview);
            if (admarvelinternalwebview == null)
            {
                break MISSING_BLOCK_LABEL_362;
            }
            admarvelinternalwebview.expandTo(x, y, width, height);
            relativelayout.addView(admarvelinternalwebview);
            obj.isExpandedState = true;
            ((FrameLayout) (obj1)).addView(relativelayout, layoutparams);
            viewgroup.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            relativelayout.bringToFront();
            if (((AdMarvelWebView) (obj)).enableCloseButton && !((AdMarvelWebView) (obj)).isMultiLayerExpandedState)
            {
                obj1 = new LinearLayout(((AdMarvelWebView) (obj)).getContext());
                ((LinearLayout) (obj1)).setBackgroundColor(0);
                ((LinearLayout) (obj1)).setTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("BTN_CLOSE").toString());
                obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                i = viewgroup.getMeasuredHeight();
                j = viewgroup.getMeasuredWidth();
                f = TypedValue.applyDimension(1, 30F, ((AdMarvelWebView) (obj)).getContext().getResources().getDisplayMetrics());
                AdMarvelWebView.updateCloseButtonPosition(((LinearLayout) (obj1)), ((android.widget.RelativeLayout.LayoutParams) (obj2)), ((AdMarvelWebView) (obj)).closeButtonPosition, x, y, width, height, j, i, (int)f);
                ((LinearLayout) (obj1)).addView(new CloseButton(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj))));
                relativelayout.addView(((View) (obj1)));
                obj.isCloseButtonEnable = true;
                obj.orientationListener = new OrientationListenerPrivate(((AdMarvelWebView) (obj)), activity, 3);
                if (((AdMarvelWebView) (obj)).orientationListener.canDetectOrientation())
                {
                    ((AdMarvelWebView) (obj)).orientationListener.enable();
                }
            }
            viewgroup.invalidate();
            viewgroup.requestLayout();
            ((AdMarvelWebView) (obj)).fullScreenMode.set(true);
            ((AdMarvelWebView) (obj)).invalidate();
            ((AdMarvelWebView) (obj)).requestLayout();
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onExpand();
            }
            ((AdMarvelWebView) (obj)).invalidate();
            ((AdMarvelWebView) (obj)).requestLayout();
            admarvelinternalwebview.isAdExpanding = false;
            return;
_L6:
            if (Version.getAndroidSDKVersion() >= 11) goto _L9; else goto _L8
_L8:
            layoutparams.gravity = 48;
              goto _L9
_L11:
            View view = ((AdMarvelWebView) (obj)).getChildAt(i);
            if (view == admarvelinternalwebview)
            {
                break; /* Loop/switch isn't completed */
            }
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            return;
_L7:
            if (i < j) goto _L11; else goto _L10
        }

        public ExpandTo(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, int k, int l, AdMarvelAd admarvelad)
        {
            width = 0;
            height = 0;
            x = 0;
            y = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            activityReference = new WeakReference(activity);
            width = k;
            height = l;
            x = i;
            y = j;
            adMarvelAd = admarvelad;
        }

        public ExpandTo(AdMarvelWebView admarvelwebview, Activity activity, int i, int j, AdMarvelAd admarvelad)
        {
            width = 0;
            height = 0;
            x = 0;
            y = 0;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            activityReference = new WeakReference(activity);
            width = i;
            height = j;
            adMarvelAd = admarvelad;
        }
    }

    private static class ExpandTwoPartRunnable
        implements Runnable
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelWebViewReference;
        private String expand_url;

        public void run()
        {
            AdMarvelWebView admarvelwebview;
            for (admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get(); admarvelwebview == null || expand_url != null && URLUtil.isNetworkUrl(expand_url) && !Utils.isNetworkAvailable(admarvelwebview.getContext());)
            {
                return;
            }

            Intent intent = new Intent(admarvelwebview.getContext(), com/admarvel/android/ads/AdMarvelActivity);
            intent.addFlags(0x10000000);
            intent.putExtra("expand_url", expand_url);
            intent.putExtra("closeBtnEnabled", admarvelwebview.closeButtonVisible);
            intent.putExtra("closeAreaEnabled", admarvelwebview.showOnlyCloseArea);
            if (admarvelwebview.isRotationDisabledForExpand)
            {
                intent.putExtra("orientationState", admarvelwebview.twoPartOrientationState);
            }
            intent.putExtra("isInterstitial", false);
            intent.putExtra("isInterstitialClick", false);
            intent.putExtra("source", admarvelwebview.source);
            intent.putExtra("GUID", admarvelwebview.GUID);
            adMarvelAd.removeNonStringEntriesTargetParam();
            try
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
                objectoutputstream.writeObject(adMarvelAd);
                objectoutputstream.close();
                intent.putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            admarvelwebview.getContext().startActivity(intent);
            if (AdMarvelWebView.getListener(admarvelwebview.GUID) != null)
            {
                AdMarvelWebView.getListener(admarvelwebview.GUID).onExpand();
            }
            (new Utils(admarvelwebview.getContext(), admarvelwebview.handler)).registerTrackingEvent(admarvelwebview.xml);
        }

        public ExpandTwoPartRunnable(AdMarvelWebView admarvelwebview, String s, AdMarvelAd admarvelad)
        {
            expand_url = null;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            expand_url = s;
            adMarvelAd = admarvelad;
        }
    }

    private static class FirePixelRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        private final String pixelUrl;

        public void run()
        {
            AdMarvelWebView admarvelwebview;
            if ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get() != null)
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && pixelUrl != null && pixelUrl.length() != 0)
                {
                    if (AdMarvelView.enableOfflineSDK)
                    {
                        (new AdmarvelOfflineUtils()).firePixel(pixelUrl, admarvelwebview.getContext(), admarvelwebview.handler);
                        return;
                    } else
                    {
                        (new Utils(admarvelwebview.getContext(), admarvelwebview.handler)).firePixel(pixelUrl);
                        return;
                    }
                }
            }
        }

        public FirePixelRunnable(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null)
            {
                if (!Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelinternalwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
                {
                    admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
                    return;
                }
                if (Utils.isFeatureSupported(admarvelinternalwebview.getContext(), "location"))
                {
                    Location location = AdMarvelLocationManager.getInstance().getLocation(admarvelinternalwebview);
                    if (location != null)
                    {
                        mLocationResult = (new StringBuilder(String.valueOf(location.getLatitude()))).append(",").append(location.getLongitude()).append(",").append(location.getAccuracy()).toString();
                    }
                    admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mcallback).append("(").append(mLocationResult).append(")").toString());
                    return;
                }
            }
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
        private final WeakReference adMarvelWebViewReference;

        private int getCurrentOriention()
        {
            return currentOrientaion;
        }

        public void run()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            Context context;
            if (admarvelwebview != null)
            {
                if ((context = admarvelwebview.getContext()) != null)
                {
                    currentOrientaion = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
                    admarvelwebview.activityCurrentOrientationPostAPI9 = currentOrientaion;
                    return;
                }
            }
        }



        public GetOrientation(AdMarvelWebView admarvelwebview)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }

    private static class InitAdMarvel
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        private final String callback;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelWebView admarvelwebview;
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview == null)
            {
                return;
            }
            if (admarvelinternalwebview == null) goto _L2; else goto _L1
_L1:
            Object obj1 = null;
            String s = Utils.getDeviceConnectivitiy(admarvelwebview.getContext());
            if (Version.getAndroidSDKVersion() >= 9) goto _L4; else goto _L3
_L3:
            int i = admarvelwebview.getResources().getConfiguration().orientation;
            if (i != 1) goto _L6; else goto _L5
_L5:
            i = 0;
_L19:
            Object obj;
            Object obj2;
            String s1;
            Object obj3;
            Object obj4;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            boolean flag;
            if (s.equals("wifi") || s.equals("mobile"))
            {
                obj = "YES";
            } else
            {
                obj = "NO";
            }
            if (Utils.isFeatureSupported(admarvelwebview.getContext(), "location"))
            {
                obj1 = AdMarvelLocationManager.getInstance().getLocation(admarvelinternalwebview);
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_1166;
            }
            obj1 = (new StringBuilder("{lat:")).append(((Location) (obj1)).getLatitude()).append(", lon:").append(((Location) (obj1)).getLongitude()).append(", acc:").append(((Location) (obj1)).getAccuracy()).append("}").toString();
_L26:
            obj2 = (new StringBuilder("{screen: true, orientation: true, heading: ")).append(Utils.isFeatureSupported(admarvelwebview.getContext(), "compass")).append(", location : ");
            if (!Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            obj2 = ((StringBuilder) (obj2)).append(flag).append(",shake: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(",tilt: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(", network: true, sms:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", phone:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", email:true,calendar:");
            if (Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.WRITE_CALENDAR"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = ((StringBuilder) (obj2)).append(flag).append(", camera: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "camera")).append(",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}").toString();
            obj2 = (AdMarvelView)admarvelinternalwebview.adMarvelViewReference.get();
            if (obj2 == null) goto _L8; else goto _L7
_L7:
            obj3 = new int[2];
            try
            {
                admarvelinternalwebview.getLocationOnScreen(((int []) (obj3)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj4)
            {
                obj3[0] = 0;
                obj3[1] = 0;
            }
            if (!(admarvelwebview.getContext() instanceof Activity)) goto _L10; else goto _L9
_L9:
            obj4 = (Activity)admarvelwebview.getContext();
            if (obj4 == null) goto _L10; else goto _L11
_L11:
            if (admarvelwebview.activityTopOffset == 0x80000000 || admarvelwebview.activityTopOffset < 0) goto _L13; else goto _L12
_L12:
            j = admarvelwebview.activityTopOffset;
_L21:
            i1 = obj3[0];
            l = obj3[1] - j;
            k = ((AdMarvelView) (obj2)).getWidth();
            j = ((AdMarvelView) (obj2)).getHeight();
            admarvelinternalwebview.mInitLayoutX = i1;
            admarvelinternalwebview.mInitLayoutY = l;
_L24:
            i2 = admarvelwebview.getRootView().getLeft();
            l1 = admarvelwebview.getRootView().getTop();
            k1 = admarvelwebview.getRootView().getWidth();
            j1 = admarvelwebview.getRootView().getHeight();
            if (!(admarvelwebview.getContext() instanceof Activity)) goto _L15; else goto _L14
_L14:
            obj3 = (Activity)admarvelwebview.getContext();
            if (obj3 == null) goto _L15; else goto _L16
_L16:
            obj2 = Utils.getSupportedInterfaceOrientations(((Activity) (obj3)));
            obj3 = (ViewGroup)((Activity) (obj3)).getWindow().findViewById(0x1020002);
            i2 = ((ViewGroup) (obj3)).getLeft();
            l1 = ((ViewGroup) (obj3)).getTop();
            k1 = ((ViewGroup) (obj3)).getWidth();
            j1 = ((ViewGroup) (obj3)).getHeight();
            break MISSING_BLOCK_LABEL_610;
_L6:
            if (i != 2) goto _L18; else goto _L17
_L17:
            i = 90;
              goto _L19
_L4:
            i = admarvelwebview.activityCurrentOrientationPostAPI9;
            if (i == 0)
            {
                i = 0;
            } else
            if (i == 1)
            {
                i = 90;
            } else
            {
                if (i != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = 180;
            }
              goto _L19
_L23:
            try
            {
                obj = (new StringBuilder("javascript:")).append(callback).append("({x:").append(i1).append(",y:").append(l).append(",width:").append(k).append(",height:").append(j).append(",appX:").append(i2).append(",appY:").append(l1).append(",appWidth:").append(k1).append(",appHeight:").append(j1).append(",orientation:").append(i).append(",networkType:").append("'").append(s).append("'").append(",network:").append("'").append(((String) (obj))).append("'").append(",screenWidth:").append(Utils.getDeviceWidth(admarvelwebview.getContext())).append(",screenHeight:").append(Utils.getDeviceHeight(admarvelwebview.getContext())).append(",adType:").append("'").append("Banner").append("'").append(",supportedFeatures:").append(s1).append(",sdkVersion:").append("'").append("2.4.2.1").append("'").append(",location:").append(((String) (obj1))).append(",applicationSupportedOrientations:").append("'").append(((String) (obj2))).append("'").append("})").toString();
                Logging.log(((String) (obj)));
                admarvelinternalwebview.loadUrl(((String) (obj)));
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
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            }
            return;
_L13:
            ViewGroup viewgroup = (ViewGroup)((Activity) (obj4)).getWindow().findViewById(0x1020002);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((Activity) (obj4)).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            k = displaymetrics.heightPixels - viewgroup.getMeasuredHeight();
            j = k;
            if (k < 0) goto _L21; else goto _L20
_L20:
            j = k;
            if (admarvelwebview.activityTopOffset != 0x80000000) goto _L21; else goto _L22
_L22:
            admarvelwebview.activityTopOffset = k;
            j = k;
              goto _L21
_L15:
            obj2 = "0,90";
              goto _L23
_L10:
            j = 0;
              goto _L21
_L8:
            j = 0;
            k = 0;
            l = 0;
            i1 = 0;
              goto _L24
_L18:
            i = -1;
              goto _L19
_L2:
            return;
            if (i != 3) goto _L18; else goto _L25
_L25:
            i = -90;
              goto _L19
            obj1 = "null";
              goto _L26
        }

        public InitAdMarvel(String s, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview)
        {
            callback = s;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }

    public static class InnerJS
    {

        final AdMarvelAd adMarvelAd;
        final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        private final WeakReference contextReference;
        private final Handler handler;
        private String lockedOrientation;

        public void cacheitem(String s, String s1, int i)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && (admarvelinternalwebview == null || !admarvelinternalwebview.isSignalShutdown()))
                {
                    if (Version.getAndroidSDKVersion() >= 11)
                    {
                        handler.post(new AdMarvelJavascriptCachedAdAsyncTaskPostAPI11(admarvelwebview.getContext(), admarvelinternalwebview, s, s1, i, admarvelwebview.storage));
                        return;
                    } else
                    {
                        (new AdMarvelJavascriptCachedAdAsyncTask(admarvelwebview.getContext(), admarvelinternalwebview, admarvelwebview.storage)).execute(new Object[] {
                            s, s1, Integer.valueOf(i)
                        });
                        return;
                    }
                }
            }
        }

        public void checkForApplicationSupportedOrientations(final String mCallback)
        {
            final AdMarvelInternalWebView view;
            view = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            break MISSING_BLOCK_LABEL_11;
_L2:
            Object obj;
            HashMap hashmap;
            int i;
            int j;
            do
            {
                return;
            } while (view == null || view != null && view.isSignalShutdown());
            obj = view.getContext();
            if (obj == null || !(obj instanceof Activity))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = Utils.getSupportedInterfaceOrientations((Activity)obj).split(",");
            hashmap = new HashMap();
            hashmap.put("portrait", "NO");
            hashmap.put("landscapeLeft", "NO");
            hashmap.put("landscapeRight", "NO");
            hashmap.put("portraitUpsideDown", "NO");
            j = obj.length;
            i = 0;
_L3:
label0:
            {
                if (i < j)
                {
                    break label0;
                }
                obj = (new StringBuilder("\"{portrait:")).append((String)hashmap.get("portrait")).append(",").append("landscapeLeft:").append((String)hashmap.get("landscapeLeft")).append(",").append("landscapeRight:").append((String)hashmap.get("landscapeRight")).append(",").append("portraitUpsideDown:").append((String)hashmap.get("portraitUpsideDown")).append("}\"").toString();
                if (view != null)
                {
                    handler.post(((_cls1) (obj)). new Runnable() {

                        final InnerJS this$1;
                        private final String val$mCallback;
                        private final String val$supportedScreenOrientationParam;
                        private final AdMarvelInternalWebView val$view;

                        public void run()
                        {
                            view.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(").append(supportedScreenOrientationParam).append(")").toString());
                        }

            
            {
                this$1 = final_innerjs;
                view = admarvelinternalwebview;
                mCallback = s;
                supportedScreenOrientationParam = String.this;
                super();
            }
                    });
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
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
              goto _L3
            if (true) goto _L2; else goto _L4
_L4:
        }

        public void checkFrameValues(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    if (Version.getAndroidSDKVersion() >= 9)
                    {
                        GetOrientation getorientation = new GetOrientation(admarvelwebview);
                        handler.post(getorientation);
                    }
                    handler.post(new CheckFrameValues(s, admarvelinternalwebview, admarvelwebview));
                    return;
                }
            }
        }

        public void checkNetworkAvailable(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            if ((AdMarvelWebView)adMarvelWebViewReference.get() != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    handler.post(new CheckNetworkAvailableRunnable(admarvelinternalwebview, s));
                    return;
                }
            }
        }

        public void close()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    handler.post(new CloseRunnable(admarvelwebview));
                    return;
                }
            }
        }

        public void createcalendarevent(final String date, final String title, String s)
        {
            final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelWebView != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown() && Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR"))
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelWebView.getContext());
                    builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", s. new android.content.DialogInterface.OnClickListener() {

                        final InnerJS this$1;
                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                        private final AdMarvelWebView val$adMarvelWebView;
                        private final String val$date;
                        private final String val$description;
                        private final String val$title;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (Version.getAndroidSDKVersion() >= 14)
                            {
                                handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelWebView, date, title, description));
                                return;
                            } else
                            {
                                handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelWebView, date, title, description));
                                return;
                            }
                        }

            
            {
                this$1 = final_innerjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                adMarvelWebView = admarvelwebview;
                date = s;
                title = s1;
                description = String.this;
                super();
            }
                    }).setNegativeButton("No", new android.content.DialogInterface.OnClickListener() {

                        final InnerJS this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.cancel();
                        }

            
            {
                this$1 = InnerJS.this;
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
            final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelWebView != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown() && Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR"))
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelWebView.getContext());
                    builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", i. new android.content.DialogInterface.OnClickListener() {

                        final InnerJS this$1;
                        private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                        private final AdMarvelWebView val$adMarvelWebView;
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
                                handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelWebView, date, title, description, location, allday, endDate, reminderoffset));
                                return;
                            } else
                            {
                                handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelWebView, date, title, description, location, allday, endDate, reminderoffset));
                                return;
                            }
                        }

            
            {
                this$1 = final_innerjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                adMarvelWebView = admarvelwebview;
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

                        final InnerJS this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.cancel();
                        }

            
            {
                this$1 = InnerJS.this;
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
            final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelWebView != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown())
                {
                    if (!Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.READ_CALENDAR") || !Utils.isPermissionGranted(adMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR"))
                    {
                        if (callback != null)
                        {
                            handler.post(callback. new Runnable() {

                                final InnerJS this$1;
                                private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                private final String val$callback;

                                public void run()
                                {
                                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(NO)").toString());
                                }

            
            {
                this$1 = final_innerjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelWebView.getContext());
                        builder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", callback. new android.content.DialogInterface.OnClickListener() {

                            final InnerJS this$1;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final AdMarvelWebView val$adMarvelWebView;
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
                                    handler.post(new CreateEventRunnablePostAPI14(adMarvelInternalWebView, adMarvelWebView, date, title, description, location, allday, endDate, reminderoffset, timezone, url, recurrenceRules, exceptionDateString, status, availability, callback));
                                    return;
                                } else
                                {
                                    handler.post(new CreateEventRunnable(adMarvelInternalWebView, adMarvelWebView, date, title, description, location, allday, endDate, reminderoffset, timezone, url, recurrenceRules, exceptionDateString, status, availability, callback));
                                    return;
                                }
                            }

            
            {
                this$1 = final_innerjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                adMarvelWebView = admarvelwebview;
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

                            final InnerJS this$1;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$callback;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (callback != null)
                                {
                                    handler.post(callback. new Runnable() {

                                        final InnerJS._cls8 this$2;
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
                this$1 = final_innerjs;
                callback = s;
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

        public void delaydisplay()
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown()) goto _L2; else goto _L3
_L3:
            return;
_L2:
            if ((obj = (AdMarvelWebView)adMarvelWebViewReference.get()) != null)
            {
                ((AdMarvelWebView) (obj)).delayDisplay.set(true);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
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
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.visibilityCallback = s;
            }
        }

        public void disableRotationForExpand()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.isRotationDisabledForExpand = true;
                    lockedOrientation = null;
                    if (admarvelwebview.isExpandedState && admarvelwebview.isFullScreenExpansionIntended)
                    {
                        disablerotations(lockedOrientation);
                        return;
                    }
                }
            }
        }

        public void disableRotationForExpand(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.isRotationDisabledForExpand = true;
                    lockedOrientation = s;
                    if (admarvelwebview.isExpandedState && admarvelwebview.isFullScreenExpansionIntended)
                    {
                        disablerotations(s);
                        return;
                    }
                }
            }
        }

        public void disableautodetect()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.enableAutoDetect.set(false);
                    return;
                }
            }
        }

        public void disablerotations()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    Object obj = admarvelwebview.getContext();
                    if (obj != null && (obj instanceof Activity))
                    {
                        obj = (Activity)obj;
                    } else
                    {
                        obj = null;
                    }
                    if (obj != null)
                    {
                        int i = admarvelwebview.getResources().getConfiguration().orientation;
                        if (i == 1)
                        {
                            ((Activity) (obj)).setRequestedOrientation(1);
                            return;
                        }
                        if (i == 2)
                        {
                            ((Activity) (obj)).setRequestedOrientation(0);
                            return;
                        }
                    }
                }
            }
        }

        public void disablerotations(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview != null) goto _L2; else goto _L1
_L1:
            Object obj;
            return;
_L2:
            if ((obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && ((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj1 = null;
            Context context = admarvelwebview.getContext();
            obj = obj1;
            if (context != null)
            {
                obj = obj1;
                if (context instanceof Activity)
                {
                    obj = (Activity)context;
                }
            }
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (Version.getAndroidSDKVersion() >= 9) goto _L4; else goto _L3
_L3:
            int j = admarvelwebview.getResources().getConfiguration().orientation;
_L6:
            if (s == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (admarvelwebview.isRotationDisabledForExpand)
            {
                break MISSING_BLOCK_LABEL_249;
            }
            if (Version.getAndroidSDKVersion() < 9)
            {
                if (s.equalsIgnoreCase("Portrait") && j == 1)
                {
                    ((Activity) (obj)).setRequestedOrientation(1);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_206;
_L4:
            GetOrientation getorientation = new GetOrientation(admarvelwebview);
            handler.post(getorientation);
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
            if (true) goto _L6; else goto _L5
_L5:
            if (!s.equalsIgnoreCase("LandscapeLeft") || j != 2) goto _L1; else goto _L7
_L7:
            ((Activity) (obj)).setRequestedOrientation(0);
            return;
            if (s.equalsIgnoreCase("Portrait") && j == 0)
            {
                ((Activity) (obj)).setRequestedOrientation(1);
                return;
            }
            if (s.equalsIgnoreCase("LandscapeLeft") && j == 1)
            {
                ((Activity) (obj)).setRequestedOrientation(0);
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (Version.getAndroidSDKVersion() < 9)
            {
                if (s.equalsIgnoreCase("Portrait"))
                {
                    ((Activity) (obj)).setRequestedOrientation(1);
                    return;
                }
                if (s.equalsIgnoreCase("LandscapeLeft"))
                {
                    ((Activity) (obj)).setRequestedOrientation(0);
                    return;
                }
            } else
            {
                handler.post(new SetOrientationRunnable(((Activity) (obj)), s));
                return;
            }
            if (true) goto _L1; else goto _L8
_L8:
            if (Version.getAndroidSDKVersion() < 9)
            {
                if (j == 1)
                {
                    ((Activity) (obj)).setRequestedOrientation(1);
                    return;
                }
                if (j == 2)
                {
                    ((Activity) (obj)).setRequestedOrientation(0);
                    return;
                }
            } else
            {
                if (j == 0)
                {
                    handler.post(new SetOrientationRunnable(((Activity) (obj)), "Portrait"));
                    return;
                }
                if (j == 1)
                {
                    handler.post(new SetOrientationRunnable(((Activity) (obj)), "LandscapeLeft"));
                    return;
                } else
                {
                    handler.post(new SetOrientationRunnable(((Activity) (obj)), "none"));
                    return;
                }
            }
            if (true) goto _L1; else goto _L9
_L9:
        }

        public void enableautodetect()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.enableAutoDetect.set(true);
                    return;
                }
            }
        }

        public void enablerotations()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    Object obj = admarvelwebview.getContext();
                    if (obj != null && (obj instanceof Activity))
                    {
                        obj = (Activity)obj;
                    } else
                    {
                        obj = null;
                    }
                    if (obj != null)
                    {
                        ((Activity) (obj)).setRequestedOrientation(admarvelwebview.activityLastOrientation);
                        admarvelwebview.isRotationDisabledForExpand = false;
                        return;
                    }
                }
            }
        }

        public void expandto(int i, int j)
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && ((obj = ((AdMarvelInternalWebView) (obj)).getContext()) != null && (obj instanceof Activity)))
                {
                    obj = (Activity)obj;
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), i, j));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), i, j, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void expandto(int i, int j, int k, int l, String s, String s1)
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && ((obj = ((AdMarvelInternalWebView) (obj)).getContext()) != null && (obj instanceof Activity)))
                {
                    obj = (Activity)obj;
                    if (s1 != null && s1.length() > 0)
                    {
                        expandtofullscreen(s, s1);
                        return;
                    }
                    if (s != null)
                    {
                        admarvelwebview.mCloseCallback = s;
                    }
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), i, j, k, l));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), i, j, k, l, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void expandto(int i, int j, String s, String s1)
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && ((obj = ((AdMarvelInternalWebView) (obj)).getContext()) != null && (obj instanceof Activity)))
                {
                    obj = (Activity)obj;
                    if (s1 != null && s1.length() > 0)
                    {
                        expandtofullscreen(s, s1);
                        return;
                    }
                    if (s != null)
                    {
                        admarvelwebview.mCloseCallback = s;
                    }
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), i, j));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), i, j, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void expandtofullscreen()
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && ((obj = ((AdMarvelInternalWebView) (obj)).getContext()) != null && (obj instanceof Activity)))
                {
                    obj = (Activity)obj;
                    admarvelwebview.isFullScreenExpansionIntended = true;
                    if (admarvelwebview.isRotationDisabledForExpand)
                    {
                        disablerotations(lockedOrientation);
                    }
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void expandtofullscreen(String s)
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && ((obj = ((AdMarvelInternalWebView) (obj)).getContext()) != null && (obj instanceof Activity)))
                {
                    obj = (Activity)obj;
                    admarvelwebview.isFullScreenExpansionIntended = true;
                    if (s != null)
                    {
                        admarvelwebview.mCloseCallback = s;
                    }
                    if (admarvelwebview.isRotationDisabledForExpand)
                    {
                        disablerotations(lockedOrientation);
                    }
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void expandtofullscreen(String s, String s1)
        {
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            AdMarvelWebView admarvelwebview;
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown())
            {
                if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null)
                {
                    Context context = ((AdMarvelInternalWebView) (obj)).getContext();
                    obj = null;
                    if (context != null && (context instanceof Activity))
                    {
                        obj = (Activity)context;
                    } else
                    if (s1 == null || s1.length() == 0)
                    {
                        return;
                    }
                    if (s != null)
                    {
                        admarvelwebview.mCloseCallback = s;
                    }
                    admarvelwebview.isFullScreenExpansionIntended = true;
                    if (s1 != null && s1.length() > 0)
                    {
                        admarvelwebview.mTwoPartExpandUrl = s1;
                        admarvelwebview.isTwoPartExpandable = true;
                    }
                    if (admarvelwebview.isRotationDisabledForExpand)
                    {
                        if (admarvelwebview.isTwoPartExpandable)
                        {
                            if (lockedOrientation != null && lockedOrientation.length() > 0)
                            {
                                admarvelwebview.twoPartOrientationState = lockedOrientation;
                            } else
                            {
                                admarvelwebview.twoPartOrientationState = "Current";
                            }
                        } else
                        {
                            disablerotations(lockedOrientation);
                        }
                    }
                    if (s1 != null && s1.length() > 0)
                    {
                        handler.post(new ExpandTwoPartRunnable(admarvelwebview, s1, adMarvelAd));
                        return;
                    }
                    if (admarvelwebview.isExpandedState)
                    {
                        handler.post(new ExpandResizeRunnable(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1));
                        return;
                    } else
                    {
                        handler.post(new ExpandTo(admarvelwebview, ((Activity) (obj)), 0, 0, -1, -1, adMarvelAd));
                        return;
                    }
                }
            }
        }

        public void firePixel(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    handler.post(new FirePixelRunnable(admarvelinternalwebview, admarvelwebview, s));
                    return;
                }
            }
        }

        public void getLocation(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                handler.post(new GetLocationRunnable(admarvelinternalwebview, s));
            }
        }

        public void initAdMarvel(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
                {
                    if (Version.getAndroidSDKVersion() >= 9)
                    {
                        GetOrientation getorientation = new GetOrientation(admarvelwebview);
                        handler.post(getorientation);
                    }
                    handler.post(new InitAdMarvel(s, admarvelinternalwebview, admarvelwebview));
                    return;
                }
            }
        }

        public int isinitialload()
        {
            return 1;
        }

        public int isinstalled(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return 0;
            }
            if (admarvelinternalwebview != null && admarvelinternalwebview.isSignalShutdown())
            {
                return 0;
            }
            return !Utils.isAppInstalled(admarvelinternalwebview.getContext(), s) ? 0 : 1;
        }

        public void notifyInAppBrowserCloseAction(String s)
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.mInAppBrowserCloseCallback = s;
            }
        }

        public void readyfordisplay()
        {
            if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
            Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (obj == null || !((AdMarvelInternalWebView) (obj)).isSignalShutdown()) goto _L2; else goto _L3
_L3:
            return;
_L2:
            if ((obj = (AdMarvelWebView)adMarvelWebViewReference.get()) != null)
            {
                if (((AdMarvelWebView) (obj)).pageLoaded.get())
                {
                    if (((AdMarvelWebView) (obj)).pendingLoad.compareAndSet(true, false) && AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
                    {
                        AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onReceiveAd(((AdMarvelWebView) (obj)), adMarvelAd);
                        return;
                    }
                } else
                {
                    ((AdMarvelWebView) (obj)).delayDisplay.set(false);
                    return;
                }
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        public void redirect(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.redirectUrl(s);
                    return;
                }
            }
        }

        public void registeraccelerationevent(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && ((admarvelsensormanager = AdMarvelSensorManager.getInstance()) != null && admarvelsensormanager.isSupported(admarvelwebview.getContext())))
                {
                    admarvelsensormanager.setTiltCallback(s);
                    admarvelsensormanager.init(admarvelwebview.getContext(), admarvelinternalwebview);
                    return;
                }
            }
        }

        public void registerheadingevent(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && ((admarvelsensormanager = AdMarvelSensorManager.getInstance()) != null && admarvelsensormanager.isSupported(admarvelwebview.getContext())))
                {
                    admarvelsensormanager.setHeadingCallback(s);
                    admarvelsensormanager.init(admarvelwebview.getContext(), admarvelinternalwebview);
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
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelSensorManager admarvelsensormanager;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && ((admarvelsensormanager = AdMarvelSensorManager.getInstance()) != null && admarvelsensormanager.isSupported(admarvelwebview.getContext())))
                {
                    admarvelsensormanager.setShakeCallback(s);
                    admarvelsensormanager.setShakeProperties(s1, s2);
                    admarvelsensormanager.init(admarvelwebview.getContext(), admarvelinternalwebview);
                    return;
                }
            }
        }

        public void sdkclosebutton(String s, String s1)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.enableCloseButton = false;
                    admarvelwebview.showOnlyCloseArea = false;
                    admarvelwebview.closeButtonVisible = false;
                    if (s != null && s.equals("true"))
                    {
                        admarvelwebview.enableCloseButton = true;
                        admarvelwebview.closeButtonVisible = true;
                        return;
                    }
                    if (s != null && s.equals("false") && s1 != null && s1.equals("true"))
                    {
                        admarvelwebview.enableCloseButton = true;
                        admarvelwebview.showOnlyCloseArea = true;
                        admarvelwebview.closeButtonVisible = false;
                        return;
                    }
                }
            }
        }

        public void sdkclosebutton(String s, String s1, String s2)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    admarvelwebview.enableCloseButton = false;
                    admarvelwebview.showOnlyCloseArea = false;
                    admarvelwebview.closeButtonVisible = false;
                    if (s != null && s.equals("true"))
                    {
                        admarvelwebview.enableCloseButton = true;
                        admarvelwebview.closeButtonVisible = true;
                    } else
                    if (s != null && s.equals("false") && s1 != null && s1.equals("true"))
                    {
                        admarvelwebview.enableCloseButton = true;
                        admarvelwebview.showOnlyCloseArea = true;
                        admarvelwebview.closeButtonVisible = false;
                    }
                    if (s2 != null && s2.length() > 0)
                    {
                        admarvelwebview.closeButtonPosition = s2;
                        return;
                    }
                }
            }
        }

        public void setbackgroundcolor(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview != null) goto _L2; else goto _L1
_L1:
            AdMarvelInternalWebView admarvelinternalwebview;
            return;
_L2:
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || admarvelinternalwebview.isSignalShutdown()) goto _L1; else goto _L3
_L3:
            if (!"0".equals(s)) goto _L5; else goto _L4
_L4:
            int i = 0;
_L7:
            admarvelinternalwebview.setBackgroundColor(i);
            admarvelwebview.bgcolor = i;
            handler.post(new SetBackgroundColorRunnable(admarvelwebview));
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

        public void setsoftwarelayer()
        {
            AdMarvelInternalWebView admarvelinternalwebview;
            if ((AdMarvelWebView)adMarvelWebViewReference.get() != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown() && Version.getAndroidSDKVersion() >= 11)
                {
                    handler.post(new UpdateWebViewLayerType(admarvelinternalwebview));
                    return;
                }
            }
        }

        public void storepicture(final String redirectUrl, final String callback)
        {
            final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
            final AdMarvelInternalWebView adMarvelInternalWebView;
            if (adMarvelWebView != null)
            {
                if ((adMarvelInternalWebView = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !adMarvelInternalWebView.isSignalShutdown())
                {
                    redirectUrl = Utils.redirectURLCheck(redirectUrl, adMarvelWebView.getContext());
                    if (!Utils.isPermissionGranted(adMarvelInternalWebView.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") || !"mounted".equals(Environment.getExternalStorageState()))
                    {
                        if (callback != null)
                        {
                            handler.post(callback. new Runnable() {

                                final InnerJS this$1;
                                private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                                private final String val$callback;

                                public void run()
                                {
                                    adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(callback).append("(NO)").toString());
                                }

            
            {
                this$1 = final_innerjs;
                adMarvelInternalWebView = admarvelinternalwebview;
                callback = String.this;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adMarvelWebView.getContext());
                        builder.setMessage("Allow storing image in your Gallery?").setCancelable(false).setPositiveButton("Yes", callback. new android.content.DialogInterface.OnClickListener() {

                            final InnerJS this$1;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final AdMarvelWebView val$adMarvelWebView;
                            private final String val$callback;
                            private final String val$redirectUrl;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (Version.getAndroidSDKVersion() < 8)
                                {
                                    handler.post(new StorePictureRunnablePreAPI8(adMarvelWebView, adMarvelInternalWebView, redirectUrl, callback));
                                    return;
                                } else
                                {
                                    handler.post(new StorePictureRunnable(adMarvelWebView, adMarvelInternalWebView, redirectUrl, callback));
                                    return;
                                }
                            }

            
            {
                this$1 = final_innerjs;
                adMarvelWebView = admarvelwebview;
                adMarvelInternalWebView = admarvelinternalwebview;
                redirectUrl = s;
                callback = String.this;
                super();
            }
                        }).setNegativeButton("No", adMarvelInternalWebView. new android.content.DialogInterface.OnClickListener() {

                            final InnerJS this$1;
                            private final AdMarvelInternalWebView val$adMarvelInternalWebView;
                            private final String val$callback;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (callback != null)
                                {
                                    handler.post(callback. new Runnable() {

                                        final InnerJS._cls11 this$2;
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
                this$1 = final_innerjs;
                callback = s;
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

        public void updatestate(String s)
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            AdMarvelInternalWebView admarvelinternalwebview;
            if (admarvelwebview != null)
            {
                if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) == null || !admarvelinternalwebview.isSignalShutdown())
                {
                    handler.post(new UpdateVisibility(s, admarvelwebview));
                    return;
                }
            }
        }


        public InnerJS(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelAd admarvelad, Handler handler1, AdMarvelWebView admarvelwebview, Context context)
        {
            lockedOrientation = null;
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            contextReference = new WeakReference(context);
            adMarvelAd = admarvelad;
            handler = handler1;
        }
    }

    private static class OrientationListenerPrivate extends OrientationEventListener
    {

        private final WeakReference activityReference;
        private final WeakReference adMarvelWebViewReference;
        private int lastOrientation;

        public void onOrientationChanged(int i)
        {
            if (lastOrientation == -1)
            {
                lastOrientation = i;
            } else
            if (Math.abs(i - lastOrientation) >= 90 && Math.abs(i - lastOrientation) <= 270)
            {
                final AdMarvelWebView adMarvelWebView = (AdMarvelWebView)adMarvelWebViewReference.get();
                if (adMarvelWebView != null)
                {
                    adMarvelWebView.handler.postDelayed(i. new Runnable() {

                        final OrientationListenerPrivate this$1;
                        private final AdMarvelWebView val$adMarvelWebView;
                        private final int val$orientation;

                        public void run()
                        {
                            Object obj;
                            Object obj1;
                            obj = (Activity)activityReference.get();
                            if (obj == null || !adMarvelWebView.isExpandedState)
                            {
                                break MISSING_BLOCK_LABEL_204;
                            }
                            obj = (ViewGroup)((Activity) (obj)).getWindow().findViewById(0x1020002);
                            obj1 = (RelativeLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(adMarvelWebView.GUID))).append("EXPAND_LAYOUT").toString());
                            if (obj1 != null) goto _L2; else goto _L1
_L1:
                            return;
_L2:
                            LinearLayout linearlayout;
                            obj1 = (android.widget.FrameLayout.LayoutParams)((RelativeLayout) (obj1)).getLayoutParams();
                            linearlayout = (LinearLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(adMarvelWebView.GUID))).append("BTN_CLOSE").toString());
                            if (linearlayout == null) goto _L1; else goto _L3
_L3:
                            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
                            int i = ((ViewGroup) (obj)).getHeight();
                            int j = ((ViewGroup) (obj)).getWidth();
                            float f = TypedValue.applyDimension(1, 30F, adMarvelWebView.getContext().getResources().getDisplayMetrics());
                            AdMarvelWebView.updateCloseButtonPosition(linearlayout, layoutparams, adMarvelWebView.closeButtonPosition, ((android.widget.FrameLayout.LayoutParams) (obj1)).leftMargin, ((android.widget.FrameLayout.LayoutParams) (obj1)).topMargin, ((android.widget.FrameLayout.LayoutParams) (obj1)).width, ((android.widget.FrameLayout.LayoutParams) (obj1)).height, j, i, (int)f);
                            lastOrientation = orientation;
                            return;
                        }

            
            {
                this$1 = final_orientationlistenerprivate;
                adMarvelWebView = admarvelwebview;
                orientation = I.this;
                super();
            }
                    }, 500L);
                    return;
                }
            }
        }



        public OrientationListenerPrivate(AdMarvelWebView admarvelwebview, Activity activity, int i)
        {
            super(activity, i);
            lastOrientation = -1;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            activityReference = new WeakReference(activity);
        }
    }

    private static class RedirectRunnable
        implements Runnable
    {

        private final AdMarvelAd adMarvelAd;
        private final WeakReference adMarvelWebViewReference;
        private String url;

        public void run()
        {
            Object obj;
            Object obj1;
            try
            {
                obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log((new StringBuilder(String.valueOf(((Exception) (obj)).getMessage()))).append(" Exception in RedirectRunnable ").toString());
                return;
            }
            if (obj == null)
            {
                return;
            }
            if (!((AdMarvelWebView) (obj)).enableClickRedirect) goto _L2; else goto _L1
_L1:
            obj1 = ((AdMarvelWebView) (obj)).getContext();
            if (!AdMarvelView.enableOfflineSDK || Utils.checkIfPrivateProtocol(url)) goto _L4; else goto _L3
_L3:
            if (!URLUtil.isNetworkUrl(url) || !Utils.handledBySpecialIntents(((Context) (obj1)), url)) goto _L6; else goto _L5
_L5:
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
                return;
            }
              goto _L7
_L6:
            String s = ((AdMarvelWebView) (obj)).getAdMarvelAd().getOfflinekeyUrl();
            if (!Utils.handledBySpecialIntents(((Context) (obj1)), (new StringBuilder(String.valueOf(s.substring(0, s.lastIndexOf("/"))))).append("/").append(url).toString())) goto _L9; else goto _L8
_L8:
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
                return;
            }
              goto _L7
_L4:
            if (Utils.checkIfPrivateProtocol(url) || !Utils.handledBySpecialIntents(((AdMarvelWebView) (obj)).getContext(), url)) goto _L9; else goto _L10
_L10:
            (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
                return;
            }
              goto _L7
_L9:
            if (url != null && Utils.isPrivateProtocol(url, "admarvelsdk") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
                {
                    AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(url, "admarvelsdk", "", Utils.isPrivateProtocol(url, "admarvelsdk"), ((AdMarvelWebView) (obj)).getContext()));
                }
                (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
                return;
            }
            if (url != null && Utils.isPrivateProtocol(url, "admarvelinternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
                {
                    AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, Utils.parsePrivateProtocol(url, "admarvelinternal", "", Utils.isPrivateProtocol(url, "admarvelinternal"), ((AdMarvelWebView) (obj)).getContext()));
                }
                (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
                return;
            }
            if (!Utils.isNetworkAvailable(((Context) (obj1))) || url == null || Utils.isPrivateProtocol(url, "admarvelvideo") == Utils.PROTOCOL_TYPE.NONE) goto _L12; else goto _L11
_L11:
            obj1 = Utils.parsePrivateProtocol(url, "admarvelvideo", "http://", Utils.isPrivateProtocol(url, "admarvelvideo"), ((AdMarvelWebView) (obj)).getContext());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setDataAndType(Uri.parse(((String) (obj1))), "video/*");
            if (Utils.isIntentAvailable(((AdMarvelWebView) (obj)).getContext(), intent))
            {
                ((AdMarvelWebView) (obj)).getContext().startActivity(intent);
            }
            (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
_L2:
            if (AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID) != null)
            {
                AdMarvelWebView.getListener(((AdMarvelWebView) (obj)).GUID).onClickAd(adMarvelAd, url);
                return;
            }
              goto _L7
_L12:
            if (Utils.isNetworkAvailable(((Context) (obj1))) && url != null && Utils.isPrivateProtocol(url, "admarvelexternal") != Utils.PROTOCOL_TYPE.NONE)
            {
                obj1 = new Intent("android.intent.action.VIEW", Uri.parse(Utils.parsePrivateProtocol(url, "admarvelexternal", "", Utils.isPrivateProtocol(url, "admarvelexternal"), ((AdMarvelWebView) (obj)).getContext())));
                ((Intent) (obj1)).addFlags(0x10000000);
                if (Utils.isIntentAvailable(((AdMarvelWebView) (obj)).getContext(), ((Intent) (obj1))))
                {
                    ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
                }
                (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
                continue; /* Loop/switch isn't completed */
            }
            if (Utils.isNetworkAvailable(((Context) (obj1))) && url != null && Utils.isPrivateProtocol(url, "admarvelcustomvideo") != Utils.PROTOCOL_TYPE.NONE)
            {
                obj1 = new Intent(((AdMarvelWebView) (obj)).getContext(), com/admarvel/android/ads/AdMarvelVideoActivity);
                ((Intent) (obj1)).addFlags(0x10000000);
                ((Intent) (obj1)).putExtra("url", url);
                ((Intent) (obj1)).putExtra("isCustomUrl", true);
                ((Intent) (obj1)).putExtra("xml", ((AdMarvelWebView) (obj)).xml);
                ((Intent) (obj1)).putExtra("source", ((AdMarvelWebView) (obj)).source);
                ((Intent) (obj1)).putExtra("GUID", ((AdMarvelWebView) (obj)).GUID);
                ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
                (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
                continue; /* Loop/switch isn't completed */
            }
            if (!Utils.isNetworkAvailable(((Context) (obj1))) || url == null || url.length() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = new Intent(((AdMarvelWebView) (obj)).getContext(), com/admarvel/android/ads/AdMarvelActivity);
            ((Intent) (obj1)).addFlags(0x10000000);
            ((Intent) (obj1)).putExtra("url", url);
            ((Intent) (obj1)).putExtra("isInterstitial", false);
            ((Intent) (obj1)).putExtra("isInterstitialClick", false);
            ((Intent) (obj1)).putExtra("xml", ((AdMarvelWebView) (obj)).xml);
            ((Intent) (obj1)).putExtra("source", ((AdMarvelWebView) (obj)).source);
            ((Intent) (obj1)).putExtra("GUID", ((AdMarvelWebView) (obj)).GUID);
            adMarvelAd.removeNonStringEntriesTargetParam();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(adMarvelAd);
            objectoutputstream.close();
            ((Intent) (obj1)).putExtra("serialized_admarvelad", bytearrayoutputstream.toByteArray());
_L13:
            ((AdMarvelWebView) (obj)).getContext().startActivity(((Intent) (obj1)));
            (new Utils(((AdMarvelWebView) (obj)).getContext(), ((AdMarvelWebView) (obj)).handler)).registerTrackingEvent(((AdMarvelWebView) (obj)).xml);
            continue; /* Loop/switch isn't completed */
            IOException ioexception;
            ioexception;
            ioexception.printStackTrace();
            if (true) goto _L13; else goto _L7
_L7:
            return;
            if (true) goto _L2; else goto _L14
_L14:
        }

        public RedirectRunnable(String s, AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad)
        {
            url = s;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            adMarvelAd = admarvelad;
        }
    }

    private static class SetBackgroundColorRunnable
        implements Runnable
    {

        private final WeakReference adMarvelWebViewReference;

        public void run()
        {
            AdMarvelWebView admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (admarvelwebview == null)
            {
                return;
            } else
            {
                admarvelwebview.setBackgroundColor(admarvelwebview.bgcolor);
                return;
            }
        }

        public SetBackgroundColorRunnable(AdMarvelWebView admarvelwebview)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
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
            mActivity = (Activity)activityReference.get();
            if (mActivity != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Display display;
            display = ((WindowManager)mActivity.getSystemService("window")).getDefaultDisplay();
            if (lockedOrientation.equalsIgnoreCase("Portrait"))
            {
                mActivity.setRequestedOrientation(1);
                return;
            }
            if (!lockedOrientation.equalsIgnoreCase("LandscapeLeft"))
            {
                break; /* Loop/switch isn't completed */
            }
            mActivity.setRequestedOrientation(0);
            if (display.getRotation() != 1)
            {
                mActivity.setRequestedOrientation(8);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (lockedOrientation.equalsIgnoreCase("PortraitUpSideDown"))
            {
                mActivity.setRequestedOrientation(9);
                return;
            }
            if (!lockedOrientation.equalsIgnoreCase("LandscapeRight"))
            {
                continue; /* Loop/switch isn't completed */
            }
            mActivity.setRequestedOrientation(8);
            if (display.getRotation() != 3)
            {
                mActivity.setRequestedOrientation(0);
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!lockedOrientation.equalsIgnoreCase("none")) goto _L1; else goto _L4
_L4:
            if (display.getRotation() == 2)
            {
                mActivity.setRequestedOrientation(9);
                return;
            }
            if (display.getRotation() == 3)
            {
                mActivity.setRequestedOrientation(8);
                if (display.getRotation() != 3)
                {
                    mActivity.setRequestedOrientation(0);
                    return;
                }
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public SetOrientationRunnable(Activity activity, String s)
        {
            lockedOrientation = null;
            mActivity = null;
            activityReference = new WeakReference(activity);
            lockedOrientation = s;
        }
    }

    private static class StorePictureRunnable
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        String imageUrl;
        String mCallback;

        public void run()
        {
            Object obj1;
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelWebView admarvelwebview;
            String s;
            obj1 = null;
            admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null || admarvelwebview == null)
            {
                return;
            }
            s = (new StringBuilder(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()))).append("/").toString();
            if (!imageUrl.startsWith("/mnt/sdcard")) goto _L2; else goto _L1
_L1:
            if (!(new File(imageUrl)).exists()) goto _L4; else goto _L3
_L3:
            obj1 = BitmapFactory.decodeFile(imageUrl);
            Object obj = null;
_L6:
            Bitmap bitmap;
            bitmap = ((Bitmap) (obj1));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            bitmap = BitmapFactory.decodeStream(((InputStream) (obj)));
            obj = new File(s);
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = (new StringBuilder(String.valueOf(s))).append(System.currentTimeMillis()).append(".jpg").toString();
            obj1 = new FileOutputStream(((String) (obj)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj1)));
            ((FileOutputStream) (obj1)).flush();
            ((FileOutputStream) (obj1)).close();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(((String) (obj)))));
            admarvelwebview.getContext().sendBroadcast(intent);
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
_L4:
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
_L2:
            if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
            {
                imageUrl = Utils.redirectURLCheck(imageUrl, admarvelwebview.getContext());
                obj = (new URL(imageUrl)).openStream();
                continue; /* Loop/switch isn't completed */
            }
            if (imageUrl.startsWith("file:///android_asset/"))
            {
                int i = "file:///android_asset/".length();
                obj = imageUrl.substring(i);
                obj = admarvelwebview.getContext().getAssets().open(((String) (obj)));
                continue; /* Loop/switch isn't completed */
            }
            obj = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public StorePictureRunnable(AdMarvelWebView admarvelwebview, AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            imageUrl = s;
            mCallback = s1;
        }
    }

    private static class StorePictureRunnablePreAPI8
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;
        private final WeakReference adMarvelWebViewReference;
        String imageUrl;
        String mCallback;

        public void run()
        {
            Object obj1;
            AdMarvelInternalWebView admarvelinternalwebview;
            AdMarvelWebView admarvelwebview;
            String s;
            obj1 = null;
            admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null || admarvelwebview == null)
            {
                return;
            }
            s = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().toString()))).append("/Pictures/").toString();
            if (!imageUrl.startsWith("/mnt/sdcard")) goto _L2; else goto _L1
_L1:
            if (!(new File(imageUrl)).exists()) goto _L4; else goto _L3
_L3:
            obj1 = BitmapFactory.decodeFile(imageUrl);
            Object obj = null;
_L6:
            Bitmap bitmap;
            bitmap = ((Bitmap) (obj1));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            bitmap = BitmapFactory.decodeStream(((InputStream) (obj)));
            obj = new File(s);
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = (new StringBuilder(String.valueOf(s))).append(System.currentTimeMillis()).append(".jpg").toString();
            obj1 = new FileOutputStream(((String) (obj)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_194;
            }
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj1)));
            ((FileOutputStream) (obj1)).flush();
            ((FileOutputStream) (obj1)).close();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(((String) (obj)))));
            admarvelwebview.getContext().sendBroadcast(intent);
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
_L4:
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
_L2:
            if (imageUrl.startsWith("http:") || imageUrl.startsWith("https:"))
            {
                imageUrl = Utils.redirectURLCheck(imageUrl, admarvelwebview.getContext());
                obj = (new URL(imageUrl)).openStream();
                continue; /* Loop/switch isn't completed */
            }
            if (imageUrl.startsWith("file:///android_asset/"))
            {
                int i = "file:///android_asset/".length();
                obj = imageUrl.substring(i);
                obj = admarvelwebview.getContext().getAssets().open(((String) (obj)));
                continue; /* Loop/switch isn't completed */
            }
            obj = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public StorePictureRunnablePreAPI8(AdMarvelWebView admarvelwebview, AdMarvelInternalWebView admarvelinternalwebview, String s, String s1)
        {
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
            imageUrl = s;
            mCallback = s1;
        }
    }

    private static class UpdateVisibility
        implements Runnable
    {

        private final WeakReference adMarvelWebViewReference;
        private String mState;

        public void run()
        {
            Object obj = (AdMarvelWebView)adMarvelWebViewReference.get();
            if (obj != null)
            {
                if ((obj = (AdMarvelInternalWebView)((AdMarvelWebView) (obj)).findViewWithTag((new StringBuilder(String.valueOf(((AdMarvelWebView) (obj)).GUID))).append("INTERNAL").toString())) != null)
                {
                    int i = ((AdMarvelInternalWebView) (obj)).getVisibility();
                    if (mState.equals("show") && i != 0)
                    {
                        ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                    }
                    if (mState.equals("hide") && i == 0)
                    {
                        ((AdMarvelInternalWebView) (obj)).setVisibility(4);
                        return;
                    }
                }
            }
        }

        public UpdateVisibility(String s, AdMarvelWebView admarvelwebview)
        {
            mState = null;
            mState = s;
            adMarvelWebViewReference = new WeakReference(admarvelwebview);
        }
    }

    private static class UpdateWebViewLayerType
        implements Runnable
    {

        private final WeakReference adMarvelInternalWebViewReference;

        public void run()
        {
            AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
            if (admarvelinternalwebview == null)
            {
                return;
            } else
            {
                admarvelinternalwebview.setLayerType(1, null);
                return;
            }
        }

        public UpdateWebViewLayerType(AdMarvelInternalWebView admarvelinternalwebview)
        {
            adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        }
    }


    private static String DEFAULT_WEB_VIEW_CSS = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style>";
    private static String DEFAULT_WEB_VIEW_HTML_FORMAT = "<html><head>%s</head><body><div align=\"center\">%s</div></body></html>";
    private static String DEFAULT_WEB_VIEW_VIEWPORT = "<meta name=\"viewport\" content=\"initial-scale=1.0,maximum-scale=1.0,target-densitydpi=device-dpi, width=device-width\" />";
    private static String IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_LANDSCAPE = "<meta name=\"viewport\" content=\"width=320, user-scalable=no\" />";
    private static String IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_PORTRAIT = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />";
    private static String ORMMA_WEB_VIEW_CSS = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style><script type='text/javascript' src='http://admarvel.s3.amazonaws.com/js/admarvel_compete_v1.1.js'></script>";
    private static String TEXT_AD_MINIMIZED_WEB_VIEW_CSS_FORMAT = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0;padding:0;} .bl span{display:table-cell;vertical-align:middle;height:38px;text-align:center;width:500px;} .bl {margin:2px;padding: 2px 15px;display:block;vertical-align:middle;text-align:center;line-height: 15px;font-size:12px;font-family: Helvetica;font-weight: bold;text-decoration: none;color:rgb(%d,%d,%d);text-shadow: #222222 0px 1px 2px; background-color:rgb(%d,%d,%d);background-image: url('http://admarvel.s3.amazonaws.com/btn_bg_trns.png');border: 2px rgb(%d, %d, %d) solid;-webkit-border-radius: 10px;}</style>";
    private static String TEXT_AD_MINIMIZED_WEB_VIEW_HTML_FORMAT = "<html><head>%s</head><body><div class=\"bl\"><a href=\"%s\" style=\"text-decoration: none; color: #000;\" ><span>%s</span></a></div>";
    private static final Map listeners = new HashMap();
    final String GUID = UUID.randomUUID().toString();
    private int activityCurrentOrientationPostAPI9;
    private int activityLastOrientation;
    private int activityTopOffset;
    private AdMarvelAd adMarvelAd;
    private WeakReference adMarvelInternalWebViewReference;
    int bgcolor;
    private String closeButtonPosition;
    private boolean closeButtonVisible;
    private final AtomicBoolean delayDisplay = new AtomicBoolean(false);
    private final AtomicBoolean enableAutoDetect = new AtomicBoolean(true);
    private final boolean enableAutoScaling;
    private boolean enableClickRedirect;
    private boolean enableCloseButton;
    public final AtomicBoolean fullScreenMode = new AtomicBoolean(false);
    private final Handler handler;
    private String html;
    private final WeakReference internalListenerReference;
    private AdMarvelInternalWebView internalWebView;
    private boolean isCloseButtonEnable;
    private boolean isExpandedState;
    private boolean isFullScreenExpansionIntended;
    private boolean isMultiLayerExpandedState;
    private boolean isRotationDisabledForExpand;
    private boolean isTwoPartExpandable;
    String mCloseCallback;
    String mTwoPartExpandUrl;
    private OrientationListenerPrivate orientationListener;
    private final AtomicBoolean pageLoaded = new AtomicBoolean(false);
    private final AtomicBoolean pendingLoad = new AtomicBoolean(false);
    private boolean showOnlyCloseArea;
    private String source;
    private final File storage;
    private String twoPartOrientationState;
    private final String xml;

    AdMarvelWebView(Context context, boolean flag, File file, String s, AdMarvelAd admarvelad, Handler handler1)
    {
        super(context);
        isCloseButtonEnable = false;
        enableCloseButton = false;
        showOnlyCloseArea = false;
        closeButtonVisible = false;
        closeButtonPosition = "top-right";
        isTwoPartExpandable = false;
        twoPartOrientationState = null;
        isMultiLayerExpandedState = false;
        activityLastOrientation = -1;
        activityCurrentOrientationPostAPI9 = 0x80000000;
        activityTopOffset = 0x80000000;
        isRotationDisabledForExpand = false;
        isExpandedState = false;
        isFullScreenExpansionIntended = false;
        adMarvelAd = null;
        xml = s;
        enableAutoScaling = flag;
        handler = handler1;
        storage = file;
        file = new AdMarvelWebViewInternalListener(this);
        if (context instanceof Activity)
        {
            activityLastOrientation = ((Activity)context).getRequestedOrientation();
        }
        internalListenerReference = new WeakReference(file);
        adMarvelAd = admarvelad;
    }

    public static AdMarvelWebViewListener getListener(String s)
    {
        return (AdMarvelWebViewListener)listeners.get(s);
    }

    private void redirectUrl(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (s.length() > 0)
        {
            handler.post(new RedirectRunnable(s, this, adMarvelAd));
        }
        return;
        s;
        Logging.log(Log.getStackTraceString(s));
        return;
    }

    public static void setListener(String s, AdMarvelWebViewListener admarvelwebviewlistener)
    {
        listeners.put(s, admarvelwebviewlistener);
    }

    private static void updateCloseButtonPosition(LinearLayout linearlayout, android.widget.RelativeLayout.LayoutParams layoutparams, String s, int i, int j, int k, int l, int i1, 
            int j1, int k1)
    {
        int l1;
        layoutparams.rightMargin = 0;
        layoutparams.leftMargin = 0;
        layoutparams.topMargin = 0;
        layoutparams.bottomMargin = 0;
        l1 = k;
        if (k == -1)
        {
            l1 = i1;
        }
        k = l;
        if (l == -1)
        {
            k = j1;
        }
        if (s == null || s.length() <= 0) goto _L2; else goto _L1
_L1:
        if (!"top-right".equals(s)) goto _L4; else goto _L3
_L3:
        layoutparams.addRule(10);
        layoutparams.addRule(11);
        k = (i + l1) - i1;
        if (i == 0 && k > 0)
        {
            layoutparams.rightMargin = k / 2;
        } else
        if (k > 0)
        {
            layoutparams.rightMargin = k;
        } else
        {
            layoutparams.rightMargin = 0;
        }
        if (j < 0)
        {
            layoutparams.topMargin = Math.abs(j);
        } else
        {
            layoutparams.topMargin = 0;
        }
_L6:
        linearlayout.setLayoutParams(layoutparams);
        return;
_L4:
        if ("top-left".equals(s))
        {
            layoutparams.addRule(9);
            layoutparams.addRule(10);
            if (i < 0)
            {
                layoutparams.leftMargin = Math.abs(i);
            } else
            if (i == 0)
            {
                i = (l1 - i1) / 2;
                if (i > 0)
                {
                    layoutparams.leftMargin = i;
                }
            } else
            {
                layoutparams.leftMargin = 0;
            }
            if (j < 0)
            {
                layoutparams.topMargin = Math.abs(j);
            } else
            {
                layoutparams.topMargin = 0;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("bottom-right".equals(s))
        {
            layoutparams.addRule(11);
            layoutparams.addRule(12);
            l = (i + l1) - i1;
            if (i == 0 && l > 0)
            {
                layoutparams.rightMargin = l / 2;
            } else
            if (l > 0)
            {
                layoutparams.rightMargin = l;
            } else
            {
                layoutparams.rightMargin = 0;
            }
            i = j1 - (j + k);
            if (i < 0)
            {
                layoutparams.bottomMargin = Math.abs(i);
            } else
            {
                layoutparams.bottomMargin = 0;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("bottom-left".equals(s))
        {
            layoutparams.addRule(9);
            layoutparams.addRule(12);
            if (i < 0)
            {
                layoutparams.leftMargin = Math.abs(i);
            } else
            if (i == 0)
            {
                i = (l1 - i1) / 2;
                if (i > 0)
                {
                    layoutparams.leftMargin = i;
                }
            } else
            {
                layoutparams.leftMargin = 0;
            }
            i = j1 - (j + k);
            if (i < 0)
            {
                layoutparams.bottomMargin = Math.abs(i);
            } else
            {
                layoutparams.bottomMargin = 0;
            }
            continue; /* Loop/switch isn't completed */
        } else
        {
            if ("center".equals(s))
            {
                if (i + l1 <= i1)
                {
                    if (i <= 0)
                    {
                        layoutparams.leftMargin = ((i + l1) / 2 + Math.abs(i)) - k1 / 2;
                    } else
                    {
                        layoutparams.leftMargin = l1 / 2 - k1 / 2;
                    }
                } else
                if (i <= 0)
                {
                    layoutparams.leftMargin = (i1 / 2 + Math.abs(i)) - k1 / 2;
                } else
                {
                    layoutparams.leftMargin = (i1 - i) / 2 - k1 / 2;
                }
                layoutparams.addRule(15);
                if (j < 0)
                {
                    i = k / 2 + j;
                    if (i < 0)
                    {
                        layoutparams.topMargin = Math.abs(i) + k / 2;
                        layoutparams.addRule(10);
                    } else
                    {
                        layoutparams.topMargin = 0;
                        layoutparams.addRule(15);
                    }
                } else
                {
                    i = j1 - (k / 2 + j);
                    if (i < 0)
                    {
                        layoutparams.bottomMargin = Math.abs(i) + k / 2;
                        layoutparams.addRule(12);
                    } else
                    {
                        layoutparams.bottomMargin = 0;
                        layoutparams.addRule(15);
                    }
                }
            } else
            if ("bottom-center".equals(s))
            {
                j = j1 - (j + k);
                if (j < 0)
                {
                    layoutparams.bottomMargin = Math.abs(j);
                } else
                {
                    layoutparams.bottomMargin = 0;
                }
                layoutparams.addRule(9);
                layoutparams.addRule(12);
                if (i + l1 <= i1)
                {
                    if (i <= 0)
                    {
                        layoutparams.leftMargin = ((i + l1) / 2 + Math.abs(i)) - k1 / 2;
                    } else
                    {
                        layoutparams.leftMargin = l1 / 2 - k1 / 2;
                    }
                } else
                if (i <= 0)
                {
                    layoutparams.leftMargin = (i1 / 2 + Math.abs(i)) - k1 / 2;
                } else
                {
                    layoutparams.leftMargin = (i1 - i) / 2 - k1 / 2;
                }
            } else
            if ("top-center".equals(s))
            {
                layoutparams.addRule(14);
                if (j < 0)
                {
                    layoutparams.topMargin = Math.abs(j);
                } else
                {
                    layoutparams.topMargin = 0;
                }
                if (i + l1 <= i1)
                {
                    if (i <= 0)
                    {
                        layoutparams.leftMargin = ((i + l1) / 2 + Math.abs(i)) - k1 / 2;
                    } else
                    {
                        layoutparams.leftMargin = l1 / 2 - k1 / 2;
                    }
                } else
                if (i <= 0)
                {
                    layoutparams.leftMargin = (i1 / 2 + Math.abs(i)) - k1 / 2;
                } else
                {
                    layoutparams.leftMargin = (i1 - i) / 2 - k1 / 2;
                }
            } else
            {
                layoutparams.addRule(11);
                layoutparams.addRule(10);
                i = (i + l1) - i1;
                if (i > 0)
                {
                    layoutparams.rightMargin = i;
                } else
                {
                    layoutparams.rightMargin = 0;
                }
                if (j < 0)
                {
                    layoutparams.topMargin = Math.abs(j);
                } else
                {
                    layoutparams.topMargin = 0;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        layoutparams.addRule(11);
        layoutparams.addRule(10);
        i = (i + l1) - i1;
        if (i > 0)
        {
            layoutparams.rightMargin = i;
        } else
        {
            layoutparams.rightMargin = 0;
        }
        if (j < 0)
        {
            layoutparams.topMargin = Math.abs(j);
        } else
        {
            layoutparams.topMargin = 0;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void close()
    {
        int i = 0;
        Object obj;
        if (orientationListener != null)
        {
            orientationListener.disable();
        }
        obj = getContext();
        if (!(obj instanceof Activity)) goto _L2; else goto _L1
_L1:
        obj = (Activity)obj;
_L12:
        if (!isRotationDisabledForExpand || !isFullScreenExpansionIntended || isTwoPartExpandable || obj == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        ((Activity) (obj)).setRequestedOrientation(activityLastOrientation);
        isRotationDisabledForExpand = false;
        if (!fullScreenMode.compareAndSet(true, false) || obj == null) goto _L4; else goto _L3
_L3:
        AdMarvelInternalWebView admarvelinternalwebview;
        obj = (ViewGroup)((Activity) (obj)).getWindow().findViewById(0x1020002);
        admarvelinternalwebview = (AdMarvelInternalWebView)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        if (admarvelinternalwebview == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        admarvelinternalwebview.isAdClosing = true;
        FrameLayout framelayout;
        RelativeLayout relativelayout;
        Object obj1;
        framelayout = (FrameLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("EXPAND_BG").toString());
        relativelayout = (RelativeLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("EXPAND_LAYOUT").toString());
        if (!isCloseButtonEnable)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj1 = (LinearLayout)((ViewGroup) (obj)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BTN_CLOSE").toString());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        relativelayout.removeView(((View) (obj1)));
        isCloseButtonEnable = false;
        if (framelayout == null || admarvelinternalwebview == null) goto _L6; else goto _L5
_L5:
        admarvelinternalwebview.stopSpeechAndAudio();
_L8:
        int j;
        obj1 = (FrameLayout)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("EXPAND_PLACE_HOLDER").toString());
        j = getChildCount();
          goto _L7
_L9:
        relativelayout.removeView(admarvelinternalwebview);
        framelayout.removeView(relativelayout);
        ((ViewGroup) (obj)).removeView(framelayout);
        ((ViewGroup) (obj)).invalidate();
        ((ViewGroup) (obj)).requestLayout();
        removeAllViews();
        addView(admarvelinternalwebview, i);
        removeView(((View) (obj1)));
        admarvelinternalwebview.resetLayout();
        isExpandedState = false;
        isMultiLayerExpandedState = false;
_L6:
        invalidate();
        requestLayout();
        if (getListener(GUID) != null)
        {
            getListener(GUID).onClose();
        }
        if (admarvelinternalwebview != null)
        {
            try
            {
                if (mCloseCallback != null)
                {
                    admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCloseCallback).append("()").toString());
                }
                admarvelinternalwebview.isAdClosing = false;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            }
        }
        break MISSING_BLOCK_LABEL_484;
        obj1;
        Logging.log((new StringBuilder("Exception in stop Speech and Audio")).append(((Exception) (obj1)).getMessage()).toString());
          goto _L8
        return;
_L10:
        View view = getChildAt(i);
        if (view == obj1)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L7:
        if (i < j) goto _L10; else goto _L9
_L4:
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    void destroyWebView()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        if (admarvelinternalwebview != null)
        {
            AdMarvelInternalWebView.setListener(GUID, null);
            admarvelinternalwebview.setWebChromeClient(null);
            admarvelinternalwebview.setWebViewClient(null);
            admarvelinternalwebview.clearUnUsedObjects();
            internalListenerReference.clear();
            if (adMarvelInternalWebViewReference != null)
            {
                adMarvelInternalWebViewReference.clear();
            }
            adMarvelAd = null;
        }
    }

    void focus()
    {
        View view = findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        if (view != null && (view instanceof AdMarvelInternalWebView) && !view.hasFocus())
        {
            view.requestFocus();
        }
    }

    public AdMarvelAd getAdMarvelAd()
    {
        return adMarvelAd;
    }

    void loadAd(int i, int j, int k, int l, AdMarvelView admarvelview)
    {
        if (adMarvelAd != null) goto _L2; else goto _L1
_L1:
        if (getListener(GUID) != null)
        {
            getListener(GUID).onFailedToReceiveAd(this, adMarvelAd, 305, Utils.getErrorReason(305));
        }
_L21:
        return;
_L2:
        if (adMarvelAd != null && adMarvelAd.getSource() != null)
        {
            source = adMarvelAd.getSource();
        }
        if (!adMarvelAd.getAdType().equals(AdMarvelAd.AdType.IMAGE) || !adMarvelAd.hasImage()) goto _L4; else goto _L3
_L3:
        if (adMarvelAd.getImageWidth() <= 0 || adMarvelAd.getImageHeight() <= 0) goto _L6; else goto _L5
_L5:
        if (Version.getAndroidSDKVersion() < 7) goto _L8; else goto _L7
_L7:
        if (!enableAutoScaling) goto _L10; else goto _L9
_L9:
        if (Utils.getScreenOrientation(getContext()) != 2) goto _L12; else goto _L11
_L11:
        float f = 320F / (float)adMarvelAd.getImageWidth();
        float f1 = adMarvelAd.getImageHeight();
        String s = (new StringBuilder("<a href=\"")).append(adMarvelAd.getClickURL()).append("\"><img src=\"").append(adMarvelAd.getImageURL()).append("\" width=\"320\" height=\"").append(f * f1).append("\" /></a>").toString();
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_LANDSCAPE).toString(), s
        });
_L22:
        internalWebView = new AdMarvelInternalWebView(getContext(), false, xml, GUID, handler, admarvelview, null, adMarvelAd);
        internalWebView.setTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        internalWebView.setFocusable(true);
        internalWebView.setClickable(true);
        internalWebView.setBackgroundColor(l);
        internalWebView.setScrollContainer(false);
        internalWebView.setVerticalScrollBarEnabled(false);
        internalWebView.setHorizontalScrollBarEnabled(false);
        AdMarvelInternalWebView.setListener(GUID, (AdMarvelInternalWebViewPrivateListener)internalListenerReference.get());
        if (Version.getAndroidSDKVersion() < 11) goto _L14; else goto _L13
_L13:
        WebViewResumePause.onResume(internalWebView);
_L30:
        if (Version.getAndroidSDKVersion() >= 11) goto _L16; else goto _L15
_L15:
        admarvelview = new WeakReference(new AdMarvelWebViewClientPreApi11());
        internalWebView.setWebViewClient((WebViewClient)admarvelview.get());
_L31:
        adMarvelInternalWebViewReference = new WeakReference(internalWebView);
        addView((View)adMarvelInternalWebViewReference.get());
        admarvelview = new WeakReference(new InnerJS((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get(), adMarvelAd, handler, this, getContext()));
        internalWebView.addJavascriptInterface(admarvelview.get(), "ADMARVEL");
        if (!Utils.isPermissionGranted(getContext(), "android.permission.RECORD_AUDIO")) goto _L18; else goto _L17
_L17:
        Object obj;
        AdMarvelView admarvelview1;
        AdMarvelView admarvelview2;
        AdMarvelView admarvelview3;
        AdMarvelView admarvelview4;
        AdMarvelView admarvelview5;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        admarvelview = null;
        obj = admarvelview;
        admarvelview1 = obj1;
        admarvelview2 = obj2;
        admarvelview3 = obj3;
        admarvelview4 = obj4;
        admarvelview5 = obj5;
        Class class1 = Class.forName("com.admarvel.android.admarvelspeechkitadapter.Speech");
        obj = admarvelview;
        admarvelview1 = obj1;
        admarvelview2 = obj2;
        admarvelview3 = obj3;
        admarvelview4 = obj4;
        admarvelview5 = obj5;
        admarvelview = ((AdMarvelView) (class1.newInstance()));
        obj = admarvelview;
        admarvelview1 = admarvelview;
        admarvelview2 = admarvelview;
        admarvelview3 = admarvelview;
        admarvelview4 = admarvelview;
        admarvelview5 = admarvelview;
        class1.getDeclaredMethod("initSpeechMembers", new Class[] {
            com/admarvel/android/ads/AdMarvelInternalWebView, java/lang/String, java/lang/String
        }).invoke(admarvelview, new Object[] {
            internalWebView, adMarvelAd.getBannerid(), adMarvelAd.getSiteId()
        });
_L32:
        admarvelview = new WeakReference(admarvelview);
        internalWebView.addJavascriptInterface(admarvelview.get(), "ADMARVEL_SPEECH");
_L18:
        pendingLoad.set(true);
        admarvelview = (new StringBuilder("content://")).append(getContext().getPackageName()).append(".AdMarvelLocalFileContentProvider").toString();
        if (AdMarvelView.enableOfflineSDK)
        {
            internalWebView.loadDataWithBaseURL((new StringBuilder(String.valueOf(adMarvelAd.getOfflineBaseUrl()))).append("/").toString(), html, "text/html", "utf-8", null);
            return;
        }
          goto _L19
        admarvelview;
        Logging.log(Log.getStackTraceString(admarvelview));
        if (getListener(GUID) == null) goto _L21; else goto _L20
_L20:
        getListener(GUID).onFailedToReceiveAd(this, adMarvelAd, 305, Utils.getErrorReason(305));
        return;
_L12:
        obj = (new StringBuilder("<a href=\"")).append(adMarvelAd.getClickURL()).append("\"><img src=\"").append(adMarvelAd.getImageURL()).append("\" width=\"100%\" /></a>").toString();
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(IMAGE_AD_AUTOSCALED_WEB_VIEW_VIEWPORT_PORTRAIT).toString(), obj
        });
          goto _L22
_L10:
        obj = (new StringBuilder("<a href=\"")).append(adMarvelAd.getClickURL()).append("\"><img src=\"").append(adMarvelAd.getImageURL()).append("\" width=\"").append(adMarvelAd.getWidth()).append("\" height=\"").append(adMarvelAd.getHeight()).append("\" /></a>").toString();
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), obj
        });
          goto _L22
_L8:
        if (Utils.getScreenOrientation(getContext()) != 2) goto _L24; else goto _L23
_L23:
        j = Utils.getDeviceHeight(getContext());
_L27:
        if (Utils.getScreenOrientation(getContext()) != 1) goto _L26; else goto _L25
_L25:
        i = Utils.getDeviceHeight(getContext());
_L28:
        int i1;
        if (!enableAutoScaling)
        {
            break MISSING_BLOCK_LABEL_1355;
        }
        k = (int)((float)adMarvelAd.getImageWidth() * Utils.getScalingFactor(getContext(), j, adMarvelAd.getImageWidth()));
        i1 = (int)((float)adMarvelAd.getImageHeight() * Utils.getScalingFactor(getContext(), j, adMarvelAd.getImageWidth()));
        j = k;
        k = i1;
_L29:
        i = Math.min(k, i);
        obj = (new StringBuilder("<a href=\"")).append(adMarvelAd.getClickURL()).append("\"><img src=\"").append(adMarvelAd.getImageURL()).append("\" width=\"").append(j).append("\" height=\"").append(i).append("\" /></a>").toString();
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), obj
        });
          goto _L22
_L24:
        j = Utils.getDeviceWidth(getContext());
          goto _L27
_L26:
        i = Utils.getDeviceWidth(getContext());
          goto _L28
        j = adMarvelAd.getImageWidth();
        k = adMarvelAd.getImageHeight();
          goto _L29
_L6:
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            (new StringBuilder(String.valueOf(DEFAULT_WEB_VIEW_CSS))).append(DEFAULT_WEB_VIEW_VIEWPORT).toString(), adMarvelAd.getXhtml()
        });
          goto _L22
_L4:
label0:
        {
            if (!adMarvelAd.getAdType().equals(AdMarvelAd.AdType.TEXT) || adMarvelAd.getText() == null || adMarvelAd.getText().length() <= 0)
            {
                break label0;
            }
            obj = String.format(TEXT_AD_MINIMIZED_WEB_VIEW_CSS_FORMAT, new Object[] {
                Integer.valueOf(i >> 16 & 0xff), Integer.valueOf(i >> 8 & 0xff), Integer.valueOf(i & 0xff), Integer.valueOf(k >> 16 & 0xff), Integer.valueOf(k >> 8 & 0xff), Integer.valueOf(k & 0xff), Integer.valueOf(j >> 16 & 0xff), Integer.valueOf(j >> 8 & 0xff), Integer.valueOf(j & 0xff)
            });
            html = String.format(TEXT_AD_MINIMIZED_WEB_VIEW_HTML_FORMAT, new Object[] {
                obj, adMarvelAd.getClickURL(), adMarvelAd.getText()
            });
        }
          goto _L22
label1:
        {
            if (!adMarvelAd.getXhtml().contains("ORMMA_API"))
            {
                break label1;
            }
            html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
                ORMMA_WEB_VIEW_CSS, adMarvelAd.getXHTML()
            });
        }
          goto _L22
        html = String.format(DEFAULT_WEB_VIEW_HTML_FORMAT, new Object[] {
            DEFAULT_WEB_VIEW_CSS, adMarvelAd.getXHTML()
        });
          goto _L22
_L14:
        WebViewResumePausePreAPI11.onResume(internalWebView);
          goto _L30
_L16:
        admarvelview = new WeakReference(new AdMarvelWebViewClient());
        internalWebView.setWebViewClient((WebViewClient)admarvelview.get());
          goto _L31
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = ((AdMarvelView) (obj));
          goto _L32
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = admarvelview1;
          goto _L32
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = admarvelview2;
          goto _L32
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = admarvelview3;
          goto _L32
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = admarvelview4;
          goto _L32
        admarvelview;
        Logging.log(admarvelview.getMessage());
        admarvelview = admarvelview5;
          goto _L32
_L19:
        if (Version.getAndroidSDKVersion() < 11)
        {
            internalWebView.loadDataWithBaseURL(admarvelview, html, "text/html", "utf-8", null);
            return;
        }
        internalWebView.loadDataWithBaseURL("http://baseurl.admarvel.com", html, "text/html", "utf-8", null);
        return;
          goto _L22
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

    void pauseTimers()
    {
        AdMarvelInternalWebView admarvelinternalwebview1 = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        AdMarvelInternalWebView admarvelinternalwebview = admarvelinternalwebview1;
        if (admarvelinternalwebview1 == null)
        {
            admarvelinternalwebview = admarvelinternalwebview1;
            if (isExpandedState)
            {
                Context context = getContext();
                admarvelinternalwebview = admarvelinternalwebview1;
                if (context != null)
                {
                    admarvelinternalwebview = admarvelinternalwebview1;
                    if (context instanceof Activity)
                    {
                        admarvelinternalwebview = (AdMarvelInternalWebView)((ViewGroup)((Activity)context).getWindow().findViewById(0x1020002)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
                    }
                }
            }
        }
        if (admarvelinternalwebview == null)
        {
            return;
        }
        if (admarvelinternalwebview instanceof AdMarvelInternalWebView)
        {
            admarvelinternalwebview.unregisterForViewChange();
        }
        if (Version.getAndroidSDKVersion() >= 11)
        {
            WebViewResumePause.onPause(admarvelinternalwebview);
            return;
        } else
        {
            WebViewResumePausePreAPI11.onPause(admarvelinternalwebview);
            return;
        }
    }

    void resetLayout(int i, int j)
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        layoutparams.width = i;
        layoutparams.height = j;
        requestLayout();
    }

    void resumeTimers()
    {
        AdMarvelInternalWebView admarvelinternalwebview1 = (AdMarvelInternalWebView)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
        AdMarvelInternalWebView admarvelinternalwebview = admarvelinternalwebview1;
        if (admarvelinternalwebview1 == null)
        {
            admarvelinternalwebview = admarvelinternalwebview1;
            if (isExpandedState)
            {
                Context context = getContext();
                admarvelinternalwebview = admarvelinternalwebview1;
                if (context != null)
                {
                    admarvelinternalwebview = admarvelinternalwebview1;
                    if (context instanceof Activity)
                    {
                        admarvelinternalwebview = (AdMarvelInternalWebView)((ViewGroup)((Activity)context).getWindow().findViewById(0x1020002)).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("INTERNAL").toString());
                    }
                }
            }
        }
        if (admarvelinternalwebview == null)
        {
            return;
        }
        if (admarvelinternalwebview instanceof AdMarvelInternalWebView)
        {
            admarvelinternalwebview.registerForViewChange(this);
        }
        if (Version.getAndroidSDKVersion() >= 11)
        {
            WebViewResumePause.onResume(admarvelinternalwebview);
            return;
        } else
        {
            WebViewResumePausePreAPI11.onResume(admarvelinternalwebview);
            return;
        }
    }

    public void setEnableClickRedirect(boolean flag)
    {
        enableClickRedirect = flag;
    }










































}
