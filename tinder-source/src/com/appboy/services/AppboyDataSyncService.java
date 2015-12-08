// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import com.appboy.Appboy;
import com.appboy.Constants;

public class AppboyDataSyncService extends IntentService
{

    private static final String a;

    public AppboyDataSyncService()
    {
        super(com/appboy/services/AppboyDataSyncService.getName());
    }

    public void onCreate()
    {
        super.onCreate();
    }

    protected void onHandleIntent(Intent intent)
    {
        Process.setThreadPriority(10);
        if (intent == null)
        {
            Log.w(a, "AppboyDataSyncService received null intent, doing nothing.");
            return;
        }
        intent = intent.getAction();
        if (intent == null)
        {
            Log.w(a, "AppboyDataSyncService received intent with null action, doing nothing.");
            return;
        }
        if (intent.contains((new StringBuilder()).append(getApplicationContext().getPackageName()).append(".REQUEST_DATA_SYNC").toString()))
        {
            Log.d(a, "AppboyDataSyncService requesting Appboy DataSync.");
            Appboy.getInstance(getApplicationContext()).requestImmediateDataFlush();
            return;
        } else
        {
            Log.w(a, "AppboyDataSyncService received unknown intent, doing nothing.");
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/services/AppboyDataSyncService.getName()
        });
    }
}
