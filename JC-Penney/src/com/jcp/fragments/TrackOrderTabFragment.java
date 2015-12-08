// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.adapters.da;
import com.jcp.model.OrderItemsDetails;

// Referenced classes of package com.jcp.fragments:
//            s, gt, TrackOrderHistoryFragment, TrackPackageFragment, 
//            t

public class TrackOrderTabFragment extends s
{

    private SparseArray a;
    protected LinearLayout mFirstTab;
    protected LinearLayout mSecondTab;
    protected TextView mTabOne;
    protected TextView mTabTwo;
    protected ViewPager mViewPager;

    public TrackOrderTabFragment()
    {
    }

    private void V()
    {
        a = new SparseArray();
        a.put(0, Fragment.a(i(), com/jcp/fragments/gt.getName()));
        a.put(1, Fragment.a(i(), com/jcp/fragments/TrackOrderHistoryFragment.getName()));
    }

    private void W()
    {
        da da1 = new da(l(), a);
        mViewPager.setAdapter(da1);
    }

    private void X()
    {
        mTabOne.setText(a(0x7f07043d));
        mTabTwo.setText(a(0x7f0702ce));
    }

    private void Z()
    {
        mFirstTab.setVisibility(0);
        mSecondTab.setVisibility(4);
    }

    private void aa()
    {
        mFirstTab.setVisibility(4);
        mSecondTab.setVisibility(0);
        ab();
    }

    private void ab()
    {
        Fragment fragment = (Fragment)a.get(1);
        if (fragment != null && (fragment instanceof TrackOrderHistoryFragment))
        {
            ((TrackOrderHistoryFragment)fragment).U();
        }
    }

    protected ViewPager U()
    {
        if (mViewPager != null)
        {
            return mViewPager;
        } else
        {
            return null;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 1;
        layoutinflater = layoutinflater.inflate(0x7f030084, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        V();
        viewgroup = h();
        if (viewgroup == null || !viewgroup.containsKey("TAB_STATE") || viewgroup.getInt("TAB_STATE") != 1)
        {
            i = 0;
        }
        W();
        mViewPager.setCurrentItem(i);
        X();
        return layoutinflater;
    }

    protected String a()
    {
        return "TRACKORDERTAB";
    }

    protected void a(OrderItemsDetails orderitemsdetails)
    {
        t t1 = a(i());
        if (t1 != null)
        {
            Bundle bundle = new Bundle();
            bundle.putSerializable("ORDER_DETAILS", orderitemsdetails);
            orderitemsdetails = new TrackPackageFragment();
            orderitemsdetails.g(bundle);
            t1.b(orderitemsdetails, "TrackPackageFragment");
        }
    }

    public void b()
    {
        a(j().getString(0x7f070440));
        super.b();
    }

    public void f()
    {
        super.f();
        a.clear();
        a = null;
    }

    void onPageSelected(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            Z();
            return;

        case 1: // '\001'
            aa();
            break;
        }
    }

    void onTabOneClick()
    {
        mViewPager.setCurrentItem(0);
    }

    void onTabTwoClick()
    {
        mViewPager.setCurrentItem(1);
    }
}
