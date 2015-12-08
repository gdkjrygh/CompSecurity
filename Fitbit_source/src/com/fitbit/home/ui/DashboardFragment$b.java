// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.home.ui.tiles.d;
import com.fitbit.home.ui.tiles.e;
import com.fitbit.ui.k;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

private class b extends k
{

    final DashboardFragment a;
    private final c b;
    private final Set c = new HashSet();
    private e d;
    private Date e;

    public void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((DataSetObserver)iterator.next()).onChanged()) { }
    }

    public void a(e e1, Date date)
    {
        d = e1;
        e = date;
        a();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        le le = (le)a(i);
        switch (a[le.ordinal()])
        {
        default:
            View view1 = view;
            if (view == null)
            {
                view = le.a();
                view.a(viewgroup.getContext());
                view1 = view.a(viewgroup);
                view1.setTag(0x7f11001d, view);
            }
            view = (d)view1.getTag(0x7f11001d);
            view.a(e);
            if (d != null)
            {
                view.b(d);
                return view1;
            } else
            {
                view.O_();
                return view1;
            }

        case 11: // '\013'
            return b.b;
        }
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        super.registerDataSetObserver(datasetobserver);
        c.add(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        super.unregisterDataSetObserver(datasetobserver);
        c.remove(datasetobserver);
    }

    public le(DashboardFragment dashboardfragment, Context context, le le)
    {
        a = dashboardfragment;
        super(context, "dashboard-layout", com/fitbit/home/ui/DashboardFragment$Tile);
        d = null;
        b = le;
    }
}
