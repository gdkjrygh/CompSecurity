// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.google.android.play.cardview:
//            CardViewGroupDelegates, RoundRectDrawable

private static final class <init> extends lairMr1
{

    public final void initialize(View view, Context context, AttributeSet attributeset, int i)
    {
        context = getStyledAttrs(context, attributeset, i);
        attributeset = new RoundRectDrawable(context.getColorStateList(0), context.getDimension(1, 0.0F), context.getDimensionPixelSize(3, 0));
        view.setClipToOutline(true);
        view.setElevation(context.getDimension(2, 0.0F));
        view.setBackground(attributeset);
        view.setClipToOutline(context.getBoolean(4, true));
        context.recycle();
    }

    private lairMr1()
    {
        super((byte)0);
    }

    lairMr1(byte byte0)
    {
        this();
    }
}
