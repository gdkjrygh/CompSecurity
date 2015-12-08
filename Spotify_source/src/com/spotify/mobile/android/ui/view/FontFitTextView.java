// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import dfk;
import dgd;
import gmr;

public class FontFitTextView extends TextView
{

    private float a;
    private int b;

    public FontFitTextView(Context context)
    {
        super(context);
        a(context, null, -1);
    }

    public FontFitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset, -1);
    }

    public FontFitTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset, i);
    }

    public FontFitTextView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        int j = i;
        if (i == -1)
        {
            j = 0x1010084;
        }
        setTypeface(dgd.a(context, attributeset, j));
        dfk.a(context, this, attributeset, j);
        a = getTextSize();
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        context = getContext().getTheme().obtainStyledAttributes(attributeset, gmr.e, 0, 0);
        b = context.getDimensionPixelSize(0, 0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void a(String s, int i)
    {
        if (i > 0 && !s.isEmpty())
        {
            if ((i = i - getPaddingLeft() - getPaddingRight()) > 2)
            {
                Paint paint = new Paint();
                paint.set(getPaint());
                paint.setTextSize(a);
                if (paint.measureText(s) <= (float)i)
                {
                    setTextSize(0, a);
                    return;
                }
                float f1 = a;
                float f;
                for (f = 2.0F; f1 - f > 0.5F;)
                {
                    float f2 = (f1 + f) / 2.0F;
                    paint.setTextSize(f2);
                    if (paint.measureText(s) >= (float)i)
                    {
                        f1 = f2;
                    } else
                    {
                        f = f2;
                    }
                }

                f1 = f;
                if (f < (float)b)
                {
                    f1 = b;
                }
                setTextSize(0, f1);
                return;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = getMeasuredHeight();
        a(getText().toString(), i);
        setMeasuredDimension(i, j);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != k || j != l)
        {
            a(getText().toString(), i);
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a(charsequence.toString(), getWidth());
    }
}
