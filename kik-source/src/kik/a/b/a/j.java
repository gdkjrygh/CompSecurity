// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.i;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import kik.a.d.f;
import kik.a.e.v;

// Referenced classes of package kik.a.b.a:
//            a

final class j extends i
{

    final a a;

    j(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (((Integer)obj1).intValue() >= 59) goto _L2; else goto _L1
_L1:
        obj = kik.a.b.a.a.i(a);
        obj;
        JVM INSTR monitorenter ;
        f f1;
        kik.a.d.s s;
        for (obj1 = kik.a.b.a.a.i(a).values().iterator(); ((Iterator) (obj1)).hasNext(); kik.a.b.a.a.a(a).a(f1, s))
        {
            f1 = (f)((Iterator) (obj1)).next();
            s = f1.d();
        }

        break MISSING_BLOCK_LABEL_86;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
_L2:
    }
}
