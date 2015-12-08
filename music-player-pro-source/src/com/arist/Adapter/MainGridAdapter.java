// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.arist.entity.ButtonInfo;
import java.util.ArrayList;

public class MainGridAdapter extends BaseAdapter
{
    private class ViewHolder
    {

        private ImageView ivButtonInfo;
        final MainGridAdapter this$0;
        private TextView tvButtonInfoDes;
        private TextView tvButtonInfoTitle;







        private ViewHolder()
        {
            this$0 = MainGridAdapter.this;
            super();
        }

        ViewHolder(ViewHolder viewholder)
        {
            this();
        }
    }


    private ArrayList btnInfos;
    private LayoutInflater inflater;

    public MainGridAdapter(Context context, ArrayList arraylist)
    {
        inflater = LayoutInflater.from(context);
        setData(arraylist);
    }

    public int getCount()
    {
        return btnInfos.size();
    }

    public Object getItem(int i)
    {
        return btnInfos.get(i);
    }

    public long getItemId(int i)
    {
        return (long)((ButtonInfo)btnInfos.get(i)).getBtnResId();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ButtonInfo buttoninfo;
        if (view == null)
        {
            view = inflater.inflate(0x7f03000b, null);
            viewgroup = new ViewHolder(null);
            viewgroup.ivButtonInfo = (ImageView)view.findViewById(0x7f0d0041);
            viewgroup.tvButtonInfoTitle = (TextView)view.findViewById(0x7f0d0042);
            viewgroup.tvButtonInfoDes = (TextView)view.findViewById(0x7f0d0043);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        buttoninfo = (ButtonInfo)btnInfos.get(i);
        ((ViewHolder) (viewgroup)).ivButtonInfo.setImageResource(buttoninfo.getBtnResId());
        ((ViewHolder) (viewgroup)).tvButtonInfoTitle.setText(buttoninfo.getBtnTitle());
        ((ViewHolder) (viewgroup)).tvButtonInfoDes.setText(buttoninfo.getBtnDes());
        return view;
    }

    public void setData(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            btnInfos = arraylist;
            return;
        } else
        {
            btnInfos = new ArrayList();
            return;
        }
    }
}
