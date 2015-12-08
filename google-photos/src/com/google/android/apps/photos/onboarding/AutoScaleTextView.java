// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import gin;

public class AutoScaleTextView extends TextView
{

    private final TextPaint a;
    private float b;
    private float c;
    private boolean d;
    private int e;

    public AutoScaleTextView(Context context)
    {
        this(context, null);
    }

    public AutoScaleTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AutoScaleTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new TextPaint();
        context = context.getTheme().obtainStyledAttributes(attributeset, gin.a, 0, 0);
        c = Math.max(0, context.getDimensionPixelSize(gin.b, 0));
        d = true;
        requestLayout();
        context.recycle();
        b = getTextSize();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onMeasure(int i, int j)
    {
        if (!d && i == e) goto _L2; else goto _L1
_L1:
        int k = android.view.View.MeasureSpec.getSize(i) - getCompoundPaddingLeft() - getCompoundPaddingRight();
        if (c > 0.0F && c < b) goto _L4; else goto _L3
_L3:
        float f2 = b;
_L6:
        super.setTextSize(0, f2);
        d = false;
        e = i;
_L2:
        super.onMeasure(i, j);
        return;
_L4:
        float f;
        float f1;
        CharSequence charsequence;
        f = b;
        a.set(getPaint());
        a.setTextSize(f);
        charsequence = getText();
        f1 = a.measureText(charsequence, 0, charsequence.length());
_L9:
        f2 = f;
        if (f1 <= (float)k) goto _L6; else goto _L5
_L5:
        f2 = f;
        if (f == c) goto _L6; else goto _L7
_L7:
        float f3;
        float f4;
        f3 = Math.max(((float)k / f1) * f, c);
        a.setTextSize(f3);
        f4 = a.measureText(charsequence, 0, charsequence.length());
        f2 = f;
        if (Math.abs(f1 - f4) < 1.0F) goto _L6; else goto _L8
_L8:
        f1 = f4;
        f = f3;
          goto _L9
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        d = true;
    }

    public void setTextSize(float f)
    {
        super.setTextSize(f);
        b = getTextSize();
        d = true;
    }

    public void setTextSize(int i, float f)
    {
        super.setTextSize(i, f);
        b = getTextSize();
        d = true;
    }
}
