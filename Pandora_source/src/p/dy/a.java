// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import p.dx.b;
import p.dx.c;
import p.dx.d;
import p.ec.f;
import p.ec.h;

public abstract class p.dy.a extends c
    implements Runnable, b
{
    private class a
        implements Runnable
    {

        final p.dy.a a;

        public void run()
        {
            Thread.currentThread().setName("WebsocketWriteThread");
            try
            {
                for (; !Thread.interrupted(); p.dy.a.b(a).flush())
                {
                    ByteBuffer bytebuffer = (ByteBuffer)p.dy.a.a(a).f.take();
                    p.dy.a.b(a).write(bytebuffer.array(), 0, bytebuffer.limit());
                }

            }
            catch (IOException ioexception)
            {
                p.dy.a.a(a).f();
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

        private a()
        {
            a = p.dy.a.this;
            super();
        }

    }


    static final boolean d;
    private d a;
    protected URI b;
    protected Timer c;
    private Socket e;
    private InputStream f;
    private OutputStream g;
    private Proxy h;
    private Thread i;
    private p.dz.a j;
    private Map k;
    private CountDownLatch l;
    private CountDownLatch m;
    private int n;

    public p.dy.a(URI uri, p.dz.a a1, Map map, int i1)
    {
        b = null;
        a = null;
        e = null;
        h = Proxy.NO_PROXY;
        l = new CountDownLatch(1);
        m = new CountDownLatch(1);
        n = 0;
        c = null;
        if (uri == null)
        {
            throw new IllegalArgumentException();
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        } else
        {
            b = uri;
            j = a1;
            k = map;
            n = i1;
            a = new d(this, a1);
            return;
        }
    }

    static d a(p.dy.a a1)
    {
        return a1.a;
    }

    static OutputStream b(p.dy.a a1)
    {
        return a1.g;
    }

    private int j()
    {
        String s;
label0:
        {
            int j1 = b.getPort();
            int i1 = j1;
            if (j1 == -1)
            {
                s = b.getScheme();
                if (!s.equals("wss"))
                {
                    break label0;
                }
                i1 = 443;
            }
            return i1;
        }
        if (s.equals("ws"))
        {
            return 80;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("unkonow scheme").append(s).toString());
        }
    }

    private void k()
        throws p.ea.d
    {
        Object obj;
        Object obj1;
label0:
        {
            String s = b.getPath();
            obj1 = b.getQuery();
            if (s != null)
            {
                obj = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            obj = "/";
        }
        String s1 = ((String) (obj));
        if (obj1 != null)
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("?").append(((String) (obj1))).toString();
        }
        int i1 = j();
        obj1 = (new StringBuilder()).append(b.getHost());
        if (i1 != 80)
        {
            obj = (new StringBuilder()).append(":").append(i1).toString();
        } else
        {
            obj = "";
        }
        obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        obj = new p.ec.d();
        ((p.ec.d) (obj)).a(s1);
        ((p.ec.d) (obj)).a("Host", ((String) (obj1)));
        if (k != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = k.entrySet().iterator(); iterator.hasNext(); ((p.ec.d) (obj)).a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        a.a(((p.ec.b) (obj)));
    }

    public InetSocketAddress a()
    {
        return a.a();
    }

    public void a(int i1)
    {
        a.k();
    }

    public void a(int i1, String s)
    {
        a.a(i1, s);
    }

    public abstract void a(int i1, String s, boolean flag);

    public abstract void a(Exception exception);

    public void a(ByteBuffer bytebuffer)
    {
    }

    public void a(b b1, int i1, String s)
    {
        b(i1, s);
    }

    public void a(b b1, p.eb.d d1)
    {
        b(d1);
    }

    public final void a(b b1, f f1)
    {
        l.countDown();
        a((h)f1);
    }

    public void a(p.eb.d d1)
    {
        a.a(d1);
    }

    public abstract void a(h h1);

    public void b(int i1, String s)
    {
    }

    public void b(int i1, String s, boolean flag)
    {
    }

    public abstract void b(String s);

    public final void b(b b1)
    {
    }

    public final void b(b b1, int i1, String s, boolean flag)
    {
        l.countDown();
        m.countDown();
        if (i != null)
        {
            i.interrupt();
        }
        try
        {
            if (e != null)
            {
                e.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            b(((b) (this)), ((Exception) (b1)));
        }
        a(i1, s, flag);
    }

    public final void b(b b1, Exception exception)
    {
        a(exception);
    }

    public final void b(b b1, String s)
    {
        b(s);
    }

    public final void b(b b1, ByteBuffer bytebuffer)
    {
        a(bytebuffer);
    }

    public void b(b b1, p.eb.d d1)
    {
        super.b(b1, d1);
        h();
    }

    public void b(p.eb.d d1)
    {
    }

    public boolean b()
    {
        return a.b();
    }

    public InetSocketAddress c(b b1)
    {
        if (e != null)
        {
            return (InetSocketAddress)e.getLocalSocketAddress();
        } else
        {
            return null;
        }
    }

    public void c(String s)
        throws NotYetConnectedException
    {
        a.c(s);
    }

    public void c(b b1, int i1, String s, boolean flag)
    {
        b(i1, s, flag);
    }

    public boolean c()
    {
        return a.c();
    }

    public boolean d()
    {
        return a.d();
    }

    public void e()
    {
        if (i != null)
        {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } else
        {
            i = new Thread(this);
            i.start();
            return;
        }
    }

    public void f()
    {
        if (i != null)
        {
            a.a(1000);
        }
    }

    public b g()
    {
        return a;
    }

    protected void h()
    {
        i();
        c = new Timer();
        TimerTask timertask = new TimerTask() {

            final p.dy.a a;

            public void run()
            {
                a.a(new RuntimeException("CastChat client timed out in 15seconds without receiving a status response."));
            }

            
            {
                a = p.dy.a.this;
                super();
            }
        };
        c.schedule(timertask, 15000L);
    }

    protected void i()
    {
        if (c != null)
        {
            c.cancel();
            c = null;
        }
    }

    public void run()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        e = new Socket(h);
_L6:
        if (!e.isBound())
        {
            e.connect(new InetSocketAddress(b.getHost(), j()), n);
        }
        f = e.getInputStream();
        g = e.getOutputStream();
        k();
        byte abyte0[];
        i = new Thread(new a());
        i.start();
        abyte0 = new byte[d.a];
_L4:
        int i1;
        if (d())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = f.read(abyte0);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        a.a(ByteBuffer.wrap(abyte0, 0, i1));
        IOException ioexception;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            a.f();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            a.f();
        }
        catch (RuntimeException runtimeexception)
        {
            a(runtimeexception);
            a.a(1006, runtimeexception.getMessage());
        }
        if (!d && !e.isClosed())
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_229;
_L2:
        if (!e.isClosed()) goto _L6; else goto _L5
_L5:
        throw new IOException();
        exception;
        b(a, exception);
        a.a(-1, exception.getMessage());
    }

    static 
    {
        boolean flag;
        if (!p/dy/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
