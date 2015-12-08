// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, SpdyConnection

final class this._cls0
    implements Sink
{

    static final boolean $assertionsDisabled;
    private static final long EMIT_BUFFER_SIZE = 16384L;
    private boolean closed;
    private boolean finished;
    private final Buffer sendBuffer = new Buffer();
    final SpdyStream this$0;

    private void emitDataFrame(boolean flag)
        throws IOException
    {
        Object obj = SpdyStream.this;
        obj;
        JVM INSTR monitorenter ;
        SpdyStream.access$1100(SpdyStream.this).nter();
        for (; bytesLeftInWriteWindow <= 0L && !finished && !closed && SpdyStream.access$800(SpdyStream.this) == null; SpdyStream.access$900(SpdyStream.this)) { }
        break MISSING_BLOCK_LABEL_81;
        Exception exception1;
        exception1;
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        long l;
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        SpdyStream.access$1200(SpdyStream.this);
        l = Math.min(bytesLeftInWriteWindow, sendBuffer.size());
        SpdyStream spdystream = SpdyStream.this;
        spdystream.bytesLeftInWriteWindow = spdystream.bytesLeftInWriteWindow - l;
        obj;
        JVM INSTR monitorexit ;
        SpdyStream.access$1100(SpdyStream.this).nter();
        int i;
        obj = SpdyStream.access$500(SpdyStream.this);
        i = SpdyStream.access$600(SpdyStream.this);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l != sendBuffer.size()) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        ((SpdyConnection) (obj)).writeData(i, flag, sendBuffer, l);
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        throw exception;
    }

    public void close()
        throws IOException
    {
label0:
        {
            if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
            synchronized (SpdyStream.this)
            {
                if (!closed)
                {
                    break label0;
                }
            }
            return;
        }
        spdystream;
        JVM INSTR monitorexit ;
        if (!sink.finished)
        {
            if (sendBuffer.size() > 0L)
            {
                for (; sendBuffer.size() > 0L; emitDataFrame(true)) { }
            } else
            {
                SpdyStream.access$500(SpdyStream.this).writeData(SpdyStream.access$600(SpdyStream.this), true, null, 0L);
            }
        }
        break MISSING_BLOCK_LABEL_113;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (SpdyStream.this)
        {
            closed = true;
        }
        SpdyStream.access$500(SpdyStream.this).flush();
        SpdyStream.access$1000(SpdyStream.this);
        return;
        exception1;
        spdystream1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void flush()
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
        {
            throw new AssertionError();
        }
        synchronized (SpdyStream.this)
        {
            SpdyStream.access$1200(SpdyStream.this);
        }
        for (; sendBuffer.size() > 0L; SpdyStream.access$500(SpdyStream.this).flush())
        {
            emitDataFrame(false);
        }

        break MISSING_BLOCK_LABEL_75;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Timeout timeout()
    {
        return SpdyStream.access$1100(SpdyStream.this);
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
        {
            throw new AssertionError();
        }
        sendBuffer.write(buffer, l);
        for (; sendBuffer.size() >= 16384L; emitDataFrame(false)) { }
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


    finished()
    {
        this$0 = SpdyStream.this;
        super();
    }
}
