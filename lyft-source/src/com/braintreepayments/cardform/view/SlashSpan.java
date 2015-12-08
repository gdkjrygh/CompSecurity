// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public class SlashSpan extends ReplacementSpan
{

    public SlashSpan()
    {
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        canvas.drawText((new StringBuilder()).append(charsequence.subSequence(i, j)).append(" / ").toString(), f, l, paint);
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        return (int)(paint.measureText(" ", 0, 1) * 2.0F + paint.measureText("/", 0, 1) + paint.measureText(charsequence, i, j));
    }
}
