// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.adapters;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LruCache;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public abstract class BaseFragmentPagerAdapter extends PagerAdapter
{
    final class FragmentCache extends LruCache
    {

        final BaseFragmentPagerAdapter this$0;

        private void entryRemoved(boolean flag, String s, Fragment fragment, Fragment fragment1)
        {
            if (flag || fragment1 != null && fragment != fragment1)
            {
                mCurTransaction.remove(fragment);
            }
        }

        protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            entryRemoved(flag, (String)obj, (Fragment)obj1, (Fragment)obj2);
        }

        public FragmentCache(int i)
        {
            this$0 = BaseFragmentPagerAdapter.this;
            super(i);
        }
    }


    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private LruCache mFragmentCache;
    private final FragmentManager mFragmentManager;

    public BaseFragmentPagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentCache = new FragmentCache(5);
        mFragmentManager = fragmentmanager;
    }

    public void destroyItem(View view, int i, Object obj)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        Fragment fragment = (Fragment)obj;
        String s = fragment.getTag();
        obj = s;
        if (s == null)
        {
            obj = makeFragmentName(view.getId(), i);
        }
        mFragmentCache.put(obj, fragment);
        mCurTransaction.detach(fragment);
    }

    public final void finishUpdate(View view)
    {
        if (mCurTransaction != null && !mFragmentManager.isDestroyed())
        {
            mCurTransaction.commitAllowingStateLoss();
            mCurTransaction = null;
            mFragmentManager.executePendingTransactions();
        }
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(View view, int i)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        Object obj = makeFragmentName(view.getId(), i);
        mFragmentCache.remove(obj);
        obj = mFragmentManager.findFragmentByTag(((String) (obj)));
        if (obj != null)
        {
            mCurTransaction.attach(((Fragment) (obj)));
            view = ((View) (obj));
        } else
        {
            Fragment fragment = getItem(i);
            if (fragment == null)
            {
                return null;
            }
            mCurTransaction.add(view.getId(), fragment, makeFragmentName(view.getId(), i));
            view = fragment;
        }
        if (view != mCurrentPrimaryItem)
        {
            view.setMenuVisibility(false);
        }
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        obj = ((Fragment)obj).getView();
        for (; view instanceof View; view = ((View)view).getParent())
        {
            if (view == obj)
            {
                return true;
            }
        }

        return false;
    }

    protected String makeFragmentName(int i, int j)
    {
        return (new StringBuilder(40)).append("android:switcher:").append(i).append(":").append(j).toString();
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public final Parcelable saveState()
    {
        return null;
    }

    public final void setPrimaryItem(View view, int i, Object obj)
    {
        view = (Fragment)obj;
        if (view != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                mCurrentPrimaryItem.setMenuVisibility(false);
            }
            if (view != null)
            {
                view.setMenuVisibility(true);
            }
            mCurrentPrimaryItem = view;
        }
    }

}
