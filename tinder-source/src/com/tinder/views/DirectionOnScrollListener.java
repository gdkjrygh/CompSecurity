// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView;

public class DirectionOnScrollListener
    implements android.widget.AbsListView.OnScrollListener
{
    public static class ListViewScrollTracker
    {

        private AbsListView mListView;
        private SparseArray mPositions;

        public int calculateIncrementalOffset(int i, int j)
        {
            SparseArray sparsearray = mPositions;
            mPositions = new SparseArray();
            for (int k = 0; k < j; k++)
            {
                mPositions.put(i + k, Integer.valueOf(mListView.getChildAt(k).getTop()));
            }

            if (sparsearray != null)
            {
                for (i = 0; i < sparsearray.size(); i++)
                {
                    j = sparsearray.keyAt(i);
                    int l = ((Integer)sparsearray.get(j)).intValue();
                    Integer integer = (Integer)mPositions.get(j);
                    if (integer != null)
                    {
                        return integer.intValue() - l;
                    }
                }

            }
            return 11;
        }

        public void clear()
        {
            mPositions = null;
        }

        public ListViewScrollTracker(AbsListView abslistview)
        {
            mListView = abslistview;
        }
    }

    public static interface ListenerScrollDirection
    {

        public abstract void onLastItemShown();

        public abstract void onScrollDown();

        public abstract void onScrollUp();

        public abstract void onTopItemScrolled(float f);
    }


    private static final int MIN_SCROLL_DELTA = 10;
    private boolean mIsScrollingUp;
    private AbsListView mListView;
    private ListenerScrollDirection mListenerScrollDirection;
    private ListViewScrollTracker mScrollTracker;

    public DirectionOnScrollListener(AbsListView abslistview, ListenerScrollDirection listenerscrolldirection)
    {
        mListView = abslistview;
        mScrollTracker = new ListViewScrollTracker(abslistview);
        mListenerScrollDirection = listenerscrolldirection;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int l = mScrollTracker.calculateIncrementalOffset(i, j);
        if (Math.abs(l) > 10)
        {
            boolean flag;
            if (l > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != mIsScrollingUp)
            {
                mIsScrollingUp = flag;
                float f;
                if (mIsScrollingUp)
                {
                    mListenerScrollDirection.onScrollUp();
                } else
                {
                    mListenerScrollDirection.onScrollDown();
                }
            }
        }
        if (mListView.getId() == abslistview.getId())
        {
            if (mListView.getChildCount() > 0)
            {
                if (i == 0)
                {
                    f = Math.abs(mListView.getChildAt(0).getY() / (float)mListView.getChildAt(0).getHeight());
                    mListenerScrollDirection.onTopItemScrolled(f);
                } else
                {
                    mListenerScrollDirection.onTopItemScrolled(1.0F);
                }
            }
            if (i + j == k)
            {
                mListenerScrollDirection.onLastItemShown();
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
