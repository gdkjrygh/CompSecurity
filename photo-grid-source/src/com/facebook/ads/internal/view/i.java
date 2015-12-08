// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class i extends TextView
{

    private float a;
    private float b;

    public i(Context context)
    {
        super(context);
        b = 8F;
        super.setSingleLine();
        super.setMaxLines(1);
        a = getTextSize() / context.getResources().getDisplayMetrics().density;
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        int j1 = l - j;
        int k1 = getMeasuredHeight();
        int l1 = getMeasuredWidth();
        float f = a;
        do
        {
            if (f < b)
            {
                break;
            }
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= j1)
            {
                break;
            }
            f -= 0.5F;
        } while (true);
        if (getMeasuredWidth() > j1)
        {
            measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
        }
        setMeasuredDimension(l1, k1);
        super.onLayout(flag, j, k, l, i1);
    }

    public void setMaxLines(int j)
    {
    }

    public void setMinTextSize(float f)
    {
        if (f <= a)
        {
            b = f;
        }
    }

    public void setSingleLine(boolean flag)
    {
    }

    public void setTextSize(float f)
    {
        a = f;
        super.setTextSize(f);
    }
}
