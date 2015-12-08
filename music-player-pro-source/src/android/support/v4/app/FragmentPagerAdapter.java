// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, Fragment, FragmentTransaction

public abstract class FragmentPagerAdapter extends PagerAdapter
{

    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    private static String makeFragmentName(int i, int j)
    {
        return (new StringBuilder()).append("android:switcher:").append(i).append(":").append(j).toString();
    }

    public void destroyItem(View view, int i, Object obj)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        mCurTransaction.detach((Fragment)obj);
    }

    public void finishUpdate(View view)
    {
        if (mCurTransaction != null)
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
        obj = mFragmentManager.findFragmentByTag(((String) (obj)));
        if (obj != null)
        {
            mCurTransaction.attach(((Fragment) (obj)));
            view = ((View) (obj));
        } else
        {
            Fragment fragment = getItem(i);
            mCurTransaction.add(view.getId(), fragment, makeFragmentName(view.getId(), i));
            view = fragment;
        }
        if (view != mCurrentPrimaryItem)
        {
            view.setMenuVisibility(false);
        }
        return view;
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

    public void setPrimaryItem(View view, int i, Object obj)
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

    public void startUpdate(View view)
    {
    }
}
