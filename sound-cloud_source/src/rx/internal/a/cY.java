// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Deque;
import rx.X;

// Referenced classes of package rx.internal.a:
//            g, el, cX

final class cY extends X
{

    final Deque a;
    final g b;
    final el c;
    final X d;
    final cX e;

    cY(cX cx, X x, Deque deque, g g1, el el1, X x1)
    {
        e = cx;
        a = deque;
        b = g1;
        c = el1;
        d = x1;
        super(x);
    }

    public final void onCompleted()
    {
        a.offer(g.b());
        c.a();
    }

    public final void onError(Throwable throwable)
    {
        a.clear();
        d.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (e.a == 0)
        {
            return;
        }
        if (a.size() == e.a)
        {
            a.removeFirst();
        }
        a.offerLast(g.a(obj));
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
