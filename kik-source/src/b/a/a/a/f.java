// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package b.a.a.a:
//            i, d

final class f
    implements i
{

    final CountDownLatch a;
    final int b;
    final d c;

    f(d d1, int j)
    {
        c = d1;
        b = j;
        super();
        a = new CountDownLatch(b);
    }

    public final void a()
    {
        a.countDown();
        if (a.getCount() == 0L)
        {
            d.a(c).set(true);
            d.b(c).a();
        }
    }

    public final void a(Exception exception)
    {
        d.b(c).a(exception);
    }
}
