// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.b.a;
import com.nuance.dragon.toolkit.a.b.e;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.b:
//            ga, gh, fr

final class gb
    implements Runnable
{

    a a;
    final e b;
    final CountDownLatch c;
    final ga d;

    gb(ga ga1, e e, CountDownLatch countdownlatch)
    {
        d = ga1;
        b = e;
        c = countdownlatch;
        super();
        a = new a(d.f.b());
    }

    public final void run()
    {
        com.nuance.b.b.fr.e("getAudioSource posted Runnable.run()");
        com.nuance.b.b.ga.a(d, a.a(b, com.nuance.b.b.ga.a(d)));
        c.countDown();
    }
}
