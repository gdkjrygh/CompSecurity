// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelVideoView, AdMarvelInternalWebView

class val.activity
    implements Runnable
{

    final val.videoView this$1;
    private final AdMarvelActivity val$activity;
    private final AdMarvelVideoView val$videoView;
    private final AdMarvelInternalWebView val$webview;

    public void run()
    {
        if (val$videoView.getHeight() == 0)
        {
            val$webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$28(val$activity)).append("()").toString());
            return;
        } else
        {
            val$videoView.start();
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$videoView = admarvelvideoview;
        val$webview = admarvelinternalwebview;
        val$activity = AdMarvelActivity.this;
        super();
    }
}
