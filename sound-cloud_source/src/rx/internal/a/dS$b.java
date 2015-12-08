// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            dS, b

final class a extends X
{

    final X a;
    int b;
    b c;
    volatile boolean d;
    final dS e;

    public final void onCompleted()
    {
        if (c != null)
        {
            c.onCompleted();
        }
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        if (c != null)
        {
            c.onError(throwable);
        }
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (c == null)
        {
            d = false;
            c = rx.internal.a.b.a();
            a.onNext(c);
        }
        c.onNext(obj);
        int i = b + 1;
        b = i;
        if (i % e.a == 0)
        {
            c.onCompleted();
            c = null;
            d = true;
            if (a.isUnsubscribed())
            {
                unsubscribe();
            }
        }
    }

    public (dS ds, X x)
    {
        e = ds;
        super();
        d = true;
        a = x;
    }
}
