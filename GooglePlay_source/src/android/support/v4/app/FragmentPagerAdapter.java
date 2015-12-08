// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, Fragment, FragmentTransaction

public abstract class FragmentPagerAdapter extends PagerAdapter
{

    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;

    public FragmentPagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    private static String makeFragmentName(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        mCurTransaction.detach((Fragment)obj);
    }

    public final void finishUpdate$52bc874c()
    {
        if (mCurTransaction != null)
        {
            mCurTransaction.commitAllowingStateLoss();
            mCurTransaction = null;
            mFragmentManager.executePendingTransactions();
        }
    }

    public abstract Fragment getItem(int i);

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        long l = i;
        Object obj = makeFragmentName(viewgroup.getId(), l);
        obj = mFragmentManager.findFragmentByTag(((String) (obj)));
        if (obj != null)
        {
            mCurTransaction.attach(((Fragment) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            Fragment fragment = getItem(i);
            mCurTransaction.add(viewgroup.getId(), fragment, makeFragmentName(viewgroup.getId(), l));
            viewgroup = fragment;
        }
        if (viewgroup != mCurrentPrimaryItem)
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).mView == view;
    }

    public void restoreState$2cb49ec(Parcelable parcelable)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public final void setPrimaryItem$30510aeb(Object obj)
    {
        obj = (Fragment)obj;
        if (obj != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                mCurrentPrimaryItem.setMenuVisibility(false);
                mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (obj != null)
            {
                ((Fragment) (obj)).setMenuVisibility(true);
                ((Fragment) (obj)).setUserVisibleHint(true);
            }
            mCurrentPrimaryItem = ((Fragment) (obj));
        }
    }
}
