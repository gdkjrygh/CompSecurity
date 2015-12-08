// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.worklight.common.Logger;

public class WLForegroundService extends Service
{
    public class ForegroundBinder extends Binder
    {

        final WLForegroundService this$0;

        public void makeForeground(int i, Notification notification)
        {
            startForeground(i, notification);
        }

        public ForegroundBinder()
        {
            this$0 = WLForegroundService.this;
            super();
        }
    }


    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/WLForegroundService.getName());

    public WLForegroundService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return new ForegroundBinder();
    }

    public void onDestroy()
    {
        super.onDestroy();
        logger.info("WLKeepAliveService destroyed");
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        logger.info("WLKeepAliveService started");
        return 1;
    }

}
