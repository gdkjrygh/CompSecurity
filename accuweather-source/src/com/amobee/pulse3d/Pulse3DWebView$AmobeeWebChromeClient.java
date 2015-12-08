// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            Log

private class <init> extends WebChromeClient
{

    android.webkit.ent mCallback;
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
            mCallback.CustomViewHidden();
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
        if (Pulse3DView.debugLevel == mVideoLayout)
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

    public void onShowCustomView(final View view, android.webkit.ent ent)
    {
        while (mVideoLayout != null && mVideoLayout.getVisibility() == 0 || !(view instanceof FrameLayout) || mCallback != null) 
        {
            return;
        }
        view.setVisibility(4);
        fullScreenVideoLayoutIsShowing = true;
        mCallback = ent;
        if (mVideoLayout == null)
        {
            mVideoLayout = new FrameLayout(mContext);
        }
        mVideoLayout.setLayoutParams(new android.widget.ent.mVideoLayout(-1, -1));
        mVideoLayout.setBackgroundColor(0);
        mVideoLayout.setVisibility(0);
        mVideoLayout.addView(view);
        Object obj = new android.view.View.OnKeyListener() {

            final Pulse3DWebView.AmobeeWebChromeClient this$1;

            public boolean onKey(View view1, int i, KeyEvent keyevent)
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
                this$1 = Pulse3DWebView.AmobeeWebChromeClient.this;
                super();
            }
        };
        view.setOnKeyListener(((android.view.lient) (obj)));
        mVideoLayout.setOnKeyListener(((android.view.lient.mVideoLayout) (obj)));
        if (((ViewGroup)view).getChildCount() > 0)
        {
            ((ViewGroup)view).getChildAt(0).setOnKeyListener(((android.view.lient.mVideoLayout) (obj)));
        }
        mPulse3DView.mGLView.renderer.ready = false;
        if (mVideoLayout.getParent() == null)
        {
            ((ViewGroup)getRootView()).addView(mVideoLayout);
        }
        mVideoLayout.setOnTouchListener(new android.view.View.OnTouchListener() {

            final Pulse3DWebView.AmobeeWebChromeClient this$1;
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
                this$1 = Pulse3DWebView.AmobeeWebChromeClient.this;
                view = view1;
                super();
            }
        });
        obj = ObjectAnimator.ofObject(mVideoLayout, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(0), Integer.valueOf(0xff000000)
        });
        ((ObjectAnimator) (obj)).addListener(new android.animation.Animator.AnimatorListener() {

            final Pulse3DWebView.AmobeeWebChromeClient this$1;
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
                this$1 = Pulse3DWebView.AmobeeWebChromeClient.this;
                view = view1;
                super();
            }
        });
        ((ObjectAnimator) (obj)).setDuration(400L);
        ((ObjectAnimator) (obj)).start();
        setEnabled(false);
        setClickable(false);
        setLongClickable(false);
        super.onShowCustomView(view, ent);
    }

    private _cls3.val.view()
    {
        this$0 = Pulse3DWebView.this;
        super();
        mCallback = null;
        mVideoLayout = null;
    }

    mVideoLayout(mVideoLayout mvideolayout)
    {
        this();
    }
}
