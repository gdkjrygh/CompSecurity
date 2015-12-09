// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import com.pandora.android.provider.b;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.countdown:
//            CountdownBarLayout, d, a

private class <init>
{

    final CountdownBarLayout a;
    private boolean b;

    public void a()
    {
        if (!b)
        {
            b.a.e().c(CountdownBarLayout.h(a));
            b.a.b().b(CountdownBarLayout.h(a));
            b = true;
        }
    }

    public void b()
    {
        if (b)
        {
            b.a.e().b(CountdownBarLayout.h(a));
            b.a.b().c(CountdownBarLayout.h(a));
            b = false;
        }
    }

    public void onCountdownBarUpdate(d d1)
    {
        Object obj = a;
        CountdownBarLayout countdownbarlayout;
        boolean flag;
        if (d1.b == com.pandora.android.countdown.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.pandora.android.countdown.CountdownBarLayout.a(((CountdownBarLayout) (obj)), flag);
        countdownbarlayout = a;
        if (CountdownBarLayout.e(a))
        {
            obj = d1.a;
        } else
        {
            obj = null;
        }
        com.pandora.android.countdown.CountdownBarLayout.c(countdownbarlayout, ((com.pandora.android.countdown.a) (obj)));
        p.df.a.a("CountdownBarLayout", (new StringBuilder()).append("onCountdownBarDataAppEvent. activeCountdown = ").append(CountdownBarLayout.e(a)).append("; countdownBarData = ").append(com.pandora.android.countdown.CountdownBarLayout.a(a)).toString());
        com.pandora.android.countdown.a[d1.b.a()];
        JVM INSTR tableswitch 1 3: default 132
    //                   1 167
    //                   2 302
    //                   3 260;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException(String.format("State: %s is not supported", new Object[] {
            d1.b
        }));
_L2:
        if (!CountdownBarLayout.e(a) || com.pandora.android.countdown.CountdownBarLayout.a(a) == null || !com.pandora.android.countdown.CountdownBarLayout.a(a).h()) goto _L6; else goto _L5
_L5:
        if ((com.pandora.android.countdown.CountdownBarLayout.a(a).a() & CountdownBarLayout.f(a)) != CountdownBarLayout.f(a) && (com.pandora.android.countdown.CountdownBarLayout.a(a).a() & 0xf) != 15) goto _L8; else goto _L7
_L7:
        CountdownBarLayout.d(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
_L4:
        return;
_L8:
        com.pandora.android.countdown.CountdownBarLayout.c(a, null);
        com.pandora.android.countdown.CountdownBarLayout.a(a, false);
        CountdownBarLayout.g(a);
        return;
_L6:
        com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
        return;
_L3:
        com.pandora.android.countdown.CountdownBarLayout.a(a, d1.a);
        return;
    }

    private (CountdownBarLayout countdownbarlayout)
    {
        a = countdownbarlayout;
        super();
    }

    a(CountdownBarLayout countdownbarlayout, a a1)
    {
        this(countdownbarlayout);
    }
}
