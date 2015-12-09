// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;

public final class LastPlayedGameAdapter extends OnyxCardAdapter
{
    public static interface LastPlayedGameEventListener
    {

        public abstract void onLastPlayedGameClicked(MostRecentGameInfo mostrecentgameinfo);
    }

    private static final class LastPlayedGameViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final void onRootViewClicked()
        {
            ((LastPlayedGameAdapter)mAdapter).mListener.onLastPlayedGameClicked((MostRecentGameInfo)getData());
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (MostRecentGameInfo)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (LastPlayedGameAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1058, obj);
            gamesrecycleradapter = mContext.getResources();
            setImage(((MostRecentGameInfo) (obj)).getGameFeaturedImageUri(), 0x7f0201e0);
            setImageAspectRatio(2.048F);
            setTitle(((MostRecentGameInfo) (obj)).getGameName());
            setSubtitle(0x7f100120);
            setPrimaryLabel(DateUtils.formatDateTime(mContext, ((MostRecentGameInfo) (obj)).getActivityTimestampMillis(), 0x80000));
            setRootViewContentDescription(gamesrecycleradapter.getString(0x7f10011c, new Object[] {
                ((MostRecentGameInfo) (obj)).getGameName()
            }));
        }

        public LastPlayedGameViewHolder(View view)
        {
            super(view);
        }
    }


    private final LastPlayedGameEventListener mListener;

    public LastPlayedGameAdapter(Context context, LastPlayedGameEventListener lastplayedgameeventlistener)
    {
        super(context);
        mListener = (LastPlayedGameEventListener)Preconditions.checkNotNull(lastplayedgameeventlistener);
    }

    protected final int getCardType()
    {
        return 4;
    }

    protected final int getDataType()
    {
        return 0x7f0d0038;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e0020);
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new LastPlayedGameViewHolder(view);
    }


}
