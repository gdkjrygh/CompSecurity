// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import com.pandora.android.data.t;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p.df.a;

// Referenced classes of package p.bu:
//            a

public class f
    implements Runnable
{

    private static f a;
    private static AtomicInteger e = new AtomicInteger(1);
    private boolean b;
    private ServerSocket c;
    private Thread d;
    private final Hashtable f = new Hashtable();
    private ExecutorService g;
    private int h;

    private f()
    {
        b = true;
        g = Executors.newFixedThreadPool(4);
        h = 0;
        try
        {
            c = new ServerSocket(h, 0, InetAddress.getByAddress(new byte[] {
                127, 0, 0, 1
            }));
            c.setSoTimeout(30000);
            h = c.getLocalPort();
            p.df.a.a("VideoProxy", (new StringBuilder()).append("port ").append(h).append(" obtained").toString());
        }
        catch (IOException ioexception)
        {
            p.df.a.b("VideoProxy", "Error initializing server", ioexception);
        }
        c();
    }

    public static f a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        p/bu/f;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new f();
        }
        p/bu/f;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        p/bu/f;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b()
    {
        p/bu/f;
        JVM INSTR monitorenter ;
        f f1 = a;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        f1.d();
        a = null;
        p/bu/f;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p/bu/f;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void c()
    {
        if (c == null)
        {
            throw new IllegalStateException("Cannot start proxy; it has not been initialized.");
        } else
        {
            d = new Thread(this);
            d.start();
            return;
        }
    }

    private void d()
    {
        b = false;
        if (d == null)
        {
            return;
        }
        if (c != null)
        {
            c.close();
        }
        d.interrupt();
        d.join(5000L);
        return;
        Object obj;
        obj;
_L2:
        p.df.a.d("VideoProxy", "Error stopping proxy", ((Throwable) (obj)));
        return;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int a(t t)
    {
        int i = e.getAndIncrement();
        f.put(Integer.valueOf(i), t);
        return i;
    }

    public String a(String s, int i)
    {
        return String.format("http://127.0.0.1:%d/%s&id=%d", new Object[] {
            Integer.valueOf(h), s, Integer.valueOf(i)
        });
    }

    public void a(int i)
    {
        f.remove(Integer.valueOf(i));
    }

    public void run()
    {
        Thread.currentThread().setName("VideoProxy Main Thread");
        p.df.a.a("VideoProxy", "running");
_L2:
        if (!b)
        {
            break; /* Loop/switch isn't completed */
        }
        Socket socket = c.accept();
        if (socket == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        p.bu.a a1;
        p.df.a.a("VideoProxy", "client connected");
        a1 = p.bu.a.a(socket, f, g);
        if (a1 != null)
        {
            IOException ioexception;
            try
            {
                a1.a(socket);
            }
            catch (SocketTimeoutException sockettimeoutexception) { }
            catch (IOException ioexception1)
            {
                p.df.a.b("VideoProxy", "Error connecting to client", ioexception1);
            }
            continue; /* Loop/switch isn't completed */
        }
        p.df.a.b("VideoProxy", "Unable to prepare request");
        try
        {
            socket.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        if (true) goto _L2; else goto _L1
_L1:
        p.df.a.c("VideoProxy", "Proxy interrupted. Shutting down.");
        return;
    }

}
