// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


// Referenced classes of package com.facebook.video.analytics:
//            VideoPerformanceTracking

class b
    implements Runnable
{

    final long a;
    final boolean b;
    final VideoPerformanceTracking c;

    public void run()
    {
        VideoPerformanceTracking.a(c, a);
        VideoPerformanceTracking.c(c, a);
        if (b)
        {
            VideoPerformanceTracking.d(c, a);
        } else
        {
            VideoPerformanceTracking.b(c, a);
            VideoPerformanceTracking.e(c, a);
        }
        VideoPerformanceTracking.c(c);
    }

    (VideoPerformanceTracking videoperformancetracking, long l, boolean flag)
    {
        c = videoperformancetracking;
        a = l;
        b = flag;
        super();
    }
}
