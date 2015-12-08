// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.g.i;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import kik.a.d.f;

// Referenced classes of package kik.a.b.a:
//            a

final class g extends i
{

    final a a;

    g(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj)).iterator();
_L3:
        String s;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)((Iterator) (obj1)).next();
        obj = kik.a.b.a.a.i(a);
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = kik.a.b.a.a.i(a).values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            if ((a.a(f1) == 2 || f1.b().equals(s)) && f1.n())
            {
                a.d(f1.b());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_137;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        kik.a.b.a.a.b(a, s);
        if (true) goto _L3; else goto _L2
_L2:
    }
}
