// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.ui.media.cache.MediaCacheKey;

// Referenced classes of package com.facebook.video.analytics:
//            VideoPerformanceTracking, BytesViewedTracking

class e
    implements Runnable
{

    final MediaCacheKey a;
    final long b;
    final long c;
    final int d;
    final boolean e;
    final VideoPerformanceTracking f;

    public void run()
    {
        VideoPerformanceTracking.a(f).a(a, b, c, d);
        if (!e)
        {
            VideoPerformanceTracking.b(f).a(a, b, c, d);
        }
        VideoPerformanceTracking.c(f);
    }

    (VideoPerformanceTracking videoperformancetracking, MediaCacheKey mediacachekey, long l, long l1, int i, 
            boolean flag)
    {
        f = videoperformancetracking;
        a = mediacachekey;
        b = l;
        c = l1;
        d = i;
        e = flag;
        super();
    }
}
