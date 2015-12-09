// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.n;
import com.nuance.dragon.toolkit.a.s;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.nuance.b.b:
//            fr, v, gh

final class gj
    implements Runnable
{

    final n a;
    final gh b;

    gj(gh gh1, n n)
    {
        b = gh1;
        a = n;
        super();
    }

    public final void run()
    {
        try
        {
            fr.e("NMTManager createCloudServices");
            gh.a(b, s.a(v.r().c, a));
            gh.a(b).countDown();
            return;
        }
        catch (Exception exception)
        {
            fr.a((new StringBuilder("failed cloudServices ")).append(exception.toString()).toString());
        }
    }
}
