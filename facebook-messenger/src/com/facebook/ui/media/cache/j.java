// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.facebook.cache.a;
import com.facebook.cache.i;
import com.facebook.cache.l;
import com.facebook.cache.q;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.ui.media.cache:
//            g, i, h

class j
    implements a
{

    final g a;
    private long b;

    j(g g1)
    {
        a = g1;
        super();
        b = 0L;
    }

    public i a()
    {
        return i.LOW;
    }

    public void a(double d1)
    {
        Object obj;
        Object obj1;
        int j1;
        int k1;
        Iterator iterator;
        com.facebook.ui.media.cache.i i1;
        boolean flag;
        if (0.0D <= d1 && d1 <= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "trimRatio should be in range [0..1]");
        obj = g.d(a);
        obj;
        JVM INSTR monitorenter ;
        j1 = com.facebook.ui.media.cache.g.b(a);
        k1 = (int)((double)com.facebook.ui.media.cache.g.b(a) * d1);
        obj1 = hq.a(g.c(a).values());
        for (iterator = ((List) (obj1)).iterator(); iterator.hasNext(); com.facebook.ui.media.cache.i.a(i1, i.c(i1)))
        {
            i1 = (com.facebook.ui.media.cache.i)iterator.next();
        }

        break MISSING_BLOCK_LABEL_129;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Collections.sort(((List) (obj1)), new h(a));
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.facebook.ui.media.cache.i k = (com.facebook.ui.media.cache.i)((Iterator) (obj1)).next();
            g.e(a).put(i.d(k), com.facebook.ui.media.cache.i.a(k));
            g.c(a).remove(i.d(k));
            com.facebook.ui.media.cache.g.a(a, com.facebook.ui.media.cache.i.b(k));
        } while (com.facebook.ui.media.cache.g.b(a) >= j1 - k1);
        com.facebook.debug.log.b.c(g.g(), (new StringBuilder()).append("Finished cleaning out in memory cache: ").append(com.facebook.ui.media.cache.g.b(a) / 1024).append(" KB with ").append(g.c(a).size()).append(" values").toString());
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(q q)
    {
    }

    public l b()
    {
        return l.MEMORY;
    }

    public long c()
    {
        return (long)com.facebook.ui.media.cache.g.b(a);
    }

    public long d()
    {
        return (long)g.c(a).size();
    }

    public String e()
    {
        return "MediaCache.SyndicatedMemoryCache";
    }

    public long f()
    {
        return b;
    }
}
