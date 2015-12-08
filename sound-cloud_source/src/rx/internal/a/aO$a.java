// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            aO

private static final class <init> extends X
{

    private final X a;

    static void a(<init> <init>1, long l)
    {
        <init>1.request(l);
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
        a.onNext(obj);
    }

    private (X x)
    {
        a = x;
    }

    a(X x, byte byte0)
    {
        this(x);
    }
}
