// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.v4.view.ViewCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import java.text.NumberFormat;

public class StarRatingBar extends View
{

    private static NumberFormat sRatingDescriptionFormatter;
    private String mFormattedRating;
    private final float mGap;
    private final float mHalfStarWidth;
    private boolean mIsInCompactMode;
    private final Path mLeftHalfStarPath;
    private final double mRadius;
    private float mRange;
    private float mRating;
    private final Path mRightHalfStarPath;
    private final double mShortRadius;
    private boolean mShowEmptyStars;
    private final Paint mStarBackgroundPaint;
    private final double mStarHeight;
    private final Paint mStarPaint;
    private final Path mStarPath;
    private final int mTextBaseline;
    private final int mTextHeight;
    private final TextPaint mTextPaint;
    private int mTextSize;
    private float mTextWidth;
    private final PointF mVertices[];

    public StarRatingBar(Context context)
    {
        this(context, null);
    }

    public StarRatingBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Resources resources = context.getResources();
        context = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.StarRatingBar);
        mGap = context.getDimensionPixelSize(5, 0);
        mRating = context.getFloat(0, 0.0F);
        mStarHeight = context.getDimensionPixelSize(2, resources.getDimensionPixelSize(0x7f0c0338));
        mRange = context.getInt(1, 5);
        mShowEmptyStars = context.getBoolean(6, true);
        mIsInCompactMode = context.getBoolean(7, false);
        mTextSize = context.getDimensionPixelSize(8, resources.getDimensionPixelSize(0x7f0c0305));
        int i = context.getColor(3, resources.getColor(0x7f0b0292));
        int k = context.getColor(4, resources.getColor(0x7f0b0291));
        context.recycle();
        mStarPaint = new Paint(1);
        mStarPaint.setColor(i);
        mStarPaint.setStyle(android.graphics.Paint.Style.FILL);
        mStarBackgroundPaint = new Paint(1);
        mStarBackgroundPaint.setColor(k);
        mStarBackgroundPaint.setStyle(android.graphics.Paint.Style.FILL);
        mStarPath = new Path();
        mStarPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        mLeftHalfStarPath = new Path();
        mLeftHalfStarPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        mRightHalfStarPath = new Path();
        mRightHalfStarPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        mRadius = mStarHeight / (1.0D + Math.sin(0.94247779607693793D));
        mShortRadius = (Math.sin(0.39269908169872414D) * mRadius) / Math.sin(2.1205750411731104D);
        mHalfStarWidth = (float)(mRadius * Math.sin(1.2566370614359172D));
        mVertices = new PointF[10];
        for (int j = 0; j < 10; j++)
        {
            mVertices[j] = new PointF();
        }

        mTextPaint = new TextPaint(1);
        mTextPaint.density = resources.getDisplayMetrics().density;
        mTextPaint.setTextSize(mTextSize);
        mTextPaint.setFakeBoldText(false);
        context = mTextPaint.getFontMetrics();
        mTextHeight = (int)(Math.abs(((android.graphics.Paint.FontMetrics) (context)).top) + Math.abs(((android.graphics.Paint.FontMetrics) (context)).bottom));
        mTextBaseline = (int)Math.abs(((android.graphics.Paint.FontMetrics) (context)).top);
        if (sRatingDescriptionFormatter == null)
        {
            context = NumberFormat.getNumberInstance();
            sRatingDescriptionFormatter = context;
            context.setMinimumFractionDigits(1);
            sRatingDescriptionFormatter.setMaximumFractionDigits(1);
        }
        mFormattedRating = sRatingDescriptionFormatter.format(mRating);
        mVertices[0].x = 0.0F;
        mVertices[0].y = -1F * (float)mRadius;
        mVertices[1].x = (float)(mShortRadius * Math.sin(0.62831853071795862D));
        mVertices[1].y = -1F * (float)(mShortRadius * Math.cos(0.62831853071795862D));
        mVertices[2].x = (float)(mRadius * Math.sin(1.2566370614359172D));
        mVertices[2].y = -1F * (float)(mRadius * Math.cos(1.2566370614359172D));
        mVertices[3].x = (float)(mShortRadius * Math.sin(1.2566370614359172D));
        mVertices[3].y = (float)(mShortRadius * Math.cos(1.2566370614359172D));
        mVertices[4].x = (float)(mRadius * Math.sin(0.62831853071795862D));
        mVertices[4].y = (float)((double)(float)mRadius * Math.cos(0.62831853071795862D));
        mVertices[5].x = 0.0F;
        mVertices[5].y = (float)mShortRadius;
        mVertices[6].x = -1F * mVertices[4].x;
        mVertices[6].y = mVertices[4].y;
        mVertices[7].x = -1F * mVertices[3].x;
        mVertices[7].y = mVertices[3].y;
        mVertices[8].x = -1F * mVertices[2].x;
        mVertices[8].y = mVertices[2].y;
        mVertices[9].x = -1F * mVertices[1].x;
        mVertices[9].y = mVertices[1].y;
        initializeStarPaths();
        setWillNotDraw(false);
    }

    private int getNumOfHalfStars()
    {
        return Float.compare(mRating % 1.0F, 0.0F) <= 0 ? 0 : 1;
    }

    private void initializeStarPaths()
    {
        mStarPath.reset();
        mStarPath.moveTo(mVertices[0].x, mVertices[0].y);
        for (int i = 1; i < 10; i++)
        {
            mStarPath.lineTo(mVertices[i].x, mVertices[i].y);
        }

        mStarPath.close();
        mLeftHalfStarPath.reset();
        mLeftHalfStarPath.moveTo(mVertices[0].x, mVertices[0].y);
        for (int j = 5; j < 10; j++)
        {
            mLeftHalfStarPath.lineTo(mVertices[j].x, mVertices[j].y);
        }

        mLeftHalfStarPath.close();
        mRightHalfStarPath.reset();
        mRightHalfStarPath.moveTo(mVertices[0].x, mVertices[0].y);
        for (int k = 1; k <= 5; k++)
        {
            mRightHalfStarPath.lineTo(mVertices[k].x, mVertices[k].y);
        }

        mRightHalfStarPath.close();
    }

    public int getBaseline()
    {
        if (mIsInCompactMode)
        {
            return getPaddingTop() + mTextBaseline;
        } else
        {
            return getMeasuredHeight();
        }
    }

    public void onDraw(Canvas canvas)
    {
        int k;
        int i1;
        int j1;
        super.onDraw(canvas);
        k = canvas.save(1);
        if (ViewCompat.getLayoutDirection(this) == 1)
        {
            canvas.translate(getWidth(), 0.0F);
            canvas.scale(-1F, 1.0F);
        }
        i1 = getPaddingTop();
        j1 = ViewCompat.getPaddingStart(this);
        if (!mIsInCompactMode) goto _L2; else goto _L1
_L1:
        float f = j1;
        float f2 = i1;
        canvas.save();
        canvas.translate(f, f2);
        canvas.drawText(mFormattedRating, f, (float)mTextBaseline + f2, mTextPaint);
        canvas.restore();
        canvas.save();
        f2 = mHalfStarWidth;
        float f4 = mTextWidth;
        float f5 = mGap;
        float f6 = ((i1 - getPaddingBottom()) + getMeasuredHeight()) - mTextHeight / 2;
        canvas.translate(f + (f2 + f4 + f5 * 2.0F), (float)(mRadius - (double)mHalfStarWidth) + f6);
        canvas.drawPath(mStarPath, mStarPaint);
        canvas.restore();
_L4:
        canvas.restoreToCount(k);
        return;
_L2:
        int j = (int)mRating;
        int l = getNumOfHalfStars();
        int i = 0;
        float f1 = (float)j1 + mHalfStarWidth;
        float f3 = (float)i1 + (float)mRadius;
        for (; i < j; i++)
        {
            canvas.save();
            canvas.translate((float)i * (mHalfStarWidth * 2.0F + mGap) + f1, f3);
            canvas.drawPath(mStarPath, mStarPaint);
            canvas.restore();
        }

        j = i;
        if (l == 1)
        {
            canvas.save();
            canvas.translate((float)i * (mHalfStarWidth * 2.0F + mGap) + f1, f3);
            canvas.drawPath(mLeftHalfStarPath, mStarPaint);
            canvas.drawPath(mRightHalfStarPath, mStarBackgroundPaint);
            canvas.restore();
            j = i + 1;
        }
        if (mShowEmptyStars)
        {
            while ((float)j < mRange) 
            {
                canvas.save();
                canvas.translate((float)j * (mHalfStarWidth * 2.0F + mGap) + f1, f3);
                canvas.drawPath(mStarPath, mStarBackgroundPaint);
                canvas.restore();
                j++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onMeasure(int i, int j)
    {
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000 && android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
            return;
        }
        if (mIsInCompactMode)
        {
            mTextWidth = mTextPaint.measureText(mFormattedRating);
            j = (int)((float)(getPaddingLeft() + getPaddingRight()) + mTextWidth + mGap * 2.0F + mHalfStarWidth * 2.0F);
            i = (int)((double)(getPaddingTop() + getPaddingBottom()) + Math.max(mTextHeight, mStarHeight));
        } else
        {
            float f;
            if (mShowEmptyStars)
            {
                f = (int)mRange;
            } else
            {
                f = mRating + (float)getNumOfHalfStars();
            }
            j = (int)((float)(getPaddingLeft() + getPaddingRight()) + f * 2.0F * mHalfStarWidth + (f - 1.0F) * mGap);
            i = (int)((double)(getPaddingTop() + getPaddingBottom()) + mStarHeight);
        }
        setMeasuredDimension(j, i);
    }
}
