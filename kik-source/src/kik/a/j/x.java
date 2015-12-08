// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            u

final class x extends r
{

    final u a;

    x(u u1)
    {
        a = u1;
        super();
    }

    public final void a()
    {
        u.f(a);
    }

    public final void a(Object obj)
    {
        Object obj1 = (List)obj;
        if (obj1 != null)
        {
            obj = new ArrayList();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ab ab1 = (ab)((Iterator) (obj1)).next();
                if (ab1 != null)
                {
                    String s = ab1.e();
                    if (!u.e(a).containsKey(s))
                    {
                        ((List) (obj)).add(ab1);
                    }
                }
            } while (true);
            if (((List) (obj)).size() > 0)
            {
                a.a(((List) (obj)), null);
            }
        }
    }
}
