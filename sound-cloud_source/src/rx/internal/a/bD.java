// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.b;
import rx.b.f;
import rx.e.d;
import rx.exceptions.Exceptions;
import rx.h.e;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            bE, bC

final class bD extends X
{

    final X a;
    final a b;
    final e c;
    final bC d;
    private boolean e;

    bD(bC bc, X x, a a1, e e1)
    {
        d = bc;
        a = x;
        b = a1;
        c = e1;
        super();
        e = false;
    }

    public final void onCompleted()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            a.onCompleted();
            return;
        }
    }

    public final void onError(Throwable throwable)
    {
        if (e)
        {
            Exceptions.throwIfFatal(throwable);
            return;
        }
        e = true;
        try
        {
            rx.e.d.a().b();
            unsubscribe();
            bE be = new bE(this);
            c.a(be);
            ((b)d.a.call(throwable)).unsafeSubscribe(be);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            a.onError(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        if (e)
        {
            return;
        } else
        {
            a.onNext(obj);
            return;
        }
    }

    public final void setProducer(Q q)
    {
        b.a(q);
    }
}
