// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.dial;

import com.samsung.multiscreen.a.d;
import com.samsung.multiscreen.a.e;
import com.samsung.multiscreen.net.a.a.a;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.dial:
//            h, b, c, d, 
//            e, f

public class DialClient
{

    public static final Logger a;
    h b;
    private String c;

    public DialClient(String s)
    {
        c = s;
        b = new h();
    }

    public static void main(String args[])
    {
        c c1;
        DialClient dialclient = new DialClient("http://192.168.1.94:8001/ws/apps/");
        a.info("-----------------------");
        a.info("TEST: getApplication()");
        a.info("-----------------------");
        dialclient.a("ChatDemo", new b());
        Object obj;
        Map map;
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            args.printStackTrace();
        }
        a.info("-----------------------");
        a.info("TEST: stopApplication()");
        a.info("-----------------------");
        c1 = new c();
        obj = (new StringBuilder()).append(dialclient.c).append("ChatDemo");
        if ("run".isEmpty())
        {
            break MISSING_BLOCK_LABEL_336;
        }
        args = (new StringBuilder("/")).append("run").toString();
_L1:
        args = URI.create(((StringBuilder) (obj)).append(args).toString()).toURL();
        obj = new a();
        map = com.samsung.multiscreen.net.a.a.a.b(args);
        ((a) (obj)).a(10000);
        args = ((a) (obj)).b(args, map);
        if (args != null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        try
        {
            c1.onError(new e("Not found"));
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            c1.onError(e.a(args));
        }
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            args.printStackTrace();
        }
        a.info("-----------------------");
        a.info("TEST(Should fail): launchApplication()");
        a.info("-----------------------");
        dialclient.a("zzcxz", "%7B%22launcher%22%3A%22android%22%7D", new com.samsung.multiscreen.net.dial.d());
        try
        {
            Thread.sleep(1000L);
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            args.printStackTrace();
        }
        a.info("-----------------------");
        a.info("TEST: launchApplication()");
        a.info("-----------------------");
        dialclient.a("ChatDemo", "%7B%22launcher%22%3A%22android%22%7D", new com.samsung.multiscreen.net.dial.e());
        try
        {
            Thread.sleep(20000L);
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            args.printStackTrace();
        }
        a.info("-----------------------");
        a.info("TEST: getApplication()");
        a.info("-----------------------");
        dialclient.a("ChatDemo", new f());
        return;
        args = "";
          goto _L1
        h.b(args, c1);
        break MISSING_BLOCK_LABEL_194;
    }

    public final void a(String s, d d1)
    {
        s = URI.create((new StringBuilder()).append(c).append(s).toString()).toURL();
        a a1 = new a();
        a1.a(10000);
        s = a1.a(s, com.samsung.multiscreen.net.a.a.a.a(s));
        if (s == null)
        {
            try
            {
                d1.onError(new e("Not found"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d1.onError(e.a(s));
            }
            break MISSING_BLOCK_LABEL_94;
        }
        b.c(s, d1);
        return;
    }

    public final void a(String s, String s1, d d1)
    {
        s = URI.create((new StringBuilder()).append(c).append(s).toString()).toURL();
        a a1 = new a();
        a1.a(10000);
        Map map = com.samsung.multiscreen.net.a.a.a.c(s);
        map.put("Content-Type", Arrays.asList(new String[] {
            "text/plain"
        }));
        s = a1.a(s, map, s1.getBytes("UTF-8"));
        if (s == null)
        {
            try
            {
                d1.onResult(Boolean.FALSE);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d1.onError(e.a(s));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d1.onError(e.a(s));
            }
            break MISSING_BLOCK_LABEL_131;
        }
        com.samsung.multiscreen.net.dial.h.a(s, d1);
        return;
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/net/dial/DialClient.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
