// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction, AppContentFragment

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;
    final String val$accountName;
    final String val$gameId;
    final String val$playerId;
    final Set val$requestIds;

    public final void onGameLoaded(final GameFirstParty game)
    {
        game = (Game)game.getGame().freeze();
        AppContentFragment appcontentfragment = mFragment;
        appcontentfragment.startNewLoader(new questLoader(appcontentfragment, val$gameId, val$playerId, val$requestIds, new AppContentFragment.RequestsLoadedCallback() {

            final StartPackageAction._cls4 this$1;
            final Game val$game;

            public final void onRequestsLoaded(ArrayList arraylist)
            {
                UiUtils.launchGameForRequest(mContext, accountName, game, arraylist);
            }

            
            {
                this$1 = StartPackageAction._cls4.this;
                game = game1;
                super();
            }
        }));
    }

    questsLoadedCallback()
    {
        this$0 = final_startpackageaction;
        val$gameId = s;
        val$playerId = s1;
        val$requestIds = set;
        val$accountName = String.this;
        super();
    }
}
