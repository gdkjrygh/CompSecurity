// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularBorderImageView extends ImageView
{

    private static final int DEFAULT_BORDER_COLOR = 0xff000000;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private int borderColor;
    private final Paint borderPaint;
    private float borderRadius;
    private final RectF borderRect;
    private int borderWidth;
    private boolean ready;
    private boolean setupPending;

    public CircularBorderImageView(Context context)
    {
        super(context);
        borderRect = new RectF();
        borderPaint = new Paint();
        borderColor = 0xff000000;
        borderWidth = 0;
        init();
    }

    public CircularBorderImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircularBorderImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        borderRect = new RectF();
        borderPaint = new Paint();
        borderColor = 0xff000000;
        borderWidth = 0;
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.CircularBorderImageView, i, 0);
        borderWidth = context.getDimensionPixelSize(0, 0);
        borderColor = context.getColor(1, 0xff000000);
        context.recycle();
        init();
    }

    private void init()
    {
        ready = true;
        if (setupPending)
        {
            setup();
            setupPending = false;
        }
    }

    private void setup()
    {
        if (!ready)
        {
            setupPending = true;
            return;
        } else
        {
            borderPaint.setStyle(android.graphics.Paint.Style.STROKE);
            borderPaint.setAntiAlias(true);
            borderPaint.setColor(borderColor);
            borderPaint.setStrokeWidth(borderWidth);
            borderRect.set(0.0F, 0.0F, getWidth(), getHeight());
            borderRadius = Math.min((borderRect.height() - (float)borderWidth) / 2.0F, (borderRect.width() - (float)borderWidth) / 2.0F);
            invalidate();
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (borderWidth != 0)
        {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, borderRadius, borderPaint);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        setup();
    }
}
