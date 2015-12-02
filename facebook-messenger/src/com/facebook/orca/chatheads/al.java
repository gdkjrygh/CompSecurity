// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.analytics.cb;
import com.facebook.analytics.i.c;
import com.facebook.common.e.h;
import com.facebook.common.hardware.q;
import com.facebook.common.hardware.t;
import com.facebook.common.keyguard.KeyguardPendingIntentActivity;
import com.facebook.debug.log.b;
import com.facebook.g;
import com.facebook.i.a.a.f;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.n.j;
import com.facebook.orca.chatheads.b.k;
import com.facebook.orca.prefs.n;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.user.UserIdentifierKey;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import com.google.common.d.a.w;
import java.util.Iterator;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            am, ax, az, bu, 
//            bo, ak, i, bh, 
//            bi, eb, bx, bt, 
//            bj, dc, av, cf, 
//            ag, ae, v, ca, 
//            bv, n, br, aw, 
//            cm, cl, ChatHeadCloseTargetView, bs, 
//            ay, ef, by, d, 
//            ba, ar, bc, ck, 
//            ap, bf, as, ac, 
//            aq, at, bd, cz, 
//            bk, bl, bm, bn, 
//            an, ao, be, bg

public class al
{

    public static final Class a = com/facebook/orca/chatheads/al;
    private static final int d = ViewConfiguration.getLongPressTimeout();
    private final Runnable A = new ax(this);
    private boolean B;
    private bx C;
    private bt D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private Rect M;
    private Rect N;
    private bs O;
    private final ak P;
    private final ak Q;
    private final List R = hq.a();
    private int S;
    private final com.facebook.orca.chatheads.i T = new com.facebook.orca.chatheads.i();
    private ag U;
    private ae V;
    private boolean W;
    private dc X;
    private cf Y;
    private cm Z;
    private boolean aa;
    private ck ab;
    private com.facebook.orca.chatheads.n ac;
    private boolean ad;
    private ag ae;
    private boolean af;
    private boolean ag;
    private float ah;
    private float ai;
    private int aj;
    private int ak[];
    private final android.view.View.OnClickListener al = new az(this);
    bo b;
    private final android.view.View.OnTouchListener c = new am(this);
    private final Context e;
    private final a f;
    private final d g;
    private final com.facebook.c.s h;
    private final WindowManager i;
    private final PowerManager j;
    private final q k;
    private final KeyguardManager l;
    private final com.facebook.orca.f.a m;
    private final by n;
    private final com.facebook.base.broadcast.q o;
    private final com.facebook.orca.threads.q p;
    private Handler q;
    private Handler r;
    private final eb s;
    private final k t;
    private final f u;
    private final ComponentName v;
    private final h w;
    private final cz x;
    private final t y = new bh(this);
    private int z;

    public al(Context context, a a1, d d1, com.facebook.c.s s1, WindowManager windowmanager, PowerManager powermanager, q q1, 
            KeyguardManager keyguardmanager, com.facebook.orca.f.a a2, by by1, com.facebook.orca.threads.q q2, com.facebook.common.executors.a a3, j j1, eb eb1, 
            k k1, f f1, ComponentName componentname, h h1, cz cz1)
    {
        N = new Rect();
        ak = new int[2];
        e = context;
        f = a1;
        g = d1;
        h = s1;
        i = windowmanager;
        j = powermanager;
        k = q1;
        l = keyguardmanager;
        m = a2;
        n = by1;
        p = q2;
        q = new bu(this);
        r = new Handler();
        s = eb1;
        b = new bo(this, j1);
        t = k1;
        u = f1;
        v = componentname;
        w = h1;
        x = cz1;
        P = new ak(a3);
        Q = new ak(a3);
        k.a(y);
        s.a(new bi(this));
        s.a();
        m();
        n();
        p();
        C = new bx(this);
        D = new bt(this);
        o();
        A();
        v();
        context = new IntentFilter();
        context.addAction("com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI");
        o = new bj(this, e, context);
    }

    static k A(al al1)
    {
        return al1.t;
    }

    private void A()
    {
        z = i.getDefaultDisplay().getRotation();
    }

    private void B()
    {
        if (X != null && e())
        {
            X.h();
            return;
        } else
        {
            b(true);
            ae();
            return;
        }
    }

    static void B(al al1)
    {
        al1.D();
    }

    static bs C(al al1)
    {
        return al1.O;
    }

    private void C()
    {
        D.a();
        C.a();
    }

    static ak D(al al1)
    {
        return al1.P;
    }

    private void D()
    {
        if (t.c() && !e() && d())
        {
            t.e();
        }
    }

    private void E()
    {
        (new Handler()).post(new av(this));
    }

    static void E(al al1)
    {
        al1.am();
    }

    static cf F(al al1)
    {
        return al1.Y;
    }

    private void F()
    {
        Rect rect = G();
        if (!Objects.equal(rect, M))
        {
            M = rect;
            C();
        }
    }

    private Rect G()
    {
        View view = Y.h();
        return new Rect(0, 0, view.getWidth() - N.left - N.right, view.getHeight() - N.top - N.bottom);
    }

    static void G(al al1)
    {
        al1.U();
    }

    static ag H(al al1)
    {
        return al1.U;
    }

    private void H()
    {
        if (!e())
        {
            a(P.e());
            a(Q.e());
            return;
        } else
        {
            b(P.d());
            b(Q.d());
            return;
        }
    }

    static int I(al al1)
    {
        return al1.F;
    }

    private ag I()
    {
        int i1 = P.b() - 1;
_L5:
        ThreadViewSpec threadviewspec;
        ThreadViewSpec threadviewspec1;
        com.facebook.messages.threads.model.b b1;
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        threadviewspec1 = P.a(i1).getThreadViewSpec();
        b1 = threadviewspec1.h();
        threadviewspec = threadviewspec1;
        if (U == null) goto _L2; else goto _L1
_L1:
        if (Objects.equal(b1, U.getThreadViewSpec().h())) goto _L4; else goto _L3
_L3:
        threadviewspec = threadviewspec1;
_L2:
        return P.d(threadviewspec);
_L4:
        i1--;
          goto _L5
        threadviewspec = null;
          goto _L2
    }

    static void J(al al1)
    {
        al1.af();
    }

    private boolean J()
    {
        return P.b() >= S - 1;
    }

    static s K(al al1)
    {
        return al1.X();
    }

    private boolean K()
    {
        return ah > 0.5F;
    }

    private ae L()
    {
        if (V != null)
        {
            return V;
        } else
        {
            V = (ae)f.b();
            V.a(new v(e));
            V.a(al);
            V.a();
            return V;
        }
    }

    static s L(al al1)
    {
        return al1.Q();
    }

    private ag M()
    {
        r();
        ag ag1 = new ag(e);
        ag1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 51));
        ((ca)Y.h()).getChatHeadsContainer().addView(ag1);
        ag1.setOnTouchListener(new bv(this, ag1));
        return ag1;
    }

    static br M(al al1)
    {
        return al1.N();
    }

    private br N()
    {
        if (e())
        {
            return D;
        } else
        {
            return C;
        }
    }

    static s N(al al1)
    {
        return al1.Y();
    }

    private s O()
    {
        t.h();
        Object obj = N();
        e();
        Object obj1 = es.e();
        for (Iterator iterator2 = P.e().iterator(); iterator2.hasNext(); ((et) (obj1)).b(((ag)iterator2.next()).getSpringyPositioner())) { }
        ((et) (obj1)).b(ac.getSpringyPositioner());
        obj1 = ((et) (obj1)).b();
        if (((es) (obj1)).size() == 1)
        {
            ac.g();
        }
        am();
        obj = ((br) (obj)).a(((List) (obj1)));
        com.google.common.d.a.i.a(((s) (obj)), new aw(this));
        for (Iterator iterator = P.e().iterator(); iterator.hasNext(); ((ag)iterator.next()).setUnreadCountOnLeftSide(K())) { }
        for (Iterator iterator1 = Q.e().iterator(); iterator1.hasNext(); ((ag)iterator1.next()).setUnreadCountOnLeftSide(K())) { }
        if (z())
        {
            P();
        }
        return ((s) (obj));
    }

    static void O(al al1)
    {
        al1.aj();
    }

    private void P()
    {
        if (z() && X != null)
        {
            Object obj = U.getThreadViewSpec();
            int i1 = P.e(((ThreadViewSpec) (obj)));
            obj = D.b(i1);
            X.a(b(((PointF) (obj))));
        }
    }

    static void P(al al1)
    {
        al1.ak();
    }

    private s Q()
    {
        if (V == null)
        {
            return com.google.common.d.a.i.a(null);
        } else
        {
            return ((v)V.h()).b();
        }
    }

    static void Q(al al1)
    {
        al1.an();
    }

    private void R()
    {
        for (Iterator iterator = P.d().iterator(); iterator.hasNext(); e((ag)iterator.next())) { }
        for (Iterator iterator1 = R.iterator(); iterator1.hasNext(); e((ag)iterator1.next())) { }
        ((cl)Z.h()).a();
        P.a();
        R.clear();
        Q.a();
        m.a();
        if (V != null)
        {
            V.a(null);
            V.b();
            V = null;
        }
    }

    private s S()
    {
        f(((ag) (null)));
        java.util.ArrayList arraylist = hq.a();
        if (X != null)
        {
            arraylist.add(X.d());
        }
        if (Y != null)
        {
            arraylist.add(Y.e().b());
            arraylist.add(Y());
        }
        return com.google.common.d.a.i.a(arraylist);
    }

    private void T()
    {
        if (V != null)
        {
            V.b();
            V = null;
        }
        if (aa || !j.isScreenOn())
        {
            com.facebook.debug.log.b.b(a, "Skipping hideAuxiliaryWindows since showing mini window or screen is off");
            O.c();
            return;
        } else
        {
            com.google.common.d.a.i.a(S(), new ay(this));
            return;
        }
    }

    private void U()
    {
        if (t.d())
        {
            t.n();
            t.g();
        }
    }

    private int V()
    {
        int i1 = e.getResources().getDisplayMetrics().widthPixels;
        int j1 = N.left;
        int k1 = N.right;
        int l1 = E;
        int i2 = G;
        int j2 = N.left;
        int k2 = G;
        float f1 = ah;
        return (int)((float)((i1 - j1 - k1 - l1) + i2 * 2) * f1) + (j2 - k2);
    }

    private int W()
    {
        int i1 = e.getResources().getDisplayMetrics().heightPixels - F;
        int j1 = (int)(ai * (float)i1);
        return Math.max(N.top, Math.min(j1, i1 - N.bottom));
    }

    private s X()
    {
        s s1 = Y.c();
        ac.f();
        Q();
        O();
        return s1;
    }

    private s Y()
    {
        return Y.d();
    }

    private s Z()
    {
        if (aa())
        {
            return ab();
        } else
        {
            return com.google.common.d.a.i.a(null);
        }
    }

    private int a(float f1, float f2)
    {
        if (f2 > 0.0F)
        {
            return (int)Math.floor(f1 / f2);
        } else
        {
            return 0;
        }
    }

    static int a(al al1, float f1, float f2)
    {
        return al1.b(f1, f2);
    }

    private cb a(cb cb1)
    {
        return cb1.a("headcount", P.b()).a("popupspace_open", e()).a("device_rotation", z);
    }

    static ag a(al al1, ag ag1)
    {
        al1.ae = ag1;
        return ag1;
    }

    private s a(ag ag1)
    {
        PointF pointf = N().a(0);
        float f3 = pointf.y;
        float f4 = I;
        float f5 = K;
        float f1;
        float f2;
        if (pointf.x < (float)(e.getResources().getDisplayMetrics().widthPixels / 2))
        {
            f1 = J;
            f2 = pointf.x + (float)H;
        } else
        {
            f1 = -J;
            f2 = pointf.x - (float)H;
        }
        ag1 = ag1.getSpringyPositioner();
        ag1.b(new PointF(f2, f3 + f4));
        return ag1.a(pointf, f1, f5);
    }

    static s a(al al1, ThreadViewSpec threadviewspec, String s1)
    {
        return al1.d(threadviewspec, s1);
    }

    private void a(PointF pointf)
    {
        DisplayMetrics displaymetrics = e.getResources().getDisplayMetrics();
        int i1 = displaymetrics.widthPixels;
        int j1 = displaymetrics.heightPixels;
        int k1 = E;
        int l1 = F;
        if (pointf.x < (float)((i1 - k1) / 2))
        {
            ah = 0.0F;
            Z.a(true);
        } else
        {
            ah = 1.0F;
            Z.a(false);
        }
        ai = Math.max(0.0F, Math.min(pointf.y / (float)(j1 - l1), 1.0F));
        g.b().a(n.D, ah).a(n.E, ai).a();
        n.a(a(n.a("dock", (ThreadViewSpec)null, null).a("x", ah).a("y", ai).b("device_model", Build.MODEL).a("device_width", i1).a("device_height", j1)));
    }

    private void a(Rect rect)
    {
        N.set(rect);
        Y.a(rect);
        t();
        C();
        O();
    }

    private void a(ThreadViewSpec threadviewspec, int i1)
    {
        P.d(threadviewspec).setUnreadCount(i1);
        Q.d(threadviewspec).setUnreadCount(i1);
        H();
    }

    private void a(ThreadViewSpec threadviewspec, Message message)
    {
        a(threadviewspec, com.facebook.messages.ipc.peer.e.a(threadviewspec.d(), message.d(), u));
    }

    private void a(ThreadViewSpec threadviewspec, ag ag1)
    {
        for (; J(); a(I(), "max_chathead_limit")) { }
        ag1.setPendingThreadViewSpec(threadviewspec);
        P.a(threadviewspec, ag1);
        ag1.setThreadViewSpec(threadviewspec);
        ag1.setUnreadCount(0);
        ag1.setUnreadCountOnLeftSide(K());
        ag1 = ag1.i();
        ag1.setPendingThreadViewSpec(threadviewspec);
        Q.a(threadviewspec, ag1);
        ag1.setThreadViewSpec(threadviewspec);
        ((cl)Z.h()).a(ag1);
    }

    private void a(com.facebook.messages.threads.model.b b1, ThreadViewSpec threadviewspec)
    {
        ag ag1 = P.a(b1);
        ag ag2 = Q.a(b1);
        if (ag1 == null)
        {
            return;
        }
        ag1.setPendingThreadViewSpec(threadviewspec);
        com.facebook.messages.threads.model.b b2 = threadviewspec.h();
        P.a(b1, threadviewspec);
        ag1.setThreadViewSpec(threadviewspec);
        if (ag2 != null)
        {
            ag2.setPendingThreadViewSpec(threadviewspec);
            Q.a(b1, threadviewspec);
            ag2.setThreadViewSpec(threadviewspec);
        }
        m.b(b1);
        m.a(b2);
    }

    private void a(ag ag1, float f1, float f2)
    {
        Object obj = ag1.getThreadViewSpec();
        P.a(((ThreadViewSpec) (obj)));
        Object obj1 = Q.d(((ThreadViewSpec) (obj)));
        Q.a(((ThreadViewSpec) (obj)));
        ((cl)Z.h()).c(((ag) (obj1)));
        R.add(ag1);
        m.b(((ThreadViewSpec) (obj)).h());
        T.a(((ThreadViewSpec) (obj)));
        obj = ag1.getSpringyPositioner();
        obj1 = e.getResources().getDisplayMetrics();
        obj1 = new PointF(((DisplayMetrics) (obj1)).widthPixels / 2 - E / 2, ((DisplayMetrics) (obj1)).heightPixels - F);
        ag1.setActionState(d.CLOSE);
        ((ef) (obj)).b(((PointF) (obj1)), f1, f2).a(new ba(this, ag1), com.google.common.d.a.w.a());
    }

    private void a(ag ag1, int i1)
    {
        ag1 = ag1.getThreadViewSpec();
        int j1 = P.e(ag1);
        if (j1 == i1)
        {
            return;
        }
        P.a(ag1, i1);
        Q.a(ag1, i1);
        ag1 = ((ca)Y.h()).getChatHeadsContainer();
        cl cl1 = (cl)Z.h();
        for (i1 = Math.max(j1, i1); i1 >= 0; i1--)
        {
            ag ag2 = P.a(i1);
            ag ag3 = Q.a(i1);
            ag1.bringChildToFront(ag2);
            cl1.b(ag3);
        }

        O();
    }

    private void a(ag ag1, String s1)
    {
        Preconditions.checkNotNull(ag1);
        ThreadViewSpec threadviewspec = ag1.getThreadViewSpec();
        P.a(threadviewspec);
        e(ag1);
        ag1 = Q.d(threadviewspec);
        ((cl)Z.h()).c(ag1);
        Q.a(threadviewspec);
        T.a(threadviewspec);
        m.b(threadviewspec.h());
        if (s1 != null)
        {
            a("remove", s1);
        }
        if (!d())
        {
            T();
        }
    }

    static void a(al al1, int i1)
    {
        al1.c(i1);
    }

    static void a(al al1, Intent intent)
    {
        al1.b(intent);
    }

    static void a(al al1, PointF pointf)
    {
        al1.a(pointf);
    }

    static void a(al al1, Rect rect)
    {
        al1.a(rect);
    }

    static void a(al al1, Message message)
    {
        al1.b(message);
    }

    static void a(al al1, com.facebook.messages.threads.model.b b1, ThreadViewSpec threadviewspec)
    {
        al1.a(b1, threadviewspec);
    }

    static void a(al al1, ag ag1, float f1, float f2)
    {
        al1.a(ag1, f1, f2);
    }

    static void a(al al1, ag ag1, int i1)
    {
        al1.a(ag1, i1);
    }

    static void a(al al1, ag ag1, String s1)
    {
        al1.b(ag1, s1);
    }

    static void a(al al1, ThreadSummary threadsummary)
    {
        al1.a(threadsummary);
    }

    static void a(al al1, String s1, ThreadViewSpec threadviewspec)
    {
        al1.a(s1, threadviewspec);
    }

    static void a(al al1, String s1, ThreadViewSpec threadviewspec, String s2)
    {
        al1.a(s1, threadviewspec, s2);
    }

    static void a(al al1, String s1, List list, String s2)
    {
        al1.a(s1, list, s2);
    }

    static void a(al al1, List list)
    {
        al1.c(list);
    }

    private void a(ThreadSummary threadsummary)
    {
        if (!ag) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = p.b(threadsummary)) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((ThreadParticipant) (obj)).d();
        if (((UserKey) (obj)).a() != com.facebook.user.n.FACEBOOK)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new UserIdentifierKey(com.facebook.user.s.FBID, ((UserKey) (obj)).b());
_L4:
        T.a(((UserIdentifierKey) (obj)), threadsummary.a());
        return;
        if (((UserKey) (obj)).a() != com.facebook.user.n.PHONE_NUMBER) goto _L1; else goto _L3
_L3:
        obj = new UserIdentifierKey(com.facebook.user.s.PHONE, ((UserKey) (obj)).b());
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(s s1)
    {
        if (X != null)
        {
            X.e();
            s1.a(new ar(this), com.google.common.d.a.w.a());
        }
    }

    private void a(String s1, ThreadViewSpec threadviewspec)
    {
        b(s1, threadviewspec, null);
    }

    private void a(String s1, ThreadViewSpec threadviewspec, String s2)
    {
        s1 = n.a(s1, threadviewspec, s2);
        n.b(a(((cb) (s1))));
    }

    private void a(String s1, String s2)
    {
        b(s1, (ThreadViewSpec)null, s2);
    }

    private void a(String s1, String s2, RemoteException remoteexception)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s2);
        stringbuilder.append(": ");
        stringbuilder.append(remoteexception);
        stringbuilder.append(":\n\n");
        s2 = Thread.currentThread().getStackTrace();
        int j1 = s2.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append(s2[i1].toString());
            stringbuilder.append("\n");
        }

        s2 = stringbuilder.toString();
        com.facebook.debug.log.b.e(a, s2);
        w.a(s1, s2);
    }

    private void a(String s1, List list, String s2)
    {
        s1 = n.a(s1, list, s2);
        n.a(a(((cb) (s1))));
    }

    private void a(List list)
    {
        list = list.iterator();
        boolean flag = false;
        while (list.hasNext()) 
        {
            ag ag1 = (ag)list.next();
            boolean flag1;
            if (!flag && ag1.getUnreadCount() > 0)
            {
                flag1 = true;
                flag = true;
            } else
            {
                flag1 = false;
            }
            ag1.setShouldShowUnreadCount(flag1);
        }
    }

    private boolean a(MotionEvent motionevent)
    {
        float f2 = motionevent.getRawX();
        float f1 = motionevent.getRawY();
        ((ca)Y.h()).getLocationOnScreen(ak);
        f2 -= motionevent.getX();
        f1 = f1 - motionevent.getY() - (float)ak[1];
        motionevent.offsetLocation(f2, f1);
        boolean flag = ((ca)Y.h()).dispatchTouchEvent(motionevent);
        motionevent.offsetLocation(-f2, -f1);
        return flag;
    }

    private boolean a(MotionEvent motionevent, float f1, float f2)
    {
        if (FloatMath.sqrt(f1 * f1 + f2 * f2) < (float)L)
        {
            return false;
        } else
        {
            return Y.e().a(motionevent.getRawX(), motionevent.getRawY(), f1, f2);
        }
    }

    private boolean a(ag ag1, ag ag2)
    {
        if (ag1 == null || ag2 == null)
        {
            return false;
        } else
        {
            return ThreadViewSpec.a(ag1.getThreadViewSpec(), ag2.getThreadViewSpec());
        }
    }

    static boolean a(al al1)
    {
        return al1.ag;
    }

    static boolean a(al al1, MotionEvent motionevent)
    {
        return al1.a(motionevent);
    }

    static boolean a(al al1, MotionEvent motionevent, float f1, float f2)
    {
        return al1.a(motionevent, f1, f2);
    }

    static boolean a(al al1, ag ag1, ag ag2)
    {
        return al1.a(ag1, ag2);
    }

    static boolean a(al al1, boolean flag)
    {
        al1.B = flag;
        return flag;
    }

    private boolean aa()
    {
        return aj != 0 && !e();
    }

    private s ab()
    {
        Object obj = hq.a();
        ((List) (obj)).add(Y.f(300));
        ((List) (obj)).add(Z.f(300));
        ((List) (obj)).add(Q());
        t.h();
        obj = com.google.common.d.a.i.a(((Iterable) (obj)));
        com.google.common.d.a.i.a(((s) (obj)), new bc(this));
        u.a(com.facebook.messages.ipc.peer.d.j, Boolean.valueOf(true));
        return ((s) (obj));
    }

    private void ac()
    {
        if (!aa())
        {
            ad();
        }
    }

    private void ad()
    {
        am();
        Y.e(300);
        Z.e(300);
        c(500);
        D();
        u.a(com.facebook.messages.ipc.peer.d.j, Boolean.valueOf(false));
    }

    private void ae()
    {
        if (P.c())
        {
            return;
        } else
        {
            e(P.a(0).getThreadViewSpec());
            return;
        }
    }

    private void af()
    {
        if (af)
        {
            return;
        }
        if (O != null)
        {
            O.a();
        }
        af = true;
        al();
        ac.f();
        b(0);
        O();
        u.a(com.facebook.messages.ipc.peer.d.h, Boolean.TRUE);
    }

    private void ag()
    {
        if (X != null)
        {
            X.i();
            X = null;
        }
    }

    private void ah()
    {
        if (X != null)
        {
            X.j();
            X = null;
        }
        if (ac != null)
        {
            ac.setOnClickListener(null);
            ac.a();
            ac = null;
        }
        if (Y != null)
        {
            ca ca1 = (ca)Y.h();
            ca1.setOnDismissListener(null);
            ca1.setOnSizeChangeListener(null);
            ca1.getCloseTargetView().setOnCloseBaubleStateChangeListener(null);
            ca1.a();
            Y.b();
            Y = null;
        }
    }

    private void ai()
    {
        if (Z != null)
        {
            ((cl)Z.h()).setOnTouchListener(null);
            ((cl)Z.h()).a();
            Z.b();
            Z = null;
        }
        if (ab != null)
        {
            ab.h().setOnTouchListener(null);
            ab.b();
            ab = null;
        }
    }

    private void aj()
    {
        Z.d();
    }

    private void ak()
    {
        aa = true;
        am();
        if (g.a(n.F, false))
        {
            q.removeMessages(10);
            q.sendEmptyMessageDelayed(10, 1000L);
        }
    }

    private void al()
    {
        aa = false;
        am();
        if (q != null)
        {
            q.removeMessages(11);
        }
    }

    private void am()
    {
        if (ag || Y == null || ab == null || Z == null)
        {
            com.facebook.debug.log.b.b(a, "updateWindowPositionsAndStates was called while destroyed");
            return;
        }
        Preconditions.checkNotNull(ab);
        Preconditions.checkNotNull(Z);
        Z.l();
        Y.l();
        ab.l();
        if (aa())
        {
            Y.j();
            ab.j();
            Z.j();
            com.facebook.debug.log.b.b(a, "updateWindowPositionsAndStates - chat heads hidden");
        } else
        if (e())
        {
            r();
            Y.setX(0);
            Y.b(true);
            ab.j();
            Z.j();
            Z.c();
            com.facebook.debug.log.b.b(a, "updateWindowPositionsAndStates - expanded");
        } else
        {
            Y.b(false);
            if (aa)
            {
                Y.j();
                ab.j();
                Z.setX(V());
                Z.setY(W());
                com.facebook.debug.log.b.b(a, "updateWindowPositionsAndStates - mini window");
            } else
            {
                r();
                Y.setX(0);
                ab.setX(V());
                ab.setY(W());
                Z.j();
                com.facebook.debug.log.b.b(a, "updateWindowPositionsAndStates - mini touch proxy window");
            }
        }
        Z.m();
        Y.m();
        ab.m();
    }

    private void an()
    {
        Y.e().d();
    }

    private int b(float f1, float f2)
    {
        return D.a(f1, f2);
    }

    private PointF b(PointF pointf)
    {
        pointf.offset(-N.left, -N.top);
        return pointf;
    }

    private void b(Intent intent)
    {
        if (!ag)
        {
            UserIdentifierKey useridentifierkey = (UserIdentifierKey)intent.getParcelableExtra("user_identifier_key");
            intent = intent.getStringExtra("new_threadid");
            if (intent != null)
            {
                a(com.facebook.messages.threads.model.b.a(useridentifierkey), ThreadViewSpec.a(intent));
                T.a(useridentifierkey, intent);
                return;
            }
        }
    }

    private void b(Message message)
    {
        r.removeCallbacksAndMessages(null);
        r.post(new ap(this, message));
    }

    private void b(ag ag1)
    {
        Preconditions.checkNotNull(ag1);
        if (ag1.j())
        {
            a(ag1.getThreadViewSpec(), 0);
            return;
        } else
        {
            a(ag1, "clean_unread");
            return;
        }
    }

    private void b(ag ag1, String s1)
    {
        while (!a(ag1, U) || X == null) 
        {
            return;
        }
        if (s1 != null && z())
        {
            if (z())
            {
                ag1 = U.getThreadViewSpec();
            } else
            {
                ag1 = null;
            }
            b("close", ((ThreadViewSpec) (ag1)), s1);
        }
        f(((ag) (null)));
        if (!y())
        {
            a(s1);
            return;
        } else
        {
            com.google.common.d.a.i.a(X.d(), new bf(this));
            return;
        }
    }

    static void b(al al1)
    {
        al1.al();
    }

    static void b(al al1, Message message)
    {
        al1.c(message);
    }

    static void b(al al1, ThreadViewSpec threadviewspec, String s1)
    {
        al1.f(threadviewspec, s1);
    }

    static void b(al al1, ag ag1)
    {
        al1.d(ag1);
    }

    private void b(String s1, ThreadViewSpec threadviewspec, String s2)
    {
        s1 = n.a(s1, threadviewspec, s2);
        n.a(a(s1));
    }

    private void b(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((ag)list.next()).setShouldShowUnreadCount(true)) { }
    }

    static boolean b(al al1, boolean flag)
    {
        al1.ad = flag;
        return flag;
    }

    static Context c(al al1)
    {
        return al1.e;
    }

    private s c(ThreadViewSpec threadviewspec)
    {
        if (P.e(threadviewspec) == 0)
        {
            return com.google.common.d.a.i.a(null);
        } else
        {
            al();
            c(P.d(threadviewspec));
            return com.google.common.d.a.i.a(O(), new as(this));
        }
    }

    private void c(int i1)
    {
        if (P.b() == 0 || !t.a() || aa())
        {
            return;
        }
        float f1;
        float f2;
        float f3;
        float f4;
        com.facebook.orca.chatheads.b.e e1;
        Resources resources;
        if (K())
        {
            f2 = e.getResources().getDisplayMetrics().widthPixels - V() - E;
            f1 = W();
            e1 = com.facebook.orca.chatheads.b.e.RIGHT;
        } else
        {
            f2 = V();
            f1 = W();
            e1 = com.facebook.orca.chatheads.b.e.LEFT;
        }
        resources = e.getResources();
        f3 = resources.getDimensionPixelSize(g.chat_head_nux_bubble_x);
        f4 = resources.getDimensionPixelSize(g.chat_head_height) / 2;
        t.a(new Point((int)(f2 + f3), (int)(f1 + f4)), e1, i1);
    }

    private void c(Message message)
    {
        ac ac1;
        ae ae1;
        Resources resources;
        int i1;
        int j1;
        try
        {
            ae1 = L();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            a("T2190668:wm_ex_add_text_bubble", "Failed to add chat head text bubble window", message);
            return;
        }
        t.f();
        if (K())
        {
            j1 = e.getResources().getDisplayMetrics().widthPixels - V() - E;
            i1 = W();
            ac1 = ac.RIGHT;
        } else
        {
            j1 = V();
            i1 = W();
            ac1 = ac.LEFT;
        }
        resources = e.getResources();
        ae1.a(ac1, j1 + resources.getDimensionPixelSize(g.chat_head_text_bubble_x), i1 + resources.getDimensionPixelSize(g.chat_head_text_bubble_y) + F / 2);
        ae1.a(message);
        a(((v)ae1.h()).a());
        ((v)ae1.h()).setOnTextBubbleAutoHideListener(new aq(this));
    }

    private void c(ag ag1)
    {
        ThreadViewSpec threadviewspec = ag1.getThreadViewSpec();
        if (P.b(threadviewspec))
        {
            ag1.b();
            Q.b(threadviewspec);
            ag1 = Q.d(threadviewspec);
            ((cl)Z.h()).b(ag1);
        }
    }

    static void c(al al1, ag ag1)
    {
        al1.f(ag1);
    }

    private void c(List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext(); a((ag)iterator.next(), ((String) (null)))) { }
        if (d())
        {
            list = (ag)list.get(0);
            if (y())
            {
                b(list, "drop_to_close");
            } else
            {
                a("drop_to_close");
            }
            O();
        }
    }

    static int d(al al1)
    {
        return al1.V();
    }

    private s d(ThreadViewSpec threadviewspec)
    {
        al();
        ag ag1 = M();
        a(threadviewspec, ag1);
        m.a(threadviewspec.h());
        threadviewspec = com.google.common.d.a.ab.a();
        ag1.e();
        B = true;
        com.google.common.d.a.i.a(a(ag1), new at(this, threadviewspec));
        if (e())
        {
            O();
        }
        return threadviewspec;
    }

    private s d(ThreadViewSpec threadviewspec, String s1)
    {
        com.facebook.debug.log.b.b(a, "openChatThreadView(%s)", new Object[] {
            threadviewspec
        });
        if (l.inKeyguardRestrictedInputMode())
        {
            e(threadviewspec, s1);
            threadviewspec = com.google.common.d.a.ab.a();
            threadviewspec.cancel(false);
            return threadviewspec;
        }
        if (!e() && O != null)
        {
            O.a();
        }
        ThreadViewSpec threadviewspec1 = T.b(threadviewspec);
        if (X == null || !ThreadViewSpec.a(threadviewspec1, X.a()))
        {
            e(threadviewspec1);
        }
        ab ab1 = com.google.common.d.a.ab.a();
        s s2;
        if (!e())
        {
            af();
            s2 = X();
        } else
        {
            s2 = com.google.common.d.a.i.a(null);
        }
        com.google.common.d.a.i.a(s2, new bd(this, threadviewspec1, threadviewspec, s1, ab1));
        return ab1;
    }

    private void d(ag ag1)
    {
        Preconditions.checkNotNull(ag1);
        e(ag1);
        int j1 = R.size();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    if (!a((ag)R.get(i1), ag1))
                    {
                        break label0;
                    }
                    R.remove(i1);
                }
                if (!d())
                {
                    T();
                }
                return;
            }
            i1++;
        } while (true);
    }

    static int e(al al1)
    {
        return al1.W();
    }

    private void e(ThreadViewSpec threadviewspec)
    {
        b(false);
        int i1 = P.e(threadviewspec);
        X.a(threadviewspec);
        X.a(b(D.b(i1)));
    }

    private void e(ThreadViewSpec threadviewspec, String s1)
    {
        com.facebook.debug.log.b.b(a, "openChatThreadViewThroughKeyguard(%s)", new Object[] {
            threadviewspec
        });
        Intent intent = new Intent(e, x.a());
        intent.setAction("com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD");
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC", threadviewspec);
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_REASON", s1);
        intent.putExtra("com.facebook.orca.chatheads.EXTRA_FOR_AFTER_UNLOCK_KEYGUARD", true);
        threadviewspec = PendingIntent.getService(e, 0, intent, 0x50000000);
        s1 = new Intent(e, com/facebook/common/keyguard/KeyguardPendingIntentActivity);
        s1.putExtra("pendingIntent", threadviewspec);
        s1.addFlags(0x10000000);
        h.a(s1, e);
    }

    private void e(ag ag1)
    {
        ag1.setOnTouchListener(null);
        ag1.a();
        ((ca)Y.h()).getChatHeadsContainer().removeView(ag1);
    }

    static Rect f(al al1)
    {
        return al1.G();
    }

    private void f(ThreadViewSpec threadviewspec, String s1)
    {
        boolean flag = e();
        ThreadViewSpec threadviewspec1;
        if (z())
        {
            threadviewspec1 = U.getThreadViewSpec();
        } else
        {
            threadviewspec1 = null;
        }
        q.removeCallbacks(A);
        if (!ThreadViewSpec.a(threadviewspec1, threadviewspec))
        {
            d(threadviewspec, s1);
            return;
        }
        if (flag)
        {
            a(s1);
            return;
        } else
        {
            com.facebook.debug.log.b.b(a, "tried to toggle thread that was considered open even though the chat head stack is already collapsed.");
            f(((ag) (null)));
            return;
        }
    }

    private void f(ag ag1)
    {
        U = ag1;
        O();
        H();
    }

    static int g(al al1)
    {
        return al1.S;
    }

    static int h(al al1)
    {
        return al1.E;
    }

    static Rect i(al al1)
    {
        return al1.N;
    }

    static boolean j(al al1)
    {
        return al1.ad;
    }

    static int k()
    {
        return d;
    }

    static ag k(al al1)
    {
        return al1.ae;
    }

    private void l()
    {
        h();
    }

    static boolean l(al al1)
    {
        return al1.y();
    }

    private void m()
    {
        ah = g.a(n.D, 1.0F);
        ai = g.a(n.E, 0.17F);
    }

    static void m(al al1)
    {
        al1.ae();
    }

    private void n()
    {
        Resources resources = e.getResources();
        E = resources.getDimensionPixelSize(g.chat_head_width);
        F = resources.getDimensionPixelSize(g.chat_head_height);
        G = resources.getDimensionPixelOffset(g.chat_head_dock_overshoot_x);
        H = resources.getDimensionPixelSize(g.chat_head_side_spring_in_start_offset_x);
        I = resources.getDimensionPixelSize(g.chat_head_side_spring_in_start_offset_y);
        J = resources.getDimensionPixelSize(g.chat_head_side_spring_in_initial_velocity_x);
        K = resources.getDimensionPixelSize(g.chat_head_side_spring_in_initial_velocity_y);
        L = resources.getDimensionPixelSize(g.chat_head_dismiss_velocity_threshold);
    }

    static void n(al al1)
    {
        al1.l();
    }

    private void o()
    {
        Resources resources = e.getResources();
        DisplayMetrics displaymetrics = e.getResources().getDisplayMetrics();
        S = Math.max(a(displaymetrics.widthPixels, resources.getDimension(g.chat_head_line_item_min_x_offset)), a(displaymetrics.heightPixels, resources.getDimension(g.chat_head_line_item_min_y_offset)));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("mMaxNumChatHeads set to ").append(S).toString());
        C();
    }

    static void o(al al1)
    {
        al1.s();
    }

    static f p(al al1)
    {
        return al1.u;
    }

    private void p()
    {
        q();
        u();
    }

    private void q()
    {
        ca ca1;
        boolean flag;
        if (Y == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Y = new cf(i);
        ca1 = new ca(e);
        ca1.setOnDismissListener(new bk(this));
        ca1.setOnSizeChangeListener(new bl(this));
        ca1.getCloseTargetView().setOnCloseBaubleStateChangeListener(new bm(this));
        Y.a(ca1);
        Y.a();
    }

    static void q(al al1)
    {
        al1.w();
    }

    private void r()
    {
        ((ca)Y.h()).setVisibility(0);
    }

    static void r(al al1)
    {
        al1.x();
    }

    private void s()
    {
        M = null;
        C();
        O();
        if (z())
        {
            P();
        }
    }

    static boolean s(al al1)
    {
        return al1.aa();
    }

    static dc t(al al1)
    {
        return al1.X;
    }

    private void t()
    {
        if (W && N.top == 0 && N.bottom == 0)
        {
            a(2);
            return;
        } else
        {
            b(2);
            return;
        }
    }

    static s u(al al1)
    {
        return al1.O();
    }

    private void u()
    {
        Object obj = new cl(e);
        Z = new cm(i, e.getResources());
        Z.a(((View) (obj)));
        Z.j();
        obj = Z;
        boolean flag;
        if (!K())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((cm) (obj)).a(flag);
        ((cl)Z.h()).setOnTouchListener(c);
        Z.a();
        ab = new ck(i, e);
        ab.j();
        ab.a();
        ab.h().setOnTouchListener(c);
    }

    static h v(al al1)
    {
        return al1.w;
    }

    private void v()
    {
        PointF pointf;
        boolean flag;
        if (ac == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        ac = new com.facebook.orca.chatheads.n(e);
        ac.g();
        ac.setOnClickListener(new bn(this));
        ac.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 51));
        ac.h();
        ((ca)Y.h()).getChatHeadsContainer().addView(ac);
        pointf = N().a(0);
        ac.getSpringyPositioner().b(pointf);
    }

    private void w()
    {
        a("open_inbox");
        ab().a(new an(this), com.google.common.d.a.w.a());
    }

    static boolean w(al al1)
    {
        return al1.B;
    }

    private void x()
    {
        Intent intent = new Intent();
        intent.setComponent(v);
        intent.setFlags(0x4000000);
        h.a(intent, e);
    }

    static void x(al al1)
    {
        al1.E();
    }

    static Handler y(al al1)
    {
        return al1.q;
    }

    private boolean y()
    {
        return !P.c();
    }

    private boolean z()
    {
        return U != null;
    }

    static boolean z(al al1)
    {
        return al1.aa;
    }

    public s a(int i1)
    {
        boolean flag;
        if (aj != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aj = aj | i1;
        if (!flag)
        {
            return Z();
        } else
        {
            return com.google.common.d.a.i.a(null);
        }
    }

    public s a(ThreadViewSpec threadviewspec)
    {
        a("pop", threadviewspec);
        return b(threadviewspec);
    }

    public void a()
    {
        o.a();
    }

    public void a(Intent intent)
    {
        if (z())
        {
            cb cb1 = n.a("close", (ThreadViewSpec)null, "starting_activity");
            cb1.a("intent", com.facebook.analytics.i.c.a(intent));
            n.a(a(cb1));
        }
        a(((String) (null)));
    }

    public void a(Message message)
    {
        Preconditions.checkNotNull(message);
        ThreadViewSpec threadviewspec = ThreadViewSpec.a(message.e());
        b(threadviewspec).a(new ao(this, message, threadviewspec), com.google.common.d.a.w.a());
        a(threadviewspec, message);
    }

    public void a(ThreadViewSpec threadviewspec, String s1)
    {
        threadviewspec = P.d(threadviewspec);
        if (threadviewspec == null)
        {
            return;
        } else
        {
            a(((ag) (threadviewspec)), s1);
            b(threadviewspec, s1);
            return;
        }
    }

    public void a(bs bs1)
    {
        O = bs1;
    }

    public void a(String s1)
    {
        if (!af)
        {
            return;
        }
        af = false;
        if (O != null)
        {
            O.b();
        }
        if (s1 != null)
        {
            float f1;
            float f2;
            ThreadViewSpec threadviewspec;
            if (z())
            {
                threadviewspec = U.getThreadViewSpec();
            } else
            {
                threadviewspec = null;
            }
            b("close", threadviewspec, s1);
        }
        f(((ag) (null)));
        ac.g();
        O();
        a(0);
        if (!P.c() && X != null)
        {
            f1 = V() + E / 2;
            f2 = W() + F / 2;
            s1 = X.g();
            X.b().a(new PointF(f1 - ((PointF) (s1)).x, f2 - ((PointF) (s1)).y));
        }
        if (X != null)
        {
            com.google.common.d.a.i.a(X.d(), new be(this));
        } else
        {
            Y();
        }
        u.a(com.facebook.messages.ipc.peer.d.h, Boolean.FALSE);
    }

    public void a(boolean flag)
    {
        if (flag == W)
        {
            return;
        } else
        {
            W = flag;
            t();
            return;
        }
    }

    public s b(ThreadViewSpec threadviewspec)
    {
        r();
        F();
        threadviewspec = T.b(threadviewspec);
        if (P.c(threadviewspec))
        {
            threadviewspec = c(threadviewspec);
        } else
        {
            threadviewspec = d(threadviewspec);
        }
        if (j.isScreenOn())
        {
            h();
        }
        return threadviewspec;
    }

    public void b()
    {
        boolean flag1;
        flag1 = ad;
        if (X != null)
        {
            X.i();
            X = null;
        }
        if (Y == null) goto _L2; else goto _L1
_L1:
        ((ca)Y.h()).setVisibility(8);
        if (!e()) goto _L2; else goto _L3
_L3:
        boolean flag;
        flag = true;
        a("low_on_memory");
_L5:
        ak();
        if (flag || flag1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("expanded=").append(flag);
            stringbuilder.append(",dragging=").append(flag1);
            w.a("ChatHeadWindowManager: onLowMemory during interaction", stringbuilder.toString());
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(int i1)
    {
        boolean flag;
        if (aj != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aj = aj & ~i1;
        if (flag)
        {
            ac();
        }
    }

    public void b(ThreadViewSpec threadviewspec, String s1)
    {
        a("pop", threadviewspec);
        a(threadviewspec);
        d(threadviewspec, s1);
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            ag();
        }
        if (X == null)
        {
            X = new dc(e, i, Y.f());
            X.a(new bg(this));
        }
    }

    public void c()
    {
        ag = true;
        b.c();
        k.b(y);
        q.removeCallbacksAndMessages(null);
        q = null;
        i();
        s.b();
        t.k();
        o.b();
        u.a(com.facebook.messages.ipc.peer.d.i, Boolean.FALSE);
        u.a(com.facebook.messages.ipc.peer.d.h, Boolean.FALSE);
        u.a(com.facebook.messages.ipc.peer.d.j, Boolean.valueOf(false));
    }

    public void c(ThreadViewSpec threadviewspec, String s1)
    {
        threadviewspec = T.b(threadviewspec);
        s1 = P.d(threadviewspec);
        if (s1 != null)
        {
            b(s1);
            threadviewspec = Q.d(threadviewspec);
            if (threadviewspec != null)
            {
                b(threadviewspec);
                return;
            }
        }
    }

    public boolean d()
    {
        return y() || !R.isEmpty();
    }

    public boolean e()
    {
        return af;
    }

    public void f()
    {
        A();
        B();
        C();
        O();
        am();
    }

    public void g()
    {
        for (Iterator iterator = P.d().iterator(); iterator.hasNext(); b((ag)iterator.next())) { }
    }

    public void h()
    {
        for (Iterator iterator = P.d().iterator(); iterator.hasNext(); ((ag)iterator.next()).k()) { }
        for (Iterator iterator1 = Q.d().iterator(); iterator1.hasNext(); ((ag)iterator1.next()).k()) { }
    }

    public void i()
    {
        R();
        ai();
        ah();
    }

    public void j()
    {
        if (P.c() || e() && z())
        {
            return;
        } else
        {
            d(P.a(0).getThreadViewSpec(), "dismissed_previous");
            return;
        }
    }

}
