// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import b.a.a.a.o;

// Referenced classes of package com.a.a.c:
//            r

final class s
    implements Runnable
{

    final Runnable a;
    final r b;

    s(r r, Runnable runnable)
    {
        b = r;
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
            d.c().b("Fabric", "Failed to execute task.", exception);
        }
    }
}
