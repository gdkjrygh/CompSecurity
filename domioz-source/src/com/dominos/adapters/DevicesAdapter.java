// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.samsung.multiscreen.device.Device;
import java.util.List;

public class DevicesAdapter extends ArrayAdapter
{

    public DevicesAdapter(Context context, int i, List list)
    {
        super(context, i, list);
    }

    private View initView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ((Activity)super.getContext()).getLayoutInflater().inflate(0x1090009, viewgroup, false);
        }
        viewgroup = (TextView)view;
        Device device = (Device)super.getItem(i);
        if (device != null)
        {
            viewgroup.setText((new StringBuilder()).append(device.a()).append(" - ").append(device.b()).toString());
        }
        return view;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return initView(i, view, viewgroup);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return initView(i, view, viewgroup);
    }
}
