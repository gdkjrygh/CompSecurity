// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.accuweather.android.adapters.NavigationDrawerListAdapter;
import com.accuweather.android.adapters.TitleSpinnerAdapter;
import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.actionbarsherlock.internal.widget.IcsSpinner;
import java.util.ArrayList;
import java.util.List;

public class NavigationDrawer extends RelativeLayout
    implements com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener, com.accuweather.android.adapters.NavigationDrawerListAdapter.INavigationDrawerListListener, android.view.View.OnTouchListener
{
    public static interface INavigationDrawerFragmentListener
    {

        public abstract void onLocationSelected(int i);

        public abstract void onNavigationDrawerListItemSelected(int i);
    }


    private NavigationDrawerListAdapter mAdapter;
    private List mItems;
    private ListView mList;
    private INavigationDrawerFragmentListener mListener;
    private IcsSpinner mSpinner;

    public NavigationDrawer(Context context)
    {
        this(context, null);
    }

    public NavigationDrawer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mItems = new ArrayList();
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.navigation_drawer, this);
        init();
    }

    public void init()
    {
        mList = (ListView)findViewById(com.accuweather.android.R.id.list);
        mItems = new ArrayList();
        mAdapter = new NavigationDrawerListAdapter(getContext(), mItems);
        mList.setAdapter(mAdapter);
        mList.setDivider(new ColorDrawable(0xffffff));
        mList.setDividerHeight(0);
        mAdapter.setNavigationDrawerListListener(this);
        IcsSpinner icsspinner = (IcsSpinner)findViewById(com.accuweather.android.R.id.spinner);
        mSpinner = icsspinner;
        icsspinner.setOnItemSelectedListener(this);
        icsspinner.setBackgroundResource(com.accuweather.android.R.drawable.abs__spinner_ab_holo_light);
    }

    public void onItemSelected(IcsAdapterView icsadapterview, View view, int i, long l)
    {
        if (mListener != null)
        {
            mListener.onLocationSelected(i);
        }
    }

    public void onNavigationDrawerItemSelected(int i)
    {
        if (mListener != null)
        {
            mListener.onNavigationDrawerListItemSelected(i);
        }
    }

    public void onNothingSelected(IcsAdapterView icsadapterview)
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public void setItems(List list)
    {
        mItems = list;
        mAdapter.updateAdapter(list);
    }

    public void setNavigationDrawerFragmentListener(INavigationDrawerFragmentListener inavigationdrawerfragmentlistener)
    {
        mListener = inavigationdrawerfragmentlistener;
    }

    public void setSelectedItem(int i)
    {
        mSpinner.setSelection(i);
    }

    public void setSpinnerItems(List list)
    {
        list = new TitleSpinnerAdapter(getContext(), com.accuweather.android.R.layout.spinner_item, list);
        list.setDropDownViewResource(com.accuweather.android.R.layout.spinner_dropdown_item_with_divider);
        list.setTextColor(getContext().getResources().getColor(com.accuweather.android.R.color.primary_text));
        mSpinner.setAdapter(list);
    }

    public void setSpinnerVisibility(int i)
    {
        findViewById(com.accuweather.android.R.id.spinner_layout).setVisibility(i);
    }
}
