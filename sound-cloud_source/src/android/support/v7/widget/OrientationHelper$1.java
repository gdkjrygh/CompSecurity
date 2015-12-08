// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper

final class anager extends OrientationHelper
{

    public final int getDecoratedEnd(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedRight(view);
        return arams.rightMargin + i;
    }

    public final int getDecoratedMeasurement(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedMeasuredWidth(view);
        int j = arams.leftMargin;
        return arams.rightMargin + (i + j);
    }

    public final int getDecoratedMeasurementInOther(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedMeasuredHeight(view);
        int j = arams.topMargin;
        return arams.bottomMargin + (i + j);
    }

    public final int getDecoratedStart(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        return mLayoutManager.getDecoratedLeft(view) - arams.leftMargin;
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

    anager(anager anager)
    {
        super(anager, null);
    }
}
