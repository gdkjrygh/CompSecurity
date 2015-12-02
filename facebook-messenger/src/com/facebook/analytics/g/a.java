// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.g;

import android.util.SparseArray;
import com.facebook.analytics.am;
import com.facebook.debug.log.b;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.analytics.g:
//            c, d

public class a
{

    private static final Class a = com/facebook/analytics/g/a;
    private final com.facebook.common.time.a b;
    private final Executor c;
    private final SparseArray d = new SparseArray();
    private final c e = new c(this, null);
    private final Object f = new Object();
    private long g;

    public a(com.facebook.common.time.a a1, Executor executor)
    {
        g = 0L;
        b = a1;
        c = executor;
        g = b.a();
    }

    static Class a()
    {
        return a;
    }

    static Object a(a a1)
    {
        return a1.f;
    }

    static com.facebook.common.time.a b(a a1)
    {
        return a1.b;
    }

    private void b()
    {
        long l = b.a();
        if (l - g > 0x2bf20L)
        {
            g = l;
            c.execute(e);
        }
    }

    private void b(am am1, double d1)
    {
        com.facebook.debug.log.b.d(a, "Too many events logged for this type: %s. Current Rate: %.2f events/min. See fburl.com/12412193 for how to address this.", new Object[] {
            am1.toString(), Double.valueOf(d1)
        });
    }

    static SparseArray c(a a1)
    {
        return a1.d;
    }

    public void a(am am1)
    {
        if (am1 == null)
        {
            com.facebook.debug.log.b.d(a, "Got null event in maybeLogWarning()");
            return;
        }
        double d1 = b(am1);
        if (a(am1, d1))
        {
            b(am1, d1);
        }
        b();
    }

    boolean a(am am1, double d1)
    {
        while (am1.a("disable_throttle_warning") || d1 <= 5D) 
        {
            return false;
        }
        return true;
    }

    double b(am am1)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        d d3 = (d)d.get(am1.hashCode());
        d d2;
        d2 = d3;
        if (d3 != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        d2 = new d(am1.b());
        d.put(am1.hashCode(), d2);
        double d1 = d2.a(am1.b());
        if (d1 <= 5D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        d.remove(am1.hashCode());
        obj;
        JVM INSTR monitorexit ;
        return d1;
        am1;
        obj;
        JVM INSTR monitorexit ;
        throw am1;
    }

}
