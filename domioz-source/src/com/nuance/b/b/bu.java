// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.b:
//            fr, bc, bm, bp

final class bu
    implements Runnable
{

    private final bm a;
    private final CountDownLatch b;

    public bu(bm bm1, CountDownLatch countdownlatch)
    {
        a = bm1;
        b = countdownlatch;
    }

    public final void run()
    {
        fr.e("Creating raw recorder");
        bm.a(a, new bc(bm.a(a), new bp(a)));
        long l = a.n().b();
        fr.e((new StringBuilder("Creating recorder pipes: ")).append(l).toString());
        com.nuance.b.b.bm.b(a);
        fr.e((new StringBuilder("Calling RecorderSource.startRecording: ")).append(l).toString());
        bm.c(a).h();
        fr.c((new StringBuilder("Recording started: ")).append(l).toString());
        b.countDown();
    }
}
