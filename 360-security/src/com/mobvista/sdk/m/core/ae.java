// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.mobvista.sdk.m.a.a.d.b;
import com.mobvista.sdk.m.core.c.a;
import com.mobvista.sdk.m.core.entity.CampaignEx;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac, AdTrackingListener

final class ae
    implements b
{

    final CampaignEx a;
    final ac b;

    ae(ac ac1, CampaignEx campaignex)
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
            Log.i("Mobvista SDK M", (new StringBuilder("Redirection done...   code: ")).append(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)).getCode()).toString());
            a.setJumpResult(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
            com.mobvista.sdk.m.core.ac.a(b, a, ((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
            if (((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)).isjumpDone())
            {
                com.mobvista.sdk.m.core.c.a.a(com.mobvista.sdk.m.core.ac.a(b)).a(a, com.mobvista.sdk.m.core.ac.b(b));
            }
        }
        if (ac.d(b))
        {
            obj = new Intent((new StringBuilder("LAODING_DISMISSS")).append(com.mobvista.sdk.m.core.ac.b(b)).toString());
            ac.e(b).sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            ac.f(b);
            return;
        }
    }

    public final void a(String s)
    {
        if (ac.g(b) != null)
        {
            ac.g(b).onRedirectionFailed(a, s);
        }
        if (ac.d(b))
        {
            s = new Intent((new StringBuilder("LAODING_DISMISSS")).append(com.mobvista.sdk.m.core.ac.b(b)).toString());
            ac.e(b).sendBroadcast(s);
        } else
        {
            ac.f(b);
        }
        Toast.makeText(ac.e(b), "load failed", 0).show();
    }
}
