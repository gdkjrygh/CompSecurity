// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.e;

import a.a;
import com.kik.cards.browser.CaptchaWindowFragment;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.ao;
import com.kik.j.d;
import com.kik.j.f;
import com.kik.j.h;
import com.kik.j.j;
import com.kik.j.p;
import com.kik.j.x;
import com.kik.j.y;
import com.kik.j.z;
import com.kik.view.adapters.at;
import javax.inject.Provider;
import kik.a.i;
import kik.a.l;
import kik.a.m;
import kik.a.n;
import kik.a.q;
import kik.a.s;
import kik.a.t;
import kik.a.u;
import kik.a.w;
import kik.android.KikNotificationHandler;
import kik.android.af;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.activity.IntroActivity;
import kik.android.chat.activity.KikActivityBase;
import kik.android.chat.activity.KikApiLandingActivity;
import kik.android.chat.activity.KikIqActivityBase;
import kik.android.chat.activity.KikPlatformLanding;
import kik.android.chat.activity.ab;
import kik.android.chat.activity.aj;
import kik.android.chat.activity.al;
import kik.android.chat.activity.o;
import kik.android.chat.fragment.AbTestsFragment;
import kik.android.chat.fragment.BaseChatInfoFragment;
import kik.android.chat.fragment.CameraFragment;
import kik.android.chat.fragment.ChatBubbleSelectionFragment;
import kik.android.chat.fragment.ConversationsBaseFragment;
import kik.android.chat.fragment.KikAddContactFragment;
import kik.android.chat.fragment.KikCardBrowserFragment;
import kik.android.chat.fragment.KikChangeGroupNameFragment;
import kik.android.chat.fragment.KikChatFragment;
import kik.android.chat.fragment.KikChatInfoFragment;
import kik.android.chat.fragment.KikCodeFragment;
import kik.android.chat.fragment.KikContactsListFragment;
import kik.android.chat.fragment.KikConversationsFragment;
import kik.android.chat.fragment.KikDefaultContactsListFragment;
import kik.android.chat.fragment.KikDisplayOnlyChatInfoFragment;
import kik.android.chat.fragment.KikFindPeopleFragment;
import kik.android.chat.fragment.KikGroupMembersListFragment;
import kik.android.chat.fragment.KikIqFragmentBase;
import kik.android.chat.fragment.KikLoginFragment;
import kik.android.chat.fragment.KikMultiselectContactsListFragment;
import kik.android.chat.fragment.KikPermissionsFragment;
import kik.android.chat.fragment.KikPickContactFragment;
import kik.android.chat.fragment.KikPickUsersFragment;
import kik.android.chat.fragment.KikPreferenceLaunchpad;
import kik.android.chat.fragment.KikPromotedChatsFragment;
import kik.android.chat.fragment.KikRegistrationFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.KikSponsoredBaseFragment;
import kik.android.chat.fragment.KikStartGroupFragment;
import kik.android.chat.fragment.KikWelcomeFragment;
import kik.android.chat.fragment.MissedConversationsFragment;
import kik.android.chat.fragment.ScanCodeTabFragment;
import kik.android.chat.fragment.SendToFragment;
import kik.android.chat.fragment.SimpleFragmentWrapperActivity;
import kik.android.chat.fragment.VideoTrimmingFragment;
import kik.android.chat.fragment.ViewPictureFragment;
import kik.android.chat.fragment.aa;
import kik.android.chat.fragment.bd;
import kik.android.chat.fragment.bq;
import kik.android.chat.fragment.bv;
import kik.android.chat.fragment.e;
import kik.android.chat.fragment.gg;
import kik.android.chat.fragment.ic;
import kik.android.chat.fragment.iz;
import kik.android.chat.fragment.jn;
import kik.android.chat.fragment.kr;
import kik.android.chat.fragment.lb;
import kik.android.chat.fragment.le;
import kik.android.chat.fragment.lg;
import kik.android.chat.fragment.lv;
import kik.android.chat.fragment.mc;
import kik.android.chat.fragment.mk;
import kik.android.chat.fragment.ne;
import kik.android.chat.fragment.ni;
import kik.android.chat.fragment.nn;
import kik.android.chat.fragment.nq;
import kik.android.chat.fragment.ob;
import kik.android.chat.fragment.oj;
import kik.android.chat.fragment.pg;
import kik.android.chat.fragment.pk;
import kik.android.chat.fragment.po;
import kik.android.chat.fragment.py;
import kik.android.chat.fragment.qd;
import kik.android.chat.fragment.qk;
import kik.android.chat.fragment.qw;
import kik.android.chat.fragment.rg;
import kik.android.chat.fragment.rk;
import kik.android.chat.fragment.sd;
import kik.android.chat.fragment.settings.KikPreferenceFragment;
import kik.android.chat.fragment.settings.c;
import kik.android.chat.fragment.to;
import kik.android.i.k;
import kik.android.net.communicator.CommunicatorService;
import kik.android.scan.fragment.ScanFragment;
import kik.android.widget.GalleryWidget;
import kik.android.widget.GifWidget;
import kik.android.widget.GifWidgetFragment;
import kik.android.widget.WebTrayWidget;
import kik.android.widget.ar;
import kik.android.widget.bw;
import kik.android.widget.bx;
import kik.android.widget.eq;
import kik.android.widget.preferences.AutoplayVideoPreference;
import kik.android.widget.preferences.HelpPreference;
import kik.android.widget.preferences.KikCheckBoxPreference;
import kik.android.widget.preferences.KikEditTextPreference;
import kik.android.widget.preferences.KikEmailPreference;
import kik.android.widget.preferences.KikModalPreference;
import kik.android.widget.preferences.KikPreference;
import kik.android.widget.preferences.KikPreferenceScreen;
import kik.android.widget.preferences.KikProfilePicPreference;
import kik.android.widget.preferences.KikVideoPrefetchPreference;
import kik.android.widget.preferences.LEDNotificationPreference;
import kik.android.widget.preferences.MatchingPreference;
import kik.android.widget.preferences.NamePreference;
import kik.android.widget.preferences.NotifyNewPeoplePreference;
import kik.android.widget.preferences.OptOutPreference;
import kik.android.widget.preferences.PasswordPreference;
import kik.android.widget.preferences.ResetKikPreference;
import kik.android.widget.preferences.ShareEmailPreference;
import kik.android.widget.preferences.ShareOtherPreference;
import kik.android.widget.preferences.ShareProfilePreference;
import kik.android.widget.preferences.ShareSmsPreference;
import kik.android.widget.preferences.ShareSocialPreference;
import kik.android.widget.preferences.ShowKikCodePreference;
import kik.android.widget.preferences.UsernamePreference;
import kik.android.widget.preferences.ac;
import kik.android.widget.preferences.ah;
import kik.android.widget.preferences.ak;
import kik.android.widget.preferences.aq;
import kik.android.widget.preferences.az;
import kik.android.widget.preferences.bc;
import kik.android.widget.preferences.bf;
import kik.android.widget.preferences.bj;
import kik.android.widget.preferences.bk;
import kik.android.widget.preferences.bl;
import kik.android.widget.preferences.bm;
import kik.android.widget.preferences.bn;
import kik.android.widget.preferences.bo;
import kik.android.widget.preferences.br;
import kik.android.widget.preferences.g;
import kik.android.widget.preferences.r;
import kik.android.widget.preferences.v;

// Referenced classes of package com.kik.e:
//            a

public final class b
    implements com.kik.e.a
{
    public static final class a
    {

        private com.kik.j.e a;
        private kik.a.d b;
        private com.kik.j.o c;
        private y d;
        private com.kik.j.w e;
        private com.kik.j.c f;
        private com.kik.j.g g;
        private com.kik.j.aa h;
        private com.kik.j.k i;
        private com.kik.j.q j;
        private com.kik.j.s k;
        private com.kik.j.m l;
        private com.kik.j.u m;
        private com.kik.j.a n;

        static kik.a.d a(a a1)
        {
            return a1.b;
        }

        static com.kik.j.a b(a a1)
        {
            return a1.n;
        }

        static com.kik.j.e c(a a1)
        {
            return a1.a;
        }

        static com.kik.j.o d(a a1)
        {
            return a1.c;
        }

        static com.kik.j.g e(a a1)
        {
            return a1.g;
        }

        static com.kik.j.u f(a a1)
        {
            return a1.m;
        }

        static com.kik.j.aa g(a a1)
        {
            return a1.h;
        }

        static com.kik.j.w h(a a1)
        {
            return a1.e;
        }

        static com.kik.j.c i(a a1)
        {
            return a1.f;
        }

        static y j(a a1)
        {
            return a1.d;
        }

        static com.kik.j.k k(a a1)
        {
            return a1.i;
        }

        static com.kik.j.m l(a a1)
        {
            return a1.l;
        }

        static com.kik.j.q m(a a1)
        {
            return a1.j;
        }

        static com.kik.j.s n(a a1)
        {
            return a1.k;
        }

        public final com.kik.e.a a()
        {
            if (a == null)
            {
                throw new IllegalStateException("clientCoreModule must be set");
            }
            if (b == null)
            {
                throw new IllegalStateException("coreModule must be set");
            }
            if (c == null)
            {
                throw new IllegalStateException("mixpanelModule must be set");
            }
            if (d == null)
            {
                throw new IllegalStateException("sponsoredUsersManagerModule must be set");
            }
            if (e == null)
            {
                throw new IllegalStateException("smileyManagerModule must be set");
            }
            if (f == null)
            {
                throw new IllegalStateException("bubbleManagerModule must be set");
            }
            if (g == null)
            {
                throw new IllegalStateException("imageLoaderModule must be set");
            }
            if (h == null)
            {
                throw new IllegalStateException("userPreferenceModule must be set");
            }
            if (i == null)
            {
                throw new IllegalStateException("kikInternalDeepLinkModule must be set");
            }
            if (j == null)
            {
                throw new IllegalStateException("multiCoreStorageLocationProviderModule must be set");
            }
            if (k == null)
            {
                throw new IllegalStateException("scanRequestManagerModule must be set");
            }
            if (l == null)
            {
                throw new IllegalStateException("linkModerationManagerModule must be set");
            }
            if (m == null)
            {
                throw new IllegalStateException("sharedPrefProviderModule must be set");
            }
            if (n == null)
            {
                throw new IllegalStateException("abManagerModule must be set");
            } else
            {
                return new b(this, (byte)0);
            }
        }

        public final a a(com.kik.j.a a1)
        {
            n = a1;
            return this;
        }

        public final a a(com.kik.j.aa aa1)
        {
            h = aa1;
            return this;
        }

        public final a a(com.kik.j.c c1)
        {
            f = c1;
            return this;
        }

        public final a a(com.kik.j.e e1)
        {
            a = e1;
            return this;
        }

        public final a a(com.kik.j.g g1)
        {
            g = g1;
            return this;
        }

        public final a a(com.kik.j.k k1)
        {
            i = k1;
            return this;
        }

        public final a a(com.kik.j.m m1)
        {
            l = m1;
            return this;
        }

        public final a a(com.kik.j.o o1)
        {
            c = o1;
            return this;
        }

        public final a a(com.kik.j.q q1)
        {
            j = q1;
            return this;
        }

        public final a a(com.kik.j.s s1)
        {
            k = s1;
            return this;
        }

        public final a a(com.kik.j.u u1)
        {
            m = u1;
            return this;
        }

        public final a a(com.kik.j.w w1)
        {
            e = w1;
            return this;
        }

        public final a a(y y1)
        {
            d = y1;
            return this;
        }

        public final a a(kik.a.d d1)
        {
            b = d1;
            return this;
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    static final boolean a;
    private a.a A;
    private Provider B;
    private Provider C;
    private a.a D;
    private Provider E;
    private a.a F;
    private a.a G;
    private Provider H;
    private a.a I;
    private Provider J;
    private a.a K;
    private a.a L;
    private a.a M;
    private a.a N;
    private a.a O;
    private a.a P;
    private Provider Q;
    private a.a R;
    private a.a S;
    private a.a T;
    private a.a U;
    private a.a V;
    private a.a W;
    private a.a X;
    private a.a Y;
    private a.a Z;
    private a.a aA;
    private a.a aB;
    private a.a aC;
    private a.a aD;
    private Provider aE;
    private Provider aF;
    private Provider aG;
    private Provider aH;
    private Provider aI;
    private Provider aJ;
    private a.a aK;
    private a.a aL;
    private a.a aM;
    private a.a aN;
    private a.a aO;
    private Provider aP;
    private a.a aQ;
    private a.a aR;
    private a.a aS;
    private a.a aT;
    private a.a aU;
    private a.a aV;
    private a.a aW;
    private a.a aX;
    private a.a aY;
    private a.a aZ;
    private Provider aa;
    private a.a ab;
    private a.a ac;
    private a.a ad;
    private Provider ae;
    private a.a af;
    private Provider ag;
    private a.a ah;
    private Provider ai;
    private Provider aj;
    private a.a ak;
    private a.a al;
    private a.a am;
    private a.a an;
    private a.a ao;
    private a.a ap;
    private a.a aq;
    private Provider ar;
    private Provider as;
    private Provider at;
    private Provider au;
    private Provider av;
    private a.a aw;
    private Provider ax;
    private a.a ay;
    private a.a az;
    private Provider b;
    private a.a ba;
    private a.a bb;
    private a.a bc;
    private a.a bd;
    private a.a be;
    private a.a bf;
    private a.a bg;
    private a.a bh;
    private a.a bi;
    private a.a bj;
    private a.a bk;
    private a.a bl;
    private a.a c;
    private Provider d;
    private a.a e;
    private Provider f;
    private a.a g;
    private Provider h;
    private a.a i;
    private a.a j;
    private Provider k;
    private a.a l;
    private a.a m;
    private Provider n;
    private a.a o;
    private Provider p;
    private a.a q;
    private a.a r;
    private Provider s;
    private Provider t;
    private a.a u;
    private a.a v;
    private a.a w;
    private a.a x;
    private a.a y;
    private Provider z;

    private b(a a1)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = kik.a.u.a(com.kik.e.a.a(a1));
            c = pk.a(a.a.b.a(), b);
            d = com.kik.j.b.a(a.b(a1));
            e = kik.android.chat.fragment.e.a(c, d);
            f = com.kik.j.f.a(com.kik.e.a.c(a1));
            g = sd.a(c, f);
            h = com.kik.j.p.a(com.kik.e.a.d(a1));
            i = com.kik.cards.browser.e.a(c, h);
            j = kik.android.i.k.a(f, h);
            k = com.kik.j.j.a(com.kik.e.a.e(a1));
            l = kik.android.widget.ar.a(a.a.b.a(), h, b, f, k);
            m = bx.a(a.a.b.a(), f, h, k);
            n = kik.a.i.a(com.kik.e.a.a(a1));
            o = bw.a(a.a.b.a(), n, h, f);
            p = kik.a.l.a(com.kik.e.a.a(a1));
            q = rk.a(a.a.b.a(), p);
            r = kik.android.chat.activity.j.a(a.a.b.a(), p, b);
            s = kik.a.j.a(com.kik.e.a.a(a1));
            t = kik.a.m.a(com.kik.e.a.a(a1));
            u = kik.android.net.communicator.i.a(a.a.b.a(), n, s, t);
            v = kik.android.chat.activity.al.a(a.a.b.a(), h, b, f);
            w = kik.android.chat.activity.o.a(a.a.b.a(), t, p);
            x = kik.android.chat.activity.aj.a(w, n);
            y = kik.android.chat.activity.f.a(a.a.b.a(), b, p);
            z = com.kik.j.h.a(com.kik.e.a.e(a1));
            A = eq.a(a.a.b.a(), z, h);
            B = kik.a.n.a(com.kik.e.a.a(a1));
            C = kik.a.q.a(com.kik.e.a.a(a1));
            D = kik.android.chat.activity.ab.a(x, h, B, C, b);
            E = kik.a.s.a(com.kik.e.a.a(a1));
            F = com.kik.view.adapters.at.a(C, b, f, s, E);
            G = kik.android.widget.preferences.ak.a(a.a.b.a(), b);
            H = kik.a.h.a(com.kik.e.a.a(a1));
            I = kik.android.widget.preferences.v.a(a.a.b.a(), H);
            J = kik.a.w.a(com.kik.e.a.a(a1));
            K = kik.android.widget.preferences.g.a(I, J);
            L = kik.android.widget.preferences.l.a(a.a.b.a(), H);
            M = kik.android.widget.preferences.bf.a(L, J, b);
            N = kik.android.widget.preferences.i.a(a.a.b.a(), H);
            O = kik.android.widget.preferences.az.a(N, J);
            P = kik.android.widget.preferences.ac.a(a.a.b.a(), H);
            Q = com.kik.j.i.a(com.kik.e.a.e(a1));
            R = bm.a(P, h, J, Q);
            S = P;
            T = br.a(I, J, h, Q);
            U = kik.android.widget.preferences.at.a(L, J, C);
            V = kik.android.widget.preferences.b.a(a.a.b.a(), h, b);
            W = kik.android.widget.preferences.aj.a(a.a.b.a(), h, b);
            X = kik.android.widget.preferences.ah.a(P, J, b, h);
            Y = P;
            Z = kik.android.widget.preferences.r.a(L, J, n);
            aa = kik.a.e.a(com.kik.e.a.a(a1));
            ab = kik.android.widget.preferences.aq.a(P, aa);
            ac = kik.android.widget.preferences.bj.a(P, p);
            ad = mc.a(c, n);
            ae = com.kik.j.v.a(com.kik.e.a.f(a1));
            af = kik.android.chat.fragment.settings.h.a(ad, b, ae);
            ag = com.kik.j.ab.a(com.kik.e.a.g(a1));
            ah = kik.android.chat.fragment.settings.c.a(af, ag, J, h);
            ai = kik.a.v.a(com.kik.e.a.a(a1));
            aj = kik.a.p.a(com.kik.e.a.a(a1));
            ak = ob.a(ah, ai, aj, b, Q);
            al = kik.android.widget.preferences.bl.a(P, J);
            am = kik.android.widget.preferences.bc.a(P, aa);
            an = kik.android.widget.preferences.bk.a(P, J);
            ao = bn.a(P, J);
            ap = bo.a(P, J);
            aq = kik.android.af.a(a.a.b.a(), Q, C, B, b, h);
            ar = com.kik.j.x.a(com.kik.e.a.h(a1));
            as = com.kik.j.d.a(com.kik.e.a.i(a1));
            at = com.kik.j.z.a(com.kik.e.a.j(a1));
            au = com.kik.j.l.a(com.kik.e.a.k(a1));
            av = com.kik.j.n.a(com.kik.e.a.l(a1));
            aw = kik.android.chat.aj.a(a.a.b.a(), h, ar, as, at, z, au, av, d);
            ax = kik.a.k.a(com.kik.e.a.a(a1));
            ay = mk.a(ad, ai, E, J, b, n, ax, h, f, ae);
            az = kik.android.chat.fragment.f.a(ad, B, h, Q);
            aA = kik.android.chat.fragment.aa.a(c, b, h, f);
            aB = kik.android.chat.fragment.ac.a(c, as, h);
            aC = kik.android.chat.fragment.ar.a(ad, s, C, b, B, aj, h, f);
            aD = kik.android.chat.fragment.bd.a(ad, h, C);
            aE = kik.a.r.a(com.kik.e.a.a(a1));
            aF = kik.a.t.a(com.kik.e.a.a(a1));
            aG = kik.a.f.a(com.kik.e.a.a(a1));
            aH = kik.a.g.a(com.kik.e.a.a(a1));
            aI = kik.a.o.a(com.kik.e.a.a(a1));
            aJ = com.kik.j.r.a(com.kik.e.a.m(a1));
            aK = com.kik.cards.web.ao.a(c, h, aE, aF, ar, C, aG, aH, aI, b, f, J, ai, aJ, z, ae);
            aL = aK;
            aM = bq.a(aL, h);
            aN = bv.a(ad, h, C, B);
            aO = gg.a(c, Q, k, z, b, B, at, h, aj, ai, C, s, n, J, f, ae, E, ar, as, ag, au, av);
            aP = com.kik.j.t.a(com.kik.e.a.n(a1));
            aQ = ic.a(az, at, s, C, J, b, ai, aj, aP);
            aR = jn.a(ad, B, C, at, h, Q);
            aS = kr.a(aC, at, aa, J, d, f, ae, aJ, Q);
            aT = lb.a(aR, at, h, Q);
            aU = po.a(ad, Q, at, h);
            aV = lg.a(aU, C, J);
            aW = lv.a(ad, C, b, B, Q, h);
            aX = le.a(az, C);
            aY = ne.a(aR, Q, h);
            aZ = ni.a(c, J, Q, z, h);
            ba = nn.a(aT, b);
            bb = nq.a(aY, J);
            bc = oj.a(aU, C);
            bd = pg.a(ad, h, aj, E, J, b, n, ai, ax, ae);
            be = py.a(bb, Q, C, B, J, b, h, ai, aj);
            bf = qd.a(ad, h, J, ae);
            bg = qk.a(aC, Q);
            bh = rg.a(c, C, B, aj, s, b, h, Q);
            bi = to.a(ad, k, Q, C, J, h, aj, ai, b, f);
            bj = iz.a(ad, Q, ai, b, C, J, h, as, aP, B);
            bk = kik.android.scan.fragment.w.a(ad, h, as, C, aP, B, s);
            bl = qw.a(c, h, B);
            return;
        }
    }

    b(a a1, byte byte0)
    {
        this(a1);
    }

    public static a a()
    {
        return new a((byte)0);
    }

    public final void a(CaptchaWindowFragment captchawindowfragment)
    {
        i.a(captchawindowfragment);
    }

    public final void a(CardsWebViewFragment cardswebviewfragment)
    {
        aK.a(cardswebviewfragment);
    }

    public final void a(com.kik.view.adapters.ar ar1)
    {
        F.a(ar1);
    }

    public final void a(KikNotificationHandler kiknotificationhandler)
    {
        aq.a(kiknotificationhandler);
    }

    public final void a(KikApplication kikapplication)
    {
        aw.a(kikapplication);
    }

    public final void a(FragmentWrapperActivity fragmentwrapperactivity)
    {
        y.a(fragmentwrapperactivity);
    }

    public final void a(IntroActivity introactivity)
    {
        r.a(introactivity);
    }

    public final void a(KikActivityBase kikactivitybase)
    {
        w.a(kikactivitybase);
    }

    public final void a(KikApiLandingActivity kikapilandingactivity)
    {
        D.a(kikapilandingactivity);
    }

    public final void a(KikIqActivityBase kikiqactivitybase)
    {
        x.a(kikiqactivitybase);
    }

    public final void a(KikPlatformLanding kikplatformlanding)
    {
        v.a(kikplatformlanding);
    }

    public final void a(AbTestsFragment abtestsfragment)
    {
        e.a(abtestsfragment);
    }

    public final void a(BaseChatInfoFragment basechatinfofragment)
    {
        az.a(basechatinfofragment);
    }

    public final void a(CameraFragment camerafragment)
    {
        aA.a(camerafragment);
    }

    public final void a(ChatBubbleSelectionFragment chatbubbleselectionfragment)
    {
        aB.a(chatbubbleselectionfragment);
    }

    public final void a(ConversationsBaseFragment conversationsbasefragment)
    {
        aC.a(conversationsbasefragment);
    }

    public final void a(KikAddContactFragment kikaddcontactfragment)
    {
        aD.a(kikaddcontactfragment);
    }

    public final void a(KikCardBrowserFragment kikcardbrowserfragment)
    {
        aM.a(kikcardbrowserfragment);
    }

    public final void a(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        aN.a(kikchangegroupnamefragment);
    }

    public final void a(KikChatFragment kikchatfragment)
    {
        aO.a(kikchatfragment);
    }

    public final void a(KikChatInfoFragment kikchatinfofragment)
    {
        aQ.a(kikchatinfofragment);
    }

    public final void a(KikCodeFragment kikcodefragment)
    {
        bj.a(kikcodefragment);
    }

    public final void a(KikContactsListFragment kikcontactslistfragment)
    {
        aR.a(kikcontactslistfragment);
    }

    public final void a(KikConversationsFragment kikconversationsfragment)
    {
        aS.a(kikconversationsfragment);
    }

    public final void a(KikDefaultContactsListFragment kikdefaultcontactslistfragment)
    {
        aT.a(kikdefaultcontactslistfragment);
    }

    public final void a(KikDisplayOnlyChatInfoFragment kikdisplayonlychatinfofragment)
    {
        aX.a(kikdisplayonlychatinfofragment);
    }

    public final void a(KikFindPeopleFragment kikfindpeoplefragment)
    {
        aV.a(kikfindpeoplefragment);
    }

    public final void a(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        aW.a(kikgroupmemberslistfragment);
    }

    public final void a(KikIqFragmentBase kikiqfragmentbase)
    {
        ad.a(kikiqfragmentbase);
    }

    public final void a(KikLoginFragment kikloginfragment)
    {
        ay.a(kikloginfragment);
    }

    public final void a(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        aY.a(kikmultiselectcontactslistfragment);
    }

    public final void a(KikPermissionsFragment kikpermissionsfragment)
    {
        aZ.a(kikpermissionsfragment);
    }

    public final void a(KikPickContactFragment kikpickcontactfragment)
    {
        ba.a(kikpickcontactfragment);
    }

    public final void a(KikPickUsersFragment kikpickusersfragment)
    {
        bb.a(kikpickusersfragment);
    }

    public final void a(KikPreferenceLaunchpad kikpreferencelaunchpad)
    {
        ak.a(kikpreferencelaunchpad);
    }

    public final void a(KikPromotedChatsFragment kikpromotedchatsfragment)
    {
        bc.a(kikpromotedchatsfragment);
    }

    public final void a(KikRegistrationFragment kikregistrationfragment)
    {
        bd.a(kikregistrationfragment);
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        c.a(kikscopeddialogfragment);
    }

    public final void a(KikSponsoredBaseFragment kiksponsoredbasefragment)
    {
        aU.a(kiksponsoredbasefragment);
    }

    public final void a(KikStartGroupFragment kikstartgroupfragment)
    {
        be.a(kikstartgroupfragment);
    }

    public final void a(KikWelcomeFragment kikwelcomefragment)
    {
        bf.a(kikwelcomefragment);
    }

    public final void a(MissedConversationsFragment missedconversationsfragment)
    {
        bg.a(missedconversationsfragment);
    }

    public final void a(ScanCodeTabFragment scancodetabfragment)
    {
        bl.a(scancodetabfragment);
    }

    public final void a(SendToFragment sendtofragment)
    {
        bh.a(sendtofragment);
    }

    public final void a(SimpleFragmentWrapperActivity simplefragmentwrapperactivity)
    {
        q.a(simplefragmentwrapperactivity);
    }

    public final void a(VideoTrimmingFragment videotrimmingfragment)
    {
        g.a(videotrimmingfragment);
    }

    public final void a(ViewPictureFragment viewpicturefragment)
    {
        bi.a(viewpicturefragment);
    }

    public final void a(KikPreferenceFragment kikpreferencefragment)
    {
        ah.a(kikpreferencefragment);
    }

    public final void a(kik.android.i.i i1)
    {
        j.a(i1);
    }

    public final void a(CommunicatorService communicatorservice)
    {
        u.a(communicatorservice);
    }

    public final void a(ScanFragment scanfragment)
    {
        bk.a(scanfragment);
    }

    public final void a(GalleryWidget gallerywidget)
    {
        l.a(gallerywidget);
    }

    public final void a(GifWidget gifwidget)
    {
        m.a(gifwidget);
    }

    public final void a(GifWidgetFragment gifwidgetfragment)
    {
        o.a(gifwidgetfragment);
    }

    public final void a(WebTrayWidget webtraywidget)
    {
        A.a(webtraywidget);
    }

    public final void a(AutoplayVideoPreference autoplayvideopreference)
    {
        V.a(autoplayvideopreference);
    }

    public final void a(HelpPreference helppreference)
    {
        K.a(helppreference);
    }

    public final void a(KikCheckBoxPreference kikcheckboxpreference)
    {
        N.a(kikcheckboxpreference);
    }

    public final void a(KikEditTextPreference kikedittextpreference)
    {
        L.a(kikedittextpreference);
    }

    public final void a(KikEmailPreference kikemailpreference)
    {
        Z.a(kikemailpreference);
    }

    public final void a(KikModalPreference kikmodalpreference)
    {
        I.a(kikmodalpreference);
    }

    public final void a(KikPreference kikpreference)
    {
        P.a(kikpreference);
    }

    public final void a(KikPreferenceScreen kikpreferencescreen)
    {
        Y.a(kikpreferencescreen);
    }

    public final void a(KikProfilePicPreference kikprofilepicpreference)
    {
        X.a(kikprofilepicpreference);
    }

    public final void a(KikVideoPrefetchPreference kikvideoprefetchpreference)
    {
        W.a(kikvideoprefetchpreference);
    }

    public final void a(LEDNotificationPreference lednotificationpreference)
    {
        G.a(lednotificationpreference);
    }

    public final void a(MatchingPreference matchingpreference)
    {
        ab.a(matchingpreference);
    }

    public final void a(NamePreference namepreference)
    {
        U.a(namepreference);
    }

    public final void a(NotifyNewPeoplePreference notifynewpeoplepreference)
    {
        O.a(notifynewpeoplepreference);
    }

    public final void a(OptOutPreference optoutpreference)
    {
        am.a(optoutpreference);
    }

    public final void a(PasswordPreference passwordpreference)
    {
        M.a(passwordpreference);
    }

    public final void a(ResetKikPreference resetkikpreference)
    {
        ac.a(resetkikpreference);
    }

    public final void a(ShareEmailPreference shareemailpreference)
    {
        an.a(shareemailpreference);
    }

    public final void a(ShareOtherPreference shareotherpreference)
    {
        al.a(shareotherpreference);
    }

    public final void a(ShareProfilePreference shareprofilepreference)
    {
        R.a(shareprofilepreference);
    }

    public final void a(ShareSmsPreference sharesmspreference)
    {
        ao.a(sharesmspreference);
    }

    public final void a(ShareSocialPreference sharesocialpreference)
    {
        ap.a(sharesocialpreference);
    }

    public final void a(ShowKikCodePreference showkikcodepreference)
    {
        S.a(showkikcodepreference);
    }

    public final void a(UsernamePreference usernamepreference)
    {
        T.a(usernamepreference);
    }

    static 
    {
        boolean flag;
        if (!com/kik/e/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
