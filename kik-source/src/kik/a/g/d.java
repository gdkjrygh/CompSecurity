// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.f.f.l;

// Referenced classes of package kik.a.g:
//            b

final class d extends r
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (l)obj;
        obj = a.a(((l) (obj1)).d(), false);
        obj1 = ((l) (obj1)).e().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (String)((Iterator) (obj1)).next();
            if (obj != null)
            {
                ((n) (obj)).d(((String) (obj2)));
                b.a(a, ((n) (obj)), ((String) (obj2)));
                b.b(a).a(((k) (obj)));
                if (!((n) (obj)).I())
                {
                    obj2 = b.b(a).a(((String) (obj2)), false);
                    if (obj2 != null && !((k) (obj2)).p())
                    {
                        b.b(a).a(((k) (obj2)).a());
                    }
                }
            }
        } while (true);
        b.b(a).j();
    }

    public final void a(Throwable throwable)
    {
        b.d(a).a(throwable);
    }
}
