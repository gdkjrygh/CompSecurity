// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import com.facebook.common.c.i;
import com.facebook.debug.log.b;
import com.facebook.e.a.d;
import com.facebook.e.a.e;
import com.google.common.a.fi;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;
import javax.inject.a;

// Referenced classes of package com.facebook.cache:
//            s, r, p, a, 
//            m, j, t

public class q
{

    private static final Class a = com/facebook/cache/q;
    private final e b;
    private final s c;
    private final a d;
    private final com.facebook.common.time.a e;
    private final d f = new r(this);
    private final Map g = new WeakHashMap();
    private j h;
    private long i;

    public q(e e1, s s1, a a1, com.facebook.common.time.a a2)
    {
        i = 0L;
        b = (e)Preconditions.checkNotNull(e1, "ResourceManager cannot be null");
        c = (s)Preconditions.checkNotNull(s1, "MemoryCacheManagerConfig cannot be null");
        d = (a)Preconditions.checkNotNull(a1, "GK Provider for isTrimmingEnabled cannot be null");
        e = (com.facebook.common.time.a)Preconditions.checkNotNull(a2, "Clock cannot be null");
        b.a(f);
    }

    private boolean a(com.facebook.cache.a a1)
    {
        p p1 = (p)g.get(a1);
        if (p1 == null)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("No budget is associated with cache. ").append(a1.e()).toString());
            return true;
        }
        boolean flag;
        if (a1.c() > p1.b() || a1.d() > p1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    long a()
    {
        return i;
    }

    public void a(j j1)
    {
        h = j1;
    }

    void a(i k)
    {
        if (e.a() - a() > c.a() && b.a(k))
        {
            b(k);
        }
    }

    void b(i k)
    {
        Preconditions.checkNotNull(h, "CacheSyndicator cannot be null");
        i = e.a();
        if (d.b() != com.facebook.common.w.q.YES)
        {
            com.facebook.debug.log.b.b(a, "GK not enabled, hence not trimming.");
            return;
        }
        k = new TreeSet(new m());
        Iterator iterator = h.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            t t1 = (t)iterator.next();
            if (t1 instanceof com.facebook.cache.a)
            {
                k.add((com.facebook.cache.a)t1);
            }
        } while (true);
        long l3 = c.c();
        double d1 = c.d();
        int l = 0;
        long l1 = 0L;
        boolean flag = true;
        long l2;
        for (; l < c.b() && l1 < l3; l1 = l2)
        {
            Iterator iterator1 = k.iterator();
label0:
            do
            {
                com.facebook.cache.a a1;
                do
                {
                    l2 = l1;
                    if (!iterator1.hasNext())
                    {
                        break label0;
                    }
                    a1 = (com.facebook.cache.a)iterator1.next();
                } while (flag && !a(a1));
                l2 = a1.c();
                h.a(a1, d1);
                l2 = l1 + (l2 - a1.c());
                l1 = l2;
            } while (l2 < l3);
            boolean flag1 = flag;
            if (flag)
            {
                d1 = c.e();
                flag1 = false;
            }
            l++;
            flag = flag1;
        }

        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Memory Freed ").append(l1).append(",  Target: ").append(l3).toString());
    }

}
