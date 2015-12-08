// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.imagelib.crop:
//            t, s, r

public abstract class ImageViewTouchBase extends ImageView
{

    private final Matrix a;
    private final float b[];
    private Runnable c;
    protected Matrix f;
    protected Matrix g;
    protected final t h;
    int i;
    int j;
    float k;
    protected int l;
    protected Handler m;

    public ImageViewTouchBase(Context context)
    {
        super(context);
        f = new Matrix();
        g = new Matrix();
        a = new Matrix();
        b = new float[9];
        h = new t(null);
        i = -1;
        j = -1;
        l = 0;
        m = new Handler();
        c = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Matrix();
        g = new Matrix();
        a = new Matrix();
        b = new float[9];
        h = new t(null);
        i = -1;
        j = -1;
        l = 0;
        m = new Handler();
        c = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    private void a(Bitmap bitmap, int i1)
    {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            drawable.setDither(true);
        }
        h.a(bitmap);
        h.a(i1);
    }

    private void a(t t1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = t1.e();
        float f4 = t1.d();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
        matrix.postConcat(t1.c());
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private Matrix c()
    {
        a.set(f);
        a.postConcat(g);
        return a;
    }

    public final void a()
    {
        float f2 = 0.0F;
        if (h.b() == null)
        {
            return;
        }
        Matrix matrix = c();
        RectF rectf = new RectF(0.0F, 0.0F, h.b().getWidth(), h.b().getHeight());
        matrix.mapRect(rectf);
        float f1 = rectf.height();
        float f3 = rectf.width();
        int i1 = getHeight();
        if (f1 < (float)i1)
        {
            f1 = ((float)i1 - f1) / 2.0F - rectf.top;
        } else
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        if (rectf.bottom < (float)i1)
        {
            f1 = (float)getHeight() - rectf.bottom;
        } else
        {
            f1 = 0.0F;
        }
        i1 = getWidth();
        if (f3 >= (float)i1) goto _L2; else goto _L1
_L1:
        f2 = ((float)i1 - f3) / 2.0F - rectf.left;
_L4:
        a(f2, f1);
        setImageMatrix(c());
        return;
_L2:
        if (rectf.left > 0.0F)
        {
            f2 = -rectf.left;
        } else
        if (rectf.right < (float)i1)
        {
            f2 = (float)i1 - rectf.right;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(float f1, float f2)
    {
        g.postTranslate(f1, f2);
    }

    protected void a(float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = f1;
        if (f1 > k)
        {
            f6 = k;
        }
        f1 = f6 / b();
        g.postScale(f1, f1, f2, f3);
        g.postTranslate(f4, f5);
        setImageMatrix(c());
        a();
    }

    protected final void a(float f1, float f2, float f3, Point point)
    {
        f1 = (f1 - b()) / 300F;
        float f4 = (float)point.x / 300F;
        float f5 = (float)point.y / 300F;
        float f6 = b();
        long l1 = System.currentTimeMillis();
        m.post(new s(this, l1, f6, f1, f4, f5, f2, f3));
    }

    public final void a(Bitmap bitmap)
    {
        a(new t(bitmap), true);
    }

    public final void a(t t1, boolean flag)
    {
        float f1 = 1.0F;
        if (getWidth() <= 0)
        {
            c = new r(this, t1, flag);
            return;
        }
        if (t1.b() != null)
        {
            a(t1, f);
            a(t1.b(), t1.a());
        } else
        {
            f.reset();
            setImageBitmap(null);
        }
        if (flag)
        {
            g.reset();
        }
        setImageMatrix(c());
        if (h.b() != null)
        {
            f1 = Math.max(Math.max((float)h.e() / (float)i, (float)h.d() / (float)j) * 4F, 1.0F);
        }
        k = f1;
    }

    public final float b()
    {
        g.getValues(b);
        return b[0];
    }

    protected final void b(float f1, float f2)
    {
        a(f1, f2);
        setImageMatrix(c());
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && b() > 1.0F)
        {
            a(1.0F, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F, 0.0F, 0.0F);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i = k1 - i1;
        j = l1 - j1;
        Runnable runnable = c;
        if (runnable != null)
        {
            c = null;
            runnable.run();
        }
        if (h.b() != null)
        {
            a(h, f);
            setImageMatrix(c());
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, 0);
    }
}
