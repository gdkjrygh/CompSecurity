// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package a.a:
//            dd, ct, ao, bn, 
//            cs, cx, cu, cw, 
//            cv, bj

public class cr
    implements dd
{

    private static final String a;
    private final dd b;
    private final ao c;

    public cr(dd dd1, ao ao1)
    {
        b = dd1;
        c = ao1;
    }

    static dd a(cr cr1)
    {
        return cr1.b;
    }

    public final bn a()
    {
        this;
        JVM INSTR monitorenter ;
        bn bn1 = (bn)c.submit(new ct(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return bn1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored open sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(bn bn1)
    {
        this;
        JVM INSTR monitorenter ;
        c.execute(new cs(this, bn1));
        this;
        JVM INSTR monitorexit ;
        return;
        bn1;
        throw bn1;
    }

    public final void a(bn bn1, bj bj)
    {
        c.execute(new cx(this, bn1, bj));
    }

    public final bn b()
    {
        this;
        JVM INSTR monitorenter ;
        bn bn1 = (bn)c.submit(new cu(this)).get(5000L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return bn1;
        Object obj;
        obj;
        throw new RuntimeException("Error while trying to asynchronously get stored closed sessions.", ((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b(bn bn1)
    {
        this;
        JVM INSTR monitorenter ;
        c(bn1);
        this;
        JVM INSTR monitorexit ;
        return;
        bn1;
        throw bn1;
    }

    public final Collection c()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = (Collection)c.submit(new cw(this)).get(5000L, TimeUnit.MILLISECONDS);
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

    public final Future c(bn bn1)
    {
        this;
        JVM INSTR monitorenter ;
        bn1 = c.submit(new cv(this, bn1));
        this;
        JVM INSTR monitorexit ;
        return bn1;
        bn1;
        throw bn1;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/cr.getName()
        });
    }
}
