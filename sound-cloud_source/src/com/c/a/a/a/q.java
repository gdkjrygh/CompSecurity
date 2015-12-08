// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.x;
import c.z;
import com.c.a.a.i;
import java.io.IOException;
import java.net.ProtocolException;

public final class q
    implements x
{

    public final e a;
    private boolean b;
    private final int c;

    public q()
    {
        this(-1);
    }

    public q(int j)
    {
        a = new e();
        c = j;
    }

    public final void a(x x1)
        throws IOException
    {
        e e1 = new e();
        a.a(e1, 0L, a.b);
        x1.write(e1, e1.b);
    }

    public final void close()
        throws IOException
    {
        if (!b)
        {
            b = true;
            if (a.b < (long)c)
            {
                throw new ProtocolException((new StringBuilder("content-length promised ")).append(c).append(" bytes, but received ").append(a.b).toString());
            }
        }
    }

    public final void flush()
        throws IOException
    {
    }

    public final z timeout()
    {
        return z.b;
    }

    public final void write(e e1, long l)
        throws IOException
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        i.a(e1.b, 0L, l);
        if (c != -1 && a.b > (long)c - l)
        {
            throw new ProtocolException((new StringBuilder("exceeded content-length limit of ")).append(c).append(" bytes").toString());
        } else
        {
            a.write(e1, l);
            return;
        }
    }
}
