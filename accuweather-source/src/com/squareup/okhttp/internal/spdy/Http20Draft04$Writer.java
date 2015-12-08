// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameWriter, Http20Draft04, ErrorCode, Settings

static final class out
    implements FrameWriter
{

    private final DataOutputStream out;

    public void close()
        throws IOException
    {
        out.close();
    }

    public void connectionHeader()
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void data(boolean flag, int i, byte abyte0[])
        throws IOException
    {
        data(flag, i, abyte0, 0, abyte0.length);
    }

    public void data(boolean flag, int i, byte abyte0[], int j, int k)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void goAway(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
    }

    public void headers(int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void noop()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ping(boolean flag, int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void rstStream(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
    }

    public void settings(Settings settings1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        settings1;
        this;
        JVM INSTR monitorexit ;
        throw settings1;
    }

    public void synReply(boolean flag, int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void windowUpdate(int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException("TODO");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (OutputStream outputstream)
    {
        out = new DataOutputStream(outputstream);
    }
}
