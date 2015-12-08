// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter, GamesRecyclerAdapter

public final class RecyclerSpacerAdapter extends SingleItemRecyclerAdapter
{
    private static final class SpacerViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (RecyclerSpacerAdapter)mAdapter;
            android.view.ViewGroup.LayoutParams layoutparams;
            if (((RecyclerSpacerAdapter) (gamesrecycleradapter)).mIsControlSpacer)
            {
                itemView.setId(0x7f0d0053);
            } else
            {
                itemView.setId(0x7f0d0044);
            }
            layoutparams = itemView.getLayoutParams();
            layoutparams.height = ((RecyclerSpacerAdapter) (gamesrecycleradapter)).mHeightPixels;
            itemView.setLayoutParams(layoutparams);
        }

        public SpacerViewHolder(View view)
        {
            super(view);
        }
    }


    private int mHeightPixels;
    private boolean mIsControlSpacer;

    public RecyclerSpacerAdapter(Context context, int i, boolean flag)
    {
        super(context);
        mHeightPixels = i;
        mIsControlSpacer = flag;
    }

    public final int getItemViewType()
    {
        return 0x7f040085;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new SpacerViewHolder(mInflater.inflate(0x7f040085, viewgroup, false));
    }


}
