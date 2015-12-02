// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.util.Log;
import com.mobvista.sdk.m.core.a.a;
import com.mobvista.sdk.m.core.entity.Campaign;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class d
    implements a
{

    final AdMobvistaAct a;

    d(AdMobvistaAct admobvistaact)
    {
        a = admobvistaact;
        super();
    }

    public final void a()
    {
    }

    public final void a(Campaign campaign)
    {
        com.mobvista.sdk.m.core.AdMobvistaAct.a(a, campaign);
        com.mobvista.sdk.m.core.AdMobvistaAct.a(a).setType(1);
        if (com.mobvista.sdk.m.core.AdMobvistaAct.a(a) != null)
        {
            AdMobvistaAct.b(a, com.mobvista.sdk.m.core.AdMobvistaAct.a(a));
        }
    }

    public final void a(String s)
    {
        Log.e("Ad", (new StringBuilder("fb failed by ")).append(s).toString());
    }
}
