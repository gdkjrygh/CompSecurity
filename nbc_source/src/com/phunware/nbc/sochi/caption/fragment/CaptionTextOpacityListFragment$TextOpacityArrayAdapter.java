// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionTextOpacityListFragment

public static class mOpacities extends BaseAdapter
{

    private final LayoutInflater mInflater;
    private final String mOpacities[];

    public int getCount()
    {
        return 3;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return mOpacities[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ImageView imageview;
        view = mInflater.inflate(0x7f040059, viewgroup, false);
        viewgroup = (TextView)view.findViewById(0x1020014);
        imageview = (ImageView)view.findViewById(0x7f0f0125);
        i;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 74
    //                   2 84;
           goto _L1 _L2 _L3
_L1:
        imageview.setImageResource(0x7f020073);
_L5:
        viewgroup.setText(getItem(i));
        return view;
_L2:
        imageview.setImageResource(0x7f020074);
        continue; /* Loop/switch isn't completed */
_L3:
        imageview.setImageResource(0x7f020075);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public (Context context)
    {
        mInflater = LayoutInflater.from(context);
        mOpacities = context.getResources().getStringArray(0x7f0d0007);
    }
}
