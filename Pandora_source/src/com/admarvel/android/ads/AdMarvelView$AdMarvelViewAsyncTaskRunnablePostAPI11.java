// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, AdMarvelViewAsyncTask

private static class m_handler
    implements Runnable
{

    private final WeakReference m_adMarvelViewReference;
    private final String m_androidId;
    private final WeakReference m_contextReference;
    private final String m_deviceConnectivity;
    private final String m_excludedBanners;
    private final Handler m_handler;
    private final int m_orientation;
    private final String m_partnerId;
    private final int m_retryNum;
    private final String m_siteId;
    private final File m_storage;
    private final Map m_targetParams;

    public void run()
    {
        if (m_contextReference.get() != null && m_adMarvelViewReference.get() != null)
        {
            (new AdMarvelViewAsyncTask(m_storage, (Context)m_contextReference.get())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                m_targetParams, m_partnerId, m_siteId, m_androidId, Integer.valueOf(m_orientation), m_deviceConnectivity, m_adMarvelViewReference.get(), Integer.valueOf(m_retryNum), m_excludedBanners, m_handler, 
                Boolean.valueOf(((AdMarvelView)m_adMarvelViewReference.get()).isSoftwareLayer()), Boolean.valueOf(AdMarvelView.access$13((AdMarvelView)m_adMarvelViewReference.get()))
            });
        }
    }

    public (File file, Context context, Map map, String s, String s1, String s2, int i, 
            String s3, AdMarvelView admarvelview, int j, String s4, Handler handler)
    {
        m_contextReference = new WeakReference(context);
        m_storage = file;
        m_targetParams = map;
        m_partnerId = s;
        m_siteId = s1;
        m_androidId = s2;
        m_orientation = i;
        m_deviceConnectivity = s3;
        m_adMarvelViewReference = new WeakReference(admarvelview);
        m_retryNum = j;
        m_excludedBanners = s4;
        m_handler = handler;
    }
}
