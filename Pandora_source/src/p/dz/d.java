// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dz;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p.ea.b;
import p.ea.f;
import p.eb.c;
import p.eb.e;
import p.ec.a;
import p.ec.h;
import p.ec.i;

// Referenced classes of package p.dz:
//            a

public class d extends p.dz.a
{

    protected boolean f;
    protected List g;
    protected ByteBuffer h;
    private final Random i = new Random();

    public d()
    {
        f = false;
        g = new LinkedList();
    }

    public ByteBuffer a(p.eb.d d1)
    {
        if (d1.f() != p.eb.a.b)
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

    public List a(String s, boolean flag)
    {
        e e1 = new e();
        try
        {
            e1.a(ByteBuffer.wrap(p.ee.b.a(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s);
        }
        e1.a(true);
        e1.a(p.eb.a.b);
        e1.b(flag);
        return Collections.singletonList(e1);
    }

    public a.b a(a a1)
    {
        if (a1.c("Origin") && a(((p.ec.f) (a1))))
        {
            return p.dz.a.b.a;
        } else
        {
            return p.dz.a.b.b;
        }
    }

    public a.b a(a a1, h h1)
    {
        if (a1.b("WebSocket-Origin").equals(h1.b("Origin")) && a(((p.ec.f) (h1))))
        {
            return p.dz.a.b.a;
        } else
        {
            return p.dz.a.b.b;
        }
    }

    public p.ec.b a(p.ec.b b1)
        throws p.ea.d
    {
        b1.a("Upgrade", "WebSocket");
        b1.a("Connection", "Upgrade");
        if (!b1.c("Origin"))
        {
            b1.a("Origin", (new StringBuilder()).append("random").append(i.nextInt()).toString());
        }
        return b1;
    }

    public p.ec.c a(a a1, i j)
        throws p.ea.d
    {
        j.a("Web Socket Protocol Handshake");
        j.a("Upgrade", "WebSocket");
        j.a("Connection", a1.b("Connection"));
        j.a("WebSocket-Origin", a1.b("Origin"));
        j.a("WebSocket-Location", (new StringBuilder()).append("ws://").append(a1.b("Host")).append(a1.a()).toString());
        return j;
    }

    public void a()
    {
        f = false;
        h = null;
    }

    public a.a b()
    {
        return p.dz.a.a.a;
    }

    public List c(ByteBuffer bytebuffer)
        throws b
    {
        bytebuffer = e(bytebuffer);
        if (bytebuffer == null)
        {
            throw new b(1002);
        } else
        {
            return bytebuffer;
        }
    }

    public p.dz.a c()
    {
        return new d();
    }

    public ByteBuffer e()
    {
        return ByteBuffer.allocate(b);
    }

    protected List e(ByteBuffer bytebuffer)
        throws b
    {
        List list;
label0:
        {
            Object obj = null;
            while (bytebuffer.hasRemaining()) 
            {
                byte byte0 = bytebuffer.get();
                if (byte0 == 0)
                {
                    if (f)
                    {
                        throw new p.ea.c("unexpected START_OF_FRAME");
                    }
                    f = true;
                } else
                if (byte0 == -1)
                {
                    if (!f)
                    {
                        throw new p.ea.c("unexpected END_OF_FRAME");
                    }
                    if (h != null)
                    {
                        h.flip();
                        e e1 = new e();
                        e1.a(h);
                        e1.a(true);
                        e1.a(p.eb.a.b);
                        g.add(e1);
                        h = null;
                        bytebuffer.mark();
                    }
                    f = false;
                } else
                {
                    list = obj;
                    if (!f)
                    {
                        break label0;
                    }
                    if (h == null)
                    {
                        h = e();
                    } else
                    if (!h.hasRemaining())
                    {
                        h = f(h);
                    }
                    h.put(byte0);
                }
            }
            list = g;
            g = new LinkedList();
        }
        return list;
    }

    public ByteBuffer f(ByteBuffer bytebuffer)
        throws p.ea.e, b
    {
        bytebuffer.flip();
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(bytebuffer.capacity() * 2));
        bytebuffer1.put(bytebuffer);
        return bytebuffer1;
    }
}
