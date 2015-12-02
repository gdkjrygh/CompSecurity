// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import android.os.Bundle;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.a;
import com.facebook.backgroundtasks.r;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.config.background:
//            h, f, j

public class i extends a
{

    private static Class a = com/facebook/config/background/i;
    private final b b;
    private final d c;
    private final k d;
    private final javax.inject.a e;
    private final com.facebook.common.time.a f;

    public i(b b1, d d1, k k1, javax.inject.a a1, com.facebook.common.time.a a2)
    {
        super("CONFIGURATION");
        b = b1;
        c = d1;
        d = k1;
        e = a1;
        f = a2;
    }

    static com.facebook.common.time.a a(i l)
    {
        return l.f;
    }

    static d b(i l)
    {
        return l.c;
    }

    public boolean b()
    {
        long l;
        if (b.b())
        {
            if ((l = f.a()) - c.a(com.facebook.config.background.h.a, 0L) >= 0xdbba0L)
            {
                boolean flag;
                if (l - c.a(com.facebook.config.background.h.b, 0L) >= ((Long)e.b()).longValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public s c()
    {
        com.facebook.debug.log.b.c(a, "Starting fetch");
        c.b().a(com.facebook.config.background.h.a, f.a()).a();
        com.facebook.fbservice.ops.n n = d.a(com.facebook.config.background.f.a, new Bundle()).a();
        com.google.common.d.a.i.a(n, new j(this));
        r r1 = new r(a);
        com.google.common.d.a.i.a(n, r1);
        return r1;
    }

}
