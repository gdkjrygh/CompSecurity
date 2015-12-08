// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.c;

import java.util.Map;

// Referenced classes of package com.samsung.multiscreen.c:
//            a, c

final class b
    implements Runnable
{

    final Runnable a;
    final c b;
    final a c;

    b(a a1, Runnable runnable, c c1)
    {
        c = a1;
        a = runnable;
        b = c1;
        super();
    }

    public final void run()
    {
        a.run();
        com.samsung.multiscreen.c.a.a(c).remove(b);
        return;
        Exception exception;
        exception;
        com.samsung.multiscreen.c.a.a(c).remove(b);
        throw exception;
    }
}
