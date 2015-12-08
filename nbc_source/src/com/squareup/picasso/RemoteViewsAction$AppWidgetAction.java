// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

// Referenced classes of package com.squareup.picasso:
//            RemoteViewsAction, Picasso, Request

static class appWidgetIds extends RemoteViewsAction
{

    private final int appWidgetIds[];

    volatile Object getTarget()
    {
        return super.getTarget();
    }

    void update()
    {
        AppWidgetManager.getInstance(picasso.context).updateAppWidget(appWidgetIds, remoteViews);
    }

    (Picasso picasso, Request request, RemoteViews remoteviews, int i, int ai[], int j, int k, 
            String s, Object obj, int l)
    {
        super(picasso, request, remoteviews, i, l, j, k, obj, s);
        appWidgetIds = ai;
    }
}
