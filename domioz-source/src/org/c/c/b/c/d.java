// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.c;

import java.io.OutputStream;

final class d extends OutputStream
{

    private long a;

    private d()
    {
        a = 0L;
    }

    d(byte byte0)
    {
        this();
    }

    static long a(d d1)
    {
        return d1.a;
    }

    public final void write(int i)
    {
        a = a + 1L;
    }

    public final void write(byte abyte0[])
    {
        a = a + (long)abyte0.length;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        a = a + (long)j;
    }
}
