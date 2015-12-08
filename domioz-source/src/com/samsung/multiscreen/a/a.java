// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a;

import com.samsung.multiscreen.a.a.c;
import com.samsung.multiscreen.c.e;
import com.samsung.multiscreen.device.Device;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.a:
//            b, c, d

public class a
{

    private static final Logger a;
    private String b;
    private Device c;
    private URI d;
    private com.samsung.multiscreen.a.c e;
    private String f;
    private String g;

    public a(Device device, URI uri, String s, com.samsung.multiscreen.a.c c1, String s1, String s2)
    {
        c = device;
        d = uri;
        b = s;
        e = c1;
        f = s1;
        g = s2;
    }

    static com.samsung.multiscreen.a.c a(a a1)
    {
        return a1.e;
    }

    static com.samsung.multiscreen.a.c a(a a1, com.samsung.multiscreen.a.c c1)
    {
        a1.e = c1;
        return c1;
    }

    public final com.samsung.multiscreen.a.c a()
    {
        return e;
    }

    public final void a(d d1)
    {
        a(((Map) (new HashMap())), d1);
    }

    public final void a(Map map, d d1)
    {
        map = new c(b, map, d, new b(this, d1));
        com.samsung.multiscreen.c.e.a().b().execute(map);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/a/a.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
