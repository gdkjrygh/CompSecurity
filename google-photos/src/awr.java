// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;

public class awr extends Drawable
    implements Animatable, awy
{

    final aws a;
    boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;

    public awr(Context context, amu amu1, aqm aqm, anl anl, int k, int l, Bitmap bitmap)
    {
        this(new aws(context, aqm, new aww(context, amu1, k, l, anl, bitmap)));
    }

    awr(aws aws1)
    {
        e = true;
        g = -1;
        a = (aws)b.a(aws1, "Argument must not be null");
    }

    private void c()
    {
label0:
        {
            if (a.a.a.g.c != 1)
            {
                if (c)
                {
                    break label0;
                }
                c = true;
                aww aww1 = a.a;
                if (aww1.h)
                {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
                boolean flag = aww1.c.isEmpty();
                if (aww1.c.contains(this))
                {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
                aww1.c.add(this);
                if (flag && !aww1.e)
                {
                    aww1.e = true;
                    aww1.h = false;
                    aww1.b();
                }
            }
            invalidateSelf();
        }
    }

    private void d()
    {
        c = false;
        aww aww1 = a.a;
        aww1.c.remove(this);
        if (aww1.c.isEmpty())
        {
            aww1.e = false;
        }
    }

    private Rect e()
    {
        if (j == null)
        {
            j = new Rect();
        }
        return j;
    }

    private Paint f()
    {
        if (i == null)
        {
            i = new Paint(2);
        }
        return i;
    }

    public final ByteBuffer a()
    {
        return a.a.a.a.asReadOnlyBuffer();
    }

    public final void b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11 && getCallback() == null)
        {
            stop();
            invalidateSelf();
        } else
        {
            invalidateSelf();
            aww aww1 = a.a;
            int k;
            if (aww1.g != null)
            {
                k = aww1.g.a;
            } else
            {
                k = -1;
            }
            if (k == a.a.a.g.c - 1)
            {
                f = f + 1;
            }
            if (g != -1 && f >= g)
            {
                stop();
                return;
            }
        }
    }

    public void draw(Canvas canvas)
    {
        if (b)
        {
            return;
        }
        if (h)
        {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), e());
            h = false;
        }
        canvas.drawBitmap(a.a.a(), null, e(), f());
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return a;
    }

    public int getIntrinsicHeight()
    {
        return a.a.a().getHeight();
    }

    public int getIntrinsicWidth()
    {
        return a.a.a().getWidth();
    }

    public int getOpacity()
    {
        return -2;
    }

    public boolean isRunning()
    {
        return c;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        h = true;
    }

    public void setAlpha(int k)
    {
        f().setAlpha(k);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        f().setColorFilter(colorfilter);
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        e = flag;
        if (flag) goto _L2; else goto _L1
_L1:
        d();
_L4:
        return super.setVisible(flag, flag1);
_L2:
        if (d)
        {
            c();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void start()
    {
        d = true;
        f = 0;
        if (e)
        {
            c();
        }
    }

    public void stop()
    {
        d = false;
        d();
    }
}
