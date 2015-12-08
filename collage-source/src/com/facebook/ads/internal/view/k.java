// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class k extends TextView
{

    private float a;
    private float b;

    public k(Context context)
    {
        super(context);
        b = 8F;
        super.setSingleLine();
        super.setMaxLines(1);
        a = getTextSize() / context.getResources().getDisplayMetrics().density;
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    protected void onLayout(boolean flag, int i, int j, int l, int i1)
    {
        int j1 = l - i;
        int k1 = getMeasuredHeight();
        int l1 = getMeasuredWidth();
        float f = a;
        do
        {
label0:
            {
                if (f >= b)
                {
                    super.setTextSize(f);
                    measure(0, 0);
                    if (getMeasuredWidth() > j1)
                    {
                        break label0;
                    }
                }
                if (getMeasuredWidth() > j1)
                {
                    measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
                }
                setMeasuredDimension(l1, k1);
                super.onLayout(flag, i, j, l, i1);
                return;
            }
            f -= 0.5F;
        } while (true);
    }

    public void setMaxLines(int i)
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
