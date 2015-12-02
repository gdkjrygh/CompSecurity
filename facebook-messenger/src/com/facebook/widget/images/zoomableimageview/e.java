// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.widget.images.zoomableimageview.a.a;
import com.facebook.widget.images.zoomableimageview.a.b;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            g, h, i, f

public class e extends ImageView
{

    protected RectF A;
    protected RectF B;
    private i a;
    protected b l;
    protected Matrix m;
    protected Matrix n;
    protected Handler o;
    protected Runnable p;
    protected float q;
    protected float r;
    protected final Matrix s;
    protected final float t[];
    protected int u;
    protected int v;
    protected boolean w;
    protected final float x;
    protected final int y;
    protected RectF z;

    public e(Context context)
    {
        super(context);
        l = new a();
        m = new Matrix();
        n = new Matrix();
        o = new Handler();
        p = null;
        r = -1F;
        s = new Matrix();
        t = new float[9];
        u = -1;
        v = -1;
        w = false;
        x = 2.0F;
        y = 200;
        z = new RectF();
        A = new RectF();
        B = new RectF();
        a();
    }

    public e(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = new a();
        m = new Matrix();
        n = new Matrix();
        o = new Handler();
        p = null;
        r = -1F;
        s = new Matrix();
        t = new float[9];
        u = -1;
        v = -1;
        w = false;
        x = 2.0F;
        y = 200;
        z = new RectF();
        A = new RectF();
        B = new RectF();
        a();
    }

    protected float a(Matrix matrix, int j)
    {
        matrix.getValues(t);
        return t[j];
    }

    public Matrix a(Matrix matrix)
    {
        s.set(m);
        s.postConcat(matrix);
        return s;
    }

    protected RectF a(Matrix matrix, boolean flag, boolean flag1)
    {
        float f1;
        float f2;
        if (getDrawable() == null)
        {
            return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        }
        A.set(0.0F, 0.0F, 0.0F, 0.0F);
        matrix = b(matrix);
        f1 = matrix.height();
        f2 = matrix.width();
        if (!flag1) goto _L2; else goto _L1
_L1:
        int j = getHeight();
        if (f1 >= (float)j) goto _L4; else goto _L3
_L3:
        f1 = ((float)j - f1) / 2.0F - ((RectF) (matrix)).top;
_L11:
        if (!flag) goto _L6; else goto _L5
_L5:
        j = getWidth();
        if (f2 >= (float)j) goto _L8; else goto _L7
_L7:
        f2 = ((float)j - f2) / 2.0F - ((RectF) (matrix)).left;
_L9:
        A.set(f2, f1, 0.0F, 0.0F);
        return A;
_L4:
        if (((RectF) (matrix)).top > 0.0F)
        {
            f1 = -((RectF) (matrix)).top;
        } else
        {
            if (((RectF) (matrix)).bottom >= (float)j)
            {
                break; /* Loop/switch isn't completed */
            }
            f1 = (float)getHeight() - ((RectF) (matrix)).bottom;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((RectF) (matrix)).left > 0.0F)
        {
            f2 = -((RectF) (matrix)).left;
            continue; /* Loop/switch isn't completed */
        }
        if (((RectF) (matrix)).right < (float)j)
        {
            f2 = (float)j - ((RectF) (matrix)).right;
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

    protected void a()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected void a(double d1, double d2)
    {
        RectF rectf = getBitmapRect();
        B.set((float)d1, (float)d2, 0.0F, 0.0F);
        a(rectf, B);
        b(B.left, B.top);
        a(true, true);
    }

    protected void a(float f1)
    {
    }

    protected void a(float f1, float f2, double d1)
    {
        double d2 = f1;
        double d3 = f2;
        long l1 = System.currentTimeMillis();
        o.post(new g(this, d1, l1, d2, d3));
    }

    protected void a(float f1, float f2, float f3)
    {
        n.postScale(f1, f1, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    protected void a(float f1, float f2, float f3, float f4)
    {
        float f5 = f1;
        if (f1 > getMaxZoom())
        {
            f5 = getMaxZoom();
        }
        long l1 = System.currentTimeMillis();
        f1 = getScale();
        Object obj = new Matrix(n);
        ((Matrix) (obj)).postScale(f5, f5, f2, f3);
        obj = a(((Matrix) (obj)), true, true);
        float f6 = ((RectF) (obj)).left;
        float f7 = ((RectF) (obj)).top;
        o.post(new h(this, f4, l1, f5 - f1, f1, f2 + f6 * f5, f3 + f7 * f5));
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        a(bitmap, flag, ((Matrix) (null)));
    }

    public void a(Bitmap bitmap, boolean flag, Matrix matrix)
    {
        a(bitmap, flag, matrix, -1F);
    }

    public void a(Bitmap bitmap, boolean flag, Matrix matrix, float f1)
    {
        if (bitmap != null)
        {
            b(new com.facebook.widget.images.zoomableimageview.b.a(bitmap), flag, matrix, f1);
            return;
        } else
        {
            b(null, flag, matrix, f1);
            return;
        }
    }

    protected void a(RectF rectf, RectF rectf1)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        if (rectf.top >= 0.0F && rectf.bottom <= f2)
        {
            rectf1.top = 0.0F;
        }
        if (rectf.left >= 0.0F && rectf.right <= f1)
        {
            rectf1.left = 0.0F;
        }
        if (rectf.top + rectf1.top >= 0.0F && rectf.bottom > f2)
        {
            rectf1.top = (int)(0.0F - rectf.top);
        }
        if (rectf.bottom + rectf1.top <= f2 - 0.0F && rectf.top < 0.0F)
        {
            rectf1.top = (int)(f2 - 0.0F - rectf.bottom);
        }
        if (rectf.left + rectf1.left >= 0.0F)
        {
            rectf1.left = (int)(0.0F - rectf.left);
        }
        if (rectf.right + rectf1.left <= f1 - 0.0F)
        {
            rectf1.left = (int)(f1 - 0.0F - rectf.right);
        }
    }

    protected void a(Drawable drawable)
    {
        if (a != null)
        {
            a.a(drawable);
        }
    }

    protected void a(Drawable drawable, Matrix matrix)
    {
        Log.i("image", "getProperBaseMatrix");
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = drawable.getIntrinsicWidth();
        float f4 = drawable.getIntrinsicHeight();
        matrix.reset();
        if (f3 > f1 || f4 > f2)
        {
            float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
            Log.d("image", (new StringBuilder()).append("scale: ").append(f5).toString());
            matrix.postScale(f5, f5);
            matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
            return;
        } else
        {
            matrix.postTranslate((f1 - f3) / 2.0F, (f2 - f4) / 2.0F);
            Log.d("image", "scale: null");
            return;
        }
    }

    protected void a(Drawable drawable, boolean flag, Matrix matrix, float f1)
    {
        if (drawable != null)
        {
            if (w)
            {
                b(drawable, m);
                setMinZoom(c(m));
            } else
            {
                a(drawable, m);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else
        {
            m.reset();
            super.setImageDrawable(null);
        }
        if (flag)
        {
            n.reset();
            if (matrix != null)
            {
                n = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f1 < 1.0F)
        {
            q = b();
        } else
        {
            q = f1;
        }
        a(drawable);
    }

    protected void a(boolean flag, boolean flag1)
    {
        RectF rectf;
        if (getDrawable() != null)
        {
            if ((rectf = a(n, flag, flag1)).left != 0.0F || rectf.top != 0.0F)
            {
                Log.d("image", (new StringBuilder()).append("center.rect: ").append(rectf.left).append("x").append(rectf.top).toString());
                b(rectf.left, rectf.top);
                return;
            }
        }
    }

    protected float b()
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)drawable.getIntrinsicWidth() / (float)u, (float)drawable.getIntrinsicHeight() / (float)v) * 4F;
        }
    }

    protected RectF b(Matrix matrix)
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            return null;
        } else
        {
            matrix = a(matrix);
            z.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(z);
            return z;
        }
    }

    protected void b(float f1)
    {
    }

    protected void b(float f1, float f2)
    {
        n.postTranslate(f1, f2);
        setImageMatrix(getImageViewMatrix());
    }

    protected void b(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > q)
        {
            f4 = q;
        }
        f1 = f4 / getScale();
        Log.d("image", (new StringBuilder()).append("zoomTo: ").append(f4).append(", center: ").append(f2).append("x").append(f3).toString());
        a(f1, f2, f3);
        a(getScale());
        a(true, true);
    }

    protected void b(Drawable drawable, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = drawable.getIntrinsicWidth();
        float f4 = drawable.getIntrinsicHeight();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    public void b(Drawable drawable, boolean flag, Matrix matrix, float f1)
    {
        if (getWidth() <= 0)
        {
            p = new f(this, drawable, flag, matrix, f1);
            return;
        } else
        {
            a(drawable, flag, matrix, f1);
            return;
        }
    }

    protected float c()
    {
        return 1.0F;
    }

    protected float c(Matrix matrix)
    {
        return a(matrix, 0);
    }

    protected void c(float f1)
    {
        b(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    public void c(float f1, float f2)
    {
        a(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F, f2);
    }

    public void d(float f1, float f2)
    {
        a(f1, f2);
    }

    protected RectF getBitmapRect()
    {
        return b(n);
    }

    public Matrix getDisplayMatrix()
    {
        return new Matrix(n);
    }

    public Matrix getImageViewMatrix()
    {
        return a(n);
    }

    public float getMaxZoom()
    {
        if (q < 1.0F)
        {
            q = b();
        }
        return q;
    }

    public float getMinZoom()
    {
        if (r < 0.0F)
        {
            r = c();
        }
        return r;
    }

    public float getRotation()
    {
        return 0.0F;
    }

    public float getScale()
    {
        return c(n);
    }

    protected void onLayout(boolean flag, int j, int k, int i1, int j1)
    {
        super.onLayout(flag, j, k, i1, j1);
        u = i1 - j;
        v = j1 - k;
        Runnable runnable = p;
        if (runnable != null)
        {
            p = null;
            runnable.run();
        }
        if (getDrawable() != null)
        {
            if (w)
            {
                b(getDrawable(), m);
                setMinZoom(1.0F);
            } else
            {
                a(getDrawable(), m);
                setMinZoom(getMinZoom());
            }
            setImageMatrix(getImageViewMatrix());
            c(getMinZoom());
        }
    }

    public void setFitToScreen(boolean flag)
    {
        if (flag != w)
        {
            w = flag;
            requestLayout();
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable)
    {
        b(drawable, true, null, -1F);
    }

    public void setImageResource(int j)
    {
        setImageDrawable(getContext().getResources().getDrawable(j));
    }

    public void setMinZoom(float f1)
    {
        Log.d("image", (new StringBuilder()).append("minZoom: ").append(f1).toString());
        r = f1;
    }

    public void setOnBitmapChangedListener(i j)
    {
        a = j;
    }
}
