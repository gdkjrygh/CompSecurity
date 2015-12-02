// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class e extends TextView
{

    private float a;
    private float b;

    public e(Context context)
    {
        super(context);
        b = 8F;
        super.setSingleLine();
        super.setMaxLines(1);
        a = getTextSize() / context.getResources().getDisplayMetrics().density;
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = k - i;
        int j1 = getMeasuredHeight();
        int k1 = getMeasuredWidth();
        float f = a;
        do
        {
label0:
            {
                if (f >= b)
                {
                    super.setTextSize(f);
                    measure(0, 0);
                    if (getMeasuredWidth() > i1)
                    {
                        break label0;
                    }
                }
                if (getMeasuredWidth() > i1)
                {
                    measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
                }
                setMeasuredDimension(k1, j1);
                super.onLayout(flag, i, j, k, l);
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
