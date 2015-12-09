// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat
{

    private Drawable mForeground;
    boolean mForegroundBoundsChanged;
    private int mForegroundGravity;
    protected boolean mForegroundInPadding;
    private final Rect mOverlayBounds;
    private final Rect mSelfBounds;

    public ForegroundLinearLayout(Context context)
    {
        super(context);
        mSelfBounds = new Rect();
        mOverlayBounds = new Rect();
        mForegroundGravity = 119;
        mForegroundInPadding = true;
        mForegroundBoundsChanged = false;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSelfBounds = new Rect();
        mOverlayBounds = new Rect();
        mForegroundGravity = 119;
        mForegroundInPadding = true;
        mForegroundBoundsChanged = false;
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ForegroundLinearLayout, i, 0);
        mForegroundGravity = context.getInt(android.support.design.R.styleable.ForegroundLinearLayout_android_foregroundGravity, mForegroundGravity);
        attributeset = context.getDrawable(android.support.design.R.styleable.ForegroundLinearLayout_android_foreground);
        if (attributeset != null)
        {
            setForeground(attributeset);
        }
        mForegroundInPadding = context.getBoolean(android.support.design.R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        context.recycle();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mForeground != null)
        {
            Drawable drawable = mForeground;
            if (mForegroundBoundsChanged)
            {
                mForegroundBoundsChanged = false;
                Rect rect = mSelfBounds;
                Rect rect1 = mOverlayBounds;
                int i = getRight() - getLeft();
                int j = getBottom() - getTop();
                if (mForegroundInPadding)
                {
                    rect.set(0, 0, i, j);
                } else
                {
                    rect.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
                }
                Gravity.apply(mForegroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect1);
                drawable.setBounds(rect1);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f1)
    {
        super.drawableHotspotChanged(f, f1);
        if (mForeground != null)
        {
            mForeground.setHotspot(f, f1);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mForeground != null && mForeground.isStateful())
        {
            mForeground.setState(getDrawableState());
        }
    }

    public Drawable getForeground()
    {
        return mForeground;
    }

    public int getForegroundGravity()
    {
        return mForegroundGravity;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (mForeground != null)
        {
            mForeground.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mForegroundBoundsChanged = mForegroundBoundsChanged | flag;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        mForegroundBoundsChanged = true;
    }

    public void setForeground(Drawable drawable)
    {
        if (mForeground != drawable)
        {
            if (mForeground != null)
            {
                mForeground.setCallback(null);
                unscheduleDrawable(mForeground);
            }
            mForeground = drawable;
            if (drawable != null)
            {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful())
                {
                    drawable.setState(getDrawableState());
                }
                if (mForegroundGravity == 119)
                {
                    drawable.getPadding(new Rect());
                }
            } else
            {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i)
    {
        if (mForegroundGravity != i)
        {
            if ((0x800007 & i) == 0)
            {
                i = 0x800003 | i;
            }
            int j = i;
            if ((i & 0x70) == 0)
            {
                j = i | 0x30;
            }
            mForegroundGravity = j;
            if (mForegroundGravity == 119 && mForeground != null)
            {
                Rect rect = new Rect();
                mForeground.getPadding(rect);
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mForeground;
    }
}
