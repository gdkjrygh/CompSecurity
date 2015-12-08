// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.graphics.Paint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, AdMarvelVideoView, Version

private static class adMarvelInternalWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private String videoUrl;

    public void run()
    {
        final AdMarvelActivity activity;
        final AdMarvelInternalWebView webview;
        RelativeLayout relativelayout;
        AdMarvelVideoView admarvelvideoview;
        int i;
        int j;
        try
        {
            activity = (AdMarvelActivity)adMarvelActivityReference.get();
            webview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
            return;
        }
        if (activity == null || webview == null) goto _L2; else goto _L1
_L1:
        if (videoUrl == null) goto _L2; else goto _L3
_L3:
        if (videoUrl.length() <= 0)
        {
            return;
        }
        activity.isBrightRollVideoLoaded = true;
        relativelayout = (RelativeLayout)activity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        admarvelvideoview = (AdMarvelVideoView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(activity)))).append("BR_VIDEO").toString());
        if (admarvelvideoview != null) goto _L5; else goto _L4
_L4:
        admarvelvideoview = new AdMarvelVideoView(activity);
        admarvelvideoview.setTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(activity)))).append("BR_VIDEO").toString());
        if (!activity.isAdMarvelVideo) goto _L7; else goto _L6
_L6:
        android.widget.RollVideo rollvideo = new android.widget.Video(-1, -1);
        rollvideo.Video(13);
        admarvelvideoview.setLayoutParams(rollvideo);
        j = relativelayout.getChildCount();
        i = 0;
          goto _L8
_L10:
        relativelayout.addView(admarvelvideoview, i);
        relativelayout.removeView(webview);
        webview.setBackgroundColor(0);
        webview.setBackgroundDrawable(null);
        i = Version.getAndroidSDKVersion();
        if (i >= 11)
        {
            try
            {
                android/view/View.getMethod("setLayerType", new Class[] {
                    Integer.TYPE, android/graphics/Paint
                }).invoke(webview, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            catch (Exception exception1) { }
        }
        relativelayout.addView(webview);
_L9:
        admarvelvideoview.setVideoURI(Uri.parse(videoUrl));
        admarvelvideoview.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final AdMarvelActivity.LoadBrightRollVideo this$1;
            private final AdMarvelActivity val$activity;
            private final AdMarvelInternalWebView val$webview;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                if (activity.isAdMarvelVideo)
                {
                    if (AdMarvelActivity.access$25(activity) != null && AdMarvelActivity.access$25(activity).length() > 0)
                    {
                        webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$25(activity)).append("()").toString());
                    }
                    if (AdMarvelActivity.access$26(activity) != null && AdMarvelActivity.access$26(activity).length() > 0)
                    {
                        webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$26(activity)).append("()").toString());
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
                this$1 = AdMarvelActivity.LoadBrightRollVideo.this;
                activity = admarvelactivity;
                webview = admarvelinternalwebview;
                super();
            }
        });
        admarvelvideoview.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final AdMarvelActivity.LoadBrightRollVideo this$1;
            private final AdMarvelActivity val$activity;
            private final AdMarvelInternalWebView val$webview;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                if (activity.isAdMarvelVideo)
                {
                    if (AdMarvelActivity.access$27(activity) != null && AdMarvelActivity.access$27(activity).length() > 0)
                    {
                        webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$27(activity)).append("()").toString());
                    }
                } else
                {
                    webview.loadUrl("javascript:AdApp.videoView().end();");
                }
                mediaplayer = new AdMarvelActivity.CleanUpBrightRollVideo(activity);
                AdMarvelActivity.access$7(activity).post(mediaplayer);
            }

            
            {
                this$1 = AdMarvelActivity.LoadBrightRollVideo.this;
                activity = admarvelactivity;
                webview = admarvelinternalwebview;
                super();
            }
        });
        admarvelvideoview.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final AdMarvelActivity.LoadBrightRollVideo this$1;
            private final AdMarvelActivity val$activity;
            private final AdMarvelInternalWebView val$webview;

            public boolean onError(MediaPlayer mediaplayer, int k, int l)
            {
                mediaplayer = new AdMarvelActivity.CleanUpBrightRollVideo(activity);
                AdMarvelActivity.access$7(activity).post(mediaplayer);
                if (activity.isAdMarvelVideo && AdMarvelActivity.access$28(activity) != null && AdMarvelActivity.access$28(activity).length() > 0)
                {
                    webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$28(activity)).append("()").toString());
                }
                return false;
            }

            
            {
                this$1 = AdMarvelActivity.LoadBrightRollVideo.this;
                activity = admarvelactivity;
                webview = admarvelinternalwebview;
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
        if (relativelayout.getChildAt(i) == webview)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        admarvelvideoview.setLayoutParams(new android.widget.Params(1, 1));
        relativelayout.addView(admarvelvideoview);
          goto _L9
_L2:
        return;
_L8:
        if (i < j) goto _L11; else goto _L10
    }

    public _cls3.val.webview(String s, AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
    {
        videoUrl = s;
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
