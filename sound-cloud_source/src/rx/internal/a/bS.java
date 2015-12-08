// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.b.a;

final class bS
    implements a
{

    final bO.b a;

    bS(bO.b b)
    {
        a = b;
        super();
    }

    public final void call()
    {
        a.g.getAndSet(bO.b.f);
        a.c.compareAndSet(a, null);
    }
}
