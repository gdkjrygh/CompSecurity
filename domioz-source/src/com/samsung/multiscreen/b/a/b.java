// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b.a;

import com.samsung.multiscreen.b.b.a;
import com.samsung.multiscreen.b.f;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.Key;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.b.a:
//            a, f, c, e

public class b extends com.samsung.multiscreen.b.a.a
{

    public static final Logger a;
    private static String b = "-----BEGIN PUBLIC KEY-----\r\nMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDfaldZKOKdkfvfYiFgX/ZRHdQw\r\nNrb8U8imZ9gNOBXtrDu/hGxHEgyrZ9iMqoIcIhgxBzcKwKBAp4xu6yB3AOZiBwLI\r\n73ajox/CpIzXE9yPevd5wQ+XHctIQazp0qrE9Py5Q5Ox7HB9rmKjSISKQ3A1JtEV\r\nbl0bI0iMf4QCtl/FdQIDAQAB\r\n-----END PUBLIC KEY-----\r\n";
    private Key c;
    private KeyPair d;
    private String e;
    private c f;
    private boolean g;
    private boolean h;

    public b(com.samsung.multiscreen.b.a a1, a a2, Map map)
    {
        super(a1);
        e = null;
        g = false;
        h = false;
        d = com.samsung.multiscreen.b.a.f.a();
        a1 = com.samsung.multiscreen.b.a.f.a(d.getPublic(), "PUBLIC KEY");
        c = com.samsung.multiscreen.b.a.f.a(b);
        if (c != null)
        {
            e = com.samsung.multiscreen.b.a.f.a(a1, c);
        }
        a1 = map;
        if (e != null)
        {
            a1 = map;
            if (map == null)
            {
                a1 = new HashMap();
            }
            a1.put("__pem", e);
        }
        f = new c(this, a(a2.a(), a1));
    }

    private static URI a(String s, Map map)
    {
        StringBuilder stringbuilder;
        java.util.Map.Entry entry;
        try
        {
            s = URI.create(s);
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (map.size() > 0)
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
                stringbuilder.append("=");
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), "UTF-8"));
                if (map.hasNext())
                {
                    stringbuilder.append("&");
                }
            } while (true);
        }
        s = new URI(s.getScheme(), s.getUserInfo(), s.getHost(), s.getPort(), s.getPath(), stringbuilder.toString(), null);
        return s;
    }

    static boolean a(b b1)
    {
        b1.g = false;
        return false;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.h = flag;
        return flag;
    }

    static e b(b b1)
    {
        return b1.com.samsung.multiscreen.b.a.a.a();
    }

    static KeyPair c(b b1)
    {
        return b1.d;
    }

    static e d(b b1)
    {
        return b1.com.samsung.multiscreen.b.a.a.a();
    }

    static e e(b b1)
    {
        return b1.com.samsung.multiscreen.b.a.a.a();
    }

    static boolean f(b b1)
    {
        return b1.g;
    }

    static e g(b b1)
    {
        return b1.com.samsung.multiscreen.b.a.a.a();
    }

    static boolean h(b b1)
    {
        return b1.h;
    }

    static e i(b b1)
    {
        return b1.com.samsung.multiscreen.b.a.a.a();
    }

    public final boolean b()
    {
        return f.m().e();
    }

    public final void c()
    {
        if (b())
        {
            a.info("connect() ALREADY CONNECTED");
            e e1 = super.a();
            if (e1 != null)
            {
                e1.a(new f("Already Connected", (byte)0));
            }
            return;
        } else
        {
            g = true;
            f.k();
            return;
        }
    }

    public final void d()
    {
        if (!b())
        {
            e e1 = super.a();
            if (e1 != null)
            {
                e1.b(new f("Not Connected", (byte)0));
            }
        }
        f.l();
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/b/a/b.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
