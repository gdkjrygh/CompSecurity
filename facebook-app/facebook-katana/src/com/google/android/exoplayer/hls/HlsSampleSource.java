// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.LoadControl;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.chunk.Chunk;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.util.LinkedList;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsExtractorWrapper, TsChunk, HlsChunkSource

public final class HlsSampleSource
    implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, com.google.android.exoplayer.upstream.Loader.Callback
{

    private IOException A;
    private int B;
    private long C;
    private long D;
    private final HlsChunkSource a;
    private final LinkedList b;
    private final int c;
    private final int d;
    private final int e;
    private final LoadControl f;
    private final Handler g;
    private final EventListener h;
    private int i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n[];
    private boolean o[];
    private TrackInfo p[];
    private MediaFormat q[];
    private Format r;
    private long s;
    private long t;
    private long u;
    private boolean v;
    private Chunk w;
    private TsChunk x;
    private TsChunk y;
    private Loader z;

    public HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i1)
    {
        this(hlschunksource, loadcontrol, i1, null, null, 0);
    }

    private HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i1, Handler handler, EventListener eventlistener, int j1)
    {
        this(hlschunksource, loadcontrol, i1, handler, eventlistener, j1, 3);
    }

    private HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i1, Handler handler, EventListener eventlistener, int j1, int k1)
    {
        a = hlschunksource;
        f = loadcontrol;
        d = i1;
        c = k1;
        g = handler;
        h = eventlistener;
        e = j1;
        u = -1L;
        b = new LinkedList();
    }

    static int a(HlsSampleSource hlssamplesource)
    {
        return hlssamplesource.e;
    }

    private void a(long l1, int i1, int j1, Format format, long l2, 
            long l3)
    {
        if (g != null && h != null)
        {
            HandlerDetour.a(g, new _cls1(l1, i1, j1, format, l2, l3), 0xc1c6c6bc);
        }
    }

    private void a(long l1, int i1, int j1, Format format, long l2, 
            long l3, long l4, long l5)
    {
        if (g != null && h != null)
        {
            HandlerDetour.a(g, new _cls2(l1, i1, j1, format, l2, l3, l4, l5), 0xb14dc6f);
        }
    }

    private void a(Format format, int i1, long l1)
    {
        if (g != null && h != null)
        {
            HandlerDetour.a(g, new _cls5(format, i1, l1), 0xc03451c7);
        }
    }

    private void a(HlsExtractorWrapper hlsextractorwrapper, long l1)
    {
        if (hlsextractorwrapper.b())
        {
            int i1 = 0;
            while (i1 < n.length) 
            {
                if (!n[i1])
                {
                    hlsextractorwrapper.a(i1, l1);
                }
                i1++;
            }
        }
    }

    private void a(IOException ioexception)
    {
        if (g != null && h != null)
        {
            HandlerDetour.a(g, new _cls4(ioexception), 0x7f2169ce);
        }
    }

    private static boolean a(Chunk chunk)
    {
        return chunk instanceof TsChunk;
    }

    private boolean a(HlsExtractorWrapper hlsextractorwrapper)
    {
        if (hlsextractorwrapper.b())
        {
            int i1 = 0;
            while (i1 < n.length) 
            {
                if (n[i1] && hlsextractorwrapper.c(i1))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    static EventListener b(HlsSampleSource hlssamplesource)
    {
        return hlssamplesource.h;
    }

    static int c(long l1)
    {
        return (int)(l1 / 1000L);
    }

    private void d(long l1)
    {
        u = l1;
        v = false;
        if (z.a())
        {
            z.b();
            return;
        } else
        {
            h();
            j();
            return;
        }
    }

    private static long e(long l1)
    {
        return Math.min((l1 - 1L) * 1000L, 5000L);
    }

    private void f(long l1)
    {
        if (g != null && h != null)
        {
            HandlerDetour.a(g, new _cls3(l1), 0x7aad4b11);
        }
    }

    private HlsExtractorWrapper g()
    {
        HlsExtractorWrapper hlsextractorwrapper;
        for (hlsextractorwrapper = (HlsExtractorWrapper)b.getFirst(); b.size() > 1 && !a(hlsextractorwrapper); hlsextractorwrapper = (HlsExtractorWrapper)b.getFirst())
        {
            ((HlsExtractorWrapper)b.removeFirst()).c();
        }

        return hlsextractorwrapper;
    }

    private void h()
    {
        for (int i1 = 0; i1 < b.size(); i1++)
        {
            ((HlsExtractorWrapper)b.get(i1)).c();
        }

        b.clear();
        i();
        y = null;
    }

    private void i()
    {
        x = null;
        w = null;
        A = null;
        B = 0;
    }

    private void j()
    {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = k();
        boolean flag;
        boolean flag1;
        if (A != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (z.a() || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag1 = f.a(this, s, l2, flag1);
        if (flag)
        {
            if (l1 - C >= e(B))
            {
                A = null;
                z.a(w, this);
            }
        } else
        if (!z.a() && flag1)
        {
            Chunk chunk = a.a(y, u, s);
            if (chunk != null)
            {
                D = l1;
                w = chunk;
                if (a(w))
                {
                    TsChunk tschunk = (TsChunk)w;
                    if (l())
                    {
                        u = -1L;
                    }
                    HlsExtractorWrapper hlsextractorwrapper = tschunk.a;
                    if (b.isEmpty() || b.getLast() != hlsextractorwrapper)
                    {
                        hlsextractorwrapper.a(f.b());
                        b.addLast(hlsextractorwrapper);
                    }
                    a(tschunk.e.e, tschunk.b, tschunk.c, tschunk.d, tschunk.g, tschunk.h);
                    x = tschunk;
                } else
                {
                    a(w.e.e, w.b, w.c, w.d, -1L, -1L);
                }
                z.a(w, this);
                return;
            }
        }
    }

    private long k()
    {
        long l1 = -1L;
        if (!l()) goto _L2; else goto _L1
_L1:
        l1 = u;
_L4:
        return l1;
_L2:
        if (x == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (x.j) goto _L4; else goto _L3
_L3:
        return x.h;
        if (y.j) goto _L4; else goto _L5
_L5:
        return y.h;
    }

    private boolean l()
    {
        return u != -1L;
    }

    public final int a(int i1, long l1, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        boolean flag1 = false;
        Assertions.b(j);
        s = l1;
        if (o[i1])
        {
            o[i1] = false;
            return -5;
        }
        if (flag)
        {
            return -2;
        }
        if (l())
        {
            return -2;
        }
        Object obj = g();
        if (!((HlsExtractorWrapper) (obj)).b())
        {
            return -2;
        }
        if (r == null || !r.equals(((HlsExtractorWrapper) (obj)).b))
        {
            a(((HlsExtractorWrapper) (obj)).b, ((HlsExtractorWrapper) (obj)).a, ((HlsExtractorWrapper) (obj)).c);
            r = ((HlsExtractorWrapper) (obj)).b;
        }
        if (b.size() > 1)
        {
            ((HlsExtractorWrapper) (obj)).a((HlsExtractorWrapper)b.get(1));
        }
        for (int j1 = 0; b.size() > j1 + 1 && !((HlsExtractorWrapper) (obj)).c(i1);)
        {
            obj = b;
            j1++;
            obj = (HlsExtractorWrapper)((LinkedList) (obj)).get(j1);
            if (!((HlsExtractorWrapper) (obj)).b())
            {
                return -2;
            }
        }

        MediaFormat mediaformat = ((HlsExtractorWrapper) (obj)).b(i1);
        if (mediaformat != null && !mediaformat.a(q[i1], true))
        {
            a.a(mediaformat);
            mediaformatholder.a = mediaformat;
            q[i1] = mediaformat;
            return -4;
        }
        if (((HlsExtractorWrapper) (obj)).a(i1, sampleholder))
        {
            int k1;
            int i2;
            if (sampleholder.e < t)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            i2 = sampleholder.d;
            k1 = ((flag1) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = 0x8000000;
            }
            sampleholder.d = i2 | k1;
            return -3;
        }
        return !v ? -2 : -1;
    }

    public final TrackInfo a(int i1)
    {
        Assertions.b(j);
        return p[i1];
    }

    public final void a(int i1, long l1)
    {
        Assertions.b(j);
        boolean flag;
        if (!n[i1])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        m = m + 1;
        n[i1] = true;
        q[i1] = null;
        r = null;
        if (!k)
        {
            f.a(this, d);
            k = true;
        }
        if (m == 1)
        {
            b(l1);
        }
        o[i1] = false;
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
    {
        boolean flag1 = true;
        long l1;
        long l2;
        boolean flag;
        if (loadable == w)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        l1 = SystemClock.elapsedRealtime();
        l2 = l1 - D;
        a.a(w);
        if (a(w))
        {
            if (w == x)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            v = x.j;
            y = x;
            a(w.e(), x.b, x.c, x.d, x.g, x.h, l1, l2);
        } else
        {
            a(w.e(), w.b, w.c, w.d, -1L, -1L, l1, l2);
        }
        i();
        if (m > 0 || !j)
        {
            j();
        }
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
    {
        if (a.a(w, ioexception))
        {
            if (y == null && !l())
            {
                u = t;
            }
            i();
        } else
        {
            A = ioexception;
            B = B + 1;
            C = SystemClock.elapsedRealtime();
        }
        a(ioexception);
        j();
    }

    public final boolean a(long l1)
    {
        int i1 = 0;
        if (j)
        {
            return true;
        }
        if (!b.isEmpty())
        {
            HlsExtractorWrapper hlsextractorwrapper = g();
            if (hlsextractorwrapper.b())
            {
                l = hlsextractorwrapper.e();
                n = new boolean[l];
                o = new boolean[l];
                q = new MediaFormat[l];
                p = new TrackInfo[l];
                for (; i1 < l; i1++)
                {
                    MediaFormat mediaformat = hlsextractorwrapper.b(i1);
                    p[i1] = new TrackInfo(mediaformat.a, a.a());
                }

                j = true;
                return true;
            }
        }
        if (z == null)
        {
            z = new Loader("Loader:HLS");
        }
        if (!k)
        {
            f.a(this, d);
            k = true;
        }
        if (!z.a())
        {
            u = l1;
            s = l1;
        }
        j();
        return false;
    }

    public final int b()
    {
        Assertions.b(j);
        return l;
    }

    public final void b(int i1)
    {
label0:
        {
            Assertions.b(j);
            Assertions.b(n[i1]);
            m = m - 1;
            n[i1] = false;
            if (m == 0)
            {
                s = 0x8000000000000000L;
                if (k)
                {
                    f.a(this);
                    k = false;
                }
                if (!z.a())
                {
                    break label0;
                }
                z.b();
            }
            return;
        }
        h();
        f.a();
    }

    public final void b(long l1)
    {
        int i1 = 0;
        Assertions.b(j);
        long l2;
        boolean flag;
        if (m > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (l())
        {
            l2 = u;
        } else
        {
            l2 = s;
        }
        s = l1;
        t = l1;
        if (l2 == l1)
        {
            return;
        }
        s = l1;
        for (; i1 < o.length; i1++)
        {
            o[i1] = true;
        }

        d(l1);
    }

    public final boolean b(int i1, long l1)
    {
        boolean flag1;
        flag1 = false;
        Assertions.b(j);
        Assertions.b(n[i1]);
        s = l1;
        if (!b.isEmpty())
        {
            a(g(), s);
        }
        if (!v) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        j();
        flag = flag1;
        if (l()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (b.isEmpty()) goto _L4; else goto _L5
_L5:
        int j1 = 0;
_L8:
        flag = flag1;
        if (j1 >= b.size()) goto _L4; else goto _L6
_L6:
        HlsExtractorWrapper hlsextractorwrapper;
        hlsextractorwrapper = (HlsExtractorWrapper)b.get(j1);
        flag = flag1;
        if (!hlsextractorwrapper.b()) goto _L4; else goto _L7
_L7:
        if (hlsextractorwrapper.c(i1))
        {
            return true;
        }
        j1++;
          goto _L8
    }

    public final void c()
    {
        if (A != null && B > c)
        {
            throw A;
        } else
        {
            return;
        }
    }

    public final long d()
    {
        Assertions.b(j);
        long l1;
        boolean flag;
        if (m > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (l())
        {
            l1 = u;
        } else
        {
            if (v)
            {
                return -3L;
            }
            long l2 = ((HlsExtractorWrapper)b.getLast()).d();
            l1 = l2;
            if (l2 == 0x8000000000000000L)
            {
                return s;
            }
        }
        return l1;
    }

    public final void e()
    {
        int i1;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        i1 = i - 1;
        i = i1;
        if (i1 == 0 && z != null)
        {
            z.c();
            z = null;
        }
    }

    public final void f()
    {
        f(w.e());
        if (m > 0)
        {
            d(u);
            return;
        } else
        {
            h();
            f.a();
            return;
        }
    }

    public final com.google.android.exoplayer.SampleSource.SampleSourceReader f_()
    {
        i = i + 1;
        return this;
    }

    private class _cls1
        implements Runnable
    {

        final long a;
        final int b;
        final int c;
        final Format d;
        final long e;
        final long f;
        final HlsSampleSource g;

        public void run()
        {
        }

        _cls1(long l1, int i1, int j1, Format format, long l2, long l3)
        {
            g = HlsSampleSource.this;
            a = l1;
            b = i1;
            c = j1;
            d = format;
            e = l2;
            f = l3;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final long a;
        final int b;
        final int c;
        final Format d;
        final long e;
        final long f;
        final long g;
        final long h;
        final HlsSampleSource i;

        public void run()
        {
        }

        _cls2(long l1, int i1, int j1, Format format, long l2, long l3, long l4, long l5)
        {
            i = HlsSampleSource.this;
            a = l1;
            b = i1;
            c = j1;
            d = format;
            e = l2;
            f = l3;
            g = l4;
            h = l5;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final Format a;
        final int b;
        final long c;
        final HlsSampleSource d;

        public void run()
        {
            HlsSampleSource.b(d).a(HlsSampleSource.a(d), a, b, HlsSampleSource.c(c));
        }

        _cls5(Format format, int i1, long l1)
        {
            d = HlsSampleSource.this;
            a = format;
            b = i1;
            c = l1;
            super();
        }

        private class EventListener
            implements BaseChunkSampleSourceEventListener
        {
        }

    }


    private class _cls4
        implements Runnable
    {

        final IOException a;
        final HlsSampleSource b;

        public void run()
        {
        }

        _cls4(IOException ioexception)
        {
            b = HlsSampleSource.this;
            a = ioexception;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final long a;
        final HlsSampleSource b;

        public void run()
        {
        }

        _cls3(long l1)
        {
            b = HlsSampleSource.this;
            a = l1;
            super();
        }
    }

}
