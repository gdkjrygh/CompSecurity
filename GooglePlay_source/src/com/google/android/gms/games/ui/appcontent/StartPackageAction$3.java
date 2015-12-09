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

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;
    final String val$accountName;
    final String val$gameId;
    final String val$playerId;
    final String val$questId;

    public final void onGameLoaded(final GameFirstParty game)
    {
        game = (Game)game.getGame().freeze();
        AppContentFragment appcontentfragment = mFragment;
        appcontentfragment.startNewLoader(new estLoader(appcontentfragment, val$gameId, val$playerId, val$questId, new AppContentFragment.QuestLoadedCallback() {

            final StartPackageAction._cls3 this$1;
            final Game val$game;

            public final void onQuestLoaded(Quest quest)
            {
                UiUtils.launchGameForQuest(mContext, accountName, game, quest);
            }

            
            {
                this$1 = StartPackageAction._cls3.this;
                game = game1;
                super();
            }
        }));
    }

    estLoadedCallback()
    {
        this$0 = final_startpackageaction;
        val$gameId = s;
        val$playerId = s1;
        val$questId = s2;
        val$accountName = String.this;
        super();
    }
}
