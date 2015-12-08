// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.h;

import android.media.MediaPlayer;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.VideoView;

// Referenced classes of package com.tinder.h:
//            b

public class com.tinder.h.a extends WebChromeClient
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    public static interface a
    {
    }


    private View activityNonVideoView;
    private ViewGroup activityVideoView;
    private boolean isVideoFullscreen;
    private View loadingView;
    private a toggledFullscreenCallback;
    private android.webkit.WebChromeClient.CustomViewCallback videoViewCallback;
    private FrameLayout videoViewContainer;
    private b webView;

    public com.tinder.h.a()
    {
    }

    public com.tinder.h.a(View view, ViewGroup viewgroup)
    {
        activityNonVideoView = view;
        activityVideoView = viewgroup;
        loadingView = null;
        webView = null;
        isVideoFullscreen = false;
    }

    public com.tinder.h.a(View view, ViewGroup viewgroup, View view1)
    {
        activityNonVideoView = view;
        activityVideoView = viewgroup;
        loadingView = view1;
        webView = null;
        isVideoFullscreen = false;
    }

    public com.tinder.h.a(View view, ViewGroup viewgroup, View view1, b b1)
    {
        activityNonVideoView = view;
        activityVideoView = viewgroup;
        loadingView = view1;
        webView = b1;
        isVideoFullscreen = false;
    }

    public View getVideoLoadingProgressView()
    {
        if (loadingView != null)
        {
            loadingView.setVisibility(0);
            return loadingView;
        } else
        {
            return super.getVideoLoadingProgressView();
        }
    }

    public boolean isVideoFullscreen()
    {
        return isVideoFullscreen;
    }

    public boolean onBackPressed()
    {
        if (isVideoFullscreen)
        {
            onHideCustomView();
            return true;
        } else
        {
            return false;
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        onHideCustomView();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        return false;
    }

    public void onHideCustomView()
    {
        if (isVideoFullscreen)
        {
            activityVideoView.setVisibility(4);
            activityVideoView.removeView(videoViewContainer);
            activityNonVideoView.setVisibility(0);
            if (videoViewCallback != null && !videoViewCallback.getClass().getName().contains(".chromium."))
            {
                videoViewCallback.onCustomViewHidden();
            }
            isVideoFullscreen = false;
            videoViewContainer = null;
            videoViewCallback = null;
        }
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (loadingView != null)
        {
            loadingView.setVisibility(8);
        }
    }

    public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        onShowCustomView(view, customviewcallback);
    }

    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        if (view instanceof FrameLayout)
        {
            view = (FrameLayout)view;
            View view1 = view.getFocusedChild();
            isVideoFullscreen = true;
            videoViewContainer = view;
            videoViewCallback = customviewcallback;
            activityNonVideoView.setVisibility(4);
            activityVideoView.addView(videoViewContainer, new android.view.ViewGroup.LayoutParams(-1, -1));
            activityVideoView.setVisibility(0);
            if (view1 instanceof VideoView)
            {
                view = (VideoView)view1;
                view.setOnPreparedListener(this);
                view.setOnCompletionListener(this);
                view.setOnErrorListener(this);
            } else
            if (webView != null && webView.getSettings().getJavaScriptEnabled() && (view1 instanceof SurfaceView))
            {
                view = (new StringBuilder()).append("javascript:").append("var _ytrp_html5_video_last;").toString();
                view = (new StringBuilder()).append(view).append("var _ytrp_html5_video = document.getElementsByTagName('video')[0];").toString();
                view = (new StringBuilder()).append(view).append("if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {").toString();
                view = (new StringBuilder()).append(view).append("_ytrp_html5_video_last = _ytrp_html5_video;").toString();
                view = (new StringBuilder()).append(view).append("function _ytrp_html5_video_ended() {").toString();
                view = (new StringBuilder()).append(view).append("_VideoEnabledWebView.notifyVideoEnd();").toString();
                view = (new StringBuilder()).append(view).append("}").toString();
                view = (new StringBuilder()).append(view).append("_ytrp_html5_video.addEventListener('ended', _ytrp_html5_video_ended);").toString();
                view = (new StringBuilder()).append(view).append("}").toString();
                webView.loadUrl(view);
                return;
            }
        }
    }

    public void setOnToggledFullscreen(a a1)
    {
        toggledFullscreenCallback = a1;
    }
}
