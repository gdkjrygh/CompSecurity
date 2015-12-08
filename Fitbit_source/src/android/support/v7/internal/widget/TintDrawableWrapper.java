// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            DrawableWrapper, TintManager

class TintDrawableWrapper extends DrawableWrapper
{

    private int mCurrentColor;
    private final android.graphics.PorterDuff.Mode mTintMode;
    private final ColorStateList mTintStateList;

    public TintDrawableWrapper(Drawable drawable, ColorStateList colorstatelist)
    {
        this(drawable, colorstatelist, TintManager.DEFAULT_MODE);
    }

    public TintDrawableWrapper(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
    {
        super(drawable);
        mTintStateList = colorstatelist;
        mTintMode = mode;
    }

    private boolean updateTint(int ai[])
    {
        if (mTintStateList != null)
        {
            int i = mTintStateList.getColorForState(ai, mCurrentColor);
            if (i != mCurrentColor)
            {
                if (i != 0)
                {
                    setColorFilter(i, mTintMode);
                } else
                {
                    clearColorFilter();
                }
                mCurrentColor = i;
                return true;
            }
        }
        return false;
    }

    public boolean isStateful()
    {
        return mTintStateList != null && mTintStateList.isStateful() || super.isStateful();
    }

    public boolean setState(int ai[])
    {
        boolean flag = super.setState(ai);
        return updateTint(ai) || flag;
    }
}
