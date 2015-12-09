// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.amazonaws.internal:
//            c

public class e extends FilterInputStream
    implements c
{

    protected e(InputStream inputstream)
    {
        super(inputstream);
    }

    public int available()
        throws IOException
    {
        b();
        return in.available();
    }

    protected final void b()
    {
        if (Thread.interrupted())
        {
            c();
            throw new AbortedException();
        } else
        {
            return;
        }
    }

    protected void c()
    {
    }

    public void close()
        throws IOException
    {
        in.close();
        b();
    }

    public boolean d()
    {
        if (in instanceof c)
        {
            return ((c)in).d();
        } else
        {
            return false;
        }
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        in.mark(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean markSupported()
    {
        b();
        return in.markSupported();
    }

    public int read()
        throws IOException
    {
        b();
        return in.read();
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        b();
        return in.read(abyte0, i, j);
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b();
        in.reset();
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
        b();
        return in.skip(l);
    }
}
