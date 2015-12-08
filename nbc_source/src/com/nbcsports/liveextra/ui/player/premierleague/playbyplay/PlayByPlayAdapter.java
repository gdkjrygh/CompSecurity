// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nbcsports.liveextra.databinding.pl.PlayItemBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayItemView, PlayViewModel

public class PlayByPlayAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public ViewHolder(View view)
        {
            super(view);
        }
    }


    private final LayoutInflater inflater;
    private List list;

    public PlayByPlayAdapter(Context context)
    {
        list = new ArrayList();
        inflater = LayoutInflater.from(context);
    }

    public void clearAdapter()
    {
        if (list.size() > 0)
        {
            list.clear();
        }
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return list.size();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((ViewHolder)viewholder, i);
    }

    public void onBindViewHolder(ViewHolder viewholder, int i)
    {
        viewholder = (PlayItemView)viewholder.itemView;
        int j;
        if (i % 2 == 0)
        {
            j = viewholder.getResources().getColor(0x106000d);
        } else
        {
            j = Color.parseColor("#33333333");
        }
        viewholder.setBackgroundColor(j);
        viewholder.setPlayItem((PlayViewModel)list.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new ViewHolder(PlayItemBinding.inflate(inflater, viewgroup, false).getRoot());
    }

    public void update(List list1)
    {
        if (!list.equals(list1))
        {
            if (list.size() > list1.size())
            {
                list.clear();
            }
            if (list.isEmpty())
            {
                list1 = (PlayViewModel[])list1.toArray(new PlayViewModel[list1.size()]);
                CollectionUtils.reverseArray(list1);
                list.addAll(Arrays.asList(list1));
                notifyDataSetChanged();
                return;
            }
            int i = 0;
            list1 = list1.iterator();
            do
            {
                if (!list1.hasNext())
                {
                    break;
                }
                PlayViewModel playviewmodel = (PlayViewModel)list1.next();
                if (!list.contains(playviewmodel))
                {
                    list.add(0, playviewmodel);
                    i++;
                }
            } while (true);
            if (i > 0)
            {
                notifyItemRangeInserted(0, i);
                return;
            }
        }
    }
}
