// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.c;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            c, b, f

public class e
{

    private b a;
    private String b;
    private int c;
    private int d;
    private int e;
    private long f;
    private long g;
    private HashMap h;
    private boolean i;

    public HashMap a()
    {
        return h;
    }

    protected HashMap a(com.comscore.streaming.c c1, HashMap hashmap)
    {
        if (hashmap == null)
        {
            hashmap = new HashMap();
        }
        hashmap.put("ns_st_bp", String.valueOf(d()));
        hashmap.put("ns_st_sp", String.valueOf(c));
        hashmap.put("ns_st_id", String.valueOf(b));
        if (e > 0)
        {
            hashmap.put("ns_st_bc", String.valueOf(e));
        }
        if (c1 == c.b || c1 == com.comscore.streaming.c.c || c1 == c.e || c1 == c.f || c1 == null)
        {
            hashmap.put("ns_st_pa", String.valueOf(e()));
            hashmap.put("ns_st_pp", String.valueOf(d));
        }
        if ((c1 == c.a || c1 == null) && !h())
        {
            hashmap.put("ns_st_pb", "1");
            a(true);
        }
        hashmap.putAll(a());
        return hashmap;
    }

    protected void a(int j)
    {
        c = j;
    }

    protected void a(long l)
    {
        com.comscore.utils.c.a(this, (new StringBuilder()).append("addPlaybackTime(").append(l).append(")").toString());
        if (a.f() >= 0L)
        {
            long l1 = l - a.f();
            a.c(-1L);
            a.b(a.e() + l1);
            d(e() + l1);
            com.comscore.utils.c.a(this, (new StringBuilder()).append("addPlaybackTime(").append(l).append(") ->").append(l1).toString());
        }
    }

    protected void a(HashMap hashmap, f f1)
    {
        String s = (String)hashmap.get("ns_st_sp");
        if (s != null)
        {
            try
            {
                c = Integer.parseInt(s);
                hashmap.remove("ns_st_sp");
            }
            catch (NumberFormatException numberformatexception3) { }
        }
        s = (String)hashmap.get("ns_st_bc");
        if (s != null)
        {
            try
            {
                e = Integer.parseInt(s);
                hashmap.remove("ns_st_bc");
            }
            catch (NumberFormatException numberformatexception2) { }
        }
        s = (String)hashmap.get("ns_st_bp");
        if (s != null)
        {
            try
            {
                f = Long.parseLong(s);
                hashmap.remove("ns_st_bp");
            }
            catch (NumberFormatException numberformatexception1) { }
        }
        s = (String)hashmap.get("ns_st_id");
        if (s != null)
        {
            b = s;
            hashmap.remove("ns_st_id");
        }
        if (f1 != f.d)
        {
            String s1 = (String)hashmap.get("ns_st_pa");
            if (s1 != null)
            {
                try
                {
                    g = Long.parseLong(s1);
                    hashmap.remove("ns_st_pa");
                }
                catch (NumberFormatException numberformatexception) { }
            }
        }
        if (f1 != com.comscore.streaming.f.c && f1 != f.a && f1 != null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        f1 = (String)hashmap.get("ns_st_pp");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        d = Integer.parseInt(f1);
        hashmap.remove("ns_st_pp");
        return;
        hashmap;
    }

    protected void a(boolean flag)
    {
        i = flag;
    }

    public b b()
    {
        return a;
    }

    protected void b(long l)
    {
        com.comscore.utils.c.a(this, (new StringBuilder()).append("addBufferingTime(").append(l).append(")").toString());
        if (a.g() >= 0L)
        {
            long l1 = l - a.g();
            a.d(-1L);
            a.a(a.d() + l1);
            c(d() + l1);
            com.comscore.utils.c.a(this, (new StringBuilder()).append("addBufferingTime(").append(l).append(") ->").append(l1).toString());
        }
    }

    protected int c()
    {
        return c;
    }

    protected void c(long l)
    {
        f = l;
    }

    protected long d()
    {
        long l1 = f;
        long l = l1;
        if (a.g() >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - a.g());
        }
        return l;
    }

    protected void d(long l)
    {
        g = l;
    }

    protected long e()
    {
        long l1 = g;
        long l = l1;
        if (a.f() >= 0L)
        {
            l = l1 + (System.currentTimeMillis() - a.f());
        }
        return l;
    }

    protected void f()
    {
        d = d + 1;
        a.b();
    }

    protected void g()
    {
        e = e + 1;
    }

    protected boolean h()
    {
        return i;
    }
}
