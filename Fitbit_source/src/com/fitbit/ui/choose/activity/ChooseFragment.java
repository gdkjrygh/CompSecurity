// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.activity;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.ui.fragments.FitbitListFragment;
import java.util.Date;

public abstract class ChooseFragment extends FitbitListFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    protected View a;
    protected Date b;

    public ChooseFragment()
    {
    }

    protected final View a(int i)
    {
        TextView textview = (TextView)LayoutInflater.from(getActivity()).inflate(0x7f040135, getListView(), false);
        textview.setText(i);
        return textview;
    }

    protected final Date a()
    {
        return b;
    }

    public final void a(Date date)
    {
        b = date;
    }

    public abstract int b();

    protected abstract int c();

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f040091, null);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (getListAdapter() == null)
        {
            getLoaderManager().initLoader(c(), null, this);
        }
        setListAdapter(getListAdapter());
    }

    public void setListShown(boolean flag)
    {
        boolean flag1 = false;
        int i;
        if (a != null)
        {
            Object obj = a;
            if (flag)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            ((View) (obj)).setVisibility(i);
        }
        if (getListView() != null)
        {
            obj = getListView();
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 8;
            }
            ((ListView) (obj)).setVisibility(i);
            if (getListView().getEmptyView() != null && !flag)
            {
                getListView().getEmptyView().setVisibility(8);
            }
        }
    }
}
