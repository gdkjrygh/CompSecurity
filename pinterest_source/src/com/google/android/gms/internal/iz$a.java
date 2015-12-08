// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

final class nstantState extends Drawable
{

    private static final a Mj = new <init>();
    private static final a Mk = new a(null);

    static nstantState hi()
    {
        return Mj;
    }

    public final void draw(Canvas canvas)
    {
    }

    public final android.graphics.drawable.ble.ConstantState getConstantState()
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


    private nstantState()
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

}
