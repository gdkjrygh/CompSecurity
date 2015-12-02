// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.a;

import com.facebook.ads.NativeAd;
import com.facebook.ads.a;
import com.facebook.ads.d;
import com.mobvista.sdk.m.core.entity.Campaign;

// Referenced classes of package com.mobvista.sdk.m.core.a:
//            b, a

final class c
    implements d
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void onAdClicked(a a1)
    {
        if (com.mobvista.sdk.m.core.a.b.a(a) != null)
        {
            com.mobvista.sdk.m.core.a.b.a(a).a();
        }
    }

    public final void onAdLoaded(a a1)
    {
        if (com.mobvista.sdk.m.core.a.b.a(a) != null)
        {
            a1 = new Campaign();
            if ((b.b(a).k() == null || b.b(a).f() == null || b.b(a).g() == null || b.b(a).d() == null || b.b(a).d().a() == null || b.b(a).e() == null || b.b(a).e().a() == null) && com.mobvista.sdk.m.core.a.b.a(a) != null)
            {
                com.mobvista.sdk.m.core.a.b.a(a).a("FB data error.");
            }
            a1.setId(b.b(a).k());
            a1.setAppName(b.b(a).f());
            a1.setAppDesc(b.b(a).g());
            a1.setIconUrl(b.b(a).d().a());
            a1.setImageUrl(b.b(a).e().a());
            a1.setTimestamp(System.currentTimeMillis());
            a1.setAdCall(b.b(a).h());
            a1.setType(1);
            com.mobvista.sdk.m.core.a.b.a(a).a(a1);
        }
    }

    public final void onError(a a1, com.facebook.ads.c c1)
    {
        if (com.mobvista.sdk.m.core.a.b.a(a) != null)
        {
            com.mobvista.sdk.m.core.a.b.a(a).a(c1.b());
        }
    }
}
