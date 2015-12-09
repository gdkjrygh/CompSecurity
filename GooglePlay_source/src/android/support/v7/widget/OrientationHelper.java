// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

public abstract class OrientationHelper
{

    int mLastTotalSpace;
    protected final RecyclerView.LayoutManager mLayoutManager;

    private OrientationHelper(RecyclerView.LayoutManager layoutmanager)
    {
        mLastTotalSpace = 0x80000000;
        mLayoutManager = layoutmanager;
    }

    OrientationHelper(RecyclerView.LayoutManager layoutmanager, byte byte0)
    {
        this(layoutmanager);
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutmanager, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return new OrientationHelper(layoutmanager) {

                public final int getDecoratedEnd(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedRight(view) + layoutparams.rightMargin;
                }

                public final int getDecoratedMeasurement(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedMeasuredWidth(view) + layoutparams.leftMargin + layoutparams.rightMargin;
                }

                public final int getDecoratedMeasurementInOther(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedMeasuredHeight(view) + layoutparams.topMargin + layoutparams.bottomMargin;
                }

                public final int getDecoratedStart(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedLeft(view) - layoutparams.leftMargin;
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

                public final void offsetChildren(int j)
                {
                    mLayoutManager.offsetChildrenHorizontal(j);
                }

            };

        case 1: // '\001'
            return new OrientationHelper(layoutmanager) {

                public final int getDecoratedEnd(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedBottom(view) + layoutparams.bottomMargin;
                }

                public final int getDecoratedMeasurement(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedMeasuredHeight(view) + layoutparams.topMargin + layoutparams.bottomMargin;
                }

                public final int getDecoratedMeasurementInOther(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedMeasuredWidth(view) + layoutparams.leftMargin + layoutparams.rightMargin;
                }

                public final int getDecoratedStart(View view)
                {
                    RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    return RecyclerView.LayoutManager.getDecoratedTop(view) - layoutparams.topMargin;
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

                public final void offsetChildren(int j)
                {
                    mLayoutManager.offsetChildrenVertical(j);
                }

            };
        }
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

    public final int getTotalSpaceChange()
    {
        if (0x80000000 == mLastTotalSpace)
        {
            return 0;
        } else
        {
            return getTotalSpace() - mLastTotalSpace;
        }
    }

    public abstract void offsetChildren(int i);
}
