// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.h;
import java.io.IOException;

// Referenced classes of package com.c.a.a.a:
//            e

private final class <init> extends <init>
{

    final com.c.a.a.a.e c;
    private boolean d;

    public final long a(e e1, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (a)
        {
            throw new IllegalStateException("closed");
        }
        if (d)
        {
            return -1L;
        }
        l = c.c.a(e1, l);
        if (l == -1L)
        {
            d = true;
            a(false);
            return -1L;
        } else
        {
            return l;
        }
    }

    public final void close()
        throws IOException
    {
        if (a)
        {
            return;
        }
        if (!d)
        {
            a();
        }
        a = true;
    }

    private ion(com.c.a.a.a.e e1)
    {
        c = e1;
        super(e1, (byte)0);
    }

    <init>(com.c.a.a.a.e e1, byte byte0)
    {
        this(e1);
    }
}
