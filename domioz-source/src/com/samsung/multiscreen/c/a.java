// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.samsung.multiscreen.c:
//            b, c

public final class a
{

    private final ScheduledExecutorService a = Executors.newScheduledThreadPool(2);
    private final Map b = new ConcurrentHashMap();

    public a()
    {
    }

    static Map a(a a1)
    {
        return a1.b;
    }

    public final void a(c c, Runnable runnable, long l, TimeUnit timeunit)
    {
        runnable = a.schedule(new b(this, runnable, c), l, timeunit);
        b.put(c, runnable);
    }
}
