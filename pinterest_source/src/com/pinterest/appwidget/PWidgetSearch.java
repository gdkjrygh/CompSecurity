// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetHelper

public class PWidgetSearch extends AppWidgetProvider
{

    private Context mContext;

    public PWidgetSearch()
    {
    }

    private void initWidgetSearch(AppWidgetManager appwidgetmanager, int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            RemoteViews remoteviews = new RemoteViews(mContext.getPackageName(), 0x7f03021d);
            remoteviews.setOnClickPendingIntent(0x7f0f0241, PWidgetHelper.getSearchPending(mContext));
            appwidgetmanager.updateAppWidget(ai[i], remoteviews);
        }

    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        mContext = context;
        initWidgetSearch(appwidgetmanager, ai);
        super.onUpdate(context, appwidgetmanager, ai);
    }
}
