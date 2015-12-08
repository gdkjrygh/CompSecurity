// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.c.b;
import com.appboy.f.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;

// Referenced classes of package a.a:
//            ac, ck, cc, bi, 
//            bn, bg, bh, o, 
//            au, bs, cr, dh, 
//            cy

public final class p
    implements b
{

    final o a;

    public p(o o1)
    {
        a = o1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj1 = ((ac)obj).a;
        obj = ((ck) (obj1)).d();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((ck) (obj1)).d().a == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((ck) (obj1)).d().a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        bi bi1;
        bn bn1;
        bi1 = (bi)iterator.next();
        bn1 = bi1.a;
        obj1 = bn1.i;
        obj1;
        JVM INSTR monitorenter ;
        fm fm = bi1.b().a;
        synchronized (bn1.i)
        {
            bn1.c.removeAll(fm);
        }
        if (bi1.c)
        {
            bn1.f.c();
        }
        if (bi1.b != null)
        {
            bn1.g.c();
        }
        obj1;
        JVM INSTR monitorexit ;
        if (!bi1.a.g() || bi1.a.d == a.a.o.a(a).c())
        {
            break MISSING_BLOCK_LABEL_299;
        }
        a.a.o.a();
        String.format("Clearing fully dispatched sealed session %s", new Object[] {
            bi1.a.d.toString()
        });
        a.a.o.b(a).c(bi1.a).get();
          goto _L6
        obj1;
        com.appboy.f.a.c(a.a.o.a(), "Caught exception while trying to clear sealed sessions", ((Throwable) (obj1)));
_L4:
        obj1 = ((cc) (obj)).c;
        if (obj1 != null)
        {
            o.c(a).b(obj1);
        }
        obj = ((cc) (obj)).b;
        if (obj != null)
        {
            o.d(a).b(obj);
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
        a.a.o.b(a).a(bi1.a);
          goto _L6
    }
}
