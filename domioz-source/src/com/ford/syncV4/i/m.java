// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import android.util.Log;
import com.ford.syncV4.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// Referenced classes of package com.ford.syncV4.i:
//            l, n, o, h, 
//            q, p, g

public final class m extends l
{

    private p a;
    private Socket b;
    private InputStream c;
    private OutputStream d;
    private o e;
    private n f;

    public m(p p, g g1)
    {
        super(g1);
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = com.ford.syncV4.i.n.a;
        a = p;
    }

    static InputStream a(m m1, InputStream inputstream)
    {
        m1.c = inputstream;
        return inputstream;
    }

    static OutputStream a(m m1, OutputStream outputstream)
    {
        m1.d = outputstream;
        return outputstream;
    }

    static Socket a(m m1)
    {
        return m1.b;
    }

    static Socket a(m m1, Socket socket)
    {
        m1.b = socket;
        return socket;
    }

    static void a(m m1, n n1)
    {
        m1.a(n1);
    }

    static void a(m m1, String s, Exception exception, boolean flag)
    {
        m1.a(s, exception, flag);
    }

    private void a(n n1)
    {
        this;
        JVM INSTR monitorenter ;
        b(String.format("Current state changed to: %s", new Object[] {
            n1
        }));
        f = n1;
        this;
        JVM INSTR monitorexit ;
        return;
        n1;
        throw n1;
    }

    private void a(String s, Exception exception, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (g() != n.d) goto _L2; else goto _L1
_L1:
        b("TCPTransport: disconnecting already in progress");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(n.d);
        if (s == null)
        {
            s = "";
        }
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = (new StringBuilder()).append(s).append(", ").append(exception.toString()).toString();
        if (e == null || !flag)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        e.a();
        e.interrupt();
        if (b != null)
        {
            b.close();
        }
        b = null;
_L4:
        if (exception != null)
        {
            break MISSING_BLOCK_LABEL_165;
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

    static p b(m m1)
    {
        return m1.a;
    }

    static void c(m m1)
    {
        long l1 = System.currentTimeMillis() + 5000L;
_L2:
        if (System.currentTimeMillis() >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        m1;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            m1.wait(l1 - System.currentTimeMillis());
        }
        catch (Exception exception1) { }
        m1;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    static InputStream d(m m1)
    {
        return m1.c;
    }

    static o e(m m1)
    {
        return m1.e;
    }

    private n g()
    {
        this;
        JVM INSTR monitorenter ;
        n n1 = f;
        this;
        JVM INSTR monitorexit ;
        return n1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        n n1 = g();
        b(String.format("TCPTransport: openConnection requested. Current state is: %s", new Object[] {
            n1.name()
        }));
        if (n1 != com.ford.syncV4.i.n.a)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        this;
        JVM INSTR monitorenter ;
        a(n.b);
        b("TCPTransport: openConnection request accepted. Starting transport thread");
        e = new o(this, (byte)0);
        e.setDaemon(true);
        e.start();
        com.ford.syncV4.i.h.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e(getClass().getName(), "TCPTransport: Exception during transport thread starting", ((Throwable) (obj)));
        throw new a(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        b("TCPTransport: openConnection request rejected. Another connection is not finished");
        return;
    }

    protected final boolean a(byte abyte0[], int i, int j)
    {
        n n1;
        boolean flag;
        flag = false;
        n1 = g();
        b(String.format("TCPTransport: sendBytesOverTransport requested. Size: %d, Offset: %d, Length: %d, Current state is: %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j), n1.name()
        }));
        if (n1 != n.c) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L4; else goto _L3
_L3:
        b("TCPTransport: sendBytesOverTransport request accepted. Trying to send data");
        d.write(abyte0, i, j);
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
        n n1 = g();
        b(String.format("TCPTransport: disconnect requested from client. Current state is: %s", new Object[] {
            n1.name()
        }));
        if (n1 != n.c)
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

    protected final void b(String s)
    {
        Log.i(getClass().getName(), s);
    }

    public final int c()
    {
        return q.b;
    }

    protected final void c(String s)
    {
        Log.e(getClass().getName(), s);
    }

    public final String d()
    {
        return "";
    }
}
