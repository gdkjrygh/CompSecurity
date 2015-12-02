// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper

static final class anager extends OrientationHelper
{

    public int getDecoratedEnd(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedBottom(view);
        return arams.bottomMargin + i;
    }

    public int getDecoratedMeasurement(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedMeasuredHeight(view);
        int j = arams.topMargin;
        return arams.bottomMargin + (i + j);
    }

    public int getDecoratedMeasurementInOther(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        int i = mLayoutManager.getDecoratedMeasuredWidth(view);
        int j = arams.leftMargin;
        return arams.rightMargin + (i + j);
    }

    public int getDecoratedStart(View view)
    {
        arams arams = (arams)view.getLayoutParams();
        return mLayoutManager.getDecoratedTop(view) - arams.topMargin;
    }

    public int getEnd()
    {
        return mLayoutManager.getHeight();
    }

    public int getEndAfterPadding()
    {
        return mLayoutManager.getHeight() - mLayoutManager.getPaddingBottom();
    }

    public int getEndPadding()
    {
        return mLayoutManager.getPaddingBottom();
    }

    public int getStartAfterPadding()
    {
        return mLayoutManager.getPaddingTop();
    }

    public int getTotalSpace()
    {
        return mLayoutManager.getHeight() - mLayoutManager.getPaddingTop() - mLayoutManager.getPaddingBottom();
    }

    public void offsetChild(View view, int i)
    {
        view.offsetTopAndBottom(i);
    }

    public void offsetChildren(int i)
    {
        mLayoutManager.offsetChildrenVertical(i);
    }

    anager(anager anager)
    {
        super(anager, null);
    }
}
