// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneBanner, TuneAdListener

class a
    implements Runnable
{

    final TuneBanner a;

    public void run()
    {
        if (TuneBanner.i(a) != null)
        {
            TuneBanner.i(a).a(a);
        }
    }

    r(TuneBanner tunebanner)
    {
        a = tunebanner;
        super();
    }
}
