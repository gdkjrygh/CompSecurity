// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.reflect.Method;

// Referenced classes of package com.amobee.pulse3d:
//            Utility, Pulse3DView, Pulse3DViewListener, Log, 
//            Pulse3DGLRenderer, Pulse3DGLSurfaceView

class Pulse3DWebView extends WebView
{
    private class Amobee3DWebViewClient extends WebViewClient
    {

        final Pulse3DWebView this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            while (s.equals("about:blank") || !isLoadingNewUrl) 
            {
                return;
            }
            isLoadingNewUrl = false;
            initEngine();
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            Log.d("Amobee3DWebView", (new StringBuilder()).append("error #").append(i).append(" ").append(s).append(", url: ").append(s1).toString());
            super.onReceivedError(webview, i, s, s1);
        }

        private Amobee3DWebViewClient()
        {
            this$0 = Pulse3DWebView.this;
            super();
        }

    }

    private class AmobeeWebChromeClient extends WebChromeClient
    {

        android.webkit.WebChromeClient.CustomViewCallback mCallback;
        FrameLayout mVideoLayout;
        final Pulse3DWebView this$0;

        public void closeVideo()
        {
            setEnabled(true);
            setClickable(true);
            setLongClickable(true);
            requestFocus();
            fullScreenVideoLayoutIsShowing = false;
            if (mCallback != null)
            {
                mCallback.onCustomViewHidden();
                mCallback = null;
            }
            if (mPulse3DView != null && mPulse3DView.mGLView != null)
            {
                mPulse3DView.mGLView.setVisibility(0);
            }
            if (mVideoLayout != null)
            {
                ((ViewGroup)mVideoLayout.getParent()).removeView(mVideoLayout);
                mVideoLayout = null;
            }
            mPulse3DView.mGLView.renderer.ready = true;
        }

        public boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            if (Pulse3DView.debugLevel == Log.DebugLevel.DEBUG)
            {
                if (consolemessage == null);
            }
            return true;
        }

        public void onHideCustomView()
        {
            closeVideo();
            super.onHideCustomView();
        }

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
            Log.d("Pulse3DWebView", (new StringBuilder()).append("Javascript alert: ").append(s1).toString());
            return super.onJsAlert(webview, s, s1, jsresult);
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            while (mVideoLayout != null && mVideoLayout.getVisibility() == 0 || !(view instanceof FrameLayout) || mCallback != null) 
            {
                return;
            }
            view.setVisibility(4);
            fullScreenVideoLayoutIsShowing = true;
            mCallback = customviewcallback;
            if (mVideoLayout == null)
            {
                mVideoLayout = new FrameLayout(mContext);
            }
            mVideoLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            mVideoLayout.setBackgroundColor(0);
            mVideoLayout.setVisibility(0);
            mVideoLayout.addView(view);
            Object obj = new android.view.View.OnKeyListener() {

                final AmobeeWebChromeClient this$1;

                public boolean onKey(View view, int i, KeyEvent keyevent)
                {
                    if (i == 4)
                    {
                        closeVideo();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$1 = AmobeeWebChromeClient.this;
                super();
            }
            };
            view.setOnKeyListener(((android.view.View.OnKeyListener) (obj)));
            mVideoLayout.setOnKeyListener(((android.view.View.OnKeyListener) (obj)));
            if (((ViewGroup)view).getChildCount() > 0)
            {
                ((ViewGroup)view).getChildAt(0).setOnKeyListener(((android.view.View.OnKeyListener) (obj)));
            }
            mPulse3DView.mGLView.renderer.ready = false;
            if (mVideoLayout.getParent() == null)
            {
                ((ViewGroup)getRootView()).addView(mVideoLayout);
            }
            mVideoLayout.setOnTouchListener(view. new android.view.View.OnTouchListener() {

                final AmobeeWebChromeClient this$1;
                final View val$view;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    this;
                    JVM INSTR monitorenter ;
                    if (motionevent.getY() >= 250F || mVideoLayout == null) goto _L2; else goto _L1
_L1:
                    closeVideo();
_L4:
                    this;
                    JVM INSTR monitorexit ;
                    return true;
_L2:
                    view.onTouchEvent(motionevent);
                    if (true) goto _L4; else goto _L3
_L3:
                    view1;
                    throw view1;
                }

            
            {
                this$1 = final_amobeewebchromeclient;
                view = View.this;
                super();
            }
            });
            obj = ObjectAnimator.ofObject(mVideoLayout, "backgroundColor", new ArgbEvaluator(), new Object[] {
                Integer.valueOf(0), Integer.valueOf(0xff000000)
            });
            ((ObjectAnimator) (obj)).addListener(view. new android.animation.Animator.AnimatorListener() {

                final AmobeeWebChromeClient this$1;
                final View val$view;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    mPulse3DView.mGLView.setVisibility(4);
                    view.setVisibility(0);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$1 = final_amobeewebchromeclient;
                view = View.this;
                super();
            }
            });
            ((ObjectAnimator) (obj)).setDuration(400L);
            ((ObjectAnimator) (obj)).start();
            setEnabled(false);
            setClickable(false);
            setLongClickable(false);
            super.onShowCustomView(view, customviewcallback);
        }

        private AmobeeWebChromeClient()
        {
            this$0 = Pulse3DWebView.this;
            super();
            mCallback = null;
            mVideoLayout = null;
        }

    }


    static final String TAG = "Pulse3DWebView";
    int appRequestedOrientation;
    private boolean didSetOrientation;
    boolean fullScreenVideoLayoutIsShowing;
    private boolean ignoreGlobalLayout;
    boolean inTransition;
    boolean isExpanded;
    boolean isLoadingNewUrl;
    int lastCommandSerial;
    private AmobeeWebChromeClient mAmobeeWebChromeClient;
    Context mContext;
    FrameLayout mFullScreenHolder;
    android.widget.FrameLayout.LayoutParams mFullScreenLayoutParams;
    ViewGroup mPlaceholder;
    Pulse3DView mPulse3DView;
    int mStatusBarHeight;
    LayoutTransition restoreLayoutTransition;

    public Pulse3DWebView(Pulse3DView pulse3dview, Context context)
    {
        super(context);
        mContext = null;
        isExpanded = false;
        lastCommandSerial = 0;
        mFullScreenHolder = null;
        inTransition = false;
        ignoreGlobalLayout = false;
        restoreLayoutTransition = null;
        mStatusBarHeight = 0;
        didSetOrientation = false;
        fullScreenVideoLayoutIsShowing = false;
        mAmobeeWebChromeClient = null;
        isLoadingNewUrl = false;
        mContext = context;
        mFullScreenLayoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        mStatusBarHeight = Utility.getStatusBarHeight(mContext);
        mFullScreenLayoutParams.setMargins(0, mStatusBarHeight, 0, 0);
        mPulse3DView = pulse3dview;
        updateWebSettings();
        setWebViewClient(new Amobee3DWebViewClient());
        mAmobeeWebChromeClient = new AmobeeWebChromeClient();
        setWebChromeClient(mAmobeeWebChromeClient);
        mFullScreenHolder = new FrameLayout(context);
        addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final Pulse3DWebView this$0;

            public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                onGlobalLayout();
            }

            
            {
                this$0 = Pulse3DWebView.this;
                super();
            }
        });
    }

    static Bitmap loadBitmapFromView(Pulse3DWebView pulse3dwebview, Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(pulse3dwebview.getWidth(), pulse3dwebview.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        pulse3dwebview.onDraw(canvas);
        pulse3dwebview = new Paint();
        pulse3dwebview.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_ATOP));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, pulse3dwebview);
        return bitmap1;
    }

    void clearViews()
    {
        isExpanded = false;
        inTransition = false;
        ViewGroup viewgroup;
        if (mFullScreenHolder != null)
        {
            if ((viewgroup = (ViewGroup)mFullScreenHolder.getParent()) != null)
            {
                viewgroup.removeView(mFullScreenHolder);
                return;
            }
        }
    }

    void closeFullScreen()
    {
        this;
        JVM INSTR monitorenter ;
        inTransition = true;
        final ViewGroup v = (ViewGroup)mPulse3DView.getParent();
        int i = Utility.getStatusBarHeight(getContext());
        int j = v.getHeight();
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onStartTransition(mPulse3DView, false);
        }
        LayoutTransition layouttransition = new LayoutTransition();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "translationY", new float[] {
            0.0F, (float)(j - i)
        });
        objectanimator.addListener(new android.animation.Animator.AnimatorListener() {

            final Pulse3DWebView this$0;
            final ViewGroup val$v;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
                mPulse3DView.post(new Runnable() {

                    final _cls7 this$1;

                    public void run()
                    {
                        v.setLayoutTransition(restoreLayoutTransition);
                        restoreLayoutTransition = null;
                        if (didSetOrientation)
                        {
                            didSetOrientation = false;
                            ((Activity)mContext).setRequestedOrientation(appRequestedOrientation);
                        }
                        if (mPulse3DView.mPulse3DViewListener != null)
                        {
                            mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
                        }
                        if (mPulse3DView.getParent() != null)
                        {
                            ((ViewGroup)mPulse3DView.getParent()).removeView(mPulse3DView);
                        }
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                });
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = Pulse3DWebView.this;
                v = viewgroup;
                super();
            }
        });
        layouttransition.setAnimator(3, objectanimator);
        layouttransition.setDuration(3, 400L);
        layouttransition.setStartDelay(3, 0L);
        restoreLayoutTransition = v.getLayoutTransition();
        v.setLayoutTransition(layouttransition);
        v.post(new Runnable() {

            final Pulse3DWebView this$0;

            public void run()
            {
                isExpanded = false;
                inTransition = false;
                mPulse3DView.setVisibility(4);
            }

            
            {
                this$0 = Pulse3DWebView.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void collapseBanner()
    {
        this;
        JVM INSTR monitorenter ;
        if (mPulse3DView.presentAsFullscreen || mPlaceholder.getParent() != mPulse3DView) goto _L2; else goto _L1
_L1:
        Log.d("Pulse3DWebView", "Not in expanded state, return");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ignoreGlobalLayout = true;
        inTransition = true;
        ViewGroup viewgroup = (ViewGroup)getRootView();
        mFullScreenHolder.setLayoutParams(mFullScreenLayoutParams);
        final int rootWidth = viewgroup.getWidth();
        int i = viewgroup.getHeight();
        int j = mStatusBarHeight;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onStartTransition(mPulse3DView, false);
        }
        int k = (int)((float)mPulse3DView.getWidth() / Pulse3DGLRenderer.content_scale);
        int l = (int)((float)mPulse3DView.getHeight() / Pulse3DGLRenderer.content_scale);
        mPulse3DView.mGLView.queueEvent(new Runnable() {

            final Pulse3DWebView this$0;
            final int val$bannerheight;
            final int val$bannerwidth;
            final Pulse3DWebView val$p3dwv;
            final int val$rootHeight;
            final int val$rootWidth;
            final ViewGroup val$v;

            public void run()
            {
                Bitmap bitmap = Utility.createBitmapFromGLSurface(0, 0, rootWidth, rootHeight);
                mPlaceholder.post(bitmap. new Runnable() {

                    final _cls2 this$1;
                    final Bitmap val$glSurfaceCapture;

                    public void run()
                    {
                        if (glSurfaceCapture != null)
                        {
                            Object obj = Pulse3DWebView.loadBitmapFromView(p3dwv, glSurfaceCapture);
                            glSurfaceCapture.recycle();
                            obj = new BitmapDrawable(((Bitmap) (obj)));
                            if (android.os.Build.VERSION.SDK_INT >= 16)
                            {
                                mFullScreenHolder.setBackground(((android.graphics.drawable.Drawable) (obj)));
                            } else
                            {
                                mFullScreenHolder.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                            }
                        }
                        mPlaceholder.setVisibility(4);
                        injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(false, 0.0, ").append(bannerwidth).append(", ").append(bannerheight).append(")").toString());
                        injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
                        obj = new TranslateAnimation(0.0F, 0.0F, 0.0F, rootHeight);
                        ((Animation) (obj)).setDuration(700L);
                        ((Animation) (obj)).setRepeatMode(1);
                        ((Animation) (obj)).setRepeatCount(0);
                        ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                            final _cls1 this$2;

                            public void onAnimationEnd(Animation animation)
                            {
                                v.removeView(mFullScreenHolder);
                                mPlaceholder.setVisibility(0);
                                if (android.os.Build.VERSION.SDK_INT >= 16)
                                {
                                    mFullScreenHolder.setBackground(null);
                                } else
                                {
                                    mFullScreenHolder.setBackgroundDrawable(null);
                                }
                                ignoreGlobalLayout = false;
                                inTransition = false;
                                isExpanded = false;
                                if (mPulse3DView.mPulse3DViewListener != null)
                                {
                                    mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
                                }
                            }

                            public void onAnimationRepeat(Animation animation)
                            {
                            }

                            public void onAnimationStart(Animation animation)
                            {
                                mFullScreenHolder.removeView(mPlaceholder);
                                if (mPlaceholder.getParent() == null)
                                {
                                    mPulse3DView.addView(mPlaceholder);
                                }
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        mFullScreenHolder.startAnimation(((Animation) (obj)));
                    }

            
            {
                this$1 = final__pcls2;
                glSurfaceCapture = Bitmap.this;
                super();
            }
                });
            }

            
            {
                this$0 = Pulse3DWebView.this;
                rootWidth = i;
                rootHeight = j;
                p3dwv = pulse3dwebview1;
                bannerwidth = k;
                bannerheight = l;
                v = viewgroup;
                super();
            }
        });
        if (didSetOrientation)
        {
            didSetOrientation = false;
            ((Activity)mContext).setRequestedOrientation(appRequestedOrientation);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void collapseBannerLite()
    {
        this;
        JVM INSTR monitorenter ;
        if (mPulse3DView.presentAsFullscreen || mPlaceholder.getParent() != mPulse3DView) goto _L2; else goto _L1
_L1:
        Log.d("Pulse3DWebView", "Not in expanded state, return");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        final Object v;
        inTransition = true;
        ignoreGlobalLayout = true;
        int i = (int)((float)mPulse3DView.getWidth() / Pulse3DGLRenderer.content_scale);
        int k = (int)((float)mPulse3DView.getHeight() / Pulse3DGLRenderer.content_scale);
        injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(false, 0.0, ").append(i).append(", ").append(k).append(")").toString());
        v = (ViewGroup)mFullScreenHolder.getParent();
        if (v != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        Log.d("Pulse3DWebView", "fatal error: holder not on view hirarchy");
        isExpanded = false;
        inTransition = false;
          goto _L3
        v;
        throw v;
        int j = ((ViewGroup) (v)).getHeight();
        int l = mStatusBarHeight;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onStartTransition(mPulse3DView, false);
        }
        LayoutTransition layouttransition = new LayoutTransition();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "translationY", new float[] {
            0.0F, (float)(j - l)
        });
        objectanimator.addListener(new android.animation.Animator.AnimatorListener() {

            final Pulse3DWebView this$0;
            final ViewGroup val$v;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                mFullScreenHolder.removeAllViews();
                if (mPlaceholder.getParent() == null)
                {
                    mPulse3DView.addView(mPlaceholder, 0);
                }
                injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
                v.postDelayed(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        if (mFullScreenHolder.getParent() != null)
                        {
                            ((ViewGroup)mFullScreenHolder.getParent()).removeView(mFullScreenHolder);
                        }
                        if (mPulse3DView != null && mPulse3DView.mBannerCoverImageView != null)
                        {
                            mPulse3DView.mBannerCoverImageView.setVisibility(4);
                        }
                        ignoreGlobalLayout = false;
                        inTransition = false;
                        isExpanded = false;
                        if (didSetOrientation)
                        {
                            didSetOrientation = false;
                            ((Activity)mContext).setRequestedOrientation(appRequestedOrientation);
                        }
                        v.setLayoutTransition(restoreLayoutTransition);
                        restoreLayoutTransition = null;
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, 1000L);
                if (mPulse3DView.mPulse3DViewListener != null)
                {
                    mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
                }
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = Pulse3DWebView.this;
                v = viewgroup;
                super();
            }
        });
        layouttransition.setAnimator(3, objectanimator);
        layouttransition.setDuration(3, 400L);
        layouttransition.setStartDelay(3, 0L);
        restoreLayoutTransition = ((ViewGroup) (v)).getLayoutTransition();
        ((ViewGroup) (v)).setLayoutTransition(layouttransition);
        ((ViewGroup) (v)).post(new Runnable() {

            final Pulse3DWebView this$0;

            public void run()
            {
                try
                {
                    ((ViewGroup)mFullScreenHolder.getParent()).removeView(mFullScreenHolder);
                    return;
                }
                catch (Exception exception)
                {
                    return;
                }
            }

            
            {
                this$0 = Pulse3DWebView.this;
                super();
            }
        });
          goto _L3
    }

    void expandBanner()
    {
        this;
        JVM INSTR monitorenter ;
        if (mPlaceholder.getParent() == mPulse3DView) goto _L2; else goto _L1
_L1:
        Log.e("Pulse3DWebView", "not on banner state, return");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        final ViewGroup v;
        final int _rootHeight;
        final int fullWidth;
        inTransition = true;
        ignoreGlobalLayout = true;
        appRequestedOrientation = ((Activity)mContext).getRequestedOrientation();
        v = (ViewGroup)getRootView();
        Log.d("Pulse3DWebView", (new StringBuilder()).append("expandBanner, viewTop: ").append(v.getTop()).toString());
        mFullScreenHolder = new FrameLayout(getContext());
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.setMargins(0, mStatusBarHeight, 0, 0);
        mFullScreenHolder.setLayoutParams(layoutparams);
        _rootHeight = v.getWidth();
        fullWidth = v.getHeight();
        if (!mPulse3DView.adSupportsPortrait || mPulse3DView.adSupportsLandscape)
        {
            break; /* Loop/switch isn't completed */
        }
        final int _rootWidth;
        final int fullHeight;
        fullHeight = fullWidth;
        _rootWidth = _rootHeight;
        if (_rootHeight > fullWidth)
        {
            _rootWidth = fullWidth;
            fullHeight = _rootHeight;
        }
        didSetOrientation = true;
        ((Activity)mContext).setRequestedOrientation(1);
_L6:
        _rootHeight = fullHeight - mStatusBarHeight;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onStartTransition(mPulse3DView, true);
        }
        fullWidth = (int)((float)_rootWidth / Pulse3DGLRenderer.content_scale);
        fullHeight = (int)((float)_rootHeight / Pulse3DGLRenderer.content_scale);
        final int bgHeight = mPulse3DView.getHeight();
        final int bgWidth = mPulse3DView.getWidth();
        mPulse3DView.mGLView.queueEvent(new Runnable() {

            final Pulse3DWebView this$0;
            final int val$_rootHeight;
            final int val$_rootWidth;
            final int val$bgHeight;
            final int val$bgWidth;
            final int val$fullHeight;
            final int val$fullWidth;
            final Pulse3DWebView val$p3dwv;
            final ViewGroup val$v;

            public void run()
            {
                Bitmap bitmap = Utility.createBitmapFromGLSurface(0, 0, bgWidth, bgHeight);
                mPlaceholder.post(bitmap. new Runnable() {

                    final _cls5 this$1;
                    final Bitmap val$glSurfaceCapture;

                    public void run()
                    {
                        if (glSurfaceCapture != null)
                        {
                            Bitmap bitmap = Pulse3DWebView.loadBitmapFromView(p3dwv, glSurfaceCapture);
                            glSurfaceCapture.recycle();
                            mPulse3DView.mBannerCoverImageView.setImageBitmap(bitmap);
                            mPulse3DView.mBannerCoverImageView.setVisibility(0);
                            mPulse3DView.mBannerCoverImageView.bringToFront();
                        }
                        mPulse3DView.removeView(mPlaceholder);
                        if (mPlaceholder.getParent() == null)
                        {
                            mFullScreenHolder.addView(mPlaceholder);
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 11)
                        {
                            LayoutTransition layouttransition = new LayoutTransition();
                            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "translationY", new float[] {
                                (float)_rootHeight, 0.0F
                            });
                            objectanimator.addListener(new android.animation.Animator.AnimatorListener() {

                                final _cls1 this$2;

                                public void onAnimationCancel(Animator animator)
                                {
                                }

                                public void onAnimationEnd(Animator animator)
                                {
                                    while (mPulse3DView == null || mPulse3DView.mPulse3dWebView == null) 
                                    {
                                        return;
                                    }
                                    injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
                                    mPulse3DView.mPulse3dWebView.requestFocus(130);
                                    inTransition = false;
                                    if (mPulse3DView.mPulse3DViewListener != null)
                                    {
                                        mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
                                    }
                                    isExpanded = true;
                                    v.postDelayed(new Runnable() {

                                        final _cls1 this$3;

                                        public void run()
                                        {
                                            ignoreGlobalLayout = false;
                                            v.setLayoutTransition(restoreLayoutTransition);
                                            restoreLayoutTransition = null;
                                        }

            
            {
                this$3 = _cls1.this;
                super();
            }
                                    }, 500L);
                                }

                                public void onAnimationRepeat(Animator animator)
                                {
                                }

                                public void onAnimationStart(Animator animator)
                                {
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            });
                            layouttransition.setAnimator(2, objectanimator);
                            layouttransition.setDuration(2, 400L);
                            layouttransition.setStartDelay(2, 800L);
                            restoreLayoutTransition = v.getLayoutTransition();
                            v.setLayoutTransition(layouttransition);
                            injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(true, 0.5, ").append(fullWidth).append(", ").append(fullHeight).append(")").toString());
                            Log.d("Pulse3DWebView", (new StringBuilder()).append("22 willStartTransition: w ").append(fullWidth).append(" h").append(fullHeight).append(" scale:").append(Pulse3DGLRenderer.content_scale).append(" rootWidth").append(_rootWidth).append(" rootHeight").append(_rootHeight).toString());
                            if (mFullScreenHolder.getParent() == null)
                            {
                                v.addView(mFullScreenHolder);
                            }
                            return;
                        }
                        mPlaceholder.setVisibility(0);
                        injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(true, 0.5, ").append(fullWidth).append(", ").append(fullHeight).append(")").toString());
                        Log.d("Pulse3DWebView", (new StringBuilder()).append("33 willStartTransition: w ").append(fullWidth).append(" h").append(fullHeight).toString());
                        v.addView(mFullScreenHolder);
                        injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
                        inTransition = false;
                        if (mPulse3DView.mPulse3DViewListener != null)
                        {
                            mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
                        }
                        isExpanded = true;
                    }

            
            {
                this$1 = final__pcls5;
                glSurfaceCapture = Bitmap.this;
                super();
            }
                });
            }

            
            {
                this$0 = Pulse3DWebView.this;
                bgWidth = i;
                bgHeight = j;
                p3dwv = pulse3dwebview1;
                _rootHeight = k;
                v = viewgroup;
                fullWidth = l;
                fullHeight = i1;
                _rootWidth = j1;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        fullHeight = fullWidth;
        _rootWidth = _rootHeight;
        if (mPulse3DView.adSupportsPortrait) goto _L6; else goto _L5
_L5:
        fullHeight = fullWidth;
        _rootWidth = _rootHeight;
        if (!mPulse3DView.adSupportsLandscape) goto _L6; else goto _L7
_L7:
        fullHeight = fullWidth;
        _rootWidth = _rootHeight;
        if (fullWidth > _rootHeight)
        {
            _rootWidth = fullWidth;
            fullHeight = _rootHeight;
        }
        didSetOrientation = true;
        ((Activity)mContext).setRequestedOrientation(0);
          goto _L6
    }

    public String getApplicationPackage()
    {
        return mContext.getApplicationContext().getPackageName();
    }

    public String getRawResolution()
    {
        Display display;
        int j;
        int k;
        boolean flag;
        display = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
        k = 0;
        j = 0;
        flag = false;
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L2; else goto _L1
_L1:
        int i = k;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        i = k;
        display.getRealMetrics(displaymetrics);
        i = k;
        j = displaymetrics.widthPixels;
        i = j;
        k = displaymetrics.heightPixels;
        i = j;
        j = k;
_L4:
        return (new StringBuilder()).append(i).append("x").append(j).toString();
_L2:
        i = j;
        Method method;
        int l;
        try
        {
            method = android/view/Display.getMethod("getRawHeight", new Class[0]);
        }
        catch (Exception exception)
        {
            j = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        l = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue();
        i = l;
        j = ((Integer)method.invoke(display, new Object[0])).intValue();
        i = l;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        j = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void initEngine()
    {
        while (this == null || mPulse3DView == null || mPulse3DView.mGLView == null) 
        {
            return;
        }
        mPulse3DView.mGLView.setSwapBufferEnabled(true);
        ((Activity)mContext).runOnUiThread(new Runnable() {

            final Pulse3DWebView this$0;
            final Pulse3DWebView val$amobee3DWebView;

            public void run()
            {
                if (amobee3DWebView == null)
                {
                    return;
                }
                if (getProgress() == 100)
                {
                    Object obj = "";
                    String s = ((String) (obj));
                    if (mPulse3DView != null)
                    {
                        s = ((String) (obj));
                        if (mPulse3DView.mGLView != null)
                        {
                            s = ((String) (obj));
                            if (mPulse3DView.mGLView.renderer != null)
                            {
                                s = mPulse3DView.mGLView.renderer.extensions;
                            }
                        }
                    }
                    Log.d("JsInterface3D", "calling ensureAdKitReady...");
                    obj = (new StringBuilder()).append("javascript:JsInterface.ensureAdKitReady((AdKitNative && AdKitNative.NativeCallbacks && AdKitNative.NativeCallbacks.nativeReady && AdKitNative.NativeCallbacks.nativeReady({ supports3d: true, banner: ");
                    boolean flag;
                    if (!mPulse3DView.presentAsFullscreen)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    s = ((StringBuilder) (obj)).append(flag).append(", trackingID: \"").append(mPulse3DView.getAdkUniqueUserId()).append("\", manufacturer: \"").append(Build.MANUFACTURER).append("\", model: \"").append(Build.MODEL).append("\", product: \"").append(Build.PRODUCT).append("\", rawResolution: \"").append(getRawResolution()).append("\", publisher: \"").append(getApplicationPackage()).append("\", deviceType: \"Android\", systemVersion: \"").append(android.os.Build.VERSION.RELEASE).append("\", glView: {extensions: \"").append(s).append("\"} })))").toString();
                    loadUrl(s);
                    return;
                } else
                {
                    Log.d("JsInterface3D", "AdKitReady posting initEngine");
                    (new Handler()).postDelayed(new Runnable() {

                        final _cls10 this$1;

                        public void run()
                        {
                            initEngine();
                        }

            
            {
                this$1 = _cls10.this;
                super();
            }
                    }, 1000L);
                    return;
                }
            }

            
            {
                this$0 = Pulse3DWebView.this;
                amobee3DWebView = pulse3dwebview1;
                super();
            }
        });
    }

    public void injectJS(final String command)
    {
        this;
        JVM INSTR monitorenter ;
        if (this != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((Activity)mContext).runOnUiThread(new Runnable() {

            final Pulse3DWebView this$0;
            final Pulse3DWebView val$amobee3DWebView;
            final String val$command;

            public void run()
            {
                if (amobee3DWebView == null)
                {
                    return;
                } else
                {
                    amobee3DWebView.loadUrl((new StringBuilder()).append("javascript:").append(command).toString());
                    return;
                }
            }

            
            {
                this$0 = Pulse3DWebView.this;
                amobee3DWebView = pulse3dwebview1;
                command = s;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        command;
        throw command;
    }

    protected void onDetachedFromWindow()
    {
        Log.d("Pulse3DWebView", (new StringBuilder()).append("detached From Window, intransition?? ").append(inTransition).toString());
        if (!inTransition)
        {
            super.onDetachedFromWindow();
        } else
        if (mPlaceholder != null)
        {
            Log.d("Pulse3DWebView", (new StringBuilder()).append("placeholder request focus: ").append(mPlaceholder).toString());
            mPlaceholder.requestFocus();
            return;
        }
    }

    public void onGlobalLayout()
    {
        Log.d("Pulse3DWebView", (new StringBuilder()).append("onGlobalLayout isExpanded: ").append(isExpanded).append(" inTransition: ").append(inTransition).append(" ignoreGlobalLayout: ").append(ignoreGlobalLayout).toString());
        while (mPulse3DView == null || mPulse3DView.mGLView == null || mPulse3DView.mGLView.renderer == null || !mPulse3DView.mGLView.renderer.ready || inTransition || ignoreGlobalLayout) 
        {
            return;
        }
        if (isExpanded || mPulse3DView.presentAsFullscreen)
        {
            String s = "true";
            int i;
            int j;
            if (mPulse3DView.presentAsFullscreen)
            {
                j = (int)((float)mPulse3DView.getWidth() / Pulse3DGLRenderer.content_scale);
                i = (int)((float)mPulse3DView.getHeight() / Pulse3DGLRenderer.content_scale);
            } else
            {
                Log.d("Pulse3DWebView", (new StringBuilder()).append("onGlobalLayout fullscreen childCount: ").append(mFullScreenHolder.getChildCount()).toString());
                if (mFullScreenHolder.getChildCount() < 1)
                {
                    s = "false";
                    isExpanded = false;
                    j = (int)((float)mPulse3DView.getWidth() / Pulse3DGLRenderer.content_scale);
                    i = (int)((float)mPulse3DView.getHeight() / Pulse3DGLRenderer.content_scale);
                } else
                {
                    j = (int)((float)mFullScreenHolder.getWidth() / Pulse3DGLRenderer.content_scale);
                    i = (int)((float)mFullScreenHolder.getHeight() / Pulse3DGLRenderer.content_scale);
                }
            }
            injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(").append(s).append(", 0.5, ").append(j).append(", ").append(i).append(")").toString());
            Log.d("Pulse3DWebView", (new StringBuilder()).append("willStartTransition: w ").append(j).append(" h").append(i).toString());
            injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.didEndTransition(").append(s).append(")").toString());
        }
        Log.d("Pulse3DWebView", (new StringBuilder()).append("onGlobalLayout isExpanded: ").append(isExpanded).toString());
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        Log.d("Pulse3DWebView", "onKeyDown!");
        if (isExpanded)
        {
            if (4 == i)
            {
                if (fullScreenVideoLayoutIsShowing)
                {
                    mAmobeeWebChromeClient.closeVideo();
                    return true;
                } else
                {
                    toggleBanner(true);
                    return true;
                }
            }
        } else
        if (fullScreenVideoLayoutIsShowing)
        {
            if (4 == i)
            {
                mAmobeeWebChromeClient.closeVideo();
            }
        } else
        if (inTransition && 4 == i)
        {
            Log.d("Pulse3DWebView", "absorbed back key while in transition!");
            return true;
        }
        return super.onKeyDown(i, keyevent);
    }

    public void onPause()
    {
        super.onPause();
        injectJS("AdKitNative.NativeCallbacks.willEnterBackground()");
    }

    public void onResume()
    {
        super.onResume();
        injectJS("AdKitNative.NativeCallbacks.willEnterForeground()");
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
        return super.onTouchEvent(motionevent);
    }

    protected void onWindowVisibilityChanged(int i)
    {
        if (!fullScreenVideoLayoutIsShowing || android.os.Build.VERSION.SDK_INT >= 17) goto _L2; else goto _L1
_L1:
        if (i != 8) goto _L4; else goto _L3
_L3:
        loadUrl("javascript:var videos = document.getElementsByTagName('video');for (i=0;i<videos.length;i++) {videos[i].pause();}");
        if (mAmobeeWebChromeClient != null && mAmobeeWebChromeClient.mCallback != null)
        {
            mAmobeeWebChromeClient.mCallback.onCustomViewHidden();
            mAmobeeWebChromeClient.mCallback = null;
            setEnabled(true);
            setClickable(true);
            setLongClickable(true);
        }
_L2:
        super.onWindowVisibilityChanged(i);
        return;
_L4:
        if (i == 0)
        {
            Log.d("Pulse3DWebView", "----------------- visible !! ------------");
            if (mAmobeeWebChromeClient != null && mAmobeeWebChromeClient.mVideoLayout != null)
            {
                fullScreenVideoLayoutIsShowing = false;
                if (mPulse3DView != null && mPulse3DView.mGLView != null)
                {
                    mPulse3DView.mGLView.setVisibility(0);
                    mPulse3DView.mGLView.renderer.ready = true;
                }
                mAmobeeWebChromeClient.mVideoLayout.setVisibility(8);
            }
            requestFocus();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void presentFullScreen()
    {
        this;
        JVM INSTR monitorenter ;
        final ViewGroup v;
        int i;
        int j;
        v = (ViewGroup)mPulse3DView.getParent();
        i = v.getWidth();
        j = v.getHeight();
        inTransition = true;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onStartTransition(mPulse3DView, true);
        }
        appRequestedOrientation = ((Activity)mContext).getRequestedOrientation();
        if (!mPulse3DView.adSupportsPortrait || mPulse3DView.adSupportsLandscape) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        l = j;
        k = i;
        if (i > j)
        {
            k = j;
            l = i;
        }
        didSetOrientation = true;
        ((Activity)mContext).setRequestedOrientation(1);
_L4:
        i = l - mStatusBarHeight;
        j = (int)((float)k / Pulse3DGLRenderer.content_scale);
        k = (int)((float)i / Pulse3DGLRenderer.content_scale);
        LayoutTransition layouttransition = new LayoutTransition();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "translationY", new float[] {
            (float)i, 0.0F
        });
        objectanimator.addListener(new android.animation.Animator.AnimatorListener() {

            final Pulse3DWebView this$0;
            final ViewGroup val$v;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                while (mPulse3DView == null || mPulse3DView.mPulse3dWebView == null) 
                {
                    return;
                }
                v.postDelayed(new Runnable() {

                    final _cls6 this$1;

                    public void run()
                    {
                        v.setLayoutTransition(restoreLayoutTransition);
                        restoreLayoutTransition = null;
                    }

            
            {
                this$1 = _cls6.this;
                super();
            }
                }, 500L);
                injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
                mPulse3DView.mPulse3dWebView.requestFocus(130);
                inTransition = false;
                if (mPulse3DView.mPulse3DViewListener != null)
                {
                    mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
                }
                isExpanded = true;
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = Pulse3DWebView.this;
                v = viewgroup;
                super();
            }
        });
        layouttransition.setAnimator(2, objectanimator);
        layouttransition.setDuration(2, 400L);
        layouttransition.setStartDelay(2, 800L);
        restoreLayoutTransition = v.getLayoutTransition();
        v.setLayoutTransition(layouttransition);
        injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(true, 0.5, ").append(j).append(", ").append(k).append(")").toString());
        Log.d("Pulse3DWebView", (new StringBuilder()).append("55 willStartTransition: w ").append(j).append(" h").append(k).toString());
        mPulse3DView.setVisibility(0);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = j;
        k = i;
        if (mPulse3DView.adSupportsPortrait) goto _L4; else goto _L3
_L3:
        l = j;
        k = i;
        if (!mPulse3DView.adSupportsLandscape) goto _L4; else goto _L5
_L5:
        l = j;
        k = i;
        if (j > i)
        {
            k = j;
            l = i;
        }
        didSetOrientation = true;
        ((Activity)mContext).setRequestedOrientation(0);
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    void toggleBanner()
    {
        toggleBanner(false);
    }

    void toggleBanner(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        requestFocus();
        flag1 = inTransition;
        if (!flag1 || flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!mPulse3DView.presentAsFullscreen)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        closeFullScreen();
          goto _L1
        Exception exception;
        exception;
        throw exception;
label0:
        {
            if (!isExpanded || !mPulse3DView.presentAsFullscreen)
            {
                break label0;
            }
            closeFullScreen();
        }
          goto _L1
label1:
        {
            Log.d("Pulse3DWebView", (new StringBuilder()).append("Set Size WebView isExpanded: ").append(isExpanded).toString());
            if (mPlaceholder == null)
            {
                mPlaceholder = (ViewGroup)getParent();
            }
            if (!isExpanded)
            {
                break label1;
            }
            collapseBannerLite();
        }
          goto _L1
        expandBanner();
          goto _L1
    }

    void updateWebSettings()
    {
        if (android.os.Build.VERSION.SDK_INT > 11 && android.os.Build.VERSION.SDK_INT < 17)
        {
            setLayerType(1, null);
        }
        WebSettings websettings = getSettings();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        websettings.setCacheMode(1);
        websettings.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
        websettings.setBuiltInZoomControls(false);
        websettings.setSupportZoom(false);
        websettings.setJavaScriptEnabled(true);
        websettings.setLoadWithOverviewMode(false);
        websettings.setUseWideViewPort(true);
        websettings.setDomStorageEnabled(true);
        websettings.setAllowFileAccess(true);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            websettings.setAllowUniversalAccessFromFileURLs(true);
            websettings.setAllowFileAccessFromFileURLs(true);
            setScrollBarSize(0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            websettings.setMediaPlaybackRequiresUserGesture(false);
        }
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }


/*
    static boolean access$202(Pulse3DWebView pulse3dwebview, boolean flag)
    {
        pulse3dwebview.ignoreGlobalLayout = flag;
        return flag;
    }

*/



/*
    static boolean access$302(Pulse3DWebView pulse3dwebview, boolean flag)
    {
        pulse3dwebview.didSetOrientation = flag;
        return flag;
    }

*/
}
