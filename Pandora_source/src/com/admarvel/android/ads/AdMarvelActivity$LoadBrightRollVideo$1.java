// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView

class val.webview
    implements android.media.ollVideo._cls1
{

    final val.webview this$1;
    private final AdMarvelActivity val$activity;
    private final AdMarvelInternalWebView val$webview;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (val$activity.isAdMarvelVideo)
        {
            if (AdMarvelActivity.access$25(val$activity) != null && AdMarvelActivity.access$25(val$activity).length() > 0)
            {
                val$webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$25(val$activity)).append("()").toString());
            }
            if (AdMarvelActivity.access$26(val$activity) != null && AdMarvelActivity.access$26(val$activity).length() > 0)
            {
                val$webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$26(val$activity)).append("()").toString());
            }
            return;
        } else
        {
            val$webview.loadUrl((new StringBuilder("javascript:AdApp.videoView().setDuration(")).append(mediaplayer.getDuration() / 1000).append(")").toString());
            val$webview.loadUrl("javascript:AdApp.videoView().setCanPlay(true)");
            val$webview.loadUrl("javascript:AdApp.adView().play()");
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$activity = admarvelactivity;
        val$webview = AdMarvelInternalWebView.this;
        super();
    }
}
