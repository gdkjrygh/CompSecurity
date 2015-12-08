// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import dft;
import dgc;
import dgn;

public class ThrobberView extends View
{

    private dgc a;

    public ThrobberView(Context context)
    {
        this(context, null);
    }

    public ThrobberView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThrobberView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dgn.a(com/spotify/android/paste/widget/ThrobberView, this);
        a = new dgc(dft.b(64F, context.getResources()));
        a.setCallback(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.start();
    }

    protected void onDetachedFromWindow()
    {
        a.stop();
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        a.draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        int k = a.getIntrinsicWidth();
        int l = a.getIntrinsicHeight();
        setMeasuredDimension(getDefaultSize(k, i), getDefaultSize(l, j));
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        k = getPaddingLeft();
        l = getPaddingRight();
        int i1 = getPaddingTop();
        int j1 = getPaddingBottom();
        a.setBounds(0, 0, i - (k + l), j - (i1 + j1));
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == a;
    }
}
