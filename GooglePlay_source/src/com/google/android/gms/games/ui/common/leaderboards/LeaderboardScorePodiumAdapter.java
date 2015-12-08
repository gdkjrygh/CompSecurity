// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.LeaderboardPodiumAvatarView;

public final class LeaderboardScorePodiumAdapter extends SingleItemRecyclerAdapter
{
    private static final class LeaderboardScorePodiumViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final View mContentView;
        private final View mFirstPlacePodium;
        private final View mSecondPlacePodium;
        private final View mThirdPlacePodium;

        private Drawable getBackgroundShape()
        {
            LeaderboardScorePodiumAdapter leaderboardscorepodiumadapter = (LeaderboardScorePodiumAdapter)mAdapter;
            GradientDrawable gradientdrawable = new GradientDrawable();
            gradientdrawable.setShape(0);
            gradientdrawable.setColor(-1);
            float f = mContext.getResources().getInteger(0x7f0e0044);
            if (leaderboardscorepodiumadapter.mOnlyPodiumVisible)
            {
                gradientdrawable.setCornerRadii(new float[] {
                    f, f, f, f, f, f, f, f
                });
                return gradientdrawable;
            } else
            {
                gradientdrawable.setCornerRadii(new float[] {
                    f, f, f, f, 0.0F, 0.0F, 0.0F, 0.0F
                });
                return gradientdrawable;
            }
        }

        private void populatePodium(View view, LeaderboardScore leaderboardscore, int i, int j)
        {
            Object obj = (LeaderboardScorePodiumAdapter)mAdapter;
            Resources resources = mContext.getResources();
            TextView textview = (TextView)view.findViewById(0x7f0d01ca);
            LeaderboardPodiumAvatarView leaderboardpodiumavatarview = (LeaderboardPodiumAvatarView)view.findViewById(0x7f0d01cb);
            TextView textview1 = (TextView)view.findViewById(0x7f0d01cc);
            TextView textview2 = (TextView)view.findViewById(0x7f0d01cd);
            Player player = (Player)leaderboardscore.getScoreHolder().freeze();
            leaderboardpodiumavatarview.setData(player, i);
            leaderboardpodiumavatarview.setTag(player);
            leaderboardpodiumavatarview.setOnClickListener(this);
            if (player != null && (player.getPlayerId() == null && ((LeaderboardScorePodiumAdapter) (obj)).mPlayerId == null || player.getPlayerId().equals(((LeaderboardScorePodiumAdapter) (obj)).mPlayerId)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                obj = resources.getString(0x7f10021c);
            } else
            {
                obj = player.getDisplayName();
            }
            textview.setText(String.valueOf(leaderboardscore.getRank()));
            textview1.setText(((CharSequence) (obj)));
            textview2.setText(leaderboardscore.getDisplayScore());
            leaderboardpodiumavatarview.mMaxSize = leaderboardpodiumavatarview.getContext().getResources().getDimensionPixelSize(j);
            leaderboardpodiumavatarview.invalidate();
            view.setVisibility(0);
            if (i != 0)
            {
                view = resources.getString(0x7f10021c);
            } else
            {
                view = leaderboardscore.getScoreHolderDisplayName();
            }
            leaderboardpodiumavatarview.setContentDescription(resources.getString(0x7f1001f1, new Object[] {
                leaderboardscore.getDisplayRank(), view, UiUtils.getPlayerLevelContentDescription(mContext, player), leaderboardscore.getDisplayScore()
            }));
        }

        public final void onClick(View view)
        {
            LeaderboardScorePodiumAdapter leaderboardscorepodiumadapter = (LeaderboardScorePodiumAdapter)mAdapter;
            view = ((View) (view.getTag()));
            if (view instanceof Player)
            {
                leaderboardscorepodiumadapter.mLeaderboardScoreEventListener.onLeaderboardScoreClicked((Player)view);
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            boolean flag = false;
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (LeaderboardScorePodiumAdapter)mAdapter;
            Object obj;
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
            if (((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mThirdScore != null)
            {
                Asserts.checkNotNull(((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mSecondScore, "Can't have third place without second");
                Asserts.checkNotNull(((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore, "Can't have third place without first");
                populatePodium(mFirstPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore, 0x7f0200c6, 0x7f0c00f1);
                populatePodium(mSecondPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mSecondScore, 0x7f0200c7, 0x7f0c00f2);
                populatePodium(mThirdPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mThirdScore, 0x7f0200c8, 0x7f0c00f3);
            } else
            if (((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mSecondScore != null)
            {
                Asserts.checkNotNull(((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore, "Can't have second place without first");
                mThirdPlacePodium.setVisibility(4);
                populatePodium(mFirstPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore, 0x7f0200c6, 0x7f0c00f1);
                populatePodium(mSecondPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mSecondScore, 0x7f0200c7, 0x7f0c00f2);
            } else
            if (((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore != null)
            {
                mSecondPlacePodium.setVisibility(4);
                mThirdPlacePodium.setVisibility(4);
                populatePodium(mFirstPlacePodium, ((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mFirstScore, 0x7f0200c6, 0x7f0c00f1);
            }
            obj = mContext.getResources();
            marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mContentView.getLayoutParams();
            i = 0;
            if (((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mOnlyPodiumVisible)
            {
                int j = ((Resources) (obj)).getDimensionPixelSize(0x7f0c0130);
                i = j;
                if (PlatformVersion.checkVersion(21))
                {
                    i = j * 2;
                }
            }
            marginlayoutparams.setMargins(0, 0, 0, i);
            mContentView.setLayoutParams(marginlayoutparams);
            if (PlatformVersion.checkVersion(16))
            {
                mContentView.setBackground(getBackgroundShape());
            } else
            {
                mContentView.setBackgroundDrawable(getBackgroundShape());
            }
            obj = mContentView.findViewById(0x7f0d01c9);
            i = ((flag) ? 1 : 0);
            if (((LeaderboardScorePodiumAdapter) (gamesrecycleradapter)).mOnlyPodiumVisible)
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
        }

        public LeaderboardScorePodiumViewHolder(View view)
        {
            super(view);
            mContentView = view.findViewById(0x7f0d01c5);
            mSecondPlacePodium = view.findViewById(0x7f0d01c6);
            mFirstPlacePodium = view.findViewById(0x7f0d01c7);
            mThirdPlacePodium = view.findViewById(0x7f0d01c8);
        }
    }


    LeaderboardScore mFirstScore;
    private final LeaderboardScoreAdapter.LeaderboardScoreEventListener mLeaderboardScoreEventListener;
    boolean mOnlyPodiumVisible;
    String mPlayerId;
    LeaderboardScore mSecondScore;
    LeaderboardScore mThirdScore;

    public LeaderboardScorePodiumAdapter(Context context, LeaderboardScoreAdapter.LeaderboardScoreEventListener leaderboardscoreeventlistener)
    {
        super(context);
        mLeaderboardScoreEventListener = leaderboardscoreeventlistener;
    }

    final boolean canBindView()
    {
        return mFirstScore != null;
    }

    public final int getItemViewType()
    {
        return 0x7f04008e;
    }

    public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder)viewholder, i);
    }

    public final void onBindViewHolder(com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder singleitemviewholder, int i)
    {
        boolean flag;
        if (mFirstScore != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkNotNull(Boolean.valueOf(flag), "Must set at least the first score");
        super.onBindViewHolder(singleitemviewholder, i);
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LeaderboardScorePodiumViewHolder(mInflater.inflate(0x7f04008e, viewgroup, false));
    }






}
