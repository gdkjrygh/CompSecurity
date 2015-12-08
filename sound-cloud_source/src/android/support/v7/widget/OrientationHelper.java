// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

public abstract class OrientationHelper
{

    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = 0x80000000;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    protected final RecyclerView.LayoutManager mLayoutManager;

    private OrientationHelper(RecyclerView.LayoutManager layoutmanager)
    {
        mLastTotalSpace = 0x80000000;
        mLayoutManager = layoutmanager;
    }

    OrientationHelper(RecyclerView.LayoutManager layoutmanager, _cls1 _pcls1)
    {
        this(layoutmanager);
    }

    public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
    {
        return new _cls1(layoutmanager);
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutmanager, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return createHorizontalHelper(layoutmanager);

        case 1: // '\001'
            return createVerticalHelper(layoutmanager);
        }
    }

    public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutmanager)
    {
        return new _cls2(layoutmanager);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange()
    {
        if (0x80000000 == mLastTotalSpace)
        {
            return 0;
        } else
        {
            return getTotalSpace() - mLastTotalSpace;
        }
    }

    public abstract void offsetChild(View view, int i);

    public abstract void offsetChildren(int i);

    public void onLayoutComplete()
    {
        mLastTotalSpace = getTotalSpace();
    }

    private class _cls1 extends OrientationHelper
    {

        public final int getDecoratedEnd(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedRight(view);
            return layoutparams.rightMargin + i;
        }

        public final int getDecoratedMeasurement(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedMeasuredWidth(view);
            int j = layoutparams.leftMargin;
            return layoutparams.rightMargin + (i + j);
        }

        public final int getDecoratedMeasurementInOther(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedMeasuredHeight(view);
            int j = layoutparams.topMargin;
            return layoutparams.bottomMargin + (i + j);
        }

        public final int getDecoratedStart(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return mLayoutManager.getDecoratedLeft(view) - layoutparams.leftMargin;
        }

        public final int getEnd()
        {
            return mLayoutManager.getWidth();
        }

        public final int getEndAfterPadding()
        {
            return mLayoutManager.getWidth() - mLayoutManager.getPaddingRight();
        }

        public final int getEndPadding()
        {
            return mLayoutManager.getPaddingRight();
        }

        public final int getStartAfterPadding()
        {
            return mLayoutManager.getPaddingLeft();
        }

        public final int getTotalSpace()
        {
            return mLayoutManager.getWidth() - mLayoutManager.getPaddingLeft() - mLayoutManager.getPaddingRight();
        }

        public final void offsetChild(View view, int i)
        {
            view.offsetLeftAndRight(i);
        }

        public final void offsetChildren(int i)
        {
            mLayoutManager.offsetChildrenHorizontal(i);
        }

        _cls1(RecyclerView.LayoutManager layoutmanager)
        {
            super(layoutmanager, null);
        }
    }


    private class _cls2 extends OrientationHelper
    {

        public final int getDecoratedEnd(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedBottom(view);
            return layoutparams.bottomMargin + i;
        }

        public final int getDecoratedMeasurement(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedMeasuredHeight(view);
            int j = layoutparams.topMargin;
            return layoutparams.bottomMargin + (i + j);
        }

        public final int getDecoratedMeasurementInOther(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i = mLayoutManager.getDecoratedMeasuredWidth(view);
            int j = layoutparams.leftMargin;
            return layoutparams.rightMargin + (i + j);
        }

        public final int getDecoratedStart(View view)
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return mLayoutManager.getDecoratedTop(view) - layoutparams.topMargin;
        }

        public final int getEnd()
        {
            return mLayoutManager.getHeight();
        }

        public final int getEndAfterPadding()
        {
            return mLayoutManager.getHeight() - mLayoutManager.getPaddingBottom();
        }

        public final int getEndPadding()
        {
            return mLayoutManager.getPaddingBottom();
        }

        public final int getStartAfterPadding()
        {
            return mLayoutManager.getPaddingTop();
        }

        public final int getTotalSpace()
        {
            return mLayoutManager.getHeight() - mLayoutManager.getPaddingTop() - mLayoutManager.getPaddingBottom();
        }

        public final void offsetChild(View view, int i)
        {
            view.offsetTopAndBottom(i);
        }

        public final void offsetChildren(int i)
        {
            mLayoutManager.offsetChildrenVertical(i);
        }

        _cls2(RecyclerView.LayoutManager layoutmanager)
        {
            super(layoutmanager, null);
        }
    }

}
