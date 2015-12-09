// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui:
//            LoadingStateAdapter, GamesRecyclerAdapter

private static final class der extends der
{

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        super.populateViews(gamesrecycleradapter, i);
        gamesrecycleradapter = (LoadingStateAdapter)mAdapter;
        if (LoadingStateAdapter.access$000(gamesrecycleradapter) != -1)
        {
            i = LoadingStateAdapter.access$000(gamesrecycleradapter);
        } else
        {
            i = itemView.getPaddingTop();
        }
        itemView.setPadding(itemView.getPaddingLeft(), i, itemView.getPaddingRight(), itemView.getPaddingBottom());
    }

    public der(View view)
    {
        super(view);
    }
}
