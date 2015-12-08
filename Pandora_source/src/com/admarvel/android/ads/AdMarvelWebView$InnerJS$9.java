// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

class val.callback
    implements Runnable
{

    final val.callback this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$callback;

    public void run()
    {
        val$adMarvelInternalWebView.loadUrl((new StringBuilder("javascript:")).append(val$callback).append("(NO)").toString());
    }

    ()
    {
        this$1 = final_;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$callback = String.this;
        super();
    }
}
