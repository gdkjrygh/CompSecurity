// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import com.aetn.history.android.historyhere.fragment.MapOverlayDetailFragment;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

public class DetailPagerAdapter extends FragmentStatePagerAdapter
{

    private final String TAG = "DetailPagerAdapter";
    private Context mContext;
    private ArrayList mCurrentData;
    private Fragment mCurrentFragment;

    public DetailPagerAdapter(FragmentManager fragmentmanager, Context context)
    {
        super(fragmentmanager);
        mCurrentData = new ArrayList();
        mContext = context;
    }

    public int getCount()
    {
        if (mCurrentData == null)
        {
            return 0;
        } else
        {
            return mCurrentData.size();
        }
    }

    public Fragment getCurrentFragment()
    {
        return mCurrentFragment;
    }

    public Fragment getItem(int i)
    {
        Utils.logger("DetailPagerAdapter", (new StringBuilder()).append("get Item():pos:").append(i).append("|count:").append(getCount()).toString());
        return MapOverlayDetailFragment.newInstance((POIDetail)mCurrentData.get(i));
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public void resetData(ArrayList arraylist)
    {
        Utils.logger("DetailPagerAdapter", "resetData:");
        mCurrentData = arraylist;
        notifyDataSetChanged();
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (getCurrentFragment() != obj)
        {
            mCurrentFragment = (Fragment)obj;
        }
        super.setPrimaryItem(viewgroup, i, obj);
    }
}
