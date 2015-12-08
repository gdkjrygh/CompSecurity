// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.g;

// Referenced classes of package rx.internal.a:
//            cI

final class cJ extends X
{

    boolean a;
    int b;
    final X c;
    final cI d;

    cJ(cI ci, X x, X x1)
    {
        d = ci;
        c = x1;
        super(x);
        a = true;
    }

    public final void onCompleted()
    {
        c.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        c.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (!a)
        {
            c.onNext(obj);
            return;
        }
        g g1 = d.a;
        int i = b;
        b = i + 1;
        if (!((Boolean)g1.call(obj, Integer.valueOf(i))).booleanValue())
        {
            a = false;
            c.onNext(obj);
            return;
        } else
        {
            request(1L);
            return;
        }
    }
}
