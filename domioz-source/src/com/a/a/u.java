// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.f;
import b.a.a.a.q;

// Referenced classes of package com.a.a:
//            t

final class u
    implements Runnable
{

    final Runnable a;
    final t b;

    u(t t, Runnable runnable)
    {
        b = t;
        a = runnable;
        super();
    }

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            f.c().c("Fabric", "Failed to execute task.", exception);
        }
    }
}
