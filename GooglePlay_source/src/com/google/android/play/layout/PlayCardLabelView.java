// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class PlayCardLabelView extends View
{

    private boolean mCanShowStrikeText;
    private final int mDefaultStrikeTextColor;
    private final int mIconGap;
    private final TextPaint mStrikeTextPaint;
    private int mStrikeTextWidth;
    private final int mTextBaseline;
    private final int mTextHeight;
    private final TextPaint mTextPaint;
    private final int mTextSize;
    private final int mTextsGap;

    public PlayCardLabelView(Context context)
    {
        this(context, null);
    }

    public PlayCardLabelView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getResources();
        mIconGap = context.getDimensionPixelSize(0x7f0c02bd);
        mTextsGap = context.getDimensionPixelSize(0x7f0c02be);
        mTextSize = context.getDimensionPixelSize(0x7f0c0305);
        mTextPaint = new TextPaint(1);
        mTextPaint.density = context.getDisplayMetrics().density;
        mTextPaint.setTextSize(mTextSize);
        mTextPaint.setFakeBoldText(false);
        mStrikeTextPaint = new TextPaint(1);
        mStrikeTextPaint.density = context.getDisplayMetrics().density;
        mStrikeTextPaint.setTextSize(mTextSize);
        mDefaultStrikeTextColor = context.getColor(0x7f0b024d);
        mStrikeTextPaint.setColor(mDefaultStrikeTextColor);
        mStrikeTextPaint.setStrikeThruText(true);
        mStrikeTextPaint.setFakeBoldText(false);
        context = mTextPaint.getFontMetrics();
        mTextHeight = (int)(Math.abs(((android.graphics.Paint.FontMetrics) (context)).top) + Math.abs(((android.graphics.Paint.FontMetrics) (context)).bottom));
        mTextBaseline = (int)Math.abs(((android.graphics.Paint.FontMetrics) (context)).top);
        setWillNotDraw(false);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
        if (accessibilityevent.getEventType() == 8)
        {
            accessibilityevent.getText().add(getContentDescription());
            flag = true;
        }
        return flag;
    }

    public int getBaseline()
    {
        return getPaddingTop() + mTextBaseline;
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.save();
        int j = getPaddingLeft();
        int k = getPaddingTop();
        boolean flag;
        int i;
        if (!TextUtils.isEmpty(null))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = j;
        if (mCanShowStrikeText)
        {
            canvas.drawText(null, j, mTextBaseline + k, mStrikeTextPaint);
            i = j + (mStrikeTextWidth + mTextsGap);
        }
        if (flag)
        {
            canvas.drawText(null, i, mTextBaseline + k, mTextPaint);
        }
        canvas.restore();
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        boolean flag;
        int l;
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000 && android.view.View.MeasureSpec.getSize(i) == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = android.view.View.MeasureSpec.getSize(i);
        i = 0;
        flag = false;
        mStrikeTextWidth = 0;
        mCanShowStrikeText = false;
        if (!TextUtils.isEmpty(null))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (k == 0)
        {
            i = ((flag) ? 1 : 0);
            if (j != 0)
            {
                i = (int)mTextPaint.measureText(null) + 0;
            }
            k = i;
            if (!TextUtils.isEmpty(null))
            {
                mStrikeTextWidth = (int)mStrikeTextPaint.measureText(null);
                k = mStrikeTextWidth;
                if (j != 0)
                {
                    j = mTextsGap;
                } else
                {
                    j = 0;
                }
                j = k + j;
                if (l > 0 && i + j <= l)
                {
                    k = i + j;
                    mCanShowStrikeText = true;
                } else
                {
                    mCanShowStrikeText = false;
                    k = i;
                }
            }
            i = k + (getPaddingLeft() + getPaddingRight());
        }
        setMeasuredDimension(i, mTextHeight + (getPaddingTop() + getPaddingBottom()));
    }
}
