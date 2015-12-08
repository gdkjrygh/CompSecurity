// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public abstract class CardViewBackgroundDrawable extends Drawable
{

    protected ColorStateList mColorStateList;
    protected float mCornerRadius;
    protected float mInset;
    protected Paint mPaint;

    CardViewBackgroundDrawable(ColorStateList colorstatelist, float f, float f1)
    {
        mCornerRadius = f;
        mColorStateList = colorstatelist;
        mPaint = new Paint(5);
        mPaint.setColor(mColorStateList.getDefaultColor());
        mInset = f1;
    }

    public int getOpacity()
    {
        return -1;
    }

    public boolean isStateful()
    {
        return mColorStateList != null && mColorStateList.isStateful();
    }

    protected boolean onStateChange(int ai[])
    {
        if (mColorStateList != null && mColorStateList.isStateful())
        {
            mPaint.setColor(mColorStateList.getColorForState(ai, mColorStateList.getDefaultColor()));
            invalidateSelf();
            return true;
        } else
        {
            return super.onStateChange(ai);
        }
    }

    public final void setBackgroundColor(int i)
    {
        mColorStateList = null;
        mPaint.setColor(i);
        invalidateSelf();
    }

    public final void setBackgroundColorStateList(ColorStateList colorstatelist)
    {
        mColorStateList = colorstatelist;
        mPaint.setColor(mColorStateList.getColorForState(getState(), mColorStateList.getDefaultColor()));
        invalidateSelf();
    }
}
