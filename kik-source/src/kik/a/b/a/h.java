// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.i;
import com.kik.g.k;
import java.util.Hashtable;
import java.util.List;
import kik.a.d.n;
import kik.a.e.l;

// Referenced classes of package kik.a.b.a:
//            a

final class h extends i
{

    final a a;

    h(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        n n1;
        obj1 = (String)obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        kik.a.b.a.a.b(a, ((String) (obj1)));
        obj = a.a(((String) (obj1)));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        n1 = kik.a.b.a.a.j(a).a(((String) (obj1)), false);
        obj1 = kik.a.b.a.a.i(a);
        obj1;
        JVM INSTR monitorenter ;
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (!n1.l() || kik.a.b.a.a.i(a).get(n1.b()) != null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (!n1.I())
        {
            n1.w();
            if (n1.w().size() <= 0)
            {
                break MISSING_BLOCK_LABEL_130;
            }
        }
        a.h(n1.b());
        kik.a.b.a.a.k(a).a(obj);
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
