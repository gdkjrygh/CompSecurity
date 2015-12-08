// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.kik.cache.z;
import com.kik.cards.web.bf;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.cards.web.picker.PickerRequest;
import com.kik.g.p;
import com.kik.h.a;
import com.kik.h.b;
import com.kik.l.ab;
import com.kik.m.d;
import com.kik.m.m;
import com.kik.sdkutils.y;
import com.kik.ui.fragment.FragmentBase;
import com.kik.view.adapters.MediaTrayTabAdapter;
import com.kik.view.adapters.au;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;
import kik.a.d.a.g;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.h;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.h.j;
import kik.android.HeadphoneUnpluggedReceiver;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.ak;
import kik.android.chat.am;
import kik.android.e.f;
import kik.android.gifs.view.EmojiLruCache;
import kik.android.net.a.e;
import kik.android.util.ac;
import kik.android.util.ad;
import kik.android.util.ae;
import kik.android.util.ar;
import kik.android.util.av;
import kik.android.util.bj;
import kik.android.util.bo;
import kik.android.util.bu;
import kik.android.util.by;
import kik.android.util.ck;
import kik.android.util.cq;
import kik.android.util.ct;
import kik.android.util.cu;
import kik.android.util.cv;
import kik.android.util.t;
import kik.android.util.u;
import kik.android.widget.BugmeBarView;
import kik.android.widget.ContentLinkView;
import kik.android.widget.DarkFrameLayout;
import kik.android.widget.DarkLinearLayout;
import kik.android.widget.GalleryWidget;
import kik.android.widget.GifWidget;
import kik.android.widget.ImeAwareEditText;
import kik.android.widget.PagerIconTabs;
import kik.android.widget.ResizeEventList;
import kik.android.widget.RobotoTextView;
import kik.android.widget.TabIconImageView;
import kik.android.widget.TalkToCoverView;
import kik.android.widget.WebTrayWidget;
import kik.android.widget.bn;
import kik.android.widget.dl;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, bw, ci, dn, 
//            ea, em, fb, fn, 
//            gb, bx, by, bz, 
//            ca, cc, cd, ce, 
//            cf, cg, ch, cl, 
//            cm, cn, co, dy, 
//            eh, et, eu, ev, 
//            ew, ds, ej, cp, 
//            fe, ProgressDialogFragment, dt, du, 
//            dj, ft, fu, fv, 
//            ef, eg, fk, ez, 
//            fw, fx, fm, fq, 
//            rl, ex, fa, ff, 
//            fg, ey, cw, fr, 
//            do, dm, dp, KikDialogFragment, 
//            dq, dr, fs, ee, 
//            dz, eb, ec, dx, 
//            ei, fc, fd, gc, 
//            gd, ek, ge, ga, 
//            fz, el, eq, en, 
//            cq, cr, ct, cu, 
//            CameraFragment, dk, dl, cv, 
//            da, db, dd, de, 
//            df, dg, fj, fh, 
//            fi, SendToFragment

public class KikChatFragment extends KikScopedDialogFragment
    implements com.kik.h.a, com.kik.view.adapters.au.b, kik.android.e.f, kik.android.sdkutils.a, cu, kik.android.widget.ImeAwareEditText.a, kik.android.widget.ImeAwareEditText.b
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        static String a(a a1)
        {
            return a1.g("chatGroupJID");
        }

        static String b(a a1)
        {
            return a1.g("chatContactJID");
        }

        static boolean c(a a1)
        {
            return a1.f("showKeyBoard").booleanValue();
        }

        static boolean d(a a1)
        {
            return a1.f("kikchatPluginOpenedDirectly").booleanValue();
        }

        static String e(a a1)
        {
            return a1.g("sessionId");
        }

        static String f(a a1)
        {
            return a1.g("campaignId");
        }

        static boolean g(a a1)
        {
            return a1.f("returnToMissedConvos").booleanValue();
        }

        static boolean h(a a1)
        {
            return a1.b("kik.chat.close.on.block", true).booleanValue();
        }

        static int i(a a1)
        {
            return a1.b("KikChatFragment.CardIndex", -1);
        }

        public final a a()
        {
            a("returnToMissedConvos", true);
            return this;
        }

        public final a a(String s1)
        {
            if (s1 != null)
            {
                a("chatContactJID", s1);
            }
            return this;
        }

        public final a a(kik.a.d.f f1, l l1)
        {
            if (l1 == null || f1 == null)
            {
                return this;
            }
            if (l1.a(f1.b(), false) != null)
            {
                a("chatGroupJID", f1.b());
                return this;
            } else
            {
                a("chatContactJID", f1.b());
                return this;
            }
        }

        public final a a(k k1)
        {
            if (k1 != null)
            {
                a("chatContactJID", k1.b());
            }
            return this;
        }

        public final a a(boolean flag)
        {
            a("showKeyBoard", flag);
            return this;
        }

        public final a b(String s1)
        {
            a("campaignId", s1);
            return this;
        }

        public final a b(boolean flag)
        {
            a("kikchatPluginOpenedDirectly", flag);
            return this;
        }

        public final boolean b()
        {
            return b("skipTalkToCover", false).booleanValue();
        }

        public final a c(String s1)
        {
            a("sessionId", s1);
            return this;
        }

        public final a c(boolean flag)
        {
            a("skipTalkToCover", flag);
            return this;
        }

        public final a d(boolean flag)
        {
            a("kik.chat.close.on.block", flag);
            return this;
        }

        public a()
        {
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b f[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(kik/android/chat/fragment/KikChatFragment$b, s1);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        static 
        {
            a = new b("Closed", 0);
            b = new b("Open", 1);
            c = new b("Advanced", 2);
            d = new b("Simple", 3);
            e = new b("ClosedContent", 4);
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static final class c extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }

    public final class d
    {

        final KikChatFragment a;

        public final void a()
        {
            if (!kik.android.chat.fragment.KikChatFragment.a(a))
            {
                kik.android.chat.fragment.KikChatFragment.a(a, true, true);
            }
        }

        public final void a(bn bn1)
        {
            kik.android.chat.fragment.KikChatFragment.a(a, bn1);
        }

        public final void b()
        {
            if (!kik.android.chat.fragment.KikChatFragment.b(a))
            {
                kik.android.chat.fragment.KikChatFragment.a(a, true);
            }
        }

        public final boolean c()
        {
            return kik.android.chat.fragment.KikChatFragment.b(a);
        }

        public d()
        {
            a = KikChatFragment.this;
            super();
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;
        public static final e g;
        public static final e h;
        private static final e i[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(kik/android/chat/fragment/KikChatFragment$e, s1);
        }

        public static e[] values()
        {
            return (e[])i.clone();
        }

        static 
        {
            a = new e("HIDDEN", 0);
            b = new e("SIMPLE", 1);
            c = new e("ADVANCED", 2);
            d = new e("ENTERING_SIMPLE", 3);
            e = new e("ENTERING_ADVANCED", 4);
            f = new e("BEGAN_SCROLLING", 5);
            g = new e("FINISHED_SCROLLING", 6);
            h = new e("CHANGING_ORIENTATION", 7);
            i = (new e[] {
                a, b, c, d, e, f, g, h
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static interface f
    {

        public abstract void a();
    }


    private static final int B = KikApplication.a(20);
    private static boolean J = false;
    private static String K = null;
    private static int L = -1;
    private static Spannable M;
    private static s N;
    private static boolean O;
    private static UUID P;
    private static k Q;
    private static final org.c.b z = org.c.c.a("KikChatFragment");
    private final a A = new a();
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private f I;
    private final UUID R = UUID.randomUUID();
    private String S;
    private final ArrayList U = new ArrayList(25);
    private final ArrayList V = new ArrayList();
    private final ArrayList W = new ArrayList();
    private final android.view.View.OnClickListener X = new bw(this);
    private final kik.android.util.bw.a Y = new ci(this);
    private final android.view.View.OnClickListener Z = new dn(this);
    protected RelativeLayout _contentAttachFrame;
    protected DarkFrameLayout _contentButton;
    protected View _contentButtonSpacer;
    protected FrameLayout _contentFrame;
    protected ViewPager _mediaItemArea;
    protected ViewGroup _mediaLayout;
    protected TabIconImageView _mediaModeButton;
    protected FrameLayout _mediaShadow;
    protected DarkLinearLayout _mediaTrayContainer;
    protected Button _newMessagesButton;
    protected Button _scrollToLastReadButton;
    protected RecyclerView _suggestedRecyclerView;
    protected ViewGroup _textLayout;
    protected View _topBar;
    protected com.kik.cache.ad a;
    private kik.android.b.g aA;
    private File aB;
    private ResizeEventList aC;
    private View aD;
    private Context aE;
    private int aF;
    private int aG;
    private int aH;
    private boolean aI;
    private String aJ;
    private s aK;
    private boolean aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private boolean aQ;
    private boolean aR;
    private int aS;
    private MediaTrayTabAdapter aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private boolean aX;
    private int aY;
    private int aZ;
    private final com.kik.g.i aa = new ea(this);
    private final Handler ab = new em(this);
    private final Vector ac = new Vector();
    private dl ad;
    private android.view.View.OnClickListener ae;
    private b af;
    private au ag;
    private k ah;
    private kik.a.d.f ai;
    private ad aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private ImeAwareEditText aq;
    private LinearLayout ar;
    private View as;
    private View at;
    private RobotoTextView au;
    private BugmeBarView av;
    private ContentLinkView aw;
    private SendToFragment ax;
    private kik.a.d.a.a ay;
    private List az;
    protected com.kik.cache.ad b;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener bA;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener bB;
    private android.support.v4.view.ViewPager.OnPageChangeListener bC;
    private android.view.View.OnClickListener bD;
    private Runnable bE;
    private am bF;
    private android.widget.AbsListView.OnScrollListener bG;
    private android.view.View.OnClickListener bH;
    private android.view.View.OnClickListener bI;
    private bn ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private boolean bf;
    private FrameLayout bg;
    private kik.android.f.a.f bh;
    private volatile boolean bi;
    private int bj;
    private boolean bk;
    private boolean bl;
    private android.view.View.OnClickListener bm;
    private boolean bn;
    private com.kik.g.i bo;
    private com.kik.g.i bp;
    private com.kik.g.i bq;
    private com.kik.g.i br;
    private com.kik.g.i bs;
    private com.kik.g.i bt;
    private com.kik.g.i bu;
    private com.kik.g.i bv;
    private com.kik.g.i bw;
    private com.kik.g.i bx;
    private com.kik.g.i by;
    private com.kik.g.i bz;
    protected com.kik.cache.ad c;
    protected TabIconImageView contentButtonImage;
    protected v d;
    protected l e;
    protected ck f;
    protected com.kik.android.a g;
    protected kik.a.e.n h;
    protected kik.a.f.k i;
    protected r j;
    protected i k;
    protected kik.a.e.f l;
    protected w m;
    protected ab n;
    protected ar o;
    protected kik.a.e.t p;
    protected com.kik.android.c.f q;
    protected kik.android.chat.b.d r;
    protected FrameLayout rootLayout;
    protected kik.android.chat.a.a s;
    protected View sendButton;
    protected bj t;
    protected PagerIconTabs tabs;
    protected TalkToCoverView talkToCover;
    protected ViewGroup tray;
    protected kik.a.c.c x;
    boolean y;

    public KikChatFragment()
    {
        C = false;
        D = false;
        E = false;
        F = 0;
        G = false;
        H = true;
        ae = new fb(this);
        af = null;
        ak = false;
        al = false;
        am = false;
        an = false;
        ao = false;
        ap = false;
        aG = 0;
        aH = kik.android.chat.fragment.c.a;
        aK = null;
        aL = false;
        aM = -1;
        aN = -1;
        aO = -1;
        aP = 0;
        aQ = false;
        aR = false;
        aU = false;
        aV = false;
        aW = false;
        aX = false;
        aY = 0;
        aZ = 0;
        ba = bn.a;
        bb = KikApplication.a(260);
        bc = KikApplication.a(260);
        bd = KikApplication.a(12);
        be = 0;
        bf = false;
        bi = false;
        bj = 0;
        bk = false;
        bl = false;
        bm = new fn(this);
        bn = false;
        bo = new gb(this);
        bp = new bx(this);
        bq = new kik.android.chat.fragment.by(this);
        br = new bz(this);
        bs = new ca(this);
        bt = new cc(this);
        bu = new cd(this);
        bv = new ce(this);
        bw = new cf(this);
        bx = new cg(this);
        by = new ch(this);
        bz = new cl(this);
        bA = new cm(this);
        bB = new cn(this);
        bC = new co(this);
        bD = new dy(this);
        bE = new eh(this);
        bF = new am(new et(this));
        bG = new eu(this);
        bH = new ev(this);
        bI = new ew(this);
        y = false;
    }

    static void A(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aB();
    }

    static boolean B(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aj();
    }

    static void C(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ar();
    }

    static boolean D(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ap();
    }

    static int E(KikChatFragment kikchatfragment)
    {
        int i1 = kikchatfragment.aP;
        kikchatfragment.aP = i1 + 1;
        return i1;
    }

    static void F(KikChatFragment kikchatfragment)
    {
        kikchatfragment.t();
    }

    static s G(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aK;
    }

    static int H(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.bc;
    }

    static int I(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aF;
    }

    static boolean J(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aU;
    }

    static MediaTrayTabAdapter K(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aT;
    }

    static int L(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aZ;
    }

    static boolean M(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aX;
    }

    static int N(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aY;
    }

    static int O(KikChatFragment kikchatfragment)
    {
        int i1 = kikchatfragment.aY + 1;
        kikchatfragment.aY = i1;
        return i1;
    }

    static boolean P(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.an;
    }

    private void Q()
    {
        boolean flag2;
        flag2 = false;
        break MISSING_BLOCK_LABEL_2;
        for (; af == null; af = kik.android.chat.ak.a(ah))
        {
            do
            {
                return;
            } while (z() || getArguments() == null || af != null || aH());
        }

        if (!x()) goto _L2; else goto _L1
_L1:
        b b1 = af;
        boolean flag;
        if (b1 != null && (kik.android.chat.fragment.b.e.equals(b1) || kik.android.chat.fragment.b.c.equals(b1) || kik.android.chat.fragment.b.d.equals(b1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        af = kik.android.chat.fragment.b.b;
_L5:
        F();
        bk = true;
        return;
_L2:
        boolean flag1 = flag2;
        if (Q == ah)
        {
            flag1 = flag2;
            if (bh.i() != null)
            {
                flag1 = true;
            }
        }
        if (flag1 && !kik.android.chat.fragment.b.a.equals(af))
        {
            af = kik.android.chat.fragment.b.b;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void Q(KikChatFragment kikchatfragment)
    {
        kikchatfragment.af();
    }

    static View R(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.as;
    }

    private void R()
    {
        kik.a.d.a.a a1 = bh.e();
        byte abyte0[] = bh.f();
        if (a1 != null)
        {
            a(a1, abyte0);
            bh.b();
        }
    }

    private void S()
    {
        List list = bh.i();
        if (list != null)
        {
            aq.post(new ds(this, list));
        }
        bh.b(null);
    }

    static void S(KikChatFragment kikchatfragment)
    {
        if (kikchatfragment.ad == null)
        {
            kikchatfragment.ad = new dl(kikchatfragment.aj, kikchatfragment.getActivity(), kikchatfragment.as, kikchatfragment.aD, kikchatfragment.g, kikchatfragment.q);
            kikchatfragment.ad.a(new ej(kikchatfragment));
        }
        if (kikchatfragment.ad.c())
        {
            kikchatfragment.g.b("Smiley Tray Opened").a("Is Smiley Tray Help Visible", kikchatfragment.ad.a()).b();
            kikchatfragment.g.c("Chat Closed", kikchatfragment.ai.b()).a("Smiley Tray Opened", true);
            kikchatfragment.g.c("Chat Session Ended", kikchatfragment.ai.b()).a("Smiley Tray Opened", true);
            kikchatfragment.as.setSelected(true);
        }
    }

    private void T()
    {
        FragmentActivity fragmentactivity;
label0:
        {
            fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                if (!com.kik.sdkutils.y.a(11))
                {
                    break label0;
                }
                fragmentactivity.getWindow().setSoftInputMode(48);
            }
            return;
        }
        fragmentactivity.getWindow().setSoftInputMode(16);
    }

    static boolean T(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ak = false;
        return false;
    }

    static boolean U(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.bi;
    }

    static boolean V(KikChatFragment kikchatfragment)
    {
        kikchatfragment.bi = false;
        return false;
    }

    static boolean W(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ak;
    }

    private boolean X()
    {
        return cv.a(new View[] {
            _mediaItemArea, _mediaLayout, _textLayout
        });
    }

    static boolean X(KikChatFragment kikchatfragment)
    {
        kikchatfragment.al = false;
        return false;
    }

    private void Y()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.getWindow().setSoftInputMode(16);
        }
    }

    static void Y(KikChatFragment kikchatfragment)
    {
        kikchatfragment.g(kik.a.d.s.a.a);
    }

    private void Z()
    {
        if (_mediaItemArea != null)
        {
            Animation animation = _mediaItemArea.getAnimation();
            if (animation != null)
            {
                animation.cancel();
            }
        }
    }

    static boolean Z(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.am;
    }

    static p a(KikChatFragment kikchatfragment, String s1)
    {
        return kikchatfragment.c(s1);
    }

    static String a(kik.a.d.a.a a1)
    {
        return e(a1);
    }

    static k a(KikChatFragment kikchatfragment, k k1)
    {
        kikchatfragment.ah = k1;
        return k1;
    }

    static bn a(KikChatFragment kikchatfragment, bn bn1)
    {
        kikchatfragment.ba = bn1;
        return bn1;
    }

    private void a(int i1)
    {
        int j1 = aY + 1;
        aY = j1;
        ((com.kik.h.b)aT.getItem(i1)).a(new cp(this, j1));
    }

    private void a(int i1, boolean flag)
    {
label0:
        {
            if (aG != i1)
            {
                aG = i1;
                if (getView() != null)
                {
                    break label0;
                }
            }
            return;
        }
        contentButtonImage.clearAnimation();
        if (aG == 1)
        {
            Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f040010);
            if (!flag)
            {
                animation.setDuration(0L);
            }
            contentButtonImage.startAnimation(animation);
            com.kik.m.d.a(_contentButton, "AUTOMATION_MEDIA_BAR_X");
            return;
        }
        Animation animation1 = AnimationUtils.loadAnimation(getActivity(), 0x7f040011);
        if (!flag)
        {
            animation1.setDuration(0L);
        }
        contentButtonImage.startAnimation(animation1);
        com.kik.m.d.a(_contentButton, "AUTOMATION_MEDIA_BAR_PLUS");
    }

    private void a(Editable editable, String s1, int i1)
    {
        aC.setVerticalScrollBarEnabled(false);
        aC.setOverScrollMode(2);
        if (cv.c(_suggestedRecyclerView))
        {
            a(false, ((android.animation.Animator.AnimatorListener) (new fe(this, editable, s1, i1))));
            return;
        } else
        {
            b(editable, s1, i1);
            return;
        }
    }

    private void a(String s1, s s2, kik.a.d.a.a a1)
    {
        s1 = g.b(s1);
        boolean flag;
        if (s2 != null && !s2.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = s1.a("Is Incoming", flag);
        if (a1 != null)
        {
            s1.a("App ID", a1.u()).a("Message Type", kik.android.util.ae.c(a1)).a("Card URL", kik.android.util.ae.d(a1));
        } else
        {
            s1.a("Message Type", "Text");
        }
        s1.b();
    }

    private void a(String s1, boolean flag, String s2)
    {
        com.kik.android.a.f f1 = g.b(s1);
        if (flag)
        {
            s1 = "Media Tray";
        } else
        {
            s1 = "Other";
        }
        f1.a("Source", s1);
        f1.a("Type", s2);
        f1.b();
    }

    private void a(kik.a.d.a.a a1, byte abyte0[])
    {
        kik.a.d.a.a a2;
        Object obj;
        if (!aH())
        {
            a(((View) (aq)));
        } else
        {
            c(aq);
        }
        if (J)
        {
            J = false;
            g.b("Media Tray Card Closed").a("Index", L).a("Is Landscape", aH()).a("Card URL", K).a("Reason", "Attached").b();
        }
        a2 = new kik.a.d.a.a(a1);
        obj = kik.android.net.a.e.a().a(a2.o());
        if (obj != null)
        {
            obj = (kik.android.net.a.c)((WeakReference) (obj)).get();
            if (obj != null)
            {
                ((kik.android.net.a.c) (obj)).a(a2);
            }
        }
        obj = kik.a.d.s.a(ah.b());
        ((s) (obj)).a(bh.f());
        ((s) (obj)).a(a2);
        N = ((s) (obj));
        O = bh.d();
        Q = ah;
        a(((KikDialogFragment) (new ProgressDialogFragment(getActivity().getString(0x7f09036a), true))));
        if (O && bh.b(a2))
        {
            if (a2.g("file-size") != null)
            {
                k.b(((s) (obj))).a(com.kik.sdkutils.d.a(this, new dt(this, a2, ((s) (obj)))));
            }
            return;
        } else
        {
            k.b(((s) (obj))).a(com.kik.sdkutils.d.a(this, new du(this, abyte0, ((s) (obj)), a2, a1)));
            return;
        }
    }

    private void a(s s1, boolean flag)
    {
        kik.a.d.a.a a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
        if (a1 != null)
        {
            Object obj = kik.android.net.a.e.a().a(a1.o());
            if (obj != null)
            {
                obj = (kik.android.net.a.c)((WeakReference) (obj)).get();
                if (obj != null)
                {
                    ((kik.android.net.a.c) (obj)).a(a1);
                }
            }
            obj = g.b("Forward Tapped").a("App ID", a1.u()).a("Message Type", kik.android.util.ae.c(a1)).a("Card URL", kik.android.util.ae.d(a1));
            boolean flag1;
            if (s1 != null && !s1.d())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((com.kik.android.a.f) (obj)).a("Is Incoming", flag1).a("From Context Menu", flag).b();
        }
        s1 = s1.o();
        bh.a(a1, false, s1);
        if (z())
        {
            s1 = new SendToFragment.a();
            s1.a(true).a(A.h());
            kik.android.chat.activity.k.a(s1, getActivity()).f();
            b(aq);
        } else
        {
            b(aq);
            if (ax == null)
            {
                s1 = getActivity();
                if (s1 != null)
                {
                    kik.android.chat.activity.k.a((new SendToFragment.a()).a(true), s1).f();
                    return;
                }
            }
        }
    }

    private void a(b b1)
    {
        if (z())
        {
            return;
        } else
        {
            kik.android.chat.ak.a(b1, ah);
            bn = true;
            return;
        }
    }

    private void a(b b1, boolean flag, boolean flag1)
    {
        if (com.kik.sdkutils.y.c(8))
        {
            c(1);
            if (aH())
            {
                bf = true;
                e(kik.android.chat.fragment.c.c);
                return;
            }
        }
        g.c("Chat Closed", ai.b()).a("Media Tray Opened", true);
        g.c("Chat Session Ended", ai.b()).a("Media Tray Opened", true);
        com.kik.android.a.f f1 = g.b("Media Tray Opened").a("Is Landscape", aH());
        _mediaItemArea.removeCallbacks(bE);
        a(1, flag);
        cv.b(new View[] {
            _mediaItemArea, _mediaShadow
        });
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)rootLayout.getLayoutParams();
        marginlayoutparams.bottomMargin = bc + _mediaTrayContainer.getHeight();
        rootLayout.setLayoutParams(marginlayoutparams);
        if (aH() || kik.android.chat.fragment.b.c.equals(b1))
        {
            f1.a("Is Maximized", true);
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a(flag, flag1);
        } else
        {
            f1.a("Is Maximized", false);
            d(flag);
        }
        f1.b();
        a(aZ);
    }

    private void a(e e1)
    {
        for (int i1 = 0; i1 < aT.getCount(); i1++)
        {
            ((com.kik.h.b)aT.getItem(i1)).a(e1);
        }

    }

    static void a(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.f(i1);
    }

    static void a(KikChatFragment kikchatfragment, Editable editable, String s1, int i1)
    {
        kikchatfragment.b(editable, s1, i1);
    }

    static void a(KikChatFragment kikchatfragment, View view)
    {
        kikchatfragment.c(view);
    }

    static void a(KikChatFragment kikchatfragment, String s1, int i1)
    {
        kikchatfragment.a(((Editable) (null)), s1, i1);
    }

    static void a(KikChatFragment kikchatfragment, String s1, s s2, kik.a.d.a.a a1)
    {
        kikchatfragment.a(s1, s2, a1);
    }

    static void a(KikChatFragment kikchatfragment, String s1, boolean flag, String s2)
    {
        kikchatfragment.a(s1, flag, s2);
    }

    static void a(KikChatFragment kikchatfragment, List list)
    {
        if (list != null && kikchatfragment.aq != null)
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                com.kik.android.c.e e1 = (com.kik.android.c.e)list.next();
                if (e1 != null)
                {
                    kikchatfragment.g.b("Smiley Inserted From Store").a("Smiley Category", e1.g()).a("Smiley Identifier", e1.e()).b();
                    spannablestringbuilder.append(com.kik.android.c.f.a(kikchatfragment.aq.getContext(), e1));
                }
            } while (true);
            int i1 = kikchatfragment.aq.getSelectionStart();
            int j1 = kikchatfragment.aq.getSelectionEnd();
            kikchatfragment = kikchatfragment.aq.getText();
            if (kikchatfragment != null)
            {
                kikchatfragment.replace(Math.min(i1, j1), Math.max(i1, j1), spannablestringbuilder, 0, spannablestringbuilder.length());
                return;
            }
        }
    }

    static void a(KikChatFragment kikchatfragment, kik.a.d.a.a a1)
    {
        kikchatfragment.b(a1);
    }

    static void a(KikChatFragment kikchatfragment, s s1)
    {
        kikchatfragment.a(s1, false);
    }

    static void a(KikChatFragment kikchatfragment, s s1, kik.a.d.a.a a1)
    {
        boolean flag1;
        flag1 = true;
        if (kikchatfragment.ag.getPosition(s1) == kikchatfragment.ag.getCount() - 1)
        {
            kikchatfragment.u();
            kikchatfragment.ai.x();
            kikchatfragment.a(true, ((android.animation.Animator.AnimatorListener) (null)));
        }
        kikchatfragment.ag.c(s1);
        kikchatfragment.ai.a(s1, kikchatfragment.d);
        kikchatfragment.ai();
        KikApplication.i().c().a(com.kik.d.b.a.k.V, kik.a.h.j.b());
        if (!s1.d()) goto _L2; else goto _L1
_L1:
        if (s1.c() == 100 || s1.c() == 101) goto _L4; else goto _L3
_L3:
        if (a1 == null) goto _L6; else goto _L5
_L5:
        Object obj = kik.android.net.a.e.a().a(a1.o());
        if (obj == null) goto _L4; else goto _L7
_L7:
        boolean flag;
        obj = (kik.android.net.a.b)((WeakReference) (obj)).get();
        kikchatfragment.g.b("Content Upload Cancelled").b();
        kikchatfragment.ai.a(s1.b(), -100, kikchatfragment.d);
        kik.android.net.a.e.a().b(((kik.android.net.a.b) (obj)));
        flag = true;
_L10:
        com.kik.android.a.f f1 = kikchatfragment.g.b("Message Delete Confirm Tapped");
        if (s1 == null || s1.d())
        {
            flag1 = false;
        }
        s1 = f1.a("Is Incoming", flag1).a("Send Cancelled", flag);
        if (a1 != null)
        {
            s1.a("App ID", a1.u()).a("Message Type", kik.android.util.ae.c(a1)).a("Card URL", kik.android.util.ae.d(a1));
        } else
        {
            s1.a("Message Type", "Text");
        }
        s1.b();
_L8:
        kikchatfragment.b(a1);
        return;
_L6:
        flag = kikchatfragment.k.g(s1.b());
        continue; /* Loop/switch isn't completed */
_L2:
        kikchatfragment.a("Message Delete Confirm Tapped", s1, a1);
        if (true) goto _L8; else goto _L4
_L4:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void a(KikChatFragment kikchatfragment, b b1)
    {
        kikchatfragment.a(b1);
    }

    static void a(KikChatFragment kikchatfragment, b b1, boolean flag)
    {
        kikchatfragment.a(b1, flag, false);
    }

    static void a(KikChatFragment kikchatfragment, e e1)
    {
        kikchatfragment.a(e1);
    }

    static void a(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.d(flag);
    }

    static void a(KikChatFragment kikchatfragment, boolean flag, boolean flag1)
    {
        kikchatfragment.a(flag, flag1);
    }

    private void a(ImeAwareEditText imeawareedittext)
    {
        if (imeawareedittext == null)
        {
            return;
        }
        if (s.a())
        {
            imeawareedittext.setImeOptions(4);
            imeawareedittext.a(true);
            imeawareedittext.setOnEditorActionListener(new dj(this));
            return;
        } else
        {
            imeawareedittext.setImeOptions(6);
            imeawareedittext.a(false);
            imeawareedittext.setOnEditorActionListener(null);
            return;
        }
    }

    private void a(boolean flag, android.animation.Animator.AnimatorListener animatorlistener)
    {
        if (!C)
        {
            C = true;
            int i1 = _suggestedRecyclerView.getMeasuredHeight();
            animatorlistener = cv.a(_suggestedRecyclerView, 0, animatorlistener, 100L);
            if (animatorlistener != null)
            {
                if (!flag)
                {
                    animatorlistener.addUpdateListener(new ft(this, i1));
                }
                animatorlistener.addListener(new fu(this));
                b(new fv(this, animatorlistener));
            }
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        Object obj;
        int i1;
        if (!aH() && flag1)
        {
            g.b("Maximized Tray").a("Is Landscape", aH()).a("Tab", aT.a(aZ)).b();
        }
        i1 = ad();
        _mediaItemArea.clearAnimation();
        _contentAttachFrame.setVisibility(8);
        obj = (android.widget.LinearLayout.LayoutParams)_mediaItemArea.getLayoutParams();
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = new AnimatorSet();
        Animator animator = cv.a(_mediaItemArea, i1 - aS, null, new ef(this), 150L, 0L);
        if (animator != null)
        {
            ((AnimatorSet) (obj)).play(animator);
        }
        if (cv.c(_suggestedRecyclerView))
        {
            ValueAnimator valueanimator = cv.a(_suggestedRecyclerView, 0, null, 150L);
            valueanimator.addListener(new eg(this));
            if (valueanimator != null)
            {
                ((AnimatorSet) (obj)).play(valueanimator).with(animator);
            }
        }
        ((AnimatorSet) (obj)).start();
_L4:
        _mediaShadow.setVisibility(8);
        cv.a(tray, 0);
        aR = true;
        return;
_L2:
        obj.height = i1 - aS;
        _mediaItemArea.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        _mediaItemArea.setVisibility(0);
        f(true);
        e(kik.android.chat.fragment.c.c);
        if (aH())
        {
            _mediaModeButton.setVisibility(8);
        }
        a(kik.android.chat.fragment.e.c);
        if ("Camera".equals(aT.a(aZ)))
        {
            e(true);
        }
        if (cv.c(_suggestedRecyclerView))
        {
            cv.e(new View[] {
                _suggestedRecyclerView
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(s s1, kik.a.d.a.a a1)
    {
        if (a1.n())
        {
            if (z())
            {
                return false;
            }
            String s2 = a1.h("sticker_pack_id");
            s1 = "https://stickers.kik.com/";
            a1 = a1.m();
            if (a1.size() > 0)
            {
                s1 = (String)a1.get(0);
            }
            a1 = com.kik.cards.web.bf.k(s1);
            s1 = a1;
            if (s2 != null)
            {
                s1 = (new StringBuilder()).append(a1).append("#").append(com.kik.cards.web.bf.h(s2)).toString();
            }
            g.b("Sticker Store Opened").a("Source", "From Sticker").b();
            g.b("Content Message Opened").a("Message Type", "Sticker").b();
            new Bundle();
            a(((String) (s1)));
            return true;
        }
        a(d(aq));
        if (ah != null && !ah.t() && ah.i() && a1.f().size() > 0 && ((com.kik.f.a.a.a)a1.f().get(0)).f() != null && t.a(((com.kik.f.a.a.a)a1.f().get(0)).f(), getActivity()))
        {
            return true;
        }
        s1 = aA.a(getActivity(), s1, A.h());
        s1.a(new fk(this, a1));
        return s1 != null;
    }

    static boolean a(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.r();
    }

    static int aA(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aN;
    }

    private void aA()
    {
        Object obj1 = ai.h();
        TextView textview = (TextView)aD.findViewById(0x7f0e001f);
        if (obj1 != null)
        {
            Object obj = textview.getContext();
            obj = (new StringBuilder(" ")).append(((Context) (obj)).getString(0x7f090142)).toString();
            obj1 = j.a(((String) (obj1)), false);
            if (obj1 != null)
            {
                obj = cq.a(((k) (obj1)));
                textview.setText((new StringBuilder(" ")).append(KikApplication.f(0x7f090142)).toString());
                textview.setVisibility(0);
            }
            ((TextView)aD.findViewById(0x7f0e001e)).setText(((CharSequence) (obj)));
            return;
        }
        if (ah != null)
        {
            w();
        }
        textview.setVisibility(8);
    }

    private void aB()
    {
        a(kik.android.chat.fragment.b.a);
        if (an)
        {
            FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                kik.android.chat.activity.k.a(new MissedConversationsFragment.a(), fragmentactivity).a().d().f();
                J();
            }
        } else
        {
            FragmentActivity fragmentactivity1 = getActivity();
            if (fragmentactivity1 != null)
            {
                kik.android.chat.activity.k.a(new KikConversationsFragment.a(), fragmentactivity1).a().d().f();
                J();
                return;
            }
        }
    }

    static void aB(KikChatFragment kikchatfragment)
    {
        s s1 = kikchatfragment.au();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = kikchatfragment.ag.getPosition(s1);
        if (i1 < kikchatfragment.aC.getFirstVisiblePosition() - 1 || i1 > kikchatfragment.aC.getLastVisiblePosition()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        if (flag)
        {
            kikchatfragment.as();
            kikchatfragment.at();
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void aC()
    {
        if (Q == ah)
        {
            if (N != null)
            {
                c(k());
            } else
            {
                aD();
            }
            if (M != null && M.length() > 0)
            {
                bi = true;
                aq.setText(M);
                Selection.setSelection(aq.getText(), aq.getText().length());
            }
        } else
        if (P == R)
        {
            N = null;
            M = null;
            return;
        }
    }

    static boolean aC(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.av();
    }

    private void aD()
    {
        aq.setVisibility(0);
        _contentAttachFrame.removeAllViews();
        ((android.view.ViewGroup.MarginLayoutParams)_contentAttachFrame.getLayoutParams()).setMargins(0, 0, 0, 0);
        at = null;
        if (an() && G)
        {
            E = false;
            aE();
        }
        if (aq.getText().length() == 0)
        {
            sendButton.setEnabled(false);
        }
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)aq.getLayoutParams();
        marginlayoutparams.setMargins(marginlayoutparams.leftMargin, aq.getResources().getDimensionPixelSize(0x7f0d0002), marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
        aq.setLayoutParams(marginlayoutparams);
    }

    static void aD(KikChatFragment kikchatfragment)
    {
        if (!kikchatfragment.aq())
        {
            Animation animation = AnimationUtils.loadAnimation(kikchatfragment.aC.getContext(), 0x7f040019);
            Animation animation1 = kikchatfragment._scrollToLastReadButton.getAnimation();
            if (animation1 == null)
            {
                kikchatfragment._scrollToLastReadButton.startAnimation(animation);
            } else
            {
                animation1.setAnimationListener(new ez(kikchatfragment, animation));
            }
            kikchatfragment._scrollToLastReadButton.setVisibility(0);
        }
    }

    private void aE()
    {
        if (!D)
        {
            boolean flag = aj();
            cv.a(_suggestedRecyclerView, KikApplication.d(0x7f0d0027), new fw(this, flag), new fx(this, flag));
        }
    }

    static boolean aE(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aq();
    }

    private void aF()
    {
        if (P == R)
        {
            Q = ah;
            M = aq.getText();
        }
    }

    static void aF(KikChatFragment kikchatfragment)
    {
        kikchatfragment.as();
    }

    static am aG(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.bF;
    }

    private void aG()
    {
        if (P == R)
        {
            Q = null;
            M = null;
            N = null;
            O = false;
        }
    }

    static int aH(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aP;
    }

    private boolean aH()
    {
        return aF == 2;
    }

    static int aI(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aP = 0;
        return 0;
    }

    private void aI()
    {
        if (bk)
        {
            return;
        }
        if (aq())
        {
            as();
        }
        ah();
        a(aq);
    }

    static s aJ(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.au();
    }

    private boolean aJ()
    {
        return aH == kik.android.chat.fragment.c.b;
    }

    static void aK(KikChatFragment kikchatfragment)
    {
        kikchatfragment.at();
    }

    static void aL(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aD();
    }

    static int aM(KikChatFragment kikchatfragment)
    {
        int i1 = kikchatfragment.bj - 1;
        kikchatfragment.bj = i1;
        return i1;
    }

    static void aN(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ay();
    }

    static void aO(KikChatFragment kikchatfragment)
    {
        if (kikchatfragment.af == null) goto _L2; else goto _L1
_L1:
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[kik.android.chat.fragment.b.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[kik.android.chat.fragment.b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[kik.android.chat.fragment.b.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[kik.android.chat.fragment.b.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[kik.android.chat.fragment.b.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        kik.android.chat.fragment._cls1.a[kikchatfragment.af.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 67
    //                   2 67
    //                   3 78
    //                   4 89
    //                   5 101;
           goto _L2 _L3 _L3 _L4 _L5 _L6
_L2:
        kikchatfragment.af = null;
        kikchatfragment.D();
        kikchatfragment.bk = false;
        return;
_L3:
        kikchatfragment.c(kikchatfragment.aq);
        continue; /* Loop/switch isn't completed */
_L4:
        kikchatfragment.a(kikchatfragment.aq);
        continue; /* Loop/switch isn't completed */
_L5:
        kikchatfragment.a(kik.android.chat.fragment.b.c, false, true);
        continue; /* Loop/switch isn't completed */
_L6:
        kikchatfragment.a(kik.android.chat.fragment.b.d, false, true);
        if (true) goto _L2; else goto _L7
_L7:
    }

    static boolean aP(KikChatFragment kikchatfragment)
    {
        kikchatfragment.bn = false;
        return false;
    }

    static KikDialogFragment aQ(KikChatFragment kikchatfragment)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(kikchatfragment.bg.getContext().getResources());
        a1.a(0x7f09031c);
        a1.b(0x7f0900be);
        a1.a(0x7f09031b, new fm(kikchatfragment));
        a1.b(0x7f090299, null);
        return a1.a;
    }

    static int aR(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ad();
    }

    static boolean aS(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.bf;
    }

    static int aT(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aH;
    }

    static boolean aU(KikChatFragment kikchatfragment)
    {
        kikchatfragment.bf = false;
        return false;
    }

    static boolean aV(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aL = false;
        return false;
    }

    private void aa()
    {
        if (at != null)
        {
            _contentAttachFrame.setVisibility(0);
            _contentAttachFrame.removeView(bg);
            at.setOnClickListener(bm);
        }
    }

    static void aa(KikChatFragment kikchatfragment)
    {
        kikchatfragment.P();
    }

    static void ab(KikChatFragment kikchatfragment)
    {
        kikchatfragment.u();
    }

    static KikDialogFragment ac(KikChatFragment kikchatfragment)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(kikchatfragment.bg.getContext().getResources());
        a1.a(0x7f09031d);
        a1.b(0x7f09033c);
        a1.a(0x7f09031b, new fq(kikchatfragment));
        a1.b(0x7f090299, null);
        return a1.a;
    }

    private int ad()
    {
        if (aH() && _contentFrame.getHeight() < bb - B)
        {
            return bb;
        } else
        {
            return _contentFrame.getHeight();
        }
    }

    static void ad(KikChatFragment kikchatfragment)
    {
        kikchatfragment._mediaItemArea.requestDisallowInterceptTouchEvent(true);
    }

    private void ae()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)rootLayout.getLayoutParams();
        marginlayoutparams.bottomMargin = _mediaTrayContainer.getMeasuredHeight();
        rootLayout.setLayoutParams(marginlayoutparams);
    }

    static void ae(KikChatFragment kikchatfragment)
    {
        kikchatfragment._mediaItemArea.requestDisallowInterceptTouchEvent(false);
    }

    private void af()
    {
        if (com.kik.sdkutils.y.c(8))
        {
            c(-1);
        }
        a(kik.android.chat.fragment.e.a);
        a(0, true);
        bl = false;
        e(false);
        cv.a(tray, aS);
        if (com.kik.sdkutils.y.b(14))
        {
            g(false);
            Y();
            aR = false;
            _mediaItemArea.setVisibility(8);
            ae();
            e(false);
            bl = true;
        } else
        {
            T();
            g(true);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)_mediaItemArea.getLayoutParams();
            marginlayoutparams.height = bc;
            _mediaItemArea.setLayoutParams(marginlayoutparams);
            _mediaItemArea.postDelayed(bE, 500L);
        }
        e(kik.android.chat.fragment.c.a);
        if (an())
        {
            aE();
        }
    }

    static boolean af(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aV;
    }

    static kik.android.f.a.f ag(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.bh;
    }

    private void ag()
    {
        tray.setVisibility(8);
        cv.a(tray, 0);
    }

    private void ah()
    {
        if (ad != null && ad.b())
        {
            ad.d();
            as.setSelected(false);
        }
    }

    static void ah(KikChatFragment kikchatfragment)
    {
        kikchatfragment.R();
    }

    private void ai()
    {
        Object obj = V;
        obj;
        JVM INSTR monitorenter ;
        s s1;
        Vector vector;
        int i1;
        if (ag != null)
        {
            ag.setNotifyOnChange(false);
        }
        s1 = ak();
        vector = ai.c();
        V.clear();
        V.addAll(ai.c());
        if (aj())
        {
            H = true;
            aC.smoothScrollToPosition(aC.getCount());
        }
        i1 = V.size();
        if (au == null) goto _L2; else goto _L1
_L1:
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        if (au.getVisibility() != 8)
        {
            au.setVisibility(8);
        }
_L2:
        if (s1 != ak())
        {
            al();
        }
        if (!ai.i()) goto _L6; else goto _L5
_L5:
        ai.j();
        Exception exception;
        int j1;
        long l1;
        boolean flag;
        if (vector.size() == F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        F = vector.size();
        if (!aj()) goto _L8; else goto _L7
_L7:
        aC.a(ag, flag);
_L15:
        aC.setPadding(0, 0, 0, 0);
        obj;
        JVM INSTR monitorexit ;
        j1 = V.size();
        U.clear();
        l1 = 0L;
        i1 = 0;
_L14:
        if (i1 >= j1) goto _L10; else goto _L9
_L9:
        s1 = (s)V.get(i1);
        if (s1.e() - l1 <= 0xdbba0L) goto _L12; else goto _L11
_L11:
        if (i1 > 0)
        {
            obj = (s)V.get(i1 - 1);
        } else
        {
            obj = null;
        }
        if (obj != null && s1.e() - ((s) (obj)).e() <= 0x493e0L) goto _L12; else goto _L13
_L13:
        U.add(Boolean.valueOf(true));
        l1 = s1.e();
_L19:
        i1++;
          goto _L14
_L4:
        if (au.getVisibility() != 0)
        {
            au.setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L8:
        aC.setVerticalScrollBarEnabled(true);
        aC.setOverScrollMode(0);
          goto _L15
_L6:
        if (vector.size() >= F) goto _L17; else goto _L16
_L16:
        if (ag != null)
        {
            F = vector.size();
            ag.notifyDataSetChanged();
        }
          goto _L15
_L17:
        if (ag == null) goto _L15; else goto _L18
_L18:
        ag.notifyDataSetChanged();
          goto _L15
_L12:
        U.add(Boolean.valueOf(false));
          goto _L19
_L10:
        return;
        if (true) goto _L2; else goto _L20
_L20:
    }

    static void ai(KikChatFragment kikchatfragment)
    {
        kikchatfragment.S();
    }

    static f aj(KikChatFragment kikchatfragment)
    {
        kikchatfragment.I = null;
        return null;
    }

    private boolean aj()
    {
        return aC.getLastVisiblePosition() == aC.getCount() - 1 || aC.getCount() < aC.getLastVisiblePosition() || aC.getLastVisiblePosition() == -1 || H;
    }

    private s ak()
    {
        if (V.size() > 0)
        {
            return (s)V.get(V.size() - 1);
        } else
        {
            return null;
        }
    }

    static void ak(KikChatFragment kikchatfragment)
    {
        kikchatfragment.f(true);
    }

    private void al()
    {
        Object obj = _suggestedRecyclerView.a();
        if (!am() || !(obj instanceof rl)) goto _L2; else goto _L1
_L1:
        obj = (rl)obj;
        if (an())
        {
            aE();
        }
        ((rl) (obj)).a(ai.w(), getActivity(), this);
        _suggestedRecyclerView.a(((android.support.v7.widget.RecyclerView.a) (obj)));
        if (obj == null || !(_suggestedRecyclerView.b() instanceof LinearLayoutManager)) goto _L4; else goto _L3
_L3:
        LinearLayoutManager linearlayoutmanager;
        int i1;
        linearlayoutmanager = (LinearLayoutManager)_suggestedRecyclerView.b();
        i1 = getResources().getDisplayMetrics().widthPixels;
        if (linearlayoutmanager.j() < 0) goto _L6; else goto _L5
_L5:
        ((rl) (obj)).a(i1, linearlayoutmanager.j());
_L9:
        linearlayoutmanager.e(((rl) (obj)).a() - 1, KikApplication.a(-500));
_L4:
        return;
_L6:
        int j1 = ((rl) (obj)).d(i1);
        if (j1 >= 0)
        {
            ((rl) (obj)).a(i1, j1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!cv.c(_suggestedRecyclerView)) goto _L4; else goto _L7
_L7:
        a(false, ((android.animation.Animator.AnimatorListener) (null)));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static void al(KikChatFragment kikchatfragment)
    {
        kikchatfragment.Y();
    }

    private boolean am()
    {
        return ai.w() != null && ai.w().size() > 0;
    }

    static boolean am(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aR = false;
        return false;
    }

    static void an(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ae();
    }

    private boolean an()
    {
        if (_suggestedRecyclerView.getMeasuredHeight() <= 0)
        {
            cv.e(new View[] {
                _suggestedRecyclerView
            });
        }
        return ai != null && !ai.g() && at == null && ah.i() && !cv.c(_suggestedRecyclerView) && !r() && (aj() || E) && !D && am();
    }

    private void ao()
    {
        if (ag != null)
        {
            ag.a();
        }
    }

    static boolean ao(KikChatFragment kikchatfragment)
    {
        kikchatfragment.bl = true;
        return true;
    }

    static Context ap(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aE;
    }

    private boolean ap()
    {
        return cv.c(_newMessagesButton) && !y;
    }

    static View aq(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aD;
    }

    private boolean aq()
    {
        return _scrollToLastReadButton.getVisibility() == 0;
    }

    static au ar(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ag;
    }

    private void ar()
    {
        if (!ap() && !D)
        {
            aP = 1;
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_newMessagesButton, View.TRANSLATION_Y, new float[] {
                (float)_newMessagesButton.getMeasuredHeight(), 0.0F
            });
            objectanimator.addListener(new ex(this));
            objectanimator.start();
        }
    }

    private void as()
    {
        if (!aq())
        {
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(aC.getContext(), 0x7f04001a);
            animation.setAnimationListener(new fa(this));
            _scrollToLastReadButton.clearAnimation();
            _scrollToLastReadButton.startAnimation(animation);
            return;
        }
    }

    static boolean as(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.an();
    }

    private void at()
    {
        o.a(ai.s()).edit().clear().commit();
    }

    static void at(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aE();
    }

    private s au()
    {
        String s1 = o.a(ai.s()).getString("kik.chat.LastMessageSeen", "");
        return ai.b(s1);
    }

    static boolean au(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aL;
    }

    static int av(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aM;
    }

    private boolean av()
    {
        s s1 = au();
        for (int i1 = ag.getPosition(s1); i1 < 0 || aC.getFirstVisiblePosition() - i1 <= 0;)
        {
            return false;
        }

        return true;
    }

    static int aw(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aO;
    }

    private void aw()
    {
        N = null;
        aD();
    }

    private void ax()
    {
        if (bj <= 1)
        {
            int i1 = bj;
            bj = i1 + 1;
            if (i1 == 0)
            {
                ay();
                return;
            }
        }
    }

    static void ax(KikChatFragment kikchatfragment)
    {
        kik.android.util.bu.a(kikchatfragment.aC, 1);
    }

    private void ay()
    {
        try
        {
            (new ff(this)).a(new Void[0]);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            ab.postDelayed(new fg(this), 1000L);
        }
    }

    static void ay(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aP = 0;
        if (!kikchatfragment.ap() || kikchatfragment.y)
        {
            return;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(kikchatfragment._newMessagesButton, View.ALPHA, new float[] {
                1.0F, 0.0F
            });
            objectanimator.addListener(new ey(kikchatfragment));
            objectanimator.start();
            return;
        }
    }

    static void az(KikChatFragment kikchatfragment)
    {
        kik.android.util.bu.a(kikchatfragment.aC, 0);
    }

    private boolean az()
    {
        return ax != null;
    }

    static int b(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.bc = i1;
        return i1;
    }

    private void b(Editable editable, String s1, int i1)
    {
        int j1;
        ai.x();
        String s2 = s1.trim();
        if (s2.length() == 0)
        {
            return;
        }
        g.g("Messaging Partners in Last 7 Days", ai.b());
        Object obj = e(s2);
        s1 = kik.android.util.by.a(((com.kik.android.a.f) (obj)), s1).a("Network Is Connected", l.k());
        int k1;
        boolean flag;
        if (i1 == kik.a.d.s.a.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1.a("Was Suggested", flag);
        ((com.kik.android.a.f) (obj)).b();
        flag = f.a(ah);
        if (!ai.c().isEmpty() || !flag) goto _L2; else goto _L1
_L1:
        s1 = kik.android.util.ck.b.values();
        k1 = s1.length;
        j1 = 0;
_L7:
        if (j1 >= k1) goto _L2; else goto _L3
_L3:
        obj = s1[j1];
        if (!f.a(ah, ((kik.android.util.ck.b) (obj)))) goto _L5; else goto _L4
_L4:
        g.b(((kik.android.util.ck.b) (obj)).f).a("Bots", new String[] {
            ah.e()
        }).b();
_L2:
        g.c("Chat Closed", ai.b()).a("Messages Sent");
        g.c("Chat Session Ended", ai.b()).a("Messages Sent");
        ak = true;
        if (i1 == kik.a.d.s.a.a)
        {
            aq.setText("");
            aq.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
        s1 = kik.a.d.s.a(s2, ah.b(), i1);
        if (editable != null)
        {
            editable = com.kik.android.c.f.b(editable);
            if (editable != null)
            {
                s1.a(new kik.a.f.e.k(editable));
            }
        }
        KikApplication.d().a(s1);
        if (getActivity() != null && getResources().getConfiguration().orientation == 2 && getResources().getConfiguration().keyboardHidden == 1 && getResources().getConfiguration().hardKeyboardHidden != 1)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(aq.getWindowToken(), 2);
        }
        ab.sendEmptyMessageDelayed(5, 300L);
        aK = s1;
        return;
_L5:
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b(kik.a.d.a.a a1)
    {
        if (a1 != null)
        {
            a1 = a1.k();
            if (a1 != null && n.e(a1.getPath()))
            {
                a1.delete();
            }
        }
    }

    static void b(KikChatFragment kikchatfragment, String s1)
    {
        kikchatfragment.getArguments().putString("chatGroupJID", s1);
        kikchatfragment.af = kik.android.chat.ak.a(kikchatfragment.ah);
        kikchatfragment.ah = kikchatfragment.j.a(s1, false);
        if (kikchatfragment.af != null)
        {
            kik.android.chat.ak.a(kikchatfragment.af, kikchatfragment.ah);
        }
        kikchatfragment.ai = kikchatfragment.k.f(kikchatfragment.ah.b());
        kikchatfragment.ai();
        if (kikchatfragment.z())
        {
            kikchatfragment.aG();
        } else
        {
            kikchatfragment.aF();
        }
        if (N != null)
        {
            s1 = k();
            if (s1 != null)
            {
                J = false;
                kikchatfragment.a(s1, ((byte []) (null)));
            }
        }
    }

    static void b(KikChatFragment kikchatfragment, kik.a.d.a.a a1)
    {
        boolean flag2;
        flag2 = true;
        if (com.kik.sdkutils.y.c(8))
        {
            kikchatfragment.c(-1);
        }
        kikchatfragment.bl = false;
        String s1 = a1.u();
        boolean flag;
        if ("com.kik.ext.video-camera".equals(s1) || "com.kik.ext.camera".equals(s1) || "com.kik.ext.gif".equals(s1) && a1.h("gif-button") == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            kikchatfragment.al = true;
            kikchatfragment.bh.a(a1, true, null);
            kikchatfragment.c(true);
            if (kikchatfragment.z() || N == null || !kikchatfragment.x())
            {
                kikchatfragment.g(kik.a.d.s.a.a);
            }
            return;
        }
        kik.android.f.a.f.a().a(a1, true, null);
        if (!kikchatfragment.isVisible())
        {
            break MISSING_BLOCK_LABEL_237;
        }
        kikchatfragment.c(true);
        if (kikchatfragment.aH()) goto _L2; else goto _L1
_L1:
        if (!com.kik.sdkutils.y.c(8) || kikchatfragment.getActivity() == null || kikchatfragment._textLayout == null) goto _L4; else goto _L3
_L3:
        boolean flag1;
        int i1;
        i1 = kikchatfragment.getActivity().getWindowManager().getDefaultDisplay().getRotation();
        flag1 = flag2;
        if (i1 == 3) goto _L6; else goto _L5
_L5:
        if (i1 != 1) goto _L4; else goto _L7
_L7:
        flag1 = flag2;
_L6:
        if (!flag1)
        {
            kikchatfragment.a(kikchatfragment.aq);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag1 = false;
        if (true) goto _L6; else goto _L2
_L2:
        kikchatfragment.c(kikchatfragment.aq);
        return;
        if (kikchatfragment.aH())
        {
            a1 = kik.android.chat.fragment.b.a;
        } else
        {
            a1 = kik.android.chat.fragment.b.b;
        }
        kik.android.chat.ak.a(a1, kikchatfragment.ah);
        return;
    }

    static void b(KikChatFragment kikchatfragment, e e1)
    {
        ((com.kik.h.b)kikchatfragment.aT.getItem(kikchatfragment.aZ)).a(e1);
    }

    public static boolean b()
    {
        return J;
    }

    static boolean b(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aJ();
    }

    static boolean b(KikChatFragment kikchatfragment, s s1, kik.a.d.a.a a1)
    {
        return kikchatfragment.a(s1, a1);
    }

    static boolean b(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.aU = flag;
        return flag;
    }

    private p c(String s1)
    {
        p p1 = new p();
        x.a(s1).a(new cw(this, p1, s1));
        return p1;
    }

    static a c(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.A;
    }

    public static void c()
    {
        J = false;
    }

    private void c(View view)
    {
        if (com.kik.sdkutils.y.c(8))
        {
            c(-1);
        }
        e(false);
        Z();
        aa();
        ah();
        a(kik.android.chat.fragment.e.a);
        e(kik.android.chat.fragment.c.a);
        _mediaShadow.setVisibility(0);
        if (an())
        {
            aE();
        }
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)_mediaItemArea.getLayoutParams();
        layoutparams.height = 0;
        _mediaItemArea.setLayoutParams(layoutparams);
        _mediaItemArea.setVisibility(8);
        aR = false;
        a(0, true);
        g(false);
        ae();
        Y();
        b(view);
        bl = false;
    }

    private void c(kik.a.d.a.a a1)
    {
        if (cv.c(_suggestedRecyclerView))
        {
            E = true;
            a(true, new fr(this, a1));
            return;
        } else
        {
            d(a1);
            return;
        }
    }

    static void c(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.a(i1);
    }

    static void c(KikChatFragment kikchatfragment, String s1)
    {
        kikchatfragment.d(s1);
    }

    static void c(KikChatFragment kikchatfragment, kik.a.d.a.a a1)
    {
        kikchatfragment.c(a1);
    }

    private void c(boolean flag)
    {
        if (!O())
        {
            if (z())
            {
                ay = bh.e();
                az = bh.i();
            }
            if (!z() && N != null && x())
            {
                a("Attachment Overwrite Prompted", flag, e(bh.e()));
                sendButton.setEnabled(false);
                Object obj = sendButton.getContext();
                KikDialogFragment.a a1 = new KikDialogFragment.a(((Context) (obj)).getResources());
                a1.a(((Context) (obj)).getString(0x7f0902fc)).b(((Context) (obj)).getString(0x7f0901fa));
                a1.a(0x7f0902fb, new do(this, flag)).b(0x7f090299, new dm(this)).a(false);
                obj = a1.a;
                ((KikDialogFragment) (obj)).a(new dp(this));
                if (!ac())
                {
                    I = new dq(this, ((KikDialogFragment) (obj)));
                    return;
                } else
                {
                    a(((KikDialogFragment) (obj)), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "replace");
                    return;
                }
            }
            if (!ac())
            {
                I = new dr(this);
            } else
            {
                R();
                S();
                c(k());
            }
            if (aT.getCount() > 0 && aT.getItem(0) != null && (aT.getItem(0) instanceof GalleryWidget))
            {
                ((GalleryWidget)aT.getItem(0)).c();
                return;
            }
        }
    }

    static boolean c(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.aX = flag;
        return flag;
    }

    public static int d()
    {
        return L;
    }

    static int d(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.aZ = i1;
        return i1;
    }

    private b d(View view)
    {
        if (!bl && aR)
        {
            if (r())
            {
                return kik.android.chat.fragment.b.c;
            }
            if (aJ())
            {
                return kik.android.chat.fragment.b.d;
            }
        }
        if (view == null)
        {
            return kik.android.chat.fragment.b.a;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (view.getResources().getDisplayMetrics().heightPixels - rect.bottom > 0)
        {
            return kik.android.chat.fragment.b.b;
        } else
        {
            return kik.android.chat.fragment.b.a;
        }
    }

    static b d(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.af;
    }

    private void d(String s1)
    {
        g.b("Media Tray Closed").a("Is Maximized", r()).a("Is Landscape", aH()).a("Last Tab", aT.a(aZ)).a("Reason", s1).b();
    }

    private void d(kik.a.d.a.a a1)
    {
        int i1;
label0:
        {
            if (at != null || a1 == null)
            {
                return;
            }
            if (cv.c(_suggestedRecyclerView))
            {
                E = true;
                a(true, new fs(this));
            }
            sendButton.setEnabled(true);
            kik.a.d.a.a.b b1 = kik.android.util.t.a(a1);
            if (z())
            {
                i1 = bd;
            } else
            {
                i1 = aS;
            }
            if (b1 == kik.a.d.a.a.b.c)
            {
                a1 = kik.android.util.ac.b(aE, _contentAttachFrame, a1, r);
            } else
            if (b1 == kik.a.d.a.a.b.f)
            {
                a1 = kik.android.util.ac.c(aE, _contentAttachFrame, a1, r);
            } else
            if (b1.a(kik.a.d.a.a.b.d) || b1.a(kik.a.d.a.a.b.e))
            {
                if (a1.u().equals("com.kik.ext.gif"))
                {
                    a1 = kik.android.util.ac.c(aE, _contentAttachFrame, a1);
                } else
                {
                    a1 = kik.android.util.ac.b(aE, _contentAttachFrame, a1);
                }
            } else
            if (b1.a(kik.a.d.a.a.b.e))
            {
                if (a1.i())
                {
                    break label0;
                }
                a1 = kik.android.util.ac.b(aE, _contentAttachFrame, a1);
            } else
            {
                if (!a1.n())
                {
                    break label0;
                }
                a1 = kik.android.util.ac.a(aE, _contentAttachFrame, a1);
            }
        }
_L1:
        if (!a1.a())
        {
            Toast.makeText(sendButton.getContext(), a1.b(), 1).show();
            aw();
            return;
        } else
        {
            at = a1.c();
            cv.b(_contentAttachFrame).c(i1).a(bd).d(aS * 2);
            _contentAttachFrame.setVisibility(0);
            at.setOnClickListener(bm);
            return;
        }
        a1 = kik.android.util.ac.a(aE, _contentAttachFrame, a1, r);
          goto _L1
    }

    static void d(KikChatFragment kikchatfragment, String s1)
    {
        if (kikchatfragment.aq != null)
        {
            com.kik.android.c.f.a(kikchatfragment.aq.getContext(), kikchatfragment.aq.getText(), s1);
        }
    }

    static void d(KikChatFragment kikchatfragment, kik.a.d.a.a a1)
    {
        kikchatfragment.d(a1);
    }

    static void d(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.e(flag);
    }

    private void d(boolean flag)
    {
        e(false);
        T();
        Z();
        if (!aJ()) goto _L2; else goto _L1
_L1:
        f(false);
_L4:
        if (at != null)
        {
            _contentAttachFrame.setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(at.getWidth(), at.getHeight());
            _contentAttachFrame.removeView(bg);
            _contentAttachFrame.addView(bg, layoutparams);
            at.setOnClickListener(new ee(this));
        }
        cv.a(tray, 0);
        aR = true;
        return;
_L2:
        if (r() && flag)
        {
            e(kik.android.chat.fragment.c.b);
            flag = aj();
            ArrayList arraylist = new ArrayList();
            AnimatorSet animatorset = new AnimatorSet();
            ValueAnimator valueanimator = cv.a(_mediaItemArea, bc, new dz(this), 150L);
            if (valueanimator != null)
            {
                arraylist.add(valueanimator);
            }
            if (an())
            {
                arraylist.add(cv.a(_suggestedRecyclerView, KikApplication.d(0x7f0d0027), null, new eb(this), 300L, 0L));
            }
            animatorset.addListener(new ec(this, flag));
            animatorset.playTogether(arraylist);
            animatorset.start();
        } else
        {
            e(kik.android.chat.fragment.c.b);
            _mediaShadow.setVisibility(0);
            android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)_mediaItemArea.getLayoutParams();
            layoutparams1.height = bc;
            _mediaItemArea.setLayoutParams(layoutparams1);
            f(flag);
            a(kik.android.chat.fragment.e.b);
            if (an())
            {
                cv.b(new View[] {
                    _suggestedRecyclerView
                });
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.kik.android.a.f e(String s1)
    {
        double d1 = 0.0D;
        if (ai.c().size() > 0)
        {
            d1 = (double)(kik.a.h.j.b() - ((s)ai.c().lastElement()).e()) / 1000D;
        }
        boolean flag = ai.b().startsWith("kikteam@");
        boolean flag1 = ai.n();
        boolean flag2 = ah.t();
        boolean flag3 = ah.i();
        int i1;
        if (s1 != null)
        {
            i1 = kik.a.h.i.f(s1);
        } else
        {
            i1 = 0;
        }
        return kik.android.util.by.a(g.b("Message Sent"), flag, flag2, flag1, flag3, d1, i1);
    }

    private static String e(kik.a.d.a.a a1)
    {
        if (a1 == null)
        {
            return null;
        }
        if ("com.kik.ext.camera".equals(a1.u()))
        {
            return "Camera";
        }
        if ("com.kik.ext.gallery".equals(a1.u()))
        {
            return "Gallery";
        } else
        {
            return "Card";
        }
    }

    static ImeAwareEditText e(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aq;
    }

    private void e(int i1)
    {
        if (aH != i1)
        {
            aH = i1;
            if (getActivity() != null && _mediaModeButton != null && _mediaModeButton.getVisibility() != 8)
            {
                if (r())
                {
                    _mediaModeButton.setImageResource(0x7f07002e);
                    com.kik.m.d.a(_mediaModeButton, "AUTOMATION_MEDIA_TRAY_COLLAPSE");
                    if (!av())
                    {
                        d.a(ai, aK);
                        return;
                    }
                } else
                {
                    _mediaModeButton.setImageResource(0x7f070041);
                    com.kik.m.d.a(_mediaModeButton, "AUTOMATION_MEDIA_TRAY_EXPAND");
                    return;
                }
            }
        }
    }

    static void e(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.e(i1);
    }

    static void e(KikChatFragment kikchatfragment, String s1)
    {
        kikchatfragment.b(new dx(kikchatfragment, s1));
    }

    private void e(boolean flag)
    {
        if (aW != flag)
        {
            aW = flag;
            _contentButton.a(flag);
            _mediaTrayContainer.a(flag);
            _mediaModeButton.a(flag);
            tabs.a(flag);
            FragmentActivity fragmentactivity;
            int i1;
            if (aW)
            {
                i1 = 0xff000000;
            } else
            {
                i1 = y();
            }
            fragmentactivity = getActivity();
            if (fragmentactivity != null && (fragmentactivity instanceof FragmentWrapperActivity))
            {
                ((FragmentWrapperActivity)fragmentactivity).a(i1);
            }
        }
    }

    static boolean e(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.E = flag;
        return flag;
    }

    public static String f()
    {
        return K;
    }

    private void f(int i1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)rootLayout.getLayoutParams();
        marginlayoutparams.bottomMargin = i1;
        rootLayout.setLayoutParams(marginlayoutparams);
    }

    static void f(KikChatFragment kikchatfragment)
    {
        kikchatfragment.bk = false;
    }

    private void f(boolean flag)
    {
label0:
        {
            if (_textLayout.getVisibility() == 0 || _textLayout.getAnimation() != null && _textLayout.getAnimation().hasStarted())
            {
                if (_textLayout.getAnimation() != null)
                {
                    _textLayout.getAnimation().cancel();
                }
                if (_mediaLayout.getAnimation() != null)
                {
                    _mediaLayout.getAnimation().cancel();
                }
                if (!flag || !com.kik.sdkutils.y.a(14))
                {
                    break label0;
                }
                kik.android.util.av.b(_textLayout, 300);
                ViewGroup viewgroup = _mediaLayout;
                ei ei1 = new ei(this);
                if (viewgroup != null)
                {
                    TranslateAnimation translateanimation = new TranslateAnimation(1, -1F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
                    translateanimation.setDuration(400L);
                    translateanimation.setAnimationListener(ei1);
                    viewgroup.startAnimation(translateanimation);
                }
                if (!aH())
                {
                    kik.android.util.av.a(_mediaModeButton, 100, 300L, null);
                }
            }
            return;
        }
        cv.e(new View[] {
            _textLayout
        });
        if (!aH())
        {
            cv.b(new View[] {
                _mediaModeButton
            });
        }
        cv.b(new View[] {
            _mediaLayout
        });
    }

    static boolean f(KikChatFragment kikchatfragment, int i1)
    {
        boolean flag1 = false;
        int k1 = KikApplication.a(170);
        int j1 = kikchatfragment.av.b();
        if (kikchatfragment.av.c())
        {
            j1 = 0;
        }
        boolean flag = flag1;
        if (!kikchatfragment.aH())
        {
            flag = flag1;
            if (i1 - j1 > k1)
            {
                flag = true;
            }
        }
        return flag;
    }

    static boolean f(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.aV = flag;
        return flag;
    }

    private void g(int i1)
    {
        kik.a.d.a.a a1;
        u();
        if (N == null)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        i1 = kik.a.d.s.a.a;
        a1 = k();
        if (N != null && a1 != null) goto _L2; else goto _L1
_L1:
        N = null;
_L4:
        return;
_L2:
        Object obj = a1.g("int-file-url-local");
        Object obj1 = a1.g("file-size");
        Object obj2 = a1.g("int-file-state");
        if (O && obj1 != null && !"1".equals(obj2))
        {
            long l1;
            if (a1.l())
            {
                l1 = kik.android.util.ak.a(((String) (obj)));
            } else
            {
                l1 = Long.parseLong(((String) (obj1)));
            }
            if (!bh.a(a1.u(), l1))
            {
                obj = new KikDialogFragment.a(getResources());
                obj1 = View.inflate(getActivity(), 0x7f030041, null);
                obj2 = (CheckBox)((View) (obj1)).findViewById(0x7f0e00f3);
                ((KikDialogFragment.a) (obj)).a(KikApplication.f(0x7f09031e));
                ((KikDialogFragment.a) (obj)).a(((View) (obj1)));
                ((KikDialogFragment.a) (obj)).b(KikApplication.a(0x7f09003c, new Object[] {
                    kik.a.h.i.a(l1)
                }));
                ((KikDialogFragment.a) (obj)).a(0x7f09031e, new fc(this, a1, ((CheckBox) (obj2)), i1));
                ((KikDialogFragment.a) (obj)).b(0x7f090299, new fd(this));
                ((KikDialogFragment.a) (obj)).a(false);
                a(((KikDialogFragment.a) (obj)).a, kik.android.chat.fragment.KikScopedDialogFragment.a.b, "contentUpload");
                return;
            }
        }
        boolean flag;
        if (a1.t().a(kik.a.d.a.a.b.e))
        {
            KikApplication.d().b(N);
        } else
        {
            KikApplication.d().a(N);
        }
        N = null;
        aD();
        obj2 = kik.android.util.ae.c(a1);
        kik.android.util.ae.d(a1);
        obj1 = a1.t().a();
        obj = obj1;
        if (((String) (obj1)).length() == 0)
        {
            if (((String) (obj2)).equals("Camera") || ((String) (obj2)).equals("Gallery"))
            {
                obj = kik.a.d.a.a.b.b.a();
            } else
            {
                obj = kik.a.d.a.a.b.c.a();
            }
        }
        if (aq.getText().toString().trim().length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = e(aq.getText().toString().trim());
        kik.android.util.by.a(((com.kik.android.a.f) (obj1)), ((String) (obj2)), flag, ((String) (obj)), a1).a("Network Is Connected", l.k());
        ((com.kik.android.a.f) (obj1)).b();
        g.g("Messaging Partners in Last 7 Days", ai.b());
        g.b("Chat Closed").a("Messages Sent");
        g.b("Chat Session Ended").a("Messages Sent");
        if (!al)
        {
            g(i1);
        }
        ab.sendEmptyMessageDelayed(5, 300L);
        if (!kik.android.f.a.f.d(a1) || a1.k() != null || !ct.a(aE, ai.b(), k, d)) goto _L4; else goto _L3
_L3:
        n.a(a1, null, null, g);
        return;
        a(aq.getText(), aq.getText().toString(), i1);
        return;
    }

    static void g(KikChatFragment kikchatfragment, int i1)
    {
        if (i1 >= 0)
        {
            s s1;
            long l1;
            if (i1 >= kikchatfragment.ag.getCount())
            {
                s1 = kikchatfragment.ai.d();
            } else
            {
                s1 = (s)kikchatfragment.ag.getItem(i1);
            }
            if (kikchatfragment.aK == null)
            {
                l1 = 0L;
            } else
            {
                l1 = kikchatfragment.aK.e();
            }
            if (s1 != null && s1.e() > l1)
            {
                kikchatfragment.aK = s1;
            }
        }
    }

    private void g(boolean flag)
    {
label0:
        {
            if (_textLayout.getVisibility() == 8 || _mediaLayout.getAnimation() != null && _mediaLayout.getAnimation().hasStarted())
            {
                if (_textLayout.getAnimation() != null)
                {
                    _textLayout.getAnimation().cancel();
                }
                if (_mediaLayout.getAnimation() != null)
                {
                    _mediaLayout.getAnimation().cancel();
                }
                if (!flag || !com.kik.sdkutils.y.a(14))
                {
                    break label0;
                }
                _mediaModeButton.clearAnimation();
                kik.android.util.av.b(_mediaModeButton, 100);
                kik.android.util.av.b(_mediaLayout);
                kik.android.util.av.a(_textLayout, 500, 0L, null);
            }
            return;
        }
        cv.b(new View[] {
            _textLayout
        });
        cv.e(new View[] {
            _mediaModeButton, _mediaLayout
        });
    }

    static boolean g(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aH();
    }

    static boolean g(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.D = flag;
        return flag;
    }

    static int h(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aS;
    }

    static int h(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.aN = i1;
        return i1;
    }

    static boolean h(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.C = flag;
        return flag;
    }

    static int i(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.aO = i1;
        return i1;
    }

    static void i(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aA();
    }

    static boolean i(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.H = flag;
        return flag;
    }

    static int j(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.aM = i1;
        return i1;
    }

    static k j(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ah;
    }

    static void j(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.c(-1);
        kikchatfragment.kik.android.chat.fragment.KikScopedDialogFragment.b(kikchatfragment.aq);
        kikchatfragment.d("Attached");
        if (flag)
        {
            kikchatfragment.bl = false;
            kikchatfragment.aq.postDelayed(new gc(kikchatfragment), 100L);
            return;
        } else
        {
            kikchatfragment.aq.postDelayed(new gd(kikchatfragment), 100L);
            return;
        }
    }

    public static kik.a.d.a.a k()
    {
        if (N == null)
        {
            return null;
        } else
        {
            return (kik.a.d.a.a)kik.a.d.a.g.a(N, kik/a/d/a/a);
        }
    }

    static void k(KikChatFragment kikchatfragment)
    {
        kikchatfragment.w();
    }

    static void k(KikChatFragment kikchatfragment, int i1)
    {
        kikchatfragment.g(i1);
    }

    static void k(KikChatFragment kikchatfragment, boolean flag)
    {
        kikchatfragment.c(flag);
    }

    static void l(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ai();
    }

    static k m()
    {
        return Q;
    }

    static ResizeEventList m(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aC;
    }

    static Spannable n()
    {
        M = null;
        return null;
    }

    static void n(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aC.post(new ek(kikchatfragment));
    }

    static s o()
    {
        N = null;
        return null;
    }

    static boolean o(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.X();
    }

    static s p()
    {
        return N;
    }

    static void p(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ah();
    }

    static void q(KikChatFragment kikchatfragment)
    {
        kikchatfragment.Z();
    }

    static boolean q()
    {
        O = true;
        return true;
    }

    static int r(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aG;
    }

    private boolean r()
    {
        return aH == kik.android.chat.fragment.c.c;
    }

    private void s()
    {
        if (!aI)
        {
            aI = true;
            if (ai != null)
            {
                g.a("Chat Opened", ai.b());
                Object obj;
                s s1;
                int i1;
                int j1;
                if (ah instanceof n)
                {
                    i1 = ((n)ah).w().size();
                } else
                {
                    i1 = 1;
                }
                obj = au();
                s1 = ai.d();
                if (obj != null && s1 != null)
                {
                    j1 = ag.getPosition(obj);
                    j1 = ag.getPosition(s1) - j1;
                } else
                {
                    j1 = 0;
                }
                g.c("Chat Opened", ai.b()).a("Is Kik Team", ai.b().startsWith("kikteam@")).a("Is Group", ah instanceof n).a("Is Muted", ai.n()).a("Is Contact", ah.l()).a("Was Empty", ai.c().isEmpty()).a("From New Message", ai.a(j)).a("Unseen Messages", j1).a("Participants Count", i1);
                obj = kik.android.f.a.f.a(aE, ah.d());
                if (ah.i() && obj != null)
                {
                    g.b("Chat Opened").a("Content Link Shown", true).b();
                } else
                {
                    g.b("Chat Opened").a("Content Link Shown", false).b();
                }
                g.c("Chat Session Ended", ai.b()).a("Chat Opens");
                if (!g.e("Chat Session Ended", ai.b()))
                {
                    g.a("Chat Opened", ai.b(), true);
                    g.c("Chat Session Started", ai.b()).a("Is Kik Team", ai.b().startsWith("kikteam@")).a("Is Group", ah instanceof n).a("Is Muted", ai.n()).a("Is Contact", ah.l()).a("Was Empty", ai.c().isEmpty()).a("From New Message", ai.a(j)).b();
                }
            }
        }
    }

    static void s(KikChatFragment kikchatfragment)
    {
        kikchatfragment.ax();
    }

    private void t()
    {
        if (aI)
        {
            aI = false;
            g.a("Chat Closed", ai.b());
            g.c("Chat Closed", ai.b()).a("Is Muted", ai.n());
            float f1 = (float)g.a("Chat Opened", ai.b(), "Chat Closed", ai.b()) / 1000F;
            g.c("Chat Closed", ai.b()).b();
            g.d("Chat Session Ended", ai.b()).b("Smiley Tray Opened").b("Media Tray Opened").b("Chat Opens", 0L).b("Messages Sent", 0L).b("Messages Received", 0L).a("Total Time", f1).a("Is Muted", ai.n()).b();
        }
    }

    static boolean t(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aR;
    }

    private void u()
    {
        for (int i1 = 0; i1 < _suggestedRecyclerView.getChildCount(); i1++)
        {
            _suggestedRecyclerView.getChildAt(i1).setOnClickListener(null);
        }

    }

    static void u(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aI();
    }

    static void v(KikChatFragment kikchatfragment)
    {
        kikchatfragment.aw();
    }

    static BugmeBarView w(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.av;
    }

    private void w()
    {
        TextView textview = (TextView)aD.findViewById(0x7f0e001e);
        Object obj;
        if ((ah instanceof n) && ah.c() == null)
        {
            obj = (n)ah;
            textview.setText(cq.a((n)ah, j));
            obj = cq.a(((n) (obj)).w(), j);
        } else
        {
            String s1 = cq.a(ah);
            if (ah.c() == null)
            {
                obj = KikApplication.f(0x7f090202);
            } else
            {
                obj = ah.c();
            }
            textview.setText(((CharSequence) (obj)));
            obj = s1;
        }
        au.setText(au.getResources().getString(0x7f090229, new Object[] {
            obj
        }));
    }

    static ContentLinkView x(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.aw;
    }

    private boolean x()
    {
        return Q == ah && bh.e() != null;
    }

    static Handler y(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ab;
    }

    static kik.a.d.f z(KikChatFragment kikchatfragment)
    {
        return kikchatfragment.ai;
    }

    private boolean z()
    {
        return A.h() == com.kik.ui.fragment.FragmentBase.a.a.c;
    }

    public final boolean A()
    {
        if (!az() && aR)
        {
            aa();
            d("Outside");
            if (aH())
            {
                c(aq);
                return true;
            }
            if (aR && "GIF".equals(aT.a(aZ)) && ba == bn.c && r())
            {
                d(true);
                return true;
            } else
            {
                a(aq);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public final boolean B()
    {
        return A.h() != com.kik.ui.fragment.FragmentBase.a.a.a;
    }

    protected final int C()
    {
        return 16;
    }

    protected final boolean I()
    {
        boolean flag1 = false;
        boolean flag;
        if (aR)
        {
            flag = _mediaItemArea.hasWindowFocus();
        } else
        {
            flag = false;
        }
        if (super.I() || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public final void a()
    {
        j();
    }

    public final void a(int i1, int j1)
    {
        while (Math.abs(j1 - i1) < aS || j1 == 0) 
        {
            return;
        }
        ab.sendEmptyMessage(6);
    }

    public final void a(ComponentName componentname)
    {
        a(d(aq));
        Intent intent = new Intent(KikApplication.f(0x7f0901b5));
        String s1 = ah.b();
        if (s1 != null)
        {
            intent.putExtra("com.kik.platform.content.EXTRA_CONVO_ID", bh.a(s1));
            intent.putExtra("com.kik.platform.key.intenttype", "com.kik.platform.intent.launchrequest");
        }
        intent.setComponent(componentname);
        intent.addFlags(0x200000);
        startActivityForResult(intent, 1);
    }

    public final void a(View view)
    {
        if (bl || !isVisible())
        {
            return;
        }
        _mediaShadow.setVisibility(0);
        aa();
        bl = true;
        if (aR)
        {
            af();
        } else
        {
            Y();
        }
        e(false);
        super.a(view, true);
    }

    public final void a(KikMessageParcelable kikmessageparcelable)
    {
        kik.android.f.a.ae.a(getActivity(), kikmessageparcelable, c).a(new ge(this));
    }

    protected final void a(com.kik.g.f f1)
    {
        super.a(f1);
        f1.a(k.e(), bs);
        f1.a(k.h(), bw);
        f1.a(k.i(), bx);
        f1.a(d.c(), bz);
        if (talkToCover != null)
        {
            f1.a(talkToCover.a(), aa);
        }
    }

    public final void a(String s1)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            Object obj = new JSONObject();
            KikCardBrowserFragment.a a1;
            int i1;
            try
            {
                ((JSONObject) (obj)).put("kik", true);
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            i1 = kik.android.chat.fragment.a.i(A);
            ah();
            a1 = new KikCardBrowserFragment.a();
            a1.a(s1).b(com.kik.cards.util.b.b(s1)).a(new PickerRequest("conversations", ((JSONObject) (obj)))).d(ah.b()).c("https://kik.com/").g().a(A.h());
            obj = kik.android.chat.activity.k.a(a1, aq.getContext()).f();
            J = true;
            L = i1;
            K = s1;
            aL = true;
            kik.android.chat.ak.a(d(aq), ah);
            ((p) (obj)).a(new ga(this, i1, fragmentactivity, s1));
        }
    }

    public final void a(String s1, String s2, String s3)
    {
        g.b("Smiley Tapped in Conversation").a("Smiley Category", s1).a("Smiley Identifier", s2).b();
        a(s3);
    }

    public final void a(k k1)
    {
        KikChatInfoFragment.a a1;
label0:
        {
            if (k1 != null)
            {
                k1 = k1.b();
                if (k1 != null && j.a(k1, false) != null)
                {
                    a1 = new KikChatInfoFragment.a();
                    a1.d(k1).b(ai.b()).a(an).a(A.h());
                    if (!z())
                    {
                        break label0;
                    }
                    a(((kik.android.util.an) (a1)));
                }
            }
            return;
        }
        a1.b(1).b(ai.b());
        a(((kik.android.util.an) (a1)));
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        if (I())
        {
            ax();
        }
    }

    public final boolean a(KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getKeyCode() == 4 && keyevent.getAction() == 1)
        {
            if (ad != null && ad.b())
            {
                ah();
                return true;
            }
            if (bl)
            {
                c(aq);
                return true;
            }
            if (aR)
            {
                a(((View) (aq)));
                return true;
            }
        }
        return false;
    }

    public final void b(View view)
    {
        if (bk)
        {
            return;
        } else
        {
            e(false);
            aa();
            bl = false;
            super.b(view);
            ah();
            return;
        }
    }

    protected final void b(com.kik.g.f f1)
    {
        super.b(f1);
        f1.a(((KikApplication)getActivity().getApplication()).o(), bu);
        f1.a(k.g(), bv);
        f1.a(k.k(), bp);
        f1.a(j.b(), bo);
        f1.a(j.c(), bq);
        f1.a(e.e(), bq);
        f1.a(k.p(), by);
        f1.a(com.kik.android.c.f.c(), bt);
        f1.a(e.c(), br);
    }

    public final void b(String s1)
    {
        Object obj = q.b(s1);
        if (obj != null && aq != null)
        {
            s1 = new SpannableStringBuilder();
            s1.append(com.kik.android.c.f.a(aq.getContext(), ((com.kik.android.c.e) (obj))));
            s1.append(" ");
            int i1 = aq.getSelectionStart();
            int j1 = aq.getSelectionEnd();
            obj = aq.getText();
            if (obj != null)
            {
                ((Editable) (obj)).replace(Math.min(i1, j1), Math.max(i1, j1), s1, 0, s1.length());
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 5;
        } else
        {
            byte0 = 4;
        }
        ab.sendEmptyMessage(byte0);
    }

    public final void e()
    {
        ao();
    }

    public final void g()
    {
        if (getActivity() != null)
        {
            a(d(aq));
            Intent intent = kik.android.util.t.b(aB);
            d.n().a(new kik.a.d.t(ah.b(), aB.getAbsolutePath()));
            startActivityForResult(intent, 17);
        }
    }

    public final void h()
    {
        if (getActivity() != null)
        {
            a(d(aq));
            Intent intent = kik.android.util.t.a(aB);
            d.n().a(new kik.a.d.t(ah.b(), aB.getAbsolutePath()));
            startActivityForResult(intent, 203);
        }
    }

    public final k i()
    {
        return ah;
    }

    public final void j()
    {
        if (X())
        {
            return;
        }
        if (aR)
        {
            d("Outside");
            c(aq);
            return;
        } else
        {
            b(aq);
            return;
        }
    }

    public final void l()
    {
        aI();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 17 && j1 == -1)
        {
            sendButton.setEnabled(false);
        } else
        if (i1 == 203 && j1 == -1)
        {
            sendButton.setEnabled(false);
        } else
        if ((i1 == 10334 || i1 == 10335) && j1 == -1 || i1 == 10336 && j1 == -1)
        {
            av.a(i1, j1, intent, h);
        } else
        {
            bn = false;
        }
        super.onActivityResult(i1, j1, intent);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        boolean flag1 = false;
        ah();
        boolean flag = true;
        if (aF != configuration.orientation)
        {
            ab.sendEmptyMessage(6);
            flag = false;
        }
        aF = configuration.orientation;
        if (aR || bf)
        {
            int i1 = ad();
            if (!flag && (aH() && aH != kik.android.chat.fragment.c.a || r() || bf))
            {
                _contentFrame.getViewTreeObserver().addOnGlobalLayoutListener(new fz(this, i1));
            }
            byte byte0 = flag1;
            if (aH())
            {
                byte0 = 8;
            }
            _mediaModeButton.setVisibility(byte0);
        }
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj;
        android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (s)aC.getAdapter().getItem(adaptercontextmenuinfo.position);
        menuitem.getItemId();
        JVM INSTR tableswitch 1 4: default 68
    //                   1 70
    //                   2 128
    //                   3 136
    //                   4 272;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        if (!((s) (obj)).d() && j.a(((s) (obj)).h(), true).m())
        {
            menuitem = KikApplication.f(0x7f090056);
        } else
        {
            menuitem = ((s) (obj)).a();
        }
        com.kik.m.f.a(aC.getContext(), "", menuitem);
        return true;
_L3:
        a(((s) (obj)), true);
        return true;
_L4:
        menuitem = (kik.a.d.a.a)kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/a);
        a("Message Delete Tapped", ((s) (obj)), menuitem);
        KikDialogFragment.a a1 = new KikDialogFragment.a(aE.getResources());
        obj = new el(this, ((s) (obj)), menuitem);
        KikDialogFragment.a a2 = a1.a(0x7f0900b3);
        if (ah.t())
        {
            menuitem = KikApplication.f(0x7f0900b2);
        } else
        {
            menuitem = String.format(KikApplication.f(0x7f0900b1), new Object[] {
                cq.a(ah)
            });
        }
        a2.b(menuitem).b(0x7f090299, ((android.content.DialogInterface.OnClickListener) (obj))).a(0x7f0902a9, ((android.content.DialogInterface.OnClickListener) (obj)));
        a(a1.a, kik.android.chat.fragment.KikScopedDialogFragment.a.a, "dialog");
        return true;
_L5:
        menuitem = (kik.a.d.a.a)kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/a);
        if (menuitem != null)
        {
            if (kik.android.f.a.f.d(menuitem))
            {
                byte abyte0[] = ((s) (obj)).o();
                boolean flag = n.c(menuitem.o());
                if (!flag)
                {
                    Toast.makeText(aD.getContext(), getString(0x7f0900c9), 0).show();
                }
                n.a(menuitem, abyte0, null, g).a(new eq(this, menuitem, flag));
                return true;
            }
            boolean flag1 = d.u(menuitem.o());
            p p1 = kik.android.util.a.a().a(menuitem, ((s) (obj)).o(), menuitem.g(), b, null, z.d, g);
            if (p1 != null)
            {
                p1.a(new en(this, menuitem, flag1));
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        bh = kik.android.f.a.f.a();
        bundle = A;
        String s1 = kik.android.chat.fragment.a.a(bundle);
        if (s1 != null)
        {
            bundle = e.a(s1, true);
        } else
        {
            bundle = kik.android.chat.fragment.a.b(bundle);
            if (bundle != null)
            {
                bundle = j.a(bundle, true);
            } else
            {
                bundle = null;
            }
        }
        ah = bundle;
        aT = new MediaTrayTabAdapter(getChildFragmentManager());
        P = R;
        aF = getResources().getConfiguration().orientation;
        if (k != null && ah != null)
        {
            if ((bundle = k.a(ah.b())) != null)
            {
                bundle.v();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aD = layoutinflater.inflate(0x7f030005, viewgroup, false);
        ButterKnife.inject(this, aD);
        aE = aD.getContext();
        aD.getViewTreeObserver().addOnGlobalLayoutListener(bB);
        aS = aD.getResources().getDimensionPixelSize(0x7f0d001c);
        aA = new kik.android.b.g();
        if (z())
        {
            cv.e(new View[] {
                aD.findViewById(0x7f0e001b)
            });
        }
        bg = new FrameLayout(aD.getContext());
        bg.setBackgroundDrawable(aD.getResources().getDrawable(0x7f0c001f));
        aq = (ImeAwareEditText)aD.findViewById(0x7f0e01af);
        aq.setImeOptions(6);
        aq.a(this);
        aq.a(this);
        ar = (LinearLayout)aD.findViewById(0x7f0e01ae);
        aj = new ad(aq, this);
        aF = getResources().getConfiguration().orientation;
        Object obj;
        int i1;
        boolean flag;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            layoutinflater = new File(Environment.getExternalStorageDirectory(), "chatTemp");
        } else
        {
            layoutinflater = new File(Environment.getDownloadCacheDirectory(), "chatTemp");
        }
        if (!layoutinflater.exists())
        {
            layoutinflater.mkdirs();
        }
        viewgroup = new File(layoutinflater, ".noMedia");
        try
        {
            viewgroup.createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup) { }
        aB = new File(layoutinflater, "temp");
        if (KikApplication.b(getResources().getDisplayMetrics().widthPixels) <= 320)
        {
            aq.setTextSize(KikApplication.b((int)aq.getTextSize()) - 1);
        }
        layoutinflater = aq.getResources();
        i1 = layoutinflater.getIdentifier("status_bar_height", "dimen", "android");
        if (i1 > 0)
        {
            be = layoutinflater.getDimensionPixelSize(i1);
        }
        if (aH())
        {
            bb = getResources().getDisplayMetrics().heightPixels - be;
        } else
        {
            bb = getResources().getDisplayMetrics().widthPixels - be;
        }
        viewgroup = aD.findViewById(0x7f0e001b);
        if (viewgroup != null)
        {
            viewgroup.setOnClickListener(new kik.android.chat.fragment.cq(this));
        }
        aC = (ResizeEventList)aD.findViewById(0x7f0e0027);
        aC.setOnScrollListener(bG);
        if (ag == null)
        {
            ag = new au(getActivity(), V, ac, X, Z, Y, U, j, a, this, g, h, i, r, V());
            ag.a(this);
        }
        layoutinflater = ag;
        _newMessagesButton.setOnClickListener(bH);
        _scrollToLastReadButton.setOnClickListener(bI);
        au = (RobotoTextView)aD.findViewById(0x7f0e0020);
        av = (BugmeBarView)aD.findViewById(0x7f0e0022);
        aw = (ContentLinkView)aD.findViewById(0x7f0e0023);
        aw.a(aA);
        aw.a(g);
        aw.a(A.h());
        av.a(m);
        av.a(d);
        av.a(h);
        av.a(i);
        av.a(new cr(this));
        obj = av;
        if (!z())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((BugmeBarView) (obj)).a(flag);
        av.a(this);
        _topBar.bringToFront();
        if (talkToCover != null)
        {
            talkToCover.a(g, m, j, k, l);
            talkToCover.bringToFront();
        }
        if (viewgroup != null)
        {
            viewgroup.bringToFront();
        }
        if (av != null)
        {
            av.bringToFront();
        }
        if (aw != null)
        {
            aw.bringToFront();
        }
        aC.a(this);
        _mediaModeButton.setOnClickListener(bD);
        viewgroup = new View(getActivity());
        viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KikApplication.a(5)));
        obj = new View(getActivity());
        ((View) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KikApplication.a(7)));
        aC.addFooterView(viewgroup, null, false);
        aC.addHeaderView(((View) (obj)), null, false);
        au.setOnClickListener(new kik.android.chat.fragment.ct(this));
        aC.setAdapter(layoutinflater);
        aC.setOnCreateContextMenuListener(new kik.android.chat.fragment.cu(this));
        if (!z())
        {
            cv.b(new View[] {
                _contentButton, _contentButtonSpacer
            });
            _contentButton.setOnClickListener(ae);
        } else
        {
            cv.e(new View[] {
                _contentButton, _contentButtonSpacer
            });
        }
        if (!z())
        {
            layoutinflater = new d();
            if (bundle != null)
            {
                i1 = bundle.getInt("CurrentTabState", 0);
            } else
            {
                i1 = 0;
            }
            aT.a(aD.getContext());
            aT.a("Gallery", 0x7f070049, new GalleryWidget());
            if (kik.android.util.u.a() > 0)
            {
                viewgroup = new CameraFragment();
                viewgroup.a(new dk(this));
                viewgroup.a(new kik.android.chat.fragment.dl(this));
                viewgroup.a(layoutinflater);
                aT.a("Camera", 0x7f070022, viewgroup);
            }
            viewgroup = new GifWidget();
            viewgroup.a(layoutinflater);
            aT.a("GIF", 0x7f07004c, viewgroup);
            layoutinflater = new WebTrayWidget();
            layoutinflater.c(aD.findViewById(0x7f0e01b3));
            layoutinflater.a(aj);
            aT.a("Web", 0x7f07009c, layoutinflater);
            _mediaItemArea.setAdapter(aT);
            _mediaItemArea.setCurrentItem(i1);
            _mediaItemArea.setOffscreenPageLimit(1);
            tabs.a(_mediaItemArea);
            tabs.a();
            tabs.a(bC);
        }
        as = aD.findViewById(0x7f0e01b0);
        as.setOnClickListener(new kik.android.chat.fragment.cv(this));
        a(aq);
        aq.setOnClickListener(new da(this));
        aq.addTextChangedListener(new db(this));
        sendButton.setOnClickListener(new dd(this));
        sendButton.setEnabled(false);
        if (ah != null)
        {
            w();
            ai = k.f(ah.b());
            F = ai.c().size();
            if (_mediaTrayContainer.getHeight() == 0)
            {
                i1 = aS;
            } else
            {
                i1 = _mediaTrayContainer.getHeight();
            }
            if (talkToCover != null)
            {
                talkToCover.a(this);
                talkToCover.a(ap);
                talkToCover.a(ah, ar, ai, k);
                if (!talkToCover.b())
                {
                    f(i1);
                } else
                {
                    layoutinflater = (android.widget.RelativeLayout.LayoutParams)_newMessagesButton.getLayoutParams();
                    layoutinflater.addRule(12, 0);
                    layoutinflater.addRule(2, talkToCover.getId());
                    _newMessagesButton.setLayoutParams(layoutinflater);
                    ag();
                }
            } else
            {
                f(i1);
                if (z())
                {
                    cv.a(tray, aS);
                    layoutinflater = (android.view.ViewGroup.MarginLayoutParams)_textLayout.getLayoutParams();
                    layoutinflater.leftMargin = bd;
                    _textLayout.setLayoutParams(layoutinflater);
                }
            }
            if (am)
            {
                a(aq, 1);
            } else
            {
                a(aq, 2);
            }
            at = null;
            if (!z())
            {
                aC();
            }
            if (!az())
            {
                c(false);
            }
            aq.post(new de(this));
            aq.postDelayed(new df(this), 500L);
            ai();
            bundle = bh.h();
            bh.e(null);
            if (bundle != null)
            {
                layoutinflater = new SpannableStringBuilder();
                if (aq != null)
                {
                    layoutinflater = aq.getText();
                }
                viewgroup = "";
                if (layoutinflater.length() != 0)
                {
                    viewgroup = " ";
                }
                M = layoutinflater.append((new StringBuilder()).append(viewgroup).append(bundle).toString());
                Q = ah;
            }
            s();
            sendButton.setContentDescription("AUTOMATION_SEND_MESSAGE");
            aC.setContentDescription("AUTOMATION_MESSAGE_LIST");
            com.kik.m.d.a(aq, "AUTOMATION_MEDIA_BAR_TEXT_FIELD");
            com.kik.m.d.a(sendButton, "AUTOMATION_MEDIA_BAR_SEND");
            com.kik.m.d.a(_contentButton, "AUTOMATION_MEDIA_BAR_PLUS");
            com.kik.m.d.a(as, "AUTOMATION_MEDIA_BAR_SMILEY");
            com.kik.m.d.a(_mediaModeButton, "AUTOMATION_MEDIA_TRAY_EXPAND");
            _mediaTrayContainer.getViewTreeObserver().addOnGlobalLayoutListener(bA);
            layoutinflater = new rl();
            layoutinflater.a(new dg(this));
            layoutinflater.d();
            layoutinflater.b(r.c().c());
            layoutinflater.c(r.c().b());
            getActivity();
            viewgroup = new LinearLayoutManager(0, true);
            viewgroup.e(layoutinflater.a() - 1, KikApplication.a(-500));
            _suggestedRecyclerView.a(viewgroup);
            _suggestedRecyclerView.a(layoutinflater);
            al();
            return aD;
        } else
        {
            J();
            return aD;
        }
    }

    public void onDestroy()
    {
        if (z())
        {
            aG();
        }
        if (P == R)
        {
            P = null;
        }
        EmojiLruCache.a(aE).evictAll();
        d.a(ai, aK);
        super.onDestroy();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (com.kik.sdkutils.y.c(8))
        {
            c(-1);
        }
        t();
        ad = null;
        aD.getViewTreeObserver().removeGlobalOnLayoutListener(bB);
        _mediaTrayContainer.getViewTreeObserver().removeGlobalOnLayoutListener(bA);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        view = (s)aC.getAdapter().getItem(i1);
        k k1;
        if (view != null)
        {
            if ((k1 = j.a(view.h(), false)) == null || !k1.m())
            {
                kik.a.d.a.a a1 = (kik.a.d.a.a)kik.a.d.a.g.a(view, kik/a/d/a/a);
                if (a1 != null)
                {
                    if ("com.kik.cards".equals(a1.u()) && a1.f() != null && a1.f().size() > 0 && a1.f().get(0) != null)
                    {
                        adapterview = c(((com.kik.f.a.a.a)a1.f().get(0)).f());
                    } else
                    {
                        adapterview = com.kik.g.s.a(Boolean.valueOf(true));
                    }
                } else
                {
                    adapterview = com.kik.g.s.a(Boolean.valueOf(false));
                }
                adapterview.a(com.kik.sdkutils.d.a(this, new fj(this, view, a1, k1)));
                return;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        if (!z())
        {
            aF();
        }
        try
        {
            k.a(ai, false);
        }
        catch (kik.a.y y1) { }
        if (!bn && !aL)
        {
            kik.android.chat.ak.a(d(aq), ah);
        }
        b(aq);
        getActivity().getWindow().setSoftInputMode(3);
        ah();
        if (!aj())
        {
            aQ = ap();
        }
        if (!av())
        {
            d.a(ai, aK);
        }
        ao();
        HeadphoneUnpluggedReceiver.a().b(this);
        aM = -1;
        aN = -1;
        aO = -1;
        ag.b();
        bF.a();
    }

    public void onResume()
    {
        boolean flag;
        super.onResume();
        s();
        ab.sendEmptyMessageDelayed(7, 300L);
        a(aq);
        ac.clear();
        Object obj = j.g().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            k k1 = (k)((Iterator) (obj)).next();
            if (k1.m())
            {
                ac.add(k1.b());
            }
        } while (true);
        obj = x;
        Object obj1 = ai;
        ArrayList arraylist = new ArrayList();
        if (obj1 != null)
        {
            for (obj1 = ((kik.a.d.f) (obj1)).b(false).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.addAll(com.kik.m.m.a((s)((Iterator) (obj1)).next()))) { }
        }
        ((kik.a.c.c) (obj)).a(arraylist);
        b(false);
        if (bn)
        {
            return;
        }
        if (talkToCover != null)
        {
            talkToCover.a(g, m, j, k, l);
        }
        if (talkToCover != null && talkToCover.b())
        {
            am = false;
            ag();
        }
        if (!kik.android.chat.fragment.a.h(A))
        {
            break MISSING_BLOCK_LABEL_451;
        }
        if (k.a(ai) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        aB();
        flag = true;
_L1:
        if (!flag)
        {
            if (!z())
            {
                aC();
            }
            aA();
            if (I())
            {
                ax();
            }
            boolean flag1;
            if (aQ || ai.u())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ai.v();
            _newMessagesButton.postDelayed(new fh(this, flag1), 500L);
            if (ai.u() && !aj())
            {
                ar();
            }
            ai.v();
            Q();
            if (af != null && !aL)
            {
                aq.postDelayed(new fi(this), 1L);
            }
            HeadphoneUnpluggedReceiver.a().a(this);
        }
        if (I != null)
        {
            I.a();
        }
        G = true;
        return;
        flag = false;
          goto _L1
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
        bundle = getArguments();
        A.a(bundle);
        if (bundle != null)
        {
            am = kik.android.chat.fragment.a.c(A);
            ao = kik.android.chat.fragment.a.d(A);
            S = kik.android.chat.fragment.a.e(A);
            aJ = kik.android.chat.fragment.a.f(A);
            an = kik.android.chat.fragment.a.g(A);
            ap = A.b();
            Q();
        }
    }

    public final boolean v()
    {
        if (az())
        {
            return false;
        }
        if (z())
        {
            J();
            return true;
        } else
        {
            aB();
            return true;
        }
    }

}
