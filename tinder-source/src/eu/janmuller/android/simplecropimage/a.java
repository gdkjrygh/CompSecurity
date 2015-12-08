// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            d

abstract class a extends ImageView
{

    private final Matrix a;
    private final float b[];
    private Runnable c;
    protected final d f;
    protected Matrix g;
    protected Matrix h;
    protected Handler i;
    int j;
    int k;
    float l;
    int m;
    int n;
    int o;
    int p;

    public a(Context context)
    {
        super(context);
        f = new d(null);
        a = new Matrix();
        b = new float[9];
        g = new Matrix();
        h = new Matrix();
        i = new Handler();
        j = -1;
        k = -1;
        c = null;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new d(null);
        a = new Matrix();
        b = new float[9];
        g = new Matrix();
        h = new Matrix();
        i = new Handler();
        j = -1;
        k = -1;
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
        f.a = bitmap;
        f.b = i1;
    }

    private void a(d d1, Matrix matrix)
    {
        float f1 = getWidth();
        float f2 = getHeight();
        float f3 = d1.b();
        float f4 = d1.a();
        matrix.reset();
        float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
        Matrix matrix1 = new Matrix();
        if (d1.b != 0)
        {
            int i1 = d1.a.getWidth() / 2;
            int j1 = d1.a.getHeight() / 2;
            matrix1.preTranslate(-i1, -j1);
            matrix1.postRotate(d1.b);
            matrix1.postTranslate(d1.b() / 2, d1.a() / 2);
        }
        matrix.postConcat(matrix1);
        matrix.postScale(f5, f5);
        matrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
    }

    private Matrix c()
    {
        a.set(g);
        a.postConcat(h);
        return a;
    }

    protected final void a()
    {
        float f2 = 0.0F;
        if (f.a == null)
        {
            return;
        }
        Matrix matrix = c();
        RectF rectf = new RectF(0.0F, 0.0F, f.a.getWidth(), f.a.getHeight());
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
        h.postTranslate(f1, f2);
    }

    protected void a(float f1, float f2, float f3)
    {
        float f4 = f1;
        if (f1 > l)
        {
            f4 = l;
        }
        f1 = f4 / b();
        h.postScale(f1, f1, f2, f3);
        setImageMatrix(c());
        a();
    }

    public final void a(Bitmap bitmap)
    {
        a(new d(bitmap), true);
    }

    public final void a(d d1, boolean flag)
    {
        if (getWidth() <= 0)
        {
            c = new Runnable(d1, flag) {

                final d a;
                final boolean b;
                final a c;

                public final void run()
                {
                    c.a(a, b);
                }

            
            {
                c = a.this;
                a = d1;
                b = flag;
                super();
            }
            };
            return;
        }
        float f1;
        if (d1.a != null)
        {
            a(d1, g);
            a(d1.a, d1.b);
        } else
        {
            g.reset();
            setImageBitmap(null);
        }
        if (flag)
        {
            h.reset();
        }
        setImageMatrix(c());
        if (f.a == null)
        {
            f1 = 1.0F;
        } else
        {
            f1 = Math.max((float)f.b() / (float)j, (float)f.a() / (float)k) * 4F;
        }
        l = f1;
    }

    protected final float b()
    {
        h.getValues(b);
        return b[0];
    }

    protected final void b(float f1, float f2)
    {
        a(f1, f2);
        setImageMatrix(c());
    }

    protected final void b(float f1, float f2, float f3)
    {
        f1 = (f1 - b()) / 300F;
        float f4 = b();
        long l1 = System.currentTimeMillis();
        i.post(new Runnable(l1, f4, f1, f2, f3) {

            final float a = 300F;
            final long b;
            final float c;
            final float d;
            final float e;
            final float f;
            final a g;

            public final void run()
            {
                long l2 = System.currentTimeMillis();
                float f5 = Math.min(a, l2 - b);
                float f6 = c;
                float f7 = d;
                g.a(f6 + f7 * f5, e, f);
                if (f5 < a)
                {
                    g.i.post(this);
                }
            }

            
            {
                g = a.this;
                b = l1;
                c = f1;
                d = f2;
                e = f3;
                f = f4;
                super();
            }
        });
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && b() > 1.0F)
        {
            a(1.0F, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        m = i1;
        n = k1;
        o = j1;
        p = l1;
        j = k1 - i1;
        k = l1 - j1;
        Runnable runnable = c;
        if (runnable != null)
        {
            c = null;
            runnable.run();
        }
        if (f.a != null)
        {
            a(f, g);
            setImageMatrix(c());
        }
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a(bitmap, 0);
    }
}
