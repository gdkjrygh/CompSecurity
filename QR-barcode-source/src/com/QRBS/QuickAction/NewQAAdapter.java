// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NewQAAdapter extends BaseAdapter
{
    static class ViewHolder
    {

        TextView mTitleText;

        ViewHolder()
        {
        }
    }


    private String data[];
    private LayoutInflater mInflater;

    public NewQAAdapter(Context context)
    {
        mInflater = LayoutInflater.from(context);
    }

    public int getCount()
    {
        return data.length;
    }

    public Object getItem(int i)
    {
        return data[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = mInflater.inflate(0x7f03002f, null);
            viewgroup = new ViewHolder();
            viewgroup.mTitleText = (TextView)view.findViewById(0x7f0d00a1);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        ((ViewHolder) (viewgroup)).mTitleText.setText(data[i]);
        return view;
    }

    public void setData(String as[])
    {
        data = as;
    }
}
