// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.Loader;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.challenges.ui.ChallengeActivity;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.l;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.home.ui.HomeNavigationItem;
import com.fitbit.mixpanel.f;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.onboarding.login.LoginActivity;
import com.fitbit.onboarding.setup.CheckDeviceActivity;
import com.fitbit.pedometer.e;
import com.fitbit.profile.ui.badges.BadgeDetailActivity;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.ui.RecordExerciseSessionActivity;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.d;
import com.fitbit.savedstate.r;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.synclair.c;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.b;
import com.fitbit.ui.s;
import com.fitbit.util.bf;
import com.fitbit.util.k;
import java.util.List;

// Referenced classes of package com.fitbit.onboarding.landing:
//            LandingActivity_, b, a, NetworkAccessActivity, 
//            SensitiveDataAccessActivity, CaptionView

public class LandingActivity extends OnboardingFragmentActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    public static final String a = "com.fitbit.onboarding.landing.LandingActivity.INIT_BADGE_EXTRA";
    private static final String h = "LandingActivity";
    private static final String j = "widget";
    private static final String k = "widget_accessed";
    private static final int l = 9987;
    private static final int m = 9988;
    private static final int n = 9989;
    protected View b;
    protected View c;
    protected CaptionView d;
    protected CaptionView e;
    protected Button f;
    protected Button g;
    private final Runnable i = new Runnable() {

        final LandingActivity a;

        public void run()
        {
            com.fitbit.e.a.a("LandingActivity", "Pedometer support check finished", new Object[0]);
            if (!com.fitbit.onboarding.landing.LandingActivity.a(a)) goto _L2; else goto _L1
_L1:
            if (ApplicationForegroundController.a().a(400L)) goto _L4; else goto _L3
_L3:
            a.finish();
_L5:
            return;
_L4:
            if (com.fitbit.onboarding.landing.LandingActivity.b(a)) goto _L5; else goto _L2
_L2:
            com.fitbit.onboarding.landing.LandingActivity.c(a);
            return;
        }

            
            {
                a = LandingActivity.this;
                super();
            }
    };
    private final Handler o = new Handler();
    private View p;
    private com.fitbit.onboarding.landing.a q;
    private com.fitbit.onboarding.landing.b r;
    private int s[];
    private String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final Runnable x = new Runnable() {

        final LandingActivity a;

        public void run()
        {
            LandingActivity.h(a).b();
            LandingActivity.i(a).b();
            LandingActivity.g(a).postDelayed(LandingActivity.j(a), 3000L);
        }

            
            {
                a = LandingActivity.this;
                super();
            }
    };

    public LandingActivity()
    {
    }

    public static void a(Context context)
    {
        Intent intent = com.fitbit.onboarding.landing.LandingActivity_.b(context).a();
        intent.setFlags(0x14000000);
        context.startActivity(intent);
    }

    private void a(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getData();
            if (intent != null)
            {
                com.fitbit.savedstate.d.d(intent.toString());
            }
        }
    }

    static boolean a(LandingActivity landingactivity)
    {
        return landingactivity.j();
    }

    private boolean a(boolean flag)
    {
        boolean flag2 = false;
        String s1 = com.fitbit.savedstate.d.o();
        boolean flag3 = n();
        boolean flag1 = flag2;
        if (s1 != null)
        {
            flag1 = flag2;
            if (flag3)
            {
                Object obj1 = Uri.parse(s1);
                flag1 = flag2;
                if (obj1 != null)
                {
                    Object obj = ((Uri) (obj1)).getPathSegments();
                    if (obj != null && ((List) (obj)).size() > 1)
                    {
                        flag1 = flag2;
                        if (((String)((List) (obj)).get(0)).equals("challenges"))
                        {
                            com.fitbit.e.a.d("LandingActivity", "App Launched by Challenges", new Object[0]);
                            obj = (String)((List) (obj)).get(1);
                            Exception exception;
                            String s2;
                            TaskStackBuilder taskstackbuilder;
                            if (obj != null)
                            {
                                TaskStackBuilder.create(this).addNextIntent(HomeActivity.b(this, HomeNavigationItem.a).addFlags(0x4000000)).addNextIntent(ChallengeActivity.a(this, ((String) (obj)), true).addFlags(0x4000000)).startActivities();
                                com.fitbit.savedstate.d.p();
                                if (flag)
                                {
                                    finish();
                                }
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            flag1 = flag;
                        }
                    } else
                    {
                        flag1 = flag2;
                        if (((String)((List) (obj)).get(0)).equals("friendDeepLinkingInvitation"))
                        {
                            obj = ((Uri) (obj1)).getQueryParameter("senderId");
                            obj1 = ((Uri) (obj1)).getQueryParameter("u");
                            s2 = an.a().b().F();
                            flag1 = flag2;
                            if (obj != null)
                            {
                                taskstackbuilder = TaskStackBuilder.create(this);
                                taskstackbuilder.addNextIntent(HomeActivity.b(this, HomeNavigationItem.a));
                                if (s2 != null && s2.equals(obj1))
                                {
                                    taskstackbuilder.addNextIntent(ProfileActivity.a(this, ((String) (obj))));
                                }
                                try
                                {
                                    taskstackbuilder.startActivities();
                                }
                                // Misplaced declaration of an exception variable
                                catch (Exception exception)
                                {
                                    com.fitbit.e.a.f("LandingActivity", "Unable to start activities", exception, new Object[0]);
                                }
                                com.fitbit.savedstate.d.p();
                                if (flag)
                                {
                                    finish();
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return flag1;
    }

    static boolean b(LandingActivity landingactivity)
    {
        return landingactivity.k();
    }

    static void c(LandingActivity landingactivity)
    {
        landingactivity.o();
    }

    static void d(LandingActivity landingactivity)
    {
        landingactivity.r();
    }

    static void e(LandingActivity landingactivity)
    {
        landingactivity.t();
    }

    static Runnable f(LandingActivity landingactivity)
    {
        return landingactivity.i;
    }

    private void f()
    {
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final LandingActivity a;

            public void onClick(View view)
            {
                com.fitbit.onboarding.landing.LandingActivity.d(a);
            }

            
            {
                a = LandingActivity.this;
                super();
            }
        });
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final LandingActivity a;

            public void onClick(View view)
            {
                com.fitbit.onboarding.landing.LandingActivity.e(a);
            }

            
            {
                a = LandingActivity.this;
                super();
            }
        });
    }

    static Handler g(LandingActivity landingactivity)
    {
        return landingactivity.o;
    }

    private void g()
    {
        r.a();
        q.a();
        v = true;
        w = false;
        o.removeCallbacks(x);
        o.postDelayed(x, 1500L);
        com.fitbit.e.a.a("LandingActivity", "Checking pedometer support", new Object[0]);
        com.fitbit.pedometer.e.a(new com.fitbit.pedometer.e.b() {

            final LandingActivity a;

            public void a(e e1)
            {
                LandingActivity.g(a).post(com.fitbit.onboarding.landing.LandingActivity.f(a));
            }

            public volatile void a(Object obj)
            {
                a((e)obj);
            }

            
            {
                a = LandingActivity.this;
                super();
            }
        }, false);
    }

    static com.fitbit.onboarding.landing.b h(LandingActivity landingactivity)
    {
        return landingactivity.r;
    }

    private void h()
    {
        Object obj = getResources().getDrawable(0x7f020226);
        Object obj1 = getResources().getDrawable(0x7f020222);
        Object obj2 = getResources().getDrawable(0x7f020223);
        Object obj3 = getResources().getDrawable(0x7f020224);
        Object obj4 = getResources().getDrawable(0x7f020225);
        r = new com.fitbit.onboarding.landing.b(b, c, new Drawable[] {
            obj, obj1, obj2, obj3, obj4
        });
        r.a();
        obj = new a.a(0x7f080384, 0);
        obj1 = new a.a(0x7f08037f, 0x7f0202c0);
        obj2 = new a.a(0x7f080380, 0x7f0202c2);
        obj3 = new a.a(0x7f080383, 0x7f0202c5);
        obj4 = new a.a(0x7f080381, 0x7f0202c4);
        CaptionView captionview = d;
        CaptionView captionview1 = e;
        q = new com.fitbit.onboarding.landing.a(new a.a[] {
            obj, obj1, obj2, obj3, obj4
        }, captionview, captionview1);
        q.a();
    }

    static com.fitbit.onboarding.landing.a i(LandingActivity landingactivity)
    {
        return landingactivity.q;
    }

    private boolean i()
    {
        boolean flag = false;
        Intent intent = getIntent();
        if (intent.hasExtra("com.fitbit.onboarding.landing.LandingActivity.INIT_BADGE_EXTRA"))
        {
            TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(this);
            taskstackbuilder.addNextIntent(BadgeDetailActivity.a(this, intent.getStringExtra("com.fitbit.onboarding.landing.LandingActivity.INIT_BADGE_EXTRA"), null).addFlags(0x10000000));
            try
            {
                taskstackbuilder.startActivities(null);
            }
            catch (Exception exception)
            {
                com.fitbit.e.a.f("LandingActivity", "Unable to start activities", exception, new Object[0]);
            }
            finish();
            flag = true;
        }
        return flag;
    }

    static Runnable j(LandingActivity landingactivity)
    {
        return landingactivity.x;
    }

    private boolean j()
    {
        if (com.fitbit.profile.a.b(getIntent()))
        {
            com.fitbit.profile.a.a().a(getIntent());
            return true;
        } else
        {
            return false;
        }
    }

    private boolean k()
    {
        int i1;
        if (com.fitbit.profile.a.a().b() != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = getIntent().getFlags();
            if ((i1 & 0x10000000) == 0)
            {
                Intent intent = com.fitbit.onboarding.landing.LandingActivity_.b(this).a();
                intent.putExtras(getIntent());
                intent.setFlags(i1 | 0x10000000);
                startActivity(intent);
                finish();
                return true;
            }
        }
        return false;
    }

    private boolean l()
    {
        if (com.fitbit.savedstate.d.m())
        {
            LoginActivity.a(this);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean m()
    {
        if (!u)
        {
            if (!com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.b))
            {
                S().d();
                com.fitbit.onboarding.landing.NetworkAccessActivity.b(this, 9989);
                return true;
            }
            if (!com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.d))
            {
                S().d();
                com.fitbit.onboarding.landing.SensitiveDataAccessActivity.b(this, 9989);
                return true;
            }
        }
        return false;
    }

    private boolean n()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            an an1 = an.a();
            flag = flag1;
            if (an1 == null)
            {
                break label0;
            }
            if (!an1.g())
            {
                flag = flag1;
                if (!an1.i())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private void o()
    {
        if (v && !m())
        {
            if (n())
            {
                p();
            } else
            {
                p.setVisibility(0);
                if (v)
                {
                    com.fitbit.mixpanel.f.c("App: Launch Screen");
                    return;
                }
            }
        }
    }

    private void p()
    {
        if (!l())
        {
            if (com.fitbit.synclair.c.j().D())
            {
                SynclairActivity.a(this, com.fitbit.synclair.c.j().k());
                return;
            }
            com.fitbit.synclair.b b1 = com.fitbit.synclair.b.j();
            if (b1.E())
            {
                SynclairActivity.a(this, b1.g().c(), b1.h());
                return;
            }
            if (!a(true))
            {
                q();
                return;
            }
        }
    }

    private void q()
    {
        com.fitbit.util.k.b();
        com.fitbit.data.bl.l.a(this);
        boolean flag;
        if (com.fitbit.profile.a.a().b() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && com.fitbit.savedstate.r.j())
        {
            HomeActivity.b(this, 0x4000000, HomeNavigationItem.a);
        } else
        if (flag)
        {
            HomeActivity.a(this, 0x10000000, HomeNavigationItem.a);
        } else
        if (t != null)
        {
            HomeActivity.a(this, HomeNavigationItem.a, t);
            t = null;
        } else
        {
            HomeActivity.a(this, HomeNavigationItem.a);
        }
        finish();
    }

    private void r()
    {
        if (v && !w)
        {
            UISavedState.d(true);
            LoginActivity.b(this, 9987);
            w = true;
        }
    }

    private void s()
    {
        if (v && !w)
        {
            CheckDeviceActivity.a(this, 9988);
            w = true;
        }
    }

    private void t()
    {
        boolean flag = com.fitbit.util.k.a();
        com.fitbit.e.a.a("LandingActivity", "Join allowed by coppa = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag)
        {
            s();
            return;
        } else
        {
            com.fitbit.util.k.a(this, false);
            return;
        }
    }

    protected void a(int i1, Intent intent)
    {
        if (i1 == -1)
        {
            if (com.fitbit.bluetooth.support.a.a().b() != null)
            {
                HomeActivity.c(this, 0x4000000, HomeNavigationItem.a);
                finish();
            }
        } else
        if (i1 == 0 && intent != null && intent.getExtras() != null && intent.hasExtra("com.fitbit.onboarding.setup.EXTRA_CHECK_DEVICE_ACTIVITY_MESSAGE"))
        {
            com.fitbit.ui.s.a(this, intent.getStringExtra("com.fitbit.onboarding.setup.EXTRA_CHECK_DEVICE_ACTIVITY_MESSAGE"), 1).i();
            return;
        }
    }

    public void a(Loader loader, List list)
    {
        if (list.isEmpty())
        {
            g();
            return;
        } else
        {
            startActivity(RecordExerciseSessionActivity.a(this, (ExerciseSession)list.get(0)));
            return;
        }
    }

    protected void b(int i1, Intent intent)
    {
        if (i1 == 0)
        {
            u = true;
            finish();
        } else
        if (i1 == -1)
        {
            o();
            return;
        }
    }

    protected void c(int i1, Intent intent)
    {
        if (i1 == -1)
        {
            p();
        }
    }

    protected void d()
    {
        p = findViewById(0x1020002);
        p.setBackgroundColor(0xff0000ff);
        p.setVisibility(4);
        h();
        f();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(1);
        window.addFlags(4096);
        getWindow().setFlags(0x1000000, 0x1000000);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("id", 0) == 0x7f110023)
        {
            FitBitApplication.a().c().a(0x7f11000b).a("widget", "widget_accessed", null, 0);
        }
        a(getIntent());
        while (i() || (getIntent().getFlags() & 0x400000) == 0) 
        {
            return;
        }
        a(false);
        finish();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bf(this) {

            final LandingActivity a;

            protected List a()
            {
                return (new com.fitbit.runtrack.data.b()).a(com.fitbit.runtrack.data.ExerciseSession.Status.b);
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                a = LandingActivity.this;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }

    protected void onPause()
    {
        super.onPause();
        v = false;
        o.removeCallbacks(x);
    }

    protected void onResume()
    {
        super.onResume();
        getSupportLoaderManager().restartLoader(0x7f1103f5, null, this);
    }

    protected void onStop()
    {
        super.onStop();
        r.a();
        q.a();
    }
}
