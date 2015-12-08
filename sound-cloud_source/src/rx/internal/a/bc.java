// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.Q;

// Referenced classes of package rx.internal.a:
//            bb, a

final class bc
    implements Q
{

    final bb a;

    bc(bb bb1)
    {
        a = bb1;
        super();
    }

    public final void a(long l)
    {
        aY.a a1 = a.c;
        aY.a.a a2 = a.a;
        rx.internal.a.a.a(a2.b, l);
        if (a2.c.getAndIncrement() == 0L)
        {
            a1.a(a2);
        }
    }
}
