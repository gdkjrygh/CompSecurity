// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.a;

// Referenced classes of package rx:
//            P, b

final class f
    implements P
{

    final a a;
    final b b;

    f(b b1, a a1)
    {
        b = b1;
        a = a1;
        super();
    }

    public final void onCompleted()
    {
        a.call();
    }

    public final void onError(Throwable throwable)
    {
        a.call();
    }

    public final void onNext(Object obj)
    {
    }
}
