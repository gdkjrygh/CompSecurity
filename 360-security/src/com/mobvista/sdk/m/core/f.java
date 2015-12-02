// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.view.View;
import com.mobvista.sdk.m.core.entity.CampaignEx;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class f
    implements android.view.View.OnClickListener
{

    final CampaignEx a;
    final AdMobvistaAct b;

    f(AdMobvistaAct admobvistaact, CampaignEx campaignex)
    {
        b = admobvistaact;
        a = campaignex;
        super();
    }

    public final void onClick(View view)
    {
        b.a(a);
    }
}
