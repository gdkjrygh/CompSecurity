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

// Referenced classes of package com.google.android.gms.games.ui.destination.quests:
//            CompletedQuestAdapter

private static final class  extends com.google.android.gms.games.ui.card.estViewHolder
{

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (Quest)obj;
        super.ulateViews(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (CompletedQuestAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, CompletedQuestAdapter.access$000(gamesrecycleradapter), 1056, obj);
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

    public (View view)
    {
        super(view);
    }
}
