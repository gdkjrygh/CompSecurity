// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.a:
//            d, a

public final class c
{

    final a a;
    private final d b;
    private final boolean c[];
    private boolean d;

    private c(a a1, d d1)
    {
        a = a1;
        super();
        b = d1;
        if (com.bumptech.glide.a.d.e(d1))
        {
            a1 = null;
        } else
        {
            a1 = new boolean[com.bumptech.glide.a.a.f(a1)];
        }
        c = a1;
    }

    c(a a1, d d1, byte byte0)
    {
        this(a1, d1);
    }

    static d a(c c1)
    {
        return c1.b;
    }

    static boolean[] b(c c1)
    {
        return c1.c;
    }

    public final File a()
    {
        a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (com.bumptech.glide.a.d.b(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        File file;
        if (!com.bumptech.glide.a.d.e(b))
        {
            c[0] = true;
        }
        file = b.b[0];
        if (!com.bumptech.glide.a.a.g(a).exists())
        {
            com.bumptech.glide.a.a.g(a).mkdirs();
        }
        a1;
        JVM INSTR monitorexit ;
        return file;
    }

    public final void b()
    {
        com.bumptech.glide.a.a.a(a, this, true);
        d = true;
    }

    public final void c()
    {
        com.bumptech.glide.a.a.a(a, this, false);
    }

    public final void d()
    {
        if (d)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        c();
        return;
        IOException ioexception;
        ioexception;
    }
}
