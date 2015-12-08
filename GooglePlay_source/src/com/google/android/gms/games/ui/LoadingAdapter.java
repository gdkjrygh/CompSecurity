// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter

public final class LoadingAdapter extends SingleItemRecyclerAdapter
{
    private static final class LoadingViewHolder extends SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        public LoadingViewHolder(View view)
        {
            super(view);
        }
    }


    public LoadingAdapter(Context context)
    {
        super(context);
    }

    public final int getItemViewType()
    {
        return 0x7f0d0033;
    }

    protected final SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new LoadingViewHolder(mInflater.inflate(0x7f040096, viewgroup, false));
    }
}
