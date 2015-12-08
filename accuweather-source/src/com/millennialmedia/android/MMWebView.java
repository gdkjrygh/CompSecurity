// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.millennialmedia.android:
//            MMLog, HandShake, MMSDK, MMAdView, 
//            MMActivity, HttpMMHeaders, AdViewOverlayView, MMLayout, 
//            MMAdImpl, MMAdImplController, BridgeMMSpeechkit, AdProperties, 
//            Utils, MRaid, DTOResizeParameters

class MMWebView extends WebView
{
    private static class BannerGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        WeakReference webRef;

        public boolean onSingleTapConfirmed(MotionEvent motionevent)
        {
            motionevent = (MMWebView)webRef.get();
            if (motionevent != null)
            {
                motionevent = motionevent.getMMAdView();
                if (motionevent != null)
                {
                    MMSDK.Event.adSingleTap(((MMAdView) (motionevent)).adImpl);
                }
            }
            return false;
        }

        public BannerGestureListener(MMWebView mmwebview)
        {
            webRef = new WeakReference(mmwebview);
        }
    }

    private static class MyWebChromeClient extends WebChromeClient
    {

        private static final String KEY_USE_GEO = "mm_use_geo_location";
        WeakReference webRef;

        private String getApplicationName(Context context)
        {
            PackageManager packagemanager = context.getApplicationContext().getPackageManager();
            try
            {
                context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                context = packagemanager.getApplicationLabel(context);
            } else
            {
                context = "This app";
            }
            return (String)(String)context;
        }

        private boolean isFirstGeoRequest()
        {
            boolean flag1 = false;
            MMWebView mmwebview = (MMWebView)webRef.get();
            boolean flag = flag1;
            if (mmwebview != null)
            {
                flag = flag1;
                if (!mmwebview.getContext().getSharedPreferences("MillennialMediaSettings", 0).contains("mm_use_geo_location"))
                {
                    flag = true;
                }
            }
            return flag;
        }

        private boolean retrieveUseGeo()
        {
            boolean flag = false;
            MMWebView mmwebview = (MMWebView)webRef.get();
            if (mmwebview != null)
            {
                flag = mmwebview.getContext().getSharedPreferences("MillennialMediaSettings", 0).getBoolean("mm_use_geo_location", false);
            }
            return flag;
        }

        private void saveUseGeo(boolean flag)
        {
            Object obj = (MMWebView)webRef.get();
            if (obj != null)
            {
                obj = ((MMWebView) (obj)).getContext().getSharedPreferences("MillennialMediaSettings", 0).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("mm_use_geo_location", flag);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
            }
        }

        public void onConsoleMessage(String s, int i, String s1)
        {
            super.onConsoleMessage(s, i, s1);
        }

        public void onGeolocationPermissionsShowPrompt(String s, final android.webkit.GeolocationPermissions.Callback callback)
        {
            if (!isFirstGeoRequest())
            {
                break MISSING_BLOCK_LABEL_116;
            }
            if (!retrieveUseGeo()) goto _L2; else goto _L1
_L1:
            callback.invoke(s, true, true);
_L4:
            return;
_L2:
            Object obj = (MMWebView)webRef.get();
            if (obj == null) goto _L4; else goto _L3
_L3:
            obj = ((MMWebView) (obj)).getActivity();
            if (obj == null) goto _L4; else goto _L5
_L5:
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (obj)));
            builder.setTitle(getApplicationName(((Context) (obj))));
            builder.setMessage("Would like to use your Current Location.").setPositiveButton("Allow", s. new android.content.DialogInterface.OnClickListener() {

                final MyWebChromeClient this$0;
                final android.webkit.GeolocationPermissions.Callback val$callback;
                final String val$origin;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    saveUseGeo(true);
                    callback.invoke(origin, true, true);
                }

            
            {
                this$0 = final_mywebchromeclient;
                callback = callback1;
                origin = String.this;
                super();
            }
            }).setNegativeButton("Don't Allow", s. new android.content.DialogInterface.OnClickListener() {

                final MyWebChromeClient this$0;
                final android.webkit.GeolocationPermissions.Callback val$callback;
                final String val$origin;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    saveUseGeo(false);
                    callback.invoke(origin, false, false);
                }

            
            {
                this$0 = final_mywebchromeclient;
                callback = callback1;
                origin = String.this;
                super();
            }
            });
            builder.create().show();
            return;
            callback.invoke(s, false, false);
            return;
        }

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
            MMWebView mmwebview = (MMWebView)webRef.get();
            if (mmwebview != null)
            {
                if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
                {
                    return super.onJsAlert(webview, s, s1, jsresult);
                }
                Toast.makeText(mmwebview.getContext(), s1, 0).show();
            }
            return true;
        }

        public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
        {
            MMWebView mmwebview = (MMWebView)webRef.get();
            if (mmwebview != null)
            {
                if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
                {
                    return super.onJsBeforeUnload(webview, s, s1, jsresult);
                }
                Toast.makeText(mmwebview.getContext(), s1, 0).show();
            }
            return true;
        }

        public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
        {
            MMWebView mmwebview = (MMWebView)webRef.get();
            if (mmwebview != null)
            {
                if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
                {
                    return super.onJsConfirm(webview, s, s1, jsresult);
                }
                Toast.makeText(mmwebview.getContext(), s1, 0).show();
            }
            return true;
        }

        public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
        {
            MMWebView mmwebview = (MMWebView)webRef.get();
            if (mmwebview != null)
            {
                if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
                {
                    return super.onJsPrompt(webview, s, s1, s2, jspromptresult);
                }
                Toast.makeText(mmwebview.getContext(), s1, 0).show();
            }
            return true;
        }


        MyWebChromeClient(MMWebView mmwebview)
        {
            webRef = new WeakReference(mmwebview);
        }
    }

    private static class WebTouchListener
        implements android.view.View.OnTouchListener
    {

        WeakReference webRef;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
label0:
            {
                view = (MMWebView)webRef.get();
                boolean flag;
                boolean flag1;
                if (motionevent.getAction() == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
                if (view != null)
                {
                    if (!flag || !view.canScroll())
                    {
                        break label0;
                    }
                    flag1 = true;
                }
                return flag1;
            }
            return false;
        }

        WebTouchListener(MMWebView mmwebview)
        {
            webRef = new WeakReference(mmwebview);
        }
    }


    static final String JS_INTERFACE_NAME = "interface";
    static final String PROPERTY_BANNER_TYPE = "PROPERTY_BANNER_TYPE";
    static final String PROPERTY_EXPANDING = "PROPERTY_EXPANDING";
    static final String PROPERTY_STATE = "PROPERTY_STATE";
    private static final String TAG = "MMWebView";
    private HttpMMHeaders _lastHeaders;
    long creatorAdImplId;
    int currentColor;
    String currentUrl;
    boolean hadFirstRecordingCreation;
    boolean hadFirstSpeechKitCreation;
    volatile boolean isExpanding;
    boolean isSendingSize;
    volatile boolean isUserClosedResize;
    volatile boolean isVisible;
    volatile String mraidState;
    int oldHeight;
    int oldWidth;
    volatile boolean requiresPreAdSizeFix;
    final GestureDetector tapDetector;
    final String userAgent;

    public MMWebView(Context context, long l)
    {
        super(context);
        isSendingSize = true;
        oldHeight = -50;
        oldWidth = -50;
        isVisible = false;
        hadFirstSpeechKitCreation = false;
        hadFirstRecordingCreation = false;
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnTouchListener(new WebTouchListener(this));
        mraidState = "loading";
        creatorAdImplId = l;
        MMLog.v("MMWebView", String.format("Assigning WebView internal id: %d", new Object[] {
            Long.valueOf(creatorAdImplId)
        }));
        setId((int)(15063L + creatorAdImplId));
        WebSettings websettings;
        if (HandShake.sharedHandShake(context).hardwareAccelerationEnabled)
        {
            enableHardwareAcceleration();
        } else
        {
            disableAllAcceleration();
        }
        setWebChromeClient(new MyWebChromeClient(this));
        websettings = getSettings();
        userAgent = websettings.getUserAgentString();
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(-1);
        websettings.setDefaultTextEncodingName("UTF-8");
        websettings.setLoadWithOverviewMode(true);
        websettings.setGeolocationEnabled(true);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            MMLog.i("MMWebView", "Disabling user gesture requirement for media playback");
            websettings.setMediaPlaybackRequiresUserGesture(false);
        }
        websettings.setJavaScriptCanOpenWindowsAutomatically(true);
        tapDetector = new GestureDetector(context.getApplicationContext(), new BannerGestureListener(this));
    }

    private boolean hasDefaultResizeParams()
    {
        return oldWidth == -50 && oldHeight == -50;
    }

    private boolean isInterstitial()
    {
        return getBanner() == null;
    }

    private boolean needsSamsungJBOpenGlFixNoAcceleration()
    {
        int i = Integer.parseInt(android.os.Build.VERSION.SDK);
        return "Nexus S".equals(Build.MODEL) && "samsung".equals(Build.MANUFACTURER) && (i == 16 || i == 17);
    }

    static void setDebugMode(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            MMLog.i("MMWebView", "Enabling webview content debugging");
            WebView.setWebContentsDebuggingEnabled(flag);
        }
    }

    boolean allowMicrophoneCreationCommands()
    {
        boolean flag = true;
        if (hadFirstRecordingCreation)
        {
            flag = allowRecordingCommands();
        } else
        {
            hadFirstRecordingCreation = true;
            if (!isInterstitial() || !isVisible)
            {
                return false;
            }
        }
        return flag;
    }

    boolean allowRecordingCommands()
    {
        return hasWindowFocus() && isInterstitial();
    }

    boolean allowSpeechCreationCommands()
    {
        boolean flag = true;
        if (hadFirstSpeechKitCreation)
        {
            flag = allowRecordingCommands();
        } else
        {
            hadFirstSpeechKitCreation = true;
            if (!isInterstitial() || !isVisible)
            {
                return false;
            }
        }
        return flag;
    }

    void animateTransition(final MMAdImpl adImpl)
    {
        adImpl = new FutureTask(new Callable() {

            final MMWebView this$0;
            final MMAdImpl val$adImpl;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
            {
                Bitmap bitmap;
                buildDrawingCache();
                bitmap = getDrawingCache();
                if (bitmap == null)
                {
                    break MISSING_BLOCK_LABEL_32;
                }
                bitmap = Bitmap.createBitmap(bitmap);
                adImpl.prepareTransition(bitmap);
                destroyDrawingCache();
_L2:
                return null;
                Exception exception;
                exception;
                MMLog.e("MMWebView", "Animation exception: ", exception);
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = MMWebView.this;
                adImpl = mmadimpl;
                super();
            }
        });
        MMSDK.runOnUiThread(adImpl);
        try
        {
            adImpl.get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final MMAdImpl adImpl)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final MMAdImpl adImpl)
        {
            return;
        }
    }

    boolean canScroll()
    {
        return getParent() instanceof MMAdView;
    }

    void disableAllAcceleration()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            MMLog.i("MMWebView", "Disabling acceleration");
            setLayerType(0, null);
        }
    }

    void enableHardwareAcceleration()
    {
        if (needsSamsungJBOpenGlFixNoAcceleration())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        android/webkit/WebView.getMethod("setLayerType", new Class[] {
            Integer.TYPE, android/graphics/Paint
        }).invoke(this, new Object[] {
            Integer.valueOf(2), null
        });
        MMLog.d("MMWebView", "Enabled hardwareAcceleration");
        return;
        Exception exception;
        exception;
    }

    void enableSendingSize()
    {
        isSendingSize = true;
    }

    void enableSoftwareAcceleration()
    {
        if (needsSamsungJBOpenGlFixNoAcceleration())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        android/webkit/WebView.getMethod("setLayerType", new Class[] {
            Integer.TYPE, android/graphics/Paint
        }).invoke(this, new Object[] {
            Integer.valueOf(1), null
        });
        MMLog.d("MMWebView", "Enable softwareAcceleration");
        return;
        Exception exception;
        exception;
    }

    Activity getActivity()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getParent();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        obj = ((ViewGroup)obj).getContext();
        if (obj == null) goto _L2; else goto _L4
_L4:
        if (!(obj instanceof MMActivity)) goto _L2; else goto _L5
_L5:
        obj = (MMActivity)obj;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((Activity) (obj));
_L2:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    String getAdId()
    {
        if (_lastHeaders != null && !TextUtils.isEmpty(_lastHeaders.acid))
        {
            return _lastHeaders.acid;
        } else
        {
            return "DEFAULT_AD_ID";
        }
    }

    AdViewOverlayView getAdViewOverlayView()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getParent();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof AdViewOverlayView)) goto _L2; else goto _L3
_L3:
        obj = (AdViewOverlayView)obj;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((AdViewOverlayView) (obj));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    MMAdView getBanner()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getParent();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof MMAdView)) goto _L2; else goto _L3
_L3:
        obj = (MMAdView)obj;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((MMAdView) (obj));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    HttpMMHeaders getLastHeaders()
    {
        return _lastHeaders;
    }

    MMAdView getMMAdView()
    {
        if (getParent() instanceof MMAdView)
        {
            return (MMAdView)getParent();
        } else
        {
            return null;
        }
    }

    MMLayout getMMLayout()
    {
        if (getParent() instanceof MMLayout)
        {
            return (MMLayout)getParent();
        } else
        {
            return null;
        }
    }

    String getUserAgent()
    {
        return userAgent;
    }

    boolean isCurrentParent(long l)
    {
        android.view.ViewParent viewparent = getParent();
        if (viewparent == null)
        {
            return false;
        }
        MMLog.w("MMWebView", (new StringBuilder()).append("Id check for parent: ").append(l).append(" versus ").append(((MMLayout)viewparent).adImpl.internalId).toString());
        boolean flag;
        if (l == ((MMLayout)viewparent).adImpl.internalId)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    boolean isMraidResized()
    {
        return "resized".equals(mraidState);
    }

    boolean isOriginalUrl(String s)
    {
        return !TextUtils.isEmpty(currentUrl) && s.equals((new StringBuilder()).append(currentUrl).append("?").toString()) || s.equals((new StringBuilder()).append(currentUrl).append("#").toString());
    }

    boolean isParentBannerAd()
    {
        if (getParent() != null)
        {
            return (ViewGroup)getParent() instanceof MMAdView;
        } else
        {
            return false;
        }
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        currentUrl = s;
        try
        {
            super.loadDataWithBaseURL(s, s1, s2, s3, s4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MMLog.e("MMWebView", "Error hit when calling through to loadDataWithBaseUrl", s);
        }
    }

    public void loadUrl(final String url)
    {
        if (TextUtils.isEmpty(url))
        {
            return;
        }
        if (url.startsWith("http"))
        {
            currentUrl = url;
        }
        MMLog.v("MMWebView", (new StringBuilder()).append("loadUrl @@").append(url).toString());
        if (MMSDK.isUiThread())
        {
            try
            {
                super.loadUrl(url);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (final String url)
            {
                return;
            }
        } else
        {
            MMSDK.runOnUiThread(new Runnable() {

                final MMWebView this$0;
                final String val$url;

                public void run()
                {
                    loadUrl(url);
                }

            
            {
                this$0 = MMWebView.this;
                url = s;
                super();
            }
            });
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        j = android.view.View.MeasureSpec.getSize(j);
        int l = android.view.View.MeasureSpec.getSize(i);
        int k = getMeasuredHeight();
        i = k;
        if (k == 0)
        {
            i = j;
        }
        if (requiresPreAdSizeFix)
        {
            setMeasuredDimension(1, 1);
            return;
        } else
        {
            setMeasuredDimension(l, i);
            return;
        }
    }

    public void onPauseWebView()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        android/webkit/WebView.getMethod("onPause", new Class[0]).invoke(this, new Object[0]);
        return;
        Exception exception;
        exception;
        MMLog.w("MMWebView", "No onPause()");
        return;
    }

    public void onResumeWebView()
    {
        MMAdImpl mmadimpl = MMAdImplController.getAdImplWithId(creatorAdImplId);
        if (mmadimpl != null && mmadimpl.isOverlayLaunched && !mraidState.equals("expanded"))
        {
            MMSDK.Event.overlayClosed(MMAdImplController.getAdImplWithId(creatorAdImplId));
        }
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        android/webkit/WebView.getMethod("onResume", new Class[0]).invoke(this, new Object[0]);
        return;
        Exception exception;
        exception;
        MMLog.w("MMWebView", "No onResume()");
        return;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (getContext().getResources().getDisplayMetrics() != null && isSendingSize)
        {
            setAdSize();
            if (getHeight() != 1 || getWidth() != 1)
            {
                MMSDK.runOnUiThreadDelayed(new Runnable() {

                    final MMWebView this$0;

                    public void run()
                    {
                        isSendingSize = false;
                    }

            
            {
                this$0 = MMWebView.this;
                super();
            }
                }, 800L);
            }
        }
        super.onSizeChanged(i, j, k, l);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            requestFocus();
        }
        if (tapDetector != null)
        {
            tapDetector.onTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 1)
        {
            MMLog.v("MMWebView", String.format("Ad clicked: action=%d x=%f y=%f", new Object[] {
                Integer.valueOf(motionevent.getAction()), Float.valueOf(motionevent.getX()), Float.valueOf(motionevent.getY())
            }));
        }
        return super.onTouchEvent(motionevent);
    }

    void removeFromParent()
    {
        android.view.ViewParent viewparent = getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(this);
        }
    }

    void resetSpeechKit()
    {
        BridgeMMSpeechkit.releaseSpeechKit();
        hadFirstSpeechKitCreation = false;
        hadFirstRecordingCreation = false;
    }

    void setAdProperties()
    {
        org.json.JSONObject jsonobject = (new AdProperties(getContext())).getAdProperties(this);
        loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.setAdProperties(").append(jsonobject).append(");").toString());
    }

    void setAdSize()
    {
        org.json.JSONObject jsonobject = Utils.getViewDimensions(this);
        loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.setAdSize(").append(jsonobject).append(");").toString());
    }

    public void setBackgroundColor(int i)
    {
        currentColor = i;
        if (i == 0)
        {
            enableSoftwareAcceleration();
        }
        super.setBackgroundColor(i);
    }

    void setLastHeaders(HttpMMHeaders httpmmheaders)
    {
        _lastHeaders = httpmmheaders;
    }

    void setMraidDefault()
    {
        loadUrl("javascript:MMJS.sdk.setState('default')");
        mraidState = "default";
        isSendingSize = true;
    }

    void setMraidExpanded()
    {
        loadUrl("javascript:MMJS.sdk.setState('expanded');");
        mraidState = "expanded";
        hadFirstSpeechKitCreation = false;
        hadFirstRecordingCreation = false;
        isSendingSize = true;
    }

    void setMraidHidden()
    {
        loadUrl("javascript:MMJS.sdk.setState('hidden')");
        mraidState = "hidden";
    }

    void setMraidPlacementTypeInline()
    {
        loadUrl("javascript:MMJS.sdk.setPlacementType('inline');");
    }

    void setMraidPlacementTypeInterstitial()
    {
        loadUrl("javascript:MMJS.sdk.setPlacementType('interstitial');");
    }

    void setMraidReady()
    {
        loadUrl("javascript:MMJS.sdk.ready();");
    }

    void setMraidResize(final DTOResizeParameters resizeParams)
    {
        this;
        JVM INSTR monitorenter ;
        final MMAdView adView;
        if (!MMSDK.hasSetTranslationMethod())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        adView = getMMAdView();
        isUserClosedResize = false;
        MMLog.d("MMWebView", (new StringBuilder()).append("New DTOResizeParameters = ").append(resizeParams).toString());
        if (adView == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        MMSDK.runOnUiThread(new Runnable() {

            final MMWebView this$0;
            final MMAdView val$adView;
            final DTOResizeParameters val$resizeParams;

            private void handleMraidResize(DTOResizeParameters dtoresizeparameters)
            {
                MMAdView mmadview = adView;
                mmadview.getClass();
                dtoresizeparameters = new MMAdView.BannerBounds(mmadview, dtoresizeparameters);
                setUnresizeParameters();
                dtoresizeparameters.modifyLayoutParams(getLayoutParams());
            }

            private void setUnresizeParameters()
            {
                if (hasDefaultResizeParams())
                {
                    android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
                    oldWidth = layoutparams.width;
                    oldHeight = layoutparams.height;
                    if (oldWidth <= 0)
                    {
                        oldWidth = getWidth();
                    }
                    if (oldHeight <= 0)
                    {
                        oldHeight = getHeight();
                    }
                }
            }

            public void run()
            {
                synchronized (MMWebView.this)
                {
                    isSendingSize = true;
                    adView.handleMraidResize(resizeParams);
                    handleMraidResize(resizeParams);
                    loadUrl("javascript:MMJS.sdk.setState('resized');");
                    mraidState = "resized";
                }
                return;
                exception;
                mmwebview;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = MMWebView.this;
                adView = mmadview;
                resizeParams = dtoresizeparameters;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        resizeParams;
        throw resizeParams;
    }

    void setMraidViewableHidden()
    {
        loadUrl("javascript:MMJS.sdk.setViewable(false)");
        isVisible = false;
    }

    void setMraidViewableVisible()
    {
        loadUrl("javascript:MMJS.sdk.setViewable(true)");
        isVisible = true;
    }

    void setWebViewContent(String s, String s1, Context context)
    {
        if (s == null || s1 == null)
        {
            return;
        }
        final String finalBaseUrl = s1.substring(0, s1.lastIndexOf("/") + 1);
        resetSpeechKit();
        final String finalContent = s;
        if (MRaid.hasMraidLocally(context))
        {
            finalContent = MRaid.injectMraidJs(context, finalContent);
        } else
        {
            MMLog.e("MMWebView", "MMJS is not downloaded");
        }
        if (MMSDK.logLevel >= 5)
        {
            MMLog.v("MMWebView", String.format("Received ad with base url %s.", new Object[] {
                s1
            }));
            MMLog.v("MMWebView", s);
        }
        MMSDK.runOnUiThread(new Runnable() {

            final MMWebView this$0;
            final String val$finalBaseUrl;
            final String val$finalContent;

            public void run()
            {
                if (HandShake.sharedHandShake(getContext()).hardwareAccelerationEnabled)
                {
                    enableHardwareAcceleration();
                } else
                if (currentColor == 0)
                {
                    enableSoftwareAcceleration();
                } else
                {
                    disableAllAcceleration();
                }
                isSendingSize = true;
                loadDataWithBaseURL(finalBaseUrl, finalContent, "text/html", "UTF-8", null);
            }

            
            {
                this$0 = MMWebView.this;
                finalBaseUrl = s;
                finalContent = s1;
                super();
            }
        });
    }

    void setWebViewContent(final String finalContent, final String baseUrl, final MMAdImpl adImpl)
    {
        if (finalContent == null || baseUrl == null || adImpl == null)
        {
            return;
        }
        unresizeToDefault(adImpl);
        resetSpeechKit();
        baseUrl = baseUrl.substring(0, baseUrl.lastIndexOf("/") + 1);
        if (MMSDK.logLevel >= 5)
        {
            MMLog.v("MMWebView", String.format("Received ad with base url %s.", new Object[] {
                baseUrl
            }));
            MMLog.v("MMWebView", finalContent);
        }
        if (adImpl.isTransitionAnimated())
        {
            animateTransition(adImpl);
        }
        if (adImpl.ignoreDensityScaling)
        {
            finalContent = (new StringBuilder()).append("<head><meta name=\"viewport\" content=\"target-densitydpi=device-dpi\" /></head>").append(finalContent).toString();
        }
        if (MRaid.hasMraidLocally(adImpl.getContext()))
        {
            finalContent = MRaid.injectMraidJs(adImpl.getContext(), finalContent);
        } else
        {
            MMLog.e("MMWebView", "MMJS is not downloaded");
        }
        MMSDK.runOnUiThread(new Runnable() {

            final MMWebView this$0;
            final MMAdImpl val$adImpl;
            final String val$baseUrl;
            final String val$finalContent;

            public void run()
            {
                MMAd mmad;
                if (HandShake.sharedHandShake(getContext()).hardwareAccelerationEnabled)
                {
                    enableHardwareAcceleration();
                } else
                if (currentColor == 0)
                {
                    enableSoftwareAcceleration();
                } else
                {
                    disableAllAcceleration();
                }
                mmad = adImpl.getCallingAd();
                if (mmad != null && (mmad instanceof MMLayout))
                {
                    ((MMLayout)mmad).removeVideo();
                }
                isSendingSize = true;
                loadDataWithBaseURL(baseUrl, finalContent, "text/html", "UTF-8", null);
            }

            
            {
                this$0 = MMWebView.this;
                adImpl = mmadimpl;
                baseUrl = s;
                finalContent = s1;
                super();
            }
        });
    }

    void setmicrophoneAudioLevelChange(double d)
    {
        loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.microphoneAudioLevelChange(").append(d).append(")").toString());
    }

    void setmicrophoneStateChange(String s)
    {
        loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.microphoneStateChange('").append(s).append("')").toString());
    }

    public String toString()
    {
        return (new StringBuilder()).append("MMWebView originally from(").append(creatorAdImplId).append(") MRaidState(").append(mraidState).append(").").append(super.toString()).toString();
    }

    void unresizeToDefault(final MMAdImpl adView)
    {
        this;
        JVM INSTR monitorenter ;
        if (!MMSDK.hasSetTranslationMethod() || !isMraidResized() || adView == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        adView = adView.getCallingAd();
        if (adView instanceof MMAdView)
        {
            adView = (MMAdView)adView;
            isUserClosedResize = true;
            MMSDK.runOnUiThread(new Runnable() {

                final MMWebView this$0;
                final MMAdView val$adView;

                void handleUnresize()
                {
                    if (MMSDK.hasSetTranslationMethod() && !hasDefaultResizeParams())
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
                        layoutparams.width = oldWidth;
                        layoutparams.height = oldHeight;
                        oldWidth = -50;
                        oldHeight = -50;
                        requestLayout();
                    }
                }

                public void run()
                {
                    synchronized (MMWebView.this)
                    {
                        adView.handleUnresize();
                        handleUnresize();
                        setMraidDefault();
                        isSendingSize = true;
                        invalidate();
                    }
                    return;
                    exception;
                    mmwebview;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = MMWebView.this;
                adView = mmadview;
                super();
            }
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        adView;
        throw adView;
    }

    void updateArgumentsWithSettings(Map map)
    {
        String s;
        if (isParentBannerAd())
        {
            s = "true";
        } else
        {
            s = "false";
        }
        map.put("PROPERTY_BANNER_TYPE", s);
        map.put("PROPERTY_STATE", mraidState);
        map.put("PROPERTY_EXPANDING", String.valueOf(creatorAdImplId));
    }

}
