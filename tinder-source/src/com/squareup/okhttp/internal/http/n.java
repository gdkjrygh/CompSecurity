// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.net.ProtocolException;
import okio.c;
import okio.q;
import okio.s;

public final class n
    implements q
{

    public final c a;
    private boolean b;
    private final int c;

    public n()
    {
        this(-1);
    }

    public n(int i)
    {
        a = new c();
        c = i;
    }

    public final void a(q q1)
        throws IOException
    {
        c c1 = new c();
        a.a(c1, 0L, a.b);
        q1.a_(c1, c1.b);
    }

    public final void a_(c c1, long l)
        throws IOException
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        k.a(c1.b, l);
        if (c != -1 && a.b > (long)c - l)
        {
            throw new ProtocolException((new StringBuilder("exceeded content-length limit of ")).append(c).append(" bytes").toString());
        } else
        {
            a.a_(c1, l);
            return;
        }
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

    public final s q_()
    {
        return s.b;
    }
}
