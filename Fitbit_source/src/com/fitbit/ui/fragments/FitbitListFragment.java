// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.fragments;

import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class FitbitListFragment extends ListFragment
{

    public FitbitListFragment()
    {
    }

    public void setListAdapter(ListAdapter listadapter)
    {
        int i = 0;
        ListView listview = getListView();
        if (listview != null && listadapter != null)
        {
            int j = listview.getFirstVisiblePosition();
            View view = listview.getChildAt(0);
            if (view != null)
            {
                i = view.getTop();
            }
            super.setListAdapter(listadapter);
            listview.setSelectionFromTop(j, i);
        }
    }
}
