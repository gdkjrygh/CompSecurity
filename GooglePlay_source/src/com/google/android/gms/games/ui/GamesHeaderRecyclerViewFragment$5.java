// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, ImageAwareAdapter

final class this._cls0 extends android.support.v7.widget.ent._cls5
{

    final GamesHeaderRecyclerViewFragment this$0;

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        GamesHeaderRecyclerViewFragment.access$000$3617885b();
        if (mRecyclerView != null)
        {
            recyclerview = mRecyclerView.mAdapter;
            if (recyclerview instanceof ImageAwareAdapter)
            {
                if (!GamesHeaderRecyclerViewFragment.access$100(GamesHeaderRecyclerViewFragment.this) && i == 2)
                {
                    GamesHeaderRecyclerViewFragment.access$102(GamesHeaderRecyclerViewFragment.this, true);
                    ((ImageAwareAdapter)recyclerview).onFlingBegin();
                } else
                if (GamesHeaderRecyclerViewFragment.access$100(GamesHeaderRecyclerViewFragment.this) && i != 2)
                {
                    GamesHeaderRecyclerViewFragment.access$102(GamesHeaderRecyclerViewFragment.this, false);
                    ((ImageAwareAdapter)recyclerview).onFlingEnd();
                    return;
                }
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        GamesHeaderRecyclerViewFragment.access$000$3617885b();
    }

    ()
    {
        this$0 = GamesHeaderRecyclerViewFragment.this;
        super();
    }
}
