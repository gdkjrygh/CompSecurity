// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.views.LabsCouponView;
import com.dominos.views.LabsCouponView_;
import java.util.List;

public class LabsCouponListAdapter extends BaseAdapter
{

    Context context;
    List couponList;

    public LabsCouponListAdapter()
    {
    }

    public int getCount()
    {
        return couponList.size();
    }

    public Coupon getItem(int i)
    {
        return (Coupon)couponList.get(i);
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
        if (view == null)
        {
            view = LabsCouponView_.build(context);
        }
        if (i == 0)
        {
            view.setBackgroundResource(0x7f02013a);
        } else
        if (i == getCount() - 1)
        {
            view.setBackgroundResource(0x7f020137);
        } else
        {
            view.setBackgroundResource(0x7f020138);
        }
        viewgroup = (TextView)view.findViewById(0x7f0f01c4);
        if (viewgroup != null && couponList.size() > 0)
        {
            viewgroup.setText(Integer.toString(i + 1));
        }
        ((LabsCouponView)view).bind(getItem(i), i);
        return view;
    }

    public void setCouponList(List list)
    {
        couponList = list;
    }
}
