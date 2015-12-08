// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            AdCacheThreadPool, CachedAd, HandShake, AdCache

private class listenerRef
    implements Runnable, Comparable
{

    private CachedAd ad;
    private String adName;
    private WeakReference contextRef;
    private WeakReference listenerRef;
    final AdCacheThreadPool this$0;

    public int compareTo(listenerRef listenerref)
    {
        return ad.downloadPriority - listenerref.ad.downloadPriority;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof compareTo))
        {
            return false;
        } else
        {
            obj = (compareTo)obj;
            return ad.equals(((ad) (obj)).ad);
        }
    }

    public void run()
    {
        String s = null;
        ad ad1 = null;
        if (listenerRef != null)
        {
            ad1 = (listenerRef)listenerRef.get();
        }
        if (ad1 != null)
        {
            ad1.wnloadStart(ad);
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
        if (ad1 != null)
        {
            ad1.wnloadCompleted(ad, flag);
        }
    }

    (Context context, String s, CachedAd cachedad,  )
    {
        this$0 = AdCacheThreadPool.this;
        super();
        contextRef = new WeakReference(context.getApplicationContext());
        adName = s;
        ad = cachedad;
        if ( != null)
        {
            listenerRef = new WeakReference();
        }
    }
}
