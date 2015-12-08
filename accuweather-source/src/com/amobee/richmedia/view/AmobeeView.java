// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.AmobeeInterstitial;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.controller.OrmmaDisplayController;
import com.amobee.richmedia.controller.OrmmaUtilityController;
import com.amobee.richmedia.controller.util.OrmmaPlayer;
import com.amobee.richmedia.controller.util.OrmmaPlayerListener;
import com.amobee.richmedia.controller.util.OrmmaUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeChromeClient, API7WebSettings, Browser, AmobeeActionHandler

public final class AmobeeView extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{
    public static final class ACTION extends Enum
    {

        private static final ACTION ENUM$VALUES[];
        public static final ACTION PLAY_AUDIO;
        public static final ACTION PLAY_VIDEO;

        public static ACTION valueOf(String s)
        {
            return (ACTION)Enum.valueOf(com/amobee/richmedia/view/AmobeeView$ACTION, s);
        }

        public static ACTION[] values()
        {
            ACTION aaction[] = ENUM$VALUES;
            int i = aaction.length;
            ACTION aaction1[] = new ACTION[i];
            System.arraycopy(aaction, 0, aaction1, 0, i);
            return aaction1;
        }

        static 
        {
            PLAY_AUDIO = new ACTION("PLAY_AUDIO", 0);
            PLAY_VIDEO = new ACTION("PLAY_VIDEO", 1);
            ENUM$VALUES = (new ACTION[] {
                PLAY_AUDIO, PLAY_VIDEO
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }
    }

    public static abstract class NewLocationReciever
    {

        public abstract void OnNewLocation(ViewState viewstate);

        public NewLocationReciever()
        {
        }
    }

    public static interface OrmmaViewListener
    {

        public abstract void handleRequest(String s);

        public abstract boolean onEventFired();

        public abstract boolean onExpand();

        public abstract boolean onExpandClose();

        public abstract void onLeavingApplication();

        public abstract boolean onOverlay();

        public abstract boolean onReady();

        public abstract boolean onResize();

        public abstract boolean onResizeClose();
    }

    class ScrollEater extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final AmobeeView this$0;

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return true;
        }

        ScrollEater()
        {
            this$0 = AmobeeView.this;
            super();
        }
    }

    class TimeOut extends TimerTask
    {

        int mCount;
        int mProgress;
        final AmobeeView this$0;

        public void run()
        {
            int i = getProgress();
            if (i != 100) goto _L2; else goto _L1
_L1:
            cancel();
_L4:
            mProgress = i;
            return;
_L2:
            if (mProgress == i)
            {
                mCount = mCount + 1;
                if (mCount == 3)
                {
                    try
                    {
                        stopLoading();
                    }
                    catch (Exception exception)
                    {
                        Log.w("OrmmaView", "error in stopLoading");
                    }
                    cancel();
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        TimeOut()
        {
            this$0 = AmobeeView.this;
            super();
            mProgress = 0;
            mCount = 0;
        }
    }

    public static final class ViewState extends Enum
    {

        public static final ViewState DEFAULT;
        private static final ViewState ENUM$VALUES[];
        public static final ViewState EXPANDED;
        public static final ViewState HIDDEN;
        public static final ViewState INTERSTITIAL;
        public static final ViewState LEFT_BEHIND;
        public static final ViewState LOADING;
        public static final ViewState OPENED;
        public static final ViewState RESIZED;

        public static ViewState valueOf(String s)
        {
            return (ViewState)Enum.valueOf(com/amobee/richmedia/view/AmobeeView$ViewState, s);
        }

        public static ViewState[] values()
        {
            ViewState aviewstate[] = ENUM$VALUES;
            int i = aviewstate.length;
            ViewState aviewstate1[] = new ViewState[i];
            System.arraycopy(aviewstate, 0, aviewstate1, 0, i);
            return aviewstate1;
        }

        static 
        {
            DEFAULT = new ViewState("DEFAULT", 0);
            RESIZED = new ViewState("RESIZED", 1);
            EXPANDED = new ViewState("EXPANDED", 2);
            HIDDEN = new ViewState("HIDDEN", 3);
            LEFT_BEHIND = new ViewState("LEFT_BEHIND", 4);
            OPENED = new ViewState("OPENED", 5);
            LOADING = new ViewState("LOADING", 6);
            INTERSTITIAL = new ViewState("INTERSTITIAL", 7);
            ENUM$VALUES = (new ViewState[] {
                DEFAULT, RESIZED, EXPANDED, HIDDEN, LEFT_BEHIND, OPENED, LOADING, INTERSTITIAL
            });
        }

        private ViewState(String s, int i)
        {
            super(s, i);
        }
    }

    class downloadPicture extends AsyncTask
    {

        final AmobeeView this$0;
        String url;

        protected transient Bitmap doInBackground(String as[])
        {
            url = as[0];
            try
            {
                if (URLUtil.isValidUrl(url))
                {
                    as = (HttpURLConnection)(new URL(url)).openConnection();
                    as.setDoInput(true);
                    as.setUseCaches(true);
                    as.connect();
                    return BitmapFactory.decodeStream(as.getInputStream(), null, new android.graphics.BitmapFactory.Options());
                }
                raiseError("Store picture failed.", "storePicture");
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                raiseError("Store picture failed.", "storePicture");
                return null;
            }
            return null;
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            if (bitmap != null)
            {
                try
                {
                    if (android.provider.MediaStore.Images.Media.insertImage(getContext().getContentResolver(), bitmap, url.substring(url.lastIndexOf("/") + 1), null) == null)
                    {
                        raiseError("Store picture failed.", "storePicture");
                    }
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bitmap bitmap)
                {
                    raiseError("Store picture failed.", "storePicture");
                }
                return;
            } else
            {
                raiseError("Store picture failed.", "storePicture");
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        downloadPicture()
        {
            this$0 = AmobeeView.this;
            super();
            url = null;
        }
    }


    public static final String ACTION_KEY = "action";
    private static final String AD_PATH = "AD_PATH";
    public static int CLOSE_AREA_SIZE = 0;
    private static final int CONFIG_SCREEN_SIZE = 1024;
    private static final String CURRENT_FILE = "_ormma_current";
    public static final String DIMENSIONS = "expand_dimensions";
    private static final String ERROR_ACTION = "action";
    private static final String ERROR_MESSAGE = "message";
    private static final String EXCEPTION = "exception";
    private static final String EXPAND_PROPERTIES = "expand_properties";
    public static final String EXPAND_URL = "expand_url";
    private static final String FALSE = "false";
    private static final String GPP_3 = ".3gp";
    static final String LOG_TAG = "AmobeeView";
    private static final String MATROSKA = ".mkv";
    private static final int MESSAGE_ADD_CUSTOM_CLOSE = 1010;
    private static final int MESSAGE_CLOSE = 1001;
    private static final int MESSAGE_EXPAND = 1004;
    private static final int MESSAGE_HIDE = 1002;
    private static final int MESSAGE_OPEN = 1006;
    private static final int MESSAGE_PLAY_AUDIO = 1008;
    private static final int MESSAGE_PLAY_VIDEO = 1007;
    private static final int MESSAGE_RAISE_ERROR = 1009;
    private static final int MESSAGE_RESIZE = 1000;
    private static final int MESSAGE_SEND_EXPAND_CLOSE = 1005;
    private static final int MESSAGE_SHOW = 1003;
    private static final String MPEG_4 = ".mp4";
    private static final String MPEG_TS = ".ts";
    public static final String ORIENTATION = "expand_orientation";
    public static final String PLAYER_PROPERTIES = "player_properties";
    private static final String RESIZE_CUSTOM_ALLOW_OFF_SCREEN = "allowOffscreen";
    private static final String RESIZE_CUSTOM_CLOSE_POSITION = "customClosePosition";
    private static final String RESIZE_HEIGHT = "resize_height";
    private static final String RESIZE_OFFSET_X = "offsetX";
    private static final String RESIZE_OFFSET_Y = "offsetY";
    private static final String RESIZE_WIDTH = "resize_width";
    private static final String TAG = "OrmmaView";
    public static final String TRUE = "true";
    private static final String WEBM = ".webm";
    private static int attrs[] = {
        0x101011f, 0x1010120
    };
    public static boolean isExpanded = false;
    private static String mBridgeScriptName = "amobee_richmedia_bridge.js";
    private static String mBridgeScriptPath;
    private static String mMraidName = "mraid.js";
    private static String mMraidPath;
    private static String mScriptName = "amobee_richmedia.js";
    private static String mScriptPath;
    private static OrmmaPlayer player;
    public static boolean useInternalBrowser = false;
    protected int BACKGROUND_ID;
    protected int EXPAND_CLOSE_ID;
    protected int ORMMA_ID;
    protected int PLACEHOLDER_ID;
    protected int RESIZE_CLOSE_ID;
    public AmobeeInterstitial amobeeInterstitial;
    private boolean bGotLayoutParams;
    private boolean bKeyboardOut;
    private boolean bPageFinished;
    private ViewGroup content;
    public Bundle expandData;
    String forceOrientation;
    public boolean hasExpandedView;
    private int mContentViewHeight;
    private int mDefaultHeight;
    private int mDefaultWidth;
    public float mDensity;
    int mDensityDpi;
    boolean mDidChangeOrientation;
    private GestureDetector mGestureDetector;
    private Handler mHandler = new Handler() {

        private static int $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ViewState[];
        final AmobeeView this$0;

        static int[] $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ViewState()
        {
            int ai[] = $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ViewState;
            if (ai != null)
            {
                return ai;
            }
            ai = new int[ViewState.values().length];
            try
            {
                ai[ViewState.DEFAULT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                ai[ViewState.EXPANDED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                ai[ViewState.HIDDEN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                ai[ViewState.INTERSTITIAL.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                ai[ViewState.LEFT_BEHIND.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                ai[ViewState.LOADING.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                ai[ViewState.OPENED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                ai[ViewState.RESIZED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
            $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ViewState = ai;
            return ai;
        }

        public void handleMessage(Message message)
        {
            Object obj = message.getData();
            message.what;
            JVM INSTR tableswitch 1000 1010: default 68
        //                       1000 104
        //                       1001 359
        //                       1002 441
        //                       1003 461
        //                       1004 481
        //                       1005 74
        //                       1006 492
        //                       1007 516
        //                       1008 505
        //                       1009 527
        //                       1010 583;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
            super.handleMessage(message);
            return;
_L7:
            AmobeeView.isExpanded = false;
            if (mListener != null)
            {
                mListener.onExpandClose();
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (((Bundle) (obj)).getString("customClosePosition").equals("none"))
            {
                if (mViewState == ViewState.EXPANDED)
                {
                    AmobeeView.isExpanded = false;
                    if (mListener != null)
                    {
                        mListener.onExpandClose();
                    }
                }
                mViewState = ViewState.RESIZED;
                android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
                layoutparams.height = ((Bundle) (obj)).getInt("resize_height", layoutparams.height);
                layoutparams.width = ((Bundle) (obj)).getInt("resize_width", layoutparams.width);
                obj = (new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'resized', size: { width: ")).append(layoutparams.width).append(", ").append("height: ").append(layoutparams.height).append("}});").toString();
                injectJavaScriptRichMedia(((String) (obj)));
                requestLayout();
            } else
            if (changeContentAreaResize(((Bundle) (obj)).getInt("resize_width"), ((Bundle) (obj)).getInt("resize_height"), ((Bundle) (obj)).getString("customClosePosition"), ((Bundle) (obj)).getInt("offsetX"), ((Bundle) (obj)).getInt("offsetY"), ((Bundle) (obj)).getBoolean("allowOffscreen")) != null)
            {
                if (mViewState != ViewState.RESIZED && mListener != null)
                {
                    mListener.onResize();
                }
                mViewState = ViewState.RESIZED;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            switch ($SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ViewState()[mViewState.ordinal()])
            {
            case 2: // '\002'
                closeResized();
                break;

            case 3: // '\003'
                closeExpanded();
                break;

            case 8: // '\b'
                closeInterstitial();
                break;
            }
            if (false)
            {
            }
            continue; /* Loop/switch isn't completed */
_L4:
            setVisibility(4);
            injectJavaScriptRichMedia("window.ormmaview.fireChangeEvent({ state: 'hidden' });");
            continue; /* Loop/switch isn't completed */
_L5:
            injectJavaScriptRichMedia("window.ormmaview.fireChangeEvent({ state: 'default' });");
            setVisibility(0);
            continue; /* Loop/switch isn't completed */
_L6:
            doExpand(((Bundle) (obj)));
            continue; /* Loop/switch isn't completed */
_L8:
            mViewState = ViewState.LEFT_BEHIND;
            continue; /* Loop/switch isn't completed */
_L10:
            playAudioImpl(((Bundle) (obj)));
            continue; /* Loop/switch isn't completed */
_L9:
            playVideoImpl(((Bundle) (obj)));
            continue; /* Loop/switch isn't completed */
_L11:
            String s = ((Bundle) (obj)).getString("message");
            obj = ((Bundle) (obj)).getString("action");
            obj = (new StringBuilder("window.ormmaview.fireErrorEvent(\"")).append(s).append("\", \"").append(((String) (obj))).append("\")").toString();
            injectJavaScriptRichMedia(((String) (obj)));
            continue; /* Loop/switch isn't completed */
_L12:
            addCloseButton();
            if (true) goto _L1; else goto _L13
_L13:
        }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
    };
    private int mIndex;
    private int mInitLayoutHeight;
    private int mInitLayoutWidth;
    private int mInterstitialRandom;
    private OrmmaViewListener mListener;
    private String mLocalFilePath;
    int mStatusBarHeight;
    private TimeOut mTimeOut;
    public boolean mUpdateJSOrientation;
    boolean mUserGestureRequiredToOpenAds;
    boolean mUserTouchedTheView;
    private OrmmaUtilityController mUtilityController;
    public ViewState mViewState;
    WebChromeClient mWebChromeClient;
    WebViewClient mWebViewClient = new WebViewClient() {

        final AmobeeView this$0;

        public String getMimeType(String s)
        {
            Object obj = null;
            String s1 = MimeTypeMap.getFileExtensionFromUrl(s);
            s = obj;
            if (s1 != null)
            {
                s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s1);
            }
            return s;
        }

        public void onLoadResource(WebView webview, String s)
        {
            super.onLoadResource(webview, s);
        }

        public void onPageFinished(WebView webview, String s)
        {
            mDefaultHeight = (int)((float)getHeight() / mDensity);
            mDefaultWidth = (int)((float)getWidth() / mDensity);
            getCurrentPosition();
            mUtilityController.handleCalendarEvent();
            if (mViewState == ViewState.INTERSTITIAL && amobeeInterstitial != null && s.toLowerCase().startsWith("file://"))
            {
                webview = (FrameLayout)((FrameLayout)((Activity)getContext()).getWindow().getDecorView().getRootView()).findViewById(amobeeInterstitial.getRandom());
                if (webview == null)
                {
                    Log.d("[a\u2022mo\u2022bee]", "it is not the original context, interstitial will not be shown");
                    return;
                } else
                {
                    webview.setVisibility(0);
                    return;
                }
            }
            if (parentView != null && getParent() == null)
            {
                parentView.post(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        ViewGroup viewgroup = content;
                        if (viewgroup == null)
                        {
                            closeExpanded();
                            return;
                        }
                        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
                        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                        FrameLayout framelayout = new FrameLayout(getContext());
                        if (android.os.Build.VERSION.SDK_INT >= 14)
                        {
                            layoutparams.setMargins(0, mStatusBarHeight, 0, 0);
                        } else
                        {
                            framelayout.setPadding(0, mStatusBarHeight, 0, 0);
                        }
                        framelayout.setOnTouchListener(new android.view.View.OnTouchListener() {

                            final _cls1 this$2;

                            public boolean onTouch(View view, MotionEvent motionevent)
                            {
                                Log.i("AmobeeView", "background touch called");
                                return true;
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        framelayout.addView(_fld0);
                        viewgroup.addView(framelayout, layoutparams);
                        if (!useCustomClose)
                        {
                            addCloseButton();
                        }
                        mViewState = ViewState.EXPANDED;
                        AmobeeView.isExpanded = true;
                        parentView.hasExpandedView = true;
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }
            mUtilityController.ready();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            this;
            JVM INSTR monitorenter ;
            if (mViewState != ViewState.INTERSTITIAL || amobeeInterstitial == null) goto _L2; else goto _L1
_L1:
            webview = s.toLowerCase();
            if (!webview.contains("redirect") || !webview.contains((new StringBuilder()).append(amobeeInterstitial.getRandom()).toString())) goto _L4; else goto _L3
_L3:
            closeInterstitial();
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
_L4:
            boolean flag = webview.contains("actionpage");
            if (!flag);
            if (true) goto _L2; else goto _L5
_L5:
            webview;
            throw webview;
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            if (parentView != null)
            {
                closeExpanded();
            }
            Log.d("AmobeeView", (new StringBuilder("error:")).append(s).toString());
            super.onReceivedError(webview, i, s, s1);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Object obj1;
            obj1 = s.toLowerCase();
            android.util.Log.d("njdskJDV", (new StringBuilder()).append(mViewState).append(" == ").append(ViewState.INTERSTITIAL).toString());
            android.util.Log.d("njdskJDV", (new StringBuilder(String.valueOf(obj1))).append(" == ").append(mInterstitialRandom).toString());
            if (mViewState != ViewState.INTERSTITIAL || amobeeInterstitial == null || !((String) (obj1)).contains("redirect") || !((String) (obj1)).contains((new StringBuilder("n=")).append(amobeeInterstitial.getRandom()).toString())) goto _L2; else goto _L1
_L1:
            closeInterstitial();
_L14:
            return true;
_L2:
            Object obj;
            Uri uri;
            if (mViewState == ViewState.INTERSTITIAL && ((String) (obj1)).contains("actionpage"))
            {
                return false;
            }
            if (mUserGestureRequiredToOpenAds && !mUserTouchedTheView)
            {
                Log.d("AmobeeView", (new StringBuilder("Url blocked: ")).append(((String) (obj1))).toString());
                return true;
            }
            uri = Uri.parse(s);
            obj = obj1;
            if (mListener == null) goto _L4; else goto _L3
_L3:
            obj = obj1;
            if (!isRegisteredProtocol(uri)) goto _L4; else goto _L5
_L5:
            obj = obj1;
            mListener.handleRequest(s);
            return true;
_L19:
            if (mListener == null) goto _L7; else goto _L6
_L6:
            mListener.onLeavingApplication();
_L32:
            webview = new Intent();
            webview.setAction("android.intent.action.VIEW");
            webview.setData(uri);
            webview.addFlags(0x10000000);
            getContext().startActivity(webview);
            return true;
            webview;
            Log.d("OrmmaView", (new StringBuilder("this click interaction is not supported for url ")).append(((String) (obj))).toString());
            return true;
_L4:
            obj = obj1;
            if (mViewState != ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_399;
            }
            obj = obj1;
            if (((String) (obj1)).startsWith("file://"))
            {
                return false;
            }
            obj = obj1;
            webview = ((WebView) (obj1));
            if (!((String) (obj1)).startsWith("wtai://wp/mc;"))
            {
                break MISSING_BLOCK_LABEL_431;
            }
            obj = obj1;
            webview = ((String) (obj1)).replace("wtai://wp/mc;", "tel:");
            obj = webview;
            if (!webview.startsWith("tel:"))
            {
                break MISSING_BLOCK_LABEL_639;
            }
            obj = webview;
            if (!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony")) goto _L9; else goto _L8
_L8:
            obj = webview;
            if (mListener == null) goto _L11; else goto _L10
_L10:
            obj = webview;
            mListener.onLeavingApplication();
_L12:
            obj = webview;
            if (amobeeInterstitial == null)
            {
                break MISSING_BLOCK_LABEL_529;
            }
            obj = webview;
            if (mViewState != ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_529;
            }
            obj = webview;
            amobeeInterstitial.interstitialClicked();
            s = new Intent("android.intent.action.DIAL", Uri.parse(webview));
            s.addFlags(0x10000000);
            getContext().startActivity(s);
            return true;
            s;
            obj = webview;
            Log.d("OrmmaView", "this click interaction is not supported");
            return true;
_L11:
            obj = webview;
            if (parentView == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            if (parentView.mListener == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            parentView.mListener.onLeavingApplication();
            if (true) goto _L12; else goto _L9
_L9:
            obj = webview;
            Log.d("OrmmaView", "this click interaction is not supported");
            return true;
            obj = webview;
            if (isUrlRequiresActionView(webview)) goto _L14; else goto _L13
_L13:
            obj = webview;
            if (!urlContainsVideo(uri.toString())) goto _L16; else goto _L15
_L15:
            obj = webview;
            if (mListener == null) goto _L18; else goto _L17
_L17:
            obj = webview;
            mListener.onLeavingApplication();
_L20:
            obj = webview;
            obj1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            obj = webview;
            ((Intent) (obj1)).setDataAndType(Uri.parse(s), "video/*");
            obj = webview;
            ((Intent) (obj1)).addFlags(0x10000000);
            obj = webview;
            getContext().startActivity(((Intent) (obj1)));
            return true;
_L18:
            obj = webview;
            if (amobeeInterstitial == null)
            {
                break MISSING_BLOCK_LABEL_797;
            }
            obj = webview;
            if (mViewState != ViewState.INTERSTITIAL)
            {
                break MISSING_BLOCK_LABEL_797;
            }
            obj = webview;
            try
            {
                amobeeInterstitial.interstitialClicked();
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview) { }
              goto _L19
            obj = webview;
            if (parentView == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            if (parentView.mListener == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = webview;
            parentView.mListener.onLeavingApplication();
            if (true) goto _L20; else goto _L16
_L16:
            obj = webview;
            if (!AmobeeView.useInternalBrowser) goto _L22; else goto _L21
_L21:
            obj = webview;
            open(uri.toString(), true, true, true);
_L27:
            obj = webview;
            if (mViewState != ViewState.INTERSTITIAL) goto _L14; else goto _L23
_L23:
            obj = webview;
            if (amobeeInterstitial == null) goto _L14; else goto _L24
_L24:
            obj = webview;
            amobeeInterstitial.interstitialClicked();
            return true;
_L22:
            obj = webview;
            if (mListener == null) goto _L26; else goto _L25
_L25:
            obj = webview;
            mListener.onLeavingApplication();
_L29:
            obj = webview;
            s = new Intent();
            obj = webview;
            s.setAction("android.intent.action.VIEW");
            obj = webview;
            s.setData(uri);
            obj = webview;
            s.addFlags(0x10000000);
            obj = webview;
            getContext().startActivity(s);
              goto _L27
_L26:
            obj = webview;
            if (parentView == null) goto _L29; else goto _L28
_L28:
            obj = webview;
            if (parentView.mListener == null) goto _L29; else goto _L30
_L30:
            obj = webview;
            parentView.mListener.onLeavingApplication();
              goto _L29
_L7:
            if (parentView == null || parentView.mListener == null) goto _L32; else goto _L31
_L31:
            parentView.mListener.onLeavingApplication();
              goto _L32
        }


            
            {
                this$0 = AmobeeView.this;
                super();
            }
    };
    private String mapAPIKey;
    public DisplayMetrics metrics;
    boolean noCache;
    public int originalAppOrientation;
    public AmobeeView parentView;
    private FrameLayout placeHolder;
    private final HashSet registeredProtocols;
    boolean shouldAllowOrientationChange;
    public Timer t;
    boolean useCustomClose;
    private ImageButton videoCloseButton;
    private int viewHeight;
    private int viewWidth;

    public AmobeeView(Context context)
    {
        super(context);
        useCustomClose = true;
        placeHolder = null;
        content = null;
        parentView = null;
        hasExpandedView = false;
        amobeeInterstitial = null;
        viewWidth = -1;
        viewHeight = -1;
        mUserGestureRequiredToOpenAds = false;
        mUserTouchedTheView = false;
        mDidChangeOrientation = false;
        mUpdateJSOrientation = true;
        mStatusBarHeight = 0;
        noCache = true;
        forceOrientation = "none";
        shouldAllowOrientationChange = true;
        videoCloseButton = null;
        expandData = null;
        originalAppOrientation = -2;
        mViewState = ViewState.DEFAULT;
        registeredProtocols = new HashSet();
        mWebChromeClient = null;
        initialize();
    }

    public AmobeeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        useCustomClose = true;
        placeHolder = null;
        content = null;
        parentView = null;
        hasExpandedView = false;
        amobeeInterstitial = null;
        viewWidth = -1;
        viewHeight = -1;
        mUserGestureRequiredToOpenAds = false;
        mUserTouchedTheView = false;
        mDidChangeOrientation = false;
        mUpdateJSOrientation = true;
        mStatusBarHeight = 0;
        noCache = true;
        forceOrientation = "none";
        shouldAllowOrientationChange = true;
        videoCloseButton = null;
        expandData = null;
        originalAppOrientation = -2;
        mViewState = ViewState.DEFAULT;
        registeredProtocols = new HashSet();
        mWebChromeClient = null;
        if (isInEditMode())
        {
            return;
        }
        initialize();
        context = getContext().obtainStyledAttributes(attributeset, attrs);
        int i = context.getDimensionPixelSize(0, -1);
        int j = context.getDimensionPixelSize(1, -1);
        if (i > 0 && j > 0)
        {
            mUtilityController.setMaxSize(i, j);
        }
        context.recycle();
    }

    public AmobeeView(Context context, OrmmaViewListener ormmaviewlistener)
    {
        super(context);
        useCustomClose = true;
        placeHolder = null;
        content = null;
        parentView = null;
        hasExpandedView = false;
        amobeeInterstitial = null;
        viewWidth = -1;
        viewHeight = -1;
        mUserGestureRequiredToOpenAds = false;
        mUserTouchedTheView = false;
        mDidChangeOrientation = false;
        mUpdateJSOrientation = true;
        mStatusBarHeight = 0;
        noCache = true;
        forceOrientation = "none";
        shouldAllowOrientationChange = true;
        videoCloseButton = null;
        expandData = null;
        originalAppOrientation = -2;
        mViewState = ViewState.DEFAULT;
        registeredProtocols = new HashSet();
        mWebChromeClient = null;
        setListener(ormmaviewlistener);
        initialize();
    }

    private FrameLayout changeContentArea(com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions)
    {
        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
        ViewGroup viewgroup = (ViewGroup)getRootView();
        if (viewgroup == null)
        {
            dimensions = null;
        } else
        {
            Object obj = (ViewGroup)getParent();
            if (obj == null)
            {
                return null;
            }
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(dimensions.width, dimensions.height);
            double d;
            double d2;
            if (obj != null)
            {
                int j = ((ViewGroup) (obj)).getChildCount();
                int i = 0;
                double d1;
                Object obj1;
                int ai[];
                while (i < j && ((ViewGroup) (obj)).getChildAt(i) != this) 
                {
                    i++;
                }
                mIndex = i;
                placeHolder = new FrameLayout(getContext());
                placeHolder.setId(PLACEHOLDER_ID);
                obj1 = new android.view.ViewGroup.LayoutParams(getWidth(), getHeight());
                ((ViewGroup) (obj)).addView(placeHolder, i, ((android.view.ViewGroup.LayoutParams) (obj1)));
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    onPause();
                }
                ((ViewGroup) (obj)).removeView(this);
            }
            obj = new FrameLayout(getContext());
            ((FrameLayout) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

                final AmobeeView this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    Log.i("AmobeeView", "background touch called");
                    return true;
                }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
            });
            obj1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) (obj)).setId(BACKGROUND_ID);
            ai = getDefaultPosition();
            d1 = (float)dimensions.x * mDensity;
            d = d1;
            if (Math.abs(d1 - (double)ai[0]) < 1.0D)
            {
                d = ai[0];
            }
            d2 = d;
            if (d < 0.0D)
            {
                d2 = 0.0D;
            }
            d1 = (float)dimensions.y * mDensity;
            d = d1;
            if (Math.abs(d1 - (double)ai[1]) < 1.0D)
            {
                d = ai[1];
            }
            d1 = d;
            if (d < 0.0D)
            {
                d1 = 0.0D;
            }
            d = d1;
            if (dimensions.height + 1 < metrics.heightPixels)
            {
                d = d1;
                if ((double)metrics.heightPixels - d1 - (double)dimensions.height <= 1.0D)
                {
                    d = metrics.heightPixels - dimensions.height;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                layoutparams.setMargins(0, mStatusBarHeight, 0, 0);
                ((FrameLayout) (obj)).setPadding((int)d2, (int)d, 0, 0);
            } else
            {
                ((FrameLayout) (obj)).setPadding((int)d2, (int)d + mStatusBarHeight, 0, 0);
            }
            viewgroup.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
            ((FrameLayout) (obj)).addView(this, 0, layoutparams);
            dimensions = ((com.amobee.richmedia.controller.OrmmaController.Dimensions) (obj));
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                onResume();
                return ((FrameLayout) (obj));
            }
        }
        return dimensions;
    }

    private FrameLayout changeContentAreaResize(int i, int j, String s, int k, int l, boolean flag)
    {
        Object obj;
        if (mViewState == ViewState.RESIZED)
        {
            mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
            FrameLayout framelayout = (FrameLayout)getParent();
            obj = framelayout;
            if (framelayout != null)
            {
                obj = (FrameLayout)framelayout.findViewById(RESIZE_CLOSE_ID);
                if (obj != null)
                {
                    resizeCloseArea(s, ((FrameLayout) (obj)));
                }
                double d4 = (float)k * mDensity;
                double d6 = (float)l * mDensity;
                obj = calculateCurrentPosition(false);
                s = ((String) (obj));
                if (obj == null)
                {
                    s = getDefaultPosition();
                }
                s[0] = (int)((float)s[0] * metrics.density);
                s[1] = (int)((float)s[1] * metrics.density);
                double d2 = d4;
                double d = d6;
                if (!flag)
                {
                    obj = fixResizeOffset(d4, d6, j, i);
                    obj = repositionedXY(((Point) (obj)).x, ((Point) (obj)).y, s, i, j);
                    d2 = ((Point) (obj)).x;
                    d = ((Point) (obj)).y;
                }
                obj = getLayoutParams();
                obj.height = j;
                obj.width = i;
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    obj = new android.widget.FrameLayout.LayoutParams(framelayout.getLayoutParams().width, framelayout.getLayoutParams().height);
                    ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins((int)((double)s[0] + d2), (int)((double)s[1] + d + (double)mStatusBarHeight), 0, 0);
                    s = new android.widget.FrameLayout.LayoutParams(i, j);
                    framelayout.getChildAt(0).setLayoutParams(s);
                    framelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                } else
                {
                    framelayout.setPadding((int)((double)s[0] + d2), (int)((double)s[1] + d + (double)mStatusBarHeight), 0, 0);
                }
                injectJavaScriptRichMedia((new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'resized', size: { width: ")).append(i).append(", ").append("height: ").append(j).append("}});").toString());
                requestLayout();
                obj = framelayout;
            }
        } else
        {
            double d5 = (float)k * mDensity;
            double d7 = (float)l * mDensity;
            obj = getDefaultPosition();
            double d3 = d5;
            double d1 = d7;
            if (!flag)
            {
                Point point = fixResizeOffset(d5, d7, j, i);
                point = repositionedXY(point.x, point.y, ((int []) (obj)), i, j);
                d3 = point.x;
                d1 = point.y;
            }
            ViewGroup viewgroup = (ViewGroup)getRootView();
            if (viewgroup == null)
            {
                return null;
            }
            Object obj1 = (ViewGroup)getParent();
            if (obj1 == null)
            {
                return null;
            }
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i, j);
            if (obj1 != null)
            {
                l = ((ViewGroup) (obj1)).getChildCount();
                k = 0;
                Object obj2;
                while (k < l && ((ViewGroup) (obj1)).getChildAt(k) != this) 
                {
                    k++;
                }
                mIndex = k;
                placeHolder = new FrameLayout(getContext());
                placeHolder.setId(PLACEHOLDER_ID);
                obj2 = new android.view.ViewGroup.LayoutParams(getWidth(), getHeight());
                ((ViewGroup) (obj1)).addView(placeHolder, k, ((android.view.ViewGroup.LayoutParams) (obj2)));
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    onPause();
                }
                ((ViewGroup) (obj1)).removeView(this);
            }
            obj1 = new FrameLayout(getContext());
            injectJavaScriptRichMedia((new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'resized', size: { width: ")).append(i).append(", ").append("height: ").append(j).append("}});").toString());
            obj2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            ((FrameLayout) (obj1)).setId(BACKGROUND_ID);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                ((android.widget.FrameLayout.LayoutParams) (obj2)).setMargins((int)((double)obj[0] + d3), (int)((double)mStatusBarHeight + d1 + (double)obj[1]), 0, 0);
            } else
            {
                ((FrameLayout) (obj1)).setPadding((int)((double)obj[0] + d3), (int)((double)mStatusBarHeight + d1 + (double)obj[1]), 0, 0);
            }
            getSettings().setUseWideViewPort(false);
            ((FrameLayout) (obj1)).addView(this, layoutparams);
            ((FrameLayout) (obj1)).addView(resizeCloseArea(s, null));
            viewgroup.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            requestFocus(130);
            obj = obj1;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                onResume();
                return ((FrameLayout) (obj1));
            }
        }
        return ((FrameLayout) (obj));
    }

    private void closeExpandedOnUIThread()
    {
        post(new Runnable() {

            final AmobeeView this$0;

            public void run()
            {
                closeExpanded();
            }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
        });
    }

    private void closeResized()
    {
        mViewState = ViewState.DEFAULT;
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'default', size: { width: ")).append(mDefaultWidth).append(", ").append("height: ").append(mDefaultHeight).append("}").append("});").toString();
        Log.d("AmobeeView", (new StringBuilder("closeResized: injection: ")).append(s).toString());
        injectJavaScriptRichMedia(s);
        if ((FrameLayout)getRootView().findViewById(BACKGROUND_ID) != null)
        {
            if (mListener != null)
            {
                mListener.onResizeClose();
            }
            resetContents();
            return;
        } else
        {
            resetLayout();
            return;
        }
    }

    private Point fixResizeOffset(double d, double d1, int i, int j)
    {
        double d3 = d;
        double d2 = d1;
        getDefaultPosition();
        j = metrics.widthPixels - j;
        i = metrics.heightPixels - mStatusBarHeight - i;
        if ((double)j <= Math.abs(d))
        {
            d3 = ((double)j * d) / d;
        }
        if ((double)i <= Math.abs(d1))
        {
            d2 = ((double)i * d1) / d1;
        }
        return new Point((int)d3, (int)d2);
    }

    private int getContentViewHeight()
    {
        ViewGroup viewgroup = (ViewGroup)getRootView();
        if (viewgroup != null)
        {
            return viewgroup.getHeight();
        } else
        {
            return -1;
        }
    }

    private String getFragment(InputStream inputstream)
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        abyte0 = new byte[1024];
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = "";
_L2:
        int i = inputstream.read(abyte0);
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        inputstream = bytearrayoutputstream.toString();
        Exception exception;
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            catch (Exception exception1) { }
        }
        obj = inputstream;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception2)
            {
                obj = inputstream;
            }
        }
        return ((String) (obj));
        try
        {
            bytearrayoutputstream.write(abyte0, 0, i);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        finally
        {
            if (bytearrayoutputstream != null)
            {
                try
                {
                    bytearrayoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception) { }
            }
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception) { }
            }
            throw inputstream;
        }
        inputstream.printStackTrace();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return "";
            }
        } else
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception2;
    }

    private void initialize()
    {
        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
        Object obj = new Random();
        BACKGROUND_ID = ((Random) (obj)).nextInt(0x1046a);
        do
        {
            PLACEHOLDER_ID = ((Random) (obj)).nextInt(0x1046a);
        } while (PLACEHOLDER_ID == BACKGROUND_ID);
        do
        {
            ORMMA_ID = ((Random) (obj)).nextInt(0x1046a);
        } while (ORMMA_ID == BACKGROUND_ID || ORMMA_ID == PLACEHOLDER_ID);
        do
        {
            RESIZE_CLOSE_ID = ((Random) (obj)).nextInt(0x1046a);
        } while (RESIZE_CLOSE_ID == BACKGROUND_ID || RESIZE_CLOSE_ID == PLACEHOLDER_ID || RESIZE_CLOSE_ID == ORMMA_ID);
        do
        {
            EXPAND_CLOSE_ID = ((Random) (obj)).nextInt(0x1046a);
        } while (EXPAND_CLOSE_ID == BACKGROUND_ID || EXPAND_CLOSE_ID == PLACEHOLDER_ID || EXPAND_CLOSE_ID == ORMMA_ID || EXPAND_CLOSE_ID == RESIZE_CLOSE_ID);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        mGestureDetector = new GestureDetector(new ScrollEater());
        setBackgroundColor(0);
        metrics = new DisplayMetrics();
        ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getMetrics(metrics);
        mDensity = metrics.density;
        int i = 160;
        if (metrics != null)
        {
            i = metrics.densityDpi;
        }
        mDensityDpi = i;
        bPageFinished = false;
        obj = getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        requestFocus(130);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmobeeView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 30;
                   goto _L1 _L2 _L2
_L1:
                return false;
_L2:
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
        });
        ((WebSettings) (obj)).setSupportZoom(false);
        ((WebSettings) (obj)).setUseWideViewPort(false);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ((WebSettings) (obj)).setMediaPlaybackRequiresUserGesture(false);
        }
        i = android.os.Build.VERSION.SDK_INT;
        mUtilityController = new OrmmaUtilityController(this, getContext());
        addJavascriptInterface(mUtilityController, "ORMMAUtilityControllerBridge");
        setWebViewClient(mWebViewClient);
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            mWebChromeClient = new AmobeeChromeClient(this);
            new API7WebSettings(((WebSettings) (obj)));
        } else
        {
            mWebChromeClient = new WebChromeClient();
        }
        setWebChromeClient(mWebChromeClient);
        if (android.os.Build.VERSION.SDK_INT >= 19 && AdManager.debugLevel == com.amobee.adsdk.AdManager.DebugLevel.DEBUG)
        {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        setScriptPath();
        mContentViewHeight = getContentViewHeight();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        setDownloadListener(new DownloadListener() {

            final AmobeeView this$0;

            public void onDownloadStart(String s, String s1, String s2, String s3, long l)
            {
                (new Intent("android.intent.action.VIEW")).setDataAndType(Uri.parse(s), s3);
            }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
        });
    }

    private boolean isRegisteredProtocol(Uri uri)
    {
        uri = uri.getScheme();
        if (uri != null)
        {
            Iterator iterator = registeredProtocols.iterator();
            while (iterator.hasNext()) 
            {
                if (((String)iterator.next()).equalsIgnoreCase(uri))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void loadInputStream(InputStream inputstream)
    {
        if (!noCache) goto _L2; else goto _L1
_L1:
        final String url = getFragment(inputstream);
        parentView.post(new Runnable() {

            final AmobeeView this$0;
            private final String val$url;

            public void run()
            {
                loadStringDirect(url);
            }

            
            {
                this$0 = AmobeeView.this;
                url = s;
                super();
            }
        });
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        inputstream.close();
_L3:
        return;
_L2:
        mLocalFilePath = mUtilityController.writeToDiskWrap(inputstream, "_ormma_current", true, null, mBridgeScriptPath, mScriptPath);
        final String url = (new StringBuilder("file://")).append(mLocalFilePath).append(File.separator).append("_ormma_current").toString();
        parentView.post(new Runnable() {

            final AmobeeView this$0;
            private final String val$url;

            public void run()
            {
                loadUrl(url);
            }

            
            {
                this$0 = AmobeeView.this;
                url = s;
                super();
            }
        });
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        inputstream.close();
_L6:
        return;
        Object obj;
        obj;
        closeExpandedOnUIThread();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        inputstream.close();
_L4:
        return;
        obj;
        closeExpandedOnUIThread();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        inputstream.close();
_L5:
        return;
        obj;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw obj;
        inputstream;
          goto _L3
        inputstream;
          goto _L4
        inputstream;
          goto _L5
        inputstream;
          goto _L6
    }

    private void loadInputStream(InputStream inputstream, String s)
    {
        reset();
        String s1;
        mLocalFilePath = mUtilityController.writeToDiskWrap(inputstream, "_ormma_current", true, s, mBridgeScriptPath, mScriptPath);
        s1 = (new StringBuilder("file://")).append(mLocalFilePath).append(File.separator).append("_ormma_current").toString();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        injectJavaScript(s);
        super.loadUrl(s1);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        inputstream.close();
_L4:
        return;
        s;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        inputstream.close();
_L1:
        return;
        s;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        inputstream.close();
_L2:
        return;
        s;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw s;
        inputstream;
          goto _L1
        inputstream;
          goto _L2
        inputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void loadStringDirect(String s)
    {
        reset();
        if (!s.contains("<html"))
        {
            if (s.contains(mBridgeScriptName) && s.contains(mScriptName))
            {
                s = (new StringBuilder("<html><head><meta name='viewport' content='user-scalable=no, initial-scale=1.0'><title>Amobee</title></head><body style=\"margin:0; padding:0; overflow:hidden; background-color:transparent;text-align:center\"><div>")).append(s).append("</div></body></html>").toString();
            } else
            {
                s = (new StringBuilder("<html><head><meta name='viewport' content='user-scalable=no, initial-scale=1.0'><title>Amobee</title></head><body style=\"margin:0; padding:0; overflow:hidden; background-color:transparent;text-align:center\"><div>")).append(s).append("</div></body></html>").toString();
            }
        }
        if (mLocalFilePath == null)
        {
            mLocalFilePath = mUtilityController.copyTextFromJarIntoAssetDir("/", "");
        }
        loadDataWithBaseURL((new StringBuilder("file://")).append(mMraidPath).toString(), s, "text/html", "UTF-8", null);
    }

    private Point repositionedXY(double d, double d1, int ai[], int i, int j)
    {
        double d2;
        if ((double)ai[0] + d < 0.0D)
        {
            d2 = d + (0.0D - ((double)ai[0] + d));
        } else
        {
            d2 = d;
            if ((double)ai[0] + d + (double)i >= (double)metrics.widthPixels)
            {
                d2 = d + ((double)metrics.widthPixels - ((double)ai[0] + d + (double)i));
            }
        }
        if ((double)ai[1] + d1 < (double)mStatusBarHeight)
        {
            d = d1 + (0.0D - ((double)ai[1] + d1));
        } else
        {
            d = d1;
            if ((double)(ai[1] + j) + d1 >= (double)(metrics.heightPixels - mStatusBarHeight))
            {
                d = d1 + ((double)(metrics.heightPixels - mStatusBarHeight) - ((double)ai[1] + d1 + (double)j));
            }
        }
        ai = new Point();
        ai.x = (int)d2;
        ai.y = (int)d;
        return ai;
    }

    private void reset()
    {
        restoreState();
        invalidate();
        if (mUtilityController != null)
        {
            mUtilityController.deleteOldAds();
            mUtilityController.stopAllListeners();
        }
        resetLayout();
    }

    private void resetLayout()
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (bGotLayoutParams)
        {
            layoutparams.height = mInitLayoutHeight;
            layoutparams.width = mInitLayoutWidth;
        }
        setVisibility(0);
        requestLayout();
    }

    private FrameLayout resizeCloseArea(String s, FrameLayout framelayout)
    {
        Object obj = framelayout;
        framelayout = ((FrameLayout) (obj));
        if (obj == null)
        {
            obj = new android.view.View.OnClickListener() {

                final AmobeeView this$0;

                public void onClick(View view)
                {
                    ((FrameLayout)view).removeAllViews();
                    ((FrameLayout)view.getParent()).removeView(view);
                    closeResized();
                }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
            };
            framelayout = new FrameLayout(getContext());
            framelayout.setBackgroundColor(0);
            framelayout.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            framelayout.setId(RESIZE_CLOSE_ID);
        }
        int i = (int)((float)CLOSE_AREA_SIZE * mDensity);
        obj = new android.widget.FrameLayout.LayoutParams(i, i);
        obj.gravity = getGravity(s);
        framelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return framelayout;
    }

    private void setScriptPath()
    {
        this;
        JVM INSTR monitorenter ;
        if (mBridgeScriptPath == null)
        {
            mBridgeScriptPath = mUtilityController.copyTextFromJarIntoAssetDir("/js/amobee_richmedia_bridge.js", "js/amobee_richmedia_bridge.js");
        }
        if (mScriptPath == null)
        {
            mScriptPath = mUtilityController.copyTextFromJarIntoAssetDir("/js/amobee_richmedia.js", "js/amobee_richmedia.js");
        }
        if (mMraidPath == null)
        {
            mMraidPath = mUtilityController.copyTextFromJarIntoAssetDir("/js/mraid.js", "js/mraid.js");
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void addCloseButton()
    {
        ViewGroup viewgroup = (ViewGroup)getParent();
        if (viewgroup != null)
        {
            final android.view.View.OnClickListener closeOnClickListener = new android.view.View.OnClickListener() {

                final AmobeeView this$0;

                public void onClick(View view)
                {
                    ((ViewGroup)view).removeAllViews();
                    ((ViewGroup)view.getParent()).removeView(view);
                    if (mViewState == ViewState.INTERSTITIAL)
                    {
                        closeInterstitial();
                        return;
                    } else
                    {
                        closeExpanded();
                        return;
                    }
                }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
            };
            FrameLayout framelayout = new FrameLayout(getContext());
            framelayout.setBackgroundColor(0);
            framelayout.setOnClickListener(closeOnClickListener);
            videoCloseButton = new ImageButton(getContext());
            Object obj = Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_x.png", mDensityDpi));
            videoCloseButton.setImageBitmap(((Bitmap) (obj)));
            videoCloseButton.setBackgroundColor(0);
            videoCloseButton.setOnClickListener(new android.view.View.OnClickListener() {

                final AmobeeView this$0;
                private final android.view.View.OnClickListener val$closeOnClickListener;

                public void onClick(View view)
                {
                    if (view.getParent() != null)
                    {
                        closeOnClickListener.onClick((View)view.getParent());
                    }
                }

            
            {
                this$0 = AmobeeView.this;
                closeOnClickListener = onclicklistener;
                super();
            }
            });
            closeOnClickListener = new android.widget.FrameLayout.LayoutParams(-2, -2);
            closeOnClickListener.gravity = 53;
            int i = (int)((float)CLOSE_AREA_SIZE * mDensity);
            obj = new android.widget.FrameLayout.LayoutParams(i, i);
            obj.gravity = 53;
            i = (int)((double)(18F * AdManager.getDensity(getContext())) + 0.5D);
            if (parentView == null && android.os.Build.VERSION.SDK_INT >= 14)
            {
                ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, mStatusBarHeight + i, 0, 0);
            }
            videoCloseButton.setLayoutParams(closeOnClickListener);
            framelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            framelayout.addView(videoCloseButton);
            framelayout.setId(EXPAND_CLOSE_ID);
            viewgroup.addView(framelayout);
        }
    }

    public int[] calculateCurrentPosition(boolean flag)
    {
        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
        int ai[] = new int[2];
        int ai1[] = new int[2];
        Object obj = (ViewGroup)getRootView();
        if (obj != null)
        {
            ((ViewGroup) (obj)).getLocationOnScreen(ai1);
            getLocationOnScreen(ai);
            obj = getResources().getDisplayMetrics();
            if (viewWidth == -1)
            {
                viewWidth = getWidth();
                viewHeight = getHeight();
            }
            int i = (int)((float)(ai[0] - ai1[0]) / ((DisplayMetrics) (obj)).density);
            int j = (int)((float)(ai[1] - (ai1[1] + mStatusBarHeight)) / ((DisplayMetrics) (obj)).density);
            int k = (int)((float)viewWidth / ((DisplayMetrics) (obj)).density);
            int l = (int)((float)viewHeight / ((DisplayMetrics) (obj)).density);
            if (flag)
            {
                injectJavaScriptRichMedia((new StringBuilder("window.ormmaview.fireChangeEvent({currentPosition : {'x': ")).append(i).append(", 'y': ").append(j).append(", 'width': ").append(k).append(", 'height': ").append(l).append("},size:{'width': ").append(k).append(", 'height': ").append(l).append("}});").toString());
            }
            return (new int[] {
                i, j, k, l
            });
        } else
        {
            return null;
        }
    }

    public void close()
    {
        mHandler.sendEmptyMessage(1001);
    }

    protected void closeExpanded()
    {
        this;
        JVM INSTR monitorenter ;
        setOrientationDefault();
        if (parentView != null) goto _L2; else goto _L1
_L1:
        resetContents();
        injectCloseState();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("AmobeeView", (new StringBuilder("closeExpanded: injection: ")).append("window.ormmaview.fireChangeEvent({ state: 'default'});").toString());
        injectJavaScriptRichMedia("window.ormmaview.fireChangeEvent({ state: 'default'});");
        parentView.removeExpndedUrl(this);
        parentView.injectCloseState();
        parentView.resetLayout();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void closeInterstitial()
    {
        if (amobeeInterstitial != null)
        {
            mInterstitialRandom = amobeeInterstitial.getRandom();
            amobeeInterstitial.closeInterstitial();
        }
    }

    protected void closeOpened(View view)
    {
        ((ViewGroup)((Activity)getContext()).getWindow().getDecorView()).removeView(view);
        requestLayout();
    }

    public String configChnges()
    {
        int i;
        int j;
        try
        {
            i = ((Activity)getContext()).getPackageManager().getActivityInfo(((Activity)getContext()).getComponentName(), 128).configChanges;
            j = android.os.Build.VERSION.SDK_INT;
        }
        catch (Exception exception)
        {
            return "exception";
        }
        if (i == 0 || (i & 0x80) == 0 || j >= 13 && (i & 0x400) == 0)
        {
            return "false";
        } else
        {
            return "true";
        }
    }

    public void deregisterProtocol(String s)
    {
        if (s != null)
        {
            registeredProtocols.remove(s.toLowerCase());
        }
    }

    public void destroy()
    {
    }

    public void doExpand(Bundle bundle)
    {
        final String urlExpanded;
        com.amobee.richmedia.controller.OrmmaController.Properties properties;
        com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions;
        String s;
        try
        {
            originalAppOrientation = ((Activity)getContext()).getPackageManager().getActivityInfo(((Activity)getContext()).getComponentName(), 128).screenOrientation;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            originalAppOrientation = ((Activity)getContext()).getRequestedOrientation();
        }
        if (mViewState == ViewState.RESIZED)
        {
            resetContents();
        }
        if (isExpanded)
        {
            return;
        }
        isExpanded = true;
        mViewState = ViewState.EXPANDED;
        dimensions = (com.amobee.richmedia.controller.OrmmaController.Dimensions)bundle.getParcelable("expand_dimensions");
        urlExpanded = bundle.getString("expand_url");
        properties = (com.amobee.richmedia.controller.OrmmaController.Properties)bundle.getParcelable("expand_properties");
        s = bundle.getString("expand_orientation");
        if (URLUtil.isValidUrl(urlExpanded))
        {
            bundle = (ViewGroup)getRootView();
            Log.d("AmobeeView", (new StringBuilder("doExpand url: injection: ")).append("window.ormmaview.fireChangeEvent({ state: 'expanded' });").toString());
            injectJavaScriptRichMedia("window.ormmaview.fireChangeEvent({ state: 'expanded' });");
            final AmobeeView ormmaView = new AmobeeView(getContext());
            ormmaView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ormmaView.content = bundle;
            ormmaView.parentView = this;
            if (properties != null && !properties.useCustomClose)
            {
                ormmaView.useCustomClose = false;
            }
            ormmaView.getSettings().setUseWideViewPort(false);
            ormmaView.setOrientationProperties(s);
            (new Thread(new Runnable() {

                final AmobeeView this$0;
                private final AmobeeView val$ormmaView;
                private final String val$urlExpanded;

                public void run()
                {
                    ormmaView.loadExpandUrl(urlExpanded);
                }

            
            {
                this$0 = AmobeeView.this;
                ormmaView = amobeeview1;
                urlExpanded = s;
                super();
            }
            })).start();
        }
        if (parentView != null || URLUtil.isValidUrl(urlExpanded)) goto _L2; else goto _L1
_L1:
        if (properties != null && (properties.width > -1 || properties.height > -1))
        {
            dimensions.width = (int)((float)properties.width * mDensity);
            dimensions.height = (int)((float)properties.height * mDensity);
        }
        bundle = null;
        urlExpanded = changeContentArea(dimensions);
        bundle = urlExpanded;
_L4:
        if (bundle == null)
        {
            isExpanded = false;
            mViewState = ViewState.DEFAULT;
            return;
        }
        if (properties != null && properties.useBackground)
        {
            bundle.setBackgroundColor(properties.backgroundColor | (int)(properties.backgroundOpacity * 255F) * 0x10000000);
        }
        bundle = (new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'expanded', size: { width: ")).append((int)((float)dimensions.width / mDensity)).append(", ").append("height: ").append((int)((float)dimensions.height / mDensity)).append("}").append(" });").toString();
        Log.d("AmobeeView", (new StringBuilder("doExpand: injection: ")).append(bundle).toString());
        injectJavaScriptRichMedia(bundle);
        isExpanded = true;
        if (properties != null && !properties.useCustomClose)
        {
            useCustomClose = false;
            addCloseButton();
        }
        setOrientationProperties(s);
_L2:
        if (mListener != null)
        {
            mListener.onExpand();
        }
        mViewState = ViewState.EXPANDED;
        requestFocus(130);
        return;
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void dump()
    {
    }

    public void expand(com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions, String s, com.amobee.richmedia.controller.OrmmaController.Properties properties, String s1)
    {
        Message message = mHandler.obtainMessage(1004);
        Bundle bundle = new Bundle();
        bundle.putParcelable("expand_dimensions", dimensions);
        bundle.putString("expand_url", s);
        bundle.putParcelable("expand_properties", properties);
        bundle.putString("expand_orientation", s1);
        message.setData(bundle);
        mHandler.sendMessage(message);
    }

    public ConnectivityManager getConnectivityManager()
    {
        return (ConnectivityManager)getContext().getSystemService("connectivity");
    }

    void getCurrentPosition()
    {
        calculateCurrentPosition(true);
    }

    public int[] getDefaultPosition()
    {
        mStatusBarHeight = AdManager.getStatusBarHeight(getContext());
        FrameLayout framelayout = (FrameLayout)getRootView().findViewById(0x1020002);
        int ai[] = null;
        int ai1[];
        int ai2[];
        int j;
        int i1;
        int l1;
        if (getRootView() != null)
        {
            if (parentView != null && parentView.getRootView() != null)
            {
                ai = (FrameLayout)parentView.getRootView();
            } else
            {
                ai1 = (ViewGroup)getRootView();
                ai = ai1;
                if (getParent() == null)
                {
                    ai = ai1;
                    if (placeHolder != null)
                    {
                        ai = ai1;
                        if (placeHolder.getParent() != null)
                        {
                            ai = (ViewGroup)placeHolder.getRootView();
                        }
                    }
                }
            }
        }
        ai1 = new int[2];
        ai2 = new int[2];
        if (ai != null)
        {
            ai.getLocationInWindow(ai1);
            int i = ai.getWidth();
            int l = ai.getHeight();
            int k1 = mStatusBarHeight;
            ai.getLocationOnScreen(ai2);
            setMaxSize(i, l - k1);
        } else
        if (framelayout != null)
        {
            framelayout.getLocationInWindow(ai1);
            int k = framelayout.getWidth();
            int j1 = framelayout.getHeight();
            int i2 = mStatusBarHeight;
            framelayout.getLocationOnScreen(ai2);
            setMaxSize(k, j1 - i2);
        }
        ai = new int[2];
        if (parentView != null)
        {
            parentView.getLocationInWindow(ai);
        } else
        {
            getLocationInWindow(ai);
        }
        j = ai[1];
        i1 = ai1[1];
        l1 = mStatusBarHeight;
        return (new int[] {
            ai[0] - ai1[0], j - (i1 + l1)
        });
    }

    int getGravity(String s)
    {
        byte byte1 = 53;
        byte byte0;
        if (s.equals("top-left"))
        {
            byte0 = 51;
        } else
        {
            byte0 = byte1;
            if (!s.equals("top-right"))
            {
                if (s.equals("center"))
                {
                    return 17;
                }
                if (s.equals("bottom-left"))
                {
                    return 83;
                }
                if (s.equals("bottom-right"))
                {
                    return 85;
                }
                if (s.equals("top-center"))
                {
                    return 49;
                }
                byte0 = byte1;
                if (s.equals("bottom-center"))
                {
                    return 81;
                }
            }
        }
        return byte0;
    }

    OrmmaPlayer getPlayer()
    {
        if (player != null)
        {
            player.releasePlayer();
        }
        player = new OrmmaPlayer(getContext());
        return player;
    }

    public String getSize()
    {
        return (new StringBuilder("{ width: ")).append((int)((float)getWidth() / mDensity)).append(", ").append("height: ").append((int)((float)getHeight() / mDensity)).append("}").toString();
    }

    public String getState()
    {
        return mViewState.toString().toLowerCase();
    }

    public boolean getUserGestureRequiredToOpenAds()
    {
        return mUserGestureRequiredToOpenAds;
    }

    public boolean getUserTouchedTheView()
    {
        return mUserTouchedTheView;
    }

    public ViewState getViewState()
    {
        return mViewState;
    }

    public void hide()
    {
        mHandler.sendEmptyMessage(1002);
    }

    public void hideMraidInterstitial()
    {
        Log.d("AmobeeView", (new StringBuilder("hideMraidInterstitial: injection: ")).append("window.ormmaview.fireChangeEvent({ state: 'hidden', viewable: false });").toString());
        injectJavaScriptRichMedia("window.ormmaview.fireChangeEvent({ state: 'hidden', viewable: false });");
    }

    public void hideVideo()
    {
        if (mWebChromeClient != null && (mWebChromeClient instanceof AmobeeChromeClient))
        {
            ((AmobeeChromeClient)mWebChromeClient).closeVideo(((AmobeeChromeClient)mWebChromeClient).videoCloseButton, this);
        }
    }

    void injectCloseState()
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ state: 'default', size: { width: ")).append(mDefaultWidth).append(", ").append("height: ").append(mDefaultHeight).append("}").append("});").toString();
        Log.d("AmobeeView", (new StringBuilder("closeExpanded: injection: ")).append(s).toString());
        injectJavaScriptRichMedia(s);
        mViewState = ViewState.DEFAULT;
        mHandler.sendEmptyMessage(1005);
        setVisibility(0);
    }

    public void injectJavaScript(String s)
    {
label0:
        {
            if (getUrl() != null && s != null)
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                super.evaluateJavascript(s, null);
            }
            return;
        }
        super.loadUrl((new StringBuilder("javascript:")).append(s).toString());
    }

    public void injectJavaScriptRichMedia(String s)
    {
        if (!mUtilityController.mraidScriptLoaded)
        {
            return;
        } else
        {
            injectJavaScript((new StringBuilder("if (window.ormmaview && typeof(window.ormmaview) !== 'undefined'){")).append(s).append("}").toString());
            return;
        }
    }

    public boolean isExpanded()
    {
        return mViewState == ViewState.EXPANDED;
    }

    public boolean isPageFinished()
    {
        return bPageFinished;
    }

    boolean isUrlRequiresActionView(String s)
    {
        if (s.startsWith("sms:") || s.startsWith("mailto:") || s.startsWith("market://") || s.contains("play.google.com/store/apps/details?id=") || s.contains("maps.google.com/maps?q"))
        {
            if (mListener != null)
            {
                mListener.onLeavingApplication();
            } else
            if (amobeeInterstitial != null && mViewState == ViewState.INTERSTITIAL)
            {
                amobeeInterstitial.interstitialClicked();
            } else
            if (parentView != null && parentView.mListener != null)
            {
                parentView.mListener.onLeavingApplication();
            }
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent.addFlags(0x10000000);
                getContext().startActivity(intent);
            }
            catch (Exception exception)
            {
                Log.d("OrmmaView", (new StringBuilder("ACTION_VIEW not supported for url: ")).append(s).toString());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void loadExpandUrl(String s)
    {
        if (!URLUtil.isValidUrl(s))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        bPageFinished = false;
        URL url;
        url = new URL(s);
        url.getFile();
        if (!s.startsWith("file:///android_asset/"))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s = s.replace("file:///android_asset/", "");
        s = getContext().getAssets().open(s);
_L2:
        loadInputStream(s);
        return;
        s = url.openStream();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        closeExpandedOnUIThread();
        return;
        s;
        closeExpandedOnUIThread();
    }

    public void loadFile(File file, String s)
    {
        try
        {
            loadInputStream(new FileInputStream(file), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    public void loadString(final String fragment, String s)
    {
        mUserTouchedTheView = false;
        if (android.os.Build.VERSION.SDK_INT == 10)
        {
            clearView();
        }
        if (noCache)
        {
            post(new Runnable() {

                final AmobeeView this$0;
                private final String val$fragment;

                public void run()
                {
                    loadStringDirect(fragment);
                }

            
            {
                this$0 = AmobeeView.this;
                fragment = s;
                super();
            }
            });
            return;
        } else
        {
            post(new Runnable() {

                final AmobeeView this$0;
                private final String val$dataToInject;
                private final ByteArrayInputStream val$is;

                public void run()
                {
                    loadInputStream(is, dataToInject);
                    try
                    {
                        is.close();
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        return;
                    }
                }

            
            {
                this$0 = AmobeeView.this;
                is = bytearrayinputstream;
                dataToInject = s;
                super();
            }
            });
            return;
        }
    }

    public void loadUrl(String s)
    {
        loadUrl(s, false, null);
    }

    public void loadUrl(String s, String s1)
    {
        loadUrl(s, false, s1);
    }

    public void loadUrl(String s, boolean flag, String s1)
    {
        if (!URLUtil.isValidUrl(s))
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        bPageFinished = false;
        Object obj;
        obj = new URL(s);
        ((URL) (obj)).getFile();
        if (!s.startsWith("file:///android_asset/"))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = s.replace("file:///android_asset/", "");
        obj = getContext().getAssets().open(((String) (obj)));
_L2:
        loadInputStream(((InputStream) (obj)), s1);
        return;
        obj = ((URL) (obj)).openStream();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        return;
        s1;
        super.loadUrl(s);
    }

    protected void onAttachedToWindow()
    {
        if (!bGotLayoutParams)
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            mInitLayoutHeight = layoutparams.height;
            mInitLayoutWidth = layoutparams.width;
            bGotLayoutParams = true;
        }
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            mUtilityController.stopAllListeners();
            super.onDetachedFromWindow();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void onGlobalFocusChanged(View view, View view1)
    {
        if (!(view1 instanceof AmobeeView) && (mViewState == ViewState.INTERSTITIAL || mViewState == ViewState.EXPANDED))
        {
            requestFocus();
        }
    }

    public void onGlobalLayout()
    {
        mUtilityController.mDisplayController.getScreenSize();
        if (metrics.heightPixels - getContentViewHeight() > 300)
        {
            bKeyboardOut = true;
        } else
        {
            if (mViewState == ViewState.DEFAULT && bKeyboardOut || mViewState == ViewState.INTERSTITIAL)
            {
                ViewGroup viewgroup = (ViewGroup)getRootView();
                if (viewgroup != null)
                {
                    setMaxSize(viewgroup.getWidth(), viewgroup.getHeight());
                    mUtilityController.mDisplayController.onMaxSizeChanged();
                }
            }
            bKeyboardOut = false;
        }
        mUtilityController.mDisplayController.onOrientationMightBeChanged();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (mWebChromeClient != null && (mWebChromeClient instanceof AmobeeChromeClient) && ((AmobeeChromeClient)mWebChromeClient).videoCloseButton != null)
            {
                ((AmobeeChromeClient)mWebChromeClient).finishVideoPlay();
                return true;
            }
            if (mViewState == ViewState.INTERSTITIAL)
            {
                if (mWebChromeClient instanceof AmobeeChromeClient)
                {
                    ((AmobeeChromeClient)mWebChromeClient).finishVideoPlay();
                }
                closeInterstitial();
                return true;
            }
            if (mViewState == ViewState.EXPANDED)
            {
                closeExpanded();
                return true;
            }
            if (mViewState == ViewState.RESIZED)
            {
                closeResized();
                return true;
            }
        }
        return super.onKeyDown(i, keyevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (!mUpdateJSOrientation && mUtilityController.mDisplayController.rootViewSizeIsUpdate())
        {
            mUpdateJSOrientation = true;
            mUtilityController.mDisplayController.setNewSizeAcoordingToRotation();
            mUtilityController.mDisplayController.updateJsObjectsNewSizeAndOrientation(mUtilityController.mDisplayController.getOrientation());
        }
    }

    public void onSizeChanged()
    {
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != viewWidth || j != viewHeight)
        {
            viewWidth = i;
            viewHeight = j;
            i = metrics.heightPixels;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                display.getSize(point);
                i = point.y;
            }
            getCurrentPosition();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mUserTouchedTheView = true;
        return super.onTouchEvent(motionevent);
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        Log.d("AmobeeView", (new StringBuilder("onVisibilityChanged ")).append(i).toString());
        if (mWebChromeClient != null && (mWebChromeClient instanceof AmobeeChromeClient) && ((AmobeeChromeClient)mWebChromeClient).mVideoView != null && ((AmobeeChromeClient)mWebChromeClient).videoCloseButton != null)
        {
            ((AmobeeChromeClient)mWebChromeClient).finishVideoPlay();
        } else
        {
            if (i == 8)
            {
                hideVideo();
            }
            if (mViewState == ViewState.INTERSTITIAL && i == 8 && android.os.Build.VERSION.SDK_INT >= 11)
            {
                closeInterstitial();
            }
            if (mViewState == ViewState.INTERSTITIAL && amobeeInterstitial != null)
            {
                mInterstitialRandom = amobeeInterstitial.getRandom();
                return;
            }
        }
    }

    public void open(String s, boolean flag, boolean flag1, boolean flag2)
    {
        if (!urlContainsVideo(s)) goto _L2; else goto _L1
_L1:
        if (mListener == null) goto _L4; else goto _L3
_L3:
        mListener.onLeavingApplication();
_L6:
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        intent.setDataAndType(Uri.parse(s), "video/*");
        intent.addFlags(0x10000000);
        getContext().startActivity(intent);
        return;
_L4:
        if (parentView != null && parentView.mListener != null)
        {
            parentView.mListener.onLeavingApplication();
        }
        Exception exception;
        if (true) goto _L6; else goto _L5
_L5:
        if (mListener == null) goto _L8; else goto _L7
_L7:
        mListener.onLeavingApplication();
_L13:
        Intent intent1 = new Intent();
        intent1.setAction("android.intent.action.VIEW");
        intent1.setData(Uri.parse(s));
        intent1.addFlags(0x10000000);
        getContext().startActivity(intent1);
        return;
        s;
        Log.d("AmobeeView", (new StringBuilder("error:")).append(s.getMessage()).toString());
        return;
_L2:
        boolean flag3 = URLUtil.isValidUrl(s);
        if (flag3) goto _L10; else goto _L9
_L9:
        try
        {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(Uri.parse(s));
            intent2.addFlags(0x10000000);
            getContext().startActivity(intent2);
            if (mListener != null)
            {
                mListener.onLeavingApplication();
                return;
            }
        }
        catch (Exception exception1)
        {
            try
            {
                raiseError("Invalid url", "open");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
            continue; /* Loop/switch isn't completed */
        }
        if (parentView != null && parentView.mListener != null)
        {
            parentView.mListener.onLeavingApplication();
            return;
        }
          goto _L11
_L10:
        if (!isUrlRequiresActionView(s))
        {
            Intent intent3 = new Intent(getContext(), com/amobee/richmedia/view/Browser);
            Log.d("OrmmaView", (new StringBuilder("open:")).append(s).toString());
            intent3.putExtra("extra_url", s);
            intent3.putExtra("open_show_back", flag);
            intent3.putExtra("open_show_forward", flag1);
            intent3.putExtra("open_show_refresh", flag2);
            intent3.addFlags(0x10000000);
            getContext().startActivity(intent3);
            if (mListener != null && mViewState != ViewState.EXPANDED && mViewState != ViewState.RESIZED)
            {
                mListener.onOverlay();
                return;
            }
        }
          goto _L11
_L8:
        if (parentView == null || parentView.mListener == null) goto _L13; else goto _L12
_L12:
        parentView.mListener.onLeavingApplication();
          goto _L13
_L11:
        return;
        if (true) goto _L5; else goto _L14
_L14:
    }

    public void openMap(String s, boolean flag)
    {
        Log.d("OrmmaView", (new StringBuilder("Opening Map Url ")).append(s).toString());
        s = OrmmaUtils.convert(s.trim());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.setFlags(0x10000000);
        getContext().startActivity(s);
_L1:
        return;
        if (mapAPIKey == null)
        {
            Log.d("AmobeeView", "Error: no Google Maps API Key provided for embedded map");
            return;
        }
          goto _L1
        s;
    }

    public void playAudio(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, String s1, String s2)
    {
        com.amobee.richmedia.controller.OrmmaController.PlayerProperties playerproperties = new com.amobee.richmedia.controller.OrmmaController.PlayerProperties();
        playerproperties.setProperties(false, flag, flag1, flag3, flag2, s1, s2);
        s1 = new Bundle();
        s1.putString("action", ACTION.PLAY_AUDIO.toString());
        s1.putString("expand_url", s);
        s1.putParcelable("player_properties", playerproperties);
        if (playerproperties.isFullScreen())
        {
            try
            {
                s = new Intent(getContext(), com/amobee/richmedia/view/AmobeeActionHandler);
                s.putExtras(s1);
                s.addFlags(0x10000000);
                getContext().startActivity(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        } else
        {
            s = mHandler.obtainMessage(1008);
            s.setData(s1);
            mHandler.sendMessage(s);
            return;
        }
    }

    public void playAudioImpl(Bundle bundle)
    {
        com.amobee.richmedia.controller.OrmmaController.PlayerProperties playerproperties = (com.amobee.richmedia.controller.OrmmaController.PlayerProperties)bundle.getParcelable("player_properties");
        bundle = bundle.getString("expand_url");
        OrmmaPlayer ormmaplayer = getPlayer();
        ormmaplayer.setPlayData(playerproperties, bundle);
        ormmaplayer.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
        ((ViewGroup)getParent()).addView(ormmaplayer);
        ormmaplayer.playAudio();
    }

    public void playVideo(String s)
    {
        if (!URLUtil.isValidUrl(s))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (urlContainsVideo(s.toString()))
        {
            intent.setDataAndType(Uri.parse(s), "video/*");
        }
        intent.addFlags(0x10000000);
        getContext().startActivity(intent);
        if (mListener != null)
        {
            mListener.onLeavingApplication();
            return;
        }
        try
        {
            if (parentView != null && parentView.mListener != null)
            {
                parentView.mListener.onLeavingApplication();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
    }

    public void playVideo(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions, String s1, 
            String s2)
    {
        Message message;
        message = mHandler.obtainMessage(1007);
        com.amobee.richmedia.controller.OrmmaController.PlayerProperties playerproperties = new com.amobee.richmedia.controller.OrmmaController.PlayerProperties();
        playerproperties.setProperties(flag, flag1, flag2, false, flag3, s1, s2);
        s1 = new Bundle();
        s1.putString("expand_url", s);
        s1.putString("action", ACTION.PLAY_VIDEO.toString());
        s1.putParcelable("player_properties", playerproperties);
        if (dimensions != null)
        {
            s1.putParcelable("expand_dimensions", dimensions);
        }
        if (!playerproperties.isFullScreen())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        s = new Intent(getContext(), com/amobee/richmedia/view/AmobeeActionHandler);
        s.putExtras(s1);
        s.addFlags(0x10000000);
        getContext().startActivity(s);
_L1:
        return;
        if (dimensions != null)
        {
            message.setData(s1);
            mHandler.sendMessage(message);
            return;
        }
          goto _L1
        s;
    }

    public void playVideoImpl(Bundle bundle)
    {
        Object obj = (com.amobee.richmedia.controller.OrmmaController.PlayerProperties)bundle.getParcelable("player_properties");
        com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions = (com.amobee.richmedia.controller.OrmmaController.Dimensions)bundle.getParcelable("expand_dimensions");
        String s = bundle.getString("expand_url");
        bundle = getPlayer();
        bundle.setPlayData(((com.amobee.richmedia.controller.OrmmaController.PlayerProperties) (obj)), s);
        obj = new android.widget.FrameLayout.LayoutParams(dimensions.width, dimensions.height);
        obj.topMargin = dimensions.x;
        obj.leftMargin = dimensions.y;
        bundle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new FrameLayout(getContext());
        ((FrameLayout) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmobeeView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                Log.i("AmobeeView", "background touch called");
                return true;
            }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
        });
        ((FrameLayout) (obj)).setId(BACKGROUND_ID);
        ((FrameLayout) (obj)).setPadding(dimensions.x, dimensions.y, 0, 0);
        ((FrameLayout)getRootView().findViewById(0x1020002)).addView(((View) (obj)), new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) (obj)).addView(bundle);
        setVisibility(4);
        bundle.setListener(new OrmmaPlayerListener() {

            final AmobeeView this$0;

            public void onComplete()
            {
                FrameLayout framelayout = (FrameLayout)getRootView().findViewById(BACKGROUND_ID);
                ((ViewGroup)framelayout.getParent()).removeView(framelayout);
                setVisibility(0);
            }

            public void onError()
            {
                onComplete();
            }

            public void onPrepared()
            {
            }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
        });
        bundle.playVideo();
    }

    public void raiseError(String s, String s1)
    {
        Message message = mHandler.obtainMessage(1009);
        Bundle bundle = new Bundle();
        bundle.putString("message", s);
        bundle.putString("action", s1);
        message.setData(bundle);
        mHandler.sendMessage(message);
    }

    public void raiseOnLeavingApplication()
    {
        if (mListener != null)
        {
            mListener.onLeavingApplication();
        } else
        if (parentView != null && parentView.mListener != null)
        {
            parentView.mListener.onLeavingApplication();
            return;
        }
    }

    public void registerProtocol(String s)
    {
        if (s != null)
        {
            registeredProtocols.add(s.toLowerCase());
        }
    }

    void removeExpndedUrl(AmobeeView amobeeview)
    {
        if (amobeeview.mWebChromeClient instanceof AmobeeChromeClient)
        {
            ((AmobeeChromeClient)mWebChromeClient).finishVideoPlay();
        }
        amobeeview.parentView.hasExpandedView = false;
        amobeeview = (FrameLayout)amobeeview.getParent();
        if (amobeeview != null)
        {
            amobeeview.removeAllViews();
            ViewGroup viewgroup = (ViewGroup)getRootView();
            if (viewgroup != null)
            {
                viewgroup.removeView(amobeeview);
            }
        }
    }

    public void removeListener()
    {
        mListener = null;
    }

    public void resetContents()
    {
        ViewGroup viewgroup;
        if (mWebChromeClient instanceof AmobeeChromeClient)
        {
            ((AmobeeChromeClient)mWebChromeClient).finishVideoPlay();
        }
        viewgroup = (ViewGroup)getRootView();
        FrameLayout framelayout = (FrameLayout)getRootView().findViewById(BACKGROUND_ID);
        this;
        JVM INSTR monitorenter ;
        framelayout.removeAllViews();
        viewgroup.removeView(framelayout);
        if (getParent() != null)
        {
            ((ViewGroup)getParent()).removeView(this);
        }
        resetLayout();
        if (placeHolder != null)
        {
            ViewGroup viewgroup1 = (ViewGroup)placeHolder.getParent();
            android.view.ViewGroup.LayoutParams layoutparams = placeHolder.getLayoutParams();
            if (layoutparams.width != mInitLayoutWidth)
            {
                layoutparams.width = -1;
            }
            viewgroup1.addView(this, mIndex, layoutparams);
            viewgroup1.removeView(placeHolder);
            viewgroup1.invalidate();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            Log.e("AmobeeView", "resetContents");
        }
        return;
    }

    public void resize(int i, int j, String s, int k, int l, boolean flag)
    {
        Message message = mHandler.obtainMessage(1000);
        Bundle bundle = new Bundle();
        bundle.putInt("resize_width", i);
        bundle.putInt("resize_height", j);
        bundle.putString("customClosePosition", s);
        bundle.putInt("offsetX", k);
        bundle.putInt("offsetY", l);
        bundle.putBoolean("allowOffscreen", flag);
        message.setData(bundle);
        mHandler.sendMessage(message);
    }

    public WebBackForwardList restoreState(Bundle bundle)
    {
        mLocalFilePath = bundle.getString("AD_PATH");
        super.loadUrl((new StringBuilder("file://")).append(mLocalFilePath).append(File.separator).append("_ormma_current").toString());
        return null;
    }

    public void restoreState()
    {
        if (mViewState == ViewState.EXPANDED)
        {
            closeExpanded();
        } else
        if (mViewState == ViewState.RESIZED)
        {
            closeResized();
            return;
        }
    }

    public WebBackForwardList saveState(Bundle bundle)
    {
        bundle.putString("AD_PATH", mLocalFilePath);
        return null;
    }

    public void setInitSize()
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        mInitLayoutHeight = layoutparams.height;
        mInitLayoutWidth = layoutparams.width;
        bGotLayoutParams = true;
    }

    public void setListener(OrmmaViewListener ormmaviewlistener)
    {
        mListener = ormmaviewlistener;
    }

    public void setMapAPIKey(String s)
    {
        mapAPIKey = s;
    }

    public void setMaxSize(int i, int j)
    {
        mUtilityController.setMaxSize(i, j);
    }

    public void setOrientationDefault()
    {
        if (mDidChangeOrientation)
        {
            forceOrientation = "none";
            shouldAllowOrientationChange = true;
            ((Activity)getContext()).setRequestedOrientation(originalAppOrientation);
            mDidChangeOrientation = false;
        }
    }

    public void setOrientationProperties(String s)
    {
        s = new JSONObject(s);
        try
        {
            shouldAllowOrientationChange = Boolean.valueOf(s.getString("allowOrientationChange")).booleanValue();
        }
        catch (Exception exception) { }
        try
        {
            forceOrientation = s.getString("forceOrientation");
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        Log.d("OrmmaView", (new StringBuilder("setOrientationProperties: setOrientationProperties")).append(forceOrientation).append("allowOrientationChange").append(shouldAllowOrientationChange).toString());
_L2:
        if (configChnges().equals("false"))
        {
            Log.d("OrmmaView", "setOrientationProperties: abort, configChanges missing");
            return;
        }
        if (configChnges().equals("exception"))
        {
            Log.d("[a\u2022mo\u2022bee]", "setOrientationProperties: abort, not supported on non Acitivy views");
            return;
        }
        if (!shouldAllowOrientationChange)
        {
            mDidChangeOrientation = true;
            if (((Activity)getContext()).getResources().getConfiguration().orientation == 2)
            {
                ((Activity)getContext()).setRequestedOrientation(0);
            } else
            {
                ((Activity)getContext()).setRequestedOrientation(1);
            }
        } else
        {
            ((Activity)getContext()).setRequestedOrientation(-1);
        }
        if (forceOrientation.equals("portrait"))
        {
            mDidChangeOrientation = true;
            ((Activity)getContext()).setRequestedOrientation(1);
            return;
        }
        if (forceOrientation.equals("landscape"))
        {
            mDidChangeOrientation = true;
            ((Activity)getContext()).setRequestedOrientation(0);
            return;
        } else
        {
            ((Activity)getContext()).setRequestedOrientation(-1);
            return;
        }
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setUserGestureRequiredToOpenAds(boolean flag)
    {
        mUserGestureRequiredToOpenAds = flag;
    }

    public void setViewable(boolean flag)
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ viewable: ")).append(flag).append(" });").toString();
        Log.d("AmobeeView", (new StringBuilder("setViewable: injection: ")).append(s).toString());
        injectJavaScriptRichMedia(s);
    }

    public void show()
    {
        mHandler.sendEmptyMessage(1003);
    }

    public void storePicture(final String pictureUrl)
    {
        try
        {
            pictureUrl = new android.content.DialogInterface.OnClickListener() {

                final AmobeeView this$0;
                private final String val$pictureUrl;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    (new downloadPicture()).execute(new String[] {
                        pictureUrl
                    });
                }

            
            {
                this$0 = AmobeeView.this;
                pictureUrl = s;
                super();
            }
            };
            android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

                final AmobeeView this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    raiseError("Store picture canceled by the user.", "storePicture");
                }

            
            {
                this$0 = AmobeeView.this;
                super();
            }
            };
            final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
            builder.setTitle("Store Picture");
            builder.setMessage("Would you like to save the picture to your photo album?");
            builder.setPositiveButton("yes", pictureUrl);
            builder.setNegativeButton("no", onclicklistener);
            post(new Runnable() {

                final AmobeeView this$0;
                private final android.app.AlertDialog.Builder val$builder;

                public void run()
                {
                    builder.show();
                }

            
            {
                this$0 = AmobeeView.this;
                builder = builder1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final String pictureUrl)
        {
            Log.e("AmobeeView", "store picture failed");
        }
    }

    boolean urlContainsVideo(String s)
    {
        s = s.toLowerCase();
        return s.endsWith(".mkv") || s.endsWith(".3gp") || s.endsWith(".webm") || s.endsWith(".ts") || s.endsWith(".mp4");
    }

    public void useCustomClose(boolean flag)
    {
        if (!flag)
        {
            mHandler.sendEmptyMessage(1010);
        }
    }

    static 
    {
        CLOSE_AREA_SIZE = 50;
    }












}
