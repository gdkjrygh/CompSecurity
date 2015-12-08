// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//            ee, dv, bm, cm, 
//            du, dz, dw, dy, 
//            dx, ci

public final class dt
    implements ee
{

    final ee a;
    private final bm b;

    public dt(ee ee1, bm bm1)
    {
        a = ee1;
        b = bm1;
    }

    public final cm a()
    {
        this;
        JVM INSTR monitorenter ;
        cm cm1 = (cm)b.submit(new dv(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return cm1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored open sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(cm cm1)
    {
        this;
        JVM INSTR monitorenter ;
        b.execute(new du(this, cm1));
        this;
        JVM INSTR monitorexit ;
        return;
        cm1;
        throw cm1;
    }

    public final void a(cm cm1, ci ci)
    {
        b.execute(new dz(this, cm1, ci));
    }

    public final cm b()
    {
        this;
        JVM INSTR monitorenter ;
        cm cm1 = (cm)b.submit(new dw(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return cm1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored closed sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b(cm cm1)
    {
        this;
        JVM INSTR monitorenter ;
        c(cm1);
        this;
        JVM INSTR monitorexit ;
        return;
        cm1;
        throw cm1;
    }

    public final Collection c()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = (Collection)b.submit(new dy(this)).get(5000L, TimeUnit.MILLISECONDS);
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

    public final Future c(cm cm1)
    {
        this;
        JVM INSTR monitorenter ;
        cm1 = b.submit(new dx(this, cm1));
        this;
        JVM INSTR monitorexit ;
        return cm1;
        cm1;
        throw cm1;
    }
}
