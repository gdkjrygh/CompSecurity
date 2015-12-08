// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.players.SharedProfileSummaryUtils;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

public final class SlimProfileSummaryAdapter extends SingleItemRecyclerAdapter
{
    public static interface SlimProfileSummaryEventListener
    {

        public abstract void onSlimProfileViewLargePrimaryLabelClicked();

        public abstract void onSlimProfileViewProfileClicked(Player player, SharedElementTransition sharedelementtransition);
    }

    private static final class SlimProfileSummaryViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final MetagameAvatarView mAvatarView;
        private final View mBottomContainerView;
        private final TextView mCongratsLevelView;
        private final TextView mCongratsMessageView;
        private final TextView mLargePrimaryLabelView;
        private final ProgressBar mLevelProgressView;
        private final TextView mNextLevelView;
        private final View mPlayerBannerBackgroundView;
        private final TextView mPlayerNameView;
        private final TextView mPlayerNicknameView;

        public final void onClick(View view)
        {
            SlimProfileSummaryAdapter slimprofilesummaryadapter = (SlimProfileSummaryAdapter)mAdapter;
            if (slimprofilesummaryadapter.mListener == null)
            {
                return;
            }
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            SlimProfileSummaryAdapter slimprofilesummaryadapter;
            int j = 1;
            populateViews(gamesrecycleradapter, i);
            slimprofilesummaryadapter = (SlimProfileSummaryAdapter)mAdapter;
            android.content.res.Resources resources = mContext.getResources();
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, 218, 1002, slimprofilesummaryadapter.mPlayer);
            gamesrecycleradapter = slimprofilesummaryadapter.mPlayer.getLevelInfo();
            Player player;
            TextView textview;
            if (gamesrecycleradapter != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                j = ((PlayerLevelInfo) (gamesrecycleradapter)).mCurrentLevel.mLevelNumber;
            }
            mPlayerBannerBackgroundView.setBackgroundColor(UiUtils.getLevelColorForBackground(resources, j));
            mPlayerNameView.setText(slimprofilesummaryadapter.mPlayer.getDisplayName());
            player = slimprofilesummaryadapter.mPlayer;
            textview = mPlayerNicknameView;
            if (!TextUtils.isEmpty(player.getTitle()))
            {
                textview.setText(player.getTitle());
                textview.setVisibility(0);
            } else
            {
                textview.setVisibility(8);
            }
            mAvatarView.setData(slimprofilesummaryadapter.mPlayer);
            if (i == 0) goto _L2; else goto _L1
_L1:
            mLargePrimaryLabelView.setVisibility(8);
            mLargePrimaryLabelView.setOnClickListener(null);
            SharedProfileSummaryUtils.displayLevelInformation(gamesrecycleradapter, resources, mLevelProgressView, mNextLevelView);
_L4:
            if (i != 0 && SharedProfileSummaryUtils.shouldDisplayLevelUpCongrats(gamesrecycleradapter))
            {
                SharedProfileSummaryUtils.addLevelUpCongrats(resources, gamesrecycleradapter, mCongratsLevelView, mCongratsMessageView);
                mBottomContainerView.setVisibility(0);
            }
            LogflowUiUtils.attachDocumentId(itemView, slimprofilesummaryadapter.mPlayer);
            
// JavaClassFileOutputException: get_constant: invalid tag

        public SlimProfileSummaryViewHolder(View view)
        {
            super(view);
            mPlayerBannerBackgroundView = view.findViewById(0x7f0d0172);
            mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
            mPlayerNicknameView = (TextView)view.findViewById(0x7f0d0236);
            mNextLevelView = (TextView)view.findViewById(0x7f0d023d);
            mLevelProgressView = (ProgressBar)view.findViewById(0x7f0d023f);
            mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01ba);
            mAvatarView.setOutlineStrokeWidthResId(0x7f0c0111);
            mAvatarView.setShadowStrokeWidthResId(0x7f0c0109);
            mAvatarView.setAvatarElevationResId(0x7f0c0106);
            UiUtils.hideViewAndItsDescendantsFromAccessibilityServices(mAvatarView);
            mBottomContainerView = view.findViewById(0x7f0d0244);
            mCongratsLevelView = (TextView)view.findViewById(0x7f0d0245);
            mCongratsMessageView = (TextView)view.findViewById(0x7f0d0246);
            mLargePrimaryLabelView = (TextView)view.findViewById(0x7f0d025b);
            view.setOnClickListener(this);
        }
    }


    private final SlimProfileSummaryEventListener mListener;
    public Player mPlayer;

    public SlimProfileSummaryAdapter(Context context, SlimProfileSummaryEventListener slimprofilesummaryeventlistener)
    {
        SingleItemRecyclerAdapter(context, false);
        Preconditions.checkNotNull(slimprofilesummaryeventlistener);
        mListener = slimprofilesummaryeventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f0400d9;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new SlimProfileSummaryViewHolder(mInflater.inflate(0x7f0400d9, viewgroup, false));
    }




}
