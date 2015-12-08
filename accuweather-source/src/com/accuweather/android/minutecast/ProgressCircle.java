// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

public class ProgressCircle extends View
{

    private int armColors[];
    private float armPositions[];
    private float circleOffsetFromParentEdge;
    private float circleThickness;
    private int colors[];
    private RectF innerCircleRect;
    private SweepGradient mArmSweepGradient;
    protected float mCenterX;
    protected float mCenterY;
    private int mCircleArmEndColorGradient;
    private int mCircleArmPaintColor;
    private int mCircleArmStartColorGradient;
    private Paint mCircleClipPaint;
    private int mCircleClipPaintColor;
    private int mCircleThumbColor;
    private Paint mColorCirclePaint;
    private SweepGradient mFullCircleSweepGradient;
    protected int mMaxProgress;
    protected int mProgress;
    protected float mRadius;
    protected float mSectionHeight;
    private int mViewHeight;
    private int mViewWidth;
    private RectF wedgeRect;

    public ProgressCircle(Context context)
    {
        super(context);
        armColors = new int[9];
        armPositions = new float[armColors.length];
        circleOffsetFromParentEdge = 35F;
        mViewWidth = -1;
        mViewHeight = -1;
        init();
    }

    public ProgressCircle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        armColors = new int[9];
        armPositions = new float[armColors.length];
        circleOffsetFromParentEdge = 35F;
        mViewWidth = -1;
        mViewHeight = -1;
        initSeekCircleAttributes(context, attributeset);
        initProgressCircleAttributes(context, attributeset);
        init();
    }

    public ProgressCircle(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        armColors = new int[9];
        armPositions = new float[armColors.length];
        circleOffsetFromParentEdge = 35F;
        mViewWidth = -1;
        mViewHeight = -1;
        initSeekCircleAttributes(context, attributeset);
        initProgressCircleAttributes(context, attributeset);
        init();
    }

    private int adjustAlpha(int i, float f)
    {
        return Color.argb(Math.round((float)Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    private void init()
    {
        mMaxProgress = 100;
        mProgress = 0;
        mColorCirclePaint = new Paint();
        mColorCirclePaint.setAntiAlias(true);
        mColorCirclePaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        mColorCirclePaint.setStrokeWidth(1.0F);
        mCircleClipPaint = new Paint();
        mCircleClipPaint.setAntiAlias(true);
        mCircleClipPaint.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void initProgressCircleAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.accuweather.android.R.styleable.MinuteCastCircle, 0, 0);
        mCircleThumbColor = context.getColor(1, -1);
        mCircleArmPaintColor = context.getColor(0, 0xff000000);
        mCircleClipPaintColor = context.getColor(2, -1);
        mCircleArmStartColorGradient = context.getColor(4, 0xff000000);
        mCircleArmEndColorGradient = context.getColor(5, getResources().getColor(com.accuweather.android.R.color.black_transparent));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void initSeekCircleAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.accuweather.android.R.styleable.SeekCircle, 0, 0);
        mMaxProgress = Math.max(context.getInteger(0, 100), 1);
        mProgress = Math.max(Math.min(context.getInteger(1, 0), mMaxProgress), 0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void updateDimensions(int i, int j)
    {
        if (mViewWidth == -1 || mViewHeight == -1 || mViewWidth != i || mViewHeight != j)
        {
            mViewWidth = i;
            mViewHeight = j;
            float f = circleOffsetFromParentEdge;
            float f1 = circleOffsetFromParentEdge;
            float f2 = Math.min((float)i - circleOffsetFromParentEdge, (float)j - circleOffsetFromParentEdge);
            wedgeRect = new RectF(f, f1, f2, f2);
            mCenterX = wedgeRect.left + wedgeRect.width() / 2.0F;
            mCenterY = wedgeRect.top + wedgeRect.height() / 2.0F;
            mRadius = wedgeRect.width() / 2.0F;
            circleThickness = f2 / 24F;
            f = circleOffsetFromParentEdge;
            f1 = circleThickness;
            f2 = circleOffsetFromParentEdge;
            float f3 = circleThickness;
            float f4 = Math.min((float)i - circleOffsetFromParentEdge - circleThickness, (float)j - circleOffsetFromParentEdge - circleThickness);
            innerCircleRect = new RectF(f + f1, f2 + f3, f4, f4);
            if (colors != null)
            {
                mFullCircleSweepGradient = new SweepGradient(wedgeRect.centerX(), wedgeRect.centerY(), colors, null);
            }
            for (i = armColors.length - 1; i >= 0; i--)
            {
                j = armColors.length - 1 - i;
                armColors[j] = adjustAlpha(0xff000000, (float)i * 0.01F);
                armPositions[j] = (float)j * 0.1F;
            }

            mArmSweepGradient = new SweepGradient(wedgeRect.centerX(), wedgeRect.centerY(), armColors, null);
        }
    }

    public Point calculateCirclePoint(float f, double d, float f1, float f2)
    {
        double d1 = Math.cos((double)f * 0.017453292499999998D);
        double d2 = f1;
        double d3 = Math.sin((double)f * 0.017453292499999998D);
        double d4 = f2;
        return new Point((int)(d1 * d + d2), (int)(d3 * d + d4));
    }

    public float getCircleOffsetFromParentEdge()
    {
        return circleOffsetFromParentEdge;
    }

    public float getCircleThickness()
    {
        return circleThickness;
    }

    public float getMax()
    {
        return (float)mMaxProgress;
    }

    public int getProgress()
    {
        return mProgress;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f1 = 360F / (float)(mMaxProgress + 1);
        float f = 270F;
        canvas.save();
        canvas.rotate(270F, mCenterX, mCenterY);
        mColorCirclePaint.setShader(mFullCircleSweepGradient);
        canvas.drawArc(wedgeRect, 270F, 360F, true, mColorCirclePaint);
        canvas.restore();
        mCircleClipPaint.setColor(mCircleClipPaintColor);
        canvas.drawArc(innerCircleRect, 0.0F, 360F, true, mCircleClipPaint);
        int i = 0;
        do
        {
label0:
            {
                if (i <= mMaxProgress)
                {
                    if (i != mProgress)
                    {
                        break label0;
                    }
                    mColorCirclePaint.setShader(null);
                    mColorCirclePaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, getHeight() / 2, mCircleArmStartColorGradient, mCircleArmEndColorGradient, android.graphics.Shader.TileMode.MIRROR));
                    mColorCirclePaint.setColor(mCircleArmPaintColor);
                    mColorCirclePaint.setStrokeWidth(1.0F);
                    canvas.drawArc(wedgeRect, f, 0.3F, true, mColorCirclePaint);
                    canvas.save();
                    canvas.rotate(f, mCenterX, mCenterY);
                    mColorCirclePaint.setShader(mArmSweepGradient);
                    canvas.drawArc(wedgeRect, 0.0F, f1 * 12F, true, mColorCirclePaint);
                    canvas.restore();
                    mColorCirclePaint.setColor(mCircleThumbColor);
                    mColorCirclePaint.setShader(null);
                    Point point = calculateCirclePoint(f, mRadius - circleThickness / 2.0F, mCenterX, mCenterY);
                    canvas.drawCircle(point.x, point.y, circleThickness / 1.5F, mColorCirclePaint);
                }
                return;
            }
            f += f1;
            i++;
        } while (true);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.view.View.MeasureSpec.getSize(i) <= android.view.View.MeasureSpec.getSize(j))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        super.onMeasure(j, i);
_L1:
        updateDimensions(getWidth(), getHeight());
        this;
        JVM INSTR monitorexit ;
        return;
        super.onMeasure(i, i);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        updateDimensions(i, j);
    }

    public void setCircleOffsetFromParentEdge(float f)
    {
        circleOffsetFromParentEdge = f;
    }

    public void setCircleThickness(float f)
    {
        circleThickness = f;
    }

    public void setColors(int ai[])
    {
        colors = ai;
        if (wedgeRect != null)
        {
            mFullCircleSweepGradient = new SweepGradient(wedgeRect.centerX(), wedgeRect.centerY(), ai, null);
        }
        invalidate();
    }

    public void setMax(int i)
    {
        i = Math.max(i, 1);
        if (i != mMaxProgress)
        {
            mMaxProgress = i;
        }
        updateProgress(mProgress);
        invalidate();
    }

    public void setProgress(int i)
    {
        updateProgress(i);
    }

    protected boolean updateProgress(int i)
    {
        boolean flag = false;
        i = Math.max(0, Math.min(mMaxProgress, i));
        if (i != mProgress)
        {
            mProgress = i;
            invalidate();
            flag = true;
        }
        return flag;
    }
}
