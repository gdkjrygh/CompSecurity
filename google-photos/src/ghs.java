// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.material.butterfly.ButterflyView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public final class ghs extends omp
    implements ca, gje, mti
{

    private final mwx a;
    private TextView ag;
    private FrameLayout ah;
    private boolean ai;
    private boolean aj;
    private int ak;
    private HashMap al;
    private mtj am;
    private fqc b;
    private mwz c;
    private View d;
    private ButterflyView e;
    private View f;
    private mlc g;
    private mlc h[];

    public ghs()
    {
        new htl(this, af, s.aj);
        (new msi(pww.d)).a(ae);
        new dsu(af);
        new gjd(af, new gje[] {
            this
        });
        a = new mwx(af);
        h = new mlc[5];
        al = new HashMap();
    }

    static void a(ghs ghs1)
    {
        ghs1.x();
    }

    static void a(ghs ghs1, int i)
    {
        ghs1.b(i);
    }

    static boolean a(ghs ghs1, boolean flag)
    {
        ghs1.ai = true;
        return true;
    }

    static int b(ghs ghs1, int i)
    {
        ghs1.ak = i;
        return i;
    }

    private void b(int i)
    {
        if (ak < i || h[i] == null || !ai)
        {
            return;
        } else
        {
            d.getRootView().setBackgroundColor(h[i].a("BG-gooBlue-1").h.c);
            e.a(h[i], new gho(ad, (new File(t())).getParent()));
            e.b.addListener(new ghx(this, i));
            e.b.start();
            f.setAlpha(1.0F);
            return;
        }
    }

    static boolean b(ghs ghs1)
    {
        return v();
    }

    static void c(ghs ghs1)
    {
        ghs1.w();
    }

    static mwx d(ghs ghs1)
    {
        return ghs1.a;
    }

    static View e(ghs ghs1)
    {
        return ghs1.d;
    }

    static mtj f(ghs ghs1)
    {
        return ghs1.am;
    }

    public static ghs r()
    {
        return new ghs();
    }

    private String t()
    {
        if (b.a())
        {
            return "intro-RtL.btfy";
        } else
        {
            return "intro.btfy";
        }
    }

    private String u()
    {
        if (v())
        {
            return "photosPinwheel.btfy";
        } else
        {
            return "pinwheel_static.btfy";
        }
    }

    private static boolean v()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    private void w()
    {
        if (g == null || !ai)
        {
            return;
        } else
        {
            d.getRootView().setBackgroundColor(g.a("BG-gooBlue-3").h.c);
            e.a(g, new gho(ad, (new File(t())).getParent()));
            ghj.a(e, af);
            e.b.start();
            f.setAlpha(1.0F);
            return;
        }
    }

    private void x()
    {
        if (am.a("onboarding_prepare_accounts"))
        {
            ah.setVisibility(0);
            aj = true;
            c = a.a(new ghz(this), gid.a);
            return;
        } else
        {
            a.a(c);
            O_().setResult(-1);
            O_().finish();
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = layoutinflater.inflate(b.rN, null);
        ah = (FrameLayout)d.findViewById(s.ac);
        if (bundle != null)
        {
            ai = bundle.getBoolean("pinwheel_played");
            aj = bundle.getBoolean("finish_waiting");
            if (aj)
            {
                x();
            }
        }
        ag = (TextView)d.findViewById(s.ap);
        layoutinflater = a(b.sh, new Object[] {
            "https://ssl.gstatic.com/photos/tos/kor.html"
        });
        ag.setText(Html.fromHtml(layoutinflater));
        ag.setMovementMethod(LinkMovementMethod.getInstance());
        layoutinflater = (Button)d.findViewById(s.S);
        b.a(layoutinflater, new msm(pww.b));
        layoutinflater.setOnClickListener(new msj(new ght(this)));
        e = (ButterflyView)d.findViewById(s.N);
        f = d.findViewById(s.T);
        al.put("oob_intro_title_01", a(b.sc));
        al.put("oob_intro_title_02", a(b.sd));
        al.put("oob_intro_title_03", a(b.se));
        al.put("oob_intro_title_04", a(b.sf));
        al.put("oob_intro_title_05", a(b.sg));
        al.put("oob_intro_search_01", a(b.sa));
        al.put("oob_intro_search_02", a(b.sb));
        al.put("oob_intro_search_03", a(b.rZ));
        al.put("oob_intro_search_04", a(b.rZ));
        if (!ai)
        {
            k().a(s.aq, null, this);
        }
        if (v())
        {
            k().a(s.W, null, this);
        } else
        {
            k().a(s.ak, null, this);
            k().a(s.al, null, this);
            k().a(s.am, null, this);
            k().a(s.an, null, this);
            k().a(s.ao, null, this);
        }
        if (bundle == null)
        {
            am.a(new gim(false));
        }
        return d;
    }

    public final ei a(int i, Bundle bundle)
    {
        if (i == s.aq)
        {
            return new ghp(O_(), u(), null);
        }
        if (i == s.W)
        {
            return new ghp(O_(), t(), new mla(al));
        }
        if (i == s.ak)
        {
            return new ghp(O_(), "Intro_All_Photos.btfy", new mla(al));
        }
        if (i == s.al)
        {
            return new ghp(O_(), "Intro_Backed_Up.btfy", new mla(al));
        }
        if (i == s.am)
        {
            return new ghp(O_(), "Intro_Organized.btfy", new mla(al));
        }
        if (i == s.an)
        {
            return new ghp(O_(), "Intro_Find_Fast.btfy", new mla(al));
        }
        if (i == s.ao)
        {
            return new ghp(O_(), "Intro_Share_Anywhere.btfy", new mla(al));
        } else
        {
            return null;
        }
    }

    public final void a(ei ei1, Object obj)
    {
        obj = (mlc)obj;
        if (ei1.c == s.aq)
        {
            e.a(((mlc) (obj)), new gho(ad, (new File(u())).getParent()));
            e.b.addListener(new ghu(this));
            if (v())
            {
                ((ValueAnimator)((AnimatorSet)((AnimatorSet)(Animator)e.c.get("BG")).getChildAnimations().get(0)).getChildAnimations().get(0)).addUpdateListener(new ghw(this, new ArgbEvaluator(), ((mlc) (obj)).a("BG").h.c));
            }
            e.b.start();
        } else
        {
            if (ei1.c == s.W)
            {
                g = ((mlc) (obj));
                w();
                return;
            }
            if (ei1.c == s.ak)
            {
                h[0] = ((mlc) (obj));
                b(0);
                return;
            }
            if (ei1.c == s.al)
            {
                h[1] = ((mlc) (obj));
                b(1);
                return;
            }
            if (ei1.c == s.am)
            {
                h[2] = ((mlc) (obj));
                b(2);
                return;
            }
            if (ei1.c == s.an)
            {
                h[3] = ((mlc) (obj));
                b(3);
                return;
            }
            if (ei1.c == s.ao)
            {
                h[4] = ((mlc) (obj));
                b(4);
                return;
            }
        }
    }

    public final void a(String s1, mue mue, mua mua)
    {
        if (s1.equals("onboarding_prepare_accounts"))
        {
            ah.setVisibility(8);
            if (aj)
            {
                x();
            }
        }
    }

    public final void a(Locale locale)
    {
        if (Locale.US.equals(locale))
        {
            ag.setVisibility(8);
        } else
        if (Locale.KOREA.equals(locale))
        {
            ag.setVisibility(0);
            return;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b = (fqc)ae.a(fqc);
        am = (mtj)ae.a(mtj);
        am.a(this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("pinwheel_played", ai);
        bundle.putBoolean("finish_waiting", aj);
    }
}
