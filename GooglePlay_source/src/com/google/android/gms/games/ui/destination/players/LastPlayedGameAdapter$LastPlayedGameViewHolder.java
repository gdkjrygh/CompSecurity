// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.View;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            LastPlayedGameAdapter

private static final class er extends com.google.android.gms.games.ui.card.GameViewHolder
{

    public final void onRootViewClicked()
    {
        LastPlayedGameAdapter.access$100((LastPlayedGameAdapter)mAdapter).onLastPlayedGameClicked((MostRecentGameInfo)getData());
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (MostRecentGameInfo)obj;
        super.s(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (LastPlayedGameAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, LastPlayedGameAdapter.access$000(gamesrecycleradapter), 1058, obj);
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

    public er(View view)
    {
        super(view);
    }
}
