// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class BackButton extends TextView
{

    private final int a = (int)getResources().getDimension(0x7f0a0003);
    private final int b = (int)getResources().getDimension(0x7f0a0002);
    private final int c = (int)getResources().getDimension(0x7f0a0004);
    private final Drawable d = getContext().getResources().getDrawable(0x7f020011);
    private boolean e;

    public BackButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = true;
    }

    protected void onDraw(Canvas canvas)
    {
        if (e)
        {
            canvas.translate(a, 0.0F);
            super.onDraw(canvas);
            canvas.translate(-a, 0.0F);
        }
        d.draw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        if (e)
        {
            super.onMeasure(i, j);
            k = getMeasuredWidth();
        }
        setMeasuredDimension(k + a, getMeasuredHeight());
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        i = j / 2;
        j = b / 2;
        d.setBounds(0, i - j, c, i + j);
    }

    public void setTextVisible(boolean flag)
    {
        e = flag;
        requestLayout();
    }
}
