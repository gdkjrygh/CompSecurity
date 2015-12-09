// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import gfy;

public class TopHitNumberView extends TextView
{

    private Rect a;

    public TopHitNumberView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101ec);
    }

    public TopHitNumberView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
    }

    protected void onDraw(Canvas canvas)
    {
        String s = getText().toString();
        int j = gfy.a(getPaint());
        TextPaint textpaint = getPaint();
        textpaint.setColor(getCurrentTextColor());
        textpaint.drawableState = getDrawableState();
        canvas.save();
        canvas.translate(0.0F, -getPaint().getFontMetrics().top);
        for (int i = 0; i < s.length(); i++)
        {
            textpaint.getTextBounds(s, i, i + 1, a);
            canvas.drawText(s, i, i + 1, (float)(j - a.width()) / 2.0F, 0.0F, textpaint);
            canvas.translate(j, 0.0F);
        }

        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        android.graphics.Paint.FontMetrics fontmetrics = getPaint().getFontMetrics();
        if (getText() == null)
        {
            i = 0;
        } else
        {
            i = getText().length();
        }
        setMeasuredDimension(Math.max(0, i) * gfy.a(getPaint()), (int)(fontmetrics.bottom - fontmetrics.top));
    }
}
