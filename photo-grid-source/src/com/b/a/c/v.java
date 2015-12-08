// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import a.a.a.a.s;

// Referenced classes of package com.b.a.c:
//            u

final class v
    implements Runnable
{

    final Runnable a;
    final u b;

    v(u u, Runnable runnable)
    {
        b = u;
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
            f.d().b("CrashlyticsCore", "Failed to execute task.", exception);
        }
    }
}
