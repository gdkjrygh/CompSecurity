// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import okio.c;
import okio.d;
import okio.i;
import okio.q;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            f

private final class <init>
    implements q
{

    final f a;
    private final i b;
    private boolean c;

    public final void a_(c c1, long l)
        throws IOException
    {
        if (c)
        {
            throw new IllegalStateException("closed");
        }
        if (l == 0L)
        {
            return;
        } else
        {
            a.d.j(l);
            a.d.b("\r\n");
            a.d.a_(c1, l);
            a.d.b("\r\n");
            return;
        }
    }

    public final void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = true;
        a.d.b("0\r\n\r\n");
        f.a(b);
        a.e = 3;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.d.flush();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final s q_()
    {
        return b;
    }

    private (f f1)
    {
        a = f1;
        super();
        b = new i(a.d.q_());
    }

    a(f f1, byte byte0)
    {
        this(f1);
    }
}
