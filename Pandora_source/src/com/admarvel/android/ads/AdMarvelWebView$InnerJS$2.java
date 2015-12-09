// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, Version, AdMarvelInternalWebView

class val.description
    implements android.content.tener
{

    final val.description this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final AdMarvelWebView val$adMarvelWebView;
    private final String val$date;
    private final String val$description;
    private final String val$title;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Version.getAndroidSDKVersion() >= 14)
        {
            cess._mth0(this._cls1.this).post(new tRunnablePostAPI14(val$adMarvelInternalWebView, val$adMarvelWebView, val$date, val$title, val$description));
            return;
        } else
        {
            cess._mth0(this._cls1.this).post(new tRunnable(val$adMarvelInternalWebView, val$adMarvelWebView, val$date, val$title, val$description));
            return;
        }
    }

    tRunnable()
    {
        this$1 = final_trunnable;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$adMarvelWebView = admarvelwebview;
        val$date = s;
        val$title = s1;
        val$description = String.this;
        super();
    }
}
