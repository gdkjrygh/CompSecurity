// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.a.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.q;

// Referenced classes of package com.squareup.okhttp.internal:
//            b, c

public final class <init>
{

    final d a;
    final boolean b[];
    boolean c;
    final b d;
    private boolean e;

    public final q a(int i)
        throws IOException
    {
        b b1 = d;
        b1;
        JVM INSTR monitorenter ;
        if (a.f != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        if (!a.e)
        {
            b[i] = true;
        }
        obj1 = a.d[i];
        obj1 = com.squareup.okhttp.internal.b.i(d).b(((java.io.File) (obj1)));
        obj1 = new c(((q) (obj1))) {

            final b.a a;

            protected final void a()
            {
                synchronized (a.d)
                {
                    a.c = true;
                }
                return;
                exception;
                b2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = b.a.this;
                super(q);
            }
        };
        b1;
        JVM INSTR monitorexit ;
        return ((q) (obj1));
        obj1;
        obj1 = com.squareup.okhttp.internal.b.b();
        b1;
        JVM INSTR monitorexit ;
        return ((q) (obj1));
    }

    public final void a()
        throws IOException
    {
        b b1 = d;
        b1;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        com.squareup.okhttp.internal.b.a(d, this, false);
        com.squareup.okhttp.internal.b.a(d, a);
_L2:
        e = true;
        return;
        com.squareup.okhttp.internal.b.a(d, this, true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
        throws IOException
    {
        synchronized (d)
        {
            com.squareup.okhttp.internal.b.a(d, this, false);
        }
        return;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private nit>(b b1, nit> nit>)
    {
        d = b1;
        super();
        a = nit>;
        if (nit>.e)
        {
            b1 = null;
        } else
        {
            b1 = new boolean[com.squareup.okhttp.internal.b.h(b1)];
        }
        b = b1;
    }

    b(b b1, b b2, byte byte0)
    {
        this(b1, b2);
    }
}
