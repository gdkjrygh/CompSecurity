// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.ad;
import c.ae;
import c.f;
import c.j;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedStream, FramedConnection, Settings, ErrorCode

final class <init>
    implements ad
{

    static final boolean $assertionsDisabled;
    private boolean closed;
    private boolean finished;
    private final long maxByteCount;
    private final f readBuffer;
    private final f receiveBuffer;
    final FramedStream this$0;

    private void checkNotClosed()
    {
        if (closed)
        {
            throw new IOException("stream closed");
        }
        if (FramedStream.access$800(FramedStream.this) != null)
        {
            throw new IOException((new StringBuilder()).append("stream was reset: ").append(FramedStream.access$800(FramedStream.this)).toString());
        } else
        {
            return;
        }
    }

    private void waitUntilReadable()
    {
        FramedStream.access$700(FramedStream.this).er();
        for (; readBuffer.a() == 0L && !finished && !closed && FramedStream.access$800(FramedStream.this) == null; FramedStream.access$900(FramedStream.this)) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        FramedStream.access$700(FramedStream.this).tAndThrowIfTimedOut();
        throw exception;
        FramedStream.access$700(FramedStream.this).tAndThrowIfTimedOut();
        return;
    }

    public void close()
    {
        synchronized (FramedStream.this)
        {
            closed = true;
            readBuffer.t();
            notifyAll();
        }
        FramedStream.access$1000(FramedStream.this);
        return;
        exception;
        framedstream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long read(f f1, long l)
    {
label0:
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
            }
            synchronized (FramedStream.this)
            {
                waitUntilReadable();
                checkNotClosed();
                if (readBuffer.a() != 0L)
                {
                    break label0;
                }
            }
            return -1L;
        }
        l = readBuffer.read(f1, Math.min(l, readBuffer.a()));
        f1 = FramedStream.this;
        f1.unacknowledgedBytesRead = ((FramedStream) (f1)).unacknowledgedBytesRead + l;
        if (unacknowledgedBytesRead >= (long)(FramedStream.access$500(FramedStream.this).okHttpSettings.getInitialWindowSize(0x10000) / 2))
        {
            FramedStream.access$500(FramedStream.this).writeWindowUpdateLater(FramedStream.access$600(FramedStream.this), unacknowledgedBytesRead);
            unacknowledgedBytesRead = 0L;
        }
        obj;
        JVM INSTR monitorexit ;
        synchronized (FramedStream.access$500(FramedStream.this))
        {
            obj = FramedStream.access$500(FramedStream.this);
            obj.unacknowledgedBytesRead = ((FramedConnection) (obj)).unacknowledgedBytesRead + l;
            if (FramedStream.access$500(FramedStream.this).unacknowledgedBytesRead >= (long)(FramedStream.access$500(FramedStream.this).okHttpSettings.getInitialWindowSize(0x10000) / 2))
            {
                FramedStream.access$500(FramedStream.this).writeWindowUpdateLater(0, FramedStream.access$500(FramedStream.this).unacknowledgedBytesRead);
                FramedStream.access$500(FramedStream.this).unacknowledgedBytesRead = 0L;
            }
        }
        return l;
        obj;
        f1;
        JVM INSTR monitorexit ;
        throw obj;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
    }

    void receive(j j1, long l)
    {
        long l1;
        l1 = l;
        if (!$assertionsDisabled)
        {
            l1 = l;
            if (Thread.holdsLock(FramedStream.this))
            {
                throw new AssertionError();
            }
        }
          goto _L1
_L3:
        l1 -= l;
        FramedStream framedstream = FramedStream.this;
        framedstream;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (readBuffer.a() == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        readBuffer.a(receiveBuffer);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        notifyAll();
        framedstream;
        JVM INSTR monitorexit ;
_L1:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        framedstream = FramedStream.this;
        framedstream;
        JVM INSTR monitorenter ;
        flag1 = finished;
        if (readBuffer.a() + l1 > maxByteCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        framedstream;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        j1.g(l1);
        closeLater(ErrorCode.FLOW_CONTROL_ERROR);
        return;
        j1;
        framedstream;
        JVM INSTR monitorexit ;
        throw j1;
        if (flag1)
        {
            j1.g(l1);
            return;
        }
        l = j1.read(receiveBuffer, l1);
        if (l != -1L) goto _L3; else goto _L2
_L2:
        throw new EOFException();
        j1;
        framedstream;
        JVM INSTR monitorexit ;
        throw j1;
    }

    public ae timeout()
    {
        return FramedStream.access$700(FramedStream.this);
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/framed/FramedStream.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



/*
    static boolean access$102( , boolean flag)
    {
        .finished = flag;
        return flag;
    }

*/


    private finished(long l)
    {
        this$0 = FramedStream.this;
        super();
        receiveBuffer = new f();
        readBuffer = new f();
        maxByteCount = l;
    }

    maxByteCount(long l, maxByteCount maxbytecount)
    {
        this(l);
    }
}
