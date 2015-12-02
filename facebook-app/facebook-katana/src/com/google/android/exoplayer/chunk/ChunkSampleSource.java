// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.LoadControl;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.TrackInfo;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//            ChunkOperationHolder, BaseMediaChunk, ChunkSource, Chunk, 
//            Format, MediaChunk

public class ChunkSampleSource
    implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, com.google.android.exoplayer.upstream.Loader.Callback
{

    private final int a;
    private final LoadControl b;
    private final ChunkSource c;
    private final ChunkOperationHolder d;
    private final LinkedList e;
    private final List f;
    private final DefaultTrackOutput g;
    private final int h;
    private final Handler i;
    private final EventListener j;
    private final int k;
    private int l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private Loader r;
    private boolean s;
    private IOException t;
    private int u;
    private long v;
    private long w;
    private MediaFormat x;
    private Format y;

    public ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i1)
    {
        this(chunksource, loadcontrol, i1, null, null, 0);
    }

    public ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i1, Handler handler, EventListener eventlistener, int j1)
    {
        this(chunksource, loadcontrol, i1, handler, eventlistener, j1, 3);
    }

    private ChunkSampleSource(ChunkSource chunksource, LoadControl loadcontrol, int i1, Handler handler, EventListener eventlistener, int j1, int k1)
    {
        c = chunksource;
        b = loadcontrol;
        h = i1;
        i = handler;
        j = eventlistener;
        a = j1;
        k = k1;
        d = new ChunkOperationHolder();
        e = new LinkedList();
        f = Collections.unmodifiableList(e);
        g = new DefaultTrackOutput(loadcontrol.b());
        l = 0;
        o = -1L;
    }

    static int a(ChunkSampleSource chunksamplesource)
    {
        return chunksamplesource.a;
    }

    private void a(long l1, int i1, int j1, Format format, long l2, 
            long l3)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls1(l1, i1, j1, format, l2, l3), 0xe5fc7d3c);
        }
    }

    private void a(long l1, int i1, int j1, Format format, long l2, 
            long l3, long l4, long l5)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls2(l1, i1, j1, format, l2, l3, l4, l5), 0x6a95e97);
        }
    }

    private void a(long l1, long l2)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls5(l1, l2), 0xc4c01cbd);
        }
    }

    private void a(Format format, int i1, long l1)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls6(format, i1, l1), 0xb1eb1058);
        }
    }

    private void a(IOException ioexception)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls4(ioexception), 0x1aa72c7c);
        }
    }

    private static boolean a(Chunk chunk)
    {
        return chunk instanceof BaseMediaChunk;
    }

    static EventListener b(ChunkSampleSource chunksamplesource)
    {
        return chunksamplesource.j;
    }

    protected static int c(long l1)
    {
        return (int)(l1 / 1000L);
    }

    private boolean c(int i1)
    {
        if (e.size() <= i1)
        {
            return false;
        }
        long l1 = 0L;
        long l2 = ((BaseMediaChunk)e.getLast()).h;
        BaseMediaChunk basemediachunk = null;
        while (e.size() > i1) 
        {
            basemediachunk = (BaseMediaChunk)e.removeLast();
            l1 = basemediachunk.g;
        }
        g.a(basemediachunk.a());
        a(l1, l2);
        return true;
    }

    private void d(long l1)
    {
        o = l1;
        s = false;
        if (r.a())
        {
            r.b();
            return;
        } else
        {
            g.a();
            e.clear();
            g();
            i();
            return;
        }
    }

    private static long e(long l1)
    {
        return Math.min((l1 - 1L) * 1000L, 5000L);
    }

    private void f(long l1)
    {
        if (i != null && j != null)
        {
            HandlerDetour.a(i, new _cls3(l1), 0xe8fa0d59);
        }
    }

    private void g()
    {
        d.b = null;
        h();
    }

    private void h()
    {
        t = null;
        u = 0;
    }

    private void i()
    {
        long l1;
        boolean flag1;
        boolean flag2;
        long l2 = SystemClock.elapsedRealtime();
        l1 = j();
        boolean flag;
        if (t != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (r.a() || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || (d.b != null || l1 == -1L) && l2 - p <= 2000L) goto _L2; else goto _L1
_L1:
        p = l2;
        d.a = f.size();
        c.a(f, o, m, d);
        flag2 = c(d.a);
        if (d.b != null) goto _L4; else goto _L3
_L3:
        l1 = -1L;
_L2:
        flag1 = b.a(this, m, l1, flag1);
        if (!flag) goto _L6; else goto _L5
_L5:
        if (l2 - v >= e(u))
        {
            k();
        }
_L8:
        return;
_L4:
        if (flag2)
        {
            l1 = j();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (r.a() || !flag1) goto _L8; else goto _L7
_L7:
        l();
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }

    private long j()
    {
        if (m())
        {
            return o;
        }
        BaseMediaChunk basemediachunk = (BaseMediaChunk)e.getLast();
        if (basemediachunk.j)
        {
            return -1L;
        } else
        {
            return basemediachunk.h;
        }
    }

    private void k()
    {
        t = null;
        Chunk chunk = d.b;
        if (!a(chunk))
        {
            d.a = f.size();
            c.a(f, o, m, d);
            c(d.a);
            if (d.b == chunk)
            {
                r.a(chunk, this);
                return;
            } else
            {
                f(chunk.e());
                l();
                return;
            }
        }
        if (chunk == e.getFirst())
        {
            r.a(chunk, this);
            return;
        }
        BaseMediaChunk basemediachunk = (BaseMediaChunk)e.removeLast();
        boolean flag;
        if (chunk == basemediachunk)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        d.a = f.size();
        c.a(f, o, m, d);
        e.add(basemediachunk);
        if (d.b == chunk)
        {
            r.a(chunk, this);
            return;
        } else
        {
            f(chunk.e());
            c(d.a);
            h();
            l();
            return;
        }
    }

    private void l()
    {
        Chunk chunk = d.b;
        if (chunk == null)
        {
            return;
        }
        w = SystemClock.elapsedRealtime();
        if (a(chunk))
        {
            BaseMediaChunk basemediachunk = (BaseMediaChunk)chunk;
            basemediachunk.a(g);
            e.add(basemediachunk);
            if (m())
            {
                o = -1L;
            }
            a(basemediachunk.e.e, basemediachunk.b, basemediachunk.c, basemediachunk.d, basemediachunk.g, basemediachunk.h);
        } else
        {
            a(chunk.e.e, chunk.b, chunk.c, chunk.d, -1L, -1L);
        }
        r.a(chunk, this);
    }

    private boolean m()
    {
        return o != -1L;
    }

    public final int a(int i1, long l1, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        boolean flag1;
        if (l == 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        if (i1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1);
        m = l1;
        if (q)
        {
            q = false;
            return -5;
        }
        if (flag)
        {
            return -2;
        }
        if (m())
        {
            return -2;
        }
        BaseMediaChunk basemediachunk;
        if (!g.g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        for (basemediachunk = (BaseMediaChunk)e.getFirst(); i1 != 0 && e.size() > 1 && ((BaseMediaChunk)e.get(1)).a() == g.c(); basemediachunk = (BaseMediaChunk)e.getFirst())
        {
            e.removeFirst();
        }

        if (y == null || !y.equals(basemediachunk.d))
        {
            a(basemediachunk.d, basemediachunk.c, basemediachunk.g);
            y = basemediachunk.d;
        }
        if (i1 != 0 || basemediachunk.a)
        {
            MediaFormat mediaformat = basemediachunk.b();
            if (!mediaformat.a(x, true))
            {
                c.a(mediaformat);
                mediaformatholder.a = mediaformat;
                mediaformatholder.b = basemediachunk.c();
                x = mediaformat;
                return -4;
            }
        }
        if (i1 == 0)
        {
            return !s ? -2 : -1;
        }
        if (g.a(sampleholder))
        {
            int j1;
            if (sampleholder.e < n)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = sampleholder.d;
            if (i1 != 0)
            {
                i1 = 0x8000000;
            } else
            {
                i1 = 0;
            }
            sampleholder.d = i1 | j1;
            return -3;
        } else
        {
            return -2;
        }
    }

    public final TrackInfo a(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (l == 2 || l == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (i1 == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        return c.a();
    }

    public final void a(int i1, long l1)
    {
        boolean flag1 = true;
        boolean flag;
        if (l == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (i1 == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        l = 3;
        c.b();
        b.a(this, h);
        y = null;
        x = null;
        m = l1;
        n = l1;
        q = false;
        d(l1);
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = l1 - w;
        loadable = d.b;
        c.a(loadable);
        if (a(((Chunk) (loadable))))
        {
            MediaChunk mediachunk = (MediaChunk)loadable;
            a(loadable.e(), mediachunk.b, mediachunk.c, mediachunk.d, mediachunk.g, mediachunk.h, l1, l2);
            s = ((BaseMediaChunk)loadable).j;
        } else
        {
            a(loadable.e(), ((Chunk) (loadable)).b, ((Chunk) (loadable)).c, ((Chunk) (loadable)).d, -1L, -1L, l1, l2);
        }
        g();
        i();
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
    {
        t = ioexception;
        u = u + 1;
        v = SystemClock.elapsedRealtime();
        a(ioexception);
        i();
    }

    public final boolean a(long l1)
    {
        boolean flag;
        if (l == 1 || l == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (l == 2)
        {
            return true;
        } else
        {
            r = new Loader((new StringBuilder("Loader:")).append(c.a().a).toString());
            l = 2;
            return true;
        }
    }

    public final int b()
    {
        boolean flag;
        if (l == 2 || l == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        return 1;
    }

    public final void b(int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if (l == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (i1 == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        l = 2;
        c.c();
        b.a(this);
        if (r.a())
        {
            r.b();
            return;
        } else
        {
            g.a();
            e.clear();
            g();
            b.a();
            return;
        }
        Exception exception;
        exception;
        b.a(this);
        if (r.a())
        {
            r.b();
        } else
        {
            g.a();
            e.clear();
            g();
            b.a();
        }
        throw exception;
    }

    public final void b(long l1)
    {
        boolean flag1 = false;
        long l2;
        boolean flag2;
        if (l == 3)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Assertions.b(flag2);
        if (m())
        {
            l2 = o;
        } else
        {
            l2 = m;
        }
        m = l1;
        n = l1;
        if (l2 == l1)
        {
            return;
        }
        boolean flag;
        if (!m() && g.b(l1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag = flag1;
            if (!g.g())
            {
                flag = true;
            }
            for (; flag && e.size() > 1 && ((BaseMediaChunk)e.get(1)).a() <= g.c(); e.removeFirst()) { }
        } else
        {
            d(l1);
        }
        q = true;
    }

    public final boolean b(int i1, long l1)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (l == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            m = l1;
            c.d();
            i();
            if (!s)
            {
                flag = flag1;
                if (g.g())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final void c()
    {
        if (t != null && u > k)
        {
            throw t;
        }
        if (d.b == null)
        {
            c.e();
        }
    }

    public final long d()
    {
        long l1;
        boolean flag;
        if (l == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (m())
        {
            l1 = o;
        } else
        {
            if (s)
            {
                return -3L;
            }
            long l2 = g.f();
            l1 = l2;
            if (l2 == 0x8000000000000000L)
            {
                return m;
            }
        }
        return l1;
    }

    public final void e()
    {
        boolean flag;
        if (l != 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        if (r != null)
        {
            r.c();
            r = null;
        }
        l = 0;
    }

    public final void f()
    {
        f(d.b.e());
        g();
        if (l == 3)
        {
            d(o);
            return;
        } else
        {
            g.a();
            e.clear();
            g();
            b.a();
            return;
        }
    }

    public final com.google.android.exoplayer.SampleSource.SampleSourceReader f_()
    {
        boolean flag;
        if (l == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        l = 1;
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
        final ChunkSampleSource g;

        public void run()
        {
        }

        _cls1(long l1, int i1, int j1, Format format, long l2, long l3)
        {
            g = ChunkSampleSource.this;
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
        final ChunkSampleSource i;

        public void run()
        {
        }

        _cls2(long l1, int i1, int j1, Format format, long l2, long l3, long l4, long l5)
        {
            i = ChunkSampleSource.this;
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

        final long a;
        final long b;
        final ChunkSampleSource c;

        public void run()
        {
        }

        _cls5(long l1, long l2)
        {
            c = ChunkSampleSource.this;
            a = l1;
            b = l2;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final Format a;
        final int b;
        final long c;
        final ChunkSampleSource d;

        public void run()
        {
            ChunkSampleSource.b(d).a(ChunkSampleSource.a(d), a, b, ChunkSampleSource.c(c));
        }

        _cls6(Format format, int i1, long l1)
        {
            d = ChunkSampleSource.this;
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
        final ChunkSampleSource b;

        public void run()
        {
        }

        _cls4(IOException ioexception)
        {
            b = ChunkSampleSource.this;
            a = ioexception;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final long a;
        final ChunkSampleSource b;

        public void run()
        {
        }

        _cls3(long l1)
        {
            b = ChunkSampleSource.this;
            a = l1;
            super();
        }
    }

}
