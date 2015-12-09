// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.b.a;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            f

public class b extends com.bumptech.glide.load.resource.a.b
    implements f.b
{
    static class a extends android.graphics.drawable.Drawable.ConstantState
    {

        com.bumptech.glide.b.c a;
        byte b[];
        Context c;
        g d;
        int e;
        int f;
        com.bumptech.glide.b.a.a g;
        c h;
        Bitmap i;

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return new b(this);
        }

        public Drawable newDrawable(Resources resources)
        {
            return newDrawable();
        }

        public a(com.bumptech.glide.b.c c1, byte abyte0[], Context context, g g1, int i1, int j1, com.bumptech.glide.b.a.a a1, 
                c c2, Bitmap bitmap)
        {
            if (bitmap == null)
            {
                throw new NullPointerException("The first frame of the GIF must not be null");
            } else
            {
                a = c1;
                b = abyte0;
                h = c2;
                i = bitmap;
                c = context.getApplicationContext();
                d = g1;
                e = i1;
                f = j1;
                g = a1;
                return;
            }
        }
    }


    private final Paint a;
    private final Rect b;
    private final a c;
    private final com.bumptech.glide.b.a d;
    private final f e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;

    public b(Context context, com.bumptech.glide.b.a.a a1, c c1, g g1, int i1, int j1, com.bumptech.glide.b.c c2, 
            byte abyte0[], Bitmap bitmap)
    {
        this(new a(c2, abyte0, context, g1, i1, j1, a1, c1, bitmap));
    }

    b(a a1)
    {
        b = new Rect();
        i = true;
        k = -1;
        if (a1 == null)
        {
            throw new NullPointerException("GifState must not be null");
        } else
        {
            c = a1;
            d = new com.bumptech.glide.b.a(a1.g);
            a = new Paint();
            d.a(a1.a, a1.b);
            e = new f(a1.c, this, d, a1.e, a1.f);
            e.a(a1.d);
            return;
        }
    }

    public b(b b1, Bitmap bitmap, g g1)
    {
        this(new a(b1.c.a, b1.c.b, b1.c.c, g1, b1.c.e, b1.c.f, b1.c.g, b1.c.h, bitmap));
    }

    private void g()
    {
        j = 0;
    }

    private void h()
    {
        e.c();
        invalidateSelf();
    }

    private void i()
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

    private void j()
    {
        f = false;
        e.b();
    }

    public void a(int i1)
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

    public boolean a()
    {
        return true;
    }

    public Bitmap b()
    {
        return c.i;
    }

    public void b(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11 && getCallback() == null)
        {
            stop();
            h();
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

    public g c()
    {
        return c.d;
    }

    public byte[] d()
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

    public int e()
    {
        return d.c();
    }

    public void f()
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
        j();
_L4:
        return super.setVisible(flag, flag1);
_L2:
        if (g)
        {
            i();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void start()
    {
        g = true;
        g();
        if (i)
        {
            i();
        }
    }

    public void stop()
    {
        g = false;
        j();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            h();
        }
    }
}
