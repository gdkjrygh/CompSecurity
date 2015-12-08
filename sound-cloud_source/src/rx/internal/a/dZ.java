// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import java.util.List;
import rx.P;
import rx.X;
import rx.h.b;

final class dZ extends X
{

    boolean a;
    final dX.a b;
    final dX.b c;

    dZ(dX.b b1, dX.a a1)
    {
        c = b1;
        b = a1;
        super();
        a = true;
    }

    public final void onCompleted()
    {
        if (!a) goto _L2; else goto _L1
_L1:
        dX.a a1;
        Object obj1;
        a = false;
        obj1 = c;
        a1 = b;
        Object obj = ((dX.b) (obj1)).c;
        obj;
        JVM INSTR monitorenter ;
        if (!((dX.b) (obj1)).e) goto _L4; else goto _L3
_L3:
        c.b.b(this);
_L2:
        return;
_L4:
        obj1 = ((dX.b) (obj1)).d.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_115;
            }
        } while ((dX.a)((Iterator) (obj1)).next() != a1);
        boolean flag = true;
        ((Iterator) (obj1)).remove();
_L5:
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a1.a.onCompleted();
        }
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L5
    }

    public final void onError(Throwable throwable)
    {
    }

    public final void onNext(Object obj)
    {
        onCompleted();
    }
}
