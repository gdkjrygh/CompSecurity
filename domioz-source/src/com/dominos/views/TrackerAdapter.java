// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.utils.StoreNumberOrder;
import java.text.DateFormat;
import java.util.ArrayList;

public class TrackerAdapter extends BaseAdapter
{

    private LayoutInflater inflater;
    private ArrayList orders;

    public TrackerAdapter(Context context, ArrayList arraylist)
    {
        orders = arraylist;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return orders.size();
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = inflater.inflate(0x7f0300b8, null);
        }
        view = (StoreNumberOrder)orders.get(i);
        viewgroup.setTag(orders.get(i));
        Object obj = (TextView)viewgroup.findViewById(0x7f0f03c1);
        if (((StoreNumberOrder) (view)).storeProfile != null)
        {
            ((TextView) (obj)).setText(((StoreNumberOrder) (view)).storeProfile.getAddressDescription());
        }
        ((TextView)viewgroup.findViewById(0x7f0f03c4)).setText(StringHelper.formatWithISOStandard(((StoreNumberOrder)orders.get(i)).status.getOrderDescription().trim()));
        view = (TextView)viewgroup.findViewById(0x7f0f03c5);
        obj = ((StoreNumberOrder)orders.get(i)).status.getTakeCompleteTime().toDate();
        DateFormat dateformat = DateFormat.getDateTimeInstance();
        view.setText((new StringBuilder()).append(dateformat.format(((java.util.Date) (obj)))).append("\n").toString());
        int j = orders.size();
        view = viewgroup.findViewById(0x7f0f0096);
        if (i == 0)
        {
            view.setBackgroundResource(0x7f02013a);
            return viewgroup;
        }
        if (i == j - 1)
        {
            view.setBackgroundResource(0x7f020137);
            return viewgroup;
        } else
        {
            view.setBackgroundResource(0x7f020138);
            return viewgroup;
        }
    }
}
