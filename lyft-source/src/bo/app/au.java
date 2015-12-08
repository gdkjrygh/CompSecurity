// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

// Referenced classes of package bo.app:
//            bg, ds, dg, cn, 
//            cs, cl, cm, at, 
//            by, cx, dz, eo, 
//            eg

public final class au
    implements IEventSubscriber
{

    final at a;

    public au(at at1)
    {
        a = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        Object obj1;
        obj1 = ((bg)obj).a;
        obj = ((ds) (obj1)).d();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((ds) (obj1)).d().a == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((ds) (obj1)).d().a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        cn cn1;
        cs cs1;
        cn1 = (cn)iterator.next();
        cs1 = cn1.a;
        obj1 = cs1.i;
        obj1;
        JVM INSTR monitorenter ;
        gw gw = cn1.a().a;
        synchronized (cs1.i)
        {
            cs1.c.removeAll(gw);
        }
        if (cn1.c)
        {
            cs1.f.c();
        }
        if (cn1.b != null)
        {
            cs1.g.c();
        }
        obj1;
        JVM INSTR monitorexit ;
        if (!cn1.a.g() || cn1.a.d == at.a(a).c())
        {
            break MISSING_BLOCK_LABEL_299;
        }
        at.a();
        String.format("Clearing fully dispatched sealed session %s", new Object[] {
            cn1.a.d.toString()
        });
        at.b(a).c(cn1.a).get();
          goto _L6
        obj1;
        AppboyLogger.e(at.a(), "Caught exception while trying to clear sealed sessions", ((Throwable) (obj1)));
_L4:
        obj1 = ((dg) (obj)).c;
        if (obj1 != null)
        {
            at.c(a).b(obj1);
        }
        obj = ((dg) (obj)).b;
        if (obj != null)
        {
            at.d(a).b(obj);
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
        at.b(a).a(cn1.a);
          goto _L6
    }
}
