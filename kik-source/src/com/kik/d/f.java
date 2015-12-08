// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d;

import com.kik.d.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.d:
//            a

public class f
{

    static final boolean a;
    private static final b b = org.c.c.a("MetricsTracker");
    private final com.kik.d.a c;
    private List d;
    private int e;
    private final Random f = new Random();
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private long l;
    private a m;

    public f(com.kik.d.a a1, a a2)
    {
        d = new ArrayList();
        g = null;
        h = null;
        i = null;
        j = "UNK";
        k = "unknown";
        l = -1L;
        c = a1;
        e = 20;
        m = a2;
        l = a2.a();
    }

    private void a(com.kik.d.b.a.k k1, com.kik.d.b.a.f f1, String s, Map map, Map map1, Map map2, long l1)
    {
        com.kik.d.b.a.a.a a1 = com.kik.d.b.a.a.q().a(f.nextInt());
        if (k1 != null)
        {
            a1.a(com.kik.d.b.a.i.j().a(k1).r());
            if (!a && f1 != null)
            {
                throw new AssertionError();
            }
        } else
        if (f1 != null)
        {
            a1.a(com.kik.d.b.a.d.k().a(f1).a(s).r());
            if (!a && s == null)
            {
                throw new AssertionError();
            }
        } else
        if (!a)
        {
            throw new AssertionError();
        }
        if (map != null)
        {
            for (k1 = map.entrySet().iterator(); k1.hasNext(); a1.a(com.kik.d.b.a.l.j().a((String)f1.getKey()).b((String)f1.getValue())))
            {
                f1 = (java.util.Map.Entry)k1.next();
            }

        }
        if (map1 != null)
        {
            for (k1 = map1.entrySet().iterator(); k1.hasNext(); a1.a(com.kik.d.b.a.n.i().a((String)f1.getKey()).a((Iterable)f1.getValue())))
            {
                f1 = (java.util.Map.Entry)k1.next();
            }

        }
        if (map2 != null)
        {
            for (k1 = map2.entrySet().iterator(); k1.hasNext(); a1.a(com.kik.d.b.a.p.k().a((String)f1.getKey()).a(((Long)f1.getValue()).longValue())))
            {
                f1 = (java.util.Map.Entry)k1.next();
            }

        }
        a1.a(l1);
        f1 = a1.r();
        int i1;
        synchronized (d)
        {
            d.add(f1);
            i1 = d.size();
        }
        if (i1 >= e)
        {
            b();
        }
        return;
        f1;
        k1;
        JVM INSTR monitorexit ;
        throw f1;
    }

    protected final int a()
    {
        return d.size();
    }

    protected final void a(int i1)
    {
        e = i1;
    }

    public final void a(com.kik.d.b.a.f f1, String s, String s1, long l1, long l2)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s1, Long.valueOf(l1));
        a(((com.kik.d.b.a.k) (null)), f1, s, ((Map) (null)), ((Map) (null)), ((Map) (hashmap)), l2);
    }

    public final void a(com.kik.d.b.a.f f1, String s, String s1, long l1, String s2, String s3, 
            long l2)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s1, Long.valueOf(l1));
        s1 = new HashMap(1);
        s1.put(s2, s3);
        a(((com.kik.d.b.a.k) (null)), f1, s, ((Map) (s1)), ((Map) (null)), ((Map) (hashmap)), l2);
    }

    public final void a(com.kik.d.b.a.k k1, long l1)
    {
        a(k1, Collections.emptyMap(), l1);
    }

    public final transient void a(com.kik.d.b.a.k k1, long l1, Object aobj[])
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        HashMap hashmap2 = new HashMap();
        int i1 = 0;
        while (i1 < 2) 
        {
            Object obj = aobj[0];
            Object obj1 = aobj[1];
            if (!(obj instanceof String))
            {
                throw new IllegalArgumentException("Arguments must consist of a String key and an Object value");
            }
            if (obj1 != null)
            {
                if (obj1 instanceof List)
                {
                    hashmap.put((String)obj, (List)hashmap);
                } else
                if (obj1 instanceof String)
                {
                    hashmap2.put((String)obj, (String)obj1);
                } else
                if (obj1 instanceof Byte)
                {
                    hashmap1.put((String)obj, Long.valueOf(((Byte)obj1).longValue()));
                } else
                if (obj1 instanceof Short)
                {
                    hashmap1.put((String)obj, Long.valueOf(((Short)obj1).longValue()));
                } else
                if (obj1 instanceof Integer)
                {
                    hashmap1.put((String)obj, Long.valueOf(((Integer)obj1).longValue()));
                } else
                if (obj1 instanceof Long)
                {
                    hashmap1.put((String)obj, (Long)obj1);
                } else
                {
                    throw new IllegalArgumentException("Values must be of types List<String>, String or Long");
                }
            }
            i1 += 2;
        }
        a(k1, ((Map) (hashmap2)), ((Map) (hashmap)), ((Map) (hashmap1)), l1);
    }

    public final void a(com.kik.d.b.a.k k1, String s, long l1, long l2)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s, Long.valueOf(l1));
        a(k1, ((Map) (null)), ((Map) (null)), ((Map) (hashmap)), l2);
    }

    public final void a(com.kik.d.b.a.k k1, String s, long l1, String s1, String s2, long l2)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s, Long.valueOf(l1));
        s = new HashMap(1);
        s.put(s1, s2);
        a(k1, ((Map) (s)), ((Map) (null)), ((Map) (hashmap)), l2);
    }

    public final void a(com.kik.d.b.a.k k1, Map map, long l1)
    {
        a(k1, map, ((Map) (null)), ((Map) (null)), l1);
    }

    public final void a(com.kik.d.b.a.k k1, Map map, Map map1, Map map2, long l1)
    {
        a(k1, ((com.kik.d.b.a.f) (null)), null, map, map1, map2, l1);
    }

    public final void a(String s)
    {
        g = s;
    }

    public final void b()
    {
label0:
        {
            synchronized (d)
            {
                if (d.size() > 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (h == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        com.kik.d.a a1;
        arraylist = new ArrayList(d);
        d.clear();
        l = m.a();
        a1 = c;
        if (g == null) goto _L4; else goto _L3
_L3:
        obj = g;
_L5:
        a1.(((String) (obj)), h, j, k, arraylist);
_L2:
        list;
        JVM INSTR monitorexit ;
        return;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
label1:
        {
            if (i == null)
            {
                break label1;
            }
            obj = i;
        }
        if (false)
        {
            obj = "unknown";
        }
          goto _L5
    }

    public final void b(String s)
    {
        i = s;
    }

    public final long c()
    {
        long l1;
        synchronized (d)
        {
            l1 = l;
        }
        return l1;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(String s)
    {
        h = s;
    }

    public final void d(String s)
    {
        j = s;
    }

    public final void e(String s)
    {
        if (s != null)
        {
            k = s;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/d/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
