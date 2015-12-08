// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;

public final class PlayerDetailProfileBannerAdapter extends SingleItemRecyclerAdapter
{
    public static interface ProfileBannerEventListener
    {

        public abstract void onProfileBannerEditCirclesClicked();

        public abstract void onProfileBannerGplusClicked();
    }

    public static final class ProfileBannerViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        final MetagameAvatarView mAvatarView;
        private final View mBackgroundImageView;
        private final TextView mCirclesView;
        private final View mGplusIconView;
        private final TextView mPlayerNameView;
        private final TextView mPlayerNicknameView;
        private final View mProfileContainerView;
        private final View mRootView;

        public final void onClick(View view)
        {
            PlayerDetailProfileBannerAdapter playerdetailprofilebanneradapter = (PlayerDetailProfileBannerAdapter)mAdapter;
            if (playerdetailprofilebanneradapter.mListener != null)
            {
                if (view == mCirclesView)
                {
                    playerdetailprofilebanneradapter.mListener.onProfileBannerEditCirclesClicked();
                    return;
                }
                if (view == mGplusIconView)
                {
                    playerdetailprofilebanneradapter.mListener.onProfileBannerGplusClicked();
                    return;
                }
                if (view == mRootView)
                {
                    ProfileBannerEventListener _tmp = playerdetailprofilebanneradapter.mListener;
                    return;
                }
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            Resources resources;
            PlayerDetailProfileBannerAdapter playerdetailprofilebanneradapter;
            int j;
            super.populateViews(gamesrecycleradapter, i);
            playerdetailprofilebanneradapter = (PlayerDetailProfileBannerAdapter)mAdapter;
            i = 0;
            resources = mContext.getResources();
            PlayerLevelInfo playerlevelinfo;
            if (PlatformVersion.checkVersion(11))
            {
                float f = playerdetailprofilebanneradapter.mAlpha;
                byte byte0;
                if ((double)f >= 1.0000000000000001E-05D)
                {
                    mRootView.setLayerType(2, null);
                } else
                {
                    mRootView.setLayerType(0, null);
                }
                mRootView.setAlpha(f);
            }
            gamesrecycleradapter = null;
            playerlevelinfo = null;
            if (playerdetailprofilebanneradapter.mTransition != null)
            {
                mAvatarView.initSharedViews(playerdetailprofilebanneradapter.mTransition);
            } else
            if (playerdetailprofilebanneradapter.mPlayer != null)
            {
                if (!TextUtils.isEmpty(playerdetailprofilebanneradapter.mPlayer.getPlayerId()))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    gamesrecycleradapter = resources.getString(0x7f100129);
                } else
                {
                    gamesrecycleradapter = playerdetailprofilebanneradapter.mPlayer.getTitle();
                }
                playerlevelinfo = playerdetailprofilebanneradapter.mPlayer.getLevelInfo();
                mPlayerNameView.setText(playerdetailprofilebanneradapter.mPlayer.getDisplayName());
                mAvatarView.setData(playerdetailprofilebanneradapter.mPlayer, true);
            }
            if (gamesrecycleradapter == null || TextUtils.isEmpty(gamesrecycleradapter))
            {
                mPlayerNicknameView.setVisibility(4);
            } else
            {
                mPlayerNicknameView.setText(gamesrecycleradapter);
                mPlayerNicknameView.setVisibility(0);
            }
            byte0 = -1;
            j = byte0;
            if (playerlevelinfo == null)
            {
                j = byte0;
                if (i != 0)
                {
                    j = resources.getColor(0x7f0b0056);
                }
            }
            mPlayerNameView.setTextColor(j);
            mPlayerNicknameView.setTextColor(j);
            i = 1;
            if (playerlevelinfo != null)
            {
                i = playerlevelinfo.mCurrentLevel.mLevelNumber;
            }
            j = UiUtils.getLevelColor(resources, i);
            if (playerdetailprofilebanneradapter.mIsComparison)
            {
                mPlayerNicknameView.setPadding(mPlayerNicknameView.getPaddingLeft(), mPlayerNicknameView.getPaddingTop(), mPlayerNicknameView.getPaddingRight(), resources.getDimensionPixelSize(0x7f0c01a8));
            } else
            {
                mCirclesView.setVisibility(8);
                mGplusIconView.setVisibility(8);
            }
            if (playerdetailprofilebanneradapter.mIsUserPlusEnabled) goto _L2; else goto _L1
_L1:
            mCirclesView.setText(0x7f100129);
            mCirclesView.setContentDescription(mContext.getString(0x7f10012a));
            mCirclesView.setTextColor(-1);
            mCirclesView.setBackgroundResource(0x7f02016f);
_L6:
            mCirclesView.setVisibility(0);
            mGplusIconView.setVisibility(0);
_L4:
            mRootView.setFocusable(true);
            mRootView.setContentDescription(mContext.getString(0x7f100122, new Object[] {
                mPlayerNameView.getText(), mPlayerNicknameView.getText(), Integer.valueOf(i)
            }));
            mRootView.setClickable(false);
            mPlayerNicknameView.setFocusable(false);
            mAvatarView.setFocusable(false);
            int k;
            if (PlatformVersion.checkVersion(11))
            {
                mBackgroundImageView.setVisibility(8);
                return;
            } else
            {
                mBackgroundImageView.setVisibility(0);
                mBackgroundImageView.setBackgroundDrawable(itemView.getResources().getDrawable(0x7f02003f));
                i = UiUtils.getLevelColorForBackground(resources, i);
                mRootView.setBackgroundColor(i);
                return;
            }
_L2:
            if (playerdetailprofilebanneradapter.mBelongingCircles == null) goto _L4; else goto _L3
_L3:
            k = playerdetailprofilebanneradapter.mBelongingCircles.size();
            if (k == 0)
            {
                mCirclesView.setText(0x7f10011d);
                mCirclesView.setContentDescription(mContext.getString(0x7f10011e));
                mCirclesView.setTextColor(-1);
                mCirclesView.setBackgroundResource(0x7f02016f);
            } else
            {
                if (k == 1)
                {
                    gamesrecycleradapter = ((AudienceMember)playerdetailprofilebanneradapter.mBelongingCircles.get(0)).mDisplayName;
                } else
                {
                    gamesrecycleradapter = resources.getQuantityString(0x7f0f0001, k, new Object[] {
                        Integer.valueOf(k)
                    });
                }
                mCirclesView.setText(gamesrecycleradapter);
                mCirclesView.setContentDescription(mContext.getString(0x7f100125));
                mCirclesView.setTextColor(j);
                mCirclesView.setBackgroundResource(0x7f020170);
            }
            if (true) goto _L6; else goto _L5
_L5:
        }


        public ProfileBannerViewHolder(View view)
        {
            super(view);
            mRootView = view.findViewById(0x7f0d0234);
            mRootView.setOnClickListener(this);
            mProfileContainerView = view.findViewById(0x7f0d0247);
            mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01d4);
            mAvatarView.setOutlineStrokeWidthResId(0x7f0c0108);
            mAvatarView.setShadowStrokeWidthResId(0x7f0c0109);
            mAvatarView.setAvatarElevationResId(0x7f0c0106);
            mAvatarView.setUseLoadingPlaceholder$1385ff();
            mPlayerNicknameView = (TextView)view.findViewById(0x7f0d0236);
            mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
            mCirclesView = (TextView)view.findViewById(0x7f0d0237);
            mCirclesView.setOnClickListener(this);
            mGplusIconView = view.findViewById(0x7f0d0238);
            mGplusIconView.setOnClickListener(this);
            mBackgroundImageView = view.findViewById(0x7f0d0235);
        }
    }


    private float mAlpha;
    MetagameAvatarView mAvatarView;
    ArrayList mBelongingCircles;
    private final boolean mIsComparison;
    boolean mIsUserPlusEnabled;
    private final ProfileBannerEventListener mListener;
    Player mPlayer;
    private final boolean mShowLevelInfo = true;
    SharedElementTransition mTransition;

    public PlayerDetailProfileBannerAdapter(Context context, boolean flag, ProfileBannerEventListener profilebannereventlistener)
    {
        super(context, false);
        mAlpha = 1.0F;
        mIsUserPlusEnabled = true;
        mIsComparison = flag;
        mListener = profilebannereventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f0400bb;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        viewgroup = mInflater.inflate(0x7f0400bb, viewgroup, false);
        ProfileBannerViewHolder profilebannerviewholder = new ProfileBannerViewHolder(viewgroup);
        mAvatarView = profilebannerviewholder.mAvatarView;
        if (PlatformVersion.checkVersion(11))
        {
            android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
            Resources resources = mContext.getResources();
            layoutparams.height = resources.getDimensionPixelSize(0x7f0c01a4);
            layoutparams.height = layoutparams.height + resources.getDimensionPixelSize(0x7f0c01aa);
            viewgroup.setLayoutParams(layoutparams);
        }
        return profilebannerviewholder;
    }

    final void onNewData()
    {
        if (isVisible())
        {
            notifySingleItemChanged();
            return;
        } else
        {
            setVisible(true);
            return;
        }
    }

    public final void setAlpha(float f)
    {
        mAlpha = f;
        notifySingleItemChanged();
    }








}
