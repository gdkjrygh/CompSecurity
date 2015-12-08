// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class baa extends FilterInputStream
{

    private final long a;
    private int b;

    private baa(InputStream inputstream, long l)
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
            String s = String.valueOf("Failed to read all expected data, expected: ");
            long l = a;
            i = b;
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 43)).append(s).append(l).append(", but read: ").append(i).toString());
        }
        return i;
    }

    public static InputStream a(InputStream inputstream, long l)
    {
        return new baa(inputstream, l);
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
