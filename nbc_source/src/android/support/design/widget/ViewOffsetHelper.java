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

    private void updateOffsets()
    {
        ViewCompat.offsetTopAndBottom(mView, mOffsetTop - (mView.getTop() - mLayoutTop));
        ViewCompat.offsetLeftAndRight(mView, mOffsetLeft - (mView.getLeft() - mLayoutLeft));
        android.view.ViewParent viewparent = mView.getParent();
        if (viewparent instanceof View)
        {
            ((View)viewparent).invalidate();
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
