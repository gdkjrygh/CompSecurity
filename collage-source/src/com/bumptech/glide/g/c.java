// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.g:
//            h

public class c extends InputStream
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
        ((c) (obj)).b(inputstream);
        return ((c) (obj));
        inputstream;
        obj;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    public IOException a()
    {
        return c;
    }

    public int available()
        throws IOException
    {
        return b.available();
    }

    public void b()
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

    void b(InputStream inputstream)
    {
        b = inputstream;
    }

    public void close()
        throws IOException
    {
        b.close();
    }

    public void mark(int i)
    {
        b.mark(i);
    }

    public boolean markSupported()
    {
        return b.markSupported();
    }

    public int read()
        throws IOException
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

    public int read(byte abyte0[])
        throws IOException
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

    public int read(byte abyte0[], int i, int j)
        throws IOException
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

    public void reset()
        throws IOException
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

    public long skip(long l)
        throws IOException
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
