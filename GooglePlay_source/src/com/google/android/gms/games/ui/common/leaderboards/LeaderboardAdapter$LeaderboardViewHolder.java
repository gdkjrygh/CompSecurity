// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.view.View;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardAdapter

private static final class er extends com.google.android.gms.games.ui.card.oardViewHolder
{

    public final void onRootViewClicked()
    {
        LeaderboardAdapter.access$100((LeaderboardAdapter)mAdapter).onLeaderboardClicked((Leaderboard)getData());
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (Leaderboard)obj;
        super.teViews(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (LeaderboardAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, LeaderboardAdapter.access$000(gamesrecycleradapter), 1055, obj);
        setImage(((Leaderboard) (obj)).getIconImageUri(), 0x7f020149);
        gamesrecycleradapter = getTitleViewBuffer();
        ((Leaderboard) (obj)).getDisplayName(gamesrecycleradapter);
        setTitle(gamesrecycleradapter);
        setRootViewContentDescription(((Leaderboard) (obj)).getDisplayName());
    }

    public er(View view)
    {
        super(view);
    }
}
