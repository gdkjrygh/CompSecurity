// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, Version, AdMarvelInternalWebView

class val.callback
    implements android.content.ener
{

    final val.callback this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final AdMarvelWebView val$adMarvelWebView;
    private final String val$callback;
    private final String val$redirectUrl;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Version.getAndroidSDKVersion() < 8)
        {
            ess._mth0(this._cls1.this).post(new eRunnablePreAPI8(val$adMarvelWebView, val$adMarvelInternalWebView, val$redirectUrl, val$callback));
            return;
        } else
        {
            ess._mth0(this._cls1.this).post(new eRunnable(val$adMarvelWebView, val$adMarvelInternalWebView, val$redirectUrl, val$callback));
            return;
        }
    }

    eRunnable()
    {
        this$1 = final_erunnable;
        val$adMarvelWebView = admarvelwebview;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$redirectUrl = s;
        val$callback = String.this;
        super();
    }
}
