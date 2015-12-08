// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.view.View;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;

public final class LeaderboardAdapter extends OnyxCardAdapter
{
    public static interface LeaderboardEventListener
    {

        public abstract void onLeaderboardClicked(Leaderboard leaderboard);
    }

    private static final class LeaderboardViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final void onRootViewClicked()
        {
            ((LeaderboardAdapter)mAdapter).mListener.onLeaderboardClicked((Leaderboard)getData());
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (Leaderboard)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (LeaderboardAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1055, obj);
            setImage(((Leaderboard) (obj)).getIconImageUri(), 0x7f020149);
            gamesrecycleradapter = getTitleViewBuffer();
            ((Leaderboard) (obj)).getDisplayName(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            setRootViewContentDescription(((Leaderboard) (obj)).getDisplayName());
        }

        public LeaderboardViewHolder(View view)
        {
            super(view);
        }
    }


    private final LeaderboardEventListener mListener;

    public LeaderboardAdapter(Context context, LeaderboardEventListener leaderboardeventlistener)
    {
        super(context);
        mListener = leaderboardeventlistener;
    }

    protected final int getCardType()
    {
        return 2;
    }

    protected final int getDataType()
    {
        return 0x7f0d0039;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new LeaderboardViewHolder(view);
    }


}
