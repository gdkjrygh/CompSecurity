// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

// Referenced classes of package bo.app:
//            bb, dm, da, ch, 
//            cm, cf, cg, ao, 
//            bs, cr, dt, ei, 
//            ea

public final class ap
    implements b
{

    final ao a;

    public ap(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        Object obj1;
        obj1 = ((bb)obj).a;
        obj = ((dm) (obj1)).d();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((dm) (obj1)).d().a == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((dm) (obj1)).d().a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        ch ch1;
        cm cm1;
        ch1 = (ch)iterator.next();
        cm1 = ch1.a;
        obj1 = cm1.i;
        obj1;
        JVM INSTR monitorenter ;
        gr gr = ch1.a().a;
        synchronized (cm1.i)
        {
            cm1.c.removeAll(gr);
        }
        if (ch1.c)
        {
            cm1.f.c();
        }
        if (ch1.b != null)
        {
            cm1.g.c();
        }
        obj1;
        JVM INSTR monitorexit ;
        if (!ch1.a.g() || ch1.a.d == ao.a(a).c())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        ao.a();
        String.format("Clearing fully dispatched sealed session %s", new Object[] {
            ch1.a.d.toString()
        });
        bo.app.ao.b(a).c(ch1.a).get();
          goto _L6
        obj1;
        ao.a();
_L4:
        obj1 = ((da) (obj)).c;
        if (obj1 != null)
        {
            ao.c(a).b(obj1);
        }
        obj = ((da) (obj)).b;
        if (obj != null)
        {
            ao.d(a).b(obj);
        }
_L2:
        return;
        exception1;
        obj2;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        bo.app.ao.b(a).a(ch1.a);
          goto _L6
    }
}
