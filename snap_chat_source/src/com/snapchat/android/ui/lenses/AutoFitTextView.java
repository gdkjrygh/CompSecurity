// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class AutoFitTextView extends TextView
{

    private Paint a;
    private float b;

    public AutoFitTextView(Context context)
    {
        super(context);
        a();
    }

    public AutoFitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    private void a()
    {
        a = new Paint();
        a.set(getPaint());
        b = getTextSize();
    }

    private void a(String s, int i)
    {
        i -= getPaddingLeft() + getPaddingRight();
        if (i <= 0 || s.isEmpty())
        {
            return;
        }
        a.set(getPaint());
        a.setTextSize(b);
        if (a.measureText(s) <= (float)i)
        {
            setTextSize(0, b);
            return;
        }
        float f = b;
        float f1;
        for (f1 = 2.0F; f - f1 > 0.5F;)
        {
            float f2 = (f + f1) / 2.0F;
            a.setTextSize(f2);
            if (a.measureText(s) >= (float)i)
            {
                f = f2;
            } else
            {
                f1 = f2;
            }
        }

        setTextSize(0, f1);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        a(getText().toString(), i);
        setMeasuredDimension(i, j);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k || j != l)
        {
            a(getText().toString(), i);
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        a(charsequence.toString(), getWidth());
    }
}
