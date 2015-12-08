// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.e:
//            ad

final class ag
    implements Runnable
{

    final Runnable a;
    final AtomicReference b;
    final ad c;

    ag(ad ad, Runnable runnable, AtomicReference atomicreference)
    {
        c = ad;
        a = runnable;
        b = atomicreference;
        super();
    }

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            b.set(runtimeexception);
        }
    }
}
