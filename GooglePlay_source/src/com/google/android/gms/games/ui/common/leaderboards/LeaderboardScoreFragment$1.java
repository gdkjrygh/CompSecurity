// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardScoreFragment

final class this._cls0
    implements com.google.android.gms.games.ui.card.ventListener
{

    final LeaderboardScoreFragment this$0;

    public final void onGotItClicked(String s)
    {
        LeaderboardScoreFragment.access$000(LeaderboardScoreFragment.this).launchPlusUpgradeFlow(8, null);
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    ()
    {
        this$0 = LeaderboardScoreFragment.this;
        super();
    }
}
