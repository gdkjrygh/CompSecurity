// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LabsCouponSpinnerAdapter extends BaseAdapter
{

    Context context;
    private HashMap couponCategoryMap;
    private ArrayList couponCategoryNames;
    LayoutInflater inflater;

    public LabsCouponSpinnerAdapter()
    {
        couponCategoryNames = new ArrayList();
        couponCategoryMap = new HashMap();
    }

    public int getCount()
    {
        return couponCategoryNames.size();
    }

    public List getCouponsInCategory(int i)
    {
        return (List)couponCategoryMap.get(couponCategoryNames.get(i));
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x1090009, null);
        }
        ((TextView)view).setText((CharSequence)couponCategoryNames.get(i));
        ((TextView)view).setHeight(context.getResources().getDimensionPixelSize(0x7f0a00ce));
        return view;
    }

    public Object getItem(int i)
    {
        return couponCategoryNames.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x1090008, null);
        }
        ((TextView)view).setText((CharSequence)couponCategoryNames.get(i));
        return view;
    }

    public void setCategories(List list)
    {
        LabsCategory labscategory;
        for (list = list.iterator(); list.hasNext(); couponCategoryMap.put(labscategory.getName(), labscategory.getProducts()))
        {
            labscategory = (LabsCategory)list.next();
            couponCategoryNames.add(labscategory.getName());
        }

        Collections.sort(couponCategoryNames);
    }
}
