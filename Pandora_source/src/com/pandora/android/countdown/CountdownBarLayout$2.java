// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import android.os.Handler;
import p.df.a;

// Referenced classes of package com.pandora.android.countdown:
//            CountdownBarLayout, a

class a
    implements Runnable
{

    final CountdownBarLayout a;

    public void run()
    {
        if (com.pandora.android.countdown.CountdownBarLayout.a(a) == null)
        {
            com.pandora.android.countdown.CountdownBarLayout.a(a, null);
            return;
        }
        long l1 = com.pandora.android.countdown.CountdownBarLayout.a(a).g();
        p.df.a.a("CountdownBarLayout", (new StringBuilder()).append("countdownTimer secondsRemaining: ").append(l1).toString());
        long l = l1;
        if (l1 <= 0L)
        {
            l = 0L;
        }
        com.pandora.android.countdown.CountdownBarLayout.a(a, CountdownBarLayout.b(a));
        CountdownBarLayout.b(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
        if (l > 0L)
        {
            CountdownBarLayout.d(a).postDelayed(CountdownBarLayout.c(a), com.pandora.android.countdown.CountdownBarLayout.a(a, l));
            return;
        } else
        {
            p.df.a.a("CountdownBarLayout", "countdownTimer.run -> done");
            com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
            return;
        }
    }

    (CountdownBarLayout countdownbarlayout)
    {
        a = countdownbarlayout;
        super();
    }
}
