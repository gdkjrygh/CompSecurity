// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.i;
import java.util.List;
import kik.a.d.j;
import kik.a.d.n;
import kik.a.e.r;

// Referenced classes of package kik.a.g:
//            b

final class o extends i
{

    final b a;

    o(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        obj1 = a.a(((String) (obj)), false);
        if (obj1 != null && !((n) (obj1)).I())
        {
            obj = ((n) (obj1)).w();
            for (int k = 0; k < ((List) (obj)).size(); k++)
            {
                obj1 = (String)((List) (obj)).get(k);
                if (!b.b(a).c(((String) (obj1))))
                {
                    b.b(a).a(j.a(((String) (obj1))));
                }
            }

        } else
        if (!b.b(a).c(((String) (obj))))
        {
            b.b(a).a(j.a(((String) (obj))));
        }
    }
}
