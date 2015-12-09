// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.dominos.beacon.view.BeaconStoreOrderView;
import com.dominos.beacon.view.BeaconStoreOrderView_;

public class BeaconOrderAdapter extends ArrayAdapter
{

    private final Context mContext;

    public BeaconOrderAdapter(Context context)
    {
        super(context, 0x7f0300c2);
        mContext = context;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = BeaconStoreOrderView_.build(mContext);
        }
        ((BeaconStoreOrderView)view).bind((com.dominos.beacon.model.CarryoutOrder.Order)getItem(i));
        return view;
    }
}
