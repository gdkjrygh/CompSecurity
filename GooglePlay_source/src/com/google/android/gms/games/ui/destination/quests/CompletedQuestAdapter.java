// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;

public final class CompletedQuestAdapter extends OnyxCardAdapter
{
    private static final class QuestViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (Quest)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (CompletedQuestAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1056, obj);
            setImage(((Quest) (obj)).getIconImageUri(), 0x7f0200da);
            gamesrecycleradapter = getTitleViewBuffer();
            ((Quest) (obj)).getName(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            long l = System.currentTimeMillis();
            long l1 = ((Quest) (obj)).getLastUpdatedTimestamp();
            if (l - l1 > 0L)
            {
                gamesrecycleradapter = DateUtils.getRelativeTimeSpanString(l1, l, 1000L).toString();
            } else
            {
                gamesrecycleradapter = mContext.getString(0x7f10029f);
            }
            setSubtitle(gamesrecycleradapter);
            setRootViewContentDescription(mContext.getString(0x7f10029e, new Object[] {
                ((Quest) (obj)).getName(), gamesrecycleradapter
            }));
        }

        public QuestViewHolder(View view)
        {
            super(view);
        }
    }


    public CompletedQuestAdapter(Context context)
    {
        super(context);
    }

    protected final int getCardType()
    {
        return 2;
    }

    protected final int getDataType()
    {
        return 0x7f0d0030;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new QuestViewHolder(view);
    }

}
