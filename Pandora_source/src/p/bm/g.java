// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import p.ax.a;

// Referenced classes of package p.bm:
//            f, e, i, h, 
//            d

public class g extends f
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bm/g$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("IDLE", 0);
            b = new a("CONNECTING", 1);
            c = new a("CONNECTED", 2);
            d = new a("DISCONNECTING", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }

    private class b extends Thread
    {

        final g a;
        private Boolean b;

        private boolean b()
        {
            int j = 30;
            g g1 = a;
            g1;
            JVM INSTR monitorenter ;
_L4:
            if (p.bm.g.a(a) != null && !p.bm.g.a(a).isClosed())
            {
                a.b("TCPTransport.connect: Socket is not closed. Trying to close it");
                p.bm.g.a(a).close();
            }
            a.b(String.format("TCPTransport.connect: Socket is closed. Trying to connect to %s", new Object[] {
                g.b(a)
            }));
            p.bm.g.a(a, new Socket());
            p.bm.g.a(a).connect(new InetSocketAddress(g.b(a).e(), g.b(a).b()));
            p.bm.g.a(a, p.bm.g.a(a).getOutputStream());
            p.bm.g.a(a, p.bm.g.a(a).getInputStream());
_L5:
            Object obj;
            boolean flag;
            if (p.bm.g.a(a) != null && p.bm.g.a(a).isConnected())
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
            if (!g.b(a).f() || j <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!b.booleanValue()) goto _L4; else goto _L3
_L3:
            g1;
            JVM INSTR monitorexit ;
            return flag;
            obj;
            a.c((new StringBuilder()).append("TCPTransport.connect: Exception during connect stage: ").append(((IOException) (obj)).getMessage()).toString());
              goto _L5
            obj;
            g1;
            JVM INSTR monitorexit ;
            throw obj;
_L2:
            if (!g.b(a).f())
            {
                break MISSING_BLOCK_LABEL_349;
            }
            j--;
            a.b(String.format("TCPTransport.connect: Socket not connected. AutoReconnect is ON. retryCount is: %d. Waiting for reconnect delay: %d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(5000)
            }));
            p.bm.g.a(a, 5000L);
              goto _L6
            a.b("TCPTransport.connect: Socket not connected. AutoReconnect is OFF");
              goto _L6
        }

        private void c()
        {
            if (b.booleanValue())
            {
                a.b("TCPTransport.run: TCP disconnect received, but thread already halted");
                return;
            } else
            {
                a.b("TCPTransport.run: TCP disconnect received");
                p.bm.g.a(a, "TCPTransport.run: End of stream reached", null, false);
                return;
            }
        }

        private void d()
        {
            if (b.booleanValue())
            {
                a.c("TCPTransport.run: Exception during reading data, but thread already halted");
                return;
            } else
            {
                a.c("TCPTransport.run: Exception during reading data");
                p.bm.g.a(a, "Failed to read data from Sync", new p.ax.a("Failed to read data from Sync", p.ax.b.j), false);
                return;
            }
        }

        public void a()
        {
            b = Boolean.valueOf(true);
        }

        public void run()
        {
            a.b("TCPTransport.run: transport thread created. Starting connect stage");
_L4:
label0:
            {
                if (!b.booleanValue())
                {
                    p.bm.g.a(a, a.b);
                    if (b())
                    {
                        break label0;
                    }
                    if (b.booleanValue())
                    {
                        a.b("TCPTransport.run: Connection failed, but thread already halted");
                    } else
                    {
                        p.bm.g.a(a, "Failed to connect to Sync", new p.ax.a("Failed to connect to Sync", p.ax.b.j), true);
                    }
                }
                a.b("TCPTransport.run: Thread terminated");
                p.bm.g.a(a, p.bm.a.a);
                return;
            }
            synchronized (a)
            {
                p.bm.g.a(a, a.c);
                a.f();
            }
            obj = new byte[4096];
_L2:
            int j;
            if (b.booleanValue())
            {
                continue; /* Loop/switch isn't completed */
            }
            a.b("TCPTransport.run: Waiting for data...");
            try
            {
                j = g.c(a).read(((byte []) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                d();
                continue; /* Loop/switch isn't completed */
            }
            synchronized (a)
            {
                if (!g.d(a).isInterrupted())
                {
                    break MISSING_BLOCK_LABEL_215;
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
            if (-1 == j)
            {
                c();
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0)
            {
                a.b("TCPTransport.run: Received zero bytes");
            } else
            {
                a.b(String.format("TCPTransport.run: Received %d bytes", new Object[] {
                    Integer.valueOf(j)
                }));
                synchronized (a)
                {
                    a.a(((byte []) (obj)), j);
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            g1;
            JVM INSTR monitorexit ;
            throw exception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private b()
        {
            a = g.this;
            super();
            b = Boolean.valueOf(false);
        }

    }


    private h a;
    private Socket b;
    private InputStream c;
    private OutputStream d;
    private b e;
    private a f;

    public g(h h, d d1)
    {
        super(d1);
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = p.bm.a.a;
        a = h;
    }

    static InputStream a(g g1, InputStream inputstream)
    {
        g1.c = inputstream;
        return inputstream;
    }

    static OutputStream a(g g1, OutputStream outputstream)
    {
        g1.d = outputstream;
        return outputstream;
    }

    static Socket a(g g1)
    {
        return g1.b;
    }

    static Socket a(g g1, Socket socket)
    {
        g1.b = socket;
        return socket;
    }

    private void a(long l)
    {
        l = System.currentTimeMillis() + l;
_L2:
        if (System.currentTimeMillis() >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            wait(l - System.currentTimeMillis());
        }
        catch (Exception exception1) { }
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    private void a(String s, Exception exception, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (g() != a.d) goto _L2; else goto _L1
_L1:
        b("TCPTransport: disconnecting already in progress");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(a.d);
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
            break MISSING_BLOCK_LABEL_168;
        }
        b("Disconnect is correct. Handling it");
        a(s);
          goto _L3
        s;
        throw s;
        IOException ioexception;
        ioexception;
        c((new StringBuilder()).append("TCPTransport.disconnect: Exception during disconnect: ").append(ioexception.getMessage()).toString());
          goto _L4
        c("Disconnect is incorrect. Handling it as error");
        a(s, exception);
          goto _L3
    }

    private void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        b(String.format("Current state changed to: %s", new Object[] {
            a1
        }));
        f = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    static void a(g g1, long l)
    {
        g1.a(l);
    }

    static void a(g g1, String s, Exception exception, boolean flag)
    {
        g1.a(s, exception, flag);
    }

    static void a(g g1, a a1)
    {
        g1.a(a1);
    }

    static h b(g g1)
    {
        return g1.a;
    }

    static InputStream c(g g1)
    {
        return g1.c;
    }

    static b d(g g1)
    {
        return g1.e;
    }

    private a g()
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = f;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
        throws p.ax.a
    {
        a a1 = g();
        b(String.format("TCPTransport: openConnection requested. Current state is: %s", new Object[] {
            a1.name()
        }));
        if (a1 != p.bm.a.a)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        this;
        JVM INSTR monitorenter ;
        a(a.b);
        b("TCPTransport: openConnection request accepted. Starting transport thread");
        e = new b();
        e.setDaemon(true);
        e.start();
        p.bm.e.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        a("TCPTransport: Exception during transport thread starting", ((Throwable) (obj)));
        throw new p.ax.a(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        b("TCPTransport: openConnection request rejected. Another connection is not finished");
        return;
    }

    protected void a(String s, Throwable throwable)
    {
        Log.e(getClass().getName(), s, throwable);
    }

    protected boolean a(byte abyte0[], int j, int k)
    {
        a a1;
        boolean flag;
        flag = false;
        a1 = g();
        b(String.format("TCPTransport: sendBytesOverTransport requested. Size: %d, Offset: %d, Length: %d, Current state is: %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(j), Integer.valueOf(k), a1.name()
        }));
        if (a1 != a.c) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L4; else goto _L3
_L3:
        b("TCPTransport: sendBytesOverTransport request accepted. Trying to send data");
        d.write(abyte0, j, k);
        b("TCPTransport.sendBytesOverTransport: successfully send data");
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        abyte0;
        c((new StringBuilder()).append("TCPTransport.sendBytesOverTransport: error during sending data: ").append(abyte0.getMessage()).toString());
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

    public void b()
    {
        a a1 = g();
        b(String.format("TCPTransport: disconnect requested from client. Current state is: %s", new Object[] {
            a1.name()
        }));
        if (a1 != a.c)
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

    protected void b(String s)
    {
        Log.i(getClass().getName(), s);
    }

    public i c()
    {
        return i.b;
    }

    protected void c(String s)
    {
        Log.e(getClass().getName(), s);
    }

    public String d()
    {
        return "";
    }
}
