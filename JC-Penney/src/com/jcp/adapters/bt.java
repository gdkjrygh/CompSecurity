// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jcp.model.GetAddressResponseModel;
import java.util.List;

public class bt extends BaseAdapter
{

    private Activity a;
    private List b;

    public bt(Activity activity, List list)
    {
        a = activity;
        b = list;
    }

    public int getCount()
    {
        return b.size();
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
        view = ((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f0300ba, viewgroup, false);
        viewgroup = (TextView)view.findViewById(0x7f0e039f);
        TextView textview = (TextView)view.findViewById(0x7f0e03a0);
        TextView textview1 = (TextView)view.findViewById(0x7f0e03a1);
        TextView textview2 = (TextView)view.findViewById(0x7f0e03a2);
        TextView textview3 = (TextView)view.findViewById(0x7f0e03a3);
        TextView textview4 = (TextView)view.findViewById(0x7f0e03a4);
        viewgroup.setText(((GetAddressResponseModel)b.get(i)).getFirstName());
        textview.setText(((GetAddressResponseModel)b.get(i)).getLastName());
        textview1.setText(((GetAddressResponseModel)b.get(i)).getAddressLineOne());
        if ("APO/FPO/DPO".equalsIgnoreCase(((GetAddressResponseModel)b.get(i)).getCountry()))
        {
            textview2.setText(((GetAddressResponseModel)b.get(i)).getMilitaryAddressType());
        } else
        {
            textview2.setText(((GetAddressResponseModel)b.get(i)).getCity());
        }
        textview3.setText(((GetAddressResponseModel)b.get(i)).getState());
        textview4.setText(((GetAddressResponseModel)b.get(i)).getZip());
        return view;
    }
}
