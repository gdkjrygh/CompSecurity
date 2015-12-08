// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.c.a;
import com.samsung.multiscreen.c.c;
import com.samsung.multiscreen.c.d;
import com.samsung.multiscreen.c.e;
import com.samsung.multiscreen.device.f;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device.a:
//            c

public class g
    implements f, Runnable
{

    private static final Logger a;
    private int b;
    private URI c;
    private String d;
    private f e;
    private com.samsung.multiscreen.device.a.c f;
    private int g;

    public g(URI uri, String s, f f1)
    {
        b = 2000;
        c = uri;
        d = s;
        g = 5;
        b = 2000;
        e = f1;
    }

    public void onError(com.samsung.multiscreen.device.g g1)
    {
        g = g - 1;
        a.info((new StringBuilder("PollConnectedHostRequest[onError] -- attempts remaining: ")).append(g).toString());
        if (g > 0)
        {
            a.info((new StringBuilder("PollConnectedHostRequest[onError] -- scheduling poll in ")).append(b).append(" ms").toString());
            g1 = new c(d.a, d);
            com.samsung.multiscreen.c.e.a().c().a(g1, f, b, TimeUnit.MILLISECONDS);
            return;
        } else
        {
            a.info((new StringBuilder("PollConnectedHostRequest[onError] -- last attempt failed, returning error: ")).append(g1).toString());
            e.onError(g1);
            return;
        }
    }

    public void onResult(Object obj)
    {
        obj = (com.samsung.multiscreen.b.b.a)obj;
        if (obj != null && ((com.samsung.multiscreen.b.b.a) (obj)).b().equals(Boolean.TRUE))
        {
            a.info("PollConnectedHostRequest[onResult] -- got a connected host, returning channel!");
            obj = new com.samsung.multiscreen.b.a(((com.samsung.multiscreen.b.b.a) (obj)), new com.samsung.multiscreen.b.a.d());
            e.onResult(obj);
            return;
        }
        g = g - 1;
        a.info((new StringBuilder("PollConnectedHostRequest[onResult] -- attempts remaining: ")).append(g).toString());
        if (g > 0)
        {
            a.info((new StringBuilder("PollConnectedHostRequest[onResult] -- scheduling poll in ")).append(b).append(" seconds").toString());
            obj = new c(d.a, d);
            com.samsung.multiscreen.c.e.a().c().a(((c) (obj)), f, b, TimeUnit.MILLISECONDS);
            return;
        } else
        {
            e.onError(new com.samsung.multiscreen.device.g(-1L, "Timeout: channel not ready"));
            return;
        }
    }

    public void run()
    {
        f = new com.samsung.multiscreen.device.a.c(c, d, this);
        c c1 = new c(d.a, d);
        com.samsung.multiscreen.c.e.a().c().a(c1, f, 0L, TimeUnit.MILLISECONDS);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/g.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
