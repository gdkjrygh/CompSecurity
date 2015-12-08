// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;

public class PrecipitationVisualization extends View
{

    private static final String DEBUG_TAG = "PrecipitationVisualization";
    private float mDpi;
    private int mFirstSubsetSize;
    private int mHeight;
    private int mHourlyContrastBegin;
    private int mHourlyContrastEnd;
    private boolean mIsDayTime;
    private int mLabelValues[];
    private String mLabels[];
    private Matrix mMatrix;
    private Paint mPaint;
    private Path mPath;
    private int mPrimaryValues[];
    private Bitmap mRainKey;
    private int mSecondaryValues[];
    private boolean mShouldDrawHourlyContrastBackgroundBar;
    private boolean mShouldDrawWeekendContrastBackgroundBar;
    private Paint mSmallTextPaint;
    private Bitmap mSnowKey;
    private Paint mTextPaint;
    private int mWidth;
    private int mWkndContrastStartOne;
    private int mWkndContrastStartTwo;

    public PrecipitationVisualization(Context context)
    {
        this(context, null);
    }

    public PrecipitationVisualization(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mIsDayTime = false;
        init();
    }

    private void drawLabelBar(Canvas canvas, int i, int j, int k, int l, int i1)
    {
        float f = l - j;
        Path path = new Path();
        mPaint.setColor(i1);
        path.moveTo(i, (float)j + f / 2.0F);
        path.lineTo((float)i + mDpi * 1.5F, j);
        path.lineTo((float)k - mDpi * 1.5F, j);
        path.lineTo(k, (float)j + f / 2.0F);
        path.lineTo((float)k - mDpi * 1.5F, l);
        path.lineTo((float)i + mDpi * 1.5F, l);
        path.lineTo(i, (float)j + f / 2.0F);
        canvas.drawPath(path, mPaint);
    }

    private void drawPathAtX(float f, float f1, Canvas canvas, float f2, float f3, int i, int j, 
            int k)
    {
        if (f1 < 2.0F)
        {
            return;
        } else
        {
            float f4 = f2 / ((float)canvas.getWidth() / 10F);
            f3 -= 4F * mDpi;
            float f5 = 3F * mDpi;
            Path path = new Path();
            path.moveTo(4F * mDpi + f, f2);
            float f6 = (((5F * f2) / 6F) * f1) / 100F;
            float f7 = f6 / f4;
            path.lineTo(f + f7 + f5, (f2 - f6) + 1.0F * mDpi);
            path.lineTo(f + f7 + f3 / 2.0F + f5, f2 - f6);
            path.lineTo(f + f7 + f3 + f5, (f2 - f6) + 2.0F * mDpi);
            path.lineTo(f + f3 + f5, f2);
            path.lineTo(f + f5, f2);
            mPaint.setShader(null);
            mPaint.setColor(k);
            canvas.drawPath(path, mPaint);
            path.reset();
            path.moveTo(f, f2);
            f1 = (((5F * f2) / 6F) * f1) / 100F;
            f4 = f1 / f4;
            path.lineTo(f + f4, (f2 - f1) + 1.0F * mDpi);
            path.lineTo(f + f4 + f3 / 2.0F, f2 - f1);
            path.lineTo(f + f4 + f3, (f2 - f1) + 2.0F * mDpi);
            path.lineTo(f + f3, f2);
            path.lineTo(f, f2);
            mPaint.setColor(getResources().getColor(0x106000b));
            mPaint.setShader(new LinearGradient(f, f2 - f1, 8F + (f + f4), f2, i, j, android.graphics.Shader.TileMode.MIRROR));
            canvas.drawPath(path, mPaint);
            return;
        }
    }

    private void init()
    {
        if (Utilities.isHoneycombOrGreater())
        {
            setLayerType(1, null);
        }
        mDpi = getContext().getResources().getDisplayMetrics().density;
        mTextPaint = new Paint();
        mTextPaint.setColor(getResources().getColor(0x106000b));
        mTextPaint.setAntiAlias(true);
        mTextPaint.setTextSize((int)(12F * mDpi));
        mSmallTextPaint = new Paint();
        mSmallTextPaint.setColor(getResources().getColor(0x106000b));
        mSmallTextPaint.setAntiAlias(true);
        mSmallTextPaint.setTextSize((int)(9F * mDpi));
        mSnowKey = BitmapFactory.decodeResource(getResources(), com.accuweather.android.R.drawable.mitten_snow_key);
        mRainKey = BitmapFactory.decodeResource(getResources(), com.accuweather.android.R.drawable.umbrella_rain_key);
        mPath = new Path();
        setTypeFaces();
    }

    public int[] getHourlyContrastBackgroundBarStartEndPoints()
    {
        return (new int[] {
            mHourlyContrastBegin, mHourlyContrastEnd
        });
    }

    public int[] getWeekendContrastBackgroundBarStartPoints()
    {
        return (new int[] {
            mWkndContrastStartOne, mWkndContrastStartTwo
        });
    }

    public boolean isShouldDrawHouryContrastBackgroundBar()
    {
        return mShouldDrawHourlyContrastBackgroundBar;
    }

    public boolean isShouldDrawWeekendContrastBackgroundBar()
    {
        return mShouldDrawWeekendContrastBackgroundBar;
    }

    public void onDraw(Canvas canvas)
    {
        if (mPrimaryValues == null)
        {
            super.onDraw(canvas);
            return;
        }
        if (mPaint == null)
        {
            mPaint = new Paint();
            mPaint.setStyle(android.graphics.Paint.Style.FILL);
            mPaint.setFlags(1);
        }
        float f4 = mWidth;
        float f7 = mHeight;
        float f5 = 40F * mDpi;
        float f6 = 32F * mDpi;
        float f8 = f7 - 16F * mDpi;
        int l1 = mLabelValues.length;
        float f9 = f4 - f5 - f6;
        mPath.reset();
        mPaint.setColor(getResources().getColor(com.accuweather.android.R.color.light_green));
        canvas.drawRect(f5 - 12F * mDpi, 0.0F, f5, f8, mPaint);
        mPaint.setColor(getResources().getColor(0x106000b));
        float f = f5 - 6F * mDpi;
        int j1 = 1;
        do
        {
            boolean flag = true;
            if (j1 >= 6)
            {
                break;
            }
            float f10 = ((float)j1 * f8) / 6F;
            while (f < f4) 
            {
                if (flag)
                {
                    float f2 = f + 8F;
                    canvas.drawLine(f, f10, f2, f10, mPaint);
                    flag = false;
                    f = f2;
                } else
                {
                    f += 4F;
                    flag = true;
                }
            }
            f = f5 - 6F * mDpi;
            j1++;
        } while (true);
        mPaint.setColor(getResources().getColor(com.accuweather.android.R.color.dark_green));
        canvas.drawRect(0.0F, 0.0F, f5 - 8F * mDpi, f8, mPaint);
        canvas.drawRect(f5, 0.0F, mWidth, f8, mPaint);
        float f3 = (f4 - (f5 + f6)) / (float)l1;
        if (mShouldDrawWeekendContrastBackgroundBar)
        {
            int k1 = 999;
            for (int i = 0; i < mLabelValues.length; i++)
            {
                if (mLabelValues[i] == mWkndContrastStartOne)
                {
                    k1 = i;
                }
            }

            if (Logger.isDebugEnabled())
            {
                Logger.i(this, "Contrast points are %d and %d", new Object[] {
                    Integer.valueOf(mWkndContrastStartOne), Integer.valueOf(mWkndContrastStartTwo)
                });
            }
            mPaint.setColor(getResources().getColor(com.accuweather.android.R.color.light_green));
            f = f5 + ((float)k1 * f9) / (float)mPrimaryValues.length;
            mPath.moveTo(f, f8);
            mPath.lineTo(2.0F * f3 + f, f8);
            mPath.lineTo(4F * f3 + f, 0.0F);
            mPath.lineTo(2.0F * f3 + f, 0.0F);
            mPath.lineTo(f, f8);
            canvas.drawPath(mPath, mPaint);
            k1 = 999;
            for (int j = 0; j < mLabelValues.length; j++)
            {
                if (mLabelValues[j] == mWkndContrastStartTwo)
                {
                    k1 = j;
                }
            }

            mPath.reset();
            f = f5 + ((float)k1 * f9) / (float)mPrimaryValues.length;
            mPath.moveTo(f, f8);
            mPath.lineTo(2.0F * f3 + f, f8);
            mPath.lineTo(4F * f3 + f, 0.0F);
            mPath.lineTo(2.0F * f3 + f, 0.0F);
            mPath.lineTo(f, f8);
            canvas.drawPath(mPath, mPaint);
        }
        if (mShouldDrawHourlyContrastBackgroundBar)
        {
            mPaint.setColor(getResources().getColor(com.accuweather.android.R.color.light_green));
            f = f5 + ((float)mHourlyContrastBegin * f9) / (float)mPrimaryValues.length;
            mPath.moveTo(f, f8);
            mPath.lineTo(12F * f3 + f, f8);
            mPath.lineTo(12F * f3 + f + f9 / 10F, 0.0F);
            mPath.lineTo(f9 / 10F + f, 0.0F);
            mPath.lineTo(f, f8);
            canvas.drawPath(mPath, mPaint);
        }
        mPaint.setColor(getResources().getColor(0x106000b));
        canvas.drawRect(f5 - 2.0F * mDpi, 0.0F, f5, f8, mPaint);
        f9 = mDpi;
        float f11 = (1.0F * f8) / 6F;
        String s = (new StringBuilder()).append("100").append("%").toString();
        if ("100".length() < 3)
        {
            f = 10F * mDpi;
        } else
        {
            f = 4F * mDpi;
        }
        canvas.drawText(s, f, 4F * f9 + f11, mTextPaint);
        f9 = mDpi;
        f11 = (2.0F * f8) / 6F;
        s = (new StringBuilder()).append("80").append("%").toString();
        if ("80".length() < 3)
        {
            f = 10F * mDpi;
        } else
        {
            f = 4F * mDpi;
        }
        canvas.drawText(s, f, 4F * f9 + f11, mTextPaint);
        f9 = mDpi;
        f11 = (3F * f8) / 6F;
        s = (new StringBuilder()).append("60").append("%").toString();
        if ("60".length() < 3)
        {
            f = 10F * mDpi;
        } else
        {
            f = 4F * mDpi;
        }
        canvas.drawText(s, f, 4F * f9 + f11, mTextPaint);
        f9 = mDpi;
        f11 = (4F * f8) / 6F;
        s = (new StringBuilder()).append("40").append("%").toString();
        if ("40".length() < 3)
        {
            f = 10F * mDpi;
        } else
        {
            f = 4F * mDpi;
        }
        canvas.drawText(s, f, 4F * f9 + f11, mTextPaint);
        f9 = mDpi;
        f11 = (5F * f8) / 6F;
        s = (new StringBuilder()).append("20").append("%").toString();
        if ("20".length() < 3)
        {
            f = 10F * mDpi;
        } else
        {
            f = 4F * mDpi;
        }
        canvas.drawText(s, f, 4F * f9 + f11, mTextPaint);
        for (int k = 0; k < mPrimaryValues.length; k++)
        {
            drawPathAtX(f5 + (float)k * f3, mPrimaryValues[k], canvas, f8, f3, 0xff0f1b44, 0xff273b7e, 0x60000000);
        }

        if (mSecondaryValues != null)
        {
            for (int l = 0; l < mSecondaryValues.length; l++)
            {
                drawPathAtX(f5 + (float)l * f3, mSecondaryValues[l], canvas, f8, f3, 0xffbed3dd, -1, 0x80000000);
            }

        }
        mPaint.setShader(null);
        f9 = f7 - 3F * mDpi;
        int i1;
        if (mFirstSubsetSize < mLabelValues.length)
        {
            drawLabelBar(canvas, 0, (int)(4F * mDpi + f8), (int)((f5 - 2.0F * mDpi) + ((f4 - (f5 + f6)) * (float)mFirstSubsetSize) / (float)l1), (int)f7, getResources().getColor(com.accuweather.android.R.color.secondary_text));
        } else
        {
            drawLabelBar(canvas, 0, (int)(4F * mDpi + f8), (int)(((f4 - (f5 + f6)) * (float)mFirstSubsetSize) / (float)l1 + f5), (int)f7, getResources().getColor(com.accuweather.android.R.color.secondary_text));
            drawLabelBar(canvas, 0, (int)(4F * mDpi + f8), (int)(((f4 - (0.0F + f5)) * (float)mFirstSubsetSize) / (float)l1 + f5), (int)f7, getResources().getColor(com.accuweather.android.R.color.secondary_text));
        }
        drawLabelBar(canvas, (int)((f5 - 2.0F * mDpi) + ((f4 - (f5 + f6)) * (float)mFirstSubsetSize) / (float)l1), (int)(4F * mDpi + f8), (int)f4, (int)f7, getResources().getColor(com.accuweather.android.R.color.tertiary_text));
        mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
        if (mLabels.length > 0)
        {
            canvas.drawText(mLabels[0], 12F * mDpi, f9, mSmallTextPaint);
        }
        mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
        if (mLabels.length > 1 && mFirstSubsetSize < mLabelValues.length)
        {
            mSmallTextPaint.setColor(getContext().getResources().getColor(com.accuweather.android.R.color.secondary_text));
            canvas.drawText(mLabels[1], f4 - f6, f9, mSmallTextPaint);
        }
        mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
        i1 = 0;
        while (i1 < mLabelValues.length) 
        {
            float f1;
            if (String.valueOf(mLabelValues[i1]).length() == 1)
            {
                f1 = 3F * mDpi;
            } else
            {
                f1 = (float)(String.valueOf(mLabelValues[i1]).length() - 1) * (-1F * mDpi);
            }
            if (i1 < mFirstSubsetSize)
            {
                mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
            } else
            {
                mSmallTextPaint.setColor(getContext().getResources().getColor(com.accuweather.android.R.color.secondary_text));
            }
            canvas.drawText(String.valueOf(mLabelValues[i1]), f1 + f5 + ((f4 - (f5 + f6)) * (float)i1) / (float)l1, f9, mSmallTextPaint);
            i1++;
        }
        mMatrix = new Matrix();
        mMatrix.preTranslate(f5 + f3, 0.0F);
        mMatrix.preScale(0.9F, 0.9F);
        canvas.drawBitmap(mRainKey, mMatrix, null);
        mMatrix = new Matrix();
        mMatrix.preTranslate(f5 + f3 + (float)mRainKey.getWidth() * 0.9F + 6F * mDpi, 0.0F);
        mMatrix.preScale(0.9F, 0.9F);
        canvas.drawBitmap(mSnowKey, mMatrix, null);
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mWidth = k - i;
        mHeight = l - j;
        super.onLayout(flag, i, j, k, l);
    }

    public void setDayTime(boolean flag)
    {
        mIsDayTime = flag;
    }

    public void setFirstSubsetSize(int i)
    {
        mFirstSubsetSize = i;
    }

    public void setHourlyContrastBackgroundBarStartEndPoints(int ai[])
    {
        if (ai.length > 1)
        {
            mHourlyContrastBegin = ai[0];
            mHourlyContrastEnd = ai[1];
        }
    }

    public void setShouldDrawHourlyContrastBackgroundBar(boolean flag)
    {
        mShouldDrawHourlyContrastBackgroundBar = flag;
    }

    public void setShouldDrawWeekendContrastBackgroundBar(boolean flag)
    {
        mShouldDrawWeekendContrastBackgroundBar = flag;
    }

    protected void setTypeFaces()
    {
        mTextPaint.setTypeface(Data.getRobotoCondensed());
        mSmallTextPaint.setTypeface(Data.getRobotoBold());
    }

    public void setValues(int ai[], int ai1[], String as[], int ai2[])
    {
        mPrimaryValues = ai;
        mSecondaryValues = ai1;
        mLabels = as;
        mLabelValues = ai2;
        postInvalidate();
    }

    public void setWeekendContrastBackgroundBarStartPoints(int ai[])
    {
        if (ai.length > 1)
        {
            mWkndContrastStartOne = ai[0];
            mWkndContrastStartTwo = ai[1];
        }
    }
}
