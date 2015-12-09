// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.aviary.android.feather.library.graphics.CircleF;
import com.aviary.android.feather.library.graphics.LineF;
import com.aviary.android.feather.library.graphics.a;
import it.sephiroth.android.library.easing.EasingManager;
import it.sephiroth.android.library.easing.d;
import it.sephiroth.android.library.easing.e;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            g

public class ImageViewTiltiShiftTouch extends ImageViewTouch
{
    class FadeOutRunnable
        implements Runnable
    {

        final ImageViewTiltiShiftTouch a;
        private volatile boolean b;
        private int c;
        private int d;
        private long e;
        private it.sephiroth.android.library.easing.b f;

        public void run()
        {
label0:
            {
                if (a.getContext() != null)
                {
                    if (!b)
                    {
                        e = System.currentTimeMillis();
                        c = a.f;
                        d = a.g;
                        b = true;
                    }
                    long l1 = System.currentTimeMillis();
                    double d1 = Math.min(a.k, l1 - e);
                    double d2 = f.a(d1, 0.0D, c, a.k);
                    double d3 = f.a(d1, 0.0D, d, a.k);
                    a.f = c - (int)d2;
                    a.g = d - (int)d3;
                    a.invalidate();
                    if (d1 >= (double)a.k)
                    {
                        break label0;
                    }
                    Handler handler = a.getHandler();
                    if (handler != null)
                    {
                        handler.post(this);
                    }
                }
                return;
            }
            a.invalidate();
        }

        FadeOutRunnable()
        {
            a = ImageViewTiltiShiftTouch.this;
            super();
            f = new d();
            b = false;
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void a(float af1[], float f1, float f2, float f3, float f4, float f5, float f6);

        public abstract void a(float af1[], b b1, float f1, float f2, float f3, float f4, float f5, 
                float f6);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/aviary/android/feather/sdk/widget/ImageViewTiltiShiftTouch$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("Radial", 0);
            b = new b("Linear", 1);
            c = new b("None", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static float T = 2.5F;
    private RectF U;
    private Matrix V;
    private Matrix W;
    int a;
    private int aA;
    private float aB;
    private float aC;
    private CircleF aa;
    private RectF ab;
    private RectF ac;
    private PointF ad;
    private PointF ae;
    private PointF af;
    private float ag;
    private float ah;
    private boolean ai;
    private a aj;
    private b ak;
    private int al;
    private int am;
    private float an;
    private int ao;
    private Path ap;
    private Path aq;
    private RectF ar;
    private RectF as;
    private float at;
    private float au;
    private float av[];
    private FadeOutRunnable aw;
    private boolean ax;
    private EasingManager ay;
    private g az;
    int b;
    protected Paint c;
    protected Paint d;
    protected boolean e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected float l;
    protected Matrix m;
    protected Matrix n;
    int o;
    int p;
    PointF q;
    float r;
    float s;
    LineF t;
    LineF u;

    public ImageViewTiltiShiftTouch(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryTiltShiftViewStyle);
    }

    public ImageViewTiltiShiftTouch(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = -1;
        b = 0xff000000;
        f = 200;
        g = 80;
        h = f;
        i = g;
        j = 1000;
        k = 200;
        l = 1.0F;
        m = new Matrix();
        n = new Matrix();
        q = new PointF();
        r = 0.0F;
        s = 0.0F;
        ak = b.c;
        an = 40F;
        av = new float[8];
        t = new LineF(0.0F, 0.0F, 0.0F, 0.0F);
        u = new LineF(0.0F, 0.0F, 0.0F, 0.0F);
    }

    private void a(PointF pointf, float f1, float f2, boolean flag)
    {
        if (ar != null)
        {
            ap.reset();
            W.setTranslate(pointf.x, pointf.y);
            f1 /= 2.0F;
            if (ak == com.aviary.android.feather.sdk.widget.b.a)
            {
                aa.a(pointf.x, pointf.y, f1);
                ap.addCircle(aa.a(), aa.b(), aa.c(), android.graphics.Path.Direction.CW);
                ab.set(pointf.x - T * f1, pointf.y - T * f1, pointf.x + T * f1, pointf.y + T * f1);
            } else
            if (ak == b.b)
            {
                V.setRotate(f2, pointf.x, pointf.y);
                U.set(pointf.x - f1, pointf.y - au / 2.0F, pointf.x + f1, pointf.y + au / 2.0F);
                U.sort();
                av[0] = U.left;
                av[1] = U.top;
                av[2] = U.left;
                av[3] = U.bottom;
                av[4] = U.right;
                av[5] = U.bottom;
                av[6] = U.right;
                av[7] = U.top;
                V.mapPoints(av);
                t.e();
                u.e();
                t.a(av[0], av[1], av[2], av[3]);
                u.a(av[4], av[5], av[6], av[7]);
                Object obj = null;
                PointF apointf[] = t.a(as);
                af1 = ((float []) (obj));
                if (apointf != null)
                {
                    af1 = ((float []) (obj));
                    if (apointf.length == 2)
                    {
                        ap.moveTo(apointf[0].x, apointf[0].y);
                        ap.lineTo(apointf[1].x, apointf[1].y);
                        af1 = new RectF(apointf[0].x, apointf[0].y, apointf[1].x, apointf[1].y);
                        af1.sort();
                    }
                }
                apointf = u.a(as);
                obj = af1;
                if (apointf != null)
                {
                    obj = af1;
                    if (apointf.length == 2)
                    {
                        ap.moveTo(apointf[0].x, apointf[0].y);
                        ap.lineTo(apointf[1].x, apointf[1].y);
                        obj = new RectF(apointf[0].x, apointf[0].y, apointf[1].x, apointf[1].y);
                        ((RectF) (obj)).sort();
                        if (af1 != null)
                        {
                            if (af1.isEmpty())
                            {
                                af1.set(((RectF) (af1)).left, ((RectF) (af1)).top, ((RectF) (obj)).right, ((RectF) (obj)).bottom);
                                af1.sort();
                                obj = af1;
                            } else
                            {
                                af1.union(((RectF) (obj)));
                                obj = af1;
                            }
                        }
                    }
                }
                if (obj != null)
                {
                    com.aviary.android.feather.library.graphics.a.a(((RectF) (obj)), T * f1, T * f1);
                    ab.set(((RectF) (obj)));
                } else
                {
                    ab.set(ar);
                }
            }
            if (aj != null)
            {
                float af1[] = new float[2];
                af1[0] = pointf.x;
                af1[1] = pointf.y;
                n.mapPoints(af1);
                n.mapRect(ac, ab);
                if (flag)
                {
                    aj.a(af1, ak, f1 / l, -f2 - 90F, ac.left, ac.top, ac.right, ac.bottom);
                    return;
                } else
                {
                    aj.a(af1, f1 / l, -f2 - 90F, ac.left, ac.top, ac.right, ac.bottom);
                    return;
                }
            }
        }
    }

    private void a(RectF rectf)
    {
        if (az != null && ax)
        {
            az.a(aB, aC, rectf);
        }
    }

    static boolean a(ImageViewTiltiShiftTouch imageviewtiltishifttouch)
    {
        return imageviewtiltishifttouch.ax;
    }

    public static float[] a(Matrix matrix)
    {
        float af1[] = new float[9];
        matrix.getValues(af1);
        return af1;
    }

    static g b(ImageViewTiltiShiftTouch imageviewtiltishifttouch)
    {
        return imageviewtiltishifttouch.az;
    }

    private void b(float f1, float f2, float f3, float f4)
    {
        ai = true;
        ad = new PointF(f1, f2);
        ae = new PointF(f3, f4);
        com.aviary.android.feather.library.graphics.a.a(ad, ae, 0.5F, af);
        ag = (float)Math.max(an, com.aviary.android.feather.library.graphics.a.b(ad, ae));
        ah = (float)(-com.aviary.android.feather.library.graphics.a.a(ad, ae)) + 90F;
        if (az != null && ax)
        {
            g.b b1 = az.a;
            g.c c1;
            if (ak == com.aviary.android.feather.sdk.widget.b.a)
            {
                c1 = com.aviary.android.feather.sdk.widget.g.c.a;
            } else
            {
                c1 = g.c.b;
            }
            b1.a(c1);
            az.a.b(0.0F);
            az.a(af.x, af.y);
            az.a(ah);
            f1 = (float)((double)ag / 2.5D);
            ay.a();
            ay.a(it/sephiroth/android/library/easing/e, it.sephiroth.android.library.easing.EasingManager.a.b, f1, aC + 100F, aA, 100L);
        }
    }

    private void h()
    {
        c();
    }

    private void i()
    {
        a(j);
        if (af != null)
        {
            Log.i("ImageViewTouchBase", (new StringBuilder()).append("center: ").append(af).toString());
        }
        if (aj != null)
        {
            aj.a();
        }
    }

    private void j()
    {
        if (ar != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ag > (at / 100F) * (float)al)
        {
            ag = (at / 100F) * (float)al;
        }
        if (ar.contains(af.x, af.y)) goto _L1; else goto _L3
_L3:
        if (af.x <= ar.right) goto _L5; else goto _L4
_L4:
        af.x = ar.right;
_L7:
        if (af.y > ar.bottom)
        {
            af.y = ar.bottom;
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (af.x < ar.left)
        {
            af.x = ar.left;
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (af.y >= ar.top) goto _L1; else goto _L8
_L8:
        af.y = ar.top;
        return;
    }

    private void k()
    {
        Matrix matrix = new Matrix(getImageMatrix());
        n.reset();
        float af1[] = a(matrix);
        matrix.invert(matrix);
        float af2[] = a(matrix);
        n.postTranslate(-af1[2], -af1[5]);
        n.postScale(af2[0], af2[4]);
        l = getScale();
        RectF rectf = getBitmapRect();
        boolean flag1;
        if (ar == null && rectf != null || ar != null && !ar.equals(rectf))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (rectf != null)
        {
            boolean flag2 = false;
            if (ar != null)
            {
                double d1 = com.aviary.android.feather.library.graphics.a.a(ar);
                double d2 = com.aviary.android.feather.library.graphics.a.a(rectf);
                float f1 = ar.left;
                float f2 = ar.top;
                float f4 = ar.width();
                float f3 = ar.height();
                f4 = rectf.width() / f4;
                f3 = rectf.height() / f3;
                boolean flag;
                if (!ar.equals(rectf))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag2 = flag;
                if (flag)
                {
                    double d3 = ag;
                    ag = (float)((d2 / d1) * d3);
                    af.offset(-f1, -f2);
                    PointF pointf = af;
                    pointf.x = pointf.x * f4;
                    pointf = af;
                    pointf.y = pointf.y * f3;
                    pointf = af;
                    pointf.x = pointf.x + rectf.left;
                    pointf = af;
                    pointf.y = pointf.y + rectf.top;
                    flag2 = flag;
                }
            }
            ar = new RectF(rectf);
            at = Math.max(ar.width(), ar.height());
            au = (float)Math.sqrt(Math.pow(ar.width(), 2D) + Math.pow(ar.height(), 2D));
            au = at * 1000F;
            an = (at / 100F) * (float)am;
            if (flag2)
            {
                h();
                a(af, ag, ah, true);
                i();
            }
        } else
        {
            ar = null;
        }
        if (flag1 && ax)
        {
            a(ar);
        }
    }

    protected void a()
    {
        ai = false;
        ad = null;
        ae = null;
        i();
        k();
        if (ar != null)
        {
            float f1 = ar.centerX();
            float f2 = ar.centerY();
            float f3 = Math.min(ar.width(), ar.height());
            f3 = Math.min(ao, f3 * 0.35F);
            b(f1, f2 - f3 / 2.0F, f1, f2 + f3 / 2.0F);
            h();
            a(af, ag, ah, true);
            i();
        }
        invalidate();
    }

    public void a(int i1, int j1)
    {
        aq.reset();
        if (e)
        {
            aq.addCircle(0.0F, 0.0F, i1, android.graphics.Path.Direction.CW);
            aq.moveTo(-i1, 0.0F);
            aq.lineTo(-i1 - j1, 0.0F);
            aq.moveTo(i1, 0.0F);
            aq.lineTo(i1 + j1, 0.0F);
            aq.moveTo(0.0F, -i1);
            aq.lineTo(0.0F, -i1 - j1);
            aq.moveTo(0.0F, i1);
            aq.lineTo(0.0F, i1 + j1);
        }
    }

    protected void a(long l1)
    {
        Handler handler = getHandler();
        if (handler != null)
        {
            handler.removeCallbacks(aw);
            aw = new FadeOutRunnable();
            handler.postDelayed(aw, l1);
        }
    }

    protected void a(Context context, AttributeSet attributeset, int i1)
    {
        super.a(context, attributeset, i1);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryTiltShiftImageView, i1, 0);
        i1 = context.getInteger(9, 1000);
        int j1 = context.getInteger(10, 200);
        int k1 = context.getColor(0, 0);
        int l1 = context.getColor(8, 0);
        int i2 = context.getDimensionPixelSize(1, 2);
        attributeset = context.getDrawable(11);
        int j2 = context.getInteger(3, 100);
        int k2 = context.getInteger(2, 10);
        int l2 = context.getDimensionPixelSize(4, 100);
        int i3 = context.getDimensionPixelSize(7, 6);
        int j3 = context.getDimensionPixelSize(6, 12);
        int k3 = context.getInteger(5, 2);
        aA = context.getInteger(14, 2000);
        aB = context.getDimensionPixelSize(12, 10);
        aC = context.getDimensionPixelSize(13, 200);
        e = context.getBoolean(15, true);
        ax = true;
        context.recycle();
        am = k2;
        al = j2;
        ao = l2;
        a = k1;
        b = l1;
        c = new Paint(1);
        c.setFilterBitmap(false);
        c.setDither(true);
        c.setColor(a);
        c.setAlpha(h);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setStrokeWidth(i2);
        d = new Paint(c);
        d.setStrokeWidth(k3);
        d.setColor(a);
        d.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        setFadeoutTimeout(i1);
        setFadeoutDuration(j1);
        ap = new Path();
        aq = new Path();
        U = new RectF();
        V = new Matrix();
        W = new Matrix();
        aa = new CircleF();
        af = new PointF();
        ab = new RectF();
        as = new RectF();
        ac = new RectF();
        ai = false;
        a(j3, i3);
        if (attributeset != null)
        {
            az = new g(attributeset);
            az.a.a(aB);
            az.a.b(0.0F);
        }
        ay = new EasingManager(new it.sephiroth.android.library.easing.EasingManager.b() {

            final ImageViewTiltiShiftTouch a;

            public void a(double d1)
            {
                if (com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.a(a))
                {
                    ImageViewTiltiShiftTouch.b(a).a.a((float)d1);
                    ImageViewTiltiShiftTouch.b(a).a.b(1.0F);
                    a.invalidate();
                }
            }

            public void a(double d1, double d2)
            {
                if (com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.a(a))
                {
                    ImageViewTiltiShiftTouch.b(a).a.a((float)d1);
                    a.invalidate();
                }
            }

            public void b(double d1)
            {
                if (com.aviary.android.feather.sdk.widget.ImageViewTiltiShiftTouch.a(a))
                {
                    ImageViewTiltiShiftTouch.b(a).a.a(0.0F);
                    ImageViewTiltiShiftTouch.b(a).a.b(0.0F);
                    a.invalidate();
                }
            }

            
            {
                a = ImageViewTiltiShiftTouch.this;
                super();
            }
        });
    }

    protected void b()
    {
        super.b();
        k();
    }

    protected void c()
    {
        Handler handler = getHandler();
        if (handler != null)
        {
            handler.removeCallbacks(aw);
            f = h;
            g = i;
            invalidate();
        }
    }

    public RectF getImageRect()
    {
        if (getDrawable() != null)
        {
            return new RectF(0.0F, 0.0F, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        } else
        {
            return null;
        }
    }

    public b getTiltShiftDrawMode()
    {
        return ak;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        break MISSING_BLOCK_LABEL_5;
        if (ar != null && ak != b.c)
        {
            float f1 = d.getStrokeWidth();
            int i1 = canvas.save(1);
            canvas.concat(W);
            if (e)
            {
                d.setStrokeWidth(f1 * 2.0F);
                d.setColor(b);
                d.setAlpha(g);
                canvas.drawPath(aq, d);
                d.setStrokeWidth(f1);
                d.setColor(a);
                d.setAlpha(f);
                canvas.drawPath(aq, d);
            }
            canvas.restoreToCount(i1);
            f1 = c.getStrokeWidth();
            c.setStrokeWidth(f1 * 2.0F);
            c.setColor(b);
            c.setAlpha(g);
            canvas.drawPath(ap, c);
            c.setStrokeWidth(f1);
            c.setColor(a);
            c.setAlpha(f);
            canvas.drawPath(ap, c);
            if (az != null && ax)
            {
                az.a(canvas);
                return;
            }
        }
        return;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        as.set(0.0F, 0.0F, i1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        int l1;
        int i2;
        i1 = 0;
        flag = false;
        i2 = motionevent.getAction();
        l1 = motionevent.getPointerCount();
        i2 & 0xff;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 74
    //                   1 753
    //                   2 452
    //                   3 753
    //                   4 68
    //                   5 201
    //                   6 371;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        invalidate();
        return true;
_L2:
        h();
        float f1 = motionevent.getX();
        float f5 = motionevent.getY();
        p = 0;
        o = motionevent.getPointerId(p);
        if (ad == null)
        {
            b(f1 - an / 2.0F, f5 - an / 2.0F, f1 + an / 2.0F, f5 + an / 2.0F);
            a(af, ag, ah, true);
        } else
        {
            ad = new PointF(f1, f5);
            a(af, ag, ah, true);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (l1 > 1 && ai)
        {
            float f2 = motionevent.getX(p);
            float f6 = motionevent.getY(p);
            float f9;
            float f11;
            if (p == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f9 = motionevent.getX(i1);
            i1 = ((flag) ? 1 : 0);
            if (p == 0)
            {
                i1 = 1;
            }
            f11 = motionevent.getY(i1);
            ad.set(f2, f6);
            ae.set(f9, f11);
            r = (float)com.aviary.android.feather.library.graphics.a.b(ad, ae);
            s = (float)(-com.aviary.android.feather.library.graphics.a.a(ad, ae)) + 180F;
            q = new PointF();
            com.aviary.android.feather.library.graphics.a.a(ad, ae, 0.5F, q);
            invalidate();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = (i2 & 0xff00) >> 8;
        if (motionevent.getPointerId(k1) == o && ai)
        {
            if (k1 == 0)
            {
                i1 = 1;
            }
            float f3 = motionevent.getX(i1);
            float f7 = motionevent.getY(i1);
            o = motionevent.getPointerId(i1);
            p = i1;
            ad.set(f3, f7);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = motionevent.findPointerIndex(o);
        float f4 = motionevent.getX(j1);
        float f8 = motionevent.getY(j1);
        float f10 = ad.x;
        float f12 = ad.y;
        ad.set(f4, f8);
        if (l1 > 1 && ai)
        {
            if (j1 == 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            f4 = motionevent.getX(j1);
            f8 = motionevent.getY(j1);
            ae.set(f4, f8);
            motionevent = new PointF();
            com.aviary.android.feather.library.graphics.a.a(ad, ae, 0.5F, motionevent);
            f4 = (float)com.aviary.android.feather.library.graphics.a.b(ad, ae);
            f8 = (float)(-com.aviary.android.feather.library.graphics.a.a(ad, ae)) + 180F;
            f10 = r;
            f12 = s;
            ag = Math.max(an, Math.abs((f4 - f10) + ag));
            ah = ah + (f8 - f12);
            af.offset(((PointF) (motionevent)).x - q.x, ((PointF) (motionevent)).y - q.y);
            r = f4;
            s = f8;
            q.set(((PointF) (motionevent)).x, ((PointF) (motionevent)).y);
        } else
        {
            af.offset(f4 - f10, f8 - f12);
        }
        j();
        a(af, ag, ah, false);
        continue; /* Loop/switch isn't completed */
_L3:
        o = -1;
        i();
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setFadeoutDuration(int i1)
    {
        k = i1;
    }

    public void setFadeoutTimeout(int i1)
    {
        j = i1;
    }

    public void setOnDrawStartListener(a a1)
    {
        aj = a1;
    }

    public void setPointWaveEnabled(boolean flag)
    {
        if (flag != ax && az != null)
        {
            ax = flag;
            if (flag && ar != null)
            {
                a(ar);
            }
        }
    }

    public void setTiltShiftDrawMode(b b1)
    {
        ak = b1;
        if (getDrawable() != null)
        {
            a();
        }
    }

}
