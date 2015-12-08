// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.j;
import com.nuance.a.a.a.a.d.a.m;
import com.nuance.a.a.a.b.b.a;
import com.nuance.a.a.a.b.b.c;
import com.nuance.a.a.a.b.b.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.nuance.a.a.a.b:
//            m, p, o

final class n extends Thread
{

    private String a;
    private int b;
    private j c;
    private com.nuance.a.a.a.a.d.a.n d;
    private Object e;
    private m f;
    private boolean g;
    private Vector h;
    private c i;
    private com.nuance.a.a.a.b.m j;

    public n(com.nuance.a.a.a.b.m m1, String s, int k, c c1, j j1, com.nuance.a.a.a.a.d.a.n n1)
    {
        j = m1;
        super();
        a = null;
        c = null;
        d = null;
        e = null;
        f = m.a;
        g = false;
        h = null;
        i = null;
        a = s;
        b = k;
        c = j1;
        d = n1;
        e = null;
        h = new Vector();
        i = c1;
        if ((i.a == d.b || i.a == d.c) && i.b == null && com.nuance.a.a.a.b.m.a().e())
        {
            com.nuance.a.a.a.b.m.a().b("Trying to use device's proxy setting, the upper layer needs to pass the android context object. Check the parameter NMSP_DEFINES_ANDROID_CONTEXT.");
        }
    }

    static boolean a(n n1)
    {
        return n1.g;
    }

    public final m a(o o1)
    {
        Object obj;
        if (g)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj = m.a;
        Object obj1 = com.nuance.a.a.a.b.m.a(j);
        obj1;
        JVM INSTR monitorenter ;
        if (h != null) goto _L2; else goto _L1
_L1:
        o1 = m.b;
        obj = "SocketReadThread: queue is null!!";
_L3:
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
        com.nuance.a.a.a.b.m.a(j).notify();
        obj1;
        JVM INSTR monitorexit ;
        if (com.nuance.a.a.a.b.m.a().e() && obj != null)
        {
            com.nuance.a.a.a.b.m.a().b(obj);
        }
        return o1;
_L2:
        h.addElement(o1);
        o1 = ((o) (obj));
        obj = null;
          goto _L3
        o1;
        throw o1;
        if (com.nuance.a.a.a.b.m.a().e())
        {
            com.nuance.a.a.a.b.m.a().b("SocketReadThread is already stopping!");
        }
        return m.b;
    }

    public final void a()
    {
        synchronized (com.nuance.a.a.a.b.m.a(j))
        {
            g = true;
            h.removeAllElements();
            h = null;
            com.nuance.a.a.a.b.m.a(j).notify();
        }
    }

    public final void b()
    {
        String s = null;
        Object obj = com.nuance.a.a.a.b.m.a(j);
        obj;
        JVM INSTR monitorenter ;
        if (h != null) goto _L2; else goto _L1
_L1:
        s = "SocketReadThread.cleanPendingJobs(): queue is null!!";
_L4:
        obj;
        JVM INSTR monitorexit ;
        if (com.nuance.a.a.a.b.m.a().e() && s != null)
        {
            com.nuance.a.a.a.b.m.a().b(s);
        }
        return;
_L2:
        h.removeAllElements();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void run()
    {
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
            (new StringBuilder("Open Socket connection on host:- [")).append(a).append("] and port[").append(b).append("]");
        }
        Object obj1 = com.nuance.a.a.a.b.b.a.a(i, a, b);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IOException("socket couldn't be opened!");
        }
        catch (UnknownHostException unknownhostexception)
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Open Streams Exception - [")).append(unknownhostexception.getClass().getName()).append("] Message - [").append(unknownhostexception.getMessage()).append("]").toString());
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
        }
        catch (IOException ioexception)
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Open Streams Exception - [")).append(ioexception.getClass().getName()).append("] Message - [").append(ioexception.getMessage()).append("]").toString());
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
            return;
        }
        catch (SecurityException securityexception)
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Open Streams Exception - [")).append(securityexception.getClass().getName()).append("] Message - [").append(securityexception.getMessage()).append("]").toString());
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
            return;
        }
        catch (Throwable throwable)
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Open Streams Exception - [")).append(throwable.getClass().getName()).append("] Message - [").append(throwable.getMessage()).append("]").toString());
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
            return;
        }
_L4:
        return;
_L2:
        if (!((Socket) (obj1)).isConnected())
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b("SocketReadThread NETWORK_ERROR. !sock.isConnected()");
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
            return;
        }
        Object obj;
        Object obj2;
        try
        {
            if (i.c)
            {
                ((SSLSocket)obj1).setUseClientMode(true);
            }
            ((Socket) (obj1)).setTcpNoDelay(true);
            ((Socket) (obj1)).setKeepAlive(true);
            ((Socket) (obj1)).setSoLinger(true, 40);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Set Socket Option Exception - [")).append(obj.getClass().getName()).append("] Message - [").append(((Exception) (obj)).getMessage()).append("]").toString());
            }
        }
        try
        {
            obj = ((Socket) (obj1)).getInputStream();
            obj2 = ((Socket) (obj1)).getOutputStream();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            IOException ioexception2;
            Exception exception;
            o o1;
            try
            {
                ((Socket) (obj1)).close();
            }
            catch (IOException ioexception1) { }
            if (com.nuance.a.a.a.b.m.a().e())
            {
                com.nuance.a.a.a.b.m.a().b((new StringBuilder("Set Socket Option Exception - [")).append(obj.getClass().getName()).append("] Message - [").append(((IOException) (obj)).getMessage()).append("]").toString());
            }
            com.nuance.a.a.a.b.m.a(j, new Object[] {
                m.b(), c, m.b, null, e
            });
            return;
        }
        obj1 = new p(((Socket) (obj1)), d, e, ((InputStream) (obj)), ((java.io.OutputStream) (obj2)), this);
        com.nuance.a.a.a.b.m.a(j, new Object[] {
            m.b(), c, m.a, obj1, e
        });
_L9:
        if (g) goto _L4; else goto _L3
_L3:
        obj2 = com.nuance.a.a.a.b.m.a(j);
        obj2;
        JVM INSTR monitorenter ;
_L6:
        if (g || h == null || !h.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
        com.nuance.a.a.a.b.m.a(j).wait();
_L8:
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
        if (true) goto _L6; else goto _L5
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (com.nuance.a.a.a.b.m.a().e())
        {
            com.nuance.a.a.a.b.m.a().b((new StringBuilder("NetworkSystemJ2me.run() ")).append(obj.getClass().getName()).append(" ").append(((Exception) (obj)).getMessage()).toString());
            return;
        }
          goto _L4
        exception;
        if (!com.nuance.a.a.a.b.m.a().e()) goto _L8; else goto _L7
_L7:
        com.nuance.a.a.a.b.m.a().b((new StringBuilder("InterruptedException ie:")).append(exception).toString());
          goto _L8
_L5:
        if (!g && h != null)
        {
            break MISSING_BLOCK_LABEL_987;
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        o1 = (o)h.elementAt(0);
        h.removeElementAt(0);
        obj2;
        JVM INSTR monitorexit ;
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
        break MISSING_BLOCK_LABEL_1398;
_L11:
        int k;
        int l;
        for (; k >= o1.c; k += l)
        {
            break MISSING_BLOCK_LABEL_1095;
        }

        l = ((InputStream) (obj)).read(o1.a, o1.b + k, o1.c - k);
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_1404;
        }
        if (!g)
        {
            f = m.b;
        }
        if (com.nuance.a.a.a.b.m.a().b())
        {
            com.nuance.a.a.a.b.m.a();
        }
_L10:
        if (f != m.a)
        {
            break MISSING_BLOCK_LABEL_1287;
        }
        com.nuance.a.a.a.b.m.a(j, new Object[] {
            com.nuance.a.a.a.b.m.c(), o1.d, m.a, obj1, o1.a, new Integer(o1.b), new Integer(o1.c), new Integer(o1.c), o1.e
        });
          goto _L9
        ioexception2;
        if (com.nuance.a.a.a.b.m.a().e())
        {
            com.nuance.a.a.a.b.m.a().b((new StringBuilder("Socket Read/Available Expception - [")).append(ioexception2.getClass().getName()).append("] Message - [").append(ioexception2.getMessage()).append("]").toString());
        }
        f = m.b;
          goto _L10
        com.nuance.a.a.a.b.m.a(j, new Object[] {
            com.nuance.a.a.a.b.m.c(), o1.d, m.b, obj1, o1.a, new Integer(o1.b), new Integer(o1.c), new Integer(0), o1.e
        });
        j.a(obj1);
          goto _L9
        k = 0;
          goto _L11
    }
}
