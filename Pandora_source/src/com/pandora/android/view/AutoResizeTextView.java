// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class AutoResizeTextView extends TextView
{
    public static interface a
    {

        public abstract void a(TextView textview, float f1, float f2);
    }


    protected a a;
    protected boolean b;
    protected float c;
    protected float d;
    protected float e;
    private float f;
    private float g;
    private boolean h;

    public AutoResizeTextView(Context context)
    {
        this(context, null);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        f = 0.0F;
        g = 20F;
        d = 1.0F;
        e = 0.0F;
        h = true;
        c = getTextSize();
    }

    private int a(CharSequence charsequence, TextPaint textpaint, int i, float f1)
    {
        textpaint = new TextPaint(textpaint);
        textpaint.setTextSize(f1);
        return (new StaticLayout(charsequence, textpaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, d, e, true)).getHeight();
    }

    public void a()
    {
        if (c > 0.0F)
        {
            super.setTextSize(0, c);
            f = c;
        }
    }

    public void a(int i, int j)
    {
        CharSequence charsequence = getText();
        if (charsequence == null || charsequence.length() == 0 || j <= 0 || i <= 0 || c == 0.0F)
        {
            return;
        }
        TextPaint textpaint = getPaint();
        float f3 = textpaint.getTextSize();
        float f1;
        int k;
        if (f > 0.0F)
        {
            f1 = Math.min(c, f);
        } else
        {
            f1 = c;
        }
        for (k = a(charsequence, textpaint, i, f1); k > j && f1 > g; k = a(charsequence, textpaint, i, f1))
        {
            f1 = Math.max(f1 - 1.0F, g);
        }

        if (h && f1 == g && k > j)
        {
            StaticLayout staticlayout = new StaticLayout(charsequence, new TextPaint(textpaint), i, android.text.Layout.Alignment.ALIGN_NORMAL, d, e, false);
            if (staticlayout.getLineCount() > 0)
            {
                int i1 = staticlayout.getLineForVertical(j) - 1;
                if (i1 < 0)
                {
                    setText("");
                } else
                {
                    int l = staticlayout.getLineStart(i1);
                    j = staticlayout.getLineEnd(i1);
                    float f2 = staticlayout.getLineWidth(i1);
                    for (float f4 = textpaint.measureText("..."); (float)i < f2 + f4; f2 = textpaint.measureText(charsequence.subSequence(l, j + 1).toString()))
                    {
                        j--;
                    }

                    setText((new StringBuilder()).append(charsequence.subSequence(0, j)).append("...").toString());
                }
            }
        }
        setTextSize(0, f1);
        setLineSpacing(e, d);
        if (a != null)
        {
            a.a(this, f3, f1);
        }
        b = false;
    }

    public boolean getAddEllipsis()
    {
        return h;
    }

    public float getMaxTextSize()
    {
        return f;
    }

    public float getMinTextSize()
    {
        return g;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (flag || b)
        {
            a(k - i - getCompoundPaddingLeft() - getCompoundPaddingRight(), l - j - getCompoundPaddingBottom() - getCompoundPaddingTop());
        }
        super.onLayout(flag, i, j, k, l);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != k || j != l)
        {
            b = true;
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        b = true;
        a();
    }

    public void setAddEllipsis(boolean flag)
    {
        h = flag;
    }

    public void setLineSpacing(float f1, float f2)
    {
        super.setLineSpacing(f1, f2);
        d = f2;
        e = f1;
    }

    public void setMaxTextSize(float f1)
    {
        f = f1;
        requestLayout();
        invalidate();
    }

    public void setMinTextSize(float f1)
    {
        g = f1;
        requestLayout();
        invalidate();
    }

    public void setOnResizeListener(a a1)
    {
        a = a1;
    }

    public void setTextSize(float f1)
    {
        super.setTextSize(f1);
        c = getTextSize();
    }

    public void setTextSize(int i, float f1)
    {
        super.setTextSize(i, f1);
        c = getTextSize();
    }
}
