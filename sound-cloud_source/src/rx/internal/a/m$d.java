// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.o;

// Referenced classes of package rx.internal.a:
//            m

static final class b extends X
{

    private final X a;
    private final o b;

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
        a.onNext(b.a(new Object[] {
            obj
        }));
    }

    e(X x, o o1)
    {
        super(x);
        a = x;
        b = o1;
    }
}
