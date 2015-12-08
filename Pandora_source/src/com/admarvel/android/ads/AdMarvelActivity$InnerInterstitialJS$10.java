// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, Version, AdMarvelInternalWebView

class val.callback
    implements android.content.ialJS._cls10
{

    final val.callback this$1;
    private final AdMarvelActivity val$adMarvelActivity;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$callback;
    private final String val$url;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Version.getAndroidSDKVersion() < 8)
        {
            AdMarvelActivity.access$7(val$adMarvelActivity).post(new API8(val$adMarvelInternalWebView, val$url, val$callback));
            return;
        } else
        {
            AdMarvelActivity.access$7(val$adMarvelActivity).post(new nit>(val$adMarvelInternalWebView, val$url, val$callback));
            return;
        }
    }

    API8()
    {
        this$1 = final_api8;
        val$adMarvelActivity = admarvelactivity;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$url = s;
        val$callback = String.this;
        super();
    }
}
