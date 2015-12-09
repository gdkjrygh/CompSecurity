// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services.drag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import it.sephiroth.android.library.easing.EasingManager;
import it.sephiroth.android.library.easing.d;
import it.sephiroth.android.library.easing.f;

public class DragView extends View
    implements it.sephiroth.android.library.easing.EasingManager.b
{

    protected Bitmap a;
    protected Paint b;
    protected Paint c;
    protected int d;
    protected int e;
    protected EasingManager f;
    protected float g;
    protected float h;
    protected android.view.WindowManager.LayoutParams i;
    protected WindowManager j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;

    public DragView(Context context, Bitmap bitmap, int i1, int j1, int k1, int l1, int i2, 
            int j2)
    {
        super(context);
        h = 1.0F;
        m = false;
        n = false;
        k = i2;
        l = j2;
        c = new Paint(1);
        c.setColor(0xff000000);
        j = (WindowManager)context.getSystemService("window");
        setPaint(new Paint());
        f = new EasingManager(this);
        context = new Matrix();
        float f1 = i2;
        f1 = (0.0F + f1) / f1;
        g = f1;
        context.setScale(f1, f1);
        a = Bitmap.createBitmap(bitmap, k1, l1, i2, j2, context, false);
        d = i1 + 0;
        e = j1 + 0;
    }

    public void a(double d1)
    {
    }

    public void a(double d1, double d2)
    {
        h = (float)((1.0D + (double)(g - 1.0F) * d1) / (double)g);
        b.setAlpha((int)(255D * d1));
        invalidate();
    }

    public void a(int i1, int j1)
    {
        android.view.WindowManager.LayoutParams layoutparams = i;
        if (!m)
        {
            d = i1 - layoutparams.x;
            e = j1 - layoutparams.y;
            m = true;
        }
        layoutparams.x = i1 - d;
        layoutparams.y = j1 - e;
        j.updateViewLayout(this, layoutparams);
    }

    public void a(IBinder ibinder, int i1, int j1, boolean flag)
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-2, -2, i1 - d, j1 - e, 1002, 768, -3);
        layoutparams.gravity = 51;
        layoutparams.token = ibinder;
        layoutparams.setTitle("DragView");
        i = layoutparams;
        j.addView(this, layoutparams);
        if (flag)
        {
            h = 1.0F / g;
            f.a(it/sephiroth/android/library/easing/d, it.sephiroth.android.library.easing.EasingManager.a.b, 0.0D, 1.0D, 100);
            return;
        } else
        {
            a(1.0D, 1.0D);
            return;
        }
    }

    public void a(boolean flag)
    {
label0:
        {
            if (!n)
            {
                if (!flag)
                {
                    break label0;
                }
                (new EasingManager(new it.sephiroth.android.library.easing.EasingManager.b(this) {

                    final View a;
                    final DragView b;

                    public void a(double d1)
                    {
                    }

                    public void a(double d1, double d2)
                    {
                        b.h = (float)((1.0D + (double)(b.g - 1.0F) * d1) / (double)b.g);
                        b.b.setAlpha((int)(255D * d1));
                        b.invalidate();
                    }

                    public void b(double d1)
                    {
                        b.j.removeView(a);
                    }

            
            {
                b = DragView.this;
                a = view;
                super();
            }
                })).a(it/sephiroth/android/library/easing/f, it.sephiroth.android.library.easing.EasingManager.a.a, 1.0D, 0.0D, 250);
            }
            return;
        }
        if (getHandler() != null)
        {
            getHandler().post(new Runnable(this) {

                final View a;
                final DragView b;

                public void run()
                {
                    b.j.removeView(a);
                }

            
            {
                b = DragView.this;
                a = view;
                super();
            }
            });
            return;
        } else
        {
            j.removeView(this);
            return;
        }
    }

    public void b(double d1)
    {
    }

    public float getScaleFactor()
    {
        return g;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null && !a.isRecycled())
        {
            a.recycle();
            a = null;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        float f1 = h;
        if (f1 < 0.999F)
        {
            float f2 = k;
            f2 = (f2 - f2 * f1) / 2.0F;
            canvas.translate(f2, f2);
            canvas.scale(f1, f1);
        }
        if (a != null && !a.isRecycled())
        {
            canvas.drawBitmap(a, 0.0F, 0.0F, b);
            return;
        } else
        {
            Log.e("DragView", "invalid bitmap or recycled bitmap");
            canvas.drawRect(0.0F, 0.0F, k, l, c);
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(a.getWidth(), a.getHeight());
    }

    public void setPaint(Paint paint)
    {
        b = paint;
        invalidate();
    }
}
