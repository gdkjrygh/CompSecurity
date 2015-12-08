// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import com.ford.syncV4.a.a;
import com.ford.syncV4.a.b;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

// Referenced classes of package com.ford.syncV4.i:
//            m, p, n

final class o extends Thread
{

    final m a;
    private Boolean b;

    private o(m m1)
    {
        a = m1;
        super();
        b = Boolean.valueOf(false);
    }

    o(m m1, byte byte0)
    {
        this(m1);
    }

    private boolean b()
    {
        int i = 30;
        m m1 = a;
        m1;
        JVM INSTR monitorenter ;
_L4:
        if (com.ford.syncV4.i.m.a(a) != null && !com.ford.syncV4.i.m.a(a).isClosed())
        {
            a.b("TCPTransport.connect: Socket is not closed. Trying to close it");
            com.ford.syncV4.i.m.a(a).close();
        }
        a.b(String.format("TCPTransport.connect: Socket is closed. Trying to connect to %s", new Object[] {
            com.ford.syncV4.i.m.b(a)
        }));
        com.ford.syncV4.i.m.a(a, new Socket());
        com.ford.syncV4.i.m.a(a).connect(new InetSocketAddress(com.ford.syncV4.i.m.b(a).e(), com.ford.syncV4.i.m.b(a).b()));
        com.ford.syncV4.i.m.a(a, com.ford.syncV4.i.m.a(a).getOutputStream());
        com.ford.syncV4.i.m.a(a, com.ford.syncV4.i.m.a(a).getInputStream());
_L5:
        Object obj;
        boolean flag;
        if (com.ford.syncV4.i.m.a(a) != null && com.ford.syncV4.i.m.a(a).isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        a.b("TCPTransport.connect: Socket connected");
_L6:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.ford.syncV4.i.m.b(a).f() || i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!b.booleanValue()) goto _L4; else goto _L3
_L3:
        m1;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        a.c((new StringBuilder("TCPTransport.connect: Exception during connect stage: ")).append(((IOException) (obj)).getMessage()).toString());
          goto _L5
        obj;
        m1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        if (!com.ford.syncV4.i.m.b(a).f())
        {
            break MISSING_BLOCK_LABEL_343;
        }
        i--;
        a.b(String.format("TCPTransport.connect: Socket not connected. AutoReconnect is ON. retryCount is: %d. Waiting for reconnect delay: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(5000)
        }));
        m.c(a);
          goto _L6
        a.b("TCPTransport.connect: Socket not connected. AutoReconnect is OFF");
          goto _L6
    }

    public final void a()
    {
        b = Boolean.valueOf(true);
    }

    public final void run()
    {
        a.b("TCPTransport.run: transport thread created. Starting connect stage");
_L4:
label0:
        {
            if (!b.booleanValue())
            {
                com.ford.syncV4.i.m.a(a, com.ford.syncV4.i.n.b);
                if (b())
                {
                    break label0;
                }
                if (b.booleanValue())
                {
                    a.b("TCPTransport.run: Connection failed, but thread already halted");
                } else
                {
                    com.ford.syncV4.i.m.a(a, "Failed to connect to Sync", new a("Failed to connect to Sync", b.j), true);
                }
            }
            a.b("TCPTransport.run: Thread terminated");
            com.ford.syncV4.i.m.a(a, com.ford.syncV4.i.n.a);
            return;
        }
        synchronized (a)
        {
            com.ford.syncV4.i.m.a(a, n.c);
            a.f();
        }
        obj = new byte[4096];
_L2:
        int i;
        if (b.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        a.b("TCPTransport.run: Waiting for data...");
        try
        {
            i = m.d(a).read(((byte []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (b.booleanValue())
            {
                a.c("TCPTransport.run: Exception during reading data, but thread already halted");
            } else
            {
                a.c("TCPTransport.run: Exception during reading data");
                com.ford.syncV4.i.m.a(a, "Failed to read data from Sync", new a("Failed to read data from Sync", b.j), false);
            }
            continue; /* Loop/switch isn't completed */
        }
        synchronized (a)
        {
            if (!m.e(a).isInterrupted())
            {
                break MISSING_BLOCK_LABEL_264;
            }
            a.b("TCPTransport.run: Got new data but thread is interrupted");
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
        a.b("TCPTransport.run: Got new data");
        if (-1 == i)
        {
            if (b.booleanValue())
            {
                a.b("TCPTransport.run: TCP disconnect received, but thread already halted");
            } else
            {
                a.b("TCPTransport.run: TCP disconnect received");
                com.ford.syncV4.i.m.a(a, "TCPTransport.run: End of stream reached", null, false);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i == 0)
        {
            a.b("TCPTransport.run: Received zero bytes");
        } else
        {
            a.b(String.format("TCPTransport.run: Received %d bytes", new Object[] {
                Integer.valueOf(i)
            }));
            synchronized (a)
            {
                a.a(((byte []) (obj)), i);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
