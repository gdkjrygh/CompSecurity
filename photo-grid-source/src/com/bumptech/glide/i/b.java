// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends FilterInputStream
{

    private final long a;
    private int b;

    private b(InputStream inputstream, long l)
    {
        super(inputstream);
        a = l;
    }

    private int a(int i)
    {
        if (i >= 0)
        {
            b = b + i;
        } else
        if (a - (long)b > 0L)
        {
            throw new IOException((new StringBuilder("Failed to read all expected data, expected: ")).append(a).append(", but read: ").append(b).toString());
        }
        return i;
    }

    public static InputStream a(InputStream inputstream, long l)
    {
        return new b(inputstream, l);
    }

    public final int available()
    {
        this;
        JVM INSTR monitorenter ;
        long l = Math.max(a - (long)b, in.available());
        int i = (int)l;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a(super.read());
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        i = a(super.read(abyte0, i, j));
        this;
        JVM INSTR monitorexit ;
        return i;
        abyte0;
        throw abyte0;
    }
}
