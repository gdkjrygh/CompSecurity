// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class cwb extends cvy
    implements WebSocket, Runnable
{

    private static boolean k;
    public cvz a;
    public Socket b;
    public Thread c;
    public CountDownLatch d;
    private URI e;
    private InputStream f;
    private OutputStream g;
    private Proxy h;
    private CountDownLatch i;
    private int j;

    public cwb(URI uri, Draft draft)
    {
        e = null;
        a = null;
        b = null;
        h = Proxy.NO_PROXY;
        d = new CountDownLatch(1);
        i = new CountDownLatch(1);
        j = 0;
        if (uri == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            e = uri;
            j = 5000;
            a = new cvz(this, draft);
            return;
        }
    }

    static cvz a(cwb cwb1)
    {
        return cwb1.a;
    }

    static OutputStream b(cwb cwb1)
    {
        return cwb1.g;
    }

    private int g()
    {
        String s;
label0:
        {
            int i1 = e.getPort();
            int l = i1;
            if (i1 == -1)
            {
                s = e.getScheme();
                if (!s.equals("wss"))
                {
                    break label0;
                }
                l = 443;
            }
            return l;
        }
        if (s.equals("ws"))
        {
            return 80;
        } else
        {
            throw new RuntimeException((new StringBuilder("unkonow scheme")).append(s).toString());
        }
    }

    public final InetSocketAddress a()
    {
        return a.a();
    }

    public final void a(int l, String s)
    {
        d.countDown();
        i.countDown();
        if (c != null)
        {
            c.interrupt();
        }
        try
        {
            if (b != null)
            {
                b.close();
            }
        }
        catch (IOException ioexception)
        {
            b(ioexception);
        }
        b(l, s);
    }

    public final void a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        cvz cvz1 = a;
        opcode = cvz1.e.a(opcode, bytebuffer, flag);
        if (!cvz1.c())
        {
            throw new WebsocketNotConnectedException();
        }
        for (opcode = opcode.iterator(); opcode.hasNext(); cvz1.a((Framedata)opcode.next())) { }
    }

    public final void a(Framedata framedata)
    {
        a.a(framedata);
    }

    public final void a(Exception exception)
    {
        b(exception);
    }

    public final void a(String s)
    {
        b(s);
    }

    public abstract void b(int l, String s);

    public abstract void b(Exception exception);

    public abstract void b(String s);

    public final void c()
    {
        d.countDown();
        e();
    }

    public final InetSocketAddress d()
    {
        if (b != null)
        {
            return (InetSocketAddress)b.getLocalSocketAddress();
        } else
        {
            return null;
        }
    }

    public abstract void e();

    public final boolean f()
    {
        return a.d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.e;
    }

    public void run()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        b = new Socket(h);
_L8:
        Object obj1;
        Object obj2;
        if (!b.isBound())
        {
            b.connect(new InetSocketAddress(e.getHost(), g()), j);
        }
        f = b.getInputStream();
        g = b.getOutputStream();
        obj1 = e.getPath();
        obj2 = e.getQuery();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        Object obj = obj1;
        if (((String) (obj1)).length() != 0) goto _L5; else goto _L4
_L5:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = (new StringBuilder()).append(((String) (obj))).append("?").append(((String) (obj2))).toString();
        int l;
        l = g();
        obj2 = (new StringBuilder()).append(e.getHost());
        if (l == 80)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        obj1 = (new StringBuilder(":")).append(l).toString();
_L22:
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj1))).toString();
        obj1 = new cwn();
        ((cwn) (obj1)).a(((String) (obj)));
        ((cwn) (obj1)).a("Host", ((String) (obj2)));
        obj = a;
        if (!cvz.j && ((cvz) (obj)).d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.b)
        {
            throw new AssertionError("shall only be called once");
        }
          goto _L6
        obj;
        b(((Exception) (obj)));
        a.a(-1, ((Exception) (obj)).getMessage());
_L11:
        return;
_L2:
        if (!b.isClosed()) goto _L8; else goto _L7
_L7:
        throw new IOException();
_L6:
        obj.h = ((cvz) (obj)).e.a(((cwl) (obj1)));
        obj.i = ((cwl) (obj1)).a();
        if (!cvz.j && ((cvz) (obj)).i == null)
        {
            throw new AssertionError();
        }
        obj1 = ((cvz) (obj)).e;
        obj1 = ((cvz) (obj)).h;
        obj2 = ((cvz) (obj)).f;
        ((cvz) (obj)).a(Draft.b(((cwp) (obj1))));
        c = new Thread(new cwc(this, (byte)0));
        c.start();
        obj = new byte[cvz.a];
_L15:
        if (f())
        {
            break MISSING_BLOCK_LABEL_630;
        }
        l = f.read(((byte []) (obj)));
        if (l == -1)
        {
            break MISSING_BLOCK_LABEL_630;
        }
        obj1 = a;
        obj2 = ByteBuffer.wrap(((byte []) (obj)), 0, l);
        if (!cvz.j && !((ByteBuffer) (obj2)).hasRemaining())
        {
            throw new AssertionError();
        }
          goto _L9
_L21:
        if (k || b.isClosed()) goto _L11; else goto _L10
_L10:
        throw new AssertionError();
_L9:
        if (((cvz) (obj1)).d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a) goto _L13; else goto _L12
_L12:
        ((cvz) (obj1)).b(((ByteBuffer) (obj2)));
_L17:
        if (cvz.j || ((cvz) (obj1)).d() || ((cvz) (obj1)).c || !((ByteBuffer) (obj2)).hasRemaining()) goto _L15; else goto _L14
_L14:
        throw new AssertionError();
_L13:
        if (!((cvz) (obj1)).a(((ByteBuffer) (obj2)))) goto _L17; else goto _L16
_L16:
        if (!cvz.j && ((cvz) (obj1)).g.hasRemaining() == ((ByteBuffer) (obj2)).hasRemaining() && ((ByteBuffer) (obj2)).hasRemaining())
        {
            throw new AssertionError();
        }
        if (!((ByteBuffer) (obj2)).hasRemaining()) goto _L19; else goto _L18
_L18:
        ((cvz) (obj1)).b(((ByteBuffer) (obj2)));
          goto _L17
_L19:
        if (!((cvz) (obj1)).g.hasRemaining()) goto _L17; else goto _L20
_L20:
        ((cvz) (obj1)).b(((cvz) (obj1)).g);
          goto _L17
          goto _L15
        try
        {
            a.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b(((Exception) (obj)));
            a.a(1006, ((RuntimeException) (obj)).getMessage());
        }
          goto _L21
_L4:
        obj = "/";
          goto _L5
        obj1 = "";
          goto _L22
    }

    static 
    {
        boolean flag;
        if (!cwb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
    }
}
