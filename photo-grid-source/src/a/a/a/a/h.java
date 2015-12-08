// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package a.a.a.a:
//            l, f

final class h
    implements l
{

    final CountDownLatch a;
    final int b;
    final f c;

    h(f f1, int i)
    {
        c = f1;
        b = i;
        super();
        a = new CountDownLatch(b);
    }

    public final void a()
    {
        a.countDown();
        if (a.getCount() == 0L)
        {
            f.a(c).set(true);
            f.b(c).a();
        }
    }

    public final void a(Exception exception)
    {
        f.b(c).a(exception);
    }
}
