// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.i;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.v;

// Referenced classes of package kik.a.g:
//            b

final class c extends i
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (k)obj1;
        if (obj != null && !(obj instanceof n))
        {
            obj = a.a(((k) (obj))).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (String)((Iterator) (obj)).next();
                if (obj1 != null)
                {
                    obj1 = a.a(((String) (obj1)), false);
                    if (obj1 != null)
                    {
                        b.a(a).d(((k) (obj1)));
                    }
                }
            }
        }
    }
}
