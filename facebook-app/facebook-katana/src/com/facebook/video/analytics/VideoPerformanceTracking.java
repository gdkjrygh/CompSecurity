// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.net.NetworkInfo;
import android.net.Uri;
import com.facebook.analytics.logger.AnalyticsLogger;
import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.debug.log.BLog;
import com.facebook.ui.media.cache.MediaCacheKey;
import com.facebook.ui.media.cache.Range;
import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.video.analytics:
//            BytesViewedTracking, VideoCacheCounters, MicroStorage

public class VideoPerformanceTracking
{

    private static final Class a = com/facebook/video/analytics/VideoPerformanceTracking;
    private final VideoCacheCounters b;
    private final AnalyticsLogger c;
    private final FbNetworkManager d;
    private final MicroStorage e;
    private final BytesViewedTracking f = new BytesViewedTracking();
    private final BytesViewedTracking g = new BytesViewedTracking();
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private List m;

    public VideoPerformanceTracking(VideoCacheCounters videocachecounters, AnalyticsLogger analyticslogger, FbNetworkManager fbnetworkmanager, MicroStorage microstorage)
    {
        b = videocachecounters;
        c = analyticslogger;
        d = fbnetworkmanager;
        e = microstorage;
        m = new ArrayList();
    }

    static long a(VideoPerformanceTracking videoperformancetracking, long l1)
    {
        l1 = videoperformancetracking.h + l1;
        videoperformancetracking.h = l1;
        return l1;
    }

    static BytesViewedTracking a(VideoPerformanceTracking videoperformancetracking)
    {
        return videoperformancetracking.f;
    }

    private void a(long l1, long l2)
    {
        b.a("downloaded", l1);
        b.a("served", l2);
    }

    private void a(long l1, boolean flag)
    {
        a(((Runnable) (new _cls4(l1, flag))));
    }

    private static void a(HoneyClientEvent honeyclientevent, String s, Uri uri, int i1, boolean flag, Range range, String s1)
    {
        honeyclientevent.b("video_id", s);
        honeyclientevent.a("url", uri);
        honeyclientevent.a("session_id", i1);
        honeyclientevent.b("connection_type", s1);
        honeyclientevent.a("is_partial", flag);
        long l1;
        if (range != null)
        {
            l1 = range.a;
        } else
        {
            l1 = 0L;
        }
        honeyclientevent.a("range_from", l1);
        if (range != null)
        {
            l1 = range.b;
        } else
        {
            l1 = -1L;
        }
        honeyclientevent.a("range_to", l1);
    }

    static void a(VideoPerformanceTracking videoperformancetracking, DataOutputStream dataoutputstream)
    {
        videoperformancetracking.a(dataoutputstream);
    }

    static void a(VideoPerformanceTracking videoperformancetracking, byte abyte0[])
    {
        videoperformancetracking.a(abyte0);
    }

    private void a(DataOutputStream dataoutputstream)
    {
        this;
        JVM INSTR monitorenter ;
        dataoutputstream.writeInt(2);
        dataoutputstream.writeLong(h);
        dataoutputstream.writeLong(i);
        dataoutputstream.writeLong(j);
        dataoutputstream.writeLong(k);
        dataoutputstream.writeLong(l);
        f.a(dataoutputstream);
        g.a(dataoutputstream);
        this;
        JVM INSTR monitorexit ;
        return;
        dataoutputstream;
        throw dataoutputstream;
    }

    private void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (m != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        runnable.run();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        m.add(runnable);
        if (true) goto _L4; else goto _L3
_L3:
        runnable;
        throw runnable;
    }

    private void a(byte abyte0[])
    {
        abyte0 = new DataInputStream(new ByteArrayInputStream(abyte0));
        boolean flag;
        if (abyte0.readInt() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            Preconditions.checkArgument(flag);
            h = abyte0.readLong();
            i = abyte0.readLong();
            j = abyte0.readLong();
            k = abyte0.readLong();
            l = abyte0.readLong();
            f.a(abyte0);
            g.a(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            BLog.a(a, abyte0, "Error reading from storage, clearing accumulated vard", new Object[0]);
        }
        f();
        return;
    }

    static long b(VideoPerformanceTracking videoperformancetracking, long l1)
    {
        l1 = videoperformancetracking.i + l1;
        videoperformancetracking.i = l1;
        return l1;
    }

    static BytesViewedTracking b(VideoPerformanceTracking videoperformancetracking)
    {
        return videoperformancetracking.g;
    }

    private String b()
    {
        NetworkInfo networkinfo = d.i();
        if (networkinfo == null)
        {
            return "not_available";
        } else
        {
            return networkinfo.getTypeName();
        }
    }

    private void b(long l1, boolean flag)
    {
        a(new _cls5(l1, flag));
    }

    private void b(HoneyClientEvent honeyclientevent)
    {
        Preconditions.checkNotNull(honeyclientevent);
        c.a(honeyclientevent);
    }

    static long c(VideoPerformanceTracking videoperformancetracking, long l1)
    {
        l1 = videoperformancetracking.j + l1;
        videoperformancetracking.j = l1;
        return l1;
    }

    static void c(VideoPerformanceTracking videoperformancetracking)
    {
        videoperformancetracking.e();
    }

    private boolean c()
    {
        NetworkInfo networkinfo = d.i();
        return networkinfo != null && networkinfo.getType() == 1;
    }

    static long d(VideoPerformanceTracking videoperformancetracking, long l1)
    {
        l1 = videoperformancetracking.k + l1;
        videoperformancetracking.k = l1;
        return l1;
    }

    private void d()
    {
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        m = null;
    }

    static void d(VideoPerformanceTracking videoperformancetracking)
    {
        videoperformancetracking.d();
    }

    static long e(VideoPerformanceTracking videoperformancetracking, long l1)
    {
        l1 = videoperformancetracking.l + l1;
        videoperformancetracking.l = l1;
        return l1;
    }

    private void e()
    {
        e.a(new _cls3());
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        h = 0L;
        i = 0L;
        j = 0L;
        k = 0L;
        l = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e.a(new _cls2());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1)
    {
        b((new HoneyClientEvent(VideoAnalytics.VideoServerAnalyticEvents.LAUNCH_SERVER.value)).a("port", i1));
    }

    public final void a(Uri uri, long l1, List list, long l2, Exception exception)
    {
        HoneyClientEvent honeyclientevent = (new HoneyClientEvent(VideoAnalytics.VideoServerAnalyticEvents.VIDEO_PREFETCH.value)).a("bytes_downloaded", l2);
        list = list.iterator();
        Range range;
        int i1;
        for (i1 = 0; list.hasNext(); i1 = (int)((long)i1 + (range.b - range.a)))
        {
            range = (Range)list.next();
        }

        honeyclientevent.a("bytes_in_cache", l1 - (long)i1);
        if (exception != null)
        {
            honeyclientevent.a("exception", exception.getClass());
        }
        a(honeyclientevent, "0", uri, 0, false, new Range(0L, l1), b());
        b(honeyclientevent);
        b(l2, c());
    }

    public final void a(HoneyClientEvent honeyclientevent)
    {
        this;
        JVM INSTR monitorenter ;
        List list = m;
        boolean flag;
        if (list == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        honeyclientevent.a("bytes_downloaded", h);
        honeyclientevent.a("bytes_downloaded_cell", i);
        honeyclientevent.a("bytes_prefetched", j);
        honeyclientevent.a("bytes_prefetched_wifi", k);
        honeyclientevent.a("bytes_prefetched_cell", l);
        f();
        e();
        honeyclientevent.a("time_spent", (double)f.b() / 1000D);
        honeyclientevent.a("time_spent_in_cell", (double)g.b() / 1000D);
        honeyclientevent.a("bytes_watched", f.a());
        honeyclientevent.a("bytes_watched_in_cell", g.a());
        if (true) goto _L1; else goto _L3
_L3:
        honeyclientevent;
        throw honeyclientevent;
    }

    public final void a(MediaCacheKey mediacachekey, long l1, long l2, int i1, boolean flag)
    {
        a(((Runnable) (new _cls1(mediacachekey, l1, l2, i1, flag))));
    }

    public final void a(String s, Uri uri, int i1, long l1, long l2, 
            boolean flag, Range range, String s1, boolean flag1, long l3, long l4)
    {
        a(l2, l1);
        a(l2, flag1);
        HoneyClientEvent honeyclientevent = new HoneyClientEvent(VideoAnalytics.VideoServerAnalyticEvents.VIDEO_CACHE_REQUEST_FINISHED.value);
        a(honeyclientevent, s, uri, i1, flag, range, s1);
        honeyclientevent.a("bytes_served", l1);
        honeyclientevent.a("bytes_downloaded", l2);
        honeyclientevent.a("first_byte_served_time_ms", l4);
        honeyclientevent.a("serving_time_ms", l3);
        b(honeyclientevent);
    }

    public final void a(String s, Uri uri, int i1, Throwable throwable, long l1, long l2, boolean flag, Range range, String s1, boolean flag1, long l3, 
            long l4)
    {
        a(l2, l1);
        a(l2, flag1);
        HoneyClientEvent honeyclientevent = new HoneyClientEvent(VideoAnalytics.VideoServerAnalyticEvents.VIDEO_CACHE_REQUEST_ABORTED.value);
        a(honeyclientevent, s, uri, i1, flag, range, s1);
        honeyclientevent.a("first_byte_served_time_ms", l4);
        honeyclientevent.a("serving_time_ms", l3);
        honeyclientevent.a("bytes_served", l1);
        honeyclientevent.a("bytes_downloaded", l2);
        honeyclientevent.a("exception", throwable.getClass());
        honeyclientevent.b("reason", throwable.getMessage());
        b(honeyclientevent);
    }

    public final void a(String s, Uri uri, int i1, Throwable throwable, boolean flag, Range range, String s1, 
            long l1)
    {
        HoneyClientEvent honeyclientevent = new HoneyClientEvent(VideoAnalytics.VideoServerAnalyticEvents.VIDEO_CACHE_REQUEST_FAILED.value);
        a(honeyclientevent, s, uri, i1, flag, range, s1);
        honeyclientevent.a("serving_time_ms", l1);
        honeyclientevent.a("exception", throwable.getClass());
        honeyclientevent.b("reason", throwable.getMessage());
        b(honeyclientevent);
    }


    private class _cls4
        implements Runnable
    {

        final long a;
        final boolean b;
        final VideoPerformanceTracking c;

        public void run()
        {
            VideoPerformanceTracking.a(c, a);
            if (!b)
            {
                VideoPerformanceTracking.b(c, a);
            }
            VideoPerformanceTracking.c(c);
        }

        _cls4(long l1, boolean flag)
        {
            c = VideoPerformanceTracking.this;
            a = l1;
            b = flag;
            super();
        }
    }


    private class _cls5
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

        _cls5(long l1, boolean flag)
        {
            c = VideoPerformanceTracking.this;
            a = l1;
            b = flag;
            super();
        }
    }


    private class _cls3
        implements MicroStorage.WriteCallback
    {

        final VideoPerformanceTracking a;

        public final void a(DataOutputStream dataoutputstream)
        {
            VideoPerformanceTracking.a(a, dataoutputstream);
        }

        _cls3()
        {
            a = VideoPerformanceTracking.this;
            super();
        }
    }


    private class _cls2
        implements MicroStorage.ReadCallback
    {

        final VideoPerformanceTracking a;

        public final void a(byte abyte0[])
        {
            synchronized (a)
            {
                VideoPerformanceTracking.a(a, abyte0);
                VideoPerformanceTracking.d(a);
            }
            return;
            abyte0;
            videoperformancetracking;
            JVM INSTR monitorexit ;
            throw abyte0;
        }

        _cls2()
        {
            a = VideoPerformanceTracking.this;
            super();
        }
    }


    private class _cls1
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

        _cls1(MediaCacheKey mediacachekey, long l1, long l2, int i1, 
                boolean flag)
        {
            f = VideoPerformanceTracking.this;
            a = mediacachekey;
            b = l1;
            c = l2;
            d = i1;
            e = flag;
            super();
        }
    }

}
