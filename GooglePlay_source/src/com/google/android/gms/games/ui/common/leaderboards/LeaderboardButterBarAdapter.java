// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

public final class LeaderboardButterBarAdapter extends SingleItemRecyclerAdapter
{
    public static interface LeaderboardButterBarEventListener
    {

        public abstract void onNonPublicPaclButterBarClicked();
    }

    private static final class LeaderboardButterBarViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final View mInfoIconView;
        private final View mOverlayView;
        private final CardView mRootView;
        private final TextView mSubtitleView;
        private final TextView mTitleView;

        public final void onClick(View view)
        {
            view = (LeaderboardButterBarAdapter)mAdapter;
            if (((LeaderboardButterBarAdapter) (view)).mShowPaclButterBar)
            {
                ((LeaderboardButterBarAdapter) (view)).mListener.onNonPublicPaclButterBarClicked();
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (LeaderboardButterBarAdapter)mAdapter;
            if (((LeaderboardButterBarAdapter) (gamesrecycleradapter)).mShowNetworkButterBar)
            {
                mRootView.setClickable(false);
                mTitleView.setText(0x7f1001b5);
                mSubtitleView.setText(0x7f1001b4);
                mInfoIconView.setVisibility(8);
                mOverlayView.setVisibility(8);
            } else
            {
                if (((LeaderboardButterBarAdapter) (gamesrecycleradapter)).mShowPaclButterBar)
                {
                    mRootView.setClickable(true);
                    mTitleView.setText(0x7f1001b3);
                    mSubtitleView.setText(0x7f1001b2);
                    mInfoIconView.setVisibility(0);
                    mOverlayView.setVisibility(0);
                    return;
                }
                if (((LeaderboardButterBarAdapter) (gamesrecycleradapter)).mShowPaclWaitButterBar)
                {
                    mRootView.setClickable(false);
                    mTitleView.setText(0x7f1001b7);
                    mSubtitleView.setText(0x7f1001b6);
                    mInfoIconView.setVisibility(8);
                    mOverlayView.setVisibility(8);
                    return;
                }
            }
        }

        public LeaderboardButterBarViewHolder(View view)
        {
            super(view);
            mRootView = (CardView)view;
            mRootView.setOnClickListener(this);
            mTitleView = (TextView)view.findViewById(0x7f0d0075);
            mSubtitleView = (TextView)view.findViewById(0x7f0d0074);
            mInfoIconView = view.findViewById(0x7f0d011a);
            mOverlayView = view.findViewById(0x7f0d0072);
        }
    }


    int mButterbarStates[] = {
        0, 0, 0
    };
    private final LeaderboardButterBarEventListener mListener;
    private boolean mShowNetworkButterBar;
    private boolean mShowPaclButterBar;
    private boolean mShowPaclWaitButterBar;

    public LeaderboardButterBarAdapter(Context context, LeaderboardButterBarEventListener leaderboardbutterbareventlistener)
    {
        super(context);
        mListener = leaderboardbutterbareventlistener;
    }

    private boolean canDisplayButterbar(int i)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        j = 0;
_L7:
        if (j >= i) goto _L2; else goto _L1
_L1:
        if (mButterbarStates[j] != 1) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mButterbarStates[i] == 2) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final void clearButterbar(int i)
    {
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mButterbarStates[i] = 0;
        if (getVisibleButterbarIndex() == -1)
        {
            setVisible(false);
        }
    }

    public final int getItemViewType()
    {
        return 0x7f040049;
    }

    final int getVisibleButterbarIndex()
    {
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < 3)
                {
                    if (mButterbarStates[i] != 1)
                    {
                        break label0;
                    }
                    j = i;
                }
                return j;
            }
            i++;
        } while (true);
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LeaderboardButterBarViewHolder(mInflater.inflate(0x7f040049, viewgroup, false));
    }

    public final void showNonPublicPaclButterbar()
    {
        if (!canDisplayButterbar(1))
        {
            return;
        } else
        {
            setVisible(true);
            mShowPaclButterBar = true;
            mButterbarStates[1] = 1;
            return;
        }
    }

    public final void showOfflineButterbar()
    {
        if (!canDisplayButterbar(0))
        {
            return;
        } else
        {
            setVisible(true);
            mShowNetworkButterBar = true;
            mButterbarStates[0] = 1;
            return;
        }
    }

    public final void showPaclServerWaitButterbar()
    {
        if (!canDisplayButterbar(2))
        {
            return;
        } else
        {
            setVisible(true);
            mShowPaclWaitButterBar = true;
            mButterbarStates[2] = 1;
            return;
        }
    }




}
