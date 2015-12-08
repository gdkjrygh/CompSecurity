// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.ac;
import c.ae;
import c.f;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedStream, FramedConnection

final class this._cls0
    implements ac
{

    static final boolean $assertionsDisabled;
    private static final long EMIT_BUFFER_SIZE = 16384L;
    private boolean closed;
    private boolean finished;
    private final f sendBuffer = new f();
    final FramedStream this$0;

    private void emitDataFrame(boolean flag)
    {
        Object obj = FramedStream.this;
        obj;
        JVM INSTR monitorenter ;
        FramedStream.access$1100(FramedStream.this).nter();
        for (; bytesLeftInWriteWindow <= 0L && !finished && !closed && FramedStream.access$800(FramedStream.this) == null; FramedStream.access$900(FramedStream.this)) { }
        break MISSING_BLOCK_LABEL_81;
        Exception exception1;
        exception1;
        FramedStream.access$1100(FramedStream.this).xitAndThrowIfTimedOut();
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        long l;
        FramedStream.access$1100(FramedStream.this).xitAndThrowIfTimedOut();
        FramedStream.access$1200(FramedStream.this);
        l = Math.min(bytesLeftInWriteWindow, sendBuffer.a());
        FramedStream framedstream = FramedStream.this;
        framedstream.bytesLeftInWriteWindow = framedstream.bytesLeftInWriteWindow - l;
        obj;
        JVM INSTR monitorexit ;
        FramedStream.access$1100(FramedStream.this).nter();
        int i;
        obj = FramedStream.access$500(FramedStream.this);
        i = FramedStream.access$600(FramedStream.this);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l != sendBuffer.a()) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        ((FramedConnection) (obj)).writeData(i, flag, sendBuffer, l);
        FramedStream.access$1100(FramedStream.this).xitAndThrowIfTimedOut();
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        FramedStream.access$1100(FramedStream.this).xitAndThrowIfTimedOut();
        throw exception;
    }

    public void close()
    {
label0:
        {
            if (!$assertionsDisabled && Thread.holdsLock(FramedStream.this))
            {
                throw new AssertionError();
            }
            synchronized (FramedStream.this)
            {
                if (!closed)
                {
                    break label0;
                }
            }
            return;
        }
        framedstream;
        JVM INSTR monitorexit ;
        if (!sink.finished)
        {
            if (sendBuffer.a() > 0L)
            {
                for (; sendBuffer.a() > 0L; emitDataFrame(true)) { }
            } else
            {
                FramedStream.access$500(FramedStream.this).writeData(FramedStream.access$600(FramedStream.this), true, null, 0L);
            }
        }
        break MISSING_BLOCK_LABEL_113;
        exception;
        framedstream;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (FramedStream.this)
        {
            closed = true;
        }
        FramedStream.access$500(FramedStream.this).flush();
        FramedStream.access$1000(FramedStream.this);
        return;
        exception1;
        framedstream1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void flush()
    {
        if (!$assertionsDisabled && Thread.holdsLock(FramedStream.this))
        {
            throw new AssertionError();
        }
        synchronized (FramedStream.this)
        {
            FramedStream.access$1200(FramedStream.this);
        }
        for (; sendBuffer.a() > 0L; FramedStream.access$500(FramedStream.this).flush())
        {
            emitDataFrame(false);
        }

        break MISSING_BLOCK_LABEL_75;
        exception;
        framedstream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ae timeout()
    {
        return FramedStream.access$1100(FramedStream.this);
    }

    public void write(f f1, long l)
    {
        if (!$assertionsDisabled && Thread.holdsLock(FramedStream.this))
        {
            throw new AssertionError();
        }
        sendBuffer.write(f1, l);
        for (; sendBuffer.a() >= 16384L; emitDataFrame(false)) { }
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
    static boolean access$202( , boolean flag)
    {
        .finished = flag;
        return flag;
    }

*/


    finished()
    {
        this$0 = FramedStream.this;
        super();
    }
}
