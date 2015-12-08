// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.widget:
//            a, d, WidgetProvider

class c extends Service
{

    private static final String a = "WidgetUpdaterService";

    c()
    {
    }

    protected void a()
    {
        com.fitbit.e.a.a("WidgetUpdaterService", "Updating widget...", new Object[0]);
        Object obj = (new com.fitbit.widget.a()).a();
        d d1 = new d(getApplicationContext());
        d1.a(((WidgetModel) (obj)));
        obj = new ComponentName(this, com/fitbit/widget/WidgetProvider);
        AppWidgetManager.getInstance(this).updateAppWidget(((ComponentName) (obj)), d1.a());
        com.fitbit.e.a.a("WidgetUpdaterService", "Stopping updating service...", new Object[0]);
        stopSelf();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a();
        return 1;
    }
}
