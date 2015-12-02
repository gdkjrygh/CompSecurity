// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.nineoldandroids.a.o;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.booster.a;
import com.qihoo.security.booster.widget.DialView.BoostDialView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.ScanButtonTopView;
import com.qihoo.security.ui.b.e;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.opti.sysclear.PowerActivity;
import com.qihoo.security.ui.opti.sysclear.ProcessClearActivity;
import com.qihoo.security.ui.result.view.BoostResultFragment;
import com.qihoo.security.widget.RevealPanel;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.ui.main:
//            BaseHomeFragment, a

public class BoosterFragment extends BaseHomeFragment
    implements com.qihoo.security.app.a.b
{
    private class a extends BroadcastReceiver
    {

        final BoosterFragment a;

        public void onReceive(Context context, Intent intent)
        {
            boolean flag = false;
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
            {
                int i1 = intent.getIntExtra("level", 0);
                int j1 = intent.getIntExtra("scale", 100);
                com.qihoo.security.ui.main.BoosterFragment.d(a, (i1 * 100) / j1);
                i1 = intent.getIntExtra("temperature", 0);
                if (Math.round((float)i1 / 10F) != Math.round((float)BoosterFragment.y(a) / 10F))
                {
                    flag = true;
                }
                if (flag)
                {
                    com.qihoo.security.ui.main.BoosterFragment.e(a, i1);
                    SharedPref.a(com.qihoo.security.ui.main.BoosterFragment.f(a), "sp_key_battery_temperature", i1);
                }
            }
        }

        private a()
        {
            a = BoosterFragment.this;
            super();
        }

    }

    private class b extends com.nineoldandroids.a.b
        implements android.view.View.OnClickListener
    {

        final BoosterFragment a;

        public void onClick(View view)
        {
            if (!com.qihoo360.mobilesafe.b.f.a())
            {
                com.qihoo.security.ui.result.f.a().a(0);
                com.qihoo.security.ui.b.a.a().a(0x7f03008a, (int[])null, false);
                com.qihoo.security.ui.b.b.a(0);
                BoosterFragment.i(a).a(0).a();
                if (com.qihoo.security.app.a.b(com.qihoo.security.ui.main.BoosterFragment.f(a)))
                {
                    com.qihoo.security.support.b.b(11320);
                }
                SharedPref.a(com.qihoo.security.ui.main.BoosterFragment.f(a), "this_speed_of_boost", BoosterFragment.j(a));
                BoosterFragment.k(a).b();
                com.qihoo.security.ui.main.BoosterFragment.a(a, System.currentTimeMillis());
                RecommendHelper.a().d(null);
                RecommendHelper.a().b(com.qihoo.security.recommend.RecommendHelper.RecommendType.Boost);
                a.a(FragmentsObservable.Action.HideRecmdBoost);
            }
        }

        private b()
        {
            a = BoosterFragment.this;
            super();
        }

    }

    private class c extends com.nineoldandroids.a.b
    {

        final BoosterFragment a;

        public void a(com.nineoldandroids.a.a a1)
        {
            a.b_(0x7f020084);
            a.a_(com.qihoo.security.ui.main.BoosterFragment.e(a).a(0x7f0c0017));
        }

        public void b(com.nineoldandroids.a.a a1)
        {
            if (com.qihoo.security.app.a.b(com.qihoo.security.ui.main.BoosterFragment.f(a)))
            {
                com.qihoo.security.ui.main.BoosterFragment.a(a, 2);
            } else
            if (com.qihoo.security.booster.a.a())
            {
                com.qihoo.security.ui.main.BoosterFragment.a(a, 1);
            } else
            {
                com.qihoo.security.ui.main.BoosterFragment.a(a, 0);
            }
            com.qihoo.security.support.b.b(11322, (int)(System.currentTimeMillis() - BoosterFragment.g(a)));
            a.m();
        }

        private c()
        {
            a = BoosterFragment.this;
            super();
        }

    }

    private class d extends com.nineoldandroids.a.b
    {

        final BoosterFragment a;

        public void b(com.nineoldandroids.a.a a1)
        {
            a.a(com.qihoo.security.ui.main.BoosterFragment.h(a));
        }

        private d()
        {
            a = BoosterFragment.this;
            super();
        }

    }

    static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;
        public static final e g;
        private static final e h[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/qihoo/security/ui/main/BoosterFragment$e, s1);
        }

        public static e[] values()
        {
            return (e[])h.clone();
        }

        public boolean a()
        {
            return equals(a) || equals(c) || equals(g);
        }

        static 
        {
            a = new e("IDLE", 0);
            b = new e("SCANNING", 1);
            c = new e("READY_BOOST", 2);
            d = new e("BOOSTING", 3);
            e = new e("BOOSTED", 4);
            f = new e("BOOSTED_BACK", 5);
            g = new e("FASTEST", 6);
            h = (new e[] {
                a, b, c, d, e, f, g
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private long A;
    private long B;
    private long C;
    private int D;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus E;
    private int F;
    private int G;
    private e H;
    private int I;
    private int J;
    private a K;
    private IntentFilter L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private final Handler R = new Handler() {

        final BoosterFragment a;

        public void handleMessage(Message message)
        {
            if (!a.isAdded())
            {
                return;
            }
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                sendEmptyMessageDelayed(1, 60000L);
                break;
            }
            com.qihoo.security.support.b.c(11002);
            com.qihoo.security.ui.main.BoosterFragment.a(a, false);
            a.a(false);
        }

            
            {
                a = BoosterFragment.this;
                super();
            }
    };
    private com.qihoo.security.ui.b.a.f S;
    private com.qihoo.security.app.a T;
    private final com.nineoldandroids.a.a.a U = new c();
    private final com.nineoldandroids.a.b V = new d();
    private final b W = new b();
    private final c.a X = new c.a() {

        final BoosterFragment a;

        public void a(int i1)
        {
            while (!a.a(a) || !a.isAdded() || BoosterFragment.p(a) == null) 
            {
                return;
            }
            BoosterFragment.p(a).post(new Runnable(this, i1) {

                final int a;
                final _cls6 b;

                public void run()
                {
                    while (!b.a.isAdded() || !b.a.a(b.a) || BoosterFragment.z(b.a) == a) 
                    {
                        return;
                    }
                    com.qihoo.security.ui.main.BoosterFragment.f(b.a, a);
                    if (BoosterFragment.A(b.a) != com.qihoo.security.ui.main.e.d)
                    {
                        BoosterFragment.g(b.a, BoosterFragment.z(b.a));
                        return;
                    } else
                    {
                        BoosterFragment.g(b.a, BoosterFragment.z(b.a));
                        return;
                    }
                }

            
            {
                b = _pcls6;
                a = i1;
                super();
            }
            });
        }

            
            {
                a = BoosterFragment.this;
                super();
            }
    };
    private com.qihoo.security.ui.b.e Y;
    private boolean a;
    private boolean k;
    private long l;
    private Context m;
    private ViewGroup n;
    private View o;
    private BoostDialView p;
    private LocaleTextView q;
    private LocaleTextView r;
    private ElasticImageButton s;
    private RevealPanel t;
    private RevealPanel u;
    private ScanButtonTopView v;
    private int w;
    private int x;
    private int y;
    private long z;

    public BoosterFragment()
    {
        a = true;
        k = false;
        w = 0;
        x = 0;
        z = com.qihoo360.mobilesafe.b.s.c();
        A = com.qihoo360.mobilesafe.b.s.d();
        B = z - A;
        C = -1L;
        D = 0;
        E = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        H = com.qihoo.security.ui.main.e.a;
        K = null;
        N = false;
        O = false;
        P = false;
        Q = false;
    }

    static e A(BoosterFragment boosterfragment)
    {
        return boosterfragment.H;
    }

    static long a(BoosterFragment boosterfragment)
    {
        return boosterfragment.C;
    }

    static long a(BoosterFragment boosterfragment, long l1)
    {
        boosterfragment.l = l1;
        return l1;
    }

    private void a(int i1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        long l1;
        long l2;
        s();
        l2 = x;
        if (C == -1L)
        {
            l1 = B;
        } else
        {
            l1 = z - C;
        }
        if (l1 != 0L)
        {
            com.qihoo.security.support.b.b(11009, (int)((100L * l2) / l1));
        }
        s1 = "";
        obj2 = "";
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        obj = String.valueOf(com.qihoo.security.booster.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT));
        obj1 = obj2;
_L4:
        if (e())
        {
            obj2 = BoostResultFragment.q();
            ((BoostResultFragment) (obj2)).a(i1, ((String) (obj)), ((String) (obj1)));
            obj = getActivity().e().a();
            ((h) (obj)).a(0x7f0b0073, ((android.support.v4.app.Fragment) (obj2)));
            ((h) (obj)).a("booster_result_fragment");
            ((h) (obj)).b();
        }
        return;
_L2:
        obj1 = obj2;
        obj = s1;
        if (i1 == 1)
        {
            String as[] = com.qihoo360.mobilesafe.b.s.a(I, l1, l2);
            obj1 = obj2;
            obj = s1;
            if (as != null)
            {
                obj1 = obj2;
                obj = s1;
                if (as.length > 0)
                {
                    obj1 = obj2;
                    obj = s1;
                    if (as.length == 2)
                    {
                        obj = as[0];
                        obj1 = as[1];
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(long l1)
    {
        if (P)
        {
            P = false;
            R.postDelayed(new Runnable() {

                final BoosterFragment a;

                public void run()
                {
                    BoosterFragment.k(a).performClick();
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            }, l1);
        }
    }

    private void a(Intent intent, int i1)
    {
label0:
        {
            D = i1;
            intent.getBooleanExtra("is_need_read", false);
            boolean flag = intent.getBooleanExtra("is_best", false);
            i1 = intent.getIntExtra("kill_prower_count", -1);
            int j1 = intent.getIntExtra("kill_process_count", -1);
            x = intent.getIntExtra("extra_killed_memory", 0);
            C = intent.getLongExtra("free_memory_kb", -1L);
            if (i1 > 0)
            {
                if (G - i1 > 0)
                {
                    i1 = G - i1;
                } else
                {
                    i1 = 0;
                }
                G = i1;
            }
            if (j1 > 0)
            {
                if (F - j1 > 0)
                {
                    i1 = F - j1;
                } else
                {
                    i1 = 0;
                }
                F = i1;
            }
            i1 = (int)((long)(x * 100) / com.qihoo360.mobilesafe.b.s.c());
            if (H == e.c)
            {
                if (!flag && !x())
                {
                    break label0;
                }
                a(com.qihoo.security.ui.main.e.f);
            }
            return;
        }
        if (w())
        {
            y = i1 + p.getProgress();
            if (y >= 100)
            {
                a(com.qihoo.security.ui.main.e.f);
                return;
            }
            w = w - com.qihoo.security.booster.a.a(x, B);
            if (w <= 0)
            {
                w = 1;
            }
            a(e.c);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    private void a(e e1)
    {
        while (isRemoving() || H == e1) 
        {
            return;
        }
        H = e1;
        static class _cls7
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[FragmentAction.values().length];
                try
                {
                    b[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                a = new int[e.values().length];
                try
                {
                    a[com.qihoo.security.ui.main.e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.qihoo.security.ui.main.e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[e.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.qihoo.security.ui.main.e.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.qihoo.security.ui.main.e.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.ui.main.e.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.qihoo.security.ui.main._cls7.a[e1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            q.setVisibility(4);
            return;

        case 2: // '\002'
            q.setLocalText(0x7f0c0015);
            e1 = r;
            LocaleTextView localetextview = q;
            com.qihoo.security.ui.main.a.a(new View[] {
                e1
            }, new View[] {
                localetextview
            });
            return;

        case 3: // '\003'
            com.qihoo.security.app.a.a(m, false);
            a(com.qihoo.security.booster.a.a(y), true);
            r.setLocalText(f.a(0x7f0c0030, new Object[] {
                Integer.valueOf(w)
            }));
            com.qihoo.security.support.b.b(11319, w);
            q();
            t.setSummary(f.a(0x7f0c0019));
            u.setSummary(f.a(0x7f0c0036));
            t.setTitle((new StringBuilder()).append(F).append(" ").append(f.a(0x7f0f0000, F)).toString());
            u.setTitle((new StringBuilder()).append(G).append(" ").append(f.a(0x7f0f0000, G)).toString());
            p.a(y, new com.qihoo.security.booster.widget.DialView.a() {

                final BoosterFragment a;

                public void a()
                {
label0:
                    {
                        if (!com.qihoo.security.ui.main.BoosterFragment.a(a, new com.nineoldandroids.a.b(this) {

                final _cls13 a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    BoosterFragment.m(a.a).setCallback(new com.qihoo.security.widget.RevealRippleLayout.b(this) {

                        final _cls1 a;

                        public void b()
                        {
                            LocaleTextView localetextview = BoosterFragment.n(a.a.a);
                            LocaleTextView localetextview1 = com.qihoo.security.ui.main.BoosterFragment.o(a.a.a);
                            com.qihoo.security.ui.main.a.a(new View[] {
                                localetextview
                            }, new View[] {
                                localetextview1
                            });
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    if (!BoosterFragment.l(a.a).a())
                    {
                        BoosterFragment.l(a.a).e();
                        BoosterFragment.p(a.a).postDelayed(new Runnable(this) {

                            final _cls1 a;

                            public void run()
                            {
                                BoosterFragment.m(a.a.a).e();
                            }

            
            {
                a = _pcls1;
                super();
            }
                        }, 100L);
                    } else
                    if (!BoosterFragment.m(a.a).a())
                    {
                        BoosterFragment.m(a.a).e();
                    } else
                    {
                        a1 = BoosterFragment.n(a.a);
                        LocaleTextView localetextview = com.qihoo.security.ui.main.BoosterFragment.o(a.a);
                        com.qihoo.security.ui.main.a.a(new View[] {
                            a1
                        }, new View[] {
                            localetextview
                        });
                    }
                    com.qihoo.security.ui.main.BoosterFragment.b(a.a, 200L);
                }

            
            {
                a = _pcls13;
                super();
            }
            }))
                        {
                            BoosterFragment.m(a).setCallback(new com.qihoo.security.widget.RevealRippleLayout.b(this) {

                                final _cls13 a;

                                public void b()
                                {
                                    LocaleTextView localetextview = BoosterFragment.n(a.a);
                                    LocaleTextView localetextview1 = com.qihoo.security.ui.main.BoosterFragment.o(a.a);
                                    com.qihoo.security.ui.main.a.a(new View[] {
                                        localetextview
                                    }, new View[] {
                                        localetextview1
                                    });
                                }

            
            {
                a = _pcls13;
                super();
            }
                            });
                            if (BoosterFragment.l(a).a())
                            {
                                break label0;
                            }
                            BoosterFragment.l(a).e();
                            BoosterFragment.p(a).postDelayed(new Runnable(this) {

                                final _cls13 a;

                                public void run()
                                {
                                    BoosterFragment.m(a.a).e();
                                }

            
            {
                a = _pcls13;
                super();
            }
                            }, 100L);
                        }
                        return;
                    }
                    if (!BoosterFragment.m(a).a())
                    {
                        BoosterFragment.m(a).e();
                        return;
                    } else
                    {
                        LocaleTextView localetextview3 = BoosterFragment.n(a);
                        LocaleTextView localetextview4 = com.qihoo.security.ui.main.BoosterFragment.o(a);
                        com.qihoo.security.ui.main.a.a(new View[] {
                            localetextview3
                        }, new View[] {
                            localetextview4
                        });
                        return;
                    }
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            });
            return;

        case 4: // '\004'
            q.setLocalText(0x7f0c0016);
            e1 = r;
            LocaleTextView localetextview1 = q;
            com.qihoo.security.ui.main.a.a(0L, new View[] {
                e1
            }, new View[] {
                localetextview1
            }, null);
            p.a(new com.qihoo.security.booster.widget.DialView.a() {

                final BoosterFragment a;

                public void b()
                {
                    BoosterFragment.q(a);
                }

                public void c()
                {
                    a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, true);
                    long l1;
                    if (com.qihoo.security.app.a.b(com.qihoo.security.ui.main.BoosterFragment.f(a)))
                    {
                        l1 = 150L;
                    } else
                    {
                        l1 = 300L;
                    }
                    com.qihoo.security.ui.main.a.a(l1, BoosterFragment.r(a), new com.qihoo.security.opti.trashclear.ui.mainpage.a.a(this) {

                        final _cls14 a;

                        public void onAnimationEnd(Animation animation)
                        {
                            com.qihoo.security.ui.b.b.c(4);
                            animation = com.qihoo.security.ui.main.BoosterFragment.o(a.a);
                            LocaleTextView localetextview = BoosterFragment.n(a.a);
                            RevealPanel revealpanel = BoosterFragment.l(a.a);
                            RevealPanel revealpanel1 = BoosterFragment.m(a.a);
                            com.nineoldandroids.a.b b1 = com.qihoo.security.ui.main.BoosterFragment.s(a.a);
                            com.qihoo.security.ui.main.a.a(0L, new View[] {
                                animation, localetextview, revealpanel, revealpanel1
                            }, null, b1);
                        }

                        public void onAnimationStart(Animation animation)
                        {
                            com.qihoo.security.ui.b.b.a(4, BoosterFragment.r(a.a));
                        }

            
            {
                a = _pcls14;
                super();
            }
                    });
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            });
            return;

        case 5: // '\005'
            a = false;
            return;

        case 6: // '\006'
            N = true;
            a = false;
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
            s.b(false);
            p.a(100, null);
            if (D == 1000)
            {
                if (com.qihoo.security.booster.a.a())
                {
                    a(1);
                } else
                {
                    a(0);
                }
            } else
            {
                a(1);
            }
            a(((com.nineoldandroids.a.a.a) (null)), false);
            b_(0x7f020084);
            a_(f.a(0x7f0c0017));
            return;

        case 7: // '\007'
            com.qihoo.security.app.a.a(m, true);
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, true);
            p.a(100, new com.qihoo.security.booster.widget.DialView.a() {

                final BoosterFragment a;

                public void a()
                {
                    com.qihoo.security.ui.main.BoosterFragment.b(a, 200L);
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            });
            r.setLocalText(0x7f0c002f);
            t.setSummary(f.a(0x7f0c001a));
            u.setSummary(f.a(0x7f0c001b));
            q();
            e1 = q;
            View view = o;
            LocaleTextView localetextview2 = r;
            RevealPanel revealpanel = t;
            RevealPanel revealpanel1 = u;
            com.qihoo.security.ui.main.a.a(new View[] {
                e1
            }, new View[] {
                view, localetextview2, revealpanel, revealpanel1
            });
            break;
        }
        if (t.a())
        {
            t.d();
        }
        if (u.a())
        {
            R.postDelayed(new Runnable() {

                final BoosterFragment a;

                public void run()
                {
                    BoosterFragment.m(a).d();
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            }, 100L);
        }
        c(((com.nineoldandroids.a.a.a) (null)));
    }

    static void a(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.a(i1);
    }

    static void a(BoosterFragment boosterfragment, f f1)
    {
        boosterfragment.a(f1);
    }

    static void a(BoosterFragment boosterfragment, e e1)
    {
        boosterfragment.a(e1);
    }

    static boolean a(BoosterFragment boosterfragment, com.nineoldandroids.a.a.a a1)
    {
        return boosterfragment.c(a1);
    }

    static boolean a(BoosterFragment boosterfragment, boolean flag)
    {
        boosterfragment.N = flag;
        return flag;
    }

    static int b(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.F = i1;
        return i1;
    }

    static long b(BoosterFragment boosterfragment)
    {
        return boosterfragment.A;
    }

    private void b(e e1)
    {
        if (O)
        {
            a(e.g);
            O = false;
            return;
        } else
        {
            a(e.c);
            return;
        }
    }

    static void b(BoosterFragment boosterfragment, long l1)
    {
        boosterfragment.a(l1);
    }

    private void b(boolean flag)
    {
        f f1;
label0:
        {
            f1 = getActivity().e();
            if (f1 != null && getActivity() != null && !getActivity().isFinishing())
            {
                if (!flag)
                {
                    break label0;
                }
                b(((com.nineoldandroids.a.a.a) (null)), flag);
                a(f1);
                f1.b("booster_result_fragment", 1);
                d_();
                a_(f.a(0x7f0c01d3));
                n();
            }
            return;
        }
        b(((com.nineoldandroids.a.a.a) (new com.nineoldandroids.a.b(f1) {

            final f a;
            final BoosterFragment b;

            public void b(com.nineoldandroids.a.a a1)
            {
                com.qihoo.security.ui.main.BoosterFragment.a(b, a);
                a.a("booster_result_fragment", 1);
                b.d_();
                b.a_(BoosterFragment.x(b).a(0x7f0c01d3));
                b.n();
            }

            
            {
                b = BoosterFragment.this;
                a = f1;
                super();
            }
        })), flag);
    }

    static int c(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.G = i1;
        return i1;
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus c(BoosterFragment boosterfragment)
    {
        return boosterfragment.E;
    }

    private void c(int i1)
    {
        r.setTextColor(i1);
        q.setTextColor(i1);
        p.setSectorColor(i1);
        v.setColor(i1);
        t.setColor(i1);
        u.setColor(i1);
    }

    private boolean c(com.nineoldandroids.a.a.a a1)
    {
        if (s.getVisibility() != 0)
        {
            s.a();
            s.setTopView(v);
            s.setOnClickListener(W);
            s.setButtonAnimatorListener(new com.qihoo.security.alasticbutton.a(a1) {

                final com.nineoldandroids.a.a.a a;
                final BoosterFragment b;

                public void a()
                {
                    b.c_();
                    com.qihoo.security.ui.main.BoosterFragment.a(b, true);
                    BoosterFragment.l(b).b();
                    BoosterFragment.m(b).b();
                }

                public void d()
                {
                    if (a != null)
                    {
                        a.b(null);
                    }
                }

                public void f()
                {
                    com.qihoo.security.support.b.c(11008);
                    b.l();
                }

            
            {
                b = BoosterFragment.this;
                a = a1;
                super();
            }
            });
            s.a(true);
            return true;
        } else
        {
            return false;
        }
    }

    static int d(BoosterFragment boosterfragment)
    {
        return boosterfragment.I;
    }

    static int d(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.I = i1;
        return i1;
    }

    static int e(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.J = i1;
        return i1;
    }

    static com.qihoo.security.locale.d e(BoosterFragment boosterfragment)
    {
        return boosterfragment.f;
    }

    static int f(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.M = i1;
        return i1;
    }

    static Context f(BoosterFragment boosterfragment)
    {
        return boosterfragment.m;
    }

    static long g(BoosterFragment boosterfragment)
    {
        return boosterfragment.l;
    }

    static void g(BoosterFragment boosterfragment, int i1)
    {
        boosterfragment.c(i1);
    }

    static com.nineoldandroids.a.a.a h(BoosterFragment boosterfragment)
    {
        return boosterfragment.U;
    }

    static com.qihoo.security.ui.b.e i(BoosterFragment boosterfragment)
    {
        return boosterfragment.Y;
    }

    static int j(BoosterFragment boosterfragment)
    {
        return boosterfragment.w;
    }

    static ElasticImageButton k(BoosterFragment boosterfragment)
    {
        return boosterfragment.s;
    }

    static RevealPanel l(BoosterFragment boosterfragment)
    {
        return boosterfragment.t;
    }

    static RevealPanel m(BoosterFragment boosterfragment)
    {
        return boosterfragment.u;
    }

    static LocaleTextView n(BoosterFragment boosterfragment)
    {
        return boosterfragment.q;
    }

    static LocaleTextView o(BoosterFragment boosterfragment)
    {
        return boosterfragment.r;
    }

    static Handler p(BoosterFragment boosterfragment)
    {
        return boosterfragment.R;
    }

    private void p()
    {
        o o1 = com.nineoldandroids.a.o.b(new int[] {
            Math.max(F, G), 0
        });
        o1.d(2000L);
        o1.a(new com.nineoldandroids.a.o.b() {

            final BoosterFragment a;

            public void a(o o2)
            {
                int i1 = ((Integer)o2.o()).intValue();
                if (i1 != 0) goto _L2; else goto _L1
_L1:
                com.qihoo.security.ui.main.BoosterFragment.b(a, 0);
                BoosterFragment.c(a, 0);
_L4:
                BoosterFragment.l(a).setTitle((new StringBuilder()).append(BoosterFragment.t(a)).append(" ").append(BoosterFragment.v(a).a(0x7f0f0000, BoosterFragment.t(a))).toString());
                BoosterFragment.m(a).setTitle((new StringBuilder()).append(BoosterFragment.u(a)).append(" ").append(BoosterFragment.w(a).a(0x7f0f0000, BoosterFragment.u(a))).toString());
                return;
_L2:
                if (i1 != 0 && BoosterFragment.t(a) >= BoosterFragment.u(a))
                {
                    BoosterFragment.c(a, Math.round((float)i1 * ((float)BoosterFragment.u(a) / (float)BoosterFragment.t(a))));
                    com.qihoo.security.ui.main.BoosterFragment.b(a, i1);
                } else
                if (i1 != 0 && BoosterFragment.t(a) < BoosterFragment.u(a))
                {
                    com.qihoo.security.ui.main.BoosterFragment.b(a, Math.round((float)i1 * ((float)BoosterFragment.t(a) / (float)BoosterFragment.u(a))));
                    BoosterFragment.c(a, i1);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = BoosterFragment.this;
                super();
            }
        });
        o1.a();
    }

    private void q()
    {
        if (r == null || r.getText() == null)
        {
            return;
        } else
        {
            String s1 = (new StringBuilder()).append("RecommendType.").append(com.qihoo.security.recommend.RecommendHelper.RecommendType.Boost.name()).toString();
            String s2 = r.getText().toString();
            RecommendHelper.a().a(s1, s2);
            return;
        }
    }

    static void q(BoosterFragment boosterfragment)
    {
        boosterfragment.p();
    }

    static View r(BoosterFragment boosterfragment)
    {
        return boosterfragment.o;
    }

    private void r()
    {
        if (R != null && !R.hasMessages(1))
        {
            R.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    static com.nineoldandroids.a.b s(BoosterFragment boosterfragment)
    {
        return boosterfragment.V;
    }

    private void s()
    {
        if (R != null)
        {
            R.removeMessages(1);
        }
    }

    static int t(BoosterFragment boosterfragment)
    {
        return boosterfragment.F;
    }

    private void t()
    {
        T = com.qihoo.security.app.a.a(getActivity());
    }

    static int u(BoosterFragment boosterfragment)
    {
        return boosterfragment.G;
    }

    private void u()
    {
        T.a(this);
    }

    static com.qihoo.security.locale.d v(BoosterFragment boosterfragment)
    {
        return boosterfragment.f;
    }

    private void v()
    {
        T.b(this);
    }

    static com.qihoo.security.locale.d w(BoosterFragment boosterfragment)
    {
        return boosterfragment.f;
    }

    private boolean w()
    {
        return T.b();
    }

    static com.qihoo.security.locale.d x(BoosterFragment boosterfragment)
    {
        return boosterfragment.f;
    }

    private boolean x()
    {
        return T.a();
    }

    static int y(BoosterFragment boosterfragment)
    {
        return boosterfragment.J;
    }

    private void y()
    {
        T.d();
    }

    static int z(BoosterFragment boosterfragment)
    {
        return boosterfragment.M;
    }

    public void a()
    {
        super.a();
        com.qihoo.security.support.b.c(11001);
        if (x())
        {
            E = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        }
        a(E, false);
    }

    public void a(int i1, int j1)
    {
        d();
        if (!N)
        {
            if (H == com.qihoo.security.ui.main.e.b)
            {
                O = true;
            } else
            {
                a(e.g);
            }
        }
        N = false;
    }

    protected void a(Intent intent)
    {
        super.a(intent);
        if ("com.qihoo.security.notify.ACTION_BOOST".equals(intent.getAction()) && s != null)
        {
            s.performClick();
        }
        if (intent.getBooleanExtra("jump_result_page", false))
        {
            b(intent);
        }
    }

    public void a(com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        super.a(recommendtype);
        if (H.equals(e.g))
        {
            t.d();
            u.d();
            return;
        } else
        {
            t.e();
            u.e();
            return;
        }
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag)
    {
        super.a(examstatus, flag);
        E = examstatus;
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        switch (com.qihoo.security.ui.main._cls7.b[fragmentaction.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.qihoo.security.support.b.c(11011);
            com.qihoo.security.support.b.a(11318, 2L);
            b(true);
            c(com.qihoo.security.recommend.RecommendHelper.RecommendType.Boost);
            return;

        case 2: // '\002'
            b(false);
            break;
        }
    }

    public void a(List list, Map map)
    {
        b(list, map);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            T.a(true);
            ProcessClearService.a(null);
        } else
        if (a && H.a())
        {
            if (x())
            {
                if (H == com.qihoo.security.ui.main.e.a)
                {
                    R.postDelayed(new Runnable() {

                        final BoosterFragment a;

                        public void run()
                        {
                            com.qihoo.security.ui.main.BoosterFragment.a(a, e.g);
                        }

            
            {
                a = BoosterFragment.this;
                super();
            }
                    }, 1000L);
                    return;
                } else
                {
                    a(e.g);
                    return;
                }
            }
            a(com.qihoo.security.ui.main.e.b);
            long l1 = SystemClock.elapsedRealtime();
            com.qihoo.security.app.a.c c1 = T.e();
            if (c1 != null && l1 - c1.c < 4000L)
            {
                b(c1.a, c1.b);
                return;
            } else
            {
                T.a(true);
                ProcessClearService.a(null);
                return;
            }
        }
    }

    protected void b(Intent intent)
    {
        int i1 = intent.getIntExtra("jump_result_page_param", 0);
        if (1001 == i1 || 1000 == i1)
        {
            onActivityResult(i1, -1, intent);
        }
    }

    public void b(com.qihoo.security.recommend.RecommendHelper.RecommendType recommendtype)
    {
        super.b(recommendtype);
        if (H.equals(e.g))
        {
            t.d();
            u.d();
            return;
        } else
        {
            t.e();
            u.e();
            return;
        }
    }

    public void b(List list, Map map)
    {
        if (list == null || list.isEmpty())
        {
            a(e.g);
            F = 0;
            G = 0;
            return;
        }
        Object obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        int i1 = 1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProcessInfo processinfo = (ProcessInfo)iterator.next();
            int j1 = i1;
            if (processinfo.flag == 0)
            {
                j1 = i1 + processinfo.useMemory;
                ((List) (obj)).add(processinfo);
            }
            i1 = j1;
            if (processinfo.flag != 3)
            {
                i1 = j1;
                if (processinfo.isSystem)
                {
                    KillBean killbean = new KillBean();
                    killbean.packageName = processinfo.packageName;
                    killbean.memory = processinfo.useMemory;
                    arraylist.add(killbean);
                    i1 = j1;
                }
            }
        } while (true);
        ProcessClearService.a(arraylist);
        F = ((List) (obj)).size();
        obj = map;
        if (map == null)
        {
            obj = com.qihoo.security.opti.a.a.a(list);
        }
        if (obj == null || ((Map) (obj)).isEmpty())
        {
            G = 0;
        } else
        {
            G = 0;
            list = ((Map) (obj)).entrySet().iterator();
            while (list.hasNext()) 
            {
                if (((com.qihoo.security.opti.a.a.a)((java.util.Map.Entry)list.next()).getValue()).a() >= 3)
                {
                    G = G + 1;
                }
            }
        }
        x = i1;
        com.qihoo.security.support.b.a(11003, com.qihoo360.mobilesafe.b.s.b(), 1);
        com.qihoo.security.support.b.b(11004, x >> 10);
        com.qihoo.security.support.b.b(11005, F);
        d();
        z = com.qihoo360.mobilesafe.b.s.c();
        A = com.qihoo360.mobilesafe.b.s.d();
        B = z - A;
        y = com.qihoo360.mobilesafe.b.s.a(z, A);
        w = com.qihoo.security.booster.a.a(i1, B);
        b(e.c);
    }

    public boolean b()
    {
        com.qihoo.security.support.b.a(11318, 0L);
        return super.b();
    }

    public void c()
    {
        super.c();
        if (H.equals(com.qihoo.security.ui.main.e.d))
        {
            return;
        } else
        {
            b(true);
            com.qihoo.security.support.b.a(11318, 1L);
            c(com.qihoo.security.recommend.RecommendHelper.RecommendType.Boost);
            return;
        }
    }

    public void d()
    {
        C = -1L;
    }

    public void h()
    {
        super.h();
        if (com.qihoo.security.ui.main.e.e == H)
        {
            n();
        }
    }

    public void l()
    {
        d();
        a(FragmentsObservable.Action.Boost);
        a(com.qihoo.security.ui.main.e.d);
        y();
    }

    public void m()
    {
        a(com.qihoo.security.ui.main.e.e);
    }

    public void n()
    {
        if (x())
        {
            a(e.g);
            return;
        } else
        {
            a(e.g);
            R.postDelayed(new Runnable() {

                final BoosterFragment a;

                public void run()
                {
                    a.a(false);
                }

            
            {
                a = BoosterFragment.this;
                super();
            }
            }, 1000L);
            return;
        }
    }

    protected void o()
    {
        o = S.a(0x7f0b0125);
        p = (BoostDialView)S.a(0x7f0b0126);
        q = (LocaleTextView)S.a(0x7f0b012a);
        r = (LocaleTextView)S.a(0x7f0b012b);
        s = (ElasticImageButton)S.a(0x7f0b0129);
        v = new ScanButtonTopView(m);
        v.setIcon(com.qihoo.security.ui.b.a.a().a(0x7f02004e));
        v.setText(f.a(0x7f0c0017));
        t = (RevealPanel)S.a(0x7f0b012c);
        t.setIcon(com.qihoo.security.ui.b.a.a().a(0x7f02004c));
        t.setSummary(f.a(0x7f0c0019));
        t.setSummaryColor(0xff90a4ae);
        t.setColor(m.getResources().getColor(0x7f080056));
        u = (RevealPanel)S.a(0x7f0b012d);
        u.setIcon(com.qihoo.security.ui.b.a.a().a(0x7f02004d));
        u.setSummary(f.a(0x7f0c0036));
        u.setSummaryColor(0xff90a4ae);
        u.setColor(m.getResources().getColor(0x7f080056));
        t.setOnClickListener(new android.view.View.OnClickListener() {

            final BoosterFragment a;

            public void onClick(View view)
            {
                view = new Intent();
                long l1;
                if (com.qihoo.security.ui.main.BoosterFragment.a(a) == -1L)
                {
                    l1 = com.qihoo.security.ui.main.BoosterFragment.b(a);
                } else
                {
                    l1 = com.qihoo.security.ui.main.BoosterFragment.a(a);
                }
                view.putExtra("free_memory_kb", l1);
                view.putExtra("exam_status", BoosterFragment.c(a));
                view.setClass(a.getActivity(), com/qihoo/security/ui/opti/sysclear/ProcessClearActivity);
                a.startActivityForResult(view, 1000);
                com.qihoo.security.support.b.c(11014);
            }

            
            {
                a = BoosterFragment.this;
                super();
            }
        });
        u.setOnClickListener(new android.view.View.OnClickListener() {

            final BoosterFragment a;

            public void onClick(View view)
            {
                view = new Intent();
                long l1;
                if (com.qihoo.security.ui.main.BoosterFragment.a(a) == -1L)
                {
                    l1 = com.qihoo.security.ui.main.BoosterFragment.b(a);
                } else
                {
                    l1 = com.qihoo.security.ui.main.BoosterFragment.a(a);
                }
                view.putExtra("free_memory_kb", l1);
                view.putExtra("exam_status", BoosterFragment.c(a));
                view.putExtra("battery_power", com.qihoo.security.ui.main.BoosterFragment.d(a));
                view.setClass(a.getActivity(), com/qihoo/security/ui/opti/sysclear/PowerActivity);
                a.startActivityForResult(view, 1001);
                com.qihoo.security.support.b.c(11015);
            }

            
            {
                a = BoosterFragment.this;
                super();
            }
        });
        a(X);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (intent != null)
        {
            com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus = (com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus)intent.getSerializableExtra("exam_status");
            if (examstatus != null)
            {
                a(examstatus, false);
            }
        }
        i1;
        JVM INSTR lookupswitch 3: default 72
    //                   100: 105
    //                   1000: 73
    //                   1001: 89;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (j1 == -1 || intent != null)
        {
            a(intent, i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j1 == -1 || intent != null)
        {
            a(intent, i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j1 == 200)
        {
            n();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getIntent().getAction();
        if ("com.qihoo.security.notify.ACTION_BOOST".equals(bundle) || "com.qihoo.security.notify.ACTION_BATTERY_LOW".equals(bundle) || "com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND".equals(bundle) || "com.qihoo.security.notify.ACTION_POWER_REMIND".equals(bundle))
        {
            P = getActivity().getIntent().getBooleanExtra("from_notify", false);
            Q = getActivity().getIntent().getBooleanExtra("jump_result_page", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        m = SecurityApplication.a();
        S = com.qihoo.security.ui.b.a.a().b(0x7f030055);
        if (S == null)
        {
            S = new com.qihoo.security.ui.b.a.f();
            S.b = layoutinflater.inflate(0x7f030055, viewgroup, false);
        }
        n = (ViewGroup)S.b;
        o();
        t();
        K = new a();
        L = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        m.registerReceiver(K, L);
        Y = com.qihoo.security.ui.b.e.a(m);
        return n;
    }

    public void onDestroy()
    {
        R.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void onDestroyView()
    {
        m.unregisterReceiver(K);
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStart()
    {
        super.onStart();
        u();
        r();
        ComponentName componentname = com.qihoo.security.booster.a.b();
        if (k && componentname != null && componentname.getClassName().equals("com.qihoo.security.ui.main.HomeActivity"))
        {
            k = false;
            a = true;
            a(false);
        } else
        if (!k)
        {
            a(false);
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        v();
        s();
        if (H != com.qihoo.security.ui.main.e.b) goto _L2; else goto _L1
_L1:
        a(com.qihoo.security.ui.main.e.a);
_L4:
        ComponentName componentname = com.qihoo.security.booster.a.b();
        if (componentname != null && !componentname.getPackageName().equals("com.qihoo.security.lite"))
        {
            k = true;
        }
        return;
_L2:
        if (H == com.qihoo.security.ui.main.e.d)
        {
            a(com.qihoo.security.ui.main.e.e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (Q)
        {
            a(e.c);
            b(getActivity().getIntent());
        }
        super.onViewCreated(view, bundle);
    }
}
