// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Deque;
import rx.X;

// Referenced classes of package rx.internal.a:
//            db, g, el

final class dc extends X
{

    final Deque a;
    final Deque b;
    final g c;
    final X d;
    final el e;
    final db f;

    dc(db db1, X x, Deque deque, Deque deque1, g g1, X x1, el el1)
    {
        f = db1;
        a = deque;
        b = deque1;
        c = g1;
        d = x1;
        e = el1;
        super(x);
    }

    private void a(long l)
    {
        for (; f.b >= 0 && a.size() > f.b; a.pollFirst())
        {
            b.pollFirst();
        }

        for (; !a.isEmpty() && ((Long)b.peekFirst()).longValue() < l - f.a; a.pollFirst())
        {
            b.pollFirst();
        }

    }

    public final void onCompleted()
    {
        a(System.currentTimeMillis());
        b.clear();
        a.offer(g.b());
        e.a();
    }

    public final void onError(Throwable throwable)
    {
        b.clear();
        a.clear();
        d.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        long l = System.currentTimeMillis();
        b.add(Long.valueOf(l));
        a.add(g.a(obj));
        a(l);
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }
}
