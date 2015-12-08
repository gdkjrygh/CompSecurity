// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesRecyclerAdapter, LogflowEventListener, GamesFragmentActivity

public abstract class SingleItemRecyclerAdapter extends GamesRecyclerAdapter
{
    public static class SingleItemViewHolder extends GamesRecyclerAdapter.GamesRecyclerViewHolder
    {

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
        {
            super.populateViews(gamesrecycleradapter, i);
        }

        public final void repopulateViews()
        {
            SingleItemRecyclerAdapter singleitemrecycleradapter = (SingleItemRecyclerAdapter)mAdapter;
            if (singleitemrecycleradapter.mCard == null)
            {
                populateViews(singleitemrecycleradapter, getLocalPosition());
                return;
            } else
            {
                populateViews(singleitemrecycleradapter, getLocalPosition(), singleitemrecycleradapter.mCard);
                return;
            }
        }

        public SingleItemViewHolder(View view)
        {
            super(view);
        }
    }


    protected ExtendedAppContentCard mCard;
    public final Context mContext;
    public final LayoutInflater mInflater;
    private boolean mVisible;

    public SingleItemRecyclerAdapter(Context context)
    {
        this(context, true);
    }

    public SingleItemRecyclerAdapter(Context context, boolean flag)
    {
        mVisible = true;
        Asserts.checkState(context instanceof LogflowEventListener);
        mContext = context;
        mInflater = GamesFragmentActivity.getGamesLayoutInflater(context);
        mVisible = flag;
        mLogListener = (LogflowEventListener)mContext;
    }

    public final int getItemCount()
    {
        return !isVisible() ? 0 : 1;
    }

    public abstract int getItemViewType();

    public final int getItemViewType(int i)
    {
        return getItemViewType();
    }

    public int getSpanCount()
    {
        return 1;
    }

    public final boolean isVisible()
    {
        return super.isVisible() && mVisible;
    }

    public final void notifySingleItemChanged()
    {
        if (isVisible())
        {
            notifyItemChanged(0);
        }
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((SingleItemViewHolder)viewholder, i);
    }

    public void onBindViewHolder(SingleItemViewHolder singleitemviewholder, int i)
    {
        if (mCard == null)
        {
            singleitemviewholder.populateViews(this, i);
            return;
        } else
        {
            singleitemviewholder.populateViews(this, i, mCard);
            return;
        }
    }

    public abstract SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup);

    public final volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateItemViewHolder(viewgroup);
    }

    public final void setCard(ExtendedAppContentCard extendedappcontentcard)
    {
        mCard = extendedappcontentcard;
        mCard.checkConditions();
        setVisible(mCard.mVisible);
        notifySingleItemChanged();
    }

    public final void setVisible(boolean flag)
    {
label0:
        {
            boolean flag1 = isVisible();
            mVisible = flag;
            flag = isVisible();
            if (flag1 != flag)
            {
                if (!flag)
                {
                    break label0;
                }
                notifyItemInserted(0);
            }
            return;
        }
        notifyItemRemoved(0);
    }

    public boolean usesLoadImage()
    {
        return false;
    }
}
