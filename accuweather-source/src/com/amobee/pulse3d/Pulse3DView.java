// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DViewListener, Pulse3DCache, Pulse3DWebView, Pulse3DGLSurfaceView, 
//            Pulse3DJavaScriptInterface, Utility, Pulse3dBroadcastReceiver, Pulse3DGLRenderer, 
//            FetchTask, Log

public final class Pulse3DView extends FrameLayout
    implements Pulse3DViewListener
{

    private static final String TAG = "Pulse3DView";
    public static Log.DebugLevel debugLevel;
    static boolean useCache = true;
    boolean adSupportsLandscape;
    boolean adSupportsPortrait;
    boolean commandListHasChanged;
    private boolean isPaused;
    Pulse3DJavaScriptInterface jsInterface3D;
    private boolean loadWhenViewIsReady;
    private String mAdkUniqueUserID;
    ImageView mBannerCoverImageView;
    private Context mContext;
    Pulse3DGLSurfaceView mGLView;
    private IntentFilter mIntentFilter;
    RelativeLayout mPlaceHolder;
    Pulse3DViewListener mPulse3DViewListener;
    Pulse3DWebView mPulse3dWebView;
    private Pulse3dBroadcastReceiver mReceiver;
    private boolean mReceiverActive;
    String mURL;
    private String pendingUrl;
    boolean presentAsFullscreen;
    public ArrayList resources;

    public Pulse3DView(Context context)
    {
        super(context);
        mURL = null;
        mAdkUniqueUserID = "OPT_OUT";
        presentAsFullscreen = false;
        adSupportsLandscape = true;
        adSupportsPortrait = true;
        loadWhenViewIsReady = false;
        pendingUrl = null;
        isPaused = false;
        mContext = null;
        mReceiver = null;
        mIntentFilter = null;
        mReceiverActive = false;
        commandListHasChanged = false;
        mContext = context;
        mPulse3DViewListener = this;
        initPulse3dEngine();
    }

    public Pulse3DView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mURL = null;
        mAdkUniqueUserID = "OPT_OUT";
        presentAsFullscreen = false;
        adSupportsLandscape = true;
        adSupportsPortrait = true;
        loadWhenViewIsReady = false;
        pendingUrl = null;
        isPaused = false;
        mContext = null;
        mReceiver = null;
        mIntentFilter = null;
        mReceiverActive = false;
        commandListHasChanged = false;
        mContext = context;
        mPulse3DViewListener = this;
        initPulse3dEngine();
    }

    public static void clearCacheOlderThan(Context context, int i)
    {
        Pulse3DCache.clearCacheOlderThan(context, i);
    }

    private void didMoveOffSceen()
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.loadUrl("javascript:AdKitNative.NativeCallbacks.didMoveOffscreen()");
        }
    }

    private void initPulse3dEngine()
    {
        resources = new ArrayList();
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        mPlaceHolder = new RelativeLayout(getContext());
        mPlaceHolder.setLayoutParams(layoutparams);
        addView(mPlaceHolder);
        mBannerCoverImageView = new ImageView(getContext());
        mBannerCoverImageView.setLayoutParams(layoutparams);
        mBannerCoverImageView.setVisibility(8);
        addView(mBannerCoverImageView);
        mPlaceHolder.setVisibility(4);
        mGLView = new Pulse3DGLSurfaceView(this, getContext());
        mPlaceHolder.addView(mGLView);
        mGLView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        mPulse3dWebView = new Pulse3DWebView(this, getContext());
        mPulse3dWebView.setBackgroundColor(0);
        mPlaceHolder.addView(mPulse3dWebView);
        mPulse3dWebView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        jsInterface3D = new Pulse3DJavaScriptInterface(this, getContext());
        mPulse3dWebView.addJavascriptInterface(jsInterface3D, "JsInterface");
    }

    public static boolean isAdCached(Context context, String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return Pulse3DCache.isAdCached(context, s);
    }

    public Pulse3DWebView GetWebView()
    {
        return mPulse3dWebView;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        Utility.printMemory();
        mURL = null;
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.setWebViewClient(null);
            mPulse3dWebView.setWebChromeClient(null);
            jsInterface3D.suspend(true);
            mPulse3dWebView.removeJavascriptInterface("JsInterface");
            mPlaceHolder.removeView(mPulse3dWebView);
            mReceiver.SetWebView(null);
            mPulse3dWebView.destroy();
            mPulse3dWebView = null;
        }
        if (mGLView != null)
        {
            mPlaceHolder.removeView(mGLView);
            if (mGLView.renderer != null)
            {
                mGLView.renderer.ready = false;
                mGLView.renderer.ClearAllDisplayLists();
                mGLView.renderer = null;
            }
            mGLView.mPulse3DView = null;
            if (jsInterface3D != null)
            {
                jsInterface3D.clearAllResources();
                jsInterface3D = null;
            }
            mGLView = null;
        }
        removeAllViews();
        System.gc();
        Utility.printMemory();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void clearCache()
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.clearCache(true);
        }
    }

    public boolean commandListHasChanged()
    {
        return commandListHasChanged;
    }

    public void forceBannerState()
    {
        if (mPulse3dWebView != null && mPulse3dWebView.isExpanded && !mPulse3dWebView.inTransition)
        {
            mPulse3dWebView.toggleBanner();
        }
    }

    public String getAdkUniqueUserId()
    {
        return mAdkUniqueUserID;
    }

    public String getURL()
    {
        return mURL;
    }

    public void loadSceneAtURL(String s)
    {
        loadSceneAtURL(s, true);
    }

    public void loadSceneAtURL(String s, boolean flag)
    {
        if (s.startsWith("javascript:"))
        {
            mPulse3dWebView.loadUrl(s);
            return;
        }
        if (getWindowVisibility() == 8)
        {
            pendingUrl = s;
            loadWhenViewIsReady = true;
            isPaused = true;
            return;
        }
        if (mURL != null)
        {
            clear();
            initPulse3dEngine();
        }
        useCache = flag;
        if (!flag)
        {
            mPulse3dWebView.getSettings().setCacheMode(2);
        }
        mURL = s;
        (new FetchTask(s) {

            final Pulse3DView this$0;
            final String val$URL;

            public void callBack(Object obj)
            {
                if (obj == null)
                {
                    if (mPulse3DViewListener != null)
                    {
                        mPulse3DViewListener.onFailLoadingSceneAtURL(Pulse3DView.this, URL, new Error("onFailLoadingSceneAtURL"));
                    }
                    Log.e("Pulse3DView", "failed to loadSceneAtURL (no connection or 404/500)");
                } else
                {
                    obj = ((String)obj).replace("\"__ADJITSU_JS_INITIALIZATION__\"", "var __adjitsuRuntime = { version: \"2.1\", platform: \"android\" }");
                    Uri uri;
                    try
                    {
                        uri = Uri.parse(mURL);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                    Log.d("Pulse3DView", (new StringBuilder()).append("3d ad html: ").append(((String) (obj))).toString());
                    if (mPulse3dWebView != null)
                    {
                        mPulse3dWebView.isLoadingNewUrl = true;
                        mPulse3dWebView.loadDataWithBaseURL(mURL, ((String) (obj)), "text/html", "UTF-8", uri.getHost());
                        return;
                    }
                }
            }

            public void prepare(Object obj)
            {
            }

            
            {
                this$0 = Pulse3DView.this;
                URL = s;
                super(final_context);
            }
        }).execute(new Object[] {
            s, java/lang/String
        });
    }

    public void loadSceneAtURL(String s, boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            loadSceneAtURL(s, flag);
            return;
        }
        if (getWindowVisibility() == 8 && getParent() != null)
        {
            pendingUrl = s;
            loadWhenViewIsReady = true;
            isPaused = true;
            presentAsFullscreen = true;
            return;
        }
        setVisibility(4);
        if (mURL != null)
        {
            if (getParent() != null)
            {
                ((ViewGroup)getParent()).removeView(this);
            }
            initPulse3dEngine();
            mURL = null;
        }
        presentAsFullscreen = true;
        removeView(mBannerCoverImageView);
        mBannerCoverImageView = null;
        if (getParent() == null)
        {
            ViewGroup viewgroup = (ViewGroup)((ViewGroup)((Activity)getContext()).getWindow().getDecorView().findViewById(0x1020002)).getRootView();
            int i = Utility.getStatusBarHeight(getContext());
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutparams.setMargins(0, i, 0, 0);
            viewgroup.addView(this, layoutparams);
        }
        loadSceneAtURL(s, flag);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mReceiver = new Pulse3dBroadcastReceiver(null);
        mIntentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        mIntentFilter.addAction("android.intent.action.SCREEN_ON");
        registerBroadcastReceiver();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onDetachedFromWindow()
    {
        Log.d("Pulse3DView", "detached, renderer terminated. please reload the ad");
        unregisterBroadcastReceiver();
        clear();
        super.onDetachedFromWindow();
    }

    public void onEndTransition(Pulse3DView pulse3dview, boolean flag)
    {
    }

    public void onFailLoadingSceneAtURL(Pulse3DView pulse3dview, String s, Error error)
    {
    }

    public void onFinishLoadingSceneAtURL(Pulse3DView pulse3dview, String s)
    {
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        Log.d("Pulse3DView", (new StringBuilder()).append("onKeyDown ").append(i).append(", ").append(keyevent).toString());
        return super.onKeyDown(i, keyevent);
    }

    public void onLeavingApplication(Pulse3DView pulse3dview)
    {
    }

    public void onPause()
    {
        mPulse3dWebView.onPause();
        unregisterBroadcastReceiver();
    }

    public void onResume()
    {
        mPulse3dWebView.onResume();
        registerBroadcastReceiver();
    }

    public void onStartTransition(Pulse3DView pulse3dview, boolean flag)
    {
    }

    protected void onWindowVisibilityChanged(int i)
    {
        this;
        JVM INSTR monitorenter ;
        super.onWindowVisibilityChanged(i);
        Log.d("Pulse3DView", (new StringBuilder()).append("onWindowVisibilityChanged: ").append(i).toString());
        if (i != 8) goto _L2; else goto _L1
_L1:
        if (mURL == null) goto _L2; else goto _L3
_L3:
        if (mPulse3dWebView != null)
        {
            isPaused = true;
            didMoveOffSceen();
            mPulse3dWebView.onPause();
            mPulse3dWebView.inTransition = false;
            Log.d("Pulse3DView", (new StringBuilder()).append("Pause all rendering... thread: ").append(Thread.currentThread().getName()).toString());
        }
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!isPaused) goto _L5; else goto _L4
_L4:
        isPaused = false;
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.onResume();
        }
        Log.d("Pulse3DView", "Resumed all rendering...");
        if (!loadWhenViewIsReady || pendingUrl == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        Log.d("Pulse3DView", " ------------------ ReadyToLoad!!");
        loadWhenViewIsReady = false;
        loadSceneAtURL(pendingUrl, useCache, presentAsFullscreen);
        pendingUrl = null;
          goto _L5
        Exception exception;
        exception;
        throw exception;
        willMoveOnScreen();
          goto _L5
    }

    public void presentFullScreen()
    {
        if (mPulse3dWebView == null)
        {
            Log.d("Pulse3DView", "The View was already dismissed and cannot be reused.");
            return;
        }
        if (!mGLView.renderer.ready)
        {
            Log.d("Pulse3DView", "Ad not ready for display yet");
            return;
        } else
        {
            post(new Runnable() {

                final Pulse3DView this$0;

                public void run()
                {
                    if (!presentAsFullscreen)
                    {
                        mPulse3dWebView.toggleBanner();
                        return;
                    } else
                    {
                        mPulse3dWebView.presentFullScreen();
                        return;
                    }
                }

            
            {
                this$0 = Pulse3DView.this;
                super();
            }
            });
            return;
        }
    }

    void registerBroadcastReceiver()
    {
        try
        {
            if (!mReceiverActive && mReceiver != null)
            {
                mReceiverActive = true;
                mContext.registerReceiver(mReceiver, mIntentFilter);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void registerImpressionAgain()
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.injectJS("AdKitNative.NativeCallbacks.registerImpressionAgain()");
        }
    }

    public void reportError(int i, String s)
    {
        if (jsInterface3D != null)
        {
            jsInterface3D.reportBackToJS(i, false, s);
        }
    }

    public void reportSuccess(int i, String s)
    {
        if (jsInterface3D != null)
        {
            jsInterface3D.reportBackToJS(i, true, s);
        }
    }

    public void setAdkUniqueUserId(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "OPT_OUT";
        }
        mAdkUniqueUserID = s1;
    }

    public void setCommandListHasChanged(boolean flag)
    {
        commandListHasChanged = flag;
    }

    public void setOnKeyListener(android.view.View.OnKeyListener onkeylistener)
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.setOnKeyListener(onkeylistener);
        }
    }

    public void setPulse3DViewListener(Pulse3DViewListener pulse3dviewlistener)
    {
        if (pulse3dviewlistener == null)
        {
            mPulse3DViewListener = this;
            return;
        } else
        {
            mPulse3DViewListener = pulse3dviewlistener;
            return;
        }
    }

    public void setWebViewLayerType(int i)
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.setLayerType(i, null);
        }
    }

    void unregisterBroadcastReceiver()
    {
        try
        {
            if (mReceiverActive && mReceiver != null)
            {
                mContext.unregisterReceiver(mReceiver);
                mReceiverActive = false;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean webLinkOutRequested(String s, boolean flag)
    {
        return false;
    }

    public void willMoveOnScreen()
    {
        if (mPulse3dWebView != null)
        {
            mPulse3dWebView.loadUrl("javascript:AdKitNative.NativeCallbacks.willMoveOnscreen()");
        }
    }

    static 
    {
        debugLevel = Log.DebugLevel.NODEBUG;
    }
}
