// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter
{
    public static class ListViewItemModel
    {

        public boolean isHeader;
        public String title;

        public ListViewItemModel(String s)
        {
            this(s, false);
        }

        public ListViewItemModel(String s, boolean flag)
        {
            title = s;
            isHeader = flag;
        }
    }

    public static class ViewHolder
    {

        public final TextView textHolder;

        public ViewHolder(TextView textview)
        {
            textHolder = textview;
        }
    }


    public ListViewAdapter(Context context)
    {
        super(context, 0);
    }

    public void addHeader(String s)
    {
        add(new ListViewItemModel(s, true));
    }

    public void addItem(String s)
    {
        add(new ListViewItemModel(s, false));
    }

    public int getItemViewType(int i)
    {
        return !((ListViewItemModel)getItem(i)).isHeader ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ListViewItemModel listviewitemmodel = (ListViewItemModel)getItem(i);
        Object obj = null;
        viewgroup = view;
        view = viewgroup;
        if (viewgroup == null)
        {
            i = 0x7f040029;
            if (listviewitemmodel.isHeader)
            {
                i = 0x7f04004e;
            }
            view = LayoutInflater.from(getContext().getApplicationContext()).inflate(i, null);
            view.setTag(new ViewHolder((TextView)view.findViewById(0x7f0f0047)));
        }
        viewgroup = obj;
        if (true)
        {
            viewgroup = obj;
            if (view != null)
            {
                Object obj1 = view.getTag();
                viewgroup = obj;
                if (obj1 instanceof ViewHolder)
                {
                    viewgroup = (ViewHolder)obj1;
                }
            }
        }
        if (listviewitemmodel != null && viewgroup != null && ((ViewHolder) (viewgroup)).textHolder != null)
        {
            ((ViewHolder) (viewgroup)).textHolder.setText(listviewitemmodel.title);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return !((ListViewItemModel)getItem(i)).isHeader;
    }
}
