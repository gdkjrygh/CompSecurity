// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.support.v13.app.FragmentCompat;
import android.view.ViewGroup;

public abstract class GridPagerAdapter
{

    private static final int MAX_ROWS = 65535;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private DataSetObservable mObservable;

    public GridPagerAdapter(FragmentManager fragmentmanager)
    {
        mObservable = new DataSetObservable();
        mCurTransaction = null;
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    private static String makeFragmentName(int i, long l)
    {
        return (new StringBuilder()).append("android:switcher:").append(i).append(":").append(l).toString();
    }

    protected void destroyItem(ViewGroup viewgroup, Fragment fragment)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        mCurTransaction.remove(fragment);
    }

    protected void finishUpdate(ViewGroup viewgroup)
    {
        if (mFragmentManager.isDestroyed())
        {
            mCurTransaction = null;
        } else
        if (mCurTransaction != null)
        {
            mCurTransaction.commitAllowingStateLoss();
            mCurTransaction = null;
            mFragmentManager.executePendingTransactions();
            return;
        }
    }

    public abstract int getColumnCount(int i);

    public int getCurrentColumnForRow(int i, int j)
    {
        return 0;
    }

    public abstract Fragment getFragment(int i, int j);

    protected long getFragmentId(int i, int j)
    {
        return (long)(65535 * j + i);
    }

    public abstract int getRowCount();

    protected Fragment instantiateItem(ViewGroup viewgroup, int i, int j)
    {
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        long l = getFragmentId(i, j);
        Object obj = makeFragmentName(viewgroup.getId(), l);
        Fragment fragment = mFragmentManager.findFragmentByTag(((String) (obj)));
        obj = fragment;
        if (fragment == null)
        {
            obj = getFragment(i, j);
            mCurTransaction.add(viewgroup.getId(), ((Fragment) (obj)), makeFragmentName(viewgroup.getId(), l));
        }
        if (obj != mCurrentPrimaryItem)
        {
            FragmentCompat.setMenuVisibility(((Fragment) (obj)), false);
            FragmentCompat.setUserVisibleHint(((Fragment) (obj)), false);
        }
        return ((Fragment) (obj));
    }

    public void notifyDataSetChanged()
    {
        mObservable.notifyChanged();
    }

    protected void onPrimaryItemChanged(Fragment fragment, int i, int j)
    {
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.registerObserver(datasetobserver);
    }

    void setPrimaryItem(ViewGroup viewgroup, int i, int j)
    {
        long l = getFragmentId(j, i);
        viewgroup = makeFragmentName(viewgroup.getId(), l);
        viewgroup = mFragmentManager.findFragmentByTag(viewgroup);
        if (viewgroup != null && viewgroup != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                FragmentCompat.setMenuVisibility(mCurrentPrimaryItem, false);
                FragmentCompat.setUserVisibleHint(mCurrentPrimaryItem, false);
            }
            if (viewgroup != null)
            {
                FragmentCompat.setMenuVisibility(viewgroup, true);
                FragmentCompat.setUserVisibleHint(viewgroup, true);
            }
            mCurrentPrimaryItem = viewgroup;
            onPrimaryItemChanged(mCurrentPrimaryItem, i, j);
        }
    }

    protected void startUpdate(ViewGroup viewgroup)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.unregisterObserver(datasetobserver);
    }
}
