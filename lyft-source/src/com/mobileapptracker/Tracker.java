// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.URLDecoder;

// Referenced classes of package com.mobileapptracker:
//            MobileAppTracker

public class Tracker extends BroadcastReceiver
{

    public Tracker()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (!intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        intent = intent.getStringExtra("referrer");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        intent = URLDecoder.decode(intent, "UTF-8");
        Log.d("MobileAppTracker", (new StringBuilder()).append("TUNE received referrer ").append(intent).toString());
        context.getSharedPreferences("com.mobileapptracking", 0).edit().putString("mat_referrer", intent).commit();
        context = MobileAppTracker.a();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        context.b(intent);
        if (((MobileAppTracker) (context)).i && !((MobileAppTracker) (context)).k)
        {
            synchronized (((MobileAppTracker) (context)).l)
            {
                ((MobileAppTracker) (context)).l.notifyAll();
                context.k = true;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_144;
        context;
        intent;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }
}
