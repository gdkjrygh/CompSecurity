// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.ac;
import c.ad;
import c.ae;
import c.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, Settings, ErrorCode, HeadersMode

public final class FramedStream
{

    static final boolean $assertionsDisabled;
    long bytesLeftInWriteWindow;
    private final FramedConnection connection;
    private ErrorCode errorCode;
    private final int id;
    private final StreamTimeout readTimeout = new StreamTimeout();
    private final List requestHeaders;
    private List responseHeaders;
    final FramedDataSink sink;
    private final FramedDataSource source;
    long unacknowledgedBytesRead;
    private final StreamTimeout writeTimeout = new StreamTimeout();

    FramedStream(int i, FramedConnection framedconnection, boolean flag, boolean flag1, List list)
    {
        unacknowledgedBytesRead = 0L;
        errorCode = null;
        if (framedconnection == null)
        {
            throw new NullPointerException("connection == null");
        }
        if (list == null)
        {
            throw new NullPointerException("requestHeaders == null");
        } else
        {
            id = i;
            connection = framedconnection;
            bytesLeftInWriteWindow = framedconnection.peerSettings.getInitialWindowSize(0x10000);
            source = new FramedDataSource(framedconnection.okHttpSettings.getInitialWindowSize(0x10000), null);
            sink = new FramedDataSink();
            source.finished = flag1;
            sink.finished = flag;
            requestHeaders = list;
            return;
        }
    }

    private void cancelStreamIfNecessary()
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (source.finished || !source.closed || !sink.finished && !sink.closed)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        flag1 = isOpen();
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (flag)
        {
            close(ErrorCode.CANCEL);
        } else
        if (!flag1)
        {
            connection.removeStream(id);
            return;
        }
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void checkOutNotClosed()
    {
        if (sink.closed)
        {
            throw new IOException("stream closed");
        }
        if (sink.finished)
        {
            throw new IOException("stream finished");
        }
        if (errorCode != null)
        {
            throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
        } else
        {
            return;
        }
    }

    private boolean closeInternal(ErrorCode errorcode)
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        if (errorCode == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!source.finished || !sink.finished)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        errorCode = errorcode;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        connection.removeStream(id);
        return true;
    }

    private void waitForIo()
    {
        try
        {
            wait();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            throw new InterruptedIOException();
        }
    }

    void addBytesToWriteWindow(long l)
    {
        bytesLeftInWriteWindow = bytesLeftInWriteWindow + l;
        if (l > 0L)
        {
            notifyAll();
        }
    }

    public void close(ErrorCode errorcode)
    {
        if (!closeInternal(errorcode))
        {
            return;
        } else
        {
            connection.writeSynReset(id, errorcode);
            return;
        }
    }

    public void closeLater(ErrorCode errorcode)
    {
        if (!closeInternal(errorcode))
        {
            return;
        } else
        {
            connection.writeSynResetLater(id, errorcode);
            return;
        }
    }

    public FramedConnection getConnection()
    {
        return connection;
    }

    public ErrorCode getErrorCode()
    {
        this;
        JVM INSTR monitorenter ;
        ErrorCode errorcode = errorCode;
        this;
        JVM INSTR monitorexit ;
        return errorcode;
        Exception exception;
        exception;
        throw exception;
    }

    public int getId()
    {
        return id;
    }

    public List getRequestHeaders()
    {
        return requestHeaders;
    }

    public List getResponseHeaders()
    {
        this;
        JVM INSTR monitorenter ;
        readTimeout.enter();
        while (responseHeaders == null && errorCode == null) 
        {
            waitForIo();
        }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        readTimeout.exitAndThrowIfTimedOut();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        List list;
        readTimeout.exitAndThrowIfTimedOut();
        if (responseHeaders == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        list = responseHeaders;
        this;
        JVM INSTR monitorexit ;
        return list;
        throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
    }

    public ac getSink()
    {
        this;
        JVM INSTR monitorenter ;
        if (responseHeaders == null && !isLocallyInitiated())
        {
            throw new IllegalStateException("reply before requesting the sink");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return sink;
    }

    public ad getSource()
    {
        return source;
    }

    public boolean isLocallyInitiated()
    {
        boolean flag;
        if ((id & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return connection.client == flag;
    }

    public boolean isOpen()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = errorCode;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!source.finished && !source.closed || !sink.finished && !sink.closed)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj = responseHeaders;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public ae readTimeout()
    {
        return readTimeout;
    }

    void receiveData(j j, int i)
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        } else
        {
            source.receive(j, i);
            return;
        }
    }

    void receiveFin()
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        source.finished = true;
        flag = isOpen();
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            connection.removeStream(id);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void receiveHeaders(List list, HeadersMode headersmode)
    {
        Object obj;
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        obj = null;
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (responseHeaders != null) goto _L2; else goto _L1
_L1:
        if (!headersmode.failIfHeadersAbsent()) goto _L4; else goto _L3
_L3:
        list = ErrorCode.PROTOCOL_ERROR;
_L7:
        this;
        JVM INSTR monitorexit ;
        if (list == null) goto _L6; else goto _L5
_L5:
        closeLater(list);
_L9:
        return;
_L4:
        responseHeaders = list;
        flag = isOpen();
        notifyAll();
        list = obj;
          goto _L7
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
_L2:
label0:
        {
            if (!headersmode.failIfHeadersPresent())
            {
                break label0;
            }
            list = ErrorCode.STREAM_IN_USE;
        }
          goto _L7
        headersmode = new ArrayList();
        headersmode.addAll(responseHeaders);
        headersmode.addAll(list);
        responseHeaders = headersmode;
        list = obj;
          goto _L7
_L6:
        if (flag) goto _L9; else goto _L8
_L8:
        connection.removeStream(id);
        return;
          goto _L7
    }

    void receiveRstStream(ErrorCode errorcode)
    {
        this;
        JVM INSTR monitorenter ;
        if (errorCode == null)
        {
            errorCode = errorcode;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        errorcode;
        throw errorcode;
    }

    public void reply(List list, boolean flag)
    {
        boolean flag1;
        flag1 = true;
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        throw new NullPointerException("responseHeaders == null");
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        if (responseHeaders != null)
        {
            throw new IllegalStateException("reply already sent");
        }
        responseHeaders = list;
        if (flag) goto _L2; else goto _L1
_L1:
        sink.finished = true;
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        connection.writeSynReply(id, flag, list);
        if (flag)
        {
            connection.flush();
        }
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ae writeTimeout()
    {
        return writeTimeout;
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









    private class StreamTimeout extends a
    {

        final FramedStream this$0;

        public void exitAndThrowIfTimedOut()
        {
            if (exit())
            {
                throw newTimeoutException(null);
            } else
            {
                return;
            }
        }

        protected IOException newTimeoutException(IOException ioexception)
        {
            SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
            if (ioexception != null)
            {
                sockettimeoutexception.initCause(ioexception);
            }
            return sockettimeoutexception;
        }

        protected void timedOut()
        {
            closeLater(ErrorCode.CANCEL);
        }

        StreamTimeout()
        {
            this$0 = FramedStream.this;
            super();
        }
    }


    private class FramedDataSource
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
            if (errorCode != null)
            {
                throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
            } else
            {
                return;
            }
        }

        private void waitUntilReadable()
        {
            readTimeout.enter();
            for (; readBuffer.a() == 0L && !finished && !closed && errorCode == null; waitForIo()) { }
            break MISSING_BLOCK_LABEL_69;
            Exception exception;
            exception;
            readTimeout.exitAndThrowIfTimedOut();
            throw exception;
            readTimeout.exitAndThrowIfTimedOut();
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
            cancelStreamIfNecessary();
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
            if (unacknowledgedBytesRead >= (long)(connection.okHttpSettings.getInitialWindowSize(0x10000) / 2))
            {
                connection.writeWindowUpdateLater(id, unacknowledgedBytesRead);
                unacknowledgedBytesRead = 0L;
            }
            obj;
            JVM INSTR monitorexit ;
            synchronized (connection)
            {
                obj = connection;
                obj.unacknowledgedBytesRead = ((FramedConnection) (obj)).unacknowledgedBytesRead + l;
                if (connection.unacknowledgedBytesRead >= (long)(connection.okHttpSettings.getInitialWindowSize(0x10000) / 2))
                {
                    connection.writeWindowUpdateLater(0, connection.unacknowledgedBytesRead);
                    connection.unacknowledgedBytesRead = 0L;
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
            return readTimeout;
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
        static boolean access$102(FramedDataSource frameddatasource, boolean flag)
        {
            frameddatasource.finished = flag;
            return flag;
        }

*/


        private FramedDataSource(long l)
        {
            this$0 = FramedStream.this;
            super();
            receiveBuffer = new f();
            readBuffer = new f();
            maxByteCount = l;
        }

        FramedDataSource(long l, _cls1 _pcls1)
        {
            this(l);
        }
    }


    private class FramedDataSink
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
            writeTimeout.enter();
            while (bytesLeftInWriteWindow <= 0L && !finished && !closed && errorCode == null) 
            {
                waitForIo();
            }
            break MISSING_BLOCK_LABEL_81;
            Exception exception1;
            exception1;
            writeTimeout.exitAndThrowIfTimedOut();
            throw exception1;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            long l;
            writeTimeout.exitAndThrowIfTimedOut();
            checkOutNotClosed();
            l = Math.min(bytesLeftInWriteWindow, sendBuffer.a());
            FramedStream framedstream = FramedStream.this;
            framedstream.bytesLeftInWriteWindow = framedstream.bytesLeftInWriteWindow - l;
            obj;
            JVM INSTR monitorexit ;
            writeTimeout.enter();
            int i;
            obj = connection;
            i = id;
            if (!flag) goto _L2; else goto _L1
_L1:
            if (l != sendBuffer.a()) goto _L2; else goto _L3
_L3:
            flag = true;
_L5:
            ((FramedConnection) (obj)).writeData(i, flag, sendBuffer, l);
            writeTimeout.exitAndThrowIfTimedOut();
            return;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            writeTimeout.exitAndThrowIfTimedOut();
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
                    connection.writeData(id, true, null, 0L);
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
            connection.flush();
            cancelStreamIfNecessary();
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
                checkOutNotClosed();
            }
            for (; sendBuffer.a() > 0L; connection.flush())
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
            return writeTimeout;
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
        static boolean access$202(FramedDataSink frameddatasink, boolean flag)
        {
            frameddatasink.finished = flag;
            return flag;
        }

*/


        FramedDataSink()
        {
            this$0 = FramedStream.this;
            super();
        }
    }

}
