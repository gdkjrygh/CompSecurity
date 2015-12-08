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
//            zzic

public final class zzhd extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{
    private static final class a extends Drawable
    {

        private static final a a = new a();
        private static final a b = new a();

        static a a()
        {
            return a;
        }

        public void draw(Canvas canvas)
        {
        }

        public android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return b;
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
            return a.a();
        }

        private a.a()
        {
        }

    }

    static final class b extends android.graphics.drawable.Drawable.ConstantState
    {

        int a;
        int b;

        public int getChangingConfigurations()
        {
            return a;
        }

        public Drawable newDrawable()
        {
            return new zzhd(this);
        }

        b(b b1)
        {
            if (b1 != null)
            {
                a = b1.a;
                b = b1.b;
            }
        }
    }


    private int mFrom;
    private long zzGX;
    private Drawable zzSA;
    private boolean zzSB;
    private boolean zzSC;
    private boolean zzSD;
    private int zzSE;
    private boolean zzSl;
    private int zzSs;
    private int zzSt;
    private int zzSu;
    private int zzSv;
    private int zzSw;
    private boolean zzSx;
    private b zzSy;
    private Drawable zzSz;

    public zzhd(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = a.a();
        }
        zzSz = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = zzSy;
        drawable.b = ((b) (drawable)).b | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = a.a();
        }
        zzSA = drawable;
        drawable.setCallback(this);
        drawable1 = zzSy;
        drawable1.b = ((b) (drawable1)).b | drawable.getChangingConfigurations();
    }

    zzhd(b b1)
    {
        zzSs = 0;
        zzSu = 255;
        zzSw = 0;
        zzSl = true;
        zzSy = new b(b1);
    }

    public boolean canConstantState()
    {
        if (!zzSB)
        {
            boolean flag;
            if (zzSz.getConstantState() != null && zzSA.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzSC = flag;
            zzSB = true;
        }
        return zzSC;
    }

    public void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        zzSs;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = zzSw;
        flag1 = zzSl;
        drawable = zzSz;
        drawable1 = zzSA;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == zzSu)
            {
                drawable1.setAlpha(zzSu);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        zzGX = SystemClock.uptimeMillis();
        zzSs = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (zzGX >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - zzGX) / (float)zzSv;
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
                zzSs = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = mFrom;
            zzSw = (int)(f * (float)(zzSt - mFrom) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(zzSu - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(zzSu);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(zzSu);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | zzSy.a | zzSy.b;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            zzSy.a = getChangingConfigurations();
            return zzSy;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(zzSz.getIntrinsicHeight(), zzSA.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(zzSz.getIntrinsicWidth(), zzSA.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!zzSD)
        {
            zzSE = Drawable.resolveOpacity(zzSz.getOpacity(), zzSA.getOpacity());
            zzSD = true;
        }
        return zzSE;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (zzic.zzne())
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
        if (!zzSx && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            zzSz.mutate();
            zzSA.mutate();
            zzSx = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        zzSz.setBounds(rect);
        zzSA.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (zzic.zzne())
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
        if (zzSw == zzSu)
        {
            zzSw = i;
        }
        zzSu = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        zzSz.setColorFilter(colorfilter);
        zzSA.setColorFilter(colorfilter);
    }

    public void startTransition(int i)
    {
        mFrom = 0;
        zzSt = zzSu;
        zzSw = 0;
        zzSv = i;
        zzSs = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (zzic.zzne())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }

    public Drawable zzlA()
    {
        return zzSA;
    }
}
