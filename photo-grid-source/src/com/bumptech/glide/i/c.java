// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.i;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.i:
//            h

public final class c extends InputStream
{

    private static final Queue a = h.a(0);
    private InputStream b;
    private IOException c;

    c()
    {
    }

    public static c a(InputStream inputstream)
    {
        c c1;
        synchronized (a)
        {
            c1 = (c)a.poll();
        }
        obj = c1;
        if (c1 == null)
        {
            obj = new c();
        }
        obj.b = inputstream;
        return ((c) (obj));
        inputstream;
        obj;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    public final IOException a()
    {
        return c;
    }

    public final int available()
    {
        return b.available();
    }

    public final void b()
    {
        c = null;
        b = null;
        synchronized (a)
        {
            a.offer(this);
        }
        return;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void close()
    {
        b.close();
    }

    public final void mark(int i)
    {
        b.mark(i);
    }

    public final boolean markSupported()
    {
        return b.markSupported();
    }

    public final int read()
    {
        int i;
        try
        {
            i = b.read();
        }
        catch (IOException ioexception)
        {
            c = ioexception;
            return -1;
        }
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i;
        try
        {
            i = b.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            c = abyte0;
            return -1;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        try
        {
            i = b.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            c = abyte0;
            return -1;
        }
        return i;
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        b.reset();
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
            l = b.skip(l);
        }
        catch (IOException ioexception)
        {
            c = ioexception;
            return 0L;
        }
        return l;
    }

}
