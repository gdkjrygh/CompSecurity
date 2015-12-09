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

final class hLoadedCallback extends hLoadedCallback
{

    final val.game this$1;
    final Game val$game;

    public final void onMatchLoaded(TurnBasedMatch turnbasedmatch)
    {
        UiUtils.launchGameForTurnBasedMatch(mContext, accountName, val$game, turnbasedmatch);
    }

    LoadedCallback()
    {
        this$1 = final_loadedcallback;
        val$game = Game.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/appcontent/StartPackageAction$6

/* anonymous class */
    final class StartPackageAction._cls6 extends AppContentFragment.GameLoadedCallback
    {

        final StartPackageAction this$0;
        final String val$accountName;
        final String val$matchId;

        public final void onGameLoaded(GameFirstParty gamefirstparty)
        {
            gamefirstparty = (Game)gamefirstparty.getGame().freeze();
            AppContentFragment appcontentfragment = mFragment;
            appcontentfragment.startNewLoader(new AppContentFragment.MatchLoader(appcontentfragment, matchId, gamefirstparty. new StartPackageAction._cls6._cls1()));
        }

            
            {
                this$0 = final_startpackageaction;
                matchId = s;
                accountName = String.this;
                super();
            }
    }

}
