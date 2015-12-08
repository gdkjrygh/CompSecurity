// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.millennialmedia.android:
//            CachedAd, HandShake, AdCache

final class AdCacheThreadPool
{
    private class AdCacheTask
        implements Runnable, Comparable
    {

        private CachedAd ad;
        private String adName;
        private WeakReference contextRef;
        private WeakReference listenerRef;
        final AdCacheThreadPool this$0;

        public int compareTo(AdCacheTask adcachetask)
        {
            return ad.downloadPriority - adcachetask.ad.downloadPriority;
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((AdCacheTask)obj);
        }

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof AdCacheTask))
            {
                return false;
            } else
            {
                obj = (AdCacheTask)obj;
                return ad.equals(((AdCacheTask) (obj)).ad);
            }
        }

        public void run()
        {
            String s = null;
            AdCache.AdCacheTaskListener adcachetasklistener = null;
            if (listenerRef != null)
            {
                adcachetasklistener = (AdCache.AdCacheTaskListener)listenerRef.get();
            }
            if (adcachetasklistener != null)
            {
                adcachetasklistener.downloadStart(ad);
            }
            HandShake.sharedHandShake((Context)contextRef.get()).lockAdTypeDownload(adName);
            boolean flag = ad.download((Context)contextRef.get());
            HandShake.sharedHandShake((Context)contextRef.get()).unlockAdTypeDownload(adName);
            if (!flag)
            {
                String s1 = AdCache.getIncompleteDownload((Context)contextRef.get(), adName);
                if (s1 != null && ad.getId().equals(s1))
                {
                    ad.delete((Context)contextRef.get());
                    AdCache.setIncompleteDownload((Context)contextRef.get(), adName, null);
                } else
                {
                    Context context = (Context)contextRef.get();
                    String s2 = adName;
                    if (!ad.downloadAllOrNothing)
                    {
                        s = ad.getId();
                    }
                    AdCache.setIncompleteDownload(context, s2, s);
                }
            } else
            {
                AdCache.setIncompleteDownload((Context)contextRef.get(), adName, null);
            }
            if (adcachetasklistener != null)
            {
                adcachetasklistener.downloadCompleted(ad, flag);
            }
        }

        AdCacheTask(Context context, String s, CachedAd cachedad, AdCache.AdCacheTaskListener adcachetasklistener)
        {
            this$0 = AdCacheThreadPool.this;
            super();
            contextRef = new WeakReference(context.getApplicationContext());
            adName = s;
            ad = cachedad;
            if (adcachetasklistener != null)
            {
                listenerRef = new WeakReference(adcachetasklistener);
            }
        }
    }


    private static AdCacheThreadPool sharedThreadPool;
    private ThreadPoolExecutor executor;
    private PriorityBlockingQueue queue;

    private AdCacheThreadPool()
    {
        TimeUnit timeunit = TimeUnit.SECONDS;
        PriorityBlockingQueue priorityblockingqueue = new PriorityBlockingQueue(32);
        queue = priorityblockingqueue;
        executor = new ThreadPoolExecutor(1, 2, 30L, timeunit, priorityblockingqueue);
    }

    static AdCacheThreadPool sharedThreadPool()
    {
        com/millennialmedia/android/AdCacheThreadPool;
        JVM INSTR monitorenter ;
        AdCacheThreadPool adcachethreadpool;
        if (sharedThreadPool == null)
        {
            sharedThreadPool = new AdCacheThreadPool();
        }
        adcachethreadpool = sharedThreadPool;
        com/millennialmedia/android/AdCacheThreadPool;
        JVM INSTR monitorexit ;
        return adcachethreadpool;
        Exception exception;
        exception;
        throw exception;
    }

    boolean startDownloadTask(Context context, String s, CachedAd cachedad, AdCache.AdCacheTaskListener adcachetasklistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (context == null || cachedad == null) goto _L2; else goto _L1
_L1:
        s = new AdCacheTask(context, s, cachedad, adcachetasklistener);
        if (queue.contains(s) || cachedad.isOnDisk(context)) goto _L2; else goto _L3
_L3:
        executor.execute(s);
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        throw context;
    }
}
