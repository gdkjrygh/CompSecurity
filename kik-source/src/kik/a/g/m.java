// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.i;
import com.kik.g.k;
import java.util.Iterator;
import java.util.List;
import kik.a.d.n;
import kik.a.e.r;
import kik.a.e.v;

// Referenced classes of package kik.a.g:
//            b

final class m extends i
{

    final b a;

    m(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (obj != null)
        {
            n n1;
            for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); b.c(a).a(n1.b()))
            {
                n1 = (n)((Iterator) (obj1)).next();
                if (n1.l() && n1.G())
                {
                    a.a(n1.b());
                }
                a.b(n1);
                b.b(a).a(n1, true, true);
            }

            b.a(a).c(((List) (obj)));
        }
    }
}
