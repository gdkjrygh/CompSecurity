// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

// Referenced classes of package bo.app:
//            bf, ds, dd, at, 
//            em, dg, cn, cs, 
//            cl, gw, cm, ad, 
//            eo, eg

public final class av
    implements IEventSubscriber
{

    final Semaphore a = null;
    final at b;

    public av(at at1)
    {
        b = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        boolean flag = false;
        obj = (bf)obj;
        if (((bf) (obj)).a.e().a != null)
        {
            flag = true;
        }
        if (flag)
        {
            at.e(b).a(true);
        }
        obj1 = ((bf) (obj)).a.d();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = ((dg) (obj1)).a;
        Iterator iterator;
        cn cn1;
        cs cs1;
        gw gw1;
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
        cn1 = (cn)iterator.next();
        cs1 = cn1.a;
        obj = cs1.i;
        obj;
        JVM INSTR monitorenter ;
        gw1 = cn1.a().a;
        synchronized (cs1.i)
        {
            s = cs.a;
            String.format("Adding %s failed events back into session", new Object[] {
                Integer.valueOf(gw1.size())
            });
            cs1.c.removeAll(gw1);
            cs1.b.addAll(gw1);
        }
        if (cn1.c)
        {
            cs1.f.d();
        }
        if (cn1.b != null)
        {
            cs1.g.d();
        }
        obj;
        JVM INSTR monitorexit ;
        at.f(b).a(cn1.a);
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
        if (((dg) (obj1)).c != null)
        {
            at.c(b).b(null);
        }
        if (((dg) (obj1)).b != null)
        {
            at.d(b).b(null);
        }
    }
}
