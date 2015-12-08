// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.a;

import com.kik.g.k;
import com.kik.g.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.e.a;
import kik.a.h.b;

// Referenced classes of package kik.a.a:
//            c, a, l

final class i extends r
{

    final c a;

    i(c c1)
    {
        a = c1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (com.kik.a.a.a.e)obj;
        super.a(obj);
        if (obj != null)
        {
            HashMap hashmap = new HashMap();
            Iterator iterator = ((com.kik.a.a.a.e) (obj)).h().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (com.kik.a.a.a.a)iterator.next();
                if (kik.a.a.c.a(a, ((com.kik.a.a.a.a) (obj2)).h(), ((com.kik.a.a.a.a) (obj2)).i()))
                {
                    kik.a.a.a a1 = new kik.a.a.a(((com.kik.a.a.a.a) (obj2)).h(), ((com.kik.a.a.a.a) (obj2)).i());
                    obj2 = ((com.kik.a.a.a.a) (obj2)).j();
                    if (obj2 != null && ((String) (obj2)).length() > 0)
                    {
                        a1.a(((String) (obj2)));
                    }
                    hashmap.put(a1.a(), a1);
                }
            } while (true);
            synchronized (c.d(a))
            {
                kik.a.a.c.a(a, hashmap);
                c.e(a).a(null);
                c.g(a).a(new ArrayList(c.f(a).values()));
                c.g(a).a(kik.a.a.c.a(a).b());
                c.g(a).c(0L);
                if (((com.kik.a.a.a.e) (obj)).i())
                {
                    kik.a.a.c.a(a).a(c.h(a));
                }
                if (c.i(a) != null)
                {
                    c.i(a).c();
                }
            }
            return;
        } else
        {
            return;
        }
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b(Object obj)
    {
        super.b((com.kik.a.a.a.e)obj);
        synchronized (c.d(a))
        {
            kik.a.a.c.k(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Throwable throwable)
    {
        super.b(throwable);
        synchronized (c.d(a))
        {
            if (c.i(a) == null)
            {
                c.j(a);
            }
            if (!c.i(a).a())
            {
                c.g(a).a(kik.a.a.c.a(a).b());
                c.g(a).c(0L);
            }
        }
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
