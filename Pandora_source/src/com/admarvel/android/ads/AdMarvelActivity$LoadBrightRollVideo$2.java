// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView

class val.webview
    implements android.media.ollVideo._cls2
{

    final val.activity this$1;
    private final AdMarvelActivity val$activity;
    private final AdMarvelInternalWebView val$webview;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (val$activity.isAdMarvelVideo)
        {
            if (AdMarvelActivity.access$27(val$activity) != null && AdMarvelActivity.access$27(val$activity).length() > 0)
            {
                val$webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$27(val$activity)).append("()").toString());
            }
        } else
        {
            val$webview.loadUrl("javascript:AdApp.videoView().end();");
        }
        mediaplayer = new (val$activity);
        AdMarvelActivity.access$7(val$activity).post(mediaplayer);
    }

    ()
    {
        this$1 = final_;
        val$activity = admarvelactivity;
        val$webview = AdMarvelInternalWebView.this;
        super();
    }
}
