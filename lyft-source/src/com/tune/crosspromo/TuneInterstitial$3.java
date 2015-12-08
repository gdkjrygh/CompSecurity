// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneInterstitial, TuneAdMetadata

class b
    implements Runnable
{

    final String a;
    final TuneAdMetadata b;
    final TuneInterstitial c;

    public void run()
    {
        TuneInterstitial.a(c, a, b);
    }

    (TuneInterstitial tuneinterstitial, String s, TuneAdMetadata tuneadmetadata)
    {
        c = tuneinterstitial;
        a = s;
        b = tuneadmetadata;
        super();
    }
}
