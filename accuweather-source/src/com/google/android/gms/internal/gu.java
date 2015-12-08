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
//            iq

public final class gu extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class a extends Drawable
    {

        private static final a FH = new a();
        private static final a FI = new a();

        static a fc()
        {
            return FH;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return FI;
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
            return a.fc();
        }

        private a.a()
        {
        }

    }

    static final class b extends android.graphics.drawable.Drawable.ConstantState
    {

        int FJ;
        int FK;

        public int getChangingConfigurations()
        {
            return FJ;
        }

        public Drawable newDrawable()
        {
            return new gu(this);
        }

        b(b b1)
        {
            if (b1 != null)
            {
                FJ = b1.FJ;
                FK = b1.FK;
            }
        }
    }


    private b FA;
    private Drawable FB;
    private Drawable FC;
    private boolean FD;
    private boolean FE;
    private boolean FF;
    private int FG;
    private boolean Fm;
    private int Fs;
    private long Ft;
    private int Fu;
    private int Fv;
    private int Fw;
    private int Fx;
    private int Fy;
    private boolean Fz;

    public gu(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = a.fc();
        }
        FB = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = FA;
        drawable.FK = ((b) (drawable)).FK | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = a.fc();
        }
        FC = drawable;
        drawable.setCallback(this);
        drawable1 = FA;
        drawable1.FK = ((b) (drawable1)).FK | drawable.getChangingConfigurations();
    }

    gu(b b1)
    {
        Fs = 0;
        Fw = 255;
        Fy = 0;
        Fm = true;
        FA = new b(b1);
    }

    public boolean canConstantState()
    {
        if (!FD)
        {
            boolean flag;
            if (FB.getConstantState() != null && FC.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            FE = flag;
            FD = true;
        }
        return FE;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        Fs;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = Fy;
        flag1 = Fm;
        drawable = FB;
        drawable1 = FC;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == Fw)
            {
                drawable1.setAlpha(Fw);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Ft = SystemClock.uptimeMillis();
        Fs = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (Ft >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - Ft) / (float)Fx;
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
                Fs = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = Fu;
            Fy = (int)(f * (float)(Fv - Fu) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(Fw - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(Fw);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(Fw);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Drawable fb()
    {
        return FC;
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | FA.FJ | FA.FK;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            FA.FJ = getChangingConfigurations();
            return FA;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(FB.getIntrinsicHeight(), FC.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(FB.getIntrinsicWidth(), FC.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!FF)
        {
            FG = Drawable.resolveOpacity(FB.getOpacity(), FC.getOpacity());
            FF = true;
        }
        return FG;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (iq.fX())
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
        if (!Fz && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            FB.mutate();
            FC.mutate();
            Fz = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        FB.setBounds(rect);
        FC.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (iq.fX())
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
        if (Fy == Fw)
        {
            Fy = i;
        }
        Fw = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        FB.setColorFilter(colorfilter);
        FC.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        Fu = 0;
        Fv = Fw;
        Fy = 0;
        Fx = i;
        Fs = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (iq.fX())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }
}
