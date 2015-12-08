// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

// Referenced classes of package bo.app:
//            ba, dm, cx, ao, 
//            eg, da, ch, cm, 
//            cf, gr, cg, z, 
//            ei, ea

public final class aq
    implements b
{

    final Semaphore a = null;
    final ao b;

    public aq(ao ao1)
    {
        b = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        boolean flag = false;
        obj = (ba)obj;
        if (((ba) (obj)).a.e().a != null)
        {
            flag = true;
        }
        if (flag)
        {
            ao.e(b).a(true);
        }
        obj1 = ((ba) (obj)).a.d();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj = ((da) (obj1)).a;
        Iterator iterator;
        ch ch1;
        cm cm1;
        gr gr1;
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
        ch1 = (ch)iterator.next();
        cm1 = ch1.a;
        obj = cm1.i;
        obj;
        JVM INSTR monitorenter ;
        gr1 = ch1.a().a;
        synchronized (cm1.i)
        {
            s = cm.a;
            String.format("Adding %s failed events back into session", new Object[] {
                Integer.valueOf(gr1.size())
            });
            cm1.c.removeAll(gr1);
            cm1.b.addAll(gr1);
        }
        if (ch1.c)
        {
            cm1.f.d();
        }
        if (ch1.b != null)
        {
            cm1.g.d();
        }
        obj;
        JVM INSTR monitorexit ;
        ao.f(b).a(ch1.a);
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
        if (((da) (obj1)).c != null)
        {
            ao.c(b).b(null);
        }
        if (((da) (obj1)).b != null)
        {
            ao.d(b).b(null);
        }
    }
}
