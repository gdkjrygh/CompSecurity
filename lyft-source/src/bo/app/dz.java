// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//            ek, eb, bs, cs, 
//            ea, ef, ec, ee, 
//            ed, co

public final class dz
    implements ek
{

    final ek a;
    private final bs b;

    public dz(ek ek1, bs bs1)
    {
        a = ek1;
        b = bs1;
    }

    public final cs a()
    {
        this;
        JVM INSTR monitorenter ;
        cs cs1 = (cs)b.submit(new eb(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return cs1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored open sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        b.execute(new ea(this, cs1));
        this;
        JVM INSTR monitorexit ;
        return;
        cs1;
        throw cs1;
    }

    public final void a(cs cs1, co co)
    {
        b.execute(new ef(this, cs1, co));
    }

    public final cs b()
    {
        this;
        JVM INSTR monitorenter ;
        cs cs1 = (cs)b.submit(new ec(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return cs1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored closed sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        c(cs1);
        this;
        JVM INSTR monitorexit ;
        return;
        cs1;
        throw cs1;
    }

    public final Collection c()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = (Collection)b.submit(new ee(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return collection;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get sealed sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Future c(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        cs1 = b.submit(new ed(this, cs1));
        this;
        JVM INSTR monitorexit ;
        return cs1;
        cs1;
        throw cs1;
    }
}
