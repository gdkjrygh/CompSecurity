// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import p.dd.an;
import p.df.a;

// Referenced classes of package com.pandora.android.countdown:
//            e, b, a, d

private class <init>
{

    final e a;

    public void onCountdownBarData(b b1)
    {
        if (b1 == null || b1.a == null)
        {
            return;
        }
        b[b1.b.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 198;
           goto _L1 _L2 _L3
_L1:
        p.df.a.a("CountdownBarManager", (new StringBuilder()).append("onCountdownBarData: ").append(com.pandora.android.countdown.e.a(a)).toString());
        return;
_L2:
        if (com.pandora.android.countdown.e.a(a) == null || com.pandora.android.countdown.e.a(a).b().equals(b1.a.b()))
        {
            com.pandora.android.countdown.e.a(a, b1.a);
            b1 = new d(b1.b, com.pandora.android.countdown.e.a(a));
            a.a(b1);
        } else
        if (e.b(a) == null || e.b(a).b().equals(b1.a.b()))
        {
            e.b(a, b1.a);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (com.pandora.android.countdown.e.a(a) != null && com.pandora.android.countdown.e.a(a).b().equals(b1.a.b()))
        {
            b1 = new d(b1.b, com.pandora.android.countdown.e.a(a));
            a.a(b1);
            if (e.b(a) != null && e.b(a).h())
            {
                com.pandora.android.countdown.e.a(a, e.b(a));
                b1 = new d(b, com.pandora.android.countdown.e.a(a));
                a.a(b1);
                e.b(a, null);
            } else
            {
                com.pandora.android.countdown.e.a(a, null);
                e.b(a, null);
            }
        } else
        if (e.b(a) != null && e.b(a).b().equals(b1.a.b()))
        {
            e.b(a, null);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onSignInState(an an1)
    {
        switch (com.pandora.android.countdown.a[an1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.pandora.android.countdown.e.a(a, null);
            break;
        }
        e.b(a, null);
    }

    public d produceCountdownBarUpdateEvent()
    {
        p.df.a.a("CountdownBarManager", (new StringBuilder()).append("produceCountdownBarUpdateEvent - ").append(com.pandora.android.countdown.e.a(a)).toString());
        com.pandora.android.countdown.a a2 = e.c(a);
        a a1 = com.pandora.android.countdown.a;
        if (a2 != null)
        {
            if (a2.h())
            {
                a1 = b;
            } else
            {
                a1 = c;
            }
        }
        return new d(a1, a2);
    }

    private (e e1)
    {
        a = e1;
        super();
    }

    a(e e1, a a1)
    {
        this(e1);
    }
}
