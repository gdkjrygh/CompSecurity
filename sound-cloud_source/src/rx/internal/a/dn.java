// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            dm

final class dn extends X
{

    final X a;
    final dm b;
    private long c;

    dn(dm dm1, X x, X x1)
    {
        b = dm1;
        a = x1;
        super(x);
        c = 0L;
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
        long l = System.currentTimeMillis();
        if (c == 0L || l - c >= b.a)
        {
            c = l;
            a.onNext(obj);
        }
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
