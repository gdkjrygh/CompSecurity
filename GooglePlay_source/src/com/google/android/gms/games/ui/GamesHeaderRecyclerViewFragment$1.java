// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment

final class this._cls0
    implements Runnable
{

    final GamesHeaderRecyclerViewFragment this$0;

    public final void run()
    {
        if (mRecyclerView != null)
        {
            mRecyclerView.focusableViewAvailable(mRecyclerView);
        }
    }

    ()
    {
        this$0 = GamesHeaderRecyclerViewFragment.this;
        super();
    }
}
