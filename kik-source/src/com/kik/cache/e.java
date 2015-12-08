// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.kik.g.p;
import com.kik.g.r;
import java.util.HashMap;

// Referenced classes of package com.kik.cache:
//            d, f, h

final class e extends r
{

    final p a;
    final Long b;
    final boolean c;
    final d d;
    final Object e;
    final d f;

    e(d d1, p p1, Long long1, boolean flag, d d2, Object obj)
    {
        f = d1;
        a = p1;
        b = long1;
        c = flag;
        d = d2;
        e = obj;
        super();
    }

    private void a(p p1, boolean flag)
    {
        if (d != null)
        {
            d.a(e, b, c).a(new f(this, flag, p1));
        } else
        if (p1 != null)
        {
            p1.a(new Throwable("Cache miss"));
            return;
        }
    }

    public final void a()
    {
        synchronized (com.kik.cache.d.a(f))
        {
            com.kik.cache.d.a(f).remove(e);
        }
        return;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Object obj)
    {
        obj = (h)obj;
        a.a(new h(((h) (obj)).a(), ((h) (obj)).b()));
        boolean flag;
        if (!b.equals((Long)((h) (obj)).b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || c)
        {
            a(null, true);
        }
    }

    public final void a(Throwable throwable)
    {
        a(a, false);
    }
}
