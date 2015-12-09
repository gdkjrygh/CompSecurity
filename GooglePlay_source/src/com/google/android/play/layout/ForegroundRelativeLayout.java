// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ForegroundRelativeLayout extends RelativeLayout
{

    private static boolean IS_HC_OR_ABOVE;
    private static boolean IS_JBMR1_OR_ABOVE;
    private boolean mForegroundBoundsChanged;
    private Drawable mForegroundDrawable;
    int mForegroundPaddingBottom;
    int mForegroundPaddingLeft;
    int mForegroundPaddingRight;
    int mForegroundPaddingTop;
    private final Rect mOverlayBounds;
    private final Rect mSelfBounds;

    public ForegroundRelativeLayout(Context context)
    {
        this(context, null, 0);
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mForegroundPaddingLeft = 0;
        mForegroundPaddingTop = 0;
        mForegroundPaddingRight = 0;
        mForegroundPaddingBottom = 0;
        mSelfBounds = new Rect();
        mOverlayBounds = new Rect();
        mForegroundBoundsChanged = false;
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010109
        });
        attributeset = context.getDrawable(0);
        if (attributeset != null)
        {
            setForeground(attributeset);
        }
        context.recycle();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mForegroundDrawable != null)
        {
            Drawable drawable = mForegroundDrawable;
            if (mForegroundBoundsChanged)
            {
                mForegroundBoundsChanged = false;
                Rect rect = mSelfBounds;
                Rect rect1 = mOverlayBounds;
                int i = getWidth();
                int k = getHeight();
                rect.set(mForegroundPaddingLeft, mForegroundPaddingTop, i - mForegroundPaddingRight, k - mForegroundPaddingBottom);
                if (IS_JBMR1_OR_ABOVE)
                {
                    int j = getLayoutDirection();
                    GravityCompat.apply$1d198dab(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect1, j);
                } else
                {
                    mOverlayBounds.set(rect);
                }
                drawable.setBounds(rect1);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f1)
    {
        super.drawableHotspotChanged(f, f1);
        if (mForegroundDrawable != null)
        {
            mForegroundDrawable.setHotspot(f, f1);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (mForegroundDrawable != null && mForegroundDrawable.isStateful())
        {
            mForegroundDrawable.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (IS_HC_OR_ABOVE && mForegroundDrawable != null)
        {
            mForegroundDrawable.jumpToCurrentState();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mForegroundBoundsChanged = true;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        mForegroundBoundsChanged = true;
    }

    public void setForeground(Drawable drawable)
    {
        if (mForegroundDrawable != drawable)
        {
            if (mForegroundDrawable != null)
            {
                mForegroundDrawable.setCallback(null);
                unscheduleDrawable(mForegroundDrawable);
            }
            mForegroundDrawable = drawable;
            mForegroundPaddingLeft = 0;
            mForegroundPaddingTop = 0;
            mForegroundPaddingRight = 0;
            mForegroundPaddingBottom = 0;
            if (drawable != null)
            {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful())
                {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect))
                {
                    mForegroundPaddingLeft = rect.left;
                    mForegroundPaddingTop = rect.top;
                    mForegroundPaddingRight = rect.right;
                    mForegroundPaddingBottom = rect.bottom;
                }
            } else
            {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (mForegroundDrawable != null)
        {
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mForegroundDrawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mForegroundDrawable;
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HC_OR_ABOVE = flag;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        IS_JBMR1_OR_ABOVE = flag;
    }
}
