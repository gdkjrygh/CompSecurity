// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.squareup.picasso.x;
import com.tinder.utils.v;

public class RoundImageView extends ImageView
    implements x
{

    private BitmapShader mBitmapShader;
    private int mCornerRadius;
    private Bitmap mCurBitmap;
    private Integer mDefaultStyle;
    private Paint mPaint;
    private RectF mRectDestination;

    public RoundImageView(Context context)
    {
        super(context);
        mRectDestination = new RectF();
    }

    public RoundImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        parseAttributes(context, attributeset);
    }

    public RoundImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        parseAttributes(context, attributeset);
    }

    private void calculateRadiusFromStyle(int i)
    {
        if (mDefaultStyle.intValue() != 0)
        {
            mCornerRadius = Math.round(((float)mDefaultStyle.intValue() / 100F) * (float)i);
        }
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

    private void parseAttributes(Context context, AttributeSet attributeset)
    {
        mRectDestination = new RectF();
        context = context.obtainStyledAttributes(attributeset, com.tinder.a.a.RoundImageView, 0, 0);
        mDefaultStyle = Integer.valueOf(context.getInteger(0, 0));
        mCornerRadius = context.getInt(1, 1);
        context.recycle();
        return;
        attributeset;
        v.b(attributeset.getMessage());
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public int getCornerRadius()
    {
        return mCornerRadius;
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setImageBitmap(bitmap);
    }

    protected void onDraw(Canvas canvas)
    {
        Object obj;
        for (obj = getDrawable(); isInEditMode() || obj == null;)
        {
            return;
        }

        Canvas canvas1 = canvas;
        if (canvas == null)
        {
            canvas1 = new Canvas();
        }
        canvas = ((BitmapDrawable)obj).getBitmap();
        obj = getPaint(getShader(canvas));
        if (canvas != null && mRectDestination != null && obj != null)
        {
            calculateRadiusFromStyle(canvas.getWidth());
            mRectDestination.top = 0.0F;
            mRectDestination.left = 0.0F;
            mRectDestination.bottom = canvas.getHeight();
            mRectDestination.right = canvas.getWidth();
            try
            {
                canvas1.drawRoundRect(mRectDestination, mCornerRadius, mCornerRadius, ((Paint) (obj)));
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

    public void onPrepareLoad(Drawable drawable)
    {
        setImageDrawable(drawable);
    }

    public void setCornerRadius(int i)
    {
        mCornerRadius = i;
        invalidate();
    }

    public void setStyle(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1360216880: 123
    //                   73087533: 81
    //                   105762980: 109
    //                   1913349822: 95;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_123;
_L6:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            mDefaultStyle = Integer.valueOf(6);
            return;

        case 1: // '\001'
            mDefaultStyle = Integer.valueOf(10);
            return;

        case 2: // '\002'
            mDefaultStyle = Integer.valueOf(20);
            return;

        case 3: // '\003'
            mDefaultStyle = Integer.valueOf(50);
            break;
        }
        break MISSING_BLOCK_LABEL_176;
_L3:
        if (s.equals("barely_rounded"))
        {
            byte0 = 0;
        }
          goto _L6
_L5:
        if (s.equals("slightly_rounded"))
        {
            byte0 = 1;
        }
          goto _L6
_L4:
        if (s.equals("very_rounded"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("circle"))
        {
            byte0 = 3;
        }
          goto _L6
    }
}
