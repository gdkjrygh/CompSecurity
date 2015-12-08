// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.X;
import rx.b;

// Referenced classes of package rx.internal.a:
//            bc, be, bd

final class bb
    implements rx.b.f
{

    final aY.a.a a;
    final Object b;
    final aY.a c;

    bb(aY.a a1, aY.a.a a2, Object obj)
    {
        c = a1;
        a = a2;
        b = obj;
        super();
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        ((X) (obj)).setProducer(new bc(this));
        AtomicBoolean atomicboolean = new AtomicBoolean();
        a.a.doOnUnsubscribe(new be(this, atomicboolean)).unsafeSubscribe(new bd(this, ((X) (obj)), ((X) (obj)), atomicboolean));
    }
}
