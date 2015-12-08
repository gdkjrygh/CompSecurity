// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.aviary.android.feather.common.utils.g;
import com.aviary.android.feather.library.graphics.a;
import it.sephiroth.android.library.easing.b;
import it.sephiroth.android.library.easing.c;
import it.sephiroth.android.library.easing.d;
import java.io.PrintStream;

public class AdjustImageView extends View
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        public final int d;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/widget/AdjustImageView$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("FLIP_NONE", 0, 1);
            b = new a("FLIP_HORIZONTAL", 1, 2);
            c = new a("FLIP_VERTICAL", 2, 4);
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1, int j1)
        {
            super(s1, i1);
            d = j1;
        }
    }

    public static interface b
    {

        public abstract void a();
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        private static final c j[];
        final int i;

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/sdk/widget/AdjustImageView$c, s1);
        }

        public static c[] values()
        {
            return (c[])j.clone();
        }

        static 
        {
            a = new c("MATRIX", 0, 0);
            b = new c("FIT_XY", 1, 1);
            c = new c("FIT_START", 2, 2);
            d = new c("FIT_CENTER", 3, 3);
            e = new c("FIT_END", 4, 4);
            f = new c("CENTER", 5, 5);
            g = new c("CENTER_CROP", 6, 6);
            h = new c("CENTER_INSIDE", 7, 7);
            j = (new c[] {
                a, b, c, d, e, f, g, h
            });
        }

        private c(String s1, int i1, int j1)
        {
            super(s1, i1);
            i = j1;
        }
    }


    private static final android.graphics.Matrix.ScaleToFit aP[];
    double A;
    boolean B;
    boolean C;
    int D;
    final int E;
    int F;
    boolean G;
    int H;
    int I;
    float J;
    float K;
    float L;
    float M;
    float N;
    float O;
    float P;
    float Q;
    float R;
    float S;
    Paint T;
    RectF U;
    boolean V;
    boolean W;
    boolean a;
    private Matrix aA;
    private Matrix aB;
    private Matrix aC;
    private RectF aD;
    private RectF aE;
    private int aF;
    private boolean aG;
    private boolean aH;
    private it.sephiroth.android.library.easing.b aI;
    private PointF aJ;
    private boolean aK;
    private b aL;
    private float aM;
    private float aN;
    private boolean aO;
    private boolean aQ;
    Handler aa;
    boolean ab;
    protected Handler ac;
    protected double ad;
    protected float ae;
    protected boolean af;
    protected final float ag[];
    protected int ah;
    private Uri ai;
    private int aj;
    private Matrix ak;
    private c al;
    private boolean am;
    private int an;
    private int ao;
    private ColorFilter ap;
    private int aq;
    private int ar;
    private boolean as;
    private Drawable at;
    private int au[];
    private boolean av;
    private int aw;
    private int ax;
    private int ay;
    private Matrix az;
    long b;
    long c;
    Path d;
    Path e;
    Rect f;
    RectF g;
    Paint h;
    Paint i;
    RectF j;
    Path k;
    Paint l;
    Drawable m;
    int n;
    int o;
    final int p;
    final int q;
    int r;
    int s;
    int t;
    boolean u;
    double v;
    double w;
    boolean x;
    float y;
    Matrix z;

    public AdjustImageView(Context context)
    {
        this(context, null);
    }

    public AdjustImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryAdjustImageViewStyle);
    }

    public AdjustImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        aj = 0;
        am = false;
        an = 0x7fffffff;
        ao = 0x7fffffff;
        aq = 255;
        ar = 256;
        as = false;
        at = null;
        au = null;
        av = false;
        aw = 0;
        az = null;
        aA = new Matrix();
        aB = new Matrix();
        aC = new Matrix();
        aD = new RectF();
        aE = new RectF();
        aF = -1;
        aG = false;
        aI = new it.sephiroth.android.library.easing.c();
        a = false;
        d = new Path();
        e = new Path();
        f = new Rect();
        g = new RectF();
        h = new Paint();
        i = new Paint();
        k = new Path();
        l = new Paint();
        p = 8;
        q = 8;
        u = false;
        v = 0.0D;
        w = 1.0D;
        x = true;
        y = 0.0F;
        z = new Matrix();
        A = 0.0D;
        B = true;
        C = false;
        D = 0;
        E = 50;
        F = 0;
        G = true;
        H = -1;
        I = -1;
        J = 0.0F;
        K = 0.0F;
        L = 0.0F;
        M = 0.0F;
        N = 0.0F;
        O = 0.0F;
        P = 0.0F;
        Q = 0.0F;
        R = 0.0F;
        S = 0.0F;
        T = new Paint();
        U = null;
        V = true;
        W = true;
        aa = new Handler();
        ac = new Handler();
        ad = 0.0D;
        ae = 0.0F;
        af = false;
        ag = new float[9];
        ah = com.aviary.android.feather.sdk.widget.a.a.d;
        a(context, attributeset, i1);
    }

    static double a(double d1)
    {
        double d2 = com.aviary.android.feather.library.graphics.a.a(d1);
        if (d2 >= 270D)
        {
            d1 = 360D - d2;
        } else
        {
            if (d2 >= 180D)
            {
                return d2 - 180D;
            }
            d1 = d2;
            if (d2 > 90D)
            {
                return 180D - d2;
            }
        }
        return d1;
    }

    static double a(AdjustImageView adjustimageview, Matrix matrix)
    {
        return adjustimageview.b(matrix);
    }

    private int a(int i1, int j1, int k1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(k1);
        k1 = android.view.View.MeasureSpec.getSize(k1);
        switch (l1)
        {
        default:
            return i1;

        case 0: // '\0'
            return Math.min(i1, j1);

        case -2147483648: 
            return Math.min(Math.min(i1, k1), j1);

        case 1073741824: 
            return k1;
        }
    }

    private static android.graphics.Matrix.ScaleToFit a(c c1)
    {
        return aP[c1.i - 1];
    }

    static it.sephiroth.android.library.easing.b a(AdjustImageView adjustimageview)
    {
        return adjustimageview.aI;
    }

    private void a(double d1, boolean flag)
    {
        PointF pointf = getCenter();
        Matrix matrix = new Matrix(az);
        RectF rectf = getImageRect();
        RectF rectf1 = getViewRect();
        matrix.setRotate((float)d1, pointf.x, pointf.y);
        matrix.mapRect(rectf);
        matrix.setRectToRect(rectf, rectf1, a(al));
        float af1[] = a(matrix);
        float f1 = Math.min(af1[0], af1[1]);
        if (flag)
        {
            aB.setRotate((float)d1, pointf.x, pointf.y);
            aB.postScale(f1, f1, pointf.x, pointf.y);
            return;
        } else
        {
            aB.setScale(f1, f1, pointf.x, pointf.y);
            aB.postRotate((float)d1, pointf.x, pointf.y);
            return;
        }
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        ak = new Matrix();
        al = com.aviary.android.feather.sdk.widget.c.d;
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryAdjustImageView, i1, 0);
        m = context.getDrawable(1);
        i1 = context.getColor(7, 0);
        int j1 = context.getColor(9, 0);
        int k1 = context.getDimensionPixelSize(8, 2);
        int l1 = context.getDimensionPixelSize(5, 1);
        int i2 = context.getColor(6, 0);
        c = context.getInteger(10, 400);
        b = context.getInteger(2, 200);
        boolean flag = context.getBoolean(3, false);
        boolean flag1 = context.getBoolean(4, true);
        context.recycle();
        setCameraEnabled(flag);
        setEnableFreeRotate(flag1);
        double d1 = m.getIntrinsicWidth();
        double d2 = m.getIntrinsicHeight();
        n = (int)Math.ceil(d1 / 2D);
        o = (int)Math.ceil(d2 / 2D);
        h.setStrokeWidth(k1);
        h.setStyle(android.graphics.Paint.Style.STROKE);
        h.setAntiAlias(true);
        h.setColor(i1);
        i.setStyle(android.graphics.Paint.Style.FILL);
        i.setAntiAlias(false);
        i.setColor(i2);
        i.setDither(false);
        try
        {
            com.aviary.android.feather.common.utils.g.a(i, "setHinting", new Class[] {
                Integer.TYPE
            }, new Object[] {
                Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        l.setStrokeWidth(l1);
        l.setAntiAlias(false);
        l.setDither(false);
        l.setStyle(android.graphics.Paint.Style.STROKE);
        l.setColor(j1);
        try
        {
            com.aviary.android.feather.common.utils.g.a(l, "setHinting", new Class[] {
                Integer.TYPE
            }, new Object[] {
                Integer.valueOf(0)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        s = i.getAlpha();
        r = h.getAlpha();
        t = l.getAlpha();
        h.setAlpha(0);
        i.setAlpha(0);
        l.setAlpha(0);
    }

    private void a(Drawable drawable)
    {
        if (at != null)
        {
            at.setCallback(null);
            unscheduleDrawable(at);
        }
        at = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            if (drawable.isStateful())
            {
                drawable.setState(getDrawableState());
            }
            drawable.setLevel(aw);
            ax = drawable.getIntrinsicWidth();
            ay = drawable.getIntrinsicHeight();
            i();
            h();
            return;
        } else
        {
            ay = -1;
            ax = -1;
            return;
        }
    }

    static void a(AdjustImageView adjustimageview, double d1)
    {
        adjustimageview.setStraightenRotation(d1);
    }

    static void a(AdjustImageView adjustimageview, double d1, boolean flag)
    {
        adjustimageview.a(d1, flag);
    }

    private void a(boolean flag, boolean flag1)
    {
        invalidate();
        PointF pointf = getCenter();
        if (flag)
        {
            ah = ah ^ com.aviary.android.feather.sdk.widget.a.b.d;
            az.postScale(-1F, 1.0F, pointf.x, pointf.y);
        }
        if (flag1)
        {
            ah = ah ^ com.aviary.android.feather.sdk.widget.a.c.d;
            az.postScale(1.0F, -1F, pointf.x, pointf.y);
        }
        aB.postRotate((float)(-ad * 2D), pointf.x, pointf.y);
        ad = com.aviary.android.feather.library.graphics.a.a(b(aB));
        aC.reset();
    }

    private double b(Matrix matrix)
    {
        float af1[] = new float[4];
        float[] _tmp = af1;
        af1[0] = 0.0F;
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = -100F;
        matrix.mapPoints(af1);
        return -com.aviary.android.feather.library.graphics.a.a(af1[0], af1[1], af1[2], af1[3], 0.0F);
    }

    static void b(AdjustImageView adjustimageview)
    {
        adjustimageview.k();
    }

    static boolean c(AdjustImageView adjustimageview)
    {
        return adjustimageview.aQ;
    }

    static Matrix d(AdjustImageView adjustimageview)
    {
        return adjustimageview.aC;
    }

    private void d()
    {
        if (ab)
        {
            a(100);
            return;
        } else
        {
            c(200);
            return;
        }
    }

    static Matrix e(AdjustImageView adjustimageview)
    {
        return adjustimageview.az;
    }

    private void e()
    {
        invalidate();
        b(200);
    }

    static Matrix f(AdjustImageView adjustimageview)
    {
        return adjustimageview.aB;
    }

    private void f()
    {
        Object obj = null;
        if (at == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        return;
_L2:
        if ((obj1 = getResources()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (aj == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((Resources) (obj1)).getDrawable(aj);
        obj = obj1;
_L3:
        a(((Drawable) (obj)));
        return;
        Exception exception;
        exception;
        Log.w("rotate", (new StringBuilder()).append("Unable to find resource: ").append(aj).toString(), exception);
        ai = null;
          goto _L3
        if (ai == null) goto _L1; else goto _L4
_L4:
        obj = ai.getScheme();
        if ("android.resource".equals(obj))
        {
            obj = null;
        } else
        if ("content".equals(obj) || "file".equals(obj))
        {
            try
            {
                obj = Drawable.createFromStream(getContext().getContentResolver().openInputStream(ai), null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("rotate", (new StringBuilder()).append("Unable to open content: ").append(ai).toString(), ((Throwable) (obj)));
                obj = null;
            }
        } else
        {
            obj = Drawable.createFromPath(ai.toString());
        }
        if (obj == null)
        {
            System.out.println((new StringBuilder()).append("resolveUri failed on bad bitmap uri: ").append(ai).toString());
            ai = null;
        }
          goto _L3
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void g()
    {
        Drawable drawable = at;
        if (drawable != null)
        {
            int j1 = drawable.getIntrinsicWidth();
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = ax;
            }
            int k1 = drawable.getIntrinsicHeight();
            j1 = k1;
            if (k1 < 0)
            {
                j1 = ay;
            }
            if (i1 != ax || j1 != ay)
            {
                ax = i1;
                ay = j1;
                requestLayout();
            }
        }
    }

    private PointF getCenter()
    {
        if (aJ == null)
        {
            int i1 = getWidth();
            int j1 = getPaddingLeft();
            int k1 = getPaddingRight();
            int l1 = getHeight();
            int i2 = getPaddingTop();
            int j2 = getPaddingBottom();
            aJ = new PointF((float)(i1 - j1 - k1) / 2.0F, (float)(l1 - i2 - j2) / 2.0F);
        }
        return aJ;
    }

    private RectF getImageRect()
    {
        return new RectF(0.0F, 0.0F, ax, ay);
    }

    private RectF getViewRect()
    {
        int i1 = getWidth();
        int j1 = getPaddingLeft();
        int k1 = getPaddingRight();
        int l1 = getHeight();
        int i2 = getPaddingTop();
        int j2 = getPaddingBottom();
        return new RectF(0.0F, 0.0F, i1 - j1 - k1, l1 - i2 - j2);
    }

    private void h()
    {
        float f1 = 0.0F;
        if (at == null || !aH)
        {
            return;
        }
        int i1 = ax;
        int j1 = ay;
        int k1 = getWidth() - getPaddingLeft() - getPaddingRight();
        int l1 = getHeight() - getPaddingTop() - getPaddingBottom();
        boolean flag;
        if ((i1 < 0 || k1 == i1) && (j1 < 0 || l1 == j1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 <= 0 || j1 <= 0 || com.aviary.android.feather.sdk.widget.c.b == al)
        {
            at.setBounds(0, 0, k1, l1);
            az = null;
            return;
        }
        at.setBounds(0, 0, i1, j1);
        if (com.aviary.android.feather.sdk.widget.c.a == al)
        {
            if (ak.isIdentity())
            {
                az = null;
                return;
            } else
            {
                az = ak;
                return;
            }
        }
        if (flag)
        {
            az = null;
            return;
        }
        if (c.f == al)
        {
            az = ak;
            az.setTranslate((int)((float)(k1 - i1) * 0.5F + 0.5F), (int)((float)(l1 - j1) * 0.5F + 0.5F));
            return;
        }
        if (com.aviary.android.feather.sdk.widget.c.g == al)
        {
            az = ak;
            float f4;
            float f6;
            if (i1 * l1 > k1 * j1)
            {
                f6 = (float)l1 / (float)j1;
                f4 = ((float)k1 - (float)i1 * f6) * 0.5F;
            } else
            {
                f6 = (float)k1 / (float)i1;
                f1 = l1;
                float f8 = j1;
                f4 = 0.0F;
                f1 = (f1 - f8 * f6) * 0.5F;
            }
            az.setScale(f6, f6);
            az.postTranslate((int)(f4 + 0.5F), (int)(f1 + 0.5F));
            return;
        }
        if (c.h == al)
        {
            az = ak;
            float f2;
            float f5;
            float f7;
            if (i1 <= k1 && j1 <= l1)
            {
                f2 = 1.0F;
            } else
            {
                f2 = Math.min((float)k1 / (float)i1, (float)l1 / (float)j1);
            }
            f5 = (int)(((float)k1 - (float)i1 * f2) * 0.5F + 0.5F);
            f7 = (int)(((float)l1 - (float)j1 * f2) * 0.5F + 0.5F);
            az.setScale(f2, f2);
            az.postTranslate(f5, f7);
            return;
        } else
        {
            aD.set(0.0F, 0.0F, i1, j1);
            aE.set(0.0F, 0.0F, k1, l1);
            az = ak;
            az.setRectToRect(aD, aE, a(al));
            ae = a(az)[0];
            Matrix matrix = new Matrix(ak);
            RectF rectf = new RectF();
            RectF rectf1 = new RectF();
            rectf.set(0.0F, 0.0F, j1, i1);
            rectf1.set(0.0F, 0.0F, k1, l1);
            matrix.setRectToRect(rectf, rectf1, a(al));
            matrix = new Matrix(az);
            matrix.invert(matrix);
            float f3 = a(matrix)[0];
            az.postScale(f3, f3, k1 / 2, l1 / 2);
            aB.reset();
            z.reset();
            aC.reset();
            ah = com.aviary.android.feather.sdk.widget.a.a.d;
            ad = 0.0D;
            aB.postScale(ae, ae, k1 / 2, l1 / 2);
            j = getImageRect();
            getCenter();
            return;
        }
    }

    private void i()
    {
        if (at != null && as)
        {
            at = at.mutate();
            at.setColorFilter(ap);
            at.setAlpha(aq * ar >> 8);
        }
    }

    private void j()
    {
        z.reset();
        u = false;
        v = 0.0D;
        w = 1.0D;
        x = true;
        y = 0.0F;
        A = 0.0D;
    }

    private void k()
    {
        if (a)
        {
            double d1 = getRotation();
            double d3 = getStraightenAngle();
            boolean flag1 = getStraightenStarted();
            u = false;
            double d2 = d1 % 360D;
            d1 = d2;
            if (d2 > 180D)
            {
                d1 = d2 - 360D;
            }
            boolean flag2 = getHorizontalFlip();
            boolean flag3 = getVerticalFlip();
            V = false;
            invalidate();
            boolean flag;
            if (d1 != 0.0D || flag1)
            {
                if (flag1)
                {
                    a(-d3, (int)getCenter().x, b);
                } else
                {
                    a(-d1, b);
                }
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2)
            {
                b(true, b);
                flag = true;
            }
            if (flag3)
            {
                b(false, b);
                flag = true;
            }
            if (!flag)
            {
                l();
            }
        }
    }

    private void l()
    {
        if (aL != null)
        {
            aL.a();
        }
    }

    private void setStraightenRotation(double d1)
    {
        PointF pointf = getCenter();
        z.postRotate((float)(-v), pointf.x, pointf.y);
        z.postRotate((float)d1, pointf.x, pointf.y);
        v = d1;
        double d2 = a(1.0D / w, 1.0D);
        z.postScale((float)d2, (float)d2, pointf.x, pointf.y);
        int i1 = getPaddingLeft();
        int j1 = getPaddingRight();
        int k1 = getPaddingTop();
        int l1 = getPaddingBottom();
        if (C)
        {
            double d3 = Math.sin(Math.toRadians(d1));
            double d4 = Math.cos(Math.toRadians(d1));
            float af1[] = new float[8];
            af1[0] = (float)((double)U.left + (double)i1 * d3 + (double)i1 * d4);
            af1[1] = (float)(((double)U.top - (double)k1 * d3) + (double)i1 * d4);
            af1[2] = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            af1[3] = (float)(((double)U.top - (double)k1 * d3) + (double)i1 * d4);
            af1[4] = (float)((double)U.left + (double)i1 * d3 + (double)i1 * d4);
            af1[5] = (float)(((double)U.bottom - (double)l1 * d3) + (double)l1 * d4);
            af1[6] = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            af1[7] = (float)(((double)U.bottom - (double)l1 * d3) + (double)l1 * d4);
            z.mapPoints(af1);
            float f1 = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            float f2 = (float)(((double)U.top - (double)k1 * d3) + (double)k1 * d4);
            float f3 = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            double d5 = U.bottom;
            double d6 = l1;
            float f4 = (float)(d4 * (double)l1 + (d5 - d6 * d3));
            float f5 = af1[2];
            float f6 = af1[3];
            float f7 = af1[6];
            float f8 = af1[7];
            d4 = (f1 * f4 - f2 * f3) * (f6 - f8) - (f2 - f4) * (f5 * f8 - f6 * f7);
            d5 = (f6 - f8) * (f1 - f3) - (f5 - f7) * (f2 - f4);
            d6 = U.right + (float)j1;
            double d7 = d4 / d5;
            double d8 = l1;
            D = getResources().getConfiguration().orientation;
            if (D == 2 && d1 > 0.0D)
            {
                d3 = d4 / d5 + d3 * (double)l1;
            } else
            {
                d3 = d7 + d8;
            }
            d5 = d6 - (double)f3;
            d4 = d3 - (double)f4;
            if (d1 < 0.0D)
            {
                d5 = d6 - (double)f1;
                d4 = d3 - (double)f2;
            }
            d3 = Math.sqrt(d4 * d4 + d5 * d5);
            d4 = Math.sin(Math.toRadians(Math.abs(d1)));
            d5 = Math.sqrt((af1[0] - af1[2]) * (af1[0] - af1[2]));
            if (d1 != 0.0D)
            {
                d1 = a((d3 * 2D * d4 + d5) / d5, 1.0D);
                z.postScale((float)d1, (float)d1, pointf.x, pointf.y);
            } else
            {
                d1 = 1.0D;
            }
        } else
        {
            d3 = Math.sin(Math.toRadians(d1));
            d4 = Math.cos(Math.toRadians(d1));
            af1 = new float[8];
            af1[0] = (float)((double)U.left + (double)i1 * d3 + (double)i1 * d4);
            af1[1] = (float)(((double)U.top - (double)k1 * d3) + (double)i1 * d4);
            af1[2] = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            af1[3] = (float)(((double)U.top - (double)k1 * d3) + (double)i1 * d4);
            af1[4] = (float)((double)U.left + (double)i1 * d3 + (double)i1 * d4);
            af1[5] = (float)(((double)U.bottom - (double)l1 * d3) + (double)l1 * d4);
            af1[6] = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            af1[7] = (float)(((double)U.bottom - (double)l1 * d3) + (double)l1 * d4);
            z.mapPoints(af1);
            f1 = (float)((double)U.left + (double)i1 * d3 + (double)i1 * d4);
            f2 = (float)(((double)U.bottom - (double)l1 * d3) + (double)l1 * d4);
            f3 = (float)((double)U.right + (double)j1 * d3 + (double)j1 * d4);
            f4 = (float)(((double)U.bottom - d3 * (double)l1) + d4 * (double)l1);
            f5 = af1[4];
            f6 = af1[5];
            f7 = af1[6];
            f8 = af1[7];
            d6 = (double)((f1 * f4 - f2 * f3) * (f5 - f7) - (f1 - f3) * (f5 * f8 - f6 * f7)) / (double)((f6 - f8) * (f1 - f3) - (f5 - f7) * (f2 - f4)) + (double)i1;
            d5 = U.bottom + (float)l1;
            d4 = d6 - (double)f1;
            d3 = d5 - (double)f2;
            if (d1 < 0.0D)
            {
                d4 = d6 - (double)f3;
                d3 = d5 - (double)f4;
            }
            d3 = Math.sqrt(d3 * d3 + d4 * d4);
            d4 = Math.sin(Math.toRadians(Math.abs(d1)));
            d5 = Math.sqrt((af1[5] - af1[1]) * (af1[5] - af1[1]));
            if (d1 != 0.0D)
            {
                d1 = a((d3 * 2D * d4 + d5) / d5, 1.0D);
                z.postScale((float)d1, (float)d1, pointf.x, pointf.y);
            } else
            {
                d1 = 1.0D;
            }
        }
        w = d1;
    }

    protected double a(double d1, double d2)
    {
        double d3;
label0:
        {
            if (!Double.isInfinite(d1))
            {
                d3 = d1;
                if (!Double.isNaN(d1))
                {
                    break label0;
                }
            }
            Log.e("rotate", "number is NaN or Infinite");
            d3 = d2;
        }
        return d3;
    }

    protected float a(Matrix matrix, int i1)
    {
        matrix.getValues(ag);
        return ag[i1];
    }

    RectF a(float f1, float f2, double d1, float f3, float f4, PointF pointf, 
            Canvas canvas)
    {
        double d2 = com.aviary.android.feather.library.graphics.a.c(d1);
        PointF apointf1[] = new PointF[4];
        apointf1[0] = new PointF(0.0F, 0.0F);
        apointf1[1] = new PointF(f1, 0.0F);
        apointf1[2] = new PointF(f1, f2);
        apointf1[3] = new PointF(0.0F, f2);
        com.aviary.android.feather.library.graphics.a.a(apointf1, -f1 / 2.0F, -f2 / 2.0F);
        PointF apointf[] = new PointF[apointf1.length];
        System.arraycopy(apointf1, 0, apointf, 0, apointf1.length);
        com.aviary.android.feather.library.graphics.a.a(apointf, d2);
        if (d1 >= 0.0D)
        {
            PointF apointf2[] = new PointF[2];
            apointf2[0] = new PointF(0.0F, 0.0F);
            apointf2[1] = new PointF(-f3 / 2.0F, -f4 / 2.0F);
            PointF apointf3[] = new PointF[2];
            apointf3[0] = apointf[0];
            apointf3[1] = apointf[3];
            Object obj = com.aviary.android.feather.library.graphics.a.a(apointf2, apointf3);
            PointF apointf4[] = new PointF[2];
            apointf4[0] = new PointF(0.0F, 0.0F);
            apointf4[1] = new PointF(f3 / 2.0F, -f4 / 2.0F);
            PointF apointf5[] = new PointF[2];
            apointf5[0] = apointf[0];
            apointf5[1] = apointf[1];
            PointF pointf1 = com.aviary.android.feather.library.graphics.a.a(apointf4, apointf5);
            obj = new PointF(Math.max(((PointF) (obj)).x, -pointf1.x), Math.max(((PointF) (obj)).y, pointf1.y));
            obj = new RectF(((PointF) (obj)).x, ((PointF) (obj)).y, -((PointF) (obj)).x, -((PointF) (obj)).y);
            ((RectF) (obj)).offset(pointf.x, pointf.y);
            if (canvas != null)
            {
                com.aviary.android.feather.library.graphics.a.a(apointf, pointf.x, pointf.y);
                com.aviary.android.feather.library.graphics.a.a(apointf2, pointf.x, pointf.y);
                com.aviary.android.feather.library.graphics.a.a(apointf4, pointf.x, pointf.y);
                pointf = new Paint(1);
                pointf.setColor(0x66ffff00);
                pointf.setStyle(android.graphics.Paint.Style.STROKE);
                pointf.setStrokeWidth(2.0F);
                b(apointf, canvas, pointf);
                pointf.setColor(0xff00ff00);
                a(apointf2, canvas, ((Paint) (pointf)));
                pointf.setColor(0xff0000ff);
                a(apointf4, canvas, ((Paint) (pointf)));
                pointf.setColor(0xff00ffff);
                a(apointf3, canvas, ((Paint) (pointf)));
                pointf.setColor(-1);
                a(apointf5, canvas, ((Paint) (pointf)));
                pointf.setColor(0xff888888);
                canvas.drawRect(((RectF) (obj)), pointf);
            }
            return ((RectF) (obj));
        } else
        {
            throw new IllegalArgumentException("angle cannot be < 0");
        }
    }

    protected void a()
    {
        ab = false;
        i.setAlpha(0);
        h.setAlpha(0);
        l.setAlpha(0);
        invalidate();
    }

    public void a(double d1, float f1)
    {
        if (af)
        {
            return;
        } else
        {
            u = true;
            m.setBounds((int)(f1 - (float)n), (int)(U.bottom - (float)o), (int)((float)n + f1), (int)(U.bottom + (float)o));
            setStraightenRotation(d1);
            aN = f1;
            invalidate();
            return;
        }
    }

    public void a(double d1, int i1, long l1)
    {
        if (af)
        {
            return;
        } else
        {
            af = true;
            u = true;
            long l2 = System.currentTimeMillis();
            int j1 = m.getBounds().centerX();
            double d2 = getStraightenAngle();
            double d3 = getStraightenAngle();
            invalidate();
            ac.post(new Runnable(l1, l2, d1, i1, j1, d3, d2 + d1) {

                final long a;
                final long b;
                final double c;
                final int d;
                final int e;
                final double f;
                final double g;
                final AdjustImageView h;

                public void run()
                {
                    long l3 = System.currentTimeMillis();
                    float f1 = Math.min(a, l3 - b);
                    double d4 = com.aviary.android.feather.sdk.widget.AdjustImageView.a(h).b(f1, 0.0D, c, a);
                    double d5 = com.aviary.android.feather.sdk.widget.AdjustImageView.a(h).b(f1, 0.0D, d, a);
                    h.m.setBounds((int)(((double)e + d5) - (double)h.n), (int)(h.U.bottom - (float)h.o), (int)(d5 + (double)e + (double)h.n), (int)(h.U.bottom + (float)h.o));
                    com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, f + d4);
                    h.invalidate();
                    if (f1 < (float)a)
                    {
                        h.ac.post(this);
                    } else
                    {
                        h.m.setBounds(d - h.n, (int)(h.U.bottom - (float)h.o), d + h.n, (int)(h.U.bottom + (float)h.o));
                        com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, g);
                        h.af = false;
                        h.invalidate();
                        if (h.a)
                        {
                            h.u = false;
                            com.aviary.android.feather.sdk.widget.AdjustImageView.b(h);
                            return;
                        }
                    }
                }

            
            {
                h = AdjustImageView.this;
                a = l1;
                b = l2;
                c = d1;
                d = i1;
                e = j1;
                f = d2;
                g = d3;
                super();
            }
            });
            return;
        }
    }

    protected void a(double d1, long l1)
    {
        if (!af)
        {
            af = true;
            long l2 = System.currentTimeMillis();
            double d2 = ad;
            double d3 = ad;
            a(ad, false);
            invalidate();
            ac.post(new Runnable(l1, l2, d1, d3, d2 + d1) {

                float a;
                float b;
                final long c;
                final long d;
                final double e;
                final double f;
                final double g;
                final AdjustImageView h;

                public void run()
                {
                    long l3 = System.currentTimeMillis();
                    float f1 = Math.min(c, l3 - d);
                    float f2 = (float)com.aviary.android.feather.sdk.widget.AdjustImageView.a(h).b(f1, 0.0D, e, c);
                    h.ad = com.aviary.android.feather.library.graphics.a.a(f + (double)f2);
                    com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, h.ad, false);
                    b = f2;
                    h.V = true;
                    h.invalidate();
                    if (f1 < (float)c)
                    {
                        h.ac.post(this);
                    } else
                    {
                        h.ad = com.aviary.android.feather.library.graphics.a.a(g);
                        com.aviary.android.feather.sdk.widget.AdjustImageView.a(h, h.ad, true);
                        h.V = true;
                        h.af = false;
                        h.invalidate();
                        h.b();
                        if (h.a)
                        {
                            com.aviary.android.feather.sdk.widget.AdjustImageView.b(h);
                            return;
                        }
                    }
                }

            
            {
                h = AdjustImageView.this;
                c = l1;
                d = l2;
                e = d1;
                f = d2;
                g = d3;
                super();
                a = 0.0F;
                b = 0.0F;
            }
            });
            if (u && !a)
            {
                V = true;
                j();
                invalidate();
                return;
            }
        }
    }

    protected void a(int i1)
    {
        long l1 = System.currentTimeMillis();
        float f1 = l.getAlpha();
        d d1 = new d();
        aa.post(new Runnable(i1, l1, d1, f1) {

            final int a;
            final long b;
            final d c;
            final float d;
            final AdjustImageView e;

            public void run()
            {
                long l2 = System.currentTimeMillis();
                float f2 = Math.min(a, l2 - b);
                float f3 = (float)c.c(f2, d, e.t, a);
                e.l.setAlpha((int)f3);
                e.invalidate();
                if (f2 < (float)a)
                {
                    e.aa.post(this);
                    return;
                } else
                {
                    e.l.setAlpha(e.t);
                    e.invalidate();
                    return;
                }
            }

            
            {
                e = AdjustImageView.this;
                a = i1;
                b = l1;
                c = d1;
                d = f1;
                super();
            }
        });
    }

    public final void a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        setColorFilter(new PorterDuffColorFilter(i1, mode));
    }

    public void a(boolean flag)
    {
        a(flag, c);
    }

    public void a(boolean flag, long l1)
    {
        int i1;
        if (flag)
        {
            i1 = 90;
        } else
        {
            i1 = -90;
        }
        a(i1, l1);
        a();
        if (!C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = flag;
    }

    void a(PointF apointf[], Canvas canvas, Paint paint)
    {
        canvas.drawLine(apointf[0].x, apointf[0].y, apointf[1].x, apointf[1].y, paint);
    }

    protected float[] a(Matrix matrix)
    {
        return (new float[] {
            a(matrix, 0), a(matrix, 4)
        });
    }

    public void b()
    {
        boolean flag1 = true;
        Log.i("rotate", "details:");
        StringBuilder stringbuilder = (new StringBuilder()).append(" flip horizontal: ");
        boolean flag;
        if ((ah & com.aviary.android.feather.sdk.widget.a.b.d) == com.aviary.android.feather.sdk.widget.a.b.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.d("rotate", stringbuilder.append(flag).toString());
        stringbuilder = (new StringBuilder()).append(" flip vertical: ");
        if ((ah & com.aviary.android.feather.sdk.widget.a.c.d) == com.aviary.android.feather.sdk.widget.a.c.d)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Log.d("rotate", stringbuilder.append(flag).toString());
        Log.d("rotate", (new StringBuilder()).append(" rotation: ").append(ad).toString());
        Log.d("rotate", "--------");
    }

    protected void b(int i1)
    {
        long l1 = System.currentTimeMillis();
        float f1 = l.getAlpha();
        d d1 = new d();
        aa.post(new Runnable(i1, l1, d1, f1) {

            final int a;
            final long b;
            final d c;
            final float d;
            final AdjustImageView e;

            public void run()
            {
                long l2 = System.currentTimeMillis();
                float f2 = Math.min(a, l2 - b);
                float f3 = (float)c.c(f2, 0.0D, d, a);
                e.l.setAlpha((int)d - (int)f3);
                e.invalidate();
                if (f2 < (float)a)
                {
                    e.aa.post(this);
                    return;
                } else
                {
                    e.l.setAlpha(0);
                    e.invalidate();
                    return;
                }
            }

            
            {
                e = AdjustImageView.this;
                a = i1;
                b = l1;
                c = d1;
                d = f1;
                super();
            }
        });
    }

    public void b(boolean flag)
    {
        b(flag, c);
    }

    protected void b(boolean flag, long l1)
    {
        c(flag, l1);
        a();
    }

    void b(PointF apointf[], Canvas canvas, Paint paint)
    {
        Path path = new Path();
        path.moveTo(apointf[0].x, apointf[0].y);
        path.lineTo(apointf[1].x, apointf[1].y);
        path.lineTo(apointf[2].x, apointf[2].y);
        path.lineTo(apointf[3].x, apointf[3].y);
        path.lineTo(apointf[0].x, apointf[0].y);
        canvas.drawPath(path, paint);
    }

    public void c()
    {
        a = true;
        k();
    }

    protected void c(int i1)
    {
        if (ab)
        {
            return;
        } else
        {
            ab = true;
            long l1 = System.currentTimeMillis();
            d d1 = new d();
            aa.post(new Runnable(i1, l1, d1) {

                final int a;
                final long b;
                final d c;
                final AdjustImageView d;

                public void run()
                {
                    long l2 = System.currentTimeMillis();
                    float f1 = Math.min(a, l2 - b);
                    float f2 = (float)c.c(f1, 0.0D, d.s, a);
                    float f3 = (float)c.c(f1, 0.0D, d.r, a);
                    float f4 = (float)c.c(f1, 0.0D, d.t, a);
                    d.i.setAlpha((int)f2);
                    d.h.setAlpha((int)f3);
                    d.l.setAlpha((int)f4);
                    d.invalidate();
                    if (f1 < (float)a)
                    {
                        d.aa.post(this);
                        return;
                    } else
                    {
                        d.i.setAlpha(d.s);
                        d.h.setAlpha(d.r);
                        d.l.setAlpha(d.t);
                        d.invalidate();
                        return;
                    }
                }

            
            {
                d = AdjustImageView.this;
                a = i1;
                b = l1;
                c = d1;
                super();
            }
            });
            return;
        }
    }

    protected void c(boolean flag, long l1)
    {
        if (!af)
        {
            af = true;
            long l2 = System.currentTimeMillis();
            int i1 = getWidth();
            int j1 = getPaddingLeft();
            int k1 = getPaddingRight();
            int i2 = getHeight();
            int j2 = getPaddingTop();
            int k2 = getPaddingBottom();
            float f1 = (i1 - j1 - k1) / 2;
            float f2 = (i2 - j2 - k2) / 2;
            Camera camera = new Camera();
            ac.post(new Runnable(l1, l2, camera, flag, f1, f2) {

                final long a;
                final long b;
                final Camera c;
                final boolean d;
                final float e;
                final float f;
                final AdjustImageView g;

                public void run()
                {
                    long l3 = System.currentTimeMillis();
                    double d1 = Math.min(a, l3 - b);
                    if (com.aviary.android.feather.sdk.widget.AdjustImageView.c(g))
                    {
                        float f3 = (float)(0.0D + -180D * (d1 / (double)a));
                        c.save();
                        if (d)
                        {
                            c.rotateY(f3);
                        } else
                        {
                            c.rotateX(f3);
                        }
                        c.getMatrix(com.aviary.android.feather.sdk.widget.AdjustImageView.d(g));
                        c.restore();
                        com.aviary.android.feather.sdk.widget.AdjustImageView.d(g).preTranslate(-e, -f);
                        com.aviary.android.feather.sdk.widget.AdjustImageView.d(g).postTranslate(e, f);
                    } else
                    {
                        double d2 = com.aviary.android.feather.sdk.widget.AdjustImageView.a(g).b(d1, 1.0D, -2D, a);
                        if (d)
                        {
                            com.aviary.android.feather.sdk.widget.AdjustImageView.d(g).setScale((float)d2, 1.0F, e, f);
                        } else
                        {
                            com.aviary.android.feather.sdk.widget.AdjustImageView.d(g).setScale(1.0F, (float)d2, e, f);
                        }
                    }
                    g.invalidate();
                    if (d1 < (double)a)
                    {
                        g.ac.post(this);
                    } else
                    {
                        if (d)
                        {
                            AdjustImageView adjustimageview = g;
                            adjustimageview.ah = adjustimageview.ah ^ com.aviary.android.feather.sdk.widget.a.b.d;
                            AdjustImageView.e(g).postScale(-1F, 1.0F, e, f);
                        } else
                        {
                            AdjustImageView adjustimageview1 = g;
                            adjustimageview1.ah = adjustimageview1.ah ^ com.aviary.android.feather.sdk.widget.a.c.d;
                            AdjustImageView.e(g).postScale(1.0F, -1F, e, f);
                        }
                        AdjustImageView.f(g).postRotate((float)(-g.ad * 2D), e, f);
                        g.ad = com.aviary.android.feather.library.graphics.a.a(com.aviary.android.feather.sdk.widget.AdjustImageView.a(g, AdjustImageView.f(g)));
                        com.aviary.android.feather.sdk.widget.AdjustImageView.d(g).reset();
                        g.invalidate();
                        g.b();
                        g.af = false;
                        if (g.a)
                        {
                            com.aviary.android.feather.sdk.widget.AdjustImageView.b(g);
                            return;
                        }
                    }
                }

            
            {
                g = AdjustImageView.this;
                a = l1;
                b = l2;
                c = camera;
                d = flag;
                e = f1;
                f = f2;
                super();
            }
            });
            if (u && !a)
            {
                V = true;
                j();
                invalidate();
                return;
            }
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = at;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    public int getBaseline()
    {
        if (aG)
        {
            return getMeasuredHeight();
        } else
        {
            return aF;
        }
    }

    public boolean getBaselineAlignBottom()
    {
        return aG;
    }

    public double getCurrentRotation()
    {
        return ad;
    }

    public Drawable getDrawable()
    {
        return at;
    }

    public int getFlipType()
    {
        return ah;
    }

    public double getGrowthFactor()
    {
        return w;
    }

    public boolean getHorizontalFlip()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ah != com.aviary.android.feather.sdk.widget.a.a.d)
        {
            flag = flag1;
            if ((ah & com.aviary.android.feather.sdk.widget.a.b.d) == com.aviary.android.feather.sdk.widget.a.b.d)
            {
                flag = true;
            }
        }
        return flag;
    }

    public Matrix getImageMatrix()
    {
        return ak;
    }

    public float getRotation()
    {
        return (float)ad;
    }

    public c getScaleType()
    {
        return al;
    }

    public double getStraightenAngle()
    {
        return v;
    }

    public boolean getStraightenStarted()
    {
        return u;
    }

    public boolean getVerticalFlip()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ah != com.aviary.android.feather.sdk.widget.a.a.d)
        {
            flag = flag1;
            if ((ah & com.aviary.android.feather.sdk.widget.a.c.d) == com.aviary.android.feather.sdk.widget.a.c.d)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == at)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        D = getResources().getConfiguration().orientation;
        V = true;
        aJ = null;
        invalidate();
        if (u)
        {
            V = true;
            j();
            invalidate();
        }
    }

    public int[] onCreateDrawableState(int i1)
    {
        if (au == null)
        {
            return super.onCreateDrawableState(i1);
        }
        if (!av)
        {
            return au;
        } else
        {
            return mergeDrawableStates(super.onCreateDrawableState(au.length + i1), au);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (at != null) goto _L2; else goto _L1
_L1:
        Log.e("rotate", "Drawable is null");
_L4:
        return;
_L2:
        int k2;
        int l2;
        if (ax == 0 || ay == 0)
        {
            Log.e("rotate", "drawable width or height is 0");
            return;
        }
        k2 = getPaddingTop();
        l2 = getPaddingLeft();
        if (az == null)
        {
            Log.e("rotate", "mDrawMatrix is null");
            at.draw(canvas);
            return;
        }
        int i1 = canvas.save();
        canvas.translate(l2, k2);
        if (aC != null)
        {
            canvas.concat(aC);
        }
        if (aB != null)
        {
            canvas.concat(aB);
        }
        if (z != null)
        {
            canvas.concat(z);
        }
        if (az != null)
        {
            canvas.concat(az);
        }
        at.draw(canvas);
        canvas.restoreToCount(i1);
        if (!aK) goto _L4; else goto _L3
_L3:
        double d1;
        double d2;
        double d3;
        j = getImageRect();
        getDrawingRect(f);
        d.reset();
        e.reset();
        k.reset();
        float af1[] = new float[8];
        af1[0] = j.left;
        af1[1] = j.top;
        af1[2] = j.right;
        af1[3] = j.top;
        af1[4] = j.right;
        af1[5] = j.bottom;
        af1[6] = j.left;
        af1[7] = j.bottom;
        aA.set(az);
        aA.postConcat(aB);
        aA.postConcat(z);
        aA.mapPoints(af1);
        g.set(f);
        RectF rectf1 = g;
        rectf1.top = rectf1.top - (float)l2;
        rectf1 = g;
        rectf1.left = rectf1.left - (float)k2;
        e.addRect(g, android.graphics.Path.Direction.CW);
        d1 = com.aviary.android.feather.library.graphics.a.a(af1[2], af1[3], af1[0], af1[1]);
        d2 = com.aviary.android.feather.library.graphics.a.a(af1[6], af1[7], af1[0], af1[1]);
        d3 = a(ad);
        if (!V) goto _L6; else goto _L5
_L5:
        RectF rectf;
        float f1;
        float f3;
        if (d3 < 45D)
        {
            rectf = a((float)d1, (float)d2, d3, ax, ay, getCenter(), null);
        } else
        {
            rectf = a((float)d1, (float)d2, d3, ay, ax, getCenter(), null);
        }
        f1 = rectf.height() / 8F;
        f3 = rectf.width() / 8F;
        for (int j1 = 1; j1 < 8; j1++)
        {
            k.moveTo((int)rectf.left, (int)(rectf.top + (float)j1 * f1));
            k.lineTo((int)rectf.right, (int)(rectf.top + (float)j1 * f1));
        }

        for (int k1 = 1; k1 < 8; k1++)
        {
            k.moveTo((int)(rectf.left + (float)k1 * f3), (int)rectf.top);
            k.lineTo((int)(rectf.left + (float)k1 * f3), (int)rectf.bottom);
        }

        U = rectf;
        PointF pointf = getCenter();
        m.setBounds((int)(pointf.x - (float)n), (int)(U.bottom - (float)o), (int)(pointf.x + (float)n), (int)(U.bottom + (float)o));
        aN = pointf.x;
        V = false;
_L8:
        d.addRect(rectf, android.graphics.Path.Direction.CW);
        e.addRect(rectf, android.graphics.Path.Direction.CCW);
        int l1 = canvas.save();
        canvas.translate(l2, k2);
        canvas.drawPath(e, i);
        canvas.drawPath(k, l);
        canvas.drawPath(d, h);
        if (!af)
        {
            m.draw(canvas);
        }
        canvas.restoreToCount(l1);
        return;
_L6:
        RectF rectf2 = U;
        float f2 = rectf2.height() / 8F;
        float f4 = rectf2.width() / 8F;
        for (int i2 = 1; i2 < 8; i2++)
        {
            k.moveTo((int)rectf2.left, (int)(rectf2.top + (float)i2 * f2));
            k.lineTo((int)rectf2.right, (int)(rectf2.top + (float)i2 * f2));
        }

        int j2 = 1;
        do
        {
            rectf = rectf2;
            if (j2 >= 8)
            {
                continue;
            }
            k.moveTo((int)(rectf2.left + (float)j2 * f4), (int)rectf2.top);
            k.lineTo((int)(rectf2.left + (float)j2 * f4), (int)rectf2.bottom);
            j2++;
        } while (true);
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            aH = true;
            double d1 = ad;
            flag = getHorizontalFlip();
            boolean flag1 = getVerticalFlip();
            h();
            if (flag || flag1)
            {
                a(flag, flag1);
            }
            if (d1 != 0.0D)
            {
                a(d1, false);
                ad = d1;
            }
            invalidate();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        f();
        boolean flag = false;
        int k2 = android.view.View.MeasureSpec.getMode(i1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        float f1;
        int k1;
        int l1;
        int i2;
        int l2;
        int i3;
        if (at == null)
        {
            ax = -1;
            ay = -1;
            l1 = 0;
            i2 = 0;
            k1 = 0;
            f1 = 0.0F;
        } else
        {
            k1 = ax;
            i2 = ay;
            l1 = k1;
            if (k1 <= 0)
            {
                l1 = 1;
            }
            k1 = i2;
            if (i2 <= 0)
            {
                k1 = 1;
            }
            if (ay > ax)
            {
                C = true;
            }
            D = getResources().getConfiguration().orientation;
            if (am)
            {
                if (k2 != 0x40000000)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (j2 != 0x40000000)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f1 = (float)l1 / (float)k1;
                j2 = k1;
                k1 = i2;
                i2 = j2;
            } else
            {
                f1 = 0.0F;
                i2 = k1;
                k1 = 0;
            }
        }
        l2 = getPaddingLeft();
        i3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        if (k1 == 0 && !flag) goto _L2; else goto _L1
_L1:
        i1 = a(l1 + l2 + i3, an, i1);
        l1 = a(i2 + j2 + k2, ao, j1);
        j1 = i1;
        if (f1 == 0.0F) goto _L4; else goto _L3
_L3:
        j1 = i1;
        if ((double)Math.abs((float)(i1 - l2 - i3) / (float)(l1 - j2 - k2) - f1) <= 9.9999999999999995E-08D) goto _L4; else goto _L5
_L5:
        if (k1 == 0) goto _L7; else goto _L6
_L6:
        j1 = (int)((float)(l1 - j2 - k2) * f1) + l2 + i3;
        if (j1 > i1) goto _L7; else goto _L8
_L8:
        k1 = 1;
        i1 = j1;
_L14:
        j1 = i1;
        if (k1 != 0) goto _L4; else goto _L9
_L9:
        j1 = i1;
        if (!flag) goto _L4; else goto _L10
_L10:
        k1 = (int)((float)(i1 - l2 - i3) / f1) + j2 + k2;
        j1 = i1;
        if (k1 > l1) goto _L4; else goto _L11
_L11:
        j1 = i1;
        i1 = k1;
_L12:
        setMeasuredDimension(j1, i1);
        return;
_L2:
        k1 = Math.max(l2 + i3 + l1, getSuggestedMinimumWidth());
        l1 = Math.max(j2 + k2 + i2, getSuggestedMinimumHeight());
        k1 = resolveSize(k1, i1);
        i1 = resolveSize(l1, j1);
        j1 = k1;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = l1;
        if (true) goto _L12; else goto _L7
_L7:
        k1 = 0;
        if (true) goto _L14; else goto _L13
_L13:
    }

    protected boolean onSetAlpha(int i1)
    {
        if (getBackground() == null)
        {
            i1 = (i1 >> 7) + i1;
            if (ar != i1)
            {
                ar = i1;
                as = true;
                i();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int k1;
        i1 = 0;
        if (!aK)
        {
            return true;
        }
        k1 = motionevent.getAction();
        if (V)
        {
            j();
        }
        k1 & 0xff;
        JVM INSTR tableswitch 0 6: default 76
    //                   0 159
    //                   1 544
    //                   2 350
    //                   3 579
    //                   4 76
    //                   5 159
    //                   6 78;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L2 _L6
_L1:
        return true;
_L6:
        if (motionevent.findPointerIndex(H) < 0)
        {
            Log.d("rotate", "released original pointer");
            e();
            H = -1;
            I = -1;
        }
        Log.d("rotate", (new StringBuilder()).append("pointerId: ").append(H).append(", activePointerId: ").append(H).toString());
        continue; /* Loop/switch isn't completed */
_L2:
        if (H != -1)
        {
            Log.w("rotate", "We already have a valid pointer");
            return true;
        }
        do
        {
            if (i1 >= motionevent.getPointerCount())
            {
                continue; /* Loop/switch isn't completed */
            }
            float f1 = motionevent.getX(i1);
            float f3 = motionevent.getY(i1);
            if (U != null)
            {
                RectF rectf = new RectF(U.left - 60F, U.bottom - 60F, U.right + 60F, U.bottom + 60F);
                rectf.offset(getPaddingLeft(), getPaddingTop());
                aO = rectf.contains(f1, f3);
            }
            if (!aO)
            {
                i1++;
            } else
            {
                aM = f1;
                aN = m.getBounds().centerX();
                I = i1;
                H = motionevent.getPointerId(I);
                d();
                return true;
            }
        } while (true);
_L4:
        int j1 = motionevent.findPointerIndex(H);
        if (j1 < 0)
        {
            Log.w("rotate", "could not find the original pointerId");
            return false;
        }
        float f2 = motionevent.getX(j1);
        motionevent.getY(j1);
        aN = (f2 - aM) + aN;
        aM = f2;
        if (aO)
        {
            if (aN > U.right)
            {
                aN = U.right;
            }
            if (aN < U.left)
            {
                aN = U.left;
            }
            double d1 = getCenter().x;
            double d2 = (double)(45F * U.right) / d1;
            a(-((((double)(45F * aN) / d1 - 45D) * 45D) / (d2 - 45D)) / 2D, aN);
        }
        invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        if (H != -1)
        {
            e();
        }
        H = -1;
        I = -1;
        aO = false;
        aM = 0.0F;
        continue; /* Loop/switch isn't completed */
_L5:
        H = -1;
        I = -1;
        aO = false;
        aM = 0.0F;
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setAdjustViewBounds(boolean flag)
    {
        am = flag;
        if (flag)
        {
            setScaleType(com.aviary.android.feather.sdk.widget.c.d);
        }
    }

    public void setAlpha(int i1)
    {
        i1 &= 0xff;
        if (aq != i1)
        {
            aq = i1;
            as = true;
            i();
            invalidate();
        }
    }

    public void setBaseline(int i1)
    {
        if (aF != i1)
        {
            aF = i1;
            requestLayout();
        }
    }

    public void setBaselineAlignBottom(boolean flag)
    {
        if (aG != flag)
        {
            aG = flag;
            requestLayout();
        }
    }

    public void setCameraEnabled(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && flag)
        {
            aQ = flag;
            return;
        } else
        {
            aQ = false;
            return;
        }
    }

    public final void setColorFilter(int i1)
    {
        a(i1, android.graphics.PorterDuff.Mode.SRC_ATOP);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        if (ap != colorfilter)
        {
            ap = colorfilter;
            as = true;
            i();
            invalidate();
        }
    }

    public void setEasing(it.sephiroth.android.library.easing.b b1)
    {
        aI = b1;
    }

    public void setEnableFreeRotate(boolean flag)
    {
        aK = flag;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable)
    {
        if (at != drawable)
        {
            aj = 0;
            ai = null;
            int i1 = ax;
            int j1 = ay;
            a(drawable);
            if (i1 != ax || j1 != ay)
            {
                requestLayout();
            }
            invalidate();
        }
    }

    public void setImageLevel(int i1)
    {
        aw = i1;
        if (at != null)
        {
            at.setLevel(i1);
            g();
        }
    }

    public void setImageMatrix(Matrix matrix)
    {
        Matrix matrix1 = matrix;
        if (matrix != null)
        {
            matrix1 = matrix;
            if (matrix.isIdentity())
            {
                matrix1 = null;
            }
        }
        if (matrix1 == null && !ak.isIdentity() || matrix1 != null && !ak.equals(matrix1))
        {
            ak.set(matrix1);
            h();
            invalidate();
        }
    }

    public void setImageResource(int i1)
    {
        if (ai != null || aj != i1)
        {
            a(((Drawable) (null)));
            aj = i1;
            ai = null;
            f();
            requestLayout();
            invalidate();
        }
    }

    public void setImageURI(Uri uri)
    {
        if (aj != 0 || ai != uri && (uri == null || ai == null || !uri.equals(ai)))
        {
            a(((Drawable) (null)));
            aj = 0;
            ai = uri;
            f();
            requestLayout();
            invalidate();
        }
    }

    public void setMaxHeight(int i1)
    {
        ao = i1;
    }

    public void setMaxWidth(int i1)
    {
        an = i1;
    }

    public void setOnResetListener(b b1)
    {
        aL = b1;
    }

    public void setScaleType(c c1)
    {
        if (c1 == null)
        {
            throw new NullPointerException();
        }
        if (al != c1)
        {
            al = c1;
            boolean flag;
            if (al == c.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setWillNotCacheDrawing(flag);
            requestLayout();
            invalidate();
        }
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
        g();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return at == drawable || super.verifyDrawable(drawable);
    }

    static 
    {
        aP = (new android.graphics.Matrix.ScaleToFit[] {
            android.graphics.Matrix.ScaleToFit.FILL, android.graphics.Matrix.ScaleToFit.START, android.graphics.Matrix.ScaleToFit.CENTER, android.graphics.Matrix.ScaleToFit.END
        });
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/widget/AdjustImageView$5

/* anonymous class */
    class _cls5
        implements Runnable
    {

        final int a;
        final long b;
        final d c;
        final int d;
        final int e;
        final int f;
        final AdjustImageView g;

        public void run()
        {
            long l1 = System.currentTimeMillis();
            float f1 = Math.min(a, l1 - b);
            float f2 = (float)c.c(f1, d, 0.0D, a);
            float f3 = (float)c.c(f1, e, 0.0D, a);
            float f4 = (float)c.c(f1, f, 0.0D, a);
            g.i.setAlpha((int)f2);
            g.h.setAlpha((int)f3);
            g.l.setAlpha((int)f4);
            g.invalidate();
            if (f1 < (float)a)
            {
                g.aa.post(this);
                return;
            } else
            {
                g.a();
                return;
            }
        }
    }

}
