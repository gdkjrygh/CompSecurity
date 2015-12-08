// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.leaderboard.LeaderboardVariant;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.LeaderboardUiUtils;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardScoreSpinnerAdapter

public final class LeaderboardScoreHeaderAdapter extends SingleItemRecyclerAdapter
{
    public static interface LeaderboardCollectionControlListener
    {

        public abstract void onCollectionChanged(int i);

        public abstract void onTimeSpanChanged(int i);
    }

    private static final class LeaderboardScoreHeaderViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.CompoundButton.OnCheckedChangeListener
    {

        private View mCollectionToggleLayout;
        private View mCollectionToggleView;
        private LoadingImageView mLeaderboardIcon;
        private TextView mLeaderboardTitleView;
        private View mPlayerRankContainer;
        private TextView mPublicToggleText;
        private TextView mSocialToggleText;
        private LeaderboardScoreSpinnerAdapter mSpinnerAdapter;
        private Spinner mTimespanSpinner;
        private View mView;

        private void updateTimespanSpinner()
        {
            boolean flag = false;
            Object obj = (LeaderboardScoreHeaderAdapter)mAdapter;
            int i;
            if (!TextUtils.isEmpty(((LeaderboardScoreHeaderAdapter) (obj)).mCurrentPlayer.getPlayerId()) || ((LeaderboardScoreHeaderAdapter) (obj)).mCollection == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = mTimespanSpinner;
            if (i != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((Spinner) (obj)).setVisibility(i);
        }

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            LeaderboardScoreHeaderAdapter leaderboardscoreheaderadapter = (LeaderboardScoreHeaderAdapter)mAdapter;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            leaderboardscoreheaderadapter.mCollection = i;
            if (flag)
            {
                i = 509;
            } else
            {
                i = 508;
            }
            compoundbutton.setTag(0x7f0d0061, new LogflowViewUiElementNode(i, (byte)0));
            ((mCollectionToggleLayout) (leaderboardscoreheaderadapter)).mCollectionToggleLayout.logClick(compoundbutton);
            leaderboardscoreheaderadapter.mLeaderboardVariantControl.onCollectionChanged(leaderboardscoreheaderadapter.mCollection);
            updateTimespanSpinner();
        }

        public final void onClick(View view)
        {
            while (!PlatformVersion.checkVersion(14) || view.getId() != 0x7f0d01e4 || !PlatformVersion.checkVersion(14)) 
            {
                return;
            }
            view = (Switch)mCollectionToggleView;
            boolean flag1 = view.isChecked();
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setChecked(flag);
            onCheckedChanged(view, flag1);
        }

        public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (LeaderboardScoreHeaderAdapter)mAdapter;
            adapterview.mTimeSpan = LeaderboardScoreHeaderAdapter.access$1000(i);
            ((LeaderboardScoreHeaderAdapter) (adapterview)).mLeaderboardVariantControl.onTimeSpanChanged(((LeaderboardScoreHeaderAdapter) (adapterview)).mTimeSpan);
            mSpinnerAdapter.updateSpinnerTitles(((LeaderboardScoreHeaderAdapter) (adapterview)).mTimeSpan);
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = mView.getContext().getResources();
            LeaderboardScoreHeaderAdapter leaderboardscoreheaderadapter = (LeaderboardScoreHeaderAdapter)mAdapter;
            mView.setBackgroundColor(0);
            long l;
            if (PlatformVersion.checkVersion(14))
            {
                Switch switch1 = (Switch)mCollectionToggleView;
                boolean flag;
                if (leaderboardscoreheaderadapter.mCollection == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                switch1.setChecked(flag);
            } else
            {
                CheckBox checkbox = (CheckBox)mCollectionToggleView;
                boolean flag1;
                if (leaderboardscoreheaderadapter.mCollection == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                checkbox.setChecked(flag1);
            }
            mLeaderboardIcon.loadUri$3329f911(leaderboardscoreheaderadapter.mGameUri, 0x7f020149, true);
            mLeaderboardTitleView.setText(leaderboardscoreheaderadapter.mLeaderboardName);
            i = LeaderboardScoreHeaderAdapter.access$500(leaderboardscoreheaderadapter.mTimeSpan);
            mTimespanSpinner.setSelection(i);
            updateTimespanSpinner();
            mSpinnerAdapter.updateSpinnerTitles(leaderboardscoreheaderadapter.mTimeSpan);
            if (leaderboardscoreheaderadapter.mLeaderboardVariant == null)
            {
                l = -1L;
            } else
            {
                l = leaderboardscoreheaderadapter.mLeaderboardVariant.getPlayerRank();
            }
            if (l == -1L || !leaderboardscoreheaderadapter.mLeaderboardVariant.hasPlayerInfo())
            {
                mPlayerRankContainer.setVisibility(8);
                return;
            }
            long l1 = leaderboardscoreheaderadapter.mLeaderboardVariant.getNumScores();
            boolean flag2 = LeaderboardUiUtils.shouldShowExactRank(l);
            TextView textview = (TextView)mPlayerRankContainer.findViewById(0x7f0d01e0);
            if (flag2)
            {
                gamesrecycleradapter = gamesrecycleradapter.getString(0x7f1001c2, new Object[] {
                    leaderboardscoreheaderadapter.mLeaderboardVariant.getDisplayPlayerRank()
                });
            } else
            {
                gamesrecycleradapter = gamesrecycleradapter.getString(0x7f1001c3, new Object[] {
                    String.valueOf(Math.max((int)((100L * l) / l1), 1))
                });
            }
            textview.setText(gamesrecycleradapter);
            mPlayerRankContainer.setVisibility(0);
            gamesrecycleradapter = (MetagameAvatarView)mPlayerRankContainer.findViewById(0x7f0d01d4);
            UiUtils.setSmallMetagameAvatarSizes(gamesrecycleradapter);
            gamesrecycleradapter.setOutlineStrokeWidthResId(0x7f0c00d1);
            gamesrecycleradapter.setData(leaderboardscoreheaderadapter.mCurrentPlayer, false);
        }

        public final boolean shouldAnimateAdd()
        {
            return false;
        }

        public LeaderboardScoreHeaderViewHolder(View view)
        {
            super(view);
            mView = view;
            mLeaderboardIcon = (LoadingImageView)mView.findViewById(0x7f0d01db);
            mLeaderboardTitleView = (TextView)mView.findViewById(0x7f0d01de);
            mTimespanSpinner = (Spinner)mView.findViewById(0x7f0d01e2);
            mSpinnerAdapter = new LeaderboardScoreSpinnerAdapter(mView.getContext());
            mTimespanSpinner.setAdapter(mSpinnerAdapter);
            mTimespanSpinner.setOnItemSelectedListener(this);
            mPlayerRankContainer = mView.findViewById(0x7f0d01df);
            if (PlatformVersion.checkVersion(14))
            {
                mSocialToggleText = (TextView)mView.findViewById(0x7f0d01d8);
                mPublicToggleText = (TextView)mView.findViewById(0x7f0d01d9);
                mCollectionToggleLayout = mView.findViewById(0x7f0d01e4);
                mCollectionToggleLayout.setOnClickListener(this);
                mCollectionToggleView = mView.findViewById(0x7f0d01d7);
                ViewCompat.setImportantForAccessibility(mCollectionToggleView, 2);
                return;
            } else
            {
                mSocialToggleText = null;
                mPublicToggleText = null;
                view = (CheckBox)mView.findViewById(0x7f0d01d7);
                view.setOnCheckedChangeListener(this);
                mCollectionToggleView = view;
                return;
            }
        }
    }


    private int mBackgroundColor;
    int mCollection;
    Player mCurrentPlayer;
    Uri mGameUri;
    String mLeaderboardName;
    LeaderboardVariant mLeaderboardVariant;
    final LeaderboardCollectionControlListener mLeaderboardVariantControl;
    int mTimeSpan;

    public LeaderboardScoreHeaderAdapter(Context context, int i, int j, LeaderboardCollectionControlListener leaderboardcollectioncontrollistener)
    {
        super(context);
        mTimeSpan = j;
        mCollection = i;
        mLeaderboardVariantControl = leaderboardcollectioncontrollistener;
        mBackgroundColor = 0;
    }

    public final int getItemViewType()
    {
        return 0x7f040093;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LeaderboardScoreHeaderViewHolder(mInflater.inflate(0x7f040093, viewgroup, false));
    }




/*
    static int access$1000(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid position: ")).append(i).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;
        }
    }

*/


/*
    static int access$102(LeaderboardScoreHeaderAdapter leaderboardscoreheaderadapter, int i)
    {
        leaderboardscoreheaderadapter.mCollection = i;
        return i;
    }

*/





/*
    static int access$402(LeaderboardScoreHeaderAdapter leaderboardscoreheaderadapter, int i)
    {
        leaderboardscoreheaderadapter.mTimeSpan = i;
        return i;
    }

*/


/*
    static int access$500(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid timeSpan: ")).append(i).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;
        }
    }

*/




}
