// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction, AppContentFragment

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;
    final String val$accountName;
    final String val$matchId;

    public final void onGameLoaded(final GameFirstParty game)
    {
        game = (Game)game.getGame().freeze();
        AppContentFragment appcontentfragment = mFragment;
        appcontentfragment.startNewLoader(new tchLoader(appcontentfragment, val$matchId, new AppContentFragment.MatchLoadedCallback() {

            final StartPackageAction._cls6 this$1;
            final Game val$game;

            public final void onMatchLoaded(TurnBasedMatch turnbasedmatch)
            {
                UiUtils.launchGameForTurnBasedMatch(mContext, accountName, game, turnbasedmatch);
            }

            
            {
                this$1 = StartPackageAction._cls6.this;
                game = game1;
                super();
            }
        }));
    }

    tchLoadedCallback()
    {
        this$0 = final_startpackageaction;
        val$matchId = s;
        val$accountName = String.this;
        super();
    }
}
