// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            d, aq, p, y, 
//            aa

protected static class d
{

    b a;
    Map b;
    List c;
    List d;
    private Map e;

    public d a(int i, float f1)
    {
        a(com.google.android.gms.analytics.aq.b(i), Float.toString(f1));
        return this;
    }

    public  a(int i, String s)
    {
        a(com.google.android.gms.analytics.aq.a(i), s);
        return this;
    }

    public  a(a a1)
    {
        if (a1 == null)
        {
            p.d("product should be non-null");
            return this;
        } else
        {
            d.add(a1);
            return this;
        }
    }

    public d a(a a1, String s)
    {
        if (a1 == null)
        {
            p.d("product should be non-null");
            return this;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (!b.containsKey(s1))
        {
            b.put(s1, new ArrayList());
        }
        ((List)b.get(s1)).add(a1);
        return this;
    }

    public b a(b b1)
    {
        a = b1;
        return this;
    }

    public a a(c c1)
    {
        if (c1 == null)
        {
            p.d("promotion should be non-null");
            return this;
        } else
        {
            c.add(c1);
            return this;
        }
    }

    public final c a(String s, String s1)
    {
        com.google.android.gms.analytics.y.a().a(com.google.android.gms.analytics.a);
        if (s != null)
        {
            e.put(s, s1);
            return this;
        } else
        {
            p.d(" HitBuilder.set() called with a null paramName.");
            return this;
        }
    }

    public final e a(Map map)
    {
        com.google.android.gms.analytics.y.a().a(com.google.android.gms.analytics.b);
        if (map == null)
        {
            return this;
        } else
        {
            e.putAll(new HashMap(map));
            return this;
        }
    }

    public Map a()
    {
        HashMap hashmap = new HashMap(e);
        if (a != null)
        {
            hashmap.putAll(a.a());
        }
        Iterator iterator = c.iterator();
        for (int i = 1; iterator.hasNext(); i++)
        {
            hashmap.putAll(((c)iterator.next()).e(aq.d(i)));
        }

        iterator = d.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            hashmap.putAll(((a)iterator.next()).g(com.google.android.gms.analytics.aq.c(j)));
        }

        iterator = b.entrySet().iterator();
        for (int k = 1; iterator.hasNext(); k++)
        {
            java.util.Entry entry = (java.util.Entry)iterator.next();
            Object obj = (List)entry.getValue();
            String s = aq.f(k);
            obj = ((List) (obj)).iterator();
            for (int l = 1; ((Iterator) (obj)).hasNext(); l++)
            {
                hashmap.putAll(((a)((Iterator) (obj)).next()).g((new StringBuilder()).append(s).append(aq.e(l)).toString()));
            }

            if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
            {
                hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
            }
        }

        return hashmap;
    }

    public  b()
    {
        a("&sc", "start");
        return this;
    }

    public a b(boolean flag)
    {
        a("&ni", com.google.android.gms.analytics.aa.a(flag));
        return this;
    }

    public  d(String s)
    {
        com.google.android.gms.analytics.y.a().a(d);
        s = com.google.android.gms.analytics.aa.b(s);
        if (TextUtils.isEmpty(s))
        {
            return this;
        } else
        {
            s = com.google.android.gms.analytics.aa.a(s);
            a("&cc", (String)s.get("utm_content"));
            a("&cm", (String)s.get("utm_medium"));
            a("&cn", (String)s.get("utm_campaign"));
            a("&cs", (String)s.get("utm_source"));
            a("&ck", (String)s.get("utm_term"));
            a("&ci", (String)s.get("utm_id"));
            a("&gclid", (String)s.get("gclid"));
            a("&dclid", (String)s.get("dclid"));
            a("&gmob_t", (String)s.get("gmob_t"));
            return this;
        }
    }

    public a e(String s)
    {
        e.put("&promoa", s);
        return this;
    }

    protected e f(String s)
    {
        a("&t", s);
        return this;
    }

    protected String g(String s)
    {
        return (String)e.get(s);
    }

    protected ()
    {
        e = new HashMap();
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
    }
}
