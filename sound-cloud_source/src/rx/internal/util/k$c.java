// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.util:
//            k

static final class <init>
    implements a
{

    private final X a;
    private final Object b;

    public final void call()
    {
        try
        {
            a.onNext(b);
        }
        catch (Throwable throwable)
        {
            a.onError(throwable);
            return;
        }
        a.onCompleted();
    }

    private (X x, Object obj)
    {
        a = x;
        b = obj;
    }

    b(X x, Object obj, byte byte0)
    {
        this(x, obj);
    }
}
