// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.snapshots.SnapshotEventListener;

public final class NewSnapshotAdapter extends SingleItemRecyclerAdapter
{
    private static final class NewSnapshotViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final View mOverlay;

        public final void onClick(View view)
        {
            ((NewSnapshotAdapter)mAdapter).mListener.onNewSnapshotClicked();
        }

        public NewSnapshotViewHolder(View view)
        {
            super(view);
            mOverlay = view.findViewById(0x7f0d0072);
            mOverlay.setOnClickListener(this);
            mOverlay.setContentDescription(mOverlay.getResources().getString(0x7f1002c2));
        }
    }


    private final SnapshotEventListener mListener;

    public NewSnapshotAdapter(Context context, SnapshotEventListener snapshoteventlistener)
    {
        super(context);
        mListener = snapshoteventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f0400db;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new NewSnapshotViewHolder(mInflater.inflate(0x7f0400db, viewgroup, false));
    }

}
