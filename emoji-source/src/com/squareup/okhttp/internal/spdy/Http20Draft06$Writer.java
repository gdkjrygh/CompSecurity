// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameWriter, Http20Draft06, Settings, ErrorCode

static final class hpackBuffer
    implements FrameWriter
{

    private final boolean client;
    private final ByteArrayOutputStream hpackBuffer = new ByteArrayOutputStream();
    private final headers hpackWriter;
    private final DataOutputStream out;

    private void headers(boolean flag, int i, int j, List list)
        throws IOException
    {
        hpackBuffer.reset();
        hpackWriter.ders(list);
        int i1 = hpackBuffer.size();
        int k = 4;
        if (flag)
        {
            k = 4 | 1;
        }
        int l = k;
        if (j != -1)
        {
            l = k | 8;
        }
        out.writeInt((0xffff & i1) << 16 | 0x100 | l & 0xff);
        out.writeInt(i & 0x7fffffff);
        if (j != -1)
        {
            out.writeInt(j & 0x7fffffff);
        }
        hpackBuffer.writeTo(out);
    }

    public void close()
        throws IOException
    {
        out.close();
    }

    public void connectionHeader()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = client;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        out.write(Http20Draft06.access$000());
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
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
        int l;
        l = 0;
        if (flag)
        {
            l = false | true;
        }
        out.writeInt((0xffff & k) << 16 | 0 | l & 0xff);
        out.writeInt(0x7fffffff & i);
        out.write(abyte0, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
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
    }

    public void headers(int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        headers(false, i, -1, list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void noop()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException();
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
        int i = settings1.size();
        out.writeInt((0xffff & i * 8) << 16 | 0x400 | 0);
        out.writeInt(0);
        int j = 0;
_L2:
        if (j >= 10)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!settings1.isSet(j))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        out.writeInt(0xffffff & j);
        out.writeInt(settings1.get(j));
        break MISSING_BLOCK_LABEL_91;
        settings1;
        throw settings1;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void synReply(boolean flag, int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        headers(flag, i, -1, list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new UnsupportedOperationException();
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        headers(flag, i, k, list);
        this;
        JVM INSTR monitorexit ;
    }

    public void windowUpdate(int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
    }

    (OutputStream outputstream, boolean flag)
    {
        out = new DataOutputStream(outputstream);
        client = flag;
        hpackWriter = new hpackWriter(hpackBuffer);
    }
}
