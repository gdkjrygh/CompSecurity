// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.net.Uri;
import android.util.Log;
import com.mobvista.sdk.m.a.f.j;
import com.mobvista.sdk.m.core.d.b;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import com.mobvista.sdk.m.core.util.a;
import java.io.File;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac, AdTrackingListener

final class ag
    implements b
{

    final CampaignEx a;
    final ac b;

    ag(ac ac1, CampaignEx campaignex)
    {
        b = ac1;
        a = campaignex;
        super();
    }

    public final void a(int i)
    {
        Log.i("Download", (new StringBuilder("OnProgress: ")).append(i).toString());
        if (ac.g(b) != null)
        {
            ac.g(b).onDownloadProgress(a, i);
        }
    }

    public final void a(String s)
    {
        if (j.b(s))
        {
            s = new File(s);
            if (s.exists())
            {
                com.mobvista.sdk.m.core.util.a.a(ac.e(b), Uri.fromFile(s));
            }
        }
        if (ac.g(b) != null)
        {
            ac.g(b).onDownloadFinish(a);
        }
    }

    public final void b(String s)
    {
        if (ac.g(b) != null)
        {
            ac.g(b).onDownloadError(s);
        }
    }
}
