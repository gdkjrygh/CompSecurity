// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneInterstitial, TuneAdListener

class a
    implements Runnable
{

    final TuneInterstitial a;

    public void run()
    {
        if (TuneInterstitial.b(a) != null)
        {
            TuneInterstitial.b(a).b(a);
        }
    }

    (TuneInterstitial tuneinterstitial)
    {
        a = tuneinterstitial;
        super();
    }
}
