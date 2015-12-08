// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            cz

private static final class a extends Drawable
{
    private static final class a extends android.graphics.drawable.Drawable.ConstantState
    {

        public int getChangingConfigurations()
        {
            return 0;
        }

        public Drawable newDrawable()
        {
            return cz.a.aT();
        }

        private a()
        {
        }

        a(cz._cls1 _pcls1)
        {
            this();
        }
    }


    private static final kt ks = new <init>();
    private static final a kt = new a(null);

    static aT aT()
    {
        return ks;
    }

    public void draw(Canvas canvas)
    {
    }

    public android.graphics.drawable.ble.ConstantState getConstantState()
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
