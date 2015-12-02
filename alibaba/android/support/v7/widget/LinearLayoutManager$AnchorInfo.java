// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, OrientationHelper

class this._cls0
{

    int mCoordinate;
    boolean mLayoutFromEnd;
    int mPosition;
    final LinearLayoutManager this$0;

    void assignCoordinateFromPadding()
    {
        int i;
        if (mLayoutFromEnd)
        {
            i = mOrientationHelper.getEndAfterPadding();
        } else
        {
            i = mOrientationHelper.getStartAfterPadding();
        }
        mCoordinate = i;
    }

    public void assignFromView(View view)
    {
        if (mLayoutFromEnd)
        {
            mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
        } else
        {
            mCoordinate = mOrientationHelper.getDecoratedStart(view);
        }
        mPosition = getPosition(view);
    }

    public boolean assignFromViewIfValid(View view,  )
    {
         1 = ()view.getLayoutParams();
        if (!1.mRemoved() && 1.ewPosition() >= 0 && 1.ewPosition() < .())
        {
            assignFromView(view);
            return true;
        } else
        {
            return false;
        }
    }

    void reset()
    {
        mPosition = -1;
        mCoordinate = 0x80000000;
        mLayoutFromEnd = false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AnchorInfo{mPosition=").append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append('}').toString();
    }

    ()
    {
        this$0 = LinearLayoutManager.this;
        super();
    }
}
