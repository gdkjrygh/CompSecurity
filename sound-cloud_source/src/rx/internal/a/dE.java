// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Map;
import rx.X;
import rx.b.e;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            dD

final class dE extends X
{

    final X a;
    final dD b;
    private Map c;

    dE(dD dd, X x, X x1)
    {
        b = dd;
        a = x1;
        super(x);
        c = (Map)b.c.call();
    }

    public final void onCompleted()
    {
        Map map = c;
        c = null;
        a.onNext(map);
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        c = null;
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        Object obj1 = b.a.call(obj);
        obj = b.b.call(obj);
        c.put(obj1, obj);
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
