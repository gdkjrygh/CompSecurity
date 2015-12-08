// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

class LayoutState
{

    int mAvailable;
    int mCurrentPosition;
    int mExtra;
    int mItemDirection;
    int mLayoutDirection;

    LayoutState()
    {
        mExtra = 0;
    }

    boolean hasMore(RecyclerView.State state)
    {
        return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
    }

    View next(RecyclerView.Recycler recycler)
    {
        recycler = recycler.getViewForPosition(mCurrentPosition);
        mCurrentPosition = mCurrentPosition + mItemDirection;
        return recycler;
    }
}
