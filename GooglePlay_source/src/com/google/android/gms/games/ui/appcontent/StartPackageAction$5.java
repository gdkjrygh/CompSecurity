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

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;
    final String val$accountName;
    final String val$gameId;
    final String val$playerId;
    final String val$snapshotId;

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        final Game game = (Game)gamefirstparty.getGame().freeze();
        gamefirstparty = gamefirstparty.getSnapshot();
        if (gamefirstparty != null && gamefirstparty.getSnapshotId().equals(val$snapshotId))
        {
            UiUtils.launchGameForSnapshot(mContext, val$accountName, game, gamefirstparty);
            return;
        } else
        {
            gamefirstparty = mFragment;
            gamefirstparty.startNewLoader(new apshotLoader(gamefirstparty, val$gameId, val$playerId, val$snapshotId, new AppContentFragment.SnapshotLoadedCallback() {

                final StartPackageAction._cls5 this$1;
                final Game val$game;

                public final void onSnapshotLoaded(SnapshotMetadata snapshotmetadata)
                {
                    UiUtils.launchGameForSnapshot(mContext, accountName, game, snapshotmetadata);
                }

            
            {
                this$1 = StartPackageAction._cls5.this;
                game = game1;
                super();
            }
            }));
            return;
        }
    }

    apshotLoadedCallback()
    {
        this$0 = final_startpackageaction;
        val$snapshotId = s;
        val$accountName = s1;
        val$gameId = s2;
        val$playerId = String.this;
        super();
    }
}
