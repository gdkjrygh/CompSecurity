// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import com.arist.activity.MyApplication;
import com.arist.activity.WelcomeActivity;
import com.arist.b.b;
import com.arist.c.a;
import com.arist.c.j;

public class Widget4x1White extends AppWidgetProvider
{

    private RemoteViews a;

    public Widget4x1White()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i("Widget4x1White", intent.getAction());
        if (a.j.equals(intent.getAction()))
        {
            a = null;
        }
        intent = intent.getIntArrayExtra("appWidgetIds");
        onUpdate(context, AppWidgetManager.getInstance(context), intent);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        if (a == null)
        {
            a = new RemoteViews(context.getPackageName(), 0x7f030047);
            a.setTextViewText(0x7f0600fd, (new StringBuilder(String.valueOf(MyApplication.g().d()))).append(" - ").append(MyApplication.g().j()).toString());
            android.graphics.Bitmap bitmap = com.arist.c.a.a.a(context, MyApplication.g());
            a.setImageViewBitmap(0x7f0600fc, bitmap);
            a.setOnClickPendingIntent(0x7f060051, PendingIntent.getBroadcast(context, 0, j.a(a.b), 0x8000000));
            a.setOnClickPendingIntent(0x7f0600ff, PendingIntent.getBroadcast(context, 0, j.a(a.f), 0x8000000));
            a.setOnClickPendingIntent(0x7f060052, PendingIntent.getBroadcast(context, 0, j.a(a.g), 0x8000000));
            a.setOnClickPendingIntent(0x7f0600fb, PendingIntent.getActivity(context, 0, new Intent(context, com/arist/activity/WelcomeActivity), 0x8000000));
        }
        RemoteViews remoteviews = a;
        int i;
        if (MyApplication.j != 2)
        {
            i = 0x7f0200a3;
        } else
        {
            i = 0x7f0200a2;
        }
        remoteviews.setImageViewResource(0x7f060051, i);
        if (ai != null && ai.length > 0)
        {
            appwidgetmanager.updateAppWidget(ai, a);
            return;
        } else
        {
            appwidgetmanager.updateAppWidget(new ComponentName(context, com/arist/widget/Widget4x1White), a);
            return;
        }
    }
}
