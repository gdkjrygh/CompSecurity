// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;

public final class AchievementHeaderAdapter extends SingleItemRecyclerAdapter
{
    private static final class AchievementHeaderViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        private final TextView mTitleTextView;
        private final ProgressBar mUnlockedProgressBar;
        private final TextView mUnlockedTextView;

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (AchievementHeaderAdapter)mAdapter;
            Resources resources = mContext.getResources();
            if (!((AchievementHeaderAdapter) (gamesrecycleradapter)).mIsClientUi)
            {
                UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.25F);
                String s = resources.getString(0x7f100094, new Object[] {
                    String.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mUnlockedAchievementCount), String.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount)
                });
                mTitleTextView.setText(s);
                if (((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount == 0)
                {
                    i = 0;
                } else
                {
                    i = (((AchievementHeaderAdapter) (gamesrecycleradapter)).mUnlockedAchievementCount * 100) / ((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount;
                }
                mUnlockedTextView.setText(resources.getString(0x7f100091, new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            {
                UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.0F);
                String s1 = resources.getString(0x7f100093, new Object[] {
                    String.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mUnlockedAchievementCount), String.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount)
                });
                mUnlockedTextView.setText(s1);
            }
            mUnlockedProgressBar.setMax(((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount);
            mUnlockedProgressBar.setProgress(((AchievementHeaderAdapter) (gamesrecycleradapter)).mUnlockedAchievementCount);
            gamesrecycleradapter = resources.getString(0x7f100092, new Object[] {
                Integer.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mUnlockedAchievementCount), Integer.valueOf(((AchievementHeaderAdapter) (gamesrecycleradapter)).mTotalAchievementCount)
            });
            mUnlockedTextView.setContentDescription(gamesrecycleradapter);
        }

        public AchievementHeaderViewHolder(View view)
        {
            super(view);
            mTitleTextView = (TextView)view.findViewById(0x7f0d0075);
            mUnlockedTextView = (TextView)view.findViewById(0x7f0d029f);
            mUnlockedProgressBar = (ProgressBar)view.findViewById(0x7f0d02a0);
        }
    }


    private boolean mIsClientUi;
    int mTotalAchievementCount;
    int mUnlockedAchievementCount;

    public AchievementHeaderAdapter(Context context, boolean flag)
    {
        super(context);
        mIsClientUi = flag;
    }

    public final int getItemViewType()
    {
        return 0x7f0d002c;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        LayoutInflater layoutinflater = mInflater;
        int i;
        if (mIsClientUi)
        {
            i = 0x7f0400df;
        } else
        {
            i = 0x7f0400e0;
        }
        return new AchievementHeaderViewHolder(layoutinflater.inflate(i, viewgroup, false));
    }



}
