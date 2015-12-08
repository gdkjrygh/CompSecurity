// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.utils.AddressType;
import java.util.List;
import org.a.a.a.o;

public class LocationTypeAdapter extends BaseAdapter
{

    private LayoutInflater inflater;
    private List locationTypes;
    private final Context mContext;

    public LocationTypeAdapter(Context context)
    {
        mContext = context;
        locationTypes = AddressType.getAddressTypeList();
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return locationTypes.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x1090009, null);
        }
        viewgroup = (AddressType)locationTypes.get(i);
        ((TextView)view).setText(o.a(viewgroup.toString()));
        view.setTag(viewgroup);
        FontManager.applyDominosFont((TextView)view);
        ((TextView)view).setHeight(mContext.getResources().getDimensionPixelSize(0x7f0a00ce));
        return view;
    }

    public int getIndexOfItem(AddressType addresstype)
    {
        return locationTypes.indexOf(addresstype);
    }

    public Object getItem(int i)
    {
        return locationTypes.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = inflater.inflate(0x7f03007b, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0f031e);
        AddressType addresstype = (AddressType)locationTypes.get(i);
        view.setText(o.a(addresstype.toString()));
        view.setTag(addresstype);
        FontManager.applyDominosFont(view);
        return viewgroup;
    }
}
