// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingService;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ax

public final class InstallReferrerService extends IntentService
{

    CampaignTrackingService aNV;
    Context aNW;

    public InstallReferrerService()
    {
        super("InstallReferrerService");
    }

    private void a(Context context, Intent intent)
    {
        if (aNV == null)
        {
            aNV = new CampaignTrackingService();
        }
        CampaignTrackingService campaigntrackingservice = aNV;
        CampaignTrackingService.processIntent(context, intent);
    }

    protected final void onHandleIntent(Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        Context context;
        if (aNW != null)
        {
            context = aNW;
        } else
        {
            context = getApplicationContext();
        }
        ax.k(context, s);
        a(context, intent);
    }
}
