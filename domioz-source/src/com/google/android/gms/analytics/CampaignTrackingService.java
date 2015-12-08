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
//            h

public class CampaignTrackingService extends IntentService
{

    public CampaignTrackingService()
    {
        super("CampaignIntentService");
    }

    public static void a(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        if (intent == null)
        {
            h.a("Campaign data not found.");
            return;
        }
        try
        {
            context = context.openFileOutput("gaInstallData", 0);
            context.write(intent.getBytes());
            context.close();
            h.c("Stored campaign information.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h.a("Error storing install campaign.");
        }
    }

    public void onHandleIntent(Intent intent)
    {
        a(this, intent);
    }
}
