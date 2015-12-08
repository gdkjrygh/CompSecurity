// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, Utils

private static class mCallback
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final String mCallback;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null)
        {
            return;
        }
        if (Utils.isNetworkAvailable(admarvelinternalwebview.getContext()))
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
            return;
        } else
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
            return;
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        mCallback = s;
    }
}
