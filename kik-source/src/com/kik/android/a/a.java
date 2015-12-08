// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.a;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class a extends Animation
{

    private View a;
    private final int b = -1;
    private ColorDrawable c;

    public a(View view)
    {
        a = view;
        if (a != null && a.getAnimation() != null)
        {
            a.getAnimation().cancel();
        }
        c = new ColorDrawable(b);
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        int i = 255;
        if (a == null)
        {
            return;
        }
        int j = (int)((0.8F - 0.8F * f) * 255F);
        if (j <= 255)
        {
            i = j;
        }
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (a.getBackground() != c)
        {
            a.setBackgroundDrawable(c);
        }
        a.getBackground().mutate().setAlpha(j);
        super.applyTransformation(f, transformation);
    }

    public final void cancel()
    {
        super.cancel();
        a = null;
    }
}
