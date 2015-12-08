// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            bb

final class be
    implements a
{

    final AtomicBoolean a;
    final bb b;

    be(bb bb1, AtomicBoolean atomicboolean)
    {
        b = bb1;
        a = atomicboolean;
        super();
    }

    public final void call()
    {
        if (a.compareAndSet(false, true))
        {
            rx.internal.a.aY.a.a(b.c, b.b);
        }
    }
}
