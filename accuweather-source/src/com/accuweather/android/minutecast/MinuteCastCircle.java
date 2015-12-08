// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

// Referenced classes of package com.accuweather.android.minutecast:
//            SeekCircle

public class MinuteCastCircle extends SeekCircle
{

    private static final String ANCHOR_TEXT_30 = "30";
    private static final String ANCHOR_TEXT_60 = "60";
    private static final String ANCHOR_TEXT_90 = "90";
    private static final int textPadding = 10;
    private Rect anchorTextBounds;
    private Paint anchorTextPaint;
    protected int mAnchorTextPaintColor;

    public MinuteCastCircle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        anchorTextPaint = new Paint();
        anchorTextBounds = new Rect();
        initAttributes(context, attributeset);
        setMax(119);
        setCircleOffsetFromParentEdge(28F * context.getResources().getDisplayMetrics().density);
        anchorTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        anchorTextPaint.setTextSize(14F * context.getResources().getDisplayMetrics().density);
        anchorTextPaint.setAntiAlias(true);
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.accuweather.android.R.styleable.MinuteCastCircle, 0, 0);
        mAnchorTextPaintColor = context.getColor(3, 0xff000000);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        anchorTextPaint.setColor(mAnchorTextPaintColor);
        anchorTextPaint.getTextBounds("30", 0, 2, anchorTextBounds);
        canvas.drawText("30", ((float)getWidth() - getCircleOffsetFromParentEdge()) + 10F, (float)getHeight() / 2.0F + (float)anchorTextBounds.height() / 3F, anchorTextPaint);
        anchorTextPaint.getTextBounds("60", 0, 2, anchorTextBounds);
        canvas.drawText("60", (float)getWidth() / 2.0F - (float)anchorTextBounds.width() / 2.0F, ((float)getHeight() - getCircleOffsetFromParentEdge()) + getCircleThickness() + 10F, anchorTextPaint);
        anchorTextPaint.getTextBounds("90", 0, 2, anchorTextBounds);
        canvas.drawText("90", getCircleOffsetFromParentEdge() - (float)anchorTextBounds.width() - 10F, (float)getHeight() / 2.0F + (float)anchorTextBounds.height() / 3F, anchorTextPaint);
    }

    protected boolean shouldClampProgress()
    {
        return false;
    }
}
