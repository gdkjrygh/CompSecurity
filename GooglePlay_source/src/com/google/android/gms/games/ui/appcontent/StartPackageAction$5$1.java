// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction, AppContentFragment

final class shotLoadedCallback extends shotLoadedCallback
{

    final val.game this$1;
    final Game val$game;

    public final void onSnapshotLoaded(SnapshotMetadata snapshotmetadata)
    {
        UiUtils.launchGameForSnapshot(mContext, accountName, val$game, snapshotmetadata);
    }

    LoadedCallback()
    {
        this$1 = final_loadedcallback;
        val$game = Game.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/appcontent/StartPackageAction$5

/* anonymous class */
    final class StartPackageAction._cls5 extends AppContentFragment.GameLoadedCallback
    {

        final StartPackageAction this$0;
        final String val$accountName;
        final String val$gameId;
        final String val$playerId;
        final String val$snapshotId;

        public final void onGameLoaded(GameFirstParty gamefirstparty)
        {
            Game game1 = (Game)gamefirstparty.getGame().freeze();
            gamefirstparty = gamefirstparty.getSnapshot();
            if (gamefirstparty != null && gamefirstparty.getSnapshotId().equals(snapshotId))
            {
                UiUtils.launchGameForSnapshot(mContext, accountName, game1, gamefirstparty);
                return;
            } else
            {
                gamefirstparty = mFragment;
                gamefirstparty.startNewLoader(new AppContentFragment.SnapshotLoader(gamefirstparty, gameId, playerId, snapshotId, game1. new StartPackageAction._cls5._cls1()));
                return;
            }
        }

            
            {
                this$0 = final_startpackageaction;
                snapshotId = s;
                accountName = s1;
                gameId = s2;
                playerId = String.this;
                super();
            }
    }

}
