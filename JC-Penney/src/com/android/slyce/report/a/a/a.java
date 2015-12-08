// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.a;

import com.android.slyce.report.a.d;
import com.android.slyce.report.a.e;
import com.android.slyce.report.a.e.f;
import com.android.slyce.report.a.e.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.android.slyce.report.a.a:
//            c

public abstract class a extends d
    implements com.android.slyce.report.a.a, Runnable
{

    static final boolean b;
    protected URI a;
    private e c;
    private Socket d;
    private InputStream e;
    private OutputStream f;
    private Proxy g;
    private Thread h;
    private com.android.slyce.report.a.b.a i;
    private Map j;
    private CountDownLatch k;
    private CountDownLatch l;
    private int m;

    public a(URI uri, com.android.slyce.report.a.b.a a1, Map map, int i1)
    {
        a = null;
        c = null;
        d = null;
        g = Proxy.NO_PROXY;
        k = new CountDownLatch(1);
        l = new CountDownLatch(1);
        m = 0;
        if (uri == null)
        {
            throw new IllegalArgumentException();
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        } else
        {
            a = uri;
            i = a1;
            j = map;
            m = i1;
            c = new e(this, a1);
            return;
        }
    }

    static e a(a a1)
    {
        return a1.c;
    }

    static OutputStream b(a a1)
    {
        return a1.f;
    }

    private int g()
    {
        String s;
label0:
        {
            int j1 = a.getPort();
            int i1 = j1;
            if (j1 == -1)
            {
                s = a.getScheme();
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

    private void h()
    {
        Object obj;
        Object obj1;
label0:
        {
            String s = a.getPath();
            obj1 = a.getQuery();
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
        int i1 = g();
        obj1 = (new StringBuilder()).append(a.getHost());
        if (i1 != 80)
        {
            obj = (new StringBuilder()).append(":").append(i1).toString();
        } else
        {
            obj = "";
        }
        obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        obj = new com.android.slyce.report.a.e.d();
        ((com.android.slyce.report.a.e.d) (obj)).a(s1);
        ((com.android.slyce.report.a.e.d) (obj)).a("Host", ((String) (obj1)));
        if (j != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = j.entrySet().iterator(); iterator.hasNext(); ((com.android.slyce.report.a.e.d) (obj)).a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        c.a(((com.android.slyce.report.a.e.b) (obj)));
    }

    public InetSocketAddress a()
    {
        return c.a();
    }

    public void a(int i1, String s)
    {
    }

    public void a(int i1, String s, boolean flag)
    {
    }

    public void a(com.android.slyce.report.a.a a1, int i1, String s)
    {
        a(i1, s);
    }

    public final void a(com.android.slyce.report.a.a a1, int i1, String s, boolean flag)
    {
        k.countDown();
        l.countDown();
        if (h != null)
        {
            h.interrupt();
        }
        try
        {
            if (d != null)
            {
                d.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.report.a.a a1)
        {
            a(((com.android.slyce.report.a.a) (this)), ((Exception) (a1)));
        }
        b(i1, s, flag);
    }

    public void a(com.android.slyce.report.a.a a1, com.android.slyce.report.a.d.d d1)
    {
        b(d1);
    }

    public final void a(com.android.slyce.report.a.a a1, f f1)
    {
        k.countDown();
        a((h)f1);
    }

    public final void a(com.android.slyce.report.a.a a1, Exception exception)
    {
        a(exception);
    }

    public final void a(com.android.slyce.report.a.a a1, String s)
    {
        a(s);
    }

    public final void a(com.android.slyce.report.a.a a1, ByteBuffer bytebuffer)
    {
        a(bytebuffer);
    }

    public void a(com.android.slyce.report.a.d.d d1)
    {
        c.a(d1);
    }

    public void a(com.android.slyce.report.a.d.e e1, ByteBuffer bytebuffer, boolean flag)
    {
        c.a(e1, bytebuffer, flag);
    }

    public abstract void a(h h1);

    public abstract void a(Exception exception);

    public abstract void a(String s);

    public void a(Socket socket)
    {
        if (d != null)
        {
            throw new IllegalStateException("socket has already been set");
        } else
        {
            d = socket;
            return;
        }
    }

    public void a(ByteBuffer bytebuffer)
    {
    }

    public void b()
    {
        if (h != null)
        {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } else
        {
            h = new Thread(this);
            h.start();
            return;
        }
    }

    public abstract void b(int i1, String s, boolean flag);

    public final void b(com.android.slyce.report.a.a a1)
    {
    }

    public void b(com.android.slyce.report.a.a a1, int i1, String s, boolean flag)
    {
        a(i1, s, flag);
    }

    public void b(com.android.slyce.report.a.d.d d1)
    {
    }

    public InetSocketAddress c(com.android.slyce.report.a.a a1)
    {
        if (d != null)
        {
            return (InetSocketAddress)d.getLocalSocketAddress();
        } else
        {
            return null;
        }
    }

    public boolean c()
    {
        b();
        k.await();
        return c.c();
    }

    public boolean d()
    {
        return c.e();
    }

    public boolean e()
    {
        return c.f();
    }

    public boolean f()
    {
        return c.d();
    }

    public void run()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        d = new Socket(g);
_L6:
        if (!d.isBound())
        {
            d.connect(new InetSocketAddress(a.getHost(), g()), m);
        }
        e = d.getInputStream();
        f = d.getOutputStream();
        h();
        byte abyte0[];
        h = new Thread(new c(this, null));
        h.start();
        abyte0 = new byte[e.a];
_L4:
        int i1;
        if (e())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = e.read(abyte0);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        c.a(ByteBuffer.wrap(abyte0, 0, i1));
        IOException ioexception;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            c.b();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            c.b();
        }
        catch (RuntimeException runtimeexception)
        {
            a(runtimeexception);
            c.b(1006, runtimeexception.getMessage());
        }
        if (!b && !d.isClosed())
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_229;
_L2:
        if (!d.isClosed()) goto _L6; else goto _L5
_L5:
        throw new IOException();
        exception;
        a(c, exception);
        c.b(-1, exception.getMessage());
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/report/a/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
