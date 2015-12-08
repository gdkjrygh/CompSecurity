// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderStationRows extends ViewGroup
{

    private GradientDrawable a;
    private Rect b;
    private int c;
    private int d;
    private View e;

    public PlaceholderStationRows(Context context)
    {
        this(context, null);
    }

    public PlaceholderStationRows(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaceholderStationRows(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = getResources();
        e = LayoutInflater.from(getContext()).inflate(0x7f040084, this, false);
        a = (GradientDrawable)context.getDrawable(0x7f0200ec);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i <= c; i++)
        {
            int j = d * i;
            b.top = j;
            b.bottom = j + e.getMeasuredHeight();
            canvas.save();
            canvas.translate(b.left, b.top);
            e.draw(canvas);
            canvas.restore();
        }

        a.draw(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        b = new Rect(0, 0, i, 0);
        k = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        l = android.view.View.MeasureSpec.makeMeasureSpec(Math.round(getResources().getDimension(0x7f090102)), 0);
        e.measure(k, l);
        e.layout(0, 0, e.getMeasuredWidth(), e.getMeasuredHeight());
        d = e.getMeasuredHeight();
        c = (int)Math.floor(j / d);
        a.setBounds(0, 0, i, j);
    }
}
