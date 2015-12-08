// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tinder.utils.v;

public class CircleWithImage extends ImageView
{

    private int mBackgroundColor;
    private BitmapShader mBitmapShader;
    private Bitmap mCurBitmap;
    private Paint mPaint;
    private RectF mRectBackground;
    private float padding;
    private float radius;
    private float x;
    private float y;

    public CircleWithImage(Context context)
    {
        super(context);
        x = 0.0F;
        y = 0.0F;
        radius = 30F;
        mBackgroundColor = getResources().getColor(0x7f0d0113);
        mRectBackground = new RectF();
    }

    public CircleWithImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x = 0.0F;
        y = 0.0F;
        radius = 30F;
        mBackgroundColor = getResources().getColor(0x7f0d0113);
        mRectBackground = new RectF();
        attributeset = context.obtainStyledAttributes(attributeset, com.tinder.a.a.com_tinder_views_CircleWithImage, 0, 0);
        mBackgroundColor = attributeset.getColor(0, 0);
        padding = attributeset.getDimension(1, context.getResources().getDimension(0x7f0900c3));
        attributeset.recycle();
        return;
        context;
        v.b(context.getMessage());
        attributeset.recycle();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    private void drawCircle(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(mBackgroundColor);
        x = getWidth() / 2;
        y = getHeight() / 2;
        float f;
        if (x > y)
        {
            f = x;
        } else
        {
            f = y;
        }
        radius = f;
        radius = radius + padding;
        String.format("drawing circle at x[%s] y[%s] with padding: [%s]", new Object[] {
            Float.valueOf(x), Float.valueOf(y), Float.valueOf(padding)
        });
        canvas.drawCircle(x, y, radius, paint);
    }

    private Paint getPaint(BitmapShader bitmapshader)
    {
        if (mPaint == null || mPaint.getShader() != bitmapshader)
        {
            mPaint = new Paint();
            mPaint.setAntiAlias(true);
            mPaint.setShader(bitmapshader);
            mPaint.setFilterBitmap(true);
        }
        return mPaint;
    }

    private BitmapShader getShader(Bitmap bitmap)
    {
        if (mBitmapShader == null || mCurBitmap != bitmap)
        {
            mBitmapShader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        }
        return mBitmapShader;
    }

    public void backgroundColor(int i)
    {
        mBackgroundColor = i;
        invalidate();
        requestLayout();
    }

    protected void onDraw(Canvas canvas)
    {
        Object obj = getDrawable();
        if (obj == null)
        {
            v.b("CircleWithImage drawable null - aborting onDraw...");
            return;
        }
        Canvas canvas1 = canvas;
        if (canvas == null)
        {
            canvas1 = new Canvas();
        }
        drawCircle(canvas1);
        canvas = ((BitmapDrawable)obj).getBitmap();
        obj = getPaint(getShader(canvas));
        if (canvas != null && mRectBackground != null && obj != null)
        {
            mRectBackground.top = 0.0F;
            mRectBackground.left = 0.0F;
            mRectBackground.bottom = canvas.getHeight();
            mRectBackground.right = canvas.getWidth();
            try
            {
                canvas1.drawRoundRect(mRectBackground, 20F, 20F, ((Paint) (obj)));
            }
            catch (Exception exception)
            {
                exception.getMessage();
            }
            mCurBitmap = canvas;
            return;
        } else
        {
            v.a("Something important was null");
            return;
        }
    }
}
