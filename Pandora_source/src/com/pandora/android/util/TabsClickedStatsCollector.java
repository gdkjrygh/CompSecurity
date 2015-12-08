// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.Calendar;
import p.cw.c;
import p.dd.an;
import p.df.a;

public class TabsClickedStatsCollector
{
    public static class ReportTabsStatsReceiver extends BroadcastReceiver
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
                    p.df.a.a("TabsClickedStatsCollector", "stats : ReportTabsStatsReceiver --> onReceive() : alarm went off while app RUNNING --> reportTabsClickedStats()");
                    TabsClickedStatsCollector.d();
                }
                return;
            }
            p.df.a.a("TabsClickedStatsCollector", "stats : ReportTabsStatsReceiver --> onReceive() : alarm went off while app in BACKGROUND/SLEEP --> prefs.setNeedToSendTabsClickedReport()");
            b.a.b().k().h();
        }

        public ReportTabsStatsReceiver()
        {
        }
    }


    private static TabsClickedStatsCollector d;
    public int a;
    public int b;
    public long c;

    private TabsClickedStatsCollector()
    {
        a = 5;
        b = 1;
        c = 0x5265c00L;
        b.a.b().b(this);
    }

    public static TabsClickedStatsCollector a()
    {
        if (d == null)
        {
            d = new TabsClickedStatsCollector();
        }
        return d;
    }

    static boolean c()
    {
        return g();
    }

    static void d()
    {
        e();
    }

    private static void e()
    {
        String as[] = HomeTabsActivity.aj();
        if (as == null)
        {
            return;
        }
        c c1 = b.a.b();
        ag ag1 = c1.k();
        for (int i = 0; i < as.length; i++)
        {
            String s = as[i];
            int j = ag1.b(i);
            ag1.c(i);
            p.df.a.a("TabsClickedStatsCollector", (new StringBuilder()).append("stats : reportTabsClickedStats() : tab_index = ").append(i).append(", name = ").append(s).append(", count = ").append(j).toString());
            c1.o().a(i, s, j);
        }

        ag1.j();
    }

    private boolean f()
    {
        boolean flag = false;
        Context context = b.a.b().s();
        Intent intent = new Intent(context, com/pandora/android/util/TabsClickedStatsCollector$ReportTabsStatsReceiver);
        intent.setAction("action_report_clicked_tabs_stats");
        if (PendingIntent.getBroadcast(context, 0, intent, 0x20000000) != null)
        {
            flag = true;
        }
        p.df.a.a("TabsClickedStatsCollector", (new StringBuilder()).append("stats : isTabsClickedReportAlarmSet() = ").append(flag).toString());
        return flag;
    }

    private static boolean g()
    {
        p.cx.e.a a1 = b.a.D();
        return a1 != null && a1 == p.cx.e.a.b;
    }

    public void a(int i)
    {
        p.df.a.a("TabsClickedStatsCollector", (new StringBuilder()).append("stats : registerTabClickEvent() : tabIndex = ").append(i).toString());
        b.a.b().k().a(i);
    }

    public void b()
    {
        Context context = b.a.b().s();
        Object obj = new Intent(context, com/pandora/android/util/TabsClickedStatsCollector$ReportTabsStatsReceiver);
        ((Intent) (obj)).setAction("action_report_clicked_tabs_stats");
        obj = PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x8000000);
        Calendar calendar = Calendar.getInstance();
        calendar.add(a, b);
        long l = calendar.getTimeInMillis();
        ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(0, l, c, ((PendingIntent) (obj)));
        Calendar.getInstance().setTimeInMillis(l);
    }

    public void onSignInState(an an1)
    {
label0:
        {
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[p.cx.e.a.values().length];
                    try
                    {
                        a[p.cx.e.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.cx.e.a.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.cx.e.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.cx.e.a.b.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.pandora.android.util._cls1.a[an1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                break;

            case 4: // '\004'
                if (!f())
                {
                    break label0;
                }
                p.df.a.a("TabsClickedStatsCollector", "stats : SignInStateEvent.SIGNED_IN - CASE: app is RESTARTING");
                if (b.a.b().k().i())
                {
                    p.df.a.a("TabsClickedStatsCollector", "stats : SignInStateEvent.SIGNED_IN - CASE: app is RESTARTING && NEED TO SEND REPORT");
                    e();
                }
                break;
            }
            return;
        }
        p.df.a.a("TabsClickedStatsCollector", "stats : SignInStateEvent.SIGNED_IN - CASE: app started from FRESH BOOT");
        b();
    }
}
