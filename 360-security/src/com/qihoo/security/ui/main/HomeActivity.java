// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.content.g;
import android.support.v4.view.j;
import android.support.v7.app.ActionBar;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mobvista.sdk.m.core.MobvistaAd;
import com.mobvista.sdk.m.core.MobvistaAdWall;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.appbox.core.d;
import com.qihoo.security.gamebooster.GamesBoostSettingListActivity;
import com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.ui.antivirus.VirusScanFragmentV3;
import com.qihoo.security.ui.b.b;
import com.qihoo.security.ui.fragment.a;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.settings.SettingsActivity;
import com.qihoo.security.v7.ColorChangeBackgroundView;
import com.qihoo.security.v7.MaterialMenuView;
import com.qihoo.security.widget.QihooViewPager;
import com.qihoo.security.widget.TabPageIndicator;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.qihoo.security.ui.main:
//            c, BaseHomeFragment, BoosterFragment, FragmentsObservable

public class HomeActivity extends BaseActivity
    implements android.view.View.OnClickListener, com.qihoo.security.ui.main.c
{

    private static final SparseArray ab;
    com.qihoo.security.ui.b.a.f A;
    View B;
    View C;
    View D;
    private TabPageIndicator E;
    private QihooViewPager F;
    private a G;
    private MobvistaAdWall H;
    private MaterialMenuView I;
    private ColorChangeBackgroundView J;
    private ImageView K;
    private boolean L;
    private long M;
    private boolean N;
    private Bundle O;
    private long P;
    private e Q;
    private Menu R;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus S;
    private ExecutorService T;
    private final byte U[] = new byte[0];
    private int V;
    private List W;
    private MenuItem X;
    private final BroadcastReceiver Y = new BroadcastReceiver() {

        final HomeActivity a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                if ("com.qihoo.security.FINISH_MAIN_SCREEN".equals(context))
                {
                    a.finish();
                    return;
                }
                if ("com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context))
                {
                    a.finish();
                    a.startActivity(new Intent(a, com/qihoo/security/ui/main/HomeActivity));
                    return;
                }
                if ("com.qihoo.security.RESET_MAIN_SCREEN".equals(context))
                {
                    a.a(FragmentAction.RESULT_ACTION_FINISH, null);
                    return;
                }
                if ("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion".equals(context))
                {
                    com.qihoo.security.ui.main.HomeActivity.a(a);
                    return;
                }
                if ("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint".equals(context))
                {
                    com.qihoo.security.ui.main.HomeActivity.a(a);
                    return;
                }
            }
        }

            
            {
                a = HomeActivity.this;
                super();
            }
    };
    private final Handler Z = new Handler() {

        final HomeActivity a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                com.qihoo360.mobilesafe.b.q.a().a((String)message.obj);
                break;
            }
        }

            
            {
                a = HomeActivity.this;
                super();
            }
    };
    private final Handler aa = new Handler(SecurityApplication.e()) {

        final HomeActivity a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 2: default 32
        //                       0 32
        //                       1 32
        //                       2 33;
               goto _L1 _L1 _L1 _L2
_L1:
            return;
_L2:
            com.qihoo360.mobilesafe.b.b.a();
            com.qihoo.security.adv.a.a.a().b();
            com.qihoo.security.adv.a.a.a().a(com.qihoo.security.adv.AdvDataManager.AdvType.FaceBookAdvData);
            if (com.qihoo.security.appbox.core.d.a().b())
            {
                com.qihoo.security.ui.main.HomeActivity.b(a);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                a = HomeActivity.this;
                super(looper);
            }
    };
    private boolean ac;
    public int y;
    FragmentsObservable z;

    public HomeActivity()
    {
        M = 0L;
        N = true;
        y = 0;
        P = 0L;
        V = 0;
    }

    private void A()
    {
        aa.postDelayed(new Runnable() {

            final HomeActivity a;

            public void run()
            {
                while (!com.qihoo.security.locale.language.b.a(a.p) || !com.qihoo360.mobilesafe.b.o.g(a.p) || !com.qihoo.security.appbox.core.a.a().b()) 
                {
                    return;
                }
                com.qihoo.security.appbox.core.a.a().a(com.qihoo.security.appbox.core.a.a().a("3"), "3", null);
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        }, 10000L);
    }

    private int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return getResources().getColor(0x7f080058);
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return getResources().getColor(0x7f080057);
        } else
        {
            return getResources().getColor(0x7f080056);
        }
    }

    private void a(long l)
    {
        Object obj = new Intent(getApplicationContext(), getClass());
        obj = PendingIntent.getActivity(getApplicationContext(), 1, ((Intent) (obj)), 0x40000000);
        ((AlarmManager)getApplicationContext().getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + l, ((PendingIntent) (obj)));
    }

    private final void a(View view, boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1)
    {
        int i1 = B.getMeasuredHeight();
        com.nineoldandroids.a.b b1 = new com.nineoldandroids.a.b(flag1, flag, a1) {

            final boolean a;
            final boolean b;
            final com.nineoldandroids.a.a.a c;
            final HomeActivity d;

            public void a(com.nineoldandroids.a.a a2)
            {
                com.qihoo.security.ui.main.HomeActivity.b(d, a, b, c, a2);
            }

            public void b(com.nineoldandroids.a.a a2)
            {
                com.qihoo.security.ui.main.HomeActivity.a(d, a, b, c, a2);
            }

            
            {
                d = HomeActivity.this;
                a = flag;
                b = flag1;
                c = a1;
                super();
            }
        };
        c c1;
        int l;
        long l1;
        if (flag1)
        {
            l = 200;
        } else
        {
            l = 0;
        }
        l1 = l;
        c1 = new c();
        if (flag)
        {
            float f1 = -i1;
            view = new float[2];
            view[0] = i1;
            view[1] = 0.0F;
            a1 = (new float[] {
                0.0F, f1
            });
        } else
        {
            float f2 = -i1;
            view = new float[2];
            view[0] = 0.0F;
            view[1] = i1;
            a1 = (new float[] {
                f2, 0.0F
            });
        }
        a1 = k.a(E, "translationY", a1);
        a1.c(l1);
        view = k.a(C, "translationY", view);
        c1.a(a1).a(view);
        c1.a(b1);
        c1.c(l1).a();
    }

    static void a(HomeActivity homeactivity)
    {
        homeactivity.q();
    }

    static void a(HomeActivity homeactivity, int l)
    {
        homeactivity.e(l);
    }

    static void a(HomeActivity homeactivity, Drawable drawable)
    {
        homeactivity.a(drawable);
    }

    static void a(HomeActivity homeactivity, boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1, com.nineoldandroids.a.a a2)
    {
        homeactivity.b(flag, flag1, a1, a2);
    }

    static void a(HomeActivity homeactivity, int ai[])
    {
        homeactivity.a(ai);
    }

    private final void a(boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1, com.nineoldandroids.a.a a2)
    {
        if (flag)
        {
            byte byte0;
            if (flag1)
            {
                byte0 = 6;
            } else
            {
                byte0 = 7;
            }
            com.qihoo.security.ui.b.b.a(byte0, B);
        }
        B.setVisibility(0);
        D.setVisibility(4);
        C.setVisibility(0);
        if (a1 != null)
        {
            a1.a(a2);
        }
    }

    private void a(int ai[])
    {
        if (ai != null)
        {
            J.a(ai);
            J.setCurrentItem(F.getCurrentItem());
        }
    }

    private void b(Menu menu, int l, int i1)
    {
        if (menu != null)
        {
            menu = menu.findItem(l);
            android.support.v4.view.j.b(menu, 0x7f030024);
            LinearLayout linearlayout = (LinearLayout)android.support.v4.view.j.a(menu);
            ImageView imageview = (ImageView)linearlayout.findViewById(0x7f0b007c);
            K = (ImageView)linearlayout.findViewById(0x7f0b007d);
            if (K != null)
            {
                w();
            }
            imageview.setImageResource(i1);
            imageview.setOnClickListener(new android.view.View.OnClickListener(menu) {

                final MenuItem a;
                final HomeActivity b;

                public void onClick(View view)
                {
                    b.onOptionsItemSelected(a);
                }

            
            {
                b = HomeActivity.this;
                a = menuitem;
                super();
            }
            });
        }
    }

    private void b(View view, boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (I != null)
        {
            if (flag1)
            {
                I.a(com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW);
            } else
            {
                I.setState(com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW);
            }
        }
_L4:
        a(view, flag, flag1, a1);
        return;
_L2:
        if (I != null)
        {
            if (flag1)
            {
                I.a(com.qihoo.security.v7.MaterialMenuDrawable.IconState.BURGER);
            } else
            {
                I.setState(com.qihoo.security.v7.MaterialMenuDrawable.IconState.BURGER);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag)
    {
        if (flag && o() != a(examstatus))
        {
            Q.a();
            Q.a(J.getCurrentColor(), a(examstatus));
            Q.a(new com.qihoo360.mobilesafe.b.e.a() {

                final HomeActivity a;

                public void a(int l)
                {
                    com.qihoo.security.ui.main.HomeActivity.g(a);
                    com.qihoo.security.ui.main.HomeActivity.c(a, l);
                }

                public void setColor(int l)
                {
                    com.qihoo.security.ui.main.HomeActivity.b(a, new ColorDrawable(l));
                    com.qihoo.security.ui.main.HomeActivity.c(a, l);
                    if (com.qihoo.security.ui.main.HomeActivity.d(a) != null)
                    {
                        com.qihoo.security.ui.main.HomeActivity.c(a, new ColorDrawable(0));
                    }
                    int ai[] = com.qihoo.security.ui.main.HomeActivity.e(a);
                    int i1 = com.qihoo.security.ui.main.HomeActivity.f(a).getCurrentItem();
                    if (ai != null && ai.length > 0 && i1 < ai.length)
                    {
                        ai[i1] = l;
                        com.qihoo.security.ui.main.HomeActivity.a(a, ai);
                    }
                }

            
            {
                a = HomeActivity.this;
                super();
            }
            });
            return;
        } else
        {
            Q.a();
            u();
            f(a(examstatus));
            return;
        }
    }

    static void b(HomeActivity homeactivity)
    {
        homeactivity.A();
    }

    static void b(HomeActivity homeactivity, int l)
    {
        homeactivity.c(l);
    }

    static void b(HomeActivity homeactivity, Drawable drawable)
    {
        homeactivity.b(drawable);
    }

    static void b(HomeActivity homeactivity, boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1, com.nineoldandroids.a.a a2)
    {
        homeactivity.a(flag, flag1, a1, a2);
    }

    private final void b(boolean flag, boolean flag1, com.nineoldandroids.a.a.a a1, com.nineoldandroids.a.a a2)
    {
        if (flag)
        {
            byte byte0;
            if (flag1)
            {
                byte0 = 6;
            } else
            {
                byte0 = 7;
            }
            com.qihoo.security.ui.b.b.c(byte0);
        }
        if (flag1)
        {
            B.setVisibility(8);
        } else
        {
            C.setVisibility(4);
        }
        D.setVisibility(0);
        if (I != null)
        {
            I.setEnabled(true);
        }
        N = true;
        if (a1 != null)
        {
            a1.b(a2);
        }
    }

    private boolean b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (S == examstatus)
        {
            return false;
        } else
        {
            S = examstatus;
            return true;
        }
    }

    static ColorChangeBackgroundView c(HomeActivity homeactivity)
    {
        return homeactivity.J;
    }

    static void c(HomeActivity homeactivity, int l)
    {
        homeactivity.f(l);
    }

    static void c(HomeActivity homeactivity, Drawable drawable)
    {
        homeactivity.a(drawable);
    }

    private boolean c(Intent intent)
    {
        com.qihoo.security.v7.MaterialMenuDrawable.IconState iconstate = I.getState();
        boolean flag;
        if (iconstate != com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (intent.getBooleanExtra("reset_main_page", false) && iconstate == com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW)
        {
            BaseHomeFragment basehomefragment = p();
            if (basehomefragment != null)
            {
                try
                {
                    basehomefragment.c();
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent.printStackTrace();
                    return false;
                }
                return true;
            }
        }
        if (intent.getBooleanExtra("from_notify", false))
        {
            j();
            return true;
        } else
        {
            return flag;
        }
    }

    private boolean c(boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (I != null)
        {
            if (I.getState() == com.qihoo.security.v7.MaterialMenuDrawable.IconState.ARROW)
            {
                BaseHomeFragment basehomefragment = p();
                flag1 = flag2;
                if (basehomefragment != null)
                {
                    flag1 = true;
                    basehomefragment.c();
                }
            } else
            {
                flag1 = flag2;
                if (flag)
                {
                    startActivity(new Intent(p, com/qihoo/security/ui/settings/SettingsActivity));
                    overridePendingTransition(0x7f040012, 0x7f040008);
                    return false;
                }
            }
        }
        return flag1;
    }

    static ActionBar d(HomeActivity homeactivity)
    {
        return homeactivity.r;
    }

    private void d(boolean flag)
    {
        F.setCanScroll(flag);
        E.setCanClick(flag);
        if (I != null)
        {
            I.setEnabled(flag);
        }
        N = flag;
    }

    private void e(int l)
    {
        if (G != null && G.b() > 0)
        {
            int j1 = G.b();
            int i1 = 0;
            while (i1 < j1) 
            {
                BaseHomeFragment basehomefragment = d(i1);
                if (basehomefragment != null)
                {
                    if (i1 == l)
                    {
                        basehomefragment.a();
                    } else
                    {
                        basehomefragment.h();
                    }
                }
                i1++;
            }
        }
    }

    static int[] e(HomeActivity homeactivity)
    {
        return homeactivity.v();
    }

    static QihooViewPager f(HomeActivity homeactivity)
    {
        return homeactivity.F;
    }

    private void f(int l)
    {
label0:
        {
            synchronized (U)
            {
                if (!isFinishing() && T != null && !T.isShutdown())
                {
                    break label0;
                }
            }
            return;
        }
        T.execute(new Runnable(l) {

            final int a;
            final HomeActivity b;

            public void run()
            {
                HomeActivity homeactivity = b;
                homeactivity;
                JVM INSTR monitorenter ;
                Iterator iterator = HomeActivity.h(b).iterator();
_L2:
                c.a a1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                    a1 = (c.a)((WeakReference)iterator.next()).get();
                } while (a1 == null);
                a1.a(a);
                if (true) goto _L2; else goto _L1
_L1:
                Exception exception1;
                exception1;
                homeactivity;
                JVM INSTR monitorexit ;
                throw exception1;
                homeactivity;
                JVM INSTR monitorexit ;
            }

            
            {
                b = HomeActivity.this;
                a = l;
                super();
            }
        });
        abyte0;
        JVM INSTR monitorexit ;
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void g(HomeActivity homeactivity)
    {
        homeactivity.u();
    }

    static List h(HomeActivity homeactivity)
    {
        return homeactivity.W;
    }

    private void q()
    {
label0:
        {
            if (r != null)
            {
                boolean flag = com.qihoo.security.v5.a.b(p);
                if (I.getState() != com.qihoo.security.v7.MaterialMenuDrawable.IconState.BURGER)
                {
                    break label0;
                }
                b(flag);
            }
            return;
        }
        b(false);
    }

    private void r()
    {
        synchronized (U)
        {
            T = Executors.newSingleThreadExecutor();
        }
        W = new ArrayList();
        obj = getIntent();
        if (obj != null)
        {
            y = ((Intent) (obj)).getIntExtra("fragment_index", y);
            O = ((Intent) (obj)).getExtras();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void s()
    {
        Object obj1 = null;
        F = (QihooViewPager)A.a(0x7f0b0071);
        F.setOffscreenPageLimit(3);
        G = new a(e());
        a a1 = G;
        Context context = p;
        Object obj;
        if (y == 0)
        {
            obj = O;
        } else
        {
            obj = null;
        }
        a1.a(context, 0x7f0c00a8, com/qihoo/security/ui/main/BoosterFragment, ((Bundle) (obj)));
        a1 = G;
        context = p;
        if (y == 1)
        {
            obj = O;
        } else
        {
            obj = null;
        }
        a1.a(context, 0x7f0c00a9, com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment, ((Bundle) (obj)));
        a1 = G;
        context = p;
        obj = obj1;
        if (y == 2)
        {
            obj = O;
        }
        a1.a(context, 0x7f0c00aa, com/qihoo/security/ui/antivirus/VirusScanFragmentV3, ((Bundle) (obj)));
        F.setAdapter(G);
        E = (TabPageIndicator)A.a(0x7f0b0070);
        J = (ColorChangeBackgroundView)A.a(0x7f0b006c);
        B = A.a(0x7f0b006e);
        D = A.a(0x7f0b0072);
        C = A.a(0x7f0b006f);
        obj = new com.qihoo.security.widget.c() {

            final HomeActivity a;

            public void a(int l)
            {
                super.a(l);
                a.y = l;
                com.qihoo.security.ui.main.HomeActivity.a(a, l);
            }

            public void a(int l, float f1, int i1)
            {
                super.a(l, f1, i1);
                com.qihoo.security.ui.main.HomeActivity.b(a, com.qihoo.security.ui.main.HomeActivity.c(a).getCurrentColor());
                com.qihoo.security.ui.main.HomeActivity.a(a, new ColorDrawable(0));
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        };
        E.a(F, ((com.qihoo.security.widget.c) (obj)), y);
        E.setTabSmoothScroll(true);
        J.a(((com.qihoo.security.widget.c) (obj)), new int[] {
            G.b()
        });
        E.setOnTabItemClickListener(new com.qihoo.security.widget.TabPageIndicator.b() {

            final HomeActivity a;

            public boolean a(int l, View view)
            {
                return false;
            }

            
            {
                a = HomeActivity.this;
                super();
            }
        });
        t();
    }

    private void t()
    {
        z = new FragmentsObservable();
        if (G != null && G.b() > 0)
        {
            int i1 = G.b();
            for (int l = 0; l < i1; l++)
            {
                BaseHomeFragment basehomefragment = d(l);
                if (basehomefragment != null)
                {
                    z.addObserver(basehomefragment);
                    basehomefragment.a(z);
                }
            }

        }
    }

    private void u()
    {
        a(v());
        b(new ColorDrawable(J.getCurrentColor()));
        if (r != null)
        {
            a(new ColorDrawable(0));
        }
    }

    private int[] v()
    {
        Object obj = null;
        int ai[] = obj;
        if (G != null)
        {
            ai = obj;
            if (G.b() > 0)
            {
                int i1 = G.b();
                int ai1[] = new int[i1];
                int l = 0;
                do
                {
                    ai = ai1;
                    if (l >= i1)
                    {
                        break;
                    }
                    ai = d(l);
                    if (ai != null)
                    {
                        ai1[l] = a(ai.g());
                    }
                    l++;
                } while (true);
            }
        }
        return ai;
    }

    private void w()
    {
        L = com.qihoo.security.appbox.core.d.a().d();
        SharedPref.a(this, "last_get_red_dot_show_rule_value", com.qihoo.security.appbox.core.d.a().c());
        if (L)
        {
            K.setVisibility(0);
            return;
        } else
        {
            K.setVisibility(8);
            return;
        }
    }

    private void x()
    {
        if (R != null)
        {
            try
            {
                R.findItem(0x7f0b0253).setVisible(false);
            }
            catch (Exception exception) { }
        }
        b(false);
    }

    private void y()
    {
        if (R != null)
        {
            try
            {
                R.findItem(0x7f0b0253).setVisible(true);
            }
            catch (Exception exception) { }
        }
        b(com.qihoo.security.v5.a.b(this));
    }

    private void z()
    {
        if (F != null && G != null)
        {
            int i1 = G.b();
            for (int l = 0; l < i1; l++)
            {
                BaseHomeFragment basehomefragment = d(l);
                if (basehomefragment != null)
                {
                    basehomefragment.i();
                }
            }

        }
    }

    public void a(int l, boolean flag)
    {
        F.a(l, flag);
    }

    public void a(com.nineoldandroids.a.a.a a1)
    {
        a(a1, true);
    }

    public void a(com.nineoldandroids.a.a.a a1, boolean flag)
    {
        d(false);
        b(E, true, flag, a1);
        x();
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag)
    {
        if (b(examstatus) || !flag)
        {
            b(examstatus, flag);
        }
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        com.qihoo.security.profile.j.a().a(-1, 5, (new StringBuilder()).append("frag:").append(F.getCurrentItem()).toString());
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[FragmentAction.values().length];
                try
                {
                    a[FragmentAction.ChangeTab.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[FragmentAction.CLEAN_ACTION_UPDATE_COLOR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_DRAWER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FragmentAction.ACTION_DRAWER_OPEN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FragmentAction.ACTION_DRAWER_CLOSE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.ui.main._cls4.a[fragmentaction.ordinal()];
        JVM INSTR tableswitch 1 8: default 96
    //                   1 97
    //                   2 114
    //                   3 114
    //                   4 114
    //                   5 114
    //                   6 114
    //                   7 96
    //                   8 96;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L1 _L1
_L1:
        return;
_L2:
        if (bundle != null)
        {
            a(bundle.getInt("index"), true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        BaseHomeFragment basehomefragment = p();
        if (basehomefragment != null)
        {
            basehomefragment.a(fragmentaction, bundle);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(c.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = W.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_82;
            }
        } while (!a1.equals((c.a)((WeakReference)iterator.next()).get()));
        boolean flag = true;
_L4:
        if (flag) goto _L1; else goto _L3
_L3:
        W.add(new WeakReference(a1));
          goto _L1
        a1;
        throw a1;
        flag = false;
          goto _L4
    }

    public boolean a(Fragment fragment)
    {
        return F != null && G != null && fragment == p();
    }

    public void a_(String s1)
    {
        b(s1);
    }

    public void b(com.nineoldandroids.a.a.a a1)
    {
        b(a1, true);
    }

    public void b(com.nineoldandroids.a.a.a a1, boolean flag)
    {
        d(true);
        b(((View) (E)), false, flag, a1);
        y();
    }

    public void b_(int l)
    {
        if (R != null && X != null)
        {
            X.setVisible(true);
            a(R, 0x7f0b0254, l);
        }
    }

    public void c_()
    {
        d(false);
    }

    public BaseHomeFragment d(int l)
    {
        BaseHomeFragment basehomefragment;
        try
        {
            basehomefragment = (BaseHomeFragment)G.a(l);
        }
        catch (Exception exception)
        {
            return null;
        }
        return basehomefragment;
    }

    public void d_()
    {
        if (R != null && X != null)
        {
            X.setVisible(false);
        }
    }

    protected String i()
    {
        return "hm";
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            a(new ColorDrawable(0));
            I = q;
            a(com.qihoo.security.v7.MaterialMenuDrawable.IconState.BURGER);
            b(o.a(0x7f0c01d3));
        }
    }

    protected void n()
    {
        c(true);
    }

    public int o()
    {
        int i1 = J.getCurrentColor();
        int l = i1;
        if (i1 == 0)
        {
            l = a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
        }
        return l;
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        switch (i1)
        {
        default:
            return;

        case 200: 
            p().onActivityResult(l, i1, intent);
            break;
        }
    }

    public void onBackPressed()
    {
        BaseHomeFragment basehomefragment;
        if (N)
        {
            if (((basehomefragment = p()) == null || !basehomefragment.b()) && !c(false))
            {
                long l = System.currentTimeMillis() - M;
                if (l > 3000L)
                {
                    M = System.currentTimeMillis();
                    String s1 = com.qihoo.security.locale.d.a().a(0x7f0c00ae);
                    Message message = Z.obtainMessage();
                    message.what = 1;
                    message.obj = s1;
                    Z.sendMessageDelayed(message, 300L);
                    return;
                }
                if (l > 300L && l <= 3000L)
                {
                    com.qihoo360.mobilesafe.b.q.a().cancel();
                    z();
                    super.onBackPressed();
                    return;
                } else
                {
                    Z.removeMessages(1);
                    z();
                    super.onBackPressed();
                    return;
                }
            }
        }
    }

    public void onClick(View view)
    {
        view.getId();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (V == 2)
        {
            return;
        }
        V = 1;
        com.qihoo.security.app.a.a(this).a(true);
        SharedPref.a(p, "clear_default_pre_is_need_run", true);
        bundle = getIntent();
        if ("com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH".equals(bundle.getAction()))
        {
            a(200L);
            finish();
            return;
        }
        com.qihoo.utils.notice.c.a(p, bundle);
        A = com.qihoo.security.ui.b.a.a().b(0x7f03001d);
        IntentFilter intentfilter;
        if (A == null)
        {
            A = new com.qihoo.security.ui.b.a.f() {

                final HomeActivity a;

                public View a(int l)
                {
                    return a.findViewById(l);
                }

            
            {
                a = HomeActivity.this;
                super();
            }
            };
            setContentView(0x7f03001d);
        } else
        {
            setContentView(A.b);
        }
        com.qihoo.security.a.d();
        v = true;
        r();
        s();
        Q = new e();
        m();
        bundle = android.support.v4.content.g.a(p);
        intentfilter = new IntentFilter("com.qihoo.security.FINISH_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.REBOOT_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.RESET_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion");
        intentfilter.addAction("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint");
        bundle.a(Y, intentfilter);
        com.qihoo.security.support.b.c(10006);
        P = System.currentTimeMillis();
        if (com.qihoo.security.locale.c.c(p))
        {
            Z.sendMessageDelayed(Z.obtainMessage(101), 800L);
        }
        com.qihoo360.mobilesafe.b.a.g(p);
        com.qihoo.security.adv.a.c.a(this);
        H = MobvistaAd.newAdWallController(this, "55", "179046299094879_179857549013754");
        if (H != null)
        {
            H.preloadWall();
        }
        aa.sendEmptyMessage(2);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        R = menu;
        getMenuInflater().inflate(0x7f100002, menu);
        X = menu.findItem(0x7f0b0254);
        b(menu, 0x7f0b0253, 0x7f020046);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (H != null)
        {
            H.release();
        }
        this;
        JVM INSTR monitorenter ;
        W.clear();
        this;
        JVM INSTR monitorexit ;
        synchronized (U)
        {
            T.shutdown();
            T = null;
        }
        com.qihoo.security.support.a.a(this);
        android.support.v4.content.g.a(p).a(Y);
        com.qihoo.security.support.b.b(10005, (int)(System.currentTimeMillis() - P) / 1000);
        SharedPref.a(p, "first_time_in_this_open", true);
        RecommendHelper.a().c();
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean onKeyUp(int l, KeyEvent keyevent)
    {
        return super.onKeyUp(l, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (V != 1)
        {
            V = 2;
            if (intent.getBooleanExtra("set_intent", false))
            {
                setIntent(intent);
            }
            if ("com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH".equals(intent.getAction()))
            {
                a(200L);
                finish();
                return;
            }
            com.qihoo.utils.notice.c.a(p, intent);
            int l = intent.getIntExtra("fragment_index", y);
            boolean flag = intent.getBooleanExtra("jump_result_page", false);
            if (l >= 0 && G != null && l < G.b() && c(intent))
            {
                if (y != l)
                {
                    F.a(l, false);
                }
                BaseHomeFragment basehomefragment = p();
                if (basehomefragment != null)
                {
                    Bundle bundle = intent.getExtras();
                    if (flag)
                    {
                        j();
                    }
                    basehomefragment.a(bundle);
                    basehomefragment.a(intent);
                }
            }
            if (K != null && intent.getBooleanExtra("is_from_appbox_shortcut", false))
            {
                w();
                return;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 40
    //                   16908332: 46
    //                   2131427923: 48
    //                   2131427924: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        return true;
_L3:
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            SharedPref.a(p, "click_home_appbox_timestamp", System.currentTimeMillis());
            K.setVisibility(8);
            com.qihoo.security.ui.a.a(p, L);
            com.qihoo.security.support.b.c(26005);
            com.qihoo.security.ui.main.FragmentsObservable.a(z);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            com.qihoo.security.support.b.b(11113);
            startActivity(new Intent(p, com/qihoo/security/gamebooster/GamesBoostSettingListActivity));
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onPause()
    {
        super.onPause();
        V = 0;
    }

    protected void onPostResume()
    {
        super.onPostResume();
        ac = false;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        ac = true;
    }

    protected void onStart()
    {
        super.onStart();
        q();
    }

    protected void onStop()
    {
        super.onStop();
    }

    public BaseHomeFragment p()
    {
        if (F != null && G != null && e() != null)
        {
            return d(F.getCurrentItem());
        } else
        {
            return null;
        }
    }

    static 
    {
        ab = new SparseArray();
        ab.put(0x19ab0, Integer.valueOf(0));
        ab.put(0x19ab1, Integer.valueOf(1));
        ab.put(0x19ab2, Integer.valueOf(2));
        ab.put(0x19ab3, Integer.valueOf(0));
        ab.put(0x19ab4, Integer.valueOf(1));
        ab.put(0x19ab5, Integer.valueOf(2));
        ab.put(0x19ab6, Integer.valueOf(0));
        ab.put(0x19ab7, Integer.valueOf(1));
        ab.put(0x19ab8, Integer.valueOf(2));
    }
}
