// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SwitchCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import com.google.android.apps.moviemaker.ui.ScrollingTabLayout;
import java.util.List;

public class cgp extends omp
    implements bmx, bwj, che, chg, chh
{

    private static final String b = cgp.getSimpleName();
    private static final bwk c = (bwk)ddz.a(bwk);
    private static final msm d;
    private static final msm e;
    public boolean a;
    private cqa ag;
    private cgx ah;
    private int ai;
    private dam aj;
    private View ak;
    private FrameLayout al;
    private View am;
    private LinearLayout an;
    private View ao;
    private View ap;
    private ScrollingTabLayout aq;
    private ViewPager ar;
    private View as;
    private SwitchCompat at;
    private Runnable au;
    private bvz f;
    private bmq g;
    private bwk h;

    public cgp()
    {
        h = c;
        a = false;
        (new msi(pwp.x)).a(ae);
        new msh(af, (byte)0);
    }

    static int a(cgp cgp1, int j)
    {
        cgp1.ai = j;
        return j;
    }

    static bwk a(cgp cgp1)
    {
        return cgp1.h;
    }

    static cqa a(cgp cgp1, cqa cqa1)
    {
        cgp1.ag = cqa1;
        return cqa1;
    }

    static Runnable a(cgp cgp1, Runnable runnable)
    {
        cgp1.au = null;
        return null;
    }

    static void a(cgp cgp1, View view, cqa cqa1)
    {
        TextView textview = (TextView)view.findViewById(b.gK);
        view = (ImageView)view.findViewById(b.fH);
        boolean flag;
        if (cgp1.ag != null && cqa1.e.equals(cgp1.ag.e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setSelected(flag);
        view.setSelected(flag);
    }

    static void a(cgp cgp1, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j;
        boolean flag3;
        if (flag)
        {
            Object obj;
            Object obj1;
            if (flag1)
            {
                obj = cgp1.an;
            } else
            {
                obj = cgp1.ao;
            }
            if (flag1)
            {
                obj1 = cgp1.ao;
            } else
            {
                obj1 = cgp1.an;
            }
            ((View) (obj)).setVisibility(0);
            czx.a(((View) (obj))).withLayer().alpha(1.0F);
            czx.a(((View) (obj1))).withLayer().alpha(0.0F).withEndAction(new cgv(cgp1, ((View) (obj1))));
        }
        obj = cgp1.ap;
        if (flag && flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        ((View) (obj)).setClickable(flag3);
        obj = cgp1.an;
        if (flag && flag1)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((LinearLayout) (obj)).setVisibility(j);
        cgp1 = cgp1.ao;
        if (flag && !flag1)
        {
            j = ((flag2) ? 1 : 0);
        } else
        {
            j = 8;
        }
        cgp1.setVisibility(j);
    }

    static SwitchCompat b(cgp cgp1)
    {
        return cgp1.at;
    }

    private View b(int j)
    {
        View view = ak.findViewById(j);
        String s1 = String.valueOf(g().getResourceName(j));
        return (View)c.a(view, (new StringBuilder(String.valueOf(s1).length() + 19)).append("View ").append(j).append(" / ").append(s1).toString(), null);
    }

    static cgx c(cgp cgp1)
    {
        return cgp1.ah;
    }

    static cqa d(cgp cgp1)
    {
        return cgp1.ag;
    }

    static olq e(cgp cgp1)
    {
        return cgp1.ad;
    }

    static ViewPager f(cgp cgp1)
    {
        return cgp1.ar;
    }

    static olq g(cgp cgp1)
    {
        return cgp1.ad;
    }

    static olm h(cgp cgp1)
    {
        return cgp1.ae;
    }

    private void h(boolean flag)
    {
        ObjectAnimator objectanimator = czx.a();
        objectanimator.setProperty(View.ALPHA);
        objectanimator.setTarget(am);
        objectanimator.setDuration(150L);
        ObjectAnimator objectanimator1;
        ObjectAnimator objectanimator2;
        AnimatorSet animatorset;
        int j;
        if (flag)
        {
            objectanimator.setFloatValues(new float[] {
                0.0F, 1.0F
            });
        } else
        {
            objectanimator.setFloatValues(new float[] {
                1.0F, 0.0F
            });
        }
        objectanimator1 = czx.a();
        objectanimator1.setProperty(View.TRANSLATION_Y);
        objectanimator1.setTarget(al);
        objectanimator1.setDuration(800L);
        j = (int)((float)g().getDisplayMetrics().heightPixels * 0.66F);
        if (flag)
        {
            objectanimator1.setFloatValues(new float[] {
                (float)j, 0.0F
            });
        } else
        {
            objectanimator1.setFloatValues(new float[] {
                0.0F, (float)j
            });
        }
        objectanimator2 = czx.a();
        objectanimator2.setProperty(View.ALPHA);
        objectanimator2.setTarget(al);
        objectanimator2.setDuration(800L);
        if (flag)
        {
            objectanimator2.setFloatValues(new float[] {
                0.0F, 1.0F
            });
        } else
        {
            objectanimator2.setFloatValues(new float[] {
                1.0F, 0.0F
            });
        }
        animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        animatorset.start();
    }

    static Runnable i(cgp cgp1)
    {
        return cgp1.au;
    }

    static msm t()
    {
        return d;
    }

    static msm u()
    {
        return e;
    }

    static String v()
    {
        return b;
    }

    private rv w()
    {
        return ((rz)O_()).e().a();
    }

    private void x()
    {
        ((rv)c.a(w(), "actionBar", null)).d(false);
    }

    private void y()
    {
        if (aj == null)
        {
            aj = new dam(O_(), w(), bmw.b);
        }
        aj.a();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ak = layoutinflater.inflate(c.H, viewgroup, false);
        am = b(b.gO);
        al = (FrameLayout)b(b.gm);
        ao = b(b.fQ);
        an = (LinearLayout)b(b.gM);
        ap = b(b.gl);
        ap.setOnClickListener(new cgq(this));
        as = b(b.gr);
        at = (SwitchCompat)as.findViewById(b.gs);
        at.setOnClickListener(new cgr(this));
        if (ddy.j.a())
        {
            y();
        } else
        {
            x();
            w().a(0.0F);
        }
        ak.requestFocus();
        return ak;
    }

    public final void a(View view, Bundle bundle)
    {
        ar = (ViewPager)view.findViewById(b.gN);
        ar.a(new cgs(this));
        ah = new cgx(this, O_());
        ar.a(ah);
        aq = (ScrollingTabLayout)view.findViewById(b.gG);
        view = aq;
        int j = c.K;
        int k = b.gU;
        view.b = j;
        view.c = k;
        aq.a(ar);
        aq.a = new cgt(this);
    }

    public final void a(bmy bmy)
    {
        if (ddy.j.a())
        {
            aj.a(bmy);
        }
    }

    public final void a(bwk bwk1)
    {
        bwk bwk2 = bwk1;
        if (bwk1 == null)
        {
            bwk2 = c;
        }
        h = bwk2;
    }

    public final void a(cqa cqa1)
    {
        ag = cqa1;
        cqa1 = ah;
        int l = ((cgx) (cqa1)).d.ar.c;
label0:
        for (int j = l - 1; j <= l + 1; j++)
        {
            if (j < 0 || j >= ((cgx) (cqa1)).c.length || ((cgx) (cqa1)).c[j] == null)
            {
                continue;
            }
            ListView listview = (ListView)((cgx) (cqa1)).c[j].findViewById(b.gJ);
            int k = 0;
            do
            {
                if (k >= listview.getChildCount())
                {
                    continue label0;
                }
                cqa cqa2 = (cqa)listview.getItemAtPosition(listview.getFirstVisiblePosition() + k);
                cgp cgp1 = ((cgx) (cqa1)).d;
                Object obj = listview.getChildAt(k);
                TextView textview = (TextView)((View) (obj)).findViewById(b.gK);
                obj = (ImageView)((View) (obj)).findViewById(b.fH);
                boolean flag;
                if (cgp1.ag != null && cqa2.e.equals(cgp1.ag.e))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                textview.setSelected(flag);
                ((ImageView) (obj)).setSelected(flag);
                k++;
            } while (true);
        }

    }

    public final void a(List list, bwg bwg)
    {
        if (list != null)
        {
            bwg = ah;
            ((cgx) (bwg)).b.clear();
            ((cgx) (bwg)).b.addAll(list);
            if (((cgx) (bwg)).c.length != ((cgx) (bwg)).b.size())
            {
                bwg.c = new View[((cgx) (bwg)).b.size()];
            }
        }
        ah.c();
        aq.a(ar);
        if (list != null && list.size() > ai)
        {
            ar.a(ai);
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            h.c();
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (au != null)
        {
            ak.removeCallbacks(au);
            au = null;
        }
        cgu cgu1 = new cgu(this, flag, flag1);
        if (flag1 && flag)
        {
            au = cgu1;
            ak.postDelayed(cgu1, 800L);
            return;
        } else
        {
            ak.post(cgu1);
            return;
        }
    }

    public final void ak_()
    {
        if (ar != null)
        {
            ar.b();
        }
        f.b(this);
        g.b(this);
        if (ddy.j.a())
        {
            aj.b();
        } else
        {
            w().a(null);
        }
        super.ak_();
    }

    public final void b(boolean flag)
    {
        View view = super.R.findViewById(b.gr);
        if (flag)
        {
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public final void b_(boolean flag)
    {
        at.setChecked(flag);
    }

    public final void e(Bundle bundle)
    {
        bundle.putInt("SelectedTabIndex", ai);
    }

    public final Animation g(boolean flag)
    {
        if (flag)
        {
            return null;
        } else
        {
            h(false);
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 1.0F);
            alphaanimation.setDuration(800L);
            return alphaanimation;
        }
    }

    public final void g(Bundle bundle)
    {
        super.g(bundle);
        if (bundle != null)
        {
            ai = bundle.getInt("SelectedTabIndex", 0);
        }
        ah = new cgx(this, O_());
        ar.a(ah);
        aq.a(ar);
        f = MovieMakerActivity.b(this).d.n;
        f.a(this);
        g = MovieMakerActivity.b(this).d.r;
        g.a(this);
        if (a)
        {
            a = false;
            h(true);
        }
        h.b();
    }

    public final void r()
    {
        if (ddy.j.a())
        {
            y();
            return;
        } else
        {
            x();
            return;
        }
    }

    public final boolean s()
    {
        h.c();
        return false;
    }

    static 
    {
        d = new msm(pwp.o);
        e = new msm(pwp.n);
    }
}
