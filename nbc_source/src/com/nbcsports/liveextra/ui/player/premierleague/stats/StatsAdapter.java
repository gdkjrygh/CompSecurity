// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nbcsports.liveextra.databinding.pl.StatBinding;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsItemViewModel

public class StatsAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class StatsViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        private StatsItemViewModel stat;

        public StatsItemViewModel getStat()
        {
            return stat;
        }

        public void setStat(StatsItemViewModel statsitemviewmodel)
        {
            stat = statsitemviewmodel;
        }

        public StatsViewHolder(View view)
        {
            super(view);
        }
    }


    private final LayoutInflater inflater;
    private List stats;

    public StatsAdapter(Context context)
    {
        stats = new ArrayList();
        inflater = LayoutInflater.from(context);
    }

    public int getItemCount()
    {
        return stats.size();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((StatsViewHolder)viewholder, i);
    }

    public void onBindViewHolder(StatsViewHolder statsviewholder, int i)
    {
        statsviewholder.setStat((StatsItemViewModel)stats.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public StatsViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new StatsViewHolder(StatBinding.inflate(inflater, viewgroup, false).getRoot());
    }

    public volatile void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        onViewAttachedToWindow((StatsViewHolder)viewholder);
    }

    public void onViewAttachedToWindow(StatsViewHolder statsviewholder)
    {
        super.onViewAttachedToWindow(statsviewholder);
        ((StatBinding)DataBindingUtil.getBinding(statsviewholder.itemView)).setStat(statsviewholder.getStat());
    }

    public void update(List list)
    {
        if (!stats.isEmpty()) goto _L2; else goto _L1
_L1:
        stats.addAll(list);
        notifyDataSetChanged();
_L4:
        return;
_L2:
        if (!stats.equals(list))
        {
            int i = 0;
            while (i < list.size()) 
            {
                StatsItemViewModel statsitemviewmodel = (StatsItemViewModel)list.get(i);
                if (!statsitemviewmodel.equals((StatsItemViewModel)stats.get(i)))
                {
                    stats.set(i, statsitemviewmodel);
                    notifyItemChanged(i);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
