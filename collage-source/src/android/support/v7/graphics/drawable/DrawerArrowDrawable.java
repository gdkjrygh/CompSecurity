// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import java.lang.annotation.Annotation;

public class DrawerArrowDrawable extends Drawable
{
    public static interface ArrowDirection
        extends Annotation
    {
    }


    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45D);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    public DrawerArrowDrawable(Context context)
    {
        mVerticalMirror = false;
        mDirection = 2;
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        mPaint.setAntiAlias(true);
        context = context.getTheme().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.DrawerArrowToggle, android.support.v7.appcompat.R.attr.drawerArrowStyle, android.support.v7.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(context.getColor(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0F));
        setSpinEnabled(context.getBoolean(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F)));
        mSize = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
        mBarLength = Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_barLength, 0.0F));
        mArrowHeadLength = Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0F));
        mArrowShaftLength = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0F);
        context.recycle();
    }

    private static float lerp(float f, float f1, float f2)
    {
        return (f1 - f) * f2 + f;
    }

    public void draw(Canvas canvas)
    {
label0:
        {
label1:
            {
label2:
                {
                    float f;
                    float f1;
                    int i;
                    {
                        Rect rect = getBounds();
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        switch (mDirection)
                        {
                        case 2: // '\002'
                        default:
                            if (DrawableCompat.getLayoutDirection(this) == 1)
                            {
                                i = 1;
                            } else
                            {
                                i = 0;
                            }
                            break;

                        case 0: // '\0'
                            break label2;

                        case 1: // '\001'
                            break label1;

                        case 3: // '\003'
                            break label0;
                        }
                    }
                    f = (float)Math.sqrt(mArrowHeadLength * mArrowHeadLength * 2.0F);
                    f4 = lerp(mBarLength, f, mProgress);
                    f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
                    f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
                    f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
                    if (i != 0)
                    {
                        f = 0.0F;
                    } else
                    {
                        f = -180F;
                    }
                    if (i != 0)
                    {
                        f1 = 180F;
                    } else
                    {
                        f1 = 0.0F;
                    }
                    f = lerp(f, f1, mProgress);
                    f1 = Math.round((double)f4 * Math.cos(f5));
                    f4 = Math.round((double)f4 * Math.sin(f5));
                    mPath.rewind();
                    f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
                    f6 = -f2 / 2.0F;
                    mPath.moveTo(f6 + f3, 0.0F);
                    mPath.rLineTo(f2 - f3 * 2.0F, 0.0F);
                    mPath.moveTo(f6, f5);
                    mPath.rLineTo(f1, f4);
                    mPath.moveTo(f6, -f5);
                    mPath.rLineTo(f1, -f4);
                    mPath.close();
                    canvas.save();
                    f1 = mPaint.getStrokeWidth();
                    f1 = (float)((double)(float)(((int)((float)rect.height() - 3F * f1 - mBarGap * 2.0F) / 4) * 2) + ((double)f1 * 1.5D + (double)mBarGap));
                    canvas.translate(rect.centerX(), f1);
                    if (mSpin)
                    {
                        if ((i ^ mVerticalMirror) != 0)
                        {
                            i = -1;
                        } else
                        {
                            i = 1;
                        }
                        canvas.rotate((float)i * f);
                    } else
                    if (i != 0)
                    {
                        canvas.rotate(180F);
                    }
                    canvas.drawPath(mPath, mPaint);
                    canvas.restore();
                    return;
                }
                i = 0;
                break MISSING_BLOCK_LABEL_51;
            }
            i = 1;
            break MISSING_BLOCK_LABEL_51;
        }
        if (DrawableCompat.getLayoutDirection(this) == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        break MISSING_BLOCK_LABEL_51;
    }

    public float getArrowHeadLength()
    {
        return mArrowHeadLength;
    }

    public float getArrowShaftLength()
    {
        return mArrowShaftLength;
    }

    public float getBarLength()
    {
        return mBarLength;
    }

    public float getBarThickness()
    {
        return mPaint.getStrokeWidth();
    }

    public int getColor()
    {
        return mPaint.getColor();
    }

    public int getDirection()
    {
        return mDirection;
    }

    public float getGapSize()
    {
        return mBarGap;
    }

    public int getIntrinsicHeight()
    {
        return mSize;
    }

    public int getIntrinsicWidth()
    {
        return mSize;
    }

    public int getOpacity()
    {
        return -3;
    }

    public final Paint getPaint()
    {
        return mPaint;
    }

    public float getProgress()
    {
        return mProgress;
    }

    public boolean isSpinEnabled()
    {
        return mSpin;
    }

    public void setAlpha(int i)
    {
        if (i != mPaint.getAlpha())
        {
            mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f)
    {
        if (mArrowHeadLength != f)
        {
            mArrowHeadLength = f;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f)
    {
        if (mArrowShaftLength != f)
        {
            mArrowShaftLength = f;
            invalidateSelf();
        }
    }

    public void setBarLength(float f)
    {
        if (mBarLength != f)
        {
            mBarLength = f;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f)
    {
        if (mPaint.getStrokeWidth() != f)
        {
            mPaint.setStrokeWidth(f);
            mMaxCutForBarSize = (float)((double)(f / 2.0F) * Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public void setColor(int i)
    {
        if (i != mPaint.getColor())
        {
            mPaint.setColor(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public void setDirection(int i)
    {
        if (i != mDirection)
        {
            mDirection = i;
            invalidateSelf();
        }
    }

    public void setGapSize(float f)
    {
        if (f != mBarGap)
        {
            mBarGap = f;
            invalidateSelf();
        }
    }

    public void setProgress(float f)
    {
        if (mProgress != f)
        {
            mProgress = f;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean flag)
    {
        if (mSpin != flag)
        {
            mSpin = flag;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean flag)
    {
        if (mVerticalMirror != flag)
        {
            mVerticalMirror = flag;
            invalidateSelf();
        }
    }

}
