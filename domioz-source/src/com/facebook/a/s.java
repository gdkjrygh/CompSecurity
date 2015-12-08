// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.os.Bundle;
import com.facebook.am;
import com.facebook.internal.ak;
import java.io.Serializable;
import java.util.Locale;

// Referenced classes of package com.facebook.a:
//            a

final class s
    implements Serializable
{

    private static final String a = com/facebook/a/a.getCanonicalName();
    private static final long b[] = {
        0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
        0x48190800L, 0x6c258c00L, 0x90321000L, 0x134fd9000L, 0x1cf7c5800L, 0x269fb2000L, 0x30479e800L, 0x39ef8b000L, 0x757b12c00L
    };
    private boolean c;
    private boolean d;
    private long e;
    private long f;
    private long g;
    private long h;
    private int i;
    private String j;

    s()
    {
        a();
    }

    private void a()
    {
        d = false;
        f = -1L;
        g = -1L;
        i = 0;
        h = 0L;
    }

    private static int b(long l)
    {
        int k;
        for (k = 0; k < b.length && b[k] < l; k++) { }
        return k;
    }

    final void a(long l)
    {
        long l1 = 0L;
        if (!d)
        {
            ak.a(am.e, a, "Suspend for inactive app");
            return;
        }
        long l2 = l - f;
        if (l2 < 0L)
        {
            ak.a(am.e, a, "Clock skew detected");
        } else
        {
            l1 = l2;
        }
        h = l1 + h;
        g = l;
        d = false;
    }

    final void a(a a1, long l, String s1)
    {
        long l2;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = true;
        if (flag || l - e > 0x493e0L)
        {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", s1);
            a1.a("fb_mobile_activate_app", bundle);
            e = l;
        }
        if (d)
        {
            ak.a(am.e, a, "Resume for active app");
            return;
        }
        Bundle bundle1;
        long l1;
        if (g != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = l - g;
        } else
        {
            l1 = 0L;
        }
        l2 = l1;
        if (l1 < 0L)
        {
            ak.a(am.e, a, "Clock skew detected");
            l2 = 0L;
        }
        if (l2 <= 60000L) goto _L2; else goto _L1
_L1:
        bundle1 = new Bundle();
        bundle1.putInt("fb_mobile_app_interruptions", i);
        bundle1.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
            Integer.valueOf(b(l2))
        }));
        bundle1.putString("fb_mobile_launch_source", j);
        a1.a("fb_mobile_deactivate_app", h / 1000L, bundle1);
        a();
_L4:
        if (i == 0)
        {
            j = s1;
        }
        f = l;
        d = true;
        return;
_L2:
        if (l2 > 1000L)
        {
            i = i + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
