// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, OrientationHelper

class <init>
{

    boolean mInvalidateOffsets;
    boolean mLayoutFromEnd;
    int mOffset;
    int mPosition;
    final StaggeredGridLayoutManager this$0;

    void assignCoordinateFromPadding()
    {
        int i;
        if (mLayoutFromEnd)
        {
            i = mPrimaryOrientation.getEndAfterPadding();
        } else
        {
            i = mPrimaryOrientation.getStartAfterPadding();
        }
        mOffset = i;
    }

    void assignCoordinateFromPadding(int i)
    {
        if (mLayoutFromEnd)
        {
            mOffset = mPrimaryOrientation.getEndAfterPadding() - i;
            return;
        } else
        {
            mOffset = mPrimaryOrientation.getStartAfterPadding() + i;
            return;
        }
    }

    void reset()
    {
        mPosition = -1;
        mOffset = 0x80000000;
        mLayoutFromEnd = false;
        mInvalidateOffsets = false;
    }

    private ()
    {
        this$0 = StaggeredGridLayoutManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
