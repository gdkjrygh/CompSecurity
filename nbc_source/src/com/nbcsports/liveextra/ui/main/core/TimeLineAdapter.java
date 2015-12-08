// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nbcsports.liveextra.library.api.models.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModel, TimelineItemView

public class TimeLineAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public class DateHolder extends android.support.v7.widget.RecyclerView.ViewHolder
        implements android.view.View.OnClickListener
    {

        final TimeLineAdapter this$0;

        public void bind(DateTime datetime)
        {
            ((TimelineItemView)itemView).bind(datetime);
            datetime = itemView;
            boolean flag;
            if (getPosition() == selection)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            datetime.setSelected(flag);
        }

        public void onClick(View view)
        {
            selectItem(getPosition());
            itemView.setSelected(true);
            listener.onItemClick((DateTime)list.get(getPosition()));
        }

        public DateHolder(View view)
        {
            this$0 = TimeLineAdapter.this;
            super(view);
            view.setOnClickListener(this);
        }
    }

    public static interface OnItemClickListener
    {

        public abstract void onItemClick(DateTime datetime);
    }


    private final LayoutInflater inflater;
    private List list;
    private final OnItemClickListener listener;
    private int selection;

    public TimeLineAdapter(Context context, OnItemClickListener onitemclicklistener)
    {
        list = new ArrayList();
        selection = 0;
        listener = onitemclicklistener;
        inflater = LayoutInflater.from(context);
    }

    public int findPositionByTime(Long long1)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (getItemId(i) == long1.longValue())
            {
                return i;
            }
        }

        return 0;
    }

    public int getItemCount()
    {
        return list.size();
    }

    public long getItemId(int i)
    {
        DateTime datetime = (DateTime)list.get(i);
        if (datetime == null)
        {
            return 0L;
        } else
        {
            return datetime.getMillis();
        }
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        ((DateHolder)viewholder).bind((DateTime)list.get(i));
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new DateHolder(inflater.inflate(0x7f040049, viewgroup, false));
    }

    public void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        super.onViewAttachedToWindow(viewholder);
        View view = viewholder.itemView;
        boolean flag;
        if (viewholder.getPosition() == selection)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
    }

    public void selectItem(int i)
    {
        selection = i;
        notifyDataSetChanged();
    }

    public void update(List list1)
    {
        Iterator iterator = list1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            list1 = (AssetViewModel)iterator.next();
            if (list1.isLive())
            {
                list1 = null;
            } else
            {
                list1 = list1.asset().getAiringDate();
            }
            if (!list.contains(list1))
            {
                list.add(list1);
            }
        } while (true);
    }



}
