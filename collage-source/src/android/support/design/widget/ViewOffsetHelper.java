// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

class ViewOffsetHelper
{

    private int mLayoutLeft;
    private int mLayoutTop;
    private int mOffsetLeft;
    private int mOffsetTop;
    private final View mView;

    public ViewOffsetHelper(View view)
    {
        mView = view;
    }

    private static void tickleInvalidationFlag(View view)
    {
        float f = ViewCompat.getTranslationX(view);
        ViewCompat.setTranslationY(view, 1.0F + f);
        ViewCompat.setTranslationY(view, f);
    }

    private void updateOffsets()
    {
        ViewCompat.offsetTopAndBottom(mView, mOffsetTop - (mView.getTop() - mLayoutTop));
        ViewCompat.offsetLeftAndRight(mView, mOffsetLeft - (mView.getLeft() - mLayoutLeft));
        if (android.os.Build.VERSION.SDK_INT < 23)
        {
            tickleInvalidationFlag(mView);
            android.view.ViewParent viewparent = mView.getParent();
            if (viewparent instanceof View)
            {
                tickleInvalidationFlag((View)viewparent);
            }
        }
    }

    public int getLeftAndRightOffset()
    {
        return mOffsetLeft;
    }

    public int getTopAndBottomOffset()
    {
        return mOffsetTop;
    }

    public void onViewLayout()
    {
        mLayoutTop = mView.getTop();
        mLayoutLeft = mView.getLeft();
        updateOffsets();
    }

    public boolean setLeftAndRightOffset(int i)
    {
        if (mOffsetLeft != i)
        {
            mOffsetLeft = i;
            updateOffsets();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setTopAndBottomOffset(int i)
    {
        if (mOffsetTop != i)
        {
            mOffsetTop = i;
            updateOffsets();
            return true;
        } else
        {
            return false;
        }
    }
}
