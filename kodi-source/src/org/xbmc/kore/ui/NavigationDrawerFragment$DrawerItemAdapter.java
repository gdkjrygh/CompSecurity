// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            NavigationDrawerFragment

public static class hostItemColor extends ArrayAdapter
{

    private int hostItemColor;
    private int selectedItemColor;

    public int getItemViewType(int i)
    {
        return ((hostItemColor)getItem(i)).getItem;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItem getitem = (getItem)getItem(i);
        getitem.getItem;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 175
    //                   1 46
    //                   2 73;
           goto _L1 _L2 _L3 _L4
_L1:
        View view3 = view;
_L6:
        return view3;
_L3:
        view3 = view;
        if (view != null) goto _L6; else goto _L5
_L5:
        return ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030043, viewgroup, false);
_L4:
        View view1;
        view1 = view;
        if (view == null)
        {
            view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030042, viewgroup, false);
        }
        view = (ImageView)view1.findViewById(0x7f0e00c5);
        view.setImageResource(getitem.ourceId);
        viewgroup = (TextView)view1.findViewById(0x7f0e00c6);
        viewgroup.setText(getitem.ourceId);
        view3 = view1;
        if (NavigationDrawerFragment.access$300() != getitem.ourceId) goto _L6; else goto _L7
_L7:
        view.setColorFilter(selectedItemColor);
        viewgroup.setTextColor(selectedItemColor);
        return view1;
_L2:
        View view2 = view;
        if (view == null)
        {
            view2 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030044, viewgroup, false);
        }
        view = (ImageView)view2.findViewById(0x7f0e00c5);
        view.setImageResource(getitem.ourceId);
        viewgroup = (TextView)view2.findViewById(0x7f0e00c6);
        viewgroup.setText(getitem.ourceId);
        if (NavigationDrawerFragment.access$300() == getitem.ourceId)
        {
            view.setColorFilter(selectedItemColor);
            viewgroup.setTextColor(selectedItemColor);
            return view2;
        } else
        {
            view.setColorFilter(hostItemColor);
            viewgroup.setTextColor(hostItemColor);
            return view2;
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public A(Context context, int i, A aa[])
    {
        super(context, i, aa);
        context = context.getTheme().(new int[] {
            0x7f010106, 0x7f010045
        });
        selectedItemColor = context.getColor(0, 0x7f0d0004);
        hostItemColor = context.getColor(1, 0x7f0d0159);
        context.recycle();
    }
}
