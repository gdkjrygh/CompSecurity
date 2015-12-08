// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.k;
import kik.a.f.f.f;

// Referenced classes of package kik.a.g:
//            at, v

final class as extends r
{

    final v a;

    as(v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((f)obj).d().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            k k1 = (k)((Iterator) (obj)).next();
            if (k1 != null)
            {
                String s = k1.b();
                a.a(s, false, new at(this, k1));
            }
        } while (true);
    }
}
