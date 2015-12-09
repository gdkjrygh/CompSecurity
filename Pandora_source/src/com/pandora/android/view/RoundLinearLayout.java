// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RoundLinearLayout extends LinearLayout
{

    protected float a;
    protected int b;
    protected int c;
    protected int d;

    public RoundLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.RoundLinearLayout);
        a = context.getDimension(0, getResources().getDimension(0x7f0900e9));
        c = context.getColor(1, 0);
        b = context.getInt(2, 15);
        d = context.getColor(3, -1);
        context.recycle();
        a();
    }

    public static Drawable a(float f, int i, int j)
    {
        GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            j, j
        });
        if (i != 0)
        {
            float f1;
            float f2;
            float f3;
            boolean flag;
            boolean flag1;
            if ((i & 1) == 1)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if ((i & 2) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i & 4) == 4)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((i & 8) == 8)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (j != 0)
            {
                f1 = f;
            } else
            {
                f1 = 0.0F;
            }
            if (flag)
            {
                f2 = f;
            } else
            {
                f2 = 0.0F;
            }
            if (flag1)
            {
                f3 = f;
            } else
            {
                f3 = 0.0F;
            }
            if (i == 0)
            {
                f = 0.0F;
            }
            gradientdrawable.setCornerRadii(new float[] {
                f1, f1, f2, f2, f3, f3, f, f
            });
        }
        return gradientdrawable;
    }

    private void a()
    {
        Drawable drawable1 = a(a, b, c);
        Drawable drawable;
        StateListDrawable statelistdrawable;
        if (d != -1)
        {
            drawable = a(a, b, d);
        } else
        {
            drawable = drawable1;
        }
        statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, drawable);
        statelistdrawable.addState(new int[0], drawable1);
        drawable = getResources().getDrawable(0x7f0200e9);
        statelistdrawable.addState(new int[0], drawable);
        setBackgroundDrawable(statelistdrawable);
    }

    public void a(int i, float f, int j)
    {
        a = f;
        b = i;
        c = j;
        a();
    }

    public void setBackgroundColor(int i)
    {
        c = i;
        a();
    }

    public void setRoundedCorners(int i)
    {
        b = i;
        a();
    }
}
