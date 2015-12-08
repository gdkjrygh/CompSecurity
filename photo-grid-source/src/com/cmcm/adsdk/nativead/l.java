// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import com.facebook.ads.Ad;
import com.facebook.ads.ImpressionListener;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            k

final class l
    implements ImpressionListener
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final void onLoggingImpression(Ad ad)
    {
        if (ad != null)
        {
            b.a("CMFBNativeAd", "Facebook onLoggingImpression! ");
            a.k();
        }
    }
}
