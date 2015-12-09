// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.transport.TCPTransport;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public final class axp extends Thread
{

    public Boolean a;
    private TCPTransport b;

    private axp(TCPTransport tcptransport)
    {
        b = tcptransport;
        super();
        a = Boolean.valueOf(false);
    }

    public axp(TCPTransport tcptransport, byte byte0)
    {
        this(tcptransport);
    }

    private boolean a()
    {
        int i = 30;
        TCPTransport tcptransport = b;
        tcptransport;
        JVM INSTR monitorenter ;
_L4:
        if (b.c != null && !b.c.isClosed())
        {
            b.b("TCPTransport.connect: Socket is not closed. Trying to close it");
            b.c.close();
        }
        b.b(String.format("TCPTransport.connect: Socket is closed. Trying to connect to %s", new Object[] {
            b.b
        }));
        b.c = new Socket();
        b.c.connect(new InetSocketAddress(b.b.d, b.b.a));
        b.e = b.c.getOutputStream();
        b.d = b.c.getInputStream();
_L5:
        Object obj;
        boolean flag;
        if (b.c != null && b.c.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        b.b("TCPTransport.connect: Socket connected");
_L6:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!b.b.e || i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a.booleanValue()) goto _L4; else goto _L3
_L3:
        tcptransport;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        b.c((new StringBuilder("TCPTransport.connect: Exception during connect stage: ")).append(((IOException) (obj)).getMessage()).toString());
          goto _L5
        obj;
        tcptransport;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (!b.b.e)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        i--;
        b.b(String.format("TCPTransport.connect: Socket not connected. AutoReconnect is ON. retryCount is: %d. Waiting for reconnect delay: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(5000)
        }));
        TCPTransport.a(b);
          goto _L6
        b.b("TCPTransport.connect: Socket not connected. AutoReconnect is OFF");
          goto _L6
    }

    public final void run()
    {
        b.b("TCPTransport.run: transport thread created. Starting connect stage");
_L4:
label0:
        {
            if (!a.booleanValue())
            {
                b.a(com.ford.syncV4.transport.TCPTransport.TCPTransportState.b);
                if (a())
                {
                    break label0;
                }
                if (a.booleanValue())
                {
                    b.b("TCPTransport.run: Connection failed, but thread already halted");
                } else
                {
                    b.a("Failed to connect to Sync", new SyncException("Failed to connect to Sync", SyncExceptionCause.i), true);
                }
            }
            b.b("TCPTransport.run: Thread terminated");
            b.a(com.ford.syncV4.transport.TCPTransport.TCPTransportState.a);
            return;
        }
        synchronized (b)
        {
            b.a(com.ford.syncV4.transport.TCPTransport.TCPTransportState.c);
            b.e();
        }
        obj = new byte[4096];
_L2:
        int i;
        if (a.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        b.b("TCPTransport.run: Waiting for data...");
        try
        {
            i = b.d.read(((byte []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (a.booleanValue())
            {
                b.c("TCPTransport.run: Exception during reading data, but thread already halted");
            } else
            {
                b.c("TCPTransport.run: Exception during reading data");
                b.a("Failed to read data from Sync", new SyncException("Failed to read data from Sync", SyncExceptionCause.i), false);
            }
            continue; /* Loop/switch isn't completed */
        }
        synchronized (b)
        {
            if (!b.f.isInterrupted())
            {
                break MISSING_BLOCK_LABEL_264;
            }
            b.b("TCPTransport.run: Got new data but thread is interrupted");
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        JVM INSTR monitorexit ;
        b.b("TCPTransport.run: Got new data");
        if (-1 == i)
        {
            if (a.booleanValue())
            {
                b.b("TCPTransport.run: TCP disconnect received, but thread already halted");
            } else
            {
                b.b("TCPTransport.run: TCP disconnect received");
                b.a("TCPTransport.run: End of stream reached", null, false);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i == 0)
        {
            b.b("TCPTransport.run: Received zero bytes");
        } else
        {
            b.b(String.format("TCPTransport.run: Received %d bytes", new Object[] {
                Integer.valueOf(i)
            }));
            synchronized (b)
            {
                b.a(((byte []) (obj)), i);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        tcptransport;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
