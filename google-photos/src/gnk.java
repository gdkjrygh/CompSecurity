// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.pager.ClippingImageView;

public final class gnk extends omp
{

    gnu a;
    private mwz ag;
    private View ah;
    private ClippingImageView ai;
    private ClippingImageView aj;
    private boolean ak;
    private boolean al;
    private ayt am;
    private ValueAnimator an;
    private ValueAnimator ao;
    private ValueAnimator ap;
    private AnimatorSet aq;
    private final Runnable ar = new gnl(this);
    private final Runnable as = new gnm(this);
    private azh at;
    private azh au;
    private amh av;
    private final android.animation.Animator.AnimatorListener aw = new gnn(this);
    gnt b;
    ekp c;
    ekp d;
    boolean e;
    private final dtv f = new dtv(new Rect());
    private noz g;
    private mwx h;

    public gnk()
    {
        aq = new AnimatorSet();
    }

    private static Rect a(float f1, float f2, Point point)
    {
        Rect rect = new Rect();
        if (f1 > f2)
        {
            f1 = (float)point.x / f1;
            f2 = ((float)point.y - f1) / 2.0F;
            rect.set(0, (int)f2, point.x, (int)(f1 + f2));
            return rect;
        }
        if (f1 < f2)
        {
            f1 = (float)point.y * f1;
            f2 = ((float)point.x - f1) / 2.0F;
            rect.set((int)f2, 0, (int)(f1 + f2), point.y);
            return rect;
        } else
        {
            rect.set(0, 0, point.x, point.y);
            return rect;
        }
    }

    private void a(float f1, float f2, Rect rect, Rect rect1, float f3, float f4)
    {
        if (g.a())
        {
            noy.a("startX", Float.valueOf(f1));
            noy.a("endX", Float.valueOf(f2));
            noy.a("startClipRect", rect);
            noy.a("endClipRect", rect1);
            noy.a("startAlpha", Float.valueOf(f3));
            noy.a("endAlpha", Float.valueOf(f4));
        }
        aj.setTranslationX(f1);
        ai.setAlpha(f3);
        if (aq.isRunning())
        {
            rect = (Rect)an.getAnimatedValue();
            f3 = ((Float)ao.getAnimatedValue()).floatValue();
            f1 = ((Float)ap.getAnimatedValue()).floatValue();
        }
        an = ObjectAnimator.ofObject(ai, ClippingImageView.b, f, new Rect[] {
            rect, rect1
        }).setDuration(300L);
        ao = ObjectAnimator.ofFloat(ai, View.ALPHA, new float[] {
            f3, f4
        }).setDuration(150L);
        ap = ObjectAnimator.ofFloat(aj, View.TRANSLATION_X, new float[] {
            f1, f2
        }).setDuration(300L);
    }

    static void a(gnk gnk1)
    {
        Object obj = ((am) (gnk1)).R;
        obj = new Point(((View) (obj)).getWidth(), ((View) (obj)).getHeight());
        float f1 = (float)((Point) (obj)).x / (float)((Point) (obj)).y;
        if (gnk1.ai.getDrawable() == null || gnk1.aj.getDrawable() == null)
        {
            return;
        }
        Object obj1 = new Point(gnk1.ai.getDrawable().getIntrinsicWidth(), gnk1.ai.getDrawable().getIntrinsicHeight());
        Object obj2 = a((float)((Point) (obj1)).x / (float)((Point) (obj1)).y, f1, ((Point) (obj)));
        gnk1.ai.getLayoutParams().width = ((Rect) (obj2)).width();
        gnk1.ai.getLayoutParams().height = ((Rect) (obj2)).height();
        gnk1.ai.requestLayout();
        gnk1.ai.setTranslationX(((Rect) (obj2)).left);
        gnk1.ai.setTranslationY(((Rect) (obj2)).top);
        obj1 = new Rect(((Rect) (obj2)));
        int i1 = (((Point) (obj)).x - 200) / 2;
        int j1 = (((Point) (obj)).y - 200) / 2;
        Rect rect = new Rect(i1, j1, i1 + 200, j1 + 200);
        ((Rect) (obj1)).offset(-((Rect) (obj2)).left, -((Rect) (obj2)).top);
        rect.offset(-((Rect) (obj2)).left, -((Rect) (obj2)).top);
        obj2 = new Point(gnk1.aj.getDrawable().getIntrinsicWidth(), gnk1.aj.getDrawable().getIntrinsicHeight());
        obj2 = a((float)((Point) (obj2)).x / (float)((Point) (obj2)).y, f1, ((Point) (obj)));
        Rect rect1 = new Rect(((Rect) (obj2)));
        rect1.offset(((Point) (obj)).x, 0);
        gnk1.aj.getLayoutParams().width = ((Rect) (obj2)).width();
        gnk1.aj.getLayoutParams().height = ((Rect) (obj2)).height();
        gnk1.aj.requestLayout();
        gnk1.aj.a(new Rect(0, 0, ((Rect) (obj2)).width(), ((Rect) (obj2)).height()));
        gnk1.aj.setTranslationY(((Rect) (obj2)).top);
        if (gnk1.b == gnt.a)
        {
            gnk1.a(((Rect) (obj2)).left, rect1.left, rect, ((Rect) (obj1)), 0.0F, 1.0F);
            gnk1.aq.play(gnk1.ap);
            gnk1.aq.play(gnk1.ao).after(150L);
            gnk1.aq.play(gnk1.an).after(150L);
        } else
        {
            gnk1.a(rect1.left, ((Rect) (obj2)).left, ((Rect) (obj1)), rect, 1.0F, 0.0F);
            gnk1.aq.play(gnk1.an);
            gnk1.aq.play(gnk1.ao).after(150L);
            gnk1.aq.play(gnk1.ap).after(150L);
        }
        gnk1.aq.start();
    }

    static boolean a(gnk gnk1, boolean flag)
    {
        gnk1.e = flag;
        return flag;
    }

    static void b(gnk gnk1)
    {
        if (gnk1.a != null)
        {
            gnk1.a.d();
        }
    }

    static boolean b(gnk gnk1, boolean flag)
    {
        gnk1.ak = true;
        return true;
    }

    static View c(gnk gnk1)
    {
        return gnk1.ah;
    }

    static boolean c(gnk gnk1, boolean flag)
    {
        gnk1.al = true;
        return true;
    }

    static gnu d(gnk gnk1)
    {
        return gnk1.a;
    }

    static boolean e(gnk gnk1)
    {
        return gnk1.al;
    }

    static Runnable f(gnk gnk1)
    {
        return gnk1.ar;
    }

    static mwx g(gnk gnk1)
    {
        return gnk1.h;
    }

    static mwz h(gnk gnk1)
    {
        return gnk1.ag;
    }

    static Runnable i(gnk gnk1)
    {
        return gnk1.as;
    }

    static azh j(gnk gnk1)
    {
        return gnk1.au;
    }

    static amh k(gnk gnk1)
    {
        return gnk1.av;
    }

    static boolean l(gnk gnk1)
    {
        return gnk1.ak;
    }

    static azh m(gnk gnk1)
    {
        return gnk1.at;
    }

    public static gns r()
    {
        return new gns();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ah = layoutinflater.inflate(b.sN, viewgroup, false);
        ah.setOnTouchListener(new gno(this));
        ai = (ClippingImageView)ah.findViewById(af.t);
        aj = (ClippingImageView)ah.findViewById(af.u);
        at = new gnp(this, ai);
        au = new gnq(this, aj);
        return ah;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aq.addListener(aw);
        aq.setInterpolator(b.d(ad));
    }

    public final void au_()
    {
        super.au_();
        Bundle bundle = super.q;
        ekp ekp1 = (ekp)bundle.getParcelable("arg.pager.exit_media");
        ekp ekp2 = (ekp)bundle.getParcelable("arg.pager.enter_media");
        b = (gnt)bundle.getSerializable("arg.pager.direction");
        c = ekp1;
        d = ekp2;
        ai.setImageDrawable(null);
        aj.setImageDrawable(null);
        ag = h.a(new gnr(this), 350L);
        av.f().a(am).a(((elt)d.a(elt)).e()).a(at);
        if (c != null)
        {
            av.f().a(am).a(((elt)c.a(elt)).e()).a(au);
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        h = (mwx)ae.a(mwx);
        av = (amh)ae.a(amh);
        am = (ayt)((fli)ae.a(fli)).e().a(amb.b);
        g = noz.a(ad, 2, "MutationTransitionFrag", new String[0]);
    }
}
