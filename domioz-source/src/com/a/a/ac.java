// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.f;
import b.a.a.a.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a:
//            z, h

final class ac
    implements Callable
{

    final z a;

    ac(z z1)
    {
        a = z1;
        super();
    }

    public final Object call()
    {
        if (!z.a(a).get())
        {
            com.a.a.c.a.d d = z.c(a).p();
            if (d != null)
            {
                z.a(a, d);
            }
            z.d(a);
            z.b(a);
            f.c().a("Fabric", "Open sessions were closed and a new session was opened.");
            return Boolean.valueOf(true);
        } else
        {
            f.c().a("Fabric", "Skipping session finalization because a crash has already occurred.");
            return Boolean.valueOf(false);
        }
    }
}
