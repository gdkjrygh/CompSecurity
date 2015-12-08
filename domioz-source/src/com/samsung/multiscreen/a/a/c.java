// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a.a;

import com.samsung.multiscreen.a.d;
import com.samsung.multiscreen.c.e;
import com.samsung.multiscreen.net.dial.DialClient;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.a.a:
//            b, d

public class c
    implements d, Runnable
{

    private static final Logger a;
    private String b;
    private Map c;
    private URI d;
    private d e;
    private long f;
    private long g;

    public c(String s, Map map, URI uri, d d1)
    {
        f = 30000L;
        g = 1000L;
        b = s;
        c = map;
        d = uri;
        e = d1;
    }

    static long a(c c1, long l)
    {
        l = c1.f - l;
        c1.f = l;
        return l;
    }

    static d a(c c1)
    {
        return c1.e;
    }

    private static String a(Map map)
    {
        if (map == null)
        {
            return "";
        }
        map = org.b.a.d.a(map);
        a.info((new StringBuilder("LaunchApplicationRequest: params: ")).append(map).toString());
        try
        {
            map = URLEncoder.encode(map, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return "";
        }
        return map;
    }

    static long b(c c1)
    {
        return c1.f;
    }

    static Logger b()
    {
        return a;
    }

    static long c(c c1)
    {
        return c1.g;
    }

    protected final void a()
    {
        long l = System.currentTimeMillis();
        Object obj = new DialClient(d.toString());
        obj = new b(b, ((DialClient) (obj)), new com.samsung.multiscreen.a.a.d(this, l));
        com.samsung.multiscreen.c.e.a().b().execute(((Runnable) (obj)));
    }

    public void onError(com.samsung.multiscreen.a.e e1)
    {
        e.onError(e1);
    }

    public void onResult(Object obj)
    {
        obj = (Boolean)obj;
        if (((Boolean) (obj)).booleanValue())
        {
            a.info("Launch succeeded: start polling run state");
            a();
            return;
        } else
        {
            e.onResult(obj);
            return;
        }
    }

    public void run()
    {
        DialClient dialclient = new DialClient(d.toString());
        String s = a(c);
        a.info((new StringBuilder("LaunchApplicationRequest: Launching ")).append(b).append(" with parameters: ").append(s).toString());
        dialclient.a(b, s, this);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/a/a/c.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
