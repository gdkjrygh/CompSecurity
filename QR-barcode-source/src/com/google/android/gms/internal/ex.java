// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.c;

// Referenced classes of package com.google.android.gms.internal:
//            ev, es

public final class ex extends eu.a
{

    private final PublisherInterstitialAd oF;
    private final c oG;

    public ex(c c1, PublisherInterstitialAd publisherinterstitialad)
    {
        oG = c1;
        oF = publisherinterstitialad;
    }

    public void a(es es)
    {
        oG.a(oF, new ev(es));
    }

    public boolean e(String s, String s1)
    {
        return oG.a(oF, s, s1);
    }
}
