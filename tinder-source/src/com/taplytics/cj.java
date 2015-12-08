// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.taplytics.a.i;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.taplytics:
//            z, ag, ci

public final class cj
    implements i
{

    final Map a = null;
    final ci b;

    public cj(ci ci)
    {
        b = ci;
        super();
    }

    public final void a(Map map)
    {
        z z1 = z.a();
        Object obj;
        if (a == null)
        {
            obj = null;
        } else
        {
            obj = a.get("gaTracker");
        }
        Executors.newSingleThreadScheduledExecutor().schedule(new ag(z1, map, obj), 5000L, TimeUnit.MILLISECONDS);
    }
}
