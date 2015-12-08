// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.view.View;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.common.quests.InternalQuestViewHolder;
import com.google.android.gms.games.ui.common.quests.QuestEventListener;
import com.google.android.gms.games.ui.common.quests.QuestTileEventListener;
import com.google.android.gms.games.ui.util.UiUtils;

public final class QuestCarouselViewHolder
    implements android.view.View.OnClickListener
{

    final View mCardView;
    final ImageLoader mImageLoader;
    final InternalQuestViewHolder mInternalViewHolder;
    private final QuestEventListener mListener;
    final GamesFragmentActivity mParentActivity;
    private final QuestTileEventListener mTileListener;

    public QuestCarouselViewHolder(ImageLoader imageloader, View view, GamesFragmentActivity gamesfragmentactivity, QuestEventListener questeventlistener, QuestTileEventListener questtileeventlistener)
    {
        mInternalViewHolder = new InternalQuestViewHolder(view);
        mInternalViewHolder.setOnClickListener(this);
        mParentActivity = gamesfragmentactivity;
        mListener = questeventlistener;
        mTileListener = questtileeventlistener;
        mCardView = mInternalViewHolder.mCardView;
        if (mTileListener != null)
        {
            mCardView.setOnClickListener(this);
            mCardView.setClickable(true);
        }
        mImageLoader = imageloader;
    }

    public final void onClick(View view)
    {
        Object obj = UiUtils.getValidTag(view);
        if (obj != null && (obj instanceof Quest))
        {
            obj = (Quest)obj;
            if (view == mCardView)
            {
                mTileListener.onQuestTileClicked(((Quest) (obj)));
                return;
            } else
            {
                mListener.onPlayQuestClicked(((Quest) (obj)));
                return;
            }
        } else
        {
            GamesLog.w("QuestCarouselVH", (new StringBuilder("onClick: unexpected tag '")).append(obj).append("'; View: ").append(view).append(", id ").append(view.getId()).toString());
            return;
        }
    }
}
