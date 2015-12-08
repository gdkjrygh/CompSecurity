// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.analytics.core.a;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.savedstate.UISavedState;

// Referenced classes of package com.fitbit:
//            FitBitApplication

public class ApplicationForegroundController
{
    public static final class LaunchType extends Enum
    {

        public static final LaunchType a;
        public static final LaunchType b;
        private static final LaunchType c[];

        public static LaunchType b(Intent intent)
        {
            if (!intent.hasExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE"))
            {
                return b;
            } else
            {
                return values()[intent.getIntExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE", -1)];
            }
        }

        public static LaunchType valueOf(String s)
        {
            return (LaunchType)Enum.valueOf(com/fitbit/ApplicationForegroundController$LaunchType, s);
        }

        public static LaunchType[] values()
        {
            return (LaunchType[])c.clone();
        }

        public void a(Intent intent)
        {
            intent.putExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE", ordinal());
        }

        static 
        {
            a = new LaunchType("NFC_LAUNCH", 0);
            b = new LaunchType("DEFAULT", 1);
            c = (new LaunchType[] {
                a, b
            });
        }

        private LaunchType(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static final String a = "com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND";
    public static final String b = "com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND";
    public static final String c = "com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE";
    private static final String d = "app open";
    private static final String e = "ApplicationForegroundController";
    private static final long f = 5000L;
    private static ApplicationForegroundController g;
    private static volatile boolean h = false;
    private static volatile long i;
    private static Object m = new Object();
    private Runnable j;
    private Handler k;
    private int l;

    private ApplicationForegroundController()
    {
        j = new Runnable() {

            final ApplicationForegroundController a;

            public void run()
            {
                if (com.fitbit.ApplicationForegroundController.a(a) == 0)
                {
                    com.fitbit.e.a.a("ApplicationForegroundController", "application probably switched to background", new Object[0]);
                    ApplicationForegroundController.b(a);
                }
            }

            
            {
                a = ApplicationForegroundController.this;
                super();
            }
        };
        k = new Handler(Looper.getMainLooper());
    }

    static int a(ApplicationForegroundController applicationforegroundcontroller)
    {
        return applicationforegroundcontroller.l;
    }

    public static ApplicationForegroundController a()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        com/fitbit/ApplicationForegroundController;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            g = new ApplicationForegroundController();
        }
        com/fitbit/ApplicationForegroundController;
        JVM INSTR monitorexit ;
_L2:
        return g;
        Exception exception;
        exception;
        com/fitbit/ApplicationForegroundController;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(LaunchType launchtype)
    {
        synchronized (m)
        {
            Intent intent = new Intent();
            intent.setAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
            launchtype.a(intent);
            LocalBroadcastManager.getInstance(com.fitbit.FitBitApplication.a()).sendBroadcast(intent);
            h = true;
            UISavedState.t();
        }
        return;
        launchtype;
        obj;
        JVM INSTR monitorexit ;
        throw launchtype;
    }

    static void b(ApplicationForegroundController applicationforegroundcontroller)
    {
        applicationforegroundcontroller.d();
    }

    private void d()
    {
        synchronized (m)
        {
            Intent intent = new Intent();
            intent.setAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND");
            LocalBroadcastManager.getInstance(com.fitbit.FitBitApplication.a()).sendBroadcast(intent);
            h = false;
            com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.c);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Activity activity)
    {
        l = l + 1;
        k.removeCallbacks(j);
        com.fitbit.e.a.a("ApplicationForegroundController", "incremented resumed activities count [%s]. Count for now =>%s", new Object[] {
            activity.getClass().getSimpleName(), Integer.valueOf(l)
        });
        if (l == 1)
        {
            long l1 = System.currentTimeMillis() - i;
            if (l1 > 5000L)
            {
                com.fitbit.e.a.a("ApplicationForegroundController", "application probably switched from background. Zero resumed activities time was %sms", new Object[] {
                    Long.valueOf(l1)
                });
                if (com.fitbit.profile.a.a().b() != null)
                {
                    com.fitbit.e.a.a("ApplicationForegroundController", "NFC launch", new Object[0]);
                    a(com.fitbit.LaunchType.a);
                } else
                {
                    a(LaunchType.b);
                }
                MixPanelTrackingHelper.b();
                com.fitbit.analytics.core.a.a().c();
                com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.b);
                com.fitbit.FitBitApplication.a(activity).c().a(0x7f11000a).b("app open");
            }
        }
    }

    public boolean a(long l1)
    {
        while (l > 0 || l1 >= System.currentTimeMillis() - i) 
        {
            return false;
        }
        return true;
    }

    public void b(Activity activity)
    {
        l = l - 1;
        com.fitbit.e.a.a("ApplicationForegroundController", "decremented resumed activities count [%s]. Count for now => %s", new Object[] {
            activity.getClass().getSimpleName(), Integer.valueOf(l)
        });
        if (l == 0)
        {
            i = System.currentTimeMillis();
            k.postDelayed(j, 5000L);
        }
    }

    public boolean b()
    {
        boolean flag;
        synchronized (m)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int c()
    {
        return l;
    }

}
