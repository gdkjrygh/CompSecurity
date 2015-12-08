// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneInterstitial, TuneAdView

class b
    implements Runnable
{

    final String a;
    final String b;
    final TuneInterstitial c;

    public void run()
    {
        TuneInterstitial.b(c, a).a(b);
    }

    (TuneInterstitial tuneinterstitial, String s, String s1)
    {
        c = tuneinterstitial;
        a = s;
        b = s1;
        super();
    }
}
