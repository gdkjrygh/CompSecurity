// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.X;

// Referenced classes of package rx.internal.a:
//            g, cy

final class cz extends X
{

    final X a;
    final cy b;
    private final g c = g.a();
    private final Deque d = new ArrayDeque();

    cz(cy cy1, X x, X x1)
    {
        b = cy1;
        a = x1;
        super(x);
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
        if (b.a == 0)
        {
            a.onNext(obj);
            return;
        }
        if (d.size() == b.a)
        {
            a.onNext(g.e(d.removeFirst()));
        } else
        {
            request(1L);
        }
        d.offerLast(g.a(obj));
    }
}
