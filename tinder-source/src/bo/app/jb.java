// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.InputStream;

public final class jb extends InputStream
{

    private final InputStream a;
    private final long b;
    private long c;

    public jb(InputStream inputstream, long l)
    {
        a = inputstream;
        b = l;
    }

    public final int available()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = b;
        l1 = c;
        int i = (int)(l - l1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final void close()
    {
        a.close();
    }

    public final void mark(int i)
    {
        c = i;
        a.mark(i);
    }

    public final int read()
    {
        c = c + 1L;
        return a.read();
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        c = c + (long)j;
        return a.read(abyte0, i, j);
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        c = 0L;
        a.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
    {
        c = c + l;
        return a.skip(l);
    }
}
