// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.TextView;

public class j extends TextView
{

    private int a;
    private float b;
    private float c;

    public j(Context context, int i)
    {
        super(context);
        c = 8F;
        setMaxLines(i);
        setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        super.setMaxLines(a + 1);
        super.setTextSize(b);
        int j1 = l - i;
        int k1 = i1 - k;
        measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, 0));
        if (getMeasuredHeight() > k1)
        {
            float f = b;
label0:
            do
            {
                float f1;
                do
                {
                    if (f <= c)
                    {
                        break label0;
                    }
                    f1 = f - 0.5F;
                    super.setTextSize(f1);
                    measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), 0);
                    f = f1;
                } while (getMeasuredHeight() > k1);
                f = f1;
            } while (getLineCount() > a);
        }
        super.setMaxLines(a);
        setMeasuredDimension(j1, k1);
        super.onLayout(flag, i, k, l, i1);
    }

    public void setMaxLines(int i)
    {
        a = i;
        super.setMaxLines(i);
    }

    public void setMinTextSize(float f)
    {
        c = f;
    }

    public void setTextSize(float f)
    {
        b = f;
        super.setTextSize(f);
    }
}
