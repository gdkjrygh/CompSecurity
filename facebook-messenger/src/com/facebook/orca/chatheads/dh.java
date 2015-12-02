// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.ad;
import android.support.v4.app.bb;
import android.support.v4.app.q;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.a.c.a;
import com.facebook.b.a.b;
import com.facebook.c.s;
import com.facebook.common.e.h;
import com.facebook.debug.log.f;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.l;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.o;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.compose.LocationDisabledNuxView;
import com.facebook.orca.compose.LocationNuxView;
import com.facebook.orca.compose.ap;
import com.facebook.orca.d.af;
import com.facebook.orca.d.bf;
import com.facebook.orca.d.m;
import com.facebook.orca.emoji.ah;
import com.facebook.orca.emoji.ai;
import com.facebook.orca.f.k;
import com.facebook.orca.notify.av;
import com.facebook.orca.prefs.az;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadTitleView;
import com.facebook.orca.threadview.ThreadViewMessageFragment;
import com.facebook.orca.threadview.ar;
import com.facebook.orca.threadview.cb;
import com.facebook.orca.threadview.ci;
import com.facebook.orca.threadview.cm;
import com.facebook.orca.threadview.cn;
import com.facebook.orca.threadview.co;
import com.facebook.orca.threadview.cp;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.widget.d;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            du, di, dl, dt, 
//            dp, ek, en, dq, 
//            dr, ds, dm, ef, 
//            dn, dj, dk, do

public class dh extends d
    implements ar
{

    public static final Class a = com/facebook/orca/chatheads/dh;
    private static final g b = com.facebook.n.g.a(150D, 12D);
    private static final g c = com.facebook.n.g.a(65D, 8.5D);
    private View A;
    private View B;
    private ViewGroup C;
    private ThreadTitleView D;
    private EmptyListViewItem E;
    private View F;
    private ImageButton G;
    private com.facebook.widget.s H;
    private com.facebook.widget.s I;
    private int J;
    private int K;
    private int L;
    private int M;
    private ThreadViewSpec N;
    private int O;
    private int P;
    private c Q;
    private ab R;
    private boolean S;
    private boolean T;
    private boolean U;
    private ek V;
    private boolean W;
    private boolean Z;
    private boolean aa;
    private long ab[];
    private int ac;
    private com.actionbarsherlock.widget.a ad;
    private ef ae;
    private dt af;
    private ai ag;
    private com.facebook.orca.compose.av ah;
    private cp ai;
    private h aj;
    private final bb d = new bb(this);
    private final du e = new du(this, null);
    private k f;
    private com.facebook.orca.f.o g;
    private cb h;
    private ci i;
    private av j;
    private az k;
    private bf l;
    private m m;
    private af n;
    private com.facebook.orca.common.ui.widgets.text.a o;
    private j p;
    private com.facebook.common.hardware.q q;
    private com.facebook.common.hardware.t r;
    private com.facebook.ui.f.a s;
    private com.facebook.messages.ipc.k t;
    private s u;
    private b v;
    private com.facebook.orca.common.ui.widgets.a w;
    private com.facebook.ui.d.d x;
    private ThreadViewMessageFragment y;
    private ah z;

    public dh(Context context)
    {
        super(context);
        Z = true;
        aa = false;
        ab = new long[300];
        ai = ci.a;
        i();
        j();
        k();
        r = new di(this);
        com.a.c.a.e(this, 0.0F);
        com.a.c.a.f(this, 0.0F);
        com.a.c.a.a(this, 0.0F);
        Q = p.b().a(b).d(0.004999999888241291D).e(0.004999999888241291D).a(e);
        d.k();
        h = new dl(this, getContext());
    }

    static com.actionbarsherlock.widget.a a(dh dh1, com.actionbarsherlock.widget.a a1)
    {
        dh1.ad = a1;
        return a1;
    }

    static ab a(dh dh1, ab ab1)
    {
        dh1.R = ab1;
        return ab1;
    }

    static void a(View view, boolean flag)
    {
        b(view, flag);
    }

    private void a(ServiceException serviceexception, boolean flag)
    {
        if (!S)
        {
            return;
        }
        com.facebook.orca.common.ui.widgets.a a1 = w;
        long l1;
        if (flag)
        {
            l1 = 5000L;
        } else
        {
            l1 = 0L;
        }
        a1.a(l1);
        w.a(true);
        w.a(80);
        w.a(D, x.a(serviceexception, false, true), com.facebook.orca.common.ui.widgets.d.WARNING);
    }

    private void a(ThreadViewSpec threadviewspec)
    {
        if (af != null)
        {
            af.a(N, threadviewspec);
        }
        setThreadNoResetViews(threadviewspec);
    }

    private void a(ThreadViewSpec threadviewspec, boolean flag)
    {
        if (!ThreadViewSpec.a(threadviewspec, N))
        {
            N = threadviewspec;
            ai = ci.a;
            b(threadviewspec, flag);
            i.a(threadviewspec);
            h.a(threadviewspec);
            b(threadviewspec);
            b(true);
        }
        if (flag)
        {
            z.a();
            m.a();
            n.b();
        }
    }

    static void a(dh dh1, ThreadViewSpec threadviewspec)
    {
        dh1.a(threadviewspec);
    }

    static void a(dh dh1, ThreadSummary threadsummary)
    {
        dh1.a(threadsummary);
    }

    static void a(dh dh1, cn cn1)
    {
        dh1.a(cn1);
    }

    static void a(dh dh1, cn cn1, cm cm1)
    {
        dh1.a(cn1, cm1);
    }

    static void a(dh dh1, cn cn1, cp cp1)
    {
        dh1.a(cn1, cp1);
    }

    static void a(dh dh1, User user)
    {
        dh1.a(user);
    }

    static void a(dh dh1, String s1)
    {
        dh1.a(s1);
    }

    private void a(ThreadSummary threadsummary)
    {
        b(threadsummary);
    }

    private void a(cn cn1)
    {
        if (cn1 == cn.THREAD_VIEW)
        {
            E.setMessage(getResources().getString(o.thread_loading));
            E.a(true);
        } else
        if (cn1 == cn.MORE_MESSAGES)
        {
            y.c();
            return;
        }
    }

    private void a(cn cn1, cm cm1)
    {
        boolean flag = true;
        if (cn1 == cn.THREAD_VIEW)
        {
            if (ai.a == null || ai.b == null)
            {
                E.a(false);
                E.setMessage(null);
                flag = false;
            } else
            {
                E.a(false);
                E.setMessage(null);
                E.setVisibility(8);
                t();
            }
            if (cm1.b)
            {
                a(cm1.a, flag);
            }
        } else
        if (cn1 == cn.MORE_MESSAGES)
        {
            if (cm1.b)
            {
                a(cm1.a, true);
            }
            y.U();
            return;
        }
    }

    private void a(cn cn1, cp cp1)
    {
        ai = cp1;
        if (af != null)
        {
            af.a(cp1.a);
        }
        E.setVisibility(8);
        t();
    }

    private void a(User user)
    {
        E.setVisibility(8);
    }

    private void a(String s1)
    {
        if (af != null)
        {
            af.a(s1);
        }
    }

    static boolean a(dh dh1)
    {
        return dh1.U;
    }

    static boolean a(dh dh1, boolean flag)
    {
        dh1.Z = flag;
        return flag;
    }

    private static void b(View view, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            view.setDrawingCacheEnabled(flag);
            return;
        }
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        view.setLayerType(byte0, null);
    }

    private void b(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            threadviewspec = f.b(threadviewspec.d());
            if (threadviewspec != null)
            {
                D.setThreadNameViewData(o.a(threadviewspec));
            }
            return;
        }
        if (threadviewspec.b())
        {
            D.setThreadNameViewData(o.a(threadviewspec.e()));
            return;
        } else
        {
            D.setThreadNameViewData(null);
            return;
        }
    }

    private void b(ThreadViewSpec threadviewspec, boolean flag)
    {
        if (threadviewspec != null)
        {
            if (y == null)
            {
                y = ThreadViewMessageFragment.a(true);
                y.a(ah);
                y.a("chathead");
                Object obj = getSupportFragmentManager().a();
                ((ad) (obj)).b(i.fragment_container, y, "threadViewMessageFragment");
                ((ad) (obj)).b();
                getSupportFragmentManager().b();
                G = (ImageButton)c(i.popup_menu_button);
                G.setOnClickListener(new dp(this));
                E = new EmptyListViewItem(getContext());
                E.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                C.addView(E);
                if (V != null)
                {
                    V.d();
                    V = null;
                }
                V = new ek(y.z(), F, en.UP);
                V.a(new dq(this));
                V.a();
                y.a(this);
                y.e(2);
                y.a(new dr(this));
                obj = y.Q();
                ((ComposeFragment) (obj)).a(z);
                ((ComposeFragment) (obj)).a(new ds(this));
            }
            if (flag)
            {
                E.setVisibility(0);
                y.a();
            }
            y.a(threadviewspec, flag);
            if (flag)
            {
                B.requestFocus();
                return;
            }
        }
    }

    static void b(dh dh1)
    {
        dh1.t();
    }

    static void b(dh dh1, cn cn1)
    {
        dh1.b(cn1);
    }

    private void b(ThreadSummary threadsummary)
    {
        D.setThreadNameViewData(o.a(threadsummary));
    }

    private void b(cn cn1)
    {
        E.a(false);
        E.setMessage(null);
        E.setVisibility(8);
        if (N.b() && ai != null && ai.a != null)
        {
            a(ThreadViewSpec.a(ai.a.a()));
        }
    }

    private void b(boolean flag)
    {
        if (N == null)
        {
            return;
        } else
        {
            x();
            co co1 = new co(false, flag);
            i.a(co1);
            return;
        }
    }

    static boolean b(dh dh1, boolean flag)
    {
        dh1.aa = flag;
        return flag;
    }

    static long c(dh dh1)
    {
        return dh1.getLastThreadActionId();
    }

    static void c(dh dh1, boolean flag)
    {
        dh1.setIsScrolledToBottom(flag);
    }

    static ek d(dh dh1)
    {
        return dh1.V;
    }

    static void e(dh dh1)
    {
        dh1.v();
    }

    static ThreadViewMessageFragment f(dh dh1)
    {
        return dh1.y;
    }

    static boolean g(dh dh1)
    {
        return dh1.aa;
    }

    private long getLastThreadActionId()
    {
        ThreadSummary threadsummary = ai.a;
        if (threadsummary == null)
        {
            return -1L;
        } else
        {
            return threadsummary.c();
        }
    }

    private q getSupportFragmentManager()
    {
        return d.r();
    }

    static com.facebook.orca.compose.av h(dh dh1)
    {
        return dh1.ah;
    }

    private void i()
    {
        t t1 = getInjector();
        f = (k)t1.a(com/facebook/orca/f/k);
        g = (com.facebook.orca.f.o)t1.a(com/facebook/orca/f/o);
        i = (ci)t1.a(com/facebook/orca/threadview/ci);
        j = (av)t1.a(com/facebook/orca/notify/av);
        k = (az)t1.a(com/facebook/orca/prefs/az);
        l = (bf)t1.a(com/facebook/orca/d/bf);
        m = (m)t1.a(com/facebook/orca/d/m);
        n = (af)t1.a(com/facebook/orca/d/af);
        o = (com.facebook.orca.common.ui.widgets.text.a)t1.a(com/facebook/orca/common/ui/widgets/text/a);
        p = (j)t1.a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads);
        q = (com.facebook.common.hardware.q)t1.a(com/facebook/common/hardware/q);
        s = (com.facebook.ui.f.a)t1.a(com/facebook/ui/f/a);
        t = (com.facebook.messages.ipc.k)t1.a(com/facebook/messages/ipc/k);
        u = (s)t1.a(com/facebook/c/s);
        v = (b)t1.a(com/facebook/b/a/b);
        aj = (h)t1.a(com/facebook/common/e/h);
        w = (com.facebook.orca.common.ui.widgets.a)t1.a(com/facebook/orca/common/ui/widgets/a);
        x = (com.facebook.ui.d.d)t1.a(com/facebook/ui/d/d);
    }

    static boolean i(dh dh1)
    {
        return dh1.Z;
    }

    static b j(dh dh1)
    {
        return dh1.v;
    }

    private void j()
    {
        i.a(new dm(this));
    }

    private void k()
    {
        setContentView(com.facebook.k.orca_chat_heads_thread_view);
        A = c(i.messages_popup_layout);
        A.setBackgroundDrawable(null);
        H = new com.facebook.widget.s(this);
        ae = new ef(getContext(), H);
        View view = getRootView();
        Object obj = c(i.messages_popup_nub);
        D = (ThreadTitleView)c(i.thread_title_view);
        B = c(i.dummy_focus_elt);
        I = new com.facebook.widget.s(((View) (obj)));
        C = (ViewGroup)c(i.fragment_container);
        F = c(i.drag_frame);
        obj = (LocationNuxView)c(i.compose_location_nux);
        LocationDisabledNuxView locationdisablednuxview = (LocationDisabledNuxView)c(i.compose_location_disabled_nux);
        ah = new com.facebook.orca.compose.av(k);
        ah.a(((LocationNuxView) (obj)), locationdisablednuxview);
        obj = getResources();
        J = ((Resources) (obj)).getDimensionPixelOffset(com.facebook.g.chat_head_popup_pivot_x_offset);
        K = ((Resources) (obj)).getDimensionPixelOffset(com.facebook.g.chat_head_popup_pivot_y_offset);
        L = ((Resources) (obj)).getDimensionPixelOffset(com.facebook.g.chat_head_nub_base_width);
        M = ((Resources) (obj)).getDimensionPixelOffset(com.facebook.g.chat_head_nub_base_height);
        view.setOnClickListener(new dn(this));
    }

    static void k(dh dh1)
    {
        dh1.w();
    }

    private void l()
    {
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Too many calls to render layout.");
        ((StringBuilder) (obj)).append("\n\n");
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int j1 = astacktraceelement.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((StringBuilder) (obj)).append(astacktraceelement[i1].toString());
            ((StringBuilder) (obj)).append("\n");
        }

        obj = ((StringBuilder) (obj)).toString();
        com.facebook.debug.log.f.a(a, ((String) (obj)));
        aj.a("T2136301:continuous_render_layout_calls", ((String) (obj)));
    }

    static void l(dh dh1)
    {
        dh1.r();
    }

    static com.facebook.ui.f.a m(dh dh1)
    {
        return dh1.s;
    }

    static ab n(dh dh1)
    {
        return dh1.R;
    }

    private void o()
    {
        ab[ac % 300] = SystemClock.elapsedRealtime() / 1000L;
        if (ab[ac % 300] <= ab[(ac + 1) % 300] + 10L)
        {
            l();
            int j1 = ab.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ab[i1] = 0L;
            }

        }
        ac = (ac + 1) % 300;
    }

    private void p()
    {
        if (R != null)
        {
            R.cancel(false);
            R = null;
        }
    }

    private void q()
    {
        if (y != null)
        {
            y.a(null);
            if (G != null)
            {
                G.setOnClickListener(null);
                G = null;
            }
            if (ad != null)
            {
                ad.c();
                ad = null;
            }
            if (V != null)
            {
                V.d();
                V = null;
            }
            Object obj = y.Q();
            ((ComposeFragment) (obj)).a(null);
            ((ComposeFragment) (obj)).a(null);
            ((ComposeFragment) (obj)).a(null);
            obj = getSupportFragmentManager().a();
            ((ad) (obj)).a(y);
            ((ad) (obj)).b();
            y.a(null);
            y = null;
            getSupportFragmentManager().b();
            C.removeView(E);
            E = null;
        }
    }

    private void r()
    {
        T = false;
        if (N == null)
        {
            return;
        } else
        {
            co co1 = new co(true, true);
            i.a(co1);
            return;
        }
    }

    private boolean s()
    {
        return q.a() && Q.h() && !T;
    }

    private void setIsScrolledToBottom(boolean flag)
    {
        if (flag == W)
        {
            return;
        }
        W = flag;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)F.getLayoutParams();
        if (!flag)
        {
            marginlayoutparams.topMargin = y.R();
        } else
        {
            marginlayoutparams.topMargin = 0;
        }
        F.setLayoutParams(marginlayoutparams);
    }

    private void setThreadNoResetViews(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, false);
    }

    private void t()
    {
        if (!s())
        {
            U = true;
        } else
        {
            U = false;
            b(this, false);
            if (ai.a != null)
            {
                ThreadViewSpec threadviewspec = ThreadViewSpec.a(ai.a.a());
                y.a(threadviewspec, false);
            }
            if (y != null)
            {
                y.a(ai);
            }
            if (ai.a != null)
            {
                b(ai.a);
            }
            if (S)
            {
                u();
                return;
            }
        }
    }

    private void u()
    {
        if (!N.a())
        {
            return;
        }
        long l1 = f.a(N.d());
        if (ai != null && ai.a != null && ai.a.c() > l1)
        {
            g.a(ai.a);
        }
        j.b(N.d());
    }

    private void v()
    {
        ad = new com.actionbarsherlock.widget.a(getContext(), G);
        Object obj = ad.a();
        MenuInflater menuinflater = new MenuInflater(getContext());
        obj = new com.facebook.orca.chatheads.a.b(((com.actionbarsherlock.a.a) (obj)));
        s.a(((android.view.Menu) (obj)), menuinflater);
        menuinflater.inflate(l.orca_chat_heads_menu, ((android.view.Menu) (obj)));
        ad.a(new dj(this));
        ad.a(new dk(this));
        ad.b();
    }

    private void w()
    {
        Object obj;
        if (N.a())
        {
            obj = t.a(N.d());
        } else
        if (N.b())
        {
            obj = N.f().toString();
            obj = t.b(((String) (obj)));
        } else
        {
            obj = t.a();
        }
        obj = new Intent("android.intent.action.VIEW", ((android.net.Uri) (obj)));
        ((Intent) (obj)).setFlags(0x4000000);
        u.a(((Intent) (obj)), getContext());
    }

    private void x()
    {
        w.a();
    }

    public void a()
    {
        if (!S)
        {
            d.m();
            d.n();
            p();
            V.b();
            S = true;
            R = com.google.common.d.a.ab.a();
            Q.a(b).a(false).b(1.0D);
            u();
            if (ai.a == null)
            {
                b(true);
                return;
            }
        }
    }

    public void a(ap ap)
    {
        if (ah != null)
        {
            ah.a(ap);
        }
    }

    public void a(boolean flag)
    {
        i.a(flag);
    }

    public com.google.common.d.a.s b()
    {
        if (!S)
        {
            if (R != null)
            {
                return R;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        y.b();
        d.o();
        d.p();
        if (ad != null)
        {
            ad.c();
        }
        p();
        S = false;
        e();
        R = com.google.common.d.a.ab.a();
        Q.a(c).a(true).b(0.0D);
        if (Q.h())
        {
            R.a_(null);
        }
        x();
        return R;
    }

    public void c()
    {
        if (y != null)
        {
            y.O();
        }
        z.a();
        ah = null;
        q();
        removeAllViewsInLayout();
        k();
        if (N != null)
        {
            ThreadViewSpec threadviewspec = N;
            N = null;
            setThread(threadviewspec);
        }
        B.requestFocus();
        y.Q().a();
    }

    public void d()
    {
        Q.a();
        p();
        ae.a();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && keyevent.getKeyCode() == 82)
        {
            v();
        }
        return l.a(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1 && z != null && z.b())
        {
            z.a();
            return true;
        } else
        {
            return super.dispatchKeyEventPreIme(keyevent);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (ag != null && !ag.a(motionevent))
        {
            z.a();
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public void e()
    {
        if (z != null)
        {
            z.a();
        }
        y.O();
        m.a();
        n.b();
    }

    public void f()
    {
        b(false);
    }

    public void g()
    {
        T = true;
    }

    public int getAvailableScreenHeight()
    {
        return O;
    }

    public int getAvailableScreenWidth()
    {
        return P;
    }

    public int getDesiredKeyboardWidth()
    {
        return C.getWidth();
    }

    public PointF getNubTarget()
    {
        PointF pointf = new PointF();
        pointf.x = H.getPivotX() - (float)J;
        pointf.y = H.getPivotY() - (float)K;
        return pointf;
    }

    public ThreadViewSpec getThread()
    {
        return N;
    }

    public ef getThreadViewSpringyPositioner()
    {
        return ae;
    }

    public void h()
    {
        T = false;
        if (U)
        {
            t();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (d != null)
        {
            d.l();
        }
        h.a();
        h.a(true);
        q.a(r);
    }

    protected void onDetachedFromWindow()
    {
        h.a(false);
        h.b();
        x();
        q.b(r);
        if (y != null)
        {
            y.a(null);
            ComposeFragment composefragment = y.Q();
            composefragment.a(null);
            composefragment.a(null);
            composefragment.a(null);
        }
        if (V != null)
        {
            V.d();
        }
        if (d != null)
        {
            d.q();
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = true;
        super.onLayout(flag, i1, j1, k1, l1);
        if (O != l1 && P != k1)
        {
            O = l1;
            P = k1;
            i1 = ((flag1) ? 1 : 0);
        } else
        if (l1 > O)
        {
            O = l1;
            i1 = ((flag1) ? 1 : 0);
        } else
        if (k1 > P)
        {
            P = k1;
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        o();
        if (i1 != 0 || flag)
        {
            (new Handler()).post(new do(this));
        }
    }

    public void setEmojiKeyboardWindowControl(ah ah1)
    {
        z = ah1;
        if (y != null)
        {
            y.Q().a(z);
        }
    }

    public void setEmojiKeyboardWindowControlListener(ai ai1)
    {
        ag = ai1;
    }

    public void setListener(dt dt1)
    {
        af = dt1;
    }

    public void setNubTarget(PointF pointf)
    {
        float f1 = Math.signum(L);
        float f2 = pointf.x;
        float f3 = Math.signum(M);
        float f4 = pointf.y;
        I.setTranslationX(f1 * f2 - (float)(L / 2));
        I.setTranslationY(f3 * f4 - (float)(M / 2));
        H.setPivotX(pointf.x + (float)J);
        H.setPivotY(pointf.y + (float)K);
    }

    public void setThread(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, true);
    }

}
