// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import com.squareup.picasso.z;

public class LinearGradientTransformation
    implements z
{

    private Paint mBottomPaint;
    private int mColorOne;
    private int mColorTwo;
    private double mPercentGradientBottom;
    private double mPercentGradientTop;
    private Paint mTopPaint;

    public LinearGradientTransformation(Context context, double d, double d1)
    {
        mColorOne = context.getResources().getColor(0x7f0d0109);
        mColorTwo = context.getResources().getColor(0x7f0d0107);
        mPercentGradientTop = d;
        mPercentGradientBottom = d1;
    }

    private Paint getBottomPaint(Bitmap bitmap)
    {
        if (mBottomPaint == null)
        {
            bitmap = new LinearGradient(bitmap.getWidth() / 2, bitmap.getHeight() - (int)((double)bitmap.getHeight() * mPercentGradientBottom), bitmap.getWidth() / 2, bitmap.getHeight(), mColorTwo, mColorOne, android.graphics.Shader.TileMode.CLAMP);
            mBottomPaint = new Paint();
            mBottomPaint.setDither(true);
            mBottomPaint.setShader(bitmap);
        }
        return mBottomPaint;
    }

    private Paint getTopPaint(Bitmap bitmap)
    {
        if (mTopPaint == null)
        {
            bitmap = new LinearGradient(bitmap.getWidth() / 2, 0.0F, bitmap.getWidth() / 2, (int)((double)bitmap.getHeight() * mPercentGradientTop), mColorOne, mColorTwo, android.graphics.Shader.TileMode.CLAMP);
            mTopPaint = new Paint();
            mTopPaint.setDither(true);
            mTopPaint.setShader(bitmap);
        }
        return mTopPaint;
    }

    public String key()
    {
        return "LinearGradientTransformation";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawRect(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight(), getTopPaint(bitmap));
        canvas.drawRect(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight(), getBottomPaint(bitmap));
        return bitmap;
    }
}
