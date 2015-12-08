// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.share;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

public final class ShareGameAdapter extends SingleItemRecyclerAdapter
{
    public static interface ShareGameEventListener
    {

        public abstract void onShareGameClicked(String s, String s1);
    }

    private static final class ShareGameViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final CardView mRootView;
        private final TextView mTextView;

        public final void onClick(View view)
        {
            view = (ShareGameAdapter)mAdapter;
            ((ShareGameAdapter) (view)).mListener.onShareGameClicked(((ShareGameAdapter) (view)).mGameName, ((ShareGameAdapter) (view)).mGamePackageName);
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (ShareGameAdapter)mAdapter;
            mTextView.setText(0x7f10028a);
        }

        public ShareGameViewHolder(View view)
        {
            super(view);
            mRootView = (CardView)view;
            mRootView.setOnClickListener(this);
            mTextView = (TextView)view.findViewById(0x7f0d009f);
        }
    }


    public String mGameName;
    public String mGamePackageName;
    private final ShareGameEventListener mListener;
    private final int mTextResId = 0x7f10028a;

    public ShareGameAdapter(Context context, ShareGameEventListener sharegameeventlistener)
    {
        super(context);
        mListener = sharegameeventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f0400d2;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new ShareGameViewHolder(mInflater.inflate(0x7f0400d2, viewgroup, false));
    }




}
