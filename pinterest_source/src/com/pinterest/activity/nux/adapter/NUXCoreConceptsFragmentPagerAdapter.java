// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.nux.fragment.NUXCoreConceptsBaseFragment;
import com.pinterest.activity.nux.fragment.NUXCoreConceptsBoardFragment;
import com.pinterest.activity.nux.fragment.NUXCoreConceptsHomefeedFragment;
import com.pinterest.activity.nux.fragment.NUXCoreConceptsPinsFragment;
import com.pinterest.activity.nux.fragment.NUXCoreConceptsSaveFragment;

public class NUXCoreConceptsFragmentPagerAdapter extends FixedFragmentStatePagerAdapter
{

    private NUXCoreConceptsBaseFragment _coreConceptsFragments[] = {
        new NUXCoreConceptsSaveFragment(), new NUXCoreConceptsPinsFragment(), new NUXCoreConceptsBoardFragment(), new NUXCoreConceptsHomefeedFragment()
    };

    public NUXCoreConceptsFragmentPagerAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        return _coreConceptsFragments.length;
    }

    public Fragment getItem(int i)
    {
        return _coreConceptsFragments[i];
    }
}
