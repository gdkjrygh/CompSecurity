// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.i;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.drawer.NavigationDrawerActivity;
import com.fitbit.ui.drawer.NavigationItem;
import com.fitbit.ui.drawer.a;
import com.fitbit.ui.drawer.c;
import com.fitbit.util.p;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationItem, a

public abstract class HomeNavigationDrawerActivity extends NavigationDrawerActivity
{

    private static final HomeNavigationItem a;
    private static final String b = "dashboard";
    private static final String c = "HomeNavigationDrawerActivity";
    public static final String h = "com.fitbit.home.ui.ACTION_SIDE_BAR_DATASET_CHANGED";
    private Handler d;
    private boolean e;
    private Fragment f;
    private long g;
    protected HomeNavigationItem i;
    private com.fitbit.util.threading.c k;

    public HomeNavigationDrawerActivity()
    {
        d = new Handler();
        e = true;
        g = 0L;
        k = new com.fitbit.util.threading.c() {

            final HomeNavigationDrawerActivity a;

            protected void a(Intent intent)
            {
                com.fitbit.home.ui.HomeNavigationDrawerActivity.a(a);
            }

            
            {
                a = HomeNavigationDrawerActivity.this;
                super();
            }
        };
    }

    static void a(HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        homenavigationdraweractivity.p();
    }

    private void a(NavigationItem navigationitem)
    {
        int l = com.fitbit.data.bl.i.a().e();
        if (navigationitem != null && navigationitem.e() != l)
        {
            navigationitem.b(l);
        }
    }

    private void a(Runnable runnable)
    {
        if (runnable != null)
        {
            d.removeCallbacksAndMessages(null);
            Handler handler = d;
            long l;
            if (e)
            {
                l = 250L;
            } else
            {
                l = 0L;
            }
            handler.postDelayed(runnable, l);
            e = true;
        }
    }

    static void b(HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        homenavigationdraweractivity.m();
    }

    private void b(NavigationItem navigationitem)
    {
        int l = ah.a().g();
        if (navigationitem != null && navigationitem.e() != l)
        {
            navigationitem.b(l);
        }
    }

    static Fragment c(HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        return homenavigationdraweractivity.f;
    }

    static void d(HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        homenavigationdraweractivity.q();
    }

    private void d(HomeNavigationItem homenavigationitem)
    {
        if (homenavigationitem != null)
        {
            Fragment fragment = homenavigationitem.f();
            if (fragment != null)
            {
                a(new Runnable(fragment, homenavigationitem) {

                    final Fragment a;
                    final HomeNavigationItem b;
                    final HomeNavigationDrawerActivity c;

                    public void run()
                    {
                        FragmentTransaction fragmenttransaction = c.getSupportFragmentManager().beginTransaction();
                        fragmenttransaction.hide(com.fitbit.home.ui.HomeNavigationDrawerActivity.c(c));
                        com.fitbit.home.ui.HomeNavigationDrawerActivity.c(c).setUserVisibleHint(false);
                        if (c.i != null && c.i != HomeNavigationDrawerActivity.k())
                        {
                            Fragment fragment1 = c.getSupportFragmentManager().findFragmentByTag(c.i.name());
                            if (fragment1 != null)
                            {
                                fragmenttransaction.remove(fragment1);
                                fragment1.setUserVisibleHint(false);
                            }
                        }
                        fragmenttransaction.add(0x7f11017f, a, b.name());
                        fragmenttransaction.setTransition(4097);
                        fragmenttransaction.commitAllowingStateLoss();
                        c.getSupportFragmentManager().executePendingTransactions();
                        a.setUserVisibleHint(true);
                        c.i = b;
                        com.fitbit.home.ui.HomeNavigationDrawerActivity.d(c);
                        HomeNavigationDrawerActivity.e(c).a(c.h());
                    }

            
            {
                c = HomeNavigationDrawerActivity.this;
                a = fragment;
                b = homenavigationitem;
                super();
            }
                });
            }
        }
    }

    private Fragment e(HomeNavigationItem homenavigationitem)
    {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(homenavigationitem.name());
        if (fragment == null)
        {
            f = homenavigationitem.f();
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f11017f, f, homenavigationitem.name());
            fragmenttransaction.commit();
        } else
        {
            f = fragment;
        }
        j.a(a.ordinal(), false);
        return fragment;
    }

    static a e(HomeNavigationDrawerActivity homenavigationdraweractivity)
    {
        return homenavigationdraweractivity.j;
    }

    private boolean f()
    {
        if (i != a)
        {
            a(new Runnable() {

                final HomeNavigationDrawerActivity a;

                public void run()
                {
                    HomeNavigationDrawerActivity.b(a);
                }

            
            {
                a = HomeNavigationDrawerActivity.this;
                super();
            }
            });
            j.a(h());
            return true;
        } else
        {
            return false;
        }
    }

    static HomeNavigationItem k()
    {
        return a;
    }

    private void m()
    {
        com.fitbit.home.ui.a.a().b();
        n();
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(a.name());
        if (fragment == null)
        {
            f = a.f();
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f11017f, f, a.name());
            fragmenttransaction.commit();
        } else
        {
            f = fragment;
            FragmentTransaction fragmenttransaction1 = getSupportFragmentManager().beginTransaction();
            fragmenttransaction1.show(fragment);
            if (i != null && i != a)
            {
                Fragment fragment1 = getSupportFragmentManager().findFragmentByTag(i.name());
                if (fragment1 != null)
                {
                    fragmenttransaction1.remove(fragment1);
                    fragmenttransaction1.setTransition(8194);
                    fragment1.setUserVisibleHint(false);
                }
            }
            fragmenttransaction1.commit();
        }
        f.setUserVisibleHint(true);
        j.a(a.ordinal(), false);
        i = a;
        setTitle(i.b());
        q();
    }

    private void n()
    {
        if (an.a().g() && System.currentTimeMillis() - g > 5000L)
        {
            g = System.currentTimeMillis();
            com.fitbit.mixpanel.f.c("Dash: View Dashboard");
            com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.a);
            FitBitApplication.a().c().a(0x7f11000a).a("dashboard");
        }
    }

    private void o()
    {
        if (i != null && i != a)
        {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag(i.name());
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.hide(f);
            if (fragment != null)
            {
                fragmenttransaction.show(fragment);
            } else
            {
                fragmenttransaction.add(0x7f11017f, i.f(), i.name());
            }
            fragmenttransaction.commit();
            j.a(i.ordinal() - i.a(), false);
        }
    }

    private void p()
    {
        com.fitbit.e.a.a("HomeNavigationDrawerActivity", "updateSidebar", new Object[0]);
        a(j.a(HomeNavigationItem.b));
        b(j.a(com.fitbit.home.ui.HomeNavigationItem.c));
        j.d();
    }

    private void q()
    {
        if (i == com.fitbit.home.ui.HomeNavigationItem.c)
        {
            getSupportActionBar().setElevation(0.0F);
            return;
        } else
        {
            getSupportActionBar().setElevation(getResources().getDimension(0x7f0a00ab));
            return;
        }
    }

    protected final void a(HomeNavigationItem homenavigationitem)
    {
        if (homenavigationitem == a)
        {
            m();
        } else
        if (homenavigationitem != null)
        {
            j.a(homenavigationitem.ordinal() - homenavigationitem.a(), true);
            return;
        }
    }

    public void a(NavigationItem navigationitem, int l)
    {
        navigationitem = (HomeNavigationItem)navigationitem.b();
        if (navigationitem.d() == com.fitbit.ui.drawer.NavigationItem.RunAs.a)
        {
            if (navigationitem == a)
            {
                f();
                return;
            } else
            {
                d(navigationitem);
                return;
            }
        }
        if (navigationitem != com.fitbit.home.ui.HomeNavigationItem.i)
        {
            b(navigationitem);
            return;
        } else
        {
            g();
            return;
        }
    }

    protected final void b(HomeNavigationItem homenavigationitem)
    {
        a(new Runnable(homenavigationitem) {

            final HomeNavigationItem a;
            final HomeNavigationDrawerActivity b;

            public void run()
            {
                a.a(b);
            }

            
            {
                b = HomeNavigationDrawerActivity.this;
                a = homenavigationitem;
                super();
            }
        });
    }

    protected void d()
    {
        super.d();
        e(a);
        o();
        if (i == null)
        {
            i = a;
        }
        if (an.a().j())
        {
            FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.h, new Runnable() {

                final HomeNavigationDrawerActivity a;

                public void run()
                {
                    try
                    {
                        com.fitbit.e.a.a("HomeNavigationDrawerActivity", "Start data load", new Object[0]);
                        dg.d().j(false, null);
                        com.fitbit.e.a.a("HomeNavigationDrawerActivity", "Completed data load", new Object[0]);
                        return;
                    }
                    catch (Exception exception)
                    {
                        com.fitbit.e.a.f("HomeNavigationDrawerActivity", "Unable to load data", exception, new Object[0]);
                    }
                }

            
            {
                a = HomeNavigationDrawerActivity.this;
                super();
            }
            });
        }
    }

    protected abstract void g();

    protected c h()
    {
        c c1;
        HomeNavigationItem ahomenavigationitem[];
        int l;
        int i1;
        int j1;
        l = 0;
        c1 = new c();
        ahomenavigationitem = HomeNavigationItem.values();
        j1 = ahomenavigationitem.length;
        i1 = 0;
_L6:
        HomeNavigationItem homenavigationitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        homenavigationitem = ahomenavigationitem[i1];
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[HomeNavigationItem.values().length];
                try
                {
                    a[HomeNavigationItem.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[HomeNavigationItem.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.home.ui.HomeNavigationItem.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.home.ui._cls6.a[homenavigationitem.ordinal()];
        JVM INSTR tableswitch 1 3: default 68
    //                   1 92
    //                   2 128
    //                   3 186;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_186;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        c1.add(homenavigationitem.e());
        homenavigationitem.a(l);
_L7:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        if (com.fitbit.util.p.a(DeviceFeature.ALARMS))
        {
            c1.add(homenavigationitem.e());
            homenavigationitem.a(l);
        } else
        {
            l++;
        }
          goto _L7
_L3:
        Profile profile = an.a().b();
        if (profile != null && profile.y())
        {
            NavigationItem navigationitem = homenavigationitem.e();
            a(navigationitem);
            c1.add(navigationitem);
            homenavigationitem.a(l);
        } else
        {
            l++;
        }
          goto _L7
        NavigationItem navigationitem1 = homenavigationitem.e();
        b(navigationitem1);
        c1.add(navigationitem1);
        homenavigationitem.a(l);
          goto _L7
        return c1;
    }

    public void i()
    {
        super.i();
        setTitle(0x7f080305);
    }

    public void j()
    {
        setTitle(i.b());
    }

    public void onBackPressed()
    {
        e = false;
        if (!f())
        {
            finish();
        }
    }

    protected void onPause()
    {
        super.onPause();
        k.d();
    }

    protected void onResume()
    {
        super.onResume();
        p();
        k.a(new IntentFilter("com.fitbit.home.ui.ACTION_SIDE_BAR_DATASET_CHANGED"));
        if (j.e())
        {
            setTitle(0x7f080305);
        }
        if (i == a)
        {
            com.fitbit.home.ui.a.a().b();
            n();
            if (f != null)
            {
                f.setUserVisibleHint(true);
            }
        } else
        if (f != null)
        {
            f.setUserVisibleHint(false);
            return;
        }
    }

    static 
    {
        a = com.fitbit.home.ui.HomeNavigationItem.a;
    }
}
