// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.a.e;
import android.support.v4.app.ad;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import com.a.a.ak;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.i.c;
import com.facebook.base.activity.q;
import com.facebook.c.s;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.ah;
import com.facebook.debug.log.b;
import com.facebook.g;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.contacts.divebar.DivebarFragment;
import com.facebook.orca.contacts.divebar.bl;
import com.facebook.orca.contacts.divebar.bn;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.ui.touch.SwipableLinearLayout;
import com.facebook.ui.touch.d;
import com.facebook.ui.touch.f;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserKey;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.n;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            m, p, j, l, 
//            k, b, c, n, 
//            o, e, f, g, 
//            h

public class a
    implements d
{

    private static final Class c = com/facebook/orca/common/ui/titlebar/a;
    private com.facebook.orca.common.ui.titlebar.n A;
    private com.facebook.ui.touch.a B;
    private com.facebook.ui.touch.a C;
    private ak D;
    private boolean E;
    private boolean F;
    private Set G;
    private p H;
    private com.facebook.orca.common.ui.a.a I;
    View a;
    ViewGroup b;
    private Activity d;
    private final InputMethodManager e;
    private final av f;
    private final com.facebook.orca.f.k g;
    private final com.facebook.config.a.a h;
    private final javax.inject.a i;
    private final javax.inject.a j;
    private final e k;
    private final s l;
    private final bn m;
    private final com.facebook.orca.presence.d n;
    private SwipableLinearLayout o;
    private View p;
    private DivebarFragment q;
    private bl r;
    private m s;
    private int t;
    private int u;
    private int v;
    private float w;
    private int x;
    private l y;
    private o z;

    public a(InputMethodManager inputmethodmanager, com.facebook.orca.f.k k1, av av1, com.facebook.config.a.a a1, javax.inject.a a2, javax.inject.a a3, com.facebook.orca.common.ui.a.a a4, 
            Set set, e e1, s s1, bn bn1, com.facebook.orca.presence.d d1)
    {
        s = m.CLOSED;
        t = 0;
        u = 0;
        v = 0;
        w = 0.0F;
        x = 0;
        e = inputmethodmanager;
        g = k1;
        f = av1;
        i = a2;
        j = a3;
        I = a4;
        h = a1;
        k = e1;
        l = s1;
        H = new p(f);
        m = bn1;
        n = d1;
        boolean flag;
        if (((Boolean)i.b()).booleanValue() && ((Boolean)j.b()).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        E = flag;
        G = set;
    }

    private android.support.v4.app.q A()
    {
        return ((q)d).f();
    }

    private void B()
    {
        if (a != null)
        {
            a.bringToFront();
            a.requestFocus();
        }
        View view;
        for (Iterator iterator = I().iterator(); iterator.hasNext(); view.requestLayout())
        {
            view = (View)iterator.next();
            view.bringToFront();
        }

    }

    private DivebarFragment C()
    {
        DivebarFragment divebarfragment = DivebarFragment.a(ContactPickerColorScheme.DIVEBAR_SCHEME);
        android.support.v4.app.q q1 = A();
        ad ad1 = q1.a();
        com.facebook.debug.log.b.c(c, "Replacing divebar fragment container with divebar.");
        ad1.a(i.orca_diverbar_fragment_container, divebarfragment);
        if (q1.c())
        {
            ad1.a();
            q1.b();
            return divebarfragment;
        } else
        {
            return null;
        }
    }

    private void D()
    {
        if (B != null)
        {
            B.a((float)t() / 2.0F, 0.0F, t(), u());
        }
        if (C != null)
        {
            C.a(0.0F, 0.0F, u, u());
        }
    }

    private void E()
    {
        if (a == null)
        {
            a = new View(d);
            a.setBackgroundDrawable(d.getResources().getDrawable(h.transparent));
            a.setOnTouchListener(new j(this));
            if (a.getParent() == null)
            {
                a.setVisibility(0);
                b.addView(a, new android.widget.LinearLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void F()
    {
        if (q != null)
        {
            q.a("");
        }
    }

    private void G()
    {
        if (o != null && o.getParent() != null)
        {
            if (p != null)
            {
                p.requestFocus();
            }
            ((ViewGroup)o.getParent()).removeView(o);
        }
    }

    private void H()
    {
        if (a != null && a.getParent() != null)
        {
            ((ViewGroup)a.getParent()).removeView(a);
        }
    }

    private Set I()
    {
        if (!a())
        {
            return new HashSet();
        }
        HashSet hashset = new HashSet();
        int i1 = 0;
        do
        {
            if (i1 >= b.getChildCount())
            {
                break;
            }
            View view = b.getChildAt(i1);
            if (view.getVisibility() == 0 && view != a && view != o && !(view instanceof com.facebook.debug.fps.i) && (y == null || !y.a(view)))
            {
                hashset.add(view);
            }
            i1++;
        } while (true);
        return hashset;
    }

    private String J()
    {
        if (d instanceof com.facebook.analytics.d)
        {
            return ((com.facebook.analytics.d)d).g_().toString();
        } else
        {
            return com.facebook.analytics.f.a.UNKNOWN.toString();
        }
    }

    private boolean K()
    {
        return h.i() == com.facebook.config.a.d.MESSENGER;
    }

    private void L()
    {
label0:
        {
            boolean flag1 = E;
            boolean flag;
            if (((Boolean)i.b()).booleanValue() && ((Boolean)j.b()).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 != flag)
            {
                if (((Boolean)i.b()).booleanValue() && ((Boolean)j.b()).booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                E = flag;
                if (!b())
                {
                    break label0;
                }
                c(0L, new com.facebook.orca.common.ui.titlebar.k(this));
            }
            return;
        }
        M();
    }

    private void M()
    {
        if (d == null)
        {
            return;
        }
        android.support.v4.app.q q1 = A();
        if (q != null && q1.c())
        {
            ad ad1 = q1.a();
            ad1.a(q);
            ad1.a();
            q1.b();
        }
        G();
        q = null;
        o = null;
    }

    static ak a(a a1, ak ak1)
    {
        a1.D = ak1;
        return ak1;
    }

    static SwipableLinearLayout a(a a1)
    {
        return a1.o;
    }

    static String a(a a1, String s1, com.facebook.contacts.picker.ad ad1)
    {
        return a1.a(s1, ad1);
    }

    private String a(String s1, com.facebook.contacts.picker.ad ad1)
    {
        StringBuilder stringbuilder;
        Preconditions.checkNotNull(ad1);
        stringbuilder = new StringBuilder();
        if (s1 != null)
        {
            stringbuilder.append(s1);
        }
        s1 = null;
        if (!(ad1 instanceof ag)) goto _L2; else goto _L1
_L1:
        s1 = ((ag)ad1).j().toString();
_L4:
        if (s1 != null)
        {
            stringbuilder.append("_").append(s1);
        }
        s1 = J();
        if (s1 != null)
        {
            stringbuilder.append("_").append(s1);
        }
        return stringbuilder.toString();
_L2:
        if (ad1 instanceof com.facebook.orca.contacts.picker.ad)
        {
            s1 = "groups";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(long l1, Runnable runnable)
    {
        h();
        b(l1, runnable);
    }

    private void a(ak ak1)
    {
        if (D != null)
        {
            D.b();
        }
        D = ak1;
        Set set = I();
        if (set.size() > 0)
        {
            s = m.ANIMATING;
            ak1.a(new com.facebook.orca.common.ui.titlebar.b(this, set));
            ak1.a();
        }
    }

    static void a(a a1, long l1, Runnable runnable)
    {
        a1.c(l1, runnable);
    }

    static void a(a a1, m m1)
    {
        a1.b(m1);
    }

    static void a(a a1, ThreadSummary threadsummary, boolean flag, String s1)
    {
        a1.a(threadsummary, flag, s1);
    }

    static void a(a a1, UserWithIdentifier userwithidentifier, boolean flag, com.facebook.contacts.picker.ad ad1, String s1)
    {
        a1.a(userwithidentifier, flag, ad1, s1);
    }

    static void a(a a1, Set set, float f1)
    {
        a1.a(set, f1);
    }

    private void a(m m1, long l1, Runnable runnable)
    {
        if (b == null || o == null)
        {
            com.facebook.debug.log.b.e(c, "unable to start animation - failed to locate divebar elements");
            return;
        }
        if (q == null)
        {
            com.facebook.debug.log.b.e(c, "unable to start animation - divebar fragment is not ready");
            return;
        }
        int i1 = v();
        int j1 = t;
        ak ak1;
        if (m1 == m.OPENED)
        {
            i1 = -i1;
        } else
        {
            i1 = 0;
        }
        ak1 = ak.b(new float[] {
            (float)j1, (float)i1
        });
        ak1.c(l1);
        ak1.a(new LinearInterpolator());
        ak1.a(new com.facebook.orca.common.ui.titlebar.c(this, m1, runnable));
        B();
        a(ak1);
    }

    private void a(ThreadSummary threadsummary, boolean flag, String s1)
    {
        Intent intent = new Intent(d, com/facebook/orca/threadview/ThreadViewActivity);
        intent.putExtra("thread_id", threadsummary.a());
        intent.putExtra("focus_compose", true);
        intent.putExtra("trigger", s1);
        intent.setFlags(0x4000000);
        l.a(intent, d);
        l();
    }

    private void a(UserWithIdentifier userwithidentifier, boolean flag, com.facebook.contacts.picker.ad ad1, String s1)
    {
        String s2 = null;
        UserIdentifier useridentifier = userwithidentifier.c();
        com.facebook.user.s s3 = useridentifier.e();
        Object obj;
        if (s3 == com.facebook.user.s.FBID)
        {
            obj = userwithidentifier.a().c();
        } else
        if (s3 == com.facebook.user.s.PHONE)
        {
            obj = new UserKey(n.PHONE_NUMBER, useridentifier.d());
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = ((UserKey) (obj)).toString();
        } else
        {
            obj = null;
        }
        if (ad1 instanceof ag)
        {
            s2 = ((ag)ad1).j().toString();
        }
        a(((String) (obj)), s3.toString(), flag, s2);
        ad1 = new Intent(d, com/facebook/orca/threadview/ThreadViewActivity);
        ad1.putExtra("thread_view_spec", ThreadViewSpec.a(new RecipientInfo(useridentifier, userwithidentifier.a().d())));
        ad1.putExtra("focus_compose", true);
        ad1.putExtra("trigger", s1);
        ad1.setFlags(0x4000000);
        l.a(ad1, d);
        l();
    }

    private void a(String s1, String s2, boolean flag, String s3)
    {
        s1 = (new cb("click")).f("divebar_contact").g(s1).b("contact_type", s2).a("filtered", flag);
        if (s3 != null)
        {
            s1.b("section_type", s3);
        }
        s2 = J();
        if (s2 != null)
        {
            s1.e(s2);
        }
        f.a(s1);
    }

    private void a(Set set, float f1)
    {
        t = (int)f1;
        View view;
        for (set = set.iterator(); set.hasNext(); I.a(view, f1))
        {
            view = (View)set.next();
        }

    }

    static boolean a(a a1, boolean flag)
    {
        a1.F = flag;
        return flag;
    }

    private boolean a(m m1)
    {
        if (q == null && d != null && !A().c())
        {
            return false;
        }
        if (A != null)
        {
            return A.a(m1);
        } else
        {
            return true;
        }
    }

    private void b(int i1)
    {
        int k1 = -v();
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L4:
        a(I(), j1);
        return;
_L2:
        j1 = i1;
        if (i1 < k1)
        {
            j1 = k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(long l1, Runnable runnable)
    {
        a(m.OPENED, l1, runnable);
    }

    static void b(a a1)
    {
        a1.H();
    }

    private void b(m m1)
    {
        if (s == m1) goto _L2; else goto _L1
_L1:
        s = m1;
        if (m.OPENED != m1) goto _L4; else goto _L3
_L3:
        m.b();
        n.b();
        f.b("divebar", false);
_L6:
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.common.ui.titlebar.DIVEBAR_STATE_CHANGED");
        intent.putExtra("state", m1);
        k.a(intent);
_L2:
        return;
_L4:
        if (m.CLOSED == m1)
        {
            f.b("divebar");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int c(int i1)
    {
        int j1 = v;
        if (u == 0)
        {
            u = d.getResources().getDimensionPixelSize(g.divebar_left_margin_width);
        }
        v = Math.min(i1 - u, d.getResources().getDimensionPixelSize(g.divebar_max_width));
        if (v != j1)
        {
            u = t() - v;
            w();
            D();
        }
        return v;
    }

    static DivebarFragment c(a a1)
    {
        return a1.q;
    }

    private void c(long l1, Runnable runnable)
    {
        if (H.a())
        {
            H.c();
        }
        if (s == m.CLOSED || s == m.ANIMATING || q == null || !a(m.CLOSED))
        {
            return;
        } else
        {
            y();
            a(m.CLOSED, l1, runnable);
            return;
        }
    }

    static void d(a a1)
    {
        a1.p();
    }

    static void e(a a1)
    {
        a1.F();
    }

    static void f(a a1)
    {
        a1.G();
    }

    static l g(a a1)
    {
        return a1.y;
    }

    static m h(a a1)
    {
        return a1.s;
    }

    static p i(a a1)
    {
        return a1.H;
    }

    static Set j(a a1)
    {
        return a1.G;
    }

    static void k(a a1)
    {
        a1.z();
    }

    static Activity l(a a1)
    {
        return a1.d;
    }

    static boolean m(a a1)
    {
        return a1.F;
    }

    static void n(a a1)
    {
        a1.L();
    }

    private void o()
    {
        B = new com.facebook.ui.touch.a(this, Arrays.asList(new Integer[] {
            Integer.valueOf(1)
        }), d.getResources().getDimensionPixelSize(g.divebar_swipe__vertical_threshold), d.getResources().getDimensionPixelSize(g.divebar_swipe__to_open_horizontal_threshold));
        B.a(d.getResources().getDimensionPixelSize(g.divebar_swipe__orthogonal_threshold));
        B.a(true);
        D();
        f f1 = r();
        if (f1 != null)
        {
            f1.a(B);
        }
    }

    static void o(a a1)
    {
        a1.M();
    }

    private void p()
    {
        if (o != null)
        {
            SwipableLinearLayout swipablelinearlayout = o;
            C = new com.facebook.ui.touch.a(this, Arrays.asList(new Integer[] {
                Integer.valueOf(-1)
            }), d.getResources().getDimensionPixelSize(g.divebar_swipe__vertical_threshold), d.getResources().getDimensionPixelSize(g.divebar_swipe__to_close_horizontal_threshold));
            C.a(true);
            D();
            swipablelinearlayout.a(C);
        }
    }

    private void q()
    {
        f f1 = r();
        if (f1 != null)
        {
            f1.a();
        }
        B = null;
        C = null;
    }

    private f r()
    {
        if (b != null)
        {
            for (int i1 = 0; i1 < b.getChildCount(); i1++)
            {
                View view = b.getChildAt(i1);
                if (view != null && (view instanceof f))
                {
                    return (f)view;
                }
            }

        }
        return null;
    }

    private int s()
    {
        int i1 = 0;
        if (b != null)
        {
            i1 = b.getWidth();
        }
        int j1 = i1;
        if (i1 <= 0)
        {
            j1 = t();
        }
        return j1;
    }

    private int t()
    {
        return d.getWindowManager().getDefaultDisplay().getWidth();
    }

    private int u()
    {
        return d.getWindowManager().getDefaultDisplay().getHeight();
    }

    private int v()
    {
        if (v <= 0)
        {
            c(t());
        }
        return v;
    }

    private void w()
    {
        x();
        if (s == m.CLOSED || q == null)
        {
            return;
        } else
        {
            b(0L, ((Runnable) (null)));
            return;
        }
    }

    private void x()
    {
        if (o != null)
        {
            View view = o.findViewById(i.empty);
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            layoutparams.width = u;
            view.setLayoutParams(layoutparams);
        }
    }

    private void y()
    {
        if (d == null)
        {
            throw new IllegalStateException("DivebarController not attached to an activity");
        }
        if (b == null)
        {
            return;
        }
        if (y != null)
        {
            y.a(s);
        }
        k();
        E();
        e.hideSoftInputFromWindow(d.getWindow().getDecorView().getWindowToken(), 0);
    }

    private void z()
    {
        c(s());
    }

    public void a(float f1, float f2)
    {
        if (!a())
        {
            return;
        }
        w = f1;
        if (c())
        {
            h();
            x = 0;
        } else
        {
            x = v();
        }
        if (z != null)
        {
            z.a(f1, f2);
        }
        B();
    }

    public void a(float f1, float f2, int i1)
    {
        if (!a() || q == null)
        {
            return;
        }
        com.facebook.analytics.i.c.a(d).a("swipe");
        if (c() && B != null && B.a() < 0.0F)
        {
            b(50L, ((Runnable) (null)));
            return;
        }
        if (b() && C != null && C.a() > 0.0F)
        {
            c(50L, ((Runnable) (null)));
            return;
        } else
        {
            i();
            return;
        }
    }

    public void a(int i1)
    {
        if (s == m.OPENED || s == m.ANIMATING || !a(m.OPENED))
        {
            return;
        } else
        {
            a(i1, ((Runnable) (null)));
            return;
        }
    }

    public void a(Activity activity)
    {
        if (!(activity instanceof q))
        {
            throw new IllegalStateException("DivebarController must be attached to a FragmentEnabledActivity");
        } else
        {
            d = activity;
            b = (ViewGroup)activity.getWindow().getDecorView().findViewById(0x1020002);
            c(t());
            n();
            return;
        }
    }

    public boolean a()
    {
        return d != null && b != null;
    }

    public void b(float f1, float f2)
    {
        if (!a())
        {
            return;
        } else
        {
            b((int)(f1 - w) - x);
            return;
        }
    }

    public boolean b()
    {
        return s == m.OPENED;
    }

    public void c(float f1, float f2)
    {
    }

    public boolean c()
    {
        return s == m.CLOSED;
    }

    public m d()
    {
        return s;
    }

    public void e()
    {
        if (!a())
        {
            return;
        } else
        {
            u = 0;
            v = 0;
            v = c(t());
            return;
        }
    }

    public boolean f()
    {
        if (b())
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    public void g()
    {
        a(140);
    }

    public void h()
    {
        y();
        for (Iterator iterator = I().iterator(); iterator.hasNext(); ((View)iterator.next()).bringToFront()) { }
        if (o != null)
        {
            o.setVisibility(0);
        }
        if (q != null && q.s())
        {
            q.a();
            q.b();
        }
    }

    public void i()
    {
        if (s != m.ANIMATING)
        {
            y();
            a(s, 25L, ((Runnable) (null)));
        }
    }

    public void j()
    {
        c(140L, ((Runnable) (null)));
    }

    public void k()
    {
label0:
        {
            if (o == null)
            {
                o = (SwipableLinearLayout)LayoutInflater.from(d).inflate(k.orca_divebar, (ViewGroup)d.findViewById(0x1020002)).findViewById(i.divebar_container);
                o.setVisibility(4);
                x();
                r = new com.facebook.orca.common.ui.titlebar.e(this);
                o.setOnSizeChangedListener(new com.facebook.orca.common.ui.titlebar.f(this));
                o.findViewById(i.empty).setOnClickListener(new com.facebook.orca.common.ui.titlebar.g(this));
            }
            if (p == null)
            {
                p = LayoutInflater.from(d).inflate(k.focusable_dummy_view, (ViewGroup)d.findViewById(0x1020002));
            }
            if (o.getParent() == null)
            {
                o.setVisibility(8);
                b.addView(o, new android.widget.LinearLayout.LayoutParams(-1, -1));
            }
            if (q == null)
            {
                q = C();
                if (q != null)
                {
                    break label0;
                }
                com.facebook.debug.log.b.d(c, "Cannot attach divebar to activity %s.", new Object[] {
                    d.getClass().getSimpleName()
                });
            }
            return;
        }
        com.facebook.debug.log.b.c(c, "DivebarFragment created for activity: %s", new Object[] {
            d, getClass().getSimpleName()
        });
        q.a(r);
        q.a(new com.facebook.orca.common.ui.titlebar.h(this));
    }

    public void l()
    {
        F = true;
    }

    public void m()
    {
        if (K() && B != null)
        {
            q();
        }
    }

    public void n()
    {
        if (K() && B == null)
        {
            o();
        }
    }

}
