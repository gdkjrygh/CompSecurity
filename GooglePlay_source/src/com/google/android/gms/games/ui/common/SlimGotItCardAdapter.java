// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;

public final class SlimGotItCardAdapter extends OnyxGotItCardAdapter
{

    public SlimGotItCardAdapter(Context context, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data data, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener gotiteventlistener)
    {
        super(context, data, gotiteventlistener, null, false);
    }

    public final int getItemViewType()
    {
        return 0x7f0d0041;
    }

    protected final volatile com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.OnyxGotItCardViewHolder(mInflater.inflate(0x7f0400d8, viewgroup, false));
    }
}
