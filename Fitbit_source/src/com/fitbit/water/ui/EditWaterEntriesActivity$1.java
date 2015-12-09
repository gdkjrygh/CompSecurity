// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.util.bt;
import com.fitbit.util.format.e;
import com.fitbit.water.Water;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui:
//            EditWaterEntriesActivity

class a extends BaseAdapter
{

    final EditWaterEntriesActivity a;

    public int getCount()
    {
        return EditWaterEntriesActivity.a(a).size();
    }

    public Object getItem(int i)
    {
        return EditWaterEntriesActivity.a(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Water water = ((WaterLogEntry)EditWaterEntriesActivity.a(a).get(i)).e().a(EditWaterEntriesActivity.b(a));
        if (water.b() == 0.0D)
        {
            view = new View(viewgroup.getContext());
            view.setVisibility(8);
            return view;
        }
        TextView textview;
        if (view == null || view.getVisibility() == 8)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04011c, viewgroup, false);
            viewgroup = new <init>(null);
            view.setTag(viewgroup);
            viewgroup.a = (TextView)view.findViewById(0x7f1103a4);
            viewgroup.b = (TextView)view.findViewById(0x7f1103a5);
        } else
        {
            viewgroup = (b)view.getTag();
        }
        textview = ((b) (viewgroup)).a;
        viewgroup = ((a) (viewgroup)).b;
        textview.setText(bt.a(water.b(), 2));
        viewgroup.setText(((com.fitbit.data.domain.it>)water.a()).tQuantityDisplayName(e.b(water.b())));
        return view;
    }

    (EditWaterEntriesActivity editwaterentriesactivity)
    {
        a = editwaterentriesactivity;
        super();
    }
}
