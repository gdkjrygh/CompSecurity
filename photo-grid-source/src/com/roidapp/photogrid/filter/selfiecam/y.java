// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            v, z

final class y extends BaseAdapter
{

    private LayoutInflater a;
    private v b;

    public y(Context context, v v1)
    {
        a = LayoutInflater.from(context);
        b = v1;
    }

    public final int getCount()
    {
        return b.a();
    }

    public final Object getItem(int i)
    {
        return b.a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        if (view == null)
        {
            z z1 = new z((byte)0);
            view = a.inflate(0x7f030122, viewgroup, false);
            z1.a = (TextView)view.findViewById(0x7f0d03f7);
            view.setTag(z1);
            viewgroup = z1;
        } else
        {
            viewgroup = (z)view.getTag();
        }
        s = (String)getItem(i);
        ((z) (viewgroup)).a.setText(s);
        return view;
    }
}
