// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;

// Referenced classes of package com.miteksystems.misnap:
//            u

final class ak
    implements Runnable
{

    final u a;

    ak(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        long l = System.currentTimeMillis() - u.r(a);
        u.m(a).postDelayed(u.s(a), 70L);
        u.t(a);
        float f = Math.abs((float)Math.abs(300L - l) / 300F);
        if (l < 600L)
        {
            u.a(a, u.a(a, u.u(a), 1.0F - (1.0F - f) * 0.1F));
            a.postInvalidate();
            return;
        } else
        {
            u.m(a).removeCallbacks(u.s(a));
            u.a(a, u.a(a, u.u(a), 1.0F));
            a.postInvalidate();
            u.v(a);
            return;
        }
    }
}
