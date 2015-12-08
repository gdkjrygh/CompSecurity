// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleWidget, HolyBibleWidgetSmall

public class WidgetUpdateService extends Service
{

    public WidgetUpdateService()
    {
    }

    private void buildUpdate()
    {
        RemoteViews remoteviews = new RemoteViews(getPackageName(), 0x7f030037);
        AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(this);
        HolyBibleWidget.updateWidget(remoteviews, getApplicationContext(), appwidgetmanager);
        HolyBibleWidgetSmall.updateWidget(remoteviews, getApplicationContext(), appwidgetmanager);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        buildUpdate();
        return super.onStartCommand(intent, i, j);
    }
}
