// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.util.Log;
import com.cardinalblue.android.piccollage.a.b;
import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            a

class nit> extends AdListener
{

    final AdOpened a;
    final a b;

    public void onAdClosed()
    {
        super.onAdClosed();
        Log.v("ADS", "onAdClosed");
        if (a != null)
        {
            a.a();
        }
    }

    public void onAdLeftApplication()
    {
        super.onAdLeftApplication();
        Log.v("ADS", "onAdLeftApplication");
        com.cardinalblue.android.piccollage.a.b.bB();
    }

    public void onAdOpened()
    {
        super.onAdOpened();
        Log.v("ADS", "onAdOpened");
    }

    (a a1,  )
    {
        b = a1;
        a = ;
        super();
    }
}
