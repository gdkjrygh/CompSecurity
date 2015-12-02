// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.facebook.widget.images:
//            e, d, c

public class ImageViewTouchBase extends ImageView
{

    private static float m = 1.0F;
    protected Matrix a;
    protected Matrix b;
    protected final e c;
    int d;
    int e;
    boolean f;
    protected float g;
    protected Handler h;
    private final Matrix i;
    private final float j[];
    private d k;
    private Runnable l;

    public ImageViewTouchBase(Context context)
    {
        super(context);
        a = new Matrix();
        b = new Matrix();
        i = new Matrix();
        j = new float[9];
        c = new e(null);
        d = -1;
        e = -1;
        f = true;
        g = 4F;
        h = new Handler();
        l = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Matrix();
        b = new Matrix();
        i = new Matrix();
        j = new float[9];
        c = new e(null);
        d = -1;
        e = -1;
        f = true;
        g = 4F;
        h = new Handler();
        l = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new Matrix();
        b = new Matrix();
        i = new Matrix();
        j = new float[9];
        c = new e(null);
        d = -1;
        e = -1;
        f = true;
        g = 4F;
        h = new Handler();
        l = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    private void a(Bitmap bitmap, int i1)
    {
        super.setImageBitmap(bitmap);
        Object obj = getDrawable();
        if (obj != null)
        {
            ((Drawable) (obj)).setDither(true);
        }
        obj = c.b();
        c.a(bitmap);
        c.a(i1);
        if (obj != null && obj != bitmap && k != null)
        {
            k.a(((Bitmap) (obj)));
        }
    }

    private void a(e e1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = e1.f();
        float f4 = e1.e();
        matrix.reset();
        matrix.postConcat(e1.c());
        if (f)
        {
            float f5 = Math.min(Math.min(f1 / f3, 10F), Math.min(f2 / f4, 10F));
            matrix.postScale(f5, f5);
            matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
            return;
        } else
        {
            matrix.postTranslate((f1 - f3) / 2.0F, (f2 - f4) / 2.0F);
            return;
        }
    }

    private float b(float f1)
    {
        float f2;
        if (f1 > g)
        {
            f2 = g;
        } else
        {
            f2 = f1;
            if (f1 < m)
            {
                return m;
            }
        }
        return f2;
    }

    protected float a()
    {
        if (c.b() == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)c.f() / (float)d, (float)c.e() / (float)e) * 4F;
        }
    }

    protected float a(Matrix matrix)
    {
        return a(matrix, 0);
    }

    protected float a(Matrix matrix, int i1)
    {
        matrix.getValues(j);
        return j[i1];
    }

    public void a(float f1)
    {
        a(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    public void a(float f1, float f2)
    {
        b(f1, f2);
        a(true, true);
    }

    public void a(float f1, float f2, float f3)
    {
        float f4 = b(f1);
        f1 = getScale();
        f4 /= f1;
        a((new StringBuilder()).append("Old scale ").append(f1).append(", delta ").append(f4).toString());
        b.postScale(f4, f4, f2, f3);
        setImageMatrix(getImageViewMatrix());
        a(true, true);
    }

    public void a(e e1, boolean flag)
    {
        f = true;
        if (getWidth() <= 0)
        {
            l = new c(this, e1, flag);
            return;
        }
        if (e1.b() != null)
        {
            a(e1, a);
            a(e1.b(), e1.a());
        } else
        {
            a.reset();
            setImageBitmap(null);
        }
        if (flag)
        {
            b.reset();
        }
        setImageMatrix(getImageViewMatrix());
        g = a();
    }

    void a(String s)
    {
    }

    protected void a(boolean flag, boolean flag1)
    {
        float f1;
        float f3;
        float f4;
        RectF rectf;
        f3 = 0.0F;
        if (c.b() == null)
        {
            return;
        }
        Matrix matrix = getImageViewMatrix();
        rectf = new RectF(0.0F, 0.0F, c.b().getWidth(), c.b().getHeight());
        matrix.mapRect(rectf);
        f1 = rectf.height();
        f4 = rectf.width();
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i1 = getHeight();
        if (f1 >= (float)i1) goto _L4; else goto _L3
_L3:
        f1 = ((float)i1 - f1) / 2.0F - rectf.top;
_L10:
        float f2 = f3;
        if (!flag) goto _L6; else goto _L5
_L5:
        i1 = getWidth();
        if (f4 >= (float)i1) goto _L8; else goto _L7
_L7:
        f2 = ((float)i1 - f4) / 2.0F - rectf.left;
_L6:
        a((new StringBuilder()).append("center() delta: ").append(f2).append(", ").append(f1).toString());
        b(f2, f1);
        setImageMatrix(getImageViewMatrix());
        return;
_L4:
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        {
            if (rectf.bottom >= (float)i1)
            {
                break; /* Loop/switch isn't completed */
            }
            f1 = (float)getHeight() - rectf.bottom;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (rectf.left > 0.0F)
        {
            f2 = -rectf.left;
        } else
        {
            f2 = f3;
            if (rectf.right < (float)i1)
            {
                f2 = (float)i1 - rectf.right;
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        f1 = 0.0F;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void b(float f1, float f2)
    {
        b.postTranslate(f1, f2);
    }

    public void b(float f1, float f2, float f3)
    {
        float f4 = (float)getWidth() / 2.0F;
        float f5 = (float)getHeight() / 2.0F;
        c(f4 - f2, f5 - f3);
        a(f1, f4, f5);
    }

    public void c(float f1, float f2)
    {
        b(f1, f2);
        setImageMatrix(getImageViewMatrix());
    }

    public float getImageLeft()
    {
        if (c.b() == null)
        {
            return 0.0F;
        } else
        {
            Matrix matrix = getImageViewMatrix();
            RectF rectf = new RectF(0.0F, 0.0F, c.b().getWidth(), c.b().getHeight());
            matrix.mapRect(rectf);
            return rectf.left;
        }
    }

    public RectF getImageRect()
    {
        if (c.b() == null)
        {
            return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        } else
        {
            Matrix matrix = getImageViewMatrix();
            RectF rectf = new RectF(0.0F, 0.0F, c.b().getWidth(), c.b().getHeight());
            matrix.mapRect(rectf);
            return rectf;
        }
    }

    public float getImageRight()
    {
        if (c.b() == null)
        {
            return 0.0F;
        } else
        {
            Matrix matrix = getImageViewMatrix();
            RectF rectf = new RectF(0.0F, 0.0F, c.b().getWidth(), c.b().getHeight());
            matrix.mapRect(rectf);
            return rectf.right;
        }
    }

    protected Matrix getImageViewMatrix()
    {
        i.set(a);
        i.postConcat(b);
        return i;
    }

    public float getMaxZoom()
    {
        return g;
    }

    public float getScale()
    {
        return a(b);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        d = k1 - i1;
        e = l1 - j1;
        Runnable runnable = l;
        if (runnable != null)
        {
            l = null;
            runnable.run();
        } else
        if (c.b() != null)
        {
            a(c, a);
            setImageMatrix(getImageViewMatrix());
            return;
        }
    }

    public void setDrawable(Drawable drawable)
    {
        if (getScaleType() == android.widget.ImageView.ScaleType.MATRIX && (drawable instanceof BitmapDrawable))
        {
            a(new e(((BitmapDrawable)drawable).getBitmap(), 0), true);
            return;
        } else
        {
            setImageDrawable(drawable);
            return;
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, 0);
    }

    public void setRecycler(d d1)
    {
        k = d1;
    }

}
