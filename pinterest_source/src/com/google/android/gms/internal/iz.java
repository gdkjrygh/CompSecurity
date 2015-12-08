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
//            ll

public final class iz extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private boolean LO;
    private int LV;
    private long LW;
    private int LX;
    private int LY;
    private int LZ;
    private int Ma;
    private boolean Mb;
    private b Mc;
    private Drawable Md;
    private Drawable Me;
    private boolean Mf;
    private boolean Mg;
    private boolean Mh;
    private int Mi;
    private int mFrom;

    public iz(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = a.hi();
        }
        Md = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = Mc;
        drawable.Mm = ((b) (drawable)).Mm | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = a.hi();
        }
        Me = drawable;
        drawable.setCallback(this);
        drawable1 = Mc;
        drawable1.Mm = ((b) (drawable1)).Mm | drawable.getChangingConfigurations();
    }

    iz(b b1)
    {
        LV = 0;
        LY = 255;
        Ma = 0;
        LO = true;
        Mc = new b(b1);
    }

    public final boolean canConstantState()
    {
        if (!Mf)
        {
            boolean flag;
            if (Md.getConstantState() != null && Me.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Mg = flag;
            Mf = true;
        }
        return Mg;
    }

    public final void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        j = 1;
        i = 1;
        flag = false;
        LV;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j = Ma;
        flag1 = LO;
        drawable = Md;
        drawable1 = Me;
        if (i != 0)
        {
            if (!flag1 || j == 0)
            {
                drawable.draw(canvas);
            }
            if (j == LY)
            {
                drawable1.setAlpha(LY);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        LW = SystemClock.uptimeMillis();
        LV = 2;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (LW >= 0L)
        {
            float f = (float)(SystemClock.uptimeMillis() - LW) / (float)LZ;
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
                LV = 0;
            }
            f = Math.min(f, 1.0F);
            f1 = mFrom;
            Ma = (int)(f * (float)(LX - mFrom) + f1);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(LY - j);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(LY);
        }
        if (j > 0)
        {
            drawable1.setAlpha(j);
            drawable1.draw(canvas);
            drawable1.setAlpha(LY);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | Mc.Ml | Mc.Mm;
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (canConstantState())
        {
            Mc.Ml = getChangingConfigurations();
            return Mc;
        } else
        {
            return null;
        }
    }

    public final int getIntrinsicHeight()
    {
        return Math.max(Md.getIntrinsicHeight(), Me.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth()
    {
        return Math.max(Md.getIntrinsicWidth(), Me.getIntrinsicWidth());
    }

    public final int getOpacity()
    {
        if (!Mh)
        {
            Mi = Drawable.resolveOpacity(Md.getOpacity(), Me.getOpacity());
            Mh = true;
        }
        return Mi;
    }

    public final Drawable hh()
    {
        return Me;
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        if (ll.ig())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.invalidateDrawable(this);
            }
        }
    }

    public final Drawable mutate()
    {
        if (!Mb && super.mutate() == this)
        {
            if (!canConstantState())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            Md.mutate();
            Me.mutate();
            Mb = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect)
    {
        Md.setBounds(rect);
        Me.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        if (ll.ig())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.scheduleDrawable(this, runnable, l);
            }
        }
    }

    public final void setAlpha(int i)
    {
        if (Ma == LY)
        {
            Ma = i;
        }
        LY = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        Md.setColorFilter(colorfilter);
        Me.setColorFilter(colorfilter);
    }

    public final void startTransition(int i)
    {
        mFrom = 0;
        LX = LY;
        Ma = 0;
        LZ = i;
        LV = 1;
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (ll.ig())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }

    private class a extends Drawable
    {

        private static final a Mj = new a();
        private static final a Mk = new a(null);

        static a hi()
        {
            return Mj;
        }

        public final void draw(Canvas canvas)
        {
        }

        public final android.graphics.drawable.Drawable.ConstantState getConstantState()
        {
            return Mk;
        }

        public final int getOpacity()
        {
            return -2;
        }

        public final void setAlpha(int i)
        {
        }

        public final void setColorFilter(ColorFilter colorfilter)
        {
        }


        private a()
        {
        }

        class a extends android.graphics.drawable.Drawable.ConstantState
        {

            public final int getChangingConfigurations()
            {
                return 0;
            }

            public final Drawable newDrawable()
            {
                return a.hi();
            }

                private a()
                {
                }

                a(_cls1 _pcls1)
                {
                    this();
                }
        }

    }


    private class b extends android.graphics.drawable.Drawable.ConstantState
    {

        int Ml;
        int Mm;

        public final int getChangingConfigurations()
        {
            return Ml;
        }

        public final Drawable newDrawable()
        {
            return new iz(this);
        }

        b(b b1)
        {
            if (b1 != null)
            {
                Ml = b1.Ml;
                Mm = b1.Mm;
            }
        }
    }

}
