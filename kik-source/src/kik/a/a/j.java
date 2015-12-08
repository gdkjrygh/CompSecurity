// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.a;

import com.kik.g.p;
import com.kik.o.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kik.a.e.e;
import kik.a.e.f;
import kik.a.e.v;
import kik.a.j.m;
import kik.a.k.a;
import kik.a.k.b;
import kik.a.z;

// Referenced classes of package kik.a.a:
//            l, a, k

public final class j
    implements l
{

    private final f a;
    private final e b;
    private final m c;
    private final v d;

    public j(f f1, e e1, m m, v v)
    {
        a = f1;
        b = e1;
        c = m;
        d = v;
    }

    public final com.kik.g.e a()
    {
        return a.b();
    }

    public final void a(List list)
    {
        com.kik.d.f f1 = b.c();
        if (f1 != null)
        {
            HashMap hashmap = new HashMap();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                kik.a.a.a a1 = (kik.a.a.a)list.next();
                HashMap hashmap2 = new HashMap();
                if (a1.b() != null && a1.b().length() > 0)
                {
                    hashmap2.put("variant", a1.b());
                }
                if (a1.c() != null && a1.c().length() > 0)
                {
                    hashmap2.put("experiment_id", a1.c());
                }
                if (a1.a() != null && a1.a().length() > 0)
                {
                    hashmap.put(a1.a(), hashmap2);
                }
            } while (true);
            list = b.a(hashmap);
            if (list != null && list.length() > 0)
            {
                HashMap hashmap1 = new HashMap();
                hashmap1.put("experiments", list);
                f1.a(com.kik.d.b.a.k.j, hashmap1, kik.a.h.j.b());
            }
        }
    }

    public final long b()
    {
        return kik.a.h.j.b();
    }

    public final boolean c()
    {
        return a.k() && a.m();
    }

    public final p d()
    {
        p p1 = new p();
        com.kik.a.a.a.c.a a1 = com.kik.a.a.a.c.j();
        Object obj = z.b(d).a();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = com.kik.o.c.i().a(((kik.a.d.j) (obj)).c()).r();
        }
        kik.a.k.a.a(a1.a(((c) (obj))).r()).a(a).a(new k(this, p1));
        return p1;
    }
}
