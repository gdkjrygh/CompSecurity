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

final class estsLoadedCallback extends estsLoadedCallback
{

    final val.game this$1;
    final Game val$game;

    public final void onRequestsLoaded(ArrayList arraylist)
    {
        UiUtils.launchGameForRequest(mContext, accountName, val$game, arraylist);
    }

    LoadedCallback()
    {
        this$1 = final_loadedcallback;
        val$game = Game.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/appcontent/StartPackageAction$4

/* anonymous class */
    final class StartPackageAction._cls4 extends AppContentFragment.GameLoadedCallback
    {

        final StartPackageAction this$0;
        final String val$accountName;
        final String val$gameId;
        final String val$playerId;
        final Set val$requestIds;

        public final void onGameLoaded(GameFirstParty gamefirstparty)
        {
            gamefirstparty = (Game)gamefirstparty.getGame().freeze();
            AppContentFragment appcontentfragment = mFragment;
            appcontentfragment.startNewLoader(new AppContentFragment.RequestLoader(appcontentfragment, gameId, playerId, requestIds, gamefirstparty. new StartPackageAction._cls4._cls1()));
        }

            
            {
                this$0 = final_startpackageaction;
                gameId = s;
                playerId = s1;
                requestIds = set;
                accountName = String.this;
                super();
            }
    }

}
