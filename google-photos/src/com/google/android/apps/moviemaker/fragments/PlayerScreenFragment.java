// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.fragments;

import am;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import ar;
import b;
import bmq;
import bmx;
import bmy;
import boj;
import bpa;
import bqa;
import bqv;
import bqw;
import bra;
import bre;
import brf;
import brr;
import brs;
import bsa;
import bsj;
import bss;
import bsx;
import bsy;
import btd;
import btj;
import btk;
import bto;
import btp;
import byf;
import byh;
import byj;
import byk;
import byr;
import bys;
import byt;
import byu;
import byv;
import c;
import cfl;
import cfm;
import cfn;
import cfo;
import cfp;
import cfq;
import cfr;
import cfs;
import cft;
import cfu;
import cfv;
import cfw;
import cfx;
import cfy;
import cfz;
import cga;
import cgb;
import cgc;
import cgd;
import cge;
import cgf;
import cgg;
import cgh;
import cgi;
import cgj;
import cgk;
import cgz;
import che;
import chg;
import chh;
import chp;
import chq;
import cnq;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import com.google.android.apps.moviemaker.ui.ActionBarShadow;
import com.google.android.apps.moviemaker.ui.AspectRatioEnforcingFrameLayout;
import com.google.android.apps.moviemaker.ui.ImeDismissalReportingEditText;
import com.google.android.apps.moviemaker.ui.ListenableHorizontalScrollView;
import com.google.android.apps.moviemaker.ui.SizeLimitingSurfaceView;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeScrollView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;
import cvc;
import cyy;
import czx;
import dad;
import das;
import daw;
import dbh;
import dbi;
import dbl;
import dbn;
import dce;
import dcj;
import dck;
import dcl;
import dcm;
import dco;
import dcq;
import ddy;
import ddz;
import del;
import dem;
import java.util.Iterator;
import java.util.List;
import mml;
import mpk;
import mry;
import msh;
import msi;
import msj;
import msm;
import msn;
import mso;
import msp;
import noq;
import olm;
import olq;
import omp;
import pwp;
import rv;
import rz;
import ss;
import su;

public class PlayerScreenFragment extends omp
    implements bmx, bqv, bre, brs, bsx, btj, che, chg, chh
{

    private static final msm a;
    private static final Typeface b = Typeface.create("sans-serif", 0);
    private static final Typeface c = Typeface.create("sans-serif-medium", 0);
    private static final bqw d = (bqw)ddz.a(bqw);
    private static final bmy e = (bmy)ddz.a(bmy);
    private static final bsy f = (bsy)ddz.a(bsy);
    private static final btk g = (btk)ddz.a(btk);
    private static final brf h = (brf)ddz.a(brf);
    private TextView aA;
    private TextView aB;
    private ImeDismissalReportingEditText aC;
    private View aD;
    private View aE;
    private ImageButton aF;
    private ImageButton aG;
    private SeekBar aH;
    private AspectRatioEnforcingFrameLayout aI;
    private AspectRatioEnforcingFrameLayout aJ;
    private View aK;
    private ListenableHorizontalScrollView aL;
    private ThemeScrollView aM;
    private View aN;
    private TextView aO;
    private TextView aP;
    private List aQ;
    private cyy aR;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private ObjectAnimator aX;
    private boolean aY;
    private long aZ;
    private bqw ag;
    private bmy ah;
    private bsy ai;
    private btk aj;
    private brf ak;
    private ThemeSelectorView al;
    private ViewGroup am;
    private ViewGroup an;
    private byh ao;
    private byf ap;
    private SizeLimitingSurfaceView aq;
    private View ar;
    private TextView as;
    private View at;
    private View au;
    private View av;
    private View aw;
    private View ax;
    private ImeDismissalReportingEditText ay;
    private LinearLayout az;
    private mpk ba;
    private boolean bb;
    private String bc;
    private String bd;
    private noq be;
    private boolean bf;
    private android.animation.Animator.AnimatorListener bg;
    private final Handler bh = new cfx(this);
    private bqa bi;
    private bsa bj;
    private final android.view.View.OnLayoutChangeListener bk = new cge(this);
    private final android.widget.TextView.OnEditorActionListener bl = new cgf(this);
    private final TextWatcher bm = new cgg(this);
    private final android.view.View.OnFocusChangeListener bn = new cgh(this);
    private final dad bo = new cgi(this);
    private final AnimatorListenerAdapter bp = new cgj(this);
    private final byu bq = new cgk(this);
    private final Property br = new cfn(this, java/lang/Float, "progress");
    private cfl bs;

    public PlayerScreenFragment()
    {
        ag = d;
        ah = e;
        ai = f;
        aj = g;
        ak = h;
        bg = new cfm(this);
        new msh(af, (byte)0);
    }

    private void A()
    {
        am.requestFocus();
        u();
    }

    public static void A(PlayerScreenFragment playerscreenfragment)
    {
        playerscreenfragment.v();
    }

    public static noq B(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.be;
    }

    private boolean B()
    {
        return g().getConfiguration().orientation == 2;
    }

    public static void C(PlayerScreenFragment playerscreenfragment)
    {
        playerscreenfragment.l(true);
        playerscreenfragment.u();
    }

    public static ViewGroup D(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.am;
    }

    public static olq E(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ad;
    }

    private View a(int i1, msp msp)
    {
        View view = c(i1);
        b.a(view, new msm(msp));
        return view;
    }

    public static byh a(PlayerScreenFragment playerscreenfragment, byh byh1)
    {
        playerscreenfragment.ao = null;
        return null;
    }

    public static String a(PlayerScreenFragment playerscreenfragment, String s1)
    {
        playerscreenfragment.bc = s1;
        return s1;
    }

    private void a(float f1)
    {
        float f2;
        if (g().getConfiguration().orientation == 2)
        {
            f2 = Math.max(f1, 1.777778F);
        } else
        {
            f2 = Math.max(f1, 0.5625F);
        }
        aI.a(f2);
        aJ.a(f1);
    }

    private void a(TextView textview, boolean flag)
    {
        Drawable drawable = textview.getBackground();
        if (flag)
        {
            drawable.setColorFilter(g().getColor(b.cn), android.graphics.PorterDuff.Mode.SRC_IN);
            return;
        }
        if (textview.length() > 0)
        {
            drawable.setColorFilter(g().getColor(b.dl), android.graphics.PorterDuff.Mode.SRC);
            return;
        } else
        {
            drawable.setColorFilter(g().getColor(b.dk), android.graphics.PorterDuff.Mode.SRC_IN);
            return;
        }
    }

    public static void a(PlayerScreenFragment playerscreenfragment, TextView textview, boolean flag)
    {
        playerscreenfragment.a(textview, flag);
    }

    public static void a(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.j(false);
    }

    public static boolean a(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.y();
    }

    public static bqw b(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ag;
    }

    public static void b(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.l(flag);
    }

    private View c(int i1)
    {
        View view = am.findViewById(i1);
        String s1 = String.valueOf(g().getResourceName(i1));
        return (View)c.a(view, (new StringBuilder(String.valueOf(s1).length() + 19)).append("View ").append(i1).append(" / ").append(s1).toString(), null);
    }

    public static void c(PlayerScreenFragment playerscreenfragment)
    {
        playerscreenfragment.A();
    }

    public static boolean c(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.bb = flag;
        return flag;
    }

    public static btk d(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aj;
    }

    public static boolean d(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.aY = false;
        return false;
    }

    public static void e(PlayerScreenFragment playerscreenfragment)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ImeDismissalReportingEditText imedismissalreportingedittext = playerscreenfragment.ay;
            if (playerscreenfragment.ay.length() > 0)
            {
                playerscreenfragment = c;
            } else
            {
                playerscreenfragment = b;
            }
            imedismissalreportingedittext.setTypeface(playerscreenfragment);
        }
    }

    public static boolean e(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.aS = false;
        return false;
    }

    public static View f(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aD;
    }

    public static boolean f(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.aV = flag;
        return flag;
    }

    public static rv g(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.x();
    }

    public static void g(PlayerScreenFragment playerscreenfragment, boolean flag)
    {
        playerscreenfragment.k(true);
    }

    public static ImeDismissalReportingEditText h(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ay;
    }

    public static boolean i(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aU;
    }

    public static bqa j(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.bi;
    }

    private void j(boolean flag)
    {
        int i1;
        if (flag)
        {
            w();
        } else
        {
            v();
        }
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (bi.p())
        {
            aD.setVisibility(8);
        } else
        if (bi.o())
        {
            aD.setVisibility(0);
        } else
        {
            aD.setVisibility(i1);
        }
        if (az != null)
        {
            az.setVisibility(i1);
        }
    }

    public static mpk k(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ba;
    }

    private void k(boolean flag)
    {
        if (bb && ay != null)
        {
            View view;
            if (flag)
            {
                aj.a(ay.getText().toString(), false);
            } else
            {
                ay.setText(bc);
            }
            view = super.R;
            if (view != null)
            {
                view = view.findFocus();
            } else
            {
                view = null;
            }
            if (view != null)
            {
                ((InputMethodManager)O_().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                bb = false;
                return;
            }
        }
    }

    public static AspectRatioEnforcingFrameLayout l(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aI;
    }

    private void l(boolean flag)
    {
        int i1;
        if (bi.o() || bi.p())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            if (flag)
            {
                w();
            } else
            {
                v();
            }
        }
        if (flag || i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bf)
        {
            flag = false;
        }
        if (!z())
        {
            if (aX != null)
            {
                aX.cancel();
                aX = null;
            }
            j(false);
            aW = false;
        } else
        if (flag != aW)
        {
            if (aX != null)
            {
                aX.cancel();
            }
            if (!aY)
            {
                ObjectAnimator objectanimator = new ObjectAnimator();
                objectanimator.setTarget(aD);
                objectanimator.setProperty(View.ALPHA);
                float f2 = aD.getAlpha();
                float f1;
                if (flag)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = 0.0F;
                }
                objectanimator.setFloatValues(new float[] {
                    f2, f1
                });
                objectanimator.setDuration(200L);
                if (flag)
                {
                    j(true);
                } else
                {
                    objectanimator.addListener(bg);
                }
                objectanimator.start();
                aX = objectanimator;
            } else
            if (flag)
            {
                j(true);
            }
            aW = flag;
        }
        i1 = aI.getSystemUiVisibility();
        if (flag)
        {
            i1 &= 0xfffff7f8;
        } else
        {
            i1 |= 0x807;
        }
        aI.setSystemUiVisibility(i1);
    }

    public static View m(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aE;
    }

    public static bmy n(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ah;
    }

    public static boolean o(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aS;
    }

    public static void p(PlayerScreenFragment playerscreenfragment)
    {
        playerscreenfragment.u();
    }

    public static long q(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aZ;
    }

    public static TextView r(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aB;
    }

    public static boolean s(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.bb;
    }

    private void t()
    {
        if (!B())
        {
            aC = null;
            return;
        }
        rv rv1 = (rv)c.a(x(), "actionBar", null);
        if (rv1.a() == null || rv1.a().findViewById(b.gk) == null)
        {
            if (aC == null)
            {
                rv1.a(c.C);
            } else
            {
                rv1.a((ViewGroup)aC.getParent());
            }
        }
        aC = (ImeDismissalReportingEditText)rv1.a().findViewById(b.gk);
        rv1.d(true);
        rv1.a(16F);
        if (!bf)
        {
            rv1.e();
            rv1.d();
        }
        ay = aC;
    }

    public static void t(PlayerScreenFragment playerscreenfragment)
    {
        if (playerscreenfragment.aG.getVisibility() == 8 && playerscreenfragment.aF.getVisibility() == 8)
        {
            playerscreenfragment.w();
            return;
        } else
        {
            playerscreenfragment.v();
            return;
        }
    }

    private void u()
    {
        bh.removeMessages(1000);
        if (bi == null)
        {
            return;
        }
        if (!z())
        {
            l(false);
            return;
        }
        if (y())
        {
            l(true);
            return;
        }
        if (z())
        {
            bh.sendEmptyMessageDelayed(1000, 500L);
            return;
        } else
        {
            l(false);
            return;
        }
    }

    public static boolean u(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aW;
    }

    public static byh v(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ao;
    }

    private void v()
    {
        aF.setVisibility(8);
        aG.setVisibility(8);
    }

    public static List w(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aQ;
    }

    private void w()
    {
        if (aU)
        {
            aG.setVisibility(0);
            aF.setVisibility(8);
            return;
        } else
        {
            aF.setVisibility(0);
            aG.setVisibility(8);
            return;
        }
    }

    public static cyy x(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.aR;
    }

    private rv x()
    {
        return ((rz)O_()).e().a();
    }

    public static void y(PlayerScreenFragment playerscreenfragment)
    {
        playerscreenfragment.w();
    }

    private boolean y()
    {
        return !aU || aV || ay.hasFocus();
    }

    public static bsy z(PlayerScreenFragment playerscreenfragment)
    {
        return playerscreenfragment.ai;
    }

    private boolean z()
    {
        return i() && aT;
    }

    public final void I_()
    {
        if (aR == null || O_() == null)
        {
            return;
        } else
        {
            ListenableHorizontalScrollView listenablehorizontalscrollview = aL;
            int i1 = aQ.indexOf(aR);
            int j1 = (int)g().getDimension(b.dF);
            int k1 = (int)g().getDimension(b.dD);
            int l1 = j1 / 2;
            DisplayMetrics displaymetrics = new DisplayMetrics();
            MovieMakerActivity.b(this).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            listenablehorizontalscrollview.scrollTo((i1 * (j1 + k1) - displaymetrics.widthPixels / 2) + ((k1 << 1) + l1), 0);
            return;
        }
    }

    public final void J_()
    {
        ThemeScrollView themescrollview = aM;
        if (themescrollview.b != null)
        {
            Iterator iterator = btp.a().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                btp btp1 = (btp)iterator.next();
                int i1 = themescrollview.b.indexOf(cyy.valueOf(btp1.name()));
                if (i1 >= 0 && i1 < themescrollview.b.size())
                {
                    themescrollview.a.a(themescrollview.getChildAt(i1), btp1);
                }
            } while (true);
        }
    }

    public final void K_()
    {
        aD.setVisibility(8);
        if (ao != null)
        {
            if (bi.p())
            {
                return;
            }
        } else
        {
            ao = new byh(ad, an, bj, ap, bq);
        }
        Object obj = ao;
        obj.d = (ViewGroup)LayoutInflater.from(((byh) (obj)).a).inflate(c.O, ((byh) (obj)).m, false);
        ((byh) (obj)).m.addView(((byh) (obj)).d);
        obj.e = (daw)((byh) (obj)).d.findViewById(b.gT);
        obj.f = (LinearLayout)((byh) (obj)).d.findViewById(b.hh);
        obj.g = (ImageButton)((byh) (obj)).d.findViewById(b.hk);
        ((byh) (obj)).g.setOnClickListener(new byr(((byh) (obj))));
        obj.h = (ImageButton)((byh) (obj)).d.findViewById(b.hg);
        ((byh) (obj)).h.setOnClickListener(new bys(((byh) (obj))));
        obj.i = (ImageButton)((byh) (obj)).d.findViewById(b.hi);
        ((byh) (obj)).i.setOnClickListener(new byt(((byh) (obj))));
        obj.j = (ImageButton)((byh) (obj)).d.findViewById(b.hj);
        ((byh) (obj)).j.setOnClickListener(new byj(((byh) (obj))));
        obj.k = (ImageButton)((byh) (obj)).d.findViewById(b.hf);
        if (ddy.k.a())
        {
            ((byh) (obj)).k.setVisibility(0);
            ((byh) (obj)).k.setOnClickListener(new byk(((byh) (obj))));
        }
        obj.f = (LinearLayout)((byh) (obj)).d.findViewById(b.hh);
        obj.l = new das(((byh) (obj)).a, new byv(((byh) (obj))));
        obj.n = (ActionBarShadow)((byh) (obj)).d.findViewById(b.fF);
        ((byh) (obj)).e.setAdapter(((byh) (obj)).l);
        ((dcq)((byh) (obj)).e.a(dcq)).c = ((byh) (obj)).s;
        ((dco)((byh) (obj)).e.a(dco)).f = ((byh) (obj)).t;
        ((dcl)((byh) (obj)).e.a(dcl)).b = (dcm)b.a(((byh) (obj)).u, "listener", null);
        ((dce)((byh) (obj)).e.a(dce)).b = ((byh) (obj)).v;
        ((dcj)((byh) (obj)).e.a(dcj)).b = (dck)c.a(((byh) (obj)).w, "listener", null);
        obj.q = new del(((byh) (obj)).l, ((byh) (obj)).a.getResources().getString(c.U), ((byh) (obj)).r, ((byh) (obj)).b);
        if (b.f())
        {
            obj.p = (mml)olm.a(((byh) (obj)).a, mml);
        }
        ((byh) (obj)).q.e = new dem(((byh) (obj)).d.findViewById(b.fB));
        obj = bj;
        byh byh1 = ao;
        ((bsa) (obj)).f.c(byh1);
        x().e();
        ay.setVisibility(8);
    }

    public final void L_()
    {
        aO.setText(g().getString(c.aI));
        aP.setText(g().getString(c.aH));
        aN.setVisibility(0);
    }

    public final void M_()
    {
        aO.setText(g().getString(c.aW));
        aP.setText(g().getString(c.aV));
        aN.setVisibility(0);
    }

    public final void N_()
    {
        bf = true;
        int i1 = g().getColor(0x106000d);
        am.setBackgroundColor(i1);
        Object obj = c(b.fM);
        if (obj != null)
        {
            ((View) (obj)).setBackgroundColor(i1);
        }
        aI.setBackgroundColor(i1);
        obj = x();
        if (obj != null)
        {
            ((rv) (obj)).e();
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        am = (ViewGroup)layoutinflater.inflate(c.E, viewgroup, false);
        an = (ViewGroup)c(b.hm);
        al = (ThemeSelectorView)c(b.he);
        aq = (SizeLimitingSurfaceView)c(b.ho);
        aF = (ImageButton)a(b.gv, pwp.q);
        aG = (ImageButton)a(b.gu, pwp.p);
        aD = c(b.gA);
        ar = c(b.gy);
        as = (TextView)c(b.gz);
        aA = (TextView)c(b.gi);
        aB = (TextView)c(b.gj);
        if (B())
        {
            t();
            az = null;
        } else
        {
            ay = (ImeDismissalReportingEditText)c(b.gk);
            az = (LinearLayout)c(b.hl);
        }
        at = a(b.gR, pwp.d);
        au = a(b.gL, pwp.t);
        av = a(b.gV, pwp.u);
        aw = c(b.gH);
        ax = c(b.fK);
        aI = (AspectRatioEnforcingFrameLayout)c(b.gh);
        aJ = (AspectRatioEnforcingFrameLayout)c(b.gt);
        aH = (SeekBar)a(b.gI, pwp.r);
        aK = c(b.ha);
        ((ImageButton)c(b.gW)).setOnClickListener(new cfp(this));
        ((ImageButton)c(b.hb)).setOnClickListener(new cfq(this));
        aL = (ListenableHorizontalScrollView)c(b.hc);
        aL.getViewTreeObserver().addOnGlobalLayoutListener(new cfr(this));
        aL.setOnTouchListener(new cfs(this));
        aM = (ThemeScrollView)c(b.hd);
        aN = c(b.gn);
        aO = (TextView)c(b.gp);
        aP = (TextView)c(b.go);
        if (B())
        {
            aE = null;
        } else
        {
            aE = c(b.hl);
        }
        aH.setOnSeekBarChangeListener(new cft(this));
        layoutinflater = new cfu(this);
        am.setOnClickListener(layoutinflater);
        c(b.gw).setOnClickListener(layoutinflater);
        aF.setOnClickListener(new msj(new cfv(this)));
        aG.setOnClickListener(new msj(new cfw(this)));
        al.x = new cfy(this);
        at.setOnClickListener(new msj(new cfz(this)));
        au.setOnClickListener(new msj(new cga(this)));
        av.setOnClickListener(new msj(new cgb(this)));
        aW = true;
        aS = true;
        am.requestFocus();
        am.post(new cgc(this));
        return am;
    }

    public final chp a(chq chq)
    {
        return new cvc(chq, aq);
    }

    public final void a(int i1, int j1)
    {
        a((float)i1 / (float)j1);
    }

    public final void a(long l1)
    {
        aZ = l1;
        aA.setText(b.a(l1, g()));
    }

    public final void a(long l1, long l2)
    {
        byh byh1;
        int j1;
label0:
        {
            if (!aV)
            {
                int i1 = (int)(((float)l1 / (float)l2) * (float)aH.getMax());
                l1 = b.a(i1, aH.getMax(), 0L, l2);
                aH.setProgress(i1);
                aB.setText(b.a(l1, g()));
                if (l2 != aZ)
                {
                    a(l2);
                }
            }
            if (bi.p() && ao != null)
            {
                byh1 = ao;
                if (byh1.b.c == 0)
                {
                    cnq cnq1 = byh1.c.f();
                    if (cnq1 != null)
                    {
                        j1 = byh1.l.a(cnq1.b);
                        if (j1 != byh1.o && j1 != -1)
                        {
                            break label0;
                        }
                    }
                }
            }
            return;
        }
        ((dco)byh1.e.a(dco)).a(j1);
        byh1.o = j1;
    }

    public final void a(bmy bmy1)
    {
        if (bmy1 == null)
        {
            ah = e;
            return;
        } else
        {
            ah = bmy1;
            return;
        }
    }

    public final void a(bqw bqw1)
    {
        if (bqw1 == null)
        {
            ag = d;
            return;
        } else
        {
            ag = bqw1;
            return;
        }
    }

    public final void a(brf brf1)
    {
        brf brf2 = brf1;
        if (brf1 == null)
        {
            brf2 = h;
        }
        ak = brf2;
    }

    public final void a(bsy bsy1)
    {
        if (bsy1 == null)
        {
            ai = f;
            return;
        } else
        {
            ai = bsy1;
            return;
        }
    }

    public final void a(btk btk1)
    {
        if (btk1 == null)
        {
            aj = g;
            return;
        } else
        {
            aj = btk1;
            return;
        }
    }

    public final void a(cyy cyy1)
    {
        aR = cyy1;
        if (cyy1 == cyy.l)
        {
            f();
        }
        int i1 = aQ.indexOf(cyy1);
        al.a(i1);
        cyy1 = aM;
        if (i1 >= 0 && i1 < ((ThemeScrollView) (cyy1)).b.size())
        {
            View view = cyy1.getChildAt(i1);
            ((ThemeScrollView) (cyy1)).a.a(view);
        }
    }

    public final void a(String s1)
    {
        b.a(s1, "title", null);
        ay.setText(s1);
        a(((TextView) (ay)), false);
        A();
    }

    public final void a(List list)
    {
        aQ = list;
        Object obj = al;
        ((ThemeSelectorView) (obj)).setAlpha(0.0F);
        ((ThemeSelectorView) (obj)).a(new dbn(((ThemeSelectorView) (obj)), list));
        obj = aM;
        ThemeSelectorView themeselectorview = al;
        cgd cgd1 = new cgd(this);
        if (((ThemeScrollView) (obj)).getChildCount() != list.size())
        {
            obj.b = list;
            obj.a = new dbh(((ThemeScrollView) (obj)).getContext(), ((ThemeScrollView) (obj)).b);
            for (int i1 = 0; i1 < list.size() && ((cyy)list.get(i1)).y; i1++)
            {
                View view = ((ThemeScrollView) (obj)).a.getView(i1, null, ((ViewGroup) (obj)));
                b.a(view, new msm(((cyy)list.get(i1)).q));
                view.setOnClickListener(new dbi(((ThemeScrollView) (obj)), cgd1, themeselectorview));
                ((ThemeScrollView) (obj)).addView(view);
            }

        }
    }

    public final void a(boolean flag)
    {
        if (bb)
        {
            k(true);
        }
    }

    public final void a(boolean flag, int i1)
    {
        if (flag)
        {
            TextView textview = as;
            int j1 = i1;
            if (i1 == 0)
            {
                j1 = c.bT;
            }
            textview.setText(a(j1));
            ar.setAlpha(0.0F);
            ar.setVisibility(0);
            czx.a(ar).alpha(1.0F);
            return;
        } else
        {
            czx.a(ar).alpha(0.0F);
            return;
        }
    }

    public final void aj_()
    {
        aq.removeOnLayoutChangeListener(bk);
        super.aj_();
    }

    public final void ak_()
    {
        k(false);
        Object obj = bi;
        Object obj1 = bs;
        ((bqa) (obj)).a.d(this);
        ((bqa) (obj)).b.d(obj1);
        obj = MovieMakerActivity.b(this).d;
        ((boj) (obj)).r.b(this);
        ((boj) (obj)).s.a.d(this);
        ((boj) (obj)).f.a.d(this);
        obj1 = ((boj) (obj)).j;
        cfl cfl1 = bs;
        ((bra) (obj1)).b.d(cfl1);
        ((bra) (obj1)).a.d(this);
        obj = ((boj) (obj)).i;
        obj1 = bs;
        ((brr) (obj)).a.d(obj1);
        ((brr) (obj)).b.d(this);
        bs = null;
        super.ak_();
    }

    public final void au_()
    {
        super.au_();
        aq.addOnLayoutChangeListener(bk);
    }

    public final void b(int i1)
    {
        aO.setText(g().getString(c.bM));
        aP.setText(g().getQuantityString(b.hJ, i1, new Object[] {
            Integer.valueOf(i1)
        }));
        aN.setVisibility(0);
    }

    public final void b(boolean flag)
    {
        aU = flag;
        w();
        u();
        aq.setKeepScreenOn(flag);
    }

    public final void b_(int i1)
    {
        SizeLimitingSurfaceView sizelimitingsurfaceview = aq;
        sizelimitingsurfaceview.a = i1;
        sizelimitingsurfaceview.a();
        ag.b();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        (new msi(new cfo(this, pwp.m))).a(ae);
        be = (noq)ae.a(noq);
        ba = (mpk)olm.a(O_(), mpk);
    }

    public final void c_(boolean flag)
    {
        if (!flag || bf)
        {
            aI.setVisibility(4);
            return;
        }
        am am1 = MovieMakerActivity.b(this).e.v();
        if (am1 == null || (am1 instanceof PlayerScreenFragment) || (am1 instanceof cgz))
        {
            aI.setVisibility(0);
            return;
        } else
        {
            aI.setVisibility(4);
            return;
        }
    }

    public final void d_(boolean flag)
    {
        aT = flag;
        u();
    }

    public final void e()
    {
        ThemeSelectorView themeselectorview;
        ThemeItemView themeitemview;
label0:
        {
            themeselectorview = al;
            if (((ViewPager) (themeselectorview)).c == themeselectorview.w)
            {
                if (themeselectorview.v != null)
                {
                    themeselectorview.v.cancel();
                }
                if (themeselectorview.u != null)
                {
                    themeselectorview.u.setListener(null).cancel();
                }
            }
            themeitemview = themeselectorview.j();
            if (themeitemview != null)
            {
                themeselectorview.w = ((ViewPager) (themeselectorview)).c;
                if (themeitemview.d < 1.0F)
                {
                    break label0;
                }
                themeselectorview.v = ObjectAnimator.ofFloat(themeitemview, ThemeItemView.b, new float[] {
                    themeitemview.d, 0.0F
                });
                themeselectorview.v.setDuration(themeselectorview.getResources().getInteger(b.hv));
                themeselectorview.v.setInterpolator(new AccelerateInterpolator());
                themeselectorview.v.setStartDelay(0L);
                themeselectorview.v.removeAllListeners();
                themeselectorview.v.addListener(new dbl(themeselectorview, themeitemview));
                themeselectorview.v.start();
            }
            return;
        }
        themeselectorview.a(themeitemview, 0);
    }

    public final void e(Bundle bundle)
    {
        if (ay != null && bb)
        {
            bundle.putString("UnsavedTitleKey", ay.getText().toString());
        }
        k(false);
        if (ao != null)
        {
            byh byh1 = ao;
            byh1.b.a = ((dco)byh1.e.a(dco)).c;
        }
        bundle.putParcelable("TimelineState", ap);
    }

    public final void e_(boolean flag)
    {
        SizeLimitingSurfaceView sizelimitingsurfaceview = aq;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        sizelimitingsurfaceview.setVisibility(i1);
    }

    public final void f()
    {
        av.setEnabled(false);
    }

    public final void f(boolean flag)
    {
        av.setEnabled(flag);
    }

    public final void f_(boolean flag)
    {
        ThemeSelectorView themeselectorview = al;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        themeselectorview.setVisibility(i1);
    }

    public final Animation g(boolean flag)
    {
        Object obj = czx.a();
        ((ObjectAnimator) (obj)).setProperty(br);
        aY = true;
        int i1;
        if (flag)
        {
            ((ObjectAnimator) (obj)).setFloatValues(new float[] {
                1.0F, 0.0F
            });
            br.set(super.R, Float.valueOf(1.0F));
            ((ObjectAnimator) (obj)).setStartDelay(500L);
            ((ObjectAnimator) (obj)).setDuration(500L);
            i1 = 1000;
        } else
        {
            ((ObjectAnimator) (obj)).setStartDelay(0L);
            ((ObjectAnimator) (obj)).setDuration(500L);
            i1 = 500;
            ((ObjectAnimator) (obj)).setFloatValues(new float[] {
                0.0F, 1.0F
            });
        }
        ((ObjectAnimator) (obj)).addListener(bp);
        ((ObjectAnimator) (obj)).start();
        obj = new AlphaAnimation(1.0F, 1.0F);
        ((Animation) (obj)).setDuration(i1);
        return ((Animation) (obj));
    }

    public final void g(Bundle bundle)
    {
        super.g(bundle);
        ay.setOnEditorActionListener(bl);
        ay.a = bo;
        ay.setOnFocusChangeListener(bn);
        ay.addTextChangedListener(bm);
        Object obj = MovieMakerActivity.b(this).d;
        bs = new cfl(this);
        bi = ((boj) (obj)).e;
        Object obj1 = bi;
        cfl cfl1 = bs;
        ((bqa) (obj1)).a.c(this);
        ((bqa) (obj1)).b.c(cfl1);
        if (this != null && ((bqa) (obj1)).b())
        {
            N_();
        }
        bj = ((boj) (obj)).g;
        if (bi.o())
        {
            h(true);
        }
        ((boj) (obj)).r.a(this);
        ((boj) (obj)).s.a.c(this);
        ((boj) (obj)).f.a.c(this);
        obj1 = ((boj) (obj)).j;
        cfl1 = bs;
        ((bra) (obj1)).b.c(cfl1);
        ((bra) (obj1)).a.c(this);
        obj = ((boj) (obj)).i;
        obj1 = bs;
        ((brr) (obj)).a.c(obj1);
        ((brr) (obj)).b.c(this);
        if (bundle != null)
        {
            bd = bundle.getString("UnsavedTitleKey");
            ap = (byf)bundle.getParcelable("TimelineState");
            return;
        } else
        {
            ap = new byf();
            return;
        }
    }

    public final void h(boolean flag)
    {
        byte byte0 = 8;
        Object obj = aK;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = ax;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = aw;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        if (flag)
        {
            x().e();
        } else
        {
            x().d();
        }
        obj = ay;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ImeDismissalReportingEditText) (obj)).setVisibility(i1);
        if (aE != null)
        {
            View view = aE;
            if (flag)
            {
                i1 = byte0;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
        }
    }

    public final void i(boolean flag)
    {
        aS = true;
    }

    public final void j()
    {
        aN.setVisibility(8);
    }

    public final void l()
    {
        super.l();
        View view = c(b.fM);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 0x700);
        if (!B() && aI.a == 0.0F)
        {
            a(g().getDimension(b.dA) / g().getDimension(b.dz));
        }
        if (!bf)
        {
            x().a(16F);
        }
        c_(true);
        if (bi.p())
        {
            aD.setVisibility(8);
        }
    }

    public final void m()
    {
        bh.removeMessages(1000);
        super.m();
    }

    public final void o()
    {
        k(false);
    }

    public final String p()
    {
        return bd;
    }

    public final void q()
    {
        msm msm1 = ((mso)ae.a(mso)).r();
        mry.a(ad, 4, (new msn()).a(a).a(msm1));
    }

    public final void r()
    {
        t();
        u();
        ag.c();
        if (bi != null && bi.p())
        {
            K_();
        }
    }

    public final boolean s()
    {
        if (bb)
        {
            k(true);
        } else
        if (!ak.a())
        {
            if (ao != null)
            {
                ao.a(false);
                return true;
            } else
            {
                return ag.d();
            }
        }
        return true;
    }

    public String toString()
    {
        if (aI != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = aI.getLayoutParams();
            return b.a(com/google/android/apps/moviemaker/fragments/PlayerScreenFragment, new Object[] {
                Integer.valueOf(layoutparams.width), Integer.valueOf(layoutparams.height)
            });
        } else
        {
            return b.a(com/google/android/apps/moviemaker/fragments/PlayerScreenFragment, new Object[0]);
        }
    }

    static 
    {
        a = new msm(pwp.T);
    }
}
