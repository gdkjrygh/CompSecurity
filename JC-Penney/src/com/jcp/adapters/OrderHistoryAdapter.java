// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jcp.model.OrderHistory;

public class OrderHistoryAdapter extends BaseAdapter
{

    private Context a;
    private OrderHistory b[];
    private LayoutInflater c;

    public OrderHistoryAdapter(Context context, OrderHistory aorderhistory[])
    {
        a = context;
        b = aorderhistory;
        c = (LayoutInflater)a.getSystemService("layout_inflater");
    }

    public OrderHistory a(int i)
    {
        if (b != null)
        {
            return b[i];
        } else
        {
            return null;
        }
    }

    public int getCount()
    {
        if (b != null)
        {
            return b.length;
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = a(i);
        if (view == null)
        {
            view = c.inflate(0x7f0300b0, viewgroup, false);
            viewgroup = new OrderHistoryViewHolder(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (OrderHistoryViewHolder)view.getTag();
        }
        ((OrderHistoryViewHolder) (viewgroup)).orderIdView.setText(((OrderHistory) (obj)).getOrderNumber());
        ((OrderHistoryViewHolder) (viewgroup)).orderHistoryDateView.setText(((OrderHistory) (obj)).getOrderDate());
        obj = ((OrderHistory) (obj)).getOrderStatus();
        if (obj != null)
        {
            if (((String) (obj)).equalsIgnoreCase(a.getString(0x7f0700b6)))
            {
                ((OrderHistoryViewHolder) (viewgroup)).orderHistoryStatusView.setTextColor(a.getResources().getColor(0x7f0d0097));
            }
            ((OrderHistoryViewHolder) (viewgroup)).orderHistoryStatusView.setText(((CharSequence) (obj)));
        }
        return view;
    }

    private class OrderHistoryViewHolder
    {

        protected TextView orderHistoryDateView;
        protected TextView orderHistoryStatusView;
        protected TextView orderIdView;

        public OrderHistoryViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
