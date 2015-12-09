// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import android.os.Handler;

// Referenced classes of package com.pandora.android.countdown:
//            CountdownBarLayout, a

private class <init>
    implements Runnable
{

    final CountdownBarLayout a;
    private int b;

    public void run()
    {
        int i = CountdownBarLayout.i(a);
        if (b >= i)
        {
            CountdownBarLayout.d(a).postDelayed(CountdownBarLayout.c(a), CountdownBarLayout.a(a, CountdownBarLayout.a(a).g()));
            return;
        } else
        {
            b = b + 3;
            CountdownBarLayout.a(a, CountdownBarLayout.b(a), b);
            CountdownBarLayout.d(a).postDelayed(CountdownBarLayout.j(a), 5L);
            return;
        }
    }

    private (CountdownBarLayout countdownbarlayout)
    {
        a = countdownbarlayout;
        super();
        b = 0;
    }

    b(CountdownBarLayout countdownbarlayout, b b1)
    {
        this(countdownbarlayout);
    }
}
