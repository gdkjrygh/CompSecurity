// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.SoftwareContactImageView;
import com.kik.cards.util.UserDataParcelable;
import com.kik.g.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kik.a.d.aa;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.h.j;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.e.d;
import kik.android.scan.a.c;
import kik.android.util.ao;
import kik.android.util.ap;
import kik.android.util.ck;
import kik.android.util.cp;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.util.e;

// Referenced classes of package kik.android.chat.fragment:
//            BaseChatInfoFragment, gi, gv, hw, 
//            hx, ia, ib, gp, 
//            gk, hj, he, hd, 
//            ProgressDialogFragment, hn, hz, hk, 
//            hf, gn, hc, hg, 
//            hi, hh, hb, hq, 
//            gr, gq, ha, gt, 
//            gu, gs, gw, gx, 
//            gy, gz, gj, hm, 
//            hl, gl

public class KikChatInfoFragment extends BaseChatInfoFragment
    implements d
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        static int a(a a1)
        {
            return a1.b("kik.prof.extra.actiontype", 1);
        }

        public final String a()
        {
            return b("kik.chat.origin", "kik.chat.origin.unknown");
        }

        public final a a(String s1)
        {
            a("kik.chat.origin", s1);
            return this;
        }

        public final a a(k k1)
        {
            if (k1 == null)
            {
                k1 = null;
            } else
            {
                k1 = k1.b();
            }
            return d(k1);
        }

        public final a a(c c1)
        {
            if (c1 != null)
            {
                a("kik.chat.info.scan.nonce", c1.c());
                a("kik.chat.info.scan.data", c1.b());
                a("kik.chat.info.scan.invite", c1.d());
                a("kik.chat.info.scan.bytes", c1.a());
            }
            return this;
        }

        public final a a(boolean flag)
        {
            a("returnToMissedConvos", flag);
            return this;
        }

        public final a b()
        {
            a("groupExtraRestrictAdd", true);
            return this;
        }

        public final a b(int i1)
        {
            a("kik.prof.extra.actiontype", i1);
            return this;
        }

        public final a b(String s1)
        {
            a("fromConversationId", s1);
            return this;
        }

        public final a b(boolean flag)
        {
            a("kik.prof.extra.finishpromise", flag);
            return this;
        }

        public final a c()
        {
            a("isFiltered", true);
            return this;
        }

        public final a c(String s1)
        {
            a("sessionId", s1);
            return this;
        }

        public final a c(boolean flag)
        {
            a("showKeyBoard", flag);
            return this;
        }

        public final a d(String s1)
        {
            a("kik.prof.extra.jid", s1);
            return this;
        }

        public final a d(boolean flag)
        {
            a("showSelectAsSendTo", flag);
            return this;
        }

        public final c d()
        {
            byte abyte0[] = h("kik.chat.info.scan.bytes");
            if (abyte0 == null)
            {
                return null;
            } else
            {
                byte abyte1[] = h("kik.chat.info.scan.invite");
                short word0 = i("kik.chat.info.scan.nonce");
                return kik.android.scan.a.c.a(abyte0, abyte1, g("kik.chat.info.scan.data"), word0);
            }
        }

        public a()
        {
        }
    }


    private static boolean X = false;
    private static boolean Y = false;
    kik.android.scan.d A;
    private final int B = 1;
    private final int C = 2;
    private k D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private String J;
    private ProgressDialogFragment K;
    private int L;
    private aa M;
    private f N;
    private k O;
    private ProgressDialogFragment U;
    private boolean V;
    private boolean W;
    private ap Z;
    TextView _notInGroupTextView;
    ContactImageView _profilePicBig;
    ImageView _verifiedStar;
    private ImageView aa;
    private TextView ab;
    private TextView ac;
    private CheckBox ad;
    private String ae;
    private final a af = new a();
    private ao ag;
    private Handler ah;
    private com.kik.g.i ai;
    private com.kik.g.i aj;
    private com.kik.g.i ak;
    private com.kik.g.i al;
    protected ck q;
    i r;
    r s;
    w t;
    v x;
    kik.a.f.k y;
    kik.a.e.n z;

    public KikChatInfoFragment()
    {
        E = false;
        F = false;
        G = false;
        H = false;
        I = false;
        J = "";
        L = 1;
        V = false;
        W = false;
        ag = new gi(this);
        ah = new gv(this);
        ai = new hw(this);
        aj = new hx(this);
        ak = new ia(this);
        al = new ib(this);
    }

    private View a(String s1, String s2, String s3)
    {
        s1 = a(s1, ((android.graphics.drawable.Drawable) (c.a(0x7f0202d2, 0x7f0202d4))), ((android.view.View.OnClickListener) (new gp(this, s2))));
        com.kik.m.d.a(s1, s3);
        return s1;
    }

    static String a(KikChatInfoFragment kikchatinfofragment, String s1)
    {
        kikchatinfofragment.J = s1;
        return s1;
    }

    static f a(KikChatInfoFragment kikchatinfofragment, f f1)
    {
        kikchatinfofragment.N = f1;
        return f1;
    }

    static k a(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.D;
    }

    static k a(KikChatInfoFragment kikchatinfofragment, k k1)
    {
        kikchatinfofragment.O = k1;
        return k1;
    }

    static ProgressDialogFragment a(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        kikchatinfofragment.K = progressdialogfragment;
        return progressdialogfragment;
    }

    private void a(k k1)
    {
        if (k1 == null)
        {
            return;
        }
        if (N == null)
        {
            N = r.f(D.b());
        }
        if (N.n())
        {
            long l1 = N.p();
            aa.setImageResource(0x7f070025);
            ad.setChecked(true);
            ab.setText(0x7f0902d9);
            cv.b(new View[] {
                ac
            });
            if (l1 == -1L)
            {
                ac.setText(0x7f090166);
            } else
            {
                k1 = new Date(l1 - kik.a.h.j.a());
                k1 = (new SimpleDateFormat("h:mm a")).format(k1);
                ac.setText(KikApplication.a(0x7f090169, new Object[] {
                    k1
                }));
                com.kik.m.d.a(ac, (new StringBuilder("AUTOMATION_MUTE_DETAIL_UNTIL_")).append(k1.toUpperCase()).toString());
            }
            com.kik.m.d.a(ab, "AUTOMATION_TITLE_MUTED");
            return;
        } else
        {
            aa.setImageResource(0x7f070024);
            ad.setChecked(false);
            ab.setText(0x7f090019);
            cv.e(new View[] {
                ac
            });
            com.kik.m.d.a(ab, "AUTOMATION_ACTIVITY_CONVERSATIONS_MUTE_CHAT");
            return;
        }
    }

    static void a(KikChatInfoFragment kikchatinfofragment, Bundle bundle)
    {
        if (bundle != null)
        {
            kikchatinfofragment.b(KikApplication.f(0x7f090148), false);
            android.os.Parcelable aparcelable[] = bundle.getParcelableArray("KikPickUsersFragment.RESULT_SELECTED_USERS");
            bundle = new ArrayList(aparcelable.length);
            int j1 = aparcelable.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = ((UserDataParcelable)aparcelable[i1]).a;
                bundle.add(kikchatinfofragment.s.b(s1));
            }

            n n1 = (n)kikchatinfofragment.D;
            kikchatinfofragment.n.a(n1, bundle).a(new gk(kikchatinfofragment));
        }
    }

    static void a(KikChatInfoFragment kikchatinfofragment, k k1, f f1)
    {
        if (k1 != null)
        {
            KikDialogFragment.a a1 = new KikDialogFragment.a(kikchatinfofragment.f.getResources());
            Object obj;
            if (k1 instanceof n)
            {
                obj = cq.a((n)k1, kikchatinfofragment.s);
            } else
            {
                obj = cq.a(k1);
            }
            a1.a(KikApplication.a(0x7f09016a, new Object[] {
                obj
            }));
            obj = new ArrayList();
            ((ArrayList) (obj)).add(KikApplication.f(0x7f090167));
            ((ArrayList) (obj)).add(KikApplication.f(0x7f090168));
            ((ArrayList) (obj)).add(KikApplication.f(0x7f090166));
            a1.a((CharSequence[])((ArrayList) (obj)).toArray(new CharSequence[((ArrayList) (obj)).size()]), new hj(kikchatinfofragment, k1, f1));
            kikchatinfofragment.a(a1.a, KikScopedDialogFragment.a.b, "dialog");
        }
    }

    static boolean a(KikChatInfoFragment kikchatinfofragment, boolean flag)
    {
        kikchatinfofragment.W = flag;
        return flag;
    }

    static k b(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.O;
    }

    static void b(KikChatInfoFragment kikchatinfofragment, k k1)
    {
        kikchatinfofragment.a(k1);
    }

    static void b(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        kikchatinfofragment.ah.sendEmptyMessage(2);
        kikchatinfofragment.ah.post(new he(kikchatinfofragment, progressdialogfragment));
    }

    static k c(KikChatInfoFragment kikchatinfofragment, k k1)
    {
        kikchatinfofragment.D = k1;
        return k1;
    }

    static ProgressDialogFragment c(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.K;
    }

    static void c(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        kikchatinfofragment.ah.sendEmptyMessage(2);
        kikchatinfofragment.ah.post(new hd(kikchatinfofragment, progressdialogfragment));
    }

    private void c(boolean flag)
    {
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        KikDialogFragment.a a1 = new KikDialogFragment.a(f.getResources());
        int i1;
        if (flag)
        {
            i1 = 0x7f090294;
        } else
        {
            i1 = 0x7f0902fa;
        }
        a1 = a1.a(KikApplication.a(i1, new Object[] {
            cq.a(O)
        }));
        if (flag)
        {
            i1 = 0x7f090032;
        } else
        {
            i1 = 0x7f090036;
        }
        a1 = a1.b(KikApplication.a(i1, new Object[] {
            cq.a(O)
        })).b(true);
        if (flag)
        {
            i1 = 0x7f090293;
        } else
        {
            i1 = 0x7f0902f9;
        }
        a(a1.a(i1, new hn(this, progressdialogfragment, flag)).b(0x7f090299, null).a, KikScopedDialogFragment.a.b, "build");
    }

    static void d(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.f();
    }

    static int e(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.L = 5;
        return 5;
    }

    private void f()
    {
        if (isVisible())
        {
            ah.postAtFrontOfQueue(new hz(this));
        }
    }

    static boolean f(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.H = true;
        return true;
    }

    static Handler g(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.ah;
    }

    private void g()
    {
        if (I)
        {
            kik.android.chat.activity.k.a(new MissedConversationsFragment.a(), getActivity()).a().f();
            return;
        } else
        {
            kik.android.chat.activity.k.a(new KikConversationsFragment.a(), getActivity()).a().f();
            return;
        }
    }

    private boolean h()
    {
        return D.e().equals(M.c);
    }

    static boolean h(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.h();
    }

    static f i(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.N;
    }

    private void i()
    {
        if (D.t())
        {
            Y = cq.c(D.r());
        }
        kik.android.util.p.a a1 = new kik.android.util.p.a(D.b(), y, z, t, x);
        a1.a(new d[] {
            this
        });
        if (U != null && U.isVisible())
        {
            U.dismiss();
        }
        U = new ProgressDialogFragment(getString(0x7f090207), true);
        U.a(new hk(this, a1));
        a(U);
    }

    private void j()
    {
        cv.b(new View[] {
            _notInGroupTextView
        });
        cv.e(new View[] {
            _profilePicBig, d, m, _verifiedStar, _profilePicBig, e, f, g, i, j, 
            k
        });
    }

    static void j(KikChatInfoFragment kikchatinfofragment)
    {
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        progressdialogfragment.setCancelable(false);
        progressdialogfragment.e();
        p p1 = kikchatinfofragment.s.b(kikchatinfofragment.D.a());
        if (!p1.g())
        {
            kikchatinfofragment.a(progressdialogfragment);
        }
        p1.a(com.kik.sdkutils.d.a(kikchatinfofragment.getView(), new hf(kikchatinfofragment, progressdialogfragment)));
    }

    private void k()
    {
        cv.e(new View[] {
            _notInGroupTextView
        });
        cv.b(new View[] {
            _profilePicBig, d, _profilePicBig, e, f, g, i, j
        });
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (h() && !D.l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = D.m();
        if (D.t() && ((n)D).B())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag && !flag2 && !flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            cv.e(new View[] {
                m
            });
            return;
        } else
        {
            cv.b(new View[] {
                m
            });
            return;
        }
    }

    static void k(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.j();
    }

    static void l(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.k();
    }

    static void m(KikChatInfoFragment kikchatinfofragment)
    {
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        progressdialogfragment.setCancelable(false);
        progressdialogfragment.e();
        kikchatinfofragment.a(progressdialogfragment);
        kikchatinfofragment.n.a(kikchatinfofragment.O.b(), kikchatinfofragment.D.b(), new gn(kikchatinfofragment, progressdialogfragment));
    }

    static void n(KikChatInfoFragment kikchatinfofragment)
    {
        ProgressDialogFragment progressdialogfragment;
        progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        progressdialogfragment.setCancelable(false);
        progressdialogfragment.e();
        if (kikchatinfofragment.D.l() || !kikchatinfofragment.D.i() || !kikchatinfofragment.q.a(kikchatinfofragment.D)) goto _L2; else goto _L1
_L1:
        kik.android.util.ck.b ab1[];
        int i1;
        int j1;
        ab1 = kik.android.util.ck.b.values();
        j1 = ab1.length;
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        kik.android.util.ck.b b1 = ab1[i1];
        if (!kikchatinfofragment.q.a(kikchatinfofragment.D, b1)) goto _L5; else goto _L4
_L4:
        kikchatinfofragment.o.b(b1.e).a("Bots", new String[] {
            kikchatinfofragment.D.e()
        }).b();
_L2:
        if (!kikchatinfofragment.D.l())
        {
            Object obj;
            if (kikchatinfofragment.af.a().equals("explicit-username-search") || kikchatinfofragment.af.a().equals("inline-username-search"))
            {
                obj = kik.a.d.s.a(kikchatinfofragment.D.b(), kikchatinfofragment.D.b(), String.valueOf(kik.a.f.l.a()), kik.a.h.j.b(), null);
                kik.a.d.a.d d1 = new kik.a.d.a.d(kikchatinfofragment.af.a(), kikchatinfofragment.D.a().b(), false, String.format(kikchatinfofragment.getString(0x7f090373), new Object[] {
                    cq.a(kikchatinfofragment.D)
                }), kik.a.h.j.b());
                ((s) (obj)).a(d1);
                kikchatinfofragment.r.c(((s) (obj)));
                kikchatinfofragment.s.a(kikchatinfofragment.D);
                obj = kikchatinfofragment.s.a(d1);
            } else
            {
                obj = kikchatinfofragment.s.a(kikchatinfofragment.D.a());
            }
            if (((p) (obj)).g())
            {
                kikchatinfofragment.a(progressdialogfragment);
            }
            ((p) (obj)).a(new hc(kikchatinfofragment, progressdialogfragment));
        }
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void o(KikChatInfoFragment kikchatinfofragment)
    {
        if (kikchatinfofragment.E)
        {
            Bundle bundle = new Bundle();
            bundle.putString("chatContactJID", kikchatinfofragment.D.b());
            bundle.putString("sessionId", kikchatinfofragment.ae);
            kikchatinfofragment.a(bundle);
            kikchatinfofragment.J();
            return;
        } else
        {
            KikChatFragment.a a1 = new KikChatFragment.a();
            a1.a(kikchatinfofragment.D).a(true).c(kikchatinfofragment.ae).a(kikchatinfofragment.af.h());
            kik.android.chat.activity.k.a(a1, kikchatinfofragment.getActivity()).f();
            return;
        }
    }

    static a p(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.af;
    }

    static String q(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.ae;
    }

    static void r(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.s.d(kikchatinfofragment.D.a()).a(new hg(kikchatinfofragment));
    }

    static CheckBox s(KikChatInfoFragment kikchatinfofragment)
    {
        return kikchatinfofragment.ad;
    }

    static void t(KikChatInfoFragment kikchatinfofragment)
    {
        FragmentActivity fragmentactivity = kikchatinfofragment.getActivity();
        kik.android.util.p.a().a(kikchatinfofragment, fragmentactivity);
    }

    static void u(KikChatInfoFragment kikchatinfofragment)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(kikchatinfofragment.f.getResources());
        a1.a(0x7f0902ad);
        a1.b(0x7f090033);
        a1.b(true);
        a1.a(0x7f0902a9, new hi(kikchatinfofragment));
        a1.b(0x7f090299, null);
        kikchatinfofragment.a(a1.a, KikScopedDialogFragment.a.b, "dialog");
    }

    static void v(KikChatInfoFragment kikchatinfofragment)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(kikchatinfofragment.f.getResources());
        a1.a(0x7f0902cd);
        a1.b(0x7f090034);
        a1.b(true);
        a1.a(0x7f0902cc, new hh(kikchatinfofragment));
        a1.b(0x7f090299, null);
        kikchatinfofragment.a(a1.a, KikScopedDialogFragment.a.b, "dialog");
    }

    static void w(KikChatInfoFragment kikchatinfofragment)
    {
        ScanCodeTabFragment.a a1 = new ScanCodeTabFragment.a();
        a1.a(true).a(kikchatinfofragment.D.a().a()).a(kik.android.chat.fragment.ScanCodeTabFragment.c.d);
        kik.android.chat.activity.k.a(a1, kikchatinfofragment.getActivity()).f();
    }

    static void x(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.g();
    }

    static void y(KikChatInfoFragment kikchatinfofragment)
    {
        if (kikchatinfofragment.D.t())
        {
            n n1 = (n)kikchatinfofragment.D;
            kikchatinfofragment.b(KikApplication.f(0x7f09036a), false);
            kikchatinfofragment.n.a(n1).a(new hb(kikchatinfofragment));
        }
    }

    static void z(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment.i();
    }

    protected final android.view.View.OnClickListener a()
    {
        return new hq(this);
    }

    public final void a(Bitmap bitmap)
    {
        if (U != null && V)
        {
            U.dismiss();
        }
        if (D instanceof n)
        {
            x.a(kik.android.util.e.a(bitmap), (n)D);
            f();
        }
        s.j();
        o.b("Group Photo Changed").a("Was Empty", Y).a("From Camera", X).a("Width", bitmap.getWidth()).b();
    }

    protected final void a(com.kik.g.f f1)
    {
        f1.a(r.b(), aj);
        f1.a(s.c(), ai);
        f1.a(n.e(), ai);
        f1.a(r.c(), ak);
        f1.a(r.d(), al);
    }

    protected final void b()
    {
        if (D == null)
        {
            return;
        }
        e.removeAllViews();
        int i1 = kik.android.chat.fragment.a.a(af);
        boolean flag;
        if (af.h() == com.kik.ui.fragment.FragmentBase.a.a.c && i1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b(false);
            return;
        }
        if (!D.m()) goto _L2; else goto _L1
_L1:
        Object obj = KikApplication.f(0x7f090319);
        gr gr1 = new gr(this);
        obj = a(((String) (obj)), c.a(0x7f020022, 0x7f020023), gr1);
        com.kik.m.d.a(((View) (obj)), "AUTOMATION_UNBLOCK");
        c(((View) (obj)));
        cv.e(new View[] {
            m
        });
_L4:
        b(false);
        return;
_L2:
        if (L == 2 || L == 5 && H)
        {
            c(a(KikApplication.a(0x7f0901d3, new Object[] {
                cq.a(D)
            }), "Chat Info Send To Tapped", "AUTOMATION_SEND_TO"));
            continue; /* Loop/switch isn't completed */
        }
        if (L == 5)
        {
            if (!G)
            {
                View view = a(KikApplication.a(0x7f090227, new Object[] {
                    cq.a(D)
                }), c.a(0x7f020256, 0x7f020257), new gq(this));
                com.kik.m.d.a(view, (new StringBuilder("AUTOMATION_SELECT_")).append(cq.a(D).toUpperCase()).toString());
                c(view);
            } else
            {
                View view1 = a(KikApplication.a(0x7f0901d2, new Object[] {
                    cq.a(D)
                }), ((android.graphics.drawable.Drawable) (null)), ((android.view.View.OnClickListener) (null)));
                cv.e(new View[] {
                    (ImageView)view1.findViewById(0x7f0e00c3)
                });
                com.kik.m.d.a(view1, (new StringBuilder("AUTOMATION_CANNOT_SELECT_")).append(cq.a(D).toUpperCase()).toString());
                c(view1);
            }
            continue; /* Loop/switch isn't completed */
        }
        String s1 = M.c;
        Iterator iterator;
        boolean flag1;
        boolean flag2;
        if (J != null && J.equals(D.b()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        iterator = r.A().iterator();
        do
        {
            flag2 = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((f)iterator.next()).b().equals(D.b()))
            {
                continue;
            }
            flag2 = true;
            break;
        } while (true);
        if (D.t())
        {
            View view4 = a(KikApplication.f(0x7f090247), c.a(0x7f0201b1, 0x7f0201b2), new ha(this));
            com.kik.m.d.a(view4, "AUTOMATION_SHOW_KIK_CODE");
            c(view4);
        }
        if (D.t() && D.l() && ((n)D).A())
        {
            View view5 = a(KikApplication.f(0x7f090116), c.a(0x7f020137, 0x7f020138), new gt(this));
            com.kik.m.d.a(view5, "AUTOMATION_CHANGE_GROUP_NAME");
            c(view5);
            view5 = a(KikApplication.f(0x7f090117), c.a(0x7f02025f, 0x7f020260), new gu(this));
            com.kik.m.d.a(view5, "AUTOMATION_CHANGE_GROUP_PHOTO");
            c(view5);
        }
        if (D.l() && !D.b().equals(J))
        {
            c(a(KikApplication.f(0x7f09019c), "Chat Info Open Chat Tapped", "AUTOMATION_OPEN_CHAT"));
        }
        if (D.l() || D.t())
        {
            Object obj1 = a;
            k k2 = D;
            obj1 = ((LayoutInflater) (obj1)).inflate(0x7f030082, null, false);
            aa = (ImageView)((View) (obj1)).findViewById(0x7f0e0194);
            ab = (TextView)((View) (obj1)).findViewById(0x7f0e0195);
            ac = (TextView)((View) (obj1)).findViewById(0x7f0e0196);
            ad = (CheckBox)((View) (obj1)).findViewById(0x7f0e0197);
            com.kik.m.d.a(ad, "AUTOMATION_TOGGLE_MUTE");
            ((View) (obj1)).findViewById(0x7f0e0193).setOnClickListener(new gs(this, k2));
            c(((View) (obj1)));
            a(D);
        }
        if (!D.t() && s.c("popbottest_ns2@talk.kik.com"))
        {
            k k3 = D;
            c(a("View Wall", c.a(0x7f0202f2, 0x7f0202f3), new gw(this, k3)));
        }
        if (!D.t() && D.l() && !F && !D.e().equals(s1))
        {
            k k1 = D;
            View view6 = a(KikApplication.a(0x7f090270, new Object[] {
                cq.a(k1)
            }), c.a(0x7f020061, 0x7f020063), new gx(this));
            com.kik.m.d.a(view6, (new StringBuilder("AUTOMATION_START_A_GROUP_WITH_")).append(cq.a(k1).toUpperCase()).toString());
            c(view6);
        }
        if (!D.t() && D.l() && flag2)
        {
            View view2 = a(KikApplication.f(0x7f0902ad), c.a(0x7f0200b4, 0x7f0200b6), new gy(this));
            com.kik.m.d.a(view2, "AUTOMATION_DELETE_CHAT");
            c(view2);
        }
        if (D.t())
        {
            View view3 = a(KikApplication.f(0x7f09014b), c.a(0x7f0201bc, 0x7f0201bd), new gz(this));
            com.kik.m.d.a(view3, "AUTOMATION_LEAVE_GROUP");
            c(view3);
        }
        if (!D.l() && !D.t())
        {
            c(a(KikApplication.f(0x7f0900f6), "Chat Info Start Chatting Tapped", "AUTOMATION_START_CHATTING"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void b(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        if (D.t())
        {
            obj = (n)D;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            String s1;
            for (obj = ((n) (obj)).w().iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(s.a(s1, true)))
            {
                s1 = (String)((Iterator) (obj)).next();
            }

        }
        boolean flag1 = D.t();
        Z.a(flag, D, arraylist, flag1, f, ag, o);
    }

    protected final void c()
    {
        if (D == null)
        {
            return;
        }
        Object obj = D;
        if (d != null && _profilePicBig != null && D != null)
        {
            SoftwareContactImageView softwarecontactimageview;
            com.kik.cache.ad ad1;
            boolean flag;
            if (D.t() && cq.c(D.r()))
            {
                _profilePicBig.b(null);
                _profilePicBig.setBackgroundColor(_profilePicBig.getResources().getColor(0x7f0c0011));
            } else
            {
                _profilePicBig.a(((k) (obj)), p, true, 1, true, true, false, s, o);
            }
            softwarecontactimageview = d;
            ad1 = p;
            if (D.t() && cq.c(D.r()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            softwarecontactimageview.a(((k) (obj)), ad1, false, true, flag, s, o);
        }
        obj = D;
        if (obj != null && ((k) (obj)).i())
        {
            cv.b(new View[] {
                _verifiedStar
            });
        } else
        {
            cv.e(new View[] {
                _verifiedStar
            });
        }
        if (D.t())
        {
            obj = (n)D;
            int j1 = ((n) (obj)).E() + 1;
            int i1;
            if (j1 > 50)
            {
                i1 = j1;
            } else
            {
                i1 = 50;
            }
            if (j1 == 1)
            {
                k.setText(KikApplication.a(0x7f090194, new Object[] {
                    Integer.valueOf(50)
                }));
            } else
            {
                k.setText(KikApplication.a(0x7f09011e, new Object[] {
                    Integer.valueOf(j1), Integer.valueOf(i1)
                }));
            }
            cv.b(new View[] {
                k
            });
            j.setText("");
            obj = cq.a(((n) (obj)), s);
        } else
        {
            cv.e(new View[] {
                k
            });
            String s1 = D.c();
            obj = s1;
            if (cq.c(s1))
            {
                obj = KikApplication.f(0x7f090202);
            }
            String s2 = D.e();
            s1 = s2;
            if (cq.c(s2))
            {
                s1 = KikApplication.f(0x7f090202);
            }
            cv.b(new View[] {
                j
            });
            j.setText(s1);
            j.setContentDescription((new StringBuilder("AUTOMATION_PROFILE_PHOTO_USERNAME_")).append(s1.toUpperCase()).toString());
        }
        i.setText(((CharSequence) (obj)));
        i.setContentDescription((new StringBuilder("AUTOMATION_PROFILE_PHOTO_DISPLAY_NAME_")).append(((String) (obj)).toUpperCase()).toString());
    }

    public final void d()
    {
        KikPickUsersFragment.a a1 = new KikPickUsersFragment.a();
        int i1;
        if (D.t())
        {
            n n1 = (n)D;
            ArrayList arraylist1 = new ArrayList(n1.E() + n1.D());
            String s1;
            for (Iterator iterator = n1.w().iterator(); iterator.hasNext(); arraylist1.add(s.a(s1, true).e()))
            {
                s1 = (String)iterator.next();
            }

            String s2;
            for (Iterator iterator1 = n1.y().iterator(); iterator1.hasNext(); arraylist1.add(s.a(s2, true).e()))
            {
                s2 = (String)iterator1.next();
            }

            a1.b(arraylist1);
            i1 = n1.E() + 1;
        } else
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(D.e());
            a1.a(arraylist).b(2);
            i1 = 1;
        }
        a1.c(50 - i1);
        a(a1).a(new gj(this));
    }

    public final void k_()
    {
        if (U != null && V)
        {
            U.dismiss();
        }
        if (kik.android.util.p.a().c())
        {
            a((new KikDialogFragment.a(f.getResources())).a(cq.a()).b(0x7f0901d0).b(true).a(0x7f090300, new hm(this)).b(0x7f090299, new hl(this)).a, KikScopedDialogFragment.a.b, "build");
        }
        o.b("Group Photo Change Error").b();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if ((i1 == 10334 || i1 == 10335) && j1 == -1)
        {
            boolean flag;
            if (i1 == 10334)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            X = flag;
            if (!kik.android.util.p.a().a(this, getActivity(), i1, intent, z))
            {
                kik.android.util.p.a();
                d(-4);
            }
            return;
        }
        if (i1 != 10336 || j1 != -1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        i();
        kik.android.util.p.a().g();
        return;
        intent;
        kik.android.util.p.a().g();
        throw intent;
        kik.android.util.p.a().g();
        return;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            k k1 = O;
            menuitem = k1;
            if (k1 == null)
            {
                menuitem = k1;
                if (W)
                {
                    menuitem = kik.a.z.b(x).a().a();
                    menuitem = s.a(menuitem, true);
                }
            }
            a((new a()).a(menuitem));
            return false;

        case 1: // '\001'
            menuitem = new KikDialogFragment.a(b.getResources());
            String s1 = cq.a(O);
            menuitem.a(KikApplication.a(0x7f0902f5, new Object[] {
                s1
            }));
            menuitem.b(KikApplication.a(0x7f090035, new Object[] {
                s1
            }));
            menuitem.a(0x7f0902f4, new gl(this));
            menuitem.b(0x7f090299, null);
            a(((KikDialogFragment.a) (menuitem)).a);
            return true;

        case 2: // '\002'
            c(false);
            return true;

        case 3: // '\003'
            c(true);
            return true;
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        af.a(getArguments());
        o.b("Chat Info Shown").b();
        getActivity().setResult(0);
        getActivity().getWindow().setSoftInputMode(3);
        M = t.d();
        String s1 = null;
        if (bundle != null)
        {
            s1 = bundle.getString("kik.prof.extra.jid");
        }
        bundle = s1;
        if (getArguments() != null)
        {
            bundle = s1;
            if (s1 == null)
            {
                bundle = getArguments().getString("kik.prof.extra.jid");
            }
            ae = getArguments().getString("sessionId");
            L = getArguments().getInt("kik.prof.extra.actiontype", 1);
            E = getArguments().getBoolean("kik.prof.extra.finishpromise", false);
            J = getArguments().getString("fromConversationId");
            F = getArguments().getBoolean("groupExtraRestrictAdd", false);
            G = getArguments().getBoolean("isFiltered", false);
            I = getArguments().getBoolean("returnToMissedConvos", false);
            H = getArguments().getBoolean("showSelectAsSendTo", false);
        }
        Z = new ap(getActivity(), p, t, s);
        if (bundle != null)
        {
            D = s.a(bundle, true);
            N = r.f(bundle);
            if (D.t() && r.a(N) == 4)
            {
                g();
            }
            return;
        } else
        {
            throw new IllegalArgumentException("KikProfileActivity: No jid provided");
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = "";
        boolean flag;
        if (O != null)
        {
            view = cq.a(O);
        } else
        if (W)
        {
            view = M.d;
        }
        contextmenu.setHeaderTitle(view);
        contextmenu.add(0, 0, 0, 0x7f09035f);
        if (D.t() && ((n)D).A())
        {
            if (!W && !((n)D).d(O))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            contextmenu.add(0, 1, 0, 0x7f0901d7);
            contextmenu.add(0, 2, 0, 0x7f0901f9);
            contextmenu.add(0, 3, 0, 0x7f09004c);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (D.t() && ((n)D).B())
        {
            j();
        } else
        {
            k();
        }
        com.kik.m.d.a(_notInGroupTextView, "AUTOMATION_YOU_ARE_NOT_A_MEMBER_LABEL");
        return b;
    }

    public void onPause()
    {
        V = false;
        super.onPause();
    }

    protected void onPictureClick()
    {
        if (D != null && D.r() != null && !D.m())
        {
            ViewPictureFragment.a a1 = new ViewPictureFragment.a();
            a1.a(D.b()).c(D.r()).d();
            kik.android.chat.activity.k.a(a1, getActivity()).f();
        }
    }

    public void onResume()
    {
        super.onResume();
        V = true;
        f();
    }

    public final boolean v()
    {
        if (L == 6)
        {
            kik.android.chat.activity.k.a(new KikConversationsFragment.a(), getActivity()).a().f();
            return true;
        } else
        {
            return super.v();
        }
    }

}
