// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;

// Referenced classes of package android.support.design.widget:
//            CircularBorderDrawable

class CircularBorderDrawableLollipop extends CircularBorderDrawable
{

    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private android.graphics.PorterDuff.Mode mTintMode;

    CircularBorderDrawableLollipop()
    {
        mTintMode = android.graphics.PorterDuff.Mode.SRC_IN;
    }

    private PorterDuffColorFilter updateTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
    {
        if (colorstatelist == null || mode == null)
        {
            return null;
        } else
        {
            return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
        }
    }

    public void draw(Canvas canvas)
    {
        boolean flag;
        if (mTintFilter != null && mPaint.getColorFilter() == null)
        {
            mPaint.setColorFilter(mTintFilter);
            flag = true;
        } else
        {
            flag = false;
        }
        super.draw(canvas);
        if (flag)
        {
            mPaint.setColorFilter(null);
        }
    }

    public void getOutline(Outline outline)
    {
        copyBounds(mRect);
        outline.setOval(mRect);
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        mTint = colorstatelist;
        mTintFilter = updateTintFilter(colorstatelist, mTintMode);
        invalidateSelf();
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        mTintMode = mode;
        mTintFilter = updateTintFilter(mTint, mode);
        invalidateSelf();
    }
}
