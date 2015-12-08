// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class bm extends Animation
{

    private View a;
    private int b;
    private int c;
    private android.widget.LinearLayout.LayoutParams d;

    public bm(View view, int i, int j)
    {
        setDuration(i);
        a = view;
        b = a.getHeight();
        d = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        c = j;
    }

    public void a(int i)
    {
        b = i;
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        if (f <= 1.0F)
        {
            int i;
            if (c == 0)
            {
                i = (int)((float)b * f);
            } else
            {
                i = (int)((float)b * (1.0F - f));
            }
            d.height = i;
            a.requestLayout();
        }
    }
}
