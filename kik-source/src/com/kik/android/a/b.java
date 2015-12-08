// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.a;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class b extends Animation
{

    private View a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private android.view.ViewGroup.LayoutParams f;

    public b(View view, int i, int j)
    {
        this(view, i, j, -1);
    }

    public b(View view, int i, int j, int k)
    {
        a = view;
        if (a != null && a.getAnimation() != null)
        {
            a.getAnimation().cancel();
        }
        f = view.getLayoutParams();
        b = i;
        c = j;
        d = k;
        e = -1;
        if (f == null || a == null)
        {
            return;
        } else
        {
            f.height = b;
            a.requestLayout();
            return;
        }
    }

    public final int a()
    {
        return c;
    }

    protected final void applyTransformation(float f1, Transformation transformation)
    {
        if (f == null || a == null)
        {
            return;
        }
        super.applyTransformation(f1, transformation);
        if (b >= 0 && c >= 0)
        {
            int i = c;
            int k = b;
            if (f1 < 1.0F)
            {
                i = (int)((float)(i - k) * f1);
                k = b;
                f.height = i + k;
            } else
            {
                f.height = c;
            }
        }
        if (d >= 0 && e >= 0)
        {
            int j = e;
            int l = d;
            if (f1 < 1.0F)
            {
                j = (int)((float)(j - l) * f1);
                l = d;
                f.width = j + l;
            } else
            {
                f.width = e;
            }
        }
        a.requestLayout();
    }

    public final int b()
    {
        return e;
    }

    public final void cancel()
    {
        super.cancel();
        a = null;
        f = null;
    }
}
