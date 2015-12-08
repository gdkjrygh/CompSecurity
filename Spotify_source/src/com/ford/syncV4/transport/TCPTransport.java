// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.transport;

import android.util.Log;
import axm;
import axo;
import axp;
import axq;
import com.ford.syncV4.exception.SyncException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// Referenced classes of package com.ford.syncV4.transport:
//            SiphonServer, TransportType

public final class TCPTransport extends axo
{

    public axq b;
    public Socket c;
    public InputStream d;
    public OutputStream e;
    public axp f;
    private TCPTransportState g;

    public TCPTransport(axq axq, axm axm)
    {
        super(axm);
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = TCPTransportState.a;
        b = axq;
    }

    public static void a(TCPTransport tcptransport)
    {
        long l = System.currentTimeMillis() + 5000L;
_L2:
        if (System.currentTimeMillis() >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        tcptransport;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            tcptransport.wait(l - System.currentTimeMillis());
        }
        catch (Exception exception1) { }
        tcptransport;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
        exception;
        tcptransport;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    private TCPTransportState f()
    {
        this;
        JVM INSTR monitorenter ;
        TCPTransportState tcptransportstate = g;
        this;
        JVM INSTR monitorexit ;
        return tcptransportstate;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        TCPTransportState tcptransportstate = f();
        b(String.format("TCPTransport: openConnection requested. Current state is: %s", new Object[] {
            tcptransportstate.name()
        }));
        if (tcptransportstate != TCPTransportState.a)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        this;
        JVM INSTR monitorenter ;
        a(TCPTransportState.b);
        b("TCPTransport: openConnection request accepted. Starting transport thread");
        f = new axp(this, (byte)0);
        f.setDaemon(true);
        f.start();
        SiphonServer.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e(getClass().getName(), "TCPTransport: Exception during transport thread starting", ((Throwable) (obj)));
        throw new SyncException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        b("TCPTransport: openConnection request rejected. Another connection is not finished");
        return;
    }

    public final void a(TCPTransportState tcptransportstate)
    {
        this;
        JVM INSTR monitorenter ;
        b(String.format("Current state changed to: %s", new Object[] {
            tcptransportstate
        }));
        g = tcptransportstate;
        this;
        JVM INSTR monitorexit ;
        return;
        tcptransportstate;
        throw tcptransportstate;
    }

    public final void a(String s, Exception exception, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (f() != TCPTransportState.d) goto _L2; else goto _L1
_L1:
        b("TCPTransport: disconnecting already in progress");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(TCPTransportState.d);
        if (s == null)
        {
            s = "";
        }
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = (new StringBuilder()).append(s).append(", ").append(exception.toString()).toString();
        if (f == null || !flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        f.a = Boolean.valueOf(true);
        f.interrupt();
        if (c != null)
        {
            c.close();
        }
        c = null;
_L4:
        if (exception != null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        b("Disconnect is correct. Handling it");
        a(s);
          goto _L3
        s;
        throw s;
        IOException ioexception;
        ioexception;
        c((new StringBuilder("TCPTransport.disconnect: Exception during disconnect: ")).append(ioexception.getMessage()).toString());
          goto _L4
        c("Disconnect is incorrect. Handling it as error");
        a(s, exception);
          goto _L3
    }

    protected final boolean a(byte abyte0[], int i, int j)
    {
        TCPTransportState tcptransportstate;
        boolean flag;
        flag = false;
        tcptransportstate = f();
        b(String.format("TCPTransport: sendBytesOverTransport requested. Size: %d, Offset: %d, Length: %d, Current state is: %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j), tcptransportstate.name()
        }));
        if (tcptransportstate != TCPTransportState.c) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L4; else goto _L3
_L3:
        b("TCPTransport: sendBytesOverTransport request accepted. Trying to send data");
        e.write(abyte0, i, j);
        b("TCPTransport.sendBytesOverTransport: successfully send data");
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        abyte0;
        c((new StringBuilder("TCPTransport.sendBytesOverTransport: error during sending data: ")).append(abyte0.getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
_L4:
        c("TCPTransport: sendBytesOverTransport request accepted, but output stream is null");
        if (true) goto _L5; else goto _L2
_L2:
        b("TCPTransport: sendBytesOverTransport request rejected. Transport is not connected");
        return false;
    }

    public final void b()
    {
        TCPTransportState tcptransportstate = f();
        b(String.format("TCPTransport: disconnect requested from client. Current state is: %s", new Object[] {
            tcptransportstate.name()
        }));
        if (tcptransportstate != TCPTransportState.c)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        b("TCPTransport: disconnect request accepted.");
        this;
        JVM INSTR monitorenter ;
        a(((String) (null)), ((Exception) (null)), true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        b("TCPTransport: disconnect request rejected. Transport is not connected");
        return;
    }

    public final void b(String s)
    {
        Log.i(getClass().getName(), s);
    }

    public final TransportType c()
    {
        return TransportType.b;
    }

    public final void c(String s)
    {
        Log.e(getClass().getName(), s);
    }

    public final String d()
    {
        return "";
    }

    private class TCPTransportState extends Enum
    {

        public static final TCPTransportState a;
        public static final TCPTransportState b;
        public static final TCPTransportState c;
        public static final TCPTransportState d;
        private static final TCPTransportState e[];

        public static TCPTransportState valueOf(String s)
        {
            return (TCPTransportState)Enum.valueOf(com/ford/syncV4/transport/TCPTransport$TCPTransportState, s);
        }

        public static TCPTransportState[] values()
        {
            return (TCPTransportState[])e.clone();
        }

        static 
        {
            a = new TCPTransportState("IDLE", 0);
            b = new TCPTransportState("CONNECTING", 1);
            c = new TCPTransportState("CONNECTED", 2);
            d = new TCPTransportState("DISCONNECTING", 3);
            e = (new TCPTransportState[] {
                a, b, c, d
            });
        }

        private TCPTransportState(String s, int i)
        {
            super(s, i);
        }
    }

}
