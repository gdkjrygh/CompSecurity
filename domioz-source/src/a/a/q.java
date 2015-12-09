// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.c.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

// Referenced classes of package a.a:
//            ab, ck, by, o, 
//            df, cc, bi, bn, 
//            bg, fm, bh, e, 
//            dh, cy

public final class q
    implements b
{

    final Semaphore a = null;
    final o b;

    public q(o o1)
    {
        b = o1;
        super();
    }

    public final void a(Object obj)
    {
        boolean flag = false;
        obj = (ab)obj;
        if (((ab) (obj)).a.e().a != null)
        {
            flag = true;
        }
        if (flag)
        {
            o.e(b).a(true);
        }
        obj1 = ((ab) (obj)).a.d();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = ((cc) (obj1)).a;
        Iterator iterator;
        bi bi1;
        bn bn1;
        fm fm1;
        String s;
        if (obj == null)
        {
            obj = Collections.emptySet();
        }
        iterator = ((Iterable) (obj)).iterator();
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bi1 = (bi)iterator.next();
        bn1 = bi1.a;
        obj = bn1.i;
        obj;
        JVM INSTR monitorenter ;
        fm1 = bi1.b().a;
        synchronized (bn1.i)
        {
            s = bn.a;
            String.format("Adding %s failed events back into session", new Object[] {
                Integer.valueOf(fm1.size())
            });
            bn1.c.removeAll(fm1);
            bn1.b.addAll(fm1);
        }
        if (bi1.c)
        {
            bn1.f.d();
        }
        if (bi1.b != null)
        {
            bn1.g.d();
        }
        obj;
        JVM INSTR monitorexit ;
        o.f(b).a(bi1.a);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_73;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L1:
        if (a != null)
        {
            a.release();
        }
        if (((cc) (obj1)).c != null)
        {
            o.c(b).b(null);
        }
        if (((cc) (obj1)).b != null)
        {
            o.d(b).b(null);
        }
    }
}
