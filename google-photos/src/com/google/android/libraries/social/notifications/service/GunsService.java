// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.notifications.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ntn;
import ntq;
import olm;

public final class GunsService extends Service
{

    private ExecutorService a;
    private boolean b;

    public GunsService()
    {
    }

    public static int a(Intent intent)
    {
        return intent.getIntExtra("account_id", -1);
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final void onCreate()
    {
        super.onCreate();
        a = (ExecutorService)olm.b(getApplicationContext(), java/util/concurrent/ExecutorService);
        if (a != null)
        {
            b = true;
            return;
        } else
        {
            b = false;
            a = Executors.newFixedThreadPool(1);
            return;
        }
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (!b)
        {
            a.shutdown();
        }
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        intent = new ntq(this, j, intent);
        a.execute(intent);
        return 2;
    }

    static 
    {
        ntn.a(com/google/android/libraries/social/notifications/service/GunsService);
    }
}
