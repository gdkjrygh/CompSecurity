// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nbcsports.liveextra.databinding.pl.EventItemBinding;
import com.nbcsports.liveextra.databinding.pl.GoalEventItemBinding;
import com.nbcsports.liveextra.databinding.pl.RedCardEventItemBinding;
import com.nbcsports.liveextra.databinding.pl.SubstitutionEventItemBinding;
import com.nbcsports.liveextra.databinding.pl.YellowCardEventItemBinding;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemView

public class EventsAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final EventsAdapter this$0;

        public ViewHolder(View view)
        {
            this$0 = EventsAdapter.this;
            super(view);
        }
    }


    private final LayoutInflater inflater;
    private List list;

    public EventsAdapter(Context context)
    {
        list = new ArrayList();
        inflater = LayoutInflater.from(context);
    }

    public boolean add(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        if (list.contains(timelineevent))
        {
            return false;
        } else
        {
            list.add(timelineevent);
            notifyItemInserted(list.size() - 1);
            return true;
        }
    }

    public void clearAdapter()
    {
        if (list != null)
        {
            list.clear();
        }
        notifyDataSetChanged();
    }

    public int getItemCount()
    {
        return list.size();
    }

    public int getItemViewType(int i)
    {
        com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent;
        String s;
        timelineevent = (com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)list.get(i);
        s = timelineevent.getEventType();
        s.hashCode();
        JVM INSTR lookupswitch 5: default 72
    //                   -125692011: 110
    //                   83488: 166
    //                   2092848: 152
    //                   2224947: 138
    //                   57044878: 124;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        i = -1;
_L8:
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            if (timelineevent.getType().contains("Red"))
            {
                return 2;
            }
            return !timelineevent.getType().contains("Yellow") ? -1 : 3;

        case 4: // '\004'
            return 4;
        }
_L2:
        if (!s.equals("StartHalf")) goto _L1; else goto _L7
_L7:
        i = 0;
          goto _L8
_L6:
        if (!s.equals("EndHalf")) goto _L1; else goto _L9
_L9:
        i = 1;
          goto _L8
_L5:
        if (!s.equals("Goal")) goto _L1; else goto _L10
_L10:
        i = 2;
          goto _L8
_L4:
        if (!s.equals("Card")) goto _L1; else goto _L11
_L11:
        i = 3;
          goto _L8
_L3:
        if (!s.equals("Sub")) goto _L1; else goto _L12
_L12:
        i = 4;
          goto _L8
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((ViewHolder)viewholder, i);
    }

    public void onBindViewHolder(ViewHolder viewholder, int i)
    {
        ((EventItemView)viewholder.itemView).loadEvent((com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent)list.get(i));
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return new ViewHolder(EventItemBinding.inflate(inflater, viewgroup, false).getRoot());

        case 1: // '\001'
            return new ViewHolder(GoalEventItemBinding.inflate(inflater, viewgroup, false).getRoot());

        case 2: // '\002'
            return new ViewHolder(RedCardEventItemBinding.inflate(inflater, viewgroup, false).getRoot());

        case 3: // '\003'
            return new ViewHolder(YellowCardEventItemBinding.inflate(inflater, viewgroup, false).getRoot());

        case 4: // '\004'
            return new ViewHolder(SubstitutionEventItemBinding.inflate(inflater, viewgroup, false).getRoot());
        }
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
