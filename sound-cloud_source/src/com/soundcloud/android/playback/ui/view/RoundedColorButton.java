// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.Button;
import com.soundcloud.android.utils.ViewUtils;

public class RoundedColorButton extends Button
{

    private static final int ROUNDING_DP = 4;
    private ColorStateList backgroundColorStateList;
    private Paint backgroundPaint;
    private RectF rectangle;
    private float roundingPx;

    public RoundedColorButton(Context context)
    {
        super(context);
    }

    public RoundedColorButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context, attributeset);
    }

    public RoundedColorButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset);
    }

    private void drawBackground(Canvas canvas)
    {
        int i = backgroundColorStateList.getColorForState(getDrawableState(), backgroundColorStateList.getDefaultColor());
        backgroundPaint.setColor(i);
        rectangle.right = getWidth();
        rectangle.bottom = getHeight();
        canvas.drawRoundRect(rectangle, roundingPx, roundingPx, backgroundPaint);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        backgroundPaint = new Paint();
        backgroundPaint.setAntiAlias(true);
        roundingPx = ViewUtils.dpToPx(getContext(), 4);
        rectangle = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        setCustomAttributes(context, attributeset);
    }

    private void setCustomAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.RoundedColorButton, 0, 0);
        backgroundColorStateList = context.getColorStateList(0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onDraw(Canvas canvas)
    {
        if (backgroundColorStateList != null)
        {
            drawBackground(canvas);
        }
        super.onDraw(canvas);
    }

    public void setBackground(ColorStateList colorstatelist)
    {
        backgroundColorStateList = colorstatelist;
        invalidate();
    }
}
