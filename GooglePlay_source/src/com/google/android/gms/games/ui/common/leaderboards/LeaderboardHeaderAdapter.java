// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;

public final class LeaderboardHeaderAdapter extends SingleItemRecyclerAdapter
{
    private static final class LeaderboardHeaderViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        private final TextView mTitleTextView;

        public LeaderboardHeaderViewHolder(View view)
        {
            super(view);
            mTitleTextView = (TextView)view.findViewById(0x7f0d0075);
            UiUtils.heightAdjustLeftTextViewDrawable(mTitleTextView, 1.0F);
        }
    }


    public LeaderboardHeaderAdapter(Context context)
    {
        super(context);
    }

    public final int getItemViewType()
    {
        return 0x7f0400e4;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LeaderboardHeaderViewHolder(mInflater.inflate(0x7f0400e4, viewgroup, false));
    }
}
