// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import p.cw.c;
import p.df.a;

public class StatsCollectorManager
{
    public static class ReportClickedTabsStatsReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            a.a("StatsCollectorManager", "stats : StatsCollectorManager.ReportClickedTabsStatsReceiver --> onReceive() :  prefs.setNeedToSendTabsClickedReport()");
            b.a.b().k().h();
            a.a("StatsCollectorManager", "stats : StatsCollectorManager.ReportClickedTabsStatsReceiver --> onReceive() :  cancel Tabs Clicked Alarm");
            context = b.a.b().s();
            intent = new Intent(context, com/pandora/android/util/StatsCollectorManager$ReportClickedTabsStatsReceiver);
            intent.setAction("action_report_clicked_tabs_stats");
            intent = PendingIntent.getBroadcast(context, 0, intent, 0x20000000);
            ((AlarmManager)context.getSystemService("alarm")).cancel(intent);
            intent.cancel();
        }

        public ReportClickedTabsStatsReceiver()
        {
        }
    }

}
