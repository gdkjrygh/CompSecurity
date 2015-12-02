// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.util.Log;
import com.mobvista.sdk.m.a.a.d.b;
import com.mobvista.sdk.m.core.c.a;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac

final class ad
    implements b
{

    final CampaignEx a;
    final ac b;

    ad(ac ac1, CampaignEx campaignex)
    {
        b = ac1;
        a = campaignex;
        super();
    }

    public final void a(Object obj)
    {
        if (obj != null && (obj instanceof com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult))
        {
            obj = (com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult)obj;
            Log.i("Mobvista SDK M", (new StringBuilder("Redirection done...  code: ")).append(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)).getCode()).toString());
            a.setJumpResult(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
            if (((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)).isjumpDone())
            {
                obj = com.mobvista.sdk.m.core.c.a.a(com.mobvista.sdk.m.core.ac.a(b));
                a.getJumpResult().setNoticeurl(a.getNoticeUrl());
                ((a) (obj)).a(a, com.mobvista.sdk.m.core.ac.b(b));
            }
        }
        ac.c(b).remove(a.getClickURL());
    }

    public final void a(String s)
    {
        ac.c(b).remove(a.getClickURL());
    }
}
