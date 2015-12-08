// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.a;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class c extends Animation
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    private View a;
    private final int b;
    private ColorDrawable c;
    private final int d;
    private final int e;

    public c(View view, int i, int j, int k)
    {
        a = view;
        d = j;
        if (a != null && a.getAnimation() != null)
        {
            a.getAnimation().cancel();
        }
        b = i;
        c = new ColorDrawable(b);
        e = k;
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        if (a == null)
        {
            return;
        }
        float f1;
        int i;
        int j;
        if (d == a.b)
        {
            f1 = 1.0F - 1.0F * f;
        } else
        {
            f1 = f;
        }
        j = (int)(f1 * (float)(255 - e)) + e;
        i = j;
        if (j > 255)
        {
            i = 255;
        }
        j = i;
        if (i < e)
        {
            j = e;
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
