// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat

final class 
{

    private final SparseArray mScrapHeap;
    final AbsSpinnerCompat this$0;

    final void clear()
    {
        SparseArray sparsearray = mScrapHeap;
        int j = sparsearray.size();
        for (int i = 0; i < j; i++)
        {
            View view = (View)sparsearray.valueAt(i);
            if (view != null)
            {
                AbsSpinnerCompat.access$000$509d225e(AbsSpinnerCompat.this, view);
            }
        }

        sparsearray.clear();
    }

    final View get(int i)
    {
        View view = (View)mScrapHeap.get(i);
        if (view != null)
        {
            mScrapHeap.delete(i);
        }
        return view;
    }

    public final void put(int i, View view)
    {
        mScrapHeap.put(i, view);
    }
}
