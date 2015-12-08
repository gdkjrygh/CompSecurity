// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kik.a.e.f;
import kik.a.f.f.aq;
import kik.a.h.j;

// Referenced classes of package kik.a.j:
//            u, ac

final class ab extends r
{

    final Long a;
    final List b;
    final p c;
    final u d;

    ab(u u1, Long long1, List list, p p1)
    {
        d = u1;
        a = long1;
        b = list;
        c = p1;
        super();
    }

    public final void a(Object obj)
    {
        if (a == null)
        {
            if (u.b(d).k())
            {
                obj = u.b(d).a(new aq(b));
            } else
            {
                obj = s.a(new TimeoutException("Network not connected"));
                u.b(d).o();
            }
        } else
        {
            long l = j.b();
            kik.a.d.ab ab1;
            for (obj = b.iterator(); ((Iterator) (obj)).hasNext(); u.e(d).put(ab1.e(), Long.valueOf(a.longValue() + l)))
            {
                ab1 = (kik.a.d.ab)((Iterator) (obj)).next();
            }

            u.d(d);
            obj = s.a(new TimeoutException("Flush scheduled"));
        }
        ((p) (obj)).a(new ac(this));
    }

    public final void a(Throwable throwable)
    {
        c.a(throwable);
    }
}
