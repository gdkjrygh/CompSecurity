// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Map;
import rx.X;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            u

final class a extends X
{

    final int a;
    boolean b;
    final onCompleted c;

    public final void onCompleted()
    {
        Object obj1;
        boolean flag1;
        int i;
        flag1 = false;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        b = false;
        obj1 = c;
        i = a;
        Object obj = ((a) (obj1)).a.a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (((a) (obj1)).a.a.remove(Integer.valueOf(i)) == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (!((eOf) (obj1)).eOf.eOf.isEmpty())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((eOf) (obj1)).eOf.eOf)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        ((eOf) (obj1)).eOf.eOf.onCompleted();
        ((eOf) (obj1)).eOf.eOf.unsubscribe();
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((eOf) (obj1)).eOf.eOf.b(this);
        return;
    }

    public final void onError(Throwable throwable)
    {
        c.Error(throwable);
    }

    public final void onNext(Object obj)
    {
        onCompleted();
    }

    public ( , int i)
    {
        c = ;
        super();
        b = true;
        a = i;
    }
}
