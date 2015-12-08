// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.b.h;
import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.util.b;
import com.google.common.b.ae;
import com.google.common.b.k;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            c, l, k, o, 
//            p

public final class j
    implements c
{

    final long a;
    final l b;
    volatile long c;
    volatile long d;
    volatile long e;
    volatile o f;
    volatile int g;
    private final b h;
    private final p i;
    private volatile long j;
    private volatile long k;
    private volatile long l;
    private volatile GsaIOException m;
    private volatile boolean n;

    protected j(l l1, b b1, p p)
    {
        j = -1L;
        k = -1L;
        l = -1L;
        g = 1;
        a = b1.a();
        b = l1;
        h = b1;
        i = p;
    }

    public final GsaIOException a(int i1, Throwable throwable)
    {
        k = h.a();
        if (throwable != null)
        {
            throwable = new GsaIOException(throwable, i1);
        } else
        {
            throwable = new GsaIOException(i1);
        }
        m = throwable;
        g = 3;
        return m;
    }

    public final void a()
    {
        n = true;
    }

    public final void a(long l1)
    {
        d = d + l1;
    }

    public final void a(o o1)
    {
        j = h.a();
        f = o1;
        if (i != null)
        {
            h.a(j);
            long l1 = j;
        }
    }

    public final void b()
    {
        l = h.a();
        if (g != 3)
        {
            ae ae1;
            k k1;
            int i1;
            if (n)
            {
                i1 = 2;
            } else
            {
                i1 = 4;
            }
            g = i1;
        }
        ae1 = com.google.android.apps.gsa.shared.b.h.a(551);
        ae1.W = new k();
        k1 = ae1.W;
        k1.b = b.m;
        k1.a = k1.a | 1;
        k1.c = c;
        k1.a = k1.a | 2;
        k1.f = d;
        k1.a = k1.a | 0x10;
        k1.e = e;
        k1.a = k1.a | 8;
        k1.d = com.google.android.apps.gsa.shared.io.k.b(b);
        k1.a = k1.a | 4;
        if (f != null)
        {
            k1 = ae1.W;
            k1.g = com.google.android.apps.gsa.shared.io.k.a(f.c);
            k1.a = k1.a | 0x20;
        }
        com.google.android.apps.gsa.shared.b.h.a(ae1);
    }

    public final void b(long l1)
    {
        c = c + l1;
    }
}
