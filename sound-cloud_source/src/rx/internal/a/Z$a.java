// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.List;
import rx.X;

// Referenced classes of package rx.internal.a:
//            Z

final class t extends X
{

    final X a;
    List b;
    boolean c;
    final Z d;

    public final void onCompleted()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        List list;
        c = true;
        list = b;
        b = null;
        this;
        JVM INSTR monitorexit ;
        a.onNext(list);
        a.onCompleted();
        unsubscribe();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Throwable throwable)
        {
            a.onError(throwable);
        }
        return;
    }

    public final void onError(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        b = null;
        this;
        JVM INSTR monitorexit ;
        a.onError(throwable);
        unsubscribe();
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public final void onNext(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public e(Z z, X x)
    {
        d = z;
        super();
        a = x;
        b = new ArrayList(z.b);
    }
}
