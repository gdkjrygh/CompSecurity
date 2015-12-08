// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;

public class AchievementProgressView extends TextView
{

    private int mCurrentSteps;
    private final Rect mDrawingBounds;
    private final RectF mDrawingBoundsF;
    private int mInnerArcColor;
    private Paint mInnerArcPaint;
    private float mInnerArcStrokeWidth;
    private int mOuterArcColor;
    private Paint mOuterArcPaint;
    private float mOuterArcStrokeWidth;
    private int mTotalSteps;

    public AchievementProgressView(Context context)
    {
        super(context);
        mDrawingBounds = new Rect();
        mDrawingBoundsF = new RectF();
        initialize();
    }

    public AchievementProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDrawingBounds = new Rect();
        mDrawingBoundsF = new RectF();
        initialize();
    }

    public AchievementProgressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDrawingBounds = new Rect();
        mDrawingBoundsF = new RectF();
        initialize();
    }

    private void initialize()
    {
        mOuterArcStrokeWidth = getResources().getDimension(0x7f0c006d);
        mInnerArcStrokeWidth = getResources().getDimension(0x7f0c006c);
        mOuterArcColor = getResources().getColor(0x7f0b0007);
        mInnerArcColor = getResources().getColor(0x7f0b0255);
        mOuterArcPaint = new Paint();
        mOuterArcPaint.setAntiAlias(true);
        mOuterArcPaint.setColor(mOuterArcColor);
        mOuterArcPaint.setStrokeWidth(mOuterArcStrokeWidth);
        mOuterArcPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mInnerArcPaint = new Paint(mOuterArcPaint);
        mInnerArcPaint.setStrokeWidth(mInnerArcStrokeWidth);
        mInnerArcPaint.setColor(mInnerArcColor);
    }

    public final String getPercentageText(int i, int j)
    {
        mCurrentSteps = i;
        mTotalSteps = j;
        i = (mCurrentSteps * 100) / mTotalSteps;
        return getResources().getString(0x7f100212, new Object[] {
            Integer.valueOf(i)
        });
    }

    public void onDraw(Canvas canvas)
    {
        getDrawingRect(mDrawingBounds);
        mDrawingBoundsF.set(mDrawingBounds);
        float f = mOuterArcStrokeWidth / 2.0F;
        mDrawingBoundsF.inset(f, f);
        canvas.drawArc(mDrawingBoundsF, 0.0F, 360F, false, mOuterArcPaint);
        f = mOuterArcStrokeWidth / 2.0F + mInnerArcStrokeWidth / 2.0F;
        mDrawingBoundsF.inset(f, f);
        f = ((float)mCurrentSteps * 360F) / (float)mTotalSteps;
        canvas.drawArc(mDrawingBoundsF, 270F, f, false, mInnerArcPaint);
        super.onDraw(canvas);
    }

    public final void setSteps(int i, int j)
    {
        setText(getPercentageText(i, j));
    }
}
