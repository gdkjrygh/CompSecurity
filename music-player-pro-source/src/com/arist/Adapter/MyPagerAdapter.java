// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.ArrayList;

public class MyPagerAdapter extends PagerAdapter
{

    private ArrayList views;

    public MyPagerAdapter(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            views = arraylist;
            return;
        } else
        {
            views = new ArrayList();
            return;
        }
    }

    public void changeData(ArrayList arraylist)
    {
        views = arraylist;
        notifyDataSetChanged();
    }

    public void destroyItem(View view, int i, Object obj)
    {
        obj = (View)views.get(i);
        ((ViewPager)view).removeView(((View) (obj)));
    }

    public void finishUpdate(View view)
    {
    }

    public int getCount()
    {
        return views.size();
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public Object instantiateItem(View view, int i)
    {
        View view1 = (View)views.get(i);
        ((ViewPager)view).addView(view1);
        return view1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void startUpdate(View view)
    {
    }
}
