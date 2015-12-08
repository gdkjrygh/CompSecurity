// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class jqt extends jsw
{

    public boolean a;
    final jti b = new jti("tracking");
    final jqv c;
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    jqt(jrk jrk1, String s, jti jti1)
    {
        super(jrk1);
        if (s != null)
        {
            e.put("&tid", s);
        }
        e.put("useSecure", "1");
        e.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        c = new jqv(this, jrk1);
    }

    private static String a(java.util.Map.Entry entry)
    {
        String s = (String)entry.getKey();
        entry.getValue();
        boolean flag;
        if (!s.startsWith("&") || s.length() < 2)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    static jrd a(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.f();
    }

    private static void a(Map map, Map map1)
    {
        b.d(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = a(entry);
                if (s != null)
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static jrv b(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.h();
    }

    private static void b(Map map, Map map1)
    {
        b.d(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = a(entry);
                if (s != null && !map1.containsKey(s))
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static jsi c(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.h;
    }

    static jsi d(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.h;
    }

    static jso e(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.a();
    }

    static jso f(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.a();
    }

    static jre g(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.c();
    }

    static jre h(jqt jqt1)
    {
        return ((jrj) (jqt1)).d.c();
    }

    protected final void a()
    {
        c.s();
        String s = super.d.e().c();
        if (s != null)
        {
            a("&an", s);
        }
        s = super.d.e().b();
        if (s != null)
        {
            a("&av", s);
        }
    }

    public final void a(String s, String s1)
    {
        b.f(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            e.put(s, s1);
            return;
        }
    }

    public final void a(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = super.d.c.a();
        if (super.d.d().e)
        {
            c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = super.d.d().d;
        hashmap = new HashMap();
        a(e, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = jtk.a((String)e.get("useSecure"), true);
        b(f, hashmap);
        f.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            super.d.a().a(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            super.d.a().a(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = a;
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_264;
        }
        j = Integer.parseInt((String)e.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        e.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        super.d.b().a(new jqu(this, hashmap, flag2, map, l, flag, flag1, s));
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }
}
