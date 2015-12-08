// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestEventListener, InternalQuestViewHolder

public final class QuestAdapter extends DatabufferRecyclerAdapter
{
    public static final class QuestViewHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
        implements android.view.View.OnClickListener
    {

        private final InternalQuestViewHolder mInternalViewHolder;

        public final void onClick(View view)
        {
            view = (QuestAdapter)mAdapter;
            if (((QuestAdapter) (view)).mParentActivity.mIsPlusEnabled)
            {
                Quest quest = (Quest)getData();
                ((QuestAdapter) (view)).mListener.onPlayQuestClicked(quest);
            }
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (Quest)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            LogflowUiUtils.setupLogflowAndImpressView(mInternalViewHolder.mCardView, gamesrecycleradapter, 219, 1010, obj);
            gamesrecycleradapter = (QuestAdapter)mAdapter;
            mInternalViewHolder.populateViews(mContext, this, ((Quest) (obj)), ((QuestAdapter) (gamesrecycleradapter)).mParentActivity);
        }

        public QuestViewHolder(View view)
        {
            super(view);
            mInternalViewHolder = new InternalQuestViewHolder(view);
            mInternalViewHolder.setOnClickListener(this);
        }
    }


    private final QuestEventListener mListener;
    private final GamesFragmentActivity mParentActivity;
    private final int mTileLayoutResId;

    public QuestAdapter(GamesFragmentActivity gamesfragmentactivity, QuestEventListener questeventlistener, boolean flag)
    {
        super(gamesfragmentactivity);
        mParentActivity = gamesfragmentactivity;
        mListener = questeventlistener;
        int i;
        if (flag)
        {
            i = 0x7f0400e5;
        } else
        {
            i = 0x7f0400e8;
        }
        mTileLayoutResId = i;
    }

    protected final int getCardItemViewType$134621()
    {
        return 0x7f0d003e;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e0041);
    }

    protected final com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        return new QuestViewHolder(mInflater.inflate(mTileLayoutResId, viewgroup, false));
    }


}
