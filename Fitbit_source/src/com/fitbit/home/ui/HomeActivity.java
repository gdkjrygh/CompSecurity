// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.Toolbar;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.at;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.dy;
import com.fitbit.data.bl.ff;
import com.fitbit.data.bl.i;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.choose.ChooseTrackerActivity;
import com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity;
import com.fitbit.e.a;
import com.fitbit.onboarding.landing.LandingActivity;
import com.fitbit.onboarding.landing.LandingActivity_;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.c;
import com.fitbit.savedstate.d;
import com.fitbit.savedstate.k;
import com.fitbit.sleep.ui.SleepRecordActivity;
import com.fitbit.sleep.ui.landing.SleepLoggingLandingActivity;
import com.fitbit.ui.drawer.NavigationItem;
import com.fitbit.ui.s;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bh;
import com.fitbit.util.o;
import com.fitbit.util.p;
import com.fitbit.util.r;
import com.google.android.gcm.b;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationDrawerActivity, HomeActivity_, HomeNavigationItem, DashboardPagerFragment, 
//            e, d

public class HomeActivity extends HomeNavigationDrawerActivity
{
    protected static final class ResumeDeviceSetupDialogFragment extends SimpleConfirmDialogFragment
    {

        public static ResumeDeviceSetupDialogFragment a(String s1)
        {
            ResumeDeviceSetupDialogFragment resumedevicesetupdialogfragment = new ResumeDeviceSetupDialogFragment();
            resumedevicesetupdialogfragment.setArguments(com.fitbit.util.r.a(0x7f0801c0, s1));
            return resumedevicesetupdialogfragment;
        }

        public void onCancel(DialogInterface dialoginterface)
        {
            super.onClick(dialoginterface, -3);
        }

        public ResumeDeviceSetupDialogFragment()
        {
            super(0x7f08048c, 0x7f08048a, 0x7f08048b);
        }
    }


    public static final String a = "notification";
    private static final String e = "kill";
    private static final String f = "logout";
    private static final String g = "force_logout";
    private static final String l = "com.fitbit.home.ui.TAG_RESUME_SETUP_DIALOG";
    private static final int m = 2011;
    protected String b;
    protected String c;
    protected HomeNavigationItem d;
    private e k;
    private final BroadcastReceiver n = new BroadcastReceiver() {

        final HomeActivity a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.home.ui.HomeActivity.a(a);
        }

            
            {
                a = HomeActivity.this;
                super();
            }
    };
    private BroadcastReceiver o;
    private final BroadcastReceiver p = new BroadcastReceiver() {

        final HomeActivity a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.home.ui.HomeActivity.c(a);
        }

            
            {
                a = HomeActivity.this;
                super();
            }
    };

    public HomeActivity()
    {
        o = new BroadcastReceiver() {

            final HomeActivity a;

            public void onReceive(Context context, Intent intent)
            {
                LocalBroadcastManager.getInstance(a).unregisterReceiver(com.fitbit.home.ui.HomeActivity.b(a));
                context = a.getString(0x7f080286);
                com.fitbit.ui.s.a(a, context, 1).i();
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, int j)
    {
        return d(context, j, null);
    }

    public static void a(Context context)
    {
        HomeActivity_.f(context).a(0x4000000).b("force_logout").b();
    }

    public static void a(Context context, int j, HomeNavigationItem homenavigationitem)
    {
        HomeActivity_.f(context).a(0x4000000 | j).a(homenavigationitem).b();
    }

    public static void a(Context context, int j, HomeNavigationItem homenavigationitem, String s1)
    {
        HomeActivity_.f(context).a(0x4000000 | j).a(homenavigationitem).b(s1).b();
    }

    public static void a(Context context, int j, HomeNavigationItem homenavigationitem, String s1, String s2)
    {
        HomeActivity_.f(context).a(0x4000000 | j).a(homenavigationitem).a(s2).b(s1).b();
    }

    public static void a(Context context, HomeNavigationItem homenavigationitem)
    {
        HomeActivity_.f(context).a(0x4000000).a(homenavigationitem).b();
    }

    public static void a(Context context, HomeNavigationItem homenavigationitem, String s1)
    {
        HomeActivity_.f(context).a(0x4000000).a(homenavigationitem).a(s1).b();
    }

    private void a(Intent intent)
    {
        if (r())
        {
            return;
        }
        if (!"kill".equals(c)) goto _L2; else goto _L1
_L1:
        finish();
_L4:
        c = null;
        return;
_L2:
        if ("notification".equals(c))
        {
            PushNotificationsController.a(this);
            intent = (DashboardPagerFragment)getSupportFragmentManager().findFragmentByTag(com.fitbit.home.ui.HomeNavigationItem.a.name());
            if (intent != null)
            {
                intent.h();
            } else
            {
                com.fitbit.savedstate.c.a(com.fitbit.util.o.b());
            }
            o();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(HomeActivity homeactivity)
    {
        homeactivity.o();
    }

    static BroadcastReceiver b(HomeActivity homeactivity)
    {
        return homeactivity.o;
    }

    public static Intent b(Context context, HomeNavigationItem homenavigationitem)
    {
        return HomeActivity_.f(context).a(0x4000000).a(homenavigationitem).a();
    }

    public static void b(Context context)
    {
        HomeActivity_.f(context).a(0x4000000).b("kill").b();
    }

    public static void b(Context context, int j, HomeNavigationItem homenavigationitem)
    {
        TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(context);
        taskstackbuilder.addNextIntent(HomeActivity_.f(context).a(0x4000000 | j).a(homenavigationitem).a());
        taskstackbuilder.addNextIntent(SleepLoggingLandingActivity.a(context));
        taskstackbuilder.addNextIntent(SleepRecordActivity.a(context));
        try
        {
            taskstackbuilder.startActivities();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.fitbit.e.a.f(com/fitbit/home/ui/HomeActivity.getName(), "Unable to start activities", context, new Object[0]);
        }
    }

    public static void c(Context context)
    {
        a(context, ((HomeNavigationItem) (null)));
    }

    public static void c(Context context, int j, HomeNavigationItem homenavigationitem)
    {
        HomeActivity_.f(context).a(0x4000000 | j).a(homenavigationitem).b();
        ChooseTrackerActivity.a((Activity)context, 4904);
    }

    static void c(HomeActivity homeactivity)
    {
        homeactivity.m();
    }

    public static Intent d(Context context)
    {
        return HomeActivity_.f(context).a(0x4000000).a();
    }

    public static Intent d(Context context, int j, HomeNavigationItem homenavigationitem)
    {
        return HomeActivity_.f(context).a(j).a(homenavigationitem).a();
    }

    public static void e(Context context)
    {
        HomeActivity_.f(context).a(0x4000000).b("logout").b();
    }

    private void m()
    {
        NavigationItem navigationitem = this.j.a(com.fitbit.home.ui.HomeNavigationItem.c);
        int j = ah.a().g();
        if (navigationitem != null && navigationitem.e() != j)
        {
            navigationitem.b(j);
            this.j.d();
        }
        navigationitem = this.j.a(com.fitbit.home.ui.HomeNavigationItem.b);
        j = i.a().e();
        if (navigationitem != null && navigationitem.e() != j)
        {
            navigationitem.b(j);
            this.j.d();
        }
    }

    private IntentFilter n()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.data.bl.SyncNotificationsTask.BROADCAST_ACTION");
        intentfilter.addAction("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.SYNC_BROADCAST_ACTION");
        return intentfilter;
    }

    private void o()
    {
        startService(dy.a(getApplicationContext(), false));
        startService(ff.a(getApplicationContext()));
    }

    private void p()
    {
    }

    private void q()
    {
        String s1;
        com.google.android.gcm.b.a(this);
        com.google.android.gcm.b.b(this);
        s1 = com.google.android.gcm.b.g(FitBitApplication.a());
        if (s1.equals(""))
        {
            if (com.fitbit.savedstate.d.j())
            {
                com.google.android.gcm.b.a(FitBitApplication.a(), new String[] {
                    "625585532877"
                });
                return;
            }
            break MISSING_BLOCK_LABEL_123;
        }
        try
        {
            com.fitbit.e.a.a("GCMReg", s1, new Object[0]);
            if (!com.fitbit.savedstate.d.j())
            {
                com.google.android.gcm.b.c(this);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            com.fitbit.e.a.a("GCMReg", "The device does not support GCM", new Object[0]);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            if (com.fitbit.config.b.a.b())
            {
                com.fitbit.e.a.a("GCMReg", "The device does not support GCM", new Object[0]);
                return;
            } else
            {
                throw illegalstateexception;
            }
        }
        startService(at.b(FitBitApplication.a()));
        return;
    }

    private boolean r()
    {
        if ("logout".equals(c))
        {
            finish();
            LandingActivity.a(this);
            return true;
        }
        if ("force_logout".equals(c) || !an.a().g())
        {
            dg.d().c(false);
            k.a(true);
            return true;
        } else
        {
            return false;
        }
    }

    private void s()
    {
label0:
        {
            if (com.fitbit.savedstate.k.j())
            {
                if (!com.fitbit.util.p.d().isEmpty())
                {
                    break label0;
                }
                TrackerType trackertype = com.fitbit.savedstate.k.k();
                Date date = com.fitbit.savedstate.k.n();
                Date date1 = UISavedState.u();
                boolean flag;
                if (date1.after(date) || date1.equals(date))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (trackertype != null && flag)
                {
                    ResumeDeviceSetupDialogFragment resumedevicesetupdialogfragment = com.fitbit.home.ui.ResumeDeviceSetupDialogFragment.a(bh.a(this, 0x7f080489, new String[] {
                        trackertype.a()
                    }));
                    resumedevicesetupdialogfragment.b(new com.fitbit.util.SimpleConfirmDialogFragment.a(trackertype) {

                        final TrackerType a;
                        final HomeActivity b;

                        public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            ConfirmDeviceActivity.a(b, 2011, a);
                        }

                        public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            com.fitbit.savedstate.k.l();
                        }

                        public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                        {
                            com.fitbit.savedstate.k.m();
                        }

            
            {
                b = HomeActivity.this;
                a = trackertype;
                super();
            }
                    });
                    ad.a(getSupportFragmentManager(), "com.fitbit.home.ui.TAG_RESUME_SETUP_DIALOG", resumedevicesetupdialogfragment);
                }
            }
            return;
        }
        com.fitbit.savedstate.k.l();
    }

    private void t()
    {
        if (!UISavedState.o())
        {
            UISavedState.a(true);
            com.fitbit.home.ui.d.a(this);
        }
    }

    protected void d()
    {
        super.d();
        a(getIntent());
    }

    protected Toolbar e()
    {
        return (Toolbar)findViewById(0x7f11012c);
    }

    public boolean f()
    {
        return U().c();
    }

    protected void g()
    {
        k.a(false);
    }

    public void onActivityResult(int j, int i1, Intent intent)
    {
        super.onActivityResult(j, i1, intent);
        if (j == 4001)
        {
            if (i1 == 0 && intent != null && intent.getExtras() != null && intent.hasExtra("com.fitbit.device.ui.DevicesFragment.EXTRA_DEVICE_DETAILS_PENDING_MESSAGE"))
            {
                com.fitbit.ui.s.a(this, intent.getExtras().getString("com.fitbit.device.ui.DevicesFragment.EXTRA_DEVICE_DETAILS_PENDING_MESSAGE"), 1).i();
            }
        } else
        {
            if (j == 4904 && i1 == 0 && intent != null && intent.getExtras() != null && intent.hasExtra("com.fitbit.onboarding.setup.ChooseTrackerActivity.EXTRA_PENDING_MESSAGE"))
            {
                com.fitbit.ui.s.a(this, intent.getStringExtra("com.fitbit.onboarding.setup.ChooseTrackerActivity.EXTRA_PENDING_MESSAGE"), 1).i();
            }
            if (intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_CANCEL_RESULT_REASON"))
            {
                com.fitbit.ui.s.a(this, intent.getExtras().getString("EXTRA_CANCEL_RESULT_REASON"), 1).i();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!an.a().g())
        {
            LandingActivity_.a(this);
            finish();
        }
        k = new e(this);
        p();
        q();
    }

    protected void onNewIntent(Intent intent)
    {
        b = null;
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
        a(d);
    }

    protected void onPause()
    {
        super.onPause();
        k.b();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(n);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(o);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(p);
        com.fitbit.savedstate.k.a(com.fitbit.util.o.b());
    }

    protected void onPostResume()
    {
        super.onPostResume();
    }

    protected void onResume()
    {
        super.onResume();
        k.a();
        LocalBroadcastManager.getInstance(this).registerReceiver(n, new IntentFilter("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES"));
        LocalBroadcastManager.getInstance(this).registerReceiver(o, new IntentFilter("com.fitbit.serverinteraction.validators.Validators.ACTION_INCORRECT_TIMESTAMP"));
        LocalBroadcastManager.getInstance(this).registerReceiver(p, n());
        m();
        Date date = com.fitbit.savedstate.k.h();
        if (date != null && !com.fitbit.util.o.j(date, com.fitbit.util.o.b()))
        {
            com.fitbit.savedstate.c.a(com.fitbit.util.o.b());
            o();
        }
        com.fitbit.multipledevice.a.a().d();
        if (b != null)
        {
            com.fitbit.ui.s.a(this, b, 1).i();
            b = null;
        }
        s();
        t();
        TrackerSyncPreferencesSavedState.b(this);
    }

    protected void onStart()
    {
        super.onStart();
    }
}
