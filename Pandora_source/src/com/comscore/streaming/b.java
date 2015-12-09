// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.p;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.comscore.streaming:
//            c, f, g

public class b
{

    HashMap a;
    private int b;
    private int c;
    private long d;
    private long e;
    private long f;
    private long g;
    private String h;

    private void a(String s, HashMap hashmap)
    {
        hashmap = (String)hashmap.get(s);
        if (hashmap != null)
        {
            a.put(s, hashmap);
        }
    }

    public HashMap a()
    {
        return a;
    }

    protected HashMap a(c c1, HashMap hashmap)
    {
        if (hashmap == null)
        {
            hashmap = new HashMap();
        }
        hashmap.put("ns_st_cn", h());
        hashmap.put("ns_st_bt", String.valueOf(d()));
        if (c1 == c.a || c1 == null)
        {
            hashmap.put("ns_st_sq", String.valueOf(c));
        }
        if (c1 == c.b || c1 == c.c || c1 == c.e || c1 == c.f || c1 == null)
        {
            hashmap.put("ns_st_pt", String.valueOf(e()));
            hashmap.put("ns_st_pc", String.valueOf(b));
        }
        hashmap.putAll(a());
        return hashmap;
    }

    protected void a(int i)
    {
        b = i;
    }

    protected void a(long l)
    {
        d = l;
    }

    public void a(String s)
    {
        h = s;
    }

    protected void a(HashMap hashmap, f f1)
    {
        String s = (String)hashmap.get("ns_st_cn");
        if (s != null)
        {
            a(s);
            hashmap.remove("ns_st_cn");
        }
        s = (String)hashmap.get("ns_st_bt");
        if (s != null)
        {
            try
            {
                d = Long.parseLong(s);
                hashmap.remove("ns_st_bt");
            }
            catch (NumberFormatException numberformatexception2) { }
        }
        a("ns_st_cl", hashmap);
        a("ns_st_pn", hashmap);
        a("ns_st_tp", hashmap);
        a("ns_st_ub", hashmap);
        a("ns_st_br", hashmap);
        if (f1 == f.b || f1 == null)
        {
            String s1 = (String)hashmap.get("ns_st_sq");
            NumberFormatException numberformatexception;
            if (s1 != null)
            {
                try
                {
                    c = Integer.parseInt(s1);
                    hashmap.remove("ns_st_sq");
                }
                catch (NumberFormatException numberformatexception1) { }
            }
        }
        if (f1 != f.d)
        {
            s1 = (String)hashmap.get("ns_st_pt");
            if (s1 != null)
            {
                try
                {
                    f = Long.parseLong(s1);
                    hashmap.remove("ns_st_pt");
                }
                // Misplaced declaration of an exception variable
                catch (NumberFormatException numberformatexception) { }
            }
        }
        if (f1 != f.c && f1 != f.a && f1 != null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        f1 = (String)hashmap.get("ns_st_pc");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        b = Integer.parseInt(f1);
        hashmap.remove("ns_st_pc");
        return;
        hashmap;
    }

    public void a(Set set)
    {
        if (set != null && !set.isEmpty())
        {
            com.comscore.streaming.g.a(a, set);
        } else
        {
            a.clear();
        }
        if (!a.containsKey("ns_st_cl"))
        {
            a.put("ns_st_cl", "0");
        }
        if (!a.containsKey("ns_st_pn"))
        {
            a.put("ns_st_pn", "1");
        }
        if (!a.containsKey("ns_st_tp"))
        {
            a.put("ns_st_tp", "1");
        }
        a(0);
        b(0);
        a(0L);
        d(-1L);
        b(0L);
        c(-1L);
    }

    protected void b()
    {
        b = b + 1;
    }

    protected void b(int i)
    {
        c = i;
    }

    protected void b(long l)
    {
        f = l;
    }

    protected void c()
    {
        c = c + 1;
    }

    protected void c(long l)
    {
        g = l;
    }

    protected long d()
    {
        long l1 = d;
        long l = l1;
        if (e >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - e);
        }
        return l;
    }

    protected void d(long l)
    {
        e = l;
    }

    protected long e()
    {
        long l1 = f;
        long l = l1;
        if (g >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - g);
        }
        return l;
    }

    protected long f()
    {
        return g;
    }

    protected long g()
    {
        return e;
    }

    public String h()
    {
        if (p.g(h))
        {
            a("1");
        }
        return h;
    }
}
