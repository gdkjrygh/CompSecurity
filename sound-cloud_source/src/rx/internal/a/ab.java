// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import rx.X;

// Referenced classes of package rx.internal.a:
//            Z

final class ab extends X
{

    final Z.a a;
    final Z b;

    ab(Z z, Z.a a1)
    {
        b = z;
        a = a1;
        super();
    }

    public final void onCompleted()
    {
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
label0:
        {
            synchronized (a)
            {
                if (!((Z.a) (obj)).c)
                {
                    break label0;
                }
            }
            return;
        }
        java.util.List list;
        list = ((Z.a) (obj)).b;
        obj.b = new ArrayList(((Z.a) (obj)).d.b);
        obj;
        JVM INSTR monitorexit ;
        ((Z.a) (obj)).a.onNext(list);
        return;
        obj1;
        ((Z.a) (obj)).unsubscribe();
        obj;
        JVM INSTR monitorenter ;
        if (!((Z.a) (obj)).c)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj.c = true;
        obj;
        JVM INSTR monitorexit ;
        ((Z.a) (obj)).a.onError(((Throwable) (obj1)));
        return;
    }
}
