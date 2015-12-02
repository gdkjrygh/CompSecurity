// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.facebook.common.executors.s;
import com.google.common.a.hy;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import com.google.common.d.a.w;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;

// Referenced classes of package com.facebook.ui.images.b:
//            m, f, g, l

public class e
{

    private final Class a = com/facebook/ui/images/b/e;
    private final l b;
    private final u c = w.a(Executors.newFixedThreadPool(2, new s("image-decoding-")));
    private final ConcurrentMap d = (new hy()).h().n();
    private final Object e = new Object();

    public e(l l)
    {
        b = l;
    }

    static l a(e e1)
    {
        return e1.b;
    }

    static Object b(e e1)
    {
        return e1.e;
    }

    static ConcurrentMap c(e e1)
    {
        return e1.d;
    }

    public com.google.common.d.a.s a(m m1)
    {
        com.google.common.d.a.s s1;
        com.facebook.ui.images.cache.d d1;
        s1 = null;
        d1 = m1.i();
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s1 = (com.google.common.d.a.s)d.get(d1);
        Object obj;
        obj = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        m1 = c.c(new f(this, m1));
        obj = m1;
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        d.put(d1, m1);
        i.a(m1, new g(this, d1));
        obj = m1;
        obj1;
        JVM INSTR monitorexit ;
        return ((com.google.common.d.a.s) (obj));
        m1;
        obj1;
        JVM INSTR monitorexit ;
        throw m1;
    }
}
