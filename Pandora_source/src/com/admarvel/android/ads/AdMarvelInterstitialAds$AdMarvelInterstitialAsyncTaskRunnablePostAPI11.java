// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInterstitialAds, AdMarvelInterstitialAsyncTask

private static class m_handler
    implements Runnable
{

    private final WeakReference m_adMarvelInterstitialAdsReference;
    private final String m_androidId;
    private final WeakReference m_contextReference;
    private final String m_deviceConnectivity;
    private final String m_excludedBanners;
    private final Handler m_handler;
    private final int m_orientation;
    private final String m_partnerId;
    private final int m_retryNum;
    private final String m_siteId;
    private final Map m_targetParams;

    public void run()
    {
        AdMarvelInterstitialAds admarvelinterstitialads = (AdMarvelInterstitialAds)m_adMarvelInterstitialAdsReference.get();
        Context context = (Context)m_contextReference.get();
        if (admarvelinterstitialads != null && context != null)
        {
            (new AdMarvelInterstitialAsyncTask(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, admarvelinterstitialads, Integer.valueOf(m_retryNum), m_excludedBanners, m_handler
            });
        }
    }

    public (Map map, String s, String s1, String s2, int i, String s3, AdMarvelInterstitialAds admarvelinterstitialads, 
            int j, String s4, Context context, Handler handler)
    {
        m_targetParams = map;
        m_partnerId = s;
        m_siteId = s1;
        m_androidId = s2;
        m_orientation = i;
        m_deviceConnectivity = s3;
        m_adMarvelInterstitialAdsReference = new WeakReference(admarvelinterstitialads);
        m_retryNum = j;
        m_excludedBanners = s4;
        m_contextReference = new WeakReference(context);
        m_handler = handler;
    }
}
