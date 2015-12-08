// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package com.tinder.views:
//            DirectionOnScrollListener

public static class mListView
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

    public (AbsListView abslistview)
    {
        mListView = abslistview;
    }
}
