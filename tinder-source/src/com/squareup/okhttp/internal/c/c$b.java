// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.c;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.c;
import okio.e;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.c:
//            c, b

private final class <init>
    implements r
{

    final com.squareup.okhttp.internal.c.c a;

    public final long a(c c1, long l)
        throws IOException
    {
        if (a.d)
        {
            throw new IOException("closed");
        }
        if (a.e)
        {
            throw new IllegalStateException("closed");
        }
        if (a.h == a.g)
        {
            if (a.i)
            {
                return -1L;
            }
            c.a(a);
            if (a.f != 0)
            {
                throw new ProtocolException((new StringBuilder("Expected continuation opcode. Got: ")).append(Integer.toHexString(a.f)).toString());
            }
            if (a.i && a.g == 0L)
            {
                return -1L;
            }
        }
        l = Math.min(l, a.g - a.h);
        if (a.k)
        {
            l = Math.min(l, a.m.length);
            l = a.a.a(a.m, 0, (int)l);
            if (l == -1L)
            {
                throw new EOFException();
            }
            com.squareup.okhttp.internal.c.b.a(a.m, l, a.l, a.h);
            c1.b(a.m, 0, (int)l);
        } else
        {
            long l1 = a.a.a(c1, l);
            l = l1;
            if (l1 == -1L)
            {
                throw new EOFException();
            }
        }
        a.h = a.h + l;
        return l;
    }

    public final void close()
        throws IOException
    {
        if (!a.e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a.e = true;
        if (!a.d)
        {
            a.a.f(a.g - a.h);
            while (!a.i) 
            {
                c.a(a);
                a.a.f(a.g);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final s q_()
    {
        return a.a.q_();
    }

    private (com.squareup.okhttp.internal.c.c c1)
    {
        a = c1;
        super();
    }

    a(com.squareup.okhttp.internal.c.c c1, byte byte0)
    {
        this(c1);
    }
}
