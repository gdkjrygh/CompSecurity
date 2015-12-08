// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

// Referenced classes of package com.millennialmedia.android:
//            MMAd, MMSDK, MMAdImpl, InlineVideoView, 
//            MMLog, AdCache, MMAdImplController, MMWebView, 
//            BridgeMMSpeechkit, RequestListener, MMRequest

abstract class MMLayout extends RelativeLayout
    implements MMAd
{
    private static class LayoutGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        WeakReference layoutRef;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            while (motionevent == null || motionevent1 == null || Math.abs((int)(motionevent1.getX() - motionevent.getX())) <= 200 || Math.abs(f) <= Math.abs(f1)) 
            {
                return false;
            }
            if (f <= 0.0F) goto _L2; else goto _L1
_L1:
            if (MMSDK.logLevel == 0)
            {
                MMLog.i("MMLayout", "Enabling debug and verbose logging.");
                MMSDK.logLevel = 3;
            } else
            {
                MMLog.i("MMLayout", "Disabling debug and verbose logging.");
                MMSDK.logLevel = 0;
            }
_L4:
            return true;
_L2:
            motionevent = (MMLayout)layoutRef.get();
            if (motionevent != null)
            {
                MMSDK.printDiagnostics(((MMLayout) (motionevent)).adImpl);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public LayoutGestureListener(MMLayout mmlayout)
        {
            layoutRef = new WeakReference(mmlayout);
        }
    }

    class MMLayoutMMAdImpl extends MMAdImpl
    {

        final MMLayout this$0;

        public void addView(MMWebView mmwebview, android.widget.RelativeLayout.LayoutParams layoutparams)
        {
            MMLog.w("MMLayout", (new StringBuilder()).append("MMLayout adding view (").append(mmwebview).append(") to ").append(this).toString());
            MMLayout.this.addView(mmwebview, layoutparams);
        }

        volatile MMAd getCallingAd()
        {
            return getCallingAd();
        }

        MMLayout getCallingAd()
        {
            return MMLayout.this;
        }

        int getId()
        {
            return MMLayout.this.getId();
        }

        public void removeView(MMWebView mmwebview)
        {
            MMLayout.this.removeView(mmwebview);
        }

        public void setClickable(boolean flag)
        {
            MMLayout.this.setClickable(flag);
        }

        public MMLayoutMMAdImpl(Context context)
        {
            this$0 = MMLayout.this;
            super(context);
        }
    }


    static final String BOTTOM_CENTER = "bottom-center";
    static final String BOTTOM_LEFT = "bottom-left";
    static final String BOTTOM_RIGHT = "bottom-right";
    static final String CENTER = "center";
    private static final int CLOSE_AREA_SIZE = 50;
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_WIDTH = "width";
    private static final String TAG = "MMLayout";
    static final String TOP_CENTER = "top-center";
    static final String TOP_LEFT = "top-left";
    static final String TOP_RIGHT = "top-right";
    private static boolean appInit;
    MMAdImpl adImpl;
    View closeAreaView;
    private GestureDetector diagnosticDetector;
    String goalId;
    RelativeLayout inlineVideoLayout;
    InlineVideoView inlineVideoView;
    boolean isResizing;

    protected MMLayout(Context context)
    {
        super(context);
        initLayout(context);
    }

    protected MMLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initLayout(context);
    }

    private void internalSetCloseArea(String s)
    {
        if (closeAreaView != null) goto _L2; else goto _L1
_L1:
        android.widget.RelativeLayout.LayoutParams layoutparams;
        closeAreaView = new View(getContext());
        float f = getContext().getResources().getDisplayMetrics().density;
        layoutparams = new android.widget.RelativeLayout.LayoutParams((int)(50F * f), (int)(50F * f));
        if (!"top-right".equals(s)) goto _L4; else goto _L3
_L3:
        layoutparams.addRule(11);
_L6:
        closeAreaView.setOnClickListener(new android.view.View.OnClickListener() {

            final MMLayout this$0;

            public void onClick(View view)
            {
                closeAreaTouched();
            }

            
            {
                this$0 = MMLayout.this;
                super();
            }
        });
        addView(closeAreaView, layoutparams);
_L2:
        return;
_L4:
        if ("top-center".equals(s))
        {
            layoutparams.addRule(14);
        } else
        if ("bottom-left".equals(s))
        {
            layoutparams.addRule(12);
        } else
        if ("bottom-center".equals(s))
        {
            layoutparams.addRule(12);
            layoutparams.addRule(14);
        } else
        if ("bottom-right".equals(s))
        {
            layoutparams.addRule(12);
            layoutparams.addRule(11);
        } else
        if ("center".equals(s))
        {
            layoutparams.addRule(13);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean adjustVideo(final InlineVideoView.InlineParams params)
    {
        MMSDK.runOnUiThread(new Runnable() {

            final MMLayout this$0;
            final InlineVideoView.InlineParams val$params;

            public void run()
            {
                if (inlineVideoView != null)
                {
                    inlineVideoView.setVideoDimensions(params);
                }
            }

            
            {
                this$0 = MMLayout.this;
                params = inlineparams;
                super();
            }
        });
        return false;
    }

    void closeAreaTouched()
    {
    }

    public String getApid()
    {
        return adImpl.getApid();
    }

    public boolean getIgnoresDensityScaling()
    {
        return adImpl.getIgnoresDensityScaling();
    }

    public RequestListener getListener()
    {
        return adImpl.getListener();
    }

    public MMRequest getMMRequest()
    {
        return adImpl.getMMRequest();
    }

    void initInlineVideo(InlineVideoView.InlineParams inlineparams)
    {
        removeVideo();
        inlineVideoView = new InlineVideoView(this, inlineparams);
        inlineVideoView.attachVideo(this);
    }

    protected final void initLayout(Context context)
    {
        try
        {
            MMLog.i("MMLayout", "Initializing MMLayout.");
            MMSDK.checkPermissions(context);
            MMSDK.checkActivity(context);
        }
        catch (Exception exception)
        {
            MMLog.e("MMLayout", "There was an exception initializing the MMAdView. ", exception);
            exception.printStackTrace();
        }
        diagnosticDetector = new GestureDetector(context.getApplicationContext(), new LayoutGestureListener(this));
        if (!appInit)
        {
            MMLog.d("MMLayout", "********** Millennial Device Id *****************");
            MMLog.d("MMLayout", MMSDK.getMMdid(context));
            MMLog.d("MMLayout", "Use the above identifier to register this device and receive test ads. Test devices can be registered and administered through your account at http://mmedia.com.");
            MMLog.d("MMLayout", "*************************************************");
            AdCache.cleanCache(context);
            appInit = true;
        }
    }

    boolean isVideoPlayingStreaming()
    {
        return inlineVideoView != null && inlineVideoView.isPlayingStreaming();
    }

    void loadUrl(String s)
    {
        if (MMSDK.isConnected(getContext()))
        {
            if (adImpl.controller != null)
            {
                adImpl.controller.loadUrl(s);
            }
            return;
        } else
        {
            MMLog.e("MMLayout", "No network available, can't load overlay.");
            return;
        }
    }

    void loadWebContent(String s, String s1)
    {
        if (MMSDK.isConnected(getContext()))
        {
            if (adImpl.controller != null)
            {
                adImpl.controller.loadWebContent(s, s1);
            }
            return;
        } else
        {
            MMLog.e("MMLayout", "No network available, can't load overlay.");
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            MMLog.d("MMLayout", (new StringBuilder()).append("onAttachedToWindow for ").append(adImpl).toString());
            if (getId() == -1)
            {
                MMLog.w("MMLayout", "MMAd missing id from getId(). Performance will be affected for configuration changes.");
            }
            if (!isResizing)
            {
                MMAdImplController.assignAdViewController(adImpl);
            }
            if (inlineVideoLayout != null)
            {
                inlineVideoLayout.bringToFront();
            }
            if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
            {
                adImpl.controller.webView.enableSendingSize();
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        MMLog.d("MMLayout", (new StringBuilder()).append("onDetachedFromWindow for").append(adImpl).toString());
        Context context = getContext();
        if (adImpl.adType == "i" && context != null && (context instanceof Activity) && ((Activity)context).isFinishing())
        {
            adImpl.isFinishing = true;
        }
        if (!isResizing)
        {
            MMAdImplController.removeAdViewController(adImpl);
        }
    }

    void onPause()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.onPause();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        long l = adImpl.internalId;
        adImpl.internalId = parcelable.getLong("MMAdImplId");
        adImpl.linkForExpansionId = parcelable.getLong("MMAdImplLinkedId");
        MMLog.d("MMLayout", (new StringBuilder()).append("onRestoreInstanceState replacing adImpl-").append(l).append(" with ").append(adImpl).append(" id=").append(getId()).toString());
        String s = parcelable.getString("inlineVideoViewGson");
        if (s != null)
        {
            initInlineVideo(new InlineVideoView.InlineParams(s));
        }
        super.onRestoreInstanceState(parcelable.getParcelable("super"));
    }

    void onResume()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.onResume();
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        super.onSaveInstanceState();
        MMLog.d("MMLayout", (new StringBuilder()).append("onSaveInstanceState saving - ").append(adImpl).append(" id=").append(getId()).toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putLong("MMAdImplId", adImpl.internalId);
        bundle.putLong("MMAdImplLinkedId", adImpl.linkForExpansionId);
        if (inlineVideoView != null)
        {
            bundle.putString("inlineVideoViewGson", inlineVideoView.getJsonState());
        }
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return diagnosticDetector.onTouchEvent(motionevent) || !isClickable() || super.onTouchEvent(motionevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        MMLog.d("MMLayout", String.format("Window Focus Changed. For %s, Window in focus?: %b Controllers: %s", new Object[] {
            adImpl, Boolean.valueOf(flag), MMAdImplController.controllersToString()
        }));
        BridgeMMMedia.Audio audio;
        if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
        {
            if (flag)
            {
                adImpl.controller.webView.onResumeWebView();
                adImpl.controller.webView.setMraidViewableVisible();
            } else
            {
                BridgeMMSpeechkit.releaseSpeechKit();
                adImpl.controller.webView.setMraidViewableHidden();
                adImpl.controller.webView.onPauseWebView();
            }
        }
        if (!flag && (getContext() instanceof Activity))
        {
            Activity activity = (Activity)getContext();
            if (activity == null || activity.isFinishing() && adImpl != null)
            {
                adImpl.isFinishing = true;
                if (adImpl.controller != null && adImpl.controller.webView != null)
                {
                    adImpl.controller.webView.setMraidHidden();
                    MMAdImplController.removeAdViewController(adImpl);
                }
            }
        }
        audio = BridgeMMMedia.Audio.sharedAudio(getContext());
        if (audio == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        audio.stop();
        this;
        JVM INSTR monitorexit ;
_L2:
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void pauseVideo()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.pause();
        }
    }

    void playVideo()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.start();
        }
    }

    void removeCloseTouchDelegate()
    {
        if (closeAreaView != null && closeAreaView.getParent() != null && (closeAreaView.getParent() instanceof ViewGroup))
        {
            ((ViewGroup)closeAreaView.getParent()).removeView(closeAreaView);
            closeAreaView = null;
        }
    }

    void removeVideo()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.removeVideo();
            inlineVideoView = null;
        }
    }

    void resumeVideo()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.resumeVideo();
        }
    }

    public void setApid(String s)
    {
        adImpl.setApid(s);
    }

    void setCloseArea(final String position)
    {
        post(new Runnable() {

            final MMLayout this$0;
            final String val$position;

            public void run()
            {
                internalSetCloseArea(position);
            }

            
            {
                this$0 = MMLayout.this;
                position = s;
                super();
            }
        });
    }

    public void setIgnoresDensityScaling(boolean flag)
    {
        adImpl.setIgnoresDensityScaling(flag);
    }

    public void setListener(RequestListener requestlistener)
    {
        adImpl.setListener(requestlistener);
    }

    public void setMMRequest(MMRequest mmrequest)
    {
        adImpl.setMMRequest(mmrequest);
    }

    void setMediaPlaybackRequiresUserGesture(boolean flag)
    {
        try
        {
            android/webkit/WebView.getMethod("setMediaPlaybackRequiresUserGesture", new Class[] {
                Boolean.TYPE
            }).invoke(this, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    void setVideoSource(String s)
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.setStreamingVideoSource(s);
        }
    }

    void stopVideo()
    {
        if (inlineVideoView != null)
        {
            inlineVideoView.stopPlayback();
        }
    }

}
