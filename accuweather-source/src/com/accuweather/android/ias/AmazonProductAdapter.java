// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.List;

// Referenced classes of package com.accuweather.android.ias:
//            AmazonModel, AmazonProductFragment

public class AmazonProductAdapter extends FixedFragmentStatePagerAdapter
{

    private List amazonModels;

    public AmazonProductAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public AmazonProductAdapter(FragmentManager fragmentmanager, List list)
    {
        super(fragmentmanager);
        amazonModels = list;
    }

    public int getCount()
    {
        return amazonModels.size();
    }

    public Fragment getItem(int i)
    {
        return AmazonProductFragment.newInstance((AmazonModel)amazonModels.get(i));
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public float getPageWidth(int i)
    {
        return 1.0F;
    }

    public void setProducts(List list)
    {
        amazonModels = list;
    }
}
