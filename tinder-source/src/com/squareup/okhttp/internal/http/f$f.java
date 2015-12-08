// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import okio.c;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            f

private final class <init> extends <init>
{

    final f d;
    private boolean e;

    public final long a(c c, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        if (e)
        {
            return -1L;
        }
        l = d.c.a(c, l);
        if (l == -1L)
        {
            e = true;
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
        if (b)
        {
            return;
        }
        if (!e)
        {
            b();
        }
        b = true;
    }

    private (f f1)
    {
        d = f1;
        super(f1, (byte)0);
    }

    <init>(f f1, byte byte0)
    {
        this(f1);
    }
}
