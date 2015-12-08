// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.q;
import android.support.v4.view.t;
import android.view.View;
import android.view.ViewGroup;

public abstract class FragmentTagPagerAdapter extends t
{

    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private q mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final m mFragmentManager;

    public FragmentTagPagerAdapter(m m1)
    {
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentManager = m1;
    }

    private static String makeFragmentName(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.a();
        }
        mCurTransaction.b((Fragment)obj);
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        if (mCurTransaction != null)
        {
            mCurTransaction.d();
            mCurTransaction = null;
            mFragmentManager.b();
        }
    }

    public abstract Fragment getItem(int i);

    public long getItemId(int i)
    {
        return (long)i;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.a();
        }
        long l = getItemId(i);
        Object obj = makeFragmentName(viewgroup.getId(), l);
        obj = mFragmentManager.a(((String) (obj)));
        if (obj != null)
        {
            if (isCorrectFragment(i, ((Fragment) (obj))))
            {
                mCurTransaction.c(((Fragment) (obj)));
                viewgroup = ((ViewGroup) (obj));
            } else
            {
                mCurTransaction.a(((Fragment) (obj)));
                obj = getItem(i);
                mCurTransaction.a(viewgroup.getId(), ((Fragment) (obj)), makeFragmentName(viewgroup.getId(), l));
                viewgroup = ((ViewGroup) (obj));
            }
        } else
        {
            Fragment fragment = getItem(i);
            mCurTransaction.a(viewgroup.getId(), fragment, makeFragmentName(viewgroup.getId(), l));
            viewgroup = fragment;
        }
        if (viewgroup != mCurrentPrimaryItem && viewgroup != null)
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public boolean isCorrectFragment(int i, Fragment fragment)
    {
        return true;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
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
        viewgroup = (Fragment)obj;
        if (viewgroup != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                mCurrentPrimaryItem.setMenuVisibility(false);
                mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (viewgroup != null)
            {
                viewgroup.setMenuVisibility(true);
                viewgroup.setUserVisibleHint(true);
            }
            mCurrentPrimaryItem = viewgroup;
        }
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    }
}
