// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import com.fitbit.home.ui.f;
import com.fitbit.ui.a.a;
import com.fitbit.ui.search.SearchActivity;

// Referenced classes of package com.fitbit.ui.choose.activity:
//            ChooseFragment

public abstract class ChooseActivity extends SearchActivity
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.support.v7.app.ActionBar.TabListener
{

    protected int a;
    protected ViewPager b;

    public ChooseActivity()
    {
    }

    private void a(android.support.v7.app.ActionBar.Tab tab)
    {
        if (A != null)
        {
            A.d();
        }
        if (b != null)
        {
            b.setCurrentItem(tab.getPosition(), true);
        }
    }

    protected void a(ChooseFragment choosefragment)
    {
        ActionBar actionbar = getSupportActionBar();
        int j = choosefragment.b();
        actionbar.addTab(actionbar.newTab().setText(j).setTag(Integer.valueOf(j)).setTabListener(this));
    }

    protected void f()
    {
        super.f();
        a a1 = g();
        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(2);
        for (int j = 0; j < a1.getCount(); j++)
        {
            int k = a1.a(j).b();
            actionbar.addTab(actionbar.newTab().setText(k).setTag(Integer.valueOf(k)).setTabListener(this));
        }

        b.setAdapter(a1);
        b.setOnPageChangeListener(this);
        if (a < a1.getCount())
        {
            b.setCurrentItem(a);
        }
    }

    protected abstract a g();

    protected void h()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar.getNavigationMode() != 0)
        {
            actionbar.setNavigationMode(0);
        }
    }

    protected void i()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar.getNavigationMode() != 2)
        {
            actionbar.setNavigationMode(2);
        }
    }

    public void onPageScrollStateChanged(int j)
    {
    }

    public void onPageScrolled(int j, float f1, int k)
    {
    }

    public void onPageSelected(int j)
    {
        Object obj = getSupportActionBar();
        android.support.v7.app.ActionBar.Tab tab = ((ActionBar) (obj)).getTabAt(j);
        obj = ((ActionBar) (obj)).getSelectedTab();
        if (!TextUtils.equals(String.valueOf(tab.getTag()), String.valueOf(((android.support.v7.app.ActionBar.Tab) (obj)).getTag())))
        {
            tab.select();
        }
    }

    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        if (z != null && MenuItemCompat.isActionViewExpanded(z))
        {
            a(tab);
        }
    }

    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        a(tab);
    }

    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }
}
