// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;

public class PlayTextView extends TextView
{

    private static final boolean RESPECT_ORIGINAL_LINE_SPACING;
    private Paint mBorderPaint;
    private float mBorderThickness;
    private final float mCompactFactor;
    private int mDecorationPosition;
    private GradientDrawable mLastLineFadeOutDrawable;
    private int mLastLineFadeOutHintMargin;
    private int mLastLineFadeOutSize;
    private final String mLastLineOverdrawHint;
    private Paint mLastLineOverdrawHintPaint;
    private Paint mLastLineOverdrawPaint;
    private boolean mToDrawOverLastLineIfNecessary;

    public PlayTextView(Context context)
    {
        this(context, null);
    }

    public PlayTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Resources resources = context.getResources();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.PlayTextView);
        mToDrawOverLastLineIfNecessary = typedarray.hasValue(1);
        if (mToDrawOverLastLineIfNecessary)
        {
            int i = typedarray.getColor(1, resources.getColor(0x7f0b0292));
            mLastLineOverdrawPaint = new Paint();
            mLastLineOverdrawPaint.setColor(i);
            mLastLineOverdrawPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            mLastLineFadeOutSize = resources.getDimensionPixelSize(0x7f0c0345);
            mLastLineFadeOutDrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[] {
                0xffffff & i, i
            });
            mLastLineFadeOutHintMargin = resources.getDimensionPixelSize(0x7f0c0346);
        }
        String s = typedarray.getString(2);
        attributeset = s;
        if (typedarray.getBoolean(4, false))
        {
            attributeset = s.toUpperCase(Locale.getDefault());
        }
        mLastLineOverdrawHint = attributeset;
        if (!TextUtils.isEmpty(mLastLineOverdrawHint))
        {
            mLastLineOverdrawHintPaint = new Paint();
            mLastLineOverdrawHintPaint.setColor(typedarray.getColor(3, getCurrentTextColor()));
            mLastLineOverdrawHintPaint.setTextSize(getTextSize());
            mLastLineOverdrawHintPaint.setTypeface(getTypeface());
            mLastLineOverdrawHintPaint.setAntiAlias(true);
        }
        mDecorationPosition = typedarray.getInt(5, 1);
        float f = getTextSize();
        boolean flag = resources.getBoolean(0x7f0a0015);
        boolean flag1 = typedarray.getBoolean(0, false);
        if (flag && flag1)
        {
            attributeset = getPaint().getFontMetrics();
            mCompactFactor = Math.max(0.0F, 1.0F - (1.172F * f) / (Math.abs(((android.graphics.Paint.FontMetrics) (attributeset)).ascent) + Math.abs(((android.graphics.Paint.FontMetrics) (attributeset)).descent)));
        } else
        {
            mCompactFactor = 0.0F;
        }
        if (mCompactFactor > 0.0F)
        {
            float f1 = -mCompactFactor * f;
            f = f1;
            if (RESPECT_ORIGINAL_LINE_SPACING)
            {
                f = f1 + (float)getLineHeight() * (getLineSpacingMultiplier() - 1.0F);
            }
            setLineSpacing(f, 1.0F);
        }
        typedarray.recycle();
        mBorderThickness = context.getResources().getDimension(0x7f0c0347);
        mBorderPaint = new Paint();
        mBorderPaint.setStrokeWidth(mBorderThickness);
        mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mToDrawOverLastLineIfNecessary) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Layout layout;
        int i;
        int i2;
        i = getHeight() - getPaddingBottom();
        i2 = getWidth();
        layout = getLayout();
        if (layout == null) goto _L1; else goto _L3
_L3:
        int j;
        int k;
        int l1;
        l1 = getPaddingTop();
        k = layout.getLineCount();
        j = 0;
_L11:
        if (j >= k) goto _L1; else goto _L4
_L4:
        int l = layout.getLineTop(j);
        int j1 = layout.getLineBottom(j);
        if (l > i || j1 <= i)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        canvas.drawRect(0.0F, l1 + l, i2, i, mLastLineOverdrawPaint);
        if (j <= 0) goto _L1; else goto _L5
_L5:
        k = j;
_L9:
        CharSequence charsequence;
        int k1;
        k1 = k - 1;
        Layout layout1 = getLayout();
        charsequence = layout1.getText();
        k = layout1.getLineStart(k1);
        i = layout1.getLineEnd(k1);
_L10:
        if (i <= k)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        if (Character.isWhitespace(charsequence.charAt(i - 1))) goto _L7; else goto _L6
_L6:
        if (i != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = k1;
        if (k1 > 0) goto _L9; else goto _L8
_L8:
        int i1 = i;
        if (i == -1)
        {
            i1 = 0;
        }
        int j2 = layout.getLineTop(k1);
        int k2 = layout.getLineBottom(k1);
        boolean flag;
        int l2;
        int i3;
        if (layout.getParagraphDirection(k1) == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l2 = (int)layout.getPrimaryHorizontal(i1);
        k1 = getPaddingLeft();
        i3 = getPaddingRight();
        i1 = k1 + l2;
        i = i1;
        if (!TextUtils.isEmpty(mLastLineOverdrawHint))
        {
            i = (int)mLastLineOverdrawHintPaint.measureText(mLastLineOverdrawHint);
            if (!flag)
            {
                k1 = i2 - i3 - i;
            }
            i2 = k1 + i;
            if (flag && mLastLineFadeOutHintMargin + i2 > l2)
            {
                i = i2 + mLastLineFadeOutHintMargin;
                canvas.drawRect(k1, l1 + j2, i, l1 + k2, mLastLineOverdrawPaint);
            } else
            {
                i = i1;
                if (!flag)
                {
                    i = i1;
                    if (k1 - mLastLineFadeOutHintMargin < l2)
                    {
                        i = k1 - mLastLineFadeOutHintMargin;
                        canvas.drawRect(i, l1 + j2, i2, l1 + k2, mLastLineOverdrawPaint);
                    }
                }
            }
            canvas.drawText(mLastLineOverdrawHint, k1, layout.getLineBaseline(j - 1), mLastLineOverdrawHintPaint);
        }
        canvas.save(1);
        canvas.translate(i, l1);
        if (flag)
        {
            canvas.scale(-1F, 1.0F);
        }
        mLastLineFadeOutDrawable.setBounds(-mLastLineFadeOutSize, j2, 0, k2);
        mLastLineFadeOutDrawable.draw(canvas);
        canvas.restore();
        return;
_L7:
        i--;
          goto _L10
        i = -1;
          goto _L6
        j++;
          goto _L11
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        while (mCompactFactor == 0.0F || android.view.View.MeasureSpec.getMode(j) == 0x40000000) 
        {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + (int)(mCompactFactor * (float)getLineHeight()));
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RESPECT_ORIGINAL_LINE_SPACING = flag;
    }
}
