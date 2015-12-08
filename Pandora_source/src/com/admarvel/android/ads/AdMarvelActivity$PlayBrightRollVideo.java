// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, AdMarvelVideoView

private static class adMarvelInternalWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;

    public void run()
    {
        final AdMarvelVideoView videoView;
        final AdMarvelActivity activity;
        final AdMarvelInternalWebView webview;
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
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (webview == null)
        {
            return;
        }
        videoView = (AdMarvelVideoView)((RelativeLayout)activity.findViewById(AdMarvelActivity.LAYOUT_VIEW_ID)).findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(activity)))).append("BR_VIDEO").toString());
        if (videoView == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (videoView.getHeight() != 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        AdMarvelActivity.access$7(activity).postDelayed(new Runnable() {

            final AdMarvelActivity.PlayBrightRollVideo this$1;
            private final AdMarvelActivity val$activity;
            private final AdMarvelVideoView val$videoView;
            private final AdMarvelInternalWebView val$webview;

            public void run()
            {
                if (videoView.getHeight() == 0)
                {
                    webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$28(activity)).append("()").toString());
                    return;
                } else
                {
                    videoView.start();
                    return;
                }
            }

            
            {
                this$1 = AdMarvelActivity.PlayBrightRollVideo.this;
                videoView = admarvelvideoview;
                webview = admarvelinternalwebview;
                activity = admarvelactivity;
                super();
            }
        }, 500L);
_L1:
        if (AdMarvelActivity.access$29(activity) == null)
        {
            AdMarvelActivity.access$30(activity, new (activity, webview));
            AdMarvelActivity.access$7(activity).postDelayed(AdMarvelActivity.access$29(activity), 1000L);
        }
        if (activity.isAdMarvelVideo && AdMarvelActivity.access$31(activity) != null && AdMarvelActivity.access$31(activity).length() > 0)
        {
            webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$31(activity)).append("()").toString());
            return;
        }
        break MISSING_BLOCK_LABEL_207;
        videoView.start();
          goto _L1
    }

    public _cls1.val.activity(AdMarvelActivity admarvelactivity, AdMarvelInternalWebView admarvelinternalwebview)
    {
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
