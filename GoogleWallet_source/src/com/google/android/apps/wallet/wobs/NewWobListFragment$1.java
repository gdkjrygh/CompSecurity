// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.widget.AbsListView;
import com.google.android.apps.wallet.wobs.caching.WobsManager;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            NewWobListFragment

final class this._cls0
    implements android.widget.istener
{

    final NewWobListFragment this$0;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (NewWobListFragment.access$000(NewWobListFragment.this) && NewWobListFragment.access$100(NewWobListFragment.this) == stLoadStatus.PARTIALLY_LOADED && j > 0 && i + j == k)
        {
            NewWobListFragment.access$200(NewWobListFragment.this, stLoadStatus.LOADING_TAIL);
            wobsManager.fetchNextPage(NewWobListFragment.access$300(NewWobListFragment.this));
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        NewWobListFragment.access$002(NewWobListFragment.this, true);
    }

    stLoadStatus()
    {
        this$0 = NewWobListFragment.this;
        super();
    }
}
