// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            AutoResizeTextView

public class StrokeTextView extends AutoResizeTextView
{

    private Bitmap mCache;
    private final Canvas mCanvas;
    private final Paint mPaint;
    private int mStrokeColor;
    private int mStrokeWidth;
    private int mTextColor;
    private boolean mUpdateCachedBitmap;

    public StrokeTextView(Context context)
    {
        super(context);
        mCanvas = new Canvas();
        mPaint = new Paint();
        mStrokeColor = -1;
        init(context, null, 0);
    }

    public StrokeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCanvas = new Canvas();
        mPaint = new Paint();
        mStrokeColor = -1;
        init(context, attributeset, 0);
    }

    public StrokeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCanvas = new Canvas();
        mPaint = new Paint();
        mStrokeColor = -1;
        init(context, attributeset, i);
    }

    private void init(Context context, AttributeSet attributeset, int i)
    {
        context = getContext().obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.StrokeTextView, i, 0);
        if (context == null)
        {
            return;
        }
        i = 0;
_L2:
        int j;
        if (i >= context.getIndexCount())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = context.getIndex(i);
        switch (j)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        break MISSING_BLOCK_LABEL_81;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        mStrokeColor = context.getColor(j, 0);
          goto _L3
        mStrokeWidth = context.getDimensionPixelSize(j, 0);
          goto _L3
        context.recycle();
        mUpdateCachedBitmap = true;
        mPaint.setAntiAlias(true);
        mPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        return;
    }

    protected void onDraw(Canvas canvas)
    {
        if (mCache != null)
        {
            if (mUpdateCachedBitmap)
            {
                int l = getMeasuredWidth();
                int k = getMeasuredHeight();
                String s = getText().toString();
                Rect rect = new Rect();
                android.text.TextPaint textpaint = getPaint();
                int i1 = (int)textpaint.measureText(s);
                textpaint.getTextBounds("x", 0, 1, rect);
                mCanvas.setBitmap(mCache);
                mCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                int j1 = getPaddingLeft();
                int k1 = getPaddingTop();
                Drawable adrawable[] = getCompoundDrawables();
                for (int i = 0; i < adrawable.length; i++)
                {
                    if (adrawable[i] != null)
                    {
                        adrawable[i].setBounds(j1, k1, adrawable[i].getIntrinsicWidth() + j1, adrawable[i].getIntrinsicHeight() + k1);
                        adrawable[i].draw(mCanvas);
                    }
                }

                int j = l - getPaddingRight() - i1;
                k = (rect.height() + k) / 2;
                mPaint.setStrokeWidth(mStrokeWidth);
                mPaint.setColor(mStrokeColor);
                mPaint.setTextSize(getTextSize());
                mCanvas.drawText(s, j, k, mPaint);
                mPaint.setStrokeWidth(0.0F);
                mPaint.setColor(mTextColor);
                mCanvas.drawText(s, j, k, mPaint);
                mUpdateCachedBitmap = false;
            }
            canvas.drawBitmap(mCache, 0.0F, 0.0F, mPaint);
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i > 0 && j > 0)
        {
            mUpdateCachedBitmap = true;
            mCache = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            return;
        } else
        {
            mCache = null;
            return;
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        mUpdateCachedBitmap = true;
    }

    public void setStrokeColor(int i)
    {
        mStrokeColor = i;
    }

    public void setStrokeWidth(int i)
    {
        mStrokeWidth = i;
    }

    public void setTextColor(int i)
    {
        super.setTextColor(i);
        mTextColor = i;
    }
}
