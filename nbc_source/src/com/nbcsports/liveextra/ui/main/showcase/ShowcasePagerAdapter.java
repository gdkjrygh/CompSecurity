// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.fragments.ShowcaseFragment;
import java.util.ArrayList;
import java.util.List;

public class ShowcasePagerAdapter extends FragmentStatePagerAdapter
{

    private List list;

    public ShowcasePagerAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        list = new ArrayList();
    }

    public int getCount()
    {
        return list.size();
    }

    public Fragment getItem(int i)
    {
        return ShowcaseFragment.getInstance(((AssetViewModel)list.get(i)).asset(), i);
    }

    public void update(List list1)
    {
        list.clear();
        list.addAll(list1);
        notifyDataSetChanged();
    }
}
