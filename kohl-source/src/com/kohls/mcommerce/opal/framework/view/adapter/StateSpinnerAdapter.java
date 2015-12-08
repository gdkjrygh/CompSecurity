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
import java.util.ArrayList;

public class StateSpinnerAdapter extends ArrayAdapter
{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ArrayList mStateArrayList;

    public StateSpinnerAdapter(Context context, int i, ArrayList arraylist)
    {
        super(context, i);
        mContext = context;
        mStateArrayList = arraylist;
        mLayoutInflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return mStateArrayList.size() - 1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)mLayoutInflater.inflate(0x7f03010c, null);
        view.setText(((com.kohls.mcommerce.opal.common.util.StatesWithCode.State)mStateArrayList.get(i)).getStateName());
        return view;
    }

    public com.kohls.mcommerce.opal.common.util.StatesWithCode.State getItem(int i)
    {
        return (com.kohls.mcommerce.opal.common.util.StatesWithCode.State)mStateArrayList.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)mLayoutInflater.inflate(0x7f03010c, null);
        view.setPadding((int)UtilityMethods.convertDpToPixel(8F, getContext()), (int)UtilityMethods.convertDpToPixel(0.0F, getContext()), 0, (int)UtilityMethods.convertDpToPixel(0.0F, getContext()));
        view.setText(((com.kohls.mcommerce.opal.common.util.StatesWithCode.State)mStateArrayList.get(i)).getStateName());
        if (i == getCount())
        {
            view.setText(((com.kohls.mcommerce.opal.common.util.StatesWithCode.State)mStateArrayList.get(getCount())).getStateName());
            view.setTextSize(2, 13F);
            view.setTextColor(mContext.getResources().getColor(0x7f0c00e7));
        }
        return view;
    }
}
