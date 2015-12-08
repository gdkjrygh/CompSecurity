// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.pinterest.activity.notifications.util.RecentConversations;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.appwidget.WidgetValidator;
import com.pinterest.base.Application;
import com.pinterest.base.Services;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.offline.OfflineDataRetriever;

public class GlobalDataUpdateReceiver extends BroadcastReceiver
{

    public GlobalDataUpdateReceiver()
    {
    }

    public static void a()
    {
        b();
        e();
        PendingIntent pendingintent = d();
        ((AlarmManager)Application.context().getSystemService("alarm")).setInexactRepeating(2, SystemClock.elapsedRealtime() + 30000L, 0x5265c00L, pendingintent);
    }

    public static void b()
    {
        PendingIntent pendingintent = d();
        ((AlarmManager)Application.context().getSystemService("alarm")).cancel(pendingintent);
        pendingintent.cancel();
    }

    public static void c()
    {
        WidgetValidator.tryEnableWidget(Application.context(), false);
        if (MyUser.hasAccessToken())
        {
            MyUserApi.a(new com.pinterest.api.remote.MyUserApi.MyUserApiResponse(), null);
            MyUserApi.a(new com.pinterest.api.remote.MyUserApi.BoardPickerApiResponse(), null);
            RecentConversations.refresh();
            OfflineDataRetriever.d().a();
        }
        Services.startNotificationService();
        Preferences.user().set("PREF_LAST_GLOBAL_DATA_UPDATE", SystemClock.elapsedRealtime());
    }

    private static PendingIntent d()
    {
        android.app.Application application = Application.context();
        return PendingIntent.getBroadcast(application, 0, new Intent(application, com/pinterest/receiver/GlobalDataUpdateReceiver), 0);
    }

    private static void e()
    {
        boolean flag;
        if (Math.abs(SystemClock.elapsedRealtime() - Preferences.user().getLong("PREF_LAST_GLOBAL_DATA_UPDATE", 0x8000000000000000L)) > 0x2932e00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            c();
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        e();
    }
}
