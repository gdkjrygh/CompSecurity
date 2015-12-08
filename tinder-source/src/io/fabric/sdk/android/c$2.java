// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//            f, c

final class b
    implements f
{

    final CountDownLatch a;
    final int b;
    final c c;

    public final void a()
    {
        a.countDown();
        if (a.getCount() == 0L)
        {
            io.fabric.sdk.android.c.a(c).set(true);
            io.fabric.sdk.android.c.b(c).a();
        }
    }

    public final void a(Exception exception)
    {
        io.fabric.sdk.android.c.b(c).a(exception);
    }

    DownLatch(c c1, int i)
    {
        c = c1;
        b = i;
        super();
        a = new CountDownLatch(b);
    }
}
