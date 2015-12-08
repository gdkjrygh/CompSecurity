// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

public abstract class DetailsFragmentAdapter extends FixedFragmentStatePagerAdapter
{

    protected List mFragmentArguments;
    private float mPageWidth;
    protected List mTitles;

    public DetailsFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        mTitles = new ArrayList();
        mFragmentArguments = new ArrayList();
        mPageWidth = 1.0F;
    }

    public List getContent()
    {
        return mFragmentArguments;
    }

    public int getCount()
    {
        return mFragmentArguments.size();
    }

    public abstract Fragment getItem(int i);

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public volatile CharSequence getPageTitle(int i)
    {
        return getPageTitle(i);
    }

    public String getPageTitle(int i)
    {
        return (String)mTitles.get(i);
    }

    public float getPageWidth(int i)
    {
        return mPageWidth;
    }

    public void setDisplayContent(List list, List list1)
    {
        mTitles = list;
        mFragmentArguments = list1;
        notifyDataSetChanged();
    }

    public void setPageWidth(float f)
    {
        mPageWidth = f;
    }
}
