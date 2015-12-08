// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.widgets;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontFitTextView extends TextView
{

    private Paint mTestPaint;

    public FontFitTextView(Context context)
    {
        super(context);
        initialise();
    }

    public FontFitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initialise();
    }

    private void initialise()
    {
        mTestPaint = new Paint();
        mTestPaint.set(getPaint());
    }

    private void refitText(String s, int i)
    {
        if (i <= 0)
        {
            return;
        }
        int j = getPaddingLeft();
        int k = getPaddingRight();
        float f1 = 22F;
        float f = 2.0F;
        mTestPaint.set(getPaint());
        while (f1 - f > 0.5F) 
        {
            float f2 = (f1 + f) / 2.0F;
            mTestPaint.setTextSize(f2);
            if (mTestPaint.measureText(s) >= (float)(i - j - k))
            {
                f1 = f2;
            } else
            {
                f = f2;
            }
        }
        setTextSize(0, f);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = getMeasuredHeight();
        refitText(getText().toString(), i);
        setMeasuredDimension(i, j);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != k)
        {
            refitText(getText().toString(), i);
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        refitText(charsequence.toString(), getWidth());
    }
}
