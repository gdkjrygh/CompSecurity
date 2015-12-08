// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;

import com.samsung.multiscreen.b.a.b;
import com.samsung.multiscreen.b.a.d;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.b:
//            d, b, h, f, 
//            e

public class a
{

    private static final Logger a;
    private com.samsung.multiscreen.b.b.a b;
    private h c;
    private com.samsung.multiscreen.b.a.a d;
    private d e;
    private com.samsung.multiscreen.b.d f;
    private com.samsung.multiscreen.b.b g;
    private com.samsung.multiscreen.b.b h;

    public a(com.samsung.multiscreen.b.b.a a1, d d1)
    {
        b = a1;
        e = d1;
        f = new com.samsung.multiscreen.b.d();
    }

    private void e()
    {
        f.a();
        d = null;
    }

    private boolean f()
    {
        return d != null && d.b();
    }

    protected final h a()
    {
        return c;
    }

    public final void a(com.samsung.multiscreen.b.b b1)
    {
        a(((Map) (null)), b1);
    }

    protected final void a(f f1)
    {
        a.info((new StringBuilder("Channel.handleConnectError() error: ")).append(f1).toString());
        e();
        if (g != null)
        {
            g.a(f1);
            g = null;
        }
    }

    public final void a(h h1)
    {
        c = h1;
    }

    protected final void a(String s, List list)
    {
        a.info("Channel.handleConnect()");
        f.a(s, list);
        if (g != null)
        {
            g.a(Boolean.TRUE);
            g = null;
        }
        if (c != null)
        {
            c.onConnect();
        }
    }

    public final void a(Map map, com.samsung.multiscreen.b.b b1)
    {
        a.info((new StringBuilder("Channel.connect() connected: ")).append(f()).append(", clientAttributes: ").append(map).toString());
        if (f())
        {
            if (b1 != null)
            {
                b1.a(new f("Already Connected"));
            }
            return;
        } else
        {
            g = b1;
            d = new b(this, b, map);
            d.a(new e(this));
            d.c();
            return;
        }
    }

    public final com.samsung.multiscreen.b.d b()
    {
        return f;
    }

    protected final void b(f f1)
    {
        a.info((new StringBuilder("Channel.handleDisconnectError() ")).append(f1).toString());
        if (h != null)
        {
            h.a(f1);
            h = null;
        }
    }

    public final void c()
    {
        a.info((new StringBuilder("Channel.disconnect() connected: ")).append(f()).toString());
        if (!f())
        {
            return;
        } else
        {
            h = null;
            d.d();
            return;
        }
    }

    protected final void d()
    {
        a.info((new StringBuilder("Channel.handleDisconnect() channelListener: ")).append(c).toString());
        d.a(null);
        e();
        if (h != null)
        {
            h.a(Boolean.TRUE);
            h = null;
        }
        if (c != null)
        {
            c.onDisconnect();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[Channel]\nconnected: ").append(f()).append("\nchannelInfo: ").append(b).append("\nconnection: ").append(d).append("\nclients: ").append(f);
        return stringbuilder.toString();
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/b/a.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
