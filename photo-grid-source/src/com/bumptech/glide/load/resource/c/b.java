// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.Gravity;
import com.bumptech.glide.b.a;
import com.bumptech.glide.b.d;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            i, c, g

public class b extends com.bumptech.glide.load.resource.a.b
    implements i
{

    private final Paint a;
    private final Rect b;
    private final c c;
    private final a d;
    private final com.bumptech.glide.load.resource.c.g e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;

    public b(Context context, com.bumptech.glide.b.b b1, e e1, g g1, int i1, int j1, d d1, 
            byte abyte0[], Bitmap bitmap)
    {
        this(new c(d1, abyte0, context, g1, i1, j1, b1, e1, bitmap));
    }

    public b(b b1, Bitmap bitmap, g g1)
    {
        this(new c(b1.c.a, b1.c.b, b1.c.c, g1, b1.c.e, b1.c.f, b1.c.g, b1.c.h, bitmap));
    }

    b(c c1)
    {
        b = new Rect();
        i = true;
        k = -1;
        if (c1 == null)
        {
            throw new NullPointerException("GifState must not be null");
        } else
        {
            c = c1;
            d = new a(c1.g);
            a = new Paint();
            d.a(c1.a, c1.b);
            e = new com.bumptech.glide.load.resource.c.g(c1.c, this, d, c1.e, c1.f);
            e.a(c1.d);
            return;
        }
    }

    private void g()
    {
        e.c();
        invalidateSelf();
    }

    private void h()
    {
        if (d.c() == 1)
        {
            invalidateSelf();
        } else
        if (!f)
        {
            f = true;
            e.a();
            invalidateSelf();
            return;
        }
    }

    private void i()
    {
        f = false;
        e.b();
    }

    public final void a(int i1)
    {
        if (i1 <= 0 && i1 != -1 && i1 != 0)
        {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i1 == 0)
        {
            k = d.e();
            return;
        } else
        {
            k = i1;
            return;
        }
    }

    public final boolean a()
    {
        return true;
    }

    public final Bitmap b()
    {
        return c.i;
    }

    public final void b(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11 && getCallback() == null)
        {
            stop();
            g();
        } else
        {
            invalidateSelf();
            if (i1 == d.c() - 1)
            {
                j = j + 1;
            }
            if (k != -1 && j >= k)
            {
                stop();
                return;
            }
        }
    }

    public final g c()
    {
        return c.d;
    }

    public final byte[] d()
    {
        return c.b;
    }

    public void draw(Canvas canvas)
    {
        if (h)
        {
            return;
        }
        if (l)
        {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), b);
            l = false;
        }
        Bitmap bitmap = e.d();
        if (bitmap == null)
        {
            bitmap = c.i;
        }
        canvas.drawBitmap(bitmap, null, b, a);
    }

    public final int e()
    {
        return d.c();
    }

    public final void f()
    {
        h = true;
        c.h.a(c.i);
        e.c();
        e.b();
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return c;
    }

    public int getIntrinsicHeight()
    {
        return c.i.getHeight();
    }

    public int getIntrinsicWidth()
    {
        return c.i.getWidth();
    }

    public int getOpacity()
    {
        return -2;
    }

    public boolean isRunning()
    {
        return f;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        l = true;
    }

    public void setAlpha(int i1)
    {
        a.setAlpha(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        i = flag;
        if (flag) goto _L2; else goto _L1
_L1:
        i();
_L4:
        return super.setVisible(flag, flag1);
_L2:
        if (g)
        {
            h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void start()
    {
        g = true;
        j = 0;
        if (i)
        {
            h();
        }
    }

    public void stop()
    {
        g = false;
        i();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            g();
        }
    }
}
