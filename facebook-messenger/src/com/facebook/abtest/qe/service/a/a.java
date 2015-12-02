// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.a;

import android.os.Bundle;
import com.facebook.abtest.qe.service.module.QuickExperimentQueue;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.prefs.shared.d;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.service.a:
//            c

public class a extends com.facebook.backgroundtasks.a
{

    private static Class a = com/facebook/abtest/qe/service/a/a;
    private final javax.inject.a b;
    private final d c;
    private final k d;
    private final com.facebook.abtest.qe.g.a e;
    private final com.facebook.common.time.a f;
    private final javax.inject.a g;

    public a(javax.inject.a a1, d d1, k k1, com.facebook.abtest.qe.g.a a2, com.facebook.common.time.a a3, javax.inject.a a4)
    {
        super("SYNC_QUICK_EXPERIMENT");
        b = a1;
        c = d1;
        d = k1;
        e = a2;
        f = a3;
        g = a4;
    }

    static Class d()
    {
        return a;
    }

    public Set a()
    {
        return fi.b(com/facebook/abtest/qe/service/module/QuickExperimentQueue);
    }

    public boolean b()
    {
        long l = f.a();
        long l1 = c.a(com.facebook.abtest.qe.data.a.b, 0L);
        long l2 = c.a(com.facebook.abtest.qe.data.a.d, 0L);
        String s = e.a();
        String s1 = c.a(com.facebook.abtest.qe.data.a.c, s);
        if (b.b() != null)
        {
            if (((Boolean)g.b()).booleanValue() && l1 < l2)
            {
                return true;
            }
            if (l - l1 > 0xdbba00L)
            {
                return true;
            }
            if (!s1.equals(s))
            {
                return true;
            }
        }
        return false;
    }

    public s c()
    {
        com.facebook.debug.log.b.c(a, "Starting fetch");
        com.facebook.fbservice.ops.n n = d.a(com.facebook.abtest.qe.service.a.a, new Bundle()).a();
        c c1 = new c(null);
        i.a(n, c1);
        return c1;
    }

}
