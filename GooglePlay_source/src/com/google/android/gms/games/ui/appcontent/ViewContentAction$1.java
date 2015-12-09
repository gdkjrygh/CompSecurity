// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ViewContentAction

final class ameLoadedCallback extends ameLoadedCallback
{

    final ViewContentAction this$0;
    final GamesFragmentActivity val$activity;
    final String val$appId;
    final SharedElementTransition val$finalTransition;
    final String val$leaderboardId;
    final String val$themeColor;

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        String s = gamefirstparty.getGame().getInstancePackageName();
        gamefirstparty = gamefirstparty.getGame().getDisplayName();
        PowerUpUtils.viewLeaderboard(val$activity, val$appId, gamefirstparty, s, val$leaderboardId, val$themeColor, val$finalTransition);
    }

    ion()
    {
        this$0 = final_viewcontentaction;
        val$activity = gamesfragmentactivity;
        val$appId = s;
        val$leaderboardId = s1;
        val$themeColor = s2;
        val$finalTransition = SharedElementTransition.this;
        super();
    }
}
