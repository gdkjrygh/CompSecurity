// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.adapter;

import android.content.Context;
import android.location.Address;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.List;

public class MapRecentSearchAdapter extends ArrayAdapter
    implements Filterable
{

    private LayoutInflater mLayoutInflator;
    List suggestAddresses;

    public MapRecentSearchAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        mLayoutInflator = (LayoutInflater)context.getSystemService("layout_inflater");
        suggestAddresses = list;
    }

    public int getCount()
    {
        if (suggestAddresses == null)
        {
            return 0;
        } else
        {
            return suggestAddresses.size();
        }
    }

    public Address getItem(int i)
    {
        if (suggestAddresses == null)
        {
            return null;
        } else
        {
            return (Address)suggestAddresses.get(i);
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class ViewHolder {}

        if (view == null)
        {
            viewgroup = new ViewHolder();
            view = mLayoutInflator.inflate(0x7f0300e5, null);
            viewgroup.textMenuItem = (TextView)view.findViewById(0x7f0d05e1);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        if (getItem(i) != null)
        {
            ((ViewHolder) (viewgroup)).textMenuItem.setText(getItem(i).getFeatureName());
        }
        return view;
    }

    public void setAddresses(List list)
    {
        suggestAddresses = list;
    }
}
