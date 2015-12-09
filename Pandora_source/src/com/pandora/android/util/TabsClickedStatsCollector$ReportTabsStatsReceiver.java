// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            TabsClickedStatsCollector

public static class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("action_report_clicked_tabs_stats"))
            {
                if (!com.pandora.android.util.TabsClickedStatsCollector.c())
                {
                    break label0;
                }
                a.a("TabsClickedStatsCollector", "stats : ReportTabsStatsReceiver --> onReceive() : alarm went off while app RUNNING --> reportTabsClickedStats()");
                TabsClickedStatsCollector.d();
            }
            return;
        }
        a.a("TabsClickedStatsCollector", "stats : ReportTabsStatsReceiver --> onReceive() : alarm went off while app in BACKGROUND/SLEEP --> prefs.setNeedToSendTabsClickedReport()");
        b.a.b().k().h();
    }

    public ()
    {
    }
}
