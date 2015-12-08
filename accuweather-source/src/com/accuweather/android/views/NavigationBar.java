// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import java.util.ArrayList;

public class NavigationBar extends LinearLayout
    implements android.widget.AdapterView.OnItemClickListener
{
    public static interface INavigationBarListener
    {

        public abstract void onItemClicked(int i);
    }


    private SlidingDrawer mDrawer;
    private ListView mList;
    private INavigationBarListener mListener;

    public NavigationBar(Context context)
    {
        this(context, null, 0);
    }

    public NavigationBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.navigation_bar, this);
        if (context instanceof INavigationBarListener)
        {
            mListener = (INavigationBarListener)context;
        }
        init();
    }

    private void init()
    {
        mList = (ListView)findViewById(com.accuweather.android.R.id.content);
        mDrawer = (SlidingDrawer)findViewById(com.accuweather.android.R.id.drawer);
    }

    public void close()
    {
        mDrawer.close();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mListener.onItemClicked(i);
    }

    public void setNavigationBarListener(INavigationBarListener inavigationbarlistener)
    {
        mListener = inavigationbarlistener;
    }

    public void updateContent(ArrayList arraylist)
    {
    }
}
