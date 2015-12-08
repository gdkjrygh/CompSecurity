// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ek

public final class cz extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class a extends Drawable
    {

        private static final a ks = new a();
        private static final a kt = new a();

        static a aT()
        {
            return ks;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return kt;
        }

        public int getOpacity()
        {
            return -2;
        }

        public void setAlpha(int i)
        {
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
        }


        private a()
        {
        }
    }

    private static final class a.a extends android.graphics.drawable.Drawable.ConstantState
    {

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return a.aT();
        }

        private a.a()
        {
        }

    }

    static final class b extends android.graphics.drawable.Drawable.ConstantState
    {

        int ku;
        int kv;

        public int getChangingConfigurations()
        {
            return ku;
        }

        public Drawable newDrawable()
        {
            return new cz(this);
        }

        b(b b1)
        {
            if (b1 != null)
            {
                ku = b1.ku;
                kv = b1.kv;
            }
        }
    }


    private boolean kb;
    private int kd;
    private long ke;
    private int kf;
    private int kg;
    private int kh;
    private int ki;
    private int kj;
    private boolean kk;
    private b kl;
    private Drawable km;
    private Drawable kn;
    private boolean ko;
    private boolean kp;
    private boolean kq;
    private int kr;

    public cz(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = a.aT();
        }
        km = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = kl;
        drawable.kv = ((b) (drawable)).kv | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = a.aT();
        }
        kn = drawable;
        drawable.setCallback(this);
        drawable1 = kl;
        drawable1.kv = ((b) (drawable1)).kv | drawable.getChangingConfigurations();
    }

    cz(b b1)
    {
        kd = 0;
        kh = 255;
        kj = 0;
        kb = true;
        kl = new b(b1);
    }

    public Drawable aS()
    {
        return kn;
    }

    public boolean canConstantState()
    {
        if (!ko)
        {
            boolean flag;
            if (km.getConstantState() != null && kn.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kp = flag;
            ko = true;
        }
        return kp;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        kd;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = kj;
        flag1 = kb;
        drawable = km;
        drawable1 = kn;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == kh)
            {
                drawable1.setAlpha(kh);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        ke = SystemClock.uptimeMillis();
        kd = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (ke >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - ke) / (float)ki;
            float f1;
            if (f >= 1.0F)
            {
                i = j;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                kd = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = kf;
            kj = (int)(f * (float)(kg - kf) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(kh - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(kh);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(kh);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | kl.ku | kl.kv;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            kl.ku = getChangingConfigurations();
            return kl;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(km.getIntrinsicHeight(), kn.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(km.getIntrinsicWidth(), kn.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!kq)
        {
            kr = Drawable.resolveOpacity(km.getOpacity(), kn.getOpacity());
            kq = true;
        }
        return kr;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (ek.bJ())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate()
    {
        if (!kk && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            km.mutate();
            kn.mutate();
            kk = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        km.setBounds(rect);
        kn.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (ek.bJ())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.scheduleDrawable(this, runnable, l);
            }
        }
    }

    public void setAlpha(int i)
    {
        if (kj == kh)
        {
            kj = i;
        }
        kh = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        km.setColorFilter(colorfilter);
        kn.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        kf = 0;
        kg = kh;
        kj = 0;
        ki = i;
        kd = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (ek.bJ())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }
}
