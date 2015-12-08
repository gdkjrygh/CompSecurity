// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.g;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.n;
import com.google.android.apps.gsa.shared.io.o;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.p;
import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.u;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            l, e, g, j

public final class d
    implements g
{

    final c a;
    final t b;
    private final l c;
    private final com.google.android.apps.gsa.shared.io.d d;
    private final com.google.android.apps.gsa.b.a.a.l e;
    private final com.google.android.apps.gsa.b.a.a.e f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private InputStream h;
    private volatile RuntimeException i;

    public d(l l1, com.google.android.apps.gsa.shared.io.d d1, com.google.android.apps.gsa.b.a.a.l l2, c c1)
    {
        h = null;
        i = null;
        c = (l)p.a(l1);
        d = (com.google.android.apps.gsa.shared.io.d)p.a(d1);
        e = (com.google.android.apps.gsa.b.a.a.l)p.a(l2);
        a = (c)p.a(c1);
        f = new com.google.android.apps.gsa.b.a.a.e(this, e.c, a);
        l1 = u.a();
        com.google.common.util.concurrent.e.a(e.b, new com.google.android.apps.gsa.b.a.a.g(c, f, l1, a));
        b = l1;
    }

    private n d()
    {
        L.a(5, "AsyncHttpConnection", "Method not supported with async connections.", new Object[0]);
        n n1;
        try
        {
            n1 = (n)b.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            throw a.a(0x4001f, interruptedexception);
        }
        catch (ExecutionException executionexception)
        {
            com.google.common.base.t.a(executionexception.getCause(), com/google/android/apps/gsa/shared/exception/GsaIOException);
            throw new RuntimeException(executionexception);
        }
        catch (TimeoutException timeoutexception)
        {
            throw a.a(0x40020, timeoutexception);
        }
        return n1;
    }

    public final void a()
    {
        if (!g.getAndSet(true))
        {
            e.a();
            f.c();
            d.c();
            a.b();
        }
    }

    public final void a(byte abyte0[], int k, boolean flag)
    {
        throw new UnsupportedOperationException("Legacy upload method not supported with async conections.");
    }

    public final o b()
    {
        L.a(5, "AsyncHttpConnection", "Method not supported with async connections.", new Object[0]);
        return d().a();
    }

    public final InputStream c()
    {
        L.a(5, "AsyncHttpConnection", "Method not supported with async conections.", new Object[0]);
        if (h == null)
        {
            h = new j(this, d().b(), a);
        }
        return h;
    }

    protected final void finalize()
    {
        super.finalize();
    }
}
