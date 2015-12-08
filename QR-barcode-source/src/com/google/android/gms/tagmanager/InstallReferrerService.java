// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingService;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ay

public final class InstallReferrerService extends IntentService
{

    CampaignTrackingService apw;
    Context apx;

    public InstallReferrerService()
    {
        super("InstallReferrerService");
    }

    public InstallReferrerService(String s)
    {
        super(s);
    }

    private void a(Context context, Intent intent)
    {
        if (apw == null)
        {
            apw = new CampaignTrackingService();
        }
        apw.processIntent(context, intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        Context context;
        if (apx != null)
        {
            context = apx;
        } else
        {
            context = getApplicationContext();
        }
        ay.d(context, s);
        a(context, intent);
    }
}
