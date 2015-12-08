// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POI

public class POIListAdapter extends ArrayAdapter
{

    private ArrayList poiArrayList;

    public POIListAdapter(Context context, int i, ArrayList arraylist)
    {
        super(context, i, arraylist);
        poiArrayList = arraylist;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030038, null);
        }
        viewgroup = (POI)poiArrayList.get(i);
        if (viewgroup != null)
        {
            TextView textview = (TextView)view.findViewById(0x7f0a0041);
            TextView textview1 = (TextView)view.findViewById(0x7f0a007a);
            if (textview != null)
            {
                textview.setText((new StringBuilder()).append("Name: ").append(viewgroup.getTitle()).toString());
            }
            if (textview1 != null)
            {
                textview1.setText((new StringBuilder()).append("Description: ").append(viewgroup.getShortDescription()).toString());
            }
        }
        return view;
    }
}
