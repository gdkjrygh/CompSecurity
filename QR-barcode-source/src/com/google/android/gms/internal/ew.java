// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.b;

// Referenced classes of package com.google.android.gms.internal:
//            ev, es

public final class ew extends et.a
{

    private final b oE;
    private final PublisherAdView sQ;

    public ew(b b1, PublisherAdView publisheradview)
    {
        oE = b1;
        sQ = publisheradview;
    }

    public void a(es es)
    {
        oE.a(sQ, new ev(es));
    }

    public boolean e(String s, String s1)
    {
        return oE.a(sQ, s, s1);
    }
}
