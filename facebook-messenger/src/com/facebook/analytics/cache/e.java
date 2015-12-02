// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;

import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.analytics.cache:
//            c, d, f, g

public class e
{

    private final d a;
    private final String b;
    private final ak c;
    private final Map d;

    private e(d d1, String s, ak ak1)
    {
        a = d1;
        b = s;
        c = ak1;
        d = ik.a();
    }

    e(d d1, String s, ak ak1, f f1)
    {
        this(d1, s, ak1);
    }

    private boolean d()
    {
        return c.a() == al.CORE_AND_SAMPLED;
    }

    public String a()
    {
        return b;
    }

    public String a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d.containsKey(c1))
        {
            d.put(c1, (new StringBuilder()).append(a()).append("_").append(c1.toString()).toString());
        }
        c1 = (String)d.get(c1);
        this;
        JVM INSTR monitorexit ;
        return c1;
        c1;
        throw c1;
    }

    public void a(long l)
    {
        a(c.HITS_COUNT, l);
    }

    public void a(c c1, long l)
    {
        if (d())
        {
            a.a(a(c1), l);
        }
    }

    public void a(g g1, int i, long l)
    {
        switch (f.a[g1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(c.EVICTIONS_ON_CACHE_FULL_CALL, 1L);
            a(c.EVICTIONS_ON_CACHE_FULL_ITEM, i);
            a(c.EVICTIONS_ON_CACHE_FULL_SIZE, l);
            return;

        case 2: // '\002'
            a(c.EVICTIONS_ON_CONTENT_STALE_CALL, 1L);
            break;
        }
        a(c.EVICTIONS_ON_CONTENT_STALE_ITEM, i);
        a(c.EVICTIONS_ON_CONTENT_STALE_SIZE, l);
    }

    public void b()
    {
        a(1L);
    }

    public void b(long l)
    {
        a(c.MISSES_COUNT, l);
    }

    public void b(c c1, long l)
    {
        if (d())
        {
            a.b(a(c1), l);
        }
    }

    public void c()
    {
        b(1L);
    }

    public void c(long l)
    {
        b(c.BYTES_COUNT, l);
    }

    public void d(long l)
    {
        b(c.ENTRIES_COUNT, l);
    }

    public void e(long l)
    {
        a(c.INSERTION_ITEM, 1L);
        a(c.INSERTION_SIZE, l);
    }
}
