// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, SpdyConnection, ErrorCode

private final class <init> extends InputStream
{

    static final boolean $assertionsDisabled;
    private final byte buffer[];
    private boolean closed;
    private boolean finished;
    private int limit;
    private int pos;
    final SpdyStream this$0;
    private int unacknowledgedBytes;

    private void checkNotClosed()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("stream closed");
        }
        if (SpdyStream.access$1000(SpdyStream.this) != null)
        {
            throw new IOException((new StringBuilder()).append("stream was reset: ").append(SpdyStream.access$1000(SpdyStream.this)).toString());
        } else
        {
            return;
        }
    }

    private void waitUntilReadable()
        throws IOException
    {
        long l;
        long l1;
        l1 = 0L;
        l = 0L;
        if (SpdyStream.access$900(SpdyStream.this) != 0L)
        {
            l1 = System.nanoTime() / 0xf4240L;
            l = SpdyStream.access$900(SpdyStream.this);
        }
        do
        {
            if (pos != -1 || finished || closed || SpdyStream.access$1000(SpdyStream.this) != null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            InterruptedException interruptedexception;
            if (SpdyStream.access$900(SpdyStream.this) == 0L)
            {
                wait();
                continue;
            }
            if (l <= 0L)
            {
                break;
            }
            try
            {
                wait(l);
                l = (SpdyStream.access$900(SpdyStream.this) + l1) - System.nanoTime() / 0xf4240L;
            }
            // Misplaced declaration of an exception variable
            catch (InterruptedException interruptedexception)
            {
                throw new InterruptedIOException();
            }
        } while (true);
        throw new SocketTimeoutException();
    }

    public int available()
        throws IOException
    {
label0:
        {
            synchronized (SpdyStream.this)
            {
                checkNotClosed();
                if (pos != -1)
                {
                    break label0;
                }
            }
            return 0;
        }
        int i;
        int j;
        if (limit <= pos)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        i = limit;
        j = pos;
        spdystream;
        JVM INSTR monitorexit ;
        return i - j;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
        int k;
        i = limit;
        j = buffer.length;
        k = pos;
        spdystream;
        JVM INSTR monitorexit ;
        return i + (j - k);
    }

    public void close()
        throws IOException
    {
        synchronized (SpdyStream.this)
        {
            closed = true;
            notifyAll();
        }
        SpdyStream.access$1100(SpdyStream.this);
        return;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int read()
        throws IOException
    {
        return Util.readSingleByte(this);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k;
label0:
        {
            synchronized (SpdyStream.this)
            {
                Util.checkOffsetAndCount(abyte0.length, i, j);
                waitUntilReadable();
                checkNotClosed();
                if (pos != -1)
                {
                    break label0;
                }
            }
            return -1;
        }
        k = 0;
        if (limit > pos)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        k = Math.min(j, buffer.length - pos);
        System.arraycopy(buffer, pos, abyte0, i, k);
        pos = pos + k;
        int l;
        l = 0 + k;
        k = l;
        if (pos != buffer.length)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        pos = 0;
        k = l;
        l = k;
        if (k >= j)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        j = Math.min(limit - pos, j - k);
        System.arraycopy(buffer, pos, abyte0, i + k, j);
        pos = pos + j;
        l = k + j;
        unacknowledgedBytes = unacknowledgedBytes + l;
        if (unacknowledgedBytes >= 32768)
        {
            SpdyStream.access$800(SpdyStream.this).writeWindowUpdateLater(SpdyStream.access$700(SpdyStream.this), unacknowledgedBytes);
            unacknowledgedBytes = 0;
        }
        if (pos == limit)
        {
            pos = -1;
            limit = 0;
        }
        spdystream;
        JVM INSTR monitorexit ;
        return l;
        abyte0;
        spdystream;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    void receive(InputStream inputstream, int i)
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
        {
            throw new AssertionError();
        }
        if (i == 0)
        {
            return;
        }
        SpdyStream spdystream = SpdyStream.this;
        spdystream;
        JVM INSTR monitorenter ;
        int l;
        int i1;
        int j1;
        boolean flag1;
        flag1 = finished;
        j1 = pos;
        i1 = limit;
        l = limit;
        boolean flag;
        if (i > buffer.length - available())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        spdystream;
        JVM INSTR monitorexit ;
        if (flag)
        {
            Util.skipByReading(inputstream, i);
            closeLater(ErrorCode.FLOW_CONTROL_ERROR);
            return;
        }
        break MISSING_BLOCK_LABEL_113;
        inputstream;
        spdystream;
        JVM INSTR monitorexit ;
        throw inputstream;
        if (flag1)
        {
            Util.skipByReading(inputstream, i);
            return;
        }
        int j = l;
        int k = i;
        if (j1 < l)
        {
            j = Math.min(i, buffer.length - l);
            Util.readFully(inputstream, buffer, l, j);
            l += j;
            i -= j;
            j = l;
            k = i;
            if (l == buffer.length)
            {
                j = 0;
                k = i;
            }
        }
        i = j;
        if (k > 0)
        {
            Util.readFully(inputstream, buffer, j, k);
            i = j + k;
        }
        synchronized (SpdyStream.this)
        {
            limit = i;
            if (pos == -1)
            {
                pos = i1;
                notifyAll();
            }
        }
        return;
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/spdy/SpdyStream.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



/*
    static boolean access$202( , boolean flag)
    {
        .finished = flag;
        return flag;
    }

*/


    private finished()
    {
        this$0 = SpdyStream.this;
        super();
        buffer = new byte[0x10000];
        pos = -1;
        unacknowledgedBytes = 0;
    }

    unacknowledgedBytes(unacknowledgedBytes unacknowledgedbytes)
    {
        this();
    }
}
