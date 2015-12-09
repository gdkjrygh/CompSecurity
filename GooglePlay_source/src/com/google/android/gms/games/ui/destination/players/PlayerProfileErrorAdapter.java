// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

public final class PlayerProfileErrorAdapter extends SingleItemRecyclerAdapter
{
    public static interface ProfileErrorEventListener
    {

        public abstract void onErrorRetryEvent();
    }

    private static final class ProfileErrorViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            ((PlayerProfileErrorAdapter)mAdapter).mListener.onErrorRetryEvent();
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            i = mContext.getResources().getDimensionPixelSize(0x7f0c00b2);
            itemView.findViewById(0x7f0d01a9).setOnClickListener(this);
            itemView.setPadding(0, i, 0, 0);
        }

        public ProfileErrorViewHolder(View view)
        {
            super(view);
        }
    }


    private final ProfileErrorEventListener mListener;

    public PlayerProfileErrorAdapter(Context context, ProfileErrorEventListener profileerroreventlistener)
    {
        super(context);
        mListener = profileerroreventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f040067;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new ProfileErrorViewHolder(mInflater.inflate(0x7f040067, viewgroup, false));
    }

}
