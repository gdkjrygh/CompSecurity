// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.a;

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
import org.java_websocket.b.f;
import org.java_websocket.d;
import org.java_websocket.e;

// Referenced classes of package org.java_websocket.a:
//            b

public abstract class a extends d
    implements Runnable, org.java_websocket.a
{

    static final boolean c;
    private e a;
    protected URI b;
    private Socket d;
    private InputStream e;
    private OutputStream f;
    private Proxy g;
    private Thread h;
    private org.java_websocket.b.a i;
    private Map j;
    private CountDownLatch k;
    private CountDownLatch l;
    private int m;

    public a(URI uri)
    {
        this(uri, ((org.java_websocket.b.a) (new f())));
    }

    private a(URI uri, org.java_websocket.b.a a1)
    {
        this(uri, a1, (byte)0);
    }

    private a(URI uri, org.java_websocket.b.a a1, byte byte0)
    {
        b = null;
        a = null;
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
            b = uri;
            i = a1;
            j = null;
            m = 0;
            a = new e(this, a1);
            return;
        }
    }

    static e a(a a1)
    {
        return a1.a;
    }

    static OutputStream b(a a1)
    {
        return a1.f;
    }

    private int n()
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
            throw new RuntimeException((new StringBuilder("unkonow scheme")).append(s).toString());
        }
    }

    private void o()
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
        int i1 = n();
        obj1 = (new StringBuilder()).append(b.getHost());
        if (i1 != 80)
        {
            obj = (new StringBuilder(":")).append(i1).toString();
        } else
        {
            obj = "";
        }
        obj1 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        obj = new org.java_websocket.e.d();
        ((org.java_websocket.e.d) (obj)).a(s1);
        ((org.java_websocket.e.d) (obj)).a("Host", ((String) (obj1)));
        if (j != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = j.entrySet().iterator(); iterator.hasNext(); ((org.java_websocket.e.d) (obj)).a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        a.a(((org.java_websocket.e.b) (obj)));
    }

    public abstract void a();

    public abstract void a(Exception exception);

    public abstract void a(String s);

    public final void a(org.java_websocket.d.d d1)
    {
        a.a(d1);
    }

    public abstract void b();

    public final void b(Exception exception)
    {
        a(exception);
    }

    public final void b(String s)
    {
        a(s);
    }

    public void c()
    {
    }

    public final InetSocketAddress d()
    {
        return a.d();
    }

    public final boolean e()
    {
        return a.e();
    }

    public final void g()
    {
        k.countDown();
        a();
    }

    public final void h()
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
        catch (IOException ioexception)
        {
            a(ioexception);
        }
        b();
    }

    public final void i()
    {
        c();
    }

    public final InetSocketAddress j()
    {
        if (d != null)
        {
            return (InetSocketAddress)d.getLocalSocketAddress();
        } else
        {
            return null;
        }
    }

    public final void k()
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

    public final void l()
    {
        if (h != null)
        {
            a.c();
        }
    }

    public final org.java_websocket.a m()
    {
        return a;
    }

    public void run()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        d = new Socket(g);
_L6:
        if (!d.isBound())
        {
            d.connect(new InetSocketAddress(b.getHost(), n()), m);
        }
        e = d.getInputStream();
        f = d.getOutputStream();
        o();
        byte abyte0[];
        h = new Thread(new b(this, (byte)0));
        h.start();
        abyte0 = new byte[e.a];
_L4:
        int i1;
        if (a.f())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = e.read(abyte0);
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
            a.b();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            a.b();
        }
        catch (RuntimeException runtimeexception)
        {
            a(runtimeexception);
            e e2 = a;
            runtimeexception.getMessage();
            e2.a();
        }
        if (!c && !d.isClosed())
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_230;
_L2:
        if (!d.isClosed()) goto _L6; else goto _L5
_L5:
        throw new IOException();
        exception;
        a(exception);
        e1 = a;
        exception.getMessage();
        e1.a();
    }

    static 
    {
        boolean flag;
        if (!org/java_websocket/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
