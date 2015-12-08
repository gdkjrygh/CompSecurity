// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package com.android.slyce.crop:
//            x, t, s, r

abstract class q extends ImageView
{

    private final Matrix a;
    private final float b[];
    private t c;
    private Runnable d;
    protected Matrix f;
    protected Matrix g;
    protected final x h;
    int i;
    int j;
    float k;
    int l;
    int m;
    int n;
    int o;
    protected Handler p;

    public q(Context context)
    {
        super(context);
        f = new Matrix();
        g = new Matrix();
        a = new Matrix();
        b = new float[9];
        h = new x(null);
        i = -1;
        j = -1;
        p = new Handler();
        d = null;
        d();
    }

    public q(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Matrix();
        g = new Matrix();
        a = new Matrix();
        b = new float[9];
        h = new x(null);
        i = -1;
        j = -1;
        p = new Handler();
        d = null;
        d();
    }

    private void a(Bitmap bitmap, int i1)
    {
        super.setImageBitmap(bitmap);
        Object obj = getDrawable();
        if (obj != null)
        {
            ((Drawable) (obj)).setDither(true);
        }
        obj = h.b();
        h.a(bitmap);
        h.a(i1);
        if (obj != null && obj != bitmap && c != null)
        {
            c.a(((Bitmap) (obj)));
        }
    }

    private void a(x x1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = x1.f();
        float f4 = x1.e();
        x1.a();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
        matrix.postConcat(x1.c());
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private void d()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected float a()
    {
        return a(g);
    }

    protected float a(Matrix matrix)
    {
        return a(matrix, 0);
    }

    protected float a(Matrix matrix, int i1)
    {
        matrix.getValues(b);
        return b[i1];
    }

    protected void a(float f1)
    {
        a(f1, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    protected void a(float f1, float f2)
    {
        g.postTranslate(f1, f2);
    }

    protected void a(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > k)
        {
            f4 = k;
        }
        f1 = f4 / a();
        g.postScale(f1, f1, f2, f3);
        setImageMatrix(b());
        a(true, true);
    }

    protected void a(float f1, float f2, float f3, float f4)
    {
        f1 = (f1 - a()) / f4;
        float f5 = a();
        long l1 = System.currentTimeMillis();
        p.post(new s(this, f4, l1, f5, f1, f2, f3));
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        a(new x(bitmap), flag);
    }

    public void a(x x1, boolean flag)
    {
        if (getWidth() <= 0)
        {
            d = new r(this, x1, flag);
            return;
        }
        if (x1.b() != null)
        {
            a(x1, f);
            a(x1.b(), x1.a());
        } else
        {
            f.reset();
            setImageBitmap(null);
        }
        if (flag)
        {
            g.reset();
        }
        setImageMatrix(b());
        k = c();
    }

    protected void a(boolean flag, boolean flag1)
    {
        float f1;
        float f3;
        float f4;
        RectF rectf;
        f3 = 0.0F;
        if (h.b() == null)
        {
            return;
        }
        Matrix matrix = b();
        rectf = new RectF(0.0F, 0.0F, h.b().getWidth(), h.b().getHeight());
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
        a(f2, f1);
        setImageMatrix(b());
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

    protected Matrix b()
    {
        a.set(f);
        a.postConcat(g);
        return a;
    }

    protected void b(float f1, float f2)
    {
        a(f1, f2);
        setImageMatrix(b());
    }

    protected float c()
    {
        if (h.b() == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)h.f() / (float)i, (float)h.e() / (float)j) * 4F;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && a() > 1.0F)
        {
            a(1.0F);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        l = i1;
        m = k1;
        n = j1;
        o = l1;
        i = k1 - i1;
        j = l1 - j1;
        Runnable runnable = d;
        if (runnable != null)
        {
            d = null;
            runnable.run();
        }
        if (h.b() != null)
        {
            a(h, f);
            setImageMatrix(b());
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, 0);
    }
}
