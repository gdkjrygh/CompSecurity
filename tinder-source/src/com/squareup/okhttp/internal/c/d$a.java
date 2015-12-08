// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import java.io.IOException;
import java.util.Random;
import okio.c;
import okio.d;
import okio.q;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            d

private final class <init>
    implements q
{

    final com.squareup.okhttp.internal.c.d a;
    private com.squareup.okhttp.ws.ocket.PayloadType b;
    private boolean c;

    public final void a_(c c1, long l)
        throws IOException
    {
        a.a(b, c1, l, c, false);
        c = false;
    }

    public final void close()
        throws IOException
    {
        if (a.d)
        {
            throw new IOException("closed");
        }
        d d1 = a.b;
        d1;
        JVM INSTR monitorenter ;
        a.b.h(128);
        if (!a.a)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        a.b.h(128);
        a.c.nextBytes(a.f);
        a.b.c(a.f);
_L1:
        a.b.flush();
        a.e = false;
        return;
        a.b.h(0);
          goto _L1
        Exception exception;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void flush()
        throws IOException
    {
        if (a.d)
        {
            throw new IOException("closed");
        }
        synchronized (a.b)
        {
            a.b.flush();
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final s q_()
    {
        return a.b.q_();
    }

    private yloadType(com.squareup.okhttp.internal.c.d d1)
    {
        a = d1;
        super();
    }

    a(com.squareup.okhttp.internal.c.d d1, byte byte0)
    {
        this(d1);
    }
}
