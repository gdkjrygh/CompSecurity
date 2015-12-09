// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction, AppContentFragment

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;
    final String val$accountName;
    final String val$invitationId;

    public final void onGameLoaded(final GameFirstParty game)
    {
        game = (Game)game.getGame().freeze();
        AppContentFragment appcontentfragment = mFragment;
        appcontentfragment.startNewLoader(new vitationLoader(appcontentfragment, val$invitationId, new AppContentFragment.InvitationLoadedCallback() {

            final StartPackageAction._cls2 this$1;
            final Game val$game;

            public final void onInvitationLoaded(Invitation invitation)
            {
                UiUtils.launchGameForInvitation(mContext, accountName, game, invitation);
            }

            
            {
                this$1 = StartPackageAction._cls2.this;
                game = game1;
                super();
            }
        }));
    }

    vitationLoadedCallback()
    {
        this$0 = final_startpackageaction;
        val$invitationId = s;
        val$accountName = String.this;
        super();
    }
}
