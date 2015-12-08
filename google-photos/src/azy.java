// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class azy extends InputStream
{

    private final ByteBuffer a;
    private int b;

    public azy(ByteBuffer bytebuffer)
    {
        b = -1;
        a = bytebuffer;
    }

    public final int available()
    {
        return a.remaining();
    }

    public final void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b = a.position();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean markSupported()
    {
        return true;
    }

    public final int read()
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            return a.get();
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            j = Math.min(j, available());
            a.get(abyte0, i, j);
            return j;
        }
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == -1)
        {
            throw new IOException("Cannot reset to unset mark position");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a.position(b);
        this;
        JVM INSTR monitorexit ;
    }

    public final long skip(long l)
    {
        if (!a.hasRemaining())
        {
            return -1L;
        } else
        {
            l = Math.min(l, available());
            a.position((int)((long)a.position() + l));
            return l;
        }
    }
}
