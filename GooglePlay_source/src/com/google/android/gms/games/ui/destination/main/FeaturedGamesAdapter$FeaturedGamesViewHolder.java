// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            FeaturedGamesAdapter

private static final class er extends com.google.android.gms.games.ui.card.sViewHolder
{

    public final void onRootViewClicked()
    {
        FeaturedGamesAdapter.access$100((FeaturedGamesAdapter)mAdapter).onFeaturedGamesClicked((GameFirstParty)getData(), getSharedElementTransition(), itemView);
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (GameFirstParty)obj;
        super.ews(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (FeaturedGamesAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, FeaturedGamesAdapter.access$000(gamesrecycleradapter), 1006, obj);
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

    public er(View view)
    {
        super(view);
    }
}
