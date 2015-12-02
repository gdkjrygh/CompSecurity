// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.UriDataSource;
import com.google.android.exoplayer.upstream.UriLoadable;
import java.io.IOException;

public class ManifestFetcher
    implements com.google.android.exoplayer.upstream.Loader.Callback
{

    volatile String a;
    private final com.google.android.exoplayer.upstream.UriLoadable.Parser b;
    private final UriDataSource c;
    private final Handler d;
    private final EventListener e;
    private int f;
    private Loader g;
    private UriLoadable h;
    private long i;
    private int j;
    private long k;
    private IOException l;
    private volatile Object m;
    private volatile long n;
    private volatile long o;

    public ManifestFetcher(String s, UriDataSource uridatasource, com.google.android.exoplayer.upstream.UriLoadable.Parser parser)
    {
        this(s, uridatasource, parser, null, null);
    }

    private ManifestFetcher(String s, UriDataSource uridatasource, com.google.android.exoplayer.upstream.UriLoadable.Parser parser, Handler handler, EventListener eventlistener)
    {
        b = parser;
        a = s;
        c = uridatasource;
        d = handler;
        e = eventlistener;
    }

    private static long a(long l1)
    {
        return Math.min((l1 - 1L) * 1000L, 5000L);
    }

    private void a(IOException ioexception)
    {
        if (d != null && e != null)
        {
            HandlerDetour.a(d, new _cls3(ioexception), 0xbaee929);
        }
    }

    private void h()
    {
        if (d != null && e != null)
        {
            HandlerDetour.a(d, new _cls1(), 0x699392cd);
        }
    }

    private void i()
    {
        if (d != null && e != null)
        {
            HandlerDetour.a(d, new _cls2(), 0xdbb74685);
        }
    }

    public final Object a()
    {
        return m;
    }

    public final void a(Looper looper, ManifestCallback manifestcallback)
    {
        (new SingleFetchHelper(new UriLoadable(a, c, b), looper, manifestcallback)).a();
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
    {
        if (h != loadable)
        {
            return;
        }
        m = h.a();
        n = i;
        o = SystemClock.elapsedRealtime();
        j = 0;
        l = null;
        if (m instanceof RedirectingManifest)
        {
            loadable = ((RedirectingManifest)m).a();
            if (!TextUtils.isEmpty(loadable))
            {
                a = loadable;
            }
        }
        i();
    }

    public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
    {
        if (h != loadable)
        {
            return;
        } else
        {
            j = j + 1;
            k = SystemClock.elapsedRealtime();
            l = new IOException(ioexception);
            a(l);
            return;
        }
    }

    final void a(Object obj, long l1)
    {
        m = obj;
        n = l1;
        o = SystemClock.elapsedRealtime();
    }

    public final long b()
    {
        return n;
    }

    public final void c()
    {
        if (l == null || j <= 1)
        {
            return;
        } else
        {
            throw l;
        }
    }

    public final void d()
    {
        int i1 = f;
        f = i1 + 1;
        if (i1 == 0)
        {
            j = 0;
            l = null;
        }
    }

    public final void e()
    {
        int i1 = f - 1;
        f = i1;
        if (i1 == 0 && g != null)
        {
            g.c();
            g = null;
        }
    }

    public final void f()
    {
    }

    public final void g()
    {
        if (l == null || SystemClock.elapsedRealtime() >= k + a(j))
        {
            if (g == null)
            {
                g = new Loader("manifestLoader");
            }
            if (!g.a())
            {
                h = new UriLoadable(a, c, b);
                i = SystemClock.elapsedRealtime();
                g.a(h, this);
                h();
                return;
            }
        }
    }

    private class _cls3
        implements Runnable
    {

        final IOException a;
        final ManifestFetcher b;

        public void run()
        {
        }

        _cls3(IOException ioexception)
        {
            b = ManifestFetcher.this;
            a = ioexception;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ManifestFetcher a;

        public void run()
        {
        }

        _cls1()
        {
            a = ManifestFetcher.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ManifestFetcher a;

        public void run()
        {
        }

        _cls2()
        {
            a = ManifestFetcher.this;
            super();
        }
    }


    private class SingleFetchHelper
        implements com.google.android.exoplayer.upstream.Loader.Callback
    {

        final ManifestFetcher a;
        private final UriLoadable b;
        private final Looper c;
        private final ManifestCallback d;
        private final Loader e = new Loader("manifestLoader:single");
        private long f;

        private void b()
        {
            e.c();
        }

        public final void a()
        {
            f = SystemClock.elapsedRealtime();
            e.a(c, b, this);
        }

        public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
        {
            loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (b.a()));
            a.a(loadable, f);
            d.a(loadable);
            b();
            return;
            loadable;
            b();
            throw loadable;
        }

        public final void a(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
        {
            d.a(ioexception);
            b();
            return;
            loadable;
            b();
            throw loadable;
        }

        public final void f()
        {
            IOException ioexception = new IOException("Load cancelled", new CancellationException());
            d.a(ioexception);
            b();
            return;
            Exception exception;
            exception;
            b();
            throw exception;
        }

        public SingleFetchHelper(UriLoadable uriloadable, Looper looper, ManifestCallback manifestcallback)
        {
            a = ManifestFetcher.this;
            super();
            b = uriloadable;
            c = looper;
            d = manifestcallback;
        }

        private class ManifestCallback
        {

            public abstract void a(IOException ioexception);

            public abstract void a(Object obj);
        }

    }


    private class RedirectingManifest
    {

        public abstract String a();
    }

}
