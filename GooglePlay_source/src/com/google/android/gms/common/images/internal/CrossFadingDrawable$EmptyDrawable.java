// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.common.images.internal:
//            CrossFadingDrawable

private static final class EmptyConstantState extends Drawable
{
    private static final class EmptyConstantState extends android.graphics.drawable.Drawable.ConstantState
    {

        public final int getChangingConfigurations()
        {
            return 0;
        }

        public final Drawable newDrawable()
        {
            return CrossFadingDrawable.EmptyDrawable.EMPTY_DRAWABLE;
        }

        private EmptyConstantState()
        {
        }

        EmptyConstantState(byte byte0)
        {
            this();
        }
    }


    private static final EmptyConstantState EMPTY_CONSTANT_STATE = new EmptyConstantState((byte)0);
    private static final EmptyConstantState EMPTY_DRAWABLE = new <init>();

    public final void draw(Canvas canvas)
    {
    }

    public final android.graphics.drawable.wable.EmptyDrawable getConstantState()
    {
        return EMPTY_CONSTANT_STATE;
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



    private EmptyConstantState()
    {
    }
}
