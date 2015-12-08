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
//            kc

public final class iw extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class a extends Drawable
    {

        private static final a Lf = new a();
        private static final a Lg = new a();

        static a gL()
        {
            return Lf;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return Lg;
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
            return a.gL();
        }

        private a.a()
        {
        }

    }

    static final class b extends android.graphics.drawable.Drawable.ConstantState
    {

        int Lh;
        int Li;

        public int getChangingConfigurations()
        {
            return Lh;
        }

        public Drawable newDrawable()
        {
            return new iw(this);
        }

        b(b b1)
        {
            if (b1 != null)
            {
                Lh = b1.Lh;
                Li = b1.Li;
            }
        }
    }


    private boolean KL;
    private int KR;
    private long KS;
    private int KT;
    private int KU;
    private int KV;
    private int KW;
    private boolean KX;
    private b KY;
    private Drawable KZ;
    private Drawable La;
    private boolean Lb;
    private boolean Lc;
    private boolean Ld;
    private int Le;
    private int mFrom;

    public iw(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = a.gL();
        }
        KZ = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = KY;
        drawable.Li = ((b) (drawable)).Li | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = a.gL();
        }
        La = drawable;
        drawable.setCallback(this);
        drawable1 = KY;
        drawable1.Li = ((b) (drawable1)).Li | drawable.getChangingConfigurations();
    }

    iw(b b1)
    {
        KR = 0;
        KU = 255;
        KW = 0;
        KL = true;
        KY = new b(b1);
    }

    public boolean canConstantState()
    {
        if (!Lb)
        {
            boolean flag;
            if (KZ.getConstantState() != null && La.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Lc = flag;
            Lb = true;
        }
        return Lc;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        KR;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = KW;
        flag1 = KL;
        drawable = KZ;
        drawable1 = La;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == KU)
            {
                drawable1.setAlpha(KU);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        KS = SystemClock.uptimeMillis();
        KR = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (KS >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - KS) / (float)KV;
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
                KR = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = mFrom;
            KW = (int)(f * (float)(KT - mFrom) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(KU - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(KU);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(KU);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Drawable gK()
    {
        return La;
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | KY.Lh | KY.Li;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            KY.Lh = getChangingConfigurations();
            return KY;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(KZ.getIntrinsicHeight(), La.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(KZ.getIntrinsicWidth(), La.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!Ld)
        {
            Le = Drawable.resolveOpacity(KZ.getOpacity(), La.getOpacity());
            Ld = true;
        }
        return Le;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (kc.hB())
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
        if (!KX && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            KZ.mutate();
            La.mutate();
            KX = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        KZ.setBounds(rect);
        La.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (kc.hB())
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
        if (KW == KU)
        {
            KW = i;
        }
        KU = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        KZ.setColorFilter(colorfilter);
        La.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        mFrom = 0;
        KT = KU;
        KW = 0;
        KV = i;
        KR = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (kc.hB())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }
}
