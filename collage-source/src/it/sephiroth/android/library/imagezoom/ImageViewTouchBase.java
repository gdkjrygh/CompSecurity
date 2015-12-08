// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import it.sephiroth.android.library.easing.a;
import it.sephiroth.android.library.easing.b;

public abstract class ImageViewTouchBase extends ImageView
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(it/sephiroth/android/library/imagezoom/ImageViewTouchBase$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("FIT_TO_SCREEN", 1);
            c = new a("FIT_IF_BIGGER", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int l)
        {
            super(s, l);
        }
    }


    protected b F;
    protected Matrix G;
    protected Matrix H;
    protected Matrix I;
    protected Handler J;
    protected Runnable K;
    protected boolean L;
    protected final Matrix M;
    protected final float N[];
    protected a O;
    protected final int P;
    protected RectF Q;
    protected RectF R;
    protected RectF S;
    private float a;
    private float b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private PointF g;
    private boolean h;
    private boolean i;
    private b j;
    private c k;

    public ImageViewTouchBase(Context context)
    {
        this(context, null);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        F = new it.sephiroth.android.library.easing.a();
        G = new Matrix();
        H = new Matrix();
        J = new Handler();
        K = null;
        L = false;
        a = -1F;
        b = -1F;
        M = new Matrix();
        N = new float[9];
        e = -1;
        f = -1;
        g = new PointF();
        O = it.sephiroth.android.library.imagezoom.a.a;
        P = 200;
        Q = new RectF();
        R = new RectF();
        S = new RectF();
        a(context, attributeset, l);
    }

    protected float a(Matrix matrix, int l)
    {
        matrix.getValues(N);
        return N[l];
    }

    protected float a(a a1)
    {
        if (a1 == it.sephiroth.android.library.imagezoom.a.b)
        {
            return 1.0F;
        }
        if (a1 == a.c)
        {
            return Math.min(1.0F, 1.0F / d(G));
        } else
        {
            return 1.0F / d(G);
        }
    }

    protected RectF a(Matrix matrix, boolean flag, boolean flag1)
    {
        float f1;
        float f2;
        if (getDrawable() == null)
        {
            return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        }
        R.set(0.0F, 0.0F, 0.0F, 0.0F);
        matrix = c(matrix);
        f1 = matrix.height();
        f2 = matrix.width();
        if (!flag1) goto _L2; else goto _L1
_L1:
        int l = f;
        if (f1 >= (float)l) goto _L4; else goto _L3
_L3:
        f1 = ((float)l - f1) / 2.0F - ((RectF) (matrix)).top;
_L11:
        if (!flag) goto _L6; else goto _L5
_L5:
        l = e;
        if (f2 >= (float)l) goto _L8; else goto _L7
_L7:
        f2 = ((float)l - f2) / 2.0F - ((RectF) (matrix)).left;
_L9:
        R.set(f2, f1, 0.0F, 0.0F);
        return R;
_L4:
        if (((RectF) (matrix)).top > 0.0F)
        {
            f1 = -((RectF) (matrix)).top;
        } else
        {
            if (((RectF) (matrix)).bottom >= (float)l)
            {
                break; /* Loop/switch isn't completed */
            }
            f1 = (float)f - ((RectF) (matrix)).bottom;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((RectF) (matrix)).left > 0.0F)
        {
            f2 = -((RectF) (matrix)).left;
            continue; /* Loop/switch isn't completed */
        }
        if (((RectF) (matrix)).right < (float)l)
        {
            f2 = (float)l - ((RectF) (matrix)).right;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        f2 = 0.0F;
        if (true) goto _L9; else goto _L2
_L2:
        f1 = 0.0F;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void a(double d1, double d2)
    {
        RectF rectf = getBitmapRect();
        S.set((float)d1, (float)d2, 0.0F, 0.0F);
        a(rectf, S);
        a(S.left, S.top);
        a(true, true);
    }

    protected void a(float f1)
    {
    }

    protected void a(float f1, float f2)
    {
        if (f1 != 0.0F || f2 != 0.0F)
        {
            H.postTranslate(f1, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    protected void a(float f1, float f2, double d1)
    {
        double d2 = f1;
        double d3 = f2;
        long l = System.currentTimeMillis();
        J.post(new _cls2(d1, l, d2, d3));
    }

    protected void a(float f1, float f2, float f3)
    {
        H.postScale(f1, f1, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    protected void a(float f1, float f2, float f3, float f4)
    {
        float f5 = f1;
        if (f1 > getMaxScale())
        {
            f5 = getMaxScale();
        }
        long l = System.currentTimeMillis();
        f1 = getScale();
        Object obj = new Matrix(H);
        ((Matrix) (obj)).postScale(f5, f5, f2, f3);
        obj = a(((Matrix) (obj)), true, true);
        float f6 = ((RectF) (obj)).left;
        float f7 = ((RectF) (obj)).top;
        J.post(new _cls3(f4, l, f5 - f1, f1, f2 + f6 * f5, f3 + f7 * f5));
    }

    protected void a(int l, int i1, int j1, int k1)
    {
        b(l, i1, j1, k1);
    }

    protected void a(Context context, AttributeSet attributeset, int l)
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public void a(Bitmap bitmap, Matrix matrix, float f1, float f2)
    {
        if (bitmap != null)
        {
            a(((Drawable) (new it.sephiroth.android.library.imagezoom.a.a(bitmap))), matrix, f1, f2);
            return;
        } else
        {
            a(((Drawable) (null)), matrix, f1, f2);
            return;
        }
    }

    protected void a(RectF rectf, RectF rectf1)
    {
        if (rectf != null)
        {
            if (rectf.top >= 0.0F && rectf.bottom <= (float)f)
            {
                rectf1.top = 0.0F;
            }
            if (rectf.left >= 0.0F && rectf.right <= (float)e)
            {
                rectf1.left = 0.0F;
            }
            if (rectf.top + rectf1.top >= 0.0F && rectf.bottom > (float)f)
            {
                rectf1.top = (int)(0.0F - rectf.top);
            }
            if (rectf.bottom + rectf1.top <= (float)(f + 0) && rectf.top < 0.0F)
            {
                rectf1.top = (int)((float)(f + 0) - rectf.bottom);
            }
            if (rectf.left + rectf1.left >= 0.0F)
            {
                rectf1.left = (int)(0.0F - rectf.left);
            }
            if (rectf.right + rectf1.left <= (float)(e + 0))
            {
                rectf1.left = (int)((float)(e + 0) - rectf.right);
                return;
            }
        }
    }

    protected void a(Drawable drawable)
    {
        b(drawable);
    }

    protected void a(Drawable drawable, Matrix matrix)
    {
        float f1 = e;
        float f2 = f;
        float f3 = drawable.getIntrinsicWidth();
        float f4 = drawable.getIntrinsicHeight();
        matrix.reset();
        if (f3 > f1 || f4 > f2)
        {
            float f5 = Math.min(f1 / f3, f2 / f4);
            matrix.postScale(f5, f5);
            matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
            return;
        } else
        {
            float f6 = Math.min(f1 / f3, f2 / f4);
            matrix.postScale(f6, f6);
            matrix.postTranslate((f1 - f3 * f6) / 2.0F, (f2 - f4 * f6) / 2.0F);
            return;
        }
    }

    public void a(Drawable drawable, Matrix matrix, float f1, float f2)
    {
        if (getWidth() <= 0)
        {
            K = new _cls1(drawable, matrix, f1, f2);
            return;
        } else
        {
            b(drawable, matrix, f1, f2);
            return;
        }
    }

    protected void a(boolean flag, boolean flag1)
    {
        RectF rectf;
        if (getDrawable() != null)
        {
            if ((rectf = a(H, flag, flag1)).left != 0.0F || rectf.top != 0.0F)
            {
                a(rectf.left, rectf.top);
                return;
            }
        }
    }

    public Matrix b(Matrix matrix)
    {
        M.set(G);
        M.postConcat(matrix);
        return M;
    }

    protected void b()
    {
    }

    protected void b(float f1)
    {
        float f2 = f1;
        if (f1 > getMaxScale())
        {
            f2 = getMaxScale();
        }
        f1 = f2;
        if (f2 < getMinScale())
        {
            f1 = getMinScale();
        }
        PointF pointf = getCenter();
        b(f1, pointf.x, pointf.y);
    }

    protected void b(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > getMaxScale())
        {
            f4 = getMaxScale();
        }
        a(f4 / getScale(), f2, f3);
        c(getScale());
        a(true, true);
    }

    protected void b(int l, int i1, int j1, int k1)
    {
    /* block-local class not found */
    class c {}

        if (k != null)
        {
            k.a(true, l, i1, j1, k1);
        }
    }

    protected void b(Drawable drawable)
    {
    /* block-local class not found */
    class b {}

        if (j != null)
        {
            j.a(drawable);
        }
    }

    protected void b(Drawable drawable, Matrix matrix, float f1, float f2)
    {
        if (drawable != null)
        {
            super.setImageDrawable(drawable);
        } else
        {
            G.reset();
            super.setImageDrawable(null);
        }
        if (f1 != -1F && f2 != -1F)
        {
            f1 = Math.min(f1, f2);
            f2 = Math.max(f1, f2);
            b = f1;
            a = f2;
            d = true;
            c = true;
            if (O == it.sephiroth.android.library.imagezoom.a.b || O == a.c)
            {
                if (b >= 1.0F)
                {
                    d = false;
                    b = -1F;
                }
                if (a <= 1.0F)
                {
                    c = true;
                    a = -1F;
                }
            }
        } else
        {
            b = -1F;
            a = -1F;
            d = false;
            c = false;
        }
        if (matrix != null)
        {
            I = new Matrix(matrix);
        }
        i = true;
        requestLayout();
    }

    protected RectF c(Matrix matrix)
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            return null;
        } else
        {
            matrix = b(matrix);
            Q.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(Q);
            return Q;
        }
    }

    protected void c(float f1)
    {
    }

    public void c(float f1, float f2)
    {
        PointF pointf = getCenter();
        a(f1, pointf.x, pointf.y, f2);
    }

    protected float d(Matrix matrix)
    {
        return a(matrix, 0);
    }

    public void d()
    {
        setImageBitmap(null);
    }

    public void d(float f1, float f2)
    {
        a(f1, f2);
    }

    public void e()
    {
        H = new Matrix();
        float f1 = a(O);
        setImageMatrix(getImageViewMatrix());
        if (f1 != getScale())
        {
            b(f1);
        }
        postInvalidate();
    }

    protected float f()
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)drawable.getIntrinsicWidth() / (float)e, (float)drawable.getIntrinsicHeight() / (float)f) * 8F;
        }
    }

    protected float g()
    {
        if (getDrawable() == null)
        {
            return 1.0F;
        } else
        {
            return Math.min(1.0F, 1.0F / d(G));
        }
    }

    public float getBaseScale()
    {
        return d(G);
    }

    public RectF getBitmapRect()
    {
        return c(H);
    }

    protected PointF getCenter()
    {
        return g;
    }

    public Matrix getDisplayMatrix()
    {
        return new Matrix(H);
    }

    public a getDisplayType()
    {
        return O;
    }

    public Matrix getImageViewMatrix()
    {
        return b(H);
    }

    public float getMaxScale()
    {
        if (a == -1F)
        {
            a = f();
        }
        return a;
    }

    public float getMinScale()
    {
        if (b == -1F)
        {
            b = g();
        }
        return b;
    }

    public float getRotation()
    {
        return 0.0F;
    }

    public float getScale()
    {
        return d(H);
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        int i2 = 0;
        int l1 = 0;
        if (flag)
        {
            i2 = e;
            l1 = f;
            e = j1 - l;
            f = k1 - i1;
            i2 = e - i2;
            l1 = f - l1;
            g.x = (float)e / 2.0F;
            g.y = (float)f / 2.0F;
        }
        Object obj = K;
        if (obj != null)
        {
            K = null;
            ((Runnable) (obj)).run();
        }
        obj = getDrawable();
        if (obj != null)
        {
            if (flag || h || i)
            {
                a(O);
                float f1 = d(G);
                float f2 = getScale();
                float f3 = Math.min(1.0F, 1.0F / f1);
                a(((Drawable) (obj)), G);
                float f4 = d(G);
                if (i || h)
                {
                    if (I != null)
                    {
                        H.set(I);
                        I = null;
                        f2 = getScale();
                    } else
                    {
                        H.reset();
                        f2 = a(O);
                    }
                    setImageMatrix(getImageViewMatrix());
                    f1 = f2;
                    if (f2 != getScale())
                    {
                        b(f2);
                        f1 = f2;
                    }
                } else
                if (flag)
                {
                    if (!d)
                    {
                        b = -1F;
                    }
                    if (!c)
                    {
                        a = -1F;
                    }
                    setImageMatrix(getImageViewMatrix());
                    a(-i2, -l1);
                    if (!L)
                    {
                        f1 = a(O);
                        b(f1);
                    } else
                    {
                        if ((double)Math.abs(f2 - f3) > 0.001D)
                        {
                            f1 = (f1 / f4) * f2;
                        } else
                        {
                            f1 = 1.0F;
                        }
                        b(f1);
                    }
                } else
                {
                    f1 = 1.0F;
                }
                L = false;
                if (f1 > getMaxScale() || f1 < getMinScale())
                {
                    b(f1);
                }
                a(true, true);
                if (i)
                {
                    a(((Drawable) (obj)));
                }
                if (flag || i || h)
                {
                    a(l, i1, j1, k1);
                }
                if (h)
                {
                    h = false;
                }
                if (i)
                {
                    i = false;
                }
            }
        } else
        {
            if (i)
            {
                a(((Drawable) (obj)));
            }
            if (flag || i || h)
            {
                a(l, i1, j1, k1);
            }
            if (i)
            {
                i = false;
            }
            if (h)
            {
                h = false;
                return;
            }
        }
    }

    public void setDisplayType(a a1)
    {
        if (a1 != O)
        {
            L = false;
            O = a1;
            h = true;
            requestLayout();
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, ((Matrix) (null)), -1F, -1F);
    }

    public void setImageDrawable(Drawable drawable)
    {
        a(drawable, ((Matrix) (null)), -1F, -1F);
    }

    public void setImageMatrix(Matrix matrix)
    {
        boolean flag;
label0:
        {
            Matrix matrix1 = getImageMatrix();
            boolean flag1 = false;
            if (matrix != null || matrix1.isIdentity())
            {
                flag = flag1;
                if (matrix == null)
                {
                    break label0;
                }
                flag = flag1;
                if (matrix1.equals(matrix))
                {
                    break label0;
                }
            }
            flag = true;
        }
        super.setImageMatrix(matrix);
        if (flag)
        {
            b();
        }
    }

    public void setImageResource(int l)
    {
        setImageDrawable(getContext().getResources().getDrawable(l));
    }

    protected void setMaxScale(float f1)
    {
        a = f1;
    }

    protected void setMinScale(float f1)
    {
        b = f1;
    }

    public void setOnDrawableChangedListener(b b1)
    {
        j = b1;
    }

    public void setOnLayoutChangeListener(c c1)
    {
        k = c1;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype == android.widget.ImageView.ScaleType.MATRIX)
        {
            super.setScaleType(scaletype);
            return;
        } else
        {
            Log.w("ImageViewTouchBase", "Unsupported scaletype. Only MATRIX can be used");
            return;
        }
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
