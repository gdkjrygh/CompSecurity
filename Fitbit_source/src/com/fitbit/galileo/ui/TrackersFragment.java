// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.fitbit.galileo.GalileoTracker;

// Referenced classes of package com.fitbit.galileo.ui:
//            c

public class TrackersFragment extends ListFragment
{

    protected c a;
    protected View b;
    protected View c;

    public TrackersFragment()
    {
    }

    protected void a()
    {
        setListAdapter(a);
    }

    public void a(GalileoTracker galileotracker)
    {
        a.a(galileotracker);
        if (c.getVisibility() != 0)
        {
            c.setVisibility(0);
            b.setVisibility(8);
        }
    }

    protected void b()
    {
        c.setVisibility(8);
        b.setVisibility(0);
    }

    public c c()
    {
        return (c)super.getListAdapter();
    }

    public void d()
    {
        c.setVisibility(8);
        b.setVisibility(0);
        a.clear();
    }

    public ListAdapter getListAdapter()
    {
        return c();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public void onResume()
    {
        a.notifyDataSetChanged();
        super.onResume();
    }
}
