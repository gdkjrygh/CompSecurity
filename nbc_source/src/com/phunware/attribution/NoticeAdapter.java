// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.attribution;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class NoticeAdapter extends BaseAdapter
{
    private static class ViewHolder
    {

        public TextView name;
        public TextView text;

        public ViewHolder(View view)
        {
            name = (TextView)view.findViewById(0x7f0f011f);
            text = (TextView)view.findViewById(0x7f0f0120);
            view.setTag(this);
        }
    }


    private List mItems;

    public NoticeAdapter(List list)
    {
        mItems = list;
        if (mItems == null)
        {
            mItems = new ArrayList();
        }
    }

    public int getCount()
    {
        return mItems.size();
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040055, viewgroup, false);
            viewgroup = new ViewHolder(view);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        ((ViewHolder) (viewgroup)).name.setText(((AttributionParser.Notice)getItem(i)).name);
        ((ViewHolder) (viewgroup)).text.setText(((AttributionParser.Notice)getItem(i)).noticeText);
        return view;
    }
}
