// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.achievements:
//            AchievementHeaderAdapter

private static final class mUnlockedProgressBar extends com.google.android.gms.games.ui.entHeaderViewHolder
{

    private final TextView mTitleTextView;
    private final ProgressBar mUnlockedProgressBar;
    private final TextView mUnlockedTextView;

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        super.teViews(gamesrecycleradapter, i);
        gamesrecycleradapter = (AchievementHeaderAdapter)mAdapter;
        Resources resources = mContext.getResources();
        if (!AchievementHeaderAdapter.access$000(gamesrecycleradapter))
        {
            UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.25F);
            String s = resources.getString(0x7f100094, new Object[] {
                String.valueOf(AchievementHeaderAdapter.access$100(gamesrecycleradapter)), String.valueOf(AchievementHeaderAdapter.access$200(gamesrecycleradapter))
            });
            mTitleTextView.setText(s);
            if (AchievementHeaderAdapter.access$200(gamesrecycleradapter) == 0)
            {
                i = 0;
            } else
            {
                i = (AchievementHeaderAdapter.access$100(gamesrecycleradapter) * 100) / AchievementHeaderAdapter.access$200(gamesrecycleradapter);
            }
            mUnlockedTextView.setText(resources.getString(0x7f100091, new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.0F);
            String s1 = resources.getString(0x7f100093, new Object[] {
                String.valueOf(AchievementHeaderAdapter.access$100(gamesrecycleradapter)), String.valueOf(AchievementHeaderAdapter.access$200(gamesrecycleradapter))
            });
            mUnlockedTextView.setText(s1);
        }
        mUnlockedProgressBar.setMax(AchievementHeaderAdapter.access$200(gamesrecycleradapter));
        mUnlockedProgressBar.setProgress(AchievementHeaderAdapter.access$100(gamesrecycleradapter));
        gamesrecycleradapter = resources.getString(0x7f100092, new Object[] {
            Integer.valueOf(AchievementHeaderAdapter.access$100(gamesrecycleradapter)), Integer.valueOf(AchievementHeaderAdapter.access$200(gamesrecycleradapter))
        });
        mUnlockedTextView.setContentDescription(gamesrecycleradapter);
    }

    public (View view)
    {
        super(view);
        mTitleTextView = (TextView)view.findViewById(0x7f0d0075);
        mUnlockedTextView = (TextView)view.findViewById(0x7f0d029f);
        mUnlockedProgressBar = (ProgressBar)view.findViewById(0x7f0d02a0);
    }
}
