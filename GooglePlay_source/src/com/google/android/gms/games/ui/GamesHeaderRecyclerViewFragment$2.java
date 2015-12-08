// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.support.v7.widget.GridLayoutManager;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, GamesRecyclerAdapter

final class val.finalAdapter
    implements geListener
{

    final GamesHeaderRecyclerViewFragment this$0;
    final GamesRecyclerAdapter val$finalAdapter;
    final GridLayoutManager val$layoutManager;

    public final void onSpanCountChanged()
    {
        val$layoutManager.setSpanCount(val$finalAdapter.getSpanCount());
    }

    geListener()
    {
        this$0 = final_gamesheaderrecyclerviewfragment;
        val$layoutManager = gridlayoutmanager;
        val$finalAdapter = GamesRecyclerAdapter.this;
        super();
    }
}
