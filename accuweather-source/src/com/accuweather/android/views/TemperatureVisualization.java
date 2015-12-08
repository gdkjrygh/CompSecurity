// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;

public class TemperatureVisualization extends View
{

    private static final String DEBUG_TAG = "TemperatureVisualization";
    private float mDpi;
    private int mFirstSubsetSize;
    private int mHeight;
    private int mHighValues[];
    private boolean mIsDayTime;
    private int mLabelValues[];
    private String mLabels[];
    private int mLowValues[];
    private Paint mPaint;
    private int mPrimaryColor;
    private int mPrimaryFillColor;
    private int mSecondaryColor;
    private int mSecondaryFillColor;
    private int mSecondaryHighValues[];
    private int mSecondaryLowValues[];
    private Paint mSmallTextPaint;
    private Paint mTextPaint;
    private int mWidth;

    public TemperatureVisualization(Context context)
    {
        this(context, null);
    }

    public TemperatureVisualization(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mPrimaryColor = 0xffff0000;
        mSecondaryColor = 0xff00ff00;
        mPrimaryFillColor = 0xffff0000;
        mSecondaryFillColor = 0xff00ff00;
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

    private void drawUsingPath(Canvas canvas)
    {
        Path path = new Path();
        Path path1 = new Path();
        Path path2 = new Path();
        float f17 = 4F * mDpi;
        float f16 = mWidth;
        float f1 = mHeight;
        float f = 40F * mDpi;
        float f18 = f1 - 16F * mDpi;
        float f19 = f16 - f;
        int ai[] = new int[12];
        int ai1[] = new int[12];
        float af[] = new float[12];
        af[0] = 0.0F;
        af[1] = 0.1666667F;
        af[2] = 0.1666667F;
        af[3] = 2.0F * 0.1666667F;
        af[4] = 2.0F * 0.1666667F;
        af[5] = 3F * 0.1666667F;
        af[6] = 3F * 0.1666667F;
        af[7] = 4F * 0.1666667F;
        af[8] = 4F * 0.1666667F;
        af[9] = 5F * 0.1666667F;
        af[10] = 5F * 0.1666667F;
        af[11] = 6F * 0.1666667F;
        ai[0] = -1;
        ai[1] = -1;
        ai[2] = 0xebffffff;
        ai[3] = 0xebffffff;
        ai[4] = 0xd4ffffff;
        ai[5] = 0xd4ffffff;
        ai[6] = 0xaaffffff;
        ai[7] = 0xaaffffff;
        ai[8] = 0x80ffffff;
        ai[9] = 0x80ffffff;
        ai[10] = 0x55ffffff;
        ai[11] = 0x55ffffff;
        float f20 = getMaxValue();
        float f21 = getMinValue();
        int i = 0;
        while (i < mHighValues.length) 
        {
            float f9 = mHighValues[i];
            float f2;
            if (i == 0)
            {
                f2 = f;
                f9 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f9 - f21)) / (f20 - f21);
                path.moveTo(f2, f9);
                path1.moveTo(f2, f9);
                path2.moveTo(f2, f9);
            } else
            {
                f2 = f + (float)i * (f19 / (float)(mHighValues.length - 1));
                f9 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f9 - f21)) / (f20 - f21);
            }
            path.lineTo(f2, f9);
            path1.lineTo(f2, f9);
            path2.lineTo(f2, f9);
            i++;
        }
        if (mLowValues == null)
        {
            path.lineTo(f16, f18);
            path.lineTo(f, f18);
        } else
        {
            int j = mLowValues.length - 1;
            while (j >= 0) 
            {
                float f11 = mLowValues[j];
                float f4;
                if (j == mLowValues.length - 1)
                {
                    f4 = f16;
                    f11 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f11 - f21)) / (f20 - f21);
                    path.lineTo(f4, f11);
                } else
                {
                    f4 = f + (float)j * (f19 / (float)(mLowValues.length - 1));
                    f11 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f11 - f21)) / (f20 - f21);
                }
                path.lineTo(f4, f11);
                j--;
            }
        }
        for (i = mHighValues.length - 1; i >= 0; i--)
        {
            float f10 = mHighValues[i];
            float f3 = f + (float)i * (f19 / (float)(mHighValues.length - 1));
            f10 = ((5F * f18) / 6F - (((2.0F * f18) / 3F) * (f10 - f21)) / (f20 - f21)) + f17;
            path1.lineTo(f3, f10);
            path2.lineTo(f3, 2.0F * mDpi + f10);
        }

        path.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mHighValues[0] - f21)) / (f20 - f21));
        path1.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mHighValues[0] - f21)) / (f20 - f21));
        path2.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mHighValues[0] - f21)) / (f20 - f21));
        for (int k = 0; k < ai1.length; k++)
        {
            ai1[k] = mPrimaryFillColor & ai[k];
        }

        mPaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f18, ai1, af, android.graphics.Shader.TileMode.MIRROR));
        canvas.drawPath(path, mPaint);
        mPaint.setShader(null);
        mPaint.setColor(0x80222222);
        canvas.drawPath(path2, mPaint);
        mPaint.setColor(mPrimaryColor);
        canvas.drawPath(path1, mPaint);
        path = new Path();
        path1 = new Path();
        path2 = new Path();
        if (mLowValues == null)
        {
            mPaint.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
            mPaint.setShader(null);
            mPaint.setColor(mSecondaryColor);
            int l = 0;
            while (l < mSecondaryHighValues.length) 
            {
                float f12 = mSecondaryHighValues[l];
                float f5;
                if (l == 0)
                {
                    f5 = f;
                    f12 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f12 - f21)) / (f20 - f21);
                    path.moveTo(f5, f12);
                    path1.moveTo(f5, f12);
                    path2.moveTo(f5, f12);
                } else
                {
                    f5 = f + (float)l * (f19 / (float)(mSecondaryHighValues.length - 1));
                    f12 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f12 - f21)) / (f20 - f21);
                }
                path.lineTo(f5, f12);
                path1.lineTo(f5, f12);
                path2.lineTo(f5, f12);
                l++;
            }
            path.lineTo(f16, f18);
            path.lineTo(f, f18);
            for (int i1 = mSecondaryHighValues.length - 1; i1 >= 0; i1--)
            {
                float f13 = mSecondaryHighValues[i1];
                float f6 = f + (float)i1 * (f19 / (float)(mSecondaryHighValues.length - 1));
                f13 = ((5F * f18) / 6F - (((2.0F * f18) / 3F) * (f13 - f21)) / (f20 - f21)) + f17;
                path1.lineTo(f6, f13);
                path2.lineTo(f6, 2.0F * mDpi + f13);
            }

            path.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mSecondaryHighValues[0] - f21)) / (f20 - f21));
            path1.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mSecondaryHighValues[0] - f21)) / (f20 - f21));
            path2.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mSecondaryHighValues[0] - f21)) / (f20 - f21));
            for (int j1 = 0; j1 < ai1.length; j1++)
            {
                ai1[j1] = mSecondaryFillColor & ai[j1];
            }

            mPaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f18, ai1, af, android.graphics.Shader.TileMode.MIRROR));
            canvas.drawPath(path, mPaint);
            mPaint.setShader(null);
            mPaint.setColor(0x80222222);
            canvas.drawPath(path2, mPaint);
            mPaint.setColor(mSecondaryColor);
            canvas.drawPath(path1, mPaint);
        } else
        {
            mPaint.setShader(null);
            mPaint.setColor(mSecondaryColor);
            int k1 = 0;
            while (k1 < mLowValues.length) 
            {
                float f14 = mLowValues[k1];
                float f7;
                if (k1 == 0)
                {
                    f7 = f;
                    f14 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f14 - f21)) / (f20 - f21);
                    path.moveTo(f7, f14);
                    path1.moveTo(f7, f14);
                    path2.moveTo(f7, f14);
                } else
                {
                    f7 = f + (float)k1 * (f19 / (float)(mLowValues.length - 1));
                    f14 = (5F * f18) / 6F - (((2.0F * f18) / 3F) * (f14 - f21)) / (f20 - f21);
                }
                path.lineTo(f7, f14);
                path1.lineTo(f7, f14);
                path2.lineTo(f7, f14);
                k1++;
            }
            path.lineTo(f16, f18);
            path.lineTo(f, f18);
            for (int l1 = mLowValues.length - 1; l1 >= 0; l1--)
            {
                float f15 = mLowValues[l1];
                float f8 = f + (float)l1 * (f19 / (float)(mLowValues.length - 1));
                f15 = ((5F * f18) / 6F - (((2.0F * f18) / 3F) * (f15 - f21)) / (f20 - f21)) + f17;
                path1.lineTo(f8, f15);
                path2.lineTo(f8, 2.0F * mDpi + f15);
            }

            path.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mLowValues[0] - f21)) / (f20 - f21));
            path1.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mLowValues[0] - f21)) / (f20 - f21));
            path2.lineTo(f, (5F * f18) / 6F - (((2.0F * f18) / 3F) * ((float)mLowValues[0] - f21)) / (f20 - f21));
            for (int i2 = 0; i2 < ai1.length; i2++)
            {
                ai1[i2] = mSecondaryFillColor & ai[i2];
            }

            mPaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f18, ai1, af, android.graphics.Shader.TileMode.MIRROR));
            canvas.drawPath(path, mPaint);
            mPaint.setShader(null);
            mPaint.setColor(0x80222222);
            canvas.drawPath(path2, mPaint);
            mPaint.setColor(mSecondaryColor);
            canvas.drawPath(path1, mPaint);
        }
        mPaint.setShader(null);
    }

    private int getMaxValue()
    {
        int j = -999;
        int i = j;
        if (mHighValues != null)
        {
            int l = 0;
            do
            {
                i = j;
                if (l >= mHighValues.length)
                {
                    break;
                }
                i = j;
                if (mHighValues[l] > j)
                {
                    i = mHighValues[l];
                }
                l++;
                j = i;
            } while (true);
        }
        int i1 = i;
        if (mSecondaryHighValues != null)
        {
            int k = 0;
            do
            {
                i1 = i;
                if (k >= mSecondaryHighValues.length)
                {
                    break;
                }
                i1 = i;
                if (mSecondaryHighValues[k] > i)
                {
                    i1 = mSecondaryHighValues[k];
                }
                k++;
                i = i1;
            } while (true);
        }
        return i1;
    }

    private int getMinValue()
    {
        int i = 999;
        if (mLowValues != null)
        {
            boolean flag = false;
            int j = i;
            for (i = ((flag) ? 1 : 0); i < mLowValues.length;)
            {
                int l = j;
                if (mLowValues[i] < j)
                {
                    l = mLowValues[i];
                }
                i++;
                j = l;
            }

            i = j;
            if (mSecondaryLowValues != null)
            {
                int i1 = 0;
                do
                {
                    i = j;
                    if (i1 >= mSecondaryLowValues.length)
                    {
                        break;
                    }
                    i = j;
                    if (mSecondaryLowValues[i1] < j)
                    {
                        i = mSecondaryLowValues[i1];
                    }
                    i1++;
                    j = i;
                } while (true);
            }
        } else
        {
            int k = i;
            if (mHighValues != null)
            {
                int j1 = 0;
                do
                {
                    k = i;
                    if (j1 >= mHighValues.length)
                    {
                        break;
                    }
                    k = i;
                    if (mHighValues[j1] < i)
                    {
                        k = mHighValues[j1];
                    }
                    j1++;
                    i = k;
                } while (true);
            }
            i = k;
            if (mSecondaryHighValues != null)
            {
                int k1 = 0;
                do
                {
                    i = k;
                    if (k1 >= mSecondaryHighValues.length)
                    {
                        break;
                    }
                    i = k;
                    if (mSecondaryHighValues[k1] < k)
                    {
                        i = mSecondaryHighValues[k1];
                    }
                    k1++;
                    k = i;
                } while (true);
            }
        }
        return i;
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
        setTypeFaces();
    }

    public void onDraw(Canvas canvas)
    {
        if (mHighValues == null)
        {
            super.onDraw(canvas);
        } else
        {
            if (mPaint == null)
            {
                mPaint = new Paint();
                mPaint.setStyle(android.graphics.Paint.Style.FILL);
                mPaint.setFlags(1);
            }
            float f3 = mWidth;
            float f6 = mHeight;
            float f4 = 40F * mDpi;
            float f5 = 0.0F * mDpi;
            float f7 = f6 - 16F * mDpi;
            mPaint.setColor(getResources().getColor(com.accuweather.android.R.color.action_bar_dark_blue));
            canvas.drawRect(0.0F, 0.0F, f4 - 8F * mDpi, f7, mPaint);
            canvas.drawRect(f4, 0.0F, mWidth, f7, mPaint);
            mPaint.setColor(0x88ffffff & getResources().getColor(com.accuweather.android.R.color.secondary_text));
            float f = f4 - 6F * mDpi;
            int j = 1;
            do
            {
                boolean flag = true;
                if (j >= 6)
                {
                    break;
                }
                float f8 = ((float)j * f7) / 6F;
                while (f < f3) 
                {
                    if (flag)
                    {
                        float f1 = f + 8F;
                        canvas.drawLine(f, f8, f1, f8, mPaint);
                        flag = false;
                        f = f1;
                    } else
                    {
                        f += 4F;
                        flag = true;
                    }
                }
                f = f4 - 6F * mDpi;
                j++;
            } while (true);
            float f2 = getMaxValue();
            float f9 = getMinValue();
            float f10 = mDpi;
            float f11 = (1.0F * f7) / 6F;
            String s = String.valueOf((int)f2);
            String s1 = (new StringBuilder()).append(s).append("\260").toString();
            int i;
            if (s.length() < 3)
            {
                f = 10F * mDpi;
            } else
            {
                f = 2.0F * mDpi;
            }
            canvas.drawText(s1, f, 4F * f10 + f11, mTextPaint);
            f10 = mDpi;
            f11 = (2.0F * f7) / 6F;
            s = String.valueOf((int)(f2 - ((f2 - f9) * 1.0F) / 5F));
            s1 = (new StringBuilder()).append(s).append("\260").toString();
            if (s.length() < 3)
            {
                f = 10F * mDpi;
            } else
            {
                f = 2.0F * mDpi;
            }
            canvas.drawText(s1, f, 4F * f10 + f11, mTextPaint);
            f10 = mDpi;
            f11 = (3F * f7) / 6F;
            s = String.valueOf((int)(f2 - ((f2 - f9) * 2.0F) / 5F));
            s1 = (new StringBuilder()).append(s).append("\260").toString();
            if (s.length() < 3)
            {
                f = 10F * mDpi;
            } else
            {
                f = 2.0F * mDpi;
            }
            canvas.drawText(s1, f, 4F * f10 + f11, mTextPaint);
            f10 = mDpi;
            f11 = (4F * f7) / 6F;
            s = String.valueOf((int)(f2 - ((f2 - f9) * 3F) / 5F));
            s1 = (new StringBuilder()).append(s).append("\260").toString();
            if (s.length() < 3)
            {
                f = 10F * mDpi;
            } else
            {
                f = 2.0F * mDpi;
            }
            canvas.drawText(s1, f, 4F * f10 + f11, mTextPaint);
            f10 = mDpi;
            f11 = (5F * f7) / 6F;
            s = String.valueOf((int)(f2 - ((f2 - f9) * 5F) / 5F));
            s1 = (new StringBuilder()).append(s).append("\260").toString();
            if (s.length() < 3)
            {
                f = 10F * mDpi;
            } else
            {
                f = 2.0F * mDpi;
            }
            canvas.drawText(s1, f, 4F * f10 + f11, mTextPaint);
            drawUsingPath(canvas);
            j = mLabelValues.length;
            f2 = f6 - 3F * mDpi;
            drawLabelBar(canvas, 0, (int)(4F * mDpi + f7), (int)((f4 - 2.0F * mDpi) + ((f3 - (f4 + f5)) * (float)mFirstSubsetSize) / (float)j), (int)f6, getResources().getColor(com.accuweather.android.R.color.action_bar_dark_blue));
            drawLabelBar(canvas, (int)((f4 - 2.0F * mDpi) + ((f3 - (f4 + f5)) * (float)mFirstSubsetSize) / (float)j), (int)(4F * mDpi + f7), (int)f3, (int)f6, getResources().getColor(com.accuweather.android.R.color.action_bar_dark_blue));
            mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
            if (mLabels.length > 0)
            {
                canvas.drawText(mLabels[0], 12F * mDpi, f2, mSmallTextPaint);
            }
            mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
            if (mLabels.length > 1)
            {
                canvas.drawText(mLabels[1], f3 - f5, f2, mSmallTextPaint);
            }
            mSmallTextPaint.setColor(getContext().getResources().getColor(0x106000b));
            i = 0;
            while (i < mLabelValues.length) 
            {
                if (String.valueOf(mLabelValues[i]).length() == 1)
                {
                    f = 3F * mDpi;
                } else
                {
                    f = (float)(String.valueOf(mLabelValues[i]).length() - 1) * (-1F * mDpi);
                }
                canvas.drawText(String.valueOf(mLabelValues[i]), f + f4 + ((f3 - (f4 + f5)) * (float)i) / (float)j, f2, mSmallTextPaint);
                i++;
            }
        }
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

    public void setPrimaryColor(int i)
    {
        mPrimaryColor = i;
    }

    public void setPrimaryFillColor(int i)
    {
        mPrimaryFillColor = i;
    }

    public void setSecondaryColor(int i)
    {
        mSecondaryColor = i;
    }

    public void setSecondaryFillColor(int i)
    {
        mSecondaryFillColor = i;
    }

    protected void setTypeFaces()
    {
        mTextPaint.setTypeface(Data.getRobotoCondensed());
        mSmallTextPaint.setTypeface(Data.getRobotoBold());
    }

    public void setValues(int ai[], int ai1[], int ai2[], int ai3[], String as[], int ai4[])
    {
        mHighValues = ai;
        mLowValues = ai1;
        mSecondaryHighValues = ai2;
        mSecondaryLowValues = ai3;
        mLabels = as;
        mLabelValues = ai4;
        postInvalidate();
    }
}
