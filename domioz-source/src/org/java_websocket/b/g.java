// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.b;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket.c.b;
import org.java_websocket.c.c;
import org.java_websocket.d.d;
import org.java_websocket.d.e;
import org.java_websocket.d.f;
import org.java_websocket.e.a;
import org.java_websocket.e.h;
import org.java_websocket.e.i;

// Referenced classes of package org.java_websocket.b:
//            a, c, b

public class g extends org.java_websocket.b.a
{

    protected boolean f;
    protected List g;
    protected ByteBuffer h;
    private final Random i = new Random();

    public g()
    {
        f = false;
        g = new LinkedList();
    }

    public int a(a a1)
    {
        if (a1.c("Origin") && a(((org.java_websocket.e.f) (a1))))
        {
            return org.java_websocket.b.c.a;
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public int a(a a1, h h1)
    {
        if (a1.b("WebSocket-Origin").equals(h1.b("Origin")) && a(((org.java_websocket.e.f) (h1))))
        {
            return org.java_websocket.b.c.a;
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public ByteBuffer a(d d1)
    {
        if (d1.f() != e.b)
        {
            throw new RuntimeException("only text frames supported");
        } else
        {
            d1 = d1.c();
            ByteBuffer bytebuffer = ByteBuffer.allocate(d1.remaining() + 2);
            bytebuffer.put((byte)0);
            d1.mark();
            bytebuffer.put(d1);
            d1.reset();
            bytebuffer.put((byte)-1);
            bytebuffer.flip();
            return bytebuffer;
        }
    }

    public List a(ByteBuffer bytebuffer)
    {
        bytebuffer = c(bytebuffer);
        if (bytebuffer == null)
        {
            throw new b(1002);
        } else
        {
            return bytebuffer;
        }
    }

    public org.java_websocket.e.b a(org.java_websocket.e.b b1)
    {
        b1.a("Upgrade", "WebSocket");
        b1.a("Connection", "Upgrade");
        if (!b1.c("Origin"))
        {
            b1.a("Origin", (new StringBuilder("random")).append(i.nextInt()).toString());
        }
        return b1;
    }

    public org.java_websocket.e.c a(a a1, i j)
    {
        j.a("Web Socket Protocol Handshake");
        j.a("Upgrade", "WebSocket");
        j.a("Connection", a1.b("Connection"));
        j.a("WebSocket-Origin", a1.b("Origin"));
        j.a("WebSocket-Location", (new StringBuilder("ws://")).append(a1.b("Host")).append(a1.a()).toString());
        return j;
    }

    public final void a()
    {
        f = false;
        h = null;
    }

    public int b()
    {
        return org.java_websocket.b.b.a;
    }

    protected final List c(ByteBuffer bytebuffer)
    {
        Object obj;
label0:
        {
            Object obj1 = null;
            while (bytebuffer.hasRemaining()) 
            {
                byte byte0 = bytebuffer.get();
                if (byte0 == 0)
                {
                    if (f)
                    {
                        throw new c("unexpected START_OF_FRAME");
                    }
                    f = true;
                } else
                if (byte0 == -1)
                {
                    if (!f)
                    {
                        throw new c("unexpected END_OF_FRAME");
                    }
                    if (h != null)
                    {
                        h.flip();
                        f f1 = new f();
                        f1.a(h);
                        f1.a(true);
                        f1.a(e.b);
                        g.add(f1);
                        h = null;
                        bytebuffer.mark();
                    }
                    f = false;
                } else
                {
                    obj = obj1;
                    if (!f)
                    {
                        break label0;
                    }
                    if (h == null)
                    {
                        h = ByteBuffer.allocate(b);
                    } else
                    if (!h.hasRemaining())
                    {
                        obj = h;
                        ((ByteBuffer) (obj)).flip();
                        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(((ByteBuffer) (obj)).capacity() * 2));
                        bytebuffer1.put(((ByteBuffer) (obj)));
                        h = bytebuffer1;
                    }
                    h.put(byte0);
                }
            }
            obj = g;
            g = new LinkedList();
        }
        return ((List) (obj));
    }

    public org.java_websocket.b.a c()
    {
        return new g();
    }
}
