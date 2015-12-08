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

final class tationLoadedCallback extends tationLoadedCallback
{

    final val.game this$1;
    final Game val$game;

    public final void onInvitationLoaded(Invitation invitation)
    {
        UiUtils.launchGameForInvitation(mContext, accountName, val$game, invitation);
    }

    LoadedCallback()
    {
        this$1 = final_loadedcallback;
        val$game = Game.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/appcontent/StartPackageAction$2

/* anonymous class */
    final class StartPackageAction._cls2 extends AppContentFragment.GameLoadedCallback
    {

        final StartPackageAction this$0;
        final String val$accountName;
        final String val$invitationId;

        public final void onGameLoaded(GameFirstParty gamefirstparty)
        {
            gamefirstparty = (Game)gamefirstparty.getGame().freeze();
            AppContentFragment appcontentfragment = mFragment;
            appcontentfragment.startNewLoader(new AppContentFragment.InvitationLoader(appcontentfragment, invitationId, gamefirstparty. new StartPackageAction._cls2._cls1()));
        }

            
            {
                this$0 = final_startpackageaction;
                invitationId = s;
                accountName = String.this;
                super();
            }
    }

}
