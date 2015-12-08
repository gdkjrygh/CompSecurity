// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.database.ContentObserver;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, GamesFragmentActivity

final class this._cls1
    implements Runnable
{

    final ayersChanged this$1;

    public final void run()
    {
        onPlayersChanged();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/GamesHeaderRecyclerViewFragment$6

/* anonymous class */
    final class GamesHeaderRecyclerViewFragment._cls6 extends ContentObserver
    {

        final GamesHeaderRecyclerViewFragment this$0;

        public final void onChange(boolean flag)
        {
            mParent.runOnUiThread(new GamesHeaderRecyclerViewFragment._cls6._cls1());
        }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                super(null);
            }
    }

}
