// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.os.Handler;
import com.mobvista.sdk.m.core.a.a;
import com.mobvista.sdk.m.core.entity.Campaign;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAdNative, AdListener

final class t
    implements a
{

    final MobvistaAdNative a;

    t(MobvistaAdNative mobvistaadnative)
    {
        a = mobvistaadnative;
        super();
    }

    public final void a()
    {
        if (MobvistaAdNative.g(a) != null)
        {
            MobvistaAdNative.g(a).onAdClick(MobvistaAdNative.f(a));
        }
    }

    public final void a(Campaign campaign)
    {
        com.mobvista.sdk.m.a.b.a.a.d("MobvistaAdNative", (new StringBuilder("fb success by ")).append(campaign).toString());
        if (com.mobvista.sdk.m.core.MobvistaAdNative.a(a) != null && MobvistaAdNative.b(a) != null)
        {
            com.mobvista.sdk.m.core.MobvistaAdNative.a(a).removeCallbacks(MobvistaAdNative.b(a));
        }
        if (MobvistaAdNative.e(a) != null)
        {
            com.mobvista.sdk.m.core.MobvistaAdNative.a(a, campaign);
            MobvistaAdNative.f(a).setType(1);
            if (MobvistaAdNative.g(a) != null)
            {
                MobvistaAdNative.g(a).onAdLoaded(MobvistaAdNative.f(a));
            }
        }
    }

    public final void a(String s)
    {
        com.mobvista.sdk.m.a.b.a.a.d("MobvistaAdNative", (new StringBuilder("fb failed by ")).append(s).toString());
        if (com.mobvista.sdk.m.core.MobvistaAdNative.a(a) != null && MobvistaAdNative.b(a) != null)
        {
            com.mobvista.sdk.m.core.MobvistaAdNative.a(a).removeCallbacks(MobvistaAdNative.b(a));
        }
        while (MobvistaAdNative.c(a) && !MobvistaAdNative.d(a)) ;
    }
}
