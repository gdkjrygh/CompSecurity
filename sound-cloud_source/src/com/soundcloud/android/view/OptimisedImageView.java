// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class OptimisedImageView extends ImageView
{

    private static final int DEFAULT_GRADIENT_END_COLOR = 0xaa000000;
    private static final float DEFAULT_GRADIENT_START = 0.7F;
    private static final int DEFAULT_GRADIENT_START_COLOR = 0x5f000000;
    private static final boolean DEFAULT_SHOW_GRADIENT = false;
    private static final float GRADIENT_POSITIONS[] = {
        0.0F, 0.6F, 1.0F
    };
    private int gradientColors[];
    private int gradientEndColor;
    private Paint gradientPaint;
    private Rect gradientRect;
    private float gradientStart;
    private int gradientStartColor;
    private boolean shouldIgnoreNextRequestLayout;
    private boolean showGradient;

    public OptimisedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initAttributes(context, attributeset);
        if (showGradient)
        {
            initGradientDrawAllocations();
        }
    }

    private void drawGradient(Canvas canvas)
    {
        canvas.getClipBounds(gradientRect);
        int i = gradientRect.top;
        Rect rect = gradientRect;
        float f = gradientRect.bottom - i;
        float f1 = gradientStart;
        rect.top = (int)((float)i + f * f1);
        canvas.drawRect(gradientRect, gradientPaint);
    }

    private void generateGradient(int i, int j)
    {
        LinearGradient lineargradient = new LinearGradient(0.0F, i + (int)((float)(j - i) * gradientStart), 0.0F, j, gradientColors, GRADIENT_POSITIONS, android.graphics.Shader.TileMode.CLAMP);
        gradientPaint.setShader(lineargradient);
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.OptimisedImageView);
        showGradient = context.getBoolean(0, false);
        gradientStart = context.getFloat(1, 0.7F);
        gradientStartColor = context.getColor(2, 0x5f000000);
        gradientEndColor = context.getColor(3, 0xaa000000);
        context.recycle();
    }

    private void initGradientDrawAllocations()
    {
        gradientPaint = new Paint();
        gradientRect = new Rect();
        gradientColors = (new int[] {
            0, gradientStartColor, gradientEndColor
        });
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (showGradient && getDrawable() != null)
        {
            drawGradient(canvas);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (showGradient && flag)
        {
            generateGradient(j, l);
        }
    }

    public void requestLayout()
    {
        if (!shouldIgnoreNextRequestLayout)
        {
            super.requestLayout();
        }
        shouldIgnoreNextRequestLayout = false;
    }

}
