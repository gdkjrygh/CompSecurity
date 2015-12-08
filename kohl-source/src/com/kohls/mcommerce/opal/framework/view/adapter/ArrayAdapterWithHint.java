// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

public class ArrayAdapterWithHint extends ArrayAdapter
{

    private String mArrayList[];
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public ArrayAdapterWithHint(Context context, int i, String as[])
    {
        super(context, i);
        mContext = context;
        mArrayList = as;
        mLayoutInflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return mArrayList.length - 1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)mLayoutInflater.inflate(0x7f03010c, null);
        view.setText(mArrayList[i]);
        return view;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return mArrayList[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)mLayoutInflater.inflate(0x7f03010c, null);
        view.setPadding((int)UtilityMethods.convertDpToPixel(8F, getContext()), (int)UtilityMethods.convertDpToPixel(0.0F, getContext()), 0, (int)UtilityMethods.convertDpToPixel(0.0F, getContext()));
        view.setText(mArrayList[i]);
        if (i == getCount())
        {
            view.setText(mArrayList[getCount()]);
            view.setTextSize(2, 13F);
            view.setTextColor(mContext.getResources().getColor(0x7f0c00e7));
        }
        return view;
    }
}
