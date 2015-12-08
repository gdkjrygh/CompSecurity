// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

public class RecordAppWidgetProvider extends AppWidgetProvider
{

    private static final String TAG = "RecordWidget";
    static final ComponentName THIS_APPWIDGET = new ComponentName("com.soundcloud.android", "com.soundcloud.android.service.record.RecordAppWidgetProvider");
    private static RecordAppWidgetProvider instance;

    public RecordAppWidgetProvider()
    {
    }

    public static RecordAppWidgetProvider getInstance()
    {
        com/soundcloud/android/creators/record/RecordAppWidgetProvider;
        JVM INSTR monitorenter ;
        RecordAppWidgetProvider recordappwidgetprovider;
        if (instance == null)
        {
            instance = new RecordAppWidgetProvider();
        }
        recordappwidgetprovider = instance;
        com/soundcloud/android/creators/record/RecordAppWidgetProvider;
        JVM INSTR monitorexit ;
        return recordappwidgetprovider;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean hasInstances(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(THIS_APPWIDGET).length > 0;
    }

    private void linkButtons(Context context, int ai[], boolean flag)
    {
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), 0x7f030023);
        if (flag)
        {
            remoteviews.setOnClickPendingIntent(0x7f0f00b0, PendingIntent.getActivity(context, 0, new Intent("com.soundcloud.android.action.RECORD_STOP"), 0x10000000));
        } else
        {
            remoteviews.setOnClickPendingIntent(0x7f0f00b0, PendingIntent.getActivity(context, 0, new Intent("com.soundcloud.android.action.RECORD_START"), 0x10000000));
        }
        pushUpdate(context, ai, remoteviews);
    }

    private void pushUpdate(Context context, int ai[], RemoteViews remoteviews)
    {
        context = AppWidgetManager.getInstance(context);
        if (ai != null)
        {
            context.updateAppWidget(ai, remoteviews);
            return;
        } else
        {
            context.updateAppWidget(THIS_APPWIDGET, remoteviews);
            return;
        }
    }

    public void notifyChange(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (Log.isLoggable("RecordWidget", 3))
        {
            (new StringBuilder("notify change ")).append(intent);
        }
        if (hasInstances(context))
        {
            if (s.equals("com.soundcloud.android.recordstarted"))
            {
                linkButtons(context, null, true);
            } else
            if (s.equals("com.soundcloud.android.recordfinished"))
            {
                linkButtons(context, null, false);
                return;
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        linkButtons(context, ai, false);
    }

}
