// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.b;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.b.a.c;

// Referenced classes of package com.samsung.multiscreen.net.b:
//            c, d, a

public final class b
{

    public static String a = "id";
    public static String b = "to";
    public static String c = "from";
    public static String d = "message";
    public static String e = "encrypted";
    public static String f = "clientId";
    public static String g = "clients";
    public static String h = "timeout";
    public static String i = "all";
    public static String j = "broadcast";
    public static String k = "host";
    private int l;
    private Map m;

    public b(int i1, String s)
    {
        l = i1;
        m = new HashMap();
        m.put("jsonrpc", "2.0");
        if (i1 == c.a)
        {
            m.put(a, UUID.randomUUID().toString());
        }
        m.put("method", s);
        m.put("params", new HashMap());
    }

    private b(Map map)
    {
        m = map;
        if (map.get("result") != null)
        {
            l = com.samsung.multiscreen.net.b.c.c;
        } else
        {
            if (map.get("error") != null)
            {
                l = c.d;
                return;
            }
            if (map.get(a) != null)
            {
                l = c.a;
                return;
            }
        }
    }

    public static b a(String s)
    {
        s = com.samsung.multiscreen.net.b.d.a(s);
        if (s == null)
        {
            return null;
        } else
        {
            return new b(s);
        }
    }

    public final boolean a()
    {
        return l == c.d;
    }

    public final String b()
    {
        return (String)m.get("method");
    }

    public final Map c()
    {
        return (Map)m.get("params");
    }

    public final Map d()
    {
        Object obj = m.get("result");
        if (obj instanceof Map)
        {
            return (Map)obj;
        }
        if (obj instanceof Boolean)
        {
            obj = (Boolean)obj;
            HashMap hashmap = new HashMap();
            hashmap.put("success", obj);
            return hashmap;
        } else
        {
            return null;
        }
    }

    public final a e()
    {
        return com.samsung.multiscreen.net.b.a.a((Map)m.get("error"));
    }

    public final String f()
    {
        c c1 = new c();
        c1.putAll(m);
        return c1.a();
    }

    public final String toString()
    {
        return f();
    }

}
