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

    private boolean isViewValidAsAnchor(View view, this._cls0 _pcls0)
    {
        view = (this._cls0)view.getLayoutParams();
        return !view.mRemoved() && view.ewLayoutPosition() >= 0 && view.ewLayoutPosition() < _pcls0.();
    }

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

    public void assignFromViewAndKeepVisibleRect(View view)
    {
        int k = mOrientationHelper.getTotalSpaceChange();
        if (k < 0) goto _L2; else goto _L1
_L1:
        assignFromView(view);
_L4:
        return;
_L2:
        mPosition = getPosition(view);
        if (!mLayoutFromEnd)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = mOrientationHelper.getEndAfterPadding() - k - mOrientationHelper.getDecoratedEnd(view);
        mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
        if (i > 0)
        {
            k = mOrientationHelper.getDecoratedMeasurement(view);
            int l = mCoordinate;
            int k1 = mOrientationHelper.getStartAfterPadding();
            k = l - k - (k1 + Math.min(mOrientationHelper.getDecoratedStart(view) - k1, 0));
            if (k < 0)
            {
                int i1 = mCoordinate;
                mCoordinate = Math.min(i, -k) + i1;
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j1 = mOrientationHelper.getDecoratedStart(view);
        int j = j1 - mOrientationHelper.getStartAfterPadding();
        mCoordinate = j1;
        if (j > 0)
        {
            int l1 = mOrientationHelper.getDecoratedMeasurement(view);
            int i2 = mOrientationHelper.getEndAfterPadding();
            int j2 = mOrientationHelper.getDecoratedEnd(view);
            k = mOrientationHelper.getEndAfterPadding() - Math.min(0, i2 - k - j2) - (j1 + l1);
            if (k < 0)
            {
                mCoordinate = mCoordinate - Math.min(j, -k);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void reset()
    {
        mPosition = -1;
        mCoordinate = 0x80000000;
        mLayoutFromEnd = false;
    }

    public String toString()
    {
        return (new StringBuilder("AnchorInfo{mPosition=")).append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append('}').toString();
    }


    ()
    {
        this$0 = LinearLayoutManager.this;
        super();
    }
}
