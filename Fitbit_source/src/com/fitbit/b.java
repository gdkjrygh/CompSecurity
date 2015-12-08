// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.app.LoaderManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.view.ViewConfiguration;
import com.facebook.FacebookSdk;
import com.fitbit.a.d;
import com.fitbit.bluetooth.g;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.FacebookBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dy;
import com.fitbit.data.repo.ag;
import com.fitbit.dncs.DncsPairingManager;
import com.fitbit.dncs.service.DncsSendNotificationService;
import com.fitbit.maps.n;
import com.fitbit.mixpanel.f;
import com.fitbit.multipledevice.a;
import com.fitbit.onboarding.landing.LandingActivity_;
import com.fitbit.pedometer.l;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.synclair.config.bean.e;
import com.fitbit.util.ah;
import com.fitbit.util.am;
import com.fitbit.util.bh;
import com.fitbit.util.c;
import com.fitbit.util.u;
import com.squareup.picasso.Cache;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import net.hockeyapp.android.r;

// Referenced classes of package com.fitbit:
//            AppUpdateManager, FitBitApplication

public class b
{
    private static class a extends r
    {

        private final Context a;

        public void a()
        {
            ((NotificationManager)a.getSystemService("notification")).notify("UPDATE", 0, (new android.support.v4.app.NotificationCompat.Builder(a)).setCategory("sys").setAutoCancel(true).setLocalOnly(true).setPriority(-1).setSmallIcon(0x7f020268).setContentInfo("Please update your Application").setContentTitle(String.format("New Version of %s Available for Download", new Object[] {
                a.getString(0x7f080059)
            })).setContentIntent(PendingIntent.getActivity(a, 0, new Intent(a, com/fitbit/onboarding/landing/LandingActivity_), 0x8000000)).setColor(a.getResources().getColor(0x7f0f011e)).build());
        }

        public a(Context context)
        {
            a = context.getApplicationContext();
        }
    }


    private static final String g = "FitbitApplicationHelper";
    private static final int h = 203;
    private static final int i = 0x116d22;
    private static final int j = 0x20af62;
    protected com.fitbit.multipledevice.a a;
    protected am b;
    protected AppUpdateManager c;
    protected com.fitbit.serverinteraction.restrictions.b d;
    protected com.fitbit.synclair.d e;
    protected e f;
    private final net.hockeyapp.android.c k = new net.hockeyapp.android.c() {

        final b a;

        public String a()
        {
            String s = com.fitbit.util.c.b.a(10 - bh.c(""));
            return (new StringBuilder()).append(s).append("").toString();
        }

            
            {
                a = b.this;
                super();
            }
    };
    private final com.fitbit.util.threading.c l = new com.fitbit.util.threading.c() {

        final b a;

        public void a(Intent intent)
        {
            com.fitbit.util.c.b(com.fitbit.FitBitApplication.a());
        }

            
            {
                a = b.this;
                super();
            }
    };
    private final com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener m = new com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener() {

        final b a;
        private boolean b;

        public void a()
        {
            if (!b)
            {
                if (ServerGateway.a().f())
                {
                    com.fitbit.FitBitApplication.a().startService(dy.a(com.fitbit.FitBitApplication.a(), false));
                }
                b = true;
            }
        }

        public void a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason)
        {
            b = false;
        }

            
            {
                a = b.this;
                super();
            }
    };
    private ah n;
    private com.a.a.a.a o;
    private com.fitbit.config.a p;
    private d q;
    private com.fitbit.a.b r;

    public b()
    {
        q = new d();
        r = new com.fitbit.a.b();
    }

    static net.hockeyapp.android.c a(b b1)
    {
        return b1.k;
    }

    private void a(Context context)
    {
        if (FacebookBusinessLogic.a().g())
        {
            FacebookSdk.sdkInitialize(context.getApplicationContext());
            FacebookSdk.setApplicationId("106920676011663");
        }
    }

    private void b(Context context)
    {
        net.hockeyapp.android.b.b(context, com.fitbit.config.b.b, k);
        (new AsyncTask(context) {

            final Context a;
            final b b;

            protected transient Void a(Void avoid[])
            {
                avoid = new WeakReference(a);
                if (net.hockeyapp.android.b.a(avoid) != 0)
                {
                    net.hockeyapp.android.b.a(avoid, com.fitbit.b.a(b));
                    net.hockeyapp.android.b.b(avoid);
                    net.hockeyapp.android.b.a(a, com.fitbit.b.a(b));
                }
                return null;
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            
            {
                b = b.this;
                a = context;
                super();
            }
        }).execute(new Void[0]);
    }

    private void b(FitBitApplication fitbitapplication)
    {
        a = com.fitbit.multipledevice.a.a();
        c = com.fitbit.AppUpdateManager.a();
        b = am.a();
        d = com.fitbit.serverinteraction.restrictions.b.a();
        e = com.fitbit.synclair.d.a();
        f = com.fitbit.synclair.config.bean.e.a();
        DncsSendNotificationService.b();
        if (an.a().b() != null)
        {
            DncsPairingManager.a().b();
        }
        q.a();
        r.a();
        com.fitbit.util.c.a(fitbitapplication);
        l.a(new IntentFilter("SavedState.AppState.RECOMMENDED_LOCALE_UPDATED"));
        a();
        if (com.fitbit.bluetooth.g.d())
        {
            com.fitbit.bluetooth.d.a().b();
        }
        ServerGateway.a().b().b(m);
        LoaderManager.enableDebugLogging(false);
        if (com.fitbit.config.b.a.a())
        {
            b();
        }
        com.fitbit.a.a.a(fitbitapplication);
        com.fitbit.mixpanel.f.a(fitbitapplication);
        g();
        com.fitbit.analytics.core.a.a().a(new com.fitbit.analytics.a());
    }

    private void c(Context context)
    {
        Field field;
        try
        {
            context = ViewConfiguration.get(context);
            field = android/view/ViewConfiguration.getDeclaredField("sHasPermanentMenuKey");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        field.setAccessible(true);
        field.setBoolean(context, false);
    }

    private void c(FitBitApplication fitbitapplication)
    {
        n = new u();
        try
        {
            o = new com.a.a.a.a(fitbitapplication.getResources());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FitBitApplication fitbitapplication)
        {
            fitbitapplication.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FitBitApplication fitbitapplication)
        {
            fitbitapplication.printStackTrace();
        }
    }

    private void g()
    {
        String s;
        com.fitbit.config.a a1;
        List list;
        s = com.fitbit.savedstate.d.i();
        a1 = c();
        list = com.fitbit.util.c.a.a(s);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (list.size() != 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        com.fitbit.savedstate.d.b(a1.toString());
        if (an.a().i() || an.a().g() || com.fitbit.savedstate.d.h() != null)
        {
            UISavedState.a(false);
        }
        com.fitbit.e.a.a("FitbitApplicationHelper", "Version chain: %s", new Object[] {
            com.fitbit.savedstate.d.i()
        });
        return;
        if (((com.fitbit.config.a)list.get(list.size() - 1)).a() < 203)
        {
            UISavedState.a(false);
        }
        if (!((com.fitbit.config.a)list.get(list.size() - 1)).equals(a1))
        {
            com.fitbit.pedometer.l.a(false);
            com.fitbit.savedstate.d.b(com.fitbit.util.c.a.a(s, a1));
            UISavedState.c(false);
            if (a1.a() == 0x116d22 || a1.a() == 0x20af62)
            {
                com.fitbit.savedstate.d.b(true);
            }
        }
        com.fitbit.e.a.a("FitbitApplicationHelper", "Version chain: %s", new Object[] {
            com.fitbit.savedstate.d.i()
        });
        return;
        Exception exception;
        exception;
        com.fitbit.e.a.a("FitbitApplicationHelper", "Version chain: %s", new Object[] {
            com.fitbit.savedstate.d.i()
        });
        throw exception;
    }

    public void a()
    {
        try
        {
            Class.forName("android.os.AsyncTask");
            Class.forName("android.support.v4.content.ModernAsyncTask");
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
    }

    public void a(FitBitApplication fitbitapplication)
    {
        com.fitbit.a.c.a();
        b(fitbitapplication);
        c(fitbitapplication);
        b(fitbitapplication);
        c(fitbitapplication);
        com.fitbit.maps.n.a(fitbitapplication);
        a(((Context) (fitbitapplication)));
    }

    public void b()
    {
        StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).permitAll().detectNetwork().build());
        StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).penaltyLog().build());
    }

    public com.fitbit.config.a c()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.config.a a1;
        if (p == null)
        {
            p = com.fitbit.config.a.a(com.fitbit.FitBitApplication.a());
        }
        a1 = p;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public ah d()
    {
        return n;
    }

    public com.a.a.a.a e()
    {
        return o;
    }

    public void f()
    {
        com.fitbit.data.repo.l.b().c();
        com.fitbit.serverinteraction.c.a.c().clear();
    }
}
