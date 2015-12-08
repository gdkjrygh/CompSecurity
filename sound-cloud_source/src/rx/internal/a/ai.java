// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.List;
import rx.X;
import rx.b;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            ah, aj

final class ai extends X
{

    final ah.a a;
    final ah b;

    ai(ah ah1, ah.a a1)
    {
        b = ah1;
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
        ah.a a1 = a;
        Object obj1 = new ArrayList();
        a1;
        JVM INSTR monitorenter ;
        if (!a1.c)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        a1;
        JVM INSTR monitorexit ;
        return;
        a1.b.add(obj1);
        a1;
        JVM INSTR monitorexit ;
        try
        {
            obj = (b)a1.e.b.call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a1.onError(((Throwable) (obj)));
            return;
        }
        obj1 = new aj(a1, ((List) (obj1)));
        a1.d.a(((rx.Y) (obj1)));
        ((b) (obj)).unsafeSubscribe(((X) (obj1)));
        return;
        obj;
        a1;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
