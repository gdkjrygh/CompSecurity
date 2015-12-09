// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import com.admarvel.android.offline.AdmarvelOfflineUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, AdMarvelView, Utils

private static class pixelUrl
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
    private final String pixelUrl;

    public void run()
    {
        AdMarvelWebView admarvelwebview;
        if ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get() != null)
        {
            if ((admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get()) != null && pixelUrl != null && pixelUrl.length() != 0)
            {
                if (AdMarvelView.enableOfflineSDK)
                {
                    (new AdmarvelOfflineUtils()).firePixel(pixelUrl, admarvelwebview.getContext(), AdMarvelWebView.access$1(admarvelwebview));
                    return;
                } else
                {
                    (new Utils(admarvelwebview.getContext(), AdMarvelWebView.access$1(admarvelwebview))).firePixel(pixelUrl);
                    return;
                }
            }
        }
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        pixelUrl = s;
    }
}
