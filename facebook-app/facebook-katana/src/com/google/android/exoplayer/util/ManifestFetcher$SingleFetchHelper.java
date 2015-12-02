// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.UriLoadable;
import java.io.IOException;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.exoplayer.util:
//            ManifestFetcher

class d
    implements com.google.android.exoplayer.upstream.Loop_19_
{

    final ManifestFetcher a;
    private final UriLoadable b;
    private final Looper c;
    private final b d;
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

    public final void a(com.google.android.exoplayer.upstream.Loop_19_ loop_19_)
    {
        loop_19_ = ((com.google.android.exoplayer.upstream.Loop_19_) (b.a()));
        a.a(loop_19_, f);
        d.(loop_19_);
        b();
        return;
        loop_19_;
        b();
        throw loop_19_;
    }

    public final void a(com.google.android.exoplayer.upstream.Loop_19_ loop_19_, IOException ioexception)
    {
        d.(ioexception);
        b();
        return;
        loop_19_;
        b();
        throw loop_19_;
    }

    public final void f()
    {
        IOException ioexception = new IOException("Load cancelled", new CancellationException());
        d.(ioexception);
        b();
        return;
        Exception exception;
        exception;
        b();
        throw exception;
    }

    public I(ManifestFetcher manifestfetcher, UriLoadable uriloadable, Looper looper, I i)
    {
        a = manifestfetcher;
        super();
        b = uriloadable;
        c = looper;
        d = i;
    }
}
