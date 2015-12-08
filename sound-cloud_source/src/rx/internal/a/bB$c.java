// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;

// Referenced classes of package rx.internal.a:
//            bB

static final class <init> extends X
{

    private final request a;

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

    public final void onStart()
    {
        request(0L);
    }

    private ( )
    {
        a = ;
    }

    a(a a1, byte byte0)
    {
        this(a1);
    }
}
