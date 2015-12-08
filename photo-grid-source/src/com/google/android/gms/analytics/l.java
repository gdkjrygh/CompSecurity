// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.al;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bd;
import com.google.android.gms.analytics.internal.h;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            n, f, m

public final class l extends y
{

    private boolean a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final h d = new h("tracking", (byte)0);
    private final n e;

    l(aa aa, String s)
    {
        super(aa);
        if (s != null)
        {
            b.put("&tid", s);
        }
        b.put("useSecure", "1");
        b.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        e = new n(this, aa);
    }

    static n a(l l1)
    {
        return l1.e;
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

    private void a(String s, String s1)
    {
        bl.a(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, s1);
            return;
        }
    }

    private static void a(Map map, Map map1)
    {
        bl.a(map1);
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

    static b b(l l1)
    {
        return l1.w();
    }

    private static void b(Map map, Map map1)
    {
        bl.a(map1);
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

    static al c(l l1)
    {
        return l1.x();
    }

    static bd d(l l1)
    {
        return l1.y();
    }

    static bd e(l l1)
    {
        return l1.y();
    }

    static h f(l l1)
    {
        return l1.d;
    }

    static j g(l l1)
    {
        return l1.n();
    }

    static j h(l l1)
    {
        return l1.n();
    }

    static s i(l l1)
    {
        return l1.r();
    }

    static s j(l l1)
    {
        return l1.r();
    }

    protected final void a()
    {
        e.C();
        String s = t().c();
        if (s != null)
        {
            a("&an", s);
        }
        s = t().b();
        if (s != null)
        {
            a("&av", s);
        }
    }

    public final void a(double d1)
    {
        a("&sf", Double.toString(d1));
    }

    public final void a(String s)
    {
        a("&cd", s);
    }

    public final void a(Map map)
    {
        HashMap hashmap;
        String s;
        long l1;
        boolean flag;
        boolean flag1;
        l1 = l().a();
        if (q().e())
        {
            c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = q().d();
        hashmap = new HashMap();
        a(b, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = q.c((String)b.get("useSecure"));
        b(c, hashmap);
        c.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            n().a(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            n().a(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = a;
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
        p().a(new m(this, hashmap, flag2, map, l1, flag, flag1, s));
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }
}
