// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Variant, SpdyStream, Ping, FrameReader, 
//            FrameWriter, ErrorCode, IncomingStreamHandler, Settings

public final class SpdyConnection
    implements Closeable
{
    public static class Builder
    {

        private boolean client;
        private IncomingStreamHandler handler;
        private String hostName;
        private InputStream in;
        private OutputStream out;
        private Variant variant;

        public SpdyConnection build()
        {
            return new SpdyConnection(this);
        }

        public Builder handler(IncomingStreamHandler incomingstreamhandler)
        {
            handler = incomingstreamhandler;
            return this;
        }

        public Builder http20Draft04()
        {
            variant = Variant.HTTP_20_DRAFT_04;
            return this;
        }

        public Builder spdy3()
        {
            variant = Variant.SPDY3;
            return this;
        }







        public Builder(String s, boolean flag, InputStream inputstream, OutputStream outputstream)
        {
            handler = IncomingStreamHandler.REFUSE_INCOMING_STREAMS;
            variant = Variant.SPDY3;
            hostName = s;
            client = flag;
            in = inputstream;
            out = outputstream;
        }

        public Builder(String s, boolean flag, Socket socket)
            throws IOException
        {
            this(s, flag, socket.getInputStream(), socket.getOutputStream());
        }

        public Builder(boolean flag, InputStream inputstream, OutputStream outputstream)
        {
            this("", flag, inputstream, outputstream);
        }

        public Builder(boolean flag, Socket socket)
            throws IOException
        {
            this("", flag, socket.getInputStream(), socket.getOutputStream());
        }
    }

    private class Reader
        implements Runnable, FrameReader.Handler
    {

        final SpdyConnection this$0;

        public void data(boolean flag, int i, InputStream inputstream, int j)
            throws IOException
        {
            SpdyStream spdystream = getStream(i);
            if (spdystream == null)
            {
                writeSynResetLater(i, ErrorCode.INVALID_STREAM);
                Util.skipByReading(inputstream, j);
            } else
            {
                spdystream.receiveData(inputstream, j);
                if (flag)
                {
                    spdystream.receiveFin();
                    return;
                }
            }
        }

        public void goAway(int i, ErrorCode errorcode)
        {
            errorcode = SpdyConnection.this;
            errorcode;
            JVM INSTR monitorenter ;
            shutdown = true;
            Iterator iterator = streams.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((Integer)entry.getKey()).intValue() > i && ((SpdyStream)entry.getValue()).isLocallyInitiated())
                {
                    ((SpdyStream)entry.getValue()).receiveRstStream(ErrorCode.REFUSED_STREAM);
                    iterator.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_117;
            Exception exception;
            exception;
            errorcode;
            JVM INSTR monitorexit ;
            throw exception;
            errorcode;
            JVM INSTR monitorexit ;
        }

        public void headers(int i, List list)
            throws IOException
        {
            SpdyStream spdystream = getStream(i);
            if (spdystream != null)
            {
                spdystream.receiveHeaders(list);
            }
        }

        public void noop()
        {
        }

        public void ping(boolean flag, int i, int j)
        {
            if (flag)
            {
                Ping ping1 = removePing(i);
                if (ping1 != null)
                {
                    ping1.receive();
                }
                return;
            } else
            {
                writePingLater(true, i, j, null);
                return;
            }
        }

        public void priority(int i, int j)
        {
        }

        public void rstStream(int i, ErrorCode errorcode)
        {
            SpdyStream spdystream = removeStream(i);
            if (spdystream != null)
            {
                spdystream.receiveRstStream(errorcode);
            }
        }

        public void run()
        {
            ErrorCode errorcode1;
            ErrorCode errorcode2;
            errorcode1 = ErrorCode.INTERNAL_ERROR;
            errorcode2 = ErrorCode.INTERNAL_ERROR;
_L2:
            Object obj;
            ErrorCode errorcode;
            errorcode = errorcode1;
            obj = errorcode1;
            if (frameReader.nextFrame(this)) goto _L2; else goto _L1
_L1:
            errorcode = errorcode1;
            obj = errorcode1;
            errorcode1 = ErrorCode.NO_ERROR;
            errorcode = errorcode1;
            obj = errorcode1;
            ErrorCode errorcode3 = ErrorCode.CANCEL;
            Exception exception;
            try
            {
                close(errorcode1, errorcode3);
                return;
            }
            catch (IOException ioexception1)
            {
                return;
            }
            obj;
            obj = errorcode;
            errorcode = ErrorCode.PROTOCOL_ERROR;
            obj = errorcode;
            errorcode1 = ErrorCode.PROTOCOL_ERROR;
            try
            {
                close(errorcode, errorcode1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            exception;
            try
            {
                close(((ErrorCode) (obj)), errorcode2);
            }
            catch (IOException ioexception) { }
            throw exception;
        }

        public void settings(boolean flag, Settings settings1)
        {
            SpdyStream spdystream = null;
            spdyconnection = SpdyConnection.this;
            spdyconnection;
            JVM INSTR monitorenter ;
            if (SpdyConnection.this.settings != null && !flag) goto _L2; else goto _L1
_L1:
            SpdyConnection.this.settings = settings1;
_L6:
            settings1 = spdystream;
            if (!streams.isEmpty())
            {
                settings1 = (SpdyStream[])streams.values().toArray(new SpdyStream[streams.size()]);
            }
            spdyconnection;
            JVM INSTR monitorexit ;
            int i;
            int j;
            if (settings1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            j = settings1.length;
            i = 0;
_L4:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            spdystream = settings1[i];
            spdystream;
            JVM INSTR monitorenter ;
            synchronized (SpdyConnection.this)
            {
                spdystream.receiveSettings(SpdyConnection.this.settings);
            }
            spdystream;
            JVM INSTR monitorexit ;
            i++;
            if (true) goto _L4; else goto _L3
_L3:
            break; /* Loop/switch isn't completed */
_L2:
            SpdyConnection.this.settings.merge(settings1);
            if (true) goto _L6; else goto _L5
            settings1;
            spdyconnection;
            JVM INSTR monitorexit ;
            throw settings1;
            settings1;
            spdyconnection;
            JVM INSTR monitorexit ;
            throw settings1;
            settings1;
            spdystream;
            JVM INSTR monitorexit ;
            throw settings1;
_L5:
        }

        public void synReply(boolean flag, int i, List list)
            throws IOException
        {
            SpdyStream spdystream = getStream(i);
            if (spdystream == null)
            {
                writeSynResetLater(i, ErrorCode.INVALID_STREAM);
            } else
            {
                spdystream.receiveReply(list);
                if (flag)
                {
                    spdystream.receiveFin();
                    return;
                }
            }
        }

        public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
        {
label0:
            {
                synchronized (SpdyConnection.this)
                {
                    list = new SpdyStream(i, SpdyConnection.this, flag, flag1, k, l, list, SpdyConnection.this.settings);
                    if (!shutdown)
                    {
                        break label0;
                    }
                }
                return;
            }
            SpdyStream spdystream;
            lastGoodStreamId = i;
            spdystream = (SpdyStream)streams.put(Integer.valueOf(i), list);
            spdyconnection;
            JVM INSTR monitorexit ;
            if (spdystream != null)
            {
                spdystream.closeLater(ErrorCode.PROTOCOL_ERROR);
                removeStream(i);
                return;
            } else
            {
                SpdyConnection.executor.submit("OkHttp SPDY Callback %s stream %d". new NamedRunnable(new Object[] {
                    hostName, Integer.valueOf(i)
                }, list) {

                    final Reader this$1;
                    final SpdyStream val$synStream;

                    public void execute()
                    {
                        try
                        {
                            handler.receive(synStream);
                            return;
                        }
                        catch (IOException ioexception)
                        {
                            throw new RuntimeException(ioexception);
                        }
                    }

            transient 
            {
                this$1 = final_reader;
                synStream = spdystream;
                super(String.this, aobj);
            }
                });
                return;
            }
            list;
            spdyconnection;
            JVM INSTR monitorexit ;
            throw list;
        }

        public void windowUpdate(int i, int j, boolean flag)
        {
            SpdyStream spdystream;
            if (i != 0)
            {
                if ((spdystream = getStream(i)) != null)
                {
                    spdystream.receiveWindowUpdate(j);
                    return;
                }
            }
        }

        private Reader()
        {
            this$0 = SpdyConnection.this;
            super();
        }

    }


    static final boolean $assertionsDisabled;
    private static final ExecutorService executor;
    final boolean client;
    private final FrameReader frameReader;
    private final FrameWriter frameWriter;
    private final IncomingStreamHandler handler;
    private final String hostName;
    private long idleStartTimeNs;
    private int lastGoodStreamId;
    private int nextPingId;
    private int nextStreamId;
    private Map pings;
    Settings settings;
    private boolean shutdown;
    private final Map streams;
    final Variant variant;

    private SpdyConnection(Builder builder)
    {
        boolean flag = true;
        super();
        streams = new HashMap();
        idleStartTimeNs = System.nanoTime();
        variant = builder.variant;
        client = builder.client;
        handler = builder.handler;
        frameReader = variant.newReader(builder.in, client);
        frameWriter = variant.newWriter(builder.out, client);
        int i;
        if (builder.client)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        nextStreamId = i;
        if (builder.client)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 2;
        }
        nextPingId = i;
        hostName = builder.hostName;
        (new Thread(new Reader(), (new StringBuilder()).append("Spdy Reader ").append(hostName).toString())).start();
    }


    private void close(ErrorCode errorcode, ErrorCode errorcode1)
        throws IOException
    {
        Object obj;
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        obj = null;
        shutdown(errorcode);
        errorcode = ((ErrorCode) (obj));
_L4:
        SpdyStream aspdystream[] = null;
        Ping aping[] = null;
        this;
        JVM INSTR monitorenter ;
        if (!streams.isEmpty())
        {
            aspdystream = (SpdyStream[])streams.values().toArray(new SpdyStream[streams.size()]);
            streams.clear();
            setIdle(false);
        }
        if (pings != null)
        {
            aping = (Ping[])pings.values().toArray(new Ping[pings.size()]);
            pings = null;
        }
        this;
        JVM INSTR monitorexit ;
        obj = errorcode;
        if (aspdystream == null) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = aspdystream.length;
        i = 0;
_L3:
        obj = errorcode;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aspdystream[i];
        ((SpdyStream) (obj)).close(errorcode1);
        obj = errorcode;
_L5:
        i++;
        errorcode = ((ErrorCode) (obj));
        if (true) goto _L3; else goto _L2
        errorcode;
          goto _L4
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        IOException ioexception;
        ioexception;
        obj = errorcode;
        if (errorcode != null)
        {
            obj = ioexception;
        }
          goto _L5
_L2:
        if (aping != null)
        {
            int l = aping.length;
            for (int j = 0; j < l; j++)
            {
                aping[j].cancel();
            }

        }
        try
        {
            frameReader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        frameWriter.close();
        errorcode = ((ErrorCode) (obj));
_L6:
        if (errorcode != null)
        {
            throw errorcode;
        } else
        {
            return;
        }
        errorcode1;
        errorcode = ((ErrorCode) (obj));
        if (obj == null)
        {
            errorcode = errorcode1;
        }
          goto _L6
    }

    private SpdyStream getStream(int i)
    {
        this;
        JVM INSTR monitorenter ;
        SpdyStream spdystream = (SpdyStream)streams.get(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return spdystream;
        Exception exception;
        exception;
        throw exception;
    }

    private Ping removePing(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (pings == null) goto _L2; else goto _L1
_L1:
        Ping ping1 = (Ping)pings.remove(Integer.valueOf(i));
_L4:
        this;
        JVM INSTR monitorexit ;
        return ping1;
_L2:
        ping1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void setIdle(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        long l = System.nanoTime();
_L1:
        idleStartTimeNs = l;
        this;
        JVM INSTR monitorexit ;
        return;
        l = 0L;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private void writePing(boolean flag, int i, int j, Ping ping1)
        throws IOException
    {
        FrameWriter framewriter = frameWriter;
        framewriter;
        JVM INSTR monitorenter ;
        if (ping1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ping1.send();
        frameWriter.ping(flag, i, j);
        framewriter;
        JVM INSTR monitorexit ;
        return;
        ping1;
        framewriter;
        JVM INSTR monitorexit ;
        throw ping1;
    }

    private void writePingLater(boolean flag, int i, int j, Ping ping1)
    {
        executor.submit(new NamedRunnable(j, ping1) {

            final SpdyConnection this$0;
            final int val$payload1;
            final int val$payload2;
            final Ping val$ping;
            final boolean val$reply;

            public void execute()
            {
                try
                {
                    writePing(reply, payload1, payload2, ping);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                this$0 = SpdyConnection.this;
                reply = flag;
                payload1 = i;
                payload2 = j;
                ping = ping1;
                super(final_s, final_aobj);
            }
        });
    }

    public void close()
        throws IOException
    {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush()
        throws IOException
    {
        frameWriter.flush();
    }

    public long getIdleStartTimeNs()
    {
        this;
        JVM INSTR monitorenter ;
        long l = idleStartTimeNs;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isIdle()
    {
        this;
        JVM INSTR monitorenter ;
        long l = idleStartTimeNs;
        boolean flag;
        if (l != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public SpdyStream newStream(List list, boolean flag, boolean flag1)
        throws IOException
    {
        FrameWriter framewriter;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        framewriter = frameWriter;
        framewriter;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (shutdown)
        {
            throw new IOException("shutdown");
        }
        break MISSING_BLOCK_LABEL_62;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        framewriter;
        JVM INSTR monitorexit ;
        throw list;
        SpdyStream spdystream;
        int i;
        i = nextStreamId;
        nextStreamId = nextStreamId + 2;
        spdystream = new SpdyStream(i, this, flag, flag1, 0, 0, list, settings);
        if (spdystream.isOpen())
        {
            streams.put(Integer.valueOf(i), spdystream);
            setIdle(false);
        }
        this;
        JVM INSTR monitorexit ;
        frameWriter.synStream(flag, flag1, i, 0, 0, 0, list);
        framewriter;
        JVM INSTR monitorexit ;
        return spdystream;
    }

    public void noop()
        throws IOException
    {
        frameWriter.noop();
    }

    public int openStreamCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = streams.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public Ping ping()
        throws IOException
    {
        Object obj = new Ping();
        this;
        JVM INSTR monitorenter ;
        if (shutdown)
        {
            throw new IOException("shutdown");
        }
        break MISSING_BLOCK_LABEL_33;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int i;
        i = nextPingId;
        nextPingId = nextPingId + 2;
        if (pings == null)
        {
            pings = new HashMap();
        }
        pings.put(Integer.valueOf(i), obj);
        this;
        JVM INSTR monitorexit ;
        writePing(false, i, 0x4f4b6f6b, ((Ping) (obj)));
        return ((Ping) (obj));
    }

    SpdyStream removeStream(int i)
    {
        this;
        JVM INSTR monitorenter ;
        SpdyStream spdystream = (SpdyStream)streams.remove(Integer.valueOf(i));
        if (spdystream == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (streams.isEmpty())
        {
            setIdle(true);
        }
        this;
        JVM INSTR monitorexit ;
        return spdystream;
        Exception exception;
        exception;
        throw exception;
    }

    public void sendConnectionHeader()
    {
        frameWriter.connectionHeader();
    }

    public void shutdown(ErrorCode errorcode)
        throws IOException
    {
        FrameWriter framewriter = frameWriter;
        framewriter;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (!shutdown)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        framewriter;
        JVM INSTR monitorexit ;
        return;
        int i;
        shutdown = true;
        i = lastGoodStreamId;
        this;
        JVM INSTR monitorexit ;
        frameWriter.goAway(i, errorcode);
        framewriter;
        JVM INSTR monitorexit ;
        return;
        errorcode;
        framewriter;
        JVM INSTR monitorexit ;
        throw errorcode;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
    }

    public void writeData(int i, boolean flag, byte abyte0[], int j, int k)
        throws IOException
    {
        frameWriter.data(flag, i, abyte0, j, k);
    }

    void writeSynReply(int i, boolean flag, List list)
        throws IOException
    {
        frameWriter.synReply(flag, i, list);
    }

    void writeSynReset(int i, ErrorCode errorcode)
        throws IOException
    {
        frameWriter.rstStream(i, errorcode);
    }

    void writeSynResetLater(int i, ErrorCode errorcode)
    {
        executor.submit(new NamedRunnable(i, errorcode) {

            final SpdyConnection this$0;
            final ErrorCode val$errorCode;
            final int val$streamId;

            public void execute()
            {
                try
                {
                    writeSynReset(streamId, errorCode);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                this$0 = SpdyConnection.this;
                streamId = i;
                errorCode = errorcode;
                super(final_s, final_aobj);
            }
        });
    }

    void writeWindowUpdate(int i, int j)
        throws IOException
    {
        frameWriter.windowUpdate(i, j);
    }

    void writeWindowUpdateLater(int i, int j)
    {
        executor.submit(new NamedRunnable(i, j) {

            final SpdyConnection this$0;
            final int val$deltaWindowSize;
            final int val$streamId;

            public void execute()
            {
                try
                {
                    writeWindowUpdate(streamId, deltaWindowSize);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                this$0 = SpdyConnection.this;
                streamId = i;
                deltaWindowSize = j;
                super(final_s, final_aobj);
            }
        });
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/spdy/SpdyConnection.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        executor = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.daemonThreadFactory("OkHttp SpdyConnection"));
    }





/*
    static boolean access$1202(SpdyConnection spdyconnection, boolean flag)
    {
        spdyconnection.shutdown = flag;
        return flag;
    }

*/


/*
    static int access$1302(SpdyConnection spdyconnection, int i)
    {
        spdyconnection.lastGoodStreamId = i;
        return i;
    }

*/








}
