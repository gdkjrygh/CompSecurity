// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.a;

import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.onlineid.a:
//            c

public final class g
    implements c
{

    private final com.google.android.gms.analytics.g a;
    private final com.google.android.gms.analytics.d.f b = new com.google.android.gms.analytics.d.f();
    private long c;

    g(com.google.android.gms.analytics.g g1, String s, String s1, String s2)
    {
        c = -1L;
        boolean flag;
        if (s != null && s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        a = g1;
        b.b(s);
        b.a(s1);
        if (s2 != null)
        {
            b.c(s2);
        }
    }

    public final c a()
    {
        c = System.nanoTime();
        return this;
    }

    public final void b()
    {
        if (c != -1L)
        {
            long l = System.nanoTime();
            long l1 = c;
            l = TimeUnit.MILLISECONDS.convert(l - l1, TimeUnit.NANOSECONDS);
            b.a(l);
            java.util.Map map = b.a();
            a.a(map);
            return;
        } else
        {
            d.c("TimedAnalyticsEvent.end() called before start().");
            return;
        }
    }
}
