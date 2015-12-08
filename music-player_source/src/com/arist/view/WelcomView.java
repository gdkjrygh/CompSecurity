// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.arist.c.g;

public class WelcomView extends View
{

    private Drawable a;
    private Paint b;
    private RectF c;
    private TextPaint d;

    public WelcomView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Paint(1);
        b.setColor(Color.rgb(226, 229, 238));
        b.setStyle(android.graphics.Paint.Style.FILL);
        d = new TextPaint(1);
        d.setTextSize(g.b(getContext(), 30F));
        d.setColor(getResources().getColor(0x7f0b001f));
        c = new RectF();
        a = getResources().getDrawable(0x7f0200f9);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawColor(Color.parseColor("#ebedf5"));
        int i = (getWidth() - a.getIntrinsicWidth()) / 2;
        int j = (getHeight() - a.getIntrinsicHeight()) / 2;
        float f = j;
        float f1 = a.getIntrinsicHeight();
        int k = getHeight();
        c.set(0.0F, 0.0F, k * 2, k * 2);
        c.offset(getWidth() / 2 - k, f + 0.6326531F * f1);
        canvas.drawArc(c, 180F, 360F, false, b);
        a.setBounds(i, j, a.getIntrinsicWidth() + i, a.getIntrinsicHeight() + j);
        a.draw(canvas);
        String s = getResources().getString(0x7f09002c);
        canvas.drawText(s, ((float)getWidth() - d.measureText(s)) / 2.0F, a.getIntrinsicHeight() + j + g.a(getContext(), 20F), d);
    }
}
