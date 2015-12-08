// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.analytics:
//            aa

public class CampaignTrackingService extends IntentService
{

    public CampaignTrackingService()
    {
        super("CampaignIntentService");
    }

    public CampaignTrackingService(String s)
    {
        super(s);
    }

    public void onHandleIntent(Intent intent)
    {
        processIntent(this, intent);
    }

    public void processIntent(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        try
        {
            context = context.openFileOutput("gaInstallData", 0);
            context.write(intent.getBytes());
            context.close();
            aa.C("Stored campaign information.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            aa.A("Error storing install campaign.");
        }
    }
}
