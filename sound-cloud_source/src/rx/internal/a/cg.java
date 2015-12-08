// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Q;
import rx.X;
import rx.b.g;
import rx.internal.b.a;

// Referenced classes of package rx.internal.a:
//            cf

final class cg extends X
{

    boolean a;
    final rx.b.a b;
    final cf c;

    cg(cf cf1, rx.b.a a1)
    {
        c = cf1;
        b = a1;
        super();
    }

    public final void onCompleted()
    {
        if (!a)
        {
            a = true;
            c.b.a.onCompleted();
        }
    }

    public final void onError(Throwable throwable)
    {
label0:
        {
            if (!a)
            {
                a = true;
                if (!((Boolean)c.b.b.call(Integer.valueOf(c.b.f), throwable)).booleanValue() || c.b.c.isUnsubscribed())
                {
                    break label0;
                }
                c.b.c.a(b);
            }
            return;
        }
        c.b.a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        if (!a)
        {
            c.b.a.onNext(obj);
            c.b.e.a();
        }
    }

    public final void setProducer(Q q)
    {
        c.b.e.a(q);
    }
}
