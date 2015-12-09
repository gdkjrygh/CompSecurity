// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView

class val.supportedScreenOrientationParam
    implements Runnable
{

    final val.supportedScreenOrientationParam this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$mCallback;
    private final String val$supportedScreenOrientationParam;

    public void run()
    {
        val$adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(val$mCallback).append("(").append(val$supportedScreenOrientationParam).append(")").toString());
    }

    ()
    {
        this$1 = final_;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$mCallback = s;
        val$supportedScreenOrientationParam = String.this;
        super();
    }
}
