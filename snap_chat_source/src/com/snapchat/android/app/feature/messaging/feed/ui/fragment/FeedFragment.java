// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import AB;
import AO;
import AT;
import BP;
import Bk;
import Br;
import Bt;
import By;
import CF;
import CG;
import Cf;
import Cl;
import Ei;
import Fi;
import Gy;
import HZ;
import Hb;
import Hc;
import IA;
import IX;
import Jo;
import Ks;
import LA;
import LB;
import LI;
import LQ;
import LY;
import Ll;
import MF;
import Mf;
import Mu;
import NQ;
import NT;
import Na;
import OE;
import OH;
import Oi;
import Ow;
import PB;
import PG;
import PI;
import afA;
import afz;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.TextView;
import av;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.SnapViewEventAnalytics;
import com.snapchat.android.billing.InAppBillingManager;
import com.snapchat.android.controller.countdown.SnapCountdownController;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.MiniProfileFragment;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.stories.ui.animation.DismissAnimationView;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.InAppPromptFlipper;
import com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener;
import com.snapchat.android.ui.ptr.SnapchatPtrFrameLayout;
import com.snapchat.android.ui.snapview.MultiLeveledSnapView;
import com.snapchat.android.ui.snapview.SnapView;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.NetworkError;
import com.snapchat.android.util.SnapchatViewPager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.eventbus.LoadSnapMediaEvent;
import com.snapchat.android.util.eventbus.SnapMessageFeedRefreshedEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import eg;
import in.srain.cube.views.ptr.PtrFrameLayout;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kB;
import lX;
import ll;
import lm;
import lp;
import mu;
import pL;
import pN;
import pO;
import pQ;
import pS;
import pT;
import pU;
import pV;
import pX;
import pY;
import pZ;
import qb;
import qc;
import qf;
import qh;
import qq;
import sJ;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedAdapter

public class FeedFragment extends SnapchatFragment
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.a, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.b, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.c, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.d, pQ.a, qf, qh.a, sJ
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(pT pt);

        public abstract void a(pT pt, View view, boolean flag);

        public abstract void a(pT pt, boolean flag);

        public abstract void b();

        public abstract void b(pT pt);

        public abstract void c();

        public abstract void c(pT pt);
    }

    static final class b
        implements Fi
    {

        private pX a;

        private void e()
        {
            if (a != null)
            {
                a.b(false);
                a = null;
            }
        }

        public final void a()
        {
            e();
        }

        public final void a(float f1)
        {
        }

        public final void a(pX px)
        {
        }

        public final void a(pX px, boolean flag)
        {
            if (flag && a != px)
            {
                if (a != null)
                {
                    a.b(false);
                }
                px.w();
                a = px;
            }
        }

        public final void b()
        {
            e();
        }

        public final void c()
        {
        }

        public final void d()
        {
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c
        implements Fi
    {

        private pX a;
        private boolean b;
        private Handler c;

        public final void a()
        {
        }

        public final void a(float f1)
        {
            if (a == null) goto _L2; else goto _L1
_L1:
            pX px = a;
            if (f1 <= 1.0F) goto _L4; else goto _L3
_L3:
            float f2 = 1.0F;
_L6:
            int i1 = (int)((float)px.l + (float)px.m * f2);
            px.c(Color.rgb(i1, i1, i1));
_L2:
            return;
_L4:
            f2 = f1;
            if (f1 < 0.0F)
            {
                f2 = 0.0F;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void a(pX px)
        {
            b = false;
            c.postDelayed(new Runnable(this, px) {

                private pX a;
                private c b;

                public final void run()
                {
                    b.b(a);
                }

            
            {
                b = c1;
                a = px;
                super();
            }
            }, 120L);
        }

        public final void a(pX px, boolean flag)
        {
            b = true;
            c.removeCallbacksAndMessages(null);
            b(px);
            if (!flag)
            {
                c.postDelayed(new Runnable(this) {

                    private c a;

                    public final void run()
                    {
                        a.a(false);
                    }

            
            {
                a = c1;
                super();
            }
                }, 100L);
            }
        }

        final void a(boolean flag)
        {
            if (a != null)
            {
                a.b(flag);
                a = null;
            }
        }

        public final void b()
        {
            a(true);
        }

        final void b(pX px)
        {
            if (a == px)
            {
                return;
            }
            if (a != null)
            {
                a.b(false);
            }
            px.w();
            a = px;
        }

        public final void c()
        {
            c.removeCallbacksAndMessages(null);
            a(false);
        }

        public final void d()
        {
            if (!b)
            {
                c.removeCallbacksAndMessages(null);
                a(false);
            }
        }

        private c()
        {
            c = new Handler();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements afA
    {

        boolean a;
        private FeedFragment b;

        public final void a(PtrFrameLayout ptrframelayout)
        {
        }

        public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i1, int j1, float f1, float f2)
        {
            if (!a)
            {
                FeedFragment.n(b).c();
                a = true;
            }
        }

        public final void b(PtrFrameLayout ptrframelayout)
        {
        }

        public final void c(PtrFrameLayout ptrframelayout)
        {
        }

        public final void d(PtrFrameLayout ptrframelayout)
        {
        }

        private d()
        {
            b = FeedFragment.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final Set ae;
    private final Provider A;
    private final SnapCountdownController B;
    private final lm C;
    private final CameraEventAnalytics D;
    private final NetworkAnalytics E;
    private final LQ F;
    private final Bt G;
    private float H;
    private final lX I;
    private final lp J;
    private final FriendManager K;
    private final Bus L;
    private final kB M;
    private final ProfileEventAnalytics N;
    private final List O;
    private final pZ P;
    private a Q;
    private pV R;
    private pQ S;
    private com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.d T;
    private pT U;
    private boolean V;
    private boolean W;
    private boolean X;
    private Map Y;
    private boolean Z;
    protected FeedAdapter a;
    private boolean aa;
    private Fi ab;
    private d ac;
    private InAppBillingManager ad;
    private final Runnable af;
    protected qh b;
    public LB c;
    private MultiLeveledSnapView d;
    private SnapchatPtrFrameLayout e;
    private RecyclerView f;
    private LinearLayoutManager g;
    private View h;
    private View i;
    private PI j;
    private PI k;
    private PI l;
    private View m;
    private PI n;
    private PI o;
    private PI p;
    private PI q;
    private PI r;
    private PI s;
    private PI t;
    private FrameLayout u;
    private final Ei v;
    private final pU w;
    private final IX x;
    private final pS y;
    private final pN z;

    public FeedFragment()
    {
        Ei ei = Ei.a();
        By by = By.c();
        IX ix = IX.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        SnapCountdownController snapcountdowncontroller = SnapCountdownController.a();
        CameraEventAnalytics cameraeventanalytics = CameraEventAnalytics.a();
        lm lm1 = lm.a();
        NetworkAnalytics networkanalytics = NetworkAnalytics.a();
        LQ lq = LQ.b();
        new PB();
        Bt bt = Bt.a();
        lX lx = new lX();
        lp lp1 = lp.a();
        FriendManager friendmanager = FriendManager.e();
        Bus bus = Mf.a();
        FeatureFlagManager.a();
        this(ei, ((pU) (by)), ix, provider, snapcountdowncontroller, cameraeventanalytics, lm1, networkanalytics, lq, bt, lx, lp1, friendmanager, bus, ProfileEventAnalytics.a(), kB.a());
    }

    private FeedFragment(Ei ei, pU pu, IX ix, Provider provider, SnapCountdownController snapcountdowncontroller, CameraEventAnalytics cameraeventanalytics, lm lm1, 
            NetworkAnalytics networkanalytics, LQ lq, Bt bt, lX lx, lp lp1, FriendManager friendmanager, Bus bus, 
            ProfileEventAnalytics profileeventanalytics, kB kb)
    {
        LA.a();
        Z = false;
        aa = false;
        af = new Runnable() {

            private FeedFragment a;

            public final void run()
            {
                FeedFragment.d(a);
                Bt.y(null);
                if ((Br)FeedFragment.s(a).get() != null)
                {
                    FeedFragment.t(a).b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.FEED);
                    FeedFragment.u(a).a("feed", "pull_to_refresh");
                    FeedFragment.v(a);
                    (new mu()).execute();
                }
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        };
        SnapchatApplication.getDIComponent().a(this);
        v = ei;
        w = pu;
        x = ix;
        A = provider;
        B = snapcountdowncontroller;
        D = cameraeventanalytics;
        C = lm1;
        E = networkanalytics;
        G = bt;
        F = lq;
        I = lx;
        J = lp1;
        K = friendmanager;
        L = bus;
        M = kb;
        O = pu.a();
        y = new pS();
        z = new pN(this);
        y.a = z;
        P = new pZ();
        Y = new av();
        N = profileeventanalytics;
    }

    private int a(String s1)
    {
        for (int i1 = 0; i1 < O.size(); i1++)
        {
            if (TextUtils.equals(s1, ((pT)O.get(i1)).V_()))
            {
                return i1;
            }
        }

        return -1;
    }

    static View a(FeedFragment feedfragment)
    {
        return feedfragment.m;
    }

    private void a(int i1)
    {
        String s1 = Bt.q();
        if (!TextUtils.isEmpty(s1))
        {
            s1 = Ks.a(s1, IA.a("teamsnapchat"));
            for (int j1 = 0; j1 < O.size(); j1++)
            {
                pT pt = (pT)O.get(j1);
                if (!TextUtils.equals(pt.V_(), s1))
                {
                    continue;
                }
                pX px = (pX)f.c(j1);
                if (px != null)
                {
                    a(px, new Runnable(i1, pt, px) {

                        private int a;
                        private pT b;
                        private pX c;
                        private FeedFragment d;

                        public final void run()
                        {
                            if (!FeedFragment.x(d) && a > 0)
                            {
                                FeedFragment.a(d, a - 1);
                            } else
                            {
                                FeedFragment.d(d);
                                Bt.C(false);
                                if (b.equals(c.s))
                                {
                                    c.n.setTranslationX(0.0F);
                                    return;
                                }
                            }
                        }

            
            {
                d = FeedFragment.this;
                a = i1;
                b = pt;
                c = px;
                super();
            }
                    });
                }
            }

        }
    }

    static void a(FeedFragment feedfragment, int i1)
    {
        feedfragment.a(i1);
    }

    private void a(String s1, String s2, String s3)
    {
        if (!TextUtils.isEmpty(s2))
        {
            ((TextView)t.a()).setText(s2);
        }
        ((TextView)t.a()).setOnClickListener(new android.view.View.OnClickListener(s3) {

            private String a;
            private FeedFragment b;

            public final void onClick(View view)
            {
                view = b.getActivity();
                String s4 = a;
                try
                {
                    view.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s4)));
                    return;
                }
                catch (Exception exception)
                {
                    HZ.a(view);
                }
            }

            
            {
                b = FeedFragment.this;
                a = s1;
                super();
            }
        });
        if (!TextUtils.isEmpty(s1))
        {
            ((TextView)s.a()).setText(Html.fromHtml(s1));
        }
        ((InAppPromptFlipper)r.a()).a();
    }

    private void a(pX px, Runnable runnable)
    {
        px = px.n;
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, H, 0.0F, 0.0F);
        translateanimation.setDuration(100L);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(runnable, px) {

            final Runnable a;
            final View b;
            private FeedFragment c;

            public final void onAnimationEnd(Animation animation)
            {
                animation = new TranslateAnimation(FeedFragment.w(c), 0.0F, 0.0F, 0.0F);
                animation.setInterpolator(new BounceInterpolator());
                animation.setDuration(400L);
                animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                    private _cls13 a;

                    public final void onAnimationEnd(Animation animation)
                    {
                        if (a.a == null)
                        {
                            a.b.setTranslationX(0.0F);
                            return;
                        } else
                        {
                            a.a.run();
                            return;
                        }
                    }

                    public final void onAnimationRepeat(Animation animation)
                    {
                    }

                    public final void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = _pcls13;
                super();
            }
                });
                b.startAnimation(animation);
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                c = FeedFragment.this;
                a = runnable;
                b = view;
                super();
            }
        });
        px.post(new Runnable(px, translateanimation) {

            private View a;
            private TranslateAnimation b;

            public final void run()
            {
                a.startAnimation(b);
            }

            
            {
                a = view;
                b = translateanimation;
                super();
            }
        });
    }

    static PI b(FeedFragment feedfragment)
    {
        return feedfragment.n;
    }

    static CameraEventAnalytics c(FeedFragment feedfragment)
    {
        return feedfragment.D;
    }

    static Bt d(FeedFragment feedfragment)
    {
        return feedfragment.G;
    }

    static a e(FeedFragment feedfragment)
    {
        return feedfragment.Q;
    }

    static PI f(FeedFragment feedfragment)
    {
        return feedfragment.l;
    }

    static PI g(FeedFragment feedfragment)
    {
        return feedfragment.k;
    }

    static void h(FeedFragment feedfragment)
    {
        feedfragment.p();
    }

    static boolean i(FeedFragment feedfragment)
    {
        return feedfragment.Z;
    }

    static LinearLayoutManager j(FeedFragment feedfragment)
    {
        return feedfragment.g;
    }

    static List k(FeedFragment feedfragment)
    {
        return feedfragment.O;
    }

    static Set l()
    {
        return ae;
    }

    static boolean l(FeedFragment feedfragment)
    {
        feedfragment.Z = true;
        return true;
    }

    static Runnable m(FeedFragment feedfragment)
    {
        return feedfragment.af;
    }

    private boolean m()
    {
        Br br = (Br)A.get();
        return br != null && br.l() && !S.c();
    }

    static Fi n(FeedFragment feedfragment)
    {
        return feedfragment.ab;
    }

    private void n()
    {
        if (V)
        {
            if (b != null)
            {
                ((android.support.v7.widget.RecyclerView.a) (b)).a.b();
            }
            return;
        } else
        {
            ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
            return;
        }
    }

    static View o(FeedFragment feedfragment)
    {
        return feedfragment.mFragmentLayout;
    }

    private void o()
    {
        boolean flag = getActivity().getIntent().getBooleanExtra("makeSyncRequest", false);
        boolean flag1 = Bt.as();
        Timber.c("FeedFragment", (new StringBuilder("Make Sync syncreq = ")).append(flag).append(" ").append(flag1).toString(), new Object[0]);
        if (flag || flag1)
        {
            Timber.c("FeedFragment", "Spinning off Sync request!", new Object[0]);
            Br br = (Br)A.get();
            if (f != null && br != null)
            {
                (new mu()).execute();
                Bt.h(false);
            }
        }
    }

    static pQ p(FeedFragment feedfragment)
    {
        return feedfragment.S;
    }

    private void p()
    {
        if (R == null)
        {
            R = new BP(w, K);
        }
        if (b == null)
        {
            b = new qh(R.a(), this, c);
            b.a(y);
            if (m())
            {
                b.a(true);
            }
        }
        R.c();
        i.setVisibility(4);
        m.setVisibility(8);
        h.setVisibility(8);
        n.a(8);
        k.a(0);
        ((EditText)k.a()).requestFocus();
        Jo.h(getActivity());
        V = true;
        o.a(8);
        if (f.d != b)
        {
            f.a(b);
        }
    }

    static pZ q(FeedFragment feedfragment)
    {
        return feedfragment.P;
    }

    private void q()
    {
        i.setVisibility(0);
        m.setVisibility(0);
        h.setVisibility(0);
        if (k.b())
        {
            ((EditText)k.a()).setText("");
            ((EditText)k.a()).clearFocus();
            k.a(4);
        }
        p.a(8);
        V = false;
        s();
        Jo.a(getActivity(), mFragmentLayout);
        if (f.d != a)
        {
            f.a(a);
        }
    }

    static boolean r(FeedFragment feedfragment)
    {
        return feedfragment.m();
    }

    static Provider s(FeedFragment feedfragment)
    {
        return feedfragment.A;
    }

    private void s()
    {
        Br br = (Br)A.get();
        if (!V)
        {
            if (br != null && br.mInitialized && O.isEmpty())
            {
                o.a(0);
                a.a(false);
            } else
            {
                o.a(8);
                a.a(m());
            }
        }
        t();
    }

    static NetworkAnalytics t(FeedFragment feedfragment)
    {
        return feedfragment.E;
    }

    private void t()
    {
        int i1 = g.o();
        int j1 = g.p();
        int k1 = g.z() - 1;
        boolean flag;
        if (j1 < k1 && i1 <= k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            j.a(0);
        }
    }

    static lm u(FeedFragment feedfragment)
    {
        return feedfragment.C;
    }

    private void u()
    {
        boolean flag2 = true;
        if (ReleaseManager.f() && SharedPreferenceKey.DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED.getBoolean())
        {
            a("Upgrade your app (Alpha Testing)", ((String) (null)), getString(0x7f080362));
        } else
        {
            boolean flag;
            boolean flag1;
            if (System.currentTimeMillis() - Bt.bk() >= Bt.bl())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!TextUtils.isEmpty(Bt.bi()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && Bt.bg() && flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a(Bt.bi(), Bt.bj(), Bt.bh());
                return;
            }
        }
    }

    static lX v(FeedFragment feedfragment)
    {
        return feedfragment.I;
    }

    static float w(FeedFragment feedfragment)
    {
        return feedfragment.H;
    }

    static boolean x(FeedFragment feedfragment)
    {
        return feedfragment.X;
    }

    public final int a(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            return v1.d(this);
        } else
        {
            return 0;
        }
    }

    public final void a(AO ao)
    {
        ab.b();
    }

    public final void a(Hb hb)
    {
        if (!(hb instanceof AT))
        {
            return;
        } else
        {
            ab.a();
            Y.put(hb.d(), U);
            B.a(hb.d(), new pO(Y, (AT)hb));
            return;
        }
    }

    public final void a(Hb hb, AO ao)
    {
    }

    public final void a(Hb hb, SnapViewSessionStopReason snapviewsessionstopreason, int i1)
    {
        if (!(hb instanceof Bk) && snapviewsessionstopreason == SnapViewSessionStopReason.ABORT_REQUESTED && ClipCircleViewGroup.h)
        {
            ((DismissAnimationView)q.a()).a.start();
        }
    }

    public final volatile void a(android.support.v7.widget.RecyclerView.v v1, MotionEvent motionevent)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            W = true;
            v1.a(this, motionevent);
        }
    }

    public final void a(android.support.v7.widget.RecyclerView.v v1, boolean flag)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            v1.a(this, flag);
            Q.a(v1.s(), ((pY) (v1)).a, flag);
        }
    }

    public final void a(List list)
    {
        if (V && (list == null || list.isEmpty()) && !m())
        {
            p.a(0);
        } else
        {
            p.a(8);
        }
        t();
    }

    public final void a(pX px)
    {
        T.d(px);
    }

    public final void a(pX px, MotionEvent motionevent)
    {
        if (TextUtils.equals(px.s.mTheirUsername, "teamsnapchat"))
        {
            X = true;
            px.n.clearAnimation();
        }
        T.a(px, motionevent);
        ab.a(px);
        ac.a = false;
    }

    public final void a(pX px, boolean flag)
    {
        T.a(px, flag);
    }

    public final boolean a(android.support.v7.widget.RecyclerView.v v1, float f1, float f2, float f3, float f4)
    {
        boolean flag;
        flag = false;
        v1 = (pY)v1;
        if (v1 == null) goto _L2; else goto _L1
_L1:
        if (f1 <= 0.0F) goto _L4; else goto _L3
_L3:
        pT pt = v1.s();
        if (pt != null) goto _L6; else goto _L5
_L5:
        Q.c();
_L4:
        flag = v1.a(this, f1, f2, f3, f4);
_L2:
        return flag;
_L6:
        if (W)
        {
            a a1 = Q;
            boolean flag1;
            if (k.c() && ((EditText)k.a()).isFocused())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.a(pt, flag1);
            W = false;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final boolean a(pX px, float f1, float f2, float f3, float f4)
    {
        return T.a(px, f1, f2, f3, f4);
    }

    public final float b(pX px)
    {
        return T.c(px);
    }

    public final boolean b(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            return v1.c(this);
        } else
        {
            return false;
        }
    }

    public final float c(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            return v1.b(this);
        } else
        {
            return 0.0F;
        }
    }

    public final void c()
    {
        PG.a(new Runnable() {

            private FeedFragment a;

            public final void run()
            {
                FeedFragment.q(a).a = true;
                a.a.c(FeedFragment.k(a).size() - 1);
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
    }

    public final boolean c(pX px)
    {
        return T.b(px);
    }

    public final int d(pX px)
    {
        return T.a(px);
    }

    public final void d(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            v1.a(this);
            Q.c(v1.s());
        }
    }

    public final void e()
    {
        super.e();
        if (aa)
        {
            return;
        }
        C.mFirstMediaOpenedMetric = null;
        C.c("exit_page", "feed");
        d.b(this);
        m.setVisibility(0);
        n.a(8);
        z.a.clear();
        ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
        if (V)
        {
            q();
        }
        if (r.b())
        {
            ((InAppPromptFlipper)r.a()).b();
        }
        LI.a();
        L.a(new Na("FeedFragment"));
    }

    public final void e(android.support.v7.widget.RecyclerView.v v1)
    {
        ab.d();
    }

    public final void e(pX px)
    {
        boolean flag = false;
        Object obj = px.s;
        if (!((ChatConversation) (obj)).I())
        {
            IX ix = x;
            android.widget.ImageView imageview = px.q;
            AT at = ((ChatConversation) (obj)).n();
            boolean flag1;
            if (at != null)
            {
                ix.mSnapViewEventAnalytics.a(com.snapchat.android.analytics.SnapViewEventAnalytics.SnapViewEventSourceType.FEED);
                flag1 = ix.a(at, ((AO) (obj)), "feed", imageview);
            } else
            {
                flag1 = false;
            }
            ab.a(px, flag1);
            if (!flag1)
            {
                flag = true;
            }
        } else
        {
            flag = true;
        }
        if (!Ks.a(((ChatConversation) (obj))) && flag)
        {
            a(px, ((Runnable) (null)));
        }
        obj = z;
        if (!px.x())
        {
            ((pN) (obj)).a(px);
        }
    }

    public final void e_()
    {
        if (!S.c())
        {
            S.b();
        }
    }

    public final void f(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            U = v1.s();
            v1.e(this);
            Q.a(U);
        }
    }

    public final void f(pX px)
    {
        if (e.b() || !e.a) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        ChatConversation chatconversation;
        T t1;
        chatconversation = px.s;
        obj = x;
        obj1 = ad;
        t1 = getActivity().mFragments;
        if (((IX) (obj)).mMultiLeveledSnapView != null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (LA.l())
        {
            if (!flag && !V)
            {
                L.a(new NT(false));
                aa = true;
                px = MiniProfileFragment.a(chatconversation.m(), 1);
                L.a(new Oi(px, false));
            }
        } else
        {
            pN pn = z;
            if (!px.x())
            {
                pn.a(px);
                return;
            }
        }
_L2:
        return;
_L4:
        if (chatconversation.n() == null)
        {
            AT at = chatconversation.r();
            if (at != null)
            {
                obj.mSnapPressedForReplay = at;
                obj.mConversationPressedForReplay = chatconversation;
                ((IX) (obj)).b(((InAppBillingManager) (obj1)), t1, at);
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
            obj1 = chatconversation.mItemsForFeedIcon;
            obj = obj1;
            if (((List) (obj1)).isEmpty())
            {
                chatconversation.x();
                obj = chatconversation.mItemsForFeedIcon;
            }
            if (((List) (obj)).size() == 1)
            {
                obj = (ChatFeedItem)((List) (obj)).get(0);
                if (obj instanceof AB)
                {
                    IX.a((AB)obj);
                    flag = true;
                    continue; /* Loop/switch isn't completed */
                }
            }
        }
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean f()
    {
        if (V)
        {
            q();
            return true;
        } else
        {
            return false;
        }
    }

    public final void f_()
    {
        N.b(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.FEED);
        Bundle bundle = new Bundle();
        bundle.putBoolean("contextIsAdressBook", true);
        bundle.putInt("sourcePage", com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.FEED.ordinal());
        L.a(new Oi(LeftSwipeContentFragment.ADDRESS_BOOK_FRAGMENT, bundle));
    }

    protected final Cf g()
    {
        return new Cf(new String[] {
            "FEED"
        });
    }

    public final void g(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            v1.f(this);
            Q.b(v1.s());
        }
    }

    public final void g_()
    {
        PG.a(new Runnable() {

            private FeedFragment a;

            public final void run()
            {
                FeedFragment.q(a).a = false;
                int i1 = FeedFragment.k(a).indexOf(FeedFragment.q(a));
                if (i1 != -1)
                {
                    FeedFragment.k(a).remove(i1);
                    FeedFragment.k(a).add(FeedFragment.q(a));
                    if (i1 == FeedFragment.k(a).size() - 1)
                    {
                        a.a.c(i1);
                    } else
                    {
                        a.a.a(i1, FeedFragment.k(a).size() - 1);
                    }
                } else
                {
                    FeedFragment.k(a).add(FeedFragment.q(a));
                    a.a.d(FeedFragment.k(a).size() - 1);
                }
                if (FeedFragment.j(a).o() == FeedFragment.k(a).size() - 2)
                {
                    FeedFragment.j(a).a(FeedFragment.k(a).size() - 1, 0);
                }
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
    }

    public final void h()
    {
        if (!d.b.a())
        {
            D.a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.DOUBLE_TAP);
        }
    }

    public final void h(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (pY)v1;
        if (v1 != null)
        {
            v1.g(this);
        }
    }

    public final void h_()
    {
        PG.a(new Runnable() {

            private FeedFragment a;

            public final void run()
            {
                FeedFragment.q(a).a = false;
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
    }

    public final void i_()
    {
        PG.a(new Runnable() {

            private FeedFragment a;

            public final void run()
            {
                FeedFragment.q(a).a = false;
                if (FeedFragment.k(a).remove(FeedFragment.q(a)))
                {
                    a.a.e(FeedFragment.k(a).size());
                }
                if (FeedFragment.r(a))
                {
                    a.a.a(true);
                }
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
    }

    public final CF k()
    {
        return new CF() {

            public final boolean a(CG.a a1)
            {
                return FeedFragment.l().contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return CG.i.contains(a1.c);
            }

        };
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        try
        {
            Q = ((qc)getActivity()).p();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement FeedDelegateProvider").toString());
        }
        try
        {
            Timber.c("FeedFragment", "REPLAY-LOG: initInAppBillingManager", new Object[0]);
            ad = ((qq)getActivity()).r();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement InAppBillingManagerProvider").toString());
        }
    }

    public void onConversationListUpdatedEvent(Mu mu1)
    {
        E.a(com.snapchat.android.analytics.NetworkAnalytics.PageContext.FEED);
        Timber.c("FeedFragment", "FEED-LOG: onConversationListUpdatedEvent", new Object[0]);
        if (R != null && V)
        {
            R.c();
        }
        n();
        s();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        S = new pL(getActivity(), By.c(), this);
        T = new qb();
        H = Jo.a(32F, getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f040073, viewgroup, false);
        j = new PI(mFragmentLayout, 0x7f0d02ba, 0x7f0d02c7);
        n = new PI(mFragmentLayout, 0x7f0d02c0, 0x7f0d02d6, new PI.a() {

            final FeedFragment a;

            public final void a(View view)
            {
                ((TextView)FeedFragment.b(a).a()).setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls1 a;

                    public final void onClick(View view)
                    {
                        view.setVisibility(8);
                        FeedFragment.a(a.a).setVisibility(0);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        m = d(0x7f0d02bf);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment a;

            public final void onClick(View view)
            {
                FeedFragment.c(a).a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.CAMERA_BUTTON);
                a.getActivity().onBackPressed();
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        m.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            private FeedFragment a;

            public final boolean onLongClick(View view)
            {
                view.setVisibility(8);
                view = (TextView)FeedFragment.b(a).a();
                StringBuilder stringbuilder = new StringBuilder();
                FeedFragment.d(a);
                stringbuilder = stringbuilder.append(Bt.c()).append(" | ");
                FeedFragment.d(a);
                view.setText(stringbuilder.append(Bt.b()).toString());
                FeedFragment.b(a).a(0);
                return true;
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        d(0x7f0d02be).setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        h = d(0x7f0d02c3);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment a;

            public final void onClick(View view)
            {
                FeedFragment.e(a).b();
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        i = d(0x7f0d02c2);
        k = new PI(mFragmentLayout, 0x7f0d02c1, 0x7f0d02d7, new PI.a() {

            final FeedFragment a;

            public final void a(View view)
            {
                ((EditText)FeedFragment.g(a).a()).addTextChangedListener(new TextWatcher(this) {

                    private _cls21 a;

                    public final void afterTextChanged(Editable editable)
                    {
                    }

                    public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                    {
                    }

                    public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                    {
                        a.a.b.getFilter().filter(charsequence.toString().trim());
                        if (TextUtils.isEmpty(charsequence))
                        {
                            FeedFragment.f(a.a).a(4);
                            return;
                        } else
                        {
                            FeedFragment.f(a.a).a(0);
                            return;
                        }
                    }

            
            {
                a = _pcls21;
                super();
            }
                });
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        l = new PI(mFragmentLayout, 0x7f0d02c1, 0x7f0d003d, new PI.a() {

            final FeedFragment a;

            public final void a(View view)
            {
                FeedFragment.f(a).a().setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls22 a;

                    public final void onClick(View view)
                    {
                        ((EditText)FeedFragment.g(a.a).a()).setText("");
                    }

            
            {
                a = _pcls22;
                super();
            }
                });
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment a;

            public final void onClick(View view)
            {
                FeedFragment.h(a);
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        o = new PI(mFragmentLayout, 0x7f0d02c4, 0x7f0d02d5);
        p = new PI(mFragmentLayout, 0x7f0d02c5, 0x7f0d02d4, new PI.a() {

            private FeedFragment a;

            public final void a(View view)
            {
                String s1 = a.getString(0x7f08019c, new Object[] {
                    LY.a(Emoji.POOP)
                });
                ((TextView)view).setText(s1);
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        q = new PI(mFragmentLayout, 0x7f0d0147, 0x7f0d027f);
        r = new PI(mFragmentLayout, 0x7f0d02c6, 0x7f0d02d8);
        int i1 = (int)getResources().getDimension(0x7f0a0143);
        ((InAppPromptFlipper)r.a()).setTranslationY(-1L * (long)i1);
        t = new PI(mFragmentLayout, 0x7f0d02c6, 0x7f0d02db);
        s = new PI(mFragmentLayout, 0x7f0d02c6, 0x7f0d02da);
        u = (FrameLayout)mFragmentLayout.findViewById(0x7f0d02bd);
        M.a(SnapchatViewPager.a(Integer.valueOf(mPageIndex)), u, "FeedFragment");
        e = (SnapchatPtrFrameLayout)d(0x7f0d02bb);
        e.setPtrHandler(new afz() {

            private FeedFragment a;

            public final void a(PtrFrameLayout ptrframelayout)
            {
                FeedFragment.l(a);
                ptrframelayout.post(FeedFragment.m(a));
            }

            public final boolean a()
            {
                return !FeedFragment.i(a) && (FeedFragment.j(a).n() == 0 || FeedFragment.k(a).isEmpty());
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        f = (RecyclerView)d(0x7f0d02bc);
        getActivity();
        g = new LinearLayoutManager();
        f.setLayoutManager(g);
        a = new FeedAdapter(O);
        a.a(y);
        f.setAdapter(a);
        f.m.m = false;
        layoutinflater = new SwipeableRecyclerViewItemTouchListener(f, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.SwipeDirection.RIGHT, this);
        layoutinflater.b = this;
        layoutinflater.c = this;
        layoutinflater.d = this;
        f.setOnTouchListener(layoutinflater);
        viewgroup = new com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener._cls1(layoutinflater);
        f.a(new android.support.v7.widget.RecyclerView.l(viewgroup, layoutinflater) {

            private int a;
            private android.support.v7.widget.RecyclerView.l b;
            private SwipeableRecyclerViewItemTouchListener c;
            private FeedFragment d;

            public final void a(RecyclerView recyclerview, int j1)
            {
                b.a(recyclerview, j1);
                if (j1 == 0)
                {
                    c.a(true);
                } else
                {
                    FeedFragment.n(d).c();
                    if (a == 0)
                    {
                        c.a(false);
                        FeedFragment.e(d).c();
                    }
                    Jo.a(d.getActivity(), FeedFragment.o(d));
                }
                a = j1;
            }

            public final void a(RecyclerView recyclerview, int j1, int k1)
            {
                b.a(recyclerview, j1, k1);
            }

            
            {
                d = FeedFragment.this;
                b = l1;
                c = swipeablerecyclerviewitemtouchlistener;
                super();
            }
        });
        f.a(new Gy(F, "Feed"));
        layoutinflater = new android.view.GestureDetector.SimpleOnGestureListener() {

            private FeedFragment a;

            public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                if (f2 <= -7500F && !FeedFragment.p(a).c())
                {
                    FeedFragment.p(a).b();
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                if (!FeedFragment.p(a).c())
                {
                    int j1 = FeedFragment.j(a).s();
                    int k1 = FeedFragment.j(a).z();
                    if (j1 + FeedFragment.j(a).m() >= k1 - 5)
                    {
                        FeedFragment.p(a).b();
                    }
                }
                return false;
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        };
        layoutinflater = new GestureDetector(getActivity(), layoutinflater);
        f.a(new android.support.v7.widget.RecyclerView.q(layoutinflater) {

            private GestureDetector a;

            public final boolean a(MotionEvent motionevent)
            {
                a.onTouchEvent(motionevent);
                return false;
            }

            
            {
                a = gesturedetector;
                super();
            }
        });
        try
        {
            d = ((Hc)getActivity()).q();
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement SnapViewProvider").toString());
        }
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2))
        {
            ab = new c((byte)0);
        } else
        {
            ab = new b((byte)0);
        }
        ac = new d((byte)0);
        e.a(ac);
        d.setOnClipAnimationListener(new com.snapchat.android.ui.snapview.MultiLeveledSnapView.a() {

            private FeedFragment a;

            public final void a(int j1, float f1)
            {
                Fi fi = FeedFragment.n(a);
                if (j1 >= 2) goto _L2; else goto _L1
_L1:
                f1 = 0.0F;
_L4:
                fi.a(f1);
                return;
_L2:
                if (j1 > 2)
                {
                    f1 = 1.0F;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = FeedFragment.this;
                super();
            }
        });
        ll.f();
        return mFragmentLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d.setOnClipAnimationListener(null);
    }

    public void onFeedIconChangedEvent(MF mf)
    {
label0:
        {
label1:
            {
                Timber.c("FeedFragment", (new StringBuilder("FEEDICON-LOG: onFeedIconChangedEvent ")).append(mf.mFeedItemId).toString(), new Object[0]);
                mf = mf.mFeedItemId;
                if (!V)
                {
                    break label0;
                }
                if (b != null)
                {
                    int i1 = b.a(mf);
                    if (i1 == -1)
                    {
                        break label1;
                    }
                    b.c(i1);
                }
                return;
            }
            Timber.c("FeedFragment", (new StringBuilder("FEEDICON-LOG: onFeedIconChangedEvent could not find item in search data set with ID: ")).append(mf).toString(), new Object[0]);
            ((android.support.v7.widget.RecyclerView.a) (b)).a.b();
            return;
        }
        int j1 = a(mf);
        if (j1 != -1)
        {
            a.c(j1);
            return;
        } else
        {
            Timber.c("FeedFragment", (new StringBuilder("FEEDICON-LOG: onFeedIconChangedEvent could not find item in data set with ID: ")).append(mf).toString(), new Object[0]);
            ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
            return;
        }
    }

    public void onFeedRefreshedEvent(SnapMessageFeedRefreshedEvent snapmessagefeedrefreshedevent)
    {
        if (Cl.a().c()) goto _L2; else goto _L1
_L1:
        NetworkError.NO_INTERNET_CONNECTION.notifyInStatusBar();
_L4:
        Z = false;
        n();
        s();
        if (e != null && e.a())
        {
            e.c();
            E.a(snapmessagefeedrefreshedevent.mUUID);
        }
        return;
_L2:
        if (snapmessagefeedrefreshedevent.mError != com.snapchat.android.util.eventbus.SnapMessageFeedRefreshedEvent.RefreshError.NONE)
        {
            if (Z)
            {
                NetworkError.COULD_NOT_REFRESH_TRY_AGAIN.notifyInStatusBar();
            } else
            {
                NetworkError.COULD_NOT_REFRESH.notifyInStatusBar();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onLoadSnapMediaEvent(LoadSnapMediaEvent loadsnapmediaevent)
    {
        if (loadsnapmediaevent.mType == com.snapchat.android.util.eventbus.LoadSnapMediaEvent.LoadSnapMediaEventType.ENDED)
        {
            loadsnapmediaevent = w.a();
            if (!loadsnapmediaevent.isEmpty())
            {
                Object obj = (pT)loadsnapmediaevent.get(0);
                if (obj instanceof ChatConversation)
                {
                    obj = (ChatConversation)obj;
                    if (loadsnapmediaevent.size() > 0 && (((ChatConversation) (obj)).k() == 0 || ((ChatConversation) (obj)).n() != null && ((ChatConversation) (obj)).n().O()))
                    {
                        E.b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.FEED, null);
                    }
                }
            }
        }
        n();
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        Ei ei = v;
        FragmentActivity fragmentactivity = getActivity();
        Intent intent = ei.c(fragmentactivity);
        intent.putExtra("op_code", 1000);
        intent.putExtra("clear", true);
        intent.putExtra("notification_type", null);
        ei.a(fragmentactivity, intent);
        o();
        ll.f();
    }

    public void onScrollFeedToTopEvent(NQ nq)
    {
        g.a(0, 0);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if (TextUtils.equals(SharedPreferenceKey.SHOULD_SHOW_SUGGESTION_PROMPT.getKey(), s1))
        {
            u();
        }
    }

    public void onStart()
    {
        super.onStart();
        Bt.a(this);
    }

    public void onStop()
    {
        super.onStop();
        Bt.b(this);
    }

    public void onSyncAllCompletedEvent(Ow ow)
    {
label0:
        {
            Timber.c("FeedFragment", "FEED-LOG: onSyncAllCompletedEvent", new Object[0]);
            if (!ow.mCalledOnLoginOrOnResume || !getUserVisibleHint())
            {
                break label0;
            }
            E.a(com.snapchat.android.analytics.NetworkAnalytics.PageContext.FEED, ow.mUUID);
            if (!O.isEmpty())
            {
                if (!(O.get(0) instanceof ChatConversation))
                {
                    break label0;
                }
                ChatConversation chatconversation = (ChatConversation)O.get(0);
                boolean flag;
                if (chatconversation.k() == 0 || chatconversation.n().O())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            E.b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.FEED, ow.mUUID);
        }
    }

    public void onUpdateFeedEvent(OE oe)
    {
        n();
        s();
    }

    public void onUserLoadedEvent(OH oh)
    {
        if (oh != null && oh.user != null)
        {
            o();
        }
        n();
        s();
    }

    public void onVisible()
    {
        ll.e();
        C.b("move_to_page", "feed");
        super.onVisible();
        d.a(this);
        Q.a();
        getActivity().setVolumeControlStream(3);
        if (Bt.bL())
        {
            a(2);
        }
        w.b();
        if (a != null)
        {
            ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
        }
        if (V)
        {
            p();
        } else
        {
            q();
        }
        aa = false;
        u();
        if (LI.b())
        {
            LI.a(getActivity());
        }
        J.a("feed");
        ll.f();
    }

    static 
    {
        ae = eg.a(com.snapchat.android.notification.AndroidNotificationManager.Type.ADDFRIEND, com.snapchat.android.notification.AndroidNotificationManager.Type.TYPING, com.snapchat.android.notification.AndroidNotificationManager.Type.ADD_COLLABORATOR_TO_OWNER);
    }
}
