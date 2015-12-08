// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

private static class adMarvelInternalWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null)
        {
            return;
        } else
        {
            admarvelinternalwebview.setLayerType(1, null);
            return;
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
    }
}
