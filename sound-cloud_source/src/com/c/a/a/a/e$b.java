// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.g;
import c.x;
import c.z;
import java.io.IOException;

// Referenced classes of package com.c.a.a.a:
//            e

private final class <init>
    implements x
{

    final com.c.a.a.a.e a;
    private boolean b;

    public final void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = true;
        a.d.b("0\r\n\r\n");
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
        boolean flag = b;
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

    public final z timeout()
    {
        return a.d.timeout();
    }

    public final void write(e e1, long l)
        throws IOException
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        if (l == 0L)
        {
            return;
        } else
        {
            a.d.i(l);
            a.d.b("\r\n");
            a.d.write(e1, l);
            a.d.b("\r\n");
            return;
        }
    }

    private ion(com.c.a.a.a.e e1)
    {
        a = e1;
        super();
    }

    (com.c.a.a.a.e e1, byte byte0)
    {
        this(e1);
    }
}
