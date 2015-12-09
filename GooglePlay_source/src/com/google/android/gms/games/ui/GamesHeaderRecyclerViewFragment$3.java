// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;


// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, GamesRecyclerAdapter

final class val.gamesAdapter
    implements Runnable
{

    final GamesHeaderRecyclerViewFragment this$0;
    final GamesRecyclerAdapter val$gamesAdapter;

    public final void run()
    {
        val$gamesAdapter.setWaitingOnRecyclerView(false);
    }

    ()
    {
        this$0 = final_gamesheaderrecyclerviewfragment;
        val$gamesAdapter = GamesRecyclerAdapter.this;
        super();
    }
}
