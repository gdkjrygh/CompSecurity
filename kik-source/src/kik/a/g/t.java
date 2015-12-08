// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.d.k;
import kik.a.f.f.n;
import kik.a.f.q;

// Referenced classes of package kik.a.g:
//            b

final class t extends r
{

    final String a;
    final String b;
    final b c;

    t(b b1, String s, String s1)
    {
        c = b1;
        a = s;
        b = s1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (n)obj;
        kik.a.g.b.b(c).a(((n) (obj)).g());
        c.c(((n) (obj)).g());
        if (!((n) (obj)).g().I())
        {
            Iterator iterator = ((n) (obj)).g().w().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj1 = (String)iterator.next();
                obj1 = kik.a.g.b.b(c).a(((String) (obj1)), false);
                if (obj1 != null && !((k) (obj1)).p())
                {
                    kik.a.g.b.b(c).a(((k) (obj1)).a());
                }
            } while (true);
        }
        kik.a.g.b.b(c).j();
        kik.a.g.b.e(c).a(obj);
        kik.a.g.b.f(c).remove(a);
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            Object obj = (q)throwable;
            if (((q) (obj)).a() == 202)
            {
                String s;
                for (obj = ((List)((q) (obj)).b()).iterator(); ((Iterator) (obj)).hasNext(); c.a(s))
                {
                    s = (String)((Iterator) (obj)).next();
                }

                kik.a.g.b.b(c).a(true, false);
            }
        }
        kik.a.g.b.f(c).put(a, b);
        kik.a.g.b.d(c).a(throwable);
    }
}
