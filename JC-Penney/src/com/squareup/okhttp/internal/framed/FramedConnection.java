// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.f;
import c.j;
import c.r;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            Settings, Http2, Variant, Spdy3, 
//            FramedStream, Ping, FrameWriter, ErrorCode, 
//            IncomingStreamHandler, PushObserver

public final class FramedConnection
    implements Closeable
{

    static final boolean $assertionsDisabled;
    private static final int OKHTTP_CLIENT_WINDOW_SIZE = 0x1000000;
    private static final ExecutorService executor;
    long bytesLeftInWriteWindow;
    final boolean client;
    private final Set currentPushRequests;
    final FrameWriter frameWriter;
    private final IncomingStreamHandler handler;
    private final String hostName;
    private long idleStartTimeNs;
    private int lastGoodStreamId;
    private int nextPingId;
    private int nextStreamId;
    final Settings okHttpSettings;
    final Settings peerSettings;
    private Map pings;
    final Protocol protocol;
    private final ExecutorService pushExecutor;
    private final PushObserver pushObserver;
    final Reader readerRunnable;
    private boolean receivedInitialPeerSettings;
    private boolean shutdown;
    final Socket socket;
    private final Map streams;
    long unacknowledgedBytesRead;
    final Variant variant;

    private FramedConnection(Builder builder)
    {
        byte byte0 = 2;
        super();
        streams = new HashMap();
        idleStartTimeNs = System.nanoTime();
        unacknowledgedBytesRead = 0L;
        okHttpSettings = new Settings();
        peerSettings = new Settings();
        receivedInitialPeerSettings = false;
        currentPushRequests = new LinkedHashSet();
        protocol = builder.protocol;
        pushObserver = builder.pushObserver;
        client = builder.client;
        handler = builder.handler;
        int i;
        if (builder.client)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        nextStreamId = i;
        if (builder.client && protocol == Protocol.HTTP_2)
        {
            nextStreamId = nextStreamId + 2;
        }
        i = byte0;
        if (builder.client)
        {
            i = 1;
        }
        nextPingId = i;
        if (builder.client)
        {
            okHttpSettings.set(7, 0, 0x1000000);
        }
        hostName = builder.hostName;
        if (protocol == Protocol.HTTP_2)
        {
            variant = new Http2();
            pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(String.format("OkHttp %s Push Observer", new Object[] {
                hostName
            }), true));
            peerSettings.set(7, 0, 65535);
            peerSettings.set(5, 0, 16384);
        } else
        if (protocol == Protocol.SPDY_3)
        {
            variant = new Spdy3();
            pushExecutor = null;
        } else
        {
            throw new AssertionError(protocol);
        }
        bytesLeftInWriteWindow = peerSettings.getInitialWindowSize(0x10000);
        socket = builder.socket;
        frameWriter = variant.newWriter(r.a(r.a(builder.socket)), client);
        readerRunnable = new Reader(null);
        (new Thread(readerRunnable)).start();
    }

    FramedConnection(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    private void close(ErrorCode errorcode, ErrorCode errorcode1)
    {
        if (!$assertionsDisabled && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        shutdown(errorcode);
        errorcode = null;
_L5:
        this;
        JVM INSTR monitorenter ;
        FramedStream aframedstream[];
        if (streams.isEmpty())
        {
            break MISSING_BLOCK_LABEL_285;
        }
        aframedstream = (FramedStream[])streams.values().toArray(new FramedStream[streams.size()]);
        streams.clear();
        setIdle(false);
_L9:
        if (pings == null) goto _L2; else goto _L1
_L1:
        Ping aping[];
        aping = (Ping[])pings.values().toArray(new Ping[pings.size()]);
        pings = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        Object obj;
        int i;
        int l;
        obj = errorcode;
        if (aframedstream == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        l = aframedstream.length;
        i = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aframedstream[i];
        ((FramedStream) (obj)).close(errorcode1);
        obj = errorcode;
_L6:
        i++;
        errorcode = ((ErrorCode) (obj));
        if (true) goto _L4; else goto _L3
        errorcode;
          goto _L5
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
          goto _L6
_L3:
        obj = errorcode;
        if (aping != null)
        {
            int i1 = aping.length;
            for (int k = 0; k < i1; k++)
            {
                aping[k].cancel();
            }

        }
        frameWriter.close();
        errorcode = ((ErrorCode) (obj));
_L7:
        try
        {
            socket.close();
        }
        // Misplaced declaration of an exception variable
        catch (ErrorCode errorcode) { }
        if (errorcode != null)
        {
            throw errorcode;
        } else
        {
            return;
        }
        errorcode;
        if (obj != null)
        {
            errorcode = ((ErrorCode) (obj));
        }
          goto _L7
_L2:
        aping = null;
          goto _L8
        aframedstream = null;
          goto _L9
    }

    private FramedStream newStream(int i, List list, boolean flag, boolean flag1)
    {
        FrameWriter framewriter;
        boolean flag2;
        boolean flag3 = true;
        if (!flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag1)
        {
            flag1 = flag3;
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
        break MISSING_BLOCK_LABEL_71;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        framewriter;
        JVM INSTR monitorexit ;
        throw list;
        FramedStream framedstream;
        int k;
        k = nextStreamId;
        nextStreamId = nextStreamId + 2;
        framedstream = new FramedStream(k, this, flag2, flag1, list);
        if (framedstream.isOpen())
        {
            streams.put(Integer.valueOf(k), framedstream);
            setIdle(false);
        }
        this;
        JVM INSTR monitorexit ;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        frameWriter.synStream(flag2, flag1, k, i, list);
_L1:
        framewriter;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            frameWriter.flush();
        }
        return framedstream;
        if (client)
        {
            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
        }
        frameWriter.pushPromise(i, k, list);
          goto _L1
    }

    private void pushDataLater(int i, j j1, int k, boolean flag)
    {
        f f1 = new f();
        j1.a(k);
        j1.read(f1, k);
        if (f1.a() != (long)k)
        {
            throw new IOException((new StringBuilder()).append(f1.a()).append(" != ").append(k).toString());
        } else
        {
            pushExecutor.execute(new _cls6(k, flag));
            return;
        }
    }

    private void pushHeadersLater(int i, List list, boolean flag)
    {
        pushExecutor.execute(new _cls5(list, flag));
    }

    private void pushRequestLater(int i, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!currentPushRequests.contains(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
        this;
        JVM INSTR monitorexit ;
        return;
        currentPushRequests.add(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        pushExecutor.execute(new _cls4(i, list));
        return;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void pushResetLater(int i, ErrorCode errorcode)
    {
        pushExecutor.execute(new _cls7(i, errorcode));
    }

    private boolean pushedStream(int i)
    {
        return protocol == Protocol.HTTP_2 && i != 0 && (i & 1) == 0;
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
        l = 0x7fffffffffffffffL;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private void writePing(boolean flag, int i, int k, Ping ping1)
    {
        FrameWriter framewriter = frameWriter;
        framewriter;
        JVM INSTR monitorenter ;
        if (ping1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ping1.send();
        frameWriter.ping(flag, i, k);
        framewriter;
        JVM INSTR monitorexit ;
        return;
        ping1;
        framewriter;
        JVM INSTR monitorexit ;
        throw ping1;
    }

    private void writePingLater(boolean flag, int i, int k, Ping ping1)
    {
        executor.execute(new _cls3(k, ping1));
    }

    void addBytesToWriteWindow(long l)
    {
        bytesLeftInWriteWindow = bytesLeftInWriteWindow + l;
        if (l > 0L)
        {
            notifyAll();
        }
    }

    public void close()
    {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush()
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

    public Protocol getProtocol()
    {
        return protocol;
    }

    FramedStream getStream(int i)
    {
        this;
        JVM INSTR monitorenter ;
        FramedStream framedstream = (FramedStream)streams.get(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return framedstream;
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
        if (l != 0x7fffffffffffffffL)
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

    public FramedStream newStream(List list, boolean flag, boolean flag1)
    {
        return newStream(0, list, flag, flag1);
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

    public FramedStream pushStream(int i, List list, boolean flag)
    {
        if (client)
        {
            throw new IllegalStateException("Client cannot push requests.");
        }
        if (protocol != Protocol.HTTP_2)
        {
            throw new IllegalStateException("protocol != HTTP_2");
        } else
        {
            return newStream(i, list, flag, false);
        }
    }

    FramedStream removeStream(int i)
    {
        this;
        JVM INSTR monitorenter ;
        FramedStream framedstream = (FramedStream)streams.remove(Integer.valueOf(i));
        if (framedstream == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (streams.isEmpty())
        {
            setIdle(true);
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return framedstream;
        Exception exception;
        exception;
        throw exception;
    }

    public void sendConnectionPreface()
    {
        frameWriter.connectionPreface();
        frameWriter.settings(okHttpSettings);
        int i = okHttpSettings.getInitialWindowSize(0x10000);
        if (i != 0x10000)
        {
            frameWriter.windowUpdate(0, i - 0x10000);
        }
    }

    public void shutdown(ErrorCode errorcode)
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
        frameWriter.goAway(i, errorcode, Util.EMPTY_BYTE_ARRAY);
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

    public void writeData(int i, boolean flag, f f1, long l)
    {
        long l1 = l;
        if (l != 0L) goto _L2; else goto _L1
_L1:
        frameWriter.data(flag, i, f1, 0);
_L4:
        return;
_L6:
        int k;
        k = Math.min((int)Math.min(l1, bytesLeftInWriteWindow), frameWriter.maxDataLength());
        bytesLeftInWriteWindow = bytesLeftInWriteWindow - (long)k;
        this;
        JVM INSTR monitorexit ;
        l1 -= k;
        FrameWriter framewriter = frameWriter;
        boolean flag1;
        if (flag && l1 == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        framewriter.data(flag1, i, f1, k);
_L2:
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
_L8:
        if (bytesLeftInWriteWindow > 0L) goto _L6; else goto _L5
_L5:
        if (!streams.containsKey(Integer.valueOf(i)))
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_163;
        f1;
        throw new InterruptedIOException();
        f1;
        this;
        JVM INSTR monitorexit ;
        throw f1;
        wait();
        if (true) goto _L8; else goto _L7
_L7:
          goto _L6
    }

    void writeSynReply(int i, boolean flag, List list)
    {
        frameWriter.synReply(flag, i, list);
    }

    void writeSynReset(int i, ErrorCode errorcode)
    {
        frameWriter.rstStream(i, errorcode);
    }

    void writeSynResetLater(int i, ErrorCode errorcode)
    {
        executor.submit(new _cls1(i, errorcode));
    }

    void writeWindowUpdateLater(int i, long l)
    {
        executor.execute(new _cls2(i, l));
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/framed/FramedConnection.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        executor = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp FramedConnection", true));
    }







/*
    static boolean access$1402(FramedConnection framedconnection, boolean flag)
    {
        framedconnection.shutdown = flag;
        return flag;
    }

*/



/*
    static int access$1502(FramedConnection framedconnection, int i)
    {
        framedconnection.lastGoodStreamId = i;
        return i;
    }

*/








/*
    static boolean access$2102(FramedConnection framedconnection, boolean flag)
    {
        framedconnection.receivedInitialPeerSettings = flag;
        return flag;
    }

*/








    private class Builder
    {

        private boolean client;
        private IncomingStreamHandler handler;
        private String hostName;
        private Protocol protocol;
        private PushObserver pushObserver;
        private Socket socket;

        public FramedConnection build()
        {
            return new FramedConnection(this, null);
        }

        public Builder handler(IncomingStreamHandler incomingstreamhandler)
        {
            handler = incomingstreamhandler;
            return this;
        }

        public Builder protocol(Protocol protocol1)
        {
            protocol = protocol1;
            return this;
        }

        public Builder pushObserver(PushObserver pushobserver)
        {
            pushObserver = pushobserver;
            return this;
        }







        public Builder(String s, boolean flag, Socket socket1)
        {
            handler = IncomingStreamHandler.REFUSE_INCOMING_STREAMS;
            protocol = Protocol.SPDY_3;
            pushObserver = PushObserver.CANCEL;
            hostName = s;
            client = flag;
            socket = socket1;
        }

        public Builder(boolean flag, Socket socket1)
        {
            this(((InetSocketAddress)socket1.getRemoteSocketAddress()).getHostName(), flag, socket1);
        }
    }


    private class Reader extends NamedRunnable
        implements FrameReader.Handler
    {

        FrameReader frameReader;
        final FramedConnection this$0;

        private void ackSettingsLater(Settings settings1)
        {
            class _cls2 extends NamedRunnable
            {

                final Reader this$1;
                final Settings val$peerSettings;

                public void execute()
                {
                    try
                    {
                        frameWriter.ackSettings(peerSettings);
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        return;
                    }
                }

                transient _cls2(Object aobj[], Settings settings1)
                {
                    this$1 = Reader.this;
                    peerSettings = settings1;
                    super(final_s, aobj);
                }
            }

            FramedConnection.executor.execute(new _cls2(new Object[] {
                hostName
            }, settings1));
        }

        public void ackSettings()
        {
        }

        public void alternateService(int i, String s, k k1, String s1, int l, long l1)
        {
        }

        public void data(boolean flag, int i, j j1, int l)
        {
            if (pushedStream(i))
            {
                pushDataLater(i, j1, l, flag);
            } else
            {
                FramedStream framedstream = getStream(i);
                if (framedstream == null)
                {
                    writeSynResetLater(i, ErrorCode.INVALID_STREAM);
                    j1.g(l);
                    return;
                }
                framedstream.receiveData(j1, l);
                if (flag)
                {
                    framedstream.receiveFin();
                    return;
                }
            }
        }

        protected void execute()
        {
            Object obj;
            ErrorCode errorcode;
            Object obj2;
            ErrorCode errorcode1;
            obj2 = ErrorCode.INTERNAL_ERROR;
            errorcode1 = ErrorCode.INTERNAL_ERROR;
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            frameReader = variant.newReader(r.a(r.b(socket)), client);
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            if (client)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            frameReader.readConnectionPreface();
_L2:
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            if (frameReader.nextFrame(this)) goto _L2; else goto _L1
_L1:
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            obj2 = ErrorCode.NO_ERROR;
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            ErrorCode errorcode2 = ErrorCode.CANCEL;
            IOException ioexception;
            Object obj1;
            try
            {
                close(((ErrorCode) (obj2)), errorcode2);
            }
            catch (IOException ioexception1) { }
            Util.closeQuietly(frameReader);
            return;
            obj;
            obj = errorcode;
            obj2 = ErrorCode.PROTOCOL_ERROR;
            obj = ErrorCode.PROTOCOL_ERROR;
            try
            {
                close(((ErrorCode) (obj2)), ((ErrorCode) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            Util.closeQuietly(frameReader);
            return;
            obj1;
            obj2 = obj;
            obj = obj1;
_L4:
            try
            {
                close(((ErrorCode) (obj2)), errorcode1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            Util.closeQuietly(frameReader);
            throw obj;
            obj;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void goAway(int i, ErrorCode errorcode, k k1)
        {
            if (k1.f() <= 0);
            synchronized (FramedConnection.this)
            {
                k1 = (FramedStream[])streams.values().toArray(new FramedStream[streams.size()]);
                shutdown = true;
            }
            int i1 = k1.length;
            for (int l = 0; l < i1; l++)
            {
                errorcode = k1[l];
                if (errorcode.getId() > i && errorcode.isLocallyInitiated())
                {
                    errorcode.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    removeStream(errorcode.getId());
                }
            }

            break MISSING_BLOCK_LABEL_128;
            k1;
            errorcode;
            JVM INSTR monitorexit ;
            throw k1;
        }

        public void headers(boolean flag, boolean flag1, int i, int l, List list, HeadersMode headersmode)
        {
            if (!pushedStream(i)) goto _L2; else goto _L1
_L1:
            pushHeadersLater(i, list, flag1);
_L4:
            return;
_L2:
            synchronized (FramedConnection.this)
            {
                if (!shutdown)
                {
                    break MISSING_BLOCK_LABEL_54;
                }
            }
            return;
            list;
            framedconnection;
            JVM INSTR monitorexit ;
            throw list;
            FramedStream framedstream = getStream(i);
            if (framedstream != null)
            {
                break MISSING_BLOCK_LABEL_217;
            }
            if (!headersmode.failIfStreamAbsent())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            writeSynResetLater(i, ErrorCode.INVALID_STREAM);
            framedconnection;
            JVM INSTR monitorexit ;
            return;
            if (i > lastGoodStreamId)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            framedconnection;
            JVM INSTR monitorexit ;
            return;
            if (i % 2 != nextStreamId % 2)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            framedconnection;
            JVM INSTR monitorexit ;
            return;
            list = new FramedStream(i, FramedConnection.this, flag, flag1, list);
            lastGoodStreamId = i;
            streams.put(Integer.valueOf(i), list);
            class _cls1 extends NamedRunnable
            {

                final Reader this$1;
                final FramedStream val$newStream;

                public void execute()
                {
                    try
                    {
                        handler.receive(newStream);
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        Internal.logger.log(Level.INFO, (new StringBuilder()).append("StreamHandler failure for ").append(hostName).toString(), ioexception);
                    }
                    try
                    {
                        newStream.close(ErrorCode.PROTOCOL_ERROR);
                        return;
                    }
                    catch (IOException ioexception1)
                    {
                        return;
                    }
                }

                transient _cls1(Object aobj[], FramedStream framedstream)
                {
                    this$1 = Reader.this;
                    newStream = framedstream;
                    super(final_s, aobj);
                }
            }

            FramedConnection.executor.execute(new _cls1(new Object[] {
                hostName, Integer.valueOf(i)
            }, list));
            framedconnection;
            JVM INSTR monitorexit ;
            return;
            framedconnection;
            JVM INSTR monitorexit ;
            if (headersmode.failIfStreamPresent())
            {
                framedstream.closeLater(ErrorCode.PROTOCOL_ERROR);
                removeStream(i);
                return;
            }
            framedstream.receiveHeaders(list, headersmode);
            if (flag1)
            {
                framedstream.receiveFin();
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void ping(boolean flag, int i, int l)
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
                writePingLater(true, i, l, null);
                return;
            }
        }

        public void priority(int i, int l, int i1, boolean flag)
        {
        }

        public void pushPromise(int i, int l, List list)
        {
            pushRequestLater(l, list);
        }

        public void rstStream(int i, ErrorCode errorcode)
        {
            if (pushedStream(i))
            {
                pushResetLater(i, errorcode);
            } else
            {
                FramedStream framedstream = removeStream(i);
                if (framedstream != null)
                {
                    framedstream.receiveRstStream(errorcode);
                    return;
                }
            }
        }

        public void settings(boolean flag, Settings settings1)
        {
            framedconnection = FramedConnection.this;
            framedconnection;
            JVM INSTR monitorenter ;
            int i = peerSettings.getInitialWindowSize(0x10000);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_36;
            }
            peerSettings.clear();
            int i1;
            peerSettings.merge(settings1);
            if (getProtocol() == Protocol.HTTP_2)
            {
                ackSettingsLater(settings1);
            }
            i1 = peerSettings.getInitialWindowSize(0x10000);
            long l1;
            if (i1 == -1 || i1 == i)
            {
                break MISSING_BLOCK_LABEL_247;
            }
            l1 = i1 - i;
            if (!receivedInitialPeerSettings)
            {
                addBytesToWriteWindow(l1);
                receivedInitialPeerSettings = true;
            }
            if (streams.isEmpty()) goto _L2; else goto _L1
_L1:
            settings1 = (FramedStream[])streams.values().toArray(new FramedStream[streams.size()]);
_L3:
            framedconnection;
            JVM INSTR monitorexit ;
            if (settings1 != null && l1 != 0L)
            {
                int j1 = settings1.length;
                for (int l = 0; l < j1; l++)
                {
                    synchronized (settings1[l])
                    {
                        framedconnection.addBytesToWriteWindow(l1);
                    }
                }

            }
            break MISSING_BLOCK_LABEL_241;
            settings1;
            framedconnection;
            JVM INSTR monitorexit ;
            throw settings1;
            settings1;
            framedconnection;
            JVM INSTR monitorexit ;
            throw settings1;
            return;
_L2:
            settings1 = null;
              goto _L3
            settings1 = null;
            l1 = 0L;
              goto _L3
        }

        public void windowUpdate(int i, long l)
        {
            if (i == 0)
            {
                synchronized (FramedConnection.this)
                {
                    FramedConnection framedconnection1 = FramedConnection.this;
                    framedconnection1.bytesLeftInWriteWindow = framedconnection1.bytesLeftInWriteWindow + l;
                    notifyAll();
                }
                return;
            }
            break MISSING_BLOCK_LABEL_50;
            exception;
            framedconnection;
            JVM INSTR monitorexit ;
            throw exception;
            FramedStream framedstream;
            framedstream = getStream(i);
            if (framedstream == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            framedstream;
            JVM INSTR monitorenter ;
            framedstream.addBytesToWriteWindow(l);
            framedstream;
            JVM INSTR monitorexit ;
            return;
            Exception exception1;
            exception1;
            framedstream;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        private Reader()
        {
            this$0 = FramedConnection.this;
            super("OkHttp %s", new Object[] {
                hostName
            });
        }

        Reader(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls6 extends NamedRunnable
    {

        final FramedConnection this$0;
        final f val$buffer;
        final int val$byteCount;
        final boolean val$inFinished;
        final int val$streamId;

        public void execute()
        {
            boolean flag = pushObserver.onData(streamId, buffer, byteCount, inFinished);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_52;
            }
            frameWriter.rstStream(streamId, ErrorCode.CANCEL);
            if (flag)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (!inFinished)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            synchronized (FramedConnection.this)
            {
                currentPushRequests.remove(Integer.valueOf(streamId));
            }
            return;
            exception;
            framedconnection;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (IOException ioexception) { }
        }

        transient _cls6(int k, boolean flag)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            buffer = f1;
            byteCount = k;
            inFinished = flag;
            super(final_s, final_aobj);
        }
    }


    private class _cls5 extends NamedRunnable
    {

        final FramedConnection this$0;
        final boolean val$inFinished;
        final List val$requestHeaders;
        final int val$streamId;

        public void execute()
        {
            boolean flag;
            flag = pushObserver.onHeaders(streamId, requestHeaders, inFinished);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_48;
            }
            frameWriter.rstStream(streamId, ErrorCode.CANCEL);
            if (flag)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!inFinished)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            synchronized (FramedConnection.this)
            {
                currentPushRequests.remove(Integer.valueOf(streamId));
            }
            return;
            exception;
            framedconnection;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (IOException ioexception) { }
        }

        transient _cls5(List list, boolean flag)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            requestHeaders = list;
            inFinished = flag;
            super(final_s, final_aobj);
        }
    }


    private class _cls4 extends NamedRunnable
    {

        final FramedConnection this$0;
        final List val$requestHeaders;
        final int val$streamId;

        public void execute()
        {
            if (!pushObserver.onRequest(streamId, requestHeaders))
            {
                break MISSING_BLOCK_LABEL_78;
            }
            frameWriter.rstStream(streamId, ErrorCode.CANCEL);
            synchronized (FramedConnection.this)
            {
                currentPushRequests.remove(Integer.valueOf(streamId));
            }
            return;
            exception;
            framedconnection;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (IOException ioexception) { }
        }

        transient _cls4(int i, List list)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            requestHeaders = list;
            super(final_s, final_aobj);
        }
    }


    private class _cls7 extends NamedRunnable
    {

        final FramedConnection this$0;
        final ErrorCode val$errorCode;
        final int val$streamId;

        public void execute()
        {
            pushObserver.onReset(streamId, errorCode);
            synchronized (FramedConnection.this)
            {
                currentPushRequests.remove(Integer.valueOf(streamId));
            }
            return;
            exception;
            framedconnection;
            JVM INSTR monitorexit ;
            throw exception;
        }

        transient _cls7(int i, ErrorCode errorcode)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            errorCode = errorcode;
            super(final_s, final_aobj);
        }
    }


    private class _cls3 extends NamedRunnable
    {

        final FramedConnection this$0;
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

        transient _cls3(int k, Ping ping1)
        {
            this$0 = FramedConnection.this;
            reply = flag;
            payload1 = i;
            payload2 = k;
            ping = ping1;
            super(final_s, final_aobj);
        }
    }


    private class _cls1 extends NamedRunnable
    {

        final FramedConnection this$0;
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

        transient _cls1(int i, ErrorCode errorcode)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            errorCode = errorcode;
            super(final_s, final_aobj);
        }
    }


    private class _cls2 extends NamedRunnable
    {

        final FramedConnection this$0;
        final int val$streamId;
        final long val$unacknowledgedBytesRead;

        public void execute()
        {
            try
            {
                frameWriter.windowUpdate(streamId, unacknowledgedBytesRead);
                return;
            }
            catch (IOException ioexception)
            {
                return;
            }
        }

        transient _cls2(int i, long l)
        {
            this$0 = FramedConnection.this;
            streamId = i;
            unacknowledgedBytesRead = l;
            super(final_s, final_aobj);
        }
    }

}
