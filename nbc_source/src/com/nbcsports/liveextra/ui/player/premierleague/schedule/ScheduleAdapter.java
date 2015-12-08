// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleViewModel, ScheduleItemView

public class ScheduleAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final ScheduleAdapter this$0;

        public ScheduleItemView getView()
        {
            return (ScheduleItemView)itemView;
        }

        public ViewHolder(View view)
        {
            this$0 = ScheduleAdapter.this;
            super(view);
        }
    }


    private final LayoutInflater inflater;
    private List list;

    public ScheduleAdapter(Context context)
    {
        list = new ArrayList();
        inflater = LayoutInflater.from(context);
    }

    public int getItemCount()
    {
        return list.size();
    }

    public int getItemViewType(int i)
    {
        String s;
        s = ((ScheduleViewModel)list.get(i)).getViewType();
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 48
    //                   -1247229694: 88
    //                   1395682844: 74;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_88;
_L4:
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;
        }
_L3:
        if (s.equals("FullTime"))
        {
            i = 0;
        }
          goto _L4
        if (s.equals("PreMatch"))
        {
            i = 1;
        }
          goto _L4
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((ViewHolder)viewholder, i);
    }

    public void onBindViewHolder(ViewHolder viewholder, int i)
    {
        viewholder.getView().setViewModel((ScheduleViewModel)list.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 46
    //                   1 61;
           goto _L1 _L2 _L3
_L1:
        viewgroup = inflater.inflate(0x7f040087, viewgroup, false);
_L5:
        return new ViewHolder(viewgroup);
_L2:
        viewgroup = inflater.inflate(0x7f040086, viewgroup, false);
        continue; /* Loop/switch isn't completed */
_L3:
        viewgroup = inflater.inflate(0x7f040085, viewgroup, false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void update(List list1)
    {
        if (list.equals(list1))
        {
            return;
        } else
        {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
            return;
        }
    }
}
