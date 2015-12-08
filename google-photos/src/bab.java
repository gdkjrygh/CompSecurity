// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class bab extends InputStream
{

    private static final Queue b = bag.a(0);
    public IOException a;
    private InputStream c;

    bab()
    {
    }

    public static bab a(InputStream inputstream)
    {
        bab bab1;
        synchronized (b)
        {
            bab1 = (bab)b.poll();
        }
        obj = bab1;
        if (bab1 == null)
        {
            obj = new bab();
        }
        obj.c = inputstream;
        return ((bab) (obj));
        inputstream;
        obj;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    public final void a()
    {
        a = null;
        c = null;
        synchronized (b)
        {
            b.offer(this);
        }
        return;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int available()
    {
        return c.available();
    }

    public final void close()
    {
        c.close();
    }

    public final void mark(int i)
    {
        c.mark(i);
    }

    public final boolean markSupported()
    {
        return c.markSupported();
    }

    public final int read()
    {
        int i;
        try
        {
            i = c.read();
        }
        catch (IOException ioexception)
        {
            a = ioexception;
            return -1;
        }
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i;
        try
        {
            i = c.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a = abyte0;
            return -1;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        try
        {
            i = c.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a = abyte0;
            return -1;
        }
        return i;
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        c.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
    {
        try
        {
            l = c.skip(l);
        }
        catch (IOException ioexception)
        {
            a = ioexception;
            return 0L;
        }
        return l;
    }

}
