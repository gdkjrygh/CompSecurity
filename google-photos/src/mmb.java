// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;

public final class mmb extends Drawable
    implements mlw
{

    double a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private final Paint f = new Paint();
    private final mkk g = new mkk(100D, 18D);
    private final mkm h;
    private final ObjectAnimator i = b.b(this, "growScale");
    private final ObjectAnimator j;
    private final float k = 1.0F;
    private float l;
    private float m;
    private boolean n;
    private float o;
    private Runnable p;
    private final mkl q = new mmd(this);

    public mmb(int i1, int j1, float f1, int k1)
    {
        float f2 = 0.0F;
        super();
        c = i1;
        d = j1;
        b = Math.round(255F * f1);
        e = k1;
        f.setStyle(android.graphics.Paint.Style.FILL);
        f.setAntiAlias(true);
        m = 1.0F;
        n = isVisible();
        o = 0.0F;
        a = (double)getLevel() / 10000D;
        Object obj;
        if (k1 != 2)
        {
            f1 = f2;
        } else
        {
            f1 = 1.0F;
        }
        l = f1;
        obj = g.a((double)getLevel() / 10000D).b(a);
        obj.l = true;
        ((mkk) (obj)).a(q);
        h = new mkm(new mkk[] {
            g
        });
        obj = b.c(this, "growScale");
        ((ObjectAnimator) (obj)).addListener(new mmc(this));
        j = ((ObjectAnimator) (obj));
    }

    static Runnable a(mmb mmb1, Runnable runnable)
    {
        mmb1.p = null;
        return null;
    }

    static boolean a(mmb mmb1)
    {
        return mmb1.n;
    }

    static boolean a(mmb mmb1, boolean flag, boolean flag1)
    {
        return mmb1.Drawable.setVisible(flag, false);
    }

    static Runnable b(mmb mmb1)
    {
        return mmb1.p;
    }

    public final void a()
    {
        n = false;
        if (super.setVisible(false, false))
        {
            i.cancel();
            j.cancel();
            b();
            if (p != null)
            {
                p.run();
            }
        }
        p = null;
    }

    public final void b()
    {
        g.a((double)getLevel() / 10000D);
        mkm mkm1 = h;
        if (mkm1.f)
        {
            if (mkm1.g)
            {
                mkm1.g = false;
                mkm1.a.b(mkm1.h);
            }
            mkm1.f = false;
        }
    }

    public final void draw(Canvas canvas)
    {
        if (getBounds().isEmpty() || !isVisible())
        {
            return;
        }
        canvas.save();
        Rect rect = getBounds();
        float f1 = rect.height();
        if (f1 > (float)c)
        {
            canvas.translate(0.0F, (f1 - (float)c) / 2.0F);
        }
        canvas.scale((float)rect.width() / 10000F, (float)c / 4F);
        canvas.translate(5000F, 2.0F);
        if (o < 1.0F)
        {
            if (e == 0)
            {
                canvas.scale(1.0F, -1F);
            }
            canvas.translate(0.0F, 4F * (o - 1.0F) * 0.5F);
            canvas.scale(1.0F, o);
        }
        f.setColor(d);
        f.setAlpha((int)(m * (float)b));
        canvas.drawRect(-5000F, -2F, 5000F, 2.0F, f);
        f.setAlpha((int)(m * 255F));
        canvas.drawRect(-5000F, -2F, (float)(a * 10000D) - 5000F, 2.0F, f);
        canvas.restore();
    }

    public final float getGrowScale()
    {
        return o;
    }

    public final int getIntrinsicHeight()
    {
        return c;
    }

    public final int getIntrinsicWidth()
    {
        return -1;
    }

    public final int getOpacity()
    {
        return -3;
    }

    protected final boolean onLevelChange(int i1)
    {
        g.b((double)i1 / 10000D);
        mkm mkm1 = h;
        if (!mkm1.f)
        {
            mkm1.f = true;
            mkm1.e = AnimationUtils.currentAnimationTimeMillis();
            mkm1.a();
        }
        return true;
    }

    public final void setAlpha(int i1)
    {
        m = i1;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        f.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final void setGrowScale(float f1)
    {
        o = f1;
        invalidateSelf();
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2;
        if (flag != n)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag2 && !flag1)
        {
            return false;
        }
        n = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        super.setVisible(true, flag1);
        if (flag1)
        {
            b();
            i.cancel();
            j.cancel();
            o = l;
        }
        j.cancel();
        i.setFloatValues(new float[] {
            k
        });
        i.start();
        p = null;
_L4:
        return flag2;
_L2:
        if (flag2)
        {
            i.cancel();
            j.setFloatValues(new float[] {
                l
            });
            j.start();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
