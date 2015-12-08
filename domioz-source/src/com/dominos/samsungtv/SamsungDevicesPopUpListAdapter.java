// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.utils.AnalyticsUtil;
import com.samsung.multiscreen.device.Device;
import java.util.ArrayList;
import java.util.List;

public class SamsungDevicesPopUpListAdapter extends BaseAdapter
{

    AnalyticsUtil mAnalyticsUtil;
    private Context mContext;
    private List mDevicesList;
    MobileSession mMobileSession;

    public SamsungDevicesPopUpListAdapter(Context context)
    {
        mContext = context;
        mDevicesList = new ArrayList();
    }

    public int getCount()
    {
        return mDevicesList.size();
    }

    public Object getItem(int i)
    {
        return mDevicesList.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f030053, null);
        }
        view = (TextView)viewgroup.findViewById(0x7f0f01df);
        view.setText(((Device)mDevicesList.get(i)).a().toUpperCase());
        FontManager.applyDominosFont(view);
        return viewgroup;
    }

    public void updateDeviceList(List list)
    {
        mDevicesList = list;
        mAnalyticsUtil.postSamsungTvUpdateDeviceList();
        notifyDataSetChanged();
    }
}
