// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.k;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import kik.a.d.n;
import kik.a.f.f.q;

// Referenced classes of package kik.a.g:
//            b

final class l extends r
{

    final b a;

    l(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (q)obj;
        n n1 = a.a(((q) (obj)).d(), false);
        if (n1 != null)
        {
            n1.d(false);
            n1.f(false);
            n1.i(true);
            b.b(a).a(n1, true, true);
            String s;
            for (Iterator iterator = n1.w().iterator(); iterator.hasNext(); a.a(s, n1))
            {
                s = (String)iterator.next();
            }

        }
        b.b(a).j();
        b.g(a).a(obj);
    }

    public final void a(Throwable throwable)
    {
        b.d(a).a(throwable);
    }
}
