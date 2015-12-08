// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.List;
import rx.X;
import rx.b;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            b, dX, dZ

final class dY extends X
{

    final dX.b a;
    final dX b;

    dY(dX dx, dX.b b1)
    {
        b = dx;
        a = b1;
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
        dX.b b1;
        Object obj1;
label0:
        {
            b1 = a;
            obj1 = rx.internal.a.b.a();
            obj1 = new dX.a(((rx.P) (obj1)), ((b) (obj1)));
            synchronized (b1.c)
            {
                if (!b1.e)
                {
                    break label0;
                }
            }
            return;
        }
        b1.d.add(obj1);
        obj2;
        JVM INSTR monitorexit ;
        b1.a.onNext(((dX.a) (obj1)).b);
        try
        {
            obj = (b)b1.f.b.call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b1.onError(((Throwable) (obj)));
            return;
        }
        obj1 = new dZ(b1, ((dX.a) (obj1)));
        b1.b.a(((rx.Y) (obj1)));
        ((b) (obj)).unsafeSubscribe(((X) (obj1)));
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
