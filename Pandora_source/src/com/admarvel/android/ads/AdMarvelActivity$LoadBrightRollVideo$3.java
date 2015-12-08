// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView

class val.webview
    implements android.media.ollVideo._cls3
{

    final val.activity this$1;
    private final AdMarvelActivity val$activity;
    private final AdMarvelInternalWebView val$webview;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = new (val$activity);
        AdMarvelActivity.access$7(val$activity).post(mediaplayer);
        if (val$activity.isAdMarvelVideo && AdMarvelActivity.access$28(val$activity) != null && AdMarvelActivity.access$28(val$activity).length() > 0)
        {
            val$webview.loadUrl((new StringBuilder("javascript:")).append(AdMarvelActivity.access$28(val$activity)).append("()").toString());
        }
        return false;
    }

    ()
    {
        this$1 = final_;
        val$activity = admarvelactivity;
        val$webview = AdMarvelInternalWebView.this;
        super();
    }
}
