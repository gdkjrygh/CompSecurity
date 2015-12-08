// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

public class CircularProgressView extends View
{

    private static final int DEFAULT_BACKGROUND_COLOR = 0xff9d9e9d;
    private static final int DEFAULT_MAX_PROGRESS = 100;
    private static final int DEFAULT_PROGRESS = 0;
    private static final int DEFAULT_PROGRESS_COLOR = -18944;
    private static final int DEFAULT_START_ANGLE = -90;
    private static final float FULL_CIRCLE = 360F;
    public static final int GRADIENT_INVALID_COLOR = -1;
    private static final float GRADIENT_START_ANGLE = 270F;
    private final Paint backgroundPaint = new Paint();
    private int gradientEndColor;
    private int gradientStartColor;
    private float lineThickness;
    private int maxProgress;
    private int progress;
    private final RectF progressOval = new RectF();
    private final Paint progressPaint = new Paint();
    private int startAngle;

    public CircularProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        startAngle = -90;
        progress = 0;
        maxProgress = 100;
        gradientStartColor = -1;
        gradientEndColor = -1;
        progressPaint.setColor(-18944);
        progressPaint.setStyle(android.graphics.Paint.Style.STROKE);
        progressPaint.setAntiAlias(true);
        backgroundPaint.setColor(0xff9d9e9d);
        backgroundPaint.setStyle(android.graphics.Paint.Style.STROKE);
        backgroundPaint.setAntiAlias(true);
    }

    private void invalidateGradient()
    {
        if (gradientStartColor != -1 && gradientEndColor != -1)
        {
            int i = getWidth() / 2;
            int j = getHeight() / 2;
            Matrix matrix = new Matrix();
            matrix.preRotate(270F, i, j);
            SweepGradient sweepgradient = new SweepGradient(i, j, gradientStartColor, gradientEndColor);
            sweepgradient.setLocalMatrix(matrix);
            progressPaint.setShader(sweepgradient);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        progressOval.set(lineThickness, lineThickness, (float)getWidth() - lineThickness, (float)getHeight() - lineThickness);
        float f;
        if (maxProgress > 0)
        {
            f = ((float)progress / (float)maxProgress) * 360F;
        } else
        {
            f = 0.0F;
        }
        canvas.drawArc(progressOval, startAngle, 360F, false, backgroundPaint);
        canvas.drawArc(progressOval, startAngle, f, false, progressPaint);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        invalidateGradient();
    }

    public void setBackgroundColor(int i)
    {
        backgroundPaint.setColor(i);
    }

    public void setGradientProgressColors(int i, int j)
    {
        gradientStartColor = i;
        gradientEndColor = j;
        invalidateGradient();
    }

    public void setLineThickness(float f)
    {
        lineThickness = f;
        progressPaint.setStrokeWidth(f);
        backgroundPaint.setStrokeWidth(f);
    }

    public void setMax(int i)
    {
        maxProgress = i;
        invalidate();
    }

    public void setProgress(int i)
    {
        progress = i;
        invalidate();
    }

    public void setProgressColor(int i)
    {
        progressPaint.setColor(i);
    }

    public void setStartAngle(int i)
    {
        startAngle = i;
    }
}
