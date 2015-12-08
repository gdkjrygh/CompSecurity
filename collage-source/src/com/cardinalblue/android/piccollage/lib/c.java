// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.piccollage.FileObserverService;
import com.cardinalblue.android.piccollage.InAppNotificationService;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.AbsDrawerActivity;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            d

public class c
    implements android.app.Application.ActivityLifecycleCallbacks
{
    public static class a
    {

        public a()
        {
        }
    }

    public static class b
    {

        public b()
        {
        }
    }


    private AtomicInteger a;
    private Activity b;
    private j c;

    public c()
    {
        a = new AtomicInteger(0);
        c = j.a(null);
    }

    static Activity a(c c1)
    {
        return c1.b;
    }

    private void b()
    {
        ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a(b);
        if (c.b())
        {
            c = o.a().p();
        }
        com.cardinalblue.android.piccollage.controller.a.a().f();
        b.startService(new Intent(b, com/cardinalblue/android/piccollage/FileObserverService));
        com.cardinalblue.android.piccollage.a.b.aU();
        NotificationManager notificationmanager = (NotificationManager)b.getSystemService("notification");
        if (notificationmanager != null)
        {
            notificationmanager.cancel(30001);
        }
    }

    private void c()
    {
        com.cardinalblue.android.piccollage.a.b.aT();
        j.a(new Callable() {

            final c a;

            public Boolean a()
                throws Exception
            {
                boolean flag;
                if (com.cardinalblue.android.piccollage.model.a.a.a(com.cardinalblue.android.piccollage.lib.c.a(a)).b() <= 1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = c.this;
                super();
            }
        }).c(new i() {

            final c a;

            public Object then(j j1)
                throws Exception
            {
                if (((Boolean)j1.e()).booleanValue())
                {
                    j1 = (AlarmManager)com.cardinalblue.android.piccollage.lib.c.a(a).getSystemService("alarm");
                    if (j1 != null)
                    {
                        PendingIntent pendingintent = PendingIntent.getService(com.cardinalblue.android.piccollage.lib.c.a(a), 0, (new Intent(com.cardinalblue.android.piccollage.lib.c.a(a), com/cardinalblue/android/piccollage/InAppNotificationService)).setAction("android.intent.action.SEND").setData(Uri.parse("app:/notification/uncreated")).addFlags(0x14000000), 0);
                        try
                        {
                            j1.cancel(pendingintent);
                        }
                        catch (Exception exception) { }
                        j1.set(3, SystemClock.elapsedRealtime() + PICDeviceConfig.getUncreatedNotificationDelayMs(), pendingintent);
                    }
                }
                return null;
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    public Activity a()
    {
        return b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", "onActivityCreated");
    }

    public void onActivityDestroyed(Activity activity)
    {
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", "onActivityDestroyed");
    }

    public void onActivityPaused(Activity activity)
    {
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", "onActivityPaused");
    }

    public void onActivityResumed(Activity activity)
    {
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", "onActivityResumed");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity)
    {
        int i = a.incrementAndGet();
        b = activity;
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", (new StringBuilder()).append("onActivityStarted, #started: ").append(i).toString());
        if (1 == i)
        {
            d.a().c(new b());
            b();
        }
    }

    public void onActivityStopped(Activity activity)
    {
        int i = a.decrementAndGet();
        com.cardinalblue.android.piccollage.a.a.a("AppDelegate", (new StringBuilder()).append("onActivityStopped, #started: ").append(i).toString());
        if (i == 0)
        {
            d.a().c(new a());
            c();
            AbsDrawerActivity.c();
        }
    }
}
