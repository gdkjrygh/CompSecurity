// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import rx.X;
import rx.b;
import rx.b.f;
import rx.g.c;

// Referenced classes of package com.soundcloud.rx:
//            Pager

private final class inner extends X
{

    private final X inner;
    final Pager this$0;

    public final void onCompleted()
    {
        inner.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        inner.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        Pager.access$202(Pager.this, (b)Pager.access$300(Pager.this).call(obj));
        inner.onNext(Pager.access$400(Pager.this).call(obj));
        if (Pager.access$200(Pager.this) == Pager.access$500())
        {
            Pager.access$000(Pager.this).onCompleted();
        }
    }

    public (X x)
    {
        this$0 = Pager.this;
        super();
        inner = x;
    }
}
