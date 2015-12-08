// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

public final class SnapshotNullStateItemAdapter extends SingleItemRecyclerAdapter
{
    private static final class SnapshotNullStateViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        public SnapshotNullStateViewHolder(View view)
        {
            super(view);
        }
    }


    public SnapshotNullStateItemAdapter(Context context)
    {
        super(context);
    }

    public final int getItemViewType()
    {
        return 0x7f0400da;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new SnapshotNullStateViewHolder(mInflater.inflate(0x7f0400da, viewgroup, false));
    }
}
