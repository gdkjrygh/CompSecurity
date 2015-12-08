// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, AdMarvelInterstitialAds, Utils

private static class pixelUrl
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private final String pixelUrl;

    public void run()
    {
        Object obj;
        try
        {
            if ((AdMarvelInternalWebView)adMarvelInternalWebViewReference.get() == null)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        obj = (AdMarvelActivity)adMarvelActivityReference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (pixelUrl == null || pixelUrl.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
            (new AdmarvelOfflineUtils()).firePixel(pixelUrl, ((android.content.Context) (obj)), AdMarvelActivity.access$7(((AdMarvelActivity) (obj))));
            return;
        }
        (new Utils(((android.content.Context) (obj)), AdMarvelActivity.access$7(((AdMarvelActivity) (obj))))).firePixel(pixelUrl);
    }

    public A(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        pixelUrl = s;
    }
}
