// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.accuweather.android.fragments.VideoDetailsFragment;
import com.accuweather.android.models.VideoModel;
import java.util.ArrayList;

public class VideoFragmentAdapter extends FragmentStatePagerAdapter
{
    public static interface IVideoFragmentAdapterListener
    {

        public abstract void onPrimaryItem(int i);
    }


    private static final String DEBUG_TAG = "VideoFragmentAdapter";
    private ArrayList mContent;
    private IVideoFragmentAdapterListener mListener;
    private ArrayList mTitles;
    private ArrayList mWidths;

    public VideoFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        mWidths = new ArrayList();
        mTitles = new ArrayList();
        mContent = new ArrayList();
    }

    public ArrayList getContent()
    {
        return mContent;
    }

    public int getCount()
    {
        return mContent.size();
    }

    public Fragment getItem(int i)
    {
        return VideoDetailsFragment.newInstance((VideoModel)mContent.get(i));
    }

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
        return 1.0F;
    }

    public void setContent(ArrayList arraylist)
    {
        mContent = (ArrayList)arraylist.clone();
    }

    public void setTitles(ArrayList arraylist)
    {
        mTitles = (ArrayList)arraylist.clone();
    }

    public void setVideoFragmentAdapterListener(IVideoFragmentAdapterListener ivideofragmentadapterlistener)
    {
        mListener = ivideofragmentadapterlistener;
    }

    public void setWidths(ArrayList arraylist)
    {
        mWidths = arraylist;
    }
}
