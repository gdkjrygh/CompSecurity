// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            ErrorCode, SpdyConnection, Settings, HeadersMode

public final class SpdyStream
{
    private final class SpdyDataInputStream extends InputStream
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
            if (errorCode != null)
            {
                throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
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
            if (readTimeoutMillis != 0L)
            {
                l1 = System.nanoTime() / 0xf4240L;
                l = readTimeoutMillis;
            }
            do
            {
                if (pos != -1 || finished || closed || errorCode != null)
                {
                    break MISSING_BLOCK_LABEL_141;
                }
                InterruptedException interruptedexception;
                if (readTimeoutMillis == 0L)
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
                    l = (readTimeoutMillis + l1) - System.nanoTime() / 0xf4240L;
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
            cancelStreamIfNecessary();
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
                connection.writeWindowUpdateLater(id, unacknowledgedBytes);
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
        static boolean access$202(SpdyDataInputStream spdydatainputstream, boolean flag)
        {
            spdydatainputstream.finished = flag;
            return flag;
        }

*/


        private SpdyDataInputStream()
        {
            this$0 = SpdyStream.this;
            super();
            buffer = new byte[0x10000];
            pos = -1;
            unacknowledgedBytes = 0;
        }

    }

    private final class SpdyDataOutputStream extends OutputStream
    {

        static final boolean $assertionsDisabled;
        private final byte buffer[];
        private boolean closed;
        private boolean finished;
        private int pos;
        final SpdyStream this$0;
        private int unacknowledgedBytes;

        private void checkNotClosed()
            throws IOException
        {
            SpdyStream spdystream = SpdyStream.this;
            spdystream;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("stream closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            spdystream;
            JVM INSTR monitorexit ;
            throw exception;
            if (finished)
            {
                throw new IOException("stream finished");
            }
            if (errorCode != null)
            {
                throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
            }
            spdystream;
            JVM INSTR monitorexit ;
        }

        private void waitUntilWritable(int i, boolean flag)
            throws IOException
        {
_L1:
            if (unacknowledgedBytes + i < writeWindowSize)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            wait();
            if (!flag)
            {
                try
                {
                    if (closed)
                    {
                        throw new IOException("stream closed");
                    }
                }
                catch (InterruptedException interruptedexception)
                {
                    throw new InterruptedIOException();
                }
            }
            if (finished)
            {
                throw new IOException("stream finished");
            }
            if (errorCode != null)
            {
                throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
            }
              goto _L1
        }

        private void writeFrame(boolean flag)
            throws IOException
        {
            if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
            int i = pos;
            synchronized (SpdyStream.this)
            {
                waitUntilWritable(i, flag);
                unacknowledgedBytes = unacknowledgedBytes + i;
            }
            connection.writeData(id, flag, buffer, 0, pos);
            pos = 0;
            return;
            exception;
            spdystream;
            JVM INSTR monitorexit ;
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
            closed = true;
            spdystream;
            JVM INSTR monitorexit ;
            if (!out.finished)
            {
                writeFrame(true);
            }
            connection.flush();
            cancelStreamIfNecessary();
            return;
            exception;
            spdystream;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void flush()
            throws IOException
        {
            if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
            checkNotClosed();
            if (pos > 0)
            {
                writeFrame(false);
                connection.flush();
            }
        }

        public void write(int i)
            throws IOException
        {
            Util.writeSingleByte(this, i);
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
            Util.checkOffsetAndCount(abyte0.length, i, j);
            checkNotClosed();
            int k;
            for (; j > 0; j -= k)
            {
                if (pos == buffer.length)
                {
                    writeFrame(false);
                }
                k = Math.min(j, buffer.length - pos);
                System.arraycopy(abyte0, i, buffer, pos, k);
                pos = pos + k;
                i += k;
            }

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
        static boolean access$302(SpdyDataOutputStream spdydataoutputstream, boolean flag)
        {
            spdydataoutputstream.finished = flag;
            return flag;
        }

*/




/*
        static int access$602(SpdyDataOutputStream spdydataoutputstream, int i)
        {
            spdydataoutputstream.unacknowledgedBytes = i;
            return i;
        }

*/

        private SpdyDataOutputStream()
        {
            this$0 = SpdyStream.this;
            super();
            buffer = new byte[8192];
            pos = 0;
            unacknowledgedBytes = 0;
        }

    }


    static final boolean $assertionsDisabled;
    public static final int WINDOW_UPDATE_THRESHOLD = 32768;
    private final SpdyConnection connection;
    private ErrorCode errorCode;
    private final int id;
    private final SpdyDataInputStream in = new SpdyDataInputStream();
    private final SpdyDataOutputStream out = new SpdyDataOutputStream();
    private final int priority;
    private long readTimeoutMillis;
    private final List requestHeaders;
    private List responseHeaders;
    private int writeWindowSize;

    SpdyStream(int i, SpdyConnection spdyconnection, boolean flag, boolean flag1, int j, List list, Settings settings)
    {
        readTimeoutMillis = 0L;
        errorCode = null;
        if (spdyconnection == null)
        {
            throw new NullPointerException("connection == null");
        }
        if (list == null)
        {
            throw new NullPointerException("requestHeaders == null");
        } else
        {
            id = i;
            connection = spdyconnection;
            in.finished = flag1;
            out.finished = flag;
            priority = j;
            requestHeaders = list;
            setSettings(settings);
            return;
        }
    }

    private void cancelStreamIfNecessary()
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (in.finished || !in.closed || !out.finished && !out.closed)
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
        if (!in.finished || !out.finished)
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

    private void setSettings(Settings settings)
    {
        int i = 0x10000;
        if (!$assertionsDisabled && !Thread.holdsLock(connection))
        {
            throw new AssertionError();
        }
        if (settings != null)
        {
            i = settings.getInitialWindowSize(0x10000);
        }
        writeWindowSize = i;
    }

    public void close(ErrorCode errorcode)
        throws IOException
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

    public SpdyConnection getConnection()
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

    public InputStream getInputStream()
    {
        return in;
    }

    public OutputStream getOutputStream()
    {
        this;
        JVM INSTR monitorenter ;
        if (responseHeaders == null && !isLocallyInitiated())
        {
            throw new IllegalStateException("reply before requesting the output stream");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return out;
    }

    int getPriority()
    {
        return priority;
    }

    public long getReadTimeoutMillis()
    {
        return readTimeoutMillis;
    }

    public List getRequestHeaders()
    {
        return requestHeaders;
    }

    public List getResponseHeaders()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = 0L;
        l1 = 0L;
        if (readTimeoutMillis != 0L)
        {
            l1 = System.nanoTime() / 0xf4240L;
            l = readTimeoutMillis;
        }
_L3:
        if (responseHeaders != null || errorCode != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (readTimeoutMillis != 0L) goto _L2; else goto _L1
_L1:
        wait();
          goto _L3
        Object obj;
        obj;
        InterruptedIOException interruptedioexception = new InterruptedIOException();
        interruptedioexception.initCause(((Throwable) (obj)));
        throw interruptedioexception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        wait(l);
        l = (readTimeoutMillis + l1) - System.nanoTime() / 0xf4240L;
          goto _L3
        throw new SocketTimeoutException((new StringBuilder()).append("Read response header timeout. readTimeoutMillis: ").append(readTimeoutMillis).toString());
        List list;
        if (responseHeaders == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        list = responseHeaders;
        this;
        JVM INSTR monitorexit ;
        return list;
        throw new IOException((new StringBuilder()).append("stream was reset: ").append(errorCode).toString());
    }

    public boolean isLocallyInitiated()
    {
        boolean flag;
        if (id % 2 == 1)
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
        if (!in.finished && !in.closed || !out.finished && !out.closed)
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

    void receiveData(InputStream inputstream, int i)
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        } else
        {
            in.receive(inputstream, i);
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
        in.finished = true;
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

    void receiveSettings(Settings settings)
    {
        if (!$assertionsDisabled && !Thread.holdsLock(this))
        {
            throw new AssertionError();
        } else
        {
            setSettings(settings);
            notifyAll();
            return;
        }
    }

    void receiveWindowUpdate(int i)
    {
        this;
        JVM INSTR monitorenter ;
        SpdyDataOutputStream spdydataoutputstream = out;
        spdydataoutputstream.unacknowledgedBytes = spdydataoutputstream.unacknowledgedBytes - i;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void reply(List list, boolean flag)
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        boolean flag1 = false;
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
        if (isLocallyInitiated())
        {
            throw new IllegalStateException("cannot reply to a locally initiated stream");
        }
        if (responseHeaders != null)
        {
            throw new IllegalStateException("reply already sent");
        }
        responseHeaders = list;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        out.finished = true;
        flag1 = true;
        this;
        JVM INSTR monitorexit ;
        connection.writeSynReply(id, flag1, list);
        return;
    }

    public void setReadTimeout(long l)
    {
        readTimeoutMillis = l;
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







}
