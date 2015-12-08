// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InboxNearbyPlayersView

public final class InboxNearbyPlayersAdapter extends SingleItemRecyclerAdapter
{
    public static interface InboxNearbyPlayersEventListener
    {

        public abstract void onInboxNearbyPlayersClicked(boolean flag);
    }

    private static final class InboxNearbyPlayersViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener
    {

        private final InboxNearbyPlayersView mView;

        public final void onClick(View view)
        {
            view = (InboxNearbyPlayersAdapter)mAdapter;
            if (((InboxNearbyPlayersAdapter) (view)).mListener != null)
            {
                InboxNearbyPlayersEventListener inboxnearbyplayerseventlistener = ((InboxNearbyPlayersAdapter) (view)).mListener;
                boolean flag;
                if (!((InboxNearbyPlayersAdapter) (view)).mIsNearbyPlayersEnabled)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                inboxnearbyplayerseventlistener.onInboxNearbyPlayersClicked(flag);
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (InboxNearbyPlayersAdapter)gamesrecycleradapter;
            mView.populateViews(((InboxNearbyPlayersAdapter) (gamesrecycleradapter)).mIsNearbyPlayersEnabled, ((InboxNearbyPlayersAdapter) (gamesrecycleradapter)).mNumPlayersNearby);
        }

        public InboxNearbyPlayersViewHolder(View view)
        {
            super(view);
            mView = (InboxNearbyPlayersView)view.findViewById(0x7f0d01b8);
            mView.setOnClickListener(this);
        }
    }


    private boolean mIsNearbyPlayersEnabled;
    private InboxNearbyPlayersEventListener mListener;
    private int mNumPlayersNearby;

    public InboxNearbyPlayersAdapter(GamesFragmentActivity gamesfragmentactivity, InboxNearbyPlayersEventListener inboxnearbyplayerseventlistener)
    {
        super(gamesfragmentactivity, gamesfragmentactivity.mConfiguration.isClientUi());
        mNumPlayersNearby = -1;
        mListener = inboxnearbyplayerseventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f040089;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new InboxNearbyPlayersViewHolder(mInflater.inflate(0x7f040089, viewgroup, false));
    }

    public final void setNearbyPlayersEnabled(boolean flag)
    {
        mIsNearbyPlayersEnabled = flag;
        if (!mIsNearbyPlayersEnabled)
        {
            mNumPlayersNearby = -1;
        }
        notifySingleItemChanged();
    }

    public final void setNumPlayersNearby(int i)
    {
        if (!mIsNearbyPlayersEnabled)
        {
            return;
        } else
        {
            mNumPlayersNearby = i;
            notifySingleItemChanged();
            return;
        }
    }



}
