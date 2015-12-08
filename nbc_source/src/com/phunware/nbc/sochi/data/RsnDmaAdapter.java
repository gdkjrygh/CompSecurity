// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class RsnDmaAdapter extends BaseAdapter
{

    private List mData;
    private LayoutInflater mInflater;

    public RsnDmaAdapter(Context context)
    {
        mInflater = LayoutInflater.from(context);
        mData = new ArrayList();
    }

    public void addItem(air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma rsndma)
    {
        mData.add(rsndma);
        notifyDataSetChanged();
    }

    public void addItems(List list)
    {
        mData.addAll(list);
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return mData.size();
    }

    public Object getItem(int i)
    {
        return mData.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return super.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)mInflater.inflate(0x7f04005e, viewgroup, false);
        view.setText(((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)getItem(i)).rsn);
        return view;
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount();
    }

    public void setData(List list)
    {
        mData = list;
        notifyDataSetChanged();
    }
}
