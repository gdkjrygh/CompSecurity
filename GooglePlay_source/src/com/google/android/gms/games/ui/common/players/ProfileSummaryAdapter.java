// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.players:
//            SharedProfileSummaryUtils

public final class ProfileSummaryAdapter extends SingleItemRecyclerAdapter
{
    public static interface ProfileSummaryEventListener
    {

        public abstract void onProfileEditCirclesClicked(Player player);

        public abstract void onProfileViewProfileClicked(Player player, SharedElementTransition sharedelementtransition);
    }

    private static final class ProfileSummaryViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final TextView mAddToCirclesView;
        private final TextView mAddedViewProfileView;
        private final MetagameAvatarView mAvatarView;
        private final View mBottomContainerView;
        private final TextView mCongratsLevelView;
        private final TextView mCongratsMessageView;
        private final ProgressBar mLevelProgressView;
        private final TextView mNextLevelView;
        private final View mPlayerBannerBackgroundView;
        private final TextView mPlayerNameView;
        private final TextView mPlayerNicknameView;

        public final void onClick(View view)
        {
            ProfileSummaryAdapter profilesummaryadapter = (ProfileSummaryAdapter)mAdapter;
            if (profilesummaryadapter.mEventListener == null)
            {
                return;
            }
            if (view == mAddToCirclesView)
            {
                profilesummaryadapter.mEventListener.onProfileEditCirclesClicked(profilesummaryadapter.mPlayer);
                return;
            } else
            {
                view = SharedElementTransition.createAvatarTransition();
                mAvatarView.addSharedViews(view);
                profilesummaryadapter.mEventListener.onProfileViewProfileClicked(profilesummaryadapter.mPlayer, view);
                return;
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            boolean flag = false;
            super.populateViews(gamesrecycleradapter, i);
            Object obj = (ProfileSummaryAdapter)mAdapter;
            Object obj1 = mContext.getResources();
            gamesrecycleradapter = ((ProfileSummaryAdapter) (obj)).mPlayer.getLevelInfo();
            i = 1;
            if (gamesrecycleradapter != null)
            {
                i = ((PlayerLevelInfo) (gamesrecycleradapter)).mCurrentLevel.mLevelNumber;
            }
            i = UiUtils.getLevelColorForBackground(((android.content.res.Resources) (obj1)), i);
            mPlayerBannerBackgroundView.setBackgroundColor(i);
            mPlayerNameView.setText(((ProfileSummaryAdapter) (obj)).mPlayer.getDisplayName());
            if (!TextUtils.isEmpty(((ProfileSummaryAdapter) (obj)).mPlayer.getTitle()))
            {
                obj1 = ((ProfileSummaryAdapter) (obj)).mPlayer.getTitle();
                mPlayerNicknameView.setText(((CharSequence) (obj1)));
                mPlayerNicknameView.setVisibility(0);
            } else
            {
                mPlayerNicknameView.setVisibility(8);
            }
            mAvatarView.setData(((ProfileSummaryAdapter) (obj)).mPlayer);
            obj1 = ((ProfileSummaryAdapter) (obj)).mPlayer.getPlayerId();
            if (PlatformVersion.checkVersion(21))
            {
                mAvatarView.getImageView().setTransitionName((new StringBuilder("avatar")).append(((String) (obj1))).toString());
            }
            if (1 == 0)
            {
                obj = mContext.getResources();
                mAddToCirclesView.setVisibility(8);
                mAddedViewProfileView.setVisibility(8);
                if (gamesrecycleradapter != null)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    SharedProfileSummaryUtils.displayLevelInformation(gamesrecycleradapter, ((android.content.res.Resources) (obj)), mLevelProgressView, mNextLevelView);
                }
                mBottomContainerView.setVisibility(0);
                if (i != 0 && SharedProfileSummaryUtils.shouldDisplayLevelUpCongrats(gamesrecycleradapter))
                {
                    SharedProfileSummaryUtils.addLevelUpCongrats(((android.content.res.Resources) (obj)), gamesrecycleradapter, mCongratsLevelView, mCongratsMessageView);
                }
                return;
            }
            mBottomContainerView.setVisibility(8);
            mLevelProgressView.setVisibility(4);
            gamesrecycleradapter = (ProfileSummaryAdapter)mAdapter;
            obj = mAddToCirclesView;
            if (((ProfileSummaryAdapter) (gamesrecycleradapter)).mIsPlayerAdded)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            ((TextView) (obj)).setVisibility(i);
            obj = mAddedViewProfileView;
            if (((ProfileSummaryAdapter) (gamesrecycleradapter)).mIsPlayerAdded)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
        }

        public ProfileSummaryViewHolder(View view)
        {
            super(view);
            mPlayerBannerBackgroundView = view.findViewById(0x7f0d0172);
            mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
            mPlayerNicknameView = (TextView)view.findViewById(0x7f0d0236);
            mNextLevelView = (TextView)view.findViewById(0x7f0d023d);
            mLevelProgressView = (ProgressBar)view.findViewById(0x7f0d023f);
            mAddToCirclesView = (TextView)view.findViewById(0x7f0d0241);
            mAddToCirclesView.setOnClickListener(this);
            UiUtils.heightAdjustLeftTextViewDrawable(mAddToCirclesView, 1.5F);
            mAddedViewProfileView = (TextView)view.findViewById(0x7f0d0242);
            mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01ba);
            mAvatarView.setOutlineStrokeWidthResId(0x7f0c0108);
            mAvatarView.setShadowStrokeWidthResId(0x7f0c0109);
            mAvatarView.setAvatarElevationResId(0x7f0c0106);
            UiUtils.hideViewAndItsDescendantsFromAccessibilityServices(mAvatarView);
            mBottomContainerView = view.findViewById(0x7f0d0244);
            mCongratsLevelView = (TextView)view.findViewById(0x7f0d0245);
            mCongratsMessageView = (TextView)view.findViewById(0x7f0d0246);
            itemView.setOnClickListener(this);
        }
    }


    private final ProfileSummaryEventListener mEventListener;
    private boolean mIsPlayerAdded;
    private final int mMode = 1;
    private Player mPlayer;

    public ProfileSummaryAdapter(Context context, ProfileSummaryEventListener profilesummaryeventlistener)
    {
        super(context, false);
        mEventListener = profilesummaryeventlistener;
    }

    public static boolean wasPlayerAddedToCircles(Player player, Intent intent)
    {
        if (player == null)
        {
            GamesLog.w("ProfileSummaryAdapter", "Player to mark as added is null. Let's do nothing in this case.");
        } else
        if (CircleSelection.getResults(intent).getSelectedCircles().size() > 0)
        {
            return true;
        }
        return false;
    }

    public final int getItemViewType()
    {
        return 0x7f0400bc;
    }

    public final void markPlayerAsAdded()
    {
        mIsPlayerAdded = true;
        notifySingleItemChanged();
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new ProfileSummaryViewHolder(mInflater.inflate(0x7f0400bc, viewgroup, false));
    }

    public final void setCurrentPlayerInfo(Player player)
    {
        mPlayer = (Player)player.freeze();
        setVisible(true);
    }




}
