// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

private class injection
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private String injection;
    final AdMarvelInternalWebView this$0;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview;
        if (adMarvelInternalWebViewReference != null)
        {
            if ((admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get()) != null && !admarvelinternalwebview.isSignalShutdown())
            {
                admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(injection).toString());
                return;
            }
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview1, String s)
    {
        this$0 = AdMarvelInternalWebView.this;
        super();
        injection = null;
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview1);
        injection = s;
    }
}
