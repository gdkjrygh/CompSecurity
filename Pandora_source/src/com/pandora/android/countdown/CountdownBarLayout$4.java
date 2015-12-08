// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;


// Referenced classes of package com.pandora.android.countdown:
//            CountdownBarLayout, a

class a
    implements Runnable
{

    final CountdownBarLayout a;

    public void run()
    {
        if (CountdownBarLayout.a(a) != null && CountdownBarLayout.a(a).c() != null)
        {
            CountdownBarLayout.a(a).c().b();
        }
        CountdownBarLayout.g(a);
    }

    (CountdownBarLayout countdownbarlayout)
    {
        a = countdownbarlayout;
        super();
    }
}
