// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.LeaderboardUiUtils;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

public final class LeaderboardScoreAdapter extends DatabufferRecyclerAdapter
{
    public static interface LeaderboardScoreEventListener
    {

        public abstract void onLeaderboardScoreClicked(Player player);
    }

    private static final class LeaderboardScoreViewHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
        implements android.view.View.OnClickListener
    {

        private final View mContentView;
        private final View mGreenLine;
        private final TextView mInTop;
        private final View mOverlay;
        private final MetagameAvatarView mPlayerImage;
        private final TextView mPlayerName;
        private final CharArrayBuffer mPlayerNameBuffer = new CharArrayBuffer(64);
        private final TextView mPlayerScore;
        private final CharArrayBuffer mPlayerScoreBuffer = new CharArrayBuffer(64);
        private final TextView mRank;

        private Drawable getBackgroundShape(boolean flag, int i)
        {
            GradientDrawable gradientdrawable = new GradientDrawable();
            gradientdrawable.setShape(0);
            gradientdrawable.setColor(i);
            float f = mContext.getResources().getInteger(0x7f0e0044);
            if (flag)
            {
                gradientdrawable.setCornerRadii(new float[] {
                    0.0F, 0.0F, 0.0F, 0.0F, f, f, f, f
                });
                return gradientdrawable;
            } else
            {
                gradientdrawable.setCornerRadii(new float[] {
                    0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F
                });
                return gradientdrawable;
            }
        }

        public final void onClick(View view)
        {
            view = (LeaderboardScoreAdapter)mAdapter;
            if (((LeaderboardScoreAdapter) (view)).mLeaderboardScoreEventListener != null)
            {
                Player player = ((LeaderboardScore)getData()).getScoreHolder();
                ((LeaderboardScoreAdapter) (view)).mLeaderboardScoreEventListener.onLeaderboardScoreClicked(player);
            }
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            LeaderboardScore leaderboardscore = (LeaderboardScore)obj;
            super.populateViews(gamesrecycleradapter, i, leaderboardscore);
            Object obj1 = (LeaderboardScoreAdapter)mAdapter;
            Context context = mContentView.getContext();
            Resources resources = context.getResources();
            Player player = leaderboardscore.getScoreHolder();
            int j;
            int k;
            long l;
            boolean flag;
            if (player != null && (player.getPlayerId() == null && ((LeaderboardScoreAdapter) (obj1)).mPlayerId == null || player.getPlayerId().equals(((LeaderboardScoreAdapter) (obj1)).mPlayerId)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            UiUtils.setVisible(flag, 4, new View[] {
                mGreenLine
            });
            l = leaderboardscore.getRank();
            if (LeaderboardUiUtils.shouldShowExactRank(l))
            {
                mRank.setText(String.valueOf(l));
                mInTop.setVisibility(8);
                gamesrecycleradapter = leaderboardscore.getDisplayRank();
            } else
            {
                gamesrecycleradapter = resources.getString(0x7f100212, new Object[] {
                    Integer.valueOf(Math.max((int)((l * 100L) / ((LeaderboardScoreAdapter) (obj1)).mNumScores), 1))
                });
                mRank.setText(gamesrecycleradapter);
                mInTop.setVisibility(0);
            }
            mPlayerImage.setData(player);
            if (flag)
            {
                mPlayerName.setText(0x7f10021c);
                obj = resources.getString(0x7f10021c);
                i = resources.getColor(0x7f0b0069);
                k = resources.getColor(0x7f0b00c5);
                j = resources.getColor(0x7f0b006a);
            } else
            {
                leaderboardscore.getScoreHolderDisplayName(mPlayerNameBuffer);
                mPlayerName.setText(mPlayerNameBuffer.data, 0, mPlayerNameBuffer.sizeCopied);
                obj = leaderboardscore.getScoreHolderDisplayName();
                i = -1;
                k = resources.getColor(0x7f0b006b);
                j = resources.getColor(0x7f0b0257);
            }
            mRank.setTextColor(k);
            mPlayerScore.setTextColor(j);
            j = ((LeaderboardScoreAdapter) (obj1)).getItemCount() - 1;
            if (((DatabufferRecyclerAdapter) (obj1)).mHasNext)
            {
                j--;
            }
            if (getLocalPosition() == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (PlatformVersion.checkVersion(16))
            {
                mContentView.setBackground(getBackgroundShape(flag, i));
            } else
            {
                mContentView.setBackgroundDrawable(getBackgroundShape(flag, i));
            }
            obj1 = (android.view.ViewGroup.MarginLayoutParams)mContentView.getLayoutParams();
            if (flag)
            {
                i = resources.getDimensionPixelSize(0x7f0c00cb);
            } else
            {
                i = 0;
            }
            ((android.view.ViewGroup.MarginLayoutParams) (obj1)).setMargins(0, 0, 0, i);
            mContentView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            leaderboardscore.getDisplayScore(mPlayerScoreBuffer);
            mPlayerScore.setText(mPlayerScoreBuffer.data, 0, mPlayerScoreBuffer.sizeCopied);
            mOverlay.setContentDescription(resources.getString(0x7f1001f1, new Object[] {
                gamesrecycleradapter, obj, UiUtils.getPlayerLevelContentDescription(context, player), leaderboardscore.getDisplayScore()
            }));
        }

        public LeaderboardScoreViewHolder(View view)
        {
            super(view);
            mOverlay = view.findViewById(0x7f0d0072);
            mContentView = view.findViewById(0x7f0d01cf);
            mGreenLine = view.findViewById(0x7f0d01d0);
            mInTop = (TextView)view.findViewById(0x7f0d01d2);
            mRank = (TextView)view.findViewById(0x7f0d01d3);
            mPlayerImage = (MetagameAvatarView)view.findViewById(0x7f0d01d4);
            mPlayerImage.setShadowStrokeWidthResId(0x7f0c00ea);
            mPlayerImage.setOutlineStrokeWidthResId(0x7f0c00e9);
            mPlayerName = (TextView)view.findViewById(0x7f0d01d5);
            mPlayerScore = (TextView)view.findViewById(0x7f0d01d6);
            mOverlay.setOnClickListener(this);
        }
    }


    private final LeaderboardScoreEventListener mLeaderboardScoreEventListener;
    protected long mNumScores;
    protected String mPlayerId;

    public LeaderboardScoreAdapter(Context context, LeaderboardScoreEventListener leaderboardscoreeventlistener)
    {
        super(context);
        mNumScores = -1L;
        mLeaderboardScoreEventListener = leaderboardscoreeventlistener;
    }

    private boolean canBindView()
    {
        return mNumScores >= 0L;
    }

    protected final int getCardItemViewType$134621()
    {
        return 0x7f0d003a;
    }

    public final int getSpanCount()
    {
        return 1;
    }

    public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder)viewholder, i);
    }

    public final void onBindViewHolder(com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder databufferviewholder, int i)
    {
        boolean flag;
        if (mNumScores >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Must set the number of scores before binding views");
        super.onBindViewHolder(databufferviewholder, i);
    }

    protected final com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        return new LeaderboardScoreViewHolder(mInflater.inflate(0x7f040090, viewgroup, false));
    }

    public final void setCurrentPlayerId(String s)
    {
        mPlayerId = (String)Preconditions.checkNotNull(s);
        if (canBindView())
        {
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    public final void setDataBuffer(DataBuffer databuffer)
    {
        int i;
        int j;
        boolean flag;
        if (databuffer == null || (databuffer instanceof LeaderboardScoreBuffer))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        j = getItemCount() - 1;
        i = j;
        if (super.mHasNext)
        {
            i = j - 1;
        }
        super.setDataBuffer(databuffer);
        if (i >= 0 && i < getItemCount())
        {
            notifyItemChanged(i);
        }
    }

    public final void setNumScores(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mNumScores = l;
        if (canBindView())
        {
            notifyItemRangeChanged(0, getItemCount());
        }
    }

}
