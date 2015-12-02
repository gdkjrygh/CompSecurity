// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import com.facebook.base.c;
import com.facebook.base.d;
import com.facebook.common.executors.a;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.google.common.a.fi;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.base.a:
//            l

public class k
{

    private final Class a = com/facebook/base/a/k;
    private final a b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final Set g;
    private final Set h;

    public k(a a1, Set set, Set set1, Set set2, Set set3, Set set4, Set set5)
    {
        b = a1;
        c = fi.a(set);
        d = fi.a(set2);
        e = fi.a(set4);
        f = fi.a(set1);
        g = fi.a(set3);
        h = fi.a(set5);
    }

    static void a(k k1)
    {
        k1.b();
    }

    private void b()
    {
        com.facebook.debug.d.e.b(10L);
        e e1 = com.facebook.debug.d.e.a("FbAppInitializer");
        e e2;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); e2.a())
        {
            c c1 = (c)iterator.next();
            e2 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(c1.getClass().getSimpleName()).toString());
            c1.a();
        }

        e e3;
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext(); e3.a())
        {
            d d1 = (d)iterator1.next();
            e3 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(d1.getClass().getSimpleName()).toString());
            d1.a();
        }

        e1.a();
        com.facebook.debug.log.b.c(a, "High priority worker thread app initialization complete");
        com.facebook.debug.d.e.a(a);
    }

    static void b(k k1)
    {
        k1.c();
    }

    static a c(k k1)
    {
        return k1.b;
    }

    private void c()
    {
        com.facebook.debug.d.e.b(10L);
        e e1 = com.facebook.debug.d.e.a("FbAppInitializer-LowPriUIThread");
        e e2;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); e2.a())
        {
            c c1 = (c)iterator.next();
            e2 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(c1.getClass().getSimpleName()).toString());
            c1.a();
        }

        e e3;
        for (Iterator iterator1 = g.iterator(); iterator1.hasNext(); e3.a())
        {
            d d1 = (d)iterator1.next();
            e3 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(d1.getClass().getSimpleName()).toString());
            d1.a();
        }

        e1.a();
        com.facebook.debug.log.b.c(a, "Low priority main thread app initialization complete");
        com.facebook.debug.d.e.a(a);
    }

    private void d()
    {
        com.facebook.debug.d.e.b(10L);
        e e1 = com.facebook.debug.d.e.a("FbAppInitializer-LowPriWorkerThread");
        e e2;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); e2.a())
        {
            c c1 = (c)iterator.next();
            e2 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(c1.getClass().getSimpleName()).toString());
            c1.a();
        }

        e e3;
        for (Iterator iterator1 = h.iterator(); iterator1.hasNext(); e3.a())
        {
            d d1 = (d)iterator1.next();
            e3 = com.facebook.debug.d.e.a((new StringBuilder()).append("#").append(d1.getClass().getSimpleName()).toString());
            d1.a();
        }

        e1.a();
        com.facebook.debug.log.b.c(a, "Low priority worker thread app initialization complete");
        com.facebook.debug.d.e.a(a);
    }

    static void d(k k1)
    {
        k1.d();
    }

    public s a()
    {
        ab ab1 = ab.a();
        b.a("FbAppInit", new l(this, ab1));
        return ab1;
    }
}
