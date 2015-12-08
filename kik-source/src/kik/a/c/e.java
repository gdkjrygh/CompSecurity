// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.c;

import com.kik.g.p;
import com.kik.g.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kik.a.f.f.d;
import kik.a.f.f.z;

// Referenced classes of package kik.a.c:
//            c, f

final class e extends r
{

    final Map a;
    final c b;

    e(c c1, Map map)
    {
        b = c1;
        a = map;
        super();
    }

    public final void a(Object obj)
    {
        obj = (z)obj;
        if (obj instanceof d)
        {
            obj = (d)obj;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                kik.a.d.r r1 = ((d) (obj)).a((String)entry.getKey());
                if (r1 == null)
                {
                    ((p)entry.getValue()).a(new Exception("No result found for requested link"));
                } else
                {
                    ((p)entry.getValue()).a(r1);
                }
            }

        } else
        {
            a(((Throwable) (new Exception())));
        }
    }

    public final void a(Throwable throwable)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); c.a(b).b((String)entry.getKey()).a(throwable))
        {
            entry = (java.util.Map.Entry)iterator.next();
            ((p)entry.getValue()).a(throwable);
        }

    }
}
