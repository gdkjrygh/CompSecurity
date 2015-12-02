// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import com.facebook.auth.f.b;
import com.google.common.a.hy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.location:
//            g, p, Coordinates, ab

public class c
    implements b
{

    private static final g a = new g();
    private final ConcurrentMap b;
    private final ConcurrentMap c;
    private final ConcurrentMap d;

    public c()
    {
        b = (new hy()).b(900L, TimeUnit.SECONDS).b(100).n();
        c = (new hy()).b(1800L, TimeUnit.SECONDS).b(3).n();
        d = (new hy()).a(600L, TimeUnit.SECONDS).b(5).n();
    }

    private g a(g g1)
    {
        g g2 = g1;
        if (g1 == a)
        {
            g2 = null;
        }
        return g2;
    }

    private g a(ConcurrentMap concurrentmap, Coordinates coordinates)
    {
        g g1 = (g)concurrentmap.get(p.a(coordinates));
        if (g1 != null)
        {
            return a(g1);
        }
        for (concurrentmap = concurrentmap.values().iterator(); concurrentmap.hasNext();)
        {
            g g2 = (g)concurrentmap.next();
            if (g2 != a && ab.a(coordinates.b(), coordinates.c(), g2.a(), g2.b()))
            {
                return g2;
            }
        }

        return null;
    }

    private g b(g g1)
    {
        g g2 = g1;
        if (g1 == null)
        {
            g2 = a;
        }
        return g2;
    }

    public g a(Coordinates coordinates)
    {
        return a(b, coordinates);
    }

    public void a()
    {
        b.clear();
        c.clear();
        d.clear();
    }

    public void a(Coordinates coordinates, g g1)
    {
        b.put(p.a(coordinates), b(g1));
    }

    public void a(Coordinates coordinates, String s)
    {
        d.put(coordinates, s);
    }

    public g b(Coordinates coordinates)
    {
        return a(c, coordinates);
    }

    public void b(Coordinates coordinates, g g1)
    {
        c.put(p.a(coordinates), b(g1));
    }

    public String c(Coordinates coordinates)
    {
        for (Iterator iterator = d.keySet().iterator(); iterator.hasNext();)
        {
            Coordinates coordinates1 = (Coordinates)iterator.next();
            if (ab.a(coordinates.b(), coordinates.c(), coordinates1.b(), coordinates1.c()))
            {
                return (String)d.get(coordinates1);
            }
        }

        return null;
    }

    public void d()
    {
        a();
    }

}
