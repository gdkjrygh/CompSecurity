// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.concurrent.CancellationException;

final class bdz
    implements bdj
{

    final bdp a;
    final Looper b;
    final Loader c = new Loader("manifestLoader:single");
    long d;
    private final bdx e;
    private bdw f;

    public bdz(bdw bdw1, bdp bdp1, Looper looper, bdx bdx1)
    {
        f = bdw1;
        super();
        a = bdp1;
        b = looper;
        e = bdx1;
    }

    public final void a(bdl bdl)
    {
        bdl = ((bdl) (a.a));
        bdw bdw1 = f;
        long l = d;
        bdw1.a = bdl;
        bdw1.b = l;
        bdw1.c = SystemClock.elapsedRealtime();
        e.a(bdl);
        c.b();
        return;
        bdl;
        c.b();
        throw bdl;
    }

    public final void a(bdl bdl, IOException ioexception)
    {
        e.a(ioexception);
        c.b();
        return;
        bdl;
        c.b();
        throw bdl;
    }

    public final void i()
    {
        IOException ioexception = new IOException("Load cancelled", new CancellationException());
        e.a(ioexception);
        c.b();
        return;
        Exception exception;
        exception;
        c.b();
        throw exception;
    }
}
