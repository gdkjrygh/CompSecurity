// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bf;
import com.google.android.gms.analytics.internal.h;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.z;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ad;
import com.google.android.gms.d.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            n, f, m

public class l extends z
{

    private boolean a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final h d;
    private final n e;

    l(ab ab, String s1, h h1)
    {
        super(ab);
        if (s1 != null)
        {
            b.put("&tid", s1);
        }
        b.put("useSecure", "1");
        b.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (h1 == null)
        {
            d = new h("tracking");
        } else
        {
            d = h1;
        }
        e = new n(this, ab);
    }

    static n a(l l1)
    {
        return l1.e;
    }

    private static void a(Map map, Map map1)
    {
        u.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s1 = b(entry);
                if (s1 != null)
                {
                    map1.put(s1, entry.getValue());
                }
            }
        }
    }

    private static boolean a(java.util.Map.Entry entry)
    {
        String s1 = (String)entry.getKey();
        entry = (String)entry.getValue();
        return s1.startsWith("&") && s1.length() >= 2;
    }

    static b b(l l1)
    {
        return l1.y();
    }

    private static String b(java.util.Map.Entry entry)
    {
        if (!a(entry))
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    private static void b(Map map, Map map1)
    {
        u.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s1 = b(entry);
                if (s1 != null && !map1.containsKey(s1))
                {
                    map1.put(s1, entry.getValue());
                }
            }
        }
    }

    static am c(l l1)
    {
        return l1.z();
    }

    static bf d(l l1)
    {
        return l1.A();
    }

    static bf e(l l1)
    {
        return l1.A();
    }

    static h f(l l1)
    {
        return l1.d;
    }

    static j g(l l1)
    {
        return l1.p();
    }

    static j h(l l1)
    {
        return l1.p();
    }

    static t i(l l1)
    {
        return l1.t();
    }

    static t j(l l1)
    {
        return l1.t();
    }

    protected void a()
    {
        e.E();
        String s1 = v().c();
        if (s1 != null)
        {
            a("&an", s1);
        }
        s1 = v().b();
        if (s1 != null)
        {
            a("&av", s1);
        }
    }

    public void a(String s1)
    {
        a("&cd", s1);
    }

    public void a(String s1, String s2)
    {
        u.a(s1, "Key should be non-null");
        if (TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            b.put(s1, s2);
            return;
        }
    }

    public void a(Map map)
    {
        HashMap hashmap;
        String s1;
        long l1;
        boolean flag;
        boolean flag1;
        l1 = n().a();
        if (s().f())
        {
            c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = s().e();
        hashmap = new HashMap();
        a(b, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = r.a((String)b.get("useSecure"), true);
        b(c, hashmap);
        c.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            p().a(hashmap, "Missing hit type parameter");
            return;
        }
        s1 = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s1))
        {
            p().a(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = b();
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        i1 = Integer.parseInt((String)b.get("&a")) + 1;
        int k;
        k = i1;
        if (i1 >= 0x7fffffff)
        {
            k = 1;
        }
        b.put("&a", Integer.toString(k));
        this;
        JVM INSTR monitorexit ;
        r().a(new m(this, hashmap, flag2, map, l1, flag, flag1, s1));
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    boolean b()
    {
        return a;
    }
}
