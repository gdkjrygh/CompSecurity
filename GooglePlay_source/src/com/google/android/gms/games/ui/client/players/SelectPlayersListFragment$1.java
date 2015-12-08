// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;


// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersListFragment, SelectPlayersAdapter

final class this._cls0
    implements Runnable
{

    final SelectPlayersListFragment this$0;

    public final void run()
    {
        SelectPlayersListFragment.access$000(SelectPlayersListFragment.this).mFocusLockedViewPlayerId = null;
    }

    ()
    {
        this$0 = SelectPlayersListFragment.this;
        super();
    }
}
