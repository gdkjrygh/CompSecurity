// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.database.ContentObserver;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, GamesFragmentActivity

final class this._cls0 extends ContentObserver
{

    final GamesHeaderRecyclerViewFragment this$0;

    public final void onChange(boolean flag)
    {
        mParent.runOnUiThread(new Runnable() {

            final GamesHeaderRecyclerViewFragment._cls6 this$1;

            public final void run()
            {
                onPlayersChanged();
            }

            
            {
                this$1 = GamesHeaderRecyclerViewFragment._cls6.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = GamesHeaderRecyclerViewFragment.this;
        super(null);
    }
}
