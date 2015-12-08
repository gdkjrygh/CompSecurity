// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareRelativeLayout extends RelativeLayout
{

    private int a;

    public SquareRelativeLayout(Context context)
    {
        super(context);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (attributeset != null)
        {
            a = context.obtainStyledAttributes(attributeset, R.styleable.SquareRelativeLayout).getInt(0, 0);
        }
    }

    public void onMeasure(int i, int j)
    {
        int k;
        if (a == 0)
        {
            k = i;
        } else
        {
            k = j;
        }
        if (a != 0)
        {
            i = j;
        }
        super.onMeasure(k, i);
    }
}
