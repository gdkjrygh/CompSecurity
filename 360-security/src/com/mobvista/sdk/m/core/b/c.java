// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.b;

import android.view.View;
import com.mobvista.sdk.m.core.AdMobvistaAct;
import com.mobvista.sdk.m.core.entity.CampaignEx;

// Referenced classes of package com.mobvista.sdk.m.core.b:
//            a

final class c
    implements android.view.View.OnClickListener
{

    final CampaignEx a;
    final a b;

    c(a a1, CampaignEx campaignex)
    {
        b = a1;
        a = campaignex;
        super();
    }

    public final void onClick(View view)
    {
        com.mobvista.sdk.m.core.b.a.a(b).a(a);
    }
}
