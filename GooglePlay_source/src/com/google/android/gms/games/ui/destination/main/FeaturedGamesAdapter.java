// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

public final class FeaturedGamesAdapter extends OnyxCardAdapter
{
    public static interface FeaturedGamesEventListener
    {

        public abstract void onFeaturedGamesClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view);
    }

    private static final class FeaturedGamesViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final void onRootViewClicked()
        {
            ((FeaturedGamesAdapter)mAdapter).mListener.onFeaturedGamesClicked((GameFirstParty)getData(), getSharedElementTransition(), itemView);
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (GameFirstParty)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (FeaturedGamesAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1006, obj);
            setHeroTransitionNames(((GameFirstParty) (obj)).getGame().getApplicationId());
            Game game = ((GameFirstParty) (obj)).getGame();
            i = ((FeaturedGamesAdapter) (gamesrecycleradapter)).mCardType;
            if (i == 2 || i == 1)
            {
                setImage(game.getIconImageUri(), 0x7f0200da);
                setImageAspectRatio(1.0F);
            } else
            {
                gamesrecycleradapter = game.getFeaturedImageUri();
                if (!PlatformVersion.checkVersion(11))
                {
                    gamesrecycleradapter = null;
                }
                setImage(gamesrecycleradapter, 0x7f0201e0);
                setImageAspectRatio(2.048F);
            }
            setIconImage(game.getIconImageUri(), 0x7f0200da);
            gamesrecycleradapter = getTitleViewBuffer();
            game.getDisplayName(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            gamesrecycleradapter = getSubtitleViewBuffer();
            game.getDeveloperName(gamesrecycleradapter);
            setSubtitle(gamesrecycleradapter);
            gamesrecycleradapter = ((GameFirstParty) (obj)).getFormattedPrice();
            if (gamesrecycleradapter != null)
            {
                gamesrecycleradapter = gamesrecycleradapter.toUpperCase(mContext.getResources().getConfiguration().locale);
            } else
            {
                gamesrecycleradapter = "";
            }
            setPrimaryLabel(gamesrecycleradapter);
        }

        public FeaturedGamesViewHolder(View view)
        {
            super(view);
        }
    }


    final int mCardType;
    private FeaturedGamesEventListener mListener;

    public FeaturedGamesAdapter(Activity activity, FeaturedGamesEventListener featuredgameseventlistener, int i)
    {
        super(activity);
        Asserts.checkNotNull(featuredgameseventlistener);
        mListener = featuredgameseventlistener;
        mCardType = i;
        setMaxRows(0x7f0e0007);
    }

    protected final int getCardType()
    {
        return mCardType;
    }

    protected final int getDataType()
    {
        return 0x7f0d0034;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new FeaturedGamesViewHolder(view);
    }


}
