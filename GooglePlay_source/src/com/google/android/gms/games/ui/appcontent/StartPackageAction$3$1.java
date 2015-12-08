// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction, AppContentFragment

final class tLoadedCallback extends tLoadedCallback
{

    final val.game this$1;
    final Game val$game;

    public final void onQuestLoaded(Quest quest)
    {
        UiUtils.launchGameForQuest(mContext, accountName, val$game, quest);
    }

    LoadedCallback()
    {
        this$1 = final_loadedcallback;
        val$game = Game.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/appcontent/StartPackageAction$3

/* anonymous class */
    final class StartPackageAction._cls3 extends AppContentFragment.GameLoadedCallback
    {

        final StartPackageAction this$0;
        final String val$accountName;
        final String val$gameId;
        final String val$playerId;
        final String val$questId;

        public final void onGameLoaded(GameFirstParty gamefirstparty)
        {
            gamefirstparty = (Game)gamefirstparty.getGame().freeze();
            AppContentFragment appcontentfragment = mFragment;
            appcontentfragment.startNewLoader(new AppContentFragment.QuestLoader(appcontentfragment, gameId, playerId, questId, gamefirstparty. new StartPackageAction._cls3._cls1()));
        }

            
            {
                this$0 = final_startpackageaction;
                gameId = s;
                playerId = s1;
                questId = s2;
                accountName = String.this;
                super();
            }
    }

}
