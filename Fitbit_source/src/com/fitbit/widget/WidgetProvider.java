// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.e.a;
import com.fitbit.pedometer.service.b;
import com.fitbit.savedstate.w;

// Referenced classes of package com.fitbit.widget:
//            b

public class WidgetProvider extends AppWidgetProvider
{

    public static final String a = "com.fitbit.widget.WidgetProvider.ACTION_BUTTON_CLICKED";
    private static final String b = "WidgetProvider";
    private static final String c = "widget";
    private static final String d = "widget_placed";
    private static final String e = "widget_removed";

    public WidgetProvider()
    {
    }

    public void onDisabled(Context context)
    {
        super.onDisabled(context);
        com.fitbit.e.a.a("WidgetProvider", "WidgetProvider onDisabled.", new Object[0]);
        w.a(false);
        com.fitbit.widget.b.b(context);
        com.fitbit.pedometer.service.b.a();
        FitBitApplication.a(context).c().a(0x7f11000b).a("widget", "widget_removed", null, 0);
    }

    public void onEnabled(Context context)
    {
        super.onEnabled(context);
        com.fitbit.e.a.a("WidgetProvider", "WidgetProvider onEnabled.", new Object[0]);
        w.a(true);
        com.fitbit.widget.b.b(context);
        com.fitbit.pedometer.service.b.a();
        FitBitApplication.a(context).c().a(0x7f11000b).a("widget", "widget_placed", null, 0);
    }

    public void onReceive(Context context, Intent intent)
    {
        com.fitbit.e.a.a("WidgetProvider", "WidgetProvider onReceive.", new Object[0]);
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        super.onUpdate(context, appwidgetmanager, ai);
        com.fitbit.e.a.a("WidgetProvider", "WidgetProvider onUpdate.", new Object[0]);
        w.a(true);
        com.fitbit.widget.b.a(context);
    }
}
