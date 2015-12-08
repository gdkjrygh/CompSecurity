// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.java.checks.Preconditions;

// Referenced classes of package com.soundcloud.android.main:
//            NavigationModel, ScrollContent

public class MainPagerAdapter extends PagerAdapter
{
    public static class Factory
    {

        private final NavigationModel navigationModel;

        public MainPagerAdapter create(FragmentManager fragmentmanager)
        {
            return new MainPagerAdapter(fragmentmanager, navigationModel);
        }

        public Factory(NavigationModel navigationmodel)
        {
            navigationModel = navigationmodel;
        }
    }


    private static final String FRAGMENT_NAME = "soundcloud:main:";
    private Fragment currentPrimaryItem;
    private FragmentTransaction currentTransaction;
    private final FragmentManager fragmentManager;
    private final NavigationModel navigationModel;

    public MainPagerAdapter(FragmentManager fragmentmanager, NavigationModel navigationmodel)
    {
        fragmentManager = (FragmentManager)Preconditions.checkNotNull(fragmentmanager);
        navigationModel = (NavigationModel)Preconditions.checkNotNull(navigationmodel);
        currentTransaction = null;
        currentPrimaryItem = null;
    }

    private Fragment createFragment(int i)
    {
        return navigationModel.getItem(i).createFragment();
    }

    private String makeFragmentName(int i)
    {
        return (new StringBuilder("soundcloud:main:")).append(i).toString();
    }

    private void setPrimaryItem(Fragment fragment)
    {
        if (!fragment.equals(currentPrimaryItem))
        {
            if (currentPrimaryItem != null)
            {
                currentPrimaryItem.setMenuVisibility(false);
                currentPrimaryItem.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            currentPrimaryItem = fragment;
        }
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (currentTransaction == null)
        {
            currentTransaction = fragmentManager.beginTransaction();
        }
        currentTransaction.detach((Fragment)obj);
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        if (currentTransaction != null)
        {
            currentTransaction.commitAllowingStateLoss();
            currentTransaction = null;
            fragmentManager.executePendingTransactions();
        }
    }

    public int getCount()
    {
        return navigationModel.getItemCount();
    }

    public CharSequence getPageTitle(int i)
    {
        return String.valueOf(i);
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (currentTransaction == null)
        {
            currentTransaction = fragmentManager.beginTransaction();
        }
        String s = makeFragmentName(i);
        Fragment fragment = fragmentManager.findFragmentByTag(s);
        if (fragment != null)
        {
            currentTransaction.attach(fragment);
            viewgroup = fragment;
        } else
        {
            Fragment fragment1 = createFragment(i);
            currentTransaction.add(viewgroup.getId(), fragment1, s);
            viewgroup = fragment1;
        }
        if (!viewgroup.equals(currentPrimaryItem))
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public void resetScroll(int i)
    {
        Fragment fragment = fragmentManager.findFragmentByTag(makeFragmentName(i));
        if (fragment instanceof ScrollContent)
        {
            ((ScrollContent)fragment).resetScroll();
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (obj instanceof Fragment)
        {
            setPrimaryItem((Fragment)obj);
        }
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    }
}
