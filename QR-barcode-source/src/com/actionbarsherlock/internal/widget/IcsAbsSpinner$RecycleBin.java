// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAbsSpinner

class this._cls0
{

    private final SparseArray mScrapHeap = new SparseArray();
    final IcsAbsSpinner this$0;

    void clear()
    {
        SparseArray sparsearray = mScrapHeap;
        int j = sparsearray.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                sparsearray.clear();
                return;
            }
            View view = (View)sparsearray.valueAt(i);
            if (view != null)
            {
                IcsAbsSpinner.access$2(IcsAbsSpinner.this, view, true);
            }
            i++;
        } while (true);
    }

    View get(int i)
    {
        View view = (View)mScrapHeap.get(i);
        if (view != null)
        {
            mScrapHeap.delete(i);
        }
        return view;
    }

    public void put(int i, View view)
    {
        mScrapHeap.put(i, view);
    }

    ()
    {
        this$0 = IcsAbsSpinner.this;
        super();
    }
}
