// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.k;
import kik.a.f.f.aj;

// Referenced classes of package kik.a.g:
//            aa, v

final class z extends r
{

    final v a;

    z(v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = ((aj)obj).d();
        obj = new ArrayList();
        String s;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); a.a(s, false, new aa(this)))
        {
            s = ((k)((Iterator) (obj1)).next()).b();
            ((List) (obj)).add(s);
        }

        v.j(a).a(obj);
    }

    public final void b(Throwable throwable)
    {
        v.f(a).a(null);
    }
}
