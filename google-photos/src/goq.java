// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.photos.pager.ClippingImageView;

public final class goq extends omp
    implements android.view.View.OnTouchListener, gnc, gpj
{

    gpc a;
    private final ValueAnimator aA = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]).setDuration(200L);
    private final ValueAnimator aB = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]).setDuration(100L);
    private final dtu ag = dtu.a();
    private final dtv ah = new dtv(new Rect());
    private noz ai;
    private fli aj;
    private mwx ak;
    private mwz al;
    private View am;
    private View an;
    private boolean ao;
    private boolean ap;
    private float aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private flk au;
    private amh av;
    private mwz aw;
    private final Runnable ax = new gor(this);
    private final Runnable ay = new gos(this);
    private final azh az = new got(this);
    ClippingImageView b;
    int c;
    ekp d;
    boolean e;
    gnb f;
    gpi g;
    float h;

    public goq()
    {
        aA.addUpdateListener(new gou(this));
        aA.addListener(new gov(this));
        aB.setInterpolator(new LinearInterpolator());
        aB.addUpdateListener(new gow(this));
    }

    private static Rect a(Point point, float f1, float f2)
    {
        Rect rect = new Rect();
        if (f2 > f1)
        {
            f1 = (float)point.x / f2;
            f2 = ((float)point.y - f1) / 2.0F;
            rect.set(0, (int)f2, point.x, (int)(f1 + f2));
            return rect;
        }
        if (f2 < f1)
        {
            f1 = (float)point.y * f2;
            f2 = ((float)point.x - f1) / 2.0F;
            rect.set((int)f2, 0, (int)(f1 + f2), point.y);
            return rect;
        } else
        {
            rect.set(0, 0, point.x, point.y);
            return rect;
        }
    }

    static View a(goq goq1, View view)
    {
        goq1.an = view;
        return view;
    }

    private frd a(View view)
    {
        if (view instanceof frd)
        {
            return (frd)view;
        }
        if (view instanceof ViewGroup)
        {
            for (int i1 = 0; i1 < ((ViewGroup)view).getChildCount(); i1++)
            {
                frd frd1 = a(((ViewGroup)view).getChildAt(i1));
                if (frd1 != null)
                {
                    return frd1;
                }
            }

        }
        return null;
    }

    static mwz a(goq goq1, mwz mwz)
    {
        goq1.aw = mwz;
        return mwz;
    }

    private void a(float f1, int i1, int j1, int k1, Rect rect, Rect rect1, float f2, 
            float f3, float f4, float f5, float f6, float f7, float f8, float f9)
    {
        if (ai.a())
        {
            noy.a("startColor", Integer.valueOf(j1));
            noy.a("endColor", Integer.valueOf(k1));
            noy.a("startClipRect", rect);
            noy.a("endClipRect", rect1);
            noy.a("startScale", Float.valueOf(f2));
            noy.a("endScale", Float.valueOf(f3));
            noy.a("startX", Float.valueOf(f4));
            noy.a("endX", Float.valueOf(f5));
            noy.a("startY", Float.valueOf(f6));
            noy.a("endY", Float.valueOf(f7));
            noy.a("startAlpha", Float.valueOf(f8));
            noy.a("endAlpha", Float.valueOf(f9));
        }
        float f10;
        if (aA.isRunning())
        {
            j1 = ((Integer)aA.getAnimatedValue("background")).intValue();
            rect = (Rect)aA.getAnimatedValue("clip_rect");
            f2 = ((Float)aA.getAnimatedValue("scale")).floatValue();
            f4 = ((Float)aA.getAnimatedValue("translate_x")).floatValue();
            f6 = ((Float)aA.getAnimatedValue("translate_y")).floatValue();
            f10 = ((Float)aA.getAnimatedValue("rotate")).floatValue();
            f8 = ((Float)aA.getAnimatedValue("alpha")).floatValue();
            f1 = ((Float)aA.getAnimatedValue("listener_position")).floatValue();
        } else
        if (aB.isRunning())
        {
            rect = (Rect)aB.getAnimatedValue("clip_rect");
            f10 = b.getRotation();
            aB.cancel();
        } else
        {
            f10 = b.getRotation();
        }
        aA.setValues(new PropertyValuesHolder[] {
            PropertyValuesHolder.ofObject("background", ag, new Object[] {
                Integer.valueOf(j1), Integer.valueOf(k1)
            }), PropertyValuesHolder.ofObject("clip_rect", ah, new Object[] {
                rect, rect1
            }), PropertyValuesHolder.ofFloat("scale", new float[] {
                f2, f3
            }), PropertyValuesHolder.ofFloat("translate_x", new float[] {
                f4, f5
            }), PropertyValuesHolder.ofFloat("translate_y", new float[] {
                f6, f7
            }), PropertyValuesHolder.ofFloat("alpha", new float[] {
                f8, f9
            }), PropertyValuesHolder.ofFloat("rotate", new float[] {
                f10, 0.0F
            }), PropertyValuesHolder.ofFloat("listener_position", new float[] {
                f1, (float)i1
            })
        });
        aA.setDuration(200L);
        aA.start();
    }

    private void a(Rect rect, Rect rect1)
    {
        if (ai.a())
        {
            noy.a("startClipRect", rect);
            noy.a("endClipRect", rect1);
        }
        if (aA.isRunning())
        {
            return;
        } else
        {
            aB.setValues(new PropertyValuesHolder[] {
                PropertyValuesHolder.ofObject("clip_rect", ah, new Object[] {
                    rect, rect1
                })
            });
            aB.start();
            return;
        }
    }

    static void a(goq goq1)
    {
        goq1.s();
    }

    static boolean a(goq goq1, boolean flag)
    {
        goq1.ar = true;
        return true;
    }

    static void b(goq goq1)
    {
        if (goq1.an != null)
        {
            goq1.an.setVisibility(0);
        }
        if (goq1.a != null)
        {
            goq1.a.o();
        }
    }

    static boolean b(goq goq1, boolean flag)
    {
        goq1.at = false;
        return false;
    }

    static ClippingImageView c(goq goq1)
    {
        return goq1.b;
    }

    static boolean c(goq goq1, boolean flag)
    {
        goq1.e = false;
        return false;
    }

    static boolean d(goq goq1)
    {
        return goq1.ar;
    }

    static boolean d(goq goq1, boolean flag)
    {
        goq1.ap = flag;
        return flag;
    }

    static mwz e(goq goq1)
    {
        return goq1.al;
    }

    static boolean e(goq goq1, boolean flag)
    {
        goq1.ao = flag;
        return flag;
    }

    static boolean f(goq goq1)
    {
        return goq1.e;
    }

    static boolean g(goq goq1)
    {
        return goq1.ap;
    }

    static Runnable h(goq goq1)
    {
        return goq1.ax;
    }

    static mwx i(goq goq1)
    {
        return goq1.ak;
    }

    static void j(goq goq1)
    {
        goz goz1 = goq1.y();
        if (goq1.c == gpb.a)
        {
            goq1.b.setScaleX(goz1.a);
            goq1.b.setScaleY(goz1.a);
            goq1.b.setTranslationX(goz1.b);
            goq1.b.setTranslationY(goz1.c);
            goq1.g.a(goz1.a, new PointF(goz1.b, goz1.c));
        } else
        {
            goq1.b.setScaleX(1.0F);
            goq1.b.setScaleY(1.0F);
            goq1.b.setTranslationX(goz1.f);
            goq1.b.setTranslationY(goz1.g);
            goq1.g.a(1.0F, new PointF(goz1.f, goz1.g));
        }
        goq1.b.setPivotX(goz1.l);
        goq1.b.setPivotY(goz1.m);
        goq1.b.setAlpha(1.0F);
        goq1.b.getLayoutParams().width = goz1.j;
        goq1.b.getLayoutParams().height = goz1.k;
        if (!goq1.at && goq1.c == gpb.a)
        {
            goq1.a(goz1.e, goz1.i);
        } else
        {
            goq1.b.a(goz1.i);
        }
        if (goq1.an != null)
        {
            goq1.an.setVisibility(4);
        }
        if (goq1.a != null)
        {
            goq1.a.m();
        }
    }

    static void k(goq goq1)
    {
        Object obj = new Point(goq1.b.getDrawable().getIntrinsicWidth(), goq1.b.getDrawable().getIntrinsicHeight());
        Point point = new Point(goq1.O_().findViewById(0x1020002).getWidth(), goq1.O_().findViewById(0x1020002).getHeight());
        obj = a(point, (float)point.x / (float)point.y, (float)((Point) (obj)).x / (float)((Point) (obj)).y);
        goq1.b.getLayoutParams().width = ((Rect) (obj)).width();
        goq1.b.getLayoutParams().height = ((Rect) (obj)).height();
        goq1.b.setTranslationX(((Rect) (obj)).left);
        goq1.b.setTranslationY(((Rect) (obj)).top);
        obj = new Rect(0, 0, ((Rect) (obj)).width(), ((Rect) (obj)).height());
        goq1.b.a(((Rect) (obj)));
        goq1.b.invalidate();
        if (goq1.a != null)
        {
            goq1.a.k();
        }
    }

    static boolean l(goq goq1)
    {
        return goq1.at;
    }

    static Runnable m(goq goq1)
    {
        return goq1.ay;
    }

    static View n(goq goq1)
    {
        return goq1.am;
    }

    static gpc o(goq goq1)
    {
        return goq1.a;
    }

    static int p(goq goq1)
    {
        return goq1.c;
    }

    static float q(goq goq1)
    {
        return goq1.aq;
    }

    static View r(goq goq1)
    {
        return goq1.an;
    }

    static azh s(goq goq1)
    {
        return goq1.az;
    }

    static amh t(goq goq1)
    {
        return goq1.av;
    }

    public static gpa x()
    {
        return new gpa();
    }

    private goz y()
    {
        goz goz1 = new goz();
        float f1;
        float f2;
        float f3;
        Object obj;
        Object obj1;
        Point point;
        Object obj2;
        if (an != null)
        {
            int ai1[] = new int[2];
            an.getLocationInWindow(ai1);
            int ai2[] = new int[2];
            O_().findViewById(0x1020002).getLocationInWindow(ai2);
            int i1 = ai1[0] - ai2[0];
            int i2 = ai1[1] - ai2[1];
            obj = new Rect(i1, i2, an.getWidth() + i1, an.getHeight() + i2);
        } else
        {
            obj = new Point(O_().findViewById(0x1020002).getWidth(), O_().findViewById(0x1020002).getHeight());
            obj = new Rect(((Point) (obj)).x / 2, ((Point) (obj)).y / 2, ((Point) (obj)).x / 2 + 1, ((Point) (obj)).y / 2 + 1);
        }
        point = new Point(b.getDrawable().getIntrinsicWidth(), b.getDrawable().getIntrinsicHeight());
        obj1 = new Point(O_().findViewById(0x1020002).getWidth(), O_().findViewById(0x1020002).getHeight());
        f3 = (float)((Point) (obj1)).x / (float)((Point) (obj1)).y;
        f1 = (float)point.x / (float)point.y;
        f2 = (float)((Rect) (obj)).width() / (float)((Rect) (obj)).height();
        obj1 = a(((Point) (obj1)), f3, f1);
        obj2 = new Rect(((Rect) (obj)));
        if (f1 > f2)
        {
            float f4 = (float)((Rect) (obj2)).height() * f1 - (float)((Rect) (obj2)).width();
            obj2.left = ((Rect) (obj2)).left - (int)(f4 / 2.0F);
            int j1 = ((Rect) (obj2)).right;
            obj2.right = (int)(f4 / 2.0F) + j1;
        } else
        if (f1 < f2)
        {
            float f5 = (float)((Rect) (obj2)).width() / f1 - (float)((Rect) (obj2)).height();
            obj2.top = ((Rect) (obj2)).top - (int)(f5 / 2.0F);
            int l1 = ((Rect) (obj2)).bottom;
            obj2.bottom = (int)(f5 / 2.0F) + l1;
        }
        goz1.a = (float)((Rect) (obj2)).width() / (float)((Rect) (obj1)).width();
        goz1.e = new Rect(0, 0, ((Rect) (obj1)).width(), ((Rect) (obj1)).height());
        if (f1 > f2)
        {
            f1 = (float)(((Rect) (obj)).left - ((Rect) (obj2)).left) / goz1.a;
            goz1.e.left = (int)f1;
            Rect rect = goz1.e;
            rect.right = rect.right - (int)f1;
        } else
        if (f1 < f2)
        {
            f1 = (float)(((Rect) (obj)).top - ((Rect) (obj2)).top) / goz1.a;
            goz1.e.top = (int)f1;
            Rect rect1 = goz1.e;
            rect1.bottom = rect1.bottom - (int)f1;
        }
        goz1.i = new Rect(0, 0, ((Rect) (obj1)).width(), ((Rect) (obj1)).height());
        goz1.b = (float)((Rect) (obj2)).left - ((1.0F - goz1.a) / 2.0F) * (float)((Rect) (obj1)).width();
        goz1.c = (float)((Rect) (obj2)).top - ((1.0F - goz1.a) / 2.0F) * (float)((Rect) (obj1)).height();
        goz1.f = ((Rect) (obj1)).left;
        goz1.g = ((Rect) (obj1)).top;
        if ((!e || c != gpb.a) && an == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        goz1.d = f1;
        goz1.h = 1.0F;
        obj2 = a(an);
        if (obj2 != null)
        {
            int k1 = au.b();
            f1 = Math.min((float)k1 / (float)point.x, (float)k1 / (float)point.y);
            obj = ((frd) (obj2)).a((int)((float)point.x * f1 + 0.5F), (int)((float)point.y * f1 + 0.5F), ((Rect) (obj)).width(), ((Rect) (obj)).height());
            goz1.b = goz1.b + (float)(int)(((PointF) (obj)).x + 0.5F);
            goz1.c = goz1.c + (float)(int)(((PointF) (obj)).y + 0.5F);
            f1 = 1.0F / goz1.a;
            k1 = (int)(((PointF) (obj)).x * f1 + 0.5F);
            int j2 = (int)(((PointF) (obj)).y * f1 + 0.5F);
            obj = goz1.e;
            obj.left = ((Rect) (obj)).left - k1;
            obj = goz1.e;
            obj.right = ((Rect) (obj)).right - k1;
            obj = goz1.e;
            obj.top = ((Rect) (obj)).top - j2;
            obj = goz1.e;
            obj.bottom = ((Rect) (obj)).bottom - j2;
        }
        goz1.j = ((Rect) (obj1)).width();
        goz1.k = ((Rect) (obj1)).height();
        goz1.l = ((Rect) (obj1)).width() / 2;
        goz1.m = ((Rect) (obj1)).height() / 2;
        return goz1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        am = layoutinflater.inflate(b.sQ, null);
        am.setOnTouchListener(new gox(this));
        b = (ClippingImageView)am.findViewById(af.t);
        f = new gnb(b, am, 1.0F, 0xff000000, 255, 0.85F, g(), this);
        g = new gpi(b, am, 0xff000000, this);
        return am;
    }

    public final void a()
    {
        c = gpb.b;
        if (b.getDrawable() != null)
        {
            s();
            return;
        } else
        {
            at = true;
            return;
        }
    }

    public final void a(float f1)
    {
        h = 1.0F - f1;
        if (a != null)
        {
            a.a(h);
        }
    }

    public final void a(int i1, ekp ekp1, View view)
    {
        c = i1;
        a(ekp1, view);
        b(i1);
        r();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aA.setInterpolator(b.d(ad));
        if (bundle != null)
        {
            ao = bundle.getBoolean("transition_on_start");
        }
    }

    void a(ekp ekp1, View view)
    {
        if (an != null)
        {
            an.setVisibility(0);
        }
        d = ekp1;
        an = view;
    }

    void a(ekp ekp1, View view, PointF pointf, float f1, float f2, int i1)
    {
        ap = true;
        a(ekp1, view);
        c = i1;
        as = false;
        ekp1 = g;
        ekp1.e = pointf;
        ekp1.f = f1;
        ekp1.g = f2;
        b(i1);
        r();
    }

    public final void au_()
    {
        super.au_();
        if (ao)
        {
            ao = false;
            ekp ekp1 = (ekp)super.q.getParcelable("com.google.android.apps.photos.core.media");
            a(gpb.a, ekp1, an);
        }
    }

    public final void b(float f1)
    {
        aq = f1;
        if (a != null)
        {
            a.a(f1);
        }
    }

    public final void b(int i1)
    {
        boolean flag = false;
        ar = false;
        aA.cancel();
        ak.a(aw);
        b.setImageDrawable(null);
        View view = am;
        if (i1 == gpb.a)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0xff000000;
        }
        view.setBackgroundColor(i1);
    }

    public final void c()
    {
        c = gpb.a;
        if (b.getDrawable() != null)
        {
            s();
            return;
        } else
        {
            at = true;
            return;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ak = (mwx)ae.a(mwx);
        au = (flk)ae.a(flk);
        aj = (fli)ae.a(fli);
        av = (amh)ae.a(amh);
        ai = noz.a(ad, 2, "PhotoTransitionFragment", new String[0]);
    }

    public final boolean d()
    {
        return e;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("transition_on_start", ao);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        f.onTouch(view, motionevent);
        return true;
    }

    void r()
    {
        gap gap1 = ((elt)d.a(elt)).e();
        al = ak.a(new goy(this), 350L);
        ame ame1 = av.f().a(aj.d()).a(gap1.g());
        ame1.b = av.f().a(aj.e()).a(gap1.g()).a(ayt.b(amb.b));
        ame1.a(az);
    }

    void s()
    {
        goz goz1 = y();
        b.getLayoutParams().width = goz1.j;
        b.getLayoutParams().height = goz1.k;
        b.requestLayout();
        b.a(goz1.e);
        if (an != null)
        {
            an.setVisibility(4);
        }
        b.setPivotX(goz1.l);
        b.setPivotY(goz1.m);
        if (e || ap)
        {
            if (c == gpb.a)
            {
                a(h, 1, ((ColorDrawable)am.getBackground()).getColor(), 0xff000000, goz1.i, goz1.i, b.getScaleX(), 1.0F, b.getX(), goz1.f, b.getY(), goz1.g, goz1.d, goz1.h);
                return;
            } else
            {
                a(h, 0, ((ColorDrawable)am.getBackground()).getColor(), 0, goz1.i, goz1.e, b.getScaleX(), goz1.a, b.getX(), goz1.b, b.getY(), goz1.c, goz1.h, goz1.d);
                return;
            }
        }
        b.setTranslationX(goz1.b);
        b.setTranslationY(goz1.c);
        b.setScaleX(goz1.a);
        b.setScaleY(goz1.a);
        if (c == gpb.a)
        {
            a(0.0F, 1, 0, 0xff000000, goz1.e, goz1.i, goz1.a, 1.0F, goz1.b, goz1.f, goz1.c, goz1.g, goz1.d, goz1.h);
            return;
        } else
        {
            a(1.0F, 0, 0xff000000, 0, goz1.i, goz1.e, 1.0F, goz1.a, goz1.f, goz1.b, goz1.g, goz1.c, goz1.h, goz1.d);
            return;
        }
    }

    public final void t()
    {
        c = gpb.a;
        if (b.getDrawable() != null)
        {
            s();
            return;
        } else
        {
            at = true;
            return;
        }
    }

    public final void u()
    {
        c = gpb.b;
        if (b.getDrawable() != null)
        {
            s();
            return;
        } else
        {
            at = true;
            return;
        }
    }

    public final boolean v()
    {
        return ap;
    }

    public final int w()
    {
        return c;
    }
}
