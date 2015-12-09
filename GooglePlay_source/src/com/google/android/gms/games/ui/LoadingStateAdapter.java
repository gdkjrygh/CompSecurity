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

public final class LoadingStateAdapter extends SingleItemRecyclerAdapter
{
    private static final class LoadingStateViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (LoadingStateAdapter)mAdapter;
            if (((LoadingStateAdapter) (gamesrecycleradapter)).mTopPadding != -1)
            {
                i = ((LoadingStateAdapter) (gamesrecycleradapter)).mTopPadding;
            } else
            {
                i = itemView.getPaddingTop();
            }
            itemView.setPadding(itemView.getPaddingLeft(), i, itemView.getPaddingRight(), itemView.getPaddingBottom());
        }

        public LoadingStateViewHolder(View view)
        {
            super(view);
        }
    }


    public int mTopPadding;

    public LoadingStateAdapter(Context context)
    {
        super(context);
        mTopPadding = -1;
    }

    public final int getItemViewType()
    {
        return 0x7f04009a;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LoadingStateViewHolder(mInflater.inflate(0x7f04009a, viewgroup, false));
    }

}
