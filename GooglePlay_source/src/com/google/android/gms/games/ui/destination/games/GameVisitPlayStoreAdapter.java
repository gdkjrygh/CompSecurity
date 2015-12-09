// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

public final class GameVisitPlayStoreAdapter extends SingleItemRecyclerAdapter
{
    private static final class GameVisitPlayStoreViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            ((GameVisitPlayStoreAdapter)mAdapter).mListener.onVisitPlayStoreClicked();
        }

        public GameVisitPlayStoreViewHolder(View view)
        {
            super(view);
            view.setOnClickListener(this);
        }
    }

    public static interface VisitPlayStoreEventListener
    {

        public abstract void onVisitPlayStoreClicked();
    }


    private final VisitPlayStoreEventListener mListener;

    public GameVisitPlayStoreAdapter(Context context, VisitPlayStoreEventListener visitplaystoreeventlistener)
    {
        super(context);
        mListener = visitplaystoreeventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f0400f4;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e0037);
    }

    public final int getTopPaddingResId()
    {
        return 0x7f0c0130;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new GameVisitPlayStoreViewHolder(mInflater.inflate(0x7f0400f4, viewgroup, false));
    }

}
