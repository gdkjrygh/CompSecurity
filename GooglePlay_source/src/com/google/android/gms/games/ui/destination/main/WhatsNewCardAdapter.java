// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;

public final class WhatsNewCardAdapter extends OnyxGotItCardAdapter
{
    protected static final class WhatsNewCardViewHolder extends com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.OnyxGotItCardViewHolder
    {

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
        {
            super.populateViews(gamesrecycleradapter, i, extendedappcontentcard);
            gamesrecycleradapter = mContext.getResources();
            AppContentUtils.annotateTitleAndSubtitle(gamesrecycleradapter.getString(0x7f10031d), gamesrecycleradapter.getString(0x7f10031c), this);
        }

        public WhatsNewCardViewHolder(View view)
        {
            super(view);
        }
    }


    public WhatsNewCardAdapter(Context context)
    {
        super(context, null, null, null, true);
    }

    public final int getItemViewType()
    {
        return 0x7f0d0046;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new WhatsNewCardViewHolder(mInflater.inflate(0x7f0400ab, viewgroup, false));
    }
}
