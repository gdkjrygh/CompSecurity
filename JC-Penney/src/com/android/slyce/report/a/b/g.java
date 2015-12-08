// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.b;

import com.android.slyce.report.a.c.c;
import com.android.slyce.report.a.d.d;
import com.android.slyce.report.a.d.e;
import com.android.slyce.report.a.d.f;
import com.android.slyce.report.a.e.a;
import com.android.slyce.report.a.e.b;
import com.android.slyce.report.a.e.h;
import com.android.slyce.report.a.e.i;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.android.slyce.report.a.b:
//            a, c, b

public class g extends com.android.slyce.report.a.b.a
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

    public com.android.slyce.report.a.b.c a(a a1)
    {
        if (a1.c("Origin") && a(((com.android.slyce.report.a.e.f) (a1))))
        {
            return com.android.slyce.report.a.b.c.a;
        } else
        {
            return com.android.slyce.report.a.b.c.b;
        }
    }

    public com.android.slyce.report.a.b.c a(a a1, h h1)
    {
        if (a1.b("WebSocket-Origin").equals(h1.b("Origin")) && a(((com.android.slyce.report.a.e.f) (h1))))
        {
            return com.android.slyce.report.a.b.c.a;
        } else
        {
            return com.android.slyce.report.a.b.c.b;
        }
    }

    public b a(b b1)
    {
        b1.a("Upgrade", "WebSocket");
        b1.a("Connection", "Upgrade");
        if (!b1.c("Origin"))
        {
            b1.a("Origin", (new StringBuilder()).append("random").append(i.nextInt()).toString());
        }
        return b1;
    }

    public com.android.slyce.report.a.e.c a(a a1, i j)
    {
        j.a("Web Socket Protocol Handshake");
        j.a("Upgrade", "WebSocket");
        j.a("Connection", a1.b("Connection"));
        j.a("WebSocket-Origin", a1.b("Origin"));
        j.a("WebSocket-Location", (new StringBuilder()).append("ws://").append(a1.b("Host")).append(a1.a()).toString());
        return j;
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

    public void a()
    {
        f = false;
        h = null;
    }

    public com.android.slyce.report.a.b.b b()
    {
        return com.android.slyce.report.a.b.b.a;
    }

    public com.android.slyce.report.a.b.a c()
    {
        return new g();
    }

    public List c(ByteBuffer bytebuffer)
    {
        bytebuffer = e(bytebuffer);
        if (bytebuffer == null)
        {
            throw new com.android.slyce.report.a.c.b(1002);
        } else
        {
            return bytebuffer;
        }
    }

    public ByteBuffer d()
    {
        return ByteBuffer.allocate(b);
    }

    protected List e(ByteBuffer bytebuffer)
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
                    list = obj;
                    if (!f)
                    {
                        break label0;
                    }
                    if (h == null)
                    {
                        h = d();
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
    {
        bytebuffer.flip();
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(a(bytebuffer.capacity() * 2));
        bytebuffer1.put(bytebuffer);
        return bytebuffer1;
    }
}
