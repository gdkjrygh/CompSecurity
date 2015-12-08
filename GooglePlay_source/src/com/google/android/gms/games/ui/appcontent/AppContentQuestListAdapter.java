// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCard, AppContentUtils

public final class AppContentQuestListAdapter extends DatabufferRecyclerAdapter
{
    private static final class QuestHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
    {

        private final View mLargeLabelDivider;
        private final View mRootView;
        private final com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider mSlotProvider;

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (ExtendedAppContentCard)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            AppContentUtils.resetLayoutSlots(mSlotProvider);
            AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), 219);
            AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
            gamesrecycleradapter = mSlotProvider.getLayoutSlot("LARGE_PRIMARY_LABEL");
            obj = mSlotProvider.getLayoutSlot("LARGE_SECONDARY_LABEL");
            View view = mLargeLabelDivider;
            if (gamesrecycleradapter != null && obj != null && ((LayoutSlot) (gamesrecycleradapter)).mVisible && ((LayoutSlot) (obj)).mVisible)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }

        public QuestHolder(View view)
        {
            super(view);
            mRootView = view;
            mLargeLabelDivider = mRootView.findViewById(0x7f0d025a);
            mSlotProvider = LayoutSlotInflater.getSlotProvider(mRootView);
        }
    }


    public AppContentQuestListAdapter(Context context)
    {
        super(context);
    }

    public static int getScreenRowsResId()
    {
        return 0x7f0e003b;
    }

    public static int getSpanCountResId()
    {
        return 0x7f0e003c;
    }

    public static int getViewType()
    {
        return 0x7f0400c3;
    }

    protected final int getCardItemViewType$134621()
    {
        return 0x7f0400c3;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e003c);
    }

    protected final com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        return new QuestHolder(mInflater.inflate(0x7f0400c3, viewgroup, false));
    }
}
