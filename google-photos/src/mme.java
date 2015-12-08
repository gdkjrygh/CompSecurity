// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

public final class mme extends Drawable
    implements Animatable, mlw
{

    private final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final Paint f = new Paint();
    private final AnimatorSet g;
    private final ObjectAnimator h = b.b(this, "growScale");
    private final ObjectAnimator i;
    private final float j = 1.0F;
    private float k;
    private float l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Runnable s;
    private Runnable t;
    private Rect u;

    public mme(int i1, int j1, float f1, boolean flag, int k1)
    {
        c = i1;
        d = j1;
        a = Math.round(255F * f1);
        b = flag;
        e = k1;
        l = 1.0F;
        m = isVisible();
        f.setStyle(android.graphics.Paint.Style.FILL);
        f.setAntiAlias(true);
        Object obj = new AnimatorSet();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[] {
            0.1F, 0.1F
        });
        objectanimator.setInterpolator(new LinearInterpolator());
        objectanimator.setDuration(733L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[] {
            0.1F, 0.8268492F
        });
        objectanimator1.setInterpolator(new mlq(0.3347314F, 0.1248198F, 0.785844F, 1.0F));
        objectanimator1.setDuration(650L);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[] {
            0.8268492F, 0.1F
        });
        objectanimator2.setInterpolator(new mlq(0.225732F, 0.0F, 0.35F, 1.05F));
        objectanimator2.setDuration(617L);
        ((AnimatorSet) (obj)).playSequentially(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        objectanimator = ObjectAnimator.ofFloat(this, "rect1TranslationX", new float[] {
            -522.6F, 199.6F
        });
        objectanimator.setInterpolator(new mlq(0.34F, 0.0F, 0.78F, 1.0F));
        objectanimator.setStartDelay(400L);
        objectanimator.setDuration(1600L);
        ((AnimatorSet) (obj)).play(objectanimator);
        objectanimator = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[] {
            0.1F, 0.55F
        });
        objectanimator.setInterpolator(new mlq(0.2050282F, 0.05705084F, 0.5F, 0.5F));
        objectanimator.setDuration(352L);
        objectanimator1 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[] {
            0.55F, 0.9099503F
        });
        objectanimator1.setInterpolator(new mlq(0.15F, 0.2F, 0.6483738F, 1.004315F));
        objectanimator1.setDuration(532L);
        objectanimator2 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[] {
            0.9099503F, 0.1F
        });
        objectanimator2.setInterpolator(new mlq(0.2577588F, -0.003163357F, 0.2117619F, 1.38179F));
        objectanimator2.setDuration(1116L);
        ((AnimatorSet) (obj)).playSequentially(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        objectanimator = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[] {
            -208F, 132F
        });
        objectanimator.setInterpolator(new mlq(0.26F, 0.0F, 0.75F, 0.68F));
        objectanimator.setDuration(964L);
        objectanimator1 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[] {
            132F, 422.6F
        });
        objectanimator1.setInterpolator(new mlq(0.4F, 0.6270349F, 0.6F, 0.9020258F));
        objectanimator1.setDuration(1036L);
        ((AnimatorSet) (obj)).playSequentially(new Animator[] {
            objectanimator, objectanimator1
        });
        ((AnimatorSet) (obj)).addListener(new mmf(this));
        mkb.b(((Animator) (obj)));
        g = ((AnimatorSet) (obj));
        if (k1 != 2)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        k = f1;
        obj = b.c(this, "growScale");
        ((ObjectAnimator) (obj)).addListener(new mmg(this));
        i = ((ObjectAnimator) (obj));
        u = new Rect();
        b();
    }

    static Runnable a(mme mme1)
    {
        return mme1.s;
    }

    static Runnable a(mme mme1, Runnable runnable)
    {
        mme1.s = null;
        return null;
    }

    static boolean a(mme mme1, boolean flag, boolean flag1)
    {
        return mme1.Drawable.setVisible(flag, false);
    }

    static Runnable b(mme mme1, Runnable runnable)
    {
        mme1.t = null;
        return null;
    }

    private void b()
    {
        h.cancel();
        i.cancel();
        g.cancel();
        n = 0.1F;
        o = -522.6F;
        p = 0.1F;
        q = -197.6F;
        r = k;
    }

    static boolean b(mme mme1)
    {
        return mme1.m;
    }

    static AnimatorSet c(mme mme1)
    {
        return mme1.g;
    }

    static void d(mme mme1)
    {
        mme1.b();
    }

    static Runnable e(mme mme1)
    {
        return mme1.t;
    }

    public final void a()
    {
        m = false;
        if (super.setVisible(false, false))
        {
            h.cancel();
            i.cancel();
            g.cancel();
            if (t != null)
            {
                t.run();
            }
        }
        t = null;
    }

    public final void draw(Canvas canvas)
    {
        while (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(u)) 
        {
            return;
        }
        canvas.save();
        float f1 = u.height();
        if (f1 > (float)c)
        {
            canvas.translate(0.0F, (f1 - (float)c) / 2.0F);
        }
        canvas.scale((float)u.width() / 360F, (float)c / 4F);
        canvas.translate(180F, 2.0F);
        canvas.clipRect(-180F, -2F, 180F, 2.0F);
        if (r < 1.0F)
        {
            if (e == 0)
            {
                canvas.scale(1.0F, -1F);
            }
            canvas.translate(0.0F, 4F * (r - 1.0F) * 0.5F);
            canvas.scale(1.0F, r);
        }
        f.setColor(d);
        f.setAlpha((int)(l * (float)a));
        canvas.drawRect(-180F, -2F, 180F, 2.0F, f);
        f.setColor(d);
        if (b)
        {
            canvas.scale(-1F, 1.0F);
        }
        f.setAlpha((int)(l * 255F));
        canvas.save();
        canvas.translate(o, 0.0F);
        canvas.scale(n, 1.0F);
        canvas.drawRect(-144F, -2F, 144F, 2.0F, f);
        canvas.restore();
        canvas.save();
        canvas.translate(q, 0.0F);
        canvas.scale(p, 1.0F);
        canvas.drawRect(-144F, -2F, 144F, 2.0F, f);
        canvas.restore();
        canvas.restore();
    }

    public final float getGrowScale()
    {
        return r;
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

    public final float getRect1ScaleX()
    {
        return n;
    }

    public final float getRect1TranslationX()
    {
        return o;
    }

    public final float getRect2ScaleX()
    {
        return p;
    }

    public final float getRect2TranslationX()
    {
        return q;
    }

    public final boolean isRunning()
    {
        return isVisible();
    }

    public final void setAlpha(int i1)
    {
        l = i1;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        f.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public final void setGrowScale(float f1)
    {
        r = f1;
        invalidateSelf();
    }

    public final void setRect1ScaleX(float f1)
    {
        n = f1;
        invalidateSelf();
    }

    public final void setRect1TranslationX(float f1)
    {
        o = f1;
        invalidateSelf();
    }

    public final void setRect2ScaleX(float f1)
    {
        p = f1;
        invalidateSelf();
    }

    public final void setRect2TranslationX(float f1)
    {
        q = f1;
        invalidateSelf();
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2;
        if (flag != m)
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
        m = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        super.setVisible(true, flag1);
        if (flag1)
        {
            b();
        }
        i.cancel();
        h.setFloatValues(new float[] {
            j
        });
        h.start();
        if (!g.isStarted())
        {
            g.start();
        }
        t = null;
_L4:
        return flag2;
_L2:
        if (flag2)
        {
            h.cancel();
            i.setFloatValues(new float[] {
                k
            });
            i.start();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void start()
    {
        setVisible(true, true);
    }

    public final void stop()
    {
        setVisible(false, false);
    }
}
