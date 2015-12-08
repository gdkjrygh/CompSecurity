// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.apps.wallet.paymentcard.api.CardColor;

public final class PaymentCards
{
    static final class LoadingBackgroundDrawable extends ShapeDrawable
    {

        private RectF mBounds;
        private float mCornerRadius;
        private Paint mPaint;

        public final void draw(Canvas canvas)
        {
            canvas.drawRoundRect(mBounds, mCornerRadius, mCornerRadius, mPaint);
        }

        public final void setBounds(Rect rect)
        {
            mBounds = new RectF(rect);
        }

        public LoadingBackgroundDrawable(float f)
        {
            mCornerRadius = f;
            mPaint = new Paint();
            mPaint.setColor(0xffcccccc);
            mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            mPaint.setStrokeWidth(2.0F);
        }
    }


    public static Drawable getGradientBackground(CardColor cardcolor, float f)
    {
        cardcolor = cardcolor.getGradientDrawableColors();
        cardcolor = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, cardcolor);
        cardcolor.setShape(0);
        cardcolor.setGradientType(0);
        cardcolor.setCornerRadius(f);
        return cardcolor;
    }

    public static Drawable getLoadingBackground(float f)
    {
        return new LoadingBackgroundDrawable(f);
    }
}
