// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class c extends Animation
{

    private int a;
    private View b;
    private boolean c;

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        int i;
        if (c)
        {
            i = (int)((float)a * f);
        } else
        {
            i = (int)((float)a * (1.0F - f));
        }
        b.getLayoutParams().b = i;
        b.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    public (View view, int i, boolean flag)
    {
        a = i;
        b = view;
        c = flag;
    }
}
