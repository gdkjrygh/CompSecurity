// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.skype.android.widget.recycler:
//            OneWayRecyclerView

static final class  extends LinearLayoutManager
{

    public final void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        super.onItemsAdded(recyclerview, i, j);
        if (i == findFirstVisibleItemPosition())
        {
            scrollToPosition(i);
        }
    }

    public final void scrollToPosition(int i)
    {
        scrollToPositionWithOffset(i, 0);
    }

    public final boolean supportsPredictiveItemAnimations()
    {
        return false;
    }

    public (Context context)
    {
        super(context, 1, false);
    }
}
