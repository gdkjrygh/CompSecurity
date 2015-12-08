// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.appboy.a;
import com.appboy.d;

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
        if (intent != null)
        {
            if ((intent = intent.getAction()) != null && intent.contains((new StringBuilder()).append(getApplicationContext().getPackageName()).append(".REQUEST_DATA_SYNC").toString()))
            {
                com.appboy.a.a(getApplicationContext()).d();
                return;
            }
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/services/AppboyDataSyncService.getName()
        });
    }
}
