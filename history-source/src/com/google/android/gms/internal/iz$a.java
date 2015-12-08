// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            iz

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
            return iz.a.hi();
        }

        private a()
        {
        }

        a(iz._cls1 _pcls1)
        {
            this();
        }
    }


    private static final Mk Mj = new <init>();
    private static final a Mk = new a(null);

    static hi hi()
    {
        return Mj;
    }

    public void draw(Canvas canvas)
    {
    }

    public android.graphics.drawable.ble.ConstantState getConstantState()
    {
        return Mk;
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
